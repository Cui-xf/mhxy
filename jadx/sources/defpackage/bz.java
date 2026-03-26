package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: java版梦回西游3区251011.jar:bz.class */
public final class bz {
    public static byte a = 90;
    public static byte b = 72;
    public static int c = 162;

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable, w] */
    public static w a(byte b2, byte b3, String str) {
        ?? wVar;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(6400);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeInt(bb.a);
            dataOutputStream.writeInt(bb.b);
            dataOutputStream.writeUTF(t.v);
            dataOutputStream.writeUTF(t.F);
            dataOutputStream.writeInt(-1);
            dataOutputStream.writeByte(t.r);
            dataOutputStream.writeByte(t.s);
            dataOutputStream.writeByte(t.u);
            dataOutputStream.writeInt((int) Runtime.getRuntime().totalMemory());
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            wVar = new w((short) 6400, byteArrayOutputStream.toByteArray());
            return wVar;
        } catch (IOException e) {
            wVar.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [byte[], java.lang.Throwable] */
    public static byte[] a(byte b2, int i, int i2, int i3) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(1);
            new StringBuffer().append("代理服务器包头: ").append(1).append("|").append(i).append("|").append(0).append("|").append(0).toString();
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(0);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, String str2, String str3) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeByte(t.r);
            dataOutputStream.writeByte(t.s);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, byte b2, short s2, short s3) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4195);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4098);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, byte b2, byte b3) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4100);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4103);
            dataOutputStream.writeShort(t.b);
            dataOutputStream.writeShort(t.c);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] c(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] d(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4641);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4194);
            dataOutputStream.writeByte(b2 == 1 ? 0 : 1);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4608);
            dataOutputStream.writeByte(b2 == 1 ? 0 : 1);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] c(short s, String str, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeByte(b2 == 1 ? 0 : 1);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, byte b2, byte b3) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4610);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(b3 == 0 ? 1 : 0);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] d(short s, String str, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(5120);
            dataOutputStream.writeByte(b2 == 1 ? 0 : 1);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] e(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(5123);
            dataOutputStream.writeByte(1);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] e(short s, String str, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4352);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, int i, int i2, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4101);
            dataOutputStream.writeShort(i);
            dataOutputStream.writeShort(i2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, int i, int i2, short s2, long j) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4144);
            dataOutputStream.writeShort(i);
            dataOutputStream.writeShort(i2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4630);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4105);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, int i, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4104);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] c(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4106);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, int i, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4107);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4140);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] d(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4132);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, int i, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4108);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] c(short s, String str, int i, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4109);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] e(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4133);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, int i, int i2, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4138);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] d(short s, String str, int i, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4139);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeShort(i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, int i, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4142);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] e(short s, String str, int i, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4157);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte((byte) i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] f(short s, String str, int i, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4158);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte((byte) i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, long j, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4159);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, int i, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4135);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] f(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4136);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, String str2, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4110);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4111);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] g(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4165);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] h(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4163);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] i(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4164);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] g(short s, String str, int i, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4173);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] h(short s, String str, int i, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, byte b2, String str2, String str3) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4184);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, String str2, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4112);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, String str2, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4124);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] f(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4168);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] g(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4169);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, String str2, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4122);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] c(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4170);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] c(short s, String str, String str2, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4123);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] d(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4171);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, String str2, long j) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4185);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] c(short s, String str, String str2, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4113);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4115);
            dataOutputStream.writeByte(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] e(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4114);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] f(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4119);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] h(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4120);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] i(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4121);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] j(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4177);
            dataOutputStream.writeByte((byte) i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] k(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4161);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] f(short s, String str, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4125);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [byte[]] */
    public static byte[] a(short s, String str, int i, int i2, int i3) throws IOException {
        ?? byteArray;
        if (str == null || str.equals("") || i < 0 || i2 < 0 || i2 > 9 || (byteArray = i3) < 0) {
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
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] c(short s, String str, byte b2, byte b3) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4134);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] i(short s, String str, int i, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4172);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, long j, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4127);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeByte(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] g(short s, String str, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4128);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] h(short s, String str, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4129);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, int i, int i2, long j) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4148);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(1);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, int i, int i2, long j) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4152);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte((byte) i2);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, String str2, String str3, int i, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4147);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeShort((short) i);
            dataOutputStream.writeByte((byte) i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, String str2, String str3, int i, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4153);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeShort((short) i);
            dataOutputStream.writeByte((byte) i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] l(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4154);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] m(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4149);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] n(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4151);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] o(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4162);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] p(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4155);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] q(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4167);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] j(short s, String str, int i, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4166);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] c(short s, String str, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4118);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, long j, int i, short s2, byte b2, int i2, byte b3, byte b4, short s3, int i3, byte b5, byte b6) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4180);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(s2);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeByte(b4);
            dataOutputStream.writeByte(s3);
            dataOutputStream.writeInt(i3);
            dataOutputStream.writeByte(b5);
            dataOutputStream.writeByte(b6);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] r(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4146);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] j(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4143);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, byte b2, byte b3, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4117);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, int i, byte b2, byte b3, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4193);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] s(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4145);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] k(short s, String str, int i, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeShort(i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, short[] sArr) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4186);
            for (byte b2 = 0; b2 < sArr.length; b2 = (byte) (b2 + 1)) {
                dataOutputStream.writeShort(sArr[b2]);
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, int i, short[] sArr) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4187);
            dataOutputStream.writeInt(i);
            for (byte b2 = 0; b2 < sArr.length; b2 = (byte) (b2 + 1)) {
                dataOutputStream.writeShort(sArr[b2]);
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, short[] sArr, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4255);
            dataOutputStream.writeShort(sArr[0]);
            dataOutputStream.writeShort(sArr[1]);
            dataOutputStream.writeShort(sArr[2]);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, byte b2, int i, short s2, short s3, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4253);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, int i, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4188);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] t(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4192);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] u(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4189);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] k(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4190);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] v(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4191);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] g(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4196);
            dataOutputStream.writeByte(t.r);
            dataOutputStream.writeByte(t.s);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, String str2, String str3, boolean z) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4096);
            dataOutputStream.writeByte(t.r);
            dataOutputStream.writeByte(t.s);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(z ? 1 : 0);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] d(short s, String str, short s2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] a(short s, String str, short s2, byte b2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] e(short s, String str, short s2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] f(short s, String str, short s2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] a(short s, String str, String str2, byte b2, String str3, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] a(short s, String str, short s2, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] i(short s, String str, byte b2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4355);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] a(short s, String str, short s2, int i, String str2, String str3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4256);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3 == null ? "" : str3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] a(short s, String str, byte b2, int i, String str2, short s2, short s3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4356);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] j(short s, String str, byte b2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4357);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] a(short s, String str, byte b2, bv bvVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4360);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeInt(bvVar.c);
            dataOutputStream.writeShort(bvVar.e);
            dataOutputStream.writeShort(bvVar.f);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] h(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4673);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] l(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4672);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, String str2, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4671);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] w(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4668);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] a(short s, String str, String str2, String str3, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4670);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] a(short s, String str, String str2, String str3, int i, String str4) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4669);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeUTF(str4);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] b(short s, String str, int i, int i2, int i3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4667);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeShort(i2);
            dataOutputStream.writeShort(i3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] a(short s, String str, byte b2, int i, byte b3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4363);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataOutputStream, java.lang.Throwable] */
    public static byte[] a(short s, String str, byte b2, int i, int i2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4364);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            dataOutputStream.printStackTrace();
            return null;
        } finally {
            a(byteArrayOutputStream, (DataOutputStream) dataOutputStream);
        }
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, DataOutputStream dataOutputStream) throws IOException {
        if (byteArrayOutputStream != null) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
                return;
            }
        }
        if (dataOutputStream != null) {
            dataOutputStream.close();
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, String str2, String str3) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4197);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] i(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4216);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] g(short s, String str, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4198);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] x(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] m(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4209);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] n(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4214);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] j(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4201);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] h(short s, String str, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] o(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4211);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] k(short s, String str, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4263);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] p(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4241);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] d(short s, String str, String str2, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4217);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] i(short s, String str, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4227);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] k(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4208);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, long j) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4224);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] j(short s, String str, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4225);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] l(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] m(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] q(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4219);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] n(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4218);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] r(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4221);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, long j, short s2, short s3, short s4, short s5) throws IOException {
        ?? byteArray;
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
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] k(short s, String str, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] l(short s, String str, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4233);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] y(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4237);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] s(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4236);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, int i, short s2, short s3) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4234);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] l(short s, String str, int i, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4238);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] t(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4248);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] c(short s, String str, int i, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4249);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    public static byte[] u(short s, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = null;
        Throwable th = null;
        DataOutputStream dataOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream = dataOutputStream2;
                dataOutputStream2.writeByte(-82);
                dataOutputStream.writeShort(4612);
                dataOutputStream.writeUTF(bt.b);
                dataOutputStream.writeUTF(bt.d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                a(byteArrayOutputStream, dataOutputStream);
                return byteArray;
            } catch (IOException e) {
                th.printStackTrace();
                a(byteArrayOutputStream, dataOutputStream);
                return null;
            }
        } catch (Throwable th2) {
            a(byteArrayOutputStream, dataOutputStream);
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, String str2, boolean z) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4628);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(z ? 1 : 0);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] m(short s, String str, int i, int i2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4629);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] z(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4613);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, int i, int i2, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4614);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] d(short s, String str, int i, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4615);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, byte b2, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4631);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, byte b2, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4632);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] c(short s, String str, byte b2, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4150);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] e(short s, String str, int i, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4633);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, int i, byte b2, long j) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4640);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] d(short s, String str, String str2, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4864);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, byte b2, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4865);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, byte b2, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4866);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] o(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4868);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] l(short s, String str, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4869);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, int i, int i2, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4642);
            dataOutputStream.writeShort(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] c(short s, String str, int i, int i2, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4645);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] f(short s, String str, int i, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4646);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] g(short s, String str, int i, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4647);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] v(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] c(short s, String str, byte b2, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4872);
            dataOutputStream.writeByte(b2);
            if (str2 != null && b2 == 0) {
                dataOutputStream.writeUTF(str2);
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, byte b2, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4648);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, byte b2, short s2, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4649);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, int i, int i2, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4650);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, String str2, String str3, long j) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4857);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] m(short s, String str, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4858);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] A(short s, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4859);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] m(short s, String str, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4860);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] n(short s, String str, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4861);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] n(short s, String str, short s2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4862);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, int i, int i2, short s2, short s3) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4863);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, String str, String str2, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4856);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] p(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4651);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, int i, byte b2, byte b3) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4652);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] w(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4653);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] x(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4658);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] y(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4659);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, byte b2, byte b3, byte b4, byte b5, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4259);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeByte(b4);
            dataOutputStream.writeByte(b5);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] z(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4223);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, short s2, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] q(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4880);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, int i, int i2, byte b2, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4663);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, int i, byte b2, byte b3, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4689);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, int i, long j, byte b2, byte b3, int i2, byte[] bArr, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4688);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeInt(i2);
            if (b2 == 3) {
                if (bArr == null || bArr.length <= 0) {
                    dataOutputStream.writeByte(0);
                } else {
                    dataOutputStream.writeByte(bArr.length);
                    for (byte b4 : bArr) {
                        dataOutputStream.writeByte(b4);
                    }
                }
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, int i, long j, byte b2, int[] iArr, byte[] bArr, int i2, byte b3, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4262);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeByte(b2);
            if (b2 == 1 || b2 == 2 || b2 == 3) {
                if (iArr == null || iArr.length <= 0) {
                    dataOutputStream.writeByte(0);
                } else {
                    dataOutputStream.writeByte(iArr.length);
                    for (int i3 = 0; i3 < iArr.length; i3++) {
                        dataOutputStream.writeInt(iArr[i3]);
                        dataOutputStream.writeByte(bArr[i3]);
                    }
                }
                if (b2 == 1 || b2 == 2) {
                    dataOutputStream.writeInt(i2);
                    dataOutputStream.writeByte(b3);
                }
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [byte[], java.lang.Throwable] */
    public static byte[] a(byte b2, int i, int i2, int[] iArr, byte[] bArr, int i3, byte b3, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4266);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeByte(b2);
            if (b2 == 4 || b2 == 5 || b2 == 0) {
                if (iArr == null || iArr.length <= 0) {
                    dataOutputStream.writeByte(0);
                } else {
                    dataOutputStream.writeByte(iArr.length);
                    for (int i4 = 0; i4 < iArr.length; i4++) {
                        dataOutputStream.writeInt(iArr[i4]);
                        dataOutputStream.writeByte(bArr[i4]);
                    }
                }
                if (b2 == 4 || b2 == 5) {
                    dataOutputStream.writeInt(i3);
                    dataOutputStream.writeByte(b3);
                }
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, String str2, byte b2, short s2, short s3) throws IOException {
        ?? byteArray;
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
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] A(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4254);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, String str, String str2, short s2, short s3) throws IOException {
        ?? byteArray;
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
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, byte b2, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4881);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, byte b2, String str, byte b3, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4882);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, byte b2, int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, int i4) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(5392);
            dataOutputStream.writeByte(b2);
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
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, byte b2, String str, String str2, boolean z, String str3, String str4, int i, String str5) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(5383);
            dataOutputStream.writeByte(t.r);
            dataOutputStream.writeByte(t.s);
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
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] c(short s, String str, String str2, String str3) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4674);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] r(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4678);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] s(short s, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4675);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, byte b2, long j, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4676);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] B(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4222);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, byte b2, int[] iArr, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4239);
            dataOutputStream.writeByte(b2);
            if (b2 == 2) {
                dataOutputStream.writeByte(iArr[0]);
                dataOutputStream.writeByte(iArr[2]);
                dataOutputStream.writeInt(iArr[1]);
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, int i, int i2, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4244);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte((byte) i2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, byte b2, long j, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4264);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] C(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, int i, byte b2, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4368);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s, int i, byte b2, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [byte[], java.lang.Throwable] */
    public static byte[] D(short s, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4369);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeShort(bt.eE[0]);
            dataOutputStream.writeShort(bt.eE[1]);
            dataOutputStream.writeShort(bt.eE[2]);
            dataOutputStream.writeShort(bt.eF);
            if (bt.eG != null && bt.eG.length > 0 && bt.eG.length < 10) {
                for (int i = 0; i < bt.eG.length; i++) {
                    dataOutputStream.writeByte(bt.eG[i]);
                }
            }
            if (bt.eH != null && bt.eH.length > 0 && bt.eH.length < 10) {
                for (int i2 = 0; i2 < bt.eH.length; i2++) {
                    dataOutputStream.writeShort(bt.eH[i2]);
                }
            }
            if (bt.eI != null && bt.eI.length > 0 && bt.eI.length < 10) {
                for (int i3 = 0; i3 < bt.eI.length; i3++) {
                    dataOutputStream.writeInt(bt.eI[i3]);
                }
            }
            if (bt.eJ != null && bt.eJ.length > 0 && bt.eJ.length < 10) {
                for (int i4 = 0; i4 < bt.eJ.length; i4++) {
                    dataOutputStream.writeUTF(bt.eJ[i4]);
                }
            }
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [byte[], java.lang.Throwable] */
    public static byte[] c(short s, byte b2, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4370);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeShort(bt.eM[0]);
            dataOutputStream.writeShort(bt.eM[1]);
            dataOutputStream.writeShort(bt.eM[2]);
            dataOutputStream.writeShort(bt.eN);
            if (bt.eO != null && bt.eO.length > 0 && bt.eO.length < 10) {
                for (int i = 0; i < bt.eO.length; i++) {
                    dataOutputStream.writeByte(bt.eO[i]);
                }
            }
            if (bt.eP != null && bt.eP.length > 0 && bt.eP.length < 10) {
                for (int i2 = 0; i2 < bt.eP.length; i2++) {
                    dataOutputStream.writeShort(bt.eP[i2]);
                }
            }
            if (bt.eQ != null && bt.eQ.length > 0 && bt.eQ.length < 10) {
                for (int i3 = 0; i3 < bt.eQ.length; i3++) {
                    dataOutputStream.writeInt(bt.eQ[i3]);
                }
            }
            if (bt.eR != null && bt.eR.length > 0 && bt.eR.length < 10) {
                for (int i4 = 0; i4 < bt.eR.length; i4++) {
                    dataOutputStream.writeUTF(bt.eR[i4]);
                }
            }
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4372);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(byte b2, int i, int i2, int[] iArr, int i3, byte b3) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4681);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeInt(i);
            if (b2 != 0 && b2 != 3) {
                dataOutputStream.writeInt(i2);
                dataOutputStream.writeInt(iArr[0]);
                dataOutputStream.writeInt(iArr[1]);
                dataOutputStream.writeInt(iArr[2]);
                if (b2 == 2) {
                    dataOutputStream.writeInt(i3);
                    dataOutputStream.writeByte(b3);
                } else if (b2 == 5) {
                    dataOutputStream.writeByte(b3);
                }
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] a(int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4682);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [byte[], java.lang.Throwable] */
    public static byte[] a(byte b2, int i, int i2, byte b3, byte b4) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4684);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(b4);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Throwable] */
    public static byte[] b(short s) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4267);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [byte[], java.lang.Throwable] */
    public static byte[] a(byte b2, String str, int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4374);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(b2);
            if (b2 > 0 && b2 != 5) {
                dataOutputStream.writeUTF(str);
            }
            if (b2 == 2 || b2 == 4 || b2 == 5 || b2 == 6) {
                dataOutputStream.writeInt(i);
            }
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.lang.Throwable] */
    public static byte[] a(byte b2, byte b3, short s) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4685);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(b2);
            if (b2 == 2 || b2 == 5) {
                dataOutputStream.writeByte(b3);
            } else if (b2 == 3) {
                dataOutputStream.writeShort(s);
            }
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [byte[], java.lang.Throwable] */
    public static byte[] b(byte b2, int i, int i2, int i3) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4691);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeInt(i3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] a(byte b2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4683);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], java.lang.Throwable] */
    public static byte[] b(int i) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4686);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [byte[], java.lang.Throwable] */
    public static byte[] a(short s, int i, byte b2, int i2, int i3, byte b3, String str, String str2) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4687);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeInt(i3);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Throwable] */
    public static byte[] d(short s, byte b2, String str) throws IOException {
        ?? byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4690);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        } catch (IOException e) {
            byteArray.printStackTrace();
            return null;
        }
    }
}

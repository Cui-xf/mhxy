/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class bz {
    public static byte a = (byte)90;
    public static byte b = (byte)72;
    public static int c = 162;

    public static w a(byte by2, byte by3, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(6400);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeInt(bb.a);
            dataOutputStream.writeInt(bb.b);
            dataOutputStream.writeUTF(t.v);
            dataOutputStream.writeUTF(t.F);
            dataOutputStream.writeInt(-1);
            dataOutputStream.writeByte(t.r);
            dataOutputStream.writeByte(t.s);
            dataOutputStream.writeByte(t.u);
            dataOutputStream.writeInt((int)Runtime.getRuntime().totalMemory());
            dataOutputStream.writeByte(by3);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return new w(6400, byteArrayOutputStream.toByteArray());
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte by2, int n2, int n3, int n4) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(1);
            String cfr_ignored_0 = "\u4ee3\u7406\u670d\u52a1\u5668\u5305\u5934: " + 1 + "|" + n2 + "|" + 0 + "|" + 0;
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(0);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, String string2, String string3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeByte(t.r);
            dataOutputStream.writeByte(t.s);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(string3);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, byte by2, short s3, short s4) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4195);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeShort(s4);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4098);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, byte by2, byte by3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeByte(by3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4100);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4103);
            dataOutputStream.writeShort(t.b);
            dataOutputStream.writeShort(t.c);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] c(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] d(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4641);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4194);
            dataOutputStream.writeByte(by2 == 1 ? 0 : 1);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4608);
            dataOutputStream.writeByte(by2 == 1 ? 0 : 1);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] c(short s2, String string, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeByte(by2 == 1 ? 0 : 1);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, byte by2, byte by3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4610);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeByte(by3 == 0 ? 1 : 0);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] d(short s2, String string, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(5120);
            dataOutputStream.writeByte(by2 == 1 ? 0 : 1);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] e(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(5123);
            dataOutputStream.writeByte(1);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] e(short s2, String string, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4352);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2, int n3, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4101);
            dataOutputStream.writeShort(n2);
            dataOutputStream.writeShort(n3);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2, int n3, short s3, long l2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4144);
            dataOutputStream.writeShort(n2);
            dataOutputStream.writeShort(n3);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4630);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4105);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4104);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] c(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4106);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4107);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4140);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] d(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4132);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, int n2, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4108);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] c(short s2, String string, int n2, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4109);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] e(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4133);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2, int n3, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4138);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] d(short s2, String string, int n2, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4139);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeShort(n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4142);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] e(short s2, String string, int n2, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4157);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte((byte)n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] f(short s2, String string, int n2, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4158);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte((byte)n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, long l2, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4159);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, int n2, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4135);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] f(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4136);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, String string2, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4110);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4111);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] g(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4165);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] h(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4163);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] i(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4164);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] g(short s2, String string, int n2, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4173);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] h(short s2, String string, int n2, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, byte by2, String string2, String string3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4184);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(string3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, String string2, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4112);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, String string2, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4124);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] f(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4168);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] g(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4169);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, String string2, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4122);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] c(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4170);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] c(short s2, String string, String string2, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4123);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] d(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4171);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, String string2, long l2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4185);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] c(short s2, String string, String string2, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4113);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4115);
            dataOutputStream.writeByte(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] e(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4114);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] f(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4119);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] h(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4120);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] i(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4121);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] j(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4177);
            dataOutputStream.writeByte((byte)n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] k(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4161);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] f(short s2, String string, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4125);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2, int n3, int n4) {
        if (string == null || string.equals("") || n2 < 0 || n3 < 0 || n3 > 9 || n4 < 0) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4126);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte((byte)n3);
            dataOutputStream.writeByte((byte)n4);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] c(short s2, String string, byte by2, byte by3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4134);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeByte(by3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] i(short s2, String string, int n2, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4172);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, long l2, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4127);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeByte(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] g(short s2, String string, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4128);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] h(short s2, String string, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4129);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2, int n3, long l2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4148);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(1);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, int n2, int n3, long l2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4152);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte((byte)n3);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, String string2, String string3, int n2, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4147);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(string3);
            dataOutputStream.writeShort((short)n2);
            dataOutputStream.writeByte((byte)n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, String string2, String string3, int n2, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4153);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(string3);
            dataOutputStream.writeShort((short)n2);
            dataOutputStream.writeByte((byte)n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] l(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4154);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] m(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4149);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] n(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4151);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] o(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4162);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] p(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4155);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] q(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4167);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] j(short s2, String string, int n2, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4166);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] c(short s2, String string, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4118);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, long l2, int n2, short s3, byte by2, int n3, byte by3, byte by4, short s4, int n4, byte by5, byte by6) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4180);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(s3);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeByte(by3);
            dataOutputStream.writeByte(by4);
            dataOutputStream.writeByte(s4);
            dataOutputStream.writeInt(n4);
            dataOutputStream.writeByte(by5);
            dataOutputStream.writeByte(by6);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] r(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4146);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] j(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4143);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, byte by2, byte by3, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4117);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeByte(by3);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2, byte by2, byte by3, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4193);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeByte(by3);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] s(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4145);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] k(short s2, String string, int n2, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeShort(n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, short[] sArray) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4186);
            for (int n2 = 0; n2 < sArray.length; n2 = (int)((byte)(n2 + 1))) {
                dataOutputStream.writeShort(sArray[n2]);
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2, short[] sArray) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4187);
            dataOutputStream.writeInt(n2);
            for (n2 = 0; n2 < sArray.length; n2 = (int)((byte)(n2 + 1))) {
                dataOutputStream.writeShort(sArray[n2]);
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, short[] sArray, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4255);
            dataOutputStream.writeShort(sArray[0]);
            dataOutputStream.writeShort(sArray[1]);
            dataOutputStream.writeShort(sArray[2]);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, byte by2, int n2, short s3, short s4, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4253);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeShort(s4);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4188);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] t(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4192);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] u(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4189);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] k(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4190);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] v(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4191);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] g(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4196);
            dataOutputStream.writeByte(t.r);
            dataOutputStream.writeByte(t.s);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, String string2, String string3, boolean bl2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4096);
            dataOutputStream.writeByte(t.r);
            dataOutputStream.writeByte(t.s);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(bl2 ? 1 : 0);
            dataOutputStream.writeUTF(string3);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] d(short s2, String string, short s3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            byte[] byArray = byteArrayOutputStream.toByteArray();
            return byArray;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] a(short s2, String string, short s3, byte by2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            byte[] byArray = byteArrayOutputStream.toByteArray();
            return byArray;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] e(short s2, String string, short s3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            byte[] byArray = byteArrayOutputStream.toByteArray();
            return byArray;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] f(short s2, String string, short s3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            byte[] byArray = byteArrayOutputStream.toByteArray();
            return byArray;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] a(short s2, String string, String string2, byte by2, String string3, int n2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(string3);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            byte[] byArray = byteArrayOutputStream.toByteArray();
            return byArray;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] a(short s2, String string, short s3, int n2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            byte[] byArray = byteArrayOutputStream.toByteArray();
            return byArray;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] i(short s2, String object, byte by2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4355);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF((String)object);
            dataOutputStream.writeByte(-81);
            object = byteArrayOutputStream.toByteArray();
            return object;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] a(short s2, String object, short s3, int n2, String string, String string2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4256);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeUTF(string2 == null ? "" : string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF((String)object);
            dataOutputStream.writeByte(-81);
            object = byteArrayOutputStream.toByteArray();
            return object;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] a(short s2, String object, byte by2, int n2, String string, short s3, short s4) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4356);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeShort(s4);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF((String)object);
            dataOutputStream.writeByte(-81);
            object = byteArrayOutputStream.toByteArray();
            return object;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] j(short s2, String object, byte by2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4357);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF((String)object);
            dataOutputStream.writeByte(-81);
            object = byteArrayOutputStream.toByteArray();
            return object;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] a(short s2, String object, byte by2, bv bv2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4360);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeInt(bv2.c);
            dataOutputStream.writeShort(bv2.e);
            dataOutputStream.writeShort(bv2.f);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF((String)object);
            dataOutputStream.writeByte(-81);
            object = byteArrayOutputStream.toByteArray();
            return object;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] h(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4673);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] l(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4672);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, String string2, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4671);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] w(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4668);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String object, String string, String string2, int n2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4670);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF((String)object);
            dataOutputStream.writeByte(-81);
            object = byteArrayOutputStream.toByteArray();
            return object;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] a(short s2, String object, String string, String string2, int n2, String string3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4669);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(string3);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF((String)object);
            dataOutputStream.writeByte(-81);
            object = byteArrayOutputStream.toByteArray();
            return object;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] b(short s2, String object, int n2, int n3, int n4) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4667);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeShort(n3);
            dataOutputStream.writeShort(n4);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF((String)object);
            dataOutputStream.writeByte(-81);
            object = byteArrayOutputStream.toByteArray();
            return object;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] a(short s2, String object, byte by2, int n2, byte by3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4363);
            dataOutputStream.writeByte(by3);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF((String)object);
            dataOutputStream.writeByte(-81);
            object = byteArrayOutputStream.toByteArray();
            return object;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] a(short s2, String object, byte by2, int n2, int n3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4364);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF((String)object);
            dataOutputStream.writeByte(-81);
            object = byteArrayOutputStream.toByteArray();
            return object;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, DataOutputStream dataOutputStream) {
        try {
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static byte[] b(short s2, String string, String string2, String string3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4197);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(string3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] i(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4216);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] g(short s2, String string, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4198);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] x(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] m(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4209);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] n(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4214);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] j(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4201);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] h(short s2, String string, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] o(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4211);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] k(short s2, String string, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4263);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] p(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4241);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] d(short s2, String string, String string2, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4217);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] i(short s2, String string, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4227);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] k(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4208);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, long l2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4224);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] j(short s2, String string, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4225);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] l(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] m(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] q(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4219);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] n(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4218);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] r(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4221);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, long l2, short s3, short s4, short s5, short s6) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4220);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeShort(s4);
            dataOutputStream.writeShort(s5);
            dataOutputStream.writeShort(s6);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] k(short s2, String string, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] l(short s2, String string, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4233);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] y(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4237);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] s(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4236);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2, short s3, short s4) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4234);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeShort(s4);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] l(short s2, String string, int n2, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4238);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] t(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4248);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] c(short s2, String string, int n2, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4249);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] u(short s2, String object) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4612);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF((String)object);
            dataOutputStream.writeByte(-81);
            object = byteArrayOutputStream.toByteArray();
            bz.a(byteArrayOutputStream, dataOutputStream);
            return object;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
        }
        finally {
            bz.a(byteArrayOutputStream, dataOutputStream);
        }
        return null;
    }

    public static byte[] a(short s2, String string, String string2, boolean bl2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4628);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(bl2 ? 1 : 0);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] m(short s2, String string, int n2, int n3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4629);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] z(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4613);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, int n2, int n3, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4614);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] d(short s2, String string, int n2, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4615);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, byte by2, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4631);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeByte(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, byte by2, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4632);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeByte(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] c(short s2, String string, byte by2, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4150);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeByte(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] e(short s2, String string, int n2, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4633);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2, byte by2, long l2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4640);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] d(short s2, String string, String string2, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4864);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, byte by2, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4865);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, byte by2, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4866);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] o(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4868);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] l(short s2, String string, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4869);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, int n2, int n3, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4642);
            dataOutputStream.writeShort(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] c(short s2, String string, int n2, int n3, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4645);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] f(short s2, String string, int n2, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4646);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] g(short s2, String string, int n2, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4647);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] v(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] c(short s2, String string, byte by2, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4872);
            dataOutputStream.writeByte(by2);
            if (string2 != null && by2 == 0) {
                dataOutputStream.writeUTF(string2);
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, byte by2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4648);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, byte by2, short s3, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4649);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, int n2, int n3, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4650);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, String string2, String string3, long l2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4857);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(string3);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] m(short s2, String string, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4858);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] A(short s2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4859);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] m(short s2, String string, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4860);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] n(short s2, String string, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4861);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] n(short s2, String string, short s3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4862);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2, int n3, short s3, short s4) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4863);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeShort(s4);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, String string, String string2, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4856);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] p(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4651);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, int n2, byte by2, byte by3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4652);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(by3);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] w(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4653);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] x(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4658);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] y(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4659);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, byte by2, byte by3, byte by4, byte by5, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4259);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeByte(by3);
            dataOutputStream.writeByte(by4);
            dataOutputStream.writeByte(by5);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] z(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4223);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, short s3, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] q(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4880);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, int n2, int n3, byte by2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4663);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, int n2, byte by2, byte by3, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4689);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(by3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, int n2, long l2, byte by2, byte by3, int n3, byte[] byArray, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4688);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeByte(by3);
            dataOutputStream.writeInt(n3);
            if (by2 == 3) {
                if (byArray == null || byArray.length <= 0) {
                    dataOutputStream.writeByte(0);
                } else {
                    dataOutputStream.writeByte(byArray.length);
                    for (n2 = 0; n2 < byArray.length; ++n2) {
                        dataOutputStream.writeByte(byArray[n2]);
                    }
                }
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, int n2, long l2, byte by2, int[] nArray, byte[] byArray, int n3, byte by3, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4262);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeByte(by2);
            if (by2 == 1 || by2 == 2 || by2 == 3) {
                if (nArray == null || nArray.length <= 0) {
                    dataOutputStream.writeByte(0);
                } else {
                    dataOutputStream.writeByte(nArray.length);
                    for (n2 = 0; n2 < nArray.length; ++n2) {
                        dataOutputStream.writeInt(nArray[n2]);
                        dataOutputStream.writeByte(byArray[n2]);
                    }
                }
                if (by2 == 1 || by2 == 2) {
                    dataOutputStream.writeInt(n3);
                    dataOutputStream.writeByte(by3);
                }
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte by2, int n2, int n3, int[] nArray, byte[] byArray, int n4, byte by3, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4266);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeByte(by2);
            if (by2 == 4 || by2 == 5 || by2 == 0) {
                if (nArray == null || nArray.length <= 0) {
                    dataOutputStream.writeByte(0);
                } else {
                    dataOutputStream.writeByte(nArray.length);
                    for (n2 = 0; n2 < nArray.length; ++n2) {
                        dataOutputStream.writeInt(nArray[n2]);
                        dataOutputStream.writeByte(byArray[n2]);
                    }
                }
                if (by2 == 4 || by2 == 5) {
                    dataOutputStream.writeInt(n4);
                    dataOutputStream.writeByte(by3);
                }
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, String string2, byte by2, short s3, short s4) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(5121);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(1);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeShort(s4);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] A(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4254);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, String string, String string2, short s3, short s4) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(5122);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeShort(s4);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, byte by2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4881);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, byte by2, String string, byte by3, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4882);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(by3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, byte by2, int n2, int n3, String string, String string2, String string3, String string4, String string5, int n4, int n5) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(5392);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(string3);
            dataOutputStream.writeUTF(string4);
            dataOutputStream.writeUTF(string5);
            dataOutputStream.writeInt(n4);
            dataOutputStream.writeInt(n5);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, byte by2, String string, String string2, boolean bl2, String string3, String string4, int n2, String string5) {
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
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeUTF(string3);
            dataOutputStream.writeUTF(string4);
            dataOutputStream.writeInt(-1);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(-1);
            dataOutputStream.writeUTF(string5);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] c(short s2, String string, String string2, String string3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4674);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(string3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] r(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4678);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] s(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4675);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, byte by2, long l2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4676);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] B(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4222);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, byte by2, int[] nArray, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4239);
            dataOutputStream.writeByte(by2);
            if (by2 == 2) {
                dataOutputStream.writeByte(nArray[0]);
                dataOutputStream.writeByte(nArray[2]);
                dataOutputStream.writeInt(nArray[1]);
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, int n2, int n3, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4244);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte((byte)n3);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, byte by2, long l2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4264);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeLong(l2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] C(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, int n2, byte by2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4368);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2, int n2, byte by2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] D(short s2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4369);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeShort(bt.eE[0]);
            dataOutputStream.writeShort(bt.eE[1]);
            dataOutputStream.writeShort(bt.eE[2]);
            dataOutputStream.writeShort(bt.eF);
            if (bt.eG != null && bt.eG.length > 0 && bt.eG.length < 10) {
                for (int i2 = 0; i2 < bt.eG.length; ++i2) {
                    dataOutputStream.writeByte(bt.eG[i2]);
                }
            }
            if (bt.eH != null && bt.eH.length > 0 && bt.eH.length < 10) {
                for (int i3 = 0; i3 < bt.eH.length; ++i3) {
                    dataOutputStream.writeShort(bt.eH[i3]);
                }
            }
            if (bt.eI != null && bt.eI.length > 0 && bt.eI.length < 10) {
                for (int i4 = 0; i4 < bt.eI.length; ++i4) {
                    dataOutputStream.writeInt(bt.eI[i4]);
                }
            }
            if (bt.eJ != null && bt.eJ.length > 0 && bt.eJ.length < 10) {
                for (int i5 = 0; i5 < bt.eJ.length; ++i5) {
                    dataOutputStream.writeUTF(bt.eJ[i5]);
                }
            }
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] c(short s2, byte by2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4370);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeShort(bt.eM[0]);
            dataOutputStream.writeShort(bt.eM[1]);
            dataOutputStream.writeShort(bt.eM[2]);
            dataOutputStream.writeShort(bt.eN);
            if (bt.eO != null && bt.eO.length > 0 && bt.eO.length < 10) {
                for (by2 = 0; by2 < bt.eO.length; by2 = (byte)(by2 + 1)) {
                    dataOutputStream.writeByte(bt.eO[by2]);
                }
            }
            if (bt.eP != null && bt.eP.length > 0 && bt.eP.length < 10) {
                for (by2 = 0; by2 < bt.eP.length; by2 = (byte)(by2 + 1)) {
                    dataOutputStream.writeShort(bt.eP[by2]);
                }
            }
            if (bt.eQ != null && bt.eQ.length > 0 && bt.eQ.length < 10) {
                for (by2 = 0; by2 < bt.eQ.length; by2 = (byte)(by2 + 1)) {
                    dataOutputStream.writeInt(bt.eQ[by2]);
                }
            }
            if (bt.eR != null && bt.eR.length > 0 && bt.eR.length < 10) {
                for (by2 = 0; by2 < bt.eR.length; by2 = (byte)(by2 + 1)) {
                    dataOutputStream.writeUTF(bt.eR[by2]);
                }
            }
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4372);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte by2, int n2, int n3, int[] nArray, int n4, byte by3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4681);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeInt(n2);
            if (by2 != 0 && by2 != 3) {
                dataOutputStream.writeInt(n3);
                dataOutputStream.writeInt(nArray[0]);
                dataOutputStream.writeInt(nArray[1]);
                dataOutputStream.writeInt(nArray[2]);
                if (by2 == 2) {
                    dataOutputStream.writeInt(n4);
                    dataOutputStream.writeByte(by3);
                } else if (by2 == 5) {
                    dataOutputStream.writeByte(by3);
                }
            }
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4682);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte by2, int n2, int n3, byte by3, byte by4) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4684);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeByte(by3);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeByte(by4);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(short s2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4267);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte by2, String string, int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4374);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(by2);
            if (by2 > 0 && by2 != 5) {
                dataOutputStream.writeUTF(string);
            }
            if (by2 == 2 || by2 == 4 || by2 == 5 || by2 == 6) {
                dataOutputStream.writeInt(n2);
            }
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte by2, byte by3, short s2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4685);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(by2);
            if (by2 == 2 || by2 == 5) {
                dataOutputStream.writeByte(by3);
            } else if (by2 == 3) {
                dataOutputStream.writeShort(s2);
            }
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(byte by2, int n2, int n3, int n4) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4691);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeInt(n4);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte by2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4683);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] b(int n2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4686);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] a(short s2, int n2, byte by2, int n3, int n4, byte by3, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4687);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeInt(n4);
            dataOutputStream.writeByte(by3);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public static byte[] d(short s2, byte by2, String string) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4690);
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(bt.ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }
}


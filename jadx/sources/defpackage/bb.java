package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: java版梦回西游3区251011.jar:bb.class */
public final class bb {
    public static String g;
    public static String h;
    public static String i;
    public static String j;
    public static String m;
    public static String n;
    public static int a = 1;
    public static int b = 1;
    public static boolean c = false;
    public static int d = -1;
    public static String[] e = {"充值时请认真填写，因输入错误而充值到他人帐户的损失将由您本人承担。", "卡面充值时，请务必确认您的充值卡面额与选择金额相同，否则会导致支付失败，同时卡内金额被【一次性扣费】。", "开通网银支付：工商银行请去柜台开通,如果工行已开通网银并且动态口令卡支付,直接在网上银行开通即可。建设银行请去柜台签约,然后用手机登录个人网银激活。招商银行手机支付功能不需要单独申请.如果您已经开通了大众版支付(卡号密码支付)功能,则可以直接使用手机支付。", "网银充值时，如有银行记录已扣款，但通行证账户未充入相应数额银元，请电话联系400-889-0009 解决。", "请不要重复提交，以防重复购买。"};
    public static String[] f = {"充值时请认真填写，因输入错误而充值到他人帐户的损失将由您本人承担。", "卡面充值时，请务必确认您的充值卡面额与选择金额相同，否则会导致支付失败，同时卡内金额被【一次性扣费】。", "开通网银支付：工商银行请去柜台开通,如果工行已开通网银并且动态口令卡支付,直接在网上银行开通即可。建设银行请去柜台签约,然后用手机登录个人网银激活。招商银行手机支付功能不需要单独申请.如果您已经开通了大众版支付(卡号密码支付)功能,则可以直接使用手机支付。", "网银充值时，如有银行记录已扣款，但通行证账户未充入相应数额的金豆，请电话联系400-889-0009 解决。", "请不要重复提交，以防重复购买。"};
    public static boolean k = true;
    public static byte l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.DataInputStream] */
    public static void a() {
        byte[] bArrA = bj.a("silver_kj");
        if (bArrA == null) {
            return;
        }
        ByteArrayInputStream byteArrayInputStream = null;
        ?? r0 = 0;
        DataInputStream dataInputStream = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArrA);
                DataInputStream dataInputStream2 = new DataInputStream(byteArrayInputStream);
                dataInputStream = dataInputStream2;
                k = dataInputStream2.readByte() == 1;
                l = dataInputStream.readByte();
                m = dataInputStream.readUTF();
                n = dataInputStream.readUTF();
                byteArrayInputStream.close();
                r0 = dataInputStream;
                r0.close();
                ?? r02 = byteArrayInputStream;
                try {
                    r02.close();
                    r02 = dataInputStream;
                    r02.close();
                } catch (Exception e2) {
                    r02.printStackTrace();
                }
            } catch (Throwable th) {
                ?? r03 = byteArrayInputStream;
                if (r03 != 0) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Exception e3) {
                        r03.printStackTrace();
                        throw th;
                    }
                }
                if (dataInputStream != null) {
                    r03 = dataInputStream;
                    r03.close();
                }
                throw th;
            }
        } catch (Exception e4) {
            r0.printStackTrace();
            ?? r04 = byteArrayInputStream;
            if (r04 != 0) {
                try {
                    byteArrayInputStream.close();
                } catch (Exception e5) {
                    r04.printStackTrace();
                    return;
                }
            }
            if (dataInputStream != null) {
                r04 = dataInputStream;
                r04.close();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v21, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static void b() {
        ByteArrayOutputStream byteArrayOutputStream = null;
        ?? byteArray = 0;
        DataOutputStream dataOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream = dataOutputStream2;
                dataOutputStream2.writeByte(k ? 1 : 0);
                dataOutputStream.writeByte(l);
                dataOutputStream.writeUTF(m);
                dataOutputStream.writeUTF(k ? n : "");
                dataOutputStream.flush();
                byteArray = byteArrayOutputStream.toByteArray();
                bj.a((byte[]) byteArray, "silver_kj");
                ?? r0 = byteArrayOutputStream;
                try {
                    r0.close();
                    r0 = dataOutputStream;
                    r0.close();
                } catch (Exception e2) {
                    r0.printStackTrace();
                }
            } catch (Exception e3) {
                byteArray.printStackTrace();
                ?? r02 = byteArrayOutputStream;
                if (r02 != 0) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception e4) {
                        r02.printStackTrace();
                        return;
                    }
                }
                if (dataOutputStream != null) {
                    r02 = dataOutputStream;
                    r02.close();
                }
            }
        } catch (Throwable th) {
            ?? r03 = byteArrayOutputStream;
            if (r03 != 0) {
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e5) {
                    r03.printStackTrace();
                    throw th;
                }
            }
            if (dataOutputStream != null) {
                r03 = dataOutputStream;
                r03.close();
            }
            throw th;
        }
    }
}

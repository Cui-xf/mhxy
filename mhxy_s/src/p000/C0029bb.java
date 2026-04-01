package p000;

import com.cc.CloseUtil;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

/* renamed from: bb */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0029bb {

    /* renamed from: g */
    public static String f553g;

    /* renamed from: h */
    public static String f554h;

    /* renamed from: i */
    public static String f555i;

    /* renamed from: j */
    public static String f556j;

    /* renamed from: m */
    public static String f559m;

    /* renamed from: n */
    public static String f560n;

    /* renamed from: a */
    public static int f547a = 1;

    /* renamed from: b */
    public static int f548b = 1;

    /* renamed from: c */
    public static boolean f549c = false;

    /* renamed from: d */
    public static int f550d = -1;

    /* renamed from: e */
    public static String[] f551e = {"充值时请认真填写，因输入错误而充值到他人帐户的损失将由您本人承担。", "卡面充值时，请务必确认您的充值卡面额与选择金额相同，否则会导致支付失败，同时卡内金额被【一次性扣费】。", "开通网银支付：工商银行请去柜台开通,如果工行已开通网银并且动态口令卡支付,直接在网上银行开通即可。建设银行请去柜台签约,然后用手机登录个人网银激活。招商银行手机支付功能不需要单独申请.如果您已经开通了大众版支付(卡号密码支付)功能,则可以直接使用手机支付。", "网银充值时，如有银行记录已扣款，但通行证账户未充入相应数额银元，请电话联系400-889-0009 解决。", "请不要重复提交，以防重复购买。"};

    /* renamed from: f */
    public static String[] f552f = {"充值时请认真填写，因输入错误而充值到他人帐户的损失将由您本人承担。", "卡面充值时，请务必确认您的充值卡面额与选择金额相同，否则会导致支付失败，同时卡内金额被【一次性扣费】。", "开通网银支付：工商银行请去柜台开通,如果工行已开通网银并且动态口令卡支付,直接在网上银行开通即可。建设银行请去柜台签约,然后用手机登录个人网银激活。招商银行手机支付功能不需要单独申请.如果您已经开通了大众版支付(卡号密码支付)功能,则可以直接使用手机支付。", "网银充值时，如有银行记录已扣款，但通行证账户未充入相应数额的金豆，请电话联系400-889-0009 解决。", "请不要重复提交，以防重复购买。"};

    /* renamed from: k */
    public static boolean f557k = true;

    /* renamed from: l */
    public static byte f558l = 0;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063 A[Catch: Exception -> 0x0067, TRY_LEAVE, TryCatch #1 {Exception -> 0x0067, blocks: (B:28:0x005e, B:30:0x0063), top: B:44:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m624a() {
        byte[] bArrM684a = C0037bj.m684a("silver_kj");
        if (bArrM684a == null) {
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM684a);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            f557k = dataInputStream.readByte() == 1;
            f558l = dataInputStream.readByte();
            f559m = dataInputStream.readUTF();
            f560n = dataInputStream.readUTF();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            CloseUtil.close(byteArrayInputStream, dataInputStream);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0063 A[Catch: Exception -> 0x0067, TRY_LEAVE, TryCatch #1 {Exception -> 0x0067, blocks: (B:32:0x005e, B:34:0x0063), top: B:48:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m625b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(f557k ? 1 : 0);
            dataOutputStream.writeByte(f558l);
            dataOutputStream.writeUTF(f559m);
            dataOutputStream.writeUTF(f557k ? f560n : "");
            dataOutputStream.flush();
            C0037bj.m682a(byteArrayOutputStream.toByteArray(), "silver_kj");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            CloseUtil.close(byteArrayOutputStream, dataOutputStream);
        }
    }
}

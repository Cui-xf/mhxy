package p000;

/* renamed from: bb */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
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
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m624a() throws java.lang.Throwable {
        /*
            r2 = 0
            r0 = 1
            java.lang.String r1 = "silver_kj"
            byte[] r1 = p000.C0037bj.m684a(r1)
            if (r1 != 0) goto Lb
        La:
            return
        Lb:
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L59
            r3.<init>(r1)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L59
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            byte r2 = r1.readByte()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            if (r2 != r0) goto L41
        L1b:
            p000.C0029bb.f557k = r0     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            byte r0 = r1.readByte()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            p000.C0029bb.f558l = r0     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            java.lang.String r0 = r1.readUTF()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            p000.C0029bb.f559m = r0     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            java.lang.String r0 = r1.readUTF()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            p000.C0029bb.f560n = r0     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            r3.close()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            r1.close()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            r3.close()     // Catch: java.lang.Exception -> L3c
            r1.close()     // Catch: java.lang.Exception -> L3c
            goto La
        L3c:
            r0 = move-exception
            r0.printStackTrace()
            goto La
        L41:
            r0 = 0
            goto L1b
        L43:
            r0 = move-exception
            r1 = r2
            r3 = r2
        L46:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L4e
            r3.close()     // Catch: java.lang.Exception -> L54
        L4e:
            if (r1 == 0) goto La
            r1.close()     // Catch: java.lang.Exception -> L54
            goto La
        L54:
            r0 = move-exception
            r0.printStackTrace()
            goto La
        L59:
            r0 = move-exception
            r1 = r2
            r3 = r2
        L5c:
            if (r3 == 0) goto L61
            r3.close()     // Catch: java.lang.Exception -> L67
        L61:
            if (r1 == 0) goto L66
            r1.close()     // Catch: java.lang.Exception -> L67
        L66:
            throw r0
        L67:
            r1 = move-exception
            r1.printStackTrace()
            goto L66
        L6c:
            r0 = move-exception
            r1 = r2
            goto L5c
        L6f:
            r0 = move-exception
            goto L5c
        L71:
            r0 = move-exception
            r1 = r2
            goto L46
        L74:
            r0 = move-exception
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0029bb.m624a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0063 A[Catch: Exception -> 0x0067, TRY_LEAVE, TryCatch #1 {Exception -> 0x0067, blocks: (B:32:0x005e, B:34:0x0063), top: B:48:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m625b() {
        /*
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L59
            r3.<init>()     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L59
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L71
            boolean r0 = p000.C0029bb.f557k     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            if (r0 == 0) goto L39
            r0 = 1
        L10:
            r1.writeByte(r0)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            byte r0 = p000.C0029bb.f558l     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            r1.writeByte(r0)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            java.lang.String r0 = p000.C0029bb.f559m     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            r1.writeUTF(r0)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            boolean r0 = p000.C0029bb.f557k     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            if (r0 == 0) goto L3b
            java.lang.String r0 = p000.C0029bb.f560n     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
        L23:
            r1.writeUTF(r0)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            r1.flush()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            java.lang.String r2 = "silver_kj"
            p000.C0037bj.m682a(r0, r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L74
            r3.close()     // Catch: java.lang.Exception -> L3e
            r1.close()     // Catch: java.lang.Exception -> L3e
        L38:
            return
        L39:
            r0 = 0
            goto L10
        L3b:
            java.lang.String r0 = ""
            goto L23
        L3e:
            r0 = move-exception
            r0.printStackTrace()
            goto L38
        L43:
            r0 = move-exception
            r1 = r2
            r3 = r2
        L46:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L4e
            r3.close()     // Catch: java.lang.Exception -> L54
        L4e:
            if (r1 == 0) goto L38
            r1.close()     // Catch: java.lang.Exception -> L54
            goto L38
        L54:
            r0 = move-exception
            r0.printStackTrace()
            goto L38
        L59:
            r0 = move-exception
            r1 = r2
            r3 = r2
        L5c:
            if (r3 == 0) goto L61
            r3.close()     // Catch: java.lang.Exception -> L67
        L61:
            if (r1 == 0) goto L66
            r1.close()     // Catch: java.lang.Exception -> L67
        L66:
            throw r0
        L67:
            r1 = move-exception
            r1.printStackTrace()
            goto L66
        L6c:
            r0 = move-exception
            r1 = r2
            goto L5c
        L6f:
            r0 = move-exception
            goto L5c
        L71:
            r0 = move-exception
            r1 = r2
            goto L46
        L74:
            r0 = move-exception
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0029bb.m625b():void");
    }
}

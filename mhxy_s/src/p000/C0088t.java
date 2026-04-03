package p000;

import javax.microedition.lcdui.Font;
import javax.microedition.midlet.MIDlet;

/* renamed from: t */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0088t {

    /* renamed from: A */
    public static boolean f2480A;

    /* renamed from: B */
    public static boolean f2481B;

    /* renamed from: C */
    public static boolean f2482C;

    /* renamed from: D */
    public static boolean f2483D;

    /* renamed from: E */
    public static final String[] f2484E;

    /* renamed from: F */
    public static String f2485F;

    /* renamed from: G */
    public static final String[] f2486G;

    /* renamed from: H */
    public static final String[] f2487H;

    /* renamed from: I */
    public static final String[] f2488I;

    /* renamed from: J */
    public static final String[] f2489J;

    /* renamed from: K */
    public static final String[] f2490K;

    /* renamed from: L */
    public static final String[] f2491L;

    /* renamed from: M */
    public static final String[] f2492M;

    /* renamed from: N */
    public static final String[][] f2493N;

    /* renamed from: O */
    public static final String[] f2494O;

    /* renamed from: P */
    public static final String[] f2495P;

    /* renamed from: Q */
    public static short[][] f2496Q;

    /* renamed from: R */
    public static short[][] f2497R;

    /* renamed from: S */
    public static final short[][] f2498S;

    /* renamed from: T */
    public static final short[][] f2499T;

    /* renamed from: U */
    public static final short[] f2500U;

    /* renamed from: V */
    public static char[] f2501V;

    /* renamed from: W */
    public static char[] f2502W;

    /* renamed from: X */
    public static char[] f2503X;

    /* renamed from: Y */
    public static final String[] f2504Y;

    /* renamed from: Z */
    public static String[] f2505Z;

    /* renamed from: aa */
    public static String[] f2507aa;

    /* renamed from: ab */
    public static String[] f2508ab;

    /* renamed from: ac */
    public static String[] f2509ac;

    /* renamed from: ad */
    public static final String[] f2510ad;

    /* renamed from: ae */
    public static String[] f2511ae;

    /* renamed from: af */
    public static String[] f2512af;

    /* renamed from: ag */
    public static StringBuffer f2513ag;

    /* renamed from: ah */
    public static final String[] f2514ah;

    /* renamed from: ai */
    private static boolean f2515ai;

    /* renamed from: f */
    public static short f2520f;

    /* renamed from: g */
    public static short f2521g;

    /* renamed from: h */
    public static Font f2522h;

    /* renamed from: i */
    public static Font f2523i;

    /* renamed from: j */
    public static int f2524j;

    /* renamed from: k */
    public static int f2525k;

    /* renamed from: l */
    public static byte f2526l;

    /* renamed from: m */
    public static byte f2527m;

    /* renamed from: n */
    public static boolean f2528n;

    /* renamed from: o */
    public static boolean f2529o;

    /* renamed from: p */
    public static boolean f2530p;

    /* renamed from: q */
    public static byte f2531q;

    /* renamed from: r */
    public static byte f2532r;

    /* renamed from: s */
    public static byte f2533s;

    /* renamed from: t */
    public static String f2534t;

    /* renamed from: u */
    public static int f2535u;

    /* renamed from: v */
    public static String f2536v;

    /* renamed from: w */
    public static boolean f2537w;

    /* renamed from: x */
    public static boolean f2538x;

    /* renamed from: y */
    public static boolean f2539y;

    /* renamed from: z */
    public static boolean f2540z;

    /* renamed from: a */
    public static byte f2506a = 1;

    /* renamed from: b */
    public static short f2516b = 240;

    /* renamed from: c */
    public static short f2517c = 320;

    /* renamed from: d */
    public static short f2518d = 240;

    /* renamed from: e */
    public static short f2519e = 320;

    static {
        Font.getFont(0, 2, 16);
        f2522h = Font.getFont(0, 2, 0);
        Font font = Font.getFont(64, 0, 8);
        f2523i = font;
        f2524j = font.getHeight();
        f2525k = f2523i.stringWidth("宽");
        f2526l = (byte) 2;
        f2527m = (byte) 2;
        f2528n = false;
        f2529o = true;
        f2515ai = false;
        f2530p = true;
        f2531q = (byte) 1;
        f2532r = (byte) 1;
        f2533s = (byte) 44;
        f2534t = "v1.4.4";
        f2535u = 4;
        f2536v = "";
        f2537w = false;
        f2538x = false;
        f2539y = false;
        f2540z = false;
        f2480A = false;
        f2481B = false;
        f2482C = false;
        f2483D = false;
        f2484E = new String[]{"世界频道", "区域频道", "队伍频道", "帮派频道"};
        f2485F = "";
        int[] iArr = {158, 222};
        f2486G = new String[]{"将军府", "方寸山", "龙宫"};
        f2487H = new String[]{"将军府偏重物理,推荐物攻配点", "方寸山专修法术,推荐法攻配点", "龙宫善状态加强,推荐生命配点"};
        String[] strArr = {"生命", "内力", "攻击", "法攻", "防御", "冰抗", "火抗", "雷抗", "速度"};
        f2488I = new String[]{"买东西", "卖东西", "战斗", "传送", "物品仓库", "银两仓库", "宠物仓库", "拍卖物品", "拍卖宠物", "拍卖场", "拍卖详情", "技能学习", "任务", "出售宠物", "买入宠物", "兑换", "每日任务", "角色洗点", "宠物洗点", "住宅", "房屋管理", "退出住宅", "家具管理", "退出房屋", "帮会建立", "设施买卖", "帮派公告", "帮派管理", "宝库管理", "外交", "打孔", "开孔", "提升军力", "战争捷报", "求爱宣言", "申请结婚", "申请离婚", "新人拜堂", "回答问题", "锻造", "抢答问题", "区域掉宝(查看)", "风云榜(查看)", "领取奖品", "装备升星", "收回", "装备洗炼", "装备附魔", "攻城竞标", "抽奖"};
        String[] strArr2 = {"收回", "进入", "查看", "升级", "掉落", "Buff", "兑换"};
        f2489J = new String[]{"未接受", "未完成", "完成"};
        f2490K = new String[]{"物理", "冰", "火", "雷"};
        f2491L = new String[]{"物品行囊", "喂养宠物", "存入仓库", "宠物学习", "物品交易", "物品拍卖", "战斗使用", "装备物品", "金豆拍卖物品", "装备宠物物品", "装备打孔", "宝石镶嵌", "喂养天使", "增加好感度", "宠物技能扩容", "", "装备洗炼", "装备附魔", "捐献宝物", "物品合成", "物品选择", "物品选择", "物品选择"};
        f2492M = new String[]{"头 盔", "护身符", "衣 服", "武 器", "鞋 子", "戒 指", "婚 饰", "法 宝", "没有装备", "没有装备"};
        String[] strArr3 = {"人物", "任务", "道具", "交流", "住宅", "帮派", "设置", "退出"};
        f2493N = new String[][]{new String[]{"jm", "jf"}, new String[]{"fm", "ff"}, new String[]{"lm", "lf"}};
        int[] iArr2 = {3123503, 14799407, 12916232, 5525841};
        f2494O = new String[]{"LIGHT", "FIRE", "COLD", "NONE"};
        f2495P = new String[]{"WEAPON", "HEAD", "BOSOM", "FOOT", "DECORATION", "BOOK", "STUFF", "CHARGE"};
        f2496Q = null;
        f2497R = null;
        f2498S = new short[][]{new short[]{92, 188}, new short[]{121, 166}, new short[]{150, 144}, new short[]{63, 166}, new short[]{92, 144}, new short[]{121, 122}};
        f2499T = new short[][]{new short[]{53, 115}, new short[]{82, 93}, new short[]{111, 71}, new short[]{24, 93}, new short[]{53, 71}, new short[]{82, 49}};
        short[] sArr = {-1, 291, 292, 293, 294, 295, 296};
        f2500U = new short[]{-1, 191, 192, 193, 194, 195, 196};
        short[] sArr2 = {6, 5, 14, 15, 17, 18, 19};
        short[] sArr3 = {8, 9, 12, 13};
        short[] sArr4 = {0, 1, 2, 4, 7, 20, 21, 22, 23, 24, 35};
        short[] sArr5 = {10, 11, 16, 28, 29, 25, 26, 27};
        short[] sArr6 = {30, 31, 32, 33, 34, 36, 37};
        short[] sArr7 = {44, 45, 46, 47};
        short[] sArr8 = {48, 49};
        f2501V = new char[]{'1', '2', '3'};
        f2502W = new char[]{'0', '1'};
        f2503X = new char[]{'0', '0', '1', '1', '4'};
        f2504Y = new String[]{"异常离线", "战斗、交易状态不能进行其他操作", "非法操作", "您没有操作权限", "操作成功", "操作失败"};
        f2505Z = new String[]{"建立帮派", "响应建帮", "发布招募", "申请入帮", "进入帮派", "退出帮派", "解散帮派"};
        f2507aa = new String[]{"建帮条件：\t申请人40级以上，未加入帮派，需先缴纳2千万申请费，申请后48小时内必须有25个40级以上的玩家响应才算建立成功，否则失败并没收10%申请费。", "打开待成立帮派的列表，响应你想支持成立的帮派。", "要壮大帮派，就要招募更多的人才，发布招募的金额越高越靠前显示（只有帮派官员有权发布招募）。", "打开帮派招募列表，选择你想加入的帮派。", "进入帮派/国家领地，也可以从主菜单进入。", "退出帮派，重新变成无派人士。", "解散自己创建的帮派（只能帮主有权解散）。"};
        f2508ab = new String[]{"更改宗旨", "接受申请", "邀请加入", "任免开除", "查看帮派", "帮派升级"};
        f2509ac = new String[]{"帮主更改帮派的宗旨。", "接受申请加入本帮派的玩家", "邀请指定玩家加入本帮。", "职务任免，开除成员。", "查看帮会的基本信息。", "帮派升级"};
        String[] strArr4 = {"查看公告", "改写公告"};
        String[] strArr5 = {"查看帮派的公告", "改写帮派的公告"};
        f2510ad = new String[]{"查看宝库", "捐献物品", "捐献银两", "取出银两", "捐献经验", "贡献物资", "发布任务（资源）", "发布任务（金豆）", "宝库配置", "提升人气", "宝库扩容"};
        f2511ae = new String[]{"银两", "金锭", "银锭", "铜锭", "铁锭"};
        f2512af = new String[]{"物品掉率", "银两奖励", "经验加成"};
        f2513ag = new StringBuffer();
//        short[] var14 = new short[]{0};
//        short[] sArr9 = {0, 1, 2, 4, 7, 35, 6, 5, 14, 15, 17, 18, 19, 44, 8, 9, 12, 13, 30, 31, 36, 32, 33, 34, 37, 3, 10, 11, 16, 28};
//        short[] sArr10 = {29, 45, 47, 46, 25, 26, 27, 48, 50, 49, 51, 53, 52, 20, 21, 22, 23, 24, 54, 55, 56, 57, 63, 61, 62, 59, 60, 58, 70, 71};
//        short[] sArr11 = {72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 68, 69};
        new StringBuffer();
        f2514ah = new String[]{"将以短信方式为您开通超Q服务", "非中国移动用户请登录超Q官网（sqq.3g.qq.com）开通"};
    }

    /* renamed from: a */
    public static int m1674a(int i) {
        if (i > f2524j) {
            return (i - f2524j) / 2;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m1675a(int i, String str) {
        int iStringWidth = f2523i.stringWidth(str);
        if (i > iStringWidth) {
            return (i - iStringWidth) / 2;
        }
        return 0;
    }

    /* renamed from: a */
    public static String m1676a(int i, byte b, byte b2, int i2, boolean z) {
        if (f2527m == 2) {
            i2 = 0;
        }
        f2513ag.delete(0, f2513ag.length());
        f2513ag.append(f2501V[i]).append(f2502W[b]).append(i2).append(f2503X[3]).append("");
        return f2513ag.toString();
    }

    /* renamed from: a */
    public static String m1677a(StringBuffer stringBuffer, long j) {
        long[] jArr = new long[3];
        jArr[0] = j / 100000000;
        jArr[1] = (j - (jArr[0] * 100000000)) / 10000;
        jArr[2] = (j - (jArr[0] * 100000000)) - (jArr[1] * 10000);
        stringBuffer.delete(0, stringBuffer.length());
        if (jArr[0] == 0 && jArr[1] == 0 && jArr[2] == 0) {
            stringBuffer.append("0两");
        } else {
            if (jArr[0] != 0) {
                stringBuffer.append(jArr[0]);
                stringBuffer.append("亿");
            }
            if (jArr[1] != 0) {
                stringBuffer.append(jArr[1]);
                stringBuffer.append("万");
            }
            if (jArr[2] != 0) {
                stringBuffer.append(jArr[2]);
            }
            stringBuffer.append("两");
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static short m1678a(byte b, byte b2) {
        return (short) Integer.parseInt(new StringBuffer().append("").append(f2501V[b]).append(f2502W[b2]).toString());
    }

    /* renamed from: a */
    public static void m1679a(String str) {
    }

    /* renamed from: a */
    public static void m1680a(StringBuffer stringBuffer) {
        stringBuffer.delete(0, stringBuffer.length());
    }

    /* renamed from: a */
    public static void m1681a(MIDlet mIDlet) {
        try {
            f2536v = "";
            if (f2506a == 1) {
                String appProperty = mIDlet.getAppProperty("PopularizeChannel");
                f2536v = appProperty;
                if (appProperty != null) {
                    if (f2536v.equals("mhxy002")) {
                        f2538x = true;
                    } else if (f2536v.equals("mhxy003") || f2536v.equals("mhxy081") || f2536v.equals("mhxy084")) {
                        f2480A = true;
                    } else if (f2536v.equals("mhxy011")) {
                        f2539y = true;
                    } else if (f2536v.equals("mhxy060")) {
                        f2540z = true;
                    } else if (f2536v.equals("mhxy319")) {
                        f2481B = true;
                    } else if (f2536v.equals("mhxy340") || f2536v.equals("mhxy531")) {
                        f2483D = true;
                    } else if (f2536v.equals("mhxy504")) {
                        f2482C = true;
                    }
                }
                if (mIDlet.getAppProperty("hasRideRes").trim().equals("true")) {
                    f2530p = true;
                } else {
                    f2530p = false;
                }
            } else if (f2506a == 0) {
                if (f2532r == 1) {
                    f2536v = "mhxy_common";
                } else if (f2532r == 17) {
                    f2536v = "mhxy_v3";
                } else {
                    f2536v = "mhxy_tx";
                }
                if (Byte.parseByte(mIDlet.getAppProperty("LargeClient").trim()) == 1) {
                    f2530p = true;
                } else {
                    f2530p = false;
                }
            }
            String appProperty2 = mIDlet.getAppProperty("Model");
            f2485F = appProperty2;
            if (appProperty2 == null) {
                f2485F = "";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

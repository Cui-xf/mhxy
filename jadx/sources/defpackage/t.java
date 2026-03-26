package defpackage;

import javax.microedition.lcdui.Font;
import javax.microedition.midlet.MIDlet;

/* loaded from: java版梦回西游3区251011.jar:t.class */
public final class t {
    public static byte a = 1;
    public static short b = 240;
    public static short c = 320;
    public static short d = 240;
    public static short e = 320;
    public static short f;
    public static short g;
    public static Font h;
    public static Font i;
    public static int j;
    public static int k;
    public static byte l;
    public static byte m;
    public static boolean n;
    public static boolean o;
    private static boolean ai;
    public static boolean p;
    public static byte q;
    public static byte r;
    public static byte s;
    public static String t;
    public static int u;
    public static String v;
    public static boolean w;
    public static boolean x;
    public static boolean y;
    public static boolean z;
    public static boolean A;
    public static boolean B;
    public static boolean C;
    public static boolean D;
    public static final String[] E;
    public static String F;
    public static final String[] G;
    public static final String[] H;
    public static final String[] I;
    public static final String[] J;
    public static final String[] K;
    public static final String[] L;
    public static final String[] M;
    public static final String[][] N;
    public static final String[] O;
    public static final String[] P;
    public static short[][] Q;
    public static short[][] R;
    public static final short[][] S;
    public static final short[][] T;
    public static final short[] U;
    public static char[] V;
    public static char[] W;
    public static char[] X;
    public static final String[] Y;
    public static String[] Z;
    public static String[] aa;
    public static String[] ab;
    public static String[] ac;
    public static final String[] ad;
    public static String[] ae;
    public static String[] af;
    public static StringBuffer ag;
    public static final String[] ah;

    public static void a(MIDlet mIDlet) {
        try {
            v = "";
            if (a == 1) {
                String appProperty = mIDlet.getAppProperty("PopularizeChannel");
                v = appProperty;
                if (appProperty != null) {
                    if (v.equals("mhxy002")) {
                        x = true;
                    } else if (v.equals("mhxy003") || v.equals("mhxy081") || v.equals("mhxy084")) {
                        A = true;
                    } else if (v.equals("mhxy011")) {
                        y = true;
                    } else if (v.equals("mhxy060")) {
                        z = true;
                    } else if (v.equals("mhxy319")) {
                        B = true;
                    } else if (v.equals("mhxy340") || v.equals("mhxy531")) {
                        D = true;
                    } else if (v.equals("mhxy504")) {
                        C = true;
                    }
                }
                if (mIDlet.getAppProperty("hasRideRes").trim().equals("true")) {
                    p = true;
                } else {
                    p = false;
                }
            } else if (a == 0) {
                if (r == 1) {
                    v = "mhxy_common";
                } else if (r == 17) {
                    v = "mhxy_v3";
                } else {
                    v = "mhxy_tx";
                }
                if (Byte.parseByte(mIDlet.getAppProperty("LargeClient").trim()) == 1) {
                    p = true;
                } else {
                    p = false;
                }
            }
            String appProperty2 = mIDlet.getAppProperty("Model");
            F = appProperty2;
            if (appProperty2 == null) {
                F = "";
            }
        } catch (Exception e2) {
            "".printStackTrace();
        }
    }

    public static int a(int i2, String str) {
        int iStringWidth = i.stringWidth(str);
        return i2 > iStringWidth ? (i2 - iStringWidth) / 2 : 0;
    }

    public static int a(int i2) {
        return i2 > j ? (i2 - j) / 2 : 0;
    }

    public static String a(int i2, byte b2, byte b3, int i3, boolean z2) {
        if (m == 2) {
            i3 = 0;
        }
        ag.delete(0, ag.length());
        ag.append(V[i2]).append(W[b2]).append(i3).append(X[3]).append("");
        return ag.toString();
    }

    public static void a(String str) {
    }

    public static void a(StringBuffer stringBuffer) {
        stringBuffer.delete(0, stringBuffer.length());
    }

    public static short a(byte b2, byte b3) {
        return (short) Integer.parseInt(new StringBuffer().append("").append(V[b2]).append(W[b3]).toString());
    }

    public static String a(StringBuffer stringBuffer, long j2) {
        long[] jArr = new long[3];
        jArr[0] = j2 / 100000000;
        jArr[1] = (j2 - (jArr[0] * 100000000)) / 10000;
        jArr[2] = (j2 - (jArr[0] * 100000000)) - (jArr[1] * 10000);
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

    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.String[], java.lang.String[][]] */
    /* JADX WARN: Type inference failed for: r0v70, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v72, types: [short[], short[][]] */
    static {
        Font.getFont(0, 2, 16);
        h = Font.getFont(0, 2, 0);
        Font font = Font.getFont(64, 0, 8);
        i = font;
        j = font.getHeight();
        k = i.stringWidth("宽");
        l = (byte) 2;
        m = (byte) 2;
        n = false;
        o = true;
        ai = false;
        p = true;
        q = (byte) 1;
        r = (byte) 1;
        s = (byte) 44;
        t = "v1.4.4";
        u = 4;
        v = "";
        w = false;
        x = false;
        y = false;
        z = false;
        A = false;
        B = false;
        C = false;
        D = false;
        E = new String[]{"世界频道", "区域频道", "队伍频道", "帮派频道"};
        F = "";
        int[] iArr = {158, 222};
        G = new String[]{"将军府", "方寸山", "龙宫"};
        H = new String[]{"将军府偏重物理,推荐物攻配点", "方寸山专修法术,推荐法攻配点", "龙宫善状态加强,推荐生命配点"};
        String[] strArr = {"生命", "内力", "攻击", "法攻", "防御", "冰抗", "火抗", "雷抗", "速度"};
        I = new String[]{"买东西", "卖东西", "战斗", "传送", "物品仓库", "银两仓库", "宠物仓库", "拍卖物品", "拍卖宠物", "拍卖场", "拍卖详情", "技能学习", "任务", "出售宠物", "买入宠物", "兑换", "每日任务", "角色洗点", "宠物洗点", "住宅", "房屋管理", "退出住宅", "家具管理", "退出房屋", "帮会建立", "设施买卖", "帮派公告", "帮派管理", "宝库管理", "外交", "打孔", "开孔", "提升军力", "战争捷报", "求爱宣言", "申请结婚", "申请离婚", "新人拜堂", "回答问题", "锻造", "抢答问题", "区域掉宝(查看)", "风云榜(查看)", "领取奖品", "装备升星", "收回", "装备洗炼", "装备附魔", "攻城竞标", "抽奖"};
        String[] strArr2 = {"收回", "进入", "查看", "升级", "掉落", "Buff", "兑换"};
        J = new String[]{"未接受", "未完成", "完成"};
        K = new String[]{"物理", "冰", "火", "雷"};
        L = new String[]{"物品行囊", "喂养宠物", "存入仓库", "宠物学习", "物品交易", "物品拍卖", "战斗使用", "装备物品", "金豆拍卖物品", "装备宠物物品", "装备打孔", "宝石镶嵌", "喂养天使", "增加好感度", "宠物技能扩容", "", "装备洗炼", "装备附魔", "捐献宝物", "物品合成", "物品选择", "物品选择", "物品选择"};
        M = new String[]{"头 盔", "护身符", "衣 服", "武 器", "鞋 子", "戒 指", "婚 饰", "法 宝", "没有装备", "没有装备"};
        String[] strArr3 = {"人物", "任务", "道具", "交流", "住宅", "帮派", "设置", "退出"};
        N = new String[]{new String[]{"jm", "jf"}, new String[]{"fm", "ff"}, new String[]{"lm", "lf"}};
        int[] iArr2 = {3123503, 14799407, 12916232, 5525841};
        O = new String[]{"LIGHT", "FIRE", "COLD", "NONE"};
        P = new String[]{"WEAPON", "HEAD", "BOSOM", "FOOT", "DECORATION", "BOOK", "STUFF", "CHARGE"};
        Q = null;
        R = null;
        S = new short[]{new short[]{92, 188}, new short[]{121, 166}, new short[]{150, 144}, new short[]{63, 166}, new short[]{92, 144}, new short[]{121, 122}};
        T = new short[]{new short[]{53, 115}, new short[]{82, 93}, new short[]{111, 71}, new short[]{24, 93}, new short[]{53, 71}, new short[]{82, 49}};
        short[] sArr = {-1, 291, 292, 293, 294, 295, 296};
        U = new short[]{-1, 191, 192, 193, 194, 195, 196};
        short[] sArr2 = {6, 5, 14, 15, 17, 18, 19};
        short[] sArr3 = {8, 9, 12, 13};
        short[] sArr4 = {0, 1, 2, 4, 7, 20, 21, 22, 23, 24, 35};
        short[] sArr5 = {10, 11, 16, 28, 29, 25, 26, 27};
        short[] sArr6 = {30, 31, 32, 33, 34, 36, 37};
        short[] sArr7 = {44, 45, 46, 47};
        short[] sArr8 = {48, 49};
        V = new char[]{'1', '2', '3'};
        W = new char[]{'0', '1'};
        X = new char[]{'0', '0', '1', '1', '4'};
        Y = new String[]{"异常离线", "战斗、交易状态不能进行其他操作", "非法操作", "您没有操作权限", "操作成功", "操作失败"};
        Z = new String[]{"建立帮派", "响应建帮", "发布招募", "申请入帮", "进入帮派", "退出帮派", "解散帮派"};
        aa = new String[]{"建帮条件：\t申请人40级以上，未加入帮派，需先缴纳2千万申请费，申请后48小时内必须有25个40级以上的玩家响应才算建立成功，否则失败并没收10%申请费。", "打开待成立帮派的列表，响应你想支持成立的帮派。", "要壮大帮派，就要招募更多的人才，发布招募的金额越高越靠前显示（只有帮派官员有权发布招募）。", "打开帮派招募列表，选择你想加入的帮派。", "进入帮派/国家领地，也可以从主菜单进入。", "退出帮派，重新变成无派人士。", "解散自己创建的帮派（只能帮主有权解散）。"};
        ab = new String[]{"更改宗旨", "接受申请", "邀请加入", "任免开除", "查看帮派", "帮派升级"};
        ac = new String[]{"帮主更改帮派的宗旨。", "接受申请加入本帮派的玩家", "邀请指定玩家加入本帮。", "职务任免，开除成员。", "查看帮会的基本信息。", "帮派升级"};
        String[] strArr4 = {"查看公告", "改写公告"};
        String[] strArr5 = {"查看帮派的公告", "改写帮派的公告"};
        ad = new String[]{"查看宝库", "捐献物品", "捐献银两", "取出银两", "捐献经验", "贡献物资", "发布任务（资源）", "发布任务（金豆）", "宝库配置", "提升人气", "宝库扩容"};
        ae = new String[]{"银两", "金锭", "银锭", "铜锭", "铁锭"};
        af = new String[]{"物品掉率", "银两奖励", "经验加成"};
        ag = new StringBuffer();
        new short[1][0] = 0;
        short[] sArr9 = {0, 1, 2, 4, 7, 35, 6, 5, 14, 15, 17, 18, 19, 44, 8, 9, 12, 13, 30, 31, 36, 32, 33, 34, 37, 3, 10, 11, 16, 28};
        short[] sArr10 = {29, 45, 47, 46, 25, 26, 27, 48, 50, 49, 51, 53, 52, 20, 21, 22, 23, 24, 54, 55, 56, 57, 63, 61, 62, 59, 60, 58, 70, 71};
        short[] sArr11 = {72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 68, 69};
        new StringBuffer();
        ah = new String[]{"将以短信方式为您开通超Q服务", "非中国移动用户请登录超Q官网（sqq.3g.qq.com）开通"};
    }
}

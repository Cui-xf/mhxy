package com.cc;

import javax.microedition.lcdui.Font;
import javax.microedition.midlet.MIDlet;

/**
 * 全局配置与工具类（原名混淆）
 * 职责：
 * 1. 集中存储所有 UI 文本常量和游戏规则字符串
 * 2. 根据 JAD 渠道号控制渠道差异化特性开关
 * 3. 提供文本居中、银两格式化、资源路径构建等通用工具函数
 * 4. 游戏启动时通过 a(MIDlet) 完成运行时参数注入
 * 注：字段/方法均为混淆命名，J2ME 平台常见优化手段
 */
//public final class t_1 {
public final class GlobalConfig {
    /**
     * 客户端类型：1=正式渠道包，0=内部/测试包
     */
    public static byte channel = 1;
    /**
     * 默认屏幕宽度（240px）
     */
    public static short defaultWidth = 240;
    /**
     * 默认屏幕高度（320px）
     */
    public static short defaultHigh = 320;
    /**
     * 实际屏幕宽度
     */
    public static short realWidth = 240;
    /**
     * 实际屏幕高度
     */
    public static short realHigh = 320;
    /**
     * 屏幕尺寸辅助参数
     */
    public static short f;
    /**
     * 屏幕尺寸辅助参数
     */
    public static short g;
    /**
     * 普通字体
     */
    public static Font h;
    /**
     * 小字体（用于字符串宽度计算）
     */
    public static Font i;
    /**
     * 小字体行高（像素）
     */
    public static int j;
    /**
     * 单个汉字像素宽度
     */
    public static int k;
    /**
     * 行距/布局参数（初始2）
     */
    public static byte l;
    /**
     * 字体模式（初始2，为2时某些显示逻辑有特殊处理）
     */
    public static byte m;
    /**
     * 布尔标志（初始false）
     */
    public static boolean n;
    /**
     * 布尔标志（初始true）
     */
    public static boolean o;
    /**
     * 私有布尔标志
     */
    private static boolean ai;
    /**
     * 是否包含坐骑资源（从 JAD hasRideRes 或 LargeClient 属性读取）
     */
    public static boolean hasRideRes;
    /**
     * 平台标识（1=默认）
     */
    public static byte q;
    /**
     * 渠道子类型（1=common, 17=v3, 其他=tx）
     */
    public static byte r;
    /**
     * 服务器编号（初始44）
     */
    public static byte s;
    /**
     * 版本号字符串，如 "v1.4.4"
     */
    public static String t;
    /**
     * 版本数字标识
     */
    public static int u;
    /**
     * 渠道字符串，如 "mhxy002"、"mhxy_common"
     */
    public static String PopularizeChannel;
    /**
     * 通用开关
     */
    public static boolean w;
    /**
     * 渠道 mhxy002 特性开关
     */
    public static boolean x;
    /**
     * 渠道 mhxy011 特性开关
     */
    public static boolean y;
    /**
     * 渠道 mhxy060 特性开关
     */
    public static boolean z;
    /**
     * 渠道 mhxy003/mhxy081/mhxy084 特性开关
     */
    public static boolean A;
    /**
     * 渠道 mhxy319 特性开关
     */
    public static boolean B;
    /**
     * 渠道 mhxy504 特性开关
     */
    public static boolean C;
    /**
     * 渠道 mhxy340/mhxy531 特性开关
     */
    public static boolean D;
    /**
     * 频道名称：世界频道、区域频道、队伍频道、帮派频道
     */
    public static final String[] E;
    /**
     * 设备型号（从 JAD Model 属性读取）
     */
    public static String F;
    /**
     * 三大门派名称：将军府、方寸山、龙宫
     */
    public static final String[] G;
    /**
     * 三大门派描述文字
     */
    public static final String[] H;
    /**
     * NPC 功能列表（买卖、战斗、传送、仓库、拍卖等约50项）
     */
    public static final String[] I;
    /**
     * 任务状态：未接受、未完成、完成
     */
    public static final String[] J;
    /**
     * 伤害类型：物理、冰、火、雷
     */
    public static final String[] K;
    /**
     * 物品使用方式列表（行囊、喂养、仓库、交易等）
     */
    public static final String[] L;
    /**
     * 装备部位名称：头盔、护身符、衣服、武器、鞋子、戒指、婚饰、法宝
     */
    public static final String[] M;
    /**
     * 角色外观资源映射（二维数组，jm/jf/fm/ff/lm/lf）
     */
    public static final String[][] N;
    /**
     * 光系属性标识：LIGHT、FIRE、COLD、NONE
     */
    public static final String[] O;
    /**
     * 装备类型标识：WEAPON、HEAD、BOSOM、FOOT 等
     */
    public static final String[] P;
    /**
     * 运行时动态坐标数组1（初始null）
     */
    public static short[][] Q;
    /**
     * 运行时动态坐标数组2（初始null）
     */
    public static short[][] R;
    /**
     * 战斗场景坐标组1（6组xy坐标）
     */
    public static final short[][] S;
    /**
     * 战斗场景坐标组2（6组xy坐标）
     */
    public static final short[][] T;
    /**
     * 资源/图像索引数组
     */
    public static final short[] U;
    /**
     * 数字字符映射：{'1','2','3'}，用于资源路径构建
     */
    public static char[] V;
    /**
     * 数字字符映射：{'0','1'}，用于资源路径构建
     */
    public static char[] W;
    /**
     * 参数字符映射：{'0','0','1','1','4'}，用于资源路径构建
     */
    public static char[] X;
    /**
     * 系统提示文本：异常离线、非法操作、操作成功等
     */
    public static final String[] Y;
    /**
     * 帮派操作菜单：建立帮派、响应建帮、发布招募等
     */
    public static String[] Z;
    /**
     * 帮派操作说明文字
     */
    public static String[] aa;
    /**
     * 帮派管理菜单：更改宗旨、接受申请、邀请加入等
     */
    public static String[] ab;
    /**
     * 帮派管理操作说明
     */
    public static String[] ac;
    /**
     * 宝库操作菜单（11项）
     */
    public static final String[] ad;
    /**
     * 货币类型：银两、金锭、银锭、铜锭、铁锭
     */
    public static String[] ae;
    /**
     * 掉落/奖励类型：物品掉率、银两奖励、经验加成
     */
    public static String[] af;
    /**
     * 全局复用的字符串缓冲区，避免 J2ME 环境下频繁创建对象
     */
    public static StringBuffer ag;
    /**
     * 超Q服务提示文字
     */
    public static final String[] ah;

    /**
     * 运行时初始化入口，在游戏启动时调用。
     * 从 JAD 属性读取渠道号（PopularizeChannel）、坐骑资源标志（hasRideRes/LargeClient）、
     * 设备型号（Model），并设置对应的渠道特性布尔标志（x/y/z/A/B/C/D）。
     */
    public static void init(MIDlet midlet) {
        try {
            PopularizeChannel = "";
            if (channel == 1) {
                if ((PopularizeChannel = midlet.getAppProperty("PopularizeChannel")) != null) {
                    if (PopularizeChannel.equals("mhxy002")) {
                        x = true;
                    } else if (!PopularizeChannel.equals("mhxy003") &&
                            !PopularizeChannel.equals("mhxy081") && !PopularizeChannel.equals("mhxy084")) {
                        if (PopularizeChannel.equals("mhxy011")) {
                            y = true;
                        } else if (PopularizeChannel.equals("mhxy060")) {
                            z = true;
                        } else if (PopularizeChannel.equals("mhxy319")) {
                            B = true;
                        } else if (!PopularizeChannel.equals("mhxy340") && !PopularizeChannel.equals("mhxy531")) {
                            if (PopularizeChannel.equals("mhxy504")) {
                                C = true;
                            }
                        } else {
                            D = true;
                        }
                    } else {
                        A = true;
                    }
                }

                hasRideRes = midlet.getAppProperty("hasRideRes").trim().equals("true");
            } else if (channel == 0) {
                if (r == 1) {
                    PopularizeChannel = "mhxy_common";
                } else if (r == 17) {
                    PopularizeChannel = "mhxy_v3";
                } else {
                    PopularizeChannel = "mhxy_tx";
                }

                hasRideRes = Byte.parseByte(midlet.getAppProperty("LargeClient").trim()) == 1;
            }

            if ((F = midlet.getAppProperty("Model")) == null) {
                F = "";
            }

        } catch (Exception var2) {
            ((Throwable) var2).printStackTrace();
        }
    }

    /**
     * 计算字符串在给定宽度内水平居中的 x 偏移量。
     *
     * @param var0 容器宽度
     * @param var1 待显示字符串
     * @return 居中所需的左侧偏移像素
     */
    public static int a(int var0, String var1) {
        int var2 = i.stringWidth(var1);
        return var0 > var2 ? (var0 - var2) / 2 : 0;
    }

    /**
     * 计算单个字符（宽度为 j）在给定宽度内水平居中的 x 偏移量。
     *
     * @param var0 容器宽度
     * @return 居中所需的左侧偏移像素
     */
    public static int a(int var0) {
        return var0 > j ? (var0 - j) / 2 : 0;
    }

    /**
     * 构建资源标识字符串，格式：{V[var0]}{W[var1]}{var3}{X[3]}
     * 当字体模式 m==2 时，强制将 var3 置为 0。
     * 复用全局 ag 缓冲区以减少对象分配。
     */
    public static String a(int var0, byte var1, byte var2, int var3, boolean var4) {
        if (m == 2) {
            var3 = 0;
        }

        ag.delete(0, ag.length());
        ag.append(V[var0]).append(W[var1]).append(var3).append(X[3]).append("");
        return ag.toString();
    }

    /**
     * 占位空方法，功能已移除或待实现
     */
    public static void printStr(String s) {
        System.out.println("printStr:" + s);
    }

    /**
     * 清空传入的 StringBuffer
     */
    public static void clearStr(StringBuffer var0) {
        var0.delete(0, var0.length());
    }

    /**
     * 将 V[var0] 和 W[var1] 拼接为字符串后解析为 short，用于编码转换
     */
    public static short a(byte var0, byte var1) {
        return (short) Integer.parseInt("" + V[var0] + W[var1]);
    }

    /**
     * 将银两数值格式化为中文单位字符串。
     * 规则：亿（÷1亿）、万（÷1万）、个位，全0时显示"0两"，结尾统一追加"两"。
     * 示例：123456789 → "1亿2345万6789两"
     *
     * @param var0 复用的 StringBuffer
     * @param var1 银两数量
     * @return 格式化后的字符串
     */
    public static String a(StringBuffer var0, long var1) {
        long[] var3;
        (var3 = new long[3])[0] = var1 / 100000000L;
        var3[1] = (var1 - var3[0] * 100000000L) / 10000L;
        var3[2] = var1 - var3[0] * 100000000L - var3[1] * 10000L;
        var0.delete(0, var0.length());
        if (var3[0] == 0L && var3[1] == 0L && var3[2] == 0L) {
            var0.append("0两");
        } else {
            if (var3[0] != 0L) {
                var0.append(var3[0]);
                var0.append("亿");
            }

            if (var3[1] != 0L) {
                var0.append(var3[1]);
                var0.append("万");
            }

            if (var3[2] != 0L) {
                var0.append(var3[2]);
            }

            var0.append("两");
        }

        return var0.toString();
    }

    static {
        Font.getFont(0, 2, 16);
        h = Font.getFont(0, 2, 0);
        j = (i = Font.getFont(64, 0, 8)).getHeight();
        k = i.stringWidth("宽");
        l = 2;
        m = 2;
        n = false;
        o = true;
        ai = false;
        hasRideRes = true;
        q = 1;
        r = 1;
        s = 44;
        t = "v1.4.4";
        u = 4;
        PopularizeChannel = "";
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
        int[] var10000 = new int[]{158, 222};
        G = new String[]{"将军府", "方寸山", "龙宫"};
        H = new String[]{"将军府偏重物理,推荐物攻配点", "方寸山专修法术,推荐法攻配点", "龙宫善状态加强,推荐生命配点"};
        String[] var0 = new String[]{"生命", "内力", "攻击", "法攻", "防御", "冰抗", "火抗", "雷抗", "速度"};
        I = new String[]{"买东西", "卖东西", "战斗", "传送", "物品仓库", "银两仓库", "宠物仓库", "拍卖物品", "拍卖宠物", "拍卖场", "拍卖详情", "技能学习", "任务", "出售宠物", "买入宠物", "兑换", "每日任务", "角色洗点", "宠物洗点", "住宅", "房屋管理", "退出住宅", "家具管理", "退出房屋", "帮会建立", "设施买卖", "帮派公告", "帮派管理", "宝库管理", "外交", "打孔", "开孔", "提升军力", "战争捷报", "求爱宣言", "申请结婚", "申请离婚", "新人拜堂", "回答问题", "锻造", "抢答问题", "区域掉宝(查看)", "风云榜(查看)", "领取奖品", "装备升星", "收回", "装备洗炼", "装备附魔", "攻城竞标", "抽奖"};
        var0 = new String[]{"收回", "进入", "查看", "升级", "掉落", "Buff", "兑换"};
        J = new String[]{"未接受", "未完成", "完成"};
        K = new String[]{"物理", "冰", "火", "雷"};
        L = new String[]{"物品行囊", "喂养宠物", "存入仓库", "宠物学习", "物品交易", "物品拍卖", "战斗使用", "装备物品", "金豆拍卖物品", "装备宠物物品", "装备打孔", "宝石镶嵌", "喂养天使", "增加好感度", "宠物技能扩容", "", "装备洗炼", "装备附魔", "捐献宝物", "物品合成", "物品选择", "物品选择", "物品选择"};
        M = new String[]{"头 盔", "护身符", "衣 服", "武 器", "鞋 子", "戒 指", "婚 饰", "法 宝", "没有装备", "没有装备"};
        var0 = new String[]{"人物", "任务", "道具", "交流", "住宅", "帮派", "设置", "退出"};
        N = new String[][]{{"jm", "jf"}, {"fm", "ff"}, {"lm", "lf"}};
        int[] var3 = new int[]{3123503, 14799407, 12916232, 5525841};
        O = new String[]{"LIGHT", "FIRE", "COLD", "NONE"};
        P = new String[]{"WEAPON", "HEAD", "BOSOM", "FOOT", "DECORATION", "BOOK", "STUFF", "CHARGE"};
        Q = null;
        R = null;
        S = new short[][]{{92, 188}, {121, 166}, {150, 144}, {63, 166}, {92, 144}, {121, 122}};
        T = new short[][]{{53, 115}, {82, 93}, {111, 71}, {24, 93}, {53, 71}, {82, 49}};
        short[] var4 = new short[]{-1, 291, 292, 293, 294, 295, 296};
        U = new short[]{-1, 191, 192, 193, 194, 195, 196};
        var4 = new short[]{6, 5, 14, 15, 17, 18, 19};
        var4 = new short[]{8, 9, 12, 13};
        var4 = new short[]{0, 1, 2, 4, 7, 20, 21, 22, 23, 24, 35};
        var4 = new short[]{10, 11, 16, 28, 29, 25, 26, 27};
        var4 = new short[]{30, 31, 32, 33, 34, 36, 37};
        var4 = new short[]{44, 45, 46, 47};
        var4 = new short[]{48, 49};
        V = new char[]{'1', '2', '3'};
        W = new char[]{'0', '1'};
        X = new char[]{'0', '0', '1', '1', '4'};
        Y = new String[]{"异常离线", "战斗、交易状态不能进行其他操作", "非法操作", "您没有操作权限", "操作成功", "操作失败"};
        Z = new String[]{"建立帮派", "响应建帮", "发布招募", "申请入帮", "进入帮派", "退出帮派", "解散帮派"};
        aa = new String[]{"建帮条件：\t申请人40级以上，未加入帮派，需先缴纳2千万申请费，申请后48小时内必须有25个40级以上的玩家响应才算建立成功，否则失败并没收10%申请费。", "打开待成立帮派的列表，响应你想支持成立的帮派。", "要壮大帮派，就要招募更多的人才，发布招募的金额越高越靠前显示（只有帮派官员有权发布招募）。", "打开帮派招募列表，选择你想加入的帮派。", "进入帮派/国家领地，也可以从主菜单进入。", "退出帮派，重新变成无派人士。", "解散自己创建的帮派（只能帮主有权解散）。"};
        ab = new String[]{"更改宗旨", "接受申请", "邀请加入", "任免开除", "查看帮派", "帮派升级"};
        ac = new String[]{"帮主更改帮派的宗旨。", "接受申请加入本帮派的玩家", "邀请指定玩家加入本帮。", "职务任免，开除成员。", "查看帮会的基本信息。", "帮派升级"};
        String[] var12 = new String[]{"查看公告", "改写公告"};
        var12 = new String[]{"查看帮派的公告", "改写帮派的公告"};
        ad = new String[]{"查看宝库", "捐献物品", "捐献银两", "取出银两", "捐献经验", "贡献物资", "发布任务（资源）", "发布任务（金豆）", "宝库配置", "提升人气", "宝库扩容"};
        ae = new String[]{"银两", "金锭", "银锭", "铜锭", "铁锭"};
        af = new String[]{"物品掉率", "银两奖励", "经验加成"};
        ag = new StringBuffer();
        short[] var14 = new short[]{0};
        var14 = new short[]{0, 1, 2, 4, 7, 35, 6, 5, 14, 15, 17, 18, 19, 44, 8, 9, 12, 13, 30, 31, 36, 32, 33, 34, 37, 3, 10, 11, 16, 28};
        var14 = new short[]{29, 45, 47, 46, 25, 26, 27, 48, 50, 49, 51, 53, 52, 20, 21, 22, 23, 24, 54, 55, 56, 57, 63, 61, 62, 59, 60, 58, 70, 71};
        var14 = new short[]{72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 68, 69};
        new StringBuffer();
        ah = new String[]{"将以短信方式为您开通超Q服务", "非中国移动用户请登录超Q官网（sqq.3g.qq.com）开通"};
    }
}

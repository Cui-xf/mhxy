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
    public static short gameX;
    /**
     * 屏幕尺寸辅助参数
     */
    public static short gameY;

    /**
     * 普通字体
     */
    public static Font font1 = Font.getFont(0, 2, 0);
    /**
     * 小字体（用于字符串宽度计算）
     */
    public static Font font2 = Font.getFont(64, 0, 8);
    /**
     * 小字体行高（像素）
     */
    public static int font2_h = font2.getHeight();
    /**
     * 单个汉字像素宽度
     */
    public static int font2_w = font2.stringWidth("宽");
    /**
     * 行距/布局参数（初始2）
     */
    public static byte hangju = 2;
    /**
     * 字体模式（初始2，为2时某些显示逻辑有特殊处理）
     */
    public static byte ziTiMoShi = 2;

    /**
     * 布尔标志（初始true）
     */
    public static boolean supportTouch = true;

    /**
     * 是否包含坐骑资源（从 JAD hasRideRes 或 LargeClient 属性读取）
     */
    public static boolean hasRideRes = true;

    /**
     * 版本号字符串，如 "v1.4.4"
     */
    public static String appVersion = "v1.4.4";
    /**
     * 版本数字标识
     */
    public static int shuZiBiaoShi = 4;
    /**
     * 渠道字符串，如 "mhxy002"、"mhxy_common"
     */
    public static String PopularizeChannel = "egege";
    /**
     * 通用开关
     */
    public static boolean logined = false;
    /**
     * 频道名称：世界频道、区域频道、队伍频道、帮派频道
     */
    public static final String[] liaoTianPinDao = new String[]{"世界频道", "区域频道", "队伍频道", "帮派频道"};
    /**
     * 设备型号（从 JAD Model 属性读取）
     */
    public static String model = "touch";
    /**
     * 三大门派名称：将军府、方寸山、龙宫
     */
    public static final String[] manPaiName = new String[]{"将军府", "方寸山", "龙宫"};
    /**
     * 三大门派描述文字
     */
    public static final String[] menPaiMiaoShu = new String[]{"将军府偏重物理,推荐物攻配点", "方寸山专修法术,推荐法攻配点", "龙宫善状态加强,推荐生命配点"};
    /**
     * NPC 功能列表（买卖、战斗、传送、仓库、拍卖等约50项）
     */
    public static final String[] NpcGongNeng = new String[]{"买东西", "卖东西", "战斗", "传送", "物品仓库", "银两仓库", "宠物仓库", "拍卖物品", "拍卖宠物", "拍卖场", "拍卖详情", "技能学习", "任务", "出售宠物", "买入宠物", "兑换", "每日任务", "角色洗点", "宠物洗点", "住宅", "房屋管理", "退出住宅", "家具管理", "退出房屋", "帮会建立", "设施买卖", "帮派公告", "帮派管理", "宝库管理", "外交", "打孔", "开孔", "提升军力", "战争捷报", "求爱宣言", "申请结婚", "申请离婚", "新人拜堂", "回答问题", "锻造", "抢答问题", "区域掉宝(查看)", "风云榜(查看)", "领取奖品", "装备升星", "收回", "装备洗炼", "装备附魔", "攻城竞标", "抽奖"};
    /**
     * 任务状态：未接受、未完成、完成
     */
    public static final String[] renWuZhuangTai = new String[]{"未接受", "未完成", "完成"};
    /**
     * 伤害类型：物理、冰、火、雷
     */
    public static final String[] ShangHaiLeiXing = new String[]{"物理", "冰", "火", "雷"};
    /**
     * 物品使用方式列表（行囊、喂养、仓库、交易等）
     */
    public static final String[] ShiYongFangShi = new String[]{"物品行囊", "喂养宠物", "存入仓库", "宠物学习", "物品交易", "物品拍卖", "战斗使用", "装备物品", "金豆拍卖物品", "装备宠物物品", "装备打孔", "宝石镶嵌", "喂养天使", "增加好感度", "宠物技能扩容", "", "装备洗炼", "装备附魔", "捐献宝物", "物品合成", "物品选择", "物品选择", "物品选择"};
    /**
     * 装备部位名称：头盔、护身符、衣服、武器、鞋子、戒指、婚饰、法宝
     */
    public static final String[] ZhuangBeiBuWei = new String[]{"头 盔", "护身符", "衣 服", "武 器", "鞋 子", "戒 指", "婚 饰", "法 宝", "没有装备", "没有装备"};
    /**
     * 角色外观资源映射（二维数组，jm/jf/fm/ff/lm/lf）
     */
    public static final String[][] JueSeWaiGuanName = new String[][]{{"jm", "jf"}, {"fm", "ff"}, {"lm", "lf"}};
    /**
     * 光系属性标识：LIGHT、FIRE、COLD、NONE
     */
    public static final String[] LightTag = new String[]{"LIGHT", "FIRE", "COLD", "NONE"};
    /**
     * 装备类型标识：WEAPON、HEAD、BOSOM、FOOT 等
     */
    public static final String[] ZhuangBeiLeiXing = new String[]{"WEAPON", "HEAD", "BOSOM", "FOOT", "DECORATION", "BOOK", "STUFF", "CHARGE"};
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
    public static final short[][] ZhanDouZuoBiao1 = new short[][]{{92, 188}, {121, 166}, {150, 144}, {63, 166}, {92, 144}, {121, 122}};
    /**
     * 战斗场景坐标组2（6组xy坐标）
     */
    public static final short[][] ZhanDouZuoBiao2 = new short[][]{{53, 115}, {82, 93}, {111, 71}, {24, 93}, {53, 71}, {82, 49}};
    /**
     * 资源/图像索引数组
     */
    public static final short[] U = new short[]{-1, 191, 192, 193, 194, 195, 196};
    /**
     * 角色性别资源id
     */
    public static char[] roleGenderResIds = new char[]{'1', '2', '3'};
    /**
     * 数字字符映射：{'0','1'}，用于资源路径构建
     */
    public static char[] roleJobResIds = new char[]{'0', '1'};
    /**
     * 参数字符映射：{'0','0','1','1','4'}，用于资源路径构建
     */
    public static char[] X = new char[]{'0', '0', '1', '1', '4'};
    /**
     * 系统提示文本：异常离线、非法操作、操作成功等
     */
    public static final String[] YiChangTiShi = new String[]{"异常离线", "战斗、交易状态不能进行其他操作", "非法操作", "您没有操作权限", "操作成功", "操作失败"};
    /**
     * 帮派操作菜单：建立帮派、响应建帮、发布招募等
     */
    public static String[] BangPaiCaoZuo = new String[]{"建立帮派", "响应建帮", "发布招募", "申请入帮", "进入帮派", "退出帮派", "解散帮派"};
    /**
     * 帮派操作说明文字
     */
    public static String[] BangPaiShuoMing = new String[]{"建帮条件：\t申请人40级以上，未加入帮派，需先缴纳2千万申请费，申请后48小时内必须有25个40级以上的玩家响应才算建立成功，否则失败并没收10%申请费。", "打开待成立帮派的列表，响应你想支持成立的帮派。", "要壮大帮派，就要招募更多的人才，发布招募的金额越高越靠前显示（只有帮派官员有权发布招募）。", "打开帮派招募列表，选择你想加入的帮派。", "进入帮派/国家领地，也可以从主菜单进入。", "退出帮派，重新变成无派人士。", "解散自己创建的帮派（只能帮主有权解散）。"};
    /**
     * 帮派管理菜单：更改宗旨、接受申请、邀请加入等
     */
    public static String[] BangPaiGuanLi = new String[]{"更改宗旨", "接受申请", "邀请加入", "任免开除", "查看帮派", "帮派升级"};
    /**
     * 帮派管理操作说明
     */
    public static String[] BangPaiGuanLiCaoZuo = new String[]{"帮主更改帮派的宗旨。", "接受申请加入本帮派的玩家", "邀请指定玩家加入本帮。", "职务任免，开除成员。", "查看帮会的基本信息。", "帮派升级"};
    /**
     * 宝库操作菜单（11项）
     */
    public static final String[] BaoKuCaoZuo = new String[]{"查看宝库", "捐献物品", "捐献银两", "取出银两", "捐献经验", "贡献物资", "发布任务（资源）", "发布任务（金豆）", "宝库配置", "提升人气", "宝库扩容"};
    /**
     * 货币类型：银两、金锭、银锭、铜锭、铁锭
     */
    public static String[] HuoBiType = new String[]{"银两", "金锭", "银锭", "铜锭", "铁锭"};
    /**
     * 掉落/奖励类型：物品掉率、银两奖励、经验加成
     */
    public static String[] JiangLiType = new String[]{"物品掉率", "银两奖励", "经验加成"};
    /**
     * 全局复用的字符串缓冲区，避免 J2ME 环境下频繁创建对象
     */
    public static StringBuffer sbTemp = new StringBuffer();
    /**
     * 超Q服务提示文字
     */
    public static final String[] ChaoQ = new String[]{"将以短信方式为您开通超Q服务", "非中国移动用户请登录超Q官网（sqq.3g.qq.com）开通"};

    /**
     * 运行时初始化入口，在游戏启动时调用。
     * 从 JAD 属性读取渠道号（PopularizeChannel）、坐骑资源标志（hasRideRes/LargeClient）、
     * 设备型号（Model），并设置对应的渠道特性布尔标志（x/y/z/A/B/C/D）。
     */
    public static void init(MIDlet midlet) {
        if (channel == 1) {
            hasRideRes = midlet.getAppProperty("hasRideRes").trim().equals("true");
        }
    }

    /**
     * 计算字符串在给定宽度内水平居中的 x 偏移量。
     *
     * @param w 容器宽度
     * @param str 待显示字符串
     * @return 居中所需的左侧偏移像素
     */
    public static int getSpjzPx(int w, String str) {
        int t = font2.stringWidth(str);
        return w > t ? (w - t) / 2 : 0;
    }

    /**
     * 基于高度计算垂直居中
     */
    public static int getCzjz(int h) {
        return h > font2_h ? (h - font2_h) / 2 : 0;
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
        return (short) Integer.parseInt("" + roleGenderResIds[var0] + roleJobResIds[var1]);
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
    public static String yinLiangFormat(StringBuffer var0, long var1) {
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

}

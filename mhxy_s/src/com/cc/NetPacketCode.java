package com.cc;

/**
 * 网络数据包常量
 */
public class NetPacketCode {
    //server
    //多包容器（主包，内含多个子包，逐一递归处理）
    public static final short MultiPackContainer = 8192;
    //登录失败（含异常码和异常消息）
    public static final short LoginFail = 8193;
    //登录成功（返回账号和token）
    public static final short LoginSuccess = 8194;
    //角色列表（返回当前账号下所有角色信息）
    public static final short RoleList = 8195;
    //背包物品数据（角色选择后返回，初始化背包列表 GlobalStatus.p[]）
    public static final short Inventory = 8197;
    //地图动态对象列表（场景中可交互的地图对象 az_1[]）
    public static final short MapObjects = 8198;
    //角色移动/位置数据（更新角色坐标及移动路径）
    public static final short RoleMove = 8199;
    //装备数据（初始化装备栏数据）
    public static final short Equipment = 8200;
    //装备槽/第二装备数据（初始化角色装备槽）
    public static final short EquipmentSlot = 8201;
    //宠物详细数据（宠物属性、技能等完整信息）
    public static final short PetDetail = 8202;
    //技能数据（角色技能列表，含id/名称/等级/属性）
    public static final short SkillList = 8203;
    //外观/时装数据（角色装扮配置，oo/op/oq等槽位）
    public static final short Appearance = 8210;
    //宠物列表（角色已拥有的所有宠物列表）
    public static final short PetList = 8222;
    //任务数据（进行中/可接取的任务列表）
    public static final short QuestList = 8223;
    //次要外观数据（第二套外观配置 ou/ov/ow等槽位）
    public static final short AppearanceAlt = 8244;
    //资源包数据（UI/资源压缩包，gzip解压后存入缓存 rk）
    public static final short ResourcePack = 8245;
    //战斗状态标志（byte，存入 GlobalStatus.z）
    public static final short FightFlag = 8247;
    //状态标志A（byte，存入 GlobalStatus.A，刷新UI）
    public static final short StatusFlagA = 8248;
    //状态标志B（byte，存入 GlobalStatus.B，刷新UI）
    public static final short StatusFlagB = 8249;
    //状态标志D（byte，存入 GlobalStatus.D，刷新UI）
    public static final short StatusFlagD = 8251;
    //加载地图（地图名称 + 帧数据 + 跳过附加资源）
    public static final short LoadMap = 8260;
    //服务器公告/提示（存入 GlobalStatus.l(类型) + GlobalStatus.k(内容)）
    public static final short ServerNotice = 8286;
    //充值/功能开关状态（jv/jw布尔开关，jx/jy字节状态）
    public static final short PaymentStatus = 8722;
    //服务器配置（界面颜色、loading文字、服务器名称、公告等）
    public static final short ServerConfig = 8729;
    //活动/节日事件列表（ag_1对象，含多个 be_1 活动条目）
    public static final short ActivityList = 8972;

    //client
    //登录
    public static final short Login = 6400;
    //发送角色选择
    public static final short SelectRole = 4250;
    //服务端控制在触发一次角色选择？
    public static final short SelectRole_2 = 4251;
    //请求下发服务端配置？
    public static final short ServerConfigRequest = 4641;
}

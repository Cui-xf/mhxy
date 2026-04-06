package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Vector;

//public final class bGlobalConfig {

/**
 * 全局游戏状态仓库：存储从服务器数据包解析出的所有角色、背包、装备、宠物、技能、外观、任务等运行时数据。
 * 所有字段均为 static，供 NetworkPacketProcessors、UISceneController、MainCanvas 等全局访问。
 */
public final class GlobalStatus {

    // ==================== 账号认证 ====================
    /**
     * 服务器配置包(8729)是否已成功解析
     */
    public static boolean serverConfigSuccess = false;
    /**
     * 登录账号名
     */
    public static String zhangHao;
    /**
     * 登录令牌备份/第一步令牌
     */
    public static String token_1;
    /**
     * 当前会话令牌
     */
    public static String token;
    /**
     * 上次同步时间戳
     */
    public static long lastSyncTime;
    /**
     * 未知 long 类型时间或标志
     */
    public static long f;
    /**
     * 未知 boolean 标志
     */
    public static boolean g;
    /**
     * 未知 byte 标志
     */
    public static byte h;
    /**
     * 坐骑/场景状态标志，初始=-1
     */
    public static byte i_1 = -1;
    /**
     * 坐骑/场景状态标志2，与 i_1 配对，初始=-1
     */
    public static byte j = -1;
    /**
     * 未知 String
     */
    public static String k;
    /**
     * 未知 byte
     */
    public static byte l;

    // ==================== 当前角色基础信息 ====================
    /**
     * 当前角色 ID
     */
    public static String roleId;
    /**
     * 商城公告/必看文字内容（来自服务器配置包8729，scene=商城时展示）
     */
    public static String mallTips;

    // ==================== 场景对象数组 ====================
    /**
     * bl 类型对象数组（背包物品/地图场景对象列表，从 c() 释放逻辑推断）
     */
    public static bl[] o;
    /**
     * 背包物品 Vector（背包数据包8197解析后的物品集合）
     */
    public static Vector p = new Vector();
    /**
     * 队伍加成
     */
    public static bp_1[] teamBonus;
    /**
     * 当前场景/战斗标识 UTF 字符串（J()中赋值）
     */
    public static String r;
    /**
     * 跟随状态 0-自由 1-跟随
     */
    public static short followStatus = -1;
    /**
     * 场景中的 NPC 对象数组
     */
    public static NpcObject[] npcObjects;
    /**
     * 服务器下发的所有对象列表（Vector of NpcObject[]）
     */
    public static Vector npcArrayList;

    // ==================== 战斗会话 ====================
    /**
     * 战斗会话 ID（进入战斗包 z() 中赋值）
     */
    public static long v;
    /**
     * 战斗会话 ID 当前值（与 v 配对，新一轮战斗更新）
     */
    public static long w;
    /**
     * 战斗内计数器/状态 short，进战斗时置0
     */
    public static short x;
    /**
     * 未知 long
     */
    public static long y;
    /**
     * 未知 byte
     */
    public static byte z;
    /**
     * 未知 byte
     */
    public static byte A;
    /**
     * 未知 byte
     */
    public static byte B;
    /**
     * 未知 byte[6]，静态块初始化全0
     */
    public static byte[] C;
    /**
     * 未知 byte
     */
    public static byte D;
    /**
     * 未知 byte
     */
    public static byte E;
    /**
     * 未知 String
     */
    public static String F;
    /**
     * 未知 String
     */
    public static String G;

    // ==================== 战斗数据 ====================
    /**
     * 战斗中己方参战角色数据（p[] 类型）
     */
    public static p[] fightData;
    /**
     * 己方参战角色数据数组（方法 e() 解析）
     */
    public static p[] I;
    /**
     * 敌方参战角色/召唤物数据数组（方法 d() 解析）
     */
    public static p[] J;
    /**
     * 战斗相关计数，初始=-1
     */
    public static short K;
    /**
     * 战斗状态标志，初始=-1，进战斗时置1
     */
    public static short L;
    /**
     * 己方战斗单元扩展数组（ck[]）
     */
    public static ck[] M;
    /**
     * 敌方战斗单元数组（ck[]，方法 A() 中解析）
     */
    public static ck[] N;
    /**
     * 主场景/战斗控制器对象（f_1）
     */
    public static f_1 O;
    /**
     * 活动容器对象（ag_1）
     */
    public static ag_1 P;
    /**
     * 弹窗/公告对象（cd）
     */
    public static cd Q;
    /**
     * 角色外观标志字符串1（方法 aC() 按位解析）
     */
    public static String R;
    /**
     * 角色外观标志字符串2
     */
    public static String S;
    /**
     * 角色外观标志字符串3
     */
    public static String T;
    /**
     * 角色外观标志字符串4
     */
    public static String U;
    /**
     * 角色外观标志字符串5
     */
    public static String V;

    // ==================== 角色列表（账号下多角色） ====================
    /**
     * 账号下所有角色的 ID 列表
     */
    public static String[] roleIdList;
    /**
     * 角色等级列表
     */
    public static short[] roleLevelList;
    /**
     * 角色职业列表
     */
    public static byte[] roleJobList;
    /**
     * 角色性别列表
     */
    public static byte[] roleGenderList;
    /**
     * 角色昵称列表
     */
    public static String[] roleNicknameList;

    // ==================== 装备槽 ====================
    /**
     * 装备槽物品 ID 数组（方法 b(DataInputStream) 解析装备包8200）
     */
    public static short[] ab;
    /**
     * 装备槽耐久度数组（与 ab 配对）
     */
    public static short[] ac;

    // ==================== 当前角色详细信息 ====================
    /**
     * 当前角色 ID（备用/第2个）
     */
    public static String roleId_2;
    /**
     * 场景名称/地图名称字符串（方法 c(DataInputStream) 解析位置包8199时读取）
     */
    public static String ae;
    /**
     * 角色名称（去掉VIP后缀的纯净名，从 roleName 派生）
     */
    public static String roleNamePure;
    /**
     * 角色全名（含VIP标记，parseBackPack中赋值）
     */
    public static String roleNameVip;
    /**
     * 角色称号/头衔字符串（parseBackPack/h()中赋值）
     */
    public static String roleTitle;
    /**
     * 角色名称颜色（int 色值，parseBackPack中赋值，默认16776960即黄色）
     */
    public static int roleNameColor = 16776960;
    /**
     * 背包标志字节（parseBackPack中读取，如银行标识）
     */
    public static byte backPackFlag;
    /**
     * 背包容量上限
     */
    public static short backpackCapacityLimit;
    /**
     * 经验值字符串
     */
    public static String jingyan;
    /**
     * 修炼(道行)
     */
    public static long xiulian;
    /**
     * 修炼上限
     */
    public static long xiulianLimit;
    /**
     * 战力
     */
    public static long combatPower = 0L;
    /**
     * 银两（当前持有，parseBackPack中readLong）
     */
    public static long versus;
    /**
     * 元宝/点券数量（parseBackPack中readLong）
     */
    public static long bullions;
    /**
     * 场景/地图 ID，初始=-1
     */
    public static short ar;
    /**
     * 未知 short，初始=-1
     */
    public static short as;
    /**
     * 角色目标坐标 X（位置包8199解析）
     */
    public static short at;
    /**
     * 角色目标坐标 Y（位置包8199解析）
     */
    public static short au;
    /**
     * 移动方向/朝向标志 byte，初始=-1
     */
    public static byte av;
    /**
     * 另一移动方向标志 byte
     */
    public static byte aw;
    /**
     * 背包行数/格子数（parseBackPack中读取）
     */
    public static byte backpackRows;
    /**
     * 背包相关字节（parseBackPack中读取，初始0）
     */
    public static byte ay = 0;
    /**
     * 帮派
     */
    public static String gangs2;
    /**
     * 职务
     */
    public static String gangsJob;
    /**
     * 功勋
     */
    public static int meritorious;

    // ==================== 角色战斗属性 ====================
    /**
     * 总生命值上限（parseBackPack中readInt）
     */
    public static int totalHealth;
    /**
     * 当前生命值（方法 g() 同步 nF→aN）
     */
    public static int currentHealth;
    /**
     * 临时暂存生命值上限（方法 g() 中 nE→totalShengMing）
     */
    private static int nE;
    /**
     * 临时暂存当前生命值（方法 g() 中 nF→aN）
     */
    private static int nF;
    /**
     * 当前魔法/法力值（parseBackPack中readInt）
     */
    public static int currentMana;
    /**
     * 总魔法/法力值上限（方法 g() 同步 nH→aP）
     */
    public static int totalMana;
    /**
     * 临时暂存法力值（方法 g() 中 nG→aO）
     */
    private static int nG;
    /**
     * 临时暂存法力值上限（方法 g() 中 nH→aP）
     */
    private static int nH;
    /**
     * 角色属性：物攻2
     */
    public static int attack2;
    /**
     * 角色属性：物攻
     */
    public static int attack;
    /**
     * 角色属性：物防2
     */
    public static int defense2;
    /**
     * 角色属性：物防
     */
    public static int defense;
    /**
     * 角色属性：法攻
     */
    public static int magicAttack_1_2;
    /**
     * 角色属性值 法攻
     */
    public static int magicAttack_1;
    /**
     * 角色属性值 法伤
     */
    public static int spellDamage;
    /**
     * 角色属性值 法攻2
     */
    public static int magicAttack2;
    /**
     * 角色属性值 法攻
     */
    public static int magicAttack;
    /**
     * 角色属性值
     */
    public static int speed;
    /**
     * 角色属性值 火抗
     */
    public static int fireResistance;
    /**
     * 角色属性值 雷抗
     */
    public static int lightningResistance;
    /**
     * 角色属性值 冰抗
     */
    public static int iceResistance;

    // ==================== 背包杂项信息 ====================
    /**
     * 未知 String（parseBackPack最后读取）
     */
    public static String finalDesc;
    /**
     * 未知 short（parseBackPack中读取）
     */
    public static short bf;
    /**
     * 队伍属性加成
     */
    public static byte attributeBonus;
    /**
     * 祝福
     */
    public static String bless;
    /**
     * 住宅
     */
    public static String houseName;
    /**
     * 帮派
     */
    public static String gangs;
    /**
     * 装备
     */
    public static String equip;
    /**
     * 配偶
     */
    public static String spouse;
    /**
     * 师傅
     */
    public static String master;
    /**
     * 背包记录/帮派战报等最近记录字符串（静态块初始化"暂无记录。"）
     */
    public static String xxRecords = "暂无记录。";
    /**
     * 成就
     */
    public static String achievement = null;

    // ==================== 坐骑坐标 ====================
    /**
     * 宠物槽/骑宠选中槽位（>-1则读取坐骑坐标）
     */
    public static short selectedMount;
    /**
     * 坐骑坐标 X（be>-1时在parseBackPack中读取）
     */
    public static short mountX;
    /**
     * 坐骑坐标 Y
     */
    public static short mountY;
    /**
     * 坐骑方向
     */
    public static short mountDirection;
    /**
     * 未知 short，初始=-1
     */
    public static short bs = -1;
    /**
     * 未知 boolean
     */
    public static boolean bt;
    /**
     * 未知 boolean，初始=false
     */
    public static boolean bu;
    /**
     * 未知 int，初始=0
     */
    public static int bv;
    /**
     * 地图/场景版本或标志 byte（位置包8199中读取，>=1时在J()中读取ha）
     */
    public static byte bw;
    /**
     * 未知 byte，初始=0（位置包8199中读取）
     */
    public static byte bx;
    /**
     * 未知 String，初始=""
     */
    public static String by;
    /**
     * 未知 String，初始=""
     */
    public static String bz;
    /**
     * VIP等级 byte（parseBackPack中读取，用于构造"(VIPx)"后缀，初始0）
     */
    public static byte vipLevel = 0;
    /**
     * 称号
     */
    public static String title;
    /**
     * 背包装备槽对象列表 Vector（bn 对象集合）
     */
    public static Vector bC;
    /**
     * 装备槽数据就绪标志（方法 e()/f(DataInputStream) 解析后置true）
     */
    public static boolean bD;
    /**
     * 未知 boolean，初始=false
     */
    public static boolean bE;
    /**
     * 未知 int，初始=-1
     */
    public static int bF;
    /**
     * 未知 int，初始=-1
     */
    public static int bG;
    /**
     * 未知 String（方法 j() 中清空）
     */
    public static String bH;

    // ==================== 快捷栏 ====================
    /**
     * 物品/快捷栏 ID 数组（方法 g(DataInputStream) 解析）
     */
    public static int[] bI;
    /**
     * 快捷栏物品名称数组
     */
    public static String[] bJ;
    /**
     * 快捷栏辅助 short 数组（私有，方法 g() 解析）
     */
    private static short[] nI;
    /**
     * 快捷栏物品类型数组
     */
    public static byte[] bK;

    // ==================== 可接任务列表 ====================
    /**
     * 可接任务 ID 数组（h(DataInputStream) 解析任务列表包8223）
     */
    public static int[] bL;
    /**
     * 可接任务名称数组
     */
    public static String[] bM;
    /**
     * 可接任务等级要求数组
     */
    public static short[] bN;
    /**
     * 可接任务类型或数量数组
     */
    public static int[] bO;
    /**
     * 可接任务附加描述数组
     */
    public static String[] bP;
    /**
     * 任务列表头信息 UTF 字符串
     */
    public static String bQ;

    // ==================== 进行中任务列表 ====================
    /**
     * 进行中任务 ID 数组（h(DataInputStream) 解析任务列表包8223）
     */
    public static int[] bR;
    /**
     * 进行中任务名称数组
     */
    public static String[] bS;
    /**
     * 进行中任务等级限制数组
     */
    public static short[] bT;
    /**
     * 进行中任务类型数组
     */
    public static byte[] bU;
    /**
     * 进行中任务进度描述数组
     */
    public static String[] bV;
    /**
     * 战斗/寻路开关标志，初始=false（i(DataInputStream) 中读取）
     */
    public static boolean bW;
    /**
     * 战斗/寻路目标 ID，初始=-1（i() 中读取）
     */
    public static int bX;

    // ==================== 背包格子数据 ====================
    /**
     * 背包格子 ID 数组（i(DataInputStream) 解析）
     */
    public static int[] bY;
    /**
     * 背包格子名称数组
     */
    public static String[] bZ;
    /**
     * 物品类型标志数组
     */
    public static byte[] ca;
    /**
     * 物品属性数组1
     */
    public static short[] cb;
    /**
     * 物品属性数组2
     */
    public static short[] cc;
    /**
     * 物品属性数组3
     */
    public static short[] cd;
    /**
     * 物品属性数组4
     */
    public static short[] ce;
    /**
     * 物品属性数组5
     */
    public static short[] cf;
    /**
     * 物品属性数组6
     */
    public static short[] cg;
    /**
     * 物品属性数组7
     */
    public static short[] ch;
    /**
     * 物品属性数组8
     */
    public static short[] ci;
    /**
     * 物品属性数组9
     */
    public static short[] cj;
    /**
     * 物品属性数组10（注意与类名 ck 同名）
     */
    public static short[] ck;
    /**
     * 物品属性数组11
     */
    public static short[] cl;
    /**
     * 物品属性数组12
     */
    public static short[] cm;
    /**
     * 物品属性数组13
     */
    public static short[] cn;
    /**
     * 物品属性数组14
     */
    public static short[] co;
    /**
     * 物品过期时间/价格 long 数组
     */
    public static long[] cp;
    /**
     * 物品附加描述字符串数组（可选）
     */
    public static String[] cq;

    // ==================== 装备配方/合成 ====================
    /**
     * 装备配方/合成 ID 数组（j(DataInputStream) 解析）
     */
    public static short[] cr;
    /**
     * 装备配方/合成名称数组
     */
    public static String[] cs;

    // ==================== 背包/仓库物品 ====================
    /**
     * 背包/仓库物品 ID 数组（k(DataInputStream) 解析）
     */
    public static int[] ct;
    /**
     * 背包/仓库物品名称数组
     */
    public static String[] cu;
    /**
     * 物品类型数组
     */
    public static byte[] cv;
    /**
     * 物品子类型数组
     */
    public static byte[] cw;
    /**
     * 物品等级需求数组
     */
    public static short[] cx;
    /**
     * 物品描述字段1（属性描述行1，私有）
     */
    private static String[] nJ;
    /**
     * 物品描述字段2（属性描述行2，私有）
     */
    private static String[] nK;
    /**
     * 物品描述字段3（属性描述行3，私有）
     */
    private static String[] nL;
    /**
     * 物品描述字段4（属性描述行4，私有）
     */
    private static String[] nM;
    /**
     * 物品描述字段5（属性描述行5，私有）
     */
    private static String[] nN;
    /**
     * 物品描述字段6（属性描述行6，私有）
     */
    private static String[] nO;
    /**
     * 物品等级 short 数组（私有）
     */
    private static short[] nP;
    /**
     * 物品过期时间 long 数组（k(DataInputStream) 解析）
     */
    public static long[] cy;
    /**
     * 物品附加说明字符串（可选，私有）
     */
    private static String[] nQ;
    /**
     * 物品附加属性二维数组（每项可有多个短属性值，私有）
     */
    private static short[][] nR;
    /**
     * 背包物品保存/剩余时间 long 数组（am() 方法解析，私有）
     */
    private static long[] nS;

    // ==================== 已装备宠物（槽位1） ====================
    /**
     * 已装备宠物 ID 数组（l(DataInputStream) 解析宠物包8202）
     */
    public static int[] cz;
    /**
     * 已装备宠物名称数组
     */
    public static String[] cA;
    /**
     * 宠物类型/槽位 byte 数组
     */
    public static byte[] cB;
    /**
     * 宠物等级 short 数组
     */
    public static short[] cC;
    /**
     * 宠物等级（可用于显示，私有）
     */
    private static short[] nT;
    /**
     * 宠物属性描述行1（私有）
     */
    private static String[] nU;
    /**
     * 宠物属性描述行2（私有）
     */
    private static String[] nV;
    /**
     * 宠物属性描述行3（私有）
     */
    private static String[] nW;
    /**
     * 宠物属性描述行4（私有）
     */
    private static String[] nX;
    /**
     * 宠物属性描述行5（私有）
     */
    private static String[] nY;
    /**
     * 宠物属性描述行6（私有）
     */
    private static String[] nZ;
    /**
     * 宠物过期时间 long 数组（私有）
     */
    private static long[] oa;
    /**
     * 宠物附加技能说明字符串（可选，私有）
     */
    private static String[] ob;
    /**
     * 宠物附属技能/属性 ID 二维数组
     */
    public static short[][] cD;
    /**
     * 已装备宠物1标志（m(DataInputStream) 解析时读取）
     */
    public static byte cE;
    /**
     * 已装备宠物2标志
     */
    public static byte cF;

    // ==================== 已装备宠物（槽位2） ====================
    /**
     * 另一宠物槽 ID 数组（m(DataInputStream) 解析）
     */
    public static int[] cG;
    /**
     * 另一宠物槽名称数组
     */
    public static String[] cH;
    /**
     * 另一宠物槽类型数组
     */
    public static byte[] cI;
    /**
     * 另一宠物槽等级数组
     */
    public static short[] cJ;
    /**
     * 另一宠物槽属性描述行1
     */
    public static String[] cK;
    /**
     * 另一宠物槽属性描述行2
     */
    public static String[] cL;
    /**
     * 另一宠物槽属性描述行3
     */
    public static String[] cM;
    /**
     * 另一宠物槽描述行4（私有）
     */
    private static String[] oc;
    /**
     * 另一宠物槽描述行5（私有）
     */
    private static String[] od;
    /**
     * 另一宠物槽描述行6（私有）
     */
    private static String[] oe;
    /**
     * 另一宠物槽等级（显示用）
     */
    public static short[] cN;
    /**
     * 另一宠物槽过期时间
     */
    public static long[] cO;
    /**
     * 另一宠物槽技能说明（可选）
     */
    public static String[] cP;
    /**
     * 另一宠物槽附属技能二维数组
     */
    public static short[][] cQ;

    // ==================== 主装备格 ====================
    /**
     * 主装备格 ID 数组（c(DataInputStream, byte) 解析）
     */
    public static int[] cR;
    /**
     * 主装备格名称数组
     */
    public static String[] cS;
    /**
     * 主装备格类型数组
     */
    public static byte[] cT;
    /**
     * 主装备格子类型数组
     */
    public static byte[] cU;
    /**
     * 主装备格标志 byte 数组
     */
    public static byte[] cV;
    /**
     * 主装备格等级 short 数组
     */
    public static short[] cW;
    /**
     * 主装备格附加属性 short 数组
     */
    public static short[] cX;
    /**
     * 主装备格隐藏属性 short 数组（方法 c() 中读取，私有）
     */
    private static short[] of;
    /**
     * 主装备格显示名称数组
     */
    public static String[] cY;
    /**
     * 主装备格绑定标志 byte 数组
     */
    public static byte[] cZ;
    /**
     * 主装备格附加描述字符串数组
     */
    public static String[] da;

    // ==================== 副装备格 ====================
    /**
     * 副装备格 ID 数组（a(DataInputStream, byte) 解析）
     */
    public static int[] db;
    /**
     * 副装备格名称数组
     */
    public static String[] dc;
    /**
     * 副装备格类型数组
     */
    public static byte[] dd;
    /**
     * 副装备格子类型数组
     */
    public static byte[] de;
    /**
     * 副装备格标志数组
     */
    public static byte[] df;
    /**
     * 副装备格等级 short 数组
     */
    public static short[] dg;
    /**
     * 副装备格附加属性 short 数组
     */
    public static short[] dh;
    /**
     * 副装备格显示名称数组
     */
    public static String[] di;
    /**
     * 副装备格绑定标志 byte 数组
     */
    public static byte[] dj;
    /**
     * 副装备格附加描述字符串数组
     */
    public static String[] dk;

    // ==================== 仓库/地面物品 ====================
    /**
     * 仓库/地面物品 ID 数组（p() 方法清空）
     */
    public static int[] dl;
    /**
     * 仓库/地面物品名称数组（p() 清空）
     */
    public static String[] dm;
    /**
     * 仓库物品类型数组
     */
    public static byte[] dn;
    /**
     * 仓库物品子类型数组（命名避免与 do 关键字冲突）
     */
    public static byte[] do_2;
    /**
     * 仓库物品标志数组
     */
    public static byte[] dp;
    /**
     * 仓库物品等级 short 数组
     */
    public static short[] dq;
    /**
     * 仓库物品附加属性 short 数组
     */
    public static short[] dr;
    /**
     * 仓库物品显示名称数组
     */
    public static String[] ds;
    /**
     * 仓库物品附加描述字符串数组
     */
    public static String[] dt;
    /**
     * 仓库物品绑定标志 byte 数组（p() 中清空）
     */
    public static byte[] du;

    // ==================== 技能列表 ====================
    /**
     * 技能 ID 数组（n(DataInputStream) 解析技能包8203）
     */
    public static int[] dv;
    /**
     * 技能名称数组
     */
    public static String[] dw;
    /**
     * 技能类型 byte 数组
     */
    public static byte[] dx;
    /**
     * 技能子类型 byte 数组
     */
    public static byte[] dy;
    /**
     * 技能状态标志 byte 数组
     */
    public static byte[] dz;
    /**
     * 技能等级/冷却值1 short 数组
     */
    public static short[] dA;
    /**
     * 技能冷却值2 short 数组
     */
    public static short[] dB;
    /**
     * 技能附加描述字符串数组
     */
    public static String[] dC;
    /**
     * 技能描述字符串数组
     */
    public static String[] dD;

    // ==================== 另一技能/称号列表 ====================
    /**
     * 另一技能/称号 ID 数组（o(DataInputStream) 解析）
     */
    public static int[] dE;
    /**
     * 另一技能名称数组
     */
    public static String[] dF;
    /**
     * 另一技能类型 byte 数组（o() 方法解析，私有）
     */
    private static byte[] og;
    /**
     * 另一技能等级 short 数组
     */
    public static short[] dG;
    /**
     * 另一技能冷却 short 数组
     */
    public static short[] dH;
    /**
     * 另一技能附加描述数组
     */
    public static String[] dI;
    /**
     * 地图行走可用标志，初始=true
     */
    public static boolean dJ;
    /**
     * 地图行走模式标志（p(DataInputStream) 中读取，初始0，私有）
     */
    private static byte oh;

    // ==================== 地图图标/NPC ====================
    /**
     * 地图图标/NPC名称数组（p(DataInputStream) 解析）
     */
    public static String[] dK;
    /**
     * 地图图标 ID/NPC ID 字符串数组
     */
    public static String[] dL;
    /**
     * 地图图标类型 byte 数组
     */
    public static byte[] dM;
    /**
     * 地图图标 X 坐标 short 数组
     */
    public static short[] dN;
    /**
     * 地图图标 Y 坐标 short 数组
     */
    public static short[] dO;
    /**
     * 地图图标方向 short 数组
     */
    public static short[] dP;
    /**
     * 地图图标附加描述字符串数组
     */
    public static String[] dQ;
    /**
     * 地图图标颜色 int 数组（由 pickColor 转换）
     */
    public static int[] dR;
    /**
     * 未知 String 数组（p() 方法中声明但未初始化）
     */
    public static String[] dS;

    // ==================== 对话/台词 ====================
    /**
     * 对话/场景台词数组（q(DataInputStream) 解析4条 UTF 字符串）
     */
    public static String[] dT;
    /**
     * 未知 byte
     */
    public static byte dU;
    /**
     * 对话标志1（q(DataInputStream) 读取）
     */
    public static byte dV;
    /**
     * 未知 byte
     */
    public static byte dW;
    /**
     * 对话标志2（q(DataInputStream) 读取）
     */
    public static byte dX;

    // ==================== 动画/特效列表 ====================
    /**
     * 动画/特效 ID 数组（r(DataInputStream) 解析）
     */
    public static int[] dY;
    /**
     * 动画名称数组
     */
    public static String[] dZ;
    /**
     * 动画类型 byte 数组
     */
    public static byte[] ea;
    /**
     * 动画子类型 byte 数组
     */
    public static byte[] eb;
    /**
     * 动画等级/属性 short 数组
     */
    public static short[] ec;
    /**
     * 动画描述行1
     */
    public static String[] ed;
    /**
     * 动画描述行2（私有）
     */
    private static String[] oi;
    /**
     * 动画描述行3
     */
    public static String[] ee;
    /**
     * 动画描述行4（私有）
     */
    private static String[] oj;
    /**
     * 动画描述行5（私有）
     */
    private static String[] ok;
    /**
     * 动画描述行6（私有）
     */
    private static String[] ol;
    /**
     * 动画等级 short 数组（r() 方法解析）
     */
    public static short[] ef;
    /**
     * 动画过期时间/价格 long 数组
     */
    public static long[] eg;
    /**
     * 动画附加技能说明（可选）
     */
    public static String[] eh;
    /**
     * 动画附属技能二维数组（r() 方法解析，私有）
     */
    private static short[][] om;
    /**
     * 战斗/动画场景标志（r()/s() 方法读取）
     */
    public static byte ei;

    // ==================== 主外观槽位 ====================
    /**
     * 主外观槽位类型数组（t() 解析外观包8210时从 oo 复制）
     */
    public static byte[] ej;
    /**
     * 主外观槽位状态1数组（从 op 复制）
     */
    public static byte[] ek;
    /**
     * 主外观槽位状态2数组（从 oq 复制）
     */
    public static byte[] el;
    /**
     * 主外观槽位状态3数组（从 or 复制）
     */
    public static byte[] em;
    /**
     * 主外观槽位名称（从 eo 复制存入私有字段，私有）
     */
    private static String[] on;
    /**
     * 主外观槽位 ID short 数组（从 os 复制）
     */
    public static short[] en;
    /**
     * 主外观槽位类型原始数组（t() 方法读入，私有）
     */
    private static byte[] oo;
    /**
     * 主外观槽位状态1原始数组（私有）
     */
    private static byte[] op;
    /**
     * 主外观槽位状态2原始数组（私有）
     */
    private static byte[] oq;
    /**
     * 主外观槽位状态3原始数组（私有）
     */
    private static byte[] or;
    /**
     * 主外观槽位 ID 原始数组（私有）
     */
    private static short[] os;
    /**
     * 主外观槽位名称/资源路径（t() 方法读取）
     */
    public static String[] eo;

    // ==================== 次外观槽位 ====================
    /**
     * 次外观槽位类型数组（u() 解析次外观包8244时从 ou 复制）
     */
    public static byte[] ep;
    /**
     * 次外观槽位状态1数组
     */
    public static byte[] eq;
    /**
     * 次外观槽位状态2数组
     */
    public static byte[] er;
    /**
     * 次外观槽位状态3数组
     */
    public static byte[] es;
    /**
     * 次外观槽位名称（从 eu 复制到私有，私有）
     */
    private static String[] ot;
    /**
     * 次外观槽位 ID 数组（从 oy 复制）
     */
    public static short[] et;
    /**
     * 次外观槽位类型原始数组（私有）
     */
    private static byte[] ou;
    /**
     * 次外观槽位状态1原始数组（私有）
     */
    private static byte[] ov;
    /**
     * 次外观槽位状态2原始数组（私有）
     */
    private static byte[] ow;
    /**
     * 次外观槽位状态3原始数组（私有）
     */
    private static byte[] ox;
    /**
     * 次外观槽位 ID 原始数组（私有）
     */
    private static short[] oy;
    /**
     * 次外观槽位名称/资源路径（u() 方法读取）
     */
    public static String[] eu;

    // ==================== 背包功能列表 ====================
    /**
     * 是否已激活/开启某功能标志（v(DataInputStream) 读取，初始=false）
     */
    public static boolean ev;
    /**
     * 背包功能列表 ID 数组（v() 方法解析）
     */
    public static int[] ew;
    /**
     * 功能名称数组
     */
    public static String[] ex;
    /**
     * 功能描述字符串数组
     */
    public static String[] ey;
    /**
     * 功能附加描述字符串数组
     */
    public static String[] ez;
    /**
     * 功能额外字段数组
     */
    public static String[] eA;

    // ==================== 登录/操作异常 ====================
    /**
     * 登录/操作失败码（parseLoginFail 解析包8193，初始=-1）
     */
    public static byte exceptionCode;
    /**
     * 登录/操作失败消息字符串
     */
    public static String exceptionMsg;

    // ==================== 战斗数值组1 ====================
    /**
     * 未知 UTF 字符串（x(DataInputStream) 读取）
     */
    public static String eD;
    /**
     * 战斗中3个数值槽（初始化为 new short[3]，x() 方法填入）
     */
    public static short[] eE;
    /**
     * 格式控制字 short，各位分别决定 eG/eH/eI/eJ 的长度
     */
    public static short eF;
    /**
     * 战斗数值 byte 数组（eF%10 决定长度）
     */
    public static byte[] eG;
    /**
     * 战斗数值 short 数组（eF/10%10 决定长度）
     */
    public static short[] eH;
    /**
     * 战斗数值 int 数组（eF/100%10 决定长度）
     */
    public static int[] eI;
    /**
     * 战斗数值 String 数组（eF/1000%10 决定长度）
     */
    public static String[] eJ;

    // ==================== 战斗数值组2 ====================
    /**
     * 另一组数值的 UTF 头字符串（y(DataInputStream) 读取）
     */
    public static String eK;
    /**
     * 另一组附属字符串数组（y() 读取）
     */
    public static String[] eL;
    /**
     * 另一组3个数值槽（初始化为 new short[3]，y() 方法填入）
     */
    public static short[] eM;
    /**
     * 另一组格式控制字（y() 方法读取）
     */
    public static short eN;
    /**
     * 另一组数值 byte 数组
     */
    public static byte[] eO;
    /**
     * 另一组数值 short 数组
     */
    public static short[] eP;
    /**
     * 另一组数值 int 数组
     */
    public static int[] eQ;
    /**
     * 另一组数值 String 数组
     */
    public static String[] eR;

    // ==================== 商城信息 ====================
    /**
     * 商城/公告 UTF 字符串（B(DataInputStream) 读取）
     */
    public static String eS;
    /**
     * 商城相关 short
     */
    public static short eT;
    /**
     * 商城相关 byte1
     */
    public static byte eU;
    /**
     * 商城相关 byte2
     */
    public static byte eV;
    /**
     * 商城相关字符串1
     */
    public static String eW;
    /**
     * 商城相关字符串2
     */
    public static String eX;
    /**
     * 商城相关 int
     */
    public static int eY;
    /**
     * 商城相关字符串3
     */
    public static String eZ;
    /**
     * 商城相关 int（B() 读取）
     */
    public static int fa;
    /**
     * 商城相关字符串4
     */
    public static String fb;
    /**
     * 商城相关字符串5
     */
    public static String fc;
    /**
     * 商城相关 int
     */
    public static int fd;
    /**
     * 商城相关字符串6（B() 最后读取）
     */
    public static String fe;
    /**
     * 坐骑/频道相关 UTF 字符串（C(DataInputStream) 读取）
     */
    public static String ff;
    /**
     * 另一时间戳/版本 long（D()/E() 方法读取）
     */
    public static long fg;

    // ==================== 商城物品列表1 ====================
    /**
     * 背包内物品商城 ID 数组（D() 方法解析，v() 清空）
     */
    public static int[] fh;
    /**
     * 商城物品名称数组（D() 方法解析，私有）
     */
    private static String[] oz;
    /**
     * 商城物品类型 byte 数组
     */
    public static byte[] fi;
    /**
     * 商城物品子类型数组
     */
    public static byte[] fj;
    /**
     * 商城物品等级/属性 short 数组
     */
    public static short[] fk;
    /**
     * 商城物品另一属性 short 数组
     */
    public static short[] fl;
    /**
     * 商城物品描述行1（私有）
     */
    private static String[] oA;
    /**
     * 商城物品描述行2（私有）
     */
    private static String[] oB;
    /**
     * 商城物品描述行3（私有）
     */
    private static String[] oC;
    /**
     * 商城物品描述行4（私有）
     */
    private static String[] oD;
    /**
     * 商城物品描述行5（私有）
     */
    private static String[] oE;
    /**
     * 商城物品描述行6（私有）
     */
    private static String[] oF;
    /**
     * 商城物品等级 short 数组（私有）
     */
    private static short[] oG;
    /**
     * 商城物品价格 long 数组（私有）
     */
    private static long[] oH;
    /**
     * 商城物品附加技能说明（可选）
     */
    public static String[] fm;
    /**
     * 商城物品附属技能二维数组（私有）
     */
    private static short[][] oI;
    /**
     * 背包/装备槽标记（D() 方法中由 readByte==1 赋值，初始=false，私有）
     */
    private static boolean oJ;
    /**
     * 关联背包槽 ID（oJ 为 true 时有效，初始=-1，私有）
     */
    private static int oK;
    /**
     * 关联背包槽附加标志（初始=0，私有）
     */
    private static byte oL;
    /**
     * 时间戳（D()/E() 方法读取）
     */
    public static long fn;

    // ==================== 商城物品列表2 ====================
    /**
     * 另一组商城/坐骑物品 ID 数组（D() 方法解析，w() 清空）
     */
    public static int[] fo;
    /**
     * 另一组商城物品名称数组（y() 清空，私有）
     */
    private static String[] oM;
    /**
     * 另一组物品类型 byte 数组
     */
    public static byte[] fp;
    /**
     * 另一组物品子类型数组
     */
    public static byte[] fq;
    /**
     * 另一组物品等级/属性 short 数组
     */
    public static short[] fr;
    /**
     * 另一组物品另一属性 short 数组
     */
    public static short[] fs;
    /**
     * 另一组描述行1（私有）
     */
    private static String[] oN;
    /**
     * 另一组描述行2（私有）
     */
    private static String[] oO;
    /**
     * 另一组描述行3（私有）
     */
    private static String[] oP;
    /**
     * 另一组描述行4（私有）
     */
    private static String[] oQ;
    /**
     * 另一组描述行5（私有）
     */
    private static String[] oR;
    /**
     * 另一组描述行6（私有）
     */
    private static String[] oS;
    /**
     * 另一组物品等级 short 数组（私有）
     */
    private static short[] oT;
    /**
     * 另一组物品价格 long 数组（私有）
     */
    private static long[] oU;
    /**
     * 另一组物品技能说明（可选）
     */
    public static String[] ft;
    /**
     * 另一组物品附属技能二维数组（私有）
     */
    private static short[][] oV;

    // ==================== 可购买宠物列表 ====================
    /**
     * 可购买/可选宠物/坐骑 ID 数组（E() 方法解析，y() 清空）
     */
    public static int[] fu;
    /**
     * 可购宠物/坐骑名称数组（y() 清空，私有）
     */
    private static String[] oW;
    /**
     * 可购宠物类型标志 byte 数组
     */
    public static byte[] fv;
    /**
     * 宠物等级（私有）
     */
    private static short[] oX;
    /**
     * 宠物攻击最小值（私有）
     */
    private static short[] oY;
    /**
     * 宠物攻击最大值（私有）
     */
    private static short[] oZ;
    /**
     * 宠物法攻最小值（私有）
     */
    private static short[] pa;
    /**
     * 宠物法攻最大值（私有）
     */
    private static short[] pb;
    /**
     * 宠物当前经验 long 数组（私有）
     */
    private static long[] pc;
    /**
     * 宠物经验上限 long 数组（私有）
     */
    private static long[] pd;
    /**
     * 宠物价格 long 数组（私有）
     */
    private static long[] pe;
    /**
     * 宠物技能说明（可选，私有）
     */
    private static String[] pf;
    /**
     * 宠物附属技能 ID 二维数组（私有）
     */
    private static short[][] pg;
    /**
     * 宠物附属技能名称二维数组（私有）
     */
    private static String[][] ph;
    /**
     * "排除已拥有宠物"模式标志（E() 方法解析后设置，私有）
     */
    private static boolean pi;
    /**
     * 宠物星级/品阶 byte 数组（私有）
     */
    private static byte[] pj;
    /**
     * 宠物附属技能品质二维数组（私有）
     */
    private static byte[][] pk;
    /**
     * 宠物星级字符串数组（私有）
     */
    private static String[] pl;
    /**
     * 宠物技能附魂名称二维数组（私有）
     */
    private static String[][] pm;
    /**
     * 宠物状态附魂名称二维数组（私有）
     */
    private static String[][] pn;
    /**
     * 可购买宠物在全列表中的索引（排除已拥有后的空槽索引）
     */
    public static int[] fw;

    // ==================== 可购买坐骑列表 ====================
    /**
     * 可购买坐骑/宠物 ID 数组（E() 方法解析，z() 清空）
     */
    public static int[] fx;
    /**
     * 可购坐骑/宠物名称数组（z() 清空，私有）
     */
    private static String[] po;
    /**
     * 可购坐骑类型标志 byte 数组
     */
    public static byte[] fy;
    /**
     * 坐骑等级（私有）
     */
    private static short[] pp;
    /**
     * 坐骑攻击最小值（私有）
     */
    private static short[] pq;
    /**
     * 坐骑攻击最大值（私有）
     */
    private static short[] pr;
    /**
     * 坐骑法攻最小值（私有）
     */
    private static short[] ps;
    /**
     * 坐骑法攻最大值（私有）
     */
    private static short[] pt;
    /**
     * 坐骑当前经验 long 数组（私有）
     */
    private static long[] pu;
    /**
     * 坐骑经验上限 long 数组（私有）
     */
    private static long[] pv;
    /**
     * 坐骑价格 long 数组（私有）
     */
    private static long[] pw;
    /**
     * 坐骑技能说明（可选，私有）
     */
    private static String[] px;
    /**
     * 坐骑附属技能 ID 二维数组（私有）
     */
    private static short[][] py;
    /**
     * 坐骑附属技能名称二维数组（私有）
     */
    private static String[][] pz;
    /**
     * 坐骑星级/品阶 byte 数组（私有）
     */
    private static byte[] pA;
    /**
     * 坐骑附属技能品质二维数组（私有）
     */
    private static byte[][] pB;
    /**
     * 坐骑星级字符串数组（私有）
     */
    private static String[] pC;
    /**
     * 坐骑技能附魂名称二维数组（私有）
     */
    private static String[][] pD;
    /**
     * 坐骑状态附魂名称二维数组（私有）
     */
    private static String[][] pE;

    // ==================== 宠物列表（完整） ====================
    /**
     * 宠物列表类型标志 byte 数组（I(DataInputStream) 解析宠物列表包8222）
     */
    public static byte[] fz;
    /**
     * 宠物列表唯一 ID 数组
     */
    public static int[] fA;
    /**
     * 宠物名称数组
     */
    public static String[] fB;
    /**
     * 宠物种类/图标名称数组
     */
    public static String[] fC;
    /**
     * 宠物等级 short 数组
     */
    public static short[] fD;
    /**
     * 宠物属性1（如攻击最小，b() 方法中用于 my 赋值）
     */
    public static short[] fE;
    /**
     * 宠物属性2（如攻击最大）
     */
    public static short[] fF;
    /**
     * 宠物属性3（如法攻最小）
     */
    public static short[] fG;
    /**
     * 宠物属性4（如法攻最大）
     */
    public static short[] fH;
    /**
     * 宠物基础属性 int1
     */
    public static int[] fI;
    /**
     * 宠物基础属性 int2
     */
    public static int[] fJ;
    /**
     * 宠物基础属性 int3
     */
    public static int[] fK;
    /**
     * 宠物基础属性 int4
     */
    public static int[] fL;
    /**
     * 宠物攻击下限（e()/f() 方法中显示"攻击:fM-fN"）
     */
    public static int[] fM;
    /**
     * 宠物攻击上限
     */
    public static int[] fN;
    /**
     * 宠物法攻下限
     */
    public static int[] fO;
    /**
     * 宠物法攻上限
     */
    public static int[] fP;
    /**
     * 宠物基础属性 int9
     */
    public static int[] fQ;
    /**
     * 宠物基础属性 int10
     */
    public static int[] fR;
    /**
     * 宠物基础属性 int11
     */
    public static int[] fS;
    /**
     * 宠物基础属性 int12
     */
    public static int[] fT;
    /**
     * 宠物基础属性 int13
     */
    public static int[] fU;
    /**
     * 宠物基础属性 int14
     */
    public static int[] fV;
    /**
     * 宠物当前品质/星级 short 数组
     */
    public static short[] fW;
    /**
     * 宠物附加字符串（如自定义名/说明）
     */
    public static String[] fX;
    /**
     * 宠物当前经验 long 数组（e() 方法显示"经验:fY/fZ"）
     */
    public static long[] fY;
    /**
     * 宠物经验上限 long 数组
     */
    public static long[] fZ;
    /**
     * 宠物另一时间/价格 long 数组（B() 方法清空）
     */
    public static long[] ga;
    /**
     * 宠物价格 long 数组（e() 方法显示"价格:"，私有）
     */
    private static long[] pF;
    /**
     * 宠物技能 ID 二维数组（I() 方法解析）
     */
    public static short[][] gb;
    /**
     * 宠物技能名称二维数组（e() 方法显示"技能:"）
     */
    public static String[][] gc;
    /**
     * 宠物技能品质二维数组
     */
    public static byte[][] gd;
    /**
     * 宠物特殊标志 byte 数组
     */
    public static byte[] ge;
    /**
     * 宠物星级字符串数组（e()/f() 方法显示"星级:"）
     */
    public static String[] gf;
    /**
     * 宠物技能附魂 ID 二维数组（仅4格）
     */
    public static int[][] gg;
    /**
     * 宠物技能附魂名称二维数组（e() 方法显示"技能附魂:"）
     */
    public static String[][] gh;
    /**
     * 宠物技能附魂描述二维数组
     */
    public static String[][] gi;
    /**
     * 宠物技能附魂辅助 int 二维数组（私有）
     */
    private static int[][] pG;
    /**
     * 宠物技能附魂槽位标记二维数组
     */
    public static byte[][] gj;
    /**
     * 宠物状态附魂 ID 二维数组
     */
    public static int[][] gk;
    /**
     * 宠物状态附魂名称二维数组（e() 方法显示"状态附魂:"）
     */
    public static String[][] gl;
    /**
     * 宠物状态附魂描述二维数组
     */
    public static String[][] gm;
    /**
     * 宠物状态附魂辅助 int 二维数组（私有）
     */
    private static int[][] pH;
    /**
     * 宠物状态附魂槽位标记二维数组
     */
    public static byte[][] gn;
    /**
     * 特殊宠物（fz==1）的额外属性1（I() 方法中读取）
     */
    public static short go;
    /**
     * 特殊宠物额外属性2
     */
    public static short gp;
    /**
     * 特殊宠物额外属性3
     */
    public static short gq;
    /**
     * 特殊宠物额外属性4
     */
    public static short gr;

    // ==================== 商城宠物/坐骑商品 ====================
    /**
     * 商城宠物/坐骑商品 ID 数组（b(short) 分配，Y() 清空）
     */
    public static int[] gs;
    /**
     * 商城商品名称数组
     */
    public static String[] gt;
    /**
     * 商城商品等级 short 数组
     */
    public static short[] gu;
    /**
     * 商品攻击最小值（私有）
     */
    private static short[] pI;
    /**
     * 商品攻击最大值（私有）
     */
    private static short[] pJ;
    /**
     * 商品法攻最小值（私有）
     */
    private static short[] pK;
    /**
     * 商品法攻最大值（私有）
     */
    private static short[] pL;
    /**
     * 商品当前经验 long 数组（私有）
     */
    private static long[] pM;
    /**
     * 商品经验上限 long 数组（私有）
     */
    private static long[] pN;
    /**
     * 商品价格 long 数组（g() 方法显示"价格:"）
     */
    public static long[] gv;
    /**
     * 商品技能说明（g() 方法显示"技能:"，可选，私有）
     */
    private static String[] pO;
    /**
     * 商品额外属性1（a(DataInputStream, int) 解析）
     */
    public static short[] gw;
    /**
     * 商品额外属性2
     */
    public static short[] gx;
    /**
     * 商品额外属性3
     */
    public static short[] gy;
    /**
     * 商品额外属性4
     */
    public static short[] gz;
    /**
     * 商品附属技能 ID 二维数组
     */
    public static short[][] gA;
    /**
     * 商品附属技能名称二维数组（私有）
     */
    private static String[][] pP;
    /**
     * 商品附属技能品质二维数组
     */
    public static byte[][] gB;
    /**
     * 商品属性 int1（a(DataInputStream, int) 解析）
     */
    public static int[] gC;
    /**
     * 商品属性 int2
     */
    public static int[] gD;
    /**
     * 商品属性 int3
     */
    public static int[] gE;
    /**
     * 商品属性 int4
     */
    public static int[] gF;
    /**
     * 商品剩余/保存时间 long 数组（H() 方法解析并使用"剩余时间/保存时间"，私有）
     */
    private static long[] pQ;
    /**
     * 商品品质/星级 byte 数组
     */
    public static byte[] gG;
    /**
     * 商品星级字符串（g() 方法显示"星级:"，私有）
     */
    private static String[] pR;
    /**
     * 商品技能附魂名称二维数组（g() 方法显示"技能附魂:"，私有）
     */
    private static String[][] pS;
    /**
     * 商品状态附魂名称二维数组（g() 方法显示"状态附魂:"，私有）
     */
    private static String[][] pT;

    // ==================== 未知字段组（待解析） ====================
    /**
     * 未知 String 数组（C() 方法清空）
     */
    public static String[] gH;
    /**
     * 未知 int 数组
     */
    public static int[] gI;
    /**
     * 未知 String 数组
     */
    public static String[] gJ;
    /**
     * 未知 short 数组
     */
    public static short[] gK;
    /**
     * 未知 byte 数组
     */
    public static byte[] gL;
    /**
     * 未知 byte 数组
     */
    public static byte[] gM;
    /**
     * 未知 short 数组
     */
    public static short[] gN;
    /**
     * 未知 short 数组
     */
    public static short[] gO;
    /**
     * 未知 byte 数组
     */
    public static byte[] gP;
    /**
     * 场景/频道当前页/标签 short（多处读取，初始=1）
     */
    public static short gQ;
    /**
     * 场景/频道类型标志 byte
     */
    public static byte gR;

    // ==================== 场景内人物列表 ====================
    /**
     * 场景内 NPC/人物名称数组（J(DataInputStream) 解析）
     */
    public static String[] gS;
    /**
     * 场景人物类型 byte 数组
     */
    public static byte[] gT;
    /**
     * 场景人物头像/图标名称数组
     */
    public static String[] gU;
    /**
     * 场景人物等级/属性 short 数组
     */
    public static short[] gV;
    /**
     * 场景人物标志 byte1 数组
     */
    public static byte[] gW;
    /**
     * 场景人物标志 byte2 数组
     */
    public static byte[] gX;
    /**
     * 场景人物属性1 short 数组
     */
    public static short[] gY;
    /**
     * 场景人物属性2 short 数组
     */
    public static short[] gZ;
    /**
     * 场景人物附加属性1（私有）
     */
    private static short[] pU;
    /**
     * 场景人物附加属性2（pU>0时读取，私有）
     */
    private static short[] pV;
    /**
     * 场景人物附加属性3（私有）
     */
    private static short[] pW;
    /**
     * 场景人物附加属性4（私有）
     */
    private static short[] pX;
    /**
     * 场景人物附加标志 byte 数组（bw>=1时在J()中读取）
     */
    public static byte[] ha;
    /**
     * 银两格式化缓冲区（a(long) 方法使用，私有）
     */
    private static StringBuffer pY;

    // ==================== 符文/颜色列表 ====================
    /**
     * 符文/颜色 ID 数组（K(DataInputStream) 解析）
     */
    public static int[] hb;
    /**
     * 符文附属 short 二维数组（K() 方法解析）
     */
    public static short[][] hc;
    /**
     * 符文颜色分量1（16*readByte）
     */
    public static short[] hd;
    /**
     * 符文颜色分量2
     */
    public static short[] he;
    /**
     * 符文颜色分量3
     */
    public static short[] hf;
    /**
     * 符文属性 short1
     */
    public static short[] hg;
    /**
     * 符文属性 short2
     */
    public static short[] hh;
    /**
     * 符文属性 short3
     */
    public static short[] hi;
    /**
     * 符文属性 short4
     */
    public static short[] hj;
    /**
     * 符文附加标志 byte 数组（K() 方法单独读取）
     */
    public static byte[] hk;

    // ==================== 好友/帮派成员列表 ====================
    /**
     * 好友/帮派成员 ID short 数组（L(DataInputStream) 解析）
     */
    public static short[] hl;
    /**
     * 好友/帮派成员名称数组
     */
    public static String[] hm;
    /**
     * 成员属性 int1（L() 方法读取）
     */
    public static int[] hn;
    /**
     * 成员属性 int2
     */
    public static int[] ho;
    /**
     * 成员等级/属性 short 数组
     */
    public static short[] hp;
    /**
     * 成员类型 byte1 数组
     */
    public static byte[] hq;
    /**
     * 成员类型 byte2 数组
     */
    public static byte[] hr;
    /**
     * 成员属性 short1 数组
     */
    public static short[] hs;
    /**
     * 成员属性 short2 数组
     */
    public static short[] ht;
    /**
     * 成员属性 short3 数组
     */
    public static short[] hu;
    /**
     * 成员属性 short4 数组
     */
    public static short[] hv;

    // ==================== 服务器列表/渠道 ====================
    /**
     * 渠道相关标志（M(DataInputStream) 中渠道!=1时读取）
     */
    public static boolean hw;
    /**
     * 渠道相关 byte（M() 中读取）
     */
    public static byte hx;
    /**
     * 登录相关字符串1（M() 最后读取）
     */
    public static String hy;
    /**
     * 登录相关字符串2
     */
    public static String hz;
    /**
     * 服务器列表名称数组（M(DataInputStream) 解析）
     */
    public static String[] hA;
    /**
     * 服务器列表 IP/URL 数组
     */
    public static String[] hB;
    /**
     * 服务器列表附加描述数组
     */
    public static String[] hC;
    /**
     * 服务器列表 prefix/前缀 short 数组（渠道!=0时读取）
     */
    public static short[] hD;
    /**
     * 服务器列表等级/属性 short 数组
     */
    public static short[] hE;
    /**
     * 服务器列表另一描述数组
     */
    public static String[] hF;

    // ==================== 战斗动画 ====================
    /**
     * 战斗动画总帧数 short（N(DataInputStream) 解析，初始=-1）
     */
    public static short hG;
    /**
     * 战斗动画帧对象（N() 方法解析）
     */
    public static Frame0 hH;
    /**
     * 战斗动画类型标志（N() 方法读取，F() 清空初始=-1）
     */
    public static byte hI;
    /**
     * 战斗动画帧数据1（N() 方法解析）
     */
    public static byte[] hJ;
    /**
     * 战斗动画帧数据2
     */
    public static byte[] hK;

    // ==================== 好友/黑名单列表 ====================
    /**
     * 好友/黑名单 ID short 数组（O(DataInputStream) 解析）
     */
    public static short[] hL;
    /**
     * 好友/黑名单名称数组
     */
    public static String[] hM;
    /**
     * 好友/黑名单时间戳 long 数组（私有）
     */
    private static long[] pZ;
    /**
     * 好友/黑名单附加描述数组
     */
    public static String[] hN;
    /**
     * 好友列表附加 int 数组（O() 方法解析）
     */
    public static int[] hO;

    // ==================== 邮件/交易列表 ====================
    /**
     * 邮件/交易 ID int 数组（P(DataInputStream) 解析）
     */
    public static int[] hP;
    /**
     * 邮件/交易标题字符串数组
     */
    public static String[] hQ;
    /**
     * 邮件/交易内容字符串数组
     */
    public static String[] hR;
    /**
     * 邮件/交易属性 short 数组
     */
    public static short[] hS;
    /**
     * 邮件/交易类型 byte 数组
     */
    public static byte[] hT;

    // ==================== 公告/系统消息 ====================
    /**
     * 公告/系统消息标题数组（Q(DataInputStream) 解析）
     */
    public static String[] hU;
    /**
     * 公告内容字符串数组
     */
    public static String[] hV;
    /**
     * 公告附加字符串数组
     */
    public static String[] hW;

    // ==================== 奖励/排行榜 ====================
    /**
     * 奖励/排行榜 ID 数组（R(DataInputStream) 解析）
     */
    public static int[] hX;
    /**
     * 排行榜名称数组
     */
    public static String[] hY;
    /**
     * 排行榜内容字符串数组
     */
    public static String[] hZ;
    /**
     * 排行榜附加字符串数组
     */
    public static String[] ia;
    /**
     * 排行榜属性1（私有）
     */
    private static short[] qa;
    /**
     * 排行榜属性2（私有）
     */
    private static short[] qb;
    /**
     * 排行榜属性3（私有）
     */
    private static short[] qc;
    /**
     * 帮派/组队当前 ID（S(DataInputStream) 赋值，初始=-1；G() 检查是否>=0，私有）
     */
    private static int qd;

    // ==================== 帮派/组队信息 ====================
    /**
     * 帮派/组队状态标志（S(DataInputStream) 读取）
     */
    public static byte ib;
    /**
     * 帮派/组队属性 short1
     */
    public static short ic;
    /**
     * 帮派/组队属性 short2
     */
    public static short id;
    /**
     * 帮派/组队槽位 ID1 数组（S() 读取）
     */
    public static short[] ie;
    /**
     * 帮派/组队槽位 ID2 数组（命名避免与 if 关键字冲突）
     */
    public static short[] if_2;
    /**
     * 帮派/组队槽位属性 short3 数组
     */
    public static short[] ig;
    /**
     * 帮派/组队槽位属性 short4 数组
     */
    public static short[] ih;
    /**
     * 帮派/组队槽位附加 byte 数据二维数组
     */
    public static byte[][] ii;
    /**
     * 待处理事件/对象集合（bv 对象，a(bv) 方法添加）
     */
    public static Vector ij;

    // ==================== 帮派成员列表 ====================
    /**
     * 帮派成员 ID 数组（T(DataInputStream) 解析）
     */
    public static int[] ik;
    /**
     * 帮派成员名称数组
     */
    public static String[] il;
    /**
     * 帮派成员另一字符串数组
     */
    public static String[] im;
    /**
     * 帮派成员状态 byte 数组
     */
    public static byte[] in;
    /**
     * 帮派成员另一状态 byte 数组（T() 读取第二段）
     */
    public static byte[] io;

    // ==================== 好友列表 ====================
    /**
     * 好友列表字符串1（U(DataInputStream) 解析）
     */
    public static String[] ip;
    /**
     * 好友列表字符串2
     */
    public static String[] iq;
    /**
     * 好友列表字符串3
     */
    public static String[] ir;
    /**
     * 好友列表状态 byte 数组（U() 读取第二段）
     */
    public static byte[] is;

    // ==================== 黑名单列表 ====================
    /**
     * 黑名单列表字符串1（V(DataInputStream) 解析）
     */
    public static String[] it;
    /**
     * 黑名单列表字符串2
     */
    public static String[] iu;
    /**
     * 黑名单列表 short 属性数组
     */
    public static short[] iv;
    /**
     * 黑名单列表字符串3
     */
    public static String[] iw;
    /**
     * 黑名单列表类型 byte 数组
     */
    public static byte[] ix;

    // ==================== 聊天/交易请求 ====================
    /**
     * 聊天/交易请求者名称数组（W(DataInputStream) 解析）
     */
    public static String[] iy;
    /**
     * 请求内容字符串数组
     */
    public static String[] iz;
    /**
     * 请求附加字符串数组
     */
    public static String[] iA;
    /**
     * 请求相关 int1 数组（W() 读取）
     */
    public static int[] iB;
    /**
     * 请求相关 int2 数组
     */
    public static int[] iC;
    /**
     * 请求类型 byte 数组（W() 读取）
     */
    public static byte[] iD;
    /**
     * 请求属性 short1 数组
     */
    public static short[] iE;
    /**
     * 请求属性 short2 数组（W() 方法中复用 if_2 字段）
     */
    public static short[] iF;
    /**
     * 请求颜色 int 数组（W() 中 pickColor 转换）
     */
    public static int[] iG;
    /**
     * 当前场景/聊天频道文本（X(DataInputStream) 读取单个 UTF）
     */
    public static String iH;

    // ==================== 背包操作 ====================
    /**
     * 背包操作名称数组（Y(DataInputStream) 按 BaoKuCaoZuo 长度填充）
     */
    public static String[] iI;
    /**
     * 背包操作状态标志（Y() 读取）
     */
    public static byte iJ;
    /**
     * 双槽操作类型 byte[2]（Z() 中 index0/1 分别读取）
     */
    public static byte[] iK;
    /**
     * 双槽操作另一标志 byte[2]
     */
    public static byte[] iL;
    /**
     * 双槽操作 int 值 int[2]
     */
    public static int[] iM;
    /**
     * Z() 方法中的操作模式标志（初始=0，私有）
     */
    private static byte qe;

    // ==================== 物品合成/强化 ====================
    /**
     * 物品合成/强化 ID 数组（aa(DataInputStream) 解析）
     */
    public static int[] iN;
    /**
     * 合成物品名称数组
     */
    public static String[] iO;
    /**
     * 合成物品类型 byte 数组
     */
    public static byte[] iP;
    /**
     * 合成物品子类型 byte 数组
     */
    public static byte[] iQ;
    /**
     * 合成物品等级 short 数组
     */
    public static short[] iR;
    /**
     * 合成描述行1
     */
    public static String[] iS;
    /**
     * 合成描述行2
     */
    public static String[] iT;
    /**
     * 合成描述行3
     */
    public static String[] iU;
    /**
     * 合成描述行4
     */
    public static String[] iV;
    /**
     * 合成描述行5
     */
    public static String[] iW;
    /**
     * 合成描述行6
     */
    public static String[] iX;
    /**
     * 合成物品等级显示 short 数组
     */
    public static short[] iY;
    /**
     * 合成物品过期时间 long 数组
     */
    public static long[] iZ;
    /**
     * 合成物品附加技能说明（可选）
     */
    public static String[] ja;
    /**
     * 合成物品附属 ID 二维数组
     */
    public static short[][] jb;

    // ==================== 坐骑/特效列表 ====================
    /**
     * 坐骑/特效类型 byte 数组（ab(DataInputStream) 解析）
     */
    public static byte[] jc;
    /**
     * 坐骑/特效名称数组
     */
    public static String[] jd;
    /**
     * 坐骑/特效附加描述数组
     */
    public static String[] je;

    // ==================== 通知/公告 ====================
    /**
     * 单条通知/公告 UTF 字符串（ac(DataInputStream) 读取）
     */
    public static String jf;

    // ==================== 资源计数（4组时间戳+short） ====================
    /**
     * 资源1时间戳/计数（ad() 方法读取）
     */
    public static long jg;
    /**
     * 资源1属性 short
     */
    public static short jh;
    /**
     * 资源2时间戳
     */
    public static long ji;
    /**
     * 资源2属性 short
     */
    public static short jj;
    /**
     * 资源3时间戳
     */
    public static long jk;
    /**
     * 资源3属性 short
     */
    public static short jl;
    /**
     * 资源4时间戳
     */
    public static long jm;
    /**
     * 资源4属性 short
     */
    public static short jn;

    // ==================== 交易物品 ====================
    /**
     * 交易/仓库操作类型 byte 数组（ae(DataInputStream) 解析）
     */
    public static byte[] jo;
    /**
     * 交易物品名称数组
     */
    public static String[] jp;
    /**
     * 交易附加描述数组
     */
    public static String[] jq;
    /**
     * 交易物品属性 short 数组（私有）
     */
    private static short[] qf;

    // ==================== 仓库物品列表 ====================
    /**
     * 另一交易/仓库 ID 数组（af(DataInputStream) 解析）
     */
    public static int[] jr;
    /**
     * 仓库物品名称数组
     */
    public static String[] js;
    /**
     * 仓库附加描述数组
     */
    public static String[] jt;
    /**
     * 仓库物品属性 short 数组
     */
    public static short[] ju;
    /**
     * 未知 boolean 标志
     */
    public static boolean jv;
    /**
     * 未知 boolean 标志
     */
    public static boolean jw;
    /**
     * 战斗状态标志 byte1，初始=0
     */
    public static byte jx;
    /**
     * 战斗状态标志 byte2，初始=0
     */
    public static byte jy;

    // ==================== 帮派建筑/功能 ====================
    /**
     * 帮派建筑/功能 ID 数组（ah(DataInputStream) 解析）
     */
    public static int[] jz;
    /**
     * 帮派建筑名称数组
     */
    public static String[] jA;
    /**
     * 帮派建筑属性 int 数组
     */
    public static int[] jB;
    /**
     * 帮派建筑等级 short 数组
     */
    public static short[] jC;
    /**
     * 帮派建筑附加说明（可选）
     */
    public static String[] jD;

    // ==================== 日志/奖励列表 ====================
    /**
     * 日志/奖励名称数组（ai(DataInputStream) 解析）
     */
    public static String[] jE;
    /**
     * 日志/奖励时间戳 long 数组
     */
    public static long[] jF;
    /**
     * 帮派/活动总记录数（aj() 方法读取）
     */
    public static int jG;

    // ==================== 帮派成员/活动记录 ====================
    /**
     * 帮派成员/活动记录 ID 数组（aj() 解析）
     */
    public static int[] jH;
    /**
     * 帮派成员/活动记录名称数组
     */
    public static String[] jI;
    /**
     * 帮派记录类型 byte 数组
     */
    public static byte[] jJ;
    /**
     * 帮派记录等级 short 数组
     */
    public static short[] jK;
    /**
     * 帮派记录附加属性 short（私有）
     */
    private static short[] qg;
    /**
     * 帮派记录描述行1（私有）
     */
    private static String[] qh;
    /**
     * 帮派记录描述行2（私有）
     */
    private static String[] qi;
    /**
     * 帮派记录描述行3（私有）
     */
    private static String[] qj;
    /**
     * 帮派记录描述行4（私有）
     */
    private static String[] qk;
    /**
     * 帮派记录描述行5（私有）
     */
    private static String[] ql;
    /**
     * 帮派记录描述行6（私有）
     */
    private static String[] qm;
    /**
     * 帮派记录过期时间 long 数组
     */
    public static long[] jL;
    /**
     * 帮派记录附加技能说明（可选，私有）
     */
    private static String[] qn;
    /**
     * 帮派记录附属 ID 二维数组
     */
    public static short[][] jM;

    // ==================== 商城/帮派商品 ====================
    /**
     * 商城/帮派商品 ID 数组（ak() 解析）
     */
    public static int[] jN;
    /**
     * 商城商品名称数组（h() 方法显示）
     */
    public static String[] jO;
    /**
     * 商品类型 byte 数组
     */
    public static byte[] jP;
    /**
     * 商品子类型 byte 数组
     */
    public static byte[] jQ;
    /**
     * 商品等级 short 数组
     */
    public static short[] jR;
    /**
     * 商品描述行1（私有）
     */
    private static String[] qo;
    /**
     * 商品描述行2（私有）
     */
    private static String[] qp;
    /**
     * 商品描述行3（私有）
     */
    private static String[] qq;
    /**
     * 商品描述行4（私有）
     */
    private static String[] qr;
    /**
     * 商品描述行5（私有）
     */
    private static String[] qs;
    /**
     * 商品描述行6（私有）
     */
    private static String[] qt;
    /**
     * 商品等级 short 数组（h() 方法显示"等级:"，私有）
     */
    private static short[] qu;
    /**
     * 商品价格 long 数组（h() 方法显示"价格:"，私有）
     */
    private static long[] qv;
    /**
     * 商品技能说明（h() 方法显示，可选，私有）
     */
    private static String[] qw;
    /**
     * 商品附属 ID 二维数组（私有）
     */
    private static short[][] qx;
    /**
     * 商品剩余时间 long 数组（h() 方法显示"剩余时间:"，私有）
     */
    private static long[] qy;

    // ==================== 限时活动/坐骑名称 ====================
    /**
     * 限时活动/坐骑名称数组（al() 解析）
     */
    public static String[] jS;
    /**
     * 限时活动剩余时间 long 数组（al() 解析，私有）
     */
    private static long[] qz;
    /**
     * 限时活动另一字符串数组（al() 解析）
     */
    public static String[] jT;
    /**
     * 限时活动类型 byte 数组（al() 解析，私有）
     */
    private static byte[] qA;
    /**
     * 限时活动另一时间戳 long 数组
     */
    public static long[] jU;

    // ==================== 帮派/活动列表 ====================
    /**
     * 帮派/活动另一名称数组（an() 解析）
     */
    public static String[] jV;
    /**
     * 帮派/活动时间戳 long 数组（私有）
     */
    private static long[] qB;
    /**
     * 帮派/活动另一描述字符串数组
     */
    public static String[] jW;
    /**
     * 帮派/活动另一时间戳 long 数组
     */
    public static long[] jX;

    // ==================== 野外场景 NPC ====================
    /**
     * 野外场景 NPC 名称数组（ao() 解析）
     */
    public static String[] jY;
    /**
     * 野外场景 NPC 描述数组
     */
    public static String[] jZ;
    /**
     * 野外 NPC 类型 byte 数组
     */
    public static byte[] ka;
    /**
     * 野外 NPC 子类型 byte 数组
     */
    public static byte[] kb;
    /**
     * 野外 NPC 标志 byte3 数组
     */
    public static byte[] kc;
    /**
     * 野外 NPC 标志 byte4 数组
     */
    public static byte[] kd;
    /**
     * 未知 int 计数，初始=-1
     */
    public static int ke;
    /**
     * 未知 int 计数，初始=-1
     */
    public static int kf;
    /**
     * 未知 int 计数，初始=-1
     */
    public static int kg;
    /**
     * 战斗/物理相关数值（aq() 解析，初始=100）
     */
    public static int kh;
    /**
     * 战斗/物理相关数值2（aq() 解析，初始=100）
     */
    public static int ki;
    /**
     * 未知 short
     */
    public static short kj;

    // ==================== 服务器通知 ====================
    /**
     * 服务器通知 UTF 字符串（ar() 方法读取单条）
     */
    public static String kk;
    /**
     * 频道/场景通知 UTF 字符串（as() 方法读取）
     */
    public static String kl;

    // ==================== 合成/强化配方 ====================
    /**
     * 合成/强化配方 ID short 数组（at() 解析）
     */
    public static short[] km;
    /**
     * 配方名称数组
     */
    public static String[] kn;
    /**
     * 配方类型 byte 数组（at() 解析，私有）
     */
    private static byte[] qC;
    /**
     * 配方人物等级要求（i() 方法显示"人物等级:"，私有）
     */
    private static short[] qD;
    /**
     * 配方装备等级要求（i() 方法显示"装备等级:"，私有）
     */
    private static short[] qE;
    /**
     * 配方金钱要求（i() 方法显示"要求金钱:"，私有）
     */
    private static long[] qF;
    /**
     * 配方经验要求（i() 方法显示"要求经验:"，私有）
     */
    private static long[] qG;
    /**
     * 配方声望要求（i() 方法显示"要求声望:"，私有）
     */
    private static String[] qH;
    /**
     * 配方需求原料名称二维数组（i() 方法显示"需求原料:"，私有）
     */
    private static String[][] qI;
    /**
     * 配方需求原料数量二维数组（私有）
     */
    private static short[][] qJ;
    /**
     * 配方需求原料数量另一维数组（i() 方法中显示"Xn"，私有）
     */
    private static short[][] qK;
    /**
     * 配方附加描述（i() 方法显示，私有）
     */
    private static String[] qL;

    // ==================== 当前选中物品详情（单例） ====================
    /**
     * 当前选中物品的 ID（多个方法赋值，K() 清空置0）
     */
    public static int ko;
    /**
     * 当前选中物品名称
     */
    public static String kp;
    /**
     * 当前选中物品副名称（a(StringBuffer) 方法使用）
     */
    public static String kq;
    /**
     * 当前选中物品附属 ID 数组（a(StringBuffer) 方法使用）
     */
    public static short[] kr;
    /**
     * 当前选中物品属性描述行1（a(StringBuffer) 中显示）
     */
    public static String ks;
    /**
     * 当前选中物品属性描述行2
     */
    public static String kt;
    /**
     * 当前选中物品属性描述行3
     */
    public static String ku;
    /**
     * 当前选中物品属性描述行4
     */
    public static String kv;
    /**
     * 当前选中物品属性描述行5
     */
    public static String kw;
    /**
     * 当前选中物品属性描述行6
     */
    public static String kx;
    /**
     * 当前选中物品等级要求（a(StringBuffer) 中显示"要求等级:"）
     */
    public static short ky;
    /**
     * 当前选中物品绑定状态（a(StringBuffer) 中显示"状态:已绑定/装备绑定"）
     */
    public static byte kz;
    /**
     * 当前选中物品附加技能说明（a(StringBuffer) 中显示）
     */
    public static String kA;

    // ==================== 装备强化/附魔 ====================
    /**
     * 装备强化/附魔物品 ID 数组（aw() 解析）
     */
    public static int[] kB;
    /**
     * 装备强化名称数组（aw() 解析，私有）
     */
    private static String[] qM;
    /**
     * 装备强化附加描述数组（私有）
     */
    private static String[] qN;
    /**
     * 强化等级 short 数组（私有）
     */
    private static short[] qO;
    /**
     * 强化附属 ID 二维数组（私有）
     */
    private static short[][] qP;
    /**
     * 强化属性 short1（私有）
     */
    private static short[] qQ;
    /**
     * 强化属性 short2（私有）
     */
    private static short[] qR;
    /**
     * 强化属性 short3（私有）
     */
    private static short[] qS;
    /**
     * 强化属性 short4（私有）
     */
    private static short[] qT;
    /**
     * 强化属性 short5（私有）
     */
    private static short[] qU;
    /**
     * 强化属性 short6（私有）
     */
    private static short[] qV;
    /**
     * 强化属性 short7（私有）
     */
    private static short[] qW;
    /**
     * 强化属性 short8（私有）
     */
    private static short[] qX;
    /**
     * 强化属性 short9（私有）
     */
    private static short[] qY;
    /**
     * 强化属性 short10（私有）
     */
    private static short[] qZ;
    /**
     * 强化属性 short11（私有）
     */
    private static short[] ra;
    /**
     * 强化属性 short12（私有）
     */
    private static short[] rb;
    /**
     * 强化过期时间 long 数组（私有）
     */
    private static long[] rc;
    /**
     * 强化附加描述（可选字符串，私有）
     */
    private static String[] rd;
    /**
     * 强化附属名称二维数组（私有）
     */
    private static String[][] re;
    /**
     * 强化附属 ID 二维数组（私有）
     */
    private static short[][] rf;
    /**
     * 强化附属另一 ID 二维数组（私有）
     */
    private static short[][] rg;
    /**
     * 聊天/系统通知 UTF 字符串（ax() 方法读取）
     */
    public static String kC;
    /**
     * 展示物品/图标类型标志（ay() 方法读取）
     */
    public static byte kD;
    /**
     * 展示物品名称数组（ay() 解析）
     */
    public static String[] kE;
    /**
     * 展示物品描述字符串数组
     */
    public static String[] kF;

    // ==================== 任务快捷入口 ====================
    /**
     * 任务快捷入口名称数组（aD() 解析）
     */
    public static String[] kH;
    /**
     * 任务快捷入口属性 short 数组（aD() 解析，私有）
     */
    private static short[] rh;
    /**
     * 任务/功能类型标志 byte（aD()/aE() 方法读取，初始=0）
     */
    public static byte kI;

    // ==================== 副本/活动列表 ====================
    /**
     * 副本/活动 ID 数组（aE() 解析）
     */
    public static int[] kJ;
    /**
     * 副本/活动名称数组
     */
    public static String[] kK;
    /**
     * 副本/活动描述1数组
     */
    public static String[] kL;
    /**
     * 副本/活动描述2数组
     */
    public static String[] kM;
    /**
     * 副本/活动属性 short 数组（aE() 解析，私有）
     */
    private static short[] ri;
    /**
     * 副本总数 short（aE() 读取）
     */
    public static short kN;
    /**
     * 当前副本/活动选中 ID（aG() 读取）
     */
    public static int kO;
    /**
     * 副本状态标志（aG() 读取，0或3时读取 kS，初始=0）
     */
    public static byte kP;
    /**
     * 副本/活动公告字符串（aG() 读取，初始=null）
     */
    public static String kQ;
    /**
     * 副本活动奖励列表字符串数组（aG() 解析）
     */
    public static String[] kR;
    /**
     * 副本/活动附加 short（kP==0或3时读取）
     */
    public static short kS;
    /**
     * 副本/活动数据就绪标志（aG() 中置true）
     */
    public static boolean kT;

    // ==================== 帮派/功能类型 ====================
//    /**
//     * 帮派/功能类型 byte1（aH() 读取）
//     */
//    public static byte kUUUUUU;
//    /**
//     * 帮派/功能类型 byte2
//     */
//    public static byte kVVVVVVV;
    /**
     * 帮派/功能相关 9个 int 值（aH() 读取，长度固定9，私有）
     */
    private static int[] rj;
    /**
     * 帮派/功能相关 UTF 字符串（aH() 读取，初始=""）
     */
    public static String kW;

    // ==================== 地图/场景资源 ====================
    /**
     * 服务器压缩资源(ZipRes)缓存列表（parseServerRes 解析8245包，私有）
     */
    private static Vector serverZipResList;
    /**
     * 当前地图名称字符串
     */
    public static String currentMapName;
    /**
     * 地图附加资源(g对象)列表（aK() 维护）
     */
    public static Vector kY;
    /**
     * 未知 short，初始=0
     */
    public static short kZ;

    // ==================== 地图/任务标签 ====================
    /**
     * 地图/任务标签名称数组（aL() 解析，由 le 控制数量）
     */
    public static String[] la;
    /**
     * 地图/任务标签描述1数组
     */
    public static String[] lb;
    /**
     * 地图/任务标签描述2数组
     */
    public static String[] lc;
    /**
     * 地图/任务标签描述3数组
     */
    public static String[] ld;
    /**
     * 任务标签总数（用于 aL() 初始化 la/lb/lc/ld 数组大小，初始=0）
     */
    public static short le;
    /**
     * 未知 String
     */
    public static String lf;
    /**
     * 任务/成就颜色标志 byte（初始=1）
     */
    public static byte lg;
    /**
     * 未知 String（初始=null）
     */
    public static String lh;

    // ==================== 任务分类/详情 ====================
    /**
     * 任务分类名称数组（aM() 解析，由 ll 控制数量，私有）
     */
    private static String[] rm;
    /**
     * 任务详情描述数组（aM() 解析）
     */
    public static String[] li;
    /**
     * 任务完成状态 short 数组（aM() 中判断1=已完成，私有）
     */
    private static short[] rn;
    /**
     * 任务完成状态文字（aM() 中赋值"已完成"/"未完成"，Q() 清空）
     */
    public static String[] lj;
    /**
     * 任务详情附加字符串（aM() 解析）
     */
    public static String[] lk;
    /**
     * 任务详情总数（用于 aM() 初始化数组，初始=0）
     */
    public static short ll;
    /**
     * 任务完成颜色标志（初始=0，aM() 中用于 pickColor）
     */
    public static byte lm;
    /**
     * 任务完成状态颜色 int 数组（aM() 中 pickColor 赋值，Q() 清空）
     */
    public static int[] ln;
    /**
     * 未知 String（初始=null）
     */
    public static String lo;
    /**
     * 任务分页当前页，初始=1（P() 中重置为1）
     */
    public static short lp;
    /**
     * 任务分页附加标志（P() 中重置为0）
     */
    public static byte lq;
    /**
     * 任务详情当前页，初始=1（Q() 中重置为1）
     */
    public static short lr;
    /**
     * 任务详情附加标志（Q() 中重置为0）
     */
    public static byte ls;

    // ==================== 多场景/任务 ====================
    /**
     * 多场景/任务 short 数组（初始化为{-1,-1,-1}，aO()/aP() 中赋值）
     */
    public static short[] lt;
    /**
     * aO() 中读取并赋给 lt[1] 的场景 ID，初始=-1
     */
    public static short lu;
    /**
     * 场景类型 int（aO() 读取，==2时读 lC，初始=-1）
     */
    public static int lv;
    /**
     * 场景说明字符串（aO() 读取，初始=null）
     */
    public static String lw;
    /**
     * 场景开关标志（aO() 中 readByte==1，初始=false）
     */
    public static boolean lx;
    /**
     * 场景附加标志 byte（aO() 读取，初始=0）
     */
    public static byte ly;
    /**
     * 场景选项名称数组（aO() 读取）
     */
    public static String[] lz;
    /**
     * 场景选项描述数组
     */
    public static String[] lA;
    /**
     * 场景选项附加描述数组
     */
    public static String[] lB;
    /**
     * 场景附加文字（lv==2时读取，初始=null）
     */
    public static String lC;
    /**
     * aP() 中读取并赋给 lt[0] 的场景 ID，初始=-1
     */
    public static short lD;
    /**
     * 另一场景类型（aP() 读取，==2时读 mi，初始=-1）
     */
    public static int lE;
    /**
     * 另一场景说明字符串（aP() 读取，初始=null）
     */
    public static String lF;
    /**
     * 场景选项类型 int 数组（从 readByte 扩展，aP() 解析）
     */
    public static int[] lG;
    /**
     * 场景选项属性 int 数组（从 readShort 扩展）
     */
    public static int[] lH;
    /**
     * 场景选项另一属性（从 readByte 扩展）
     */
    public static int[] lI;

    // ==================== 场景奖励列表 ====================
    /**
     * 场景奖励名称字符串数组（aP() 解析）
     */
    public static String[] lJ;
    /**
     * 场景奖励描述1字符串数组
     */
    public static String[] lK;
    /**
     * 场景奖励描述2数组
     */
    public static String[] lL;
    /**
     * 场景奖励描述3数组
     */
    public static String[] lM;
    /**
     * 场景奖励描述4数组
     */
    public static String[] lN;
    /**
     * 场景奖励描述5数组
     */
    public static String[] lO;
    /**
     * 场景奖励图标/图片路径（aP() 解析，空串置null）
     */
    public static String[] lP;
    /**
     * 场景奖励属性 short 数组
     */
    public static short[] lQ;
    /**
     * 场景奖励颜色 int 数组（pickColor 转换）
     */
    public static int[] lR;
    /**
     * 场景奖励描述6数组
     */
    public static String[] lS;
    /**
     * 场景奖励描述7数组
     */
    public static String[] lT;
    /**
     * 场景奖励描述8数组
     */
    public static String[] lU;
    /**
     * 场景奖励描述9数组
     */
    public static String[] lV;
    /**
     * 场景奖励描述10数组
     */
    public static String[] lW;
    /**
     * 场景奖励另一图标路径（aP() 解析，空串置null）
     */
    public static String[] lX;
    /**
     * 场景奖励另一属性 short 数组
     */
    public static short[] lY;
    /**
     * 场景奖励另一颜色 int 数组
     */
    public static int[] lZ;
    /**
     * 场景奖励批次/附加描述1数组
     */
    public static String[] ma;
    /**
     * 场景奖励批次/附加描述2数组
     */
    public static String[] mb;
    /**
     * 场景奖励批次/附加描述3数组
     */
    public static String[] mc;
    /**
     * 场景奖励批次/附加描述4数组
     */
    public static String[] md;
    /**
     * 场景奖励批次/附加描述5数组
     */
    public static String[] me;
    /**
     * 场景奖励另一图标路径2（aP() 解析，空串置null）
     */
    public static String[] mf;
    /**
     * 场景奖励另一 short 属性2数组
     */
    public static short[] mg;
    /**
     * 场景奖励颜色2 int 数组
     */
    public static int[] mh;
    /**
     * 另一场景附加文字（lE==2时读取）
     */
    public static String mi;

    // ==================== 帮派/公会排行 ====================
    /**
     * 帮派/公会排行标志 byte（aQ() 读取）
     */
    public static byte mj;
    /**
     * 帮派/公会排行名称数组（aQ() 解析）
     */
    public static String[] mk;
    /**
     * 帮派/公会排行描述数组
     */
    public static String[] ml;
    /**
     * 帮派排行类型 int 数组（aQ() 读取，用于索引 ro 数组）
     */
    public static int[] mm;
    /**
     * 帮派排行状态文字（由 mm 索引 ro 静态数组获取）
     */
    public static String[] mn;
    /**
     * 帮派排行附加描述数组
     */
    public static String[] mo;
    /**
     * 帮派排行颜色 int 数组（pickColor 转换）
     */
    public static int[] mp;
    /**
     * 帮派排行状态枚举（静态块初始化{"已获得","激活","未获得"}，私有）
     */
    private static String[] ro;

    // ==================== 联赛/广播消息 ====================
    /**
     * 联赛/广播消息类型标志（aR() 读取）
     */
    public static byte mq;
    /**
     * 联赛/广播消息内容（aR() 读取）
     */
    public static String mr;
    /**
     * 消息附加标志 byte1（aR() 读取）
     */
    public static byte ms;
    /**
     * 消息附加标志 byte2
     */
    public static byte mt;
    /**
     * 联赛/广播消息列表1（aR() 读取）
     */
    public static String[] mu;
    /**
     * 联赛/广播消息列表2（aR() 读取，R() 清空）
     */
    public static String[] mv;
    /**
     * 战斗/战报 UTF 字符串（b(DataInputStream, byte) 中 var1==1时读取）
     */
    public static String mw;

    // ==================== 战斗宠物（主/副/三阶） ====================
    /**
     * 主战斗宠物在 fA 中的 ID（aS() 中 rp==0时赋值，T() 重置为-1）
     */
    public static int mx;
    /**
     * 主战斗宠物属性1 short（b(byte,int) 中 fE[var3] 赋值）
     */
    public static short my;
    /**
     * 主战斗宠物属性2 short
     */
    public static short mz;
    /**
     * 主战斗宠物属性3 short
     */
    public static short mA;
    /**
     * 主战斗宠物属性4 short
     */
    public static short mB;
    /**
     * 主战斗宠物描述字符串（b() 中格式化"名称:/等级:/星级:"）
     */
    public static String mC;
    /**
     * 副战斗宠物在 fA 中的 ID（aS() 中 rp==1时赋值，T() 重置为-1）
     */
    public static int mD;
    /**
     * 副战斗宠物属性1 short
     */
    public static short mE;
    /**
     * 副战斗宠物属性2 short
     */
    public static short mF;
    /**
     * 副战斗宠物属性3 short
     */
    public static short mG;
    /**
     * 副战斗宠物属性4 short
     */
    public static short mH;
    /**
     * 副战斗宠物描述字符串
     */
    public static String mI;
    /**
     * 第三槽/三阶战斗宠物 ID 数组（aS() 中 rp==2时按槽位赋值，T() 重置为-1，3个元素）
     */
    public static int[] mJ;
    /**
     * 三阶战斗宠物等级 short 数组（3个元素）
     */
    public static short[] mK;
    /**
     * 三阶战斗宠物名称数组（3个元素）
     */
    public static String[] mL;
    /**
     * 战斗宠物操作类型（aS() 读取，0/1/2/3/4/5/6各代表不同操作，私有）
     */
    private static byte rp;
    /**
     * 战斗宠物操作提示字符串（aS() 多种 rp 情况下读取）
     */
    public static String mM;
    /**
     * 主战斗宠物附加字符串（aS() 中 rp==0时读取）
     */
    public static String mN;

    // ==================== 特效/动态展示 ====================
    /**
     * 特效/动态展示名称数组（aT() 解析）
     */
    public static String[] mO;
    /**
     * 特效描述字符串数组
     */
    public static String[] mP;
    /**
     * 特效类型 int 数组
     */
    public static int[] mQ;
    /**
     * 特效动画索引 short 数组
     */
    public static short[] mR;
    /**
     * 特效附加字符串数组
     */
    public static String[] mS;

    // ==================== 开关/福利 ====================
    /**
     * 开关/福利类型标志 UTF（aU() 读取，长度<=0置null）
     */
    public static String mT;
    /**
     * 开关/福利另一字符串（aU() 声明但清空分支未赋值）
     */
    public static String mU;
    /**
     * 福利物品 ID 数组（aU() 解析）
     */
    public static int[] mV;
    /**
     * 福利物品名称数组
     */
    public static String[] mW;
    /**
     * 福利物品属性 short 数组
     */
    public static short[] mX;
    /**
     * 福利物品描述字符串数组
     */
    public static String[] mY;

    // ==================== 抽奖/签到活动 ====================
    /**
     * 抽奖/签到活动名称1（aV() 读取，长度<=0置null）
     */
    public static String mZ;
    /**
     * 抽奖/签到活动名称2（aV() 读取，与 mZ 配对）
     */
    public static String na;
    /**
     * 抽奖/签到奖励 ID 数组（aV() 解析）
     */
    public static int[] nb;
    /**
     * 抽奖奖励名称数组
     */
    public static String[] nc;
    /**
     * 抽奖奖励描述数组
     */
    public static String[] nd;

    // ==================== 抽奖/转盘槽位 ====================
    /**
     * 抽奖/转盘槽位类型标识数组（aW() 初始化为"MONEY"，最多4格）
     */
    public static String[] ne;
    /**
     * 抽奖槽位数量值（私有）
     */
    private static int[] rq;
    /**
     * 抽奖槽位描述1数组（aW() 解析）
     */
    public static String[] nf;
    /**
     * 抽奖槽位描述2数组
     */
    public static String[] ng;
    /**
     * 抽奖需求说明 UTF（aW() 最后读取）
     */
    public static String nh;
    /**
     * 抽奖结果消息（aX() 读取，W() 清空）
     */
    public static String ni;
    /**
     * 抽奖所得物品 ID/类型（aX() 中 readByte!=-1时读取，W() 清空）
     */
    public static String nj;
    /**
     * 抽奖所得物品数量（aX() 读取，W() 置0）
     */
    public static int nk;
    /**
     * 抽奖所得物品名称（nj!="MONEY"时读取，W() 清空）
     */
    public static String nl;

    // ==================== 骑术/坐骑信息 ====================
    /**
     * 骑术等级 short（aY()/aZ() 读取，nt 中拼接"当前骑术等级为{rr}"，私有）
     */
    private static short rr;
    /**
     * 当前骑乘状态标志（aY()/ba() 读取；parseBackPack中也读取，>0表示有坐骑）
     */
    public static byte currentCycling;
    /**
     * 当前坐骑图标名称（nm>0时读取；parseBackPack中也读取）
     */
    public static String roleCurrentRideIcon = "";
    /**
     * 坐骑属性 short1（nm>0时读取）
     */
    public static short rideAttr1;
    /**
     * 坐骑属性 short2
     */
    public static short rideAttr2;
    /**
     * 坐骑属性 short3
     */
    public static short rideAttr3;
    /**
     * 骑术相关说明字符串（aY()/aZ() 读取）
     */
    public static String nr;
    /**
     * 骑术附加说明字符串（aY()/aZ() 读取）
     */
    public static String ns;
    /**
     * 骑术等级描述字符串（aY()/aZ() 中格式化"当前骑术等级为{rr}\t..."）
     */
    public static String nt;
    /**
     * 坐骑颜色/外观 ID short 数组（aY()/ba() 中 nm>0时解析，私有）
     */
    private static short[] rs;
    /**
     * 坐骑颜色名称数组（私有）
     */
    private static String[] rt;
    /**
     * 坐骑颜色属性1（私有）
     */
    private static short[] ru;
    /**
     * 坐骑颜色属性2（私有）
     */
    private static short[] rv;
    /**
     * 坐骑颜色属性3（私有）
     */
    private static short[] rw;
    /**
     * 坐骑颜色附加描述数组（私有）
     */
    private static String[] rx;
    /**
     * 坐骑颜色颜色 int 数组（aY() 中 readInt 赋值，私有）
     */
    private static int[] ry;
    /**
     * 坐骑颜色另一颜色 int 数组（aY() 中 readInt 赋值，私有）
     */
    private static int[] rz;
    /**
     * 另一坐骑/骑行等级 byte 数组（aY() 末尾解析）
     */
    public static byte[] nu;
    /**
     * 坐骑等级名称数组（aY() 解析，私有）
     */
    private static String[] rA;
    /**
     * 坐骑等级描述字符串数组
     */
    public static String[] nv;
    /**
     * 坐骑等级 short 数组（私有）
     */
    private static short[] rB;
    /**
     * 坐骑等级类型/状态标志 byte 数组
     */
    public static byte[] nw;

    // ==================== 成就/称号 ====================
    /**
     * 成就/称号名称数组（bb() 解析）
     */
    public static String[] nx;
    /**
     * 成就/称号描述1数组
     */
    public static String[] ny;
    /**
     * 成就/称号描述2数组
     */
    public static String[] nz;
    /**
     * 成就/称号描述3数组
     */
    public static String[] nA;
    /**
     * 未知 byte（bc() 读取）
     */
    public static byte nB;
    /**
     * 未知 String 数组（从代码结尾声明，未见赋值方法）
     */
    public static String[] nC;

    public static boolean a(byte var0) {
        return b(var0) || c(var0);
    }

    public static boolean b(byte var0) {
        return var0 == 0 || var0 == 1 || var0 == 2 || var0 == 3 || var0 == 4 || var0 == 5 || var0 == 6 || var0 == 7 || var0 == 8 || var0 == 9;
    }

    public static boolean c(byte var0) {
        return var0 == 20 || var0 == 21 || var0 == 22 || var0 == 23 || var0 == 24 || var0 == 25;
    }

    public static void a() {
        if (I != null) {
            for (int var0 = 0; var0 < I.length; ++var0) {
                if (I[var0] != null) {
                    I[var0].e();
                    I[var0] = null;
                }
            }

            I = null;
        }

        if (N != null) {
            for (int var1 = 0; var1 < N.length; ++var1) {
                if (N[var1] != null) {
                    N[var1].b();
                    N[var1] = null;
                }
            }

            N = null;
        }

        if (J != null) {
            for (int var2 = 0; var2 < J.length; ++var2) {
                if (J[var2] != null) {
                    J[var2].e();
                    J[var2] = null;
                }
            }

            J = null;
        }

    }

    public static void b() {
        if (teamBonus != null) {
            for (int var0 = 0; var0 < teamBonus.length; ++var0) {
                if (teamBonus[var0] != null) {
                    bp_1 var1;
                    if ((var1 = teamBonus[var0]).frame1 != null) {
                        Frame1 var2 = var1.frame1;
                    }

                    var1.b = null;
                    var1.name = null;
                    var1.c = null;
                    var1.frame1 = null;
                    if (var1.f != null) {
                        var1.f.removeAllElements();
                        var1.f = null;
                    }

                    teamBonus[var0] = null;
                }
            }

            teamBonus = null;
        }

    }

    public static void c() {
        if (o != null) {
            for (int var0 = 0; var0 < o.length; ++var0) {
                if (o[var0] != null) {
                    bl var1;
                    (var1 = o[var0]).a = null;
                    var1.name = null;
                    var1.b = null;
                    if (var1.frame1 != null) {
                        Frame1 var2 = var1.frame1;
                    }

                    var1.frame1 = null;
                    if (var1.f != null) {
                        var1.f.removeAllElements();
                        var1.f = null;
                    }

                    o[var0] = null;
                }
            }

            o = null;
        }

    }

    public static void d() {
        if (npcObjects != null) {
            for (int var0 = 0; var0 < npcObjects.length; ++var0) {
                if (npcObjects[var0] != null) {
                    NpcObject var1;
                    if ((var1 = npcObjects[var0]).frame1 != null) {
                        Frame1 var2 = var1.frame1;
                    }

                    var1.b = null;
                    npcObjects[var0] = null;
                }
            }

            npcObjects = null;
        }

    }

    /**
     * 解析角色列表包(8195)：读取账号下所有角色的 id/昵称/职业/性别/等级，存入 roleIdList 等数组。
     */
    public static void parseRoleList(DataInputStream dis) throws IOException {
        byte roleNum = dis.readByte();
        if (roleNum == 0) {
            clearRoleList();
        } else {
            roleIdList = new String[roleNum];
            roleLevelList = new short[roleNum];
            roleJobList = new byte[roleNum];
            roleGenderList = new byte[roleNum];
            roleNicknameList = new String[roleNum];

            for (int i = 0; i < roleNum; ++i) {
                roleIdList[i] = dis.readUTF();
                roleLevelList[i] = dis.readShort();
                roleJobList[i] = dis.readByte();
                roleGenderList[i] = dis.readByte();
                roleNicknameList[i] = dis.readUTF();
                //roleFlagList
                dis.readByte();
            }

            for (int i = 0; i < roleNum; ++i) {
                dis.readUTF();
                dis.readUTF();
                dis.readUTF();
            }

            dis.readUTF();
        }
    }

    public static void clearRoleList() {
        if (roleIdList != null) {
            Arrays.fill(roleIdList, null);
            roleIdList = null;
        }

        roleLevelList = null;
        roleJobList = null;
        roleGenderList = null;
        if (roleNicknameList != null) {
            Arrays.fill(roleNicknameList, null);
            roleNicknameList = null;
        }
    }

    /**
     * 解析装备数据包(8200)：读取装备槽数量及各槽位 id/耐久，存入 ab/ac 数组。
     */
    public static void b(DataInputStream var0) throws IOException {
        byte var1;
        ab = new short[var1 = var0.readByte()];
        ac = new short[var1];

        for (int var2 = 0; var2 < var1; ++var2) {
            ab[var2] = var0.readShort();
            ac[var2] = var0.readShort();
        }

    }

    public static void f() {
        ab = null;
        ac = null;
    }

    /**
     * 解析角色移动/位置包(8199)：读取场景id、地图名称、目标坐标及方向标志，存入 ar/ae/at/au/av/aw 等字段。
     */
    public static void c(DataInputStream var0) throws IOException {
        ar = var0.readShort();
        ae = var0.readUTF();
        at = var0.readShort();
        au = var0.readShort();
        av = var0.readByte();
        aw = var0.readByte();
        bw = var0.readByte();
        bx = var0.readByte();
    }

    public static void g() {
        if (nF != -1) {
            currentHealth = nF;
            totalMana = nH;
            totalHealth = nE;
            currentMana = nG;
        }

        nF = -1;
        nH = -1;
        nE = -1;
        nG = -1;
    }

    public static void clearRoleInfo() {
        roleId_2 = null;
        roleNamePure = null;
        roleNameVip = null;
        roleTitle = null;
        roleNameColor = 16776960;
        jingyan = null;
    }

    /**
     * 解析背包数据包(8197)：读取背包名称、银两、容量等元信息及物品列表，存入 ad/ak/ag 等字段及 p[] 数组。
     */
    public static void parseBackPack(DataInputStream dis) throws IOException {
        roleId_2 = dis.readUTF();
        backpackCapacityLimit = dis.readShort();
        roleNameVip = dis.readUTF();
        backPackFlag = dis.readByte();
        backpackRows = dis.readByte();
        roleTitle = dis.readUTF();
        roleNameColor = LoadingPage.pickColor(dis.readByte());
        versus = dis.readLong();
        bullions = dis.readLong();
        jingyan = dis.readUTF();
        xiulian = dis.readLong();
        xiulianLimit = dis.readLong();
        combatPower = dis.readLong();
        currentHealth = dis.readInt();
        totalHealth = dis.readInt();
        totalMana = dis.readInt();
        currentMana = dis.readInt();
        attack = dis.readInt();
        attack2 = dis.readInt();
        defense = dis.readInt();
        defense2 = dis.readInt();
        magicAttack_1 = dis.readInt();
        magicAttack_1_2 = dis.readInt();
        speed = dis.readInt();
        iceResistance = dis.readInt();
        fireResistance = dis.readInt();
        lightningResistance = dis.readInt();
        if ((selectedMount = dis.readShort()) > -1) {
            mountX = dis.readShort();
            mountY = dis.readShort();
            mountDirection = dis.readShort();
        }

        bless = dis.readUTF();
        bf = dis.readShort();
        attributeBonus = dis.readByte();
        gangs2 = dis.readUTF();
        gangsJob = dis.readUTF();
        meritorious = dis.readInt();
        ay = dis.readByte();
        houseName = dis.readUTF();
        gangs = dis.readUTF();
        equip = dis.readUTF();
        spouse = dis.readUTF();
        master = dis.readUTF();
        spellDamage = dis.readInt();
        magicAttack2 = dis.readInt();
        magicAttack = dis.readInt();
        vipLevel = dis.readByte();
        if (roleNameVip.endsWith("(VIP" + vipLevel + ")")) {
            roleNamePure = roleNameVip.substring(0, roleNameVip.length() - ("(VIP" + vipLevel + ")").length());
        } else {
            roleNamePure = roleNameVip;
        }

        title = dis.readUTF();
        xxRecords = dis.readUTF();
        achievement = dis.readUTF();
        if (xxRecords == null || xxRecords.length() == 0) {
            xxRecords = "暂无记录。";
        }

        //超Q等级或类型
        dis.readByte();
        if ((currentCycling = dis.readByte()) > 0) {
            roleCurrentRideIcon = dis.readUTF();
            rideAttr1 = dis.readShort();
            rideAttr2 = dis.readShort();
            rideAttr3 = dis.readShort();
        } else {
            roleCurrentRideIcon = "";
            rideAttr1 = 0;
            rideAttr2 = 0;
            rideAttr3 = 0;
        }

        finalDesc = dis.readUTF();
    }

    /**
     * 解析装备槽数据包(8201)：读取装备槽更新列表，重建 bC 集合中的装备槽对象。
     */
    public static void e(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) > 0) {
            bC.removeAllElements();
            bC = new Vector();
            Object var2 = null;

            for (short var3 = 0; var3 < var1; ++var3) {
                bn var4;
                (var4 = new bn()).a(var0);
                bC.addElement(var4);
            }
        } else {
            i();
        }

        var0.readShort();
        bD = true;
    }

    public static void i() {
        if (bC != null) {
            short var0 = (short) bC.size();
            bn var1 = null;
            --var0;

            for (; var0 >= 0; --var0) {
                if ((var1 = (bn) bC.elementAt(var0)) != null) {
                    var1.b = null;
                    var1.s = null;
                    var1.u = null;
                }
            }

            bC.removeAllElements();
        }

    }

    public static void f(DataInputStream var0) throws IOException {
        short var1 = var0.readShort();
        short[] var2 = null;
        if (var1 > 0) {
            var2 = new short[var1];

            for (short var3 = 0; var3 < var1; ++var3) {
                var2[var3] = var0.readShort();
            }
        }

        if (var2 != null && var2.length > 0 && bC.size() > 0) {
            Object var11 = null;

            for (short var6 = (short) (bC.size() - 1); var6 >= 0; --var6) {
                bn var12;
                if ((var12 = (bn) bC.elementAt(var6)) != null) {
                    for (short var4 = 0; var4 < var2.length; ++var4) {
                        if (var12.h == var2[var4]) {
                            bC.removeElementAt(var6);
                            break;
                        }
                    }
                }
            }
        }

        short var13;
        if ((var13 = var0.readShort()) > 0) {
            Vector var7 = new Vector();
            bn var16 = null;

            for (short var8 = 0; var8 < var13; ++var8) {
                bn var17;
                (var17 = new bn()).a(var0);
                var7.addElement(var17);
            }

            bn var9 = null;

            for (short var5 = (short) (var7.size() - 1); var5 >= 0; --var5) {
                if ((var16 = (bn) var7.elementAt(var5)) != null) {
                    for (short var14 = 0; var14 < bC.size(); ++var14) {
                        if ((var9 = (bn) bC.elementAt(var14)) != null && var16.h == var9.h) {
                            var9.a = var16.a;
                            var9.b = var16.b;
                            var9.c = var16.c;
                            var9.d = var16.d;
                            var9.e = var16.e;
                            var9.f = var16.f;
                            var9.g = var16.g;
                            var9.h = var16.h;
                            var9.i = var16.i;
                            var9.j = var16.j;
                            var9.k = var16.k;
                            var9.l = var16.l;
                            var9.m = var16.m;
                            var9.n = var16.n;
                            var9.o = var16.o;
                            var9.p = var16.p;
                            var9.q = var16.q;
                            var9.r = var16.r;
                            var9.s = var16.s;
                            var9.t = var16.t;
                            var9.u = var16.u;
                            var7.removeElementAt(var5);
                        }
                    }
                }
            }

            var13 = (short) var7.size();

            for (short var20 = 0; var20 < var13; ++var20) {
                if ((var16 = (bn) var7.elementAt(var20)) != null) {
                    bC.addElement(var16);
                }
            }

            var7.removeAllElements();
        }

        var0.readShort();
        bD = true;
    }

    public static void g(DataInputStream var0) throws IOException {
        bQ = var0.readUTF();
        byte var1;
        if ((var1 = var0.readByte()) <= 0) {
            j();
        } else {
            bI = new int[var1];
            bJ = new String[var1];
            nI = new short[var1];
            bK = new byte[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                bI[var2] = var0.readInt();
                bJ[var2] = var0.readUTF();
                nI[var2] = var0.readShort();
                bK[var2] = var0.readByte();
            }

        }
    }

    public static void j() {
        bI = null;
        if (bJ != null) {
            for (int var0 = 0; var0 < bJ.length; ++var0) {
                bJ[var0] = null;
            }

            bJ = null;
        }

        nI = null;
        bK = null;
        bH = null;
    }

    /**
     * 解析任务列表包(8223)：读取进行中及可接取的任务 id/名称/等级/类型，分别存入 bR/bS/bT/bU 及 bL/bM/bN/bO 数组。
     */
    public static void h(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) > 0) {
            bR = new int[var1];
            bS = new String[var1];
            bT = new short[var1];
            bU = new byte[var1];
            bV = new String[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                bR[var2] = var0.readInt();
                bS[var2] = var0.readUTF();
                bT[var2] = var0.readShort();
                bU[var2] = var0.readByte();
                bV[var2] = var0.readUTF();
            }
        } else {
            bR = null;
            if (bS != null) {
                for (int var6 = 0; var6 < bS.length; ++var6) {
                    bS[var6] = null;
                }

                bS = null;
            }

            bT = null;
            bU = null;
            if (bV != null) {
                for (int var7 = 0; var7 < bV.length; ++var7) {
                    bV[var7] = null;
                }

                bV = null;
            }
        }

        DataInputStream var8 = var0;
        short var3;
        if ((var3 = var0.readShort()) > 0) {
            bL = new int[var3];
            bM = new String[var3];
            bN = new short[var3];
            bO = new int[var3];
            bP = new String[var3];

            for (int var9 = 0; var9 < var3; ++var9) {
                bL[var9] = var8.readInt();
                bM[var9] = var8.readUTF();
                bN[var9] = var8.readShort();
                bO[var9] = var8.readInt();
                bP[var9] = var8.readUTF();
            }

        } else {
            bL = null;
            if (bM != null) {
                for (int var4 = 0; var4 < bM.length; ++var4) {
                    bM[var4] = null;
                }

                bM = null;
            }

            bN = null;
            if (bP != null) {
                for (int var5 = 0; var5 < bP.length; ++var5) {
                    bP[var5] = null;
                }

                bP = null;
            }

        }
    }

    public static void i(DataInputStream var0) throws IOException {
        if (bW = var0.readByte() == 1) {
            bX = var0.readInt();
        } else {
            bX = -1;
        }

        short var1;
        if ((var1 = var0.readShort()) > 0) {
            boolean var2 = false;
            bY = new int[var1];
            bZ = new String[var1];
            ca = new byte[var1];
            cb = new short[var1];
            cc = new short[var1];
            cd = new short[var1];
            ce = new short[var1];
            cf = new short[var1];
            cg = new short[var1];
            ch = new short[var1];
            ci = new short[var1];
            cj = new short[var1];
            ck = new short[var1];
            cl = new short[var1];
            cm = new short[var1];
            cn = new short[var1];
            co = new short[var1];
            cp = new long[var1];
            cq = new String[var1];

            for (int var3 = 0; var3 < var1; ++var3) {
                bY[var3] = var0.readInt();
                bZ[var3] = var0.readUTF();
                ca[var3] = var0.readByte();
                cb[var3] = var0.readShort();
                cc[var3] = var0.readShort();
                cd[var3] = var0.readShort();
                ce[var3] = var0.readShort();
                cf[var3] = var0.readShort();
                cg[var3] = var0.readShort();
                ch[var3] = var0.readShort();
                ci[var3] = var0.readShort();
                cj[var3] = var0.readShort();
                ck[var3] = var0.readShort();
                cl[var3] = var0.readShort();
                cm[var3] = var0.readShort();
                cn[var3] = var0.readShort();
                co[var3] = var0.readShort();
                cp[var3] = var0.readLong();
                if (var0.readByte() > 0) {
                    cq[var3] = var0.readUTF();
                }
            }

        } else {
            k();
        }
    }

    public static void k() {
        bY = null;
        cp = null;
        ca = null;
        cb = null;
        cc = null;
        cd = null;
        ce = null;
        cf = null;
        cg = null;
        ch = null;
        ci = null;
        cj = null;
        ck = null;
        cl = null;
        cm = null;
        cn = null;
        co = null;
        if (cq != null) {
            for (int var0 = 0; var0 < cq.length; ++var0) {
                cq[var0] = null;
            }

            cq = null;
        }

        if (bZ != null) {
            for (int var1 = 0; var1 < bZ.length; ++var1) {
                bZ[var1] = null;
            }

            bZ = null;
        }

    }

    public static void j(DataInputStream var0) throws IOException {
        byte var1;
        if ((var1 = var0.readByte()) <= 0) {
            l();
        } else {
            cr = new short[var1];
            cs = new String[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                cr[var2] = var0.readShort();
                cs[var2] = var0.readUTF();
            }

        }
    }

    public static void l() {
        cr = null;
        if (cs != null) {
            for (int var0 = 0; var0 < cs.length; ++var0) {
                cs[var0] = null;
            }

            cs = null;
        }

    }

    public static void k(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) <= 0) {
            m();
        } else {
            byte var2 = 0;
            ct = new int[var1];
            cu = new String[var1];
            cv = new byte[var1];
            cw = new byte[var1];
            cx = new short[var1];
            nJ = new String[var1];
            nK = new String[var1];
            nL = new String[var1];
            nM = new String[var1];
            nN = new String[var1];
            nO = new String[var1];
            nP = new short[var1];
            cy = new long[var1];
            nQ = new String[var1];
            nR = new short[var1][];

            for (int var3 = 0; var3 < var1; ++var3) {
                ct[var3] = var0.readInt();
                cu[var3] = var0.readUTF();
                cv[var3] = var0.readByte();
                cw[var3] = var0.readByte();
                cx[var3] = var0.readShort();
                nJ[var3] = var0.readUTF();
                nK[var3] = var0.readUTF();
                nL[var3] = var0.readUTF();
                nM[var3] = var0.readUTF();
                nN[var3] = var0.readUTF();
                nO[var3] = var0.readUTF();
                nP[var3] = var0.readShort();
                cy[var3] = var0.readLong();
                if (var0.readByte() > 0) {
                    nQ[var3] = var0.readUTF();
                }

                if ((var2 = var0.readByte()) > 0) {
                    nR[var3] = new short[var2];

                    for (byte var4 = 0; var4 < var2; ++var4) {
                        nR[var3][var4] = var0.readShort();
                    }
                }
            }

        }
    }

    public static void m() {
        ct = null;
        cv = null;
        cw = null;
        cx = null;
        nP = null;
        cy = null;
        nS = null;
        nR = null;
        if (nQ != null) {
            for (int var0 = 0; var0 < nQ.length; ++var0) {
                nQ[var0] = null;
            }

            nQ = null;
        }

        if (cu != null) {
            for (int var1 = 0; var1 < cu.length; ++var1) {
                cu[var1] = null;
            }

            cu = null;
        }

        if (nJ != null) {
            for (int var2 = 0; var2 < nJ.length; ++var2) {
                nJ[var2] = null;
            }

            nJ = null;
        }

        if (nK != null) {
            for (int var3 = 0; var3 < nK.length; ++var3) {
                nK[var3] = null;
            }

            nK = null;
        }

        if (nL != null) {
            for (int var4 = 0; var4 < nL.length; ++var4) {
                nL[var4] = null;
            }

            nL = null;
        }

        if (nM != null) {
            for (int var5 = 0; var5 < nM.length; ++var5) {
                nM[var5] = null;
            }

            nM = null;
        }

        if (nN != null) {
            for (int var6 = 0; var6 < nN.length; ++var6) {
                nN[var6] = null;
            }

            nN = null;
        }

        if (nO != null) {
            for (int var7 = 0; var7 < nO.length; ++var7) {
                nO[var7] = null;
            }

            nO = null;
        }

    }

    /**
     * 解析宠物详细数据包(8202)：读取宠物完整属性（技能、攻防、等级、亲密度等），存入 cz/cA 等数组；无宠物时调用 n() 清空。
     */
    public static void l(DataInputStream var0) throws IOException {
        byte var1;
        if ((var1 = var0.readByte()) <= 0) {
            n();
        } else {
            byte var2 = 0;
            cz = new int[var1];
            cA = new String[var1];
            cB = new byte[var1];
            cC = new short[var1];
            nU = new String[var1];
            nV = new String[var1];
            nW = new String[var1];
            nX = new String[var1];
            nY = new String[var1];
            nZ = new String[var1];
            nT = new short[var1];
            oa = new long[var1];
            ob = new String[var1];
            cD = new short[var1][];

            for (int var3 = 0; var3 < var1; ++var3) {
                cz[var3] = var0.readInt();
                cA[var3] = var0.readUTF();
                cB[var3] = var0.readByte();
                cC[var3] = var0.readShort();
                nU[var3] = var0.readUTF();
                nV[var3] = var0.readUTF();
                nW[var3] = var0.readUTF();
                nX[var3] = var0.readUTF();
                nY[var3] = var0.readUTF();
                nZ[var3] = var0.readUTF();
                nT[var3] = var0.readShort();
                oa[var3] = var0.readLong();
                if (var0.readByte() > 0) {
                    ob[var3] = var0.readUTF();
                }

                if ((var2 = var0.readByte()) > 0) {
                    cD[var3] = new short[var2];

                    for (byte var4 = 0; var4 < var2; ++var4) {
                        cD[var3][var4] = var0.readShort();
                    }
                }
            }

        }
    }

    public static void n() {
        cz = null;
        cB = null;
        cC = null;
        nT = null;
        oa = null;
        cD = null;
        if (ob != null) {
            for (int var0 = 0; var0 < ob.length; ++var0) {
                ob[var0] = null;
            }

            ob = null;
        }

        if (cA != null) {
            for (int var1 = 0; var1 < cA.length; ++var1) {
                cA[var1] = null;
            }

            cA = null;
        }

        if (nU != null) {
            for (int var2 = 0; var2 < nU.length; ++var2) {
                nU[var2] = null;
            }

            nU = null;
        }

        if (nV != null) {
            for (int var3 = 0; var3 < nV.length; ++var3) {
                nV[var3] = null;
            }

            nV = null;
        }

        if (nW != null) {
            for (int var4 = 0; var4 < nW.length; ++var4) {
                nW[var4] = null;
            }

            nW = null;
        }

        if (nX != null) {
            for (int var5 = 0; var5 < nX.length; ++var5) {
                nX[var5] = null;
            }

            nX = null;
        }

        if (nY != null) {
            for (int var6 = 0; var6 < nY.length; ++var6) {
                nY[var6] = null;
            }

            nY = null;
        }

        if (nZ != null) {
            for (int var7 = 0; var7 < nZ.length; ++var7) {
                nZ[var7] = null;
            }

            nZ = null;
        }

    }

    public static String a(StringBuffer var0, int var1, boolean var2) {
        for (int var4 = 0; var4 < cz.length; ++var4) {
            if (cB[var4] == var1) {
                if (var0 == null) {
                    var0 = new StringBuffer();
                } else {
                    GlobalConfig.clearStr(var0);
                }
                if (nU[var4] != null && nU[var4].length() > 0) {
                    var0.append(nU[var4]);
                    var0.append('\t');
                }

                if (nV[var4] != null && nV[var4].length() > 0) {
                    var0.append(nV[var4]);
                    var0.append('\t');
                }

                if (nW[var4] != null && nW[var4].length() > 0) {
                    var0.append(nW[var4]);
                    var0.append('\t');
                }

                if (nT[var4] > 0) {
                    var0.append("等级:");
                    var0.append(nT[var4]);
                    var0.append('\t');
                }

                return var0.toString();
            }
        }

        return null;
    }

    public static void m(DataInputStream var0) throws IOException {
        byte var1;
        if ((var1 = var0.readByte()) <= 0) {
            o();
        } else {
            byte var2 = 0;
            cE = var0.readByte();
            cF = var0.readByte();
            cG = new int[var1];
            cH = new String[var1];
            cI = new byte[var1];
            cJ = new short[var1];
            cK = new String[var1];
            cL = new String[var1];
            cM = new String[var1];
            oc = new String[var1];
            od = new String[var1];
            oe = new String[var1];
            cN = new short[var1];
            cO = new long[var1];
            cP = new String[var1];
            cQ = new short[var1][];

            for (int var3 = 0; var3 < var1; ++var3) {
                cG[var3] = var0.readInt();
                cH[var3] = var0.readUTF();
                cI[var3] = var0.readByte();
                cJ[var3] = var0.readShort();
                cK[var3] = var0.readUTF();
                cL[var3] = var0.readUTF();
                cM[var3] = var0.readUTF();
                oc[var3] = var0.readUTF();
                od[var3] = var0.readUTF();
                oe[var3] = var0.readUTF();
                cN[var3] = var0.readShort();
                cO[var3] = var0.readLong();
                if (var0.readByte() > 0) {
                    cP[var3] = var0.readUTF();
                }

                if ((var2 = var0.readByte()) > 0) {
                    cQ[var3] = new short[var2];

                    for (byte var4 = 0; var4 < var2; ++var4) {
                        cQ[var3][var4] = var0.readShort();
                    }
                }
            }

        }
    }

    public static void o() {
        cG = null;
        cI = null;
        cJ = null;
        cN = null;
        cO = null;
        cQ = null;
        if (cP != null) {
            for (int var0 = 0; var0 < cP.length; ++var0) {
                cP[var0] = null;
            }

            cP = null;
        }

        if (cH != null) {
            for (int var1 = 0; var1 < cH.length; ++var1) {
                cH[var1] = null;
            }

            cH = null;
        }

        if (cK != null) {
            for (int var2 = 0; var2 < cK.length; ++var2) {
                cK[var2] = null;
            }

            cK = null;
        }

        if (cL != null) {
            for (int var3 = 0; var3 < cL.length; ++var3) {
                cL[var3] = null;
            }

            cL = null;
        }

        if (cM != null) {
            for (int var4 = 0; var4 < cM.length; ++var4) {
                cM[var4] = null;
            }

            cM = null;
        }

        if (oc != null) {
            for (int var5 = 0; var5 < oc.length; ++var5) {
                oc[var5] = null;
            }

            oc = null;
        }

        if (od != null) {
            for (int var6 = 0; var6 < od.length; ++var6) {
                od[var6] = null;
            }

            od = null;
        }

        if (oe != null) {
            for (int var7 = 0; var7 < oe.length; ++var7) {
                oe[var7] = null;
            }

            oe = null;
        }

    }

    private static void c(DataInputStream var0, byte var1) throws IOException {
        if (var1 > 0) {
            cR = new int[var1];
            cS = new String[var1];
            cT = new byte[var1];
            cU = new byte[var1];
            cV = new byte[var1];
            cW = new short[var1];
            of = new short[var1];
            cY = new String[var1];
            cX = new short[var1];
            cZ = new byte[var1];
            da = new String[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                cR[var2] = var0.readInt();
                cS[var2] = var0.readUTF();
                cT[var2] = var0.readByte();
                cU[var2] = var0.readByte();
                cV[var2] = var0.readByte();
                cW[var2] = var0.readShort();
                cX[var2] = var0.readShort();
                of[var2] = var0.readShort();
                if (cR[var2] != 1) {
                    cY[var2] = var0.readUTF();
                    cZ[var2] = var0.readByte();
                } else {
                    cY[var2] = cS[var2];
                    cZ[var2] = 1;
                }

                da[var2] = var0.readUTF();
            }

        } else {
            cR = null;
            cT = null;
            cU = null;
            cV = null;
            cW = null;
            of = null;
            if (cS != null) {
                for (int var3 = 0; var3 < cS.length; ++var3) {
                    cS[var3] = null;
                }

                cS = null;
            }

            if (cY != null) {
                for (int var4 = 0; var4 < cY.length; ++var4) {
                    cY[var4] = null;
                }

                cY = null;
            }

            cZ = null;
            da = null;
        }
    }

    public static void a(DataInputStream var0, byte var1) throws IOException {
        if (var1 > 0) {
            db = new int[var1];
            dc = new String[var1];
            dd = new byte[var1];
            de = new byte[var1];
            df = new byte[var1];
            dg = new short[var1];
            dh = new short[var1];
            di = new String[var1];
            dj = new byte[var1];
            dk = new String[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                db[var2] = var0.readInt();
                dc[var2] = var0.readUTF();
                dd[var2] = var0.readByte();
                de[var2] = var0.readByte();
                df[var2] = var0.readByte();
                dg[var2] = var0.readShort();
                dh[var2] = var0.readShort();
                if (db[var2] != 1) {
                    di[var2] = var0.readUTF();
                    dj[var2] = var0.readByte();
                } else {
                    di[var2] = dc[var2];
                    dj[var2] = 1;
                }

                dk[var2] = var0.readUTF();
            }

        } else {
            db = null;
            dd = null;
            de = null;
            df = null;
            dg = null;
            dh = null;
            if (dc != null) {
                for (int var3 = 0; var3 < dc.length; ++var3) {
                    dc[var3] = null;
                }

                dc = null;
            }

            if (di != null) {
                for (int var4 = 0; var4 < di.length; ++var4) {
                    di[var4] = null;
                }

                di = null;
            }

            dj = null;
        }
    }

    public static void p() {
        dl = null;
        dn = null;
        dq = null;
        dr = null;
        do_2 = null;
        dp = null;
        if (dm != null) {
            for (int var0 = 0; var0 < dm.length; ++var0) {
                dm[var0] = null;
            }

            dm = null;
        }

        if (ds != null) {
            for (int var1 = 0; var1 < ds.length; ++var1) {
                ds[var1] = null;
            }

            ds = null;
        }

        if (dt != null) {
            for (int var2 = 0; var2 < dt.length; ++var2) {
                dt[var2] = null;
            }

            dt = null;
        }

        du = null;
    }

    /**
     * 解析技能列表包(8203)：读取技能数量及各技能 id/名称/等级/冷却/属性，存入 dv/dw/dx 等数组；无技能时调用 q() 清空。
     */
    public static void n(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) <= 0) {
            q();
        } else {
            dv = new int[var1];
            dw = new String[var1];
            dx = new byte[var1];
            dy = new byte[var1];
            dz = new byte[var1];
            dA = new short[var1];
            dB = new short[var1];
            dD = new String[var1];
            dC = new String[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                dv[var2] = var0.readInt();
                dw[var2] = var0.readUTF();
                dx[var2] = var0.readByte();
                dy[var2] = var0.readByte();
                dz[var2] = var0.readByte();
                dA[var2] = var0.readShort();
                dB[var2] = var0.readShort();
                dD[var2] = var0.readUTF();
                dC[var2] = var0.readUTF();
            }

        }
    }

    public static void q() {
        dv = null;
        dx = null;
        dy = null;
        dz = null;
        dA = null;
        dB = null;
        if (dw != null) {
            for (int var0 = 0; var0 < dw.length; ++var0) {
                dw[var0] = null;
            }

            dw = null;
        }

        if (dD != null) {
            for (int var1 = 0; var1 < dD.length; ++var1) {
                dD[var1] = null;
            }

            dD = null;
        }

        dC = null;
    }

    public static void o(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) <= 0) {
            r();
        } else {
            dE = new int[var1];
            dF = new String[var1];
            og = new byte[var1];
            dG = new short[var1];
            dH = new short[var1];
            dI = new String[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                dE[var2] = var0.readInt();
                dF[var2] = var0.readUTF();
                og[var2] = var0.readByte();
                dG[var2] = var0.readShort();
                dH[var2] = var0.readShort();
                dI[var2] = var0.readUTF();
            }

        }
    }

    public static void r() {
        dE = null;
        if (dF != null) {
            for (int var0 = 0; var0 < dF.length; ++var0) {
                dF[var0] = null;
            }

            dF = null;
        }

        og = null;
        dG = null;
        dH = null;
        if (dI != null) {
            for (int var1 = 0; var1 < dI.length; ++var1) {
                dI[var1] = null;
            }

            dI = null;
        }

    }

    public static void p(DataInputStream var0) throws IOException {
        oh = var0.readByte();
        dJ = var0.readByte() == 1;
        short var1;
        if ((var1 = var0.readShort()) > 0) {
            dK = new String[var1];
            dL = new String[var1];
            dM = new byte[var1];
            dN = new short[var1];
            dO = new short[var1];
            dP = new short[var1];
            dQ = new String[var1];
            dR = new int[var1];
            if (O != null && oh == 0) {
                O.s = new String[var1];
                O.t = new String[var1];
            }

            byte var2 = 0;

            for (int var3 = 0; var3 < var1; ++var3) {
                dK[var3] = var0.readUTF();
                dL[var3] = var0.readUTF();
                dM[var3] = var0.readByte();
                dN[var3] = var0.readShort();
                dO[var3] = var0.readShort();
                dP[var3] = var0.readShort();
                dQ[var3] = var0.readUTF();
                var2 = var0.readByte();
                dR[var3] = LoadingPage.pickColor(var2);
                if (O != null && oh == 0) {
                    O.s[var3] = dL[var3];
                    O.t[var3] = dK[var3];
                }
            }

        } else {
            s();
        }
    }

    public static void s() {
        dM = null;
        dN = null;
        dO = null;
        dP = null;
        dQ = null;
        if (dK != null) {
            for (int var0 = 0; var0 < dK.length; ++var0) {
                dK[var0] = null;
            }

            dK = null;
        }

        if (dL != null) {
            for (int var1 = 0; var1 < dL.length; ++var1) {
                dL[var1] = null;
            }

            dL = null;
        }

        dR = null;
    }

    public static void q(DataInputStream var0) throws IOException {
        (dT = new String[4])[0] = var0.readUTF();
        dT[1] = var0.readUTF();
        dT[2] = var0.readUTF();
        dT[3] = var0.readUTF();
        dV = var0.readByte();
        dX = var0.readByte();
    }

    public static void r(DataInputStream var0) throws IOException {
        byte var1 = var0.readByte();
        ei = var0.readByte();
        if (var1 > 0) {
            byte var2 = 0;
            dY = new int[var1];
            dZ = new String[var1];
            ea = new byte[var1];
            eb = new byte[var1];
            eg = new long[var1];
            ec = new short[var1];
            ed = new String[var1];
            oi = new String[var1];
            ee = new String[var1];
            oj = new String[var1];
            ok = new String[var1];
            ol = new String[var1];
            ef = new short[var1];
            eh = new String[var1];
            om = new short[var1][];

            for (int var3 = 0; var3 < var1; ++var3) {
                dY[var3] = var0.readInt();
                dZ[var3] = var0.readUTF();
                ea[var3] = var0.readByte();
                eb[var3] = var0.readByte();
                ec[var3] = var0.readShort();
                ed[var3] = var0.readUTF();
                oi[var3] = var0.readUTF();
                ee[var3] = var0.readUTF();
                oj[var3] = var0.readUTF();
                ok[var3] = var0.readUTF();
                ol[var3] = var0.readUTF();
                ef[var3] = var0.readShort();
                eg[var3] = var0.readLong();
                if (var0.readByte() > 0) {
                    eh[var3] = var0.readUTF();
                }

                if ((var2 = var0.readByte()) > 0) {
                    om[var3] = new short[var2];

                    for (byte var4 = 0; var4 < var2; ++var4) {
                        om[var3][var4] = var0.readShort();
                    }
                }
            }

        } else {
            dY = null;
            eb = null;
            ea = null;
            eg = null;
            ec = null;
            ef = null;
            om = null;
            if (dZ != null) {
                for (int var5 = 0; var5 < dZ.length; ++var5) {
                    dZ[var5] = null;
                }

                dZ = null;
            }

            eb = null;
            if (eh != null) {
                for (int var6 = 0; var6 < eh.length; ++var6) {
                    eh[var6] = null;
                }

                eh = null;
            }

            if (ed != null) {
                for (int var7 = 0; var7 < ed.length; ++var7) {
                    ed[var7] = null;
                }

                ed = null;
            }

            if (oi != null) {
                for (int var8 = 0; var8 < oi.length; ++var8) {
                    oi[var8] = null;
                }

                oi = null;
            }

            if (ee != null) {
                for (int var9 = 0; var9 < ee.length; ++var9) {
                    ee[var9] = null;
                }

                ee = null;
            }

            if (oj != null) {
                for (int var10 = 0; var10 < oj.length; ++var10) {
                    oj[var10] = null;
                }

                oj = null;
            }

            if (ok != null) {
                for (int var11 = 0; var11 < ok.length; ++var11) {
                    ok[var11] = null;
                }

                ok = null;
            }

            if (ol != null) {
                for (int var12 = 0; var12 < ol.length; ++var12) {
                    ol[var12] = null;
                }

                ol = null;
            }

        }
    }

    public static void s(DataInputStream var0) throws IOException {
        byte var1 = var0.readByte();
        ei = var0.readByte();
        if (var1 <= 0) {
            Y();
        } else {
            b((short) var1);

            for (int var2 = 0; var2 < var1; ++var2) {
                a((DataInputStream) var0, (byte) 0, (int) var2);
            }

            for (int var3 = 0; var3 < var1; ++var3) {
                a(var0, var3);
            }

        }
    }

    public static void t() {
        Y();
    }

    /**
     * 解析外观/时装数据包(8210)：读取主套装扮槽数量及各槽位配置，存入 oo/op/oq/or 等数组。
     */
    public static void t(DataInputStream var0) throws IOException {
        byte var1;
        if ((var1 = var0.readByte()) > 0) {
            oo = new byte[var1 + 2];
            op = new byte[var1 + 2];
            oq = new byte[var1 + 2];
            or = new byte[var1 + 2];
            os = new short[var1 + 2];
            eo = new String[var1 + 2];
            ej = new byte[var1 + 2];
            ek = new byte[var1 + 2];
            el = new byte[var1 + 2];
            em = new byte[var1 + 2];
            en = new short[var1 + 2];
            on = new String[var1 + 2];

            for (int var2 = 0; var2 < var1 + 2; ++var2) {
                if (var2 < var1) {
                    oo[var2] = var0.readByte();
                    op[var2] = var0.readByte();
                    oq[var2] = var0.readByte();
                    or[var2] = var0.readByte();
                    os[var2] = var0.readShort();
                    if (os[var2] >= 0) {
                        eo[var2] = var0.readUTF();
                    } else {
                        eo[var2] = null;
                    }
                } else {
                    oo[var2] = (byte) var2;
                    op[var2] = -1;
                    oq[var2] = 1;
                    or[var2] = 1;
                    os[var2] = -1;
                    eo[var2] = null;
                }

                ej[var2] = oo[var2];
                ek[var2] = op[var2];
                el[var2] = oq[var2];
                em[var2] = or[var2];
                en[var2] = os[var2];
                on[var2] = eo[var2];
            }
        }

    }

    /**
     * 解析次要外观数据包(8244)：读取第二套装扮槽数量及各槽位配置，存入 ou/ov/ow/ox 等数组。
     */
    public static void u(DataInputStream var0) throws IOException {
        byte var1;
        if ((var1 = var0.readByte()) > 0) {
            ou = new byte[var1 + 2];
            ov = new byte[var1 + 2];
            ow = new byte[var1 + 2];
            ox = new byte[var1 + 2];
            oy = new short[var1 + 2];
            eu = new String[var1 + 2];
            ep = new byte[var1 + 2];
            eq = new byte[var1 + 2];
            er = new byte[var1 + 2];
            es = new byte[var1 + 2];
            et = new short[var1 + 2];
            ot = new String[var1 + 2];

            for (int var2 = 0; var2 < var1 + 2; ++var2) {
                if (var2 < var1) {
                    ou[var2] = var0.readByte();
                    ov[var2] = var0.readByte();
                    ow[var2] = var0.readByte();
                    ox[var2] = var0.readByte();
                    oy[var2] = var0.readShort();
                    if (oy[var2] >= 0) {
                        eu[var2] = var0.readUTF();
                    } else {
                        eu[var2] = null;
                    }
                } else {
                    ou[var2] = (byte) var2;
                    ov[var2] = -1;
                    ow[var2] = 2;
                    ox[var2] = 1;
                    oy[var2] = -1;
                    eu[var2] = null;
                }

                ep[var2] = ou[var2];
                eq[var2] = ov[var2];
                er[var2] = ow[var2];
                es[var2] = ox[var2];
                et[var2] = oy[var2];
                ot[var2] = eu[var2];
            }
        }

    }

    public static void v(DataInputStream var0) throws IOException {
        ev = var0.readByte() == 1;
        short var1;
        if ((var1 = var0.readShort()) > 0) {
            ew = new int[var1];
            ex = new String[var1];
            ey = new String[var1];
            ez = new String[var1];
            eA = new String[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                ew[var2] = var0.readInt();
                ex[var2] = var0.readUTF();
                ey[var2] = var0.readUTF();
                ez[var2] = var0.readUTF();
                eA[var2] = var0.readUTF();
            }
        }

    }

    public static void u() {
        ew = null;
        if (ex != null) {
            for (int var0 = 0; var0 < ex.length; ++var0) {
                ex[var0] = null;
            }

            ex = null;
        }

        if (ey != null) {
            for (int var1 = 0; var1 < ey.length; ++var1) {
                ey[var1] = null;
            }

            ey = null;
        }

        if (eA != null) {
            for (int var2 = 0; var2 < eA.length; ++var2) {
                eA[var2] = null;
            }

            eA = null;
        }

    }

    /**
     * 解析登录/操作失败包(8193)：读取异常码(exceptionCode)，若为负值则继续读取异常消息(exceptionMsg)。
     */
    public static void parseLoginFail(DataInputStream var0) throws IOException {
        exceptionCode = var0.readByte();
        if (exceptionCode <= 0) {
            exceptionMsg = var0.readUTF();
        } else {
            exceptionMsg = GlobalConfig.YiChangTiShi[exceptionCode];
        }
    }

    public static void x(DataInputStream var0) throws IOException {
        eD = var0.readUTF();
        eE[0] = var0.readShort();
        eE[1] = var0.readShort();
        eE[2] = var0.readShort();
        short var1 = (short) ((eF = var0.readShort()) % 10);
        short var2 = (short) (eF / 10 % 10);
        short var3 = (short) (eF / 100 % 10);
        short var4 = (short) (eF / 1000 % 10);
        if (var1 > 0) {
            eG = new byte[var1];

            for (int var5 = 0; var5 < var1; ++var5) {
                eG[var5] = var0.readByte();
            }
        } else {
            eG = null;
        }

        if (var2 > 0) {
            eH = new short[var2];

            for (int var6 = 0; var6 < var2; ++var6) {
                eH[var6] = var0.readShort();
            }
        } else {
            eH = null;
        }

        if (var3 > 0) {
            eI = new int[var3];

            for (int var7 = 0; var7 < var3; ++var7) {
                eI[var7] = var0.readInt();
            }
        } else {
            eI = null;
        }

        if (var4 <= 0) {
            eJ = null;
        } else {
            eJ = new String[var4];

            for (int var8 = 0; var8 < var4; ++var8) {
                eJ[var8] = var0.readUTF();
            }

        }
    }

    public static void y(DataInputStream var0) throws IOException {
        eK = var0.readUTF();
        eL = new String[var0.readByte()];

        for (int var1 = 0; var1 < eL.length; ++var1) {
            eL[var1] = var0.readUTF();
        }

        eM[0] = var0.readShort();
        eM[1] = var0.readShort();
        eM[2] = var0.readShort();
        short var6 = (short) ((eN = var0.readShort()) % 10);
        short var2 = (short) (eN / 10 % 10);
        short var3 = (short) (eN / 100 % 10);
        short var4 = (short) (eN / 1000 % 10);
        if (var6 > 0) {
            eO = new byte[var6];

            for (int var5 = 0; var5 < var6; ++var5) {
                eO[var5] = var0.readByte();
            }
        }

        if (var2 > 0) {
            eP = new short[var2];

            for (int var7 = 0; var7 < var2; ++var7) {
                eP[var7] = var0.readShort();
            }
        }

        if (var3 > 0) {
            eQ = new int[var3];

            for (int var8 = 0; var8 < var3; ++var8) {
                eQ[var8] = var0.readInt();
            }
        }

        if (var4 > 0) {
            eR = new String[var4];

            for (int var9 = 0; var9 < var4; ++var9) {
                eR[var9] = var0.readUTF();
            }
        }

    }

    public static void z(DataInputStream var0) throws IOException {
        x = 0;
        v = w = var0.readLong();
        GlobalConfig.printStr("[FIGHT] z() 进入战斗: v=w=" + v);
        L = 1;
        byte var1;
        if ((var1 = var0.readByte()) > 0) {
            e(var0, var1);
        }

        if ((var1 = var0.readByte()) > 0) {
            d(var0, var1);
        }

        if ((var1 = var0.readByte()) > 0) {
            c(var0, var1);
        }

    }

    public static void A(DataInputStream var0) throws IOException {
        x = 0;
        w = var0.readLong();
        L = 1;
        byte var1;
        if ((var1 = var0.readByte()) > 0) {
            e(var0, var1);
        }

        if ((var1 = var0.readByte()) > 0) {
            byte var2 = var1;
            DataInputStream var7 = var0;
            N = new ck[var1];
            short var3 = 0;
            byte var4 = var0.readByte();

            for (int var5 = 0; var5 < var2; ++var5) {
                N[var5] = new ck();
                N[var5].b = var4;
                N[var5].a = var7.readByte();
                N[var5].c = String.valueOf(var7.readShort());
                N[var5].d = var7.readUTF();
                N[var5].e = var7.readInt();
                N[var5].f = var7.readInt();
                N[var5].i = var7.readShort();
                N[var5].g = var7.readInt();
                var3 = var7.readShort();
                if (var4 == 0) {
                    N[var5].j = GlobalConfig.U[var3];
                } else {
                    N[var5].j = var3;
                }

                N[var5].r = var7.readShort();
                N[var5].s = var7.readShort();
                N[var5].t = var7.readShort();
                N[var5].k = var7.readByte();
                N[var5].l = var7.readByte();
            }
        }

        if ((var1 = var0.readByte()) > 0) {
            c(var0, var1);
        }

    }

    private static void d(DataInputStream var0, byte var1) throws IOException {
        J = new p[var1];

        for (int var2 = 0; var2 < var1; ++var2) {
            J[var2] = new p();
            J[var2].b = var0.readByte();
            J[var2].a = var0.readByte();
            J[var2].c = var0.readUTF();
            J[var2].d = var0.readUTF();
            J[var2].e = var0.readInt();
            J[var2].f = var0.readInt();
            J[var2].g = var0.readInt();
            J[var2].h = var0.readInt();
            if (J[var2].b == 0) {
                J[var2].i = var0.readShort();
                J[var2].a(var0.readByte());
            } else {
                J[var2].b = 1;
                J[var2].i = var0.readShort();
                J[var2].p = var0.readShort();
                J[var2].q = var0.readShort();
                J[var2].r = var0.readShort();
            }
        }

    }

    private static void e(DataInputStream var0, byte var1) throws IOException {
        I = new p[var1];

        for (int var2 = 0; var2 < var1; ++var2) {
            I[var2] = new p();
            I[var2].b = var0.readByte();
            I[var2].a = var0.readByte();
            I[var2].c = var0.readUTF();
            I[var2].d = var0.readUTF();
            I[var2].e = var0.readInt();
            I[var2].f = var0.readInt();
            I[var2].g = var0.readInt();
            I[var2].h = var0.readInt();
            if (I[var2].b == 0) {
                I[var2].i = var0.readShort();
                I[var2].a(var0.readByte());
            } else {
                I[var2].i = var0.readShort();
                I[var2].p = var0.readShort();
                I[var2].q = var0.readShort();
                I[var2].r = var0.readShort();
            }
        }

    }

    public static void B(DataInputStream var0) throws IOException {
        eS = var0.readUTF();
        var0.readUTF();
        eT = var0.readShort();
        eU = var0.readByte();
        eV = var0.readByte();
        eW = var0.readUTF();
        eX = var0.readUTF();
        eY = var0.readInt();
        eZ = var0.readUTF();
        fa = var0.readInt();
        fb = var0.readUTF();
        fc = var0.readUTF();
        fd = var0.readInt();
        fe = var0.readUTF();
    }

    public static void C(DataInputStream var0) throws IOException {
        i_1 = var0.readByte();
        j = var0.readByte();
        var0.readUTF();
        ff = var0.readUTF();
        var0.readShort();
    }

    public static void D(DataInputStream var0) throws IOException {
        var0.readLong();
        j = var0.readByte();
        fn = var0.readLong();
        i_1 = var0.readByte();
        fg = var0.readLong();
        DataInputStream var1 = var0;
        byte var2;
        if ((var2 = var0.readByte()) > 0) {
            byte var3 = 0;
            fo = new int[var2];
            oM = new String[var2];
            fp = new byte[var2];
            fq = new byte[var2];
            fr = new short[var2];
            fs = new short[var2];
            oN = new String[var2];
            oO = new String[var2];
            oP = new String[var2];
            oQ = new String[var2];
            oR = new String[var2];
            oS = new String[var2];
            oT = new short[var2];
            oU = new long[var2];
            ft = new String[var2];
            oV = new short[var2][];

            for (int var4 = 0; var4 < var2; ++var4) {
                fo[var4] = var1.readInt();
                oM[var4] = var1.readUTF();
                fp[var4] = var1.readByte();
                fq[var4] = var1.readByte();
                fr[var4] = (short) var1.readByte();
                fs[var4] = var1.readShort();
                oN[var4] = var1.readUTF();
                oO[var4] = var1.readUTF();
                oP[var4] = var1.readUTF();
                oQ[var4] = var1.readUTF();
                oR[var4] = var1.readUTF();
                oS[var4] = var1.readUTF();
                oT[var4] = var1.readShort();
                oU[var4] = var1.readLong();
                if (var1.readByte() > 0) {
                    ft[var4] = var1.readUTF();
                }

                if ((var3 = var1.readByte()) > 0) {
                    oV[var4] = new short[var3];

                    for (byte var5 = 0; var5 < var3; ++var5) {
                        oV[var4][var5] = var1.readShort();
                    }
                }
            }
        } else {
            w();
        }

        var1 = var0;
        if ((var2 = var0.readByte()) > 0) {
            byte var12 = 0;
            fh = new int[var2];
            oz = new String[var2];
            fi = new byte[var2];
            fj = new byte[var2];
            fk = new short[var2];
            fl = new short[var2];
            oA = new String[var2];
            oB = new String[var2];
            oC = new String[var2];
            oD = new String[var2];
            oE = new String[var2];
            oF = new String[var2];
            oG = new short[var2];
            oH = new long[var2];
            fm = new String[var2];
            oI = new short[var2][];

            for (int var14 = 0; var14 < var2; ++var14) {
                fh[var14] = var1.readInt();
                oz[var14] = var1.readUTF();
                fi[var14] = var1.readByte();
                fj[var14] = var1.readByte();
                fk[var14] = (short) var1.readByte();
                fl[var14] = var1.readShort();
                oA[var14] = var1.readUTF();
                oB[var14] = var1.readUTF();
                oC[var14] = var1.readUTF();
                oD[var14] = var1.readUTF();
                oE[var14] = var1.readUTF();
                oF[var14] = var1.readUTF();
                oG[var14] = var1.readShort();
                oH[var14] = var1.readLong();
                if (var1.readByte() > 0) {
                    fm[var14] = var1.readUTF();
                }

                if ((var12 = var1.readByte()) > 0) {
                    oI[var14] = new short[var12];

                    for (byte var15 = 0; var15 < var12; ++var15) {
                        oI[var14][var15] = var1.readShort();
                    }
                }
            }
        } else {
            v();
            GameSceneController.c(fs);
            GameSceneController.c(fl);
        }

        if (var1.readByte() == 1) {
            oJ = true;
            oK = var1.readInt();
            oL = var1.readByte();
        } else {
            oJ = false;
            oK = -1;
            oL = 0;
        }

        if (oJ && oK >= 0) {
            if (bC == null || bC.size() <= 0) {
                return;
            }

            bn var7 = null;

            for (int var10 = 0; var10 < bC.size(); ++var10) {
                var7 = (bn) bC.elementAt(var10);
                if (oK == var7.a) {
                    if (var7.v > 0) {
                        var7.v = 0;
                        return;
                    }

                    var7.v = oL;
                    return;
                }
            }
        }

    }

    public static void E(DataInputStream var0) throws IOException {
        var0.readLong();
        j = var0.readByte();
        fn = var0.readLong();
        i_1 = var0.readByte();
        fg = var0.readLong();
        byte var1 = var0.readByte();
        int var4 = var1;
        DataInputStream var3 = var0;
        if (var1 > 0) {
            boolean var5 = false;
            fx = new int[var1];
            po = new String[var1];
            fy = new byte[var1];
            pp = new short[var1];
            pq = new short[var1];
            pr = new short[var1];
            ps = new short[var1];
            pt = new short[var1];
            pu = new long[var1];
            pv = new long[var1];
            pw = new long[var1];
            px = new String[var1];
            pA = new byte[var1];
            pC = new String[var1];
            pD = new String[var1][];
            pE = new String[var1][];

            for (int var6 = 0; var6 < var4; ++var6) {
                fy[var6] = var3.readByte();
                fx[var6] = var3.readInt();
                po[var6] = var3.readUTF();
                pp[var6] = var3.readShort();
                pq[var6] = var3.readShort();
                pr[var6] = var3.readShort();
                ps[var6] = var3.readShort();
                pt[var6] = var3.readShort();
                pu[var6] = var3.readLong();
                pv[var6] = var3.readLong();
                pw[var6] = var3.readLong();
                if (var3.readByte() > 0) {
                    px[var6] = var3.readUTF();
                }

                pA[var6] = var3.readByte();
                pC[var6] = var3.readUTF();
                short var7;
                if ((var7 = var3.readShort()) > 0) {
                    pD[var6] = new String[var7];

                    for (int var8 = 0; var8 < var7; ++var8) {
                        pD[var6][var8] = var3.readUTF();
                    }
                } else {
                    pD[var6] = null;
                }

                short var30;
                if ((var30 = var3.readShort()) > 0) {
                    pE[var6] = new String[var30];

                    for (int var16 = 0; var16 < var30; ++var16) {
                        pE[var6][var16] = var3.readUTF();
                    }
                } else {
                    pE[var6] = null;
                }
            }
        } else {
            z();
        }

        byte var2 = var0.readByte();
        var4 = var2;
        var3 = var0;
        if (var2 > 0) {
            boolean var17 = false;
            fu = new int[var2];
            oW = new String[var2];
            fv = new byte[var2];
            oX = new short[var2];
            oY = new short[var2];
            oZ = new short[var2];
            pa = new short[var2];
            pb = new short[var2];
            pc = new long[var2];
            pd = new long[var2];
            pe = new long[var2];
            pf = new String[var2];
            pj = new byte[var2];
            pl = new String[var2];
            pm = new String[var2][];
            pn = new String[var2][];

            for (int var21 = 0; var21 < var4; ++var21) {
                fv[var21] = var3.readByte();
                fu[var21] = var3.readInt();
                oW[var21] = var3.readUTF();
                oX[var21] = var3.readShort();
                oY[var21] = var3.readShort();
                oZ[var21] = var3.readShort();
                pa[var21] = var3.readShort();
                pb[var21] = var3.readShort();
                pc[var21] = var3.readLong();
                pd[var21] = var3.readLong();
                pe[var21] = var3.readLong();
                if (var3.readByte() > 0) {
                    pf[var21] = var3.readUTF();
                }

                pj[var21] = var3.readByte();
                pl[var21] = var3.readUTF();
                short var27;
                if ((var27 = var3.readShort()) > 0) {
                    pm[var21] = new String[var27];

                    for (int var31 = 0; var31 < var27; ++var31) {
                        pm[var21][var31] = var3.readUTF();
                    }
                } else {
                    pm[var21] = null;
                }

                short var32;
                if ((var32 = var3.readShort()) > 0) {
                    pn[var21] = new String[var32];

                    for (int var18 = 0; var18 < var32; ++var18) {
                        pn[var21][var18] = var3.readUTF();
                    }
                } else {
                    pn[var21] = null;
                }
            }
        } else {
            y();
        }

        byte var19 = var2;
        var4 = var1;
        var3 = var0;
        if (var1 > 0) {
            byte var22 = 0;
            py = new short[var1][];
            pz = new String[var1][];
            pB = new byte[var1][];

            for (int var28 = 0; var28 < var4; ++var28) {
                if ((var22 = var3.readByte()) > 0) {
                    py[var28] = new short[var22];
                    pz[var28] = new String[var22];
                    pB[var28] = new byte[var22];

                    for (byte var33 = 0; var33 < var22; ++var33) {
                        py[var28][var33] = var3.readShort();
                        pz[var28][var33] = var3.readUTF();
                        pB[var28][var33] = var3.readByte();
                    }
                }
            }
        }

        if (var2 > 0) {
            byte var24 = 0;
            pg = new short[var2][];
            ph = new String[var2][];
            pk = new byte[var2][];

            for (int var29 = 0; var29 < var19; ++var29) {
                if ((var24 = var3.readByte()) > 0) {
                    pg[var29] = new short[var24];
                    ph[var29] = new String[var24];
                    pk[var29] = new byte[var24];

                    for (byte var34 = 0; var34 < var24; ++var34) {
                        pg[var29][var34] = var3.readShort();
                        ph[var29][var34] = var3.readUTF();
                        pk[var29][var34] = var3.readByte();
                    }
                }
            }
        }

        if (var0.readByte() == 1) {
            pi = true;
        } else {
            pi = false;
        }

        if (pi) {
            fw = null;
            if (fA == null || fA.length <= 0) {
                return;
            }

            if (fu == null || fu.length <= 0) {
                x();
                return;
            }

            if (fA.length <= fu.length) {
                fw = null;
                return;
            }

            fw = new int[fA.length - fu.length];
            boolean var11 = false;
            var4 = 0;

            for (int var20 = 0; var20 < fA.length; ++var20) {
                var11 = true;

                for (int var26 = 0; var26 < fu.length; ++var26) {
                    if (fA[var20] == fu[var26]) {
                        var11 = false;
                        break;
                    }
                }

                if (var11) {
                    fw[var4] = var20;
                    ++var4;
                }
            }
        }

    }

    public static void F(DataInputStream var0) throws IOException {
        j = var0.readByte();
        i_1 = var0.readByte();
    }

    public static boolean a(byte var0, int var1) {
        if (var0 == 0) {
            for (byte var2 = 0; var2 < fk.length; ++var2) {
                if (fk[var2] == var1 && a(fi[var2])) {
                    return true;
                }
            }
        } else {
            for (byte var3 = 0; var3 < fr.length; ++var3) {
                if (fr[var3] == var1 && a(fp[var3])) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void v() {
        fh = null;
        fj = null;
        fi = null;
        fk = null;
        fl = null;
        fh = null;
        fj = null;
        fk = null;
        fl = null;
        oG = null;
        oH = null;
        oI = null;
        if (fm != null) {
            for (int var0 = 0; var0 < fm.length; ++var0) {
                fm[var0] = null;
            }

            fm = null;
        }

        if (oz != null) {
            for (int var1 = 0; var1 < oz.length; ++var1) {
                oz[var1] = null;
            }

            oz = null;
        }

        if (oA != null) {
            for (int var2 = 0; var2 < oA.length; ++var2) {
                oA[var2] = null;
            }

            oA = null;
        }

        if (oB != null) {
            for (int var3 = 0; var3 < oB.length; ++var3) {
                oB[var3] = null;
            }

            oB = null;
        }

        if (oC != null) {
            for (int var4 = 0; var4 < oC.length; ++var4) {
                oC[var4] = null;
            }

            oC = null;
        }

        if (oD != null) {
            for (int var5 = 0; var5 < oD.length; ++var5) {
                oD[var5] = null;
            }

            oD = null;
        }

        if (oE != null) {
            for (int var6 = 0; var6 < oE.length; ++var6) {
                oE[var6] = null;
            }

            oE = null;
        }

        if (oF != null) {
            for (int var7 = 0; var7 < oF.length; ++var7) {
                oF[var7] = null;
            }

            oF = null;
        }

    }

    public static void w() {
        fo = null;
        fq = null;
        fp = null;
        fr = null;
        fs = null;
        fo = null;
        fq = null;
        fr = null;
        fs = null;
        oT = null;
        oU = null;
        oV = null;
        if (ft != null) {
            for (int var0 = 0; var0 < ft.length; ++var0) {
                ft[var0] = null;
            }

            ft = null;
        }

        if (oM != null) {
            for (int var1 = 0; var1 < oM.length; ++var1) {
                oM[var1] = null;
            }

            oM = null;
        }

        if (oN != null) {
            for (int var2 = 0; var2 < oN.length; ++var2) {
                oN[var2] = null;
            }

            oN = null;
        }

        if (oO != null) {
            for (int var3 = 0; var3 < oO.length; ++var3) {
                oO[var3] = null;
            }

            oO = null;
        }

        if (oP != null) {
            for (int var4 = 0; var4 < oP.length; ++var4) {
                oP[var4] = null;
            }

            oP = null;
        }

        if (oQ != null) {
            for (int var5 = 0; var5 < oQ.length; ++var5) {
                oQ[var5] = null;
            }

            oQ = null;
        }

        if (oR != null) {
            for (int var6 = 0; var6 < oR.length; ++var6) {
                oR[var6] = null;
            }

            oR = null;
        }

        if (oS != null) {
            for (int var7 = 0; var7 < oS.length; ++var7) {
                oS[var7] = null;
            }

            oS = null;
        }

    }

    public static String a(StringBuffer var0, int var1) {
        if (var0 == null) {
            var0 = new StringBuffer();
        } else {
            GlobalConfig.clearStr(var0);
        }

        StringBuffer var2 = new StringBuffer();
        var2.append(oz[var1]);
        var2.append("（");
        GlobalConfig.yinLiangFormat(var0, oH[var1]);
        var2.append(var0).append("）");
        var2.append('\t');
        if (!oA[var1].equals("")) {
            var2.append(oA[var1]);
            var2.append('\t');
        }

        if (!oC[var1].equals("")) {
            var2.append(oC[var1]);
            var2.append('\t');
        }

        if (oG[var1] > 0) {
            var2.append("等级:");
            var2.append(oG[var1]);
            var2.append('\t');
        }

        if (fm[var1] != null) {
            var2.append(fm[var1]);
            var2.append('\t');
        }

        return var2.toString();
    }

    public static String b(StringBuffer var0, int var1) {
        if (var0 == null) {
            var0 = new StringBuffer();
        } else {
            GlobalConfig.clearStr(var0);
        }

        StringBuffer var2;
        (var2 = new StringBuffer()).append(oM[var1]);
        var2.append("（");
        GlobalConfig.yinLiangFormat(var0, oU[var1]);
        var2.append(var0.toString() + "）");
        var2.append('\t');
        if (!oN[var1].equals("")) {
            var2.append(oN[var1]);
            var2.append('\t');
        }

        if (!oP[var1].equals("")) {
            var2.append(oP[var1]);
            var2.append('\t');
        }

        if (oT[var1] > 0) {
            var2.append("等级:");
            var2.append(oT[var1]);
            var2.append('\t');
        }

        if (ft[var1] != null) {
            var2.append(ft[var1]);
            var2.append('\t');
        }

        return var2.toString();
    }

    public static void x() {
        fw = null;
        if (fA != null && fA.length > 0) {
            fw = new int[fA.length];

            for (int var0 = 0; var0 < fA.length; fw[var0] = var0++) {
            }

            pi = false;
        }
    }

    public static String c(StringBuffer var0, int var1) {
        if (var0 == null) {
            var0 = new StringBuffer();
        } else {
            GlobalConfig.clearStr(var0);
        }

        var0.append(oW[var1]);
        var0.append('\t');
        var0.append("等级:");
        var0.append(oX[var1]);
        var0.append('\t');
        var0.append("星级:").append(pl[var1]).append('\t');
        if (oY[var1] > 0 || oZ[var1] > 0) {
            var0.append("攻击:");
            var0.append(oY[var1]);
            var0.append("-");
            var0.append(oZ[var1]);
            var0.append('\t');
        }

        if (pa[var1] > 0 || pb[var1] > 0) {
            var0.append("法攻:");
            var0.append(pa[var1]);
            var0.append("-");
            var0.append(pb[var1]);
            var0.append('\t');
        }

        var0.append("经验:");
        var0.append(pc[var1]);
        var0.append("/");
        var0.append(pd[var1]);
        var0.append('\t');
        var0.append("价格:");
        var0.append(a(pe[var1]));
        var0.append('\t');
        if (pf[var1] != null) {
            var0.append("技能:");
            var0.append(pf[var1]);
            var0.append('\t');
        }

        if (pm[var1] != null) {
            var0.append("技能附魂:");

            for (int var2 = 0; var2 < pm[var1].length; ++var2) {
                if (pm[var1][var2] != null) {
                    var0.append(pm[var1][var2]);
                    var0.append(",");
                }
            }

            var0.append('\t');
        }

        if (pn[var1] != null) {
            var0.append("状态附魂:");

            for (int var3 = 0; var3 < pn[var1].length; ++var3) {
                if (pn[var1][var3] != null) {
                    var0.append(pn[var1][var3]);
                    var0.append(",");
                }
            }

            var0.append('\t');
        }

        return var0.toString();
    }

    public static void y() {
        fv = null;
        fu = null;
        oX = null;
        oY = null;
        oZ = null;
        pa = null;
        pb = null;
        pc = null;
        pd = null;
        pe = null;
        if (oW != null) {
            for (int var0 = 0; var0 < oW.length; ++var0) {
                oW[var0] = null;
            }

            oW = null;
        }

        if (pf != null) {
            for (int var1 = 0; var1 < pf.length; ++var1) {
                pf[var1] = null;
            }

            pf = null;
        }

        pg = null;
        if (ph != null) {
            for (int var2 = 0; var2 < ph.length; ++var2) {
                ph[var2] = null;
            }

            ph = null;
        }

        pj = null;
        if (pk != null) {
            for (int var3 = 0; var3 < pk.length; ++var3) {
                pk[var3] = null;
            }

            pk = null;
        }

    }

    public static String d(StringBuffer var0, int var1) {
        if (var0 == null) {
            var0 = new StringBuffer();
        } else {
            GlobalConfig.clearStr(var0);
        }

        var0.append(po[var1]);
        var0.append('\t');
        var0.append("等级:");
        var0.append(pp[var1]);
        var0.append('\t');
        var0.append("星级:").append(pC[var1]).append('\t');
        if (pq[var1] > 0 || pr[var1] > 0) {
            var0.append("攻击:");
            var0.append(pq[var1]);
            var0.append("-");
            var0.append(pr[var1]);
            var0.append('\t');
        }

        if (ps[var1] > 0 || pt[var1] > 0) {
            var0.append("法攻:");
            var0.append(ps[var1]);
            var0.append("-");
            var0.append(pt[var1]);
            var0.append('\t');
        }

        var0.append("经验:");
        var0.append(pu[var1]);
        var0.append("/");
        var0.append(pv[var1]);
        var0.append('\t');
        var0.append("价格:");
        var0.append(a(pw[var1]));
        var0.append('\t');
        if (px[var1] != null) {
            var0.append("技能:");
            var0.append(px[var1]);
            var0.append('\t');
        }

        if (pD[var1] != null) {
            var0.append("技能附魂:");

            for (int var2 = 0; var2 < pD[var1].length; ++var2) {
                if (pD[var1][var2] != null) {
                    var0.append(pD[var1][var2]);
                    var0.append(",");
                }
            }

            var0.append('\t');
        }

        if (pE[var1] != null) {
            var0.append("状态附魂:");

            for (int var3 = 0; var3 < pE[var1].length; ++var3) {
                if (pE[var1][var3] != null) {
                    var0.append(pE[var1][var3]);
                    var0.append(",");
                }
            }

            var0.append('\t');
        }

        return var0.toString();
    }

    public static void z() {
        fy = null;
        fx = null;
        pp = null;
        pq = null;
        pr = null;
        ps = null;
        pt = null;
        pu = null;
        pv = null;
        pw = null;
        if (po != null) {
            for (int var0 = 0; var0 < po.length; ++var0) {
                po[var0] = null;
            }

            po = null;
        }

        if (px != null) {
            for (int var1 = 0; var1 < px.length; ++var1) {
                px[var1] = null;
            }

            px = null;
        }

        py = null;
        if (pz != null) {
            for (int var2 = 0; var2 < pz.length; ++var2) {
                pz[var2] = null;
            }

            pz = null;
        }

        pA = null;
        if (pB != null) {
            for (int var3 = 0; var3 < pB.length; ++var3) {
                pB[var3] = null;
            }

            pB = null;
        }

        pC = null;
    }

    public static void G(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) <= 0) {
            Y();
        } else {
            b(var1);

            for (int var2 = 0; var2 < var1; ++var2) {
                a((DataInputStream) var0, (byte) 0, (int) var2);
            }

            for (int var3 = 0; var3 < var1; ++var3) {
                a(var0, var3);
            }

        }
    }

    public static void H(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) > 0) {
            b(var1);
            pQ = new long[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                a((DataInputStream) var0, (byte) 0, (int) var2);
            }

            for (int var5 = 0; var5 < var1; ++var5) {
                a(var0, var5);
            }

            for (int var6 = 0; var6 < var1; ++var6) {
                pQ[var6] = var0.readLong();
            }
        } else {
            Y();
            pQ = null;
        }

        gQ = (short) var0.readByte();
        gR = var0.readByte();
    }

    public static void A() {
        Y();
    }

    /**
     * 解析宠物列表包(8222)：读取角色所有宠物的类型/id/名称/等级/经验，存入 fz/fA/fB/fC 等数组。
     */
    public static void I(DataInputStream var0) throws IOException {
        short var1 = var0.readShort();
        GlobalConfig.printStr("readRolePet size:" + var1);
        if (var1 <= 0) {
            B();
        } else {
            short var2 = 0;
            fz = new byte[var1];
            fA = new int[var1];
            fB = new String[var1];
            fC = new String[var1];
            fD = new short[var1];
            fE = new short[var1];
            fF = new short[var1];
            fG = new short[var1];
            fH = new short[var1];
            fI = new int[var1];
            fJ = new int[var1];
            fK = new int[var1];
            fL = new int[var1];
            fM = new int[var1];
            fN = new int[var1];
            fO = new int[var1];
            fP = new int[var1];
            fQ = new int[var1];
            fR = new int[var1];
            fS = new int[var1];
            fT = new int[var1];
            fU = new int[var1];
            fV = new int[var1];
            fX = new String[var1];
            fW = new short[var1];
            fY = new long[var1];
            fZ = new long[var1];
            ga = new long[var1];
            pF = new long[var1];
            gb = new short[var1][];
            gc = new String[var1][];
            gd = new byte[var1][];
            ge = new byte[var1];
            gf = new String[var1];
            gg = new int[var1][];
            gh = new String[var1][];
            gi = new String[var1][];
            pG = new int[var1][];
            gj = new byte[var1][];
            gk = new int[var1][];
            gl = new String[var1][];
            gm = new String[var1][];
            pH = new int[var1][];
            gn = new byte[var1][];

            for (int var3 = 0; var3 < var1; ++var3) {
                fz[var3] = var0.readByte();
                fA[var3] = var0.readInt();
                fB[var3] = var0.readUTF();
                fC[var3] = var0.readUTF();
                fD[var3] = var0.readShort();
                fE[var3] = var0.readShort();
                fF[var3] = var0.readShort();
                fG[var3] = var0.readShort();
                fH[var3] = var0.readShort();
                fI[var3] = var0.readInt();
                fJ[var3] = var0.readInt();
                fK[var3] = var0.readInt();
                fL[var3] = var0.readInt();
                fM[var3] = var0.readInt();
                fN[var3] = var0.readInt();
                fO[var3] = var0.readInt();
                fP[var3] = var0.readInt();
                fQ[var3] = var0.readInt();
                fR[var3] = var0.readInt();
                fS[var3] = var0.readInt();
                fT[var3] = var0.readInt();
                fU[var3] = var0.readInt();
                fV[var3] = var0.readInt();
                fX[var3] = var0.readUTF();
                fW[var3] = var0.readShort();
                fY[var3] = var0.readLong();
                fZ[var3] = var0.readLong();
                pF[var3] = var0.readLong();
                if ((var2 = var0.readByte()) > 0) {
                    gb[var3] = new short[var2];
                    gc[var3] = new String[var2];
                    gd[var3] = new byte[var2];

                    for (byte var4 = 0; var4 < var2; ++var4) {
                        gb[var3][var4] = var0.readShort();
                        gc[var3][var4] = var0.readUTF();
                        gd[var3][var4] = var0.readByte();
                    }
                }

                if (fz[var3] == 1) {
                    var0.readInt();
                    var0.readInt();
                    go = var0.readShort();
                    gp = var0.readShort();
                    gq = var0.readShort();
                    gr = var0.readShort();
                    byte var13 = var0.readByte();
                    c(var0, var13);
                }

                ge[var3] = var0.readByte();
                gf[var3] = var0.readUTF();
                short var14 = var0.readShort();
                GlobalConfig.printStr("skillSoulSize=" + var14);
                if (var14 > 0) {
                    gg[var3] = new int[4];
                    gh[var3] = new String[4];
                    gi[var3] = new String[4];
                    pG[var3] = new int[4];
                    gj[var3] = new byte[4];

                    for (int var11 = 0; var11 < var14; ++var11) {
                        int var5 = var0.readInt();
                        String var6 = var0.readUTF();
                        String var7 = var0.readUTF();
                        int var8 = var0.readInt();
                        byte var9 = var0.readByte();
                        GlobalConfig.printStr("desc=" + var7);
                        gg[var3][var9 - 1] = var5;
                        gh[var3][var9 - 1] = var6;
                        gi[var3][var9 - 1] = var7;
                        pG[var3][var9 - 1] = var8;
                        gj[var3][var9 - 1] = var9;
                    }
                }

                var2 = var0.readShort();
                GlobalConfig.printStr("attrSoulSize=" + var2);
                if (var2 > 0) {
                    gk[var3] = new int[4];
                    gl[var3] = new String[4];
                    gm[var3] = new String[4];
                    pH[var3] = new int[4];
                    gn[var3] = new byte[4];

                    for (int var16 = 0; var16 < var2; ++var16) {
                        int var17 = var0.readInt();
                        String var18 = var0.readUTF();
                        String var19 = var0.readUTF();
                        int var20 = var0.readInt();
                        var14 = var0.readByte();
                        GlobalConfig.printStr("desc=" + var19);
                        gk[var3][var14 - 1] = var17;
                        gl[var3][var14 - 1] = var18;
                        gm[var3][var14 - 1] = var19;
                        pH[var3][var14 - 1] = var20;
                        gn[var3][var14 - 1] = (byte) var14;
                    }
                }
            }

        }
    }

    public static String e(StringBuffer var0, int var1) {
        if (var0 == null) {
            var0 = new StringBuffer();
        } else {
            GlobalConfig.clearStr(var0);
        }

        var0.append(" ").append('\t');
        var0.append(" ").append('\t');
        var0.append(fB[var1]);
        var0.append('\t');
        var0.append("星级:").append(gf[var1]).append('\t');
        if (fM[var1] > 0 || fN[var1] > 0) {
            var0.append("攻击:");
            var0.append(fM[var1]);
            var0.append("-");
            var0.append(fN[var1]);
            var0.append('\t');
        }

        if (fO[var1] > 0 || fP[var1] > 0) {
            var0.append("法攻:");
            var0.append(fO[var1]);
            var0.append("-");
            var0.append(fP[var1]);
            var0.append('\t');
        }

        var0.append("经验:");
        var0.append(fY[var1]);
        var0.append("/");
        var0.append(fZ[var1]);
        var0.append('\t');
        var0.append("价格:");
        var0.append(a(pF[var1]));
        var0.append('\t');
        if (gc[var1] != null && gc[var1].length > 0) {
            for (byte var2 = 0; var2 < gc[var1].length; ++var2) {
                var0.append((var2 == 0 ? "技能:" : ",") + gc[var1][var2]);
                if (var2 == gc[var1].length - 1) {
                    var0.append('\t');
                }
            }
        }

        if (gh[var1] != null) {
            var0.append("技能附魂:");

            for (int var3 = 0; var3 < gh[var1].length; ++var3) {
                if (gh[var1][var3] != null) {
                    var0.append(gh[var1][var3]);
                    var0.append(",");
                }
            }

            var0.append('\t');
        }

        if (gl[var1] != null) {
            var0.append("状态附魂:");

            for (int var4 = 0; var4 < gl[var1].length; ++var4) {
                if (gl[var1][var4] != null) {
                    var0.append(gl[var1][var4]);
                    var0.append(",");
                }
            }

            var0.append('\t');
        }

        return var0.toString();
    }

    public static String f(StringBuffer var0, int var1) {
        if (var0 == null) {
            var0 = new StringBuffer();
        } else {
            GlobalConfig.clearStr(var0);
        }

        var0.append(fB[var1]);
        var0.append('\t');
        var0.append("星级:").append(gf[var1]).append('\t');
        if (fM[var1] > 0 || fN[var1] > 0) {
            var0.append("攻击:");
            var0.append(fM[var1]);
            var0.append("-");
            var0.append(fN[var1]);
            var0.append('\t');
        }

        if (fO[var1] > 0 || fP[var1] > 0) {
            var0.append("法攻:");
            var0.append(fO[var1]);
            var0.append("-");
            var0.append(fP[var1]);
            var0.append('\t');
        }

        return var0.toString();
    }

    public static void B() {
        fz = null;
        fA = null;
        fD = null;
        fE = null;
        fF = null;
        fG = null;
        fH = null;
        fI = null;
        fJ = null;
        fK = null;
        fL = null;
        fM = null;
        fN = null;
        fO = null;
        fP = null;
        fQ = null;
        fR = null;
        fS = null;
        fT = null;
        fU = null;
        fV = null;
        fW = null;
        fY = null;
        fZ = null;
        ga = null;
        pF = null;
        gb = null;
        gf = null;
        gg = null;
        gh = null;
        gi = null;
        pG = null;
        gj = null;
        gk = null;
        gl = null;
        gm = null;
        pH = null;
        gn = null;
        if (gc != null) {
            for (int var0 = 0; var0 < gc.length; ++var0) {
                gc[var0] = null;
            }

            gc = null;
        }

        if (gd != null) {
            for (int var1 = 0; var1 < gd.length; ++var1) {
                gd[var1] = null;
            }

            gd = null;
        }

        if (fB != null) {
            for (int var2 = 0; var2 < fB.length; ++var2) {
                fB[var2] = null;
            }

            fB = null;
        }

        if (fC != null) {
            for (int var3 = 0; var3 < fC.length; ++var3) {
                fC[var3] = null;
            }

            fC = null;
        }

        ge = null;
    }

    private static void b(short var0) {
        gs = new int[var0];
        gt = new String[var0];
        gu = new short[var0];
        pR = new String[var0];
        pI = new short[var0];
        pJ = new short[var0];
        pK = new short[var0];
        pL = new short[var0];
        pM = new long[var0];
        pN = new long[var0];
        gv = new long[var0];
        pO = new String[var0];
        gw = new short[var0];
        gx = new short[var0];
        gy = new short[var0];
        gz = new short[var0];
        gA = new short[var0][];
        pP = new String[var0][];
        gB = new byte[var0][];
        gC = new int[var0];
        gD = new int[var0];
        gE = new int[var0];
        gF = new int[var0];
        gG = new byte[var0];
        pS = new String[var0][];
        pT = new String[var0][];
    }

    private static void a(DataInputStream var0, byte var1, int var2) throws IOException {
        gs[var2] = var0.readInt();
        gt[var2] = var0.readUTF();
        gu[var2] = var0.readShort();
        pI[var2] = var0.readShort();
        pJ[var2] = var0.readShort();
        pK[var2] = var0.readShort();
        pL[var2] = var0.readShort();
        pM[var2] = var0.readLong();
        pN[var2] = var0.readLong();
        gv[var2] = var0.readLong();
        if (var0.readByte() > 0) {
            pO[var2] = var0.readUTF();
        }

        gG[var2] = var0.readByte();
        pR[var2] = var0.readUTF();
        if ((var1 = (byte) var0.readShort()) > 0) {
            pS[var2] = new String[var1];

            for (int var3 = 0; var3 < var1; ++var3) {
                pS[var2][var3] = var0.readUTF();
            }
        }

        short var6;
        if ((var6 = var0.readShort()) > 0) {
            pT[var2] = new String[var6];

            for (int var5 = 0; var5 < var6; ++var5) {
                pT[var2][var5] = var0.readUTF();
            }
        }

    }

    private static void a(DataInputStream var0, int var1) throws IOException {
        byte var2 = 0;
        gw[var1] = var0.readShort();
        gx[var1] = var0.readShort();
        gy[var1] = var0.readShort();
        gz[var1] = var0.readShort();
        if ((var2 = var0.readByte()) > 0) {
            gA[var1] = new short[var2];
            pP[var1] = new String[var2];
            gB[var1] = new byte[var2];

            for (byte var3 = 0; var3 < var2; ++var3) {
                gA[var1][var3] = var0.readShort();
                pP[var1][var3] = var0.readUTF();
                gB[var1][var3] = var0.readByte();
            }
        }

        gC[var1] = var0.readInt();
        gD[var1] = var0.readInt();
        gE[var1] = var0.readInt();
        gF[var1] = var0.readInt();
    }

    public static String g(StringBuffer var0, int var1) {
        if (var0 == null) {
            var0 = new StringBuffer();
        } else {
            GlobalConfig.clearStr(var0);
        }

        var0.append(" ").append('\t');
        var0.append(" ").append('\t');
        var0.append(gt[var1]);
        var0.append('\t');
        var0.append("价格:");
        var0.append(a(gv[var1]));
        var0.append('\t');
        var0.append("等级:");
        var0.append(gu[var1]);
        var0.append('\t');
        var0.append("星级:").append(pR[var1]).append('\t');
        if (pI[var1] > 0 || pJ[var1] > 0) {
            var0.append("攻击:");
            var0.append(pI[var1]);
            var0.append("-");
            var0.append(pJ[var1]);
            var0.append('\t');
        }

        if (pK[var1] > 0 || pL[var1] > 0) {
            var0.append("法攻:");
            var0.append(pK[var1]);
            var0.append("-");
            var0.append(pL[var1]);
            var0.append('\t');
        }

        var0.append("经验:");
        var0.append(pM[var1]);
        var0.append("/");
        var0.append(pN[var1]);
        var0.append('\t');
        if (pO[var1] != null) {
            var0.append("技能:");
            var0.append(pO[var1]);
        }

        if (pS[var1] != null) {
            var0.append("技能附魂:");

            for (int var2 = 0; var2 < pS[var1].length; ++var2) {
                if (pS[var1][var2] != null) {
                    var0.append(pS[var1][var2]);
                    var0.append(",");
                }
            }

            var0.append('\t');
        }

        if (pT[var1] != null) {
            var0.append("状态附魂:");

            for (int var3 = 0; var3 < pT[var1].length; ++var3) {
                if (pT[var1][var3] != null) {
                    var0.append(pT[var1][var3]);
                    var0.append(",");
                }
            }

            var0.append('\t');
        }

        return var0.toString();
    }

    private static void Y() {
        gs = null;
        gu = null;
        pI = null;
        pJ = null;
        pK = null;
        pL = null;
        pM = null;
        pN = null;
        gv = null;
        pO = null;
        if (null != null) {
            for (int var0 = 0; var0 < pO.length; ++var0) {
                pO[var0] = null;
            }

            pO = null;
        }

        if (gt != null) {
            for (int var1 = 0; var1 < gt.length; ++var1) {
                gt[var1] = null;
            }

            gt = null;
        }

        gw = null;
        gx = null;
        gy = null;
        gz = null;
        gA = null;
        if (pP != null) {
            for (int var2 = 0; var2 < pP.length; ++var2) {
                pP[var2] = null;
            }

            pP = null;
        }

        if (gB != null) {
            for (int var3 = 0; var3 < gB.length; ++var3) {
                gB[var3] = null;
            }

            gB = null;
        }

        gC = null;
        gD = null;
        gE = null;
        gF = null;
        gG = null;
    }

    public static void C() {
        gH = null;
        gI = null;
        gJ = null;
        gK = null;
        gL = null;
        gM = null;
        gN = null;
        gO = null;
    }

    public static void J(DataInputStream var0) throws IOException {
        r = var0.readUTF();
        short var1 = var0.readShort();
        gR = var0.readByte();
        if (var1 > 0) {
            gS = new String[var1];
            gT = new byte[var1];
            gU = new String[var1];
            gV = new short[var1];
            gW = new byte[var1];
            gX = new byte[var1];
            gY = new short[var1];
            gZ = new short[var1];
            pU = new short[var1];
            pV = new short[var1];
            pW = new short[var1];
            pX = new short[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                gS[var2] = var0.readUTF();
                gT[var2] = var0.readByte();
                gU[var2] = var0.readUTF();
                gV[var2] = var0.readShort();
                gW[var2] = var0.readByte();
                gX[var2] = var0.readByte();
                gY[var2] = var0.readShort();
                gZ[var2] = var0.readShort();
                pU[var2] = var0.readShort();
                if (pU[var2] > 0) {
                    pV[var2] = var0.readShort();
                    pW[var2] = var0.readShort();
                    pX[var2] = var0.readShort();
                }
            }

            if (bw >= 1) {
                ha = new byte[var1];

                for (int var3 = 0; var3 < var1; ++var3) {
                    ha[var3] = var0.readByte();
                }

                return;
            }
        } else {
            D();
        }

    }

    public static void D() {
        if (gS != null) {
            for (int var0 = 0; var0 < gS.length; ++var0) {
                gS[var0] = null;
            }

            gS = null;
        }

        if (gU != null) {
            for (int var1 = 0; var1 < gU.length; ++var1) {
                gU[var1] = null;
            }

            gU = null;
        }

        gT = null;
        gV = null;
        gW = null;
        gX = null;
        pU = null;
        pV = null;
        pW = null;
        pX = null;
        ha = null;
        gY = null;
        gZ = null;
    }

    public static String a(long var0) {
        long[] var2;
        (var2 = new long[3])[0] = var0 / 100000000L;
        var2[1] = (var0 - var2[0] * 100000000L) / 10000L;
        var2[2] = var0 - var2[0] * 100000000L - var2[1] * 10000L;
        pY.delete(0, pY.length());
        if (var2[0] == 0L && var2[1] == 0L && var2[2] == 0L) {
            pY.append("0两");
        } else {
            if (var2[0] != 0L) {
                pY.append(var2[0]);
                pY.append("亿");
            }

            if (var2[1] != 0L) {
                pY.append(var2[1]);
                pY.append("万");
            }

            if (var2[2] != 0L) {
                pY.append(var2[2]);
                pY.append("两");
            }
        }

        return pY.toString();
    }

    public static void K(DataInputStream var0) throws IOException {
        byte var1;
        if ((var1 = var0.readByte()) < 0) {
            E();
        } else {
            byte var2 = 0;
            hb = new int[var1];
            hc = new short[var1][];
            hd = new short[var1];
            he = new short[var1];
            hf = new short[var1];
            hg = new short[var1];
            hh = new short[var1];
            hi = new short[var1];
            hj = new short[var1];

            for (byte var3 = 0; var3 < var1; ++var3) {
                hb[var3] = var0.readInt();
                hd[var3] = (short) (16 * var0.readByte());
                he[var3] = (short) (16 * var0.readByte());
                hf[var3] = (short) (16 * var0.readByte());
                hg[var3] = var0.readShort();
                hh[var3] = var0.readShort();
                hi[var3] = var0.readShort();
                hj[var3] = var0.readShort();
                if ((var2 = var0.readByte()) > 0) {
                    hc[var3] = new short[var2];

                    for (byte var4 = 0; var4 < var2; ++var4) {
                        hc[var3][var4] = var0.readShort();
                    }
                }
            }

            hk = new byte[var1];

            for (byte var6 = 0; var6 < var1; ++var6) {
                hk[var6] = var0.readByte();
            }

        }
    }

    public static void L(DataInputStream var0) throws IOException {
        byte var1;
        if ((var1 = var0.readByte()) > 0) {
            hl = new short[var1];
            hm = new String[var1];
            hn = new int[var1];
            ho = new int[var1];
            hp = new short[var1];
            hq = new byte[var1];
            hr = new byte[var1];
            hs = new short[var1];
            ht = new short[var1];
            hu = new short[var1];
            hv = new short[var1];

            for (byte var2 = 0; var2 < var1; ++var2) {
                hl[var2] = var0.readShort();
                hm[var2] = var0.readUTF();
                hn[var2] = var0.readInt();
                ho[var2] = var0.readInt();
                hp[var2] = var0.readShort();
                hq[var2] = var0.readByte();
                hr[var2] = var0.readByte();
                hs[var2] = var0.readShort();
                ht[var2] = var0.readShort();
                hu[var2] = var0.readShort();
                hv[var2] = var0.readShort();
            }

        } else {
            hl = null;
            hn = null;
            hp = null;
            hq = null;
            hr = null;
            hs = null;
            ht = null;
            hu = null;
            hv = null;
            ho = null;
            if (hm != null) {
                for (int var3 = 0; var3 < hm.length; ++var3) {
                    hm[var3] = null;
                }

                hm = null;
            }

        }
    }

    public static void E() {
        hb = null;
        hc = null;
        hd = null;
        he = null;
        hf = null;
        hk = null;
    }

    public static void M(DataInputStream var0) throws IOException {
        if (GlobalConfig.channel == 1) {
            if (GlobalConfig.logined) {
                ChongZhiModel.g = var0.readUTF();
                ChongZhiModel.h = var0.readUTF();
                ChongZhiModel.GameId = var0.readInt();
                ChongZhiModel.CpId = var0.readInt();
            } else {
                hw = var0.readByte() > 0;
                hx = var0.readByte();
            }
        }

        byte var1;
        if ((var1 = var0.readByte()) > 0) {
            hA = new String[var1];
            hB = new String[var1];
            hC = new String[var1];
            hF = new String[var1];
            hE = new short[var1];

            for (byte var2 = 0; var2 < var1; ++var2) {
                hA[var2] = var0.readUTF();
                hB[var2] = var0.readUTF();
                hC[var2] = var0.readUTF();
                hE[var2] = var0.readShort();
                hF[var2] = var0.readUTF();
            }
        } else {
            if (hA != null) {
                for (int var5 = 0; var5 < hA.length; ++var5) {
                    hA[var5] = null;
                }

                hA = null;
            }

            if (hB != null) {
                for (int var6 = 0; var6 < hB.length; ++var6) {
                    hB[var6] = null;
                }

                hB = null;
            }

            if (hC != null) {
                for (int var7 = 0; var7 < hC.length; ++var7) {
                    hC[var7] = null;
                }

                hC = null;
            }

            if (hF != null) {
                for (int var8 = 0; var8 < hF.length; ++var8) {
                    hF[var8] = null;
                }

                hF = null;
            }

            hD = null;
            hE = null;
        }

        if (var1 > 0 && GlobalConfig.channel != 0) {
            hD = new short[var1];

            for (byte var9 = 0; var9 < var1; ++var9) {
                hD[var9] = var0.readShort();
                GlobalConfig.printStr("ServerIdPrix|" + hA[var9] + "|" + hD[var9]);
            }
        }

        var0.readUTF();
        var0.readByte();
        ChongZhiModel.g = var0.readUTF();
        ChongZhiModel.h = var0.readUTF();
        hy = var0.readUTF();
        hz = var0.readUTF();
        if (var0.readByte() > 0) {
            String var4 = var0.readUTF();
            String var3 = var0.readUTF();
            if (!"".equals(var4)) {
                MainCanvas.zhanghao = var4;
                ChongZhiModel.zhanghao = var4;
            }

            if (!"".equals(var3)) {
                MainCanvas.pwd = var3;
                ChongZhiModel.pwd = var3;
            }

            ChongZhiModel.rememberPwd = true;
            ChongZhiModel.saveZhangHaoPwd();
        }

    }

    public static void N(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) > 0) {
            hG = var0.readShort();
            String var2 = var0.readUTF();
            hI = var0.readByte();
            if (var2.trim().length() <= 0) {
                F();
                return;
            }

            MainCanvas.ae.e(String.valueOf(var2));
            hH = MainCanvas.ae.getFrame(String.valueOf(var2));
            hJ = new byte[var1];
            hK = new byte[var1];

            for (short var3 = 0; var3 < var1; ++var3) {
                hJ[var3] = var0.readByte();
                hK[var3] = var0.readByte();
            }
        } else {
            F();
        }

    }

    public static void F() {
        hG = -1;
        hH = null;
        hI = -1;
        hJ = null;
        hK = null;
    }

    public static void O(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) <= 0) {
            hL = null;
            hM = null;
            pZ = null;
            hN = null;
        } else {
            hL = new short[var1];
            hM = new String[var1];
            pZ = new long[var1];
            hN = new String[var1];
            hO = new int[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                hL[var2] = var0.readShort();
                hM[var2] = var0.readUTF();
                hN[var2] = var0.readUTF();
                pZ[var2] = var0.readLong();
                hO[var2] = var0.readInt();
            }

        }
    }

    public static void P(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) <= 0) {
            hP = null;
            hQ = null;
            hR = null;
            hS = null;
            hT = null;
        } else {
            hP = new int[var1];
            hQ = new String[var1];
            hR = new String[var1];
            hS = new short[var1];
            hT = new byte[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                hP[var2] = var0.readInt();
                hQ[var2] = var0.readUTF();
                hR[var2] = var0.readUTF();
                hS[var2] = var0.readShort();
                hT[var2] = var0.readByte();
            }

        }
    }

    public static void Q(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) <= 0) {
            hU = null;
            hV = null;
            hW = null;
        } else {
            hU = new String[var1];
            hV = new String[var1];
            hW = new String[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                hU[var2] = var0.readUTF();
                hV[var2] = var0.readUTF();
                hW[var2] = var0.readUTF();
            }

        }
    }

    public static void R(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) <= 0) {
            hX = null;
            hY = null;
            hZ = null;
            ia = null;
            qa = null;
            qb = null;
            qc = null;
        } else {
            hX = new int[var1];
            hY = new String[var1];
            hZ = new String[var1];
            ia = new String[var1];
            qa = new short[var1];
            qb = new short[var1];
            qc = new short[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                hX[var2] = var0.readInt();
                hY[var2] = var0.readUTF();
                hZ[var2] = var0.readUTF();
                ia[var2] = var0.readUTF();
                qa[var2] = var0.readShort();
                qb[var2] = var0.readShort();
                qc[var2] = var0.readShort();
            }

        }
    }

    public static boolean G() {
        return qd >= 0;
    }

    private static void a(bv var0) {
        if (ij == null) {
            ij = new Vector();
        }

        ij.addElement(var0);
    }

    public static void S(DataInputStream var0) throws IOException {
        ib = var0.readByte();
        qd = var0.readInt();
        if (ij != null) {
            ij.removeAllElements();
        }

        boolean var1 = false;
        short var2 = var0.readShort();
        Object var5 = null;

        for (int var3 = 0; var3 < var2; ++var3) {
            bv var6;
            (var6 = new bv()).a(var0);
            a(var6);
        }

        ic = var0.readShort();
        id = var0.readShort();
        if ((var2 = (short) var0.readByte()) < 0) {
            ie = null;
            if_2 = null;
            ig = null;
            ih = null;
            ii = null;
        } else {
            ie = new short[var2];
            if_2 = new short[var2];
            ig = new short[var2];
            ih = new short[var2];
            ii = new byte[var2][];

            for (int var9 = 0; var9 < var2; ++var9) {
                ie[var9] = var0.readShort();
                if_2[var9] = var0.readShort();
                ig[var9] = var0.readShort();
                ih[var9] = var0.readShort();
                byte var7;
                if ((var7 = var0.readByte()) > 0) {
                    ii[var9] = new byte[var7];

                    for (int var4 = 0; var4 < var7; ++var4) {
                        ii[var9][var4] = var0.readByte();
                    }
                } else {
                    ii[var9] = null;
                }
            }

        }
    }

    public static void T(DataInputStream var0) throws IOException {
        gQ = var0.readShort();
        short var1 = var0.readShort();
        gR = var0.readByte();
        if (var1 <= 0) {
            ik = null;
            il = null;
            in = null;
            im = null;
            io = null;
        } else {
            ik = new int[var1];
            il = new String[var1];
            im = new String[var1];
            in = new byte[var1];
            io = new byte[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                ik[var2] = var0.readInt();
                il[var2] = var0.readUTF();
                im[var2] = var0.readUTF();
                in[var2] = var0.readByte();
            }

            for (int var3 = 0; var3 < var1; ++var3) {
                io[var3] = var0.readByte();
            }

        }
    }

    public static void U(DataInputStream var0) throws IOException {
        gQ = var0.readShort();
        short var1 = var0.readShort();
        gR = var0.readByte();
        if (var1 <= 0) {
            ip = null;
            iq = null;
            ir = null;
            is = null;
        } else {
            ip = new String[var1];
            iq = new String[var1];
            ir = new String[var1];
            is = new byte[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                ip[var2] = var0.readUTF();
                iq[var2] = var0.readUTF();
                ir[var2] = var0.readUTF();
            }

            for (int var3 = 0; var3 < var1; ++var3) {
                is[var3] = var0.readByte();
            }

        }
    }

    public static void V(DataInputStream var0) throws IOException {
        gQ = var0.readShort();
        short var1 = var0.readShort();
        gR = var0.readByte();
        if (var1 <= 0) {
            it = null;
            iu = null;
            iv = null;
            iw = null;
            ix = null;
        } else {
            it = new String[var1];
            iu = new String[var1];
            iv = new short[var1];
            iw = new String[var1];
            ix = new byte[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                it[var2] = var0.readUTF();
                iu[var2] = var0.readUTF();
                iv[var2] = var0.readShort();
                iw[var2] = var0.readUTF();
                ix[var2] = var0.readByte();
            }

        }
    }

    public static void W(DataInputStream var0) throws IOException {
        gQ = var0.readShort();
        short var1 = var0.readShort();
        gR = var0.readByte();
        if (var1 <= 0) {
            iy = null;
            iz = null;
            iA = null;
            iB = null;
            iD = null;
            iE = null;
            if_2 = null;
            iG = null;
        } else {
            iy = new String[var1];
            iz = new String[var1];
            iA = new String[var1];
            iB = new int[var1];
            iC = new int[var1];
            iD = new byte[var1];
            iE = new short[var1];
            if_2 = new short[var1];
            iG = new int[var1];
            byte var2 = 0;

            for (int var3 = 0; var3 < var1; ++var3) {
                iy[var3] = var0.readUTF();
                iz[var3] = var0.readUTF();
                iA[var3] = var0.readUTF();
                iB[var3] = var0.readInt();
                iD[var3] = var0.readByte();
                iE[var3] = var0.readShort();
                if_2[var3] = var0.readShort();
                var2 = var0.readByte();
                iG[var3] = LoadingPage.pickColor(var2);
                iC[var3] = var0.readInt();
            }

        }
    }

    public static void X(DataInputStream var0) throws IOException {
        iH = var0.readUTF();
    }

    public static void Y(DataInputStream var0) throws IOException {
        iJ = var0.readByte();

        for (int var1 = 0; var1 < iI.length; ++var1) {
            iI[var1] = var0.readUTF();
        }

    }

    public static void Z(DataInputStream var0) throws IOException {
        if ((qe = var0.readByte()) == 1) {
            iK[0] = var0.readByte();
            iL[0] = var0.readByte();
            iM[0] = var0.readInt();
            iK[1] = var0.readByte();
            iL[1] = var0.readByte();
            iM[1] = var0.readInt();
        }

    }

    public static void aa(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) <= 0) {
            H();
        } else {
            byte var2 = 0;
            iN = new int[var1];
            iO = new String[var1];
            iP = new byte[var1];
            iQ = new byte[var1];
            iR = new short[var1];
            iS = new String[var1];
            iT = new String[var1];
            iU = new String[var1];
            iV = new String[var1];
            iW = new String[var1];
            iX = new String[var1];
            iY = new short[var1];
            iZ = new long[var1];
            ja = new String[var1];
            jb = new short[var1][];

            for (int var3 = 0; var3 < var1; ++var3) {
                iN[var3] = var0.readInt();
                iO[var3] = var0.readUTF();
                iP[var3] = var0.readByte();
                iQ[var3] = var0.readByte();
                iR[var3] = var0.readShort();
                iS[var3] = var0.readUTF();
                iT[var3] = var0.readUTF();
                iU[var3] = var0.readUTF();
                iV[var3] = var0.readUTF();
                iW[var3] = var0.readUTF();
                iX[var3] = var0.readUTF();
                iY[var3] = var0.readShort();
                iZ[var3] = var0.readLong();
                if (var0.readByte() > 0) {
                    ja[var3] = var0.readUTF();
                }

                if ((var2 = var0.readByte()) > 0) {
                    jb[var3] = new short[var2];

                    for (byte var4 = 0; var4 < var2; ++var4) {
                        jb[var3][var4] = var0.readShort();
                    }
                }
            }

        }
    }

    public static void H() {
        iN = null;
        iP = null;
        iQ = null;
        iR = null;
        iY = null;
        iZ = null;
        jb = null;
        if (ja != null) {
            for (int var0 = 0; var0 < ja.length; ++var0) {
                ja[var0] = null;
            }

            ja = null;
        }

        if (iO != null) {
            for (int var1 = 0; var1 < iO.length; ++var1) {
                iO[var1] = null;
            }

            iO = null;
        }

        if (iS != null) {
            for (int var2 = 0; var2 < iS.length; ++var2) {
                iS[var2] = null;
            }

            iS = null;
        }

        if (iT != null) {
            for (int var3 = 0; var3 < iT.length; ++var3) {
                iT[var3] = null;
            }

            iT = null;
        }

        if (iU != null) {
            for (int var4 = 0; var4 < iU.length; ++var4) {
                iU[var4] = null;
            }

            iU = null;
        }

        if (iV != null) {
            for (int var5 = 0; var5 < iV.length; ++var5) {
                iV[var5] = null;
            }

            iV = null;
        }

        if (iW != null) {
            for (int var6 = 0; var6 < iW.length; ++var6) {
                iW[var6] = null;
            }

            iW = null;
        }

        if (iX != null) {
            for (int var7 = 0; var7 < iX.length; ++var7) {
                iX[var7] = null;
            }

            iX = null;
        }

    }

    public static void ab(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) > 0) {
            jc = new byte[var1];
            jd = new String[var1];
            je = new String[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                jc[var2] = var0.readByte();
                jd[var2] = var0.readUTF();
                je[var2] = var0.readUTF();
            }
        }

    }

    public static void ac(DataInputStream var0) throws IOException {
        jf = var0.readUTF();
    }

    public static void ad(DataInputStream var0) throws IOException {
        jg = var0.readLong();
        jh = var0.readShort();
        ji = var0.readLong();
        jj = var0.readShort();
        jk = var0.readLong();
        jl = var0.readShort();
        jm = var0.readLong();
        jn = var0.readShort();
    }

    public static void ae(DataInputStream var0) throws IOException {
        gQ = var0.readShort();
        short var1 = var0.readShort();
        gR = var0.readByte();
        if (var1 <= 0) {
            I();
        } else {
            jo = new byte[var1];
            jp = new String[var1];
            jq = new String[var1];
            qf = new short[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                jo[var2] = var0.readByte();
                jp[var2] = var0.readUTF();
                jq[var2] = var0.readUTF();
                qf[var2] = var0.readShort();
            }

        }
    }

    public static void I() {
        jo = null;
        jp = null;
        jq = null;
        qf = null;
    }

    public static void af(DataInputStream var0) throws IOException {
        gQ = var0.readShort();
        short var1 = var0.readShort();
        gR = var0.readByte();
        if (var1 <= 0) {
            J();
        } else {
            jr = new int[var1];
            js = new String[var1];
            jt = new String[var1];
            ju = new short[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                jr[var2] = var0.readInt();
                js[var2] = var0.readUTF();
                jt[var2] = var0.readUTF();
                ju[var2] = var0.readShort();
            }

        }
    }

    public static void J() {
        jr = null;
        js = null;
        jt = null;
        ju = null;
    }

    public static void ag(DataInputStream var0) throws IOException {
        if (!G()) {
            ib = 4;
            if (ij != null) {
                ij.removeAllElements();
            }

            short var1 = var0.readShort();
            Object var2 = null;

            for (int var3 = 0; var3 < var1; ++var3) {
                bv var4;
                (var4 = new bv()).a(var0);
                a(var4);
            }

        }
    }

    public static void ah(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) > 0) {
            boolean var2 = false;
            jz = new int[var1];
            jA = new String[var1];
            jB = new int[var1];
            jC = new short[var1];
            jD = new String[var1];

            for (int var3 = 0; var3 < var1; ++var3) {
                jz[var3] = var0.readInt();
                jA[var3] = var0.readUTF();
                jB[var3] = var0.readInt();
                jC[var3] = var0.readShort();
                if (var0.readByte() > 0) {
                    jD[var3] = var0.readUTF();
                }
            }

        } else {
            jz = null;
            jA = null;
            jB = null;
            jC = null;
            jD = null;
        }
    }

    public static void ai(DataInputStream var0) throws IOException {
        byte var1;
        if ((var1 = var0.readByte()) <= 0) {
            jE = null;
            jF = null;
        } else {
            jE = new String[var1];
            jF = new long[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                jE[var2] = var0.readUTF();
                jF[var2] = var0.readLong();
            }

        }
    }

    public static void aj(DataInputStream var0) throws IOException {
        byte var1 = var0.readByte();
        jG = var0.readInt();
        if (var1 > 0) {
            jH = new int[var1];
            jI = new String[var1];
            jJ = new byte[var1];
            jK = new short[var1];
            qh = new String[var1];
            qi = new String[var1];
            qj = new String[var1];
            qk = new String[var1];
            ql = new String[var1];
            qm = new String[var1];
            qg = new short[var1];
            jL = new long[var1];
            qn = new String[var1];
            jM = new short[var1][];
            byte var2 = 0;

            for (byte var3 = 0; var3 < var1; ++var3) {
                jH[var3] = var0.readInt();
                jI[var3] = var0.readUTF();
                jJ[var3] = var0.readByte();
                jK[var3] = var0.readShort();
                qh[var3] = var0.readUTF();
                qi[var3] = var0.readUTF();
                qj[var3] = var0.readUTF();
                qk[var3] = var0.readUTF();
                ql[var3] = var0.readUTF();
                qm[var3] = var0.readUTF();
                qg[var3] = var0.readShort();
                jL[var3] = var0.readLong();
                if (var0.readByte() > 0) {
                    qn[var3] = var0.readUTF();
                }

                if ((var2 = var0.readByte()) > 0) {
                    jM[var3] = new short[var2];

                    for (byte var4 = 0; var4 < var2; ++var4) {
                        jM[var3][var4] = var0.readShort();
                    }
                }
            }

        } else {
            jH = null;
            jJ = null;
            jK = null;
            qg = null;
            jL = null;
            jM = null;
            if (qn != null) {
                for (int var5 = 0; var5 < qn.length; ++var5) {
                    qn[var5] = null;
                }

                qn = null;
            }

            if (jI != null) {
                for (int var6 = 0; var6 < jI.length; ++var6) {
                    jI[var6] = null;
                }

                jI = null;
            }

            if (qh != null) {
                for (int var7 = 0; var7 < qh.length; ++var7) {
                    qh[var7] = null;
                }

                qh = null;
            }

            if (qi != null) {
                for (int var8 = 0; var8 < qi.length; ++var8) {
                    qi[var8] = null;
                }

                qi = null;
            }

            if (qj != null) {
                for (int var9 = 0; var9 < qj.length; ++var9) {
                    qj[var9] = null;
                }

                qj = null;
            }

            if (qk != null) {
                for (int var10 = 0; var10 < qk.length; ++var10) {
                    qk[var10] = null;
                }

                qk = null;
            }

            if (ql != null) {
                for (int var11 = 0; var11 < ql.length; ++var11) {
                    ql[var11] = null;
                }

                ql = null;
            }

            if (qm != null) {
                for (int var12 = 0; var12 < qm.length; ++var12) {
                    qm[var12] = null;
                }

                qm = null;
            }

        }
    }

    public static void ak(DataInputStream var0) throws IOException {
        byte var1 = var0.readByte();
        gR = var0.readByte();
        gQ = (short) var0.readByte();
        if (var1 > 0) {
            byte var2 = 0;
            jN = new int[var1];
            jO = new String[var1];
            jQ = new byte[var1];
            jP = new byte[var1];
            jR = new short[var1];
            qo = new String[var1];
            qp = new String[var1];
            qq = new String[var1];
            qr = new String[var1];
            qs = new String[var1];
            qt = new String[var1];
            qu = new short[var1];
            qv = new long[var1];
            qw = new String[var1];
            qx = new short[var1][];
            qy = new long[var1];

            for (int var3 = 0; var3 < var1; ++var3) {
                jN[var3] = var0.readInt();
                jO[var3] = var0.readUTF();
                jQ[var3] = var0.readByte();
                jP[var3] = var0.readByte();
                jR[var3] = var0.readShort();
                qo[var3] = var0.readUTF();
                qp[var3] = var0.readUTF();
                qq[var3] = var0.readUTF();
                qr[var3] = var0.readUTF();
                qs[var3] = var0.readUTF();
                qt[var3] = var0.readUTF();
                qu[var3] = var0.readShort();
                qv[var3] = var0.readLong();
                qy[var3] = var0.readLong();
                if (var0.readByte() > 0) {
                    qw[var3] = var0.readUTF();
                }

                if ((var2 = var0.readByte()) > 0) {
                    qx[var3] = new short[var2];

                    for (byte var4 = 0; var4 < var2; ++var4) {
                        qx[var3][var4] = var0.readShort();
                    }
                }
            }

        } else {
            jN = null;
            jP = null;
            jQ = null;
            jR = null;
            qu = null;
            qv = null;
            qx = null;
            if (qw != null) {
                for (int var5 = 0; var5 < qw.length; ++var5) {
                    qw[var5] = null;
                }

                qw = null;
            }

            if (jO != null) {
                for (int var6 = 0; var6 < jO.length; ++var6) {
                    jO[var6] = null;
                }

                jO = null;
            }

            if (qo != null) {
                for (int var7 = 0; var7 < qo.length; ++var7) {
                    qo[var7] = null;
                }

                qo = null;
            }

            if (qp != null) {
                for (int var8 = 0; var8 < qp.length; ++var8) {
                    qp[var8] = null;
                }

                qp = null;
            }

            if (qq != null) {
                for (int var9 = 0; var9 < qq.length; ++var9) {
                    qq[var9] = null;
                }

                qq = null;
            }

            if (qr != null) {
                for (int var10 = 0; var10 < qr.length; ++var10) {
                    qr[var10] = null;
                }

                qr = null;
            }

            if (qs != null) {
                for (int var11 = 0; var11 < qs.length; ++var11) {
                    qs[var11] = null;
                }

                qs = null;
            }

            if (qt != null) {
                for (int var12 = 0; var12 < qt.length; ++var12) {
                    qt[var12] = null;
                }

                qt = null;
            }

        }
    }

    public static String h(StringBuffer var0, int var1) {
        if (var0 == null) {
            var0 = new StringBuffer();
        } else {
            GlobalConfig.clearStr(var0);
        }

        StringBuffer var2;
        (var2 = new StringBuffer()).append(jO[var1]);
        var2.append("（");
        GlobalConfig.yinLiangFormat(var0, qv[var1]);
        var2.append(var0.toString() + "）");
        var2.append('\t');
        if (qy[var1] > 0L) {
            var2.append("剩余时间:");
            var2.append(qy[var1] / 3600L > 0L ? qy[var1] / 3600L + "小时" : qy[var1] / 60L + "分钟");
            var2.append('\t');
        }

        if (!qo[var1].equals("")) {
            var2.append(qo[var1]);
            var2.append('\t');
        }

        if (!qq[var1].equals("")) {
            var2.append(qq[var1]);
            var2.append('\t');
        }

        if (qu[var1] > 0) {
            var2.append("等级:");
            var2.append(qu[var1]);
            var2.append('\t');
        }

        if (qw[var1] != null) {
            var2.append(qw[var1]);
            var2.append('\t');
        }

        return var2.toString();
    }

    public static void al(DataInputStream var0) throws IOException {
        byte var1 = var0.readByte();
        gR = var0.readByte();
        gQ = (short) var0.readByte();
        if (var1 <= 0) {
            jS = null;
            qz = null;
            jT = null;
            qA = null;
            jU = null;
        } else {
            jS = new String[var1];
            qz = new long[var1];
            jT = new String[var1];
            qA = new byte[var1];
            jU = new long[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                jS[var2] = var0.readUTF();
                qz[var2] = var0.readLong();
                jT[var2] = var0.readUTF();
                qA[var2] = var0.readByte();
                jU[var2] = var0.readLong();
            }

        }
    }

    public static void am(DataInputStream var0) throws IOException {
        byte var1;
        if ((var1 = var0.readByte()) > 0) {
            byte var2 = 0;
            ct = new int[var1];
            cu = new String[var1];
            cv = new byte[var1];
            cw = new byte[var1];
            cx = new short[var1];
            nJ = new String[var1];
            nK = new String[var1];
            nL = new String[var1];
            nM = new String[var1];
            nN = new String[var1];
            nO = new String[var1];
            nP = new short[var1];
            cy = new long[var1];
            nQ = new String[var1];
            nR = new short[var1][];
            nS = new long[var1];

            for (int var3 = 0; var3 < var1; ++var3) {
                ct[var3] = var0.readInt();
                cu[var3] = var0.readUTF();
                cv[var3] = var0.readByte();
                cw[var3] = var0.readByte();
                cx[var3] = var0.readShort();
                nJ[var3] = var0.readUTF();
                nK[var3] = var0.readUTF();
                nL[var3] = var0.readUTF();
                nM[var3] = var0.readUTF();
                nN[var3] = var0.readUTF();
                nO[var3] = var0.readUTF();
                nP[var3] = var0.readShort();
                cy[var3] = var0.readLong();
                if (var0.readByte() > 0) {
                    nQ[var3] = var0.readUTF();
                }

                if ((var2 = var0.readByte()) > 0) {
                    nR[var3] = new short[var2];

                    for (byte var4 = 0; var4 < var2; ++var4) {
                        nR[var3][var4] = var0.readShort();
                    }
                }
            }

            for (int var6 = 0; var6 < var1; ++var6) {
                nS[var6] = var0.readLong();
            }
        } else if (var1 <= 0) {
            m();
        }

        gR = var0.readByte();
        gQ = (short) var0.readByte();
    }

    public static String a(short var0, StringBuffer var1, int var2) {
        if (var1 == null) {
            new StringBuffer();
        } else {
            GlobalConfig.clearStr(var1);
        }

        var1 = new StringBuffer();
        if (var0 == 59 && nS[var2] > 0L) {
            var1.append("保存时间:");
            var1.append(nS[var2] / 3600L > 0L ? nS[var2] / 3600L + "小时" : nS[var2] / 60L + "分钟");
            var1.append('\t');
        }

        if (!nJ[var2].equals("")) {
            var1.append(nJ[var2]);
            var1.append('\t');
        }

        if (!nK[var2].equals("")) {
            var1.append(nK[var2]);
            var1.append('\t');
        }

        if (!nL[var2].equals("")) {
            var1.append(nL[var2]);
            var1.append('\t');
        }

        if (nP[var2] > 0) {
            var1.append("等级:");
            var1.append(nP[var2]);
            var1.append('\t');
        }

        if (nQ[var2] != null) {
            var1.append(nQ[var2]);
            var1.append('\t');
        }

        return var1.toString();
    }

    public static void an(DataInputStream var0) throws IOException {
        byte var1 = var0.readByte();
        gR = var0.readByte();
        gQ = (short) var0.readByte();
        if (var1 <= 0) {
            jV = null;
            qB = null;
            jW = null;
            jX = null;
        } else {
            jV = new String[var1];
            qB = new long[var1];
            jW = new String[var1];
            jX = new long[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                jV[var2] = var0.readUTF();
                qB[var2] = var0.readLong();
                jW[var2] = var0.readUTF();
                jX[var2] = var0.readLong();
            }

        }
    }

    public static String a(StringBuffer var0, int var1, byte var2) {
        if (gs != null && gs.length > 0) {
            if (var0 == null) {
                var0 = new StringBuffer();
            } else {
                GlobalConfig.clearStr(var0);
            }

            if (gt == null) {
                return var0.toString();
            } else {
                var0.append(" ").append('\t');
                var0.append(" ").append('\t');
                var0.append(gt[var1]);
                var0.append('\t');
                var0.append("价格:");
                var0.append(a(gv[var1]));
                var0.append('\t');
                var0.append("星级:").append(pR[var1]).append('\t');
                if (var2 == 0) {
                    var0.append("剩余时间:");
                    var0.append(pQ[var1] / 3600L > 0L ? pQ[var1] / 3600L + "小时" : pQ[var1] / 60L + "分钟");
                    var0.append('\t');
                } else if (var2 == 1) {
                    var0.append("保存时间:");
                    var0.append(pQ[var1] / 3600L > 0L ? pQ[var1] / 3600L + "小时" : pQ[var1] / 60L + "分钟");
                    var0.append('\t');
                }

                var0.append("等级:");
                var0.append(gu[var1]);
                var0.append('\t');
                if (pI[var1] > 0 || pJ[var1] > 0) {
                    var0.append("攻击:");
                    var0.append(pI[var1]);
                    var0.append("-");
                    var0.append(pJ[var1]);
                    var0.append('\t');
                }

                if (pK[var1] > 0 || pL[var1] > 0) {
                    var0.append("法攻:");
                    var0.append(pK[var1]);
                    var0.append("-");
                    var0.append(pL[var1]);
                    var0.append('\t');
                }

                var0.append("经验:");
                var0.append(pM[var1]);
                var0.append("/");
                var0.append(pN[var1]);
                var0.append('\t');
                if (pO[var1] != null) {
                    var0.append("技能:");
                    var0.append(pO[var1]);
                }

                if (pS[var1] != null) {
                    var0.append("技能附魂:");

                    for (int var3 = 0; var3 < pS[var1].length; ++var3) {
                        if (pS[var1][var3] != null) {
                            var0.append(pS[var1][var3]);
                            var0.append(",");
                        }
                    }

                    var0.append('\t');
                }

                if (pT[var1] != null) {
                    var0.append("状态附魂:");

                    for (int var4 = 0; var4 < pT[var1].length; ++var4) {
                        if (pT[var1][var4] != null) {
                            var0.append(pT[var1][var4]);
                            var0.append(",");
                        }
                    }

                    var0.append('\t');
                }

                return var0.toString();
            }
        } else {
            return null;
        }
    }

    public static void ao(DataInputStream var0) throws IOException {
        gQ = var0.readShort();
        short var1 = var0.readShort();
        gR = var0.readByte();
        if (var1 <= 0) {
            jY = null;
            jZ = null;
            ka = null;
            kb = null;
            kc = null;
            kd = null;
        } else {
            jY = new String[var1];
            jZ = new String[var1];
            ka = new byte[var1];
            kb = new byte[var1];
            kc = new byte[var1];
            kd = new byte[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                jY[var2] = var0.readUTF();
                jZ[var2] = var0.readUTF();
                ka[var2] = var0.readByte();
                kb[var2] = var0.readByte();
                kc[var2] = var0.readByte();
                kd[var2] = var0.readByte();
            }

        }
    }

    public static String d(byte var0) {
        if (var0 == 1) {
            return "中立";
        } else if (var0 == 2) {
            return "敌对";
        } else {
            return var0 == 3 ? "交战" : "";
        }
    }

    public static void ap(DataInputStream var0) throws IOException {
        x = 0;
        v = w = var0.readLong();
        L = 1;
        byte var1;
        if ((var1 = var0.readByte()) > 0) {
            e(var0, var1);
        }

        if ((var1 = var0.readByte()) > 0) {
            d(var0, var1);
        }

        if ((var1 = var0.readByte()) > 0) {
            c(var0, var1);
        }

    }

    public static void aq(DataInputStream var0) throws IOException {
        kh = var0.readInt();
        ki = var0.readInt();
    }

    public static void ar(DataInputStream var0) throws IOException {
        kk = var0.readUTF();
    }

    public static void as(DataInputStream var0) throws IOException {
        gQ = var0.readShort();
        gR = var0.readByte();
        kl = var0.readUTF();
    }

    public static String i(StringBuffer var0, int var1) {
        if (var0 == null) {
            var0 = new StringBuffer();
        } else {
            GlobalConfig.clearStr(var0);
        }

        if (km == null) {
            return var0.toString();
        } else {
            if (qD[var1] > 0) {
                var0.append("人物等级:");
                var0.append(qD[var1]);
                var0.append('\t');
            }

            if (qE[var1] > 0) {
                var0.append("装备等级:");
                var0.append(qE[var1]);
                var0.append('\t');
            }

            if (qF[var1] > 0L) {
                var0.append("要求金钱:");
                var0.append(a(qF[var1]));
                var0.append('\t');
            }

            if (qG[var1] > 0L) {
                var0.append("要求经验:");
                var0.append(qG[var1]);
                var0.append('\t');
            }

            if (qH[var1] != null && !qH[var1].trim().equals("")) {
                var0.append("要求声望:");
                var0.append(qH[var1]);
                var0.append('\t');
            }

            if (qI[var1] != null) {
                var0.append("需求原料:").append('\t');

                for (byte var2 = 0; var2 < qI[var1].length; ++var2) {
                    var0.append(qI[var1][var2]).append(" X ").append(qK[var1][var2]).append('\t');
                }
            }

            if (qL[var1] != null) {
                var0.append(qL[var1]);
            }

            return var0.toString();
        }
    }

    public static void at(DataInputStream var0) throws IOException {
        byte var1;
        if ((var1 = var0.readByte()) > 0) {
            km = new short[var1];
            kn = new String[var1];
            qC = new byte[var1];
            qD = new short[var1];
            qE = new short[var1];
            qF = new long[var1];
            qG = new long[var1];
            qH = new String[var1];
            qI = new String[var1][];
            qJ = new short[var1][];
            qK = new short[var1][];
            qL = new String[var1];

            for (byte var2 = 0; var2 < var1; ++var2) {
                km[var2] = var0.readShort();
                kn[var2] = var0.readUTF();
                qC[var2] = var0.readByte();
                qD[var2] = var0.readShort();
                qE[var2] = var0.readShort();
                qF[var2] = var0.readLong();
                qG[var2] = var0.readLong();
                qH[var2] = var0.readUTF();
                qL[var2] = var0.readUTF();
                byte var3;
                if ((var3 = var0.readByte()) > 0) {
                    qI[var2] = new String[var3];
                    qJ[var2] = new short[var3];
                    qK[var2] = new short[var3];

                    for (byte var4 = 0; var4 < var3; ++var4) {
                        qI[var2][var4] = var0.readUTF();
                        qJ[var2][var4] = var0.readShort();
                        qK[var2][var4] = var0.readShort();
                    }
                }
            }

        } else {
            km = null;
            qD = null;
            qF = null;
            qG = null;
            qJ = null;
            qK = null;
            qE = null;
            if (kn != null) {
                for (byte var5 = 0; var5 < kn.length; ++var5) {
                    kn[var5] = null;
                }

                kn = null;
            }

            if (qL != null) {
                for (byte var6 = 0; var6 < qL.length; ++var6) {
                    qL[var6] = null;
                }

                qL = null;
            }

            qC = null;
            if (qI != null) {
                for (byte var7 = 0; var7 < qI.length; ++var7) {
                    for (byte var8 = 0; var8 < qI[var7].length; ++var8) {
                        qI[var7][var8] = null;
                    }
                }

                qI = null;
            }

        }
    }

    public static void a(int var0, int var1) {
        int var2 = var0;
        if (var1 == 0) {
            for (byte var3 = 0; var3 < fh.length; ++var3) {
                if (fk[var3] == var0) {
                    var2 = var3;
                }
            }
        } else {
            for (byte var5 = 0; var5 < fo.length; ++var5) {
                if (fr[var5] == var0) {
                    var2 = var5;
                }
            }
        }

        ko = var1 == 0 ? fh[var2] : fo[var2];
        kp = var1 == 0 ? oz[var2] : oM[var2];
        kq = var1 == 0 ? oz[var2] : oM[var2];
        ks = var1 == 0 ? oA[var2] : oN[var2];
        kt = var1 == 0 ? oB[var2] : oO[var2];
        ku = var1 == 0 ? oC[var2] : oP[var2];
        kv = var1 == 0 ? oD[var2] : oQ[var2];
        kw = var1 == 0 ? oE[var2] : oR[var2];
        kx = var1 == 0 ? oF[var2] : oS[var2];
        if ((var1 == 0 ? oI[var2] : oV[var2]) != null) {
            byte var6;
            if ((var6 = (byte) (var1 == 0 ? oI[var2].length : oV[var2].length)) > 0) {
                kr = new short[var6];

                for (byte var4 = 0; var4 < var6; ++var4) {
                    kr[var4] = var1 == 0 ? oI[var2][var4] : oV[var2][var4];
                }
            }
        } else {
            kr = null;
        }

        ky = var1 == 0 ? oG[var2] : oT[var2];
        kz = -1;
        kA = var1 == 0 ? fm[var2] : ft[var2];
    }

    public static void a(bn var0) {
        ko = var0.a;
        kp = var0.b;
        kq = var0.b;
        ks = var0.j.trim();
        kt = var0.k.trim();
        ku = var0.l.trim();
        kv = var0.m.trim();
        kw = var0.n.trim();
        kx = var0.o.trim();
        byte var1 = 0;
        if (var0.u != null) {
            if ((var1 = (byte) var0.u.length) > 0) {
                kr = new short[var1];

                for (byte var2 = 0; var2 < var1; ++var2) {
                    kr[var2] = var0.u[var2];
                }
            }
        } else {
            kr = null;
        }

        ky = var0.p;
        kz = var0.e;
        kA = var0.s;
    }

    public static void a(int var0) {
        for (int var1 = 0; var1 < cz.length; ++var1) {
            if (cB[var1] == var0) {
                ko = cz[var1];
                kp = cA[var1];
                kq = cA[var1];
                ks = nU[var1];
                kt = nV[var1];
                ku = nW[var1];
                kv = nX[var1];
                kw = nY[var1];
                kx = nZ[var1];
                byte var2 = 0;
                if (cD[var1] != null) {
                    if ((var2 = (byte) cD[var1].length) > 0) {
                        kr = new short[var2];

                        for (byte var3 = 0; var3 < var2; ++var3) {
                            kr[var3] = cD[var1][var3];
                        }
                    }
                } else {
                    kr = null;
                }

                ky = nT[var1];
                kz = 1;
                kA = ob[var1];
            }
        }

    }

    public static void b(int var0) {
        for (int var1 = 0; var1 < jH.length; ++var1) {
            if (jJ[var1] == var0) {
                ko = jH[var1];
                kp = jI[var1];
                kq = jI[var1];
                ks = qh[var1];
                kt = qi[var1];
                ku = qj[var1];
                kv = qk[var1];
                kw = ql[var1];
                kx = qm[var1];
                byte var2 = 0;
                if (jM[var1] != null) {
                    if ((var2 = (byte) jM[var1].length) > 0) {
                        kr = new short[var2];

                        for (byte var3 = 0; var3 < var2; ++var3) {
                            kr[var3] = jM[var1][var3];
                        }
                    }
                } else {
                    kr = null;
                }

                ky = qg[var1];
                kz = 1;
                kA = qn[var1];
            }
        }

    }

    public static void c(int var0) {
        ko = ct[var0];
        kp = cu[var0];
        kq = cu[var0];
        ks = nJ[var0];
        kt = nK[var0];
        ku = nL[var0];
        kv = nM[var0];
        kw = nN[var0];
        kx = nO[var0];
        byte var1 = 0;
        if (nR[var0] != null) {
            if ((var1 = (byte) nR[var0].length) > 0) {
                kr = new short[var1];

                for (byte var2 = 0; var2 < var1; ++var2) {
                    kr[var2] = nR[var0][var2];
                }
            }
        } else {
            kr = null;
        }

        ky = nP[var0];
        kz = -1;
        kA = nQ[var0];
    }

    public static void d(int var0) {
        ko = dY[var0];
        kp = dZ[var0];
        kq = dZ[var0];
        ks = ed[var0];
        kt = oi[var0];
        ku = ee[var0];
        kv = oj[var0];
        kw = ok[var0];
        kx = ol[var0];
        byte var1 = 0;
        if (om[var0] != null) {
            if ((var1 = (byte) om[var0].length) > 0) {
                kr = new short[var1];

                for (byte var2 = 0; var2 < var1; ++var2) {
                    kr[var2] = om[var0][var2];
                }
            }
        } else {
            kr = null;
        }

        ky = ef[var0];
        kz = -1;
        kA = eh[var0];
    }

    public static void e(int var0) {
        ko = jN[var0];
        kp = jO[var0];
        kq = jO[var0];
        ks = qo[var0];
        kt = qp[var0];
        ku = qq[var0];
        kv = qr[var0];
        kw = qs[var0];
        kx = qt[var0];
        byte var1 = 0;
        if (qx[var0] != null) {
            if ((var1 = (byte) qx[var0].length) > 0) {
                kr = new short[var1];

                for (byte var2 = 0; var2 < var1; ++var2) {
                    kr[var2] = qx[var0][var2];
                }
            }
        } else {
            kr = null;
        }

        ky = qu[var0];
        kz = -1;
        kA = qw[var0];
    }

    public static void au(DataInputStream var0) throws IOException {
        cd var1;
        (var1 = new cd()).a = var0.readShort();
        var1.b = var0.readUTF();
        if (var0.readByte() == 1) {
            var1.c = var0.readInt();
            var1.d = var0.readInt();
            var1.e = var0.readInt();
            var1.f = var0.readInt();
        } else {
            var1.c = GlobalConfig.gameX;
            var1.d = GlobalConfig.gameY;
            var1.e = GlobalConfig.realWidth;
            var1.f = GlobalConfig.realHigh;
        }

        var1.g = var0.readUTF();
        if (var1.g.length() == 0) {
            var1.g = null;
        }

        var1.h = var0.readUTF();
        if (var1.h.length() == 0) {
            var1.h = null;
        }

        boolean var2 = false;
        var1.i = new String[3];
        var1.i[0] = var0.readUTF();
        if (var1.i[0].length() == 0) {
            var1.i[0] = null;
        } else {
            var2 = true;
        }

        var1.i[1] = var0.readUTF();
        if (var1.i[1].length() == 0) {
            var1.i[1] = null;
        } else {
            var2 = true;
        }

        var1.i[2] = var0.readUTF();
        if (var1.i[2].length() == 0) {
            var1.i[2] = null;
        } else {
            var2 = true;
        }

        if (!var2) {
            var1.i = null;
        }

        byte var2_;
        if ((var2_ = var0.readByte()) == 0) {
            var1.j = null;
        } else {
            var1.j = new int[var2_];

            for (int var3 = 0; var3 < var2_; ++var3) {
                var1.j[var3] = var0.readInt();
            }
        }

        if ((var2_ = var0.readByte()) == 0) {
            var1.k = null;
        } else {
            var1.k = new int[var2_];

            for (int var8 = 0; var8 < var2_; ++var8) {
                var1.k[var8] = var0.readInt();
            }
        }

        if ((var2_ = var0.readByte()) == 0) {
            var1.l = null;
        } else {
            var1.l = new int[var2_];

            for (int var9 = 0; var9 < var2_; ++var9) {
                var1.l[var9] = var0.readInt();
            }
        }

        if (Q != null) {
            cd var4;
            (var4 = Q).a = -1;
            var4.m = null;
            var4.i = null;
            var4.j = null;
            var4.k = null;
            var4.l = null;
        }

        Q = var1;
    }

    public static void av(DataInputStream var0) throws IOException {
        ko = var0.readInt();
        kp = var0.readUTF();
        kq = var0.readUTF();
        var0.readShort();
        ky = var0.readShort();
        kz = var0.readByte();
        ks = var0.readUTF();
        ku = var0.readUTF();
        kv = var0.readUTF();
        kw = var0.readUTF();
        kx = var0.readUTF();
        byte var1;
        if ((var1 = var0.readByte()) > 0) {
            kr = new short[var1];

            for (byte var2 = 0; var2 < var1; ++var2) {
                kr[var2] = var0.readShort();
            }
        } else {
            kr = null;
        }

        kA = var0.readUTF();
    }

    public static String a(StringBuffer var0) {
        if (var0 == null) {
            var0 = new StringBuffer();
        } else {
            GlobalConfig.clearStr(var0);
        }

        if (kq != null && kq.trim().length() > 0) {
            var0.append(kq);
            var0.append('\t');
        }

        if (ks != null && ks.trim().length() > 0) {
            var0.append(ks);
            var0.append('\t');
        }

        if (kt != null && kt.trim().length() > 0) {
            var0.append(kt);
            var0.append('\t');
        }

        if (ku != null && ku.trim().length() > 0) {
            var0.append(ku);
            var0.append('\t');
        }

        if (kx != null && kx.trim().length() > 0) {
            var0.append(kx);
            var0.append('\t');
        }

        if (kv != null && kv.trim().length() > 0) {
            var0.append(kv);
            var0.append('\t');
        }

        if (kw != null && kw.trim().length() > 0) {
            var0.append(kw);
            var0.append('\t');
        }

        if (ky > 0) {
            var0.append("要求等级:");
            var0.append(ky);
            var0.append('\t');
        }

        if (kz > 0) {
            var0.append("状态:");
            var0.append(kz == 1 ? "已绑定" : "装备绑定");
            var0.append('\t');
        }

        if (kA != null && !kA.equals("")) {
            var0.append(kA);
        }

        return var0.toString();
    }

    public static void K() {
        kp = null;
        kq = null;
        kr = null;
        ko = 0;
        kr = null;
        ks = null;
        kt = null;
        ku = null;
        kv = null;
        kw = null;
        kx = null;
    }

    public static void aw(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) > 0) {
            kB = new int[var1];
            qM = new String[var1];
            qN = new String[var1];
            qO = new short[var1];
            qP = new short[var1][];
            qQ = new short[var1];
            qR = new short[var1];
            qS = new short[var1];
            qT = new short[var1];
            qU = new short[var1];
            qV = new short[var1];
            qW = new short[var1];
            qX = new short[var1];
            qY = new short[var1];
            qZ = new short[var1];
            ra = new short[var1];
            rb = new short[var1];
            rc = new long[var1];
            re = new String[var1][];
            rf = new short[var1][];
            rg = new short[var1][];
            rd = new String[var1];

            for (short var2 = 0; var2 < var1; ++var2) {
                kB[var2] = var0.readInt();
                qM[var2] = var0.readUTF();
                qN[var2] = var0.readUTF();
                qO[var2] = var0.readShort();
                qW[var2] = var0.readShort();
                qX[var2] = var0.readShort();
                qY[var2] = var0.readShort();
                qQ[var2] = var0.readShort();
                qR[var2] = var0.readShort();
                qS[var2] = var0.readShort();
                qT[var2] = var0.readShort();
                qU[var2] = var0.readShort();
                qV[var2] = var0.readShort();
                qZ[var2] = var0.readShort();
                ra[var2] = var0.readShort();
                rb[var2] = var0.readShort();
                rc[var2] = var0.readLong();
                byte var3;
                if ((var3 = var0.readByte()) > 0) {
                    re[var2] = new String[var3];
                    rf[var2] = new short[var3];
                    rg[var2] = new short[var3];

                    for (byte var4 = 0; var4 < var3; ++var4) {
                        re[var2][var4] = var0.readUTF();
                        rf[var2][var4] = var0.readShort();
                        rg[var2][var4] = var0.readShort();
                    }
                }

                if ((var3 = var0.readByte()) > 0) {
                    qP[var2] = new short[var3];

                    for (byte var10 = 0; var10 < var3; ++var10) {
                        qP[var2][var10] = var0.readShort();
                    }
                }

                rd[var2] = var0.readUTF();
            }

        } else {
            kB = null;
            qO = null;
            qP = null;
            qQ = null;
            qR = null;
            qS = null;
            qT = null;
            qU = null;
            qV = null;
            qW = null;
            qX = null;
            qY = null;
            qZ = null;
            ra = null;
            rb = null;
            rc = null;
            rf = null;
            rg = null;
            if (qM != null) {
                for (short var5 = 0; var5 < qM.length; ++var5) {
                    qM[var5] = null;
                }

                qM = null;
            }

            if (re != null) {
                for (short var6 = 0; var6 < re.length; ++var6) {
                    re[var6] = null;
                }

                re = null;
            }

            if (rd != null) {
                for (short var7 = 0; var7 < rd.length; ++var7) {
                    rd[var7] = null;
                }

                rd = null;
            }

            if (qN != null) {
                for (short var8 = 0; var8 < qN.length; ++var8) {
                    qN[var8] = null;
                }

                qN = null;
            }

        }
    }

    public static void ax(DataInputStream var0) throws IOException {
        kC = var0.readUTF();
    }

    public static void ay(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = (short) var0.readByte()) <= 0) {
            kD = 0;
            if (kE != null) {
                kE = null;
            }

            if (kF != null) {
                kF = null;
            }

        } else {
            kD = var0.readByte();
            kE = new String[var1];
            kF = new String[var1];

            for (short var2 = 0; var2 < var1; ++var2) {
                kE[var2] = var0.readUTF();
                kF[var2] = var0.readUTF();
            }

        }
    }

    public static void az(DataInputStream var0) throws IOException {
        if (P == null) {
            P = new ag_1();
        }

        byte var1 = var0.readByte();
        P.c = new ak[var1];
        Object var2 = null;

        for (int var3 = 0; var3 < var1; ++var3) {
            ak var4 = new ak(var0.readInt(), var0.readUTF(), var0.readUTF(), var0.readUTF(), var0.readUTF(), var0.readUTF());
            P.c[var3] = var4;
        }

    }

    /**
     * 解析活动列表包(8972)：初始化活动容器(ag_1)并填充活动条目数组(be_1[])，存入静态字段 P。
     */
    public static void aA(DataInputStream var0) throws IOException {
        if (P == null) {
            P = new ag_1();
        } else {
            P.b = null;
        }

        byte var1 = var0.readByte();
        P.b = new be_1[var1];

        for (int var2 = 0; var2 < var1; ++var2) {
            P.b[var2] = new be_1();
            P.b[var2].a(var0);
        }

        P.d();
    }

    public static void aB(DataInputStream var0) throws IOException {
        if (O == null) {
            O = new f_1();
        }

        O.d = var0.readInt();
        O.e = var0.readUTF();
        byte var1 = var0.readByte();
        O.f = new bo_1[var1];

        for (int var2 = 0; var2 < var1; ++var2) {
            O.f[var2] = new bo_1();
            O.f[var2].a(var0);
        }

        O.c();
    }

    public static void aC(DataInputStream var0) throws IOException {
        byte var1 = var0.readByte();
        if ((1 & var1 >> 7) == 1) {
            R = var0.readUTF();
        } else {
            R = null;
        }

        if ((1 & var1 >> 6) == 1) {
            S = var0.readUTF();
        } else {
            S = null;
        }

        if ((1 & var1 >> 5) == 1) {
            T = var0.readUTF();
        } else {
            T = null;
        }

        if ((1 & var1 >> 4) == 1) {
            U = var0.readUTF();
        } else {
            U = null;
        }

        if ((1 & var1 >> 3) == 1) {
            V = var0.readUTF();
        } else {
            V = null;
        }
    }

    public static void aD(DataInputStream var0) throws IOException {
        kI = var0.readByte();
        short var1;
        if ((var1 = var0.readShort()) > 0) {
            kH = new String[var1];
            rh = new short[var1];

            for (int var3 = 0; var3 < var1; ++var3) {
                kH[var3] = var0.readUTF();
                rh[var3] = var0.readShort();
            }

        } else {
            if (kH != null) {
                for (int var2 = 0; var2 < kH.length; ++var2) {
                    kH[var2] = null;
                }
            }

            kH = null;
            rh = null;
        }
    }

    public static void L() {
        if (kH != null) {
            for (int var0 = 0; var0 < kH.length; ++var0) {
                kH[var0] = null;
            }

            kH = null;
        }

    }

    public static void aE(DataInputStream var0) throws IOException {
        kI = var0.readByte();
        kN = var0.readShort();
        short var1;
        if ((var1 = var0.readShort()) <= 0) {
            M();
        } else {
            kJ = new int[var1];
            kK = new String[var1];
            kL = new String[var1];
            kM = new String[var1];
            ri = new short[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                kJ[var2] = var0.readInt();
                kK[var2] = var0.readUTF();
                kL[var2] = var0.readUTF();
                kM[var2] = var0.readUTF();
                ri[var2] = var0.readShort();
            }

        }
    }

    public static void M() {
        if (kJ != null) {
            kJ = null;
        }

        if (kK != null) {
            for (int var0 = 0; var0 < kK.length; ++var0) {
                kK[var0] = null;
            }

            kK = null;
        }

        if (kL != null) {
            for (int var1 = 0; var1 < kL.length; ++var1) {
                kL[var1] = null;
            }

            kL = null;
        }

        if (kM != null) {
            for (int var2 = 0; var2 < kM.length; ++var2) {
                kM[var2] = null;
            }

            kM = null;
        }

        if (ri != null) {
            ri = null;
        }

    }

    public static void N() {
        if (bC != null && bC.size() > 0) {
            Object var0 = null;

            for (int var1 = 0; var1 < bC.size(); ++var1) {
                ((bn) bC.elementAt(var1)).v = 0;
            }

            oJ = false;
            oK = -1;
            oL = 0;
        }
    }

    /**
     * 解析服务器配置包(8729)：读取界面颜色板、loading 提示文字、服务器名称、公告 URL 等全局配置。
     */
    public static void parseServerConfig(DataInputStream dis) throws IOException {
        byte colorNum = dis.readByte();
        if (colorNum > 0) {
            LoadingPage.colors = new int[colorNum];
            for (byte i = 0; i < colorNum; ++i) {
                LoadingPage.colors[i] = dis.readInt();
            }
        }

        mallTips = dis.readUTF();
        FightModel.serverFightTextSpeed = dis.readByte();
        //超Q
        dis.readByte();
        MarriageModel.marriageTips = dis.readUTF();
        MarriageModel.divorceTips = dis.readUTF();
        //是否开启"超Q"功能：1=开启，服务器配置包8729下发
        if (dis.readByte() == 1) {
            dis.readUTF();
            dis.readUTF();
            dis.readUTF();
            dis.readUTF();
        }
        //是否开启"魔钻"功能：1=开启，服务器配置包8729下发
        if (dis.readByte() == 1) {
            dis.readUTF();
            dis.readUTF();
            dis.readUTF();
            dis.readUTF();
        }

        FightModel.serverFightTextSpeed_2 = (short) FightModel.serverFightTextSpeed;
        serverConfigSuccess = true;
    }

    public static void aG(DataInputStream var0) throws IOException {
        kO = var0.readInt();
        kQ = var0.readUTF();
        byte var1;
        if ((var1 = var0.readByte()) > 0) {
            kR = new String[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                kR[var2] = var0.readUTF();
            }
        } else {
            if (kR != null) {
                for (int var3 = 0; var3 < kR.length; ++var3) {
                    kR[var3] = null;
                }
            }

            kR = null;
        }

        if ((kP = var0.readByte()) == 0 || kP == 3) {
            kS = var0.readShort();
        }

        kT = true;
    }

    public static void aH(DataInputStream var0) throws IOException {
        rj = new int[9];
        var0.readUTF();
        //超Q
        var0.readByte();
        var0.readShort();
        var0.readUTF();
        //等级
        var0.readByte();

        for (int var1 = 0; var1 < 9; ++var1) {
            rj[var1] = var0.readInt();
        }

        kW = var0.readUTF();
    }

    /**
     * 解析资源包数据包(8245)：读取压缩资源包的索引和数据，gzip 解压后按 key 缓存到 rk 列表，供后续 UI 动态加载。
     */
    public static void parseServerRes(DataInputStream dis) throws IOException {
        short key = dis.readShort();
        short delKey = dis.readShort();
        if (serverZipResList == null) {
            serverZipResList = new Vector();
        }

        if (serverZipResList.isEmpty()) {
            byte[] bytes = new byte[dis.readInt()];
            dis.read(bytes);
            serverZipResList.addElement(new ZipRes(key, bytes));
        } else {
            boolean cached = false;
            for (int i = serverZipResList.size() - 1; i >= 0; --i) {
                ZipRes zipRes = (ZipRes) serverZipResList.elementAt(i);
                if (zipRes != null && zipRes.key == key) {
                    cached = true;
                    break;
                }
            }

            if (!cached) { //缓存
                byte[] bytes = new byte[dis.readInt()];
                dis.read(bytes);
                serverZipResList.addElement(new ZipRes(key, bytes));
            }

            if (delKey >= 0) {
                for (int i = serverZipResList.size() - 1; i >= 0; --i) {
                    ZipRes zipRes = (ZipRes) serverZipResList.elementAt(i);
                    if (zipRes != null && zipRes.key == delKey) {
                        serverZipResList.removeElementAt(i);
                    }
                }
            }
        }
    }

    public static byte[] a(short var0) {
        if (serverZipResList != null && serverZipResList.size() > 0) {
            Object var1 = null;

            for (byte var2 = (byte) (serverZipResList.size() - 1); var2 >= 0; --var2) {
                ZipRes var4;
                if ((var4 = (ZipRes) serverZipResList.elementAt(var2)) != null && var4.key == var0) {
                    try {
                        return GzipUtil.unZip(var4.data);
                    } catch (Exception var3) {

                    }
                }
            }
        }

        return null;
    }

    /**
     * 跳过地图包(8260)附带的额外资源数据：逐条读取但不存储，用于兼容包格式中的冗余段。
     */
    //似乎是无效数据
    public static void skip(DataInputStream dis) throws IOException {
        short var1 = dis.readShort();
        if (var1 > 0) {
            for (short i = 0; i < var1; ++i) {
                int var3 = dis.readInt();
                byte[] var5 = new byte[dis.readInt()];
                dis.read(var5);
//                rl.addElement(new g(var3, var5));
            }
        }

    }

    public static void aK(DataInputStream var0) throws IOException {
        short var1;
        if ((var1 = var0.readShort()) > 0) {
            if (kY == null) {
                kY = new Vector();
            }

            int var2 = 0;
            Object var3 = null;

            for (short var4 = 0; var4 < var1; ++var4) {
                var2 = var0.readInt();

                for (int var5 = kY.size() - 1; var5 >= 0; --var5) {
                    if (((g) kY.elementAt(var5)).a == var2) {
                        kY.removeElementAt(var5);
                        break;
                    }
                }
            }
        }

        if ((var1 = var0.readShort()) > 0) {
            if (kY == null) {
                kY = new Vector();
            }

            Object var10 = null;
            boolean var13 = false;
            Object var15 = null;

            for (short var6 = 0; var6 < var1; ++var6) {
                int var12 = var0.readInt();
                byte[] var11 = new byte[var0.readInt()];
                var0.read(var11);
                var13 = false;

                for (int var7 = 0; var7 < kY.size(); ++var7) {
                    g var16;
                    if ((var16 = (g) kY.elementAt(var7)) != null && var16.a == var12) {
                        var13 = true;
                        break;
                    }
                }

                if (!var13) {
                    kY.addElement(new g(var12, var11));
                }
            }
        }

        if (kY != null) {
            for (int var17 = kY.size() - 1; var17 >= 0; --var17) {
                kY.elementAt(var17);
            }
        }

    }

    public static void clearXXX() {
        if (serverZipResList != null) {
            serverZipResList.removeAllElements();
            serverZipResList = null;
        }

        if (kY != null) {
            kY.removeAllElements();
            kY = null;
        }

//        if (rl != null) {
//            rl.removeAllElements();
//            rl = null;
//        }

    }

    public static void aL(DataInputStream var0) throws IOException {
        if (le > 0) {
            la = new String[le];
            lb = new String[le];
            lc = new String[le];
            ld = new String[le];

            for (int var1 = 0; var1 < le; ++var1) {
                la[var1] = var0.readUTF();
                lb[var1] = var0.readUTF();
                lc[var1] = var0.readUTF();
                ld[var1] = var0.readUTF();
            }
        }

    }

    public static void P() {
        la = null;
        lb = null;
        lc = null;
        ld = null;
        lq = 0;
        lp = 1;
    }

    public static void aM(DataInputStream var0) throws IOException {
        if (ll > 0) {
            rm = new String[ll];
            li = new String[ll];
            rn = new short[ll];
            lk = new String[ll];
            lj = new String[ll];
            ln = new int[ll];

            for (int var1 = 0; var1 < ll; ++var1) {
                rm[var1] = var0.readUTF();
                li[var1] = var0.readUTF();
                rn[var1] = var0.readShort();
                if (1 == rn[var1]) {
                    lj[var1] = "已完成";
                    ln[var1] = LoadingPage.pickColor(lm);
                } else {
                    lj[var1] = "未完成";
                    ln[var1] = LoadingPage.pickColor(11);
                }

                lk[var1] = var0.readUTF();
            }
        }

    }

    public static void Q() {
        rm = null;
        li = null;
        rn = null;
        lk = null;
        lj = null;
        ln = null;
        ls = 0;
        lr = 1;
    }

    public static void aN(DataInputStream var0) throws IOException {
        var0.readUTF();
    }

    public static void aO(DataInputStream var0) throws IOException {
        lt[1] = lu = var0.readShort();
        lv = var0.readInt();
        lw = var0.readUTF();
        lx = var0.readByte() == 1;
        ly = var0.readByte();
        short var1;
        if ((var1 = var0.readShort()) > 0) {
            lz = new String[var1];
            lA = new String[var1];
            lB = new String[var1];
        }

        Object var2 = null;

        for (int var3 = 0; var3 < var1; ++var3) {
            String var4 = var0.readUTF();
            lz[var3] = var4.length() > 0 ? var4 : null;
        }

        for (int var7 = 0; var7 < var1; ++var7) {
            String var5 = var0.readUTF();
            lA[var7] = var5.length() > 0 ? var5 : null;
        }

        for (int var8 = 0; var8 < var1; ++var8) {
            String var6 = var0.readUTF();
            lB[var8] = var6.length() > 0 ? var6 : null;
        }

        if (lv != 2 || (lC = var0.readUTF()).length() == 0) {
            lC = null;
        }

    }

    public static void aP(DataInputStream var0) throws IOException {
        lt[0] = lD = var0.readShort();
        lE = var0.readInt();
        lF = var0.readUTF();
        short var1;
        if ((var1 = var0.readShort()) == 0) {
            lG = null;
        } else {
            lG = new int[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                lG[var2] = var0.readByte();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lH = null;
        } else {
            lH = new int[var1];

            for (int var30 = 0; var30 < var1; ++var30) {
                lH[var30] = var0.readShort();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lJ = null;
        } else {
            lJ = new String[var1];

            for (int var31 = 0; var31 < var1; ++var31) {
                lJ[var31] = var0.readUTF();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lI = null;
        } else {
            lI = new int[var1];

            for (int var32 = 0; var32 < var1; ++var32) {
                lI[var32] = var0.readByte();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lK = null;
        } else {
            lK = new String[var1];

            for (int var33 = 0; var33 < var1; ++var33) {
                lK[var33] = var0.readUTF();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lL = null;
        } else {
            lL = new String[var1];

            for (int var34 = 0; var34 < var1; ++var34) {
                lL[var34] = var0.readUTF();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lM = null;
        } else {
            lM = new String[var1];

            for (int var35 = 0; var35 < var1; ++var35) {
                lM[var35] = var0.readUTF();
            }
        }

        if (lK == null && (lL != null || lM != null)) {
            if (lL != null) {
                lK = new String[lL.length];
            } else {
                lK = new String[lM.length];
            }

            for (int var36 = 0; var36 < lK.length; ++var36) {
                lK[var36] = "";
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lN = null;
        } else {
            lN = new String[var1];

            for (int var37 = 0; var37 < var1; ++var37) {
                lN[var37] = var0.readUTF();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lO = null;
        } else {
            lO = new String[var1];

            for (int var38 = 0; var38 < var1; ++var38) {
                lO[var38] = var0.readUTF();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lR = null;
        } else {
            lR = new int[var1];

            for (int var39 = 0; var39 < var1; ++var39) {
                lR[var39] = LoadingPage.pickColor(var0.readByte());
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lS = null;
        } else {
            lS = new String[var1];

            for (int var40 = 0; var40 < var1; ++var40) {
                lS[var40] = var0.readUTF();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lT = null;
        } else {
            lT = new String[var1];

            for (int var41 = 0; var41 < var1; ++var41) {
                lT[var41] = var0.readUTF();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lU = null;
        } else {
            lU = new String[var1];

            for (int var42 = 0; var42 < var1; ++var42) {
                lU[var42] = var0.readUTF();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lV = null;
        } else {
            lV = new String[var1];

            for (int var43 = 0; var43 < var1; ++var43) {
                lV[var43] = var0.readUTF();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lW = null;
        } else {
            lW = new String[var1];

            for (int var44 = 0; var44 < var1; ++var44) {
                lW[var44] = var0.readUTF();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lZ = null;
        } else {
            lZ = new int[var1];

            for (int var45 = 0; var45 < var1; ++var45) {
                lZ[var45] = LoadingPage.pickColor(var0.readByte());
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            ma = null;
        } else {
            ma = new String[var1];

            for (int var46 = 0; var46 < var1; ++var46) {
                ma[var46] = var0.readUTF();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            mb = null;
        } else {
            mb = new String[var1];

            for (int var47 = 0; var47 < var1; ++var47) {
                mb[var47] = var0.readUTF();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            mc = null;
        } else {
            mc = new String[var1];

            for (int var48 = 0; var48 < var1; ++var48) {
                mc[var48] = var0.readUTF();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            md = null;
        } else {
            md = new String[var1];

            for (int var49 = 0; var49 < var1; ++var49) {
                md[var49] = var0.readUTF();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            me = null;
        } else {
            me = new String[var1];

            for (int var50 = 0; var50 < var1; ++var50) {
                me[var50] = var0.readUTF();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            mh = null;
        } else {
            mh = new int[var1];

            for (int var51 = 0; var51 < var1; ++var51) {
                mh[var51] = LoadingPage.pickColor(var0.readByte());
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lP = null;
        } else {
            lP = new String[var1];

            for (int var52 = 0; var52 < var1; ++var52) {
                lP[var52] = var0.readUTF();
                if (lP[var52].length() == 0) {
                    lP[var52] = null;
                }
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lQ = null;
        } else {
            lQ = new short[var1];

            for (int var53 = 0; var53 < var1; ++var53) {
                lQ[var53] = var0.readShort();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lX = null;
        } else {
            lX = new String[var1];

            for (int var54 = 0; var54 < var1; ++var54) {
                lX[var54] = var0.readUTF();
                if (lX[var54].length() == 0) {
                    lX[var54] = null;
                }
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            lY = null;
        } else {
            lY = new short[var1];

            for (int var55 = 0; var55 < var1; ++var55) {
                lY[var55] = var0.readShort();
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            mf = null;
        } else {
            mf = new String[var1];

            for (int var56 = 0; var56 < var1; ++var56) {
                mf[var56] = var0.readUTF();
                if (mf[var56].length() == 0) {
                    mf[var56] = null;
                }
            }
        }

        if ((var1 = var0.readShort()) == 0) {
            mg = null;
        } else {
            mg = new short[var1];

            for (int var57 = 0; var57 < var1; ++var57) {
                mg[var57] = var0.readShort();
            }
        }

        if (lE != 2 || (mi = var0.readUTF()).length() <= 0) {
            mi = null;
        }

    }

    public static void aQ(DataInputStream var0) throws IOException {
        short var1 = var0.readShort();
        mj = var0.readByte();
        if (var1 <= 0) {
            mk = null;
            ml = null;
            mm = null;
            mn = null;
            mo = null;
            mp = null;
        } else {
            mk = new String[var1];
            ml = new String[var1];
            mm = new int[var1];
            mn = new String[var1];
            mo = new String[var1];
            mp = new int[var1];

            for (int var3 = 0; var3 < var1; ++var3) {
                mk[var3] = var0.readUTF();
                ml[var3] = var0.readUTF();
                mm[var3] = var0.readInt();
                mn[var3] = ro[mm[var3]];
                mo[var3] = var0.readUTF();
                byte var2 = var0.readByte();
                mp[var3] = LoadingPage.pickColor(var2);
            }

        }
    }

    public static void aR(DataInputStream var0) throws IOException {
        mq = var0.readByte();
        mr = var0.readUTF();
        ms = var0.readByte();
        mt = var0.readByte();
        var0.readByte();
        int var1;
        if ((var1 = var0.readInt()) > 0) {
            mu = new String[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                mu[var2] = var0.readUTF();
            }
        } else {
            mu = null;
        }

        int var4;
        if ((var4 = var0.readInt()) <= 0) {
            mv = null;
        } else {
            mv = new String[var4];

            for (int var3 = 0; var3 < var4; ++var3) {
                mv[var3] = var0.readUTF();
            }

        }
    }

    public static void R() {
        mv = null;
    }

    public static void S() {
        mu = null;
    }

    public static void b(DataInputStream var0, byte var1) throws IOException {
        if (var1 == 1) {
            mw = var0.readUTF();
        }

    }

    public static void a(byte var0, DataInputStream var1) throws IOException {
        try {
            switch (var0) {
                case 0:
                    O.e = var1.readUTF();
                    O.j[0] = O.e;
                default:
            }
        } catch (Exception var2) {
        }
    }

    public static void T() {
        mx = -1;
        mD = -1;
        mJ = new int[3];
        mK = new short[3];
        mL = new String[3];

        for (int var0 = 0; var0 < 3; ++var0) {
            mJ[var0] = -1;
            mK[var0] = -1;
            mL[var0] = null;
        }

        mM = null;
        mN = null;
    }

    public static void U() {
        mC = null;
        mI = null;
        mJ = null;
        mK = null;
        if (mL != null) {
            for (int var0 = 0; var0 < mL.length; ++var0) {
                mL[var0] = null;
            }

            mL = null;
        }

        mM = null;
        mN = null;
        N();
    }

    public static void aS(DataInputStream var0) throws IOException {
        if ((rp = var0.readByte()) == 0) {
            T();
            mx = var0.readInt();
            mM = var0.readUTF();
            mN = var0.readUTF();
            V();
            b((byte) 0, mx);
        } else if (rp == 1) {
            mD = var0.readInt();
            mM = var0.readUTF();
            V();
            b((byte) 1, mD);
        } else {
            if (rp == 2) {
                byte var1 = var0.readByte();
                mJ[var1] = var0.readInt();
                mM = var0.readUTF();
                N();

                for (int var4 = 0; var4 < mJ.length; ++var4) {
                    if (mJ[var4] > 0) {
                        f(mJ[var4]);
                    }
                }

                int var5;
                if ((var5 = mJ[var1]) > 0 && var1 >= 0 && var1 <= 2 && bC != null && bC.size() > 0) {
                    bn var2 = null;
                    int var3 = 0;

                    while (true) {
                        if (var3 >= bC.size()) {
                            return;
                        }

                        if ((var2 = (bn) bC.elementAt(var3)) != null && var2.a == var5) {
                            mK[var1] = var2.i;
                            mL[var1] = var2.s;
                            break;
                        }

                        ++var3;
                    }
                }
            } else {
                if (rp == 3) {
                    T();
                    V();
                    return;
                }

                if (rp == 4) {
                    mM = var0.readUTF();
                    mD = -1;
                    mE = -1;
                    mI = null;
                    V();
                    return;
                }

                if (rp == 5) {
                    byte var7 = var0.readByte();
                    mM = var0.readUTF();
                    mJ[var7] = -1;
                    mK[var7] = -1;
                    mL[var7] = null;
                    N();

                    for (int var6 = 0; var6 < mJ.length; ++var6) {
                        if (mJ[var6] > 0) {
                            f(mJ[var6]);
                        }
                    }

                    return;
                }

                if (rp == 6) {
                    T();
                    V();
                    N();
                }
            }

        }
    }

    public static void V() {
        fw = null;
        if (fA != null && fA.length > 0) {
            int var0 = 0;
            if (mx != -1) {
                ++var0;
            }

            if (mD != -1) {
                ++var0;
            }

            fw = new int[fA.length - var0];
            var0 = 0;

            for (int var1 = 0; var1 < fA.length; ++var1) {
                if (fA[var1] != mx && fA[var1] != mD) {
                    fw[var0] = var1;
                    ++var0;
                }
            }

        }
    }

    private static void b(byte var0, int var1) {
        if (var1 > 0) {
            if (fA != null && fA.length > 0) {
                StringBuffer var2 = new StringBuffer();

                for (int var3 = 0; var3 < fA.length; ++var3) {
                    if (fA[var3] == var1) {
                        if (var0 == 0) {
                            my = fE[var3];
                            mz = fF[var3];
                            mA = fG[var3];
                            mB = fH[var3];
                            var2.delete(0, var2.capacity());
                            var2.append("名称:");
                            var2.append(fB[var3]);
                            if (gf[var3] != null && !gf[var3].equals("")) {
                                var2.append("\t");
                                var2.append(gf[var3]);
                            }

                            var2.append("\t");
                            var2.append("等级:").append(fD[var3]);
                            mC = var2.toString();
                            return;
                        }

                        mE = fE[var3];
                        mF = fF[var3];
                        mG = fG[var3];
                        mH = fH[var3];
                        var2.delete(0, var2.capacity());
                        var2.append("名称:");
                        var2.append(fB[var3]);
                        var2.append("\t");
                        var2.append("等级:").append(fD[var3]);
                        mI = var2.toString();
                        return;
                    }
                }

            }
        }
    }

    private static void f(int var0) {
        if (bC != null && bC.size() > 0) {
            bn var1 = null;

            for (int var2 = 0; var2 < bC.size(); ++var2) {
                if ((var1 = (bn) bC.elementAt(var2)) != null && var1.a == var0) {
                    ++var1.v;
                }
            }

        }
    }

    public static void aT(DataInputStream var0) throws IOException {
        int var1 = var0.readInt();
        GlobalConfig.printStr("size=" + var1);
        if (var1 <= 0) {
            mO = null;
            mP = null;
            mQ = null;
            mR = null;
            mS = null;
        } else {
            mO = new String[var1];
            mP = new String[var1];
            mQ = new int[var1];
            mR = new short[var1];
            mS = new String[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                mO[var2] = var0.readUTF();
                mP[var2] = var0.readUTF();
                mQ[var2] = var0.readInt();
                mR[var2] = var0.readShort();
                mS[var2] = var0.readUTF();
                GlobalConfig.printStr("effect ani=" + mR[var2]);
            }

        }
    }

    public static void aU(DataInputStream var0) throws IOException {
        mT = var0.readUTF();
        int var1;
        if ((var1 = var0.readInt()) <= 0) {
            mT = null;
            mU = null;
            mV = null;
            mW = null;
            mX = null;
            mY = null;
        } else {
            mV = new int[var1];
            mW = new String[var1];
            mX = new short[var1];
            mY = new String[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                mV[var2] = var0.readInt();
                mW[var2] = var0.readUTF();
                mX[var2] = var0.readShort();
                mY[var2] = var0.readUTF();
            }

        }
    }

    public static void aV(DataInputStream var0) throws IOException {
        mZ = var0.readUTF();
        na = var0.readUTF();
        int var1;
        if ((var1 = var0.readInt()) <= 0) {
            mZ = null;
            na = null;
            nb = null;
            nc = null;
            nd = null;
        } else {
            nb = new int[var1];
            nc = new String[var1];
            nd = new String[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                nb[var2] = var0.readInt();
                nc[var2] = var0.readUTF();
                nd[var2] = var0.readUTF();
            }

        }
    }

    public static void aW(DataInputStream var0) throws IOException {
        byte var1;
        if ((var1 = var0.readByte()) <= 0) {
            ne = null;
            rq = null;
            nf = null;
            nl = null;
        } else {
            ne = new String[4];
            rq = new int[4];
            nf = new String[4];
            ng = new String[4];

            for (int var2 = 0; var2 < 4; ++var2) {
                ne[var2] = "MONEY";
            }

            for (int var7 = 0; var7 < var1; ++var7) {
                String var8 = var0.readUTF();
                int var3 = var0.readInt();
                if (!var8.equals("MONEY")) {
                    byte var4 = var0.readByte();
                    String var5 = var0.readUTF();
                    String var6 = var0.readUTF();
                    if (var4 - 1 < 4 && var4 - 1 >= 0) {
                        ne[var4 - 1] = var8;
                        rq[var4 - 1] = var3;
                        nf[var4 - 1] = var5;
                        ng[var4 - 1] = var6;
                    }

                    GlobalConfig.printStr("lottery pos is " + var4);
                } else {
                    GlobalConfig.printStr("lottery is money");
                }
            }

            nh = var0.readUTF();
            GlobalConfig.printStr("抽奖需求=" + nh);
        }
    }

    public static void aX(DataInputStream var0) throws IOException {
        ni = var0.readUTF();
        GlobalConfig.printStr("lottery message=" + ni);
        if (var0.readByte() != -1) {
            nj = var0.readUTF();
            nk = var0.readInt();
            if (!nj.equals("MONEY")) {
                nl = var0.readUTF();
            }
        }

    }

    public static void W() {
        ni = null;
        nj = null;
        nl = null;
        nk = 0;
    }

    public static void aY(DataInputStream var0) throws IOException {
        rr = var0.readShort();
        currentCycling = var0.readByte();
        byte var1 = 0;
        if (currentCycling > 0) {
            roleCurrentRideIcon = var0.readUTF();
            System.out.println("rolecurrentrideicon = " + roleCurrentRideIcon);
            var0.readShort();
            rideAttr1 = var0.readShort();
            rideAttr2 = var0.readShort();
            rideAttr3 = var0.readShort();
            var1 = var0.readByte();
            GlobalConfig.printStr("color size=" + var1);
            if (var1 > 0) {
                rs = new short[var1];
                rt = new String[var1];
                ru = new short[var1];
                rv = new short[var1];
                rw = new short[var1];
                rx = new String[var1];
                ry = new int[var1];
                rz = new int[var1];

                for (int var2 = 0; var2 < var1; ++var2) {
                    rs[var2] = var0.readShort();
                    rt[var2] = var0.readUTF();
                    ru[var2] = var0.readShort();
                    rv[var2] = var0.readShort();
                    rw[var2] = var0.readShort();
                    rx[var2] = var0.readUTF();
                    rz[var2] = var0.readInt();
                    ry[var2] = var0.readInt();
                }
            } else {
                rs = null;
                rt = null;
                ru = null;
                rv = null;
                rw = null;
                rx = null;
                ry = null;
            }
        } else {
            roleCurrentRideIcon = "";
        }

        nr = var0.readUTF();
        nt = "当前骑术等级为" + rr + "\t" + var0.readUTF();
        ns = var0.readUTF();
        if ((var1 = var0.readByte()) <= 0) {
            nu = null;
            nv = null;
            rA = null;
            rB = null;
            nw = null;
        } else {
            nu = new byte[var1];
            nv = new String[var1];
            rA = new String[var1];
            rB = new short[var1];
            nw = new byte[var1];

            for (int var5 = 0; var5 < var1; ++var5) {
                nu[var5] = var0.readByte();
                nv[var5] = var0.readUTF();
                rA[var5] = var0.readUTF();
                rB[var5] = var0.readShort();
                nw[var5] = var0.readByte();
            }

        }
    }

    public static void aZ(DataInputStream var0) throws IOException {
        rr = var0.readShort();
        nr = var0.readUTF();
        nt = "当前骑术等级为" + rr + "\t" + var0.readUTF();
        ns = var0.readUTF();
    }

    public static void ba(DataInputStream var0) throws IOException {
        if ((roleCurrentRideIcon = var0.readUTF()).length() > 1) {
            currentCycling = var0.readByte();
            var0.readShort();
            rideAttr1 = var0.readShort();
            rideAttr2 = var0.readShort();
            rideAttr3 = var0.readShort();
            byte var1 = var0.readByte();
            GlobalConfig.printStr("size=" + var1);
            if (var1 <= 0) {
                rs = null;
                rt = null;
                ru = null;
                rv = null;
                rw = null;
                rx = null;
                ry = null;
                rz = null;
                return;
            }

            rs = new short[var1];
            rt = new String[var1];
            ru = new short[var1];
            rv = new short[var1];
            rw = new short[var1];
            rx = new String[var1];
            rz = new int[var1];
            ry = new int[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                rs[var2] = var0.readShort();
                rt[var2] = var0.readUTF();
                ru[var2] = var0.readShort();
                rv[var2] = var0.readShort();
                rw[var2] = var0.readShort();
                rx[var2] = var0.readUTF();
                ry[var2] = var0.readInt();
                rz[var2] = var0.readInt();
            }
        } else {
            roleCurrentRideIcon = "";
            currentCycling = 0;
        }

    }

    public static void bb(DataInputStream var0) throws IOException {
        int var1;
        if ((var1 = var0.readInt()) <= 0) {
            X();
        } else {
            nx = new String[var1];
            ny = new String[var1];
            nz = new String[var1];
            nA = new String[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                nx[var2] = var0.readUTF();
                ny[var2] = var0.readUTF();
                nz[var2] = var0.readUTF();
                nA[var2] = var0.readUTF();
            }

        }
    }

    public static void X() {
        if (nx != null) {
            for (int var0 = 0; var0 < nx.length; ++var0) {
                nx[var0] = null;
            }

            nx = null;
        }

        if (ny != null) {
            for (int var1 = 0; var1 < ny.length; ++var1) {
                ny[var1] = null;
            }

            ny = null;
        }

        if (nz != null) {
            for (int var2 = 0; var2 < nz.length; ++var2) {
                nz[var2] = null;
            }

            nz = null;
        }

        if (nA != null) {
            for (int var3 = 0; var3 < nA.length; ++var3) {
                nA[var3] = null;
            }

            nA = null;
        }

    }

    public static void bc(DataInputStream var0) throws IOException {
        nB = var0.readByte();
        var0.readUTF();
    }

    static {
        npcArrayList = new Vector();
        C = new byte[]{0, 0, 0, 0, 0, 0};
        F = null;
        G = null;
        K = -1;
        L = -1;
        O = f_1.b();
        P = ag_1.b();
        Q = null;
        R = null;
        S = null;
        T = null;
        U = null;
        V = null;
        ar = -1;
        as = -1;
        av = -1;
        nE = -1;
        nF = -1;
        nG = -1;
        nH = -1;
        bu = false;
        bv = 0;
        bx = 0;
        by = "";
        bz = "";
        bC = new Vector();
        bE = false;
        bF = -1;
        bG = -1;
        bW = false;
        bX = -1;
        dJ = true;
        oh = 0;
        ev = false;
        exceptionCode = -1;
        eE = new short[3];
        eM = new short[3];
        oJ = false;
        oK = -1;
        oL = 0;
        pi = false;
        gQ = 1;
        pY = new StringBuffer();
        hG = -1;
        qd = -1;
        iI = new String[GlobalConfig.BaoKuCaoZuo.length];
        iK = new byte[2];
        iL = new byte[2];
        iM = new int[2];
        qe = 0;
        jx = 0;
        jy = 0;
        ke = -1;
        kf = -1;
        kg = -1;
        kh = 100;
        ki = 100;
        kI = 0;
        kP = 0;
        kQ = null;
        kW = "";
        kZ = 0;
        la = null;
        lb = null;
        lc = null;
        ld = null;
        le = 0;
        lg = 1;
        lh = null;
        rm = null;
        li = null;
        rn = null;
        lj = null;
        lk = null;
        ll = 0;
        lm = 0;
        ln = null;
        lo = null;
        lp = 1;
        lr = 1;
        lt = new short[]{-1, -1, -1};
        lu = -1;
        lv = -1;
        lw = null;
        lx = false;
        ly = 0;
        lz = null;
        lA = null;
        lB = null;
        lC = null;
        lD = -1;
        lE = -1;
        lF = null;
        lG = null;
        lH = null;
        lI = null;
        lJ = null;
        lK = null;
        lL = null;
        lM = null;
        lN = null;
        lO = null;
        lP = null;
        lQ = null;
        lR = null;
        lS = null;
        lT = null;
        lU = null;
        lV = null;
        lW = null;
        lX = null;
        lY = null;
        lZ = null;
        ma = null;
        mb = null;
        mc = null;
        md = null;
        me = null;
        mf = null;
        mg = null;
        mh = null;
        mi = null;
        ro = new String[]{"已获得", "激活", "未获得"};
        rideAttr1 = 0;
        rideAttr2 = 0;
        rideAttr3 = 0;
    }
}

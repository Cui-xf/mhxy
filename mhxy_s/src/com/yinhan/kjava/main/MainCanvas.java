package com.yinhan.kjava.main;

import com.cc.BaseUi;
import com.cc.BottomUi;
import com.cc.ChongZhiModel;
import com.cc.FWBRender;
import com.cc.GameSceneController;
import com.cc.GlobalConfig;
import com.cc.GlobalStatus;
import com.cc.GroupModel;
import com.cc.GunDongListUi;
import com.cc.ImageSlice;
import com.cc.InputAction;
import com.cc.LoadingPage;
import com.cc.MarriageModel;
import com.cc.MixedUi;
import com.cc.NetPacket;
import com.cc.NetPacketCode;
import com.cc.NetPayloadBuilder;
import com.cc.NetUtils;
import com.cc.NpcObject;
import com.cc.PageStatus;
import com.cc.PngUtil;
import com.cc.PopUpWindow;
import com.cc.Sprite;
import com.cc.TextPanel;
import com.cc.TopUi;
import com.cc.ag_1;
import com.cc.be_1;
import com.cc.bo_1;
import com.cc.bs;
import com.cc.resource.Animation;
import com.cc.resource.ResourceManager;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;

//public  class a_MainCanvas extends Canvas implements Runnable, CommandListener {
public class MainCanvas extends Canvas implements Runnable, CommandListener {
    public StringBuffer shareSb = new StringBuffer();

    // -------------------------------------------------------------------------
    // 输入状态
    // -------------------------------------------------------------------------
    /**
     * 当前帧的触摸/按键动作编码（由 keyPressed/pointerPressed 等回调写入，主循环消费后清零）
     *
     * @see InputAction
     */
    public int inputAction;
    /**
     * 方向键组合状态（按位标记：UP=1, DOWN=8, LEFT=2, RIGHT=4；多向同时按下时按位或叠加）
     */
    public int keyCombination;
    /**
     * 触摸子状态，用于区分同一页面内的多个交互阶段（0=正常，1=二次确认等）
     */
    public short subInputAction = 0;

    // -------------------------------------------------------------------------
    // 核心引用
    // -------------------------------------------------------------------------
    /**
     * MIDlet 入口对象，用于调用 display/exit 等系统接口
     */
    public MainMidlet mainMidlet;
    /**
     * 游戏主场景控制器（进入游戏后创建，退出时置 null）
     */
    public static GameSceneController gameSceneController;
    /**
     * 精灵帧渲染工具
     */
    public static PngUtil pngUtil;
    /**
     * 主循环运行标志，false 时循环退出，随后停止网络并退出 MIDlet
     */
    private boolean gameRunning = true;
    /**
     * 图像资源是否已加载完成
     */
    public boolean resourceLoaded;
    /**
     * 是否处于聊天界面
     */
    public boolean inChat;
    /**
     * 是否启用触屏控制（true 时初始化 TouchController）
     */
    public boolean touchEnable;
    /**
     * 全局加载遮罩标志，true 时 paint() 直接绘制加载遮罩覆盖所有内容
     */
    public boolean globalLoadingMask;
    /**
     * 网络工具（含 Socket 读线程和发包线程）
     */
    public static NetUtils netUtils;

    // -------------------------------------------------------------------------
    // 页面状态机
    // -------------------------------------------------------------------------
    /**
     * 当前页面状态，驱动 run() 逻辑分发和 paint() 渲染分发。
     * 0=资源加载  1=等待响应  2=错误弹窗  3=登录  4=选服  5=角色列表
     * 6=创建角色  7=游戏主场景  9=Logo动画  14=账号选择  15~17=退出/推广  20=更新提示
     *
     * @see com.cc.PageStatus
     */
    public short pageStatus;
    /**
     * 上一个稳定页面状态（用于错误恢复后回退到正确的页面），
     * 通常与 touchPageCase 保持同步，异常处理时用于区分来源页。
     */
    public short lastPageStatus;

    // -------------------------------------------------------------------------
    // 分辨率 / 视口
    // -------------------------------------------------------------------------
    /**
     * 分辨率档位（宽 < 240 时为 10，宽 >= 240 时为 8，影响字体和布局参数）
     */
    public int fenBianLv;
    /**
     * 触屏控制器（GlobalConfig.o=true 时初始化）
     */
    public TouchController touchController;
    /**
     * MIDlet Display 对象，用于切换当前显示的 Displayable
     */
    public Display display;

    // -------------------------------------------------------------------------
    // 公共 UI 图集帧（从 publicUI 图集加载，全局共享）
    // -------------------------------------------------------------------------
    public static Sprite num;       // 数字帧（金币/数量显示）
    public static Sprite lu;         // 左上角圆角边框
    public static Sprite ld;         // 左下角圆角边框
    public static Sprite rd;         // 右下角圆角边框
    public static Sprite close;         // 关闭按钮图标
    public static Sprite title;         // 标题栏背景
    public static Sprite ru0;         // 右上角圆角边框（带背景）
    public static Sprite rd0;         // 右下角圆角边框（空）
    public static Sprite lu0;         // 左上角圆角边框（空）
    public static Sprite ld0;         // 左下角圆角边框（空）
    public static Animation go_left;         // 向左滚动箭头（动画帧）
    public static Animation go_right;         // 向右滚动箭头（动画帧）
    public static Sprite up;         // 向上箭头
    public static Sprite down;         // 向下箭头
    public static Sprite button1;         // 通用按钮背景
    public static NpcObject F;
    public static Sprite tradetitle;         // 交易面板标题栏
    public static Sprite tradelock01;         // 交易锁定图标01
    public static Sprite tradelock_02;         // 交易锁定图标02
    public static Sprite tradelock_03;         // 交易锁定图标03
    public static Sprite moneybutton;         // 金币按钮
    public static Sprite tradebottom;         // 交易底部栏
    public static Sprite plus;         // 加号按钮
    public static Sprite subtraction;         // 减号按钮
    public static Sprite equip;         // 装备图标
    public static Sprite nextpage;         // 下一页按钮
    public static Sprite backpage;         // 上一页按钮
    public static Sprite[] equipSolt;       // 装备槽图标数组（8个，equip_0~equip_7）
    public static Sprite[] submenu;       // 子菜单图标数组（4个，submenu_0~submenu_3）
    public static Sprite button_ok;         // 确认按钮（button_ok）
    public static Sprite button_back;         // 返回按钮（button_back）
    public static Sprite trigon_u;         // 向上三角箭头
    public static Sprite trigon_d;         // 向下三角箭头
    public static Sprite trigon_l;         // 向左三角箭头
    public static Sprite trigon_r;         // 向右三角箭头
    public static Sprite rim;         // 选中边框（rim）
    /**
     * 充值特效图标数组（chq-1 ~ chq-7，共7张）
     */
    private static Image[] chq = null;
    /**
     * 特殊装饰图片（/images/mz_1.png）
     */
    private static Image moZhuan1 = null;
    /**
     * 聊天气泡背景图片（talk_01）
     */
    public static Image talk_01 = null;

    // -------------------------------------------------------------------------
    // 图集 Page 资源
    // -------------------------------------------------------------------------
    /**
     * 角色图集（/role/role.rpg）
     */
    public static ResourceManager role;
    /**
     * 通用 UI 图集（/ui.rpg）
     */
    public static ResourceManager ui;
    /**
     * 游戏场景存档数据 Page
     */
    public static ResourceManager ad;
    /**
     * UI 系统初始化用 Page
     */
    public static ResourceManager ae;
    /**
     * 图标图集（/icon/icon.rpg）
     */
    public static ResourceManager icon;
    /**
     * 公共 UI 图集（/publicUI.rpg，存放全局共用帧）
     */
    public static ResourceManager publicUI;
    /**
     * 宠物战斗图集（/petfight/petfight.rpg）
     */
    public static ResourceManager petfight;

    // -------------------------------------------------------------------------
    // 控制器 / 辅助工具
    // -------------------------------------------------------------------------
    /**
     * 登录流程控制器
     */
    public static LoginController loginController = null;
    /**
     * 当前帧开始时间戳（毫秒），用于帧率控制和超时判断
     */
    public long frameStartTs;
    /**
     * 通用帧计数器：Logo 动画阶段计数到 520 触发资源加载；其他阶段复用
     */
    public long frameCounter;
    /**
     * 字体资源路径拼接临时 Vector（复用以避免频繁分配）
     */
    private static Vector tempResNameList = new Vector();
    /**
     * 字体资源路径拼接临时 StringBuffer（复用以避免频繁分配）
     */
    private static StringBuffer aO = new StringBuffer();

    // -------------------------------------------------------------------------
    // 等待响应 / 超时
    // -------------------------------------------------------------------------
    /**
     * 最近一次 showDLZ（显示等待转圈）时的时间戳，用于 60 秒响应超时检测
     */
    private long pendingTs;

    // -------------------------------------------------------------------------
    // 错误弹窗
    // -------------------------------------------------------------------------
    /**
     * 最近一次 processException 触发时的时间戳，用于弹窗自动消失（6.6秒）计时
     */
    private long tipsTs;
    /**
     * 是否有待显示的错误弹窗
     */
    private boolean inTips;
    /**
     * 当前错误信息文本（"系统异常"开头时触发强制重启流程）
     */
    private String tipsMsg;
    /**
     * 错误信息的多行文本渲染器
     */
    private FWBRender tipsRender;
    /**
     * 错误弹窗左边距（= (屏幕宽 - 弹窗宽) / 2）
     */
    private int tipsX;
    /**
     * 错误弹窗上边距（= (屏幕高 - 弹窗高) / 2）
     */
    private int tipsY;
    /**
     * 错误弹窗宽度（最小屏幕宽 5/7，最大屏幕宽）
     */
    private int tipsW;
    /**
     * 错误弹窗高度（行数 × 字体高 + 14px 边距）
     */
    private int tispH;

    // -------------------------------------------------------------------------
    // 登录表单
    // -------------------------------------------------------------------------
    /**
     * 是否已准备好提交登录（true 时主循环下一帧发送登录包 5379）
     */
    private boolean aZ;
    /**
     * 登录渠道选择索引（0=官方账号，1=当乐账号）
     */
    private int ba;
    /**
     * 登录渠道选择组件（"官方帐号登录" / "当乐帐号登录"）
     */
    private ChoiceGroup bb;
    /**
     * 登录界面服务器/渠道选择组件
     */
    private ChoiceGroup bc;
    /**
     * "记住密码"复选框
     */
    private ChoiceGroup bd;
    // bN: 账号输入框（最多 20 字符），bO: Token/密码输入框（最多 20 字符，密码模式）
    // 字段声明见下方"聊天/邮件表单"区

    // -------------------------------------------------------------------------
    // Logo / 启动动画
    // -------------------------------------------------------------------------
    /**
     * Logo 图片（/logo.png）
     */
    private Image logo;
    /**
     * 加载进度背景图（/images/loading.png）
     */
    private Image loading;
    /**
     * 菜单背景图
     */
    private Image menuBG;
    /**
     * Logo 标题图片
     */
    private Image logoTitle = null;
    /**
     * 菜单项图片
     */
    private Image menuItem;
    /**
     * 光效图片0
     */
    private Image light_0;
    /**
     * 光效图片1
     */
    private Image light_1;
    /**
     * Logo 动画 Page（包含蝴蝶飞舞帧）
     */
    private static ResourceManager cartoon = null;
    /**
     * 蝴蝶飞舞主动画帧
     */
    private static Animation hudie;
    /**
     * 蝴蝶飞舞备用动画帧（循环播放时交替使用）
     */
    private static Animation hudie_2;
    /**
     * 主菜单页是否已完成初始化
     */
    private static boolean mainPageReady = false;
    /**
     * Logo 淡出透明度（从 515 递减至 0，用于 logo 渐隐效果）
     */
    private int logoAlpha;

    // -------------------------------------------------------------------------
    // 账号选择页（case 14）
    // -------------------------------------------------------------------------
    /**
     * 账号选择页按钮文本数组（"登陆游戏" / "注册游戏" / "修改密码"）
     */
    private String[] mainPageButton;
    /**
     * 账号选择页各按钮的坐标数组
     */
    private int[][] mainPageButtonXY;
    /**
     * 账号选择页各按钮 Y 坐标数组
     */
    private int[] mainPageButton_Y;
    /**
     * 菜单按钮顶部 Y 坐标基准（Logo 标题下方）
     */
    private int mainPageTop_Y;
    /**
     * 当前选中的账号选择页按钮索引
     */
    private int mainPageIndex;
    /**
     * 飘动特效奇偶帧计数器（按帧交替更新特效粒子）
     */
    private int piaoDongTeXiao;

    // -------------------------------------------------------------------------
    // 账号信息
    // -------------------------------------------------------------------------
    /**
     * 当前账号
     */
    public static String zhanghao = null;
    /**
     * 当前密码
     */
    public static String pwd = null;
    /**
     * 登录类型（0=普通，其他值由渠道定义）
     */
    public static byte loginType = 0;
    /**
     * 是否记住密码
     */
    public static boolean rememberPwd = true;

    // -------------------------------------------------------------------------
    // UI 组件
    // -------------------------------------------------------------------------
    /**
     * 混合弹窗 UI（用于创建角色、充值等页面的浮层）
     */
    public MixedUi mixedUi;
    /**
     * 滚动列表 UI（选服、角色列表等页面使用）
     */
    public GunDongListUi gunDongListUi;
    /**
     * 顶部状态栏 UI
     */
    public TopUi topUi;
    /**
     * 文本输入面板
     */
    public TextPanel textPanel;
    /**
     * 底部操作栏 UI
     */
    public BottomUi bottomUi;
    /**
     * 触控区域布局辅助对象
     */
    public PopUpWindow popUpWindow;
    /**
     * 当前已充值档位索引（渠道 1 用于检测充值状态变化，发生变化时刷新页面）
     */
    private int bw = -1;

    // -------------------------------------------------------------------------
    // 角色列表（case 5）
    // -------------------------------------------------------------------------
    /**
     * 当前选中角色的索引（= selectActorRow << 1 + selectActorClo）
     */
    public int aw;
    /**
     * 选中角色的动画帧数组（用于角色预览）
     */
    private Animation[] roleFrame_1;
    /**
     * 未选中角色的静止帧数组
     */
    private Animation[] roleFrame_2;
    /**
     * 选中角色所在列（0 或 1）
     */
    private byte selectActorClo;
    /**
     * 选中角色所在行
     */
    private byte selectActorRow;
    /**
     * 角色框每格高度
     */
    private int subHight;
    /**
     * 角色数据二维数组（服务端返回）
     */
    private int[][] actorList;
    /**
     * 当前操作的角色槽位索引
     */
    public int ax;

    // -------------------------------------------------------------------------
    // 创建角色（case 6）
    // -------------------------------------------------------------------------
    /**
     * 角色昵称输入框的当前内容
     */
    public String ay = "";
    /**
     * 随机名字按钮图片
     */
    private Image logo_btn_random;
    /**
     * 选中的门派索引（0=方寸/2，1=普通门派，循环 0~2）
     */
    private byte bE;
    /**
     * 选中的性别（0=男，1=女）
     */
    private byte bF;
    /**
     * 昵称输入框与随机按钮的子焦点索引（0=输入框，1=随机按钮）
     */
    private int bG;
    /**
     * 创建角色页当前焦点组（0=门派，1=性别，2=昵称）
     */
    private int bH;
    /**
     * UI 场景控制器是否处于活跃状态
     */
    public boolean az;
    /**
     * 临时触摸状态暂存（用于多步操作中间态保存）
     */
    public int tempTouchStatus;

    // -------------------------------------------------------------------------
    // 双击检测
    // -------------------------------------------------------------------------
    /**
     * 上一次动作编码（初值 -1），用于判断是否连续两次相同操作（双击）
     */
    private int shuangJiCheck = -1;
    /**
     * 上一次操作的时间戳，配合 bI 判断 600ms 内的双击
     */
    private long lastClickTs;

    // -------------------------------------------------------------------------
    // 聊天 / 邮件表单
    // -------------------------------------------------------------------------
    /**
     * 聊天输入框
     */
    public TextField liaoTian;
    /**
     * 邮件内容输入框
     */
    private TextField youjian;
    /**
     * 聊天/邮件通用内容输入框
     */
    private TextField bM;
    /**
     * 账号输入框（登录时）/ 邮件发件人输入框（最多 20 字符）
     */
    private TextField bN;
    /**
     * Token/密码输入框（登录时）/ 举报内容输入框（最多 20 字符，密码模式）
     */
    private TextField bO;
    /**
     * 确认命令按钮
     */
    private Command ok;
    /**
     * 返回命令按钮
     */
    private Command back;
    /**
     * 辅助命令按钮
     */
    private Command bR;
    /**
     * 表单容器（用于 LCDUI 表单页面）
     */
    public Form aD;
    /**
     * 邮件头部/提示 StringItem
     */
    private StringItem bS;
    /**
     * 发件人 StringItem
     */
    private StringItem bT;
    /**
     * 邮件标题 StringItem
     */
    private StringItem bU;
    /**
     * 邮件正文 StringItem
     */
    private StringItem bV;
    /**
     * 邮件接收者名称
     */
    private String bW;
    /**
     * 邮件类型或收件人列表选择组件
     */
    private ChoiceGroup bX;
    /**
     * 邮件发送状态（-1=未发送，0=已提交）
     */
    private byte bY = -1;
    /**
     * 服务器/渠道选择列表组件（选服页）
     */
    public ChoiceGroup aE;
    /**
     * 聊天/邮件文本缓存（保存输入框文本，避免重复读取）
     */
    private String bZ;

    // -------------------------------------------------------------------------
    // 触摸坐标 / 场景网格
    // -------------------------------------------------------------------------
    /**
     * 最近一次触摸/点击的屏幕 X 坐标
     */
    public int aF;
    /**
     * 最近一次触摸/点击的屏幕 Y 坐标
     */
    public int aG;
    /**
     * 当前摄像机位置的网格 X 坐标（16px 精度）
     */
    private int ca;
    /**
     * 当前摄像机位置的网格 Y 坐标（16px 精度）
     */
    private int cb;
    /**
     * 玩家操作目标位置的网格 X 坐标
     */
    private int cc;
    /**
     * 玩家操作目标位置的网格 Y 坐标
     */
    private int cd;
    /**
     * NPC 装备等级（从存档读取）
     */
    private short ce;

    // -------------------------------------------------------------------------
    // 全局弹窗 / 跳转链接
    // -------------------------------------------------------------------------
    /**
     * 全局弹窗显示的提示文本（如版本更新说明）
     */
    public static String aH;
    /**
     * 全局弹窗关联的 WebView URL（"更多游戏"等跳转地址）
     */
    public static String aI;


    /**
     * 构造函数：由 MIDlet 启动时调用，完成初始化并启动游戏主线程。
     * <p>
     * 启动流程：
     * 1. GlobalConfig.init()     — 初始化全局配置（字体、渠道等）
     * 2. 计算屏幕分辨率           — 根据屏幕宽度决定游戏视口大小与偏移（宽 < 240 时全屏，否则留边）
     * 3. loading()               — 加载 logo/loading 图片，将 touchPageCase 设为 9（Logo 动画页）
     * 4. new Thread(this).start()— 启动游戏主线程，进入 run() 主循环
     * <p>
     * 启动后的页面状态机流转：
     * 9（Logo 动画）
     * → al 计数到 520 帧后，new b_3() 在后台线程加载游戏资源，同时 touchPageCase 跳 0
     * 0（资源加载进度页）
     * → b_3 加载完成后调用 loginController.init() + c()，touchPageCase 跳 14 或直接登录
     * 14（账号选择页）→ 3（登录）→ 4（选服）→ 5（角色列表）→ 6（创角）→ 7（游戏主场景）
     */
    public MainCanvas(MainMidlet midlet, Display display) {
        // 初始化全局配置（字体、渠道号等）
        GlobalConfig.init(midlet);
        this.setFullScreenMode(true);
        this.display = display;
        this.mainMidlet = midlet;
        loginController = new LoginController(midlet, display);
        // 读取屏幕物理尺寸，作为默认分辨率基准
        GlobalConfig.defaultWidth = (short) this.getWidth();
        GlobalConfig.defaultHigh = (short) this.getHeight();
        GameSceneController.gameViewportWidth = GlobalConfig.realWidth = GlobalConfig.defaultWidth;
        GameSceneController.gameViewportHeight = GlobalConfig.realHigh = GlobalConfig.defaultHigh;
        this.fenBianLv = 10;
        if (GlobalConfig.defaultWidth >= 240) {
            // 宽屏设备：游戏视口缩小留边，居中显示（gameX/gameY 为视口左上角偏移）
            this.fenBianLv = 8;
            GameSceneController.gameViewportWidth = GlobalConfig.realWidth = (short) (GlobalConfig.defaultWidth * 95 / 100);
            GameSceneController.gameViewportHeight = GlobalConfig.realHigh = (short) (GlobalConfig.defaultHigh * (GlobalConfig.defaultHigh > 320 ? 80 : 95) / 100);
            GlobalConfig.gameX = GameSceneController.gameX = (short) ((GlobalConfig.defaultWidth - GameSceneController.gameViewportWidth) / 2);
            GlobalConfig.gameY = GameSceneController.gameY = (short) ((GlobalConfig.defaultHigh - GameSceneController.gameViewportHeight) / 2);
        }

        PopUpWindow.getInst().setBox(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        // 加载 logo/loading 图片，设置 touchPageCase=9 进入 Logo 动画页
        this.startLogo();
        // 启动游戏主线程，进入 run() 主循环
        new Thread(this).start();
    }

    /**
     * 游戏主循环（运行在独立线程，由构造函数 new Thread(this).start() 启动）。
     * <p>
     * 每帧执行顺序：
     * 1. 从网络接收队列消费数据包（processNetPacket），将服务端推送的业务包交给业务处理器
     * 2. 按 touchPageCase（页面状态机）分发当前页面的输入/逻辑处理
     * 3. 调用 uiSceneController.d() 驱动游戏场景逻辑更新
     * 4. repaint() 请求重绘 + serviceRepaints() 等待本帧 paint() 回调完成
     * 5. sleep 补足剩余时间，目标帧间隔 35ms（约 28fps）
     * <p>
     * 循环退出（aJ=false）后：停止网络、释放场景控制器、退出 MIDlet。
     * <p>
     * touchPageCase 页面状态说明：
     * 0  = 启动资源加载页
     * 1  = 等待服务器响应（DLZ 转圈），超时 60s 报错
     * 2  = 错误/异常弹窗页，处理重连/退出逻辑
     * 3  = 登录流程（发送登录包 5379）
     * 4  = 选服页（选择服务器，发包 4196/4098）
     * 5  = 角色列表页
     * 6  = 创建角色页（门派/性别/昵称选择，发包）
     * 7  = 游戏主场景（由 UISceneController 接管逻辑）
     * 9  = Logo 启动动画（al 计数到 520 后跳 case 0）
     * 14 = 账号选择页（登录/注册/改密码）
     * 15~17 = 退出确认/更多游戏页
     * 20 = 版本更新提示页
     */
    public void run() {
        while (this.gameRunning) {
            this.frameStartTs = System.currentTimeMillis();

            try {
                // 消费网络接收队列中的数据包（生产者：SocketReadLooper 线程；消费者：此处主线程）
                if (netUtils != null) {
                    netUtils.processNetPacket();
                }

                if (this.gameRunning) {
                    // 页面状态机：根据当前页面处理触摸输入与业务逻辑
                    switch (this.pageStatus) {
                        case 1: // 等待服务器响应，超时 60 秒则报错
                            ++this.frameCounter;
                            if (this.frameStartTs - this.pendingTs >= 60000L) {
                                this.showTips("响应超时");
                            }
                            break;
                        case 2: {// 错误/异常弹窗页：弹窗超时或用户点击后，根据错误类型决定重连/重登/退出
                            if ((this.frameStartTs - this.tipsTs >= 6600L || this.lastPageStatus == 7 && gameSceneController.overlayDialogController != null && gameSceneController.currentSceneModeId == 25 && this.frameStartTs - this.tipsTs >= 2000L) && this.inTips || this.inputAction == 1073741824 || this.inputAction == 517 || this.inputAction == 536870912 || this.inputAction == 268435456 || u()) {
                                if (this.tipsMsg != null && this.tipsMsg.startsWith("系统异常")) {
                                    this.reStart();
                                    break;
                                }

                                if (GlobalStatus.exceptionMsg.startsWith("异常离线") || GlobalStatus.exceptionCode == 0 || this.lastPageStatus == 9) {
                                    this.G();
                                    break;
                                }

                                if (GlobalStatus.exceptionMsg.startsWith("连接超时") || GlobalStatus.exceptionMsg.startsWith("响应超时")) {
                                    if (netUtils != null) {
                                        netUtils.stop();
                                        netUtils = null;
                                    }

                                    this.startLogo();
                                    break;
                                }

                                if (GlobalStatus.exceptionMsg.equals("您已短信申请开通VIP服务")) {
                                    this.pageStatus = this.lastPageStatus = 7;
                                }

                                if (this.lastPageStatus != 3 && GlobalStatus.exceptionCode != -4) {
                                    if (this.lastPageStatus == 4) {
                                        if (GlobalConfig.channel == 1) {
                                            if (GlobalStatus.hw) {
                                                this.startMainPage();
                                            } else {
                                                this.d();
                                            }
                                        } else {
                                            this.d();
                                        }
                                    } else if (this.lastPageStatus == 5) {
                                        this.startRoleListPage(GlobalStatus.roleJobList.length);
                                    } else if (this.lastPageStatus == 6) {
                                        this.startCreateRolePage();
                                    } else if (this.lastPageStatus == 10) {
                                        this.G();
                                    } else if (this.lastPageStatus == 7) {
                                        if (gameSceneController.currentSceneModeId == 71) {
                                            gameSceneController.e(this.topUi.selectTabIndex);
                                            this.gunDongListUi.a(gameSceneController.aE);
                                        } else if (gameSceneController.currentSceneModeId == 76) {
                                            byte var10 = this.topUi.selectTabIndex;
                                            int var17 = this.gunDongListUi.g();
                                            gameSceneController.d((byte) var10);
                                            int var22 = var10 == 0 ? GlobalStatus.O.f.length : GlobalStatus.P.b.length;
                                            this.gunDongListUi.a(Math.min(var17, var22));
                                        } else if (gameSceneController.currentSceneModeId == 77) {
                                            gameSceneController.u();
                                            this.gunDongListUi.a(GlobalStatus.P.i);
                                        } else {
                                            this.i();
                                        }
                                    } else if (this.lastPageStatus == 9) {
                                        this.G();
                                    } else if (this.lastPageStatus == 14) {
                                        this.startMainPage();
                                    }
                                } else if (GlobalConfig.channel == 1) {
                                    if (ChongZhiModel.g != null) {
                                        this.gameRunning = false;
                                    } else {
                                        this.showLoginPage();
                                    }
                                } else {
                                    this.showLoginPage();
                                }
                            }

                            this.keyCombination = 0;
                            this.inputAction = 0;
                            if (GlobalConfig.supportTouch && this.touchController != null) {
                                this.touchController.c = 0;
                                this.touchController.d = 0;
                            }
                            break;
                        }
                        case 3: {// 登录流程：提交账号/token，发送登录包（协议 5379）
                            if (this.aZ) {
                                this.init();
                                GlobalStatus.zhangHao = this.bN.getString();
                                GlobalStatus.token_1 = this.bO.getString();
                                this.F();
                                byte[] var16;
                                if ((var16 = NetPayloadBuilder.buildLogin((short) 5379, GlobalStatus.zhangHao, GlobalStatus.token_1, GlobalConfig.PopularizeChannel)) != null) {
                                    NetPacket var21;
                                    (var21 = new NetPacket((short) 5379, var16)).firstPacket = true;
                                    netUtils.sendPacket(var21);
                                    this.aZ = false;
                                    this.showPending((String) null);
                                } else {
                                    this.showTips("获取上传指令数据错误!");
                                }
                            }

                            this.inputAction = 0;
                            break;
                        }
                        case 4: {// 选服页：用户选择服务器后，发送连接包（协议 4196/4098）
                            if (this.subInputAction == 0) {
                                if (GlobalConfig.channel == 1 && this.bw != ChongZhiModel.d) {
                                    this.bw = ChongZhiModel.d;
                                    this.d();
                                }

                                if (this.mixedUi != null) {
                                    this.mixedUi.onClick(this.inputAction);
                                }

                                if (this.inputAction != 268435456 && this.inputAction != 1073741824 && this.inputAction != 517) {
                                    if (this.inputAction == 536870912) {
                                        this.startMainPage();
                                    }
                                } else if (GlobalStatus.hA != null || GlobalStatus.hA.length > 0) {
                                    if (GlobalConfig.channel == 0) {
                                        int var13 = this.gunDongListUi.g();
                                        stopNet();
                                        String var20 = null;
                                        if (false) {
                                            if (GlobalStatus.hB[var13].equals("")) {
                                                this.showTips(GlobalStatus.hA[var13] + "繁忙,请选择其他服!");
                                            } else {
                                                var20 = GlobalStatus.hB[var13];
                                                NetPayloadBuilder.channelFlag = GlobalStatus.hE[var13];
                                                this.a(GlobalStatus.hE[var13]);
                                            }
                                        } else if (GlobalStatus.hC[var13].equals("")) {
                                            this.showTips(GlobalStatus.hA[var13] + "繁忙,请选择其他服!");
                                        } else {
                                            this.a(GlobalStatus.hE[var13]);
                                        }

                                        this.init();
                                        NetPayloadBuilder.channelFlag = GlobalStatus.hE[var13];
                                        byte[] var14;
                                        if ((var14 = NetPayloadBuilder.g((short) 4196, GlobalStatus.hy, GlobalStatus.hz)) != null) {
                                            NetPacket var15;
                                            (var15 = new NetPacket((short) 4196, var14)).firstPacket = true;
                                            netUtils.sendPacket(var15);
                                            this.aZ = false;
                                            this.showPending((String) null);
                                        } else {
                                            this.showTips("获取上传指令数据错误!");
                                        }
                                    } else if (GlobalConfig.logined) {
                                        this.a(this.gunDongListUi.g());
                                    } else if (!GlobalStatus.hw) {
                                        this.a(this.gunDongListUi.g());
                                    }
                                }
                            }

                            this.inputAction = 0;
                            break;
                        }
                        case PageStatus.CHARACTER_LIST: {// 角色列表页
                            this.processRoleListPageAction();
                            break;
                        }
                        case 6: { // 创建角色页：处理门派/性别/昵称的上下切换与确认提交
                            if (this.mixedUi != null) {
                                this.mixedUi.onClick(this.inputAction);
                            }

                            if (this.inputAction != 1 && this.inputAction != 514) {
                                if (this.inputAction != 4 && this.inputAction != 520) {
                                    if (this.inputAction != 8 && this.inputAction != 516) {
                                        if (this.inputAction != 2 && this.inputAction != 518) {
                                            if (this.inputAction == 268435456) {
                                                boolean var12 = false;
                                                String var18 = this.ay;
                                                Object var3 = null;
                                                byte[] var8;
                                                if ((var8 = NetPayloadBuilder.a((short) 4099, var18, (byte) this.bF, (byte) this.bE)) != null) {
                                                    netUtils.sendPacket(new NetPacket((short) 4099, var8));
                                                    this.showPending((String) null);
                                                } else {
                                                    this.showTips("获取上传指令数据错误!");
                                                }
                                            } else if (this.inputAction == 536870912) {
                                                if (GlobalStatus.roleIdList != null) {
                                                    this.startRoleListPage(GlobalStatus.roleIdList.length);
                                                    break;
                                                }

                                                byte[] var19;
                                                if ((var19 = NetPayloadBuilder.a((short) 4098, (String) GlobalStatus.token, (String) GlobalStatus.zhangHao)) != null) {
                                                    netUtils.sendPacket(new NetPacket((short) 4098, var19));
                                                    this.showPending((String) null);
                                                } else {
                                                    this.showTips("获取上传指令数据错误!");
                                                }
                                            } else if ((this.inputAction == 1073741824 || this.inputAction == 517) && this.bH == 2) {
                                                if (this.bG == 0) {
                                                    this.b((String) null, (String) null);
                                                } else {
                                                    byte[] var9;
                                                    if ((var9 = NetPayloadBuilder.a((short) 4372, this.bF)) != null) {
                                                        netUtils.sendPacket(new NetPacket((short) 4372, var9));
                                                        this.showPending((String) null);
                                                    } else {
                                                        this.showTips("获取上传指令数据错误!");
                                                    }
                                                }
                                            }
                                        } else if (this.bH == 0) {
                                            this.bE = (byte) (this.bE + 1 > 2 ? 0 : this.bE + 1);
                                            this.textPanel.setText(GlobalConfig.menPaiMiaoShu[this.bE], GlobalConfig.font2, (byte) 1);
                                            this.textPanel.setShuRuMoShi((byte) 1);
                                        } else if (this.bH == 1) {
                                            this.bF = (byte) (this.bF + 1 > 1 ? 0 : 1);
                                        } else {
                                            this.bG = this.bG + 1 > 1 ? 0 : 1;
                                        }
                                    } else if (this.bH == 0) {
                                        this.bE = (byte) (this.bE - 1 < 0 ? 2 : this.bE - 1);
                                        this.textPanel.setText(GlobalConfig.menPaiMiaoShu[this.bE], GlobalConfig.font2, (byte) 1);
                                        this.textPanel.setShuRuMoShi((byte) 1);
                                    } else if (this.bH == 1) {
                                        this.bF = (byte) (this.bF - 1 < 0 ? 1 : 0);
                                    } else {
                                        this.bG = this.bG - 1 < 0 ? 1 : 0;
                                    }
                                } else {
                                    this.bH = this.bH + 1 > 2 ? 0 : this.bH + 1;
                                }
                            } else {
                                this.bH = this.bH - 1 < 0 ? 2 : this.bH - 1;
                            }

                            if (this.roleFrame_1 != null && this.bF * 3 + this.bE < this.roleFrame_1.length) {
                                PngUtil.animate(this.roleFrame_1[this.bF * 3 + this.bE], this.frameStartTs);
                            }

                            this.inputAction = 0;
                            break;
                        }
                        case 7: { // 游戏主场景：逻辑委托给 UISceneController
                            this.processGameSceneAction();
                            break;
                        }
                        case PageStatus.LOGO_LOADING: // Logo 启动动画：al 计数到 520 帧后跳转到资源加载页（case 0）
                            if (this.frameCounter >= 520L) {
                                this.frameCounter = 0L;
                                this.logo = null;
                                LoadingPage.initLoadingPage();
                                this.lastPageStatus = this.pageStatus = PageStatus.RESOURCE_LOADING;
                                new ResourceLoader(this);
                            }
                            break;
                        case PageStatus.MAIN_PAGE: // 账号选择页：登录/注册/改密码按钮处理
                            if (this.inputAction == InputAction.UP || this.inputAction == InputAction.NUM_2 || this.inputAction == InputAction.LEFT || this.inputAction == InputAction.NUM_4) {
                                this.mainPageIndex = this.mainPageIndex > 0 ? --this.mainPageIndex : this.mainPageButton.length - 1;
                            } else if (this.inputAction == InputAction.DOWN || this.inputAction == InputAction.NUM_8 || this.inputAction == InputAction.RIGHT || this.inputAction == InputAction.NUM_6) {
                                this.mainPageIndex = this.mainPageIndex < this.mainPageButton.length - 1 ? ++this.mainPageIndex : 0;
                            } else if (this.inputAction == InputAction.CONFIRM_KEY || this.inputAction == InputAction.CONFIRM || this.inputAction == InputAction.NUM_5) {
                                switch (this.mainPageIndex) {
                                    case 0: //登录
                                        LoginController.showLoginForm();
                                        break;
                                    case 1: //注册
                                        //                                                    LoginController.eeeeeeeeeeeeeee();
                                        break;
                                    case 2: //改密码
                                        LoginController.showChangePwd();
                                }
                            } else {
                                if (this.inputAction == InputAction.QUIT && GlobalConfig.channel == 1) {
                                    LoadingPage.h = 0;
                                    this.lastPageStatus = this.pageStatus = PageStatus.EXIT_CONFIRM;
                                }
                            }
                            this.inputAction = 0;
                            break;
                        case PageStatus.EXIT_CONFIRM: //退出确认
                            if (this.inputAction == InputAction.CONFIRM_KEY) {
                                LoadingPage.h = 0;
                                this.lastPageStatus = this.pageStatus = PageStatus.CHANNEL_PROMO;
                            } else if (this.inputAction == InputAction.QUIT) {
                                this.lastPageStatus = this.pageStatus = PageStatus.MAIN_PAGE;
                            }
                            this.inputAction = 0;
                            break;
                        case PageStatus.CHANNEL_PROMO: //推广
                            if (this.inputAction == InputAction.QUIT || this.inputAction == InputAction.CONFIRM_KEY) {
                                this.exit();
                            }
                            this.inputAction = 0;
                            break;
                        case 20:
                            if (this.inputAction != 8 && this.inputAction != 516) {
                                if (this.inputAction != 2 && this.inputAction != 518) {
                                    if (this.inputAction != 268435456 && this.inputAction != 1073741824) {
                                        if (this.inputAction == 536870912) {
                                            this.startMainPage();
                                            this.mainPageIndex = 0;
                                        }
                                    } else {
                                        this.openWebView(aI);
                                    }
                                } else {
                                    LoadingPage.e = LoadingPage.e + LoadingPage.d < GameSceneController.K.getLines() ? LoadingPage.e + LoadingPage.d : LoadingPage.e;
                                }
                            } else {
                                LoadingPage.e = LoadingPage.e - LoadingPage.d >= 0 ? LoadingPage.e - LoadingPage.d : 0;
                            }

                            this.inputAction = 0;
                    }

                    if (gameSceneController != null) {
                        gameSceneController.d();
                        if (this.pageStatus == 7) {
                            gameSceneController.c();
                        }
                    }
                }
            } catch (Exception var7) {
                this.showException((Exception) var7, (byte) 1);
                ((Throwable) var7).printStackTrace();
            }

            // 请求重绘；serviceRepaints() 会阻塞直到 paint() 回调执行完毕，保证本帧渲染完成后再开始下一帧
            this.repaint();
            this.serviceRepaints();
            // 帧率控制：目标帧间隔 35ms（约 28fps），剩余时间 sleep 补足；帧超时则至少 sleep 1ms 让出 CPU
            long var1 = 35L - (System.currentTimeMillis() - this.frameStartTs);

            try {
                if (var1 > 0L) {
                    Thread.sleep(var1);
                } else {
                    Thread.sleep(1L);
                }
            } catch (Exception var6) {
                ((Throwable) var6).printStackTrace();
            }
        }

        // 主循环退出（aJ=false）：停止网络连接、释放场景控制器、退出 MIDlet
        if (netUtils != null) {
            netUtils.stop();
        }

        gameSceneController = null;
        this.exit();
    }

    /**
     * 渲染回调（由 MIDlet 框架在主线程上调用，由 run() 末尾的 repaint()+serviceRepaints() 触发）。
     * 纯渲染，不修改任何游戏状态。
     * <p>
     * p=true 时直接绘制全局加载遮罩（LoadingPage.b），覆盖所有内容。
     * 否则按 touchPageCase 渲染对应页面：
     * 0  = 资源加载进度页
     * 1  = 等待响应时的背景场景 + DLZ 转圈遮罩
     * 2  = 错误弹窗（系统异常时只显示弹窗，否则背景场景+弹窗叠加）
     * 3  = 账号登录页
     * 4  = 选服页
     * 5  = 角色列表页
     * 6  = 创建角色页（背景 + 混合UI：门派/性别/昵称/角色预览动画）
     * 7  = 游戏主场景（委托给 UISceneController）
     * 9  = Logo 启动动画页
     * 14 = 账号选择页
     * 15 = 更多游戏推广页 + 对话框覆盖层
     * 16 = 退出确认对话框
     * 17 = 更多游戏推广页（渠道 1 专用）
     * 20 = 版本更新提示对话框
     */
    protected void paint(Graphics graphics) {
        try {
            if (this.pageStatus == PageStatus.LOGO_LOADING) {
                graphics.setColor(0);
                graphics.fillRect(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
            }

            graphics.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
            graphics.setFont(GlobalConfig.font2);
            if (this.globalLoadingMask) {
                // p=true：显示全局加载遮罩，覆盖当前所有内容
                LoadingPage.globalLoadingMask(graphics);
            } else {
                if (this.gameRunning) {
                    switch (this.pageStatus) {
                        case PageStatus.RESOURCE_LOADING:  // 资源加载页：绘制加载画面（提示文字 + "正在载入资源..." + 进度条）
                            LoadingPage.drawLoadingPage(graphics, this.loading);
                            return;
                        case 1: // 等待服务器响应：绘制背景场景，再叠加 DLZ 转圈遮罩
                            if (gameSceneController != null) {
                                gameSceneController.a(graphics);
                            } else if (this.lastPageStatus == PageStatus.LOGO_LOADING) {
                                this.renderLogo(graphics);
                            } else if (this.lastPageStatus != 14 && this.lastPageStatus != 3) {
                                if (this.lastPageStatus == 4) {
                                    this.e(graphics);
                                } else if (this.lastPageStatus == 5) {
                                    this.renderRoleListPage(graphics);
                                }
                            } else {
                                this.renderMainPage(graphics);
                            }

                            LoadingPage.globalLoadingMask(graphics);
                            return;
                        case 2: // 错误弹窗：系统异常时只显示弹窗；否则背景场景与弹窗叠加
                            if (this.tipsMsg != null && this.tipsMsg.startsWith("系统异常")) {
                                this.a(graphics);
                            } else {
                                if (gameSceneController != null) {
                                    gameSceneController.a(graphics);
                                }

                                this.a(graphics);
                            }

                            return;
                        case 3: // 账号登录页
                            this.renderMainPage(graphics);
                            return;
                        case 4: // 选服页
                            this.e(graphics);
                            return;
                        case PageStatus.CHARACTER_LIST: // 角色列表页
                            this.renderRoleListPage(graphics);
                            return;
                        case PageStatus.CREATE_CHARACTER: // 创建角色页：背景 + 混合UI（门派/性别/昵称输入 + 角色预览动画）
                            this.renderMainPageBase(graphics);
                            if (this.mixedUi != null) {
                                this.mixedUi.draw(graphics);
                                LoadingPage.fillRect(graphics, this.mixedUi.X + 5, this.mixedUi.Y + 32, this.mixedUi.W - 11, this.mixedUi.setR(GlobalConfig.realHigh <= 240 ? this.subHight * 3 + 6 : 150), 1);
                                LoadingPage.b(graphics, this.mixedUi.X + 80, this.mixedUi.Y + 35, this.mixedUi.X + 80, this.mixedUi.Y + 35 + this.mixedUi.setR(GlobalConfig.realHigh <= 240 ? this.subHight * 3 + 6 : 150) - 5);
                                graphics.setColor(2176196);
                                int var2 = GlobalConfig.font2.stringWidth(GlobalConfig.manPaiName[0]);
                                int var3 = this.mixedUi.Y + 45;
                                int var4 = this.mixedUi.X + 5 + 80 + (this.mixedUi.W - 80 - 13 - var2) / 2;
                                graphics.drawString(GlobalConfig.manPaiName[this.bE], this.bE == 2 ? var4 + GlobalConfig.font2_w / 2 : var4, var3, 20);
                                graphics.drawImage(trigon_l.image, var4 - 20, var3, 20);
                                this.a(0, var4 - 20, var3, trigon_l.w, trigon_l.h);
                                graphics.drawImage(trigon_r.image, var4 + var2 + 15, var3, 20);
                                this.a(1, var4 + var2 + 15, var3, trigon_r.w, trigon_r.h);
                                graphics.drawString(this.bF == 0 ? "男" : "女", this.mixedUi.X + 5 + 80 + (this.mixedUi.W - 80 - 13 - GlobalConfig.font2_w) / 2, var3 + GlobalConfig.font2_h + 10, 20);
                                graphics.drawImage(trigon_l.image, var4 - 20, var3 + GlobalConfig.font2_h + 10, 20);
                                this.a(2, var4 - 20, var3 + GlobalConfig.font2_h + 10, trigon_l.w, trigon_l.h);
                                graphics.drawImage(trigon_r.image, var4 + var2 + 15, var3 + GlobalConfig.font2_h + 10, 20);
                                this.a(3, var4 + var2 + 15, var3 + GlobalConfig.font2_h + 10, trigon_l.w, trigon_l.h);
                                graphics.drawString("昵称：", this.mixedUi.X + 5 + 80 + 5, var3 + (GlobalConfig.font2_h + 10 << 1), 20);
                                LoadingPage.c(graphics, this.mixedUi.X + 5 + 80 + 5, var3 + (GlobalConfig.font2_h + 10) * 3 - 1, this.mixedUi.W - 80 - this.logo_btn_random.getWidth() - 20, GlobalConfig.font2_h, 0);
                                LoadingPage.drawString(graphics, this.ay, this.mixedUi.X + 5 + 80 + 5 + 2, var3 + (GlobalConfig.font2_h + 10) * 3, 20, 16711639);
                                graphics.drawImage(this.logo_btn_random, this.mixedUi.X + this.mixedUi.W - 8, var3 + (GlobalConfig.font2_h + 10) * 3, 24);
                                this.a(4, this.mixedUi.X + 5 + 80 + 5, var3 + (GlobalConfig.font2_h + 10) * 3, this.mixedUi.W - 80 - this.logo_btn_random.getWidth() - 20, GlobalConfig.font2_h);
                                this.a(5, this.mixedUi.X + this.mixedUi.W - 8 - this.logo_btn_random.getWidth(), var3 + (GlobalConfig.font2_h + 10) * 3, this.logo_btn_random.getWidth(), this.logo_btn_random.getHeight());
                                graphics.setColor(16711680);
                                if (this.bH == 0) {
                                    graphics.drawRect(var4, var3, var2, GlobalConfig.font2_h);
                                } else if (this.bH == 1) {
                                    graphics.drawRect(this.mixedUi.X + 5 + 80 + (this.mixedUi.W - 80 - 13 - GlobalConfig.font2_w) / 2, var3 + GlobalConfig.font2_h + 10, GlobalConfig.font2_w, GlobalConfig.font2_h);
                                } else if (this.bG == 0) {
                                    graphics.drawRect(this.mixedUi.X + 5 + 80 + 5, var3 + (GlobalConfig.font2_h + 10) * 3 - 1, this.mixedUi.W - 80 - this.logo_btn_random.getWidth() - 20, GlobalConfig.font2_h);
                                } else {
                                    graphics.drawRect(this.mixedUi.X + this.mixedUi.W - 8 - this.logo_btn_random.getWidth(), var3 + (GlobalConfig.font2_h + 10) * 3, this.logo_btn_random.getWidth(), this.logo_btn_random.getHeight());
                                }

                                if (this.roleFrame_1 != null && this.roleFrame_1[this.bF * 3 + this.bE] != null) {
                                    pngUtil.roleSelectedAnimation(graphics, (Animation) this.roleFrame_1[this.bF * 3 + this.bE], (int[]) null, 0, 0, this.mixedUi.X + 40 + 5, this.mixedUi.Y + 32 + this.roleFrame_1[this.bF * 3 + this.bE].j() + (this.mixedUi.setR(GlobalConfig.realHigh <= 240 ? (this.subHight << 1) + 6 : 120) - this.roleFrame_1[this.bF * 3 + this.bE].j()) / 2, 20, 0);
                                }
                            }
                            return;
                        case 7: // 游戏主场景：委托给 UISceneController 绘制
                            gameSceneController.a(graphics);
                            return;
                        case PageStatus.LOGO_LOADING: // Logo 启动动画页
                            this.renderLogo(graphics);
                            return;
                        case PageStatus.MAIN_PAGE: // 账号选择页（登录/注册/改密码）
                            this.renderMainPage(graphics);
                            return;
                        case PageStatus.EXIT_CONFIRM: // 退出确认对话框：背景账号页 + "确认退出？"弹窗
                            this.renderMainPage(graphics);
                            LoadingPage.drawDialog(graphics, "确认退出？", new String[]{"确认", "返回"});
                            return;
                        case PageStatus.CHANNEL_PROMO:
                            this.renderMainPage(graphics);
                            LoadingPage.drawDialog(graphics, "更多精彩游戏尽在一哥哥网游戏频道\t(3g.01234.com.cn)", new String[]{"更多", "退出"});
                            return;
                        case 20: // 版本更新提示：背景 + 下载/取消对话框
                            this.renderMainPageBase(graphics);
                            LoadingPage.drawDialog(graphics, aH, new String[]{"下载", "取消"});
                    }
                }
            }
        } catch (Exception var5) {
            ((Throwable) var5).printStackTrace();
        }

    }

    protected void keyPressed(int code) {
        int action = InputAction.parseAction(this, code);
        this.inputAction = this.inputAction | action;
        //双击检测
        if (this.shuangJiCheck == this.inputAction && System.currentTimeMillis() - this.lastClickTs <= 600L) {
            if (gameSceneController != null && gameSceneController.currentSceneModeId == 0) {
                if (this.shuangJiCheck == InputAction.UP || this.shuangJiCheck == InputAction.NUM_2) {
                    gameSceneController.shuangjiAction = 1;
                } else if (this.shuangJiCheck == InputAction.LEFT || this.shuangJiCheck == InputAction.NUM_4) {
                    gameSceneController.shuangjiAction = 0;
                } else if (this.shuangJiCheck == InputAction.DOWN || this.shuangJiCheck == InputAction.NUM_8) {
                    gameSceneController.shuangjiAction = 3;
                } else if (this.shuangJiCheck == InputAction.RIGHT || this.shuangJiCheck == InputAction.NUM_6) {
                    gameSceneController.shuangjiAction = 2;
                } else {
                    gameSceneController.shuangjiAction = -1;
                }
            }
        } else {
            if (gameSceneController != null) {
                gameSceneController.shuangjiAction = -1;
            }
            this.shuangJiCheck = this.inputAction;
        }
        this.lastClickTs = System.currentTimeMillis();
        int action2 = InputAction.parseAction(this, ((Canvas) this).getGameAction(code));
        this.keyCombination = this.keyCombination | action2;
        this.tempTouchStatus = 0;
    }

    protected void keyReleased(int code) {
        this.inputAction = 0;
        this.keyCombination = 0;
        this.tempTouchStatus = 0;
    }


    /**
     * 手工梳理后的触屏按下逻辑。
     * 保留原始 pointerPressed 不动，后续如果需要替换，可直接把本方法改名。
     * <p>
     * 已修正的反编译问题：
     * 1. case 5 命中角色格子后，结果不应在循环结束后被默认值覆盖。
     * 2. case 6 最后两个按钮是确认动作，命中后不应再落回左右切换。
     * 3. case 14 实际是遍历主菜单项；未命中时再检查右下角“退出”区域。
     */
    protected void pointerPressed(int x, int y) {
        if (!GlobalConfig.supportTouch || this.touchController == null) {
            return;
        }
        // aj: 触屏输入控制器，负责保存当前触点坐标、拖动状态，并把点击分发到当前画面。
        this.touchController.pointX = x;
        this.touchController.pointY = y;
        // aA: 当前触摸附带的临时状态位，这里按下时先清零。
        this.tempTouchStatus = 0;
        this.touchController.a(this.touchController.pointX, this.touchController.pointY);
        // canvas: 实际处理这次点击的主画布对象，也就是当前 this。
//        MainCanvas canvas = this.touchController.canvas;
        int touchX = this.touchController.pointX;
        int touchY = this.touchController.pointY;
        // j: 当前主画布所处的大界面状态。
        switch (this.pageStatus) {
            case 2:
                // case 2: 游戏主场景，点击地图/场景对象后直接换算成场景命令。
                // a: 当前输入转换出的“命令码”，后续主循环会按这个值执行动作。
                this.inputAction = this.buildTouchAction(touchX, touchY);
                return;
            case 4:
                // case 4: 服务器/分线/登录前选择类界面。
                // c: 当前大界面下的子状态。
                if (this.subInputAction == 0) {
                    if (this.mixedUi != null) {
                        // aq: 通用弹窗/面板命中检测对象，负责把坐标转换成按钮/列表命令。
                        this.inputAction = this.mixedUi.hintCheck(touchX, touchY);
                    }
                    return;
                }
                if (this.subInputAction == 2) {
                    this.inputAction = this.buildTouchAction(touchX, touchY);
                }
                return;
            case PageStatus.CHARACTER_LIST:
                // case 5: 角色列表界面。
                if (this.mixedUi != null) {
                    // 先让通用面板逻辑处理一次，再叠加角色列表自己的格子命中逻辑。
                    this.inputAction = this.mixedUi.hintCheck(touchX, touchY);
                    int action = this.inputAction;
                    if (this.actorList != null) {
                        // bC: 角色列表 6 个格子的点击区域 [x, y, width, height]
                        for (int slotIndex = 0; slotIndex < this.actorList.length; slotIndex++) {
                            int[] rect = this.actorList[slotIndex];
                            if (touchX >= rect[0] && touchX <= rect[0] + rect[2] && touchY >= rect[1] && touchY <= rect[1] + rect[3]) {
                                byte col = (byte) (slotIndex % 2);
                                byte row = (byte) (slotIndex / 2);
                                // bz / bA: 当前角色列表选中的列、行
                                if (col == this.selectActorClo && row == this.selectActorRow) {
                                    // 再次点击当前已选角色，触发确认进入。
                                    action = InputAction.CONFIRM;
                                } else {
                                    // 第一次点击只切换高亮，不直接进入。
                                    this.selectActorClo = col;
                                    this.selectActorRow = (byte) (row == 0 ? 1 : 0);
                                    action = InputAction.DOWN;
                                }
                                break;
                            }
                        }
                    }
                    this.inputAction = action;
                }
                if (this.subInputAction == 1) {
                    this.inputAction = LoadingPage.c(touchX, touchY);
                    return;
                }
                if (this.subInputAction != 2) {
                    return;
                }
                break;
            case 6:
                // case 6: 创建角色界面。
                if (this.mixedUi != null) {
                    // 创建角色界面同样先走通用面板命中，再补自己的热点区域判断。
                    this.inputAction = this.mixedUi.hintCheck(touchX, touchY);
                    int action = this.inputAction;
                    if (this.actorList != null) {
                        // bC: 创建角色界面的 6 个热点区域
                        for (int hotAreaIndex = 0; hotAreaIndex < this.actorList.length; hotAreaIndex++) {
                            int[] rect = this.actorList[hotAreaIndex];
                            if (touchX >= rect[0] && touchX <= rect[0] + rect[2] && touchY >= rect[1] && touchY <= rect[1] + rect[3]) {
                                if (hotAreaIndex < 2) {
                                    // 第一组：头像/形象左右切换。
                                    // bH: 当前创建角色界面的焦点组
                                    this.bH = 0;
                                    action = hotAreaIndex % 2 == 0 ? 8 : 2;
                                } else if (hotAreaIndex < 4) {
                                    // 第二组：性别左右切换。
                                    this.bH = 1;
                                    action = hotAreaIndex % 2 == 0 ? 8 : 2;
                                } else {
                                    // 第三组：名字输入框 / 随机名按钮，点击后是确认选中。
                                    // bG: 第三组中的子选项，0=输入框，1=随机名按钮
                                    this.bH = 2;
                                    this.bG = hotAreaIndex % 2;
                                    action = 1073741824;
                                }
                                break;
                            }
                        }
                    }
                    this.inputAction = action;
                    return;
                }
                return;
            case 10:
                // case 10: 只依赖通用面板命中的功能页。
                if (this.mixedUi != null) {
                    // aq: 这里仅依赖通用面板返回命令，不额外叠加界面专属逻辑。
                    this.inputAction = this.mixedUi.hintCheck(touchX, touchY);
                }
                return;
            case PageStatus.MAIN_PAGE:
                // case 14: 标题/启动主菜单界面。
                if (this.subInputAction != 0) {
                    this.inputAction = LoadingPage.b(touchX, touchY);
                    return;
                }
                int action = 0;
                // bo: 标题界面的主菜单文案数组；bs: 当前命中的菜单项索引
                for (int menuIndex = 0; menuIndex < this.mainPageButton.length; menuIndex++) {
                    int left = (GlobalConfig.defaultWidth - this.menuItem.getWidth()) >> 1;
                    int right = left + this.menuItem.getWidth();
                    int top = (this.mainPageTop_Y << 1) + this.logoTitle.getHeight() + (this.menuItem.getHeight() * menuIndex);
                    int bottom = (this.mainPageTop_Y << 1) + this.logoTitle.getHeight() + (this.menuItem.getHeight() * (menuIndex + 1));
                    if (touchX > left && touchX < right && touchY > top && touchY < bottom) {
                        this.mainPageIndex = menuIndex;
                        // al: 菜单项选中后的计时/节奏控制字段，点中后清零以便立即触发
                        this.frameCounter = 0L;
                        action = InputAction.CONFIRM;
                        break;
                    }
                }
                if (action == 0 && GlobalConfig.channel == 1) {
                    int left = (GlobalConfig.defaultWidth - GlobalConfig.font2.stringWidth("退出")) - 4;
                    int right = GlobalConfig.defaultWidth - 4;
                    int top = (GlobalConfig.defaultHigh - GlobalConfig.font2_h) - 4;
                    int bottom = GlobalConfig.defaultHigh - 4;
                    if (touchX >= left && touchX <= right && touchY >= top && touchY <= bottom) {
                        action = InputAction.QUIT;
                    }
                }
                this.inputAction = action;
                return;
            case 16:
            case 17:
                // case 15/16/17: 使用 ca.b() 的通用确认/取消类界面。
                this.inputAction = LoadingPage.b(touchX, touchY);
                return;
            case 18:
            case 19:
                // case 18/19: 使用 ca.a() 的另一组通用弹框/菜单界面。
                this.inputAction = LoadingPage.a(touchX, touchY);
                return;
            case 20:
                // case 20: 下载/提示类界面，走 switch 末尾的 ca.b() 默认处理。
                break;
            case 3:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            default:
                // 这些状态当前没有额外的 pointerPressed 逻辑，直接返回。
                return;
        }
        this.inputAction = LoadingPage.b(touchX, touchY);
    }

    protected void pointerReleased(int var1, int var2) {
        if (GlobalConfig.supportTouch && this.touchController != null) {
            this.touchController.c = 0;
            this.touchController.d = 0;
            this.keyCombination = 0;
            this.inputAction = 0;
            this.tempTouchStatus = 0;
        }

    }

    protected void pointerDragged(int var1, int var2) {
        if (GlobalConfig.supportTouch && this.touchController != null && gameSceneController != null) {
            if (gameSceneController.currentSceneModeId == 0 && gameSceneController.J != null) {
                return;
            }

            switch (gameSceneController.currentSceneModeId) {
                case 0:
                    this.touchController.d = 1;
                    this.aF = var1;
                    this.aG = var2;
                    return;
                case 39:
                    if (this.touchController.c == 1) {
                        this.touchController.d = 1;
                        this.aF = var1;
                        this.aG = var2;
                    }
            }
        }

    }

    public void a() {
        role.clearAllFrame();
        ae.clearAllFrame();
        icon.clearAllFrame();
        petfight.clearAllFrame();
        this.mixedUi = new MixedUi();
        this.gunDongListUi = new GunDongListUi();
        this.bottomUi = new BottomUi();
        this.topUi = new TopUi();
        this.textPanel = new TextPanel();
    }

    /**
     * 初始化（或重启）网络连接。
     * 首次调用时创建 NetUtils（同时启动 SocketReadLooper 和 SocketWristLooper 两个网络线程）；
     * 后续调用（重连）则复用已有实例并重新 start。
     */
    public void init() {
        if (netUtils == null) {
            netUtils = new NetUtils();
        } else {
            netUtils.start();
        }
        netUtils.setMainCanvas(this);
    }

    private static void stopNet() {
        if (netUtils != null) {
            netUtils.stop();
            netUtils = null;
        }

    }

    public void showException(Exception var1, byte var2) {
        if (gameSceneController != null) {
            gameSceneController.c = false;
            gameSceneController.lastCurrentSceneMode = -1;
            GameSceneController.R();
            if (gameSceneController.overlayDialogController != null) {
                gameSceneController.overlayDialogController.l();
            }

            gameSceneController.lastSceneModeId = gameSceneController.currentSceneModeId = 0;
            this.pageStatus = this.lastPageStatus = 7;
        }

        GlobalStatus.fightData = null;
        GlobalStatus.M = null;
        GlobalStatus.I = null;
        GlobalStatus.N = null;
        GlobalStatus.as = -1;
        this.globalLoadingMask = false;
        if (var2 == 1) {
            this.showTips("系统异常<" + var2 + ">");
        }

    }

    //触发重绘
    public void doRepaint() {
        this.repaint();
        this.serviceRepaints();
    }

    public static void loadRoleRes(byte var0, byte var1, byte var2, byte var3, String var4, short var5, short var6, short var7) {
        tempResNameList.removeAllElements();
        if (var2 == 5) {
            tempResNameList.addElement(a(var0, var1, (byte) 1, var3, false, var4));
            tempResNameList.addElement(a(var0, var1, (byte) 3, var3, false, var4));
            tempResNameList.addElement(a(var0, var1, (byte) 3, var3, true, var4));
            tempResNameList.addElement(a(var0, var1, (byte) 0, var3, false, var4));
            tempResNameList.addElement(a(var0, var1, (byte) 0, var3, true, var4));
            tempResNameList.addElement(a(var0, var1, (byte) 2, var3, false, var4));
            tempResNameList.addElement(a(var0, var1, (byte) 2, var3, true, var4));
        } else {
            tempResNameList.addElement(a(var0, var1, var2, var3, false, var4));
        }

        for (int var8 = 0; var8 < tempResNameList.size(); ++var8) {
            role.loadAnimation((String) tempResNameList.elementAt(var8), var5, var6, var7);
        }

        tempResNameList.removeAllElements();
    }

    public static String a(byte var0, byte var1, byte var2, byte var3, boolean var4) {
        if (GlobalConfig.ziTiMoShi == 2) {
            var3 = 0;
        }

        return "" + GlobalConfig.roleGenderResIds[var0] + GlobalConfig.roleJobResIds[var1] + var3 + GlobalConfig.X[var2] + (var4 ? "4" : "");
    }

    public static String a(byte var0, byte var1, byte var2, byte var3, boolean var4, String var5) {
        if (GlobalConfig.ziTiMoShi == 2) {
            var3 = 0;
        }

        if (GlobalConfig.hasRideRes) {
            aO.delete(0, aO.length());
            aO.append("");
            aO.append(var5);
            aO.append(GlobalConfig.roleGenderResIds[var0]);
            aO.append(GlobalConfig.roleJobResIds[var1]);
            aO.append(var3);
            aO.append(GlobalConfig.X[var2]);
            aO.append(var4 ? "4" : "");
            return aO.toString();
        } else {
            return "" + GlobalConfig.roleGenderResIds[var0] + GlobalConfig.roleJobResIds[var1] + var3 + GlobalConfig.X[var2] + (var4 ? "4" : "");
        }
    }

    public void showPending(String msg) {
        int w = GlobalConfig.defaultWidth * 6 / 11;
        if (w < 110) {
            w = 110;
        } else if (w > 160) {
            w = 160;
        }

        LoadingPage.showDLZ((GlobalConfig.defaultWidth - w) / 2, GlobalConfig.defaultHigh / 2 + 15, w, 20, msg);
        this.pendingTs = this.frameStartTs;
        this.pageStatus = PageStatus.WAITING_RESPONSE;
    }

    /**
     * 显示浮动提示(toast)：若已有"系统异常"提示则触发重启逻辑，否则直接设置 tipsMsg 并刷新显示。
     */
    public void showTips(String msg) {
        if (this.tipsMsg != null && this.tipsMsg.startsWith("系统异常")) {
            this.reStart();
        }

        if (msg != null && msg.startsWith("系统异常")) {
            this.tipsMsg = msg;
        }

        if (GlobalStatus.bs == 1 && GlobalStatus.followStatus == 0 && GlobalStatus.exceptionMsg != null && GlobalStatus.exceptionMsg.startsWith("队伍成员位置信息不一致")) {
            gameSceneController.S();
            GlobalStatus.exceptionMsg = null;
            this.i();
        } else {
            GlobalStatus.exceptionMsg = msg;
            this.tipsRender = new FWBRender(GlobalStatus.exceptionMsg, (short) (GlobalConfig.defaultWidth - 20));
            if (gameSceneController == null || gameSceneController.currentSceneModeId != 25) {
                ((Canvas) this).setFullScreenMode(true);
                this.mainMidlet.display.setCurrent(this);
            }

            this.tipsTs = this.frameStartTs;
            this.inTips = true;
            if (this.tipsRender != null) {
                this.tipsW = 0;
                this.tipsW = this.tipsRender.a;
                this.tipsW = this.tipsW + 20 > GlobalConfig.defaultWidth ? GlobalConfig.defaultWidth : this.tipsW + 20;
                if (this.tipsW < GlobalConfig.defaultWidth * 5 / 7) {
                    this.tipsW = GlobalConfig.defaultWidth * 5 / 7;
                }

                this.tipsX = (GlobalConfig.defaultWidth - this.tipsW) / 2;
                this.tispH = this.tipsRender.getLines() * GlobalConfig.font2_h + 14;
                this.tipsY = (GlobalConfig.defaultHigh - this.tispH) / 2;
            }

            this.pageStatus = 2;
            if (GlobalConfig.supportTouch && this.touchController != null) {
                this.touchController.pointX = -1;
                this.touchController.pointY = -1;
            }

        }
    }

    public void a(boolean var1) {
        this.inTips = false;
    }

    private void reStart() {
        if (gameSceneController == null) {
            this.startLogo();
        } else {
            gameSceneController.sendNet4195((byte) 1);
            this.showPending(null);
        }

        this.tipsMsg = null;
    }

    public int buildTouchAction(int var1, int var2) {
        return var1 >= this.tipsX && var1 <= this.tipsX + this.tipsW && var2 >= this.tipsY && var2 <= this.tipsY + this.tispH ? 0 : 536870912;
    }

    private void a(Graphics var1) {
        if (!u()) {
            LoadingPage.a(var1, this.tipsX, this.tipsY, this.tipsW, this.tispH);
            if (this.tipsRender != null) {
                this.tipsRender.a(var1, GlobalConfig.defaultWidth / 2, this.tipsY + 7);
            }
        }

    }

    private static boolean u() {
        return GlobalStatus.exceptionMsg != null && GlobalStatus.exceptionMsg.equals("数据更新失败:");
    }

    private void showLoginPage() {
        if (GlobalConfig.logined) {
            this.v();
        } else {
            this.aD = new Form("登陆游戏");
            this.ok = new Command("登陆", 4, 1);
            this.back = new Command("返回", 2, 1);
            this.bN = new TextField("帐号:", GlobalStatus.zhangHao, 20, 0);
            this.bO = new TextField("密码:", GlobalStatus.token_1, 20, 65536);
            this.aD.addCommand(this.ok);
            this.aD.addCommand(this.back);
            this.aD.append(this.bN);
            this.aD.append(this.bO);
            this.aD.setCommandListener(this);
            this.display.setCurrent(this.aD);
        }

        this.lastPageStatus = this.pageStatus = 3;
    }

    private void v() {
        GlobalConfig.logined = false;
        if (containStore("dcn_user_info.db")) {
            try {
                RecordStore var2;
                DataInputStream var3;
                if ((var3 = getRecord1(var2 = openRecordStore("dcn_user_info.db", false))) != null) {
                    GlobalConfig.logined = var3.readBoolean();
                    this.ba = var3.readByte();
                    ChongZhiModel.rememberPwd = var3.readBoolean();
                    GlobalStatus.zhangHao = var3.readUTF();
                    GlobalStatus.token_1 = var3.readUTF();
                    var3.close();
                }
                var2.closeRecordStore();
            } catch (RecordStoreException var4) {
                ((Throwable) var4).printStackTrace();
            } catch (Exception var5) {
                ((Throwable) var5).printStackTrace();
            }
        }

        this.aD = new Form(GlobalConfig.logined ? "登录当乐通行证" : "登录一哥哥通行证");
        this.bb = new ChoiceGroup((String) null, 1);
        this.bb.append("官方帐号登录", (Image) null);
        this.bb.append("当乐帐号登录", (Image) null);
        this.bc = e(GlobalConfig.logined ? 1 : 0);
        this.bd = new ChoiceGroup((String) null, 2, new String[]{"记住密码"}, (Image[]) null);
        this.bN = new TextField("帐  号:", (String) null, 16, 0);
        this.bO = new TextField("密  码:", (String) null, 16, 65536);
        if (ChongZhiModel.rememberPwd) {
            this.bb.setSelectedIndex(GlobalConfig.logined ? 1 : 0, true);
            this.bc.setSelectedIndex(this.ba, true);
            this.bd.setSelectedIndex(0, true);
            this.bN.setString(GlobalStatus.zhangHao);
            this.bO.setString(GlobalStatus.token_1);
        }

        this.aD.setItemStateListener(new d_3(this));
        this.aD.append(this.bb);
        this.aD.append(this.bc);
        this.aD.append(this.bN);
        this.aD.append(this.bO);
        this.aD.append(this.bd);
        this.aD.append("温馨提示：如果有当乐帐号的用户可以在帐号选择使用当乐帐号进行登录游戏！");
        this.ok = new Command("登陆", 4, 1);
        this.back = new Command("返回", 2, 1);
        this.aD.addCommand(this.ok);
        this.aD.addCommand(this.back);
        this.aD.setCommandListener(this);
        this.display.setCurrent(this.aD);
    }

    private static ChoiceGroup e(int var0) {
        Object var1 = null;
        String[] var2;
        if (var0 == 1) {
            var2 = new String[]{"乐乐号", "用户名"};
        } else {
            var2 = new String[]{"用户名", "手机号", "ID"};
        }

        return new ChoiceGroup("方式", 4, var2, (Image[]) null);
    }

    //加载游戏主页资源，三个选项
    private void loadingMainPageBase() {
        if (!mainPageReady) {
            this.releaseLogoResource();
            this.light_0 = createImage("/images/light_0.png");
            this.light_1 = createImage("/images/light_1.png");
            int t_w = GlobalConfig.defaultWidth / 9;
            this.mainPageButton_Y = new int[8];

            for (int i = 0; i < this.mainPageButton_Y.length; ++i) {
                this.mainPageButton_Y[i] = t_w * (i + 1);
            }

            this.mainPageButtonXY = new int[8][5];

            for (int i = 0; i < this.mainPageButtonXY.length; ++i) {
                for (int var4 = 0; var4 < this.mainPageButtonXY[i].length; ++var4) {
                    this.mainPageButtonXY[i] = this.z();
                }
            }

            if (cartoon == null) {
                (cartoon = new ResourceManager("/", "cartoon")).loadResource();
                if (cartoon.getFrameSize() != 0) {
                    hudie = cartoon.getAnimationByNameFromCache("hudie");
                    hudie_2 = cartoon.getAnimationByNameFromCache("hudie_2");
                }
            }

            this.logoTitle = createImage("/images/" + (GlobalConfig.defaultHigh <= 220 ? "logoTitle_M.png" : "logoTitle_B.png"));
            this.menuBG = createImage("/images/menuBG.png");
            this.menuItem = createImage("/images/menuItem.png");
            mainPageReady = true;
        }
    }

    private void releaseLogoResource() {
        this.light_0 = null;
        this.light_1 = null;
        hudie = null;
        hudie_2 = null;
        cartoon = null;
        this.logoTitle = null;
        this.menuBG = null;
        this.menuItem = null;
        mainPageReady = false;
    }

    /**
     * 进入 Logo 动画页的准备工作：加载 logo 和 loading 图片，将页面状态设为 9（Logo 动画）。
     * 由构造函数和重连流程调用。
     */
    private void startLogo() {
        this.logo = createImage("/logo.png");
        this.loading = createImage("/images/loading.png");
        this.frameCounter = 0L;
        this.lastPageStatus = this.pageStatus = PageStatus.LOGO_LOADING;
        this.doRepaint();
    }

    private void renderLogo(Graphics graphics) {
        if (this.frameCounter < 260L) {
            this.frameCounter = 260L;
        }
        graphics.setColor(0);
        graphics.fillRect(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
        graphics.drawImage(this.logo, GlobalConfig.defaultWidth - this.logo.getWidth() >> 1, GlobalConfig.defaultHigh - this.logo.getHeight() >> 1, 20);
        this.logoAlpha = (int) (Math.max(515L - this.frameCounter, 0L));
        LoadingPage.fillRect(graphics, 0, this.logoAlpha, GlobalConfig.defaultWidth - this.logo.getWidth() >> 1, GlobalConfig.defaultHigh - this.logo.getHeight() >> 1, this.logo.getWidth(), this.logo.getHeight());
        this.frameCounter += 5L;
    }

    //启动游戏主面
    public void startMainPage() {
//        NetPayloadBuilder.hands1 = 90;
        this.loadingMainPageBase();
        this.mainPageButton = new String[]{"登陆游戏", "注册游戏", "修改密码"};

        this.subInputAction = 0;
        this.logoAlpha = 0;
        LoadingPage.l = 0;
        LoadingPage.h = 0;
        if (zhanghao == null && ChongZhiModel.zhanghao != null) {
            zhanghao = ChongZhiModel.zhanghao;
            pwd = ChongZhiModel.pwd;
            loginType = ChongZhiModel.loginType;
            rememberPwd = ChongZhiModel.rememberPwd;
        }

        if (zhanghao == null) {
            zhanghao = "";
        }

        if (pwd == null) {
            pwd = "";
        }

        if (NetPayloadBuilder.hands2 != 72) {
            stopNet();
            netUtils = null;
        }

        GlobalStatus.clearXXX();
        this.clearUIController();
        this.frameCounter = 8L;
        this.mainPageIndex = 0;
        this.lastPageStatus = this.pageStatus = PageStatus.MAIN_PAGE;
    }

    //渲染主页面基础元素
    private void renderMainPageBase(Graphics graphics) {
        this.mainPageTop_Y = GlobalConfig.defaultHigh <= 240 ? 2 : (GlobalConfig.defaultHigh - this.logoTitle.getHeight() - this.menuItem.getHeight() * 7) / 3;
        if (this.menuBG != null) {
            graphics.drawImage(this.menuBG, GlobalConfig.defaultWidth - this.menuBG.getWidth() >> 1, GlobalConfig.defaultHigh - this.menuBG.getHeight() >> 1, 20);
        }

        if (this.logoTitle != null) {
            graphics.drawImage(this.logoTitle, GlobalConfig.defaultWidth - this.logoTitle.getWidth() >> 1, this.mainPageTop_Y, 20);
        }

        if (hudie != null) {
            PngUtil.animate(hudie, this.frameStartTs);
            pngUtil.roleSelectedAnimation(graphics, (Animation) hudie, (int[]) null, 0, 0, GlobalConfig.defaultWidth - 100, GlobalConfig.defaultHigh - 100, 0, 0);
        }

        if (hudie_2 != null) {
            PngUtil.animate(hudie_2, this.frameStartTs);
            pngUtil.roleSelectedAnimation(graphics, (Animation) hudie_2, (int[]) null, 0, 0, GlobalConfig.defaultWidth - 100, GlobalConfig.defaultHigh - 100, 0, 0);
        }

        if (this.light_0 != null && this.light_1 != null && this.mainPageButtonXY != null) {
            for (int i = 0; i < this.mainPageButtonXY.length; ++i) {
                for (int j = 0; j < this.mainPageButtonXY[i].length; ++j) {
                    if (this.mainPageButtonXY[i][0] >= 0 && this.mainPageButtonXY[i][0] <= GlobalConfig.defaultWidth && this.mainPageButtonXY[i][1] >= 0) {
                        if ((this.piaoDongTeXiao & 1) == 0) {
                            this.mainPageButtonXY[i][0] += LoadingPage.randomInt(10, 40) % 2 == 0 ? -this.mainPageButtonXY[i][2] : this.mainPageButtonXY[i][2];
                            this.mainPageButtonXY[i][1] -= this.mainPageButtonXY[i][3];
                        }
                    } else {
                        this.mainPageButtonXY[i] = this.z();
                    }

                    graphics.drawImage(this.mainPageButtonXY[i][4] == 0 ? this.light_0 : this.light_1, this.mainPageButtonXY[i][0], this.mainPageButtonXY[i][1], 20);
                }
            }

            ++this.piaoDongTeXiao;
        }
    }

    private int[] z() {
        int[] var1 = new int[5];
        var1[0] = this.mainPageButton_Y[LoadingPage.randomInt(1, 100) % 8];
        var1[1] = GlobalConfig.defaultHigh + LoadingPage.randomInt(1, 200);
        var1[2] = 1;
        var1[3] = 1;
        var1[4] = LoadingPage.randomInt(1, 100) % 2;
        return var1;
    }

    private void renderMainPage(Graphics graphics) {
        this.renderMainPageBase(graphics);
        LoadingPage.drawString(graphics, GlobalConfig.appVersion, (int) 5, GlobalConfig.defaultHigh - 3, 36, 6160358, 335925);
        LoadingPage.drawString(graphics, "退出", (int) (GlobalConfig.defaultWidth - 5), GlobalConfig.defaultHigh - 3, 40, 16777215, 335925);

        for (int i = 0; i < this.mainPageButton.length; ++i) {
            if (i == this.mainPageIndex) {
                graphics.drawImage(this.menuItem, GlobalConfig.defaultWidth - this.menuItem.getWidth() >> 1, (this.mainPageTop_Y << 1) + this.logoTitle.getHeight() + i * this.menuItem.getHeight(), 20);
            }

            LoadingPage.drawString(graphics, this.mainPageButton[i], (GlobalConfig.defaultWidth >> 1), (this.mainPageTop_Y << 1) + this.logoTitle.getHeight() + i * this.menuItem.getHeight() + (this.menuItem.getHeight() - GlobalConfig.font2_h) / 2, 17, 16777215, 335925);
        }

        if (this.subInputAction == 1) {
            LoadingPage.drawDialog(graphics, "当前没有账号信息，是否自动注册？", new String[]{"确定", "返回"});
        }
    }

    public void openWebView(String var1) {
//            this.mainMidlet.platformRequest(var1);
        this.G();
    }

    public void d() {
        if (this.aD != null) {
            this.aD.removeCommand(this.ok);
            this.aD.removeCommand(this.back);
            this.aD.deleteAll();
        }

        this.ok = null;
        this.back = null;
        this.bN = null;
        this.bO = null;
        this.aD = null;
        this.mainMidlet.start();
        MainCanvas var1 = this;
        if (GlobalStatus.hE != null) {
            this.K();

            for (int var2 = 0; var2 < GlobalStatus.hE.length; ++var2) {
                if (GlobalStatus.hE[var2] == var1.ce && var2 != 0) {
                    String var3 = GlobalStatus.hA[var2];
                    String var4 = GlobalStatus.hB[var2];
                    String var5 = GlobalStatus.hC[var2];
                    short var6 = GlobalStatus.hE[var2];
                    String var7 = GlobalStatus.hF[var2];

                    for (int var8 = var2; var8 > 0; --var8) {
                        GlobalStatus.hA[var8] = GlobalStatus.hA[var8 - 1];
                        GlobalStatus.hB[var8] = GlobalStatus.hB[var8 - 1];
                        GlobalStatus.hC[var8] = GlobalStatus.hC[var8 - 1];
                        GlobalStatus.hE[var8] = GlobalStatus.hE[var8 - 1];
                        GlobalStatus.hF[var8] = GlobalStatus.hF[var8 - 1];
                    }

                    GlobalStatus.hA[0] = var3;
                    GlobalStatus.hB[0] = var4;
                    GlobalStatus.hC[0] = var5;
                    GlobalStatus.hE[0] = var6;
                    GlobalStatus.hF[0] = var7;
                }
            }
        }

        this.mixedUi.clean();
        this.mixedUi.setTitle("服务器列表");
        int[] var9 = null;
        if (GlobalConfig.channel == 1 && GlobalStatus.hx >= 0 && GlobalStatus.hx < GlobalStatus.hA.length) {
            var9 = new int[GlobalStatus.hA.length];

            for (int var10 = 0; var10 < var9.length; ++var10) {
                if (var10 == GlobalStatus.hx) {
                    var9[var10] = LoadingPage.pickColor(0);
                } else {
                    var9[var10] = LoadingPage.pickColor(6);
                }
            }
        }

        this.gunDongListUi.setValue((Image[]) null, GlobalStatus.hA, (String[]) null, GlobalStatus.hF);
        this.gunDongListUi.a(var9);
        this.mixedUi.addChild((BaseUi) this.gunDongListUi);
        this.bottomUi.setButtonText(new String[]{"进入选区", ""});
        this.mixedUi.addChild((BaseUi) this.bottomUi);
        this.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.lastPageStatus = this.pageStatus = 4;
        this.subInputAction = 0;
        this.inputAction = 0;
        this.keyCombination = 0;
    }

    public void a(int var1) {
        stopNet();
        if (GlobalStatus.hC[var1].equals("")) {
            this.showTips(GlobalStatus.hA[var1] + "繁忙,请选择其他服!");
        } else {
            NetPayloadBuilder.hands1 = (byte) GlobalStatus.hD[var1];
            NetPayloadBuilder.hands2 = (byte) GlobalStatus.hE[var1];
            this.a(GlobalStatus.hE[var1]);
        }

        this.init();
        byte[] a = NetPayloadBuilder.a((short) 4096, GlobalStatus.hy, GlobalStatus.hz, GlobalConfig.PopularizeChannel, GlobalStatus.hw);
        if (a != null) {
            NetPacket var4 = new NetPacket((short) 4096, a);
            var4.firstPacket = true;
            netUtils.sendPacket(var4);
            this.aZ = false;
            this.showPending((String) null);
        } else {
            this.showTips("获取上传指令数据错误!");
        }
    }

    private void e(Graphics var1) {
        if (GlobalConfig.channel != 1 || GlobalConfig.logined || !GlobalStatus.hw) {
            this.renderMainPageBase(var1);
            if (this.mixedUi != null) {
                this.mixedUi.draw(var1);
            }

            if (this.subInputAction == 2) {
                this.a(var1);
            }

        }
    }

    /**
     * 触发角色选择/切换：若 GlobalStatus.m 有值则按指定名称切换角色，否则按 roleIdList 发送角色选择请求；由资源包(8245)加载完成后调用。
     */
    public void reportRoleSelect() {
        if (GlobalStatus.roleId != null && GlobalStatus.roleId.length() > 0) {
            this.sendSelectRolePacket_2(GlobalStatus.roleId);
        } else {
            if (GlobalStatus.roleIdList != null) {
                this.sendSelectRolePacket_2(GlobalStatus.roleIdList[(this.selectActorRow << 1) + this.selectActorClo]);
            }
        }
    }

    public void f() {
        if (GlobalStatus.roleId != null && GlobalStatus.roleId.length() > 0) {
            this.i(GlobalStatus.roleId);
        } else {
            if (gameSceneController == null && GlobalStatus.roleIdList != null) {
                this.i(GlobalStatus.roleIdList[(this.selectActorRow << 1) + this.selectActorClo]);
            }

        }
    }

    private void clearUIController() {
        if (gameSceneController != null) {
            gameSceneController.clear();
            gameSceneController = null;
            if (GlobalConfig.supportTouch && this.touchController != null) {
                this.touchController.gameSceneController = null;
            }
        }
    }

    public Animation loadRoleFrame(Animation var1, byte roleGender, byte roleJob, byte var4, byte var5, boolean var6) {
        String resId = "f" + GlobalConfig.roleGenderResIds[roleGender] + GlobalConfig.roleJobResIds[roleJob] + var5 + GlobalConfig.X[3] + (var6 ? 1 : 2);
        role.loadResource(resId);
        Animation frame = role.getAnimationByNameFromCache(resId);
        if (frame != null) {
            frame = frame.copy();
        }
        return frame;
    }

    /**
     * 初始化并显示角色选择页：重置加载基础状态，按 roleNum 数量构建角色列表 UI；由 RoleList 包(8195)处理后调用。
     */
    public void startRoleListPage(int roleNum) {
        this.loadingMainPageBase();
        this.actorList = new int[6][4];
        LoadingPage.l = 0;
        LoadingPage.h = 0;
        LoadingPage.o = 0;
        this.subInputAction = 0;
        this.inputAction = 0;
        this.keyCombination = 0;
        GlobalStatus.clearXXX();
        this.clearUIController();
        if (roleNum <= 0 && this.lastPageStatus != PageStatus.CREATE_CHARACTER) {
            this.roleFrame_1 = null;
            this.roleFrame_2 = null;
            this.subHight = 45;
            this.startCreateRolePage();
        } else {
            this.roleFrame_1 = new Animation[roleNum];
            this.roleFrame_2 = new Animation[roleNum];

            for (int i = 0; i < roleNum; ++i) {
                this.roleFrame_1[i] = this.loadRoleFrame(this.roleFrame_1[i], GlobalStatus.roleGenderList[i], GlobalStatus.roleJobList[i], (byte) 3, (byte) 1, false);
                this.roleFrame_2[i] = this.loadRoleFrame(this.roleFrame_2[i], GlobalStatus.roleGenderList[i], GlobalStatus.roleJobList[i], (byte) 3, (byte) 1, true);
            }

            this.subHight = 55;
            this.selectActorClo = 0;
            this.selectActorRow = 0;
            this.mixedUi.clean();
            this.mixedUi.setTitle("角色列表");
            this.mixedUi.setR((this.subHight << 1) + 6);
            this.textPanel.setText(this.showRoleInfo(0), GlobalConfig.font2, (byte) 1);
            this.textPanel.setShuRuMoShi((byte) 1);
            this.mixedUi.addChild(this.textPanel);
            if (GlobalConfig.defaultHigh > 220) {
                this.bottomUi.setButtonText(new String[]{"进入游戏", ""});
                this.mixedUi.addChild((BaseUi) this.bottomUi);
            }

            this.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
            this.loadingMainPageBase();
            this.lastPageStatus = this.pageStatus = PageStatus.CHARACTER_LIST;
        }
    }

    //角色列表页 展示角色信息
    private String showRoleInfo(int selectRole) {
        if (GlobalStatus.roleNicknameList != null && selectRole < GlobalStatus.roleNicknameList.length) {
            StringBuffer sb = new StringBuffer();
            sb.append("昵称：" + GlobalStatus.roleNicknameList[selectRole] + '\t');
            sb.append("等级：" + GlobalStatus.roleLevelList[selectRole] + '\t');
            this.bottomUi.setButtonText(new String[]{"进入游戏", ""});
            return sb.toString();
        } else {
            this.bottomUi.setButtonText(new String[]{"创 建", ""});
            return "创建角色";
        }
    }

    private void processRoleListPageAction() {
        if (this.subInputAction == 0) {
            if (this.mixedUi != null) {
                this.mixedUi.onClick(this.inputAction);
            }

            if (this.inputAction == InputAction.UP || this.inputAction == InputAction.NUM_2) {
                this.selectActorRow = (byte) (this.selectActorRow <= 0 ? 1 : this.selectActorRow - 1);
                this.textPanel.setText(this.showRoleInfo((this.selectActorRow << 1) + this.selectActorClo), GlobalConfig.font2, (byte) 1);
            } else if (this.inputAction == InputAction.DOWN || this.inputAction == InputAction.NUM_8) {
                this.selectActorRow = (byte) (this.selectActorRow >= 1 ? 0 : this.selectActorRow + 1);
                this.textPanel.setText(this.showRoleInfo((this.selectActorRow << 1) + this.selectActorClo), GlobalConfig.font2, (byte) 1);
            } else if (this.inputAction == InputAction.LEFT || this.inputAction == InputAction.NUM_4) {
                this.selectActorClo = (byte) (this.selectActorClo <= 0 ? 1 : this.selectActorClo - 1);
                this.textPanel.setText(this.showRoleInfo((this.selectActorRow << 1) + this.selectActorClo), GlobalConfig.font2, (byte) 1);
            } else if (this.inputAction == InputAction.RIGHT || this.inputAction == InputAction.NUM_6) {
                this.selectActorClo = (byte) (this.selectActorClo >= 1 ? 0 : this.selectActorClo + 1);
                this.textPanel.setText(this.showRoleInfo((this.selectActorRow << 1) + this.selectActorClo), GlobalConfig.font2, (byte) 1);
            } else if (this.inputAction == InputAction.CONFIRM_KEY) { //确认
                if (GlobalStatus.roleIdList != null && (this.selectActorRow << 1) + this.selectActorClo < GlobalStatus.roleIdList.length) {
                    this.sendSelectRolePacket(GlobalStatus.roleIdList[(this.selectActorRow << 1) + this.selectActorClo]);
                } else {
                    this.startCreateRolePage();
                }
            } else if (this.inputAction == InputAction.CONFIRM || this.inputAction == InputAction.NUM_5) {
                if (GlobalStatus.roleIdList != null && (this.selectActorRow << 1) + this.selectActorClo < GlobalStatus.roleIdList.length) {
                    if (GlobalStatus.roleIdList.length >= 4) {
                        String[] var1 = new String[]{"进入", "删除"};
                        LoadingPage.a(this.actorList[(this.selectActorRow << 1) + this.selectActorClo][0] + this.subHight / 2, this.actorList[(this.selectActorRow << 1) + this.selectActorClo][1] + this.subHight / 2, var1, false);
                        this.subInputAction = 1;
                    } else {
                        this.sendSelectRolePacket(GlobalStatus.roleIdList[(this.selectActorRow << 1) + this.selectActorClo]);
                    }
                } else {
                    this.startCreateRolePage();
                }
            } else if (this.inputAction == InputAction.QUIT) {
                this.startMainPage();
            }

            if (this.roleFrame_1 != null) {
                for (int i = 0; i < this.roleFrame_1.length; ++i) {
                    PngUtil.animate(this.roleFrame_1[i], this.frameStartTs);
                }
            }

            if (this.roleFrame_2 != null) {
                for (int i = 0; i < this.roleFrame_2.length; ++i) {
                    PngUtil.animate(this.roleFrame_2[i], this.frameStartTs);
                }
            }
            this.inputAction = 0;
        } else if (this.subInputAction != 1) {
            if (this.subInputAction == 2) {
                if (this.inputAction == 268435456) {
                    this.a((String) "输入“OK” 删除角色", (int) 0);
                    this.subInputAction = 0;
                } else if (this.inputAction == 536870912) {
                    this.subInputAction = 1;
                }

                this.inputAction = 0;
            }

        } else {
            LoadingPage.b(this.inputAction);
            if (this.inputAction != 268435456 && this.inputAction != 1073741824 && this.inputAction != 517) {
                if (this.inputAction == 536870912) {
                    this.startRoleListPage(GlobalStatus.roleIdList.length);
                    this.subInputAction = 0;
                }
            } else if (LoadingPage.o == 0) {
                this.sendSelectRolePacket(GlobalStatus.roleIdList[(this.selectActorRow << 1) + this.selectActorClo]);
            } else if (LoadingPage.o == 1) {
                this.aw = (this.selectActorRow << 1) + this.selectActorClo;
                this.subInputAction = 2;
            }

            this.inputAction = 0;
        }
    }

    private void a(int var1, int var2, int var3, int var4, int var5) {
        if (this.actorList != null && this.actorList.length > var1) {
            this.actorList[var1][0] = var2;
            this.actorList[var1][1] = var3;
            this.actorList[var1][2] = var4;
            this.actorList[var1][3] = var5;
        }

    }

    private void renderRoleListPage(Graphics graphics) {
        this.renderMainPageBase(graphics);
        if (this.mixedUi != null) {
            this.mixedUi.draw(graphics);
            LoadingPage.fillRect(graphics, this.mixedUi.X + 5, this.mixedUi.Y + 32, this.mixedUi.W - 11, this.mixedUi.setR((this.subHight << 1) + 6), 1);
            int var2 = (this.mixedUi.W - (this.subHight << 1) - 16) / 3;
            int var3 = (this.mixedUi.setR(GlobalConfig.realHigh <= 240 ? (this.subHight << 1) + 6 : 111) - (this.subHight << 1) - 6) / 3;

            for (int i = 0; i < 2; ++i) {
                for (int j = 0; j < 2; ++j) {
                    this.a((i << 1) + j, this.mixedUi.X + 8 + var2 + (var2 + this.subHight) * j, this.mixedUi.Y + 35 + var3 + (var3 + this.subHight) * i, this.subHight, this.subHight);
                    LoadingPage.drawRect(graphics, (Image) null, this.actorList[(i << 1) + j][0], this.actorList[(i << 1) + j][1], this.subHight, this.subHight, i == this.selectActorRow && j == this.selectActorClo);
                }
            }

            if (this.roleFrame_1 != null && GlobalStatus.roleNicknameList != null && GlobalStatus.roleNicknameList.length > 0) {
                for (int i = 0; i < GlobalStatus.roleNicknameList.length; ++i) {
                    if (this.roleFrame_1[i] != null && i == (this.selectActorRow << 1) + this.selectActorClo) {
                        if (GlobalStatus.roleGenderList[i] == 0) {
                            if (GlobalStatus.roleJobList[i] == 0) {
                                pngUtil.roleSelectedAnimation(graphics, this.roleFrame_1[i], (int[]) null, 0, 0, this.actorList[i][0] + 40 + 6, this.actorList[i][1] + 45 + 1, 20, 0);
                            } else {
                                pngUtil.roleSelectedAnimation(graphics, (Animation) this.roleFrame_1[i], (int[]) null, 0, 0, this.actorList[i][0] + 40 + 9, this.actorList[i][1] + 45 + 16, 20, 0);
                            }
                        } else if (GlobalStatus.roleGenderList[i] == 1) {
                            if (GlobalStatus.roleJobList[i] == 0) {
                                pngUtil.roleSelectedAnimation(graphics, (Animation) this.roleFrame_1[i], (int[]) null, 0, 0, this.actorList[i][0] + 40 + 8, this.actorList[i][1] + 45 + 14, 20, 0);
                            } else {
                                pngUtil.roleSelectedAnimation(graphics, (Animation) this.roleFrame_1[i], (int[]) null, 0, 0, this.actorList[i][0] + 40 - 1, this.actorList[i][1] + 45 + 9, 20, 0);
                            }
                        } else if (GlobalStatus.roleJobList[i] == 0) {
                            pngUtil.roleSelectedAnimation(graphics, (Animation) this.roleFrame_1[i], (int[]) null, 0, 0, this.actorList[i][0] + 40 - 9, this.actorList[i][1] + 45 + 10, 20, 0);
                        } else {
                            pngUtil.roleSelectedAnimation(graphics, (Animation) this.roleFrame_1[i], (int[]) null, 0, 0, this.actorList[i][0] + 40 - 3, this.actorList[i][1] + 45 + 12, 20, 0);
                        }
                    } else if (this.roleFrame_2 != null && i != (this.selectActorRow << 1) + this.selectActorClo) {
                        pngUtil.roleSelectedAnimation(graphics, (Animation) this.roleFrame_2[i], (int[]) null, 0, 0, this.actorList[i][0] + 40 - 18, this.actorList[i][1] + 45, 20, 0);
                    }
                }
            }
        }

        if (this.subInputAction == 1) {
            LoadingPage.c(graphics);
        } else {
            if (this.subInputAction == 2) {
                LoadingPage.drawDialog(graphics, "确认删除？", new String[]{"确认", "返回"});
            }

        }
    }

    //触发选择角色
    private void sendSelectRolePacket(String roleId) {
        byte[] bytes = NetPayloadBuilder.buildSelectRolePacket(NetPacketCode.SelectRole, roleId);
        if (bytes != null) {
            netUtils.sendPacket(new NetPacket(NetPacketCode.SelectRole, bytes));
            this.showPending(null);
        } else {
            this.showTips("获取上传指令数据错误!");
        }
    }

    private void sendSelectRolePacket_2(String roleId) {
        byte[] bytes = NetPayloadBuilder.buildSelectRolePacket(NetPacketCode.SelectRole_2, roleId);
        if (bytes != null) {
            netUtils.sendPacket(new NetPacket(NetPacketCode.SelectRole_2, bytes));
            this.showPending(null);
        } else {
            this.showTips("获取上传指令数据错误!");
        }
    }

    private void i(String var1) {
        GlobalStatus.gQ = 1;
        byte[] var2;
        if ((var2 = NetPayloadBuilder.b((short) 4103, var1)) != null) {
            NetPacket var3 = new NetPacket((short) 4103, var2);
            netUtils.sendPacket(var3);
            this.showPending((String) null);
        } else {
            this.showTips("获取上传指令数据错误!");
        }
    }

    //创建角色
    private void startCreateRolePage() {
        this.loadingMainPageBase();
        this.logo_btn_random = createImage("/images/logo_btn_random.png");
        this.roleFrame_1 = new Animation[6];

        for (int var1 = 0; var1 < this.roleFrame_1.length; ++var1) {
            this.roleFrame_1[var1] = this.loadRoleFrame(this.roleFrame_1[var1], (byte) (var1 % 3), (byte) (var1 < 3 ? 0 : 1), (byte) 3, (byte) 1, false);
        }

        this.subHight = 35;
        this.bG = 0;
        this.bE = 0;
        this.bF = 0;
        this.mixedUi.clean();
        this.mixedUi.setTitle("创建角色");
        this.mixedUi.setR(GlobalConfig.realHigh <= 240 ? this.subHight * 3 + 6 : 150);
        this.textPanel.setText(GlobalConfig.menPaiMiaoShu[0], GlobalConfig.font2, (byte) 1);
        this.textPanel.setShuRuMoShi((byte) 1);
        this.bottomUi.setButtonText(new String[]{"创 建", ""});
        this.mixedUi.addChild((BaseUi) this.textPanel);
        if (GlobalConfig.defaultHigh > 220) {
            this.mixedUi.addChild((BaseUi) this.bottomUi);
        }

        this.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.inputAction = 0;
        this.keyCombination = 0;
        this.lastPageStatus = this.pageStatus = PageStatus.CREATE_CHARACTER;
    }

    public void b(String var1, String var2) {
        this.D();
        if (var1 != null) {
            this.bS = new StringItem(var1, var2);
        }

        this.aD = new Form("角色昵称");
        this.liaoTian = new TextField("角色昵称", (String) null, 5, 0);
        this.back = new Command("返回", 8, 1);
        this.ok = new Command("确定", 2, 1);
        this.aD.addCommand(this.ok);
        this.aD.addCommand(this.back);
        this.aD.append(this.liaoTian);
        if (var1 != null) {
            this.aD.append(this.bS);
        }

        this.aD.setCommandListener(this);
        this.display.setCurrent(this.aD);
    }

    private void D() {
        if (this.aD != null) {
            this.aD.deleteAll();
        }

        this.bS = null;
        this.ok = null;
        this.back = null;
        this.liaoTian = null;
        this.aD = null;
    }

    //游戏主场景
    public void startGameScene() {
        this.releaseLogoResource();
        this.clearRoleListPage();
        gameSceneController = new GameSceneController(this, pngUtil);
        if (this.touchController != null) {
            this.touchController.gameSceneController = gameSceneController;
        }

        gameSceneController.c("欢迎来到<梦回西游>世界");
        this.lastPageStatus = this.pageStatus = PageStatus.GAME_SCENE;
    }

    public void clearRoleListPage() {
        GlobalStatus.clearRoleList();
        if (this.roleFrame_1 != null) {
            for (int var1 = 0; var1 < this.roleFrame_1.length; ++var1) {
                if (this.roleFrame_1[var1] != null) {
                    this.roleFrame_1[var1] = null;
                }
            }

            this.roleFrame_1 = null;
        }

        if (this.roleFrame_2 != null) {
            for (int var2 = 0; var2 < this.roleFrame_2.length; ++var2) {
                if (this.roleFrame_2[var2] != null) {
                    this.roleFrame_2[var2] = null;
                }
            }
            this.roleFrame_2 = null;
        }
    }

    /**
     * 重置场景子状态并刷新主界面：保存当前 sceneSubState 后归零，由装备槽(8201)等包接收后触发 UI 重绘。
     */
    public void i() {
        short var1 = gameSceneController.sceneSubState;
        gameSceneController.sceneSubState = 0;
        gameSceneController.sceneSubMode = 0;
        if (gameSceneController.overlayDialogController != null && (gameSceneController.overlayDialogController.d != 2 || gameSceneController.overlayDialogController.e != 2)) {
            gameSceneController.overlayDialogController.d = 0;
            gameSceneController.overlayDialogController.f = gameSceneController.overlayDialogController.f == -1 ? (gameSceneController.overlayDialogController.f = 0) : gameSceneController.overlayDialogController.f;
        }

        if (this.az && GameSceneController.notInFighting()) {
            gameSceneController.a(gameSceneController.bb);
        } else if (gameSceneController.currentSceneModeId == 18) {
            gameSceneController.sceneSubState = 1;
            gameSceneController.currentSceneModeId = gameSceneController.lastSceneModeId;
        } else if (gameSceneController.currentSceneModeId == 13) {
            if (var1 == 6) {
                gameSceneController.k(gameSceneController.aE);
            } else if (var1 == 7) {
                gameSceneController.sceneSubState = var1;
            } else if (var1 == 8) {
                gameSceneController.sceneSubState = var1;
            } else {
                gameSceneController.j(gameSceneController.as);
            }
        } else if (gameSceneController.currentSceneModeId == 2) {
            if (var1 == 1) {
                gameSceneController.sceneSubState = 1;
            } else {
                gameSceneController.m();
            }
        } else if (gameSceneController.currentSceneModeId == 42) {
            gameSceneController.M.a(gameSceneController.aE);
        } else if (gameSceneController.currentSceneModeId == 48) {
            if (var1 == 2) {
                gameSceneController.sceneSubState = var1;
            }
        } else if (gameSceneController.currentSceneModeId == 46) {
            if (var1 == 1) {
                gameSceneController.M.a(true);
                gameSceneController.M.e();
            }
        } else if (gameSceneController.currentSceneModeId == 45) {
            gameSceneController.M.a(true);
        } else if (gameSceneController.currentSceneModeId == 51) {
            gameSceneController.M.q();
            gameSceneController.M.m();
        } else if (gameSceneController.currentSceneModeId == 52) {
            if (var1 == 0 && this.topUi.selectTabIndex == 1) {
                gameSceneController.M.t();
            } else if (var1 == 2 && LoadingPage.o == 1) {
                gameSceneController.M.q(1);
            }
        } else if (gameSceneController.currentSceneModeId == 70 && !GlobalStatus.kT) {
            if (GlobalStatus.kP == 2) {
                var1 = (byte) gameSceneController.aq;
                byte var2 = (byte) gameSceneController.ar;
                gameSceneController.e(gameSceneController.as);
                gameSceneController.aq = var1;
                gameSceneController.ar = var2;
                gameSceneController.q();
            }

            if (GlobalStatus.kP == 0 || GlobalStatus.kP == 1) {
                gameSceneController.m();
            }

            if (GlobalStatus.kP == 3) {
                gameSceneController.N();
            }
        } else if (gameSceneController.currentSceneModeId == 1) {
            gameSceneController.sceneSubState = var1;
        } else if (gameSceneController.currentSceneModeId == 104) {
            gameSceneController.sceneSubState = var1;
        } else if (gameSceneController.currentSceneModeId == 115) {
            gameSceneController.sceneSubState = var1;
        } else if (gameSceneController.currentSceneModeId == 126) {
            gameSceneController.sceneSubState = var1;
        } else if (gameSceneController.currentSceneModeId == 128) {
            gameSceneController.sceneSubState = var1;
        } else if (gameSceneController.currentSceneModeId == 130) {
            gameSceneController.sceneSubState = var1;
        } else if (gameSceneController.lastSceneModeId == 4 && gameSceneController.as == 7) {
            gameSceneController.t();
        } else if (gameSceneController.lastSceneModeId == 14) {
            if (gameSceneController.currentSceneModeId != 14) {
                gameSceneController.H();
            }
        } else if (gameSceneController.lastSceneModeId != 32) {
            gameSceneController.currentSceneModeId = gameSceneController.lastSceneModeId;
        }

        this.lastPageStatus = this.pageStatus = 7;
    }

    private void processGameSceneAction() {
        try {
            if (gameSceneController != null) {
                gameSceneController.a();
                if (gameSceneController.currentSceneModeId != 0) {
                    this.inputAction = 0;
                }

            }
        } catch (Exception var2) {
            ((Throwable) var2).printStackTrace();
            this.showException((Exception) var2, (byte) 4);
        }
    }

    private void F() {
//        if (GlobalStatus.b != null && GlobalStatus.c != null) {
//            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
//            DataOutputStream var2 = new DataOutputStream(var1);
//
//            try {
//                var2.writeUTF(GlobalStatus.b == null ? "" : GlobalStatus.b);
//                var2.writeUTF(GlobalStatus.c == null ? "" : GlobalStatus.c);
//                this.saveToStore(var1.toByteArray(),(String) this.aK);
//                var1.close();
//                var2.close();
//            } catch (IOException var3) {
//            } catch (Exception var4) {
//            }
//        }
    }

    public void j() {
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        DataOutputStream var2 = new DataOutputStream(var1);

        try {
            for (int var3 = 0; var3 < GameSceneController.aW.length; ++var3) {
                if (var3 != 15) {
                    var2.writeByte(GameSceneController.aW[var3]);
                }
            }

            this.saveToStore(var1.toByteArray(), GlobalStatus.roleId_2);
            var1.close();
            var2.close();
        } catch (IOException var4) {
        }
    }

    public void k() {
        if (containStore(GlobalStatus.roleId_2)) {
            RecordStore var15 = null;

            try {
                DataInputStream var1 = getRecord1(var15 = openRecordStore(GlobalStatus.roleId_2, false));

                for (int var2 = 0; var2 < GameSceneController.aW.length; ++var2) {
                    if (var2 != 15) {
                        GameSceneController.aW[var2] = var1.readByte();
                    }
                }
            } catch (Exception var13) {
                return;
            } finally {
                if (var15 != null) {
                    try {
                        var15.closeRecordStore();
                    } catch (RecordStoreNotOpenException var11) {
                    } catch (RecordStoreException var12) {
                    }
                }

            }

        }
    }

    private static DataInputStream getRecord1(RecordStore store) throws RecordStoreException {
        if (0 < store.getNumRecords()) {
            byte[] var2 = store.getRecord(1);
            return new DataInputStream(new ByteArrayInputStream(var2));
        } else {
            return null;
        }
    }

    private static boolean containStore(String name) {
        String[] stores = RecordStore.listRecordStores();
        if (stores != null) {
            for (int i = stores.length - 1; i >= 0; --i) {
                if (stores[i].equals(name)) {
                    return true;
                }
            }

        }
        return false;
    }

    private static RecordStore openRecordStore(String recordStoreName, boolean clear) throws RecordStoreException {
        if (clear) {
            RecordStore.deleteRecordStore(recordStoreName);
        }
        return RecordStore.openRecordStore(recordStoreName, true);
    }

    private void saveToStore(byte[] data, String name) {
        try {
            RecordStore var21 = openRecordStore(name, containStore(name));
            var21.addRecord(data, 0, data.length);
            var21.closeRecordStore();
        } catch (RecordStoreException var19) {
            var19.printStackTrace();
        }
    }

    private void G() {
        this.gameRunning = false;
        this.releaseLogoResource();
    }

    private void H() {
        this.aD = null;
        this.ok = null;
        this.ok = null;
        this.liaoTian = null;
        this.bX = null;
    }

    public void a(String var1, int var2) {
        this.aD = new Form(var1);
        if (var2 == 2) {
            this.liaoTian = new TextField(var1, (String) null, 9, var2);
        } else if (var1.equals("聊天")) {
            if (gameSceneController.currentSceneModeId == 18) {
                if (gameSceneController.aR) {
                    this.liaoTian = new TextField("与" + gameSceneController.aQ + "私聊", (String) null, 30, var2);
                } else {
                    this.liaoTian = new TextField(GlobalConfig.liaoTianPinDao[gameSceneController.aT], (String) null, 30, var2);
                }
            } else if (gameSceneController.currentSceneModeId == 7) {
                if (this.topUi.selectTabIndex < 3) {
                    this.liaoTian = new TextField("与" + GlobalStatus.gJ[this.gunDongListUi.g()] + "私聊", (String) null, 30, var2);
                } else if (GlobalStatus.bs == 1) {
                    if (LoadingPage.o == 3) {
                        this.liaoTian = new TextField("群聊", (String) null, 30, var2);
                    } else if (LoadingPage.o == 4) {
                        this.liaoTian = new TextField("与" + GlobalStatus.teamBonus[this.gunDongListUi.g()].name + "私聊", (String) null, 30, var2);
                    }
                } else if (GlobalStatus.bs == 0) {
                    if (LoadingPage.o == 0) {
                        this.liaoTian = new TextField("群聊", (String) null, 30, var2);
                    } else if (LoadingPage.o == 1) {
                        this.liaoTian = new TextField("与" + GlobalStatus.teamBonus[this.gunDongListUi.g()].name + "私聊", (String) null, 30, var2);
                    }
                }
            } else if (gameSceneController.currentSceneModeId == 19) {
                this.liaoTian = new TextField("与" + GlobalStatus.dL[this.gunDongListUi.g() - 1] + "私聊", (String) null, 30, var2);
            } else if (gameSceneController.currentSceneModeId == 47) {
                this.liaoTian = new TextField("与" + GlobalStatus.iz[this.gunDongListUi.g()] + "私聊", (String) null, 30, var2);
            } else {
                this.liaoTian = new TextField("聊天", (String) null, 30, var2);
            }
        } else if (!var1.equals("输入帮派宗旨") && !var1.equals("输入帮派新宗旨") && !var1.equals("输入公告")) {
            if (var1.equals("输入帮派名称")) {
                this.liaoTian = new TextField(var1, (String) null, 6, var2);
            } else if (var1.equals("请输入要搜索的帮派名称")) {
                this.liaoTian = new TextField(var1, (String) null, 6, var2);
            } else if (var1.equals("请输入警告语（30个字符内）")) {
                this.liaoTian = new TextField(var1, (String) null, 30, var2);
            } else if (var1.equals("输入兑换码")) {
                this.liaoTian = new TextField(var1, (String) null, 30, var2);
            } else {
                this.liaoTian = new TextField(var1, (String) null, 5, var2);
            }
        } else {
            this.liaoTian = new TextField(var1, (String) null, 100, var2);
        }

        this.back = new Command("返回", 8, 1);
        this.ok = new Command("确定", 2, 1);
        if (var1.equals("聊天")) {
            this.bR = new Command("表情", 8, 1);
            this.aD.addCommand(this.bR);
        }

        this.aD.addCommand(this.ok);
        this.aD.addCommand(this.back);
        this.aD.append(this.liaoTian);
        this.aD.setCommandListener(this);
        this.display.setCurrent(this.aD);
        if (var1.equals("聊天")) {
            a(this.liaoTian, this.bZ);
        }

    }

    public static void a(TextField var0, String var1) {
        try {
            if (var1 != null && var0.getMaxSize() > var1.length()) {
                var0.setString(var1);
            }

        } catch (Exception var2) {
            var0.setString("");
        }
    }

    public void a(String var1, String var2, String var3, String var4) {
        this.aD = new Form("邮件举报");
        this.liaoTian = new TextField("举报理由: ", "", 100, 0);
        this.bS = new StringItem("举报邮件：", "");
        this.bT = new StringItem("发件人：", var2);
        this.bU = new StringItem("标    题：", var3);
        this.bV = new StringItem("正    文：", var4);
        this.bW = var1;
        this.ok = new Command("举报", 3, 0);
        this.back = new Command("返回", 1, 5);
        this.aD.addCommand(this.ok);
        this.aD.addCommand(this.back);
        this.aD.append(this.liaoTian);
        this.aD.append(this.bS);
        this.aD.append(this.bT);
        this.aD.append(this.bU);
        this.aD.append(this.bV);
        this.display.setCurrent(this.aD);
        this.aD.setCommandListener(this);
        this.display.setCurrent(this.aD);
    }

    public void l() {
        this.aD = new Form("联系客服");
        this.bX = new ChoiceGroup("类型: ", 1, ag_1.a, (Image[]) null);
        this.liaoTian = new TextField("内容: ", "", 100, 0);
        this.ok = new Command("确定", 3, 0);
        this.back = new Command("返回", 1, 5);
        this.aD.addCommand(this.ok);
        this.aD.addCommand(this.back);
        this.aD.append(this.liaoTian);
        this.aD.append(this.bX);
        this.display.setCurrent(this.aD);
        this.aD.setCommandListener(this);
    }

    public void a(byte _t, String var2, String var3, String var4, String var5, String var6, String var7) {
        this.bY = 0;
        GlobalStatus.O.q = var6;
        GlobalStatus.O.r = var7;
        boolean var1 = var2.equals("回复邮件");
        if (this.bY == 0) {
            this.aD = new Form(var2);
            if (!var1) {
                this.youjian = new TextField("收件人: ", var4, 10, 0);
            } else {
                this.bU = new StringItem("收件人: ", var4);
            }

            this.liaoTian = new TextField("标    题: ", var3, 10, 0);
            this.bM = new TextField("正    文: ", var5, 100, 0);
            this.ok = new Command("发送", 3, 0);
            this.back = new Command("返回", 1, 5);
            if (!var1) {
                this.bR = new Command("选择收件人", 1, 5);
            }

            this.bS = new StringItem("温馨提示", "★请保护好个人帐号，勿在邮件内容中泄漏任何与财产相关的信息，后果需自负。");
            this.bT = new StringItem((String) null, "★官方与玩家联系使用系统邮件形式，慎访私人邮件冒用官方名义行骗。");
            this.aD.addCommand(this.ok);
            if (!var1) {
                this.aD.addCommand(this.bR);
            }

            this.aD.addCommand(this.back);
            this.aD.append(this.liaoTian);
            if (!var1) {
                this.aD.append(this.youjian);
            } else {
                this.aD.append(this.bU);
            }

            this.aD.append(this.bM);
            this.aD.append(this.bS);
            this.aD.append(this.bT);
            this.aD.setCommandListener(this);
            this.display.setCurrent(this.aD);
        }

    }

    public void d(String var1) {
        this.aD = new Form(var1);
        this.aE = new ChoiceGroup("", 1, new String[]{"世界聊", "区域聊", "队伍聊", "帮派聊", "跨服聊"}, (Image[]) null);
        this.aE.setSelectedIndex(1, true);
        this.liaoTian = new TextField(var1, (String) null, 30, 0);
        this.back = new Command("返回", 8, 1);
        this.bR = new Command("表情", 8, 1);
        this.ok = new Command("确定", 2, 1);
        this.aD.addCommand(this.ok);
        this.aD.addCommand(this.bR);
        this.aD.addCommand(this.back);
        this.aD.append(this.liaoTian);
        this.aD.append(this.aE);
        this.aD.setCommandListener(this);
        this.display.setCurrent(this.aD);
        a(this.liaoTian, this.bZ);
    }

    public void e(String var1) {
        this.aD = new Form(var1);
        this.ok = new Command("确定", 4, 2);
        this.back = new Command("返回", 2, 1);
        this.aD.addCommand(this.back);
        this.aD.addCommand(this.ok);
        this.aD.setCommandListener(this);
        this.liaoTian = new TextField("请输入搜索关键字:", "", 10, 0);
        this.aD.append(this.liaoTian);
        this.display.setCurrent(this.aD);
    }

    public void f(String var1) {
        this.aD = new Form(var1);
        this.ok = new Command("更改", 4, 2);
        this.back = new Command("返回", 2, 1);
        this.aD.addCommand(this.back);
        this.aD.addCommand(this.ok);
        this.aD.setCommandListener(this);
        this.liaoTian = new TextField("新名称:", "", 5, 0);
        this.aD.append(this.liaoTian);
        this.display.setCurrent(this.aD);
        this.inChat = false;
    }

    public void m() {
        if (this.aD != null) {
            this.aD.removeCommand(this.ok);
            this.aD.removeCommand(this.back);
            this.aD.deleteAll();
        }

        this.ok = null;
        this.back = null;
        this.liaoTian = null;
        this.aD = null;
        this.inChat = false;
    }

    /**
     * 保存聊天内容并清理页面过渡状态：缓存聊天输入框文字，清除弹层、输入状态，由地图加载完成(8261)后调用。
     */
    public void n() {
        if (this.liaoTian != null && this.liaoTian.getString() != null) {
            this.bZ = this.liaoTian.getString();
        }

        if (this.aD != null) {
            this.aD.removeCommand(this.ok);
            this.aD.removeCommand(this.back);
            this.aD.deleteAll();
        }

        if (this.aE != null) {
            this.aE.deleteAll();
        }

        this.aE = null;
        this.ok = null;
        this.back = null;
        this.liaoTian = null;
        this.aD = null;
    }

    public void o() {
        if (this.aD != null) {
            this.aD.removeCommand(this.ok);
            this.aD.removeCommand(this.back);
            this.aD.deleteAll();
        }

        this.ok = null;
        this.back = null;
        this.liaoTian = null;
        this.aD = null;
    }

    private void I() {
        if (this.aD != null) {
            this.aD.removeCommand(this.ok);
            this.aD.removeCommand(this.back);
            this.aD.deleteAll();
        }

        this.ok = null;
        this.back = null;
        this.aD = null;
    }

    public void commandAction(Command var1, Displayable var2) {
        if (this.aD != null) {
            String var51;
            if (!(var51 = this.aD.getTitle()).equals("登录当乐通行证") && !var51.equals("登录一哥哥通行证")) {
                if (var51.equals("登陆游戏")) {
                    String var50;
                    if (!(var50 = var1.getLabel()).equals("登陆")) {
                        if (var50.equals("返回")) {
                            this.startMainPage();
                            this.inputAction = 0;
                            this.keyCombination = 0;
                            this.mainMidlet.start();
                        }

                        return;
                    }

                    if (!this.bN.getString().equals("") && !this.bO.getString().equals("")) {
                        this.aZ = true;
                        this.mainMidlet.start();
                    } else if (this.bN.getString().equals("")) {
                        this.showTips("帐号不能为空!");
                    } else {
                        if (!this.bO.getString().equals("")) {
                            return;
                        }

                        this.showTips("密码不能为空!");
                    }
                } else if (var51.equals("角色昵称")) {
                    String var49;
                    if (!(var49 = var1.getLabel()).equals("确定")) {
                        if (var49.equals("返回")) {
                            this.inputAction = 0;
                            this.keyCombination = 0;
                            this.mainMidlet.start();
                        }

                        return;
                    }

                    if (!this.liaoTian.getString().equals("")) {
                        this.ay = this.liaoTian.getString().trim();
                        this.D();
                        this.mainMidlet.start();
                    } else {
                        this.showTips("昵称不能为空！");
                    }
                } else if (var51.equals("聊天")) {
                    String var48;
                    if ((var48 = var1.getLabel()).equals("确定")) {
                        if (this.liaoTian.getString() == null || this.liaoTian.getString().equals("")) {
                            this.mainMidlet.start();
                            this.showTips("不能发送空消息");
                            return;
                        }

                        if (gameSceneController.lastSceneModeId == 1) {
                            gameSceneController.lastSceneModeId = gameSceneController.currentSceneModeId = 0;
                        } else {
                            gameSceneController.currentSceneModeId = gameSceneController.lastSceneModeId;
                        }

                        this.inputAction = 0;
                        this.keyCombination = 0;
                        this.mainMidlet.start();
                        if (gameSceneController.currentSceneModeId == 0) {
                            pngUtil.a(gameSceneController.f, GameSceneController.h, GameSceneController.i_1, true, false, 1009050);
                        }

                        this.resourceLoaded = true;
                    } else {
                        if (!var48.equals("返回")) {
                            if (var48.equals("表情")) {
                                gameSceneController.L();
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        this.n();
                        if (gameSceneController.lastSceneModeId == 1) {
                            gameSceneController.lastSceneModeId = 0;
                            gameSceneController.currentSceneModeId = 0;
                        } else {
                            gameSceneController.currentSceneModeId = gameSceneController.lastSceneModeId;
                        }

                        this.inputAction = 0;
                        this.keyCombination = 0;
                        this.mainMidlet.start();
                        if (gameSceneController.currentSceneModeId != 0) {
                            return;
                        }

                        pngUtil.a(gameSceneController.f, GameSceneController.h, GameSceneController.i_1, true, false, 1009050);
                    }
                } else if (var51.equals("物品关键字搜索")) {
                    String var47 = var1.getLabel();
                    String var78 = this.liaoTian.getString();
                    if (!var47.equals("确定") || var78 == null) {
                        if (var47.equals("返回")) {
                            this.aD = null;
                            this.liaoTian = null;
                            this.inputAction = 0;
                            this.keyCombination = 0;
                            this.mainMidlet.start();
                        }

                        return;
                    }

                    gameSceneController.aU = this.gunDongListUi.g();
                    gameSceneController.aK = var78;
                    gameSceneController.aL = "";
                    gameSceneController.aM = 1;
                    gameSceneController.aN = 0;
                    gameSceneController.a(gameSceneController.aK, gameSceneController.aL, gameSceneController.aM, gameSceneController.aN);
                    this.mainMidlet.start();
                    this.showPending((String) null);
                } else if (var51.equals("宠物关键字搜索")) {
                    String var46 = var1.getLabel();
                    String var77 = this.liaoTian.getString();
                    if (!var46.equals("确定") || var77 == null) {
                        if (var46.equals("返回")) {
                            this.aD = null;
                            this.liaoTian = null;
                            this.inputAction = 0;
                            this.keyCombination = 0;
                            this.mainMidlet.start();
                        }

                        return;
                    }

                    gameSceneController.aU = this.gunDongListUi.g();
                    gameSceneController.aK = var77;
                    gameSceneController.aL = "";
                    gameSceneController.aM = 1;
                    gameSceneController.aN = 0;
                    gameSceneController.b(gameSceneController.aK, gameSceneController.aL, gameSceneController.aM, gameSceneController.aN);
                    this.mainMidlet.start();
                    this.showPending((String) null);
                } else if (var51.equals("宠物名称")) {
                    String var45 = var1.getLabel();
                    String var76 = this.liaoTian.getString();
                    if (!var45.equals("更改") || var76 == null) {
                        if (var45.equals("返回")) {
                            this.mainMidlet.start();
                            this.m();
                        }

                        return;
                    }

                    if (var76.length() == 0) {
                        this.showTips("名称为空！");
                    } else {
                        this.inChat = true;
                        this.mainMidlet.start();
                    }
                } else if (var51.equals("服务地址")) {
                    String var44;
                    if (!(var44 = var1.getLabel()).equals("确定")) {
                        if (var44.equals("返回")) {
                            this.H();
                            this.startLogo();
                            this.mainMidlet.start();
                            this.inputAction = 0;
                            this.keyCombination = 0;
                        }

                        return;
                    }

                    String var75 = this.liaoTian.getString();
                    int var88 = this.bX.getSelectedIndex();
                    this.H();
                    this.showLoginPage();
                } else if (!var51.equals("请输入拍卖价格") && !var51.equals("请输入取出银两") && !var51.equals("请输入存入银两") && !var51.equals("拍卖价格") && !var51.equals("输入交易银两") && !var51.equals("请输入决斗金额") && !var51.equals("捐献银两数量") && !var51.equals("取出银两数量") && !var51.equals("捐献经验数量") && !var51.equals("请输入决斗金额") && !var51.equals("请输入竞标银两")) {
                    if (var51.equals("输入帮派名称")) {
                        String var43 = var1.getLabel();
                        String var74 = this.liaoTian.getString();
                        if (!var43.equals("确定") || var74 == null) {
                            if (var43.equals("返回")) {
                                Object var56 = null;
                                gameSceneController.M.c = (String) var56;
                                this.I();
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var74.length() == 0) {
                            this.showTips("名字输入错误！");
                        } else {
                            gameSceneController.M.c = var74;
                            this.I();
                            this.a((String) "输入帮派宗旨", (int) 0);
                        }
                    } else if (var51.equals("输入帮派宗旨")) {
                        String var41 = var1.getLabel();
                        String var73 = this.liaoTian.getString();
                        if (!var41.equals("确定") || var73 == null) {
                            if (var41.equals("返回")) {
                                Object var54 = null;
                                gameSceneController.M.c = (String) var54;
                                var54 = null;
                                gameSceneController.M.d = (String) var54;
                                this.I();
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var73.length() == 0) {
                            this.showTips("请输入帮派宗旨！");
                        } else {
                            gameSceneController.M.d = var73;
                            this.I();
                            GroupModel var42;
                            if ((var42 = gameSceneController.M).c != null && var42.d != null) {
                                byte[] var87;
                                if ((var87 = NetPayloadBuilder.b((short) 4197, GlobalStatus.roleId_2, var42.c, var42.d)) != null) {
                                    NetPacket var92 = new NetPacket((short) 4197, var87);
                                    netUtils.sendPacket(var92);
                                } else {
                                    var42.a.mainCanvasRef.showTips("获取上传指令数据错误!");
                                }

                                var42.a.mainCanvasRef.showPending((String) null);
                            }

                            this.mainMidlet.start();
                        }
                    } else if (var51.equals("输入帮派新宗旨")) {
                        String var39 = var1.getLabel();
                        String var72 = this.liaoTian.getString();
                        if (!var39.equals("确定") || var72 == null) {
                            if (var39.equals("返回")) {
                                Object var53 = null;
                                gameSceneController.M.e = (String) var53;
                                this.I();
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var72.length() == 0) {
                            this.showTips("请输入帮派宗旨！");
                        } else {
                            gameSceneController.M.e = var72;
                            this.I();
                            GroupModel var40;
                            if ((var40 = gameSceneController.M).e != null) {
                                byte[] var86;
                                if ((var86 = NetPayloadBuilder.i((short) 4216, GlobalStatus.roleId_2, var40.e)) != null) {
                                    NetPacket var91 = new NetPacket((short) 4216, var86);
                                    netUtils.sendPacket(var91);
                                } else {
                                    var40.b.showTips("获取上传指令数据错误!");
                                }

                                var40.b.showPending((String) null);
                            }

                            this.mainMidlet.start();
                        }
                    } else if (var51.equals("输入玩家名称")) {
                        String var38 = var1.getLabel();
                        String var71 = this.liaoTian.getString();
                        if (!var38.equals("确定") || var71 == null) {
                            if (var38.equals("返回")) {
                                this.mainMidlet.start();
                                this.I();
                            }

                            return;
                        }

                        if (var71.length() == 0) {
                            this.showTips("名称不能为空！");
                        } else {
                            gameSceneController.M.f = var71;
                            this.I();
                            gameSceneController.M.h();
                            this.mainMidlet.start();
                        }
                    } else if (var51.equals("输入招募金额")) {
                        String var37;
                        if (!(var37 = var1.getLabel()).equals("确定")) {
                            if (var37.equals("返回")) {
                                this.aD = null;
                                this.liaoTian = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (this.liaoTian.getString() == "") {
                            return;
                        }

                        gameSceneController.o();
                        gameSceneController.ak.append(this.liaoTian.getString());
                        if (gameSceneController.n() >= 0L) {
                            gameSceneController.M.a(gameSceneController.n());
                            gameSceneController.M.a();
                            this.mainMidlet.start();
                        } else {
                            this.showTips("输入有误,请重新输入");
                        }
                    } else if (var51.equals("请输入贡献金额")) {
                        String var36;
                        if (!(var36 = var1.getLabel()).equals("确定")) {
                            if (var36.equals("返回")) {
                                this.aD = null;
                                this.liaoTian = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (this.liaoTian.getString() != "") {
                            gameSceneController.o();
                            gameSceneController.ak.append(this.liaoTian.getString());
                            if (gameSceneController.n() >= 0L) {
                                if (gameSceneController.n() > GlobalStatus.versus) {
                                    this.showTips("您没有这么多银两,请重新输入！");
                                } else {
                                    gameSceneController.M.k[0] = (int) (gameSceneController.M.j = gameSceneController.n());
                                    this.mainMidlet.start();
                                }
                            } else {
                                this.showTips("输入有误,请重新输入");
                            }
                        } else {
                            this.showTips("请输入金额");
                        }
                    } else if (var51.equals("请输入银两奖励")) {
                        String var35;
                        if (!(var35 = var1.getLabel()).equals("确定")) {
                            if (var35.equals("返回")) {
                                this.aD = null;
                                this.liaoTian = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (this.liaoTian.getString() != "") {
                            gameSceneController.o();
                            gameSceneController.ak.append(this.liaoTian.getString());
                            if (gameSceneController.n() >= 0L) {
                                if (gameSceneController.n() > (long) GlobalStatus.iM[1]) {
                                    this.showTips("最多只能配置" + GlobalStatus.a((long) GlobalStatus.iM[1]) + ",请重新输入！");
                                } else {
                                    gameSceneController.M.i[1] = GlobalStatus.iM[0] = (int) gameSceneController.n();
                                    this.mainMidlet.start();
                                }
                            } else {
                                this.showTips("输入有误,请重新输入");
                            }
                        } else {
                            this.showTips("请输入银两");
                        }
                    } else if (var51.equals("请输入物品掉率")) {
                        String var34;
                        if (!(var34 = var1.getLabel()).equals("确定")) {
                            if (var34.equals("返回")) {
                                this.aD = null;
                                this.liaoTian = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (this.liaoTian.getString() != "") {
                            gameSceneController.o();
                            gameSceneController.ak.append(this.liaoTian.getString());
                            if (gameSceneController.n() >= 0L) {
                                if (gameSceneController.n() > (long) GlobalStatus.iK[1]) {
                                    this.showTips("最多只能配置" + GlobalStatus.iK[1] + "%,请重新输入！");
                                } else {
                                    gameSceneController.M.i[0] = GlobalStatus.iK[0] = (byte) ((int) gameSceneController.n());
                                    this.mainMidlet.start();
                                }
                            } else {
                                this.showTips("输入有误,请重新输入");
                            }
                        } else {
                            this.showTips("请输入掉率");
                        }
                    } else if (var51.equals("请输入经验加成")) {
                        String var33;
                        if (!(var33 = var1.getLabel()).equals("确定")) {
                            if (var33.equals("返回")) {
                                this.aD = null;
                                this.liaoTian = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (this.liaoTian.getString() != "") {
                            gameSceneController.o();
                            gameSceneController.ak.append(this.liaoTian.getString());
                            if (gameSceneController.n() >= 0L) {
                                if (gameSceneController.n() > (long) GlobalStatus.iL[1]) {
                                    this.showTips("最多只能配置" + GlobalStatus.iL[1] + "%,请重新输入！");
                                } else {
                                    gameSceneController.M.i[2] = GlobalStatus.iL[0] = (byte) ((int) gameSceneController.n());
                                    this.mainMidlet.start();
                                }
                            } else {
                                this.showTips("输入有误,请重新输入");
                            }
                        } else {
                            this.showTips("请输入加成");
                        }
                    } else if (var51.equals("输入公告")) {
                        String var31 = var1.getLabel();
                        String var70 = this.liaoTian.getString();
                        if (!var31.equals("确定") || var70 == null) {
                            if (var31.equals("返回")) {
                                Object var52 = null;
                                gameSceneController.M.h = (String) var52;
                                this.I();
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var70.length() == 0) {
                            this.showTips("请输入公告！");
                        } else {
                            gameSceneController.M.h = var70;
                            this.I();
                            GroupModel var32 = gameSceneController.M;
                            byte[] var85;
                            if ((var85 = NetPayloadBuilder.n((short) 4218, GlobalStatus.roleId_2, var32.h)) != null) {
                                netUtils.sendPacket(new NetPacket((short) 4218, var85));
                                var32.b.showPending((String) null);
                            } else {
                                var32.b.showTips("获取上传指令数据错误!");
                            }

                            this.mainMidlet.start();
                        }
                    } else if (var51.equals("输入“OK” 删除角色")) {
                        String var30 = var1.getLabel();
                        String var69 = this.liaoTian.getString();
                        if (!var30.equals("确定") || var69 == null) {
                            if (var30.equals("返回")) {
                                this.aD = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var69.equals("OK")) {
                            byte[] var84;
                            if ((var84 = NetPayloadBuilder.a((short) 4100, GlobalStatus.roleIdList[this.aw])) != null) {
                                netUtils.sendPacket(new NetPacket((short) 4100, var84));
                                this.showPending((String) null);
                            } else {
                                this.showTips("获取上传指令数据错误!");
                            }

                            this.mainMidlet.start();
                        } else {
                            this.showTips("请输入“OK” ！");
                        }
                    } else if (var51.equals("请输入好友昵称")) {
                        String var29;
                        if (!(var29 = var1.getLabel()).equals("确定")) {
                            if (var29.equals("返回")) {
                                this.aD = null;
                                this.liaoTian = null;
                                this.inputAction = 0;
                                this.keyCombination = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (this.liaoTian.getString().equals("")) {
                            this.showTips("昵称不能为空！");
                        } else {
                            gameSceneController.a(this.liaoTian.getString(), true);
                            this.inputAction = 0;
                            this.keyCombination = 0;
                            this.mainMidlet.start();
                        }
                    } else if (var51.equals("重要物品输入OK丢弃")) {
                        String var28 = var1.getLabel();
                        String var68 = this.liaoTian.getString();
                        if (!var28.equals("确定") || var68 == null) {
                            if (var28.equals("返回")) {
                                this.aD = null;
                                this.liaoTian = null;
                                this.inputAction = 0;
                                this.keyCombination = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var68.equals("OK")) {
                            gameSceneController.f(gameSceneController.ag);
                            this.inputAction = 0;
                            this.keyCombination = 0;
                            this.mainMidlet.start();
                        } else {
                            this.showTips("请输入“OK” ！");
                        }
                    } else if (var51.equals("输入OK确认解散帮派")) {
                        String var26 = var1.getLabel();
                        String var67 = this.liaoTian.getString();
                        if (!var26.equals("确定") || var67 == null) {
                            if (var26.equals("返回")) {
                                this.aD = null;
                                this.liaoTian = null;
                                this.inputAction = 0;
                                this.keyCombination = 0;
                                gameSceneController.sceneSubState = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var67.equals("OK")) {
                            GroupModel var27 = gameSceneController.M;
                            byte[] var83;
                            if ((var83 = NetPayloadBuilder.n((short) 4214, GlobalStatus.roleId_2)) != null) {
                                netUtils.sendPacket(new NetPacket((short) 4214, var83));
                                var27.b.showPending((String) null);
                            } else {
                                var27.b.showTips("获取上传指令数据错误!");
                            }

                            this.inputAction = 0;
                            this.keyCombination = 0;
                            this.mainMidlet.start();
                        } else {
                            this.showTips("如需要解散帮派，请输入“OK”！");
                        }
                    } else if (var51.equals("请输入要搜索的帮派名称")) {
                        String var25 = var1.getLabel();
                        String var66 = this.liaoTian.getString();
                        if (!var25.equals("确定") || var66 == null) {
                            if (var25.equals("返回")) {
                                this.I();
                                this.inputAction = 0;
                                this.keyCombination = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        GlobalStatus.gQ = 1;
                        if (var66.length() == 0) {
                            gameSceneController.M.o = "";
                            gameSceneController.M.a(gameSceneController.M.o);
                        } else {
                            gameSceneController.M.o = var66;
                            gameSceneController.M.a(gameSceneController.M.o);
                        }

                        this.I();
                        this.inputAction = 0;
                        this.keyCombination = 0;
                        this.mainMidlet.start();
                    } else if (var51.equals("输入OK确认宣战")) {
                        String var24 = var1.getLabel();
                        String var65 = this.liaoTian.getString();
                        if (!var24.equals("确定") || var65 == null) {
                            if (var24.equals("返回")) {
                                this.aD = null;
                                this.liaoTian = null;
                                this.inputAction = 0;
                                this.keyCombination = 0;
                                gameSceneController.sceneSubState = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var65.equals("OK")) {
                            gameSceneController.M.a((byte) 3, GlobalStatus.jY[this.gunDongListUi.g() - 1]);
                            this.inputAction = 0;
                            this.keyCombination = 0;
                            this.mainMidlet.start();
                        } else {
                            this.showTips("确定宣战，请输入“OK”！");
                        }
                    } else if (var51.equals("重要物品输入OK卖出")) {
                        String var23 = var1.getLabel();
                        String var64 = this.liaoTian.getString();
                        if (!var23.equals("确定") || var64 == null) {
                            if (var23.equals("返回")) {
                                this.aD = null;
                                this.liaoTian = null;
                                this.inputAction = 0;
                                this.keyCombination = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var64.equals("OK")) {
                            gameSceneController.m(gameSceneController.ag);
                            this.inputAction = 0;
                            this.keyCombination = 0;
                            this.mainMidlet.start();
                        } else {
                            this.showTips("请输入“OK” ！");
                        }
                    } else if (var51.equals("请输入警告语（30个字符内）")) {
                        String var22 = var1.getLabel();
                        String var63 = this.liaoTian.getString();
                        if (!var22.equals("确定") || var63 == null) {
                            if (var22.equals("返回")) {
                                this.aD = null;
                                this.liaoTian = null;
                                this.inputAction = 0;
                                this.keyCombination = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        gameSceneController.M.b((byte) 0, var63);
                        this.inputAction = 0;
                        this.keyCombination = 0;
                        this.mainMidlet.start();
                    } else if (var51.equals("输入OK确定遗忘宠物技能")) {
                        String var21 = var1.getLabel();
                        String var62 = this.liaoTian.getString();
                        if (!var21.equals("确定") || var62 == null) {
                            if (var21.equals("返回")) {
                                this.aD = null;
                                this.liaoTian = null;
                                this.inputAction = 0;
                                this.keyCombination = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var62.equals("OK")) {
                            gameSceneController.y();
                            this.inputAction = 0;
                            this.keyCombination = 0;
                            this.mainMidlet.start();
                        } else {
                            this.showTips("请输入“OK” ！");
                        }
                    } else if (var51.equals("发布求爱宣言")) {
                        String var19 = var1.getLabel();
                        String var61 = this.liaoTian.getString();
                        String var82 = this.youjian.getString();
                        String var89 = this.bM.getString();
                        if (!var19.equals("确定")) {
                            if (var19.equals("返回")) {
                                this.aD = null;
                                this.liaoTian = null;
                                this.youjian = null;
                                this.bM = null;
                                this.inputAction = 0;
                                this.keyCombination = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (!var61.equals("") && !var82.equals("") && !var89.equals("")) {
                            gameSceneController.o();
                            gameSceneController.ak.append(var89);
                            long var96;
                            if ((var96 = gameSceneController.n()) > 0L) {
                                gameSceneController.S.a(var61, var82, var96);
                                this.inputAction = 0;
                                this.keyCombination = 0;
                                this.mainMidlet.start();
                                return;
                            }

                            Alert var20;
                            (var20 = new Alert("银两输入有误", "请重新输入银两！", (Image) null, AlertType.ERROR)).setTimeout(-2);
                            this.display.setCurrent(var20);
                        } else if (var61.equals("")) {
                            Alert var93;
                            (var93 = new Alert("昵称为空", "请输入求爱人昵称！", (Image) null, AlertType.ERROR)).setTimeout(-2);
                            this.display.setCurrent(var93);
                        } else if (var82.equals("")) {
                            Alert var94;
                            (var94 = new Alert("求爱宣言为空", "请输入求爱宣言！", (Image) null, AlertType.ERROR)).setTimeout(-2);
                            this.display.setCurrent(var94);
                        } else {
                            if (!var89.equals("")) {
                                return;
                            }

                            Alert var95;
                            (var95 = new Alert("银两为空", "请输入银两！", (Image) null, AlertType.ERROR)).setTimeout(-2);
                            this.display.setCurrent(var95);
                        }
                    } else if (var51.equals("输入OK确定离婚")) {
                        String var18 = var1.getLabel();
                        String var60 = this.liaoTian.getString();
                        if (!var18.equals("确定") || var60 == null) {
                            if (var18.equals("返回")) {
                                this.aD = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var60.equals("OK")) {
                            if (MarriageModel.e == 1) {
                                return;
                            }

                            gameSceneController.S.b((byte) 1);
                        } else {
                            this.showTips("请输入“OK” ！");
                        }
                    } else if (var51.equals("输入兑换码")) {
                        String var17 = var1.getLabel();
                        String var59 = this.liaoTian.getString();
                        if (!var17.equals("确定") || var59 == null) {
                            if (var17.equals("返回")) {
                                this.aD = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        byte[] var81;
                        if ((var81 = NetPayloadBuilder.q((short) 4880, GlobalStatus.roleId_2, this.liaoTian.getString())) != null) {
                            netUtils.sendPacket(new NetPacket((short) 4880, var81));
                            this.showPending((String) null);
                            return;
                        }

                        this.showTips("获取上传指令数据错误!");
                    } else if (!var51.equals("发送邮件") && !var51.equals("回复邮件")) {
                        if (var51.equals("选择收件人")) {
                            if (var1.getLabel().equals("确定")) {
                                GlobalStatus.O.o = GlobalStatus.O.s[this.bX.getSelectedIndex()];
                                GlobalStatus.O.r = GlobalStatus.O.t[this.bX.getSelectedIndex()];
                            }

                            this.a((byte) 0, GlobalStatus.O.m, GlobalStatus.O.n, GlobalStatus.O.o, GlobalStatus.O.p == null ? "" : GlobalStatus.O.p, GlobalStatus.O.q, GlobalStatus.O.r);
                            return;
                        }

                        if (var51.equals("邮件举报")) {
                            if (var1.getLabel().equals("举报")) {
                                gameSceneController.a(this.bW, this.liaoTian.getString().trim(), GlobalStatus.O.d);
                                this.mainMidlet.start();
                                return;
                            }

                            this.aD = null;
                            this.mainMidlet.start();
                            return;
                        }

                        if (var51.equals("联系客服")) {
                            if (!var1.getLabel().equals("确定")) {
                                this.aD = null;
                                this.mainMidlet.start();
                                return;
                            }

                            String var16;
                            if ((var16 = this.liaoTian.getString().trim()).length() >= 5) {
                                gameSceneController.a(var16, ag_1.a[this.bX.getSelectedIndex()]);
                                this.mainMidlet.start();
                                return;
                            }

                            this.showTips("信息长度不足，不能少于5字，请重新输入");
                        } else {
                            this.aD = null;
                            this.mainMidlet.start();
                        }
                    } else {
                        String var15 = var1.getLabel();
                        if (this.bY != 0) {
                            return;
                        }

                        GlobalStatus.O.a();
                        GlobalStatus.O.m = this.aD.getTitle();
                        GlobalStatus.O.n = this.liaoTian == null ? "" : this.liaoTian.getString().trim();
                        GlobalStatus.O.o = this.youjian == null ? "" : this.youjian.getString().trim();
                        GlobalStatus.O.p = this.bM == null ? "" : this.bM.getString().trim();
                        if (var15.equals("发送")) {
                            Object var57 = null;
                            String var58;
                            if (var51.equals("回复邮件")) {
                                var58 = this.bU.getText();
                            } else {
                                var58 = GlobalStatus.O.o;
                            }

                            gameSceneController.a(GlobalStatus.O.n, var58, GlobalStatus.O.p, GlobalStatus.O.d);
                            this.mainMidlet.start();
                        } else {
                            if (!var15.equals("选择收件人")) {
                                this.aD = null;
                                this.mainMidlet.start();
                                return;
                            }

                            if (this.bY == 0) {
                                this.aD = new Form("选择收件人");
                                if (GlobalStatus.O.s != null && GlobalStatus.O.s.length > 0) {
                                    this.bX = new ChoiceGroup("从好友列表中选择收件人", 1, GlobalStatus.O.s, (Image[]) null);
                                    this.ok = new Command("确定", 3, 0);
                                    this.back = new Command("返回", 1, 5);
                                    this.aD.addCommand(this.ok);
                                    this.aD.addCommand(this.back);
                                    this.aD.append(this.bX);
                                } else {
                                    this.bS = new StringItem((String) null, "您的好友名单为空，请直接输入收件人昵称，或添加为好友后从列表中选择！");
                                    this.back = new Command("返回", 1, 5);
                                    this.aD.addCommand(this.back);
                                    this.aD.append(this.bS);
                                }

                                this.display.setCurrent(this.aD);
                                this.aD.setCommandListener(this);
                            }
                        }
                    }
                } else {
                    String var14;
                    if (!(var14 = var1.getLabel()).equals("确定")) {
                        if (var14.equals("返回")) {
                            this.aD = null;
                            this.liaoTian = null;
                            this.mainMidlet.start();
                            this.inputAction = 0;
                            this.keyCombination = 0;
                        }

                        return;
                    }

                    if (this.liaoTian.getString() != "" && !this.liaoTian.getString().substring(0, 1).equals("-")) {
                        gameSceneController.o();
                        gameSceneController.ak.append(this.liaoTian.getString());
                        this.mainMidlet.start();
                        this.inputAction = 0;
                        this.keyCombination = 0;
                    } else {
                        this.showTips("输入有误,请重新输入");
                    }
                }
            } else {
                if (!var1.getLabel().equals("登陆")) {
                    this.startMainPage();
                    this.mainMidlet.start();
                    return;
                }

                byte var3 = (byte) this.bc.getSelectedIndex();
                boolean zIsSelected = this.bd.isSelected(0);
                String var5 = this.bN.getString().trim();
                String var8 = this.bO.getString().trim();
                if (zIsSelected) {
                    byte var10001 = (byte) (var51.equals("登录当乐通行证") ? 0 : 1);
                    String var9 = var8;
                    String var7 = var5;
                    byte var6 = var3;
                    MainCanvas var13 = this;
                    ByteArrayOutputStream var10 = new ByteArrayOutputStream();
                    DataOutputStream var11 = new DataOutputStream(var10);

                    try {
                        var11.writeBoolean(var10001 == 0);
                        var11.writeByte(var6);
                        var11.writeBoolean(true);
                        var11.writeUTF(var7 == null ? "" : var7);
                        var11.writeUTF(var9 == null ? "" : var9);
                        var13.saveToStore(var10.toByteArray(), "dcn_user_info.db");
                        var10.close();
                        var11.close();
                    } catch (IOException var12) {
                        ((Throwable) var12).printStackTrace();
                    }
                }

                if (var51.equals("登录当乐通行证")) {
                    GlobalConfig.logined = true;
                    LoginController.clearLoginForm();
                    String var98 = var3 == 0 ? var5 : "";
                    String var90 = var3 == 1 ? var5 : "";
                    String var80 = var98;
                    byte[] var97 = NetPayloadBuilder.a((short) 5392, (byte) 1, ChongZhiModel.CpId, ChongZhiModel.GameId, var80, var90, var8, GlobalConfig.PopularizeChannel, GlobalConfig.model, (int) Runtime.getRuntime().totalMemory(), GlobalConfig.shuZiBiaoShi);
                    this.init();
                    if (var97 == null) {
                        this.showTips("获取上传指令数据错误!");
                        return;
                    }

                    netUtils.sendPacket(new NetPacket((short) 5392, var97));
                    this.mainMidlet.start();
                    this.showPending("正在登录...");
                } else {
                    GlobalConfig.logined = false;
                    loginController.sendFirstPacket((byte) (var3 + 1), var5, var8);
                    this.mainMidlet.start();
                    this.showPending("请求中...");
                }
            }

        }
    }

    private void exit() {
        this.gameRunning = false;
        netUtils = null;

        this.mainMidlet.destroyApp(true);
        this.mainMidlet.notifyDestroyed();
    }


    public void b(int var1, int var2) {
        var1 -= 8;
        var2 -= 16;
        Vector var3 = new Vector();
        this.ca = gameSceneController.sceneRefreshCoordinator.j / 16 + (gameSceneController.sceneRefreshCoordinator.j % 16 == 0 ? 0 : 1);
        this.cb = gameSceneController.sceneRefreshCoordinator.k / 16 + (gameSceneController.sceneRefreshCoordinator.k % 16 == 0 ? 0 : 1);
        this.cc = var1 / 16 + (var1 % 16 == 0 ? 0 : 1);
        this.cd = var2 / 16 + (var2 % 16 == 0 ? 0 : 1);
        if (this.ca != this.cc || this.cb != this.cd) {
            for (int var4 = 0; var4 < gameSceneController.f.collisionMap.length; ++var4) {
                for (int var5 = 0; var5 < gameSceneController.f.collisionMap[var4].length; ++var5) {
                    if (gameSceneController.f.collisionMap[var4][var5] == 1 && var1 >= var4 * gameSceneController.f.collisionW - 15 && var1 < var4 * gameSceneController.f.collisionW + gameSceneController.f.collisionW - 15 && var2 >= var5 * gameSceneController.f.collisionH - gameSceneController.f.collisionH && var2 < var5 * gameSceneController.f.collisionH) {
                        return;
                    }
                }
            }

            if ((var3 = netUtils.getNetworkPacketProcessors().a(gameSceneController.f, var3, new bs(this.ca, this.cb), new bs(this.cc, this.cd))).isEmpty()) {
                return;
            }

            int var6 = var3.size();
            gameSceneController.sceneRefreshCoordinator.c.removeAllElements();

            for (int var8 = 0; var8 < var6; ++var8) {
                bs var15 = (bs) var3.elementAt(var8);
                bs var16;
                if (var8 < var6 - 1) {
                    var16 = (bs) var3.elementAt(var8 + 1);
                } else {
                    var16 = var15;
                }

                if (var15.a != var16.a) {
                    if (var15.a > var16.a) {
                        for (int var13 = 0; var13 < 4; ++var13) {
                            gameSceneController.sceneRefreshCoordinator.c.addElement(new short[]{(short) ((var15.a << 4) - (var13 << 2)), (short) (var15.b << 4)});
                        }
                    } else {
                        for (int var12 = 0; var12 < 4; ++var12) {
                            gameSceneController.sceneRefreshCoordinator.c.addElement(new short[]{(short) ((var15.a << 4) + (var12 << 2)), (short) (var15.b << 4)});
                        }
                    }
                } else if (var15.b != var16.b) {
                    if (var15.b > var16.b) {
                        for (int var11 = 0; var11 < 4; ++var11) {
                            gameSceneController.sceneRefreshCoordinator.c.addElement(new short[]{(short) (var15.a << 4), (short) ((var15.b << 4) - (var11 << 2))});
                        }
                    } else {
                        for (int var10 = 0; var10 < 4; ++var10) {
                            gameSceneController.sceneRefreshCoordinator.c.addElement(new short[]{(short) (var15.a << 4), (short) ((var15.b << 4) + (var10 << 2))});
                        }
                    }
                }
            }
        }

    }

    private void a(short var1) {
        ByteArrayOutputStream var2 = new ByteArrayOutputStream();
        DataOutputStream var3 = new DataOutputStream(var2);

        try {
            var3.writeShort(var1);
            this.saveToStore(var2.toByteArray(), "S");
            var2.close();
            var3.close();
        } catch (IOException var4) {
        } catch (Exception var5) {
        }
    }

    private void K() {
        RecordStore var1 = null;

        try {
            DataInputStream var2;
            if (containStore("S") && (var2 = getRecord1(var1 = openRecordStore("S", false))) != null) {
                this.ce = 0;
                this.ce = var2.readShort();
                var2.close();
            }

            return;
        } catch (Exception var13) {
        } finally {
            if (var1 != null) {
                try {
                    var1.closeRecordStore();
                } catch (RecordStoreNotOpenException var11) {
                } catch (RecordStoreException var12) {
                }
            }

        }

    }

    public void p() {
        this.aD = new Form("发布求爱宣言");
        this.liaoTian = new TextField("求爱宣言保留48小时，请输入求爱人昵称：", (String) null, 5, 0);
        this.youjian = new TextField("请输入求爱宣言，不超过100字：", (String) null, 100, 0);
        this.bM = new TextField("银两不可低于10万两，银两越多排位越靠前，请输入银两：", (String) null, 9, 2);
        this.back = new Command("返回", 8, 1);
        this.ok = new Command("确定", 2, 1);
        this.aD.addCommand(this.ok);
        this.aD.addCommand(this.back);
        this.aD.append(this.liaoTian);
        this.aD.append(this.youjian);
        this.aD.append(this.bM);
        this.aD.setCommandListener(this);
        this.display.setCurrent(this.aD);
    }

    public void q() {
        LoadingPage.h = 0;
        this.lastPageStatus = this.pageStatus = 20;
    }

    public static Image d(int var0) {
        return var0 > 0 && var0 < 8 ? chq[var0 - 1] : null;
    }

    private static Image createImage(String path) {
        try {
            return Image.createImage(path);
        } catch (IOException var1) {
            var1.printStackTrace();
            return null;
        }
    }

    public void startGame() {
        LoadingPage.loadProgressPercentage = 100;
        this.doRepaint();
        this.mainMidlet.start();
    }

    static ChoiceGroup a(MainCanvas var0) {
        return var0.bb;
    }

    static ChoiceGroup a(MainCanvas var0, ChoiceGroup var1) {
        return var0.bc = var1;
    }

    static ChoiceGroup a(MainCanvas var0, int var1) {
        return e(var1);
    }

    static ChoiceGroup b(MainCanvas var0) {
        return var0.bc;
    }

    /**
     * 游戏资源加载主体（由 b_3 后台线程调用，与主线程的加载进度渲染并发执行）。
     * <p>
     * 加载内容：
     * 1. ui、publicUI      — 通用 UI 图集（金币、道具、聊天、按钮、方向键等公共帧）
     * 2. ab(role)          — 角色图集
     * 3. ah(petfight)      — 宠物战斗图集
     * 4. af(icon)          — 图标图集
     * 5. 初始化各 UI 组件  — MixedUi、GunDongListUi、TopUi 等
     * 6. loginController.init() — 初始化登录控制器
     * 7. c()               — 跳转到登录/账号选择页（设置 touchPageCase）
     */
    static void loadResource(MainCanvas mainCanvas) {
        ui = new ResourceManager("/", "ui");
        ui.loadResource();

        publicUI = new ResourceManager("/", "publicUI");
        publicUI.loadResource();

        if (publicUI.getFrameSize() != 0) {
            GameSceneController.money = publicUI.getSpriteByNameFromCache("money");
            GameSceneController.goods = publicUI.getSpriteByNameFromCache("goods");
            GameSceneController.chat = publicUI.getSpriteByNameFromCache("chat");
            GameSceneController.elite = publicUI.getSpriteByNameFromCache("elite");
            num = publicUI.getSpriteByNameFromCache("num");
//            publicUI.getFrame1("email");
            Sprite mail_2 = publicUI.getSpriteByNameFromCache("mail_2");
            ImageSlice[] var1 = mail_2.slices;

            for (int var3 = 1; var3 < var1.length; ++var3) {
                Image var4 = Image.createImage(mail_2.image, var1[var3].x, var1[var3].y, var1[var3].w, var1[var3].h, 0);
                if ((var3 & 1) == 0) {
                    be_1.e[var3 >> 2] = var4;
                } else {
                    bo_1.g[var3 >> 1] = var4;
                }
            }

            talk_01 = publicUI.getSpriteByNameFromCache("talk_01").image;
            close = publicUI.getSpriteByNameFromCache("close");
            title = publicUI.getSpriteByNameFromCache("title");
            button1 = publicUI.getSpriteByNameFromCache("button1");
            lu = publicUI.getSpriteByNameFromCache("lu");
            ld = publicUI.getSpriteByNameFromCache("ld");
            rd = publicUI.getSpriteByNameFromCache("rd");
            rd0 = publicUI.getSpriteByNameFromCache("rd0");
            ru0 = publicUI.getSpriteByNameFromCache("ru0");
            lu0 = publicUI.getSpriteByNameFromCache("lu0");
            ld0 = publicUI.getSpriteByNameFromCache("ld0");
            up = publicUI.getSpriteByNameFromCache("up");
            down = publicUI.getSpriteByNameFromCache("down");
            go_left = publicUI.getAnimationByNameFromCache("go-left");
            go_right = publicUI.getAnimationByNameFromCache("go-right");
            PopUpWindow.backImage = title;
            PopUpWindow.closeButton = close;
            PopUpWindow.zhuangShi1 = lu;
            PopUpWindow.zhuangShi2 = ld0;
            PopUpWindow.zhuangShi3 = rd0;
            tradetitle = publicUI.getSpriteByNameFromCache("tradetitle");
            tradebottom = publicUI.getSpriteByNameFromCache("tradebottom");
            moneybutton = publicUI.getSpriteByNameFromCache("moneybutton");
            tradelock01 = publicUI.getSpriteByNameFromCache("tradelock01");
            tradelock_02 = publicUI.getSpriteByNameFromCache("tradelock_02");
            tradelock_03 = publicUI.getSpriteByNameFromCache("tradelock_03");
            plus = publicUI.getSpriteByNameFromCache("plus");
            subtraction = publicUI.getSpriteByNameFromCache("subtraction");
            equip = publicUI.getSpriteByNameFromCache("equip");
            nextpage = publicUI.getSpriteByNameFromCache("nextpage");
            backpage = publicUI.getSpriteByNameFromCache("backpage");

            equipSolt = new Sprite[8];
            for (int i = 0; i < equipSolt.length; ++i) {
                equipSolt[i] = publicUI.getSpriteByNameFromCache("equip_" + i);
            }

            submenu = new Sprite[4];
            for (int var21 = 0; var21 < submenu.length; ++var21) {
                submenu[var21] = publicUI.getSpriteByNameFromCache("submenu_" + var21);
            }

            button_ok = publicUI.getSpriteByNameFromCache("button_ok");
            button_back = publicUI.getSpriteByNameFromCache("button_back");
            trigon_u = publicUI.getSpriteByNameFromCache("trigon_u");
            trigon_d = publicUI.getSpriteByNameFromCache("trigon_d");
            trigon_l = publicUI.getSpriteByNameFromCache("trigon_l");
            trigon_r = publicUI.getSpriteByNameFromCache("trigon_r");
            GameSceneController.select = publicUI.getAnimationByNameFromCache("select");
            rim = publicUI.getSpriteByNameFromCache("rim");
//            publicUI.getFrame("cursor");
//            publicUI.getFrame("scorebar");

            chq = new Image[7];
            for (int var22 = 0; var22 < chq.length; ++var22) {
                chq[var22] = publicUI.getSpriteByNameFromCache("chq-" + (var22 + 1)).image;
            }

            moZhuan1 = createImage("/images/mz_1.png");
        }

        role = new ResourceManager("/role/", "role");
        petfight = new ResourceManager("/petfight/", "petfight");
        icon = new ResourceManager("/icon/", "icon");

        mainCanvas.mixedUi = new MixedUi();
        mainCanvas.popUpWindow = PopUpWindow.getInst();
        mainCanvas.gunDongListUi = new GunDongListUi();
        mainCanvas.bottomUi = new BottomUi();
        mainCanvas.topUi = new TopUi();
        mainCanvas.textPanel = new TextPanel();
        pngUtil = new PngUtil();
        if (GlobalConfig.supportTouch) {
            mainCanvas.touchController = new TouchController(mainCanvas, pngUtil);
        }
        loginController.init();
        mainCanvas.startMainPage();
    }
}

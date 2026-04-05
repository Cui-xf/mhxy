package com.cc;

public class PageStatus {
    /**
     * 当前页面状态，驱动 run() 逻辑分发和 paint() 渲染分发。
     * 0=资源加载  1=等待响应  2=错误弹窗  3=登录  4=选服  5=角色列表
     * 6=创建角色  7=游戏主场景  9=Logo动画  14=账号选择  15~17=退出/推广  20=更新提示
     */

    public static final short RESOURCE_LOADING = 0;

    public static final short WAITING_RESPONSE = 1;

    public static final short ERROR_POPUP = 2;

    public static final short LOGIN = 3;

    public static final short SERVER_SELECT = 4;

    public static final short CHARACTER_LIST = 5;

    public static final short CREATE_CHARACTER = 6;

    public static final short GAME_SCENE = 7;

    public static final short LOGO_LOADING = 9;

    // lastPageStatus 中出现，具体含义待确认
    public static final short UNKNOWN_10 = 10;

    //14=游戏主页
    public static final short MAIN_PAGE = 14;

    public static final short MORE_GAMES_PROMO = 15;

    public static final short EXIT_CONFIRM = 16;

    public static final short CHANNEL_PROMO = 17;

    public static final short DIALOG_A = 18;

    public static final short DIALOG_B = 19;

    public static final short VERSION_UPDATE = 20;
}

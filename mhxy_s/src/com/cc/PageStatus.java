package com.cc;

public class PageStatus {
    /**
     * 当前页面状态，驱动 run() 逻辑分发和 paint() 渲染分发。
     * 0=资源加载  1=等待响应  2=错误弹窗  3=登录  4=选服  5=角色列表
     * 6=创建角色  7=游戏主场景  9=Logo动画  14=账号选择  15~17=退出/推广  20=更新提示
     */

    public static final short LOGO_LOADING = 9;

    public static final short RESOURCE_LOADING = 0;

    //14=游戏主页
    public static final short MAIN_PAGE = 14;
}

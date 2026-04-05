package com.yinhan.kjava.main;

import com.cc.LoginUiController;
import com.cc.NetPacket;
import com.cc.NetPayloadBuilder;

import javax.microedition.lcdui.Display;

/**
 * 登录控制器（门面类）。
 * 作为登录流程的统一入口，协调登录 UI（com.cc.h / LoginModel）与网络层
 * （NetPayloadBuilder / MainCanvas.netUtils）之间的交互。
 * 所有登录相关的界面跳转、握手包发送、账号登录请求均通过此类发起。
 */
public final class LoginController {
    /**
     * MIDlet 应用程序引用，用于调用 start() 和访问 mainCanvas
     */
    private MainMidlet mainMidlet;
    /**
     * MIDP 显示对象，传递给登录 UI 控制器使用
     */
    private Display display;
    /**
     * 登录 UI 控制器（com.cc.h），持有 LoginModel 并管理登录界面的显示状态
     */
    private static LoginUiController loginUiController;

    public LoginController(MainMidlet var1, Display var2) {
        this.mainMidlet = var1;
        this.display = var2;
    }

    /**
     * 初始化登录 UI 控制器（com.cc.h），在进入登录流程前调用。
     */
    public void init() {
        loginUiController = new LoginUiController(this.mainMidlet, this.display);
    }

    /**
     * 发送账号登录握手包（opcode=6400）。
     * 将服务器编号、账号、密码拼接为 "serverNo:account:password" 格式后构建网络包。
     * 若网络连接尚未建立或握手参数有变，则重新初始化 netUtils 再发送。
     *
     * @param var1 服务器编号
     * @param var2 账号
     * @param var3 密码
     */
    public void sendFirstPacket(byte var1, String var2, String var3) {
        StringBuffer var4 = new StringBuffer();
        var4.append(var1);
        var4.append(':');
        var4.append(var2);
        var4.append(':');
        var4.append(var3);
        NetPacket var5 = NetPayloadBuilder.buildLogin((byte) 1, (byte) 1, var4.toString());
        if (MainCanvas.netUtils == null || NetPayloadBuilder.hands2 != 72) {
            NetPayloadBuilder.hands2 = 72;
            this.mainMidlet.mainCanvas.init();
        }

        if (MainCanvas.netUtils != null) {
            var5.firstPacket = true;
            MainCanvas.netUtils.sendPacket(var5);
        }

    }

    /**
     * 通知 LoginModel 收到登录响应，触发登录结果处理（成功/失败后续流程）。
     */
    public static void clearLoginForm() {
        loginUiController.loginModel.clearLoginForm();
    }

    /**
     * 显示登录界面（将 LoginModel 的登录表单展示到屏幕上）。
     */
    public static void showLoginForm() {
        loginUiController.showLoginForm();
    }

    /**
     * 显示登录主界面（LoginModel 的初始界面）。
     */
    public static void showChangePwd() {
        loginUiController.showChangePwd();
    }

}

package com.cc;

import com.yinhan.kjava.main.MainCanvas;
import com.yinhan.kjava.main.MainMidlet;

import javax.microedition.lcdui.Display;

public final class LoginUiController {
    public MainMidlet mainMidlet;
    private Display display;
    public LoginModel loginModel;

    public LoginUiController(MainMidlet midlet, Display display) {
        String CpId = "1";
        String GameId = "1";
        ChongZhiModel.CpId = ZhangHaoUtils.toInt(CpId.trim());
        ChongZhiModel.GameId = ZhangHaoUtils.toInt(GameId.trim());
        ChongZhiModel.readZhangHao();
        this.mainMidlet = midlet;
        this.display = display;
        this.loginModel = new LoginModel(this);
        this.loginModel.startGame();
    }

    public Display getDisplay() {
        return this.display;
    }

    public void sendFirstPacket(NetPacket packet) {
        if (MainCanvas.netUtils == null || NetPayloadBuilder.hands2 != 72) {
            NetPayloadBuilder.hands2 = 72;
            this.mainMidlet.mainCanvas.init();
        }

        if (MainCanvas.netUtils != null) {
            packet.firstPacket = true;
            MainCanvas.netUtils.sendPacket(packet);
        }

    }

    public void startGame() {
        if (this.mainMidlet != null) {
            this.mainMidlet.mainCanvas.startGame();
        }
    }

    public void destroy() {
        this.loginModel = null;
        this.mainMidlet.notifyDestroyed();
    }

    public void showChangePwd() {
        this.loginModel.showChangePwd(this.display);
    }

    public void showLoginForm() {
        this.loginModel.showLoginForm(this.display, MainCanvas.zhanghao, MainCanvas.pwd, 0);
    }
}

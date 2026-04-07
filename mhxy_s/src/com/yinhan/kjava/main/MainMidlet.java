package com.yinhan.kjava.main;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

/**
 * J2ME 程序入口（MIDlet）。构造时创建 {@link MainCanvas}，{@link #startApp()} 将画布设为当前界面。
 * English: MIDlet entry; owns MainCanvas and Display.
 */
public class MainMidlet extends MIDlet {
    public MainCanvas mainCanvas;
    public Display display = Display.getDisplay(this);
    /**
     * 启动时 JVM 堆总量快照（调试用） | English: totalMemoryAtStartup
     */
    public static long totalMemoryAtStartup = Runtime.getRuntime().totalMemory();

    public MainMidlet() {
        this.mainCanvas = new MainCanvas(this, this.display);
        DebugUtil.SavePacket = this.getAppProperty("SavePacket");
        DebugUtil.Server = this.getAppProperty("Server");
    }

    public void destroyApp(boolean var1) {
    }

    public void pauseApp() {
    }

    public void startApp() {
        this.start();
    }

    public final void start() {
        if (this.mainCanvas != null) {
            this.mainCanvas.setFullScreenMode(true);
        }

        this.display.setCurrent(this.mainCanvas);
    }
}

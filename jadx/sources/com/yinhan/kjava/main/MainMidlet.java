package com.yinhan.kjava.main;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

/* loaded from: java版梦回西游3区251011.jar:com/yinhan/kjava/main/MainMidlet.class */
public class MainMidlet extends MIDlet {
    public static long c = Runtime.getRuntime().totalMemory();
    public Display b = Display.getDisplay(this);
    public a a = new a(this, this.b);

    public void destroyApp(boolean z) {
    }

    public void pauseApp() {
    }

    public void startApp() {
        a();
    }

    public final void a() {
        if (this.a != null) {
            this.a.setFullScreenMode(true);
        }
        this.b.setCurrent(this.a);
    }
}

package com.yinhan.kjava.main;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public class MainMidlet extends MIDlet {
    public static long c = Runtime.getRuntime().totalMemory();
    public Display b = Display.getDisplay(this);
    public a a = new a(this, this.b);

    public final void a() {
        if (this.a != null) {
            this.a.setFullScreenMode(true);
        }
        this.b.setCurrent(this.a);
    }

    public void destroyApp(boolean z) {
    }

    public void pauseApp() {
    }

    public void startApp() {
        a();
    }
}

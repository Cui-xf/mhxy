package com.yinhan.kjava.main;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public class MainMidlet extends MIDlet {

    /* renamed from: c */
    public static long f2059c = Runtime.getRuntime().totalMemory();

    /* renamed from: b */
    public Display f2061b = Display.getDisplay(this);

    /* renamed from: a */
    public RunnableC0066a f2060a = new RunnableC0066a(this, this.f2061b);

    /* renamed from: a */
    public final void m1377a() {
        if (this.f2060a != null) {
            this.f2060a.setFullScreenMode(true);
        }
        this.f2061b.setCurrent(this.f2060a);
    }

    public void destroyApp(boolean z) {
    }

    public void pauseApp() {
    }

    public void startApp() {
        m1377a();
    }
}

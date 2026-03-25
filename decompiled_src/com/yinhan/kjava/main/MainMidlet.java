/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.midlet.MIDlet
 */
package com.yinhan.kjava.main;

import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public class MainMidlet
extends MIDlet {
    public a a;
    public Display b = Display.getDisplay((MIDlet)this);
    public static long c = Runtime.getRuntime().totalMemory();

    public MainMidlet() {
        this.a = new a(this, this.b);
    }

    public void destroyApp(boolean bl2) {
    }

    public void pauseApp() {
    }

    public void startApp() {
        this.a();
    }

    public final void a() {
        if (this.a != null) {
            this.a.setFullScreenMode(true);
        }
        this.b.setCurrent((Displayable)this.a);
    }
}


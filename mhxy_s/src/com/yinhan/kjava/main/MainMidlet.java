package com.yinhan.kjava.main;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class MainMidlet extends MIDlet {
   public MainCanvas a;
   public Display b = Display.getDisplay(this);
   public static long c = Runtime.getRuntime().totalMemory();

   public MainMidlet() {
      this.a = new MainCanvas(this, this.b);
   }

   public void destroyApp(boolean var1) {
   }

   public void pauseApp() {
   }

   public void startApp() {
      this.start();
   }

   public final void start() {
      if (this.a != null) {
         this.a.setFullScreenMode(true);
      }

      this.b.setCurrent(this.a);
   }
}

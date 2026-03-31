package com.yinhan.kjava.main;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class MainMidlet extends MIDlet {
   public MainCanvas mainCanvas;
   public Display display = Display.getDisplay(this);
   public static long c = Runtime.getRuntime().totalMemory();

   public MainMidlet() {
      this.mainCanvas = new MainCanvas(this, this.display);
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

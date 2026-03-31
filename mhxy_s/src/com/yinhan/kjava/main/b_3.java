package com.yinhan.kjava.main;

final class b_3 implements Runnable {
   private byte a;
   private final MainCanvas mainCanvas;

   public b_3(MainCanvas mainCanvas, byte var2) {
      this.mainCanvas = mainCanvas;
      this.a = var2;
      (new Thread(this)).start();
   }

   public final void run() {
      if (this.a != MainCanvas.aB) {
         MainCanvas.c(this.mainCanvas);
      } else {
         while(this.mainCanvas.j == 1 || this.mainCanvas.p) {
            try {
               this.mainCanvas.b();
               Thread.sleep(30L);
            } catch (Exception var2) {
               ((Throwable)var2).printStackTrace();
            }
         }
      }

   }
}

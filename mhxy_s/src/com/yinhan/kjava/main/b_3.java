package com.yinhan.kjava.main;

final class b_3 implements Runnable {
   private byte a;
   private final a_MainCanvas b;

   public b_3(a_MainCanvas var1, byte var2) {
      this.b = var1;
      this.a = var2;
      (new Thread(this)).start();
   }

   public final void run() {
      if (this.a != a_MainCanvas.aB) {
         a_MainCanvas.c(this.b);
      } else {
         while(this.b.j == 1 || this.b.p) {
            try {
               this.b.b();
               Thread.sleep(30L);
            } catch (Exception var2) {
               ((Throwable)var2).printStackTrace();
            }
         }
      }

   }
}

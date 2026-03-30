package com.cc;

final class x implements Runnable {
   private boolean a;
   private final av_1 b;

   public x(av_1 var1) {
      this.b = var1;
      this.a = true;
      (new Thread(this)).start();
   }

   public final void a() {
      this.a = false;
   }

   public final void run() {
      for(; this.a; av_1.a(15)) {
         if (this.b.g != null) {
            this.b.g.b();
         }
      }

   }
}

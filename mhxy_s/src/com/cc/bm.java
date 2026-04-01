package com.cc;

import javax.microedition.lcdui.Font;

public final class bm extends al {
   private String a;
   private String b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k = 268435200;
   private int l = 268435200;
   private Font m;
   private Font n;

   public bm() {
      this.m = GlobalConfig.i;
      this.n = GlobalConfig.i;
   }

   public final void b(int var1) {
   }

   public final int b(int var1, int var2) {
      boolean var10000;
      if (var1 >= this.c && var1 <= this.c + this.e && var2 >= this.d && var2 <= this.d + this.f) {
         this.k = 16711680;
         this.m = GlobalConfig.h;
         var10000 = true;
      } else {
         this.m = GlobalConfig.i;
         this.k = 16776960;
         var10000 = false;
      }

      if (var10000) {
         return 268435456;
      } else {
         if (var1 >= this.g && var1 <= this.g + this.i && var2 >= this.h && var2 <= this.h + this.j) {
            this.l = 16711680;
            this.n = GlobalConfig.h;
            var10000 = true;
         } else {
            this.n = GlobalConfig.i;
            this.l = 16776960;
            var10000 = false;
         }

         return var10000 ? 536870912 : 0;
      }
   }

   public final void j() {
      this.a = null;
      this.b = null;
      this.m = null;
      this.n = null;
   }
}

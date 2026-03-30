package com.cc;

import com.yinhan.kjava.main.a_MainCanvas;

import javax.microedition.lcdui.Graphics;

public final class cj {
   public bc_1 a;
   public int[] b;
   public int[] c;

   public cj(int var1, int var2) {
      this.b = new int[var2];
      this.c = new int[var2];
      this.a = a_MainCanvas.ad.b(String.valueOf(var1));
      if (this.a == null || this.a.k == null || this.a.k[0] == null || this.a.k[0][0] == null || this.a.k[0][0].a == null) {
         this.a = a_MainCanvas.ad.b(String.valueOf(10));
      }

   }

   public final void a(int var1, int var2, int var3) {
      this.b[var1] = var2;
      this.c[var1] = var3;
   }

   public final void a(Graphics var1, ai_1 var2, int var3, int var4) {
      if (this.a != null) {
         for(byte var5 = 0; var5 < this.b.length; ++var5) {
            if (this.b[var5] != 0 && this.c[var5] != 0) {
               var2.a(var1, (bc_1)this.a, (int[])null, 0, 0, this.b[var5], this.c[var5], 20, 0);
            }
         }
      }

   }
}

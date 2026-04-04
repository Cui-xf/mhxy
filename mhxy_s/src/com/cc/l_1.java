package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class l_1 extends al {
   private String a;
   private String[] b = null;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r = 16776917;
   private int s = 16776917;
   private int t = 16776917;
   private boolean u = false;
   private int[][] v = new int[2][4];

   public final int a() {
      return this.d;
   }

   public static int b() {
      return MainCanvas.E != null ? MainCanvas.E.c : GlobalConfig.font2_h;
   }

   public final void a(String var1) {
      this.a = var1;
      this.b = null;
      this.u = false;
   }

   public final void a(String[] var1) {
      this.b = var1;
      this.a = null;
      this.u = false;
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.c = var1;
      this.d = var2 + var4 - MainCanvas.E.c;
      this.e = var3;
      if (this.a != null) {
         this.b(var1 + (var3 - GlobalConfig.font2.stringWidth(this.a)) / 2, this.d, GlobalConfig.font2.stringWidth(this.a), MainCanvas.E.c);
      } else if (this.b != null && this.b.length == 2) {
         this.b(var1 + 10, this.d, GlobalConfig.font2.stringWidth(this.b[0]), MainCanvas.E.c);
         this.c(var1 + var3 - 10 - GlobalConfig.font2.stringWidth(this.b[1]), this.d, GlobalConfig.font2.stringWidth(this.b[1]), MainCanvas.E.c);
      } else {
         if (this.b != null && this.b.length == 3) {
            this.b(var1 + 10, this.d, GlobalConfig.font2.stringWidth(this.b[0]), MainCanvas.E.c);
            int var10001 = (var1 + var3 - 10 - GlobalConfig.font2.stringWidth(this.b[1])) / 2;
            int var10002 = this.d;
            int var10003 = GlobalConfig.font2.stringWidth(this.b[1]);
            short var7 = MainCanvas.E.c;
            int var6 = var10003;
            int var5 = var10002;
            var4 = var10001;
            this.n = var4;
            this.o = var5;
            this.p = var6;
            this.q = var7;
            this.c(var1 + var3 - 10 - GlobalConfig.font2.stringWidth(this.b[2]), this.d, GlobalConfig.font2.stringWidth(this.b[2]), MainCanvas.E.c);
         }

      }
   }

   private void b(int var1, int var2, int var3, int var4) {
      this.f = var1;
      this.g = var2;
      this.h = var3;
      this.i = var4;
   }

   private void c(int var1, int var2, int var3, int var4) {
      this.j = var1;
      this.k = var2;
      this.l = var3;
      this.m = var4;
   }

   public final void b(int var1) {
   }

   public final int b(int var1, int var2) {
      byte var10000;
      label76: {
         if (this.a != null) {
            if (var1 >= this.f && var1 <= this.f + this.h && var2 >= this.g && var2 <= this.g + this.i) {
               var10000 = 1;
               break label76;
            }
         } else if (this.b != null) {
            if (var1 >= this.f && var1 <= this.f + this.h && var2 >= this.g && var2 <= this.g + this.i) {
               var10000 = 1;
               break label76;
            }

            if (var1 >= this.n && var1 <= this.n + this.p && var2 >= this.o && var2 <= this.o + this.q) {
               var10000 = 2;
               break label76;
            }

            if (var1 >= this.j && var1 <= this.j + this.l && var2 >= this.k && var2 <= this.k + this.m) {
               var10000 = 3;
               break label76;
            }
         }

         var10000 = 0;
      }

      switch (var10000) {
         case 1:
            return 268435456;
         case 2:
            return 1073741824;
         case 3:
            return 536870912;
         default:
            if (this.u) {
               if (var1 >= this.v[0][0] && var1 <= this.v[0][0] + this.v[0][2] && var2 >= this.v[0][1] && var2 <= this.v[0][1] + this.v[0][3]) {
                  return 1024;
               }

               if (var1 >= this.v[1][0] && var1 <= this.v[1][0] + this.v[1][2] && var2 >= this.v[1][1] && var2 <= this.v[1][1] + this.v[1][3]) {
                  return 2048;
               }
            }

            return 0;
      }
   }

   public final void a(Graphics var1) {
      if (this.a != null || this.b != null) {
         LoadingPage.a(var1, (Image) MainCanvas.E.pngImage, (short) MainCanvas.E.b, this.c, this.d, this.e, MainCanvas.E.c);
         var1.setFont(GlobalConfig.font2);
         if (this.a != null) {
            LoadingPage.drawString(var1, (String)this.a, (int)this.f, this.g + GlobalConfig.getCzjz(MainCanvas.E.c), 20, this.r, 0);
            this.a(var1, this.f - 5 - MainCanvas.Q.b, this.f + 5 + GlobalConfig.font2.stringWidth(this.a), this.g + 4);
         } else {
            if (this.b != null) {
               if (this.b.length == 2) {
                  LoadingPage.drawString(var1, (String)this.b[0], (int)this.f, this.g + GlobalConfig.getCzjz(MainCanvas.E.c), 20, this.r, 0);
                  LoadingPage.drawString(var1, (String)this.b[1], (int)this.j, this.k + GlobalConfig.getCzjz(MainCanvas.E.c), 20, this.s, 0);
               } else if (this.b.length == 3) {
                  LoadingPage.drawString(var1, (String)this.b[0], (int)this.f, this.g + GlobalConfig.getCzjz(MainCanvas.E.c), 20, this.r, 0);
                  LoadingPage.drawString(var1, (String)this.b[1], (int)this.n, this.o + GlobalConfig.getCzjz(MainCanvas.E.c), 20, this.t, 0);
                  LoadingPage.drawString(var1, (String)this.b[2], (int)this.j, this.k + GlobalConfig.getCzjz(MainCanvas.E.c), 20, this.s, 0);
               }

               this.a(var1, this.f + GlobalConfig.font2.stringWidth(this.b[0]) + 10, this.j - 10 - MainCanvas.P.b, this.g + 4);
            }

         }
      }
   }

   private void a(Graphics var1, int var2, int var3, int var4) {
      if (this.u) {
         var1.drawImage(MainCanvas.Q.pngImage, var2, var4, 20);
         var1.drawImage(MainCanvas.P.pngImage, var3, var4, 20);
         this.v[0][0] = var2;
         this.v[0][1] = var4;
         this.v[0][2] = MainCanvas.Q.b;
         this.v[0][3] = MainCanvas.Q.c;
         this.v[1][0] = var3;
         this.v[1][1] = var4;
         this.v[1][2] = MainCanvas.P.b;
         this.v[1][3] = MainCanvas.P.c;
      }

   }

   public final void j() {
      if (this.a != null) {
         this.a = null;
      }

      if (this.b != null) {
         this.b = null;
      }

   }

   public final void a(boolean var1) {
      this.u = true;
   }
}

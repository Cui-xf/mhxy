package com.cc;

import javax.microedition.lcdui.Graphics;

// 顶部页签条：负责页签切换、横向滚动以及页签点击命中检测。
public final class TopUi extends BaseUi {
   // 所有页签标题。
   private String[] c;
   // 当前选中的页签下标。
   public byte a = 0;
   // 当前可见页签窗口的起始下标。
   private byte d = 0;
   private int e;
   private int f;
   private int g;
   public int b;
   private int h;
   private boolean i = false;
   // 每个页签的触摸命中区域。
   private int[][] j;
   // 当前可见的页签数量。
   private int k = 0;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t = 2152398;
   private int u = 2152398;
   private int v = 16449445;
   // 输入映射模式：0 使用 8/2，1 使用 1024/2048 这组左右切换指令。
   private byte w;

   // 设置页签标题，并重建点击区域缓存。
   public final void a(String[] var1) {
      this.c = var1;
      byte var2 = 0;
      this.w = var2;
      this.a = 0;
      this.d = 0;
      if (this.c != null) {
         this.j = new int[this.c.length][4];
      } else {
         this.j = null;
      }
   }

   // 设置页签条的显示区域，并计算是否需要横向滚动。
   public final void a(int var1, int var2, int var3, int var4) {
      this.e = var1;
      this.f = var2;
      this.g = var3;
      this.b = var4;
      this.h = 0;

      for(int var5 = 0; var5 < this.c.length; ++var5) {
         this.h += 10 + GlobalConfig.font2.stringWidth(this.c[var5]);
      }

      this.i = this.h > this.g - 22;
   }

   // 计算从当前可见起点到当前选中项所占的总宽度，用于滚动窗口修正。
   private int a() {
      int var1 = 0;

      for(byte var2 = this.d; var2 <= this.a; ++var2) {
         var1 += 10 + GlobalConfig.font2.stringWidth(this.c[var2]);
      }

      return var1;
   }

   // 处理左右切换指令，维护当前页签和可见窗口范围。
   public final void onClick(int var1) {
      if ((this.w != 0 || var1 != 8 && var1 != 516) && (this.w != 1 || var1 != 1024)) {
         if (this.w == 0 && (var1 == 2 || var1 == 518) || this.w == 1 && var1 == 2048) {
            this.a = this.a >= this.c.length - 1 ? 0 : ++this.a;
            if (this.d < this.a && this.a() > this.g - 22 && this.i) {
               ++this.d;
            }

            while(this.i && this.d > this.a) {
               --this.d;
            }
         }
      } else {
         for(this.a = (byte)(this.a <= 0 ? this.c.length - 1 : --this.a); this.i && this.d > this.a; --this.d) {
         }

         if (this.d < this.a && this.a() > this.g - 22 && this.i) {
            ++this.d;
         }
      }

      while(this.d > 0 && this.a() < this.g - 22 && this.i) {
         --this.d;
      }

      while(this.d < this.a && this.a() > this.g - 22 && this.i) {
         ++this.d;
      }

      if (!this.i && this.d != 0) {
         this.d = 0;
      }

   }

   // 处理页签点击以及左右滚动箭头点击。
   public final int hintCheck(int var1, int var2) {
      boolean var10000;
      label86: {
         int var5 = var2;
         int var4 = var1;
         TopUi var3 = this;
         if (this.j != null) {
            for(int var6 = 0; var6 < var3.j.length; ++var6) {
               if (var4 >= var3.j[var6][0] && var4 <= var3.j[var6][0] + var3.j[var6][2] && var5 >= var3.j[var6][1] && var5 <= var3.j[var6][1] + var3.j[var6][3]) {
                  if (var6 + 1 >= var3.j.length) {
                     var3.a = 0;
                  } else {
                     var3.a = (byte)(var6 + 1);
                  }

                  var10000 = true;
                  break label86;
               }
            }
         }

         var10000 = false;
      }

      if (var10000) {
         return this.w == 0 ? 8 : 1024;
      } else if (this.i && var1 >= this.l && var1 <= this.l + this.n && var2 >= this.m && var2 <= this.m + this.o) {
         return this.w == 0 ? 8 : 1024;
      } else if (this.i && var1 >= this.p && var1 <= this.p + this.r && var2 >= this.q && var2 <= this.q + this.s) {
         return this.w == 0 ? 2 : 2048;
      } else {
         return 0;
      }
   }

   // 绘制页签按钮，并在超宽时绘制左右滚动箭头。
   public final void a(Graphics var1) {
      int var2 = 0;
      int var3 = 10 + GlobalConfig.font2.stringWidth(this.c[this.d]);
      this.k = 0;

      for(int var4 = this.d; var4 < this.c.length && var3 <= this.g - 22; ++var4) {
         int var5 = 10 + GlobalConfig.font2.stringWidth(this.c[var4]);
         ++this.k;
         if (var4 == this.a) {
            LoadingPage.draw(var1, this.e + var2, this.f, var5 - 1, this.b, 1);
            LoadingPage.j[0] = this.e + var2 + 3;
            LoadingPage.j[1] = this.f + this.b - 3;
            LoadingPage.j[2] = var5 - 6;
         } else {
            LoadingPage.draw(var1, this.e + var2, this.f, var5 - 1, this.b, 2);
         }

         LoadingPage.drawString(var1, this.c[var4], this.e + var2 + (var5 - 1) / 2, this.f + GlobalConfig.getCzjz(this.b), 17, var4 == this.a ? this.v : 5426130);
         var2 += var5;
         var3 += var4 < this.c.length - 1 ? 10 + GlobalConfig.font2.stringWidth(this.c[var4 + 1]) : 0;
      }

      int var10003 = this.e + 1;
      int var7 = this.f + 2;
      int var6 = var10003;
      int var15 = this.d;
      String[] var12 = this.c;
      TopUi var11 = this;
      int var8 = 0;

      for(int var9 = 0; var9 < var12.length; ++var9) {
         if (var9 >= var15 && var9 < var15 + var11.k) {
            int var10 = 10 + GlobalConfig.font2.stringWidth(var11.c[var9]);
            var11.j[var9][0] = var6 + var8;
            var11.j[var9][1] = var7;
            var11.j[var9][2] = var10 - 2;
            var11.j[var9][3] = GlobalConfig.font2_h - 2;
            var8 += 10 + GlobalConfig.font2.stringWidth(var11.c[var9]);
         } else {
            var11.j[var9][0] = -1;
            var11.j[var9][1] = -1;
            var11.j[var9][2] = -1;
            var11.j[var9][3] = -1;
         }
      }

      if (this.i) {
         var1.setColor(4562087);
         var1.fillRect(this.e + var2 + 1, this.f + 2, 19, GlobalConfig.font2_h - 2);
         var1.setColor(26540);
         var1.drawRect(this.e + var2, this.f + 1, 19, GlobalConfig.font2_h - 2);
         int var10001 = this.e + var2 + 1;
         int var10002 = this.f + 1;
         var7 = GlobalConfig.font2_h - 2;
         var6 = 9;
         var15 = var10002;
         int var13 = var10001;
         this.l = var13;
         this.m = var15;
         this.n = 9;
         this.o = var7;
         var10001 = this.e + var2 + 11;
         var10002 = this.f + 1;
         var7 = GlobalConfig.font2_h - 2;
         var6 = 9;
         var15 = var10002;
         var13 = var10001;
         this.p = var13;
         this.q = var15;
         this.r = 9;
         this.s = var7;
         LoadingPage.b(var1, this.a == 0 ? 2780801 : this.t, this.e + var2 + 3, this.f + GlobalConfig.font2_h / 2, 6, 1);
         LoadingPage.b(var1, this.a == this.c.length - 1 ? 2780801 : this.u, this.e + var2 + 16, this.f + GlobalConfig.font2_h / 2, -6, 1);
      }

   }

   public final void clear() {
      if (this.c != null) {
         for(byte var1 = 0; var1 < this.c.length; ++var1) {
            this.c[var1] = null;
         }

         this.c = null;
      }

      this.j = null;
   }

   // 切换输入映射模式。
   public final void a(byte var1) {
      this.w = var1;
   }
}

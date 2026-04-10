package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// 底部操作栏：支持单按钮、双按钮或三按钮布局，并处理左右翻页箭头点击。
//public final class   l_1 extends BaseUi {
public final class BottomUi extends BaseUi {
   // 单按钮模式下的文案。
   private String a;
   // 多按钮模式下的文案数组，长度通常为 2 或 3。
   private String[] buttonText = null;
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
   // 是否显示操作栏两侧的小箭头。
   private boolean u = false;
   // 左右箭头的触摸命中区域。
   private int[][] v = new int[2][4];

   public final int a() {
      return this.d;
   }

   public static int b() {
      return MainCanvas.button1 != null ? MainCanvas.button1.h : GlobalConfig.font2_h;
   }

   // 设置单按钮模式的文案。
   public final void a(String var1) {
      this.a = var1;
      this.buttonText = null;
      this.u = false;
   }

   // 设置多按钮模式的文案。
   public final void setButtonText(String[] var1) {
      this.buttonText = var1;
      this.a = null;
      this.u = false;
   }

   // 根据当前文案数量，计算按钮栏内各个按钮的落点和点击区域。
   public final void a(int var1, int var2, int var3, int var4) {
      this.c = var1;
      this.d = var2 + var4 - MainCanvas.button1.h;
      this.e = var3;
      if (this.a != null) {
         this.b(var1 + (var3 - GlobalConfig.font2.stringWidth(this.a)) / 2, this.d, GlobalConfig.font2.stringWidth(this.a), MainCanvas.button1.h);
      } else if (this.buttonText != null && this.buttonText.length == 2) {
         this.b(var1 + 10, this.d, GlobalConfig.font2.stringWidth(this.buttonText[0]), MainCanvas.button1.h);
         this.c(var1 + var3 - 10 - GlobalConfig.font2.stringWidth(this.buttonText[1]), this.d, GlobalConfig.font2.stringWidth(this.buttonText[1]), MainCanvas.button1.h);
      } else {
         if (this.buttonText != null && this.buttonText.length == 3) {
            this.b(var1 + 10, this.d, GlobalConfig.font2.stringWidth(this.buttonText[0]), MainCanvas.button1.h);
            int var10001 = (var1 + var3 - 10 - GlobalConfig.font2.stringWidth(this.buttonText[1])) / 2;
            int var10002 = this.d;
            int var10003 = GlobalConfig.font2.stringWidth(this.buttonText[1]);
            short var7 = MainCanvas.button1.h;
            int var6 = var10003;
            int var5 = var10002;
            var4 = var10001;
            this.n = var4;
            this.o = var5;
            this.p = var6;
            this.q = var7;
            this.c(var1 + var3 - 10 - GlobalConfig.font2.stringWidth(this.buttonText[2]), this.d, GlobalConfig.font2.stringWidth(this.buttonText[2]), MainCanvas.button1.h);
         }

      }
   }

   // 记录左侧按钮的点击区域。
   private void b(int var1, int var2, int var3, int var4) {
      this.f = var1;
      this.g = var2;
      this.h = var3;
      this.i = var4;
   }

   // 记录右侧按钮的点击区域。
   private void c(int var1, int var2, int var3, int var4) {
      this.j = var1;
      this.k = var2;
      this.l = var3;
      this.m = var4;
   }

   public final void onClick(int var1) {
   }

   // 命中检测：返回左/中/右按钮或左右箭头对应的指令码。
   public final int hintCheck(int var1, int var2) {
      byte var10000;
      label76: {
         if (this.a != null) {
            if (var1 >= this.f && var1 <= this.f + this.h && var2 >= this.g && var2 <= this.g + this.i) {
               var10000 = 1;
               break label76;
            }
         } else if (this.buttonText != null) {
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

   // 绘制底部按钮栏及可选的左右翻页箭头。
   public final void a(Graphics var1) {
      if (this.a != null || this.buttonText != null) {
         LoadingPage.drawImage(var1, (Image) MainCanvas.button1.image, (short) MainCanvas.button1.w, this.c, this.d, this.e, MainCanvas.button1.h);
         var1.setFont(GlobalConfig.font2);
         if (this.a != null) {
            LoadingPage.drawString(var1, (String)this.a, (int)this.f, this.g + GlobalConfig.getCzjz(MainCanvas.button1.h), 20, this.r, 0);
            this.a(var1, this.f - 5 - MainCanvas.backpage.w, this.f + 5 + GlobalConfig.font2.stringWidth(this.a), this.g + 4);
         } else {
            if (this.buttonText != null) {
               if (this.buttonText.length == 2) {
                  LoadingPage.drawString(var1, (String)this.buttonText[0], (int)this.f, this.g + GlobalConfig.getCzjz(MainCanvas.button1.h), 20, this.r, 0);
                  LoadingPage.drawString(var1, (String)this.buttonText[1], (int)this.j, this.k + GlobalConfig.getCzjz(MainCanvas.button1.h), 20, this.s, 0);
               } else if (this.buttonText.length == 3) {
                  LoadingPage.drawString(var1, (String)this.buttonText[0], (int)this.f, this.g + GlobalConfig.getCzjz(MainCanvas.button1.h), 20, this.r, 0);
                  LoadingPage.drawString(var1, (String)this.buttonText[1], (int)this.n, this.o + GlobalConfig.getCzjz(MainCanvas.button1.h), 20, this.t, 0);
                  LoadingPage.drawString(var1, (String)this.buttonText[2], (int)this.j, this.k + GlobalConfig.getCzjz(MainCanvas.button1.h), 20, this.s, 0);
               }

               this.a(var1, this.f + GlobalConfig.font2.stringWidth(this.buttonText[0]) + 10, this.j - 10 - MainCanvas.nextpage.w, this.g + 4);
            }

         }
      }
   }

   // 绘制左右箭头，同时缓存其触摸区域。
   private void a(Graphics var1, int var2, int var3, int var4) {
      if (this.u) {
         var1.drawImage(MainCanvas.backpage.image, var2, var4, 20);
         var1.drawImage(MainCanvas.nextpage.image, var3, var4, 20);
         this.v[0][0] = var2;
         this.v[0][1] = var4;
         this.v[0][2] = MainCanvas.backpage.w;
         this.v[0][3] = MainCanvas.backpage.h;
         this.v[1][0] = var3;
         this.v[1][1] = var4;
         this.v[1][2] = MainCanvas.nextpage.w;
         this.v[1][3] = MainCanvas.nextpage.h;
      }

   }

   public final void clear() {
      if (this.a != null) {
         this.a = null;
      }

      if (this.buttonText != null) {
         this.buttonText = null;
      }

   }

   // 打开箭头模式；实参未被使用，只保留原始接口形态。
   public final void a(boolean var1) {
      this.u = true;
   }
}

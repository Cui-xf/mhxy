package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

// 复合窗口容器：负责统一绘制外框/标题，并按固定区域组合多个 al 子控件。
public final class MixedUi extends BaseUi {
   private int h = 16776917;
   // 窗口标题文本。
   private String i;
   // 是否绘制窗口底色。
   private boolean j = false;
   // 是否绘制左上角装饰图。
   private boolean k = true;
   // 窗口矩形区域。
   public int a = 0;
   public int b = 0;
   public int c;
   public int d;
   // 子控件列表，实际会混合放入标题栏、列表、文本区、底部按钮栏等组件。
   private Vector child = new Vector();
   private int m;
   private int n;
   private int o;
   private int p;
   private int[] q = null;
   public int e = 0;
   public int f = 0;
   public int g = 0;
   private int r = 0;
   private int s = 0;
   private int t = -1;
   private int u = -1;
   private int v = -1;
   private int w = -1;
   private int x = -1;
   private boolean y = false;

   // 控制是否绘制窗口背景色。
   public final void a(boolean var1) {
      this.j = var1;
   }

   // 设置窗口标题，同时初始化标题右侧关闭按钮的点击区域缓存。
   public final void a(String var1) {
      this.i = var1;
      if (var1 == null) {
         this.q = null;
      } else {
         this.q = new int[4];
      }

      this.r = 0;
      this.s = 0;
   }

   public final int a() {
      return this.n + this.p + 3;
   }

   // 设置窗口自身位置，并预留标题栏占用的纵向空间。
   private void b(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.s = this.b + 5;
      if (this.i != null && MainCanvas.title != null) {
         var4 = MainCanvas.title.c;
         var3 = this.c;
         var2 = this.s;
         var1 = this.a;
         if (this.i != null) {
            this.m = var1;
            this.n = var2;
            this.o = var3;
            this.p = var4;
            this.s = this.s + this.p + 3;
         }
      }

   }

   public final int a(int var1) {
      this.r = var1;
      return this.r;
   }

   // 标准布局：根据子控件类型自动分配标题栏、列表区、文本区、底栏的显示区域。
   public final void a(int var1, int var2, int var3, int var4) {
      this.b(var1, var2, var3, var4);
      this.c();
      if (this.t != -1) {
         ((TopUi)this.child.elementAt(this.t)).a(this.a + 5, this.s, this.c - 20, GlobalConfig.font2_h + 3);
         this.s += GlobalConfig.font2_h;
      }

      if (this.u != -1 && this.v == -1) {
         var1 = this.b + this.d - this.s - 6 - (this.w != -1 ? GlobalConfig.font2_h + 4 : 0) - (this.x != -1 ? MainCanvas.button1.c : 0) - this.e;
         ((GunDongListUi)this.child.elementAt(this.u)).a(this.a + 5, this.s + this.e, this.c - 11, var1 - this.f);
         this.s += var1;
      } else if (this.u == -1 && this.v != -1) {
         var1 = this.b + this.d - this.s - 6 - (this.w != -1 ? GlobalConfig.font2_h + 4 : 0) - (this.x != -1 ? MainCanvas.button1.c : 0) - this.r;
         ((TextPanel)this.child.elementAt(this.v)).setTextRect(this.a + 5, this.s + this.r, this.c - 11, var1 - this.g);
         this.s += var1;
      } else if (this.u != -1 && this.v != -1) {
         var2 = (var1 = this.b + this.d - this.s - 6 - (this.w != -1 ? GlobalConfig.font2_h + 4 : 0) - (this.x != -1 ? MainCanvas.button1.c : 0) - this.e) / 2;
         this.s += this.e;
         ((GunDongListUi)this.child.elementAt(this.u)).a(this.a + 5, this.s, this.c - 11, var2);
         this.s += var2;
         var1 -= var2;
         ((TextPanel)this.child.elementAt(this.v)).setTextRect(this.a + 5, this.s, this.c - 11, var1);
      }

      if (this.w != -1) {
         ButtonUi var10000 = (ButtonUi)this.child.elementAt(this.w);
         int var10001 = this.a + 6;
         int var10002 = this.b;
         int var10003 = this.c - 13;
         int var5 = this.d - 6;
      } else {
         if (this.x != -1) {
            ((BottomUi)this.child.elementAt(this.x)).a(this.a, this.b, this.c, this.d - 5);
         }

      }
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.b(var1, var2, var3, var4);
      this.c();
      if (this.t != -1) {
         ((TopUi)this.child.elementAt(this.t)).a(this.a + 5, this.s, this.c - 20, GlobalConfig.font2_h + 3);
         this.s += GlobalConfig.font2_h;
      }

      if (this.u != -1 && this.v == -1) {
         var1 = this.b + this.d - this.s - 6 - (this.w != -1 ? GlobalConfig.font2_h + 4 : 0) - (this.x != -1 ? MainCanvas.button1.c : 0) - this.e;
         ((GunDongListUi)this.child.elementAt(this.u)).a(this.a + 5, this.s + this.e, this.c - 11, var1 - this.f);
         this.s += var1;
      } else if (this.u == -1 && this.v != -1) {
         var1 = this.b + this.d - this.s - 6 - (this.w != -1 ? GlobalConfig.font2_h + 4 : 0) - (this.x != -1 ? MainCanvas.button1.c : 0) - this.r;
         ((TextPanel)this.child.elementAt(this.v)).setTextRect(this.a + 5, this.s + this.r, this.c - 11, var1 - this.g);
         this.s += var1;
      } else if (this.u != -1 && this.v != -1) {
         var2 = (var1 = this.b + this.d - this.s - 6 - (this.w != -1 ? GlobalConfig.font2_h + 4 : 0) - (this.x != -1 ? MainCanvas.button1.c : 0) - this.e) * var5 / var6;
         this.s += this.e;
         if (var7) {
            ((TextPanel)this.child.elementAt(this.v)).setTextRect(this.a + 5, this.s, this.c - 11, var2);
            this.s += var2;
            var1 -= var2;
            ((GunDongListUi)this.child.elementAt(this.u)).a(this.a + 5, this.s, this.c - 11, var1);
         } else {
            ((GunDongListUi)this.child.elementAt(this.u)).a(this.a + 5, this.s, this.c - 11, var2);
            this.s += var2;
            var1 -= var2;
            ((TextPanel)this.child.elementAt(this.v)).setTextRect(this.a + 5, this.s, this.c - 11, var1);
         }
      }

      if (this.w != -1) {
         ButtonUi var10000 = (ButtonUi)this.child.elementAt(this.w);
         int var10001 = this.a + 6;
         int var10002 = this.b;
         int var10003 = this.c - 13;
         int var8 = this.d - 6;
      } else {
         if (this.x != -1) {
            ((BottomUi)this.child.elementAt(this.x)).a(this.a, this.b, this.c, this.d - 5);
         }

      }
   }

   // 向窗口中注册一个子控件，绘制与输入都会继续向下分发。
   public final void a(BaseUi var1) {
      this.child.addElement(var1);
   }

   // 清空窗口内容但保留对象实例，常用于重新组装弹窗。
   public final void b() {
      this.i = null;
      this.j = false;
      this.r = 0;
      this.e = 0;
      this.f = 0;
      this.g = 0;
      this.child.removeAllElements();
   }

   // 将指令继续分发给所有子控件。
   public final void onClick(int var1) {
      for(int var2 = 0; var2 < this.child.size(); ++var2) {
         ((BaseUi)this.child.elementAt(var2)).onClick(var1);
      }

   }

   // 先检测标题栏关闭按钮，再交给子控件逐个做命中检测。
   public final int hintCheck(int var1, int var2) {
      if (this.q != null && var1 >= this.q[0] && var1 <= this.q[0] + this.q[2] && var2 >= this.q[1] && var2 <= this.q[1] + this.q[3]) {
         return 536870912;
      } else {
         for(int var3 = 0; var3 < this.child.size(); ++var3) {
            if (((BaseUi)this.child.elementAt(var3)).hintCheck(var1, var2) != 0) {
               return ((BaseUi)this.child.elementAt(var3)).hintCheck(var1, var2);
            }
         }

         return 0;
      }
   }

   // 扫描子控件列表，记录各类固定槽位在 Vector 中的下标，便于统一布局。
   private void c() {
      this.t = -1;
      this.u = -1;
      this.v = -1;
      this.w = -1;
      this.x = -1;

      for(int var1 = 0; var1 < this.child.size(); ++var1) {
         Object var2;
         if ((var2 = this.child.elementAt(var1)) instanceof TopUi) {
            this.t = var1;
         } else if (var2 instanceof GunDongListUi) {
            this.u = var1;
         } else if (var2 instanceof TextPanel) {
            this.v = var1;
         } else if (var2 instanceof ButtonUi) {
            this.w = var1;
         } else if (var2 instanceof BottomUi) {
            this.x = var1;
         }
      }

   }

   public final void b(boolean var1) {
      this.k = false;
   }

   // 绘制窗口装饰、标题栏以及所有子控件。
   public final void a(Graphics var1) {
      var1.setClip(this.a, this.b, this.c, this.d);
      if (this.j) {
         var1.setColor(2780801);
         var1.fillRect(this.a, this.b, this.c, this.d);
      }

      this.y = false;
      if (this.i != null && this.i != null) {
         LoadingPage.a(var1, MainCanvas.title.pngImage, MainCanvas.title.b, this.m, this.n, this.o, this.p);
         var1.drawImage(MainCanvas.close.pngImage, this.m + this.o - 5 - MainCanvas.close.b, this.n + 1, 20);
         int var10001 = this.m + this.o - 5 - MainCanvas.close.b;
         int var10002 = this.n + 1;
         short var8 = MainCanvas.close.c;
         short var7 = MainCanvas.close.b;
         int var6 = var10002;
         int var5 = var10001;
         if (this.q != null) {
            this.q[0] = var5;
            this.q[1] = var6;
            this.q[2] = var7;
            this.q[3] = var8;
         }

         int var2 = LoadingPage.parseColor(this.i) != -1 ? LoadingPage.parseColor(this.i) : this.h;
         String var10 = this.i;
         if (var2 != this.h) {
            if (LoadingPage.fwbColorMode == 2) {
               var10 = this.i.substring(4, this.i.length());
            } else {
               var10 = this.i.substring(3, this.i.length());
            }
         }

         LoadingPage.drawString(var1, (String)var10, (int)(this.m + this.o / 2), this.n + GlobalConfig.getCzjz(MainCanvas.title.c), 17, var2, 0);
         LoadingPage.a(var1, this.m, this.n + this.p, this.o);
      }

      for(int var9 = 0; var9 < this.child.size(); ++var9) {
         Object var3;
         if ((var3 = this.child.elementAt(var9)) instanceof TopUi) {
            ((TopUi)var3).a(var1);
            this.y = true;
         } else if (var3 instanceof GunDongListUi) {
            ((GunDongListUi)var3).a(var1);
            ((GunDongListUi)var3).a(this.y);
         } else if (var3 instanceof TextPanel) {
            ((TextPanel)var3).draw(var1);
            TextPanel var10000 = (TextPanel)var3;
            boolean var4 = this.y;
            var10000.f = var4;
         } else if (var3 instanceof ButtonUi) {
            ButtonUi var11 = (ButtonUi)var3;
         } else if (var3 instanceof BottomUi) {
            ((BottomUi)var3).a(var1);
         }
      }

      LoadingPage.setColor(var1, 2);
      var1.drawRect(this.a, this.b, this.c - 1, this.d - 1);
      var1.drawRect(this.a + 4, this.b + 4, this.c - 9, this.d - 9);
      LoadingPage.setColor(var1, 3);
      var1.drawRect(this.a + 1, this.b + 1, this.c - 3, this.d - 3);
      var1.drawRect(this.a + 3, this.b + 3, this.c - 7, this.d - 7);
      LoadingPage.setColor(var1, 4);
      var1.drawRect(this.a + 2, this.b + 2, this.c - 5, this.d - 5);
      if (MainCanvas.lu.pngImage != null && this.k) {
         var1.drawImage(MainCanvas.lu.pngImage, this.a, this.b, 20);
      }

      if (MainCanvas.ld.pngImage != null) {
         var1.drawImage(MainCanvas.ld.pngImage, this.a, this.b + this.d - MainCanvas.ld.c, 20);
      }

      if (MainCanvas.rd.pngImage != null) {
         var1.drawImage(MainCanvas.rd.pngImage, this.a + this.c - MainCanvas.rd.b, this.b + this.d - MainCanvas.rd.c, 20);
      }

      var1.setClip(this.a, this.b, this.c, this.d);
   }

   // 释放窗口与全部子控件的状态。
   public final void clear() {
      this.i = null;
      this.j = false;
      this.r = 0;
      this.e = 0;
      this.f = 0;
      this.g = 0;
      this.k = true;

      for(int var1 = 0; var1 < this.child.size(); ++var1) {
         ((BaseUi)this.child.elementAt(var1)).clear();
      }

      this.child.removeAllElements();
   }
}

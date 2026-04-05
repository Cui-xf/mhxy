package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;

/**
 * 弹窗多行文本滚动区。
 *
 * 将传入的富文本字符串（以 '\t' 为分隔符）分行排版后渲染，
 * 内容超出可视高度时显示右侧滚动条，支持上/下键滚动。
 * 在弹窗容器（y_1）中位于列表区（ay）下方，或在无列表时独占内容区。
 */
public final class FWBUIComponent extends UIComponent {
   /** 当前垂直滚动偏移（像素） */
   private int a;
   /** 滚动条滑块高度（0 表示内容未超出，不显示滚动条） */
   private int b;
   /** 可视区域最大显示行数 */
   private int c;
   /** 文本总行数 */
   private int d;
   /** 是否显示顶部分隔线（由 y_1 根据是否存在 af 组件决定） */
   private boolean e;
   /** 是否按行滚动（true）还是按页滚动（false） */
   private boolean j;
   /** 预留标志位 */
   private boolean k;
   /** 每行行高（取所有行最大高度） */
   private int l;
   /** 原始文本内容 */
   private String m;
   /** 分行排版后的文本行数组 */
   private d_1[] n;

   public FWBUIComponent() {
   }

   public FWBUIComponent(String var1) {
      FWBUIComponent var2;
      (var2 = this).m = var1;
      var2.j = true;
      var2.k = false;
   }

   public final void refresh() {
      this.a = this.b = 0;
      if (this.m != null) {
         this.n = d_1.a(this.m, super.W - 6, GlobalConfig.font2, '\t');
      }

      this.d = this.n == null ? 0 : this.n.length;
      this.l = GlobalConfig.font2_h;

      for(int var1 = 0; var1 < this.d; ++var1) {
         if (this.n[var1].a() > this.l) {
            this.l = this.n[var1].a();
         }
      }

      this.c = (super.H - 6) / this.l;
      if (this.d > this.c) {
         this.n = d_1.a(this.m, super.W - 6 - 12, GlobalConfig.font2, '\t');
         this.d = this.n.length;
         this.b = Math.max(6, this.c * (super.H - 6 - 10) / this.d);
      }

   }

   public final void destroy() {
      this.m = null;
      this.n = null;
   }

   public final void a(boolean var1) {
      this.e = var1;
   }

   public final void onAction(int var1) {
      int var2 = this.j ? this.l : this.c * this.l;
      if (var1 != 1 && var1 != 514) {
         if (var1 == 4 || var1 == 520) {
            this.a += var2 - this.a % this.l;
            this.a = Math.min(this.a, Math.max(0, this.l * this.d - super.H + 6));
         }

      } else {
         var1 = (this.a - var2) % this.l;
         this.a = this.a - var2 + (var1 <= 0 ? 0 : this.l - var1);
         this.a = Math.max(this.a, 0);
      }
   }

   public final int touchAction(int var1, int var2) {
      if (this.b > 0 && var1 >= super.X + super.W - 15 && var1 < super.X + super.W) {
         if (var2 >= super.Y && var2 <= super.Y + 20) {
            return 1;
         }

         if (var2 > super.Y + super.H - 20 && var2 <= super.Y + super.H) {
            return 4;
         }
      }

      return 0;
   }

   public final void draw(Graphics graphics) {
      graphics.setClip(super.X, super.Y, super.W, super.H);
      LoadingPage.draw(graphics, super.X, super.Y, super.W, super.H, 1);
      if (this.e) {
         LoadingPage.draw(graphics);
      }

      graphics.setClip(super.X, super.Y + 4, super.W, super.H - 6);
      int var2;
      int var3 = Math.min((var2 = this.a / this.l) + this.c + 2, this.d);
      int var4 = super.Y + 4 - (this.a - var2 * this.l);

      for(int var5 = var2; var5 < var3; ++var5) {
         this.n[var5].a(graphics, super.X + 4, var4, 20);
         var4 += this.l;
      }

      if (this.b > 0) {
         graphics.setClip(super.X, super.Y, super.W, super.H);
         LoadingPage.draw(graphics, super.X + super.W - 2 - MainCanvas.up.b, super.Y + 4, super.H - 6, this.b, this.a, this.l * this.d, super.H - 6);
      }

   }
}

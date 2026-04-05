package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;

/**
 * 弹窗列表选择区。
 *
 * 渲染一个可滚动的行列表，支持选中高亮（单选）。
 * 点击某行返回 1073741824（选中动作码），右侧有滚动条时上/下箭头区域返回 1/4。
 * 在弹窗容器（y_1）中位于 af（输入区）下方，bi（文本区）上方。
 * 注：当前 ay 的行高和行数计算存在除以 0 的问题（反编译产物，实际运行时行高由具体数据填充）。
 */
//public final class ay extends UIComponent {
public final class GunDongListUIComponent extends UIComponent {
   /** 是否显示顶部分隔线（由 y_1 根据是否存在 af 组件决定） */
   private boolean a;
   /** 当前垂直滚动偏移（像素） */
   private int b;
   /** 当前选中行索引 */
   private int c;
   /** 列表总行数 */
   private int d;
   /** 滚动条滑块高度（0 表示不显示滚动条） */
   private int e;
   /** 列表数据源 */
   private a j;

   public final void refresh() {
      this.b = this.e = 0;
      this.d = (super.H - 4) / 0;
      if (0 > this.d) {
         this.e = Math.max(6, this.d * (super.H - 6) / 0);
      }

   }

   public final void destroy() {
      this.j = null;
   }

   public final void a(boolean var1) {
      this.a = var1;
   }

   public final void onAction(int var1) {
      if (var1 != 1 && var1 != 514) {
         if (var1 == 4 || var1 == 520) {
            var1 = this.b / 0;
            int var5 = (this.b + super.H - 6) / 0;
            if (this.c < var1 || this.c > var5) {
               this.c = var1;
               int var9 = this.c;
               this.b = 0;
               return;
            }

            if (this.c < -1) {
               ++this.c;
            } else {
               this.c = 0;
               this.b = 0;
            }

            int var10000 = this.b + super.H - 6;
            int var7 = this.c + 1;
            if (var10000 < 0) {
               var7 = this.c + 1;
               this.b = 0 - super.H + 6;
            }
         }
      } else {
         var1 = this.b / 0;
         int var2 = (this.b + super.H - 6) / 0;
         if (this.c >= var1 && this.c <= var2) {
            if (this.c > 0) {
               --this.c;
            } else {
               this.c = -1;
               this.b = Math.max(super.H - 2, 0) - super.H + 6;
            }

            if (var1 >= this.c) {
               int var6 = this.c;
               this.b = 0;
            }

            return;
         }

         this.c = var2;
         int var10001 = this.c + 1;
         this.b = 0 - super.H + 6;
      }

   }

   public final int touchAction(int var1, int var2) {
      if (inBox(var1, var2)) {
//         ((Object[])null)[1] = var2;
         if (this.e > 0 && var1 >= super.X + super.W - 15 && var1 < super.X + super.W) {
            if (var2 >= super.Y && var2 <= super.Y + 20) {
               return 1;
            }

            if (var2 > super.Y + super.H - 20 && var2 <= super.Y + super.H) {
               return 4;
            }
         }

         if ((var1 = (this.b + var2 - super.Y) / 0) == this.c) {
            return 1073741824;
         }

         this.c = var1;
      }

      return 0;
   }

   public final void draw(Graphics graphics) {
      graphics.setClip(super.X, super.Y, super.W, super.H);
      LoadingPage.draw(graphics, super.X, super.Y, super.W, super.H, 1);
      if (this.a) {
         LoadingPage.draw(graphics);
      }

      Math.min(this.b / 0 + (super.H - 6) / 0 + 2, 0);
      graphics.setClip(super.X + 4, super.Y + 3, super.W - 4, super.H - 6);
      if (this.e > 0) {
         graphics.setClip(super.X, super.Y, super.W, super.H);
         LoadingPage.draw(graphics, super.X + super.W - 2 - MainCanvas.up.b, super.Y + 2, super.H - 4, this.e, this.b, 0, super.H - 6);
      }

   }
}

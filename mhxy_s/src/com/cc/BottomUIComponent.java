package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 * 弹窗底部按钮栏。
 *
 * 最多支持三个按钮：左（d）、中（e）、右（j），未设置的按钮不渲染。
 * 触摸命中各按钮时分别返回动作码：左=268435456，中=1073741824，右=536870912。
 * 背景使用 MainCanvas.E（通用按钮背景图）横向拉伸填充。
 * 在弹窗容器（y_1）中始终位于最底部。
 */
//public final class u extends UIComponent {
public final class BottomUIComponent extends UIComponent {
   /** 左按钮文字颜色（默认白色） */
   private int a = 16777215;
   /** 中按钮文字颜色（默认白色） */
   private int b = 16777215;
   /** 右按钮文字颜色（默认白色） */
   private int c = 16777215;
   /** 左按钮文字（靠左对齐，点击返回 268435456） */
   private String d;
   /** 中按钮文字（居中对齐，点击返回 1073741824） */
   private String e;
   /** 右按钮文字（靠右对齐，点击返回 536870912） */
   private String j;

   public final void refresh() {
   }

   public final void destroy() {
      this.d = null;
      this.e = null;
      this.j = null;
   }

   public final void a(String var1) {
      this.d = var1;
   }

   public final void b(String var1) {
      this.e = var1;
   }

   public final void c(String var1) {
      this.j = var1;
   }

   public final void onAction(int var1) {
   }

   public final int touchAction(int var1, int var2) {
      if (((UIComponent)this).inBox(var1, var2)) {
         if (this.d != null && var1 > super.X && var1 < super.X + GlobalConfig.font2.stringWidth(this.d) + 5 && var2 > super.Y && var2 < super.Y + super.H) {
            return 268435456;
         }

         if (this.e != null) {
            int var3 = GlobalConfig.font2.stringWidth(this.e) + 10;
            if (var1 > super.X + (super.W - var3) / 2 && var1 < super.X + (super.W + var3) / 2 && var2 > super.X && var2 < super.Y + super.H) {
               return 1073741824;
            }
         }

         if (this.j != null && var1 > super.X + super.W - GlobalConfig.font2.stringWidth(this.j) - 5 && var1 < super.X + super.W && var2 > super.Y && var2 < super.Y + super.H) {
            return 536870912;
         }
      }

      return 0;
   }

   public final void draw(Graphics graphics) {
      graphics.setClip(super.X, super.Y, super.W, super.H);
      LoadingPage.drawImage(graphics, (Image) MainCanvas.button1.image, (short) MainCanvas.button1.w, super.X, super.Y, super.W, MainCanvas.button1.h);
      if (this.d != null) {
         graphics.setColor(this.a);
         graphics.drawString(this.d, super.X + 3, super.Y + (super.H - GlobalConfig.font2_h) / 2, 20);
      }

      if (this.e != null) {
         graphics.setColor(this.b);
         graphics.drawString(this.e, super.X + super.W / 2, super.Y + (super.H - GlobalConfig.font2_h) / 2, 17);
      }

      if (this.j != null) {
         graphics.setColor(this.c);
         graphics.drawString(this.j, super.X + super.W - 3, super.Y + (super.H - GlobalConfig.font2_h) / 2, 24);
      }

   }
}

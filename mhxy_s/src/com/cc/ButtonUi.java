package com.cc;

import javax.microedition.lcdui.Font;

// 双热点文本按钮区域：分别维护左右两个文字按钮的命中状态与高亮样式。
public final class ButtonUi extends BaseUi {
   // 左右按钮文案。
   private String a;
   private String b;
   // 左右按钮的点击区域。
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

   public ButtonUi() {
      this.m = GlobalConfig.font2;
      this.n = GlobalConfig.font2;
   }

   // 仅做命中检测与高亮切换，本类本身不处理键盘指令。
   public final void onClick(int var1) {
   }

   // 检测左右两个文字按钮是否被触摸，并切换对应高亮颜色/字体。
   public final int hintCheck(int var1, int var2) {
      boolean var10000;
      if (var1 >= this.c && var1 <= this.c + this.e && var2 >= this.d && var2 <= this.d + this.f) {
         this.k = 16711680;
         this.m = GlobalConfig.font1;
         var10000 = true;
      } else {
         this.m = GlobalConfig.font2;
         this.k = 16776960;
         var10000 = false;
      }

      if (var10000) {
         return 268435456;
      } else {
         if (var1 >= this.g && var1 <= this.g + this.i && var2 >= this.h && var2 <= this.h + this.j) {
            this.l = 16711680;
            this.n = GlobalConfig.font1;
            var10000 = true;
         } else {
            this.n = GlobalConfig.font2;
            this.l = 16776960;
            var10000 = false;
         }

         return var10000 ? 536870912 : 0;
      }
   }

   // 释放按钮文案与高亮字体引用。
   public final void clear() {
      this.a = null;
      this.b = null;
      this.m = null;
      this.n = null;
   }
}

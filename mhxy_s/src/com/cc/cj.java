package com.cc;

import com.cc.resource.Animation;
import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;

public final class cj {
   public Animation a;
   public int[] b;
   public int[] c;

   public cj(int var1, int var2) {
      this.b = new int[var2];
      this.c = new int[var2];
      this.a = MainCanvas.skill.getAnimationByNameFromCache(String.valueOf(var1));
      if (this.a == null || this.a.spritePieces == null || this.a.spritePieces[0] == null || this.a.spritePieces[0][0] == null || this.a.spritePieces[0][0].frame == null) {
         this.a = MainCanvas.skill.getAnimationByNameFromCache(String.valueOf(10));
      }

   }

   public final void a(int var1, int var2, int var3) {
      this.b[var1] = var2;
      this.c[var1] = var3;
   }

   public final void a(Graphics var1, PngUtil var2, int var3, int var4) {
      if (this.a != null) {
         for(byte var5 = 0; var5 < this.b.length; ++var5) {
            if (this.b[var5] != 0 && this.c[var5] != 0) {
               var2.roleSelectedAnimation(var1, (Animation)this.a, (int[])null, 0, 0, this.b[var5], this.c[var5], 20, 0);
            }
         }
      }

   }
}

package com.cc;

import com.cc.resource.Animation;
import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;

public final class SkillAnim {
   public Animation animation;
   public int[] framW;
   public int[] framH;

   public SkillAnim(int var1, int var2) {
      this.framW = new int[var2];
      this.framH = new int[var2];
      this.animation = MainCanvas.skill.getAnimationByNameFromCache(String.valueOf(var1));
      if (this.animation == null || this.animation.spritePieces == null || this.animation.spritePieces[0] == null || this.animation.spritePieces[0][0] == null || this.animation.spritePieces[0][0].frame == null) {
         this.animation = MainCanvas.skill.getAnimationByNameFromCache(String.valueOf(10));
      }

   }

   public final void a(int framIndex, int var2, int var3) {
      this.framW[framIndex] = var2;
      this.framH[framIndex] = var3;
   }

   public final void a(Graphics var1, PngUtil pngUtil, int var3, int var4) {
      if (this.animation != null) {
         for(byte i = 0; i < this.framW.length; ++i) {
            if (this.framW[i] != 0 && this.framH[i] != 0) {
               pngUtil.roleSelectedAnimation(var1, (Animation)this.animation, (int[])null, 0, 0, this.framW[i], this.framH[i], 20, 0);
            }
         }
      }

   }
}

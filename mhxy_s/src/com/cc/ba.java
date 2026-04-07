package com.cc;

import com.cc.resource.Animation;
import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;

public final class ba {
   private GameSceneController a;
   private PngUtil b;
   private MainCanvas c;
   private short d;
   private int e;
   private int f;
   private int g;
   private int h;

   public ba(MainCanvas var1, GameSceneController var2, PngUtil var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
      var1.mixedUi.clean();
      var1.mixedUi.setTitle("宠物升星");
      var1.mixedUi.addChild((BaseUi)var1.textPanel);
      if (GlobalConfig.defaultHigh > 220) {
         var1.bottomUi.a("");
         var1.mixedUi.addChild((BaseUi)var1.bottomUi);
      }

      var1.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.d = (short)(var1.textPanel.textH >> 1);
      this.e = var1.textPanel.textX;
      this.f = var1.textPanel.textY;
      this.g = var1.textPanel.textW;
      this.h = this.d;
      var1.textPanel.setTextRect(this.e, this.f + this.h, this.g, this.h + 1);
   }

   public final void a() {
      this.c.mixedUi.clean();
      this.c.mixedUi.setTitle("宠物升星");
      this.c.mixedUi.addChild((BaseUi)this.c.textPanel);
      if (GlobalConfig.defaultHigh > 220) {
         this.c.bottomUi.a("");
         this.c.mixedUi.addChild((BaseUi)this.c.bottomUi);
      }

      this.c.mixedUi.setTitle("宠物升星");
      this.c.textPanel.setTextRect(this.e, this.f + this.h + 1, this.g, this.d);
   }

   public final void a(Graphics var1) {
      this.c.mixedUi.draw(var1);
      LoadingPage.draw(var1, this.e, this.f, this.g, this.h - 32, 1);
      LoadingPage.draw(var1, this.e, this.f, 80, this.h - 32, 1);
      if (this.a.bf == 0 && this.a.be == 0) {
         var1.setColor(16776960);
         var1.drawRect(this.e, this.f, 80, this.h - 32);
      }

      if (GlobalStatus.mx != -1 && this.a.aI != null) {
         this.b.a(var1, (Animation)this.a.aI, (int[])null, 0, 0, this.e + 40 - this.a.aI.g() / 2, this.f + (this.h - 32) / 2 - this.a.aI.h() / 2, 0, 0);
      } else {
         var1.setColor(16776960);
         var1.drawString("主宠", this.e + 40, this.f + (this.h - 32) / 2, 65);
      }

      var1.setColor(255);
      var1.drawString("幸运材料", this.e + 80 + 4, this.f + 8, 0);
      MainCanvas.pngUtil.a(var1, GameSceneController.goods, (int[])null, (ImageSlice)null, 0, 0, this.e + 80 + 8 + 24, this.f + this.h - 32 - 44, 0, 0);
      if (GlobalStatus.mK[0] > 0) {
         this.b.a(var1, GameSceneController.b(GlobalStatus.mK[0]), (int[])null, (ImageSlice)null, 0, 0, this.e + 80 + 8 + 24, this.f + this.h - 32 - 44, 0, 0);
      }

      if (this.a.bf == 0 && this.a.be == 1) {
         var1.setColor(16776960);
         var1.drawRect(this.e + 80 + 8 + 24, this.f + this.h - 32 - 44, 16, 16);
      }

      var1.setColor(2917024);
      var1.fillRect(this.e + this.g - 44, this.f + (this.h - 32 - 40) / 2, 40, 40);
      var1.setColor(this.a.bf == 1 && this.a.be == 0 ? 16776960 : 9360850);
      var1.drawRect(this.e + this.g - 44, this.f + (this.h - 32 - 40) / 2, 39, 39);
      if (GlobalStatus.mD != -1 && this.a.bd != null) {
         this.b.a(var1, (Animation)this.a.bd, (int[])null, 0, 0, this.e + this.g - 44 + 20 - this.a.bd.g() / 2, this.f + (this.h - 32) / 2 - this.a.bd.h() / 2, 0, 0);
      } else {
         var1.setColor(16776960);
         var1.drawString("副宠", this.e + this.g - 44 + 20, this.f + (this.h - 32) / 2, 65);
      }

      LoadingPage.draw(var1, this.e, this.f + this.h - 32, this.g, 32, 1);
      if (GlobalStatus.mM != null) {
         var1.setColor(16776960);
         var1.drawString(GlobalStatus.mM, GlobalConfig.defaultWidth / 2, this.f + this.h - 25 + 2, 17);
      }

      if (this.a.sceneSubState == 1) {
         LoadingPage.c(var1);
      }

   }

   public final int a(byte var1, int var2, int var3) {
      if (this.a.sceneSubState == 1) {
         return LoadingPage.c(var2, var3);
      } else if (this.c.mixedUi.hintCheck(var2, var3) > 0) {
         return this.c.mixedUi.hintCheck(var2, var3);
      } else {
         if (var2 > this.e && var2 < this.e + 80 && var3 > this.f && var3 < this.f + this.h - 32) {
            if (this.a.be == 0 && this.a.bf == 0) {
               return 268435456;
            }

            this.a.bf = 0;
            this.a.be = 0;
            LoadingPage.l = 0;
            this.a.ak();
         } else if (var2 > this.e + this.g - 44 && var2 < this.e + this.g - 4 && var3 > this.f + (this.h - 32 - 40) / 2 && var3 < this.f + (this.h - 32 - 40) / 2 + 40) {
            if (this.a.be == 0 && this.a.bf == 1) {
               return 268435456;
            }

            this.a.bf = 1;
            this.a.be = 0;
            LoadingPage.l = 0;
            this.a.ak();
         } else if (var2 > this.e + 80 + 8 + 24 && var2 < this.e + 80 + 8 + 24 + 16 && var3 > this.f + this.h - 32 - 44 && var3 < this.f + this.h - 32 - 44 + 16) {
            if (this.a.be == 1 && this.a.bf == 0) {
               return 268435456;
            }

            this.a.bf = 0;
            this.a.be = 1;
            LoadingPage.l = 0;
            this.a.ak();
         }

         return 0;
      }
   }
}

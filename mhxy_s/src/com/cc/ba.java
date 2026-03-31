package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;

public final class ba {
   private ao_1 a;
   private ai_1 b;
   private MainCanvas c;
   private short d;
   private int e;
   private int f;
   private int g;
   private int h;

   public ba(MainCanvas var1, ao_1 var2, ai_1 var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
      var1.aq.b();
      var1.aq.a("宠物升星");
      var1.aq.a((al)var1.at);
      if (t_1.c > 220) {
         var1.au.a("");
         var1.aq.a((al)var1.au);
      }

      var1.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.d = (short)(var1.at.e >> 1);
      this.e = var1.at.b;
      this.f = var1.at.c;
      this.g = var1.at.d;
      this.h = this.d;
      var1.at.a(this.e, this.f + this.h, this.g, this.h + 1);
   }

   public final void a() {
      this.c.aq.b();
      this.c.aq.a("宠物升星");
      this.c.aq.a((al)this.c.at);
      if (t_1.c > 220) {
         this.c.au.a("");
         this.c.aq.a((al)this.c.au);
      }

      this.c.aq.a("宠物升星");
      this.c.at.a(this.e, this.f + this.h + 1, this.g, this.d);
   }

   public final void a(Graphics var1) {
      this.c.aq.a(var1);
      LoadingPage.a(var1, this.e, this.f, this.g, this.h - 32, 1);
      LoadingPage.a(var1, this.e, this.f, 80, this.h - 32, 1);
      if (this.a.bf == 0 && this.a.be == 0) {
         var1.setColor(16776960);
         var1.drawRect(this.e, this.f, 80, this.h - 32);
      }

      if (bt_1.mx != -1 && this.a.aI != null) {
         this.b.a(var1, (Frame1)this.a.aI, (int[])null, 0, 0, this.e + 40 - this.a.aI.g() / 2, this.f + (this.h - 32) / 2 - this.a.aI.h() / 2, 0, 0);
      } else {
         var1.setColor(16776960);
         var1.drawString("主宠", this.e + 40, this.f + (this.h - 32) / 2, 65);
      }

      var1.setColor(255);
      var1.drawString("幸运材料", this.e + 80 + 4, this.f + 8, 0);
      MainCanvas.f.a(var1, ao_1.x, (int[])null, (aj)null, 0, 0, this.e + 80 + 8 + 24, this.f + this.h - 32 - 44, 0, 0);
      if (bt_1.mK[0] > 0) {
         this.b.a(var1, ao_1.b(bt_1.mK[0]), (int[])null, (aj)null, 0, 0, this.e + 80 + 8 + 24, this.f + this.h - 32 - 44, 0, 0);
      }

      if (this.a.bf == 0 && this.a.be == 1) {
         var1.setColor(16776960);
         var1.drawRect(this.e + 80 + 8 + 24, this.f + this.h - 32 - 44, 16, 16);
      }

      var1.setColor(2917024);
      var1.fillRect(this.e + this.g - 44, this.f + (this.h - 32 - 40) / 2, 40, 40);
      var1.setColor(this.a.bf == 1 && this.a.be == 0 ? 16776960 : 9360850);
      var1.drawRect(this.e + this.g - 44, this.f + (this.h - 32 - 40) / 2, 39, 39);
      if (bt_1.mD != -1 && this.a.bd != null) {
         this.b.a(var1, (Frame1)this.a.bd, (int[])null, 0, 0, this.e + this.g - 44 + 20 - this.a.bd.g() / 2, this.f + (this.h - 32) / 2 - this.a.bd.h() / 2, 0, 0);
      } else {
         var1.setColor(16776960);
         var1.drawString("副宠", this.e + this.g - 44 + 20, this.f + (this.h - 32) / 2, 65);
      }

      LoadingPage.a(var1, this.e, this.f + this.h - 32, this.g, 32, 1);
      if (bt_1.mM != null) {
         var1.setColor(16776960);
         var1.drawString(bt_1.mM, t_1.b / 2, this.f + this.h - 25 + 2, 17);
      }

      if (this.a.l == 1) {
         LoadingPage.c(var1);
      }

   }

   public final int a(byte var1, int var2, int var3) {
      if (this.a.l == 1) {
         return LoadingPage.c(var2, var3);
      } else if (this.c.aq.b(var2, var3) > 0) {
         return this.c.aq.b(var2, var3);
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

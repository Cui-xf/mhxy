package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;

public final class bi extends bk {
   private int a;
   private int b;
   private int c;
   private int d;
   private boolean e;
   private boolean j;
   private boolean k;
   private int l;
   private String m;
   private d_1[] n;

   public bi() {
   }

   public bi(String var1) {
      bi var2;
      (var2 = this).m = var1;
      var2.j = true;
      var2.k = false;
   }

   public final void a() {
      this.a = this.b = 0;
      if (this.m != null) {
         this.n = d_1.a(this.m, super.h - 6, t_1.i, '\t');
      }

      this.d = this.n == null ? 0 : this.n.length;
      this.l = t_1.j;

      for(int var1 = 0; var1 < this.d; ++var1) {
         if (this.n[var1].a() > this.l) {
            this.l = this.n[var1].a();
         }
      }

      this.c = (super.i - 6) / this.l;
      if (this.d > this.c) {
         this.n = d_1.a(this.m, super.h - 6 - 12, t_1.i, '\t');
         this.d = this.n.length;
         this.b = Math.max(6, this.c * (super.i - 6 - 10) / this.d);
      }

   }

   public final void b() {
      this.m = null;
      this.n = null;
   }

   public final void a(boolean var1) {
      this.e = var1;
   }

   public final void a(int var1) {
      int var2 = this.j ? this.l : this.c * this.l;
      if (var1 != 1 && var1 != 514) {
         if (var1 == 4 || var1 == 520) {
            this.a += var2 - this.a % this.l;
            this.a = Math.min(this.a, Math.max(0, this.l * this.d - super.i + 6));
         }

      } else {
         var1 = (this.a - var2) % this.l;
         this.a = this.a - var2 + (var1 <= 0 ? 0 : this.l - var1);
         this.a = Math.max(this.a, 0);
      }
   }

   public final int a(int var1, int var2) {
      if (this.b > 0 && var1 >= super.f + super.h - 15 && var1 < super.f + super.h) {
         if (var2 >= super.g && var2 <= super.g + 20) {
            return 1;
         }

         if (var2 > super.g + super.i - 20 && var2 <= super.g + super.i) {
            return 4;
         }
      }

      return 0;
   }

   public final void a(Graphics var1) {
      var1.setClip(super.f, super.g, super.h, super.i);
      ca_1.a(var1, super.f, super.g, super.h, super.i, 1);
      if (this.e) {
         ca_1.a(var1);
      }

      var1.setClip(super.f, super.g + 4, super.h, super.i - 6);
      int var2;
      int var3 = Math.min((var2 = this.a / this.l) + this.c + 2, this.d);
      int var4 = super.g + 4 - (this.a - var2 * this.l);

      for(int var5 = var2; var5 < var3; ++var5) {
         this.n[var5].a(var1, super.f + 4, var4, 20);
         var4 += this.l;
      }

      if (this.b > 0) {
         var1.setClip(super.f, super.g, super.h, super.i);
         ca_1.a(var1, super.f + super.h - 2 - MainCanvas.C.b, super.g + 4, super.i - 6, this.b, this.a, this.l * this.d, super.i - 6);
      }

   }
}

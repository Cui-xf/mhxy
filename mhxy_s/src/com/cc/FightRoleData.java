package com.cc;

import com.cc.resource.Animation;
import com.yinhan.kjava.main.MainCanvas;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class FightRoleData {
   public byte a;
   public byte b;
   public String c;
   public String d;
   public int e;
   public int f;
   public int g;
   public int h;
   public short i;
   private byte t;
   public Animation j;
   public byte k;
   public boolean l = false;
   public boolean m = false;
   public boolean n = false;
   public boolean o = false;
   public short p;
   public short q;
   public short r;
   public Vector s = new Vector();

   public final void a(byte var1) {
      this.t = var1 <= 0 ? 1 : var1;
   }

   public final byte a() {
      return this.t;
   }

   public final ck b() {
      ck var1;
      (var1 = new ck()).a = this.a;
      var1.b = this.b == 2 ? 1 : this.b;
      var1.c = this.c;
      var1.d = this.d;
      var1.e = this.e;
      var1.f = this.f;
      var1.g = this.g;
      var1.h = this.h;
      var1.j = this.i;
      var1.a(this.t);
      var1.n = this.k;
      var1.m = this.j;
      var1.r = this.p;
      var1.s = this.q;
      var1.t = this.r;
      return var1;
   }

   public final FightRoleData c() {
      FightRoleData var1;
      (var1 = new FightRoleData()).a = this.a;
      var1.b = this.b;
      var1.c = this.c;
      var1.d = this.d;
      var1.e = this.e;
      var1.f = this.f;
      var1.g = this.g;
      var1.h = this.h;
      var1.i = this.i;
      var1.a(this.t);
      var1.k = this.k;
      var1.j = this.j;
      var1.p = this.p;
      var1.q = this.q;
      var1.r = this.r;
      return var1;
   }

   public final void b(byte var1) {
      GlobalConfig.sbTemp.delete(0, GlobalConfig.sbTemp.length());
      this.k = var1;
      if (this.b == 0) {
         if (var1 == 4) {
            GlobalConfig.sbTemp.append("f").append(this.i).append(0).append(var1);
         } else {
            GlobalConfig.sbTemp.append("f").append(this.i).append(0).append(this.t).append(var1);
         }

         this.j = MainCanvas.role.getAnimationByNameFromCache(GlobalConfig.sbTemp.toString());
         if (this.j == null && var1 != 4) {
            GlobalConfig.sbTemp.delete(0, GlobalConfig.sbTemp.length());
            GlobalConfig.sbTemp.append("f").append(this.i).append(0).append(1).append(var1);
            this.j = MainCanvas.role.getAnimationByNameFromCache(GlobalConfig.sbTemp.toString());
            return;
         }
      } else if (this.b == 1) {
         GlobalConfig.sbTemp.append(this.i).append(var1 > 3 ? 3 : var1);
         this.j = MainCanvas.petfight.getAnimationByNameFromCache(GlobalConfig.sbTemp.toString(), this.p, this.q, this.r);
         if (this.j == null) {
            GlobalConfig.sbTemp.delete(0, GlobalConfig.sbTemp.length());
            GlobalConfig.sbTemp.append(100).append(var1 > 3 ? 3 : var1);
            this.j = MainCanvas.petfight.getAnimationByNameFromCache(GlobalConfig.sbTemp.toString(), this.p, this.q, this.r);
            return;
         }
      } else if (this.b == 2) {
         GlobalConfig.sbTemp.append(this.i).append(var1 > 3 ? 3 : var1);
         this.j = MainCanvas.petfight.getAnimationByNameFromCache(GlobalConfig.sbTemp.toString(), this.p, this.q, this.r);
      }

   }

   public final void a(Graphics var1, PngUtil var2, int var3, int var4, byte var5) {
      if (!this.d() && this.j != null) {
         var2.roleSelectedAnimation(var1, (Animation)this.j, (int[])null, 0, 0, var3, var4, 20, 0);
      }

   }

   public final boolean d() {
      return this.e <= 0;
   }

   public final void e() {
      this.c = null;
      this.d = null;
      if (this.j != null) {
         Animation var1 = this.j;
      }

      this.j = null;
   }

   public final short f() {
      return this.j != null && this.j.frameW != null ? this.j.frameW[this.j.currentFrameIndex] : 0;
   }

   public final short g() {
      return this.j != null && this.j.frameH != null ? this.j.frameH[this.j.currentFrameIndex] : 0;
   }

   public final short h() {
      return this.j != null && this.j.frameW != null ? this.j.frameW[0] : 0;
   }

   public final short i() {
      return this.j != null && this.j.frameH != null ? this.j.frameH[0] : 0;
   }
}

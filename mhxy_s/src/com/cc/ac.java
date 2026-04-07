package com.cc;

import com.cc.resource.Animation;
import com.cc.resource.ResourceManager;
import com.cc.resource.TileMap;
import com.yinhan.kjava.main.MainCanvas;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class ac extends SceneEntity {
   private static short n = 4;
   public short a;
   public short b;
   private short o = -1;
   private short p;
   private short q;
   private short r;
   private short s = -1;
   private String roleRideIcon = "";
   private int[] u = new int[4];
   private int[] v = new int[4];
   private String w = "";
   private byte x = 3;
   private boolean y = false;
   private byte z = 0;
   private boolean A = false;
   private byte B;
   private boolean C;
   private byte D;
   private s E = null;
   private bv F = null;
   public Vector c = new Vector();
   private byte G;
   private bl H = null;

   public ac() {
      this.s = (short) GlobalStatus.ay;
      this.roleRideIcon = GlobalStatus.roleCurrentRideIcon;
      this.s();
      this.a(false);
      this.t();
   }

   private void s() {
      this.u[1] = ResourceManager.buildResourceId((String) MainCanvas.a(GlobalStatus.backpackRows, GlobalStatus.backPackFlag, (byte)1, GlobalStatus.ay, false, GlobalStatus.roleCurrentRideIcon), (byte)2);
      this.v[1] = ResourceManager.buildResourceId((String) MainCanvas.a(GlobalStatus.backpackRows, GlobalStatus.backPackFlag, (byte)1, GlobalStatus.ay, true, GlobalStatus.roleCurrentRideIcon), (byte)2);
      this.u[3] = ResourceManager.buildResourceId((String) MainCanvas.a(GlobalStatus.backpackRows, GlobalStatus.backPackFlag, (byte)3, GlobalStatus.ay, false, GlobalStatus.roleCurrentRideIcon), (byte)2);
      this.v[3] = ResourceManager.buildResourceId((String) MainCanvas.a(GlobalStatus.backpackRows, GlobalStatus.backPackFlag, (byte)3, GlobalStatus.ay, true, GlobalStatus.roleCurrentRideIcon), (byte)2);
      this.u[0] = ResourceManager.buildResourceId((String) MainCanvas.a(GlobalStatus.backpackRows, GlobalStatus.backPackFlag, (byte)0, GlobalStatus.ay, false, GlobalStatus.roleCurrentRideIcon), (byte)2);
      this.v[0] = ResourceManager.buildResourceId((String) MainCanvas.a(GlobalStatus.backpackRows, GlobalStatus.backPackFlag, (byte)0, GlobalStatus.ay, true, GlobalStatus.roleCurrentRideIcon), (byte)2);
      this.u[2] = ResourceManager.buildResourceId((String) MainCanvas.a(GlobalStatus.backpackRows, GlobalStatus.backPackFlag, (byte)2, GlobalStatus.ay, false, GlobalStatus.roleCurrentRideIcon), (byte)2);
      this.v[2] = ResourceManager.buildResourceId((String) MainCanvas.a(GlobalStatus.backpackRows, GlobalStatus.backPackFlag, (byte)2, GlobalStatus.ay, true, GlobalStatus.roleCurrentRideIcon), (byte)2);
   }

   public final void a() {
      this.t();
   }

   public final void a(boolean var1) {
      if (this.s != GlobalStatus.ay) {
         this.s = (short) GlobalStatus.ay;
         this.s();
      } else if (!this.roleRideIcon.equals(GlobalStatus.roleCurrentRideIcon)) {
         this.roleRideIcon = GlobalStatus.roleCurrentRideIcon;
         this.s();
      }

      short var2;
      short var3;
      short var4;
      if (!GlobalStatus.roleCurrentRideIcon.equals("") && GlobalConfig.hasRideRes) {
         var2 = GlobalStatus.rideAttr1;
         var3 = GlobalStatus.rideAttr3;
         var4 = GlobalStatus.rideAttr2;
      } else {
         var4 = 0;
         var3 = 0;
         var2 = 0;
      }

      super.frame1 = MainCanvas.role.getAnimationByKeyFromCache(var1 ? this.v[super.h] : this.u[super.h], var2, var3, var4);
      if (super.frame1 == null) {
         MainCanvas.loadRoleRes(GlobalStatus.backpackRows, GlobalStatus.backPackFlag, (byte)5, GlobalStatus.ay, this.roleRideIcon, var2, var3, var4);
         super.frame1 = MainCanvas.role.getAnimationByKeyFromCache(var1 ? this.v[super.h] : this.u[super.h], var2, var3, var4);
         if (super.frame1 == null) {
            GlobalStatus.ay = 0;
            this.s();
            super.frame1 = MainCanvas.role.getAnimationByKeyFromCache(var1 ? this.v[super.h] : this.u[super.h]);
            if (super.frame1 == null) {
               MainCanvas.loadRoleRes(GlobalStatus.backpackRows, GlobalStatus.backPackFlag, (byte)5, GlobalStatus.ay, this.roleRideIcon, var2, var3, var4);
               super.frame1 = MainCanvas.role.getAnimationByKeyFromCache(var1 ? this.v[super.h] : this.u[super.h]);
               return;
            }
         }
      } else if (!GlobalStatus.roleCurrentRideIcon.equals("")) {
         super.frame1.hsl_h = GlobalStatus.rideAttr1;
         super.frame1.hsl_s = GlobalStatus.rideAttr3;
         super.frame1.hsl_l = GlobalStatus.rideAttr2;
      }

   }

   public final void b() {
      this.a(false);
   }

   private void t() {
      if (GlobalStatus.selectedMount <= 0 && super.d != null) {
         au var1;
         if ((var1 = super.d).e != null) {
            var1.e.removeAllElements();
            var1.e = null;
         }

         if (var1.f != null) {
            Animation var2 = var1.f;
         }

         var1.f = null;
         super.d = null;
      }

      if (GlobalStatus.selectedMount > 0) {
         if (super.d == null || this.o != GlobalStatus.selectedMount || this.p != GlobalStatus.mountX || this.q != GlobalStatus.mountY || this.r != GlobalStatus.mountDirection) {
            this.o = GlobalStatus.selectedMount;
            this.p = GlobalStatus.mountX;
            this.q = GlobalStatus.mountY;
            this.r = GlobalStatus.mountDirection;
            super.d = new au((byte)1, GlobalStatus.selectedMount, GlobalStatus.mountX, GlobalStatus.mountY, GlobalStatus.mountDirection);
         }

         if (super.d.h == 0 && super.d.i == 0) {
            super.d.h = super.j;
            super.d.i = super.k;
         }

         super.d.a(super.h);
      }

   }

   public final void a(TileMap var1, PngUtil var2, long var3) {
      if (super.frame1 != null && var1 != null) {
         if (!this.y && !this.A) {
            if (this.a == 0 && this.b < 0) {
               if (var2.a(var1, super.j + this.a + 8, super.k + this.b + 16) == 0 && var2.a(var1, super.j + this.a + 10, super.k + this.b + 16) == 0 && !var2.a(super.j + this.a + 8, super.k + this.b + 16) && !var2.a(super.j + this.a + 10, super.k + this.b + 16)) {
                  super.j += this.a;
                  super.k += this.b;
                  this.a(var1);
               }
            } else if (this.a < 0 && this.b == 0) {
               if (var2.a(var1, super.j + this.a + 2, super.k + this.b + 16) == 0 && !var2.a(super.j + this.a + 2, super.k + this.b + 16)) {
                  super.j += this.a;
                  super.k += this.b;
                  this.a(var1);
               }
            } else if (this.a > 0 && this.b == 0) {
               if (var2.a(var1, super.j + this.a + 12, super.k + this.b + 16) == 0 && !var2.a(super.j + this.a + 12, super.k + this.b + 16)) {
                  super.j += this.a;
                  super.k += this.b;
                  this.a(var1);
               }
            } else if (this.a == 0 && this.b > 0 && var2.a(var1, super.j + this.a + 8, super.k + this.b + 16) == 0 && var2.a(var1, super.j + this.a + 10, super.k + this.b + 16) == 0 && !var2.a(super.j + this.a + 8, super.k + this.b + 16) && !var2.a(super.j + this.a + 10, super.k + this.b + 16)) {
               super.j += this.a;
               super.k += this.b;
               this.a(var1);
            }
         }

         PngUtil.animate(super.frame1, var3);
         if (super.d != null) {
            super.d.a(var1, var2, var3);
         }
      }

   }

   private void a(TileMap var1) {
      if (super.j < 0) {
         super.j = 0;
      } else if (super.j >= var1.mapW) {
         super.j = (short)(var1.mapW - n);
      } else if (super.k <= -8) {
         super.k = -8;
      } else if (super.k >= var1.mapH) {
         super.k = var1.mapH;
      } else {
         ((SceneEntity)this).r();
         this.u();
      }
   }

   private void u() {
      if (GlobalStatus.teamBonus != null && GlobalStatus.followStatus == 0) {
         for(int var1 = 0; var1 < GlobalStatus.teamBonus.length; ++var1) {
            if (!GlobalStatus.teamBonus[var1].b.equals(GlobalStatus.roleId_2)) {
               GlobalStatus.teamBonus[var1].f.addElement(new short[]{super.j, super.k});
            }
         }
      }

   }

   public final void a(Graphics var1, PngUtil var2, int var3, int var4, byte var5) {
      if (super.frame1 != null) {
         var2.a(var1, (Animation)super.frame1, (int[])null, var3, var4, super.j + 8, super.k + 16, 20, 0);
         if (GlobalStatus.roleNameVip != null) {
            this.w = GlobalStatus.roleNameVip;
           LoadingPage.drawString(var1, (String)this.w, (int)(super.j + 8 - var3), super.k - var4 - GlobalConfig.font2_h - super.frame1.j() + 16, 17, GlobalStatus.bs >= 0 ? '\uff00' : GlobalStatus.roleNameColor, 0);
         }

         if (GlobalStatus.roleTitle != null && !GlobalStatus.roleTitle.equals("")) {
           LoadingPage.drawString(var1, GlobalStatus.roleTitle, super.j + 8 - var3, super.k - var4 - (GlobalConfig.font2_h << 1) - super.frame1.j() + 16, 17, GlobalStatus.bs >= 0 ? '\uff00' : GlobalStatus.roleNameColor);
         }

         if (GlobalStatus.bs == 1) {
            var2.draw(var1, GameSceneController.y, (int[])null, (ImageSlice)null, var3, var4, super.j + 8 - GlobalConfig.font2.stringWidth(this.w) / 2 - GameSceneController.y.w, super.k - GlobalConfig.font2_h - 18, 20, 0);
            return;
         }

         if (GlobalStatus.bs == 0) {
            var2.draw(var1, GameSceneController.z, (int[])null, (ImageSlice)null, var3, var4, super.j + 8 - GlobalConfig.font2.stringWidth(this.w) / 2 - GameSceneController.z.w, super.k - GlobalConfig.font2_h - 18, 20, 0);
         }
      }

   }

   public final void a(byte var1) {
      if (GlobalStatus.bs != 0 || GlobalStatus.followStatus != 0) {
         super.h = var1;
         if (var1 == 0) {
            this.a = (short)(-n);
            this.b = 0;
         } else if (var1 == 2) {
            this.a = n;
            this.b = 0;
         } else if (var1 == 1) {
            this.a = 0;
            this.b = (short)(-n);
         } else if (var1 == 3) {
            this.a = 0;
            this.b = n;
         }

         this.A = false;
         if (this.x != var1 || this.y) {
            this.a(false);
            this.x = var1;
            this.y = false;
            this.A = true;
         }

      }
   }

   public final void c() {
      if (this.c.isEmpty()) {
         this.a = 0;
         this.b = 0;
         if ((this.x != super.h || !this.y || this.z != GlobalStatus.ay) && this.c.isEmpty()) {
            this.a(true);
            this.y = true;
            this.x = super.h;
            this.z = GlobalStatus.ay;
         }
      }

   }

   public final int a(MainCanvas var1) {
      if ((GlobalStatus.bs != 0 || GlobalStatus.bs == 0 && GlobalStatus.followStatus != 0) && GlobalStatus.equipmentId != null && var1.pageStatus != 1) {
         for(int var2 = 0; var2 < GlobalStatus.equipmentId.length; ++var2) {
            if (a(super.j, super.k, GlobalStatus.equipmentId[var2], GlobalStatus.equipmentDurability[var2]) || a(super.j + 8, super.k + 8, GlobalStatus.equipmentId[var2], GlobalStatus.equipmentDurability[var2])) {
               this.B = this.B == 0 ? 1 : this.B;
               if (this.B != 2 && this.B != 0) {
                  return var2;
               }

               return -1;
            }
         }
      }

      this.B = 0;
      return -1;
   }

   public final s a(Vector var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.E = (s)var1.elementAt(var2);
         if (super.frame1 == null) {
            return null;
         }

         if (this.E.d == 0 && (a(super.j + 8, super.k + 16, this.E.h, this.E.i) || a(super.j + 8, super.k, this.E.h, this.E.i))) {
            this.D = this.D == 0 ? 1 : this.D;
            return this.D != 2 && this.D != 0 ? this.E : null;
         }
      }

      this.D = 0;
      return null;
   }

   public final bv b(Vector var1) {
      if (var1 != null && super.frame1 != null) {
         for(int var2 = 0; var2 < var1.size(); ++var2) {
            this.F = (bv)var1.elementAt(var2);
            if (this.F.d != null) {
               short var10000 = super.j;
               short var10001 = super.k;
               short var10002 = super.frame1.g();
               short var10003 = super.frame1.h();
               int var10004 = this.F.e - 16;
               int var10005 = this.F.f - 16;
               int var10006 = this.F.d.g() + 32;
               int var10 = this.F.d.h() + 32;
               int var9 = var10006;
               int var8 = var10005;
               int var7 = var10004;
               short var6 = var10003;
               short var5 = var10002;
               short var4 = var10001;
               if (Math.abs(var10000 + var5 / 2 - (var7 + var9 / 2)) <= var5 / 2 + var9 / 2 && Math.abs(var4 + var6 / 2 - (var8 + var10 / 2)) <= var6 / 2 + var10 / 2) {
                  return this.F;
               }
            }
         }
      }

      return null;
   }

   private static boolean a(int var0, int var1, int var2, int var3) {
      return var0 >> 4 == var2 >> 4 && var1 >> 4 == var3 >> 4;
   }

   public final void d() {
      this.B = 2;
   }

   public final boolean e() {
      return this.B == 1;
   }

   public final void f() {
      this.D = 2;
   }

   public final boolean g() {
      return this.D == 1;
   }

   public final void a(int var1) {
      if (var1 == 1) {
         this.C = true;
      } else {
         if (var1 == 0) {
            this.C = false;
         }

      }
   }

   public final boolean h() {
      return this.C;
   }

   public final void i() {
      this.C = false;
   }

   public final void a(short var1, short var2) {
      if (!this.c.isEmpty()) {
         this.c.removeAllElements();
         this.a(false);
      }

      super.j = var1;
      super.k = var2;
   }

   public final void j() {
      if (GlobalStatus.bs != 0 || GlobalStatus.followStatus != 0) {
         if (this.c.size() > 0) {
            int var3;
            if ((var3 = this.c.size() - 1) >= 0) {
               short[] var1 = (short[])this.c.elementAt(var3);
               short[] var2;
               if (var3 - 1 > 0) {
                  var2 = (short[])this.c.elementAt(var3 - 1);
               } else {
                  var2 = (short[])this.c.elementAt(0);
               }

               if (var2[0] != var1[0]) {
                  if (var2[0] > var1[0]) {
                     super.h = 2;
                  } else {
                     super.h = 0;
                  }

                  this.a(false);
                  if (this.x != super.h) {
                     this.A = true;
                  } else {
                     this.A = false;
                  }
               } else if (var2[1] != var1[1]) {
                  if (var2[1] > var1[1]) {
                     super.h = 3;
                  } else {
                     super.h = 1;
                  }

                  this.a(false);
                  if (this.x != super.h) {
                     this.A = true;
                  } else {
                     this.A = false;
                  }
               } else {
                  this.a(false);
                  if (this.x != super.h) {
                     this.A = true;
                  } else {
                     this.A = false;
                  }
               }

               if (!this.A) {
                  super.j = var2[0];
                  super.k = var2[1];
                  ((SceneEntity)this).r();
                  this.u();
                  this.c.removeElementAt(var3);
                  this.y = false;
               }

               this.x = super.h;
            }

         } else {
            this.a(true);
            this.c.removeAllElements();
         }
      }
   }

   public final bl a(bl[] var1) {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            this.H = var1[var2];
            if (super.frame1 == null) {
               return null;
            }

            if ((this.H.u == 2 || this.H.u == 3) && (a(super.j + super.frame1.g() / 2, super.k + 16 - super.frame1.h(), this.H.j, this.H.k) || a(super.j + super.frame1.g() / 2, super.k + 32 - super.frame1.h(), this.H.j, this.H.k))) {
               this.G = this.G == 0 ? 1 : this.G;
               if (this.G != 2 && this.G != 0) {
                  return this.H;
               }

               return null;
            }
         }
      }

      this.G = 0;
      return null;
   }

   public final void k() {
      this.G = 2;
   }

   public final boolean l() {
      return this.G == 1;
   }
}

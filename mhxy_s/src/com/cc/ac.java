package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class ac extends ar {
   private static short n = 4;
   public short a;
   public short b;
   private short o = -1;
   private short p;
   private short q;
   private short r;
   private short s = -1;
   private String t = "";
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
      this.s = (short) bt_1.ay;
      this.t = bt_1.nn;
      this.s();
      this.a(false);
      this.t();
   }

   private void s() {
      this.u[1] = Page.a((String) MainCanvas.a(bt_1.ax, bt_1.aj, (byte)1, bt_1.ay, false, bt_1.nn), (byte)2);
      this.v[1] = Page.a((String) MainCanvas.a(bt_1.ax, bt_1.aj, (byte)1, bt_1.ay, true, bt_1.nn), (byte)2);
      this.u[3] = Page.a((String) MainCanvas.a(bt_1.ax, bt_1.aj, (byte)3, bt_1.ay, false, bt_1.nn), (byte)2);
      this.v[3] = Page.a((String) MainCanvas.a(bt_1.ax, bt_1.aj, (byte)3, bt_1.ay, true, bt_1.nn), (byte)2);
      this.u[0] = Page.a((String) MainCanvas.a(bt_1.ax, bt_1.aj, (byte)0, bt_1.ay, false, bt_1.nn), (byte)2);
      this.v[0] = Page.a((String) MainCanvas.a(bt_1.ax, bt_1.aj, (byte)0, bt_1.ay, true, bt_1.nn), (byte)2);
      this.u[2] = Page.a((String) MainCanvas.a(bt_1.ax, bt_1.aj, (byte)2, bt_1.ay, false, bt_1.nn), (byte)2);
      this.v[2] = Page.a((String) MainCanvas.a(bt_1.ax, bt_1.aj, (byte)2, bt_1.ay, true, bt_1.nn), (byte)2);
   }

   public final void a() {
      this.t();
   }

   public final void a(boolean var1) {
      if (this.s != bt_1.ay) {
         this.s = (short) bt_1.ay;
         this.s();
      } else if (!this.t.equals(bt_1.nn)) {
         this.t = bt_1.nn;
         this.s();
      }

      short var2;
      short var3;
      short var4;
      if (!bt_1.nn.equals("") && t_1.hasRideRes) {
         var2 = bt_1.no;
         var3 = bt_1.nq;
         var4 = bt_1.np;
      } else {
         var4 = 0;
         var3 = 0;
         var2 = 0;
      }

      super.g = MainCanvas.ab.a(var1 ? this.v[super.h] : this.u[super.h], var2, var3, var4);
      if (super.g == null) {
         MainCanvas.a(bt_1.ax, bt_1.aj, (byte)5, bt_1.ay, this.t, var2, var3, var4);
         super.g = MainCanvas.ab.a(var1 ? this.v[super.h] : this.u[super.h], var2, var3, var4);
         if (super.g == null) {
            bt_1.ay = 0;
            this.s();
            super.g = MainCanvas.ab.c(var1 ? this.v[super.h] : this.u[super.h]);
            if (super.g == null) {
               MainCanvas.a(bt_1.ax, bt_1.aj, (byte)5, bt_1.ay, this.t, var2, var3, var4);
               super.g = MainCanvas.ab.c(var1 ? this.v[super.h] : this.u[super.h]);
               return;
            }
         }
      } else if (!bt_1.nn.equals("")) {
         super.g.a = bt_1.no;
         super.g.b = bt_1.nq;
         super.g.c = bt_1.np;
      }

   }

   public final void b() {
      this.a(false);
   }

   private void t() {
      if (bt_1.be <= 0 && super.d != null) {
         au var1;
         if ((var1 = super.d).e != null) {
            var1.e.removeAllElements();
            var1.e = null;
         }

         if (var1.f != null) {
            Frame1 var2 = var1.f;
         }

         var1.f = null;
         super.d = null;
      }

      if (bt_1.be > 0) {
         if (super.d == null || this.o != bt_1.be || this.p != bt_1.bp || this.q != bt_1.bq || this.r != bt_1.br) {
            this.o = bt_1.be;
            this.p = bt_1.bp;
            this.q = bt_1.bq;
            this.r = bt_1.br;
            super.d = new au((byte)1, bt_1.be, bt_1.bp, bt_1.bq, bt_1.br);
         }

         if (super.d.h == 0 && super.d.i == 0) {
            super.d.h = super.j;
            super.d.i = super.k;
         }

         super.d.a(super.h);
      }

   }

   public final void a(aw var1, PngUtil var2, long var3) {
      if (super.g != null && var1 != null) {
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

         PngUtil.a(super.g, var3);
         if (super.d != null) {
            super.d.a(var1, var2, var3);
         }
      }

   }

   private void a(aw var1) {
      if (super.j < 0) {
         super.j = 0;
      } else if (super.j >= var1.a) {
         super.j = (short)(var1.a - n);
      } else if (super.k <= -8) {
         super.k = -8;
      } else if (super.k >= var1.b) {
         super.k = var1.b;
      } else {
         ((ar)this).r();
         this.u();
      }
   }

   private void u() {
      if (bt_1.q != null && bt_1.s == 0) {
         for(int var1 = 0; var1 < bt_1.q.length; ++var1) {
            if (!bt_1.q[var1].b.equals(bt_1.ad)) {
               bt_1.q[var1].f.addElement(new short[]{super.j, super.k});
            }
         }
      }

   }

   public final void a(Graphics var1, PngUtil var2, int var3, int var4, byte var5) {
      if (super.g != null) {
         var2.a(var1, (Frame1)super.g, (int[])null, var3, var4, super.j + 8, super.k + 16, 20, 0);
         if (bt_1.ag != null) {
            this.w = bt_1.ag;
           LoadingPage.a(var1, (String)this.w, (int)(super.j + 8 - var3), super.k - var4 - t_1.j- super.g.j() + 16, 17, bt_1.bs >= 0 ? '\uff00' : bt_1.ai, 0);
         }

         if (bt_1.ah != null && !bt_1.ah.equals("")) {
           LoadingPage.a(var1, bt_1.ah, super.j + 8 - var3, super.k - var4 - (t_1.j<< 1) - super.g.j() + 16, 17, bt_1.bs >= 0 ? '\uff00' : bt_1.ai);
         }

         if (bt_1.bs == 1) {
            var2.a(var1, ao_1.y, (int[])null, (aj)null, var3, var4, super.j + 8 - t_1.i.stringWidth(this.w) / 2 - ao_1.y.b, super.k - t_1.j- 18, 20, 0);
            return;
         }

         if (bt_1.bs == 0) {
            var2.a(var1, ao_1.z, (int[])null, (aj)null, var3, var4, super.j + 8 - t_1.i.stringWidth(this.w) / 2 - ao_1.z.b, super.k - t_1.j- 18, 20, 0);
         }
      }

   }

   public final void a(byte var1) {
      if (bt_1.bs != 0 || bt_1.s != 0) {
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
         if ((this.x != super.h || !this.y || this.z != bt_1.ay) && this.c.isEmpty()) {
            this.a(true);
            this.y = true;
            this.x = super.h;
            this.z = bt_1.ay;
         }
      }

   }

   public final int a(MainCanvas var1) {
      if ((bt_1.bs != 0 || bt_1.bs == 0 && bt_1.s != 0) && bt_1.ab != null && var1.touchPageCase != 1) {
         for(int var2 = 0; var2 < bt_1.ab.length; ++var2) {
            if (a(super.j, super.k, bt_1.ab[var2], bt_1.ac[var2]) || a(super.j + 8, super.k + 8, bt_1.ab[var2], bt_1.ac[var2])) {
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
         if (super.g == null) {
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
      if (var1 != null && super.g != null) {
         for(int var2 = 0; var2 < var1.size(); ++var2) {
            this.F = (bv)var1.elementAt(var2);
            if (this.F.d != null) {
               short var10000 = super.j;
               short var10001 = super.k;
               short var10002 = super.g.g();
               short var10003 = super.g.h();
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
      if (bt_1.bs != 0 || bt_1.s != 0) {
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
                  ((ar)this).r();
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
            if (super.g == null) {
               return null;
            }

            if ((this.H.u == 2 || this.H.u == 3) && (a(super.j + super.g.g() / 2, super.k + 16 - super.g.h(), this.H.j, this.H.k) || a(super.j + super.g.g() / 2, super.k + 32 - super.g.h(), this.H.j, this.H.k))) {
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

package com.cc;

import com.yinhan.kjava.main.a_MainCanvas;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class c_1 extends al {
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private short m;
   private short n;
   private short o;
   private String p;
   private String q;
   private Image[] r;
   private String[] s;
   private String[] t;
   private String[] u;
   private short[] v;
   private short[] w;
   private int[] x = null;
   private byte y;
   private byte z;
   private byte A = 0;
   private boolean B = true;
   private boolean C;
   private boolean D = false;
   private boolean E = false;

   public final void a(String[] var1, String[] var2, String[] var3) {
      this.a((Image[])null, var1, (short[])null, (String[])null, var3);
   }

   public final void a(Image[] var1, String[] var2, String[] var3, String[] var4) {
      this.a(var1, var2, (short[])null, var3, var4);
   }

   private void a(Image[] var1, String[] var2, short[] var3, String[] var4, String[] var5) {
      this.j();
      this.r = var1;
      this.s = var2;
      this.t = var4;
      this.u = var5;
      this.v = null;
      this.C = true;
      this.D = false;
      this.e = 0;
      this.f = 0;
      this.z = 0;
      this.i = t.j;
      this.h = var2 == null ? 0 : var2.length;
      this.g = Math.min(this.h + this.z, (this.d - 8) / this.i);
   }

   public final int a() {
      return this.a;
   }

   public final int b() {
      return this.b;
   }

   public final int c() {
      return this.c;
   }

   public final int d() {
      return this.d;
   }

   public final int e() {
      return this.i;
   }

   public final int f() {
      return this.g;
   }

   public final int g() {
      return this.f;
   }

   public final int h() {
      return this.e;
   }

   public final int i() {
      return this.f - this.e;
   }

   public final void a(boolean var1) {
      this.E = var1;
   }

   public final void a(Image[] var1) {
      this.r = var1;
   }

   public final void b(boolean var1) {
      this.C = false;
   }

   public final void a(String var1) {
      this.p = var1;
      this.z = 1;
   }

   public final void a(String var1, int var2) {
      ca.l = 0;
      this.q = var1;
      this.y = (byte)var2;
   }

   public final void a(int var1) {
      this.f = var1;

      for(this.g = Math.min(this.h + this.z, (this.d - 8) / this.i); this.e < this.f && this.f - this.e + 1 > this.g; ++this.e) {
      }

      if (this.e > this.h || this.f > this.h) {
         this.e = 0;
         this.f = 0;
      }

   }

   public final void a(int var1, int var2) {
      this.e = var1;
      this.f = var2;
      if (this.f == this.h - 1 + this.z) {
         this.e = Math.max(0, this.f - this.g + 1);
      }

      if (this.e > this.h || this.f > this.h) {
         this.e = 0;
         this.f = 0;
      }

   }

   public final void a(short[] var1) {
      this.v = var1;
   }

   public final void b(short[] var1) {
      this.w = var1;
   }

   public final void a(int[] var1) {
      this.x = var1;
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final void b(int var1) {
      if (var1 != 1 && var1 != 514) {
         if (var1 == 4 || var1 == 520) {
            if (this.s != null) {
               this.f = this.f >= this.s.length - 1 + this.z ? 0 : ++this.f;
               this.e = this.f - this.e >= this.g ? ++this.e : (this.f == 0 ? 0 : this.e);
            }

            this.B = true;
         }

      } else {
         if (this.s != null) {
            this.f = this.f <= 0 ? this.s.length - 1 + this.z : --this.f;
            if (this.e > 0 && this.e + this.z > this.f) {
               --this.e;
            }

            if (this.f == this.s.length - 1 + this.z) {
               this.e = this.f - this.g + 1;
            }
         }

         this.B = true;
      }
   }

   public final int b(int var1, int var2) {
      if (var1 >= this.a + this.c - 2 - a_MainCanvas.C.b && var1 <= this.a + this.c && var2 >= this.b + 3 && var2 <= this.b + 3 + a_MainCanvas.C.c) {
         return 1;
      } else if (var1 >= this.a + this.c - 2 - a_MainCanvas.D.b && var1 <= this.a + this.c && var2 >= this.b + this.d - 2 - a_MainCanvas.D.c && var2 <= this.b + this.d) {
         return 4;
      } else {
         var2 = var2;
         var1 = var1;
         this = this;

         for(int var3 = 0; var3 < this.g; ++var3) {
            if (var1 > this.a + 4 && var1 < this.a + this.c - 8 && var2 > this.b + 4 + var3 * this.i && var2 < this.b + 4 + (var3 + 1) * this.i) {
               if (this.f == this.e + var3) {
                  return 1073741824;
               }

               this.B = true;
               this.f = this.e + var3 - 1;
               return 4;
            }
         }

         return 0;
      }
   }

   public final void j() {
      this.s = null;
      this.t = null;
      this.u = null;
      this.x = null;
      this.p = null;
      this.r = null;
      this.q = null;
      this.v = null;
      this.w = null;
   }

   public final void a(Graphics var1) {
      this.g = Math.min(this.h + this.z, (this.d - 8) / this.i);
      ca.a(var1, 6014420);
      var1.setClip(0, 0, t.b, t.c);
      var1.fillRect(this.a, this.b, this.c, this.d);
      ca.a(var1, this.a, this.b, this.c, this.d, 1);
      if (this.E) {
         ca.a(var1);
      }

      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;

      for(int var6 = this.e - this.z; var5 < this.g && var6 < this.h; ++var6) {
         var1.setClip(this.a, this.b, this.c, this.d);
         if (this.f == var6 + this.z) {
            ca.a(var1, 9);
            var1.fillRect(this.a + 4, this.b + 4 + var5 * this.i, this.c - 11, this.i);
         }

         if (var6 + this.z == this.e && this.p != null) {
            var1.setColor(16776960);
            var1.drawString(this.p, this.a + 6, this.b + 4 + var5 * this.i, 20);
         } else {
            var3 = var4 = this.A = 0;
            if (this.r != null && this.r[var6] != null) {
               this.A = (byte)this.r[var6].getWidth();
               var1.drawImage(this.r[var6], this.a + 4, this.b + 4 + var5 * this.i + (this.i - this.r[var6].getHeight()) / 2, 20);
               if (this.C) {
                  var1.setColor(16515586);
                  var1.drawRect(this.a + 4, this.b + 4 + var5 * this.i + (this.i - this.r[var6].getHeight()) / 2, this.r[var6].getWidth(), this.r[var6].getHeight());
               }
            }

            var2 = (var2 = 0 + this.A + (this.v != null && this.v[var6] > 0 ? 16 : 0)) + (this.w != null && this.w[var6] > 0 ? 18 : 0);
            if (this.s[var6] != null) {
               var2 += t.i.stringWidth(this.s[var6]);
            }

            if (this.t != null && this.t[var6] != null) {
               var3 = t.i.stringWidth(this.t[var6]);
            }

            if (this.u != null && this.u[var6] != null) {
               var4 = t.i.stringWidth(this.u[var6]);
            }

            this.m = (short)(this.a + 4 + var2 + Math.max(4, this.c - var2 - var3 - var4 - 20 >> 1));
            this.n = (short)(this.m + var3 + Math.max(4, this.c - var2 - var3 - var4 - 20 >> 1));
            this.o = (short)(this.f == var6 + this.z ? this.n + var4 : 0);
            var1.setClip(this.a + 4 + this.A, this.b, this.c - 6 - this.A - 12, this.d);
            if (this.s != null && this.s[var6] != null) {
               if (ca.a(this.s[var6]) != -1) {
                  var1.setColor(this.f == var6 + this.z ? 16777215 : ca.a(this.s[var6]));
                  this.a(var1, this.s[var6].substring(3), this.a + 6 + this.A, this.b + 4 + var5 * this.i, this.o > this.a + this.c - 12);
               } else {
                  var1.setColor(this.f == var6 + this.z ? 16777215 : (this.x != null ? this.x[var6] : 2176196));
                  this.a(var1, this.s[var6], this.a + 6 + this.A, this.b + 4 + var5 * this.i, this.o > this.a + this.c - 12);
               }
            }

            if (this.v != null && this.v[var6] > 0) {
               this.a(var1, this.a + 4 + this.A + t.i.stringWidth(this.s[var6]) + 2, this.b + 4 + var5 * this.i, a_MainCanvas.d(this.v[var6]));
            }

            if (this.w != null && this.w[var6] > 0) {
               this.a(var1, this.a + 4 + var2 - 18, this.b + 4 + var5 * this.i, a_MainCanvas.c(this.w[var6]));
            }

            if (this.t != null && this.t[var6] != null) {
               this.a(var1, this.t[var6], this.m, this.b + 4 + var5 * this.i, this.o > this.a + this.c - 12);
            }

            if (this.u != null && this.u[var6] != null) {
               if (this.n + var4 < this.a + this.c - 12) {
                  var1.drawString(this.u[var6], this.a + this.c - 16, this.b + 4 + var5 * this.i, 24);
               } else {
                  this.a(var1, this.u[var6], this.n, this.b + 4 + var5 * this.i, this.o > this.a + this.c - 12);
               }
            }

            if (this.f == var6 + this.z && this.o > this.a + this.c - 12) {
               if (this.B) {
                  this.B = false;
                  this.k = 0;
                  this.l = this.o + 10;
               }

               if (this.k + this.o >= 0) {
                  --this.k;
                  --this.l;
               } else {
                  this.k = this.l;
                  this.l = this.k + this.o + 10;
               }
            }
         }

         ++var5;
      }

      if (this.g > 0) {
         var1.setClip(0, 0, t.b, t.c);
         if (a_MainCanvas.C != null) {
            this.j = 0;
            if (this.g < this.h && this.h != 0) {
               this.j = this.g * (this.d - 16) / this.h > 6 ? this.g * (this.d - 16) / this.h : 6;
            }

            ca.a(var1, this.a + this.c - 2 - a_MainCanvas.C.b, this.b + 3, this.d - 5, this.j, this.e, this.h, this.g - this.z);
         }

         ca.b(var1, this.q, this.a + 5, this.b + (this.f - this.e + 1) * this.i, this.b + this.d, this.y);
      }

   }

   private void a(Graphics var1, int var2, int var3, Image var4) {
      if (var4 != null) {
         if (this.o > this.a + this.c - 12) {
            var1.drawImage(var4, this.k + var2, var3 + (this.i - var4.getHeight()) / 2, 20);
            var1.drawImage(var4, this.l + var2, var3 + (this.i - var4.getHeight()) / 2, 20);
            return;
         }

         var1.drawImage(var4, var2, var3 + (this.i - var4.getHeight()) / 2, 20);
      }

   }

   private void a(Graphics var1, String var2, int var3, int var4, boolean var5) {
      if (var5) {
         var1.drawString(var2, this.k + var3, var4, 20);
         var1.drawString(var2, this.l + var3, var4, 20);
      } else {
         var1.drawString(var2, var3, var4, 20);
      }
   }
}

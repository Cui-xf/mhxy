package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class an_1 extends al {
   private byte g = 1;
   private int h = 0;
   public int a = 0;
   private boolean i;
   private boolean j;
   private boolean k;
   public int b;
   public int c;
   public int d;
   public int e;
   private Font l;
   private String m;
   private String[] n;
   private int o;
   private int p;
   private int q;
   private boolean r = false;
   private String s;
   private TextRender t;
   private String u = "\t";
   private int v = 2176196;
   private int[][] w = new int[2][4];
   public boolean f = false;
   private byte x;
   private int y;

   public an_1() {
      boolean var1 = false;
      this.i = false;
      var1 = true;
      this.j = true;
      var1 = false;
      this.k = false;
      this.b((byte)1);
      this.r = false;
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final void b(int var1) {
      label268: {
         an_1 var10000;
         int var10001;
         if (this.r) {
            if (this.s == null || this.s.equals("")) {
               this.o = 0;
               this.t = null;
               break label268;
            }

            this.t = new TextRender(this.s, (short)(this.d - 8 - MainCanvas.C.b));
            var10000 = this;
            var10001 = this.t.a();
         } else {
            if (this.m != null && !this.m.equals("")) {
               this.n = LoadingPage.a(this.m, this.l, this.d - 8 - MainCanvas.C.b, this.u);
               this.v = LoadingPage.a(this.n[0]) != -1 ? LoadingPage.a(this.n[0]) : 2176196;
               if (this.v != 2176196) {
                  this.n[0] = this.n[0].substring(3, this.n[0].length());
               }
            } else {
               this.n = null;
            }

            var10000 = this;
            var10001 = this.n == null ? 0 : this.n.length;
         }

         var10000.o = var10001;
      }

      this.p = (this.e - 6) / this.y;
      if (this.o > this.p) {
         this.q = this.p * (this.e - 16) / this.o > 6 ? this.p * (this.e - 16) / this.o : 6;
      } else {
         this.q = 0;
      }

      if (this.x == 0 && (var1 == 1 || var1 == 514) || this.x == 1 && var1 == 515) {
         an_1 var3 = this;
         if (this.g == 0) {
            if (this.h == 0) {
               this.a = this.o % this.p == 0 ? this.o - this.p : this.o - this.o % this.p;
            }

            for(this.h = this.h == 0 ? this.o - 1 : this.h - 1; var3.a > 0 && var3.q != 0 && var3.h - var3.a + 1 < var3.p; --var3.a) {
            }
         } else if (this.g == 1) {
            if (this.h <= this.p - 1) {
               this.a = this.o % this.p == 0 ? this.o - this.p : this.o - this.o % this.p;
            }

            for(this.h = this.h <= this.p - 1 ? this.o - 1 : this.h - 1; var3.a > 0 && var3.q != 0 && var3.h - var3.a + 1 < var3.p; --var3.a) {
            }
         } else if (this.g == 2 && this.o > this.p) {
            if (this.a == 0) {
               this.a = this.o - this.p;
               this.h = this.o - 1;
            } else {
               this.a = this.a - this.p <= 0 ? 0 : this.a - this.p;
               if (this.a == 0) {
                  this.h = this.p - 1;
               } else {
                  this.h = this.a + this.p - 1;
               }
            }
         }
      } else if (this.x == 0 && (var1 == 4 || var1 == 520) || this.x == 1 && var1 == 521) {
         an_1 var2 = this;
         if (this.g == 0) {
            if (this.h == this.o - 1) {
               this.a = 0;
            }

            for(this.h = this.h == this.o - 1 ? 0 : this.h + 1; var2.a < var2.h && var2.q != 0 && var2.h - var2.a + 1 > var2.p; ++var2.a) {
            }
         } else if (this.g == 1) {
            if (this.h == this.o - 1) {
               this.a = 0;
            }

            for(this.h = this.h == this.o - 1 ? this.p - 1 : (this.h <= this.p - 1 ? this.p : this.h + 1); var2.a < var2.h && var2.q != 0 && var2.h - var2.a + 1 > var2.p; ++var2.a) {
            }
         } else if (this.g == 2 && this.o > this.p) {
            if (this.a == this.o - this.p) {
               this.a = 0;
               this.h = this.p - 1;
            } else {
               this.a = this.a + this.p >= this.o - this.p ? this.o - this.p : this.a + this.p;
               if (this.a == this.o - this.p) {
                  this.h = this.o - 1;
               } else {
                  this.h = this.a + this.p - 1;
               }
            }
         }
      }

      while(this.h > this.o - 1) {
         --this.h;
         --this.a;
      }

      while(this.a > 0 && this.q != 0 && this.h - this.a + 1 < this.p) {
         --this.a;
      }

      while(this.a < this.h && this.q != 0 && this.h - this.a + 1 > this.p) {
         ++this.a;
      }

      if (this.q == 0 && this.a != 0) {
         this.a = 0;
      }

   }

   public final int b(int var1, int var2) {
      if (this.a(var1, var2, 0)) {
         return this.x == 0 ? 1 : 515;
      } else if (this.a(var1, var2, 1)) {
         return this.x == 0 ? 4 : 521;
      } else {
         return 0;
      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.w[0][0] = var1;
      this.w[0][1] = var2;
      this.w[0][2] = var5;
      this.w[0][3] = var6;
      this.w[1][0] = var3;
      this.w[1][1] = var4;
      this.w[1][2] = var5;
      this.w[1][3] = var6;
   }

   private boolean a(int var1, int var2, int var3) {
      if (var3 == 0) {
         if (var1 >= this.w[0][0] && var1 <= this.w[0][0] + this.w[0][2] && var2 >= this.w[0][1] && var2 <= this.w[0][1] + this.w[0][3]) {
            return true;
         }
      } else if (var3 == 1 && var1 >= this.w[1][0] && var1 <= this.w[1][0] + this.w[1][2] && var2 >= this.w[1][1] && var2 <= this.w[1][1] + this.w[1][3]) {
         return true;
      }

      return false;
   }

   public final void a(String var1, Font var2, byte var3) {
      this.y = var2.getHeight();
      this.h = 0;
      this.a = 0;
      this.l = var2;
      this.s = var1;
      this.t = null;
      this.b(var3);
      byte var4 = 0;
      this.x = var4;
      this.r = true;
      this.u = "\t";
      this.m = null;
      this.n = null;
   }

   public final void b(String var1, Font var2, byte var3) {
      this.y = var2.getHeight();
      this.h = 0;
      this.a = 0;
      this.l = var2;
      this.m = var1;
      this.b(var3);
      byte var4 = 0;
      this.x = var4;
      this.u = "\t";
      this.r = false;
      this.s = null;
      this.t = null;
   }

   public final void a(Graphics var1) {
      if (this.i) {
         LoadingPage.a(var1, 6014420);
         var1.fillRect(this.b, this.c, this.d, this.e);
      }

      if (this.j) {
         LoadingPage.a(var1, this.b, this.c, this.d, this.e, 1);
         if (this.f) {
            LoadingPage.a(var1);
         }
      }

      if (!this.r && this.n != null) {
         for(int var3 = this.a; var3 < this.n.length && var3 < this.a + this.p; ++var3) {
            if (var3 == this.h && this.k) {
               LoadingPage.a(var1, 9);
               if (this.h >= this.p) {
                  var1.fillRect(this.b + 4, this.c + 4 + (this.p - 1) * this.y, this.d - MainCanvas.C.b - 8, this.y);
               } else {
                  var1.fillRect(this.b + 4, this.c + 4 + this.h * this.y, this.d - MainCanvas.C.b - 8, this.y);
               }
            }

            if (var3 == this.h && this.g == 0) {
               LoadingPage.a(var1, this.n[var3], this.b + 4, this.c + 4 + (var3 - this.a) * this.y, 20, 13500379);
            } else {
               LoadingPage.a(var1, this.n[var3], this.b + 4, this.c + 4 + (var3 - this.a) * this.y, 20, this.v);
            }
         }

         if (this.q > 0) {
            LoadingPage.a(var1, this.b + this.d - 2 - MainCanvas.C.b, this.c + 3, this.e - 5, this.q, this.a, this.o, this.p);
            this.a(this.b + this.d - 2 - MainCanvas.C.b, this.c + 3, this.b + this.d - 2 - MainCanvas.C.b, this.c + 3 + this.e - 5 - MainCanvas.D.c, MainCanvas.D.b, MainCanvas.D.c);
            return;
         }
      } else if (this.r && this.t != null) {
         for(int var2 = this.a; var2 < this.t.a() && var2 < this.a + this.p; ++var2) {
            this.t.a(var1, this.b + 4, this.c + 4 + (var2 - this.a) * this.y, var2, 0);
         }

         if (this.q > 0) {
            LoadingPage.a(var1, this.b + this.d - 2 - MainCanvas.C.b, this.c + 3, this.e - 5, this.q, this.a, this.o, this.p);
            this.a(this.b + this.d - 2 - MainCanvas.C.b, this.c + 3, this.b + this.d - 2 - MainCanvas.C.b, this.c + 3 + this.e - 5 - MainCanvas.D.c, MainCanvas.D.b, MainCanvas.D.c);
         }
      }

   }

   private void b(byte var1) {
      this.g = var1;
      if (var1 == 1) {
         an_1 var10000 = this;
         boolean var2 = false;
         var10000.k = false;
      }

   }

   public final void j() {
      if (this.n != null) {
         for(short var1 = 0; var1 < this.n.length; ++var1) {
            this.n[var1] = null;
         }

         this.n = null;
      }

      this.s = null;
      this.t = null;
   }

   public final void a(byte var1) {
      this.x = var1;
   }
}

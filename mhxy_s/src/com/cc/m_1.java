package com.cc;

import com.yinhan.kjava.main.a_MainCanvas;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class m_1 extends al {
   private int h = 16776917;
   private String i;
   private boolean j = false;
   private boolean k = true;
   public int a = 0;
   public int b = 0;
   public int c;
   public int d;
   private Vector l = new Vector();
   private int m;
   private int n;
   private int o;
   private int p;
   private int[] q = null;
   public int e = 0;
   public int f = 0;
   public int g = 0;
   private int r = 0;
   private int s = 0;
   private int t = -1;
   private int u = -1;
   private int v = -1;
   private int w = -1;
   private int x = -1;
   private boolean y = false;

   public final void a(boolean var1) {
      this.j = var1;
   }

   public final void a(String var1) {
      this.i = var1;
      if (var1 == null) {
         this.q = null;
      } else {
         this.q = new int[4];
      }

      this.r = 0;
      this.s = 0;
   }

   public final int a() {
      return this.n + this.p + 3;
   }

   private void b(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.s = this.b + 5;
      if (this.i != null && a_MainCanvas.v != null) {
         var4 = a_MainCanvas.v.c;
         var3 = this.c;
         var2 = this.s;
         var1 = this.a;
         if (this.i != null) {
            this.m = var1;
            this.n = var2;
            this.o = var3;
            this.p = var4;
            this.s = this.s + this.p + 3;
         }
      }

   }

   public final int a(int var1) {
      this.r = var1;
      return this.r;
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.b(var1, var2, var3, var4);
      this.c();
      if (this.t != -1) {
         ((n_1)this.l.elementAt(this.t)).a(this.a + 5, this.s, this.c - 20, t_1.j + 3);
         this.s += t_1.j;
      }

      if (this.u != -1 && this.v == -1) {
         var1 = this.b + this.d - this.s - 6 - (this.w != -1 ? t_1.j + 4 : 0) - (this.x != -1 ? a_MainCanvas.E.c : 0) - this.e;
         ((c_1)this.l.elementAt(this.u)).a(this.a + 5, this.s + this.e, this.c - 11, var1 - this.f);
         this.s += var1;
      } else if (this.u == -1 && this.v != -1) {
         var1 = this.b + this.d - this.s - 6 - (this.w != -1 ? t_1.j + 4 : 0) - (this.x != -1 ? a_MainCanvas.E.c : 0) - this.r;
         ((an_1)this.l.elementAt(this.v)).a(this.a + 5, this.s + this.r, this.c - 11, var1 - this.g);
         this.s += var1;
      } else if (this.u != -1 && this.v != -1) {
         var2 = (var1 = this.b + this.d - this.s - 6 - (this.w != -1 ? t_1.j + 4 : 0) - (this.x != -1 ? a_MainCanvas.E.c : 0) - this.e) / 2;
         this.s += this.e;
         ((c_1)this.l.elementAt(this.u)).a(this.a + 5, this.s, this.c - 11, var2);
         this.s += var2;
         var1 -= var2;
         ((an_1)this.l.elementAt(this.v)).a(this.a + 5, this.s, this.c - 11, var1);
      }

      if (this.w != -1) {
         bm var10000 = (bm)this.l.elementAt(this.w);
         int var10001 = this.a + 6;
         int var10002 = this.b;
         int var10003 = this.c - 13;
         int var5 = this.d - 6;
      } else {
         if (this.x != -1) {
            ((l_1)this.l.elementAt(this.x)).a(this.a, this.b, this.c, this.d - 5);
         }

      }
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.b(var1, var2, var3, var4);
      this.c();
      if (this.t != -1) {
         ((n_1)this.l.elementAt(this.t)).a(this.a + 5, this.s, this.c - 20, t_1.j + 3);
         this.s += t_1.j;
      }

      if (this.u != -1 && this.v == -1) {
         var1 = this.b + this.d - this.s - 6 - (this.w != -1 ? t_1.j + 4 : 0) - (this.x != -1 ? a_MainCanvas.E.c : 0) - this.e;
         ((c_1)this.l.elementAt(this.u)).a(this.a + 5, this.s + this.e, this.c - 11, var1 - this.f);
         this.s += var1;
      } else if (this.u == -1 && this.v != -1) {
         var1 = this.b + this.d - this.s - 6 - (this.w != -1 ? t_1.j + 4 : 0) - (this.x != -1 ? a_MainCanvas.E.c : 0) - this.r;
         ((an_1)this.l.elementAt(this.v)).a(this.a + 5, this.s + this.r, this.c - 11, var1 - this.g);
         this.s += var1;
      } else if (this.u != -1 && this.v != -1) {
         var2 = (var1 = this.b + this.d - this.s - 6 - (this.w != -1 ? t_1.j + 4 : 0) - (this.x != -1 ? a_MainCanvas.E.c : 0) - this.e) * var5 / var6;
         this.s += this.e;
         if (var7) {
            ((an_1)this.l.elementAt(this.v)).a(this.a + 5, this.s, this.c - 11, var2);
            this.s += var2;
            var1 -= var2;
            ((c_1)this.l.elementAt(this.u)).a(this.a + 5, this.s, this.c - 11, var1);
         } else {
            ((c_1)this.l.elementAt(this.u)).a(this.a + 5, this.s, this.c - 11, var2);
            this.s += var2;
            var1 -= var2;
            ((an_1)this.l.elementAt(this.v)).a(this.a + 5, this.s, this.c - 11, var1);
         }
      }

      if (this.w != -1) {
         bm var10000 = (bm)this.l.elementAt(this.w);
         int var10001 = this.a + 6;
         int var10002 = this.b;
         int var10003 = this.c - 13;
         int var8 = this.d - 6;
      } else {
         if (this.x != -1) {
            ((l_1)this.l.elementAt(this.x)).a(this.a, this.b, this.c, this.d - 5);
         }

      }
   }

   public final void a(al var1) {
      this.l.addElement(var1);
   }

   public final void b() {
      this.i = null;
      this.j = false;
      this.r = 0;
      this.e = 0;
      this.f = 0;
      this.g = 0;
      this.l.removeAllElements();
   }

   public final void b(int var1) {
      for(int var2 = 0; var2 < this.l.size(); ++var2) {
         ((al)this.l.elementAt(var2)).b(var1);
      }

   }

   public final int b(int var1, int var2) {
      if (this.q != null && var1 >= this.q[0] && var1 <= this.q[0] + this.q[2] && var2 >= this.q[1] && var2 <= this.q[1] + this.q[3]) {
         return 536870912;
      } else {
         for(int var3 = 0; var3 < this.l.size(); ++var3) {
            if (((al)this.l.elementAt(var3)).b(var1, var2) != 0) {
               return ((al)this.l.elementAt(var3)).b(var1, var2);
            }
         }

         return 0;
      }
   }

   private void c() {
      this.t = -1;
      this.u = -1;
      this.v = -1;
      this.w = -1;
      this.x = -1;

      for(int var1 = 0; var1 < this.l.size(); ++var1) {
         Object var2;
         if ((var2 = this.l.elementAt(var1)) instanceof n_1) {
            this.t = var1;
         } else if (var2 instanceof c_1) {
            this.u = var1;
         } else if (var2 instanceof an_1) {
            this.v = var1;
         } else if (var2 instanceof bm) {
            this.w = var1;
         } else if (var2 instanceof l_1) {
            this.x = var1;
         }
      }

   }

   public final void b(boolean var1) {
      this.k = false;
   }

   public final void a(Graphics var1) {
      var1.setClip(this.a, this.b, this.c, this.d);
      if (this.j) {
         var1.setColor(2780801);
         var1.fillRect(this.a, this.b, this.c, this.d);
      }

      this.y = false;
      if (this.i != null && this.i != null) {
         ca_1.a(var1, a_MainCanvas.v.a, a_MainCanvas.v.b, this.m, this.n, this.o, this.p);
         var1.drawImage(a_MainCanvas.u.a, this.m + this.o - 5 - a_MainCanvas.u.b, this.n + 1, 20);
         int var10001 = this.m + this.o - 5 - a_MainCanvas.u.b;
         int var10002 = this.n + 1;
         short var8 = a_MainCanvas.u.c;
         short var7 = a_MainCanvas.u.b;
         int var6 = var10002;
         int var5 = var10001;
         if (this.q != null) {
            this.q[0] = var5;
            this.q[1] = var6;
            this.q[2] = var7;
            this.q[3] = var8;
         }

         int var2 = ca_1.a(this.i) != -1 ? ca_1.a(this.i) : this.h;
         String var10 = this.i;
         if (var2 != this.h) {
            if (ca_1.m == 2) {
               var10 = this.i.substring(4, this.i.length());
            } else {
               var10 = this.i.substring(3, this.i.length());
            }
         }

         ca_1.a(var1, (String)var10, (int)(this.m + this.o / 2), this.n + t_1.a(a_MainCanvas.v.c), 17, var2, 0);
         ca_1.a(var1, this.m, this.n + this.p, this.o);
      }

      for(int var9 = 0; var9 < this.l.size(); ++var9) {
         Object var3;
         if ((var3 = this.l.elementAt(var9)) instanceof n_1) {
            ((n_1)var3).a(var1);
            this.y = true;
         } else if (var3 instanceof c_1) {
            ((c_1)var3).a(var1);
            ((c_1)var3).a(this.y);
         } else if (var3 instanceof an_1) {
            ((an_1)var3).a(var1);
            an_1 var10000 = (an_1)var3;
            boolean var4 = this.y;
            var10000.f = var4;
         } else if (var3 instanceof bm) {
            bm var11 = (bm)var3;
         } else if (var3 instanceof l_1) {
            ((l_1)var3).a(var1);
         }
      }

      ca_1.a(var1, 2);
      var1.drawRect(this.a, this.b, this.c - 1, this.d - 1);
      var1.drawRect(this.a + 4, this.b + 4, this.c - 9, this.d - 9);
      ca_1.a(var1, 3);
      var1.drawRect(this.a + 1, this.b + 1, this.c - 3, this.d - 3);
      var1.drawRect(this.a + 3, this.b + 3, this.c - 7, this.d - 7);
      ca_1.a(var1, 4);
      var1.drawRect(this.a + 2, this.b + 2, this.c - 5, this.d - 5);
      if (a_MainCanvas.r.a != null && this.k) {
         var1.drawImage(a_MainCanvas.r.a, this.a, this.b, 20);
      }

      if (a_MainCanvas.s.a != null) {
         var1.drawImage(a_MainCanvas.s.a, this.a, this.b + this.d - a_MainCanvas.s.c, 20);
      }

      if (a_MainCanvas.t.a != null) {
         var1.drawImage(a_MainCanvas.t.a, this.a + this.c - a_MainCanvas.t.b, this.b + this.d - a_MainCanvas.t.c, 20);
      }

      var1.setClip(this.a, this.b, this.c, this.d);
   }

   public final void j() {
      this.i = null;
      this.j = false;
      this.r = 0;
      this.e = 0;
      this.f = 0;
      this.g = 0;
      this.k = true;

      for(int var1 = 0; var1 < this.l.size(); ++var1) {
         ((al)this.l.elementAt(var1)).j();
      }

      this.l.removeAllElements();
   }
}

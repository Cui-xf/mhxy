package com.cc;

import com.yinhan.kjava.main.a_MainCanvas;

import java.util.Vector;

public final class ab {
   private ao_1 c;
   private long d = 0L;
   public int a = -1;
   public static boolean b;

   public ab(ao_1 var1) {
      this.c = var1;
   }

   public final void a() {
      if (this.c != null && this.c.I != null) {
         if (bt_1.bu && bt_1.bv > 0) {
            if (this.c.I.c != null && this.c.I.c.size() > 0) {
               if (this.c.e.ak - this.d < 2500L) {
                  return;
               }

               this.c.I.c.removeAllElements();
            }

            this.d = this.c.e.ak;
            ab var1 = this;
            s var10000;
            if (this.c == null) {
               var10000 = null;
            } else if (this.c.aO != null && this.c.aO.size() > 0) {
               int var2 = 0;
               int var3 = 0;
               boolean var4 = false;
               au var11 = null;
               int var5 = -1;

               for(int var6 = 0; var6 < var1.c.aO.size(); ++var6) {
                  if ((var11 = (s)var1.c.aO.elementAt(var6)).a != var1.a && var11 != null && (var11 == null || var11.f != null) && a_MainCanvas.f.a(var1.c.f, var11.h, var11.i) != 1) {
                     var3 = (var11.h - var1.c.I.j) * (var11.h - var1.c.I.j);
                     int var13 = (var11.i - var1.c.I.k) * (var11.i - var1.c.I.k);
                     if (var6 == 0) {
                        var2 = var3 + var13;
                        var5 = var6;
                     } else if (var2 == 0) {
                        var2 = var3 + var13;
                        var5 = var6;
                     } else if (var2 > var3 + var13) {
                        var2 = var3 + var13;
                        var5 = var6;
                     }
                  }
               }

               var10000 = var5 == -1 ? null : (s)var1.c.aO.elementAt(var5);
            } else {
               var10000 = null;
            }

            s var7 = var10000;
            if (var10000 != null && (var7 == null || var7.f != null)) {
               int var9 = var7.h - var7.f.g() / 2;
               int var8 = var7.i - var7.f.h();
               if (a_MainCanvas.f.a(this.c.f, var9, var8) != 1) {
                  this.c.e.b(var9, var8);
               }
            }
         }
      }
   }

   public final void b() {
      if (this.c != null && this.c.I != null && this.c.I.c != null) {
         if (this.c.I.c.size() > 0) {
            this.c.I.c.removeAllElements();
         }

      }
   }

   public static boolean c() {
      if (bt_1.q != null && bt_1.q.length > 0) {
         if (bt_1.s == 1) {
            return bt_1.bu;
         } else {
            for(int var0 = 0; var0 < bt_1.q.length; ++var0) {
               if (bt_1.q[var0].b.equals(bt_1.ad)) {
                  if (bt_1.q[var0].s == 1) {
                     if (bt_1.bu) {
                        return true;
                     }

                     return false;
                  }

                  if (bt_1.bx == 1) {
                     return true;
                  }

                  return false;
               }
            }

            return false;
         }
      } else {
         return bt_1.bu;
      }
   }

   static {
      new Vector();
      b = true;
   }
}

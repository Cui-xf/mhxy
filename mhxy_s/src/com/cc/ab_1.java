package com.cc;

import com.yinhan.kjava.main.a_MainCanvas;

import java.util.Vector;

public final class ab_1 {
   private ao_1 c;
   private long d = 0L;
   public int a = -1;
   public static boolean b;

   public ab_1(ao_1 var1) {
      this.c = var1;
   }

   public final void a() {
      s sVar;
      if (this.c == null || this.c.I == null || !bt_1.bu || bt_1.bv <= 0) {
         return;
      }
      if (this.c.I.c != null && this.c.I.c.size() > 0) {
         if (this.c.e.ak - this.d < 2500) {
            return;
         } else {
            this.c.I.c.removeAllElements();
         }
      }
      this.d = this.c.e.ak;
      if (this.c == null || this.c.aO == null || this.c.aO.size() <= 0) {
         sVar = null;
      } else {
         int i = 0;
         int i2 = -1;
         for (int i3 = 0; i3 < this.c.aO.size(); i3++) {
            s sVar2 = (s) this.c.aO.elementAt(i3);
            if (sVar2.a != this.a && sVar2 != null && ((sVar2 == null || sVar2.f != null) && a_MainCanvas.f.a(this.c.f, sVar2.h, sVar2.i) != 1)) {
               int i4 = (sVar2.h - this.c.I.j) * (sVar2.h - this.c.I.j);
               int i5 = (sVar2.i - this.c.I.k) * (sVar2.i - this.c.I.k);
               if (i3 == 0) {
                  i = i4 + i5;
                  i2 = i3;
               } else if (i == 0) {
                  i = i4 + i5;
                  i2 = i3;
               } else if (i > i4 + i5) {
                  i = i4 + i5;
                  i2 = i3;
               }
            }
         }
         sVar = i2 == -1 ? null : (s) this.c.aO.elementAt(i2);
      }
      s sVar3 = sVar;
      if (sVar != null) {
         if (sVar3 == null || sVar3.f != null) {
            int iG = sVar3.h - (sVar3.f.g() / 2);
            int iH = sVar3.i - sVar3.f.h();
            if (a_MainCanvas.f.a(this.c.f, iG, iH) == 1) {
               return;
            }
            this.c.e.b(iG, iH);
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

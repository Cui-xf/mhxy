package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.util.Vector;

public final class ab_1 {
   private UISceneController c;
   private long d = 0L;
   public int a = -1;
   public static boolean b;

   public ab_1(UISceneController var1) {
      this.c = var1;
   }

   public final void a() {
      s sVar;
      if (this.c == null || this.c.sceneRefreshCoordinator == null || !GlobalStatus.bu || GlobalStatus.bv <= 0) {
         return;
      }
      if (this.c.sceneRefreshCoordinator.c != null && this.c.sceneRefreshCoordinator.c.size() > 0) {
         if (this.c.mainCanvasRef.frameStartTs - this.d < 2500) {
            return;
         } else {
            this.c.sceneRefreshCoordinator.c.removeAllElements();
         }
      }
      this.d = this.c.mainCanvasRef.frameStartTs;
      if (this.c == null || this.c.aO == null || this.c.aO.size() <= 0) {
         sVar = null;
      } else {
         int i = 0;
         int i2 = -1;
         for (int i3 = 0; i3 < this.c.aO.size(); i3++) {
            s sVar2 = (s) this.c.aO.elementAt(i3);
            if (sVar2.a != this.a && sVar2 != null && ((sVar2 == null || sVar2.f != null) && MainCanvas.pngUtil.a(this.c.f, sVar2.h, sVar2.i) != 1)) {
               int i4 = (sVar2.h - this.c.sceneRefreshCoordinator.j) * (sVar2.h - this.c.sceneRefreshCoordinator.j);
               int i5 = (sVar2.i - this.c.sceneRefreshCoordinator.k) * (sVar2.i - this.c.sceneRefreshCoordinator.k);
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
            if (MainCanvas.pngUtil.a(this.c.f, iG, iH) == 1) {
               return;
            }
            this.c.mainCanvasRef.b(iG, iH);
         }
      }
   }


   public final void b() {
      if (this.c != null && this.c.sceneRefreshCoordinator != null && this.c.sceneRefreshCoordinator.c != null) {
         if (this.c.sceneRefreshCoordinator.c.size() > 0) {
            this.c.sceneRefreshCoordinator.c.removeAllElements();
         }

      }
   }

   public static boolean c() {
      if (GlobalStatus.q != null && GlobalStatus.q.length > 0) {
         if (GlobalStatus.s == 1) {
            return GlobalStatus.bu;
         } else {
            for(int var0 = 0; var0 < GlobalStatus.q.length; ++var0) {
               if (GlobalStatus.q[var0].b.equals(GlobalStatus.ad)) {
                  if (GlobalStatus.q[var0].s == 1) {
                     if (GlobalStatus.bu) {
                        return true;
                     }

                     return false;
                  }

                  if (GlobalStatus.bx == 1) {
                     return true;
                  }

                  return false;
               }
            }

            return false;
         }
      } else {
         return GlobalStatus.bu;
      }
   }

   static {
      new Vector();
      b = true;
   }
}

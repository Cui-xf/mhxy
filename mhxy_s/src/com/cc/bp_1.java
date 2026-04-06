package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;

public final class bp_1 extends SceneEntity {
   public byte a;
   public String b = "";
   public String c;
   public int n;
   public short o;
   public byte p;
   public byte q;
   public byte r;
   public byte s;
   public short t;
   public short u;
   private String v = "";
   private short w = 0;
   private short x = 0;
   private short y = 0;
   private int[] z = new int[4];
   private int[] A = new int[4];

   public final void a(GameSceneController var1, DataInputStream var2) throws IOException {
      var2.readByte();
      this.b = var2.readUTF();
      super.name = var2.readUTF();
      this.c = var2.readUTF();
      this.n = LoadingPage.pickColor(var2.readByte());
      this.o = var2.readShort();
      this.p = var2.readByte();
      this.q = var2.readByte();
      this.s = var2.readByte();
      this.r = var2.readByte();
      this.t = var2.readShort();
      this.u = var2.readShort();
      this.v = var2.readUTF();
      if (!this.v.equals("")) {
         this.w = var2.readShort();
         this.x = var2.readShort();
         this.y = var2.readShort();
      }

      if (this.b.equals(GlobalStatus.roleId_2)) {
         GlobalStatus.bs = (short)this.s;
      }

      super.l = var1.sceneRefreshCoordinator.j;
      super.m = var1.sceneRefreshCoordinator.k;
      super.j = var1.sceneRefreshCoordinator.j;
      super.k = var1.sceneRefreshCoordinator.k;
      this.a();
      this.a(true);
   }

   private void a() {
      this.z[1] = Page.buildResourceId((String) MainCanvas.a(this.q, this.p, (byte)1, this.r, false, this.v), (byte)2);
      this.A[1] = Page.buildResourceId((String) MainCanvas.a(this.q, this.p, (byte)1, this.r, true, this.v), (byte)2);
      this.z[3] = Page.buildResourceId((String) MainCanvas.a(this.q, this.p, (byte)3, this.r, false, this.v), (byte)2);
      this.A[3] = Page.buildResourceId((String) MainCanvas.a(this.q, this.p, (byte)3, this.r, true, this.v), (byte)2);
      this.z[0] = Page.buildResourceId((String) MainCanvas.a(this.q, this.p, (byte)0, this.r, false, this.v), (byte)2);
      this.A[0] = Page.buildResourceId((String) MainCanvas.a(this.q, this.p, (byte)0, this.r, true, this.v), (byte)2);
      this.z[2] = Page.buildResourceId((String) MainCanvas.a(this.q, this.p, (byte)2, this.r, false, this.v), (byte)2);
      this.A[2] = Page.buildResourceId((String) MainCanvas.a(this.q, this.p, (byte)2, this.r, true, this.v), (byte)2);
   }

   private void a(boolean var1) {
      super.frame1 = MainCanvas.role.getFrame1(var1 ? this.A[super.h] : this.z[super.h], this.w, this.x, this.y);
      if (super.frame1 == null) {
         MainCanvas.a(this.q, this.p, (byte)5, this.r, this.v, this.w, this.x, this.y);
         super.frame1 = MainCanvas.role.getFrame1(var1 ? this.A[super.h] : this.z[super.h], this.w, this.x, this.y);
         if (super.frame1 == null) {
            this.r = 0;
            this.a();
            super.frame1 = MainCanvas.role.c(var1 ? this.A[super.h] : this.z[super.h]);
            if (super.frame1 == null) {
               MainCanvas.a(this.q, this.p, super.h, this.r, this.v, this.w, this.x, this.y);
               super.frame1 = MainCanvas.role.c(var1 ? this.A[super.h] : this.z[super.h]);
            }
         }
      }

   }

   public final void a(PngUtil var1, long var2) {
      if (super.frame1 != null) {
         if (GlobalStatus.bs == 0) {
            if (this.a(this.a, 0)) {
               if (super.f != null && super.f.size() >= 1) {
                  if (super.f.size() > 1) {
                     int var6;
                     if ((var6 = super.f.size() - 1) >= 0) {
                        short[] var8 = (short[])super.f.elementAt(var6);
                        short[] var9;
                        if (var6 - 1 > 0) {
                           var9 = (short[])super.f.elementAt(var6 - 1);
                        } else {
                           var9 = (short[])super.f.elementAt(0);
                        }

                        if (var9[0] != var8[0]) {
                           if (var9[0] > var8[0]) {
                              super.h = 2;
                           } else {
                              super.h = 0;
                           }

                           this.a(false);
                        } else if (var9[1] != var8[1]) {
                           if (var9[1] > var8[1]) {
                              super.h = 3;
                           } else {
                              super.h = 1;
                           }

                           this.a(false);
                        } else {
                           this.a(true);
                        }

                        super.j = var9[0];
                        super.k = var9[1];
                        super.f.removeElementAt(var6);
                     }
                  } else {
                     this.a(true);
                  }

                  PngUtil.animate(super.frame1, var2);
                  return;
               }

               this.a(true);
               PngUtil.animate(super.frame1, var2);
               return;
            }

            this.a(true);
            PngUtil.animate(super.frame1, var2);
            return;
         }

         if (this.a(this.a, 1)) {
            PngUtil.animate(super.frame1, var2);
            int var4;
            if ((var4 = super.f.size()) < 7) {
               this.a(true);
               return;
            }

            if (0 < var4) {
               short[] var5 = (short[])super.f.elementAt(0);
               short[] var7;
               if (1 < var4) {
                  var7 = (short[])super.f.elementAt(1);
               } else {
                  var7 = (short[])super.f.elementAt(var4 - 1);
               }

               if (var7[0] != var5[0]) {
                  if (var7[0] > var5[0]) {
                     super.h = 2;
                  } else {
                     super.h = 0;
                  }

                  this.a(false);
               } else if (var7[1] != var5[1]) {
                  if (var7[1] > var5[1]) {
                     super.h = 3;
                  } else {
                     super.h = 1;
                  }

                  this.a(false);
               } else {
                  this.a(true);
               }

               super.j = var5[0];
               super.k = var5[1];
               super.f.removeElementAt(0);
            }
         } else {
            this.a(true);
            PngUtil.animate(super.frame1, var2);
         }
      }

   }

   private boolean a(byte b, int i) {
      bp_1 bpVar;
      if (this.s == 1) {
         return true;
      }
      if (GlobalStatus.teamBonus != null) {
         for (int i2 = 0; i2 < GlobalStatus.teamBonus.length; i2++) {
            if (GlobalStatus.teamBonus[i2].s == 1) {
               bpVar = GlobalStatus.teamBonus[i2];
               break;
            }
         }
         bpVar = null;
      } else {
         bpVar = null;
      }
      bp_1 bpVar2 = bpVar;
      if (i == 0) {
         if (bpVar2.a == 0) {
            if (b == 1) {
               return bpVar2.f.size() <= 0 || Math.abs(GlobalStatus.teamBonus[b].f.size() - GlobalStatus.teamBonus[0].f.size()) > 7;
            }
            if (b == 2) {
               return GlobalStatus.teamBonus[1].f.size() <= 0 || Math.abs(GlobalStatus.teamBonus[b].f.size() - GlobalStatus.teamBonus[1].f.size()) > 7;
            }
            return false;
         }
         if (bpVar2.a == 1) {
            if (b == 0) {
               return GlobalStatus.teamBonus[1].f.size() <= 0 || Math.abs(GlobalStatus.teamBonus[b].f.size() - GlobalStatus.teamBonus[1].f.size()) > 7;
            }
            if (b == 2) {
               return GlobalStatus.teamBonus[0].f.size() <= 0 || Math.abs(GlobalStatus.teamBonus[b].f.size() - GlobalStatus.teamBonus[0].f.size()) > 7;
            }
            return false;
         }
         if (bpVar2.a != 2) {
            return false;
         }
         if (b == 0) {
            return GlobalStatus.teamBonus[2].f.size() <= 0 || Math.abs(GlobalStatus.teamBonus[b].f.size() - GlobalStatus.teamBonus[2].f.size()) > 7;
         }
         if (b == 1) {
            return GlobalStatus.teamBonus[0].f.size() <= 0 || Math.abs(GlobalStatus.teamBonus[b].f.size() - GlobalStatus.teamBonus[0].f.size()) > 7;
         }
         return false;
      }
      if (i != 1) {
         return false;
      }
      if (bpVar2.a == 0) {
         if (b == 1) {
            return GlobalStatus.teamBonus[b].f.size() > 2;
         }
         if (b == 2) {
            return GlobalStatus.teamBonus[1].f.size() <= 2 || Math.abs(GlobalStatus.teamBonus[b].f.size() - GlobalStatus.teamBonus[1].f.size()) > 5;
         }
         return false;
      }
      if (bpVar2.a == 1) {
         if (b == 0) {
            return GlobalStatus.teamBonus[b].f.size() > 2;
         }
         if (b == 2) {
            return GlobalStatus.teamBonus[0].f.size() <= 2 || Math.abs(GlobalStatus.teamBonus[b].f.size() - GlobalStatus.teamBonus[0].f.size()) > 5;
         }
         return false;
      }
      if (bpVar2.a != 2) {
         return false;
      }
      if (b == 0) {
         return GlobalStatus.teamBonus[b].f.size() > 2;
      }
      if (b == 1) {
         return GlobalStatus.teamBonus[0].f.size() <= 2 || Math.abs(GlobalStatus.teamBonus[b].f.size() - GlobalStatus.teamBonus[0].f.size()) > 5;
      }
      return false;
   }

}

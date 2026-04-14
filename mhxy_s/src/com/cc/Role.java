package com.cc;

import com.cc.resource.ResourceManager;
import com.yinhan.kjava.main.MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;

public final class Role extends SceneEntity {
   public byte a;
   public String roleId = "";
   public String c;
   public int color;
   public short o;
   public byte gender;
   public byte job;
   //时装外观
   public byte appearance;
   public byte s_1;
   public short t;
   public short u;
   //坐骑
   private String rideIcon = "";
   private short h = 0;
   private short s = 0;
   private short l = 0;
   //移动动画
   private int[] moveAnimation = new int[4];
   //攻击动画
   private int[] attackAnimation = new int[4];

   public final void a(GameSceneController gameSceneController, DataInputStream dis) throws IOException {
      dis.readByte();
      this.roleId = dis.readUTF();
      super.name = dis.readUTF();
      this.c = dis.readUTF();
      this.color = LoadingPage.pickColor(dis.readByte());
      this.o = dis.readShort();
      this.gender = dis.readByte();
      this.job = dis.readByte();
      this.s_1 = dis.readByte();
      this.appearance = dis.readByte();
      this.t = dis.readShort();
      this.u = dis.readShort();
      this.rideIcon = dis.readUTF();
      if (!this.rideIcon.equals("")) {
         this.h = dis.readShort();
         this.s = dis.readShort();
         this.l = dis.readShort();
      }

      if (this.roleId.equals(GlobalStatus.roleId_2)) {
         GlobalStatus.bs = (short)this.s_1;
      }

      super.l_1 = gameSceneController.sceneRefreshCoordinator.j;
      super.m = gameSceneController.sceneRefreshCoordinator.k;
      super.j = gameSceneController.sceneRefreshCoordinator.j;
      super.k = gameSceneController.sceneRefreshCoordinator.k;
      this.setRoleResId();
      this.a(true);
   }

   private void setRoleResId() {
       this.moveAnimation[0] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.job, this.gender, (byte)0, this.appearance, false, this.rideIcon), (byte)2);
       this.moveAnimation[1] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.job, this.gender, (byte)1, this.appearance, false, this.rideIcon), (byte)2);
       this.moveAnimation[3] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.job, this.gender, (byte)3, this.appearance, false, this.rideIcon), (byte)2);
       this.moveAnimation[2] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.job, this.gender, (byte)2, this.appearance, false, this.rideIcon), (byte)2);

       this.attackAnimation[0] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.job, this.gender, (byte)0, this.appearance, true, this.rideIcon), (byte)2);
       this.attackAnimation[1] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.job, this.gender, (byte)1, this.appearance, true, this.rideIcon), (byte)2);
       this.attackAnimation[2] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.job, this.gender, (byte)2, this.appearance, true, this.rideIcon), (byte)2);
       this.attackAnimation[3] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.job, this.gender, (byte)3, this.appearance, true, this.rideIcon), (byte)2);
   }

   private void a(boolean var1) {
      super.frame1 = MainCanvas.role.getAnimationByKeyFromCache(var1 ? this.attackAnimation[super.h_1] : this.moveAnimation[super.h_1], this.h, this.s, this.l);
      if (super.frame1 == null) {
         MainCanvas.loadRoleRes(this.job, this.gender, (byte)5, this.appearance, this.rideIcon, this.h, this.s, this.l);
         super.frame1 = MainCanvas.role.getAnimationByKeyFromCache(var1 ? this.attackAnimation[super.h_1] : this.moveAnimation[super.h_1], this.h, this.s, this.l);
         if (super.frame1 == null) {
            this.appearance = 0;
            this.setRoleResId();
            super.frame1 = MainCanvas.role.getAnimationByKeyFromCache(var1 ? this.attackAnimation[super.h_1] : this.moveAnimation[super.h_1]);
            if (super.frame1 == null) {
               MainCanvas.loadRoleRes(this.job, this.gender, super.h_1, this.appearance, this.rideIcon, this.h, this.s, this.l);
               super.frame1 = MainCanvas.role.getAnimationByKeyFromCache(var1 ? this.attackAnimation[super.h_1] : this.moveAnimation[super.h_1]);
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
                              super.h_1 = 2;
                           } else {
                              super.h_1 = 0;
                           }

                           this.a(false);
                        } else if (var9[1] != var8[1]) {
                           if (var9[1] > var8[1]) {
                              super.h_1 = 3;
                           } else {
                              super.h_1 = 1;
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
                     super.h_1 = 2;
                  } else {
                     super.h_1 = 0;
                  }

                  this.a(false);
               } else if (var7[1] != var5[1]) {
                  if (var7[1] > var5[1]) {
                     super.h_1 = 3;
                  } else {
                     super.h_1 = 1;
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
      Role bpVar;
      if (this.s_1 == 1) {
         return true;
      }
      if (GlobalStatus.teamBonus != null) {
         for (int i2 = 0; i2 < GlobalStatus.teamBonus.length; i2++) {
            if (GlobalStatus.teamBonus[i2].s_1 == 1) {
               bpVar = GlobalStatus.teamBonus[i2];
               break;
            }
         }
         bpVar = null;
      } else {
         bpVar = null;
      }
      Role bpVar2 = bpVar;
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

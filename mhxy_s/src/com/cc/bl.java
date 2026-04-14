package com.cc;

import com.cc.resource.ResourceManager;
import com.cc.resource.TileMap;
import com.yinhan.kjava.main.MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * 场景角色/NPC 实体：继承 {@link SceneEntity} 基类，持有名称、职业、性别、坐标、朝向及四方向动画帧资源 id，
 * 用于 NetworkPacketProcessors 中 j[] 数组存储移动路径上的实体。
 */
public final class bl extends SceneEntity {
   public String a = "";
   public String b;
   private int w;
   public byte c;
   public byte n;
   public byte o;
   private String x;
   private short y;
   private short z;
   private short A;
   public byte p;
   public short q;
   public short r;
   public short s;
   public short t;
   private boolean B = false;
   private int[] C = new int[4];
   private int[] D = new int[4];
   public byte u;
   public byte v;

   /** 从数据流反序列化角色实体：读取名称、职业、性别、坐标、装备及四方向动画帧资源 id。 */
   public final void a(DataInputStream var1) throws IOException {
      this.a = var1.readUTF();
      super.name = var1.readUTF();
      this.b = var1.readUTF();
      this.w = LoadingPage.pickColor(var1.readByte());
      var1.readShort();
      this.c = var1.readByte();
      this.n = var1.readByte();
      super.l_1 = super.j = var1.readShort();
      super.m = super.k = var1.readShort();
      this.p = var1.readByte();
      this.q = var1.readShort();
      this.o = var1.readByte();
      this.x = var1.readUTF();
      if (this.q > 0) {
         this.r = var1.readShort();
         this.s = var1.readShort();
         this.t = var1.readShort();
      }

      if (!this.x.equals("")) {
         this.y = var1.readShort();
         this.z = var1.readShort();
         this.A = var1.readShort();
      }

      this.C[1] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.c, this.n, (byte)1, this.o, false, this.x), (byte)2);
      this.D[1] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.c, this.n, (byte)1, this.o, true, this.x), (byte)2);
      this.C[3] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.c, this.n, (byte)3, this.o, false, this.x), (byte)2);
      this.D[3] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.c, this.n, (byte)3, this.o, true, this.x), (byte)2);
      this.C[0] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.c, this.n, (byte)0, this.o, false, this.x), (byte)2);
      this.D[0] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.c, this.n, (byte)0, this.o, true, this.x), (byte)2);
      this.C[2] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.c, this.n, (byte)2, this.o, false, this.x), (byte)2);
      this.D[2] = ResourceManager.buildResourceId((String) MainCanvas.buildRoleResStr(this.c, this.n, (byte)2, this.o, true, this.x), (byte)2);
      this.a(true);
   }

   private void a(boolean var1) {
      if (!this.x.equals("")) {
         super.frame1 = MainCanvas.role.getAnimationByKeyFromCache(var1 ? this.D[super.h_1] : this.C[super.h_1], this.y, this.z, this.A);
      } else {
         super.frame1 = MainCanvas.role.getAnimationByKeyFromCache(var1 ? this.D[super.h_1] : this.C[super.h_1]);
      }

      if (super.frame1 == null && !this.B) {
         if (!this.x.equals("")) {
            GameSceneController.a(this.c, this.n, this.o, this.x, this.y, this.z, this.A);
         } else {
            GameSceneController.a(this.c, this.n, this.o, "", (short)0, (short)0, (short)0);
         }

         if (!this.x.equals("")) {
            super.frame1 = MainCanvas.role.getAnimationByKeyFromCache(var1 ? this.D[super.h_1] : this.C[super.h_1], this.y, this.z, this.A);
         } else {
            super.frame1 = MainCanvas.role.getAnimationByKeyFromCache(var1 ? this.D[super.h_1] : this.C[super.h_1]);
         }

         this.B = true;
      }

   }

   public final void a(TileMap var1, PngUtil var2, long var3) {
      try {
         if (super.frame1 != null) {
            if (super.f != null && super.f.size() > 3) {
               short[] var5;
               byte var10000;
               label43: {
                  var5 = (short[])super.f.elementAt(super.f.size() - 1);
                  if (super.i != null) {
                     if (super.i[0] == var5[0]) {
                        if (var5[1] > super.i[1]) {
                           super.h_1 = 3;
                        } else {
                           super.h_1 = 1;
                        }

                        super.i = var5;
                        var10000 = super.h_1;
                        break label43;
                     }

                     if (super.i[1] == var5[1]) {
                        if (var5[0] > super.i[0]) {
                           super.h_1 = 2;
                        } else {
                           super.h_1 = 0;
                        }

                        super.i = var5;
                        var10000 = super.h_1;
                        break label43;
                     }
                  }

                  super.i = var5;
                  var10000 = -1;
               }

               if (var10000 != -1) {
                  this.a(false);
                  super.j = var5[0];
                  super.k = var5[1];
                  ((SceneEntity)this).r();
                  super.f.removeElementAt(super.f.size() - 1);
               } else {
                  this.a(false);
               }

               PngUtil.animate(super.frame1, var3);
            } else {
               this.a(true);
               PngUtil.animate(super.frame1, var3);
            }

            if (super.d != null) {
               super.d.a(var1, var2, var3);
            }
         }

      } catch (Exception var8) {
         ((Throwable)var8).printStackTrace();
      }
   }

   public final int a(byte var1, byte var2) {
      if (GlobalStatus.bw >= 1) {
         if (var1 == 2 || var1 == 3) {
            return 16711680;
         }

         if (var2 >= 0) {
            return 65280;
         }

         if (this.b != null && !this.b.equals("")) {
            return this.w;
         }

         if (var1 == 0) {
            return 16777215;
         }

         if (var1 == 1) {
            return 16776960;
         }
      }

      if (var2 >= 0) {
         return 65280;
      } else if (this.b != null && !this.b.equals("")) {
         return this.w;
      } else {
         return 16776960;
      }
   }
}

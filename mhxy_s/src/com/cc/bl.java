package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;

public final class bl extends ar {
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

   public final void a(DataInputStream var1) throws IOException {
      this.a = var1.readUTF();
      super.e = var1.readUTF();
      this.b = var1.readUTF();
      this.w = LoadingPage.a(var1.readByte());
      var1.readShort();
      this.c = var1.readByte();
      this.n = var1.readByte();
      super.l = super.j = var1.readShort();
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

      this.C[1] = Page.a((String) MainCanvas.a(this.c, this.n, (byte)1, this.o, false, this.x), (byte)2);
      this.D[1] = Page.a((String) MainCanvas.a(this.c, this.n, (byte)1, this.o, true, this.x), (byte)2);
      this.C[3] = Page.a((String) MainCanvas.a(this.c, this.n, (byte)3, this.o, false, this.x), (byte)2);
      this.D[3] = Page.a((String) MainCanvas.a(this.c, this.n, (byte)3, this.o, true, this.x), (byte)2);
      this.C[0] = Page.a((String) MainCanvas.a(this.c, this.n, (byte)0, this.o, false, this.x), (byte)2);
      this.D[0] = Page.a((String) MainCanvas.a(this.c, this.n, (byte)0, this.o, true, this.x), (byte)2);
      this.C[2] = Page.a((String) MainCanvas.a(this.c, this.n, (byte)2, this.o, false, this.x), (byte)2);
      this.D[2] = Page.a((String) MainCanvas.a(this.c, this.n, (byte)2, this.o, true, this.x), (byte)2);
      this.a(true);
   }

   private void a(boolean var1) {
      if (!this.x.equals("")) {
         super.g = MainCanvas.ab.a(var1 ? this.D[super.h] : this.C[super.h], this.y, this.z, this.A);
      } else {
         super.g = MainCanvas.ab.c(var1 ? this.D[super.h] : this.C[super.h]);
      }

      if (super.g == null && !this.B) {
         if (!this.x.equals("")) {
            ao_1.a(this.c, this.n, this.o, this.x, this.y, this.z, this.A);
         } else {
            ao_1.a(this.c, this.n, this.o, "", (short)0, (short)0, (short)0);
         }

         if (!this.x.equals("")) {
            super.g = MainCanvas.ab.a(var1 ? this.D[super.h] : this.C[super.h], this.y, this.z, this.A);
         } else {
            super.g = MainCanvas.ab.c(var1 ? this.D[super.h] : this.C[super.h]);
         }

         this.B = true;
      }

   }

   public final void a(aw var1, ai_1 var2, long var3) {
      try {
         if (super.g != null) {
            if (super.f != null && super.f.size() > 3) {
               short[] var5;
               byte var10000;
               label43: {
                  var5 = (short[])super.f.elementAt(super.f.size() - 1);
                  if (super.i != null) {
                     if (super.i[0] == var5[0]) {
                        if (var5[1] > super.i[1]) {
                           super.h = 3;
                        } else {
                           super.h = 1;
                        }

                        super.i = var5;
                        var10000 = super.h;
                        break label43;
                     }

                     if (super.i[1] == var5[1]) {
                        if (var5[0] > super.i[0]) {
                           super.h = 2;
                        } else {
                           super.h = 0;
                        }

                        super.i = var5;
                        var10000 = super.h;
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
                  ((ar)this).r();
                  super.f.removeElementAt(super.f.size() - 1);
               } else {
                  this.a(false);
               }

               ai_1.a(super.g, var3);
            } else {
               this.a(true);
               ai_1.a(super.g, var3);
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
      if (bt_1.bw >= 1) {
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

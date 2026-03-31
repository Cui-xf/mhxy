package com.cc;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class az_1 {
   public short a;
   public String b;
   public short c;
   public short d;
   public byte e;
   public byte f;
   public byte g;
   public byte h;
   public byte i;
   public byte j;
   public byte k;
   public byte l;
   public byte m;
   public byte n;
   public byte o;
   public byte p;
   public byte q;
   public byte r;
   public byte s;
   public byte t;
   public short u;
   public int v;
   public Frame1 w = null;
   public boolean x = false;
   public short y;
   public short z;
   public short A;
   public String[] B = null;
   public String[] C = null;
   public byte D;
   public byte E;
   public byte F;
   public byte G;
   public byte H;
   public byte I;
   public byte J;
   public byte K;
   public byte L;
   public byte M;
   public byte N;
   public byte O;
   public byte P;
   public byte Q;
   public byte R;
   public int S;
   public byte T;
   private byte V = 0;
   private String W;
   public byte U = 0;
   private TextRender X;
   private int[] Y = null;
   private int Z = 0;
   private boolean aa = false;

   public final short a() {
      return this.w == null ? (short)(this.c - 8) : (short)(this.c - this.w.g() / 2);
   }

   public final short b() {
      return this.w == null ? (short)(this.d - 30) : (short)(this.d - (this.w.h() == 0 ? 30 : this.w.h()));
   }

   public final short c() {
      if (this.w == null) {
         return 16;
      } else {
         return this.w != null && this.w.g() != 0 ? this.w.g() : 16;
      }
   }

   public final short d() {
      if (this.w == null) {
         return 30;
      } else {
         return this.w.h() == 0 ? 30 : this.w.h();
      }
   }

   public final void a(DataInputStream var1) throws IOException {
      this.a = var1.readShort();
      this.b = var1.readUTF();
      var1.readShort();
      this.c = (short)(var1.readShort() + 8);
      this.d = (short)(var1.readShort() + 8);
      var1.readShort();
      int var2 = var1.readByte();
      this.e = (byte)(var2 & 1);
      this.f = (byte)(var2 >>> 1 & 1);
      this.g = (byte)(var2 >>> 2 & 1);
      this.h = (byte)(var2 >>> 3 & 1);
      this.i = (byte)(var2 >>> 4 & 1);
      this.k = (byte)(var2 >>> 5 & 1);
      this.l = (byte)(var2 >>> 6 & 1);
      var2 = var1.readByte();
      this.m = (byte)(var2 & 1);
      this.n = (byte)(var2 >>> 1 & 1);
      this.o = (byte)(var2 >>> 2 & 1);
      this.p = (byte)(var2 >>> 3 & 1);
      this.q = (byte)(var2 >>> 4 & 1);
      this.D = (byte)(var2 >>> 5 & 1);
      this.E = (byte)(var2 >>> 6 & 1);
      this.F = (byte)(var2 >>> 7 & 1);
      var2 = var1.readByte();
      this.G = (byte)(var2 & 1);
      this.J = (byte)(var2 >>> 1 & 1);
      this.r = (byte)(var2 >>> 2 & 1);
      this.s = (byte)(var2 >>> 3 & 1);
      this.K = (byte)(var2 >>> 4 & 1);
      this.L = (byte)(var2 >>> 5 & 1);
      this.M = (byte)(var2 >>> 6 & 1);
      this.Q = (byte)(var2 >>> 7 & 1);
      var2 = var1.readByte();
      this.R = (byte)(var2 & 1);
      this.N = (byte)(var2 >>> 1 & 1);
      this.O = (byte)(var2 >>> 2 & 1);
      this.P = (byte)(var2 >>> 3 & 1);
      this.T = (byte)(var2 >>> 4 & 1);
      this.j = var1.readByte();
      this.H = var1.readByte();
      this.I = var1.readByte();
      this.t = var1.readByte();
      this.u = var1.readShort();
      this.y = var1.readShort();
      this.z = var1.readShort();
      this.A = var1.readShort();
      this.V = var1.readByte();
      if (this.V == 1) {
         this.W = var1.readUTF();
         this.U = var1.readByte();
      }

      if ((var2 = var1.readByte()) > 0) {
         this.B = new String[var2];

         for(int var3 = 0; var3 < var2; ++var3) {
            this.B[var3] = var1.readUTF();
         }

         this.C = new String[var2];

         for(int var14 = 0; var14 < var2; ++var14) {
            this.C[var14] = var1.readUTF();
         }
      }

      if (this.R == 1) {
         this.S = var1.readInt();
      }

      this.v = Page.hashKey(Page.wrapName(String.valueOf(this.u), (byte)2).toCharArray());
      this.V = 1;
      if (this.V == 1 && this.U > 0) {
         int var10003 = t_1.b - 40;
         byte var4 = this.U;
         short var15 = this.d;
         var2 = var10003;
         Object var5 = null;
         String var7 = this.W;
         if (var7 == null || this.U == 0) {
            this.X = null;
            this.U = 0;
            return;
         }

         this.U = var4;
         this.aa = false;
         this.Z = 0;
         this.X = new TextRender(var7, (short)(var2 - 10));
         if (this.X != null && this.X.a() != 0) {
            int var8 = t_1.j;
            this.Y = new int[4];
            this.Y[2] = var2;
            this.Y[3] = this.X.a() * var8 + 10;
            this.Y[0] = (t_1.b - this.Y[2]) / 2;
            this.Y[1] = var15;
            return;
         }

         this.Y = null;
      }

   }

   public final void a(Graphics var1, ai_1 var2, int var3, int var4, byte var5) {
      if (this.t == -1 && ao_1.t_2 != null || this.I == 100 && ao_1.t_2 != null) {
         var2.a(var1, (Frame1) ao_1.t_2, (int[])null, var3, var4, this.c - ao_1.t_2.i() / 2, this.d - (this.w == null ? 30 : this.w.j()) - t_1.j - ao_1.t_2.j(), 20, var5);
      } else if (this.t == 1 && ao_1.s != null) {
         var2.a(var1, (Frame1) ao_1.s, (int[])null, var3, var4, this.c - ao_1.s.i() / 2, this.d - (this.w == null ? 30 : this.w.j()) - t_1.j - ao_1.s.j(), 20, var5);
      }

      if (this.x && ao_1.u != null) {
         var2.a(var1, (Frame1) ao_1.u, (int[])null, var3, var4, this.c + (this.w == null ? 8 : this.w.i() / 2), this.d - (this.w == null ? 30 : this.w.j()), 20, var5);
         if (this.X != null && this.Y != null && this.U != 0) {
            var1.setClip(0, 0, t_1.b, t_1.c);
            if (this.Z >= 0) {
               int var9;
               if ((var9 = this.Y[1] - var4) + this.Y[3] > t_1.c) {
                  var9 = t_1.c - this.Y[3] - 4;
               }

               int var10001 = this.Y[0];
               int var10003 = this.Y[2];
               int var7 = this.Y[3];
               int var6 = var10003;
               var4 = var10001;
               LoadingPage.a(var1, 1009050, 150, var4, var9, var6, var7);
               if (this.Z >= 3) {
                  this.X.a(var1, this.Y[0] + 5, var9 + 5, 20);
               }
            }

            this.aa = true;
            ++this.Z;
            return;
         }
      } else {
         this.Z = 0;
      }

   }

   public final void e() {
      if (this.U >= 0) {
         if (this.U > 0) {
            if (this.aa) {
               this.aa = false;
               --this.U;
            }

         } else {
            this.X = null;
            this.Z = 0;
            this.Y = null;
         }
      }
   }
}

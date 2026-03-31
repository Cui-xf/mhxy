package com.cc;

public final class aw extends Frame {
   public short a;
   public short b;
   public byte c;
   public byte d;
   public byte e;
   public byte f;
   public byte g;
   public byte h;
   public byte[][] i;
   public bx[][] j;
   public bx[] k;
   public bx[] l;
   public short[][] m;
   public int[][] n;

   public aw() {
      super((byte)3);
   }

   public final short a(int var1) {
      if (this.m == null) {
         return -1;
      } else {
         for(int var2 = 0; var2 < this.m.length; ++var2) {
            if (this.m[var2][0] == var1) {
               return (short)var2;
            }
         }

         return -1;
      }
   }

   public final void a() {
      this.i = null;
      if (this.j != null) {
         for(int var1 = 0; var1 < this.j.length; ++var1) {
            for(int var2 = 0; var2 < this.j[var1].length; ++var2) {
               if (this.j[var1][var2] != null) {
                  this.j[var1][var2] = null;
               }
            }
         }

         this.j = null;
      }

      if (this.k != null) {
         for(int var3 = 0; var3 < this.k.length; ++var3) {
            if (this.k[var3] != null) {
               this.k[var3] = null;
            }
         }

         this.k = null;
      }

      if (this.l != null) {
         for(int var4 = 0; var4 < this.l.length; ++var4) {
            if (this.l[var4] != null) {
               this.l[var4] = null;
            }
         }

         this.l = null;
      }

   }
}

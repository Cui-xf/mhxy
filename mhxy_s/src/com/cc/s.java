package com.cc;

import com.cc.resource.Animation;
import com.cc.resource.TileMap;

import java.util.Random;
import javax.microedition.lcdui.Graphics;

public final class s extends au {
   public int a;
   private short k;
   private short l;
   private short m;
   public short[] b;
   public byte c;
   private long n;
   public byte d;

   public s(int var1, short var2, short var3, short var4, short[] var5, short var6, short var7, short var8, short var9, byte var10) {
      super(var6, var7, var8, var9);
      this.a = var1;
      this.k = var2;
      this.l = var3;
      this.m = var4;
      this.b = var5;
      this.d = var10;
      if (this.b != null) {
         for(int var11 = 0; var11 < this.b.length; ++var11) {
            if (this.b[var11] != -1) {
               ++this.c;
            }
         }
      }

      super.h = this.k;
      super.i = this.l;
   }

   public final void a(Graphics var1, PngUtil var2, int var3, int var4, byte var5) {
      if (super.f != null) {
         var2.roleSelectedAnimation(var1, (Animation)super.f, (int[])null, var3, var4, super.h - super.f.g() / 2, super.i - super.f.h(), 20, 0);
      }

   }

   public final void a(TileMap var1, PngUtil var2, long var3) {
      if (super.f != null) {
         if (super.e.size() != 0) {
            if (super.e.size() > 0 && var3 - this.n > 200L) {
               short[] var15 = (short[])super.e.elementAt(0);
               if (super.g != 701) {
                  ((au)this).a(var15);
               }

               super.h = var15[0];
               super.i = var15[1];
               super.e.removeElement(var15);
               this.n = var3;
            }
         } else {
            PngUtil var6 = var2;
            TileMap var5 = var1;
            s var14 = this;
            if (this.m != 0) {
               Random var7 = new Random();
               int var10 = (short)(this.l - this.m);
               short var11 = (short)(this.k - this.m);
               int var12 = 0;
               int var13 = 0;

               do {
                  while((var12 = var7.nextInt() % (var14.k + var14.m)) < var11) {
                  }
               } while(var12 > var11 + (var14.m << 1));

               do {
                  while((var13 = var7.nextInt() % (var14.l + var14.m)) < var10) {
                  }
               } while(var13 > var10 + (var14.m << 1));

               int var16 = var12 - var14.h >= 0 ? 4 : -4;
               var10 = (var12 - var14.h) / var16;
               var11 = var14.h;

               for(int var22 = 0; var22 < var10 && var6.a(var5, var11 + var16, var14.i) == 0; ++var22) {
                  var11 = (short)(var11 + var16);
                  var14.e.addElement(new short[]{var11, var14.i});
               }

               var16 = var13 - var14.i >= 0 ? 4 : -4;
               var10 = (var13 - var14.i) / var16;
               var12 = var14.i;

               for(int var25 = 0; var25 < var10 && var6.a(var5, var11, var12 + var16) == 0; ++var25) {
                  var12 = (short)(var12 + var16);
                  var14.e.addElement(new short[]{var11, (short)var12});
               }
            }

            this.n = var3;
         }

         PngUtil.animate(super.f, var3);
      }

   }
}

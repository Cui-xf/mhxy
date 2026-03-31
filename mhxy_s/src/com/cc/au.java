package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public class au {
   public Vector e = new Vector();
   public Frame1 f;
   public short g;
   public short h;
   public short i;
   public byte j;
   private short a;
   private short b;
   private short c;
   private int[] d;
   private short[] k;

   public au(short var1, short var2, short var3, short var4) {
      if (var1 == 0) {
         var1 = 701;
      }

      this.g = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.f();
      this.a((byte)3);
   }

   public au(byte var1, short var2, short var3, short var4, short var5) {
      this.g = var2;
      this.a = var3;
      this.b = var4;
      this.c = var5;
      this.f();
      this.a((byte)3);
   }

   private void f() {
      if (this.g == 701) {
         this.d = new int[1];
         this.d[0] = Page.a((String)(this.g + "_" + 0), (byte)2);
      } else {
         this.d = new int[4];

         for(int var1 = 0; var1 < 4; ++var1) {
            this.d[var1] = Page.a((String)(this.g + "_" + (var1 / 2 << 1)), (byte)2);
         }

      }
   }

   public final short a() {
      switch (this.j) {
         case 1:
            if (this.f == null) {
               return 0;
            }

            return (short)(this.i + this.f.h());
         case 3:
            return (short)(this.i + 8);
         default:
            return (short)(this.i + 16);
      }
   }

   public final short b() {
      if (this.f == null) {
         return 0;
      } else {
         switch (this.j) {
            case 0:
               return (short)(this.i - (this.f.h() - 16));
            case 1:
               return this.i;
            case 2:
               return (short)(this.i - (this.f.h() - 16));
            case 3:
               return (short)(this.i - (this.f.h() - 8));
            default:
               return (short)(this.i - (this.f.h() - 16));
         }
      }
   }

   public final short c() {
      if (this.f == null) {
         return 0;
      } else {
         switch (this.j) {
            case 0:
               return (short)(this.h + 16 - this.f.g() / 2);
            case 1:
               return (short)(this.h + 8 - this.f.g() / 2);
            case 2:
               return (short)(this.h - this.f.g() / 2);
            case 3:
               return (short)(this.h + 8 - this.f.g() / 2);
            default:
               return (short)(this.h + 16 - this.f.g() / 2);
         }
      }
   }

   public final short d() {
      return this.f == null ? 0 : this.f.g();
   }

   public final short e() {
      return this.f == null ? 0 : this.f.h();
   }

   public final void a(byte var1) {
      this.j = var1;
      if (this.g == 701) {
         this.f = MainCanvas.ah.a(this.d[0], this.a, this.b, this.c);
         if (this.f == null) {
            ao_1.a(this.g, this.a, this.b, this.c);
            this.f = MainCanvas.ah.a(this.d[0], this.a, this.b, this.c);
            return;
         }
      } else {
         this.f = MainCanvas.ah.a(this.d[var1], this.a, this.b, this.c);
         if (this.f == null) {
            ao_1.a(this.g, this.a, this.b, this.c);
            this.f = MainCanvas.ah.a(this.d[var1], this.a, this.b, this.c);
         }
      }

   }

   public void a(aw var1, PngUtil var2, long var3) {
      if (this.f != null && this.e.size() >= 6) {
         short[] var5 = (short[])this.e.elementAt(0);
         this.a(var5);
         this.h = var5[0];
         this.i = var5[1];
         PngUtil.a(this.f, var3);
         this.e.removeElementAt(0);
      }

   }

   protected final void a(short[] var1) {
      if (this.k == null) {
         this.k = var1;
      } else {
         if (this.k[0] == var1[0]) {
            if (var1[1] > this.k[1]) {
               this.j = 3;
            } else {
               this.j = 1;
            }
         }

         if (this.k[1] == var1[1]) {
            if (var1[0] > this.k[0]) {
               this.j = 2;
            } else {
               this.j = 0;
            }
         }

         this.k = var1;
         this.a(this.j);
      }
   }

   public void a(Graphics var1, PngUtil var2, int var3, int var4, byte var5) {
      if (this.f != null) {
         switch (this.j) {
            case 0:
               var2.a(var1, (Frame1)this.f, (int[])null, var3, var4, this.h + 16 - this.f.i() / 2, this.i + 16 - this.f.h(), 20, 0);
               return;
            case 1:
               var2.a(var1, (Frame1)this.f, (int[])null, var3, var4, this.h + 8 - this.f.i() / 2, this.i, 20, 0);
               return;
            case 2:
               var2.a(var1, (Frame1)this.f, (int[])null, var3, var4, this.h - this.f.i() / 2, this.i + 16 - this.f.h(), 20, 0);
               break;
            case 3:
               var2.a(var1, (Frame1)this.f, (int[])null, var3, var4, this.h + 8 - this.f.i() / 2, this.i + 8 - this.f.h(), 20, 0);
               return;
         }
      }

   }
}

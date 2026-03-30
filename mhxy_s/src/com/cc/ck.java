package com.cc;

import com.yinhan.kjava.main.a_MainCanvas;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class ck {
   public byte a;
   public byte b;
   public String c;
   public String d;
   public int e;
   public int f;
   public int g;
   public int h;
   public short i;
   public short j;
   private byte v;
   public byte k;
   public byte l;
   public bc_1 m;
   public byte n;
   private int[] w;
   public boolean o = false;
   public boolean p = false;
   public boolean q = false;
   public short r;
   public short s;
   public short t;
   public Vector u = new Vector();
   private int x = 0;

   public final void a(byte var1) {
      this.v = var1 <= 0 ? 1 : var1;
   }

   public final void b(byte var1) {
      t.ag.delete(0, t.ag.length());
      this.n = var1;
      if (this.b == 0) {
         if (var1 == 4) {
            t.ag.append("com.cc.f").append(this.j).append(1).append(var1);
         } else {
            t.ag.append("com.cc.f").append(this.j).append(1).append(this.v).append(var1);
         }

         this.m = a_MainCanvas.ab.b(t.ag.toString());
         if (this.m == null && var1 != 4) {
            t.ag.delete(0, t.ag.length());
            t.ag.append("com.cc.f").append(this.j).append(1).append(1).append(var1);
            this.m = a_MainCanvas.ab.b(t.ag.toString());
         }
      } else if (this.b == 1) {
         t.ag.append(this.j).append(var1 > 3 ? 3 : var1);
         this.m = a_MainCanvas.ah.a(t.ag.toString(), this.r, this.s, this.t);
      }

      if (this.m != null) {
         this.m = this.m.b();
      }

   }

   public final int a(ai_1 var1, long var2) {
      if (this.m != null && !this.a()) {
         if (this.w == null) {
            this.w = new int[2];
            ai_1.a(this.m, this.w);
         }

         if (this.x != 2) {
            this.x = ai_1.a(this.m, var2);
         }

         if (this.x == 2) {
            this.x = 0;
         }

         return this.x;
      } else {
         return -1;
      }
   }

   public final void a(Graphics var1, ai_1 var2, int var3, int var4, byte var5) {
      if (!this.a() && this.m != null) {
         if (this.w == null) {
            this.w = new int[2];
            ai_1.a(this.m, this.w);
         }

         var2.a(var1, (bc_1)this.m, (int[])null, 0, 0, var3, var4, 20, 0);
      }

   }

   public final boolean a() {
      return this.e <= 0;
   }

   public final void b() {
      this.d = null;
      this.w = null;
      if (this.m != null) {
         bc_1 var1 = this.m;
      }

      this.m = null;
   }

   public final short c() {
      return this.m != null && this.m.g != null ? this.m.g[this.m.f] : 0;
   }

   public final short d() {
      return this.m != null && this.m.h != null ? this.m.h[0] : 0;
   }
}

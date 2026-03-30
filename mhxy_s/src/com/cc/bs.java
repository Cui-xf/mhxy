package com.cc;

public final class bs {
   public int a;
   public int b;
   public bs c;

   public bs() {
      this.a = this.b = 0;
   }

   public bs(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public bs(int var1, int var2, bs var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final int a(bs var1) {
      return (this.a - var1.a) * (this.a - var1.a) + (this.b - var1.b) * (this.b - var1.b);
   }

   public final boolean b(bs var1) {
      return this.a == var1.a && this.b == var1.b;
   }
}

package com.cc;

import javax.microedition.lcdui.Graphics;

public abstract class bk {
   protected int f;
   protected int g;
   protected int h;
   protected int i;

   public final int e() {
      return this.i;
   }

   public final boolean b(int var1, int var2) {
      return var1 >= this.f && var1 <= this.f + this.h && var2 >= this.g && var2 <= this.g + this.i;
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.f = var1;
      this.g = var2;
      this.h = var3;
      this.i = var4;
   }

   public abstract void a();

   public abstract void b();

   public abstract void a(int var1);

   public abstract int a(int var1, int var2);

   public abstract void a(Graphics var1);
}

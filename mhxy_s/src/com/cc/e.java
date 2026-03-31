package com.cc;

final class e {
   public String[] a;
   public int[] b;

   public e(TextRender var1, String[] var2, String[] var3) {
      this.a = var2;
      this.b = new int[var3.length];

      for(int var4 = 0; var4 < var3.length; ++var4) {
         this.b[var4] = LoadingPage.a(Integer.parseInt(var3[var4]));
      }

   }

   public final short a() {
      if (this.a != null && this.a.length > 0) {
         short var1 = 0;

         for(int var2 = 0; var2 < this.a.length; ++var2) {
            var1 = (short)(var1 + t_1.i.stringWidth(this.a[var2]));
         }

         return var1;
      } else {
         return 0;
      }
   }
}

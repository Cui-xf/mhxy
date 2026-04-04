package com.cc;

final class j {
   private int[] a;

   public j(bh var1, String[] var2, String[] var3, String[] var4) {
      this.a = new int[var3.length];

      for(int var5 = 0; var5 < var3.length; ++var5) {
         this.a[var5] = LoadingPage.pickColor(Integer.parseInt(var3[var5]));
      }

   }
}

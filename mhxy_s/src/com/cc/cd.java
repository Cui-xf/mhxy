package com.cc;

public final class cd {
   public short a = -1;
   public String b = null;
   public int c = 0;
   public int d = 0;
   public int e = 0;
   public int f = 0;
   public String g = null;
   public String h = null;
   public String[] i = null;
   public int[] j = null;
   public int[] k = null;
   public int[] l = null;
   public PopUpWindow m = null;

   public final void a(PopUpWindow var1) {
      this.m = var1;
   }

   public final void a() {
      this.m.setBox(this.c, this.d, this.e, this.f);
   }

   public final void b() {
      if (this.g != null) {
         this.m.setTitle(this.g);
      }

      this.m.addChild((UIComponent)(new FWBUIComponent(this.h)));
      if (this.i != null) {
         BottomUIComponent var1 = new BottomUIComponent();
         if (this.i[0] != null) {
            var1.a(this.i[0]);
         }

         if (this.i[1] != null) {
            var1.b(this.i[1]);
         }

         if (this.i[2] != null) {
            var1.c(this.i[2]);
         }

         this.m.addChild((UIComponent)var1);
      }

      this.m.layout();
   }
}

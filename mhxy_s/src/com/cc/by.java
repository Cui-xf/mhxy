package com.cc;

public class by {
   public boolean a;
   public byte b;
   public Object c;

   public by(byte var1, Object var2, boolean var3) {
      this.b = var1;
      this.c = var2;
      this.a = var3;
   }

   public short a() {
      switch (this.b) {
         case 1:
            return ((ar)this.c).m();
         case 2:
            return ((bl)this.c).m();
         case 3:
            return ((bp)this.c).m();
         case 4:
            return ((au)this.c).a();
         case 5:
            return ((az_1)this.c).d;
         case 6:
         default:
            return 0;
         case 7:
            return ((s)this.c).a();
         case 8:
            bv var1;
            return (var1 = (bv)this.c).d == null ? 0 : (short)(var1.f + (var1.d.h() == 0 ? 24 : var1.d.h()));
      }
   }
}

package com.cc;

import com.cc.resource.SpritePiece;

public final class cb extends by {
   public int[] d;
   private int e;

   public cb(byte var1, SpritePiece var2, short var3, short var4, int[] var5) {
      super((byte)6, var2, true);
      this.d = var5;
      this.e = var2.transformY + var5[3] + var5[1];
   }

   public final short a() {
      switch (super.b) {
         case 6:
            return (short)this.e;
         default:
            return 0;
      }
   }
}

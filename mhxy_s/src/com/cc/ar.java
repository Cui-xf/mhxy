package com.cc;

import java.util.Vector;

public abstract class ar {
   public au d;
   public String e;
   public Vector f = new Vector();
   public Frame1 g;
   public byte h = 3;
   short[] i;
   public short j = -1;
   public short k = -1;
   public short l = -1;
   public short m = -1;

   public final short m() {
      return (short)(this.k + 16);
   }

   public final short n() {
      return this.g == null ? 0 : (short)(this.k - (this.g.h() - 16));
   }

   public final short o() {
      return this.g == null ? 0 : (short)(this.j + 8 - this.g.g() / 2);
   }

   public final short p() {
      return this.g == null ? 0 : this.g.g();
   }

   public final short q() {
      return this.g == null ? 0 : this.g.h();
   }

   public final void r() {
      if (this.d != null) {
         this.d.e.addElement(new short[]{this.j, this.k});
      }

   }
}

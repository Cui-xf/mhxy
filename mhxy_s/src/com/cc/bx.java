package com.cc;

import java.io.DataInputStream;
import java.io.IOException;

public final class bx {
   public cf a;
   public short b;
   public byte c;
   public short d;
   public short e;
   public short f;
   public byte g;
   private aj h;

   public final aj a() {
      if (this.h == null && this.a != null && this.a.o == 0) {
         this.h = ((bf_1)this.a).a(this.d);
      }

      return this.h == null ? new aj((short)0, (short)0, (short)0, (short)0) : this.h;
   }

   public final void a(DataInputStream var1, boolean var2) throws IOException {
      this.b = var1.readShort();
      this.c = var1.readByte();
      this.e = var1.readShort();
      this.f = var1.readShort();
      this.d = var1.readShort();
      this.g = var1.readByte();
   }
}

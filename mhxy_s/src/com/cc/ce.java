package com.cc;

import java.io.DataInputStream;

public final class ce {
   public byte a;
   public byte b;
   public String c;
   public String d;
   public String e;

   public ce() {
   }

   public ce(String var1, byte var2, String var3, byte var4) {
      this.d = var1;
      this.b = var2;
      this.e = var3;
      this.a = var4;
   }

   public final void a(DataInputStream var1) {
      var1.readInt();
      this.a = var1.readByte();
      this.b = var1.readByte();
      this.c = var1.readUTF();
      this.d = var1.readUTF();
      this.e = var1.readUTF();
   }
}

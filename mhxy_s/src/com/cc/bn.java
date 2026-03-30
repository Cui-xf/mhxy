package com.cc;

import java.io.DataInputStream;

public final class bn {
   public int a;
   public String b;
   public byte c;
   public byte d;
   public byte e;
   public byte f;
   public byte g;
   public short h;
   public short i;
   public String j;
   public String k;
   public String l;
   public String m;
   public String n;
   public String o;
   public short p;
   public long q;
   public short r;
   public String s;
   public int t;
   public short[] u;
   public byte v = 0;

   public final void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readUTF();
      this.h = var1.readShort();
      this.c = var1.readByte();
      this.d = var1.readByte();
      this.e = var1.readByte();
      this.f = var1.readByte();
      this.g = var1.readByte();
      this.i = var1.readShort();
      this.j = var1.readUTF();
      this.k = var1.readUTF();
      this.l = var1.readUTF();
      this.m = var1.readUTF();
      this.n = var1.readUTF();
      this.o = var1.readUTF();
      this.p = var1.readShort();
      this.q = var1.readLong();
      this.r = var1.readShort();
      this.s = var1.readUTF();
      this.t = var1.readInt();
      byte var2;
      if ((var2 = var1.readByte()) > 0) {
         this.u = new short[var2];

         for(byte var3 = 0; var3 < var2; ++var3) {
            this.u[var3] = var1.readShort();
         }
      }

   }
}

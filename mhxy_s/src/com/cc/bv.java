package com.cc;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class bv {
   public short a = 4;
   public short b = 4;
   public int c;
   public Frame1 d;
   public short e;
   public short f;
   public short g;
   public int h;
   public byte i = -1;
   public int[] j;
   public String[] k;

   public bv() {
   }

   public bv(int var1, short var2, short var3, short var4, byte var5) {
      this.c = var1;
      this.e = var2;
      this.f = var3;
      this.g = var4;
      this.i = var5;
   }

   public final void a(DataInputStream var1) throws IOException {
      this.c = var1.readInt();
      var1.readUTF();
      this.e = var1.readShort();
      this.f = var1.readShort();
      this.g = var1.readShort();
      byte var2 = var1.readByte();
      this.j = new int[var2];
      this.k = new String[var2];
      this.h = Page.a((String)String.valueOf(this.g), (byte)2);

      for(int var3 = 0; var3 < var2; ++var3) {
         this.j[var3] = var1.readInt();
         this.k[var3] = var1.readUTF();
      }

   }

   public final short a() {
      if (this.d == null) {
         return 0;
      } else {
         return this.d.g() == 0 ? 16 : this.d.g();
      }
   }

   public final short b() {
      if (this.d == null) {
         return 0;
      } else {
         return this.d.h() == 0 ? 24 : this.d.h();
      }
   }

   public final void a(byte var1) {
      if (GlobalStatus.bs != 0 || GlobalStatus.s != 0) {
         if (var1 == 0) {
            this.a = -4;
            this.b = 0;
         } else if (var1 == 2) {
            this.a = 4;
            this.b = 0;
         } else if (var1 == 1) {
            this.a = 0;
            this.b = -4;
         } else if (var1 == 3) {
            this.a = 0;
            this.b = 4;
         } else {
            this.a = 0;
            this.b = 0;
         }
      }
   }

   public final void a(Graphics var1, PngUtil var2, int var3, int var4, byte var5) {
      if (this.d != null && this.d.k != null) {
         var2.a(var1, this.d.k[this.d.f], this.d.g(), this.d.h(), (int[])null, var3, var4, this.e, this.f, 20, 0);
      }

   }
}

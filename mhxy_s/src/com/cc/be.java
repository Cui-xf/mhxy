package com.cc;

import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

public final class be {
   public String a;
   public String b;
   public String c;
   public boolean d;
   public static Image[] e = new Image[2];

   public final void a(DataInputStream var1) {
      this.a = var1.readUTF();
      this.b = var1.readUTF();
      this.c = var1.readUTF();
      this.d = var1.readBoolean();
   }
}

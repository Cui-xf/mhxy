package com.cc;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class be_1 {
   public String a;
   public String b;
   public String c;
   public boolean d;
   public static Image[] e = new Image[2];

   public final void a(DataInputStream var1) throws IOException {
      this.a = var1.readUTF();
      this.b = var1.readUTF();
      this.c = var1.readUTF();
      this.d = var1.readBoolean();
   }
}

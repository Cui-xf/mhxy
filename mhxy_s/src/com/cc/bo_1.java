package com.cc;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class bo_1 {
   public String a;
   public String b;
   private String h;
   public String c;
   public String d;
   public String e;
   public boolean f;
   public static Image[] g = new Image[2];

   public final void a(DataInputStream var1) throws IOException {
      this.a = var1.readUTF();
      this.b = var1.readUTF();
      this.h = var1.readUTF();
      this.e = var1.readUTF();
      this.c = var1.readUTF();
      this.d = var1.readUTF();
      this.f = var1.readBoolean();
   }

   public final String a() {
      return this.b.length() < 5 ? this.b : this.b.substring(0, 5) + "…";
   }

   public final String b() {
      if (this.f) {
         StringBuffer var1;
         (var1 = new StringBuffer()).append("<2>标题: <7>" + this.b);
         var1.append("\t");
         var1.append("<2>内容: <7>" + this.h);
         var1.append("\t");
         var1.append("<2>发件人: <7>" + this.e);
         var1.append("\t" + this.c);
         return var1.toString();
      } else {
         return "<10>未读邮件。\t<8>选择<6>查看<8>可打开阅读。";
      }
   }
}

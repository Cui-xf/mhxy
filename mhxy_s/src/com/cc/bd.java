package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public final class bd implements CommandListener {
   public ao_1 a;
   public MainCanvas b;
   public byte c = 0;
   private String e;
   private String f;
   private short g;
   private short[] h = new short[3];
   private short i;
   private byte[] j;
   private short[] k;
   private int[] l;
   private String[] m;
   private Form n;
   public TextField d;
   private Command o;
   private Command p;

   public bd(ao_1 var1, MainCanvas var2, PngUtil var3) {
      this.a = var1;
      this.b = var2;
   }

   public final void a(DataInputStream var1) throws IOException {
      this.e = var1.readUTF();
      this.f = var1.readUTF();
      this.g = var1.readShort();
      this.h[0] = var1.readShort();
      this.h[1] = var1.readShort();
      this.h[2] = var1.readShort();
      this.i = var1.readShort();
      short var2 = (short)(this.i % 10);
      short var3 = (short)(this.i / 10 % 10);
      short var4 = (short)(this.i / 100 % 10);
      short var5 = (short)(this.i / 1000 % 10);
      this.j = null;
      if (var2 > 0) {
         this.j = new byte[var2];

         for(int var6 = 0; var6 < var2; ++var6) {
            this.j[var6] = var1.readByte();
         }
      }

      this.k = null;
      if (var3 > 0) {
         this.k = new short[var3];

         for(int var7 = 0; var7 < var3; ++var7) {
            this.k[var7] = var1.readShort();
         }
      }

      this.l = null;
      if (var4 > 0) {
         this.l = new int[var4];

         for(int var8 = 0; var8 < var4; ++var8) {
            this.l[var8] = var1.readInt();
         }
      }

      this.m = null;
      if (var5 > 0) {
         this.m = new String[var5];

         for(int var9 = 0; var9 < var5; ++var9) {
            this.m[var9] = var1.readUTF();
         }
      }

   }

   public final void a() {
      this.c = 0;
      LoadingPage.h = 0;
      LoadingPage.g = 0;
      short var4 = this.g;
      String var3 = this.f;
      String var2 = this.e;
      if (var2 == null) {
         var2 = "";
      }

      if (var3 == null) {
         var3 = "";
      }

      this.n = new Form(var2);
      this.o = new Command("确定", 4, 2);
      this.p = new Command("返回", 2, 1);
      this.n.addCommand(this.p);
      this.n.addCommand(this.o);
      this.n.setCommandListener(this);
      this.n.append(var3);
      this.d = new TextField((String)null, "", var4, 0);
      this.n.append(this.d);
      this.b.q.setCurrent(this.n);
      this.b.touchAction = 0;
      this.b.b = 0;
      this.b.touchPageCase = this.b.k;
      this.a.l = 0;
      this.a.k = 129;
   }

   public final byte[] a(short var1, String var2, String var3) {
      try {
         ByteArrayOutputStream var6 = new ByteArrayOutputStream();
         DataOutputStream var4;
         (var4 = new DataOutputStream(var6)).writeByte(-82);
         var4.writeShort(4375);
         var4.writeUTF(GlobalStatus.b);
         var4.writeUTF(GlobalStatus.d);
         var4.writeUTF(var2);
         var4.writeUTF(var3);
         var4.writeShort(this.h[0]);
         var4.writeShort(this.h[1]);
         var4.writeShort(this.h[2]);
         var4.writeShort(this.i);
         if (this.j != null && this.j.length > 0 && this.j.length < 10) {
            for(int var7 = 0; var7 < this.j.length; ++var7) {
               var4.writeByte(this.j[var7]);
            }
         }

         if (this.k != null && this.k.length > 0 && this.k.length < 10) {
            for(int var8 = 0; var8 < this.k.length; ++var8) {
               var4.writeShort(this.k[var8]);
            }
         }

         if (this.l != null && this.l.length > 0 && this.l.length < 10) {
            for(int var9 = 0; var9 < this.l.length; ++var9) {
               var4.writeInt(this.l[var9]);
            }
         }

         if (this.m != null && this.m.length > 0 && this.m.length < 10) {
            for(int var10 = 0; var10 < this.m.length; ++var10) {
               var4.writeUTF(this.m[var10]);
            }
         }

         var4.writeByte(-81);
         return var6.toByteArray();
      } catch (IOException var5) {
         ((Throwable)var5).printStackTrace();
         return null;
      }
   }

   public final void b() {
      this.e = null;
      this.f = null;
      this.g = 0;
      this.h[0] = 0;
      this.h[1] = 0;
      this.h[2] = 0;
      this.i = 0;
      this.j = null;
      this.k = null;
      this.l = null;
      this.m = null;
   }

   public final void c() {
      if (this.n != null) {
         this.n.removeCommand(this.o);
         this.n.removeCommand(this.p);
         this.n.deleteAll();
      }

      this.o = null;
      this.p = null;
      this.d = null;
      this.n = null;
   }

   public final void commandAction(Command var1, Displayable var2) {
      String var3 = var1.getLabel();
      String var4 = this.d.getString();
      if (var3.equals("确定") && var4 != null) {
         if (var4.length() == 0) {
            this.b.b("名称为空！");
         } else {
            if (this.a.R != null) {
               this.a.R.c = 1;
            }

            this.b.mainMidlet.start();
         }
      } else {
         if (var3.equals("返回")) {
            if (this.a.R != null) {
               this.a.R.c = 2;
            }

            this.b.mainMidlet.start();
            this.c();
         }

      }
   }
}

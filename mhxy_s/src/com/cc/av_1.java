package com.cc;

import com.yinhan.kjava.main.a_MainCanvas;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public final class av_1 {
   public static String a = "http://117.135.138.130:7099";
   public static String b = "socket://120.78.151.213:20008";
   public static String c = "";
   private static String j = "";
   public static byte d;
   public byte e;
   public a_MainCanvas f;
   private q k = new q();
   private x l;
   public at g;
   private Vector m = new Vector();
   private w n = null;
   public static byte h = -1;
   public static byte i = 2;

   public av_1() {
      bz_1.c = t.a == 0 ? 162 : 40;
      h = -1;
      i = 2;
      if (a == null) {
         a = "http://117.135.138.130:7099";
      }

      if (b == null) {
         b = "socket://120.78.151.213:20008";
      }

      c = "";
      j = "";
      this.b();
   }

   public final void a(a_MainCanvas var1) {
      this.f = var1;
      if (this.k != null) {
         this.k.a(var1);
      }

   }

   private void e() {
      if (h == 2) {
         d = 1;
         c = b;
         if (this.g != null) {
            this.g.a();
         }

         this.g = new at(this);
         if (this.l == null) {
            this.l = new x(this);
         }
      }

   }

   public final q a() {
      return this.k;
   }

   public static boolean a(String var0) {
      return !c.equals(var0);
   }

   public final void b() {
      if (t.a == 0) {
         if (h == -1) {
            i = 2;
            j = null;
            b = null;
            c = null;
            h = i;
            this.e();
         }

      } else {
         j = i == 2 ? b : a;
         h = i;
         c = j;
         d = 3;
         if (h == 2) {
            this.e();
         }

         t.a("当前服务地址-->" + c);
      }
   }

   private void b(w var1) {
      this.m.addElement(var1);
   }

   public static boolean a(Vector var0, w var1) {
      Object var2 = null;

      for(int var3 = 0; var3 < var0.size(); ++var3) {
         w var4 = (w)var0.elementAt(var3);
         if (var1.a() == var4.a()) {
            return true;
         }
      }

      return false;
   }

   public final void c() {
      if (this.m.size() > 0) {
         for(int var1 = 0; var1 < this.m.size(); ++var1) {
            this.n = (w)this.m.elementAt(0);
            if (this.n != null) {
               try {
                  w var2 = this.n;
                  if (this.k != null) {
                     this.k.a(var2);
                  } else {
                     this.f.b("网络数据包处理器未启动");
                  }
               } catch (Exception var3) {
                  if (this.f != null) {
                     this.f.a((Exception)var3, (byte)6);
                     ((Throwable)var3).printStackTrace();
                  }
               }

               this.m.removeElementAt(0);
               return;
            }
         }
      }

   }

   public final void a(w var1) {
      t.a("sendPacket:" + Integer.toHexString(var1.a()));
      at var2 = this.g;
      if (var1.a() == 4101) {
         if (var2.b.size() == 0) {
            var2.b.addElement(var1);
            return;
         }
      } else if (!a(var2.a, var1)) {
         (new StringBuffer()).append("添加发送数据包: ").append(var1.a()).toString();
         var2.a.addElement(var1);
      }

   }

   public final void a(InputStream var1) {
      DataInputStream var4;
      if ((var4 = new DataInputStream(var1)).readByte() == 2) {
         short var2 = var4.readShort();
         (new StringBuffer()).append("接收数据包|").append(var2).toString();
         if (var2 != 8192) {
            byte[] var3 = new byte[var4.readInt()];
            var4.readFully(var3);
            this.b(new w(var2, var3));
            return;
         }

         var4.readInt();
         this.a(var4);
      } else {
         short var7 = (short)var4.readByte();
         int var11 = (short)var4.readByte();
         var11 = ((var7 < 0 ? var7 + 256 : var7) << 8) + (var11 < 0 ? var11 + 256 : var11);
         (new StringBuffer()).append("接收压缩数据包大小|").append(var11).toString();
         if (var11 > 0) {
            byte[] var8 = new byte[var11];
            var4.readFully(var8);
            var8 = ci.a(var8);
            ByteArrayInputStream var5 = new ByteArrayInputStream(var8);
            DataInputStream var6;
            short var10 = (var6 = new DataInputStream(var5)).readShort();
            (new StringBuffer()).append("接收压缩数据包|").append(var10).toString();
            if (var10 == 8192) {
               var6.readInt();
               this.a(var6);
               return;
            }

            byte[] var13 = new byte[var6.readInt()];
            var6.readFully(var13);
            this.b(new w(var10, var13));
         }
      }

   }

   private void a(DataInputStream var1) {
      byte var2;
      if ((var2 = var1.readByte()) > 0) {
         w var3 = new w((short)8192);
         boolean var5 = false;

         for(int var6 = 0; var6 < var2; ++var6) {
            short var4 = var1.readShort();
            (new StringBuffer()).append("接收子数据包_|").append(var4).toString();
            byte[] var8 = new byte[var1.readInt()];
            var1.readFully(var8);
            w var7 = new w(var4, var8);
            var3.c.addElement(var7);
         }

         this.b(var3);
      }

   }

   public final void b(String var1) {
      ByteArrayOutputStream var2 = null;
      DataOutputStream var3 = null;
      boolean var10 = false;

      label90: {
         try {
            var10 = true;
            boolean var4 = false;
            Object var17 = null;
            var2 = new ByteArrayOutputStream();
            (var3 = new DataOutputStream(var2)).writeByte(-10);
            var3.writeUTF(var1);
            var3.flush();
            ((OutputStream)var2).flush();
            byte[] var18 = var2.toByteArray();
            w var16 = new w((short)8193, var18);
            this.b(var16);
            var10 = false;
            break label90;
         } catch (IOException var14) {
            ((Throwable)var14).printStackTrace();
            var10 = false;
         } finally {
            if (var10) {
               try {
                  if (var3 != null) {
                     var3.close();
                  }

                  if (var2 != null) {
                     var2.close();
                  }
               } catch (IOException var11) {
                  ((Throwable)var11).printStackTrace();
               }

            }
         }

         try {
            if (var3 != null) {
               var3.close();
            }

            if (var2 != null) {
               var2.close();
            }

            return;
         } catch (IOException var12) {
            ((Throwable)var12).printStackTrace();
            return;
         }
      }

      try {
         var3.close();
         var2.close();
      } catch (IOException var13) {
         ((Throwable)var13).printStackTrace();
      }
   }

   public final void d() {
      d = 3;
      if (this.l != null) {
         this.l.a();
      }

      if (this.g != null) {
         this.g.a();
      }

      this.l = null;
      this.g = null;
   }

   public static void a(int var0) {
      try {
         Thread.sleep((long)15);
      } catch (Exception var1) {
      }
   }
}

package com.cc;

import com.yinhan.kjava.main.a_MainCanvas;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class at implements Runnable {
   private SocketConnection c;
   private DataOutputStream d;
   private DataInputStream e;
   private av_1 f;
   private long g;
   public Vector a = new Vector();
   public Vector b = new Vector();
   private boolean h = true;
   private boolean i;

   public at(av_1 var1) {
      av_1.d = 1;
      this.f = var1;
      (new Thread(this)).start();
   }

   public final void a() {
      this.h = false;

      try {
         if (this.e != null) {
            this.e.close();
         }

         if (this.d != null) {
            this.d.close();
         }

         if (this.c != null) {
            this.c.close();
         }

         this.a.removeAllElements();
         this.b.removeAllElements();
      } catch (IOException var2) {
         ((Throwable)var2).printStackTrace();
      }

      this.c = null;
      this.d = null;
      this.e = null;
   }

   public final void b() {
      if (av_1.d != 3) {
         try {
            if (this.c == null) {
               this.c = (SocketConnection)Connector.open(av_1.c);
               this.c.setSocketOption((byte)2, 1);
               this.c.setSocketOption((byte)1, 5);
               this.c.setSocketOption((byte)0, 10000);
               this.d = this.c.openDataOutputStream();
               this.e = this.c.openDataInputStream();
               this.i = true;
            }

            if (this.c != null) {
               if (this.a.size() > 0) {
                  this.a(this.a);
                  this.g = this.f.f.ak;
                  return;
               }

               if (this.b.size() > 0) {
                  if (this.f.f.ak - this.g < 2000L) {
                     return;
                  }

                  this.a(this.b);
                  this.g = this.f.f.ak;
               }
            }

         } catch (IOException var4) {
            ((Throwable)var4).printStackTrace();
            ++this.f.e;
            (new StringBuffer()).append("数据发送异常，尝试重连|").append(this.f.e).toString();
            if (this.f.e > 30) {
               this.f.d();
               this.f.b("连接超时,请尝试其他连接方式!");
            }

            this.a();
            this.g = this.f.f.ak;
         } finally {
            ;
         }
      }
   }

   private void a(Vector var1) {
      w var2 = (w)var1.elementAt(0);
      (new StringBuffer()).append("开始数据包发送|").append(var2.a()).toString();
      byte[] var3 = new byte[var2.b.length + 2];

      for(short var4 = 0; var4 < var3.length; ++var4) {
         if (var4 == 0) {
            var3[var4] = var2.b[var4];
         } else if (var4 == 1) {
            var3[var4] = (byte)(var2.b.length >> 8 & 255);
            ++var4;
            var3[var4] = (byte)var2.b.length;
         } else {
            var3[var4] = var2.b[var4 - 2];
         }
      }

      w var5 = var2;
      byte[] var10 = var3;
      at var9 = this;

      try {
         ByteArrayOutputStream var6 = new ByteArrayOutputStream();
         DataOutputStream var7 = new DataOutputStream(var6);
         if (var9.i || var5.a) {
            if (t_1.a == 0) {
               ((OutputStream)var7).write(bz_1.a((byte)1, bz_1.c, 0, 0));
            } else {
               var7.writeByte(bz_1.a);
               var7.writeByte(bz_1.b);
            }

            var9.i = false;
         }

         ((OutputStream)var7).write(var10);
         var9.d.write(var6.toByteArray());
         var9.d.flush();
      } catch (IOException var8) {
         ((Throwable)var8).printStackTrace();
      }

      if (var2.a() == 4630) {
         bt_1.e = System.currentTimeMillis();
      }

      this.g = this.f.f.ak;
      this.f.e = 0;
      var1.removeElementAt(0);
      if (var2.a() == 4352) {
         this.a.removeAllElements();
         this.b.removeAllElements();
      }

      (new StringBuffer()).append("完成数据包发送|").append(var2.a()).toString();
   }

   public final void run() {
      while(this.h && av_1.d != 3) {
         try {
            if (this.c != null && this.e != null) {
               this.f.a((InputStream)this.e);
            }
         } catch (Exception var3) {
            ((Throwable)var3).printStackTrace();
            (new StringBuffer()).append("数据读取异常").append(((Throwable)var3).getMessage()).toString();

            try {
               this.a();
               if (a_MainCanvas.e != null && a_MainCanvas.e.k == 25) {
                  if (a_MainCanvas.e.g != null) {
                     a_MainCanvas.e.g.l();
                  }
               } else if (this.f.f.k != 3 && this.f.f.k != 9 && this.f.f.k != 4) {
                  this.f.b("数据更新失败:");
               }
            } catch (Exception var2) {
               ((Throwable)var2).printStackTrace();
            }
         }
      }

   }
}

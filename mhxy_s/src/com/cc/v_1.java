package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class v_1 {
   private ao_1 h;
   private MainCanvas i;
   public static int[] a;
   private static String[] j;
   private static String[] k;
   public static String b;
   private static byte l = 0;
   public static String c = "结婚守则：\t1.游戏中未婚状态的一对异性玩家可申请结婚\t2.双方好感度均需达到1000点或以上\t3.双方等级需达到40级或以上\t4.双方需各自支付100万两的结婚申请费用";
   public int d = 0;
   private String[] m = new String[]{"同意(点击申请结婚)", "拒绝"};
   public static byte e = 0;
   public static String f = "离婚守则：\t1.离婚后夫妻双方好感度降低为0\t2.离婚后不可使用夫妻饰物、接取夫妻任务和获得夫妻声望\t3.一方申请离婚，在对方同意离婚后，离婚效果即时生效\t4.一方申请离婚，如对方不进行确认，则离婚效果在申请离婚后72时自动生效";
   public int g = 0;
   private String[] n = new String[]{"离婚(点击申请离婚)", "取消离婚"};
   private static int[] o;
   private static String[] p;

   public v_1(ao_1 var1, MainCanvas var2) {
      this.h = var1;
      this.i = var2;
   }

   public final void a(String var1, String var2, long var3) {
      byte[] var5;
      if ((var5 = NetPayloadBuilder.a((short)4857, GlobalStatus.ad, var1, var2, var3)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4857, var5));
         this.h.j = this.h.k = 0;
         this.i.a((String)null);
      } else {
         this.i.b("获取上传指令数据错误!");
      }
   }

   public final void a() {
      byte[] var1;
      if ((var1 = NetPayloadBuilder.m((short)4858, GlobalStatus.ad, (short) GlobalStatus.gQ)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4858, var1));
         this.h.j = this.h.k = 0;
         this.i.a((String)null);
      } else {
         this.i.b("获取上传指令数据错误!");
      }
   }

   public static void a(DataInputStream var0) throws IOException {
      GlobalStatus.gQ = var0.readShort();
      short var1 = var0.readShort();
      GlobalStatus.gR = var0.readByte();
      if (var1 <= 0) {
         g();
      } else {
         a = new int[var1];
         j = new String[var1];
         k = new String[var1];

         for(int var2 = 0; var2 < var1; ++var2) {
            a[var2] = var0.readInt();
            j[var2] = var0.readUTF();
            k[var2] = var0.readUTF();
         }

      }
   }

   private static void g() {
      a = null;
      j = null;
      k = null;
   }

   public static void b(DataInputStream var0) throws IOException {
      b = var0.readUTF();
   }

   public final void a(int var1) {
      this.i.aq.j();
      this.i.aq.a("求爱宣言");
      this.i.aq.a(false);
      this.i.ar.a((Image[])null, k, (String[])null, j);
      this.i.ar.a(var1);
      this.i.au.a("查看");
      this.i.au.a(true);
      this.i.aq.a((al)this.i.ar);
      this.i.aq.a((al)this.i.au);
      this.i.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.h.l = 0;
      this.i.touchPageCase = this.i.k;
      this.h.j = this.h.k = 90;
   }

   public final void b() {
      this.i.aq.j();
      this.i.aq.a("求爱宣言");
      this.i.aq.a(false);
      this.i.at.a(b, GlobalConfig.i, (byte)2);
      this.i.au.a("确定");
      this.i.aq.a((al)this.i.at);
      this.i.aq.a((al)this.i.au);
      this.i.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.h.l = 2;
      this.i.touchPageCase = this.i.k;
      this.h.j = this.h.k = 90;
   }

   public final void b(int var1) {
      if (this.h.l == 0) {
         if (this.i.aq != null) {
            this.i.aq.b(var1);
         }

         if (a != null && (var1 == 268435456 || var1 == 1073741824 || var1 == 517)) {
             LoadingPage.a(80 + GlobalConfig.f, GlobalConfig.j + 20 + this.i.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"查看"}, false);
            this.h.l = 1;
            this.h.aA = this.i.ar.h();
            this.h.aE = this.i.ar.g();
         }

         if (var1 == 536870912) {
            this.h.l = 0;
            this.h.j = this.h.k = 0;
            return;
         }

         if (var1 == 1024) {
            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
               if (GlobalStatus.gQ - 1 <= 1) {
                  GlobalStatus.gQ = 1;
               } else {
                  --GlobalStatus.gQ;
               }

               this.a();
               return;
            }

            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
               if (GlobalStatus.gQ - 1 < 1) {
                  GlobalStatus.gQ = 1;
               } else {
                  --GlobalStatus.gQ;
               }

               this.a();
               return;
            }
         } else if (var1 == 2048) {
            if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
               ++GlobalStatus.gQ;
               this.a();
               return;
            }

            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
               ++GlobalStatus.gQ;
               this.a();
               return;
            }
         }
      } else if (this.h.l == 1) {
          LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.h.l = 0;
               return;
            }
         } else if ( LoadingPage.o == 0) {
            var1 = a[this.i.ar.g()];
            byte[] var3;
            if ((var3 = NetPayloadBuilder.A((short)4859, GlobalStatus.ad, var1)) == null) {
               this.i.b("获取上传指令数据错误!");
               return;
            }

            MainCanvas.netUtils.sendPacket(new NetPacket((short)4859, var3));
            this.h.j = this.h.k = 0;
            this.i.a((String)null);
         }
      } else if (this.h.l == 2) {
         if (this.i.aq != null) {
            this.i.aq.b(var1);
         }

         if (var1 == 268435456 || var1 == 1073741824 || var1 == 517 || var1 == 536870912) {
            this.a(this.h.aE);
            b = null;
         }
      }

   }

   public final void a(Graphics var1) {
      if (this.h.l != 0 && this.h.l != 1) {
         if (this.h.l == 2 && this.i.aq != null) {
            this.i.aq.a(var1);
         }
      } else {
         if (this.i.aq != null) {
            this.i.aq.a(var1);
         }

         if (this.h.l == 1) {
             LoadingPage.c(var1);
            return;
         }
      }

   }

   public final void a(byte var1) {
      byte[] var2;
      if ((var2 = NetPayloadBuilder.m((short)4860, GlobalStatus.ad, (byte)var1)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4860, var2));
         this.h.j = this.h.k = 0;
         this.i.a((String)null);
      } else {
         this.i.b("获取上传指令数据错误!");
      }
   }

   public static void c(DataInputStream var0) throws IOException {
      l = var0.readByte();
   }

   public final void c() {
      this.i.mainMidlet.start();
      this.i.aq.j();
      this.i.aq.a("申请结婚");
      this.i.aq.a(false);
      this.i.at.b(c, GlobalConfig.i, (byte)2);
      this.i.at.a((byte)1);
      this.i.aq.a((al)this.i.at);
      int var2 = 2 * GlobalConfig.j + 16;
      this.i.aq.g = var2;
      this.i.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.h.l = 0;
      this.i.touchPageCase = this.i.k;
      this.h.j = this.h.k = 91;
   }

   public final void c(int var1) {
      if (this.h.l == 0) {
         if (this.i.aq != null) {
            this.i.aq.b(var1);
         }

         if (var1 != 514 && var1 != 1) {
            if (var1 != 520 && var1 != 4) {
               if (var1 != 1073741824 && var1 != 517 && var1 != 268435456) {
                  if (var1 == 536870912) {
                     this.d = 0;
                     this.a((byte)2);
                     this.h.l = 0;
                     this.h.j = this.h.k = 0;
                  }
               } else {
                  if (this.d == 0) {
                     if (l != 1) {
                        this.a((byte)1);
                        return;
                     }
                  } else if (this.d == 1) {
                     this.d = 0;
                     this.a((byte)2);
                     return;
                  }

               }
            } else {
               this.d = this.d == 1 ? 0 : 1;
            }
         } else {
            this.d = this.d == 0 ? 1 : 0;
         }
      }
   }

   public final void b(Graphics var1) {
      if (this.h.l == 0) {
         int var2 = 0;
         int var3 = 0;
         if (this.i.aq != null) {
            var2 = this.i.aq.a + 5;
            var3 = this.i.aq.b + this.i.aq.d - (2 * GlobalConfig.j + 16) - 6;
             LoadingPage.a(var1, var2, var3, this.i.aq.c - 11, 2 * GlobalConfig.j + 16, 1);
            this.i.aq.a(var1);
         }

         int var4 = 0;

         for(int var5 = 0; var5 < 2; ++var5) {
            var4 = 16777215;
            if (l != 0) {
               var4 = this.d == 1 ? (l == 1 ? 8750469 : 16777215) : 16777215;
               this.m[0] = l == 1 ? "同意(等待对方确认)" : "同意(对方已确认)";
            } else {
               this.m[0] = "同意(点击申请结婚)";
            }

             LoadingPage.a(var1, (String)this.m[var5], (int)(var2 + 4), var3 + 5 + var5 * (GlobalConfig.j + 5), 20, this.d == var5 ? 16711680 : var4, 0);
         }
      }

   }

   public final void b(byte var1) {
      byte[] var2;
      if ((var2 = NetPayloadBuilder.n((short)4861, GlobalStatus.ad, (byte)var1)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4861, var2));
         this.h.j = this.h.k = 0;
         this.i.a((String)null);
      } else {
         this.i.b("获取上传指令数据错误!");
      }
   }

   public static void d(DataInputStream var0) throws IOException {
      e = var0.readByte();
   }

   public final void d() {
      this.i.aq.j();
      this.i.aq.a("申请离婚");
      this.i.aq.a(false);
      this.i.at.b(f, GlobalConfig.i, (byte)2);
      this.i.at.a((byte)1);
      this.i.aq.a((al)this.i.at);
      int var2 = 2 * GlobalConfig.j + 16;
      this.i.aq.g = var2;
      this.i.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.h.l = 0;
      this.i.touchPageCase = this.i.k;
      this.h.j = this.h.k = 92;
   }

   public final void d(int var1) {
      if (this.h.l == 0) {
         if (this.i.aq != null) {
            this.i.aq.b(var1);
         }

         if (var1 != 514 && var1 != 1) {
            if (var1 != 520 && var1 != 4) {
               if (var1 != 1073741824 && var1 != 517 && var1 != 268435456) {
                  if (var1 == 536870912) {
                     this.g = 0;
                     this.h.l = 0;
                     this.h.j = this.h.k = 0;
                  }
               } else {
                  if (this.g == 0) {
                     if (e != 1) {
                        this.i.a((String)"输入OK确定离婚", (int)0);
                        return;
                     }
                  } else if (this.g == 1) {
                     this.g = 0;
                     if (e == 1) {
                        this.b((byte)2);
                        return;
                     }

                     this.h.l = 0;
                     this.h.j = this.h.k = 0;
                     return;
                  }

               }
            } else {
               this.g = this.g == 1 ? 0 : 1;
            }
         } else {
            this.g = this.g == 0 ? 1 : 0;
         }
      }
   }

   public final void c(Graphics var1) {
      if (this.h.l == 0) {
         int var2 = 0;
         int var3 = 0;
         if (this.i.aq != null) {
            var2 = this.i.aq.a + 5;
            var3 = this.i.aq.b + this.i.aq.d - (2 * GlobalConfig.j + 16) - 6;
             LoadingPage.a(var1, var2, var3, this.i.aq.c - 11, 2 * GlobalConfig.j + 16, 1);
            this.i.aq.a(var1);
         }

         int var4 = 0;

         for(int var5 = 0; var5 < 2; ++var5) {
            var4 = 16777215;
            if (e != 0) {
               var4 = this.g == 1 ? (e == 1 ? 8750469 : 16777215) : 16777215;
               this.n[0] = e == 1 ? "离婚(等待对方确认)" : "离婚(对方已确认)";
            } else {
               this.n[0] = "离婚(点击申请离婚)";
            }

             LoadingPage.a(var1, (String)this.n[var5], (int)(var2 + 4), var3 + 5 + var5 * (GlobalConfig.j + 5), 20, this.g == var5 ? 16711680 : var4, 0);
         }
      }

   }

   public final void e() {
      byte[] var1;
      if ((var1 = NetPayloadBuilder.n((short)4862, GlobalStatus.ad, (short) GlobalStatus.gQ)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4862, var1));
         this.h.j = this.h.k = 0;
         this.i.a((String)null);
      } else {
         this.i.b("获取上传指令数据错误!");
      }
   }

   public static void e(DataInputStream var0) throws IOException {
      GlobalStatus.gQ = var0.readShort();
      short var1 = var0.readShort();
      GlobalStatus.gR = var0.readByte();
      if (var1 <= 0) {
         g();
      } else {
         o = new int[var1];
         p = new String[var1];

         for(int var2 = 0; var2 < var1; ++var2) {
            o[var2] = var0.readInt();
            p[var2] = var0.readUTF();
         }

      }
   }

   public final void f() {
      this.i.aq.j();
      this.i.aq.a("新人礼堂");
      this.i.aq.a(false);
      this.i.ar.a((Image[])null, p, (String[])null, (String[])null);
      this.i.au.a("进入");
      this.i.au.a(true);
      this.i.aq.a((al)this.i.ar);
      this.i.aq.a((al)this.i.au);
      this.i.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.h.l = 0;
      this.i.touchPageCase = this.i.k;
      this.h.j = this.h.k = 93;
   }

   public final void e(int var1) {
      if (this.h.l == 0) {
         if (this.i.aq != null) {
            this.i.aq.b(var1);
         }

         if (o != null && (var1 == 268435456 || var1 == 1073741824 || var1 == 517)) {
            int var3 = o[this.i.ar.g()];
            byte[] var4;
            if ((var4 = NetPayloadBuilder.a((short)4863, GlobalStatus.ad, GlobalStatus.t[this.h.af].a, (int)var3, (short)this.h.I.j, (short)this.h.I.k)) != null) {
               MainCanvas.netUtils.sendPacket(new NetPacket((short)4863, var4));
               this.h.j = this.h.k = 0;
               this.i.a((String)null);
            } else {
               this.i.b("获取上传指令数据错误!");
            }
         }

         if (var1 == 536870912) {
            this.h.l = 0;
            this.h.j = this.h.k = 0;
            return;
         }

         if (var1 == 1024) {
            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
               if (GlobalStatus.gQ - 1 <= 1) {
                  GlobalStatus.gQ = 1;
               } else {
                  --GlobalStatus.gQ;
               }

               this.e();
               return;
            }

            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
               if (GlobalStatus.gQ - 1 < 1) {
                  GlobalStatus.gQ = 1;
               } else {
                  --GlobalStatus.gQ;
               }

               this.e();
               return;
            }
         } else if (var1 == 2048) {
            if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
               ++GlobalStatus.gQ;
               this.e();
               return;
            }

            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
               ++GlobalStatus.gQ;
               this.e();
            }
         }
      }

   }

   public final void d(Graphics var1) {
      if (this.h.l == 0 && this.i.aq != null) {
         this.i.aq.a(var1);
      }

   }
}

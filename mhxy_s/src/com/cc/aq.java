package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class aq {
   public ao_1 a;
   public MainCanvas b;
   public String c;
   public String d;
   private long u;
   public String e;
   public String f;
   public int g;
   private int v = 0;
   public String h;
   private short[] w = new short[]{1919, 2147, 2150, 2149, 2148};
   private int[][] x;
   private int[][] y;
   private int[][] z;
   private short[] A = new short[]{1919, 2147, 2148};
   public int[] i = new int[3];
   public long j = 0L;
   private short B = 0;
   private short C = 0;
   private short D = 0;
   private short E = 0;
   public int[] k = null;
   public int[][] l;
   public int[][] m;
   public int[] n;
   public String o = "";
   public int p;
   public long q = 1000L;
   public long r = 1000L;
   public int s;
   public int t;

   public aq(ao_1 var1, MainCanvas var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void a(int var1) {
      this.b.aq.j();
      this.b.aq.a("帮派");
      this.b.aq.a(false);
      this.b.ar.a((Image[])null, GlobalConfig.Z, (String[])null, (String[])null);
      this.b.ar.a(var1);
      this.b.at.b(GlobalConfig.aa[var1], GlobalConfig.i, (byte)2);
      this.b.at.a((byte)1);
      this.b.au.a("选择");
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.a.l = 0;
      this.a.e.touchPageCase = this.a.e.k;
      this.a.j = this.a.k = 41;
   }

   public final void b(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 1 || var1 == 514 || var1 == 4 || var1 == 520) {
            this.b.at.b(GlobalConfig.aa[this.b.ar.g()], GlobalConfig.i, (byte)2);
            this.b.at.a((byte)1);
         }

         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.j = this.a.k = 0;
               return;
            }
         } else {
            this.a.aA = this.b.ar.h();
            this.a.aE = this.b.ar.g();
            switch (this.a.aE) {
               case 0:
                  this.a.e.a((String)"输入帮派名称", (int)0);
                  break;
               case 1:
                  GlobalStatus.gQ = 1;
                  this.z();
                  break;
               case 2:
                  this.a.e.a((String)"输入招募金额", (int)2);
                  break;
               case 3:
                  GlobalStatus.gQ = 1;
                  this.A();
                  break;
               case 4:
                  this.r();
                  break;
               case 5:
                  this.a.l = 1;
                  LoadingPage.h = 0;
                  break;
               case 6:
                  this.a.l = 2;
                  LoadingPage.h = 0;
               default:
                  return;
            }
         }
      } else if (this.a.l == 1) {
         if (var1 == 268435456 || var1 == 1073741824) {
            this.d();
            return;
         }

         if (var1 == 536870912) {
            this.a.l = 0;
            return;
         }
      } else if (this.a.l == 2) {
         if (var1 == 268435456 || var1 == 1073741824) {
            this.a.e.a((String)"输入OK确认解散帮派", (int)0);
            return;
         }

         if (var1 == 536870912) {
            this.a.l = 0;
            return;
         }
      } else if (this.a.l == 3) {
         if (var1 != 268435456 && var1 != 1073741824) {
            if (var1 == 536870912) {
               this.a.l = 0;
            }
         } else {
            byte[] var2;
            if ((var2 = NetPayloadBuilder.a((short)4224, GlobalStatus.ad, this.u)) == null) {
               this.a.e.processException("获取上传指令数据错误!");
               return;
            }

            MainCanvas.netUtils.sendPacket(new NetPacket((short)4224, var2));
            this.a.e.a((String)null);
         }
      }

   }

   private void z() {
      byte[] var1;
      if ((var1 = NetPayloadBuilder.g((short)4198, GlobalStatus.ad, (short) GlobalStatus.gQ)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4198, var1));
         this.a.e.a((String)null);
      } else {
         this.a.e.processException("获取上传指令数据错误!");
      }
   }

   public final void a(long var1) {
      this.u = var1;
      this.a.o();
   }

   public final void a() {
      this.a.am = LoadingPage.a("将交付" + this.u + "帮派基金作为招募费用，持续一周？", GlobalConfig.i, 140, "\t");
      this.a.l = 3;
      LoadingPage.h = 0;
   }

   private void A() {
      byte[] var1;
      if ((var1 = NetPayloadBuilder.j((short)4225, GlobalStatus.ad, (short) GlobalStatus.gQ)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4225, var1));
         this.a.e.a((String)null);
      } else {
         this.a.e.processException("获取上传指令数据错误!");
      }
   }

   public final void b() {
      this.b.aq.j();
      this.b.aq.a("等待响应");
      this.b.aq.a(false);
      c_1 var10000 = this.b.ar;
      String[] var10002 = GlobalStatus.il;
      byte[] var1;
      String[] var2 = new String[(var1 = GlobalStatus.in).length];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         var2[var3] = new String(var1[var3] + "人响应");
      }

      var10000.a((Image[])null, var10002, (String[])null, var2);
      this.b.at.b(GlobalStatus.im == null ? null : GlobalStatus.im[0], GlobalConfig.i, (byte)2);
      this.b.at.a((byte)1);
      this.b.au.a("响应");
      this.b.au.a(true);
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.a.l = 0;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 42;
   }

   public final void c(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
            this.b.at.b(GlobalStatus.im == null ? null : GlobalStatus.im[this.b.ar.g()], GlobalConfig.i, (byte)2);
            this.b.at.a((byte)1);
         }

         if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
            LoadingPage.a(80 + GlobalConfig.f, GlobalConfig.j + 20 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, GlobalStatus.io[this.b.ar.g()] == 1 ? new String[]{"取消响应"} : new String[]{"响应"}, false);
            this.a.l = 1;
            return;
         }

         if (var1 == 536870912) {
            GlobalStatus.gQ = 1;
            this.a(this.a.aE);
            return;
         }

         if (var1 == 1024) {
            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
               if (GlobalStatus.gQ - 1 <= 1) {
                  GlobalStatus.gQ = 1;
               } else {
                  --GlobalStatus.gQ;
               }

               this.z();
               return;
            }

            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
               if (GlobalStatus.gQ - 1 < 1) {
                  GlobalStatus.gQ = 1;
               } else {
                  --GlobalStatus.gQ;
               }

               this.z();
               return;
            }
         } else if (var1 == 2048) {
            if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
               ++GlobalStatus.gQ;
               this.z();
               return;
            }

            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
               ++GlobalStatus.gQ;
               this.z();
               return;
            }
         }
      } else if (this.a.l == 1) {
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
            }
         } else if (LoadingPage.o == 0) {
            if (GlobalStatus.io[this.b.ar.g()] == 1) {
               byte[] var4;
               if ((var4 = NetPayloadBuilder.x((short)4243, GlobalStatus.ad, GlobalStatus.ik[this.b.ar.g()])) != null) {
                  NetPacket var5 = new NetPacket((short)4243, var4);
                  MainCanvas.netUtils.sendPacket(var5);
               } else {
                  this.b.processException("获取上传指令数据错误!");
               }

               this.b.a((String)null);
               return;
            }

            byte[] var2;
            if ((var2 = NetPayloadBuilder.x((short)4199, GlobalStatus.ad, GlobalStatus.ik[this.b.ar.g()])) != null) {
               NetPacket var3 = new NetPacket((short)4199, var2);
               MainCanvas.netUtils.sendPacket(var3);
            } else {
               this.b.processException("获取上传指令数据错误!");
            }

            this.b.a((String)null);
            return;
         }
      }

   }

   public final void c() {
      this.b.aq.j();
      this.b.aq.a("帮派招募");
      this.b.aq.a(false);
      this.b.ar.a((Image[])null, GlobalStatus.iq, (String[])null, (String[])null);
      this.b.at.b(GlobalStatus.ir == null ? null : GlobalStatus.ir[0], GlobalConfig.i, (byte)2);
      this.b.at.a((byte)1);
      this.b.au.a("申请");
      this.b.au.a(true);
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.a.l = 0;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 43;
   }

   public final void d(int var1) {
      if (this.a.l == 0) {
         if (GlobalStatus.ip != null) {
            if (this.b.aq == null) {
               return;
            }

            this.b.aq.b(var1);
            if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
               this.b.at.b(GlobalStatus.ir == null ? null : GlobalStatus.ir[this.b.ar.g()], GlobalConfig.i, (byte)2);
               this.b.at.a((byte)1);
            }

            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
               LoadingPage.a(80 + GlobalConfig.f, GlobalConfig.j + 20 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, GlobalStatus.is[this.b.ar.g()] == 1 ? new String[]{"取消申请"} : new String[]{"申请"}, false);
               this.a.l = 1;
            }
         }

         if (var1 == 536870912) {
            this.a(this.a.aE);
            return;
         }

         if (var1 == 1024) {
            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
               if (GlobalStatus.gQ - 1 <= 1) {
                  GlobalStatus.gQ = 1;
               } else {
                  --GlobalStatus.gQ;
               }

               this.A();
               return;
            }

            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
               if (GlobalStatus.gQ - 1 < 1) {
                  GlobalStatus.gQ = 1;
               } else {
                  --GlobalStatus.gQ;
               }

               this.A();
               return;
            }
         } else if (var1 == 2048) {
            if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
               ++GlobalStatus.gQ;
               this.A();
               return;
            }

            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
               ++GlobalStatus.gQ;
               this.A();
               return;
            }
         }
      } else if (this.a.l == 1) {
         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
            }
         } else if (LoadingPage.o == 0) {
            if (GlobalStatus.is[this.b.ar.g()] == 1) {
               String var2 = GlobalStatus.ip[this.b.ar.g()];
               byte[] var3;
               if ((var3 = NetPayloadBuilder.l((short)4242, GlobalStatus.ad, var2)) == null) {
                  this.b.processException("获取上传指令数据错误!");
                  return;
               }

               MainCanvas.netUtils.sendPacket(new NetPacket((short)4242, var3));
               this.b.a((String)null);
            } else {
               String var4 = GlobalStatus.ip[this.b.ar.g()];
               byte[] var5;
               if ((var5 = NetPayloadBuilder.l((short)4226, GlobalStatus.ad, var4)) == null) {
                  this.b.processException("获取上传指令数据错误!");
                  return;
               }

               MainCanvas.netUtils.sendPacket(new NetPacket((short)4226, var5));
               this.b.a((String)null);
            }
         }
      }

   }

   public final void d() {
      byte[] var1;
      if ((var1 = NetPayloadBuilder.m((short)4209, GlobalStatus.ad)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4209, var1));
         this.b.a((String)null);
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   public final void a(boolean var1) {
      this.b.aq.j();
      this.b.aq.a("帮派管理");
      this.b.aq.a(false);
      this.b.ar.a((Image[])null, GlobalConfig.ab, (String[])null, (String[])null);
      if (var1) {
         this.b.ar.a(this.a.aA, this.a.aE);
         this.b.at.b(GlobalConfig.ac[this.a.aE], GlobalConfig.i, (byte)2);
      } else {
         this.b.at.b(GlobalConfig.ac[0], GlobalConfig.i, (byte)2);
      }

      this.b.at.a((byte)1);
      this.b.au.a("确定");
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.a.l = 0;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 45;
   }

   public final void e(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
            this.b.at.b(GlobalConfig.ac[this.b.ar.g()], GlobalConfig.i, (byte)2);
            this.b.at.a((byte)1);
         }

         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.aA = 0;
               this.a.aE = 0;
               this.a.j = this.a.k = 0;
            }
         } else {
            this.a.aA = this.b.ar.h();
            this.a.aE = this.b.ar.g();
            switch (this.a.aE) {
               case 0:
                  this.b.a((String)"输入帮派新宗旨", (int)0);
                  break;
               case 1:
                  GlobalStatus.gQ = 1;
                  this.e();
                  break;
               case 2:
                  this.g();
                  break;
               case 3:
                  GlobalStatus.gQ = 1;
                  this.j(1);
                  break;
               case 4:
                  GlobalStatus.gQ = 1;
                  this.g(1);
                  break;
               case 5:
                  this.a((byte)1);
               default:
                  return;
            }
         }
      }

   }

   public final void e() {
      byte[] var1;
      if ((var1 = NetPayloadBuilder.i((short)4227, GlobalStatus.ad, (short) GlobalStatus.gQ)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4227, var1));
         this.b.a((String)null);
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   public final void f() {
      this.b.aq.j();
      this.b.aq.a("申请列表");
      this.b.aq.a(false);
      c_1 var10000 = this.b.ar;
      String[] var10002 = GlobalStatus.iu;
      short[] var1 = GlobalStatus.iv;
      String[] var2 = null;
      if (var1 != null) {
         var2 = new String[var1.length];

         for(int var3 = 0; var3 < var1.length; ++var3) {
            var2[var3] = new String(var1[var3] + "级");
         }
      }

      var10000.a((Image[])null, var10002, var2, GlobalStatus.iw);
      this.b.au.a("确定");
      this.b.au.a(true);
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.a.l = 0;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 46;
   }

   public final void f(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
            LoadingPage.a(80 + GlobalConfig.f, GlobalConfig.j + 20 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"详情", "接纳", "拒绝"}, false);
            this.a.l = 1;
            return;
         }

         if (var1 == 536870912) {
            this.a(true);
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
               return;
            }
         }
      } else if (this.a.l == 1) {
         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else if (LoadingPage.o == 0) {
            if (GlobalStatus.ix[this.b.ar.g()] != 1) {
               this.b.processException("对方不在线");
               return;
            }

            byte[] var2;
            if ((var2 = NetPayloadBuilder.a((short)4110, GlobalStatus.ad, GlobalStatus.it[this.b.ar.g()], (byte)0)) == null) {
               this.b.processException("获取上传指令数据错误!");
               return;
            }

            MainCanvas.netUtils.sendPacket(new NetPacket((short)4110, var2));
            this.b.a((String)null);
         } else if (LoadingPage.o == 1) {
            byte[] var3;
            if ((var3 = NetPayloadBuilder.m((short)4228, GlobalStatus.ad, GlobalStatus.it[this.b.ar.g()])) == null) {
               this.b.processException("获取上传指令数据错误!");
               return;
            }

            MainCanvas.netUtils.sendPacket(new NetPacket((short)4228, var3));
            this.b.a((String)null);
         } else if (LoadingPage.o == 2) {
            byte[] var4;
            if ((var4 = NetPayloadBuilder.m((short)4229, GlobalStatus.ad, GlobalStatus.it[this.b.ar.g()])) == null) {
               this.b.processException("获取上传指令数据错误!");
               return;
            }

            MainCanvas.netUtils.sendPacket(new NetPacket((short)4229, var4));
            this.b.a((String)null);
         }
      } else if (this.a.l == 2) {
         this.a.T.b(var1);
         if (var1 == 268435456 || var1 == 536870912 || var1 == 1073741824 || var1 == 517) {
            this.a.T.j();
            this.f();
         }
      }

   }

   public final void g() {
      this.b.a((String)"输入玩家名称", (int)0);
   }

   public final void h() {
      if (this.f != null) {
         byte[] var1;
         if ((var1 = NetPayloadBuilder.j((short)4201, GlobalStatus.ad, this.f)) != null) {
            NetPacket var2 = new NetPacket((short)4201, var1);
            MainCanvas.netUtils.sendPacket(var2);
         } else {
            this.b.processException("获取上传指令数据错误!");
         }

         this.b.a((String)null);
      }

   }

   public final void g(int var1) {
      this.g = var1;
      byte[] var2;
      if ((var2 = NetPayloadBuilder.h((short)4212, GlobalStatus.ad, (short) GlobalStatus.gQ)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4212, var2));
         this.b.a((String)null);
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   private void B() {
      byte[] var1;
      if ((var1 = NetPayloadBuilder.o((short)4211, GlobalStatus.ad)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4211, var1));
         this.b.a((String)null);
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   private void a(byte var1) {
      byte[] var2;
      if ((var2 = NetPayloadBuilder.k((short)4263, GlobalStatus.ad, (byte)var1)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4263, var2));
         this.b.a((String)null);
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   public final void h(int var1) {
      this.b.aq.j();
      this.b.aq.a("帮派信息");
      this.b.aq.a(true);
      this.b.as.a(new String[]{"成员", "帮派", "外交", "帮战"});
      this.b.aq.a((al)this.b.as);
      if (var1 == 0) {
         this.b.as.a = 0;
         this.b.ar.a((Image[])null, GlobalStatus.iz, GlobalStatus.iA, a(GlobalStatus.iC, "战力"));
         this.b.ar.a(GlobalStatus.aC == 1 ? GlobalStatus.iE : null);
         this.b.ar.b(GlobalStatus.aH == 1 ? GlobalStatus.iF : null);
         this.b.ar.a(GlobalStatus.iG);
         this.b.au.a("确定");
         this.b.au.a(true);
         this.b.aq.a((al)this.b.ar);
         this.b.aq.a((al)this.b.au);
         this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      } else if (var1 == 1) {
         this.b.as.a = 1;
         this.b.at.b(GlobalStatus.iH, GlobalConfig.i, (byte)2);
         this.b.aq.a((al)this.b.at);
         this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      } else if (var1 == 2) {
         this.b.as.a = 2;
         String[] var4 = null;
         int[] var2 = null;
         if (GlobalStatus.jY != null && GlobalStatus.jY.length > 0) {
            var4 = new String[GlobalStatus.jY.length];
            var2 = new int[GlobalStatus.jY.length];

            for(int var3 = 0; var3 < var4.length; ++var3) {
               var4[var3] = GlobalStatus.d(GlobalStatus.ka[var3]);
               if (GlobalStatus.ka[var3] == 2) {
                  var2[var3] = 12845056;
               } else if (GlobalStatus.ka[var3] == 3) {
                  var2[var3] = 16711680;
               } else {
                  var2[var3] = 16776960;
               }
            }
         }

         this.b.ar.a((Image[])null, GlobalStatus.jZ, (String[])null, var4);
         this.b.ar.a("搜索...");
         this.b.ar.a(var2);
         this.b.ar.a("帮派搜索", 1);
         this.b.au.a("确定");
         this.b.au.a(true);
         this.b.aq.a((al)this.b.ar);
         this.b.aq.a((al)this.b.au);
         this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
         LoadingPage.l = 0;
      } else if (var1 == 3) {
         this.b.as.a = 3;
         this.b.at.b(GlobalStatus.kl, GlobalConfig.i, (byte)2);
         this.b.au.a("确定");
         this.b.au.a(true);
         this.b.aq.a((al)this.b.at);
         this.b.aq.a((al)this.b.au);
         this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      }

      this.a.l = 0;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 47;
   }

   public final void i(int var1) {
      if (this.a.l == 0) {
         if (this.b.as.a == 0) {
            if (this.b.aq != null) {
               this.b.aq.b(var1);
            }

            if (GlobalStatus.iy != null) {
               if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                  if (var1 == 1024) {
                     if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                        if (GlobalStatus.gQ - 1 <= 1) {
                           GlobalStatus.gQ = 1;
                        } else {
                           --GlobalStatus.gQ;
                        }

                        this.g(this.g);
                     } else if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
                        if (GlobalStatus.gQ - 1 < 1) {
                           GlobalStatus.gQ = 1;
                        } else {
                           --GlobalStatus.gQ;
                        }

                        this.g(this.g);
                     }
                  } else if (var1 == 2048) {
                     if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
                        ++GlobalStatus.gQ;
                        this.g(this.g);
                     } else if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                        ++GlobalStatus.gQ;
                        this.g(this.g);
                     }
                  }
               } else if (GlobalStatus.iD[this.b.ar.g()] == 1) {
                  if (!GlobalStatus.iy[this.b.ar.g()].equals(GlobalStatus.ad)) {
                     LoadingPage.a(80 + GlobalConfig.f, 2 * GlobalConfig.j + 20 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
                     this.a.l = 1;
                     this.a.aE = this.b.ar.g();
                     this.a.aA = this.b.ar.h();
                  }
               } else if (!GlobalStatus.iy[this.b.ar.g()].equals(GlobalStatus.ad)) {
                  LoadingPage.a(80 + GlobalConfig.f, 2 * GlobalConfig.j + 20 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"查看"}, false);
                  this.a.l = 1;
                  this.a.aE = this.b.ar.g();
                  this.a.aA = this.b.ar.h();
               }
            }

            if (var1 != 2 && var1 != 518) {
               if (var1 == 8 || var1 == 516) {
                  GlobalStatus.gQ = 1;
                  this.C();
               }
            } else {
               this.B();
            }
         } else if (this.b.as.a == 1) {
            if (this.b.aq != null) {
               this.b.aq.b(var1);
            }

            if (var1 != 8 && var1 != 516) {
               if (var1 == 2 || var1 == 518) {
                  GlobalStatus.gQ = 1;
                  this.p = 1;
                  this.o = "";
                  this.a(this.o);
               }
            } else {
               GlobalStatus.gQ = 1;
               this.g(this.g);
            }
         } else if (this.b.as.a == 2) {
            if (this.b.aq != null) {
               this.b.aq.b(var1);
            }

            if (var1 != 8 && var1 != 516) {
               if (var1 == 2 || var1 == 518) {
                  GlobalStatus.gQ = 1;
                  this.C();
                  this.h(3);
               }
            } else {
               this.B();
            }

            if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
               boolean var2 = this.b.ar.g() == this.b.ar.h();
               this.b.ar.a(var2 ? "帮派搜索" : w(this.b.ar.g() - 1), 1);
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
               if (var1 == 1024) {
                  if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                     if (GlobalStatus.gQ - 1 <= 1) {
                        GlobalStatus.gQ = 1;
                     } else {
                        --GlobalStatus.gQ;
                     }

                     this.a(this.o);
                  } else if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
                     if (GlobalStatus.gQ - 1 < 1) {
                        GlobalStatus.gQ = 1;
                     } else {
                        --GlobalStatus.gQ;
                     }

                     this.a(this.o);
                  }
               } else if (var1 == 2048) {
                  if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
                     ++GlobalStatus.gQ;
                     this.a(this.o);
                  } else if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                     ++GlobalStatus.gQ;
                     this.a(this.o);
                  }
               }
            } else {
               this.a.aA = this.b.ar.h();
               this.a.aE = this.b.ar.g();
               if (this.b.ar.g() == this.b.ar.h()) {
                  this.b.a((String)"请输入要搜索的帮派名称", (int)0);
               } else if (GlobalStatus.jY != null) {
                  LoadingPage.a(80 + GlobalConfig.f, 2 * GlobalConfig.j + 20 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"查看", "外交", "宣战"}, true);
                  this.a.l = 7;
               }
            }
         } else if (this.b.as.a == 3) {
            if (this.b.aq != null) {
               this.b.aq.b(var1);
            }

            if (var1 != 8 && var1 != 516) {
               if (var1 != 2 && var1 != 518) {
                  if (var1 == 1024) {
                     if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                        if (GlobalStatus.gQ - 1 <= 1) {
                           GlobalStatus.gQ = 1;
                        } else {
                           --GlobalStatus.gQ;
                        }

                        this.C();
                     } else if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
                        if (GlobalStatus.gQ - 1 < 1) {
                           GlobalStatus.gQ = 1;
                        } else {
                           --GlobalStatus.gQ;
                        }

                        this.C();
                     }
                  } else if (var1 == 2048) {
                     if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
                        ++GlobalStatus.gQ;
                        this.C();
                     } else if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                        ++GlobalStatus.gQ;
                        this.C();
                     }
                  }
               } else {
                  GlobalStatus.gQ = 1;
                  this.g(this.g);
               }
            } else {
               GlobalStatus.gQ = 1;
               this.p = 1;
               this.o = "";
               this.a(this.o);
            }
         } else if (this.b.as.a == 4) {
            if (this.b.aq != null) {
               this.b.aq.b(var1);
            }

            if (var1 == 8 || var1 == 516) {
               GlobalStatus.gQ = 1;
               this.C();
            }
         }

         if (var1 == 536870912) {
            this.o = "";
            GlobalStatus.gQ = 1;
            if (this.g == 1) {
               this.a(true);
               return;
            }

            if (this.g == 0) {
               this.a.k();
               this.a.c((int)1);
               return;
            }
         }
      } else if (this.a.l == 1) {
         if (this.b.aC != null && this.b.g) {
            this.a.aQ = GlobalStatus.iz[this.b.ar.g()];
            this.a.a((String) GlobalStatus.iy[this.b.ar.g()], (byte)4);
            this.a.l = 0;
            this.b.processException("聊天消息已发送!");
         }

         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else {
            if (LoadingPage.o == 0) {
               LoadingPage.a(80 + GlobalConfig.f, 2 * GlobalConfig.j + 20 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"属性", "装备"}, false);
               this.a.l = 2;
               return;
            }

            if (LoadingPage.o == 1) {
               this.a.aS = GlobalStatus.iy[this.b.ar.g()];
               this.a.aT = 4;
               this.b.a((String)"聊天", (int)0);
               return;
            }

            if (LoadingPage.o == 2) {
               if (GlobalStatus.bs == -1) {
                  LoadingPage.a(80 + GlobalConfig.f, 2 * GlobalConfig.j + 20 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"自由", "跟随"}, false);
                  this.a.l = 6;
                  return;
               }

               this.a.a(GlobalStatus.s, GlobalStatus.iy[this.b.ar.g()]);
               return;
            }

            if (LoadingPage.o == 3) {
               LoadingPage.a(80 + GlobalConfig.f, 2 * GlobalConfig.j + 20 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"物品", "宠物"}, false);
               this.a.l = 5;
               return;
            }

            if (LoadingPage.o == 4) {
               this.a.a(GlobalStatus.iy[this.b.ar.g()]);
               this.a.l = 0;
               return;
            }

            if (LoadingPage.o == 5) {
               this.a.b(GlobalStatus.iy[this.b.ar.g()]);
               this.a.l = 0;
               return;
            }
         }
      } else if (this.a.l == 2) {
         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               if (GlobalStatus.iD[this.b.ar.g()] == 1) {
                  LoadingPage.a(80 + GlobalConfig.f, 2 * GlobalConfig.j + 20 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
               } else {
                  LoadingPage.a(80 + GlobalConfig.f, 2 * GlobalConfig.j + 20 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"查看"}, false);
               }

               this.a.l = 1;
               return;
            }
         } else if (LoadingPage.o == 0) {
            byte[] var6;
            if ((var6 = NetPayloadBuilder.a((short)4110, GlobalStatus.ad, GlobalStatus.iy[this.b.ar.g()], (byte)1)) == null) {
               this.b.processException("获取上传指令数据错误!");
               return;
            }

            MainCanvas.netUtils.sendPacket(new NetPacket((short)4110, var6));
            this.b.a((String)null);
         } else if (LoadingPage.o == 1) {
            byte[] var7;
            if ((var7 = NetPayloadBuilder.b((short)4111, GlobalStatus.ad, GlobalStatus.iy[this.b.ar.g()])) == null) {
               this.b.processException("获取上传指令数据错误!");
               return;
            }

            MainCanvas.netUtils.sendPacket(new NetPacket((short)4111, var7));
            this.b.a((String)null);
         }
      } else if (this.a.l == 3) {
         this.a.T.b(var1);
         if (var1 == 268435456 || var1 == 536870912) {
            this.a.T.j();
            this.a.l = 2;
            return;
         }
      } else if (this.a.l == 4) {
         this.a.a(GlobalStatus.cJ);
         this.a.g(var1);
         if (var1 == 536870912) {
            if (this.a.m == 1) {
               this.a.T.j();
               this.a.m = 0;
               return;
            }

            if (GlobalStatus.cJ != null) {
               GlobalStatus.o();
            }

            ao_1.q = null;
            this.a.al = null;
            this.a.l = 2;
            MainCanvas.f.a(this.a.f, ao_1.h, ao_1.i, true, false, 1009050);
            return;
         }
      } else if (this.a.l == 5) {
         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               LoadingPage.a(80 + GlobalConfig.f, 2 * GlobalConfig.j + 20 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
               LoadingPage.o = 3;
               this.a.l = 1;
               return;
            }
         } else {
            byte[] var8;
            if ((var8 = NetPayloadBuilder.b((short)4124, GlobalStatus.ad, GlobalStatus.iy[this.b.ar.g()], (byte)((byte) LoadingPage.o))) == null) {
               this.b.processException("获取上传指令数据错误!");
               return;
            }

            MainCanvas.netUtils.sendPacket(new NetPacket((short)4124, var8));
            this.b.a((String)null);
         }
      } else if (this.a.l == 6) {
         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               LoadingPage.a(80 + GlobalConfig.f, 2 * GlobalConfig.j + 20 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
               LoadingPage.o = 2;
               this.a.l = 1;
               return;
            }
         } else {
            var1 = LoadingPage.o == 0 ? 1 : 0;
            if (GlobalStatus.bs == 0) {
               this.b.processException("队员不能发送组队邀请！");
            } else if (GlobalStatus.bs == 1 && GlobalStatus.q != null && GlobalStatus.q.length >= 3) {
               this.b.processException("队伍已满，无法邀请！");
            } else {
               byte[] var4;
               if ((var4 = NetPayloadBuilder.a((short)4112, GlobalStatus.ad, GlobalStatus.iy[this.b.ar.g()], (short)((short)var1))) == null) {
                  this.b.processException("获取上传指令数据错误!");
                  return;
               }

               NetPacket var5 = new NetPacket((short)4112, var4);
               MainCanvas.netUtils.sendPacket(var5);
               this.a.l = 0;
            }
         }
      } else if (this.a.l == 7) {
         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else {
            this.b.aw = LoadingPage.o;
            if (LoadingPage.o == 0) {
               this.b(GlobalStatus.jY[this.b.ar.g() - 1]);
               return;
            }

            if (LoadingPage.o == 1) {
               LoadingPage.a(80 + GlobalConfig.f, 2 * GlobalConfig.j + 20 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"中立", "敌对"}, true);
               this.a.l = 8;
               return;
            }

            if (LoadingPage.o == 2) {
               this.a.l = 9;
               LoadingPage.h = 0;
               return;
            }
         }
      } else if (this.a.l == 8) {
         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else {
            if (LoadingPage.o == 0) {
               this.a((byte)1, GlobalStatus.jY[this.b.ar.g() - 1]);
               return;
            }

            if (LoadingPage.o == 1) {
               this.a((byte)2, GlobalStatus.jY[this.b.ar.g() - 1]);
               return;
            }
         }
      } else if (this.a.l == 9) {
         if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
            this.b.a((String)"输入OK确认宣战", (int)0);
            return;
         }

         if (var1 == 536870912) {
            this.a.l = 0;
         }
      }

   }

   public final void j(int var1) {
      this.g = var1;
      byte[] var2;
      if ((var2 = NetPayloadBuilder.h((short)4240, GlobalStatus.ad, (short) GlobalStatus.gQ)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4240, var2));
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   public final void i() {
      this.b.aq.j();
      this.b.aq.a("成员列表");
      this.b.aq.a(false);
      this.b.ar.a((Image[])null, GlobalStatus.iz, GlobalStatus.iA, a(GlobalStatus.iB, "功勋"));
      this.b.ar.a(GlobalStatus.aC == 1 ? GlobalStatus.iE : null);
      this.b.ar.b(GlobalStatus.aH == 1 ? GlobalStatus.iF : null);
      this.b.ar.a(GlobalStatus.iG);
      this.b.au.a("任免");
      this.b.au.a(true);
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.a.l = 0;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 48;
   }

   private static String[] a(int[] var0, String var1) {
      String[] var2 = null;
      if (var0 != null) {
         var2 = new String[var0.length];

         for(int var3 = 0; var3 < var0.length; ++var3) {
            var2[var3] = new String("" + var0[var3] + var1);
         }
      }

      return var2;
   }

   public final void k(int var1) {
      if (this.a.l == 0) {
         if (GlobalStatus.iy != null) {
            if (this.b.aq != null) {
               this.b.aq.b(var1);
            }

            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
               LoadingPage.a(80 + GlobalConfig.f, GlobalConfig.j + 20 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"任免", "开除"}, false);
               this.a.l = 1;
               this.v = this.b.ar.g();
            }
         }

         if (var1 == 536870912) {
            if (this.g == 1) {
               this.a(true);
               return;
            }

            if (this.g == 0) {
               this.a.k();
               this.a.c((int)1);
               return;
            }
         } else if (var1 == 1024) {
            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
               if (GlobalStatus.gQ - 1 <= 1) {
                  GlobalStatus.gQ = 1;
               } else {
                  --GlobalStatus.gQ;
               }

               this.j(this.g);
               return;
            }

            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
               if (GlobalStatus.gQ - 1 < 1) {
                  GlobalStatus.gQ = 1;
               } else {
                  --GlobalStatus.gQ;
               }

               this.j(this.g);
               return;
            }
         } else if (var1 == 2048) {
            if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
               ++GlobalStatus.gQ;
               this.j(this.g);
               return;
            }

            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
               ++GlobalStatus.gQ;
               this.j(this.g);
               return;
            }
         }
      } else if (this.a.l == 1) {
         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else if (LoadingPage.o == 0) {
            byte[] var3;
            if ((var3 = NetPayloadBuilder.p((short)4241, GlobalStatus.ad)) == null) {
               this.b.processException("获取上传指令数据错误!");
               return;
            }

            MainCanvas.netUtils.sendPacket(new NetPacket((short)4241, var3));
            this.b.a((String)null);
         } else if (LoadingPage.o == 1) {
            this.a.l = 3;
            LoadingPage.h = 0;
            return;
         }
      } else if (this.a.l == 2) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
            this.b.at.b(GlobalStatus.je[this.b.ar.g()], GlobalConfig.i, (byte)2);
            this.b.at.a((byte)1);
         }

         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.i();
               return;
            }
         } else {
            String var10001 = GlobalStatus.iy[this.v];
            byte var2 = GlobalStatus.jc[this.b.ar.g()];
            String var4 = var10001;
            byte[] var5;
            if ((var5 = NetPayloadBuilder.d((short)4217, GlobalStatus.ad, var4, (byte)var2)) == null) {
               this.b.processException("获取上传指令数据错误!");
               return;
            }

            MainCanvas.netUtils.sendPacket(new NetPacket((short)4217, var5));
            this.b.a((String)null);
         }
      } else if (this.a.l == 3) {
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
            }
         } else {
            String var6 = GlobalStatus.iy[this.b.ar.g()];
            byte[] var7;
            if ((var7 = NetPayloadBuilder.k((short)4208, GlobalStatus.ad, var6)) == null) {
               this.b.processException("获取上传指令数据错误!");
               return;
            }

            MainCanvas.netUtils.sendPacket(new NetPacket((short)4208, var7));
            this.b.a((String)null);
         }
      }

   }

   public final void j() {
      this.b.aq.j();
      this.b.aq.a("职务列表");
      this.b.aq.a(true);
      this.b.ar.a((Image[])null, GlobalStatus.jd, (String[])null, (String[])null);
      this.b.at.b(GlobalStatus.je[this.b.ar.g()], GlobalConfig.i, (byte)2);
      this.b.at.a((byte)1);
      this.b.au.a("确定");
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.a.l = 2;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 48;
   }

   public final void l(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 268435456 || var1 == 536870912 || var1 == 1073741824 || var1 == 517) {
            this.a.m();
         }
      }

   }

   public final void k() {
      this.b.aq.j();
      this.b.aq.a("帮派公告");
      this.b.aq.a(false);
      this.b.at.b(GlobalStatus.jf, GlobalConfig.i, (byte)2);
      this.b.au.a("确定");
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.a.l = 0;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 49;
   }

   public final void b(boolean var1) {
      this.b.aq.j();
      this.b.aq.a("宝库管理");
      this.b.aq.a(false);
      this.b.ar.a((Image[])null, GlobalConfig.ad, (String[])null, (String[])null);
      if (var1) {
         this.b.ar.a(this.a.aA, this.a.aE);
         this.b.at.b(GlobalStatus.iI[this.a.aE], GlobalConfig.i, (byte)2);
      } else {
         this.b.at.b(GlobalStatus.iI[0], GlobalConfig.i, (byte)2);
      }

      this.b.at.a((byte)1);
      this.b.au.a("确定");
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      LoadingPage.h = 0;
      LoadingPage.g = 0;
      this.b.touchAction = 0;
      this.a.l = 0;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 50;
   }

   public final void m(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 514 || var1 == 520 || var1 == 1 || var1 == 4) {
            this.b.at.b(GlobalStatus.iI[this.b.ar.g()], GlobalConfig.i, (byte)2);
            this.b.at.a((byte)1);
         }

         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               GlobalStatus.H();
               this.a.j = this.a.k = 0;
               return;
            }
         } else {
            this.a.aA = this.b.ar.h();
            this.a.aE = this.b.ar.g();
            switch (this.a.aE) {
               case 0:
                  this.o();
                  break;
               case 1:
                  this.a.e((int)18);
                  break;
               case 2:
                  this.a.o();
                  this.a.l = 1;
                  this.a.a(GlobalStatus.ap);
                  break;
               case 3:
                  this.a.o();
                  this.a.l = 5;
                  this.a.a(999999999L);
                  break;
               case 4:
                  this.a.o();
                  this.a.l = 2;
                  this.a.a(GlobalStatus.am);
                  break;
               case 5:
                  this.m();
                  break;
               case 6:
                  this.a.a(99L);
                  this.a.l = 3;
                  break;
               case 7:
                  this.a.a(99L);
                  this.a.l = 4;
                  break;
               case 8:
                  this.b((byte)1);
                  break;
               case 9:
                  this.a.l = 6;
                  this.a.at = "您确定要消耗一定物品提升帮派人气吗？";
                  LoadingPage.h = 0;
                  break;
               case 10:
                  this.a.l = 7;
                  this.a.at = "您确定要消耗一定物品扩容帮派宝库吗？";
                  LoadingPage.h = 0;
               default:
                  return;
            }
         }
      } else {
         if (this.a.l != 1 && this.a.l != 2) {
            if (this.a.l != 3 && this.a.l != 4) {
               if (this.a.l == 5) {
                  if (var1 != 268435456 && var1 != 1073741824) {
                     if (var1 == 536870912) {
                        this.a.l = 0;
                        return;
                     }

                     this.a.d(var1);
                     return;
                  }

                  if (this.a.n() != -1L) {
                     if (this.a.n() > this.a.ah) {
                        this.b.processException("超出最大值,请重新输入");
                        return;
                     }

                     byte[] var4;
                     if ((var4 = NetPayloadBuilder.b((short)4264, (byte)2, this.a.n(), GlobalStatus.ad)) != null) {
                        MainCanvas.netUtils.sendPacket(new NetPacket((short)4264, var4));
                        this.b.a((String)null);
                     } else {
                        this.b.processException("获取上传指令数据错误!");
                     }

                     this.a.l = 0;
                     return;
                  }

                  this.b.processException("输入有误,请重新输入");
                  return;
               }

               if (this.a.l == 6) {
                  if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                     this.a.l = 0;
                     this.a((short)4677);
                     return;
                  }

                  if (var1 == 536870912) {
                     LoadingPage.l = 0;
                     LoadingPage.h = 0;
                     this.a.l = 0;
                     return;
                  }
               } else if (this.a.l == 7) {
                  if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                     this.a.l = 0;
                     this.a((short)4265);
                     return;
                  }

                  if (var1 == 536870912) {
                     LoadingPage.l = 0;
                     LoadingPage.h = 0;
                     this.a.l = 0;
                  }

                  return;
               }

               return;
            }

            if (this.a.m == 0) {
               if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                  if (var1 == 536870912) {
                     this.a.l = 0;
                     return;
                  }

                  this.a.b(var1);
                  return;
               }

               this.a.at = "发布" + this.a.ag + "天帮派任务\t是否确认？";
               this.a.m = 1;
               LoadingPage.h = 0;
               return;
            }

            if (this.a.m != 1) {
               return;
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
               if (var1 == 536870912) {
                  this.a.at = null;
                  this.a.m = 0;
                  LoadingPage.h = 0;
                  return;
               }

               return;
            }

            byte[] var3;
            if ((var3 = NetPayloadBuilder.a((short)4368, (int)this.a.ag, (byte)((byte)(this.a.l == 3 ? 1 : 2)), GlobalStatus.ad)) != null) {
               MainCanvas.netUtils.sendPacket(new NetPacket((short)4368, var3));
               this.b.a((String)null);
            } else {
               this.b.processException("获取上传指令数据错误!");
            }

            LoadingPage.h = 0;
            this.a.m = 0;
            return;
         }

         if (var1 != 268435456 && var1 != 1073741824) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }

            this.a.d(var1);
            return;
         }

         if (this.a.n() != -1L) {
            if (this.a.n() > this.a.ah) {
               this.b.processException("超出最大值,请重新输入");
               return;
            }

            byte[] var2;
            if ((var2 = NetPayloadBuilder.b((short)4264, (byte)(this.a.l == 1 ? 1 : 3), this.a.n(), GlobalStatus.ad)) != null) {
               MainCanvas.netUtils.sendPacket(new NetPacket((short)4264, var2));
               this.b.a((String)null);
            } else {
               this.b.processException("获取上传指令数据错误!");
            }

            this.a.l = 0;
            return;
         }

         this.b.processException("输入有误,请重新输入");
         return;
      }

   }

   private void a(short var1) {
      byte[] var2;
      if ((var2 = NetPayloadBuilder.C(var1, GlobalStatus.ad)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket(var1, var2));
         this.b.a((String)null);
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   private void b(byte var1) {
      byte[] var2;
      if ((var2 = NetPayloadBuilder.a((short)4239, var1, this.i, GlobalStatus.ad)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4239, var2));
         this.b.a((String)null);
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   public final void l() {
      this.a.a(this.w);
      this.k = new int[5];
      this.l = new int[5][4];
      this.m = new int[5][4];
      this.n = new int[4];
      this.b.aq.j();
      this.b.aq.a("贡献物品");
      this.b.aq.a(false);
      String[] var1 = GlobalConfig.defaultWidth <= 176 ? new String[]{"", "", "", "", ""} : GlobalConfig.ae;
      this.b.ar.a(ao_1.b(this.w), var1, (String[])null, (String[])null);
      short var2 = MainCanvas.L.c;
      this.b.aq.f = var2;
      this.b.ar.b(false);
      this.b.au.a(new String[]{"确定", "返回"});
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.a.l = 0;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 51;
   }

   public final void m() {
      byte[] var1;
      if ((var1 = NetPayloadBuilder.r((short)4221, GlobalStatus.ad)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4221, var1));
         this.b.a((String)null);
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   public final void n(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (this.b.tempTouchStatus > 40) {
            if (this.b.b != 2 && this.b.b != 518) {
               if (this.b.b == 8 || this.b.b == 516) {
                  switch (this.b.ar.g()) {
                     case 0:
                        this.k[0] = (int)(this.j = this.j - 100L <= 0L ? 0L : this.j - 100L);
                        break;
                     case 1:
                        int[] var18 = this.k;
                        short var63 = this.B;
                        this.B = (short)(var63 - 1);
                        short var33;
                        if (var63 <= 0) {
                           var33 = 0;
                        } else {
                           var63 = this.B;
                           var33 = var63;
                           this.B = (short)(var63 - 1);
                        }

                        var18[1] = this.B = var33;
                        break;
                     case 2:
                        int[] var17 = this.k;
                        short var61 = this.C;
                        this.C = (short)(var61 - 1);
                        short var32;
                        if (var61 <= 0) {
                           var32 = 0;
                        } else {
                           var61 = this.C;
                           var32 = var61;
                           this.C = (short)(var61 - 1);
                        }

                        var17[2] = this.C = var32;
                        break;
                     case 3:
                        int[] var16 = this.k;
                        short var59 = this.D;
                        this.D = (short)(var59 - 1);
                        short var31;
                        if (var59 <= 0) {
                           var31 = 0;
                        } else {
                           var59 = this.D;
                           var31 = var59;
                           this.D = (short)(var59 - 1);
                        }

                        var16[3] = this.D = var31;
                        break;
                     case 4:
                        int[] var15 = this.k;
                        short var57 = this.E;
                        this.E = (short)(var57 - 1);
                        short var30;
                        if (var57 <= 0) {
                           var30 = 0;
                        } else {
                           var57 = this.E;
                           var30 = var57;
                           this.E = (short)(var57 - 1);
                        }

                        var15[4] = this.E = var30;
                  }
               }
            } else {
               switch (this.b.ar.g()) {
                  case 0:
                     this.k[0] = (int)(this.j = this.j + 100L <= GlobalStatus.ap ? this.j + 100L : GlobalStatus.ap);
                     break;
                  case 1:
                     int[] var14 = this.k;
                     short var55 = this.B;
                     this.B = (short)(var55 + 1);
                     short var29;
                     if (var55 >= GlobalStatus.jh) {
                        var29 = GlobalStatus.jh;
                     } else {
                        var55 = this.B;
                        var29 = var55;
                        this.B = (short)(var55 + 1);
                     }

                     var14[1] = this.B = var29;
                     break;
                  case 2:
                     int[] var13 = this.k;
                     short var53 = this.C;
                     this.C = (short)(var53 + 1);
                     short var28;
                     if (var53 >= GlobalStatus.jj) {
                        var28 = GlobalStatus.jj;
                     } else {
                        var53 = this.C;
                        var28 = var53;
                        this.C = (short)(var53 + 1);
                     }

                     var13[2] = this.C = var28;
                     break;
                  case 3:
                     int[] var12 = this.k;
                     short var51 = this.D;
                     this.D = (short)(var51 + 1);
                     short var27;
                     if (var51 >= GlobalStatus.jl) {
                        var27 = GlobalStatus.jl;
                     } else {
                        var51 = this.D;
                        var27 = var51;
                        this.D = (short)(var51 + 1);
                     }

                     var12[3] = this.D = var27;
                     break;
                  case 4:
                     int[] var11 = this.k;
                     short var49 = this.E;
                     this.E = (short)(var49 + 1);
                     short var26;
                     if (var49 >= GlobalStatus.jn) {
                        var26 = GlobalStatus.jn;
                     } else {
                        var49 = this.E;
                        var26 = var49;
                        this.E = (short)(var49 + 1);
                     }

                     var11[4] = this.E = var26;
               }
            }
         } else {
            if (var1 != 2 && var1 != 518) {
               if (var1 == 8 || var1 == 516) {
                  switch (this.b.ar.g()) {
                     case 0:
                        this.k[0] = (int)(this.j = this.j - 100L <= 0L ? 0L : this.j - 100L);
                        break;
                     case 1:
                        int[] var9 = this.k;
                        short var47 = this.B;
                        this.B = (short)(var47 - 1);
                        short var25;
                        if (var47 <= 0) {
                           var25 = 0;
                        } else {
                           var47 = this.B;
                           var25 = var47;
                           this.B = (short)(var47 - 1);
                        }

                        var9[1] = this.B = var25;
                        break;
                     case 2:
                        int[] var8 = this.k;
                        short var45 = this.C;
                        this.C = (short)(var45 - 1);
                        short var24;
                        if (var45 <= 0) {
                           var24 = 0;
                        } else {
                           var45 = this.C;
                           var24 = var45;
                           this.C = (short)(var45 - 1);
                        }

                        var8[2] = this.C = var24;
                        break;
                     case 3:
                        int[] var7 = this.k;
                        short var43 = this.D;
                        this.D = (short)(var43 - 1);
                        short var23;
                        if (var43 <= 0) {
                           var23 = 0;
                        } else {
                           var43 = this.D;
                           var23 = var43;
                           this.D = (short)(var43 - 1);
                        }

                        var7[3] = this.D = var23;
                        break;
                     case 4:
                        int[] var6 = this.k;
                        short var41 = this.E;
                        this.E = (short)(var41 - 1);
                        short var22;
                        if (var41 <= 0) {
                           var22 = 0;
                        } else {
                           var41 = this.E;
                           var22 = var41;
                           this.E = (short)(var41 - 1);
                        }

                        var6[4] = this.E = var22;
                  }
               }
            } else {
               switch (this.b.ar.g()) {
                  case 0:
                     this.k[0] = (int)(this.j = this.j + 100L <= GlobalStatus.ap ? this.j + 100L : GlobalStatus.ap);
                     break;
                  case 1:
                     int[] var5 = this.k;
                     short var39 = this.B;
                     this.B = (short)(var39 + 1);
                     short var21;
                     if (var39 >= GlobalStatus.jh) {
                        var21 = GlobalStatus.jh;
                     } else {
                        var39 = this.B;
                        var21 = var39;
                        this.B = (short)(var39 + 1);
                     }

                     var5[1] = this.B = var21;
                     break;
                  case 2:
                     int[] var4 = this.k;
                     short var37 = this.C;
                     this.C = (short)(var37 + 1);
                     short var20;
                     if (var37 >= GlobalStatus.jj) {
                        var20 = GlobalStatus.jj;
                     } else {
                        var37 = this.C;
                        var20 = var37;
                        this.C = (short)(var37 + 1);
                     }

                     var4[2] = this.C = var20;
                     break;
                  case 3:
                     int[] var3 = this.k;
                     short var35 = this.D;
                     this.D = (short)(var35 + 1);
                     short var19;
                     if (var35 >= GlobalStatus.jl) {
                        var19 = GlobalStatus.jl;
                     } else {
                        var35 = this.D;
                        var19 = var35;
                        this.D = (short)(var35 + 1);
                     }

                     var3[3] = this.D = var19;
                     break;
                  case 4:
                     int[] var10000 = this.k;
                     short var10005 = this.E;
                     this.E = (short)(var10005 + 1);
                     short var10003;
                     if (var10005 >= GlobalStatus.jn) {
                        var10003 = GlobalStatus.jn;
                     } else {
                        var10005 = this.E;
                        var10003 = var10005;
                        this.E = (short)(var10005 + 1);
                     }

                     var10000[4] = this.E = var10003;
               }
            }

            ++this.b.tempTouchStatus;
         }

         if (var1 != 1073741824 && var1 != 517) {
            if (var1 == 268435456) {
               if (this.j == 0L && this.B == 0 && this.C == 0 && this.D == 0 && this.E == 0) {
                  this.b.processException("请输入贡献基金的数目！");
                  return;
               }

               byte[] var2;
               if ((var2 = NetPayloadBuilder.a((short)4220, GlobalStatus.ad, this.j, this.B, this.C, this.D, this.E)) == null) {
                  this.b.processException("获取上传指令数据错误!");
                  return;
               }

               MainCanvas.netUtils.sendPacket(new NetPacket((short)4220, var2));
               this.b.a((String)null);
            } else if (var1 == 536870912) {
               this.q();
               this.b(true);
            }
         } else if (this.b.ar.g() == 0) {
            this.b.a((String)"请输入贡献金额", (int)2);
            return;
         }
      }

   }

   public final void n() {
      this.a.a(this.A);
      this.i[0] = GlobalStatus.iK[0];
      this.i[1] = GlobalStatus.iM[0];
      this.i[2] = GlobalStatus.iL[0];
      this.x = new int[3][4];
      this.y = new int[3][4];
      this.z = new int[3][4];
      this.b.aq.j();
      this.b.aq.a("宝库配置");
      this.b.aq.a(false);
      this.b.ar.a(ao_1.b(this.A), GlobalConfig.af, (String[])null, (String[])null);
      this.b.au.a(new String[]{"确定", "返回"});
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.a.l = 0;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 114;
   }

   public final void o(int var1) {
      if (this.b.aq != null) {
         this.b.aq.b(var1);
      }

      if (this.b.tempTouchStatus > 40) {
         if (this.b.b != 2 && this.b.b != 518) {
            if (this.b.b == 8 || this.b.b == 516) {
               switch (this.b.ar.g()) {
                  case 0:
                     int[] var4 = this.i;
                     byte[] var12 = GlobalStatus.iK;
                     byte var26;
                     if (GlobalStatus.iK[0]-- <= 0) {
                        var26 = 0;
                     } else {
                        byte[] var27 = GlobalStatus.iK;
                        byte var53 = var27[0];
                        var26 = var27[0];
                        var27[0] = (byte)(var53 - 1);
                     }

                     var4[0] = var12[0] = var26;
                     break;
                  case 1:
                     this.i[1] = GlobalStatus.iM[0] = GlobalStatus.iM[0] - 10000 <= 0 ? 0 : GlobalStatus.iM[0] - 10000;
                     break;
                  case 2:
                     int[] var3 = this.i;
                     byte[] var11 = GlobalStatus.iL;
                     byte var23;
                     if (GlobalStatus.iL[0]-- <= 0) {
                        var23 = 0;
                     } else {
                        byte[] var24 = GlobalStatus.iL;
                        byte var51 = var24[0];
                        var23 = var24[0];
                        var24[0] = (byte)(var51 - 1);
                     }

                     var3[2] = var11[0] = var23;
               }
            }
         } else {
            switch (this.b.ar.g()) {
               case 0:
                  int[] var2 = this.i;
                  byte[] var10 = GlobalStatus.iK;
                  byte var20;
                  if (GlobalStatus.iK[0]++ >= GlobalStatus.iK[1]) {
                     var20 = GlobalStatus.iK[1];
                  } else {
                     byte[] var21 = GlobalStatus.iK;
                     byte var49 = var21[0];
                     var20 = var21[0];
                     var21[0] = (byte)(var49 + 1);
                  }

                  var2[0] = var10[0] = var20;
                  break;
               case 1:
                  this.i[1] = GlobalStatus.iM[0] = GlobalStatus.iM[0] + 10000 >= GlobalStatus.iM[1] ? GlobalStatus.iM[1] : GlobalStatus.iM[0] + 10000;
                  break;
               case 2:
                  int[] var10000 = this.i;
                  byte[] var10002 = GlobalStatus.iL;
                  byte var17;
                  if (GlobalStatus.iL[0]++ >= GlobalStatus.iL[1]) {
                     var17 = GlobalStatus.iL[1];
                  } else {
                     byte[] var18 = GlobalStatus.iL;
                     byte var47 = var18[0];
                     var17 = var18[0];
                     var18[0] = (byte)(var47 + 1);
                  }

                  var10000[2] = var10002[0] = var17;
            }
         }
      } else {
         if (var1 != 2 && var1 != 518) {
            if (var1 == 8 || var1 == 516) {
               switch (this.b.ar.g()) {
                  case 0:
                     int[] var8 = this.i;
                     byte[] var16 = GlobalStatus.iK;
                     byte var38;
                     if (GlobalStatus.iK[0]-- <= 0) {
                        var38 = 0;
                     } else {
                        byte[] var39 = GlobalStatus.iK;
                        byte var61 = var39[0];
                        var38 = var39[0];
                        var39[0] = (byte)(var61 - 1);
                     }

                     var8[0] = var16[0] = var38;
                     break;
                  case 1:
                     this.i[1] = GlobalStatus.iM[0] = GlobalStatus.iM[0] - 10000 <= 0 ? 0 : GlobalStatus.iM[0] - 10000;
                     break;
                  case 2:
                     int[] var7 = this.i;
                     byte[] var15 = GlobalStatus.iL;
                     byte var35;
                     if (GlobalStatus.iL[0]-- <= 0) {
                        var35 = 0;
                     } else {
                        byte[] var36 = GlobalStatus.iL;
                        byte var59 = var36[0];
                        var35 = var36[0];
                        var36[0] = (byte)(var59 - 1);
                     }

                     var7[2] = var15[0] = var35;
               }
            }
         } else {
            switch (this.b.ar.g()) {
               case 0:
                  int[] var6 = this.i;
                  byte[] var14 = GlobalStatus.iK;
                  byte var32;
                  if (GlobalStatus.iK[0]++ >= GlobalStatus.iK[1]) {
                     var32 = GlobalStatus.iK[1];
                  } else {
                     byte[] var33 = GlobalStatus.iK;
                     byte var57 = var33[0];
                     var32 = var33[0];
                     var33[0] = (byte)(var57 + 1);
                  }

                  var6[0] = var14[0] = var32;
                  break;
               case 1:
                  this.i[1] = GlobalStatus.iM[0] = GlobalStatus.iM[0] + 10000 >= GlobalStatus.iM[1] ? GlobalStatus.iM[1] : GlobalStatus.iM[0] + 10000;
                  break;
               case 2:
                  int[] var5 = this.i;
                  byte[] var13 = GlobalStatus.iL;
                  byte var29;
                  if (GlobalStatus.iL[0]++ >= GlobalStatus.iL[1]) {
                     var29 = GlobalStatus.iL[1];
                  } else {
                     byte[] var30 = GlobalStatus.iL;
                     byte var55 = var30[0];
                     var29 = var30[0];
                     var30[0] = (byte)(var55 + 1);
                  }

                  var5[2] = var13[0] = var29;
            }
         }

         ++this.b.tempTouchStatus;
      }

      if (var1 != 1073741824 && var1 != 517) {
         if (var1 == 268435456) {
            if (GlobalStatus.iK[1] == 0 && GlobalStatus.iM[1] == 0 && GlobalStatus.iL[1] == 0) {
               this.b.processException("请输入正确的数目！");
               return;
            }

            this.b((byte)2);
            this.b.touchAction = 0;
            return;
         }

         if (var1 == 536870912) {
            this.b(true);
         }
      } else {
         if (this.b.ar.g() == 0) {
            this.b.a((String)"请输入物品掉率", (int)2);
            return;
         }

         if (this.b.ar.g() == 1) {
            this.b.a((String)"请输入银两奖励", (int)2);
            return;
         }

         if (this.b.ar.g() == 2) {
            this.b.a((String)"请输入经验加成", (int)2);
            return;
         }
      }

   }

   public final void a(Graphics var1) {
      if (this.b.aq != null) {
         this.b.aq.a(var1);

         for(int var2 = 0; var2 < this.b.ar.f(); ++var2) {
            int var3 = this.b.ar.a() + this.b.ar.c() - MainCanvas.C.b - 126;
            int var4 = this.b.ar.b() + 4 + var2 * this.b.ar.e();
            LoadingPage.a(var1, var2 == 1 ? ao_1.a(this.b.l, (long)this.i[var2]) : this.i[var2] + "%", var3, var4, 122);
            var3 = 122;
            if (this.x != null && this.x.length > var2) {
               this.x[var2][0] = var3;
               this.x[var2][1] = var4;
               this.x[var2][2] = 12;
               this.x[var2][3] = GlobalConfig.j;
            }

            if (this.y != null && this.y.length > var2) {
               this.y[var2][0] = var3 + 122 - 12;
               this.y[var2][1] = var4;
               this.y[var2][2] = 12;
               this.y[var2][3] = GlobalConfig.j;
            }

            if (this.z != null) {
               this.z[var2][0] = var3 + 12;
               this.z[var2][1] = var4;
               this.z[var2][2] = 98;
               this.z[var2][3] = GlobalConfig.j;
            }
         }
      }

   }

   public final int a(int var1, int var2, int var3) {
      if (var1 == 0) {
         for(int var4 = 0; var4 < this.x.length; ++var4) {
            if (var2 >= this.x[var4][0] && var2 <= this.x[var4][0] + this.x[var4][2] && var3 >= this.x[var4][1] && var3 <= this.x[var4][1] + this.x[var4][3]) {
               return 8;
            }

            if (var2 >= this.y[var4][0] && var2 <= this.y[var4][0] + this.y[var4][2] && var3 >= this.y[var4][1] && var3 <= this.y[var4][1] + this.y[var4][3]) {
               return 2;
            }

            if (var2 >= this.z[var4][0] && var2 <= this.z[var4][0] + this.z[var4][2] && var3 >= this.z[var4][1] && var3 <= this.z[var4][1] + this.z[var4][3]) {
               return 1073741824;
            }
         }
      }

      return var1;
   }

   public final void o() {
      this.a.l = 0;
      this.b.aw = 0;
      LoadingPage.l = 0;
      this.b.aq.b();
      this.b.aq.a("帮派宝库");
      this.b.aq.a(true);
      this.b.as.a(new String[]{"宝库一", "宝库二", "宝库三"});
      this.b.as.a((byte)1);
      this.b.aq.a(GlobalConfig.realHigh <= 240 ? 79 : 120);
      if (this.a.j != 115 && this.a.j != 64) {
         this.a.aq = this.a.ar = 0;
      } else {
         this.a.aq = this.a.aF;
         this.a.ar = this.a.aG;
         this.b.as.a = this.a.aH;
      }

      int var1 = (this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq;
      if (GlobalStatus.iN != null && var1 < GlobalStatus.iN.length) {
         this.b.at.a(GlobalStatus.ja[var1], GlobalConfig.i, (byte)1);
      } else {
         this.b.at.a("没有物品,按3、9键可以上下翻滚此属性描述框", GlobalConfig.i, (byte)1);
      }

      this.b.au.a("操作");
      this.b.au.a(true);
      this.b.at.a((byte)1);
      this.b.aq.a((al)this.b.as);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 115;
   }

   public final void p() {
      int var1 = (this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq;
      if (GlobalStatus.iN != null && var1 < GlobalStatus.iN.length) {
         this.b.at.a(GlobalStatus.ja[var1], GlobalConfig.i, (byte)1);
      } else {
         this.b.at.a("没有物品，按3、9键可以上下翻滚此属性描述框", GlobalConfig.i, (byte)1);
      }

      this.b.at.a((byte)1);
      LoadingPage.l = 0;
   }

   public final void p(int var1) {
      int var2 = (this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq;
      if (this.a.l == 0) {
         this.a.a(GlobalStatus.iR);
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 1024 || var1 == 2048) {
               this.p();
               return;
            }

            if (var1 != 8 && var1 != 516) {
               if (var1 != 2 && var1 != 518) {
                  if (var1 != 1 && var1 != 514) {
                     if (var1 != 4 && var1 != 520) {
                        if (var1 == 536870912) {
                           this.a.am = null;
                           this.b(true);
                           return;
                        }

                        return;
                     }

                     this.a.ar = this.a.ar >= 3 ? 0 : ++this.a.ar;
                     this.p();
                     return;
                  }

                  this.a.ar = this.a.ar <= 0 ? 3 : --this.a.ar;
                  this.p();
                  return;
               }

               this.a.aq = this.a.aq >= 7 ? 0 : ++this.a.aq;
               this.p();
               return;
            }

            this.a.aq = this.a.aq <= 0 ? 7 : --this.a.aq;
            this.p();
            return;
         } else if (GlobalStatus.iN != null && var2 < GlobalStatus.iN.length) {
            String[] var10 = new String[]{"查看", "取出", "丢弃", "整理"};
            LoadingPage.a(this.a.au[(this.a.ar << 3) + this.a.aq][0] - 17, this.a.au[(this.a.ar << 3) + this.a.aq][1] + 17, var10, false);
            this.a.l = 1;
            return;
         }
      } else if (this.a.l == 1) {
         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 517 && var1 != 1073741824) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else if (GlobalStatus.iN != null && var2 < GlobalStatus.iN.length && GlobalStatus.iQ[var2] > 0) {
            switch (LoadingPage.o) {
               case 0:
                  if (!GlobalStatus.a(GlobalStatus.iP[var2])) {
                     this.b.aq.j();
                     this.b.aq.b();
                     this.b.aq.a("宝物详情");
                     if (GlobalStatus.ja != null && var2 < GlobalStatus.ja.length && GlobalStatus.ja[var2] != null) {
                        this.b.at.a(GlobalStatus.iO[var2] + "：\t" + GlobalStatus.ja[var2], GlobalConfig.i, (byte)1);
                     }

                     this.b.aq.a((al)this.b.at);
                     this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
                     this.a.l = 2;
                  } else {
                     var1 = var2;
                     GlobalStatus.ko = GlobalStatus.iN[var2];
                     GlobalStatus.kp = GlobalStatus.iO[var2];
                     GlobalStatus.kq = GlobalStatus.iO[var2];
                     GlobalStatus.ks = GlobalStatus.iS[var2];
                     GlobalStatus.kt = GlobalStatus.iT[var2];
                     GlobalStatus.ku = GlobalStatus.iU[var2];
                     GlobalStatus.kv = GlobalStatus.iV[var2];
                     GlobalStatus.kw = GlobalStatus.iW[var2];
                     GlobalStatus.kx = GlobalStatus.iX[var2];
                     var2 = 0;
                     if (GlobalStatus.jb[var2] != null) {
                        if ((var2 = (byte) GlobalStatus.jb[var2].length) > 0) {
                           GlobalStatus.kr = new short[var2];

                           for(byte var16 = 0; var16 < var2; ++var16) {
                              GlobalStatus.kr[var16] = GlobalStatus.jb[var1][var16];
                           }
                        }
                     } else {
                        GlobalStatus.kr = null;
                     }

                     GlobalStatus.ky = GlobalStatus.iY[var1];
                     GlobalStatus.kz = -1;
                     GlobalStatus.kA = GlobalStatus.ja[var1];
                     this.a.O.a(0, (short)this.a.k, -1);
                  }

                  this.a.aF = this.a.aq;
                  this.a.aG = this.a.ar;
                  this.a.aH = this.b.as.a;
                  break;
               case 1:
                  if (GlobalStatus.iQ[var2] > 1) {
                     this.a.a((long) GlobalStatus.iQ[var2]);
                     this.a.l = 3;
                  } else {
                     LoadingPage.h = 0;
                     String var8;
                     int var15 = LoadingPage.a(var8 = GlobalStatus.iO[var2]) != -1 ? LoadingPage.a(var8) : 15138723;
                     this.a.at = "您确定取出" + (var15 != 15138723 ? var8.substring(3, var8.length()) : var8) + "X" + GlobalStatus.iQ[var2] + "？";
                     this.a.l = 5;
                  }
                  break;
               case 2:
                  if (GlobalStatus.iQ[var2] > 1) {
                     this.a.a((long) GlobalStatus.iQ[var2]);
                     this.a.l = 6;
                  } else {
                     LoadingPage.h = 0;
                     String var7;
                     int var14 = LoadingPage.a(var7 = GlobalStatus.iO[var2]) != -1 ? LoadingPage.a(var7) : 15138723;
                     this.a.at = "您确定丢弃" + (var14 != 15138723 ? var7.substring(3, var7.length()) : var7) + "X" + GlobalStatus.iQ[var2] + "？";
                     this.a.l = 4;
                  }
                  break;
               case 3:
                  byte[] var6;
                  if ((var6 = NetPayloadBuilder.C((short)4366, GlobalStatus.ad)) != null) {
                     MainCanvas.netUtils.sendPacket(new NetPacket((short)4366, var6));
                     this.a.e.a((String)null);
                  } else {
                     this.a.e.processException("获取上传指令数据错误!");
                  }

                  this.a.l = 0;
               default:
                  return;
            }
         }
      } else if (this.a.l == 2) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 536870912) {
            this.o();
            return;
         }
      } else if (this.a.l != 3 && this.a.l != 6) {
         if (this.a.l == 4) {
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
               if (GlobalStatus.iQ[var2] > 1) {
                  this.c((byte)this.a.ag);
               } else {
                  this.c(GlobalStatus.iQ[var2]);
               }

               this.a.l = 0;
               LoadingPage.h = 0;
               return;
            }

            if (var1 == 536870912) {
               LoadingPage.h = 0;
               this.a.l = 0;
               return;
            }
         } else if (this.a.l == 5) {
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
               if (GlobalStatus.iQ[var2] > 1) {
                  this.d((byte)this.a.ag);
               } else {
                  this.d(GlobalStatus.iQ[var2]);
               }

               LoadingPage.h = 0;
               this.a.l = 0;
               return;
            }

            if (var1 == 536870912) {
               LoadingPage.h = 0;
               this.a.l = 0;
            }
         }
      } else {
         this.a.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 1;
               return;
            }
         } else if (GlobalStatus.iN != null && var2 < GlobalStatus.iN.length && GlobalStatus.iQ[var2] > 0) {
            LoadingPage.h = 0;
            if (this.a.l == 3) {
               LoadingPage.h = 0;
               String var5;
               int var13 = LoadingPage.a(var5 = GlobalStatus.iO[var2]) != -1 ? LoadingPage.a(var5) : 15138723;
               this.a.at = "您确定取出" + (var13 != 15138723 ? var5.substring(3, var5.length()) : var5) + "X" + this.a.ag + "？";
               this.a.l = 5;
               return;
            }

            LoadingPage.h = 0;
            String var4;
            int var3 = LoadingPage.a(var4 = GlobalStatus.iO[var2]) != -1 ? LoadingPage.a(var4) : 15138723;
            this.a.at = "您确定丢弃" + (var3 != 15138723 ? var4.substring(3, var4.length()) : var4) + "X" + this.a.ag + "？";
            this.a.l = 4;
            return;
         }
      }

   }

   private void c(byte var1) {
      byte[] var2;
      if ((var2 = NetPayloadBuilder.b((short)4246, GlobalStatus.iN[(this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq], (byte)var1, GlobalStatus.ad)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4246, var2));
         this.a.e.a((String)null);
      } else {
         this.a.e.processException("获取上传指令数据错误!");
      }
   }

   public final void b(Graphics var1) {
      if (this.b.aq != null) {
         int var2 = GlobalConfig.realHigh <= 240 ? 79 : 120;
         this.b.aq.a(var1);
         LoadingPage.a(var1, this.b.aq.a + 5, this.b.aq.b + 29 + this.b.as.b, this.b.aq.c - 11, var2, 1);
         LoadingPage.a(var1);
         Graphics var3 = var1;
         aq var11 = this;
         int var4 = (this.b.aq.c - 11 - (ao_1.x.b << 3)) / 9;
         int var5 = ((GlobalConfig.realHigh <= 240 ? 79 : 120) - 6 - (ao_1.x.b << 2)) / 5;
         int var6 = this.b.aq.a + 8 + var4;
         int var7 = this.b.aq.b + 33 + this.b.as.b + var5;

         for(int var8 = 0; var8 < 32; ++var8) {
            MainCanvas.f.a(var3, ao_1.x, (int[])null, (aj)null, 0, 0, var8 % 8 * (ao_1.x.b + var4) + var6, var8 / 8 * (ao_1.x.b + var5) + var7, 0, 0);
            var11.a.a((int)var8, var8 % 8 * (ao_1.x.b + var4) + var6, var8 / 8 * (ao_1.x.b + var5) + var7, (int) ao_1.x.b, (int) ao_1.x.c);
         }

         int var12 = 0;
         LoadingPage.d(var3, var6 + var11.a.aq * (ao_1.x.b + var4), var7 + var11.a.ar * (ao_1.x.b + var5), 17, 17);
         if (GlobalStatus.iR != null) {
            for(int var9 = var11.b.as.a << 5; var9 < (GlobalStatus.iR.length > var11.b.as.a + 1 << 5 ? var11.b.as.a + 1 << 5 : GlobalStatus.iR.length); ++var9) {
               int var10 = var9 % 32;
               MainCanvas.f.a(var3, ao_1.b(GlobalStatus.iR[var9]), (int[])null, (aj)null, 0, 0, var10 % 8 * (ao_1.x.b + var4) + var6 + 1, var10 / 8 * (ao_1.x.b + var5) + var7 + 1, 0, 0);
               if (GlobalStatus.iQ[var9] > 9) {
                  MainCanvas.f.a(var3, MainCanvas.n, (int[])null, GlobalStatus.iQ[var9] / 10, 0, 0, 10 + var10 % 8 * (ao_1.x.b + var4) + var6, var10 / 8 * (ao_1.x.b + var5) + var7 + 12, 0, 0);
                  MainCanvas.f.a(var3, MainCanvas.n, (int[])null, GlobalStatus.iQ[var9] % 10, 0, 0, 14 + var10 % 8 * (ao_1.x.b + var4) + var6, var10 / 8 * (ao_1.x.b + var5) + var7 + 12, 0, 0);
               } else if (GlobalStatus.iQ[var9] > 1) {
                  MainCanvas.f.a(var3, MainCanvas.n, (int[])null, GlobalStatus.iQ[var9] % 10, 0, 0, 14 + var10 % 8 * (ao_1.x.b + var4) + var6, var10 / 8 * (ao_1.x.b + var5) + var7 + 12, 0, 0);
               }

               if (var9 == (var11.a.ar << 3) + var11.a.aq + 32 * var11.b.as.a) {
                  var12 = var9;
               }
            }

            if (var12 >= 0 && var12 < GlobalStatus.iR.length && var12 == (var11.a.ar << 3) + var11.a.aq + 32 * var11.b.as.a) {
               LoadingPage.a(var3, GlobalStatus.iO[var12] + "X" + GlobalStatus.iQ[var12], GlobalStatus.iZ[var12], var6 + var11.a.aq * (ao_1.x.b + var4) + ao_1.x.b / 2, var7 + var11.a.ar * (ao_1.x.b + var5) + ao_1.x.b / 2);
            } else if ((var11.b.as.a << 5) + (var11.a.ar << 3) + var11.a.aq >= GlobalStatus.iJ) {
               LoadingPage.a(var3, "未开启", -1L, var6 + var11.a.aq * (ao_1.x.b + var4) + ao_1.x.b / 2, var7 + var11.a.ar * (ao_1.x.b + var5) + ao_1.x.b / 2);
            }
         }
      }

      if (this.a.l == 1) {
         LoadingPage.c(var1);
      } else {
         if (this.a.l == 2) {
            if (this.b.aq != null) {
               this.b.aq.a(var1);
               return;
            }
         } else {
            if (this.a.l == 3 || this.a.l == 6) {
               this.a.a(var1, "数量");
               return;
            }

            if (this.a.l == 5 || this.a.l == 4) {
               LoadingPage.a(var1, this.a.at, new String[]{"确定", "取消"});
            }
         }

      }
   }

   private void d(byte var1) {
      byte[] var2;
      if ((var2 = NetPayloadBuilder.b((short)4245, GlobalStatus.iN[(this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq], (byte)var1, GlobalStatus.ad)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4245, var2));
         this.a.e.a((String)null);
      } else {
         this.a.e.processException("获取上传指令数据错误!");
      }
   }

   public final void q() {
      this.j = 0L;
      this.B = 0;
      this.C = 0;
      this.D = 0;
      this.E = 0;
   }

   public final void c(Graphics var1) {
      if (this.a.l == 0 && this.b.aq != null) {
         LoadingPage.a(var1, (Image) MainCanvas.L.pngImage, (short) MainCanvas.L.b, this.b.aq.a + 5, this.b.aq.b + this.b.aq.d - 53, this.b.aq.c - 10, MainCanvas.L.c);
         this.b.aq.a(var1);

         for(int var2 = 0; var2 < this.b.ar.f(); ++var2) {
            int var3 = this.b.ar.a() + this.b.ar.c() - MainCanvas.C.b - 130;
            int var4 = this.b.ar.b() + 4 + var2 * this.b.ar.e();
            LoadingPage.a(var1, var2 == 0 ? ao_1.a(this.b.l, this.j) : "" + this.k[var2], var3, var4, 124);
            var3 = 124;
            if (this.l != null && this.l.length > var2) {
               this.l[var2][0] = var3;
               this.l[var2][1] = var4;
               this.l[var2][2] = 12;
               this.l[var2][3] = GlobalConfig.j;
            }

            if (this.m != null && this.m.length > var2) {
               this.m[var2][0] = var3 + 124 - 12;
               this.m[var2][1] = var4;
               this.m[var2][2] = 12;
               this.m[var2][3] = GlobalConfig.j;
            }

            if (this.n != null && var2 == 0) {
               this.n[0] = var3 + 12;
               this.n[1] = var4;
               this.n[2] = 100;
               this.n[3] = GlobalConfig.j;
            }
         }

         long var7 = (this.j + (long)this.B * GlobalStatus.jg + (long)this.C * GlobalStatus.ji + (long)this.D * GlobalStatus.jk + (long)this.E * GlobalStatus.jm) / 300L;
         LoadingPage.a(var1, (String)("得到功勋：" + var7), (int)(this.b.aq.a + this.b.aq.c / 2), this.b.aq.b + this.b.aq.d - 51 + (MainCanvas.M.pngImage.getHeight() - GlobalConfig.j) / 2, 17, 16776666, 0);
      }

   }

   public final void r() {
      byte[] var1;
      if ((var1 = NetPayloadBuilder.s((short)4236, GlobalStatus.ad)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4236, var1));
         this.b.a((String)null);
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   public final void q(int var1) {
      byte[] var2;
      if ((var2 = NetPayloadBuilder.k((short)(var1 == 0 ? 4230 : 4232), GlobalStatus.ad, (short) GlobalStatus.gQ)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)(var1 == 0 ? 4230 : 4232), var2));
         this.b.a((String)null);
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   public final void s() {
      this.b.aq.j();
      this.b.aq.a("区域建设");
      this.b.aq.a(true);
      this.b.as.a(new String[]{"购买", "仓库"});
      this.b.ar.a((Image[])null, GlobalStatus.jp, (String[])null, (String[])null);
      this.b.at.b(GlobalStatus.jq == null ? null : GlobalStatus.jq[this.b.ar.g()], GlobalConfig.i, (byte)2);
      this.b.at.a((byte)1);
      this.b.au.a("购买");
      this.b.au.a(true);
      this.b.aq.a((al)this.b.as);
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.a.l = 0;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 52;
   }

   public final void t() {
      this.b.ar.a((Image[])null, GlobalStatus.js, (String[])null, (String[])null);
      this.b.at.b(GlobalStatus.jt == null ? null : GlobalStatus.jt[this.b.ar.g()], GlobalConfig.i, (byte)2);
      this.b.at.a((byte)1);
      this.b.au.a("选择");
      this.b.au.a(true);
      this.a.l = 0;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 52;
   }

   public final void r(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 8 || var1 == 516 || var1 == 2 || var1 == 518) {
            GlobalStatus.gQ = 1;
            this.q(this.b.as.a);
            if (this.b.as.a == 0) {
               this.b.au.a("选择");
               this.b.au.a(true);
            } else if (this.b.as.a == 1) {
               this.b.au.a("购买");
               this.b.au.a(true);
            }
         }

         if (var1 == 1 || var1 == 514 || var1 == 4 || var1 == 520) {
            label159: {
               if (this.b.as.a == 0) {
                  if (GlobalStatus.jq == null) {
                     break label159;
                  }
               } else if (GlobalStatus.jt == null) {
                  break label159;
               }

               this.b.at.b(this.b.as.a == 0 ? GlobalStatus.jq[this.b.ar.g()] : GlobalStatus.jt[this.b.ar.g()], GlobalConfig.i, (byte)2);
               this.b.at.a((byte)1);
            }
         }

         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               GlobalStatus.I();
               GlobalStatus.J();
               this.a.j = this.a.k = 0;
               return;
            }

            if (var1 == 1024) {
               if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                  if (GlobalStatus.gQ - 1 <= 1) {
                     GlobalStatus.gQ = 1;
                  } else {
                     --GlobalStatus.gQ;
                  }

                  this.q(this.b.as.a);
                  return;
               }

               if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
                  if (GlobalStatus.gQ - 1 < 1) {
                     GlobalStatus.gQ = 1;
                  } else {
                     --GlobalStatus.gQ;
                  }

                  this.q(this.b.as.a);
                  return;
               }
            } else if (var1 == 2048) {
               if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
                  ++GlobalStatus.gQ;
                  this.q(this.b.as.a);
                  return;
               }

               if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                  ++GlobalStatus.gQ;
                  this.q(this.b.as.a);
                  return;
               }
            }
         } else {
            if (this.b.as.a == 0 && GlobalStatus.jo != null) {
               LoadingPage.a(0 + GlobalConfig.f, 2 * GlobalConfig.j + 11 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"购买"}, true);
               this.a.l = 1;
               return;
            }

            if (this.b.as.a == 1 && GlobalStatus.jr != null) {
               LoadingPage.a(0 + GlobalConfig.f, 2 * GlobalConfig.j + 11 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"布置", "卖出"}, true);
               this.a.l = 2;
               return;
            }
         }
      } else if (this.a.l == 1) {
         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else {
            byte[] var2;
            if ((var2 = NetPayloadBuilder.l((short)4233, GlobalStatus.ad, (byte) GlobalStatus.jo[this.b.ar.g()])) == null) {
               this.b.processException("获取上传指令数据错误!");
               return;
            }

            MainCanvas.netUtils.sendPacket(new NetPacket((short)4233, var2));
            this.b.a((String)null);
         }
      } else if (this.a.l == 2) {
         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
            }
         } else {
            if (LoadingPage.o == 0) {
               this.a.a((String) GlobalStatus.js[this.b.ar.g()], GlobalStatus.jr[this.b.ar.g()], (short) GlobalStatus.ju[this.b.ar.g()], (byte)0, (byte)4);
               return;
            }

            if (LoadingPage.o == 1) {
               byte[] var3;
               if ((var3 = NetPayloadBuilder.y((short)4237, GlobalStatus.ad, GlobalStatus.jr[this.b.ar.g()])) == null) {
                  this.b.processException("获取上传指令数据错误!");
                  return;
               }

               MainCanvas.netUtils.sendPacket(new NetPacket((short)4237, var3));
               this.b.a((String)null);
            }
         }
      }

   }

   public final void a(String var1) {
      byte[] var2;
      if ((var2 = NetPayloadBuilder.d((short)4864, var1, GlobalStatus.ad, (short) GlobalStatus.gQ)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4864, var2));
         this.b.a((String)null);
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   public final void a(byte var1, String var2) {
      byte[] var3;
      if ((var3 = NetPayloadBuilder.a((short)4865, var2, (byte)var1, (String) GlobalStatus.ad)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4865, var3));
         this.b.a((String)null);
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   public final void u() {
      this.b.aq.j();
      this.b.aq.a("帮派外交");
      this.b.aq.a(false);
      String[] var1 = null;
      int[] var2 = null;
      if (GlobalStatus.jY != null && GlobalStatus.jY.length > 0) {
         var1 = new String[GlobalStatus.jY.length];
         var2 = new int[GlobalStatus.jY.length];

         for(int var3 = 0; var3 < var1.length; ++var3) {
            var1[var3] = GlobalStatus.d(GlobalStatus.ka[var3]);
            if (GlobalStatus.ka[var3] == 2) {
               var2[var3] = 12845056;
            } else if (GlobalStatus.ka[var3] == 3) {
               var2[var3] = 16711680;
            } else {
               var2[var3] = 16776960;
            }
         }
      }

      this.b.ar.a((Image[])null, GlobalStatus.jZ, (String[])null, var1);
      this.b.ar.a("搜索...");
      this.b.ar.a(var2);
      this.b.ar.a("帮派搜索", 1);
      this.b.au.a("确定");
      this.b.au.a(true);
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      LoadingPage.l = 0;
      this.a.l = 0;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 60;
   }

   private static String w(int var0) {
      if (var0 < 0) {
         return null;
      } else if (GlobalStatus.jY != null && GlobalStatus.jY.length != 0) {
         StringBuffer var1 = new StringBuffer();
         if (GlobalStatus.kb != null) {
            var1.append("对方状态：" + (GlobalStatus.kb[var0] == 0 ? "保护" : (GlobalStatus.kb[var0] == 1 ? "和平" : "战争")));
            var1.append('\t');
         }

         if (GlobalStatus.kc != null) {
            var1.append("对方态度：" + (GlobalStatus.kc[var0] == 0 ? "中立" : "敌对"));
            var1.append('\t');
         }

         if (GlobalStatus.kd != null) {
            var1.append("你的态度：" + (GlobalStatus.kd[var0] == 0 ? "中立" : "敌对"));
            var1.append('\t');
         }

         return var1.toString();
      } else {
         return null;
      }
   }

   public final void s(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
            boolean var2 = this.b.ar.g() == this.b.ar.h();
            this.b.ar.a(var2 ? "帮派搜索" : w(this.b.ar.g() - 1), 1);
         }

         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.j = this.a.k = 0;
               return;
            }

            if (var1 == 1024) {
               if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                  if (GlobalStatus.gQ - 1 <= 1) {
                     GlobalStatus.gQ = 1;
                  } else {
                     --GlobalStatus.gQ;
                  }

                  this.a(this.o);
                  return;
               }

               if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
                  if (GlobalStatus.gQ - 1 < 1) {
                     GlobalStatus.gQ = 1;
                  } else {
                     --GlobalStatus.gQ;
                  }

                  this.a(this.o);
                  return;
               }
            } else if (var1 == 2048) {
               if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
                  ++GlobalStatus.gQ;
                  this.a(this.o);
                  return;
               }

               if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                  ++GlobalStatus.gQ;
                  this.a(this.o);
                  return;
               }
            }
         } else {
            this.a.aA = this.b.ar.h();
            this.a.aE = this.b.ar.g();
            if (this.b.ar.g() == this.b.ar.h()) {
               this.b.a((String)"请输入要搜索的帮派名称", (int)0);
               return;
            }

            if (GlobalStatus.jY != null) {
               LoadingPage.a(GlobalConfig.f, GlobalConfig.j + 11 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"查看", "外交", "宣战"}, true);
               this.a.l = 1;
               return;
            }
         }
      } else if (this.a.l == 1) {
         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else {
            this.b.aw = LoadingPage.o;
            if (LoadingPage.o == 0) {
               this.b(GlobalStatus.jY[this.b.ar.g() - 1]);
               return;
            }

            if (LoadingPage.o == 1) {
               LoadingPage.a(0, GlobalConfig.j + 11 + this.b.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"中立", "敌对"}, true);
               this.a.l = 2;
               return;
            }

            if (LoadingPage.o == 2) {
               LoadingPage.h = 0;
               this.a.l = 3;
               return;
            }
         }
      } else if (this.a.l == 2) {
         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else {
            if (LoadingPage.o == 0) {
               this.a((byte)1, GlobalStatus.jY[this.b.ar.g() - 1]);
               return;
            }

            if (LoadingPage.o == 1) {
               this.a((byte)2, GlobalStatus.jY[this.b.ar.g() - 1]);
               return;
            }
         }
      } else if (this.a.l == 3) {
         if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
            this.b.a((String)"输入OK确认宣战", (int)0);
            return;
         }

         if (var1 == 536870912) {
            this.a.l = 0;
         }
      }

   }

   public final void a(String var1, byte var2) {
      byte[] var3;
      if ((var3 = NetPayloadBuilder.b((short)4866, var1, var2, GlobalStatus.ad)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4866, var3));
         this.b.a((String)null);
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   public final void v() {
      this.a.M();
      if (this.b.b != 8 && this.b.b != 516) {
         if (this.b.b != 2 && this.b.b != 518) {
            if (this.b.b != 1 && this.b.b != 514) {
               if (this.b.b == 4 || this.b.b == 520) {
                  ao_1.i = ao_1.i + 4 > this.a.f.b - GlobalConfig.defaultHigh ? this.a.f.b - GlobalConfig.defaultHigh : ao_1.i + 4;
               }
            } else {
               ao_1.i = ao_1.i - 4 < 0 ? 0 : ao_1.i - 4;
            }
         } else {
            ao_1.h = ao_1.h + 4 > this.a.f.a - GlobalConfig.defaultWidth ? this.a.f.a - GlobalConfig.defaultWidth : ao_1.h + 4;
         }
      } else {
         ao_1.h = ao_1.h - 4 < 0 ? 0 : ao_1.h - 4;
      }

      if (GlobalStatus.bw != 2 || GlobalStatus.kj == 0) {
         GlobalStatus.kj = 0;
         ao_1.h = this.s;
         ao_1.i = this.t;
         this.a.l = 0;
         this.a.j = this.a.k = 0;
         this.b.b = 0;
         this.b.touchAction = 0;
      }

   }

   private void b(String var1) {
      byte[] var2;
      if ((var2 = NetPayloadBuilder.o((short)4868, var1, GlobalStatus.ad)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4868, var2));
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   private void C() {
      byte[] var1;
      if ((var1 = NetPayloadBuilder.l((short)4869, GlobalStatus.ad, (short) GlobalStatus.gQ)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4869, var1));
         this.b.a((String)null);
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   public final void w() {
      LoadingPage.h = 0;
      this.a.l = 0;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 62;
   }

   public final void t(int var1) {
      if (this.a.l == 0) {
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.al = null;
               this.a.j = this.a.k = 0;
            }
         } else {
            byte[] var2;
            if ((var2 = NetPayloadBuilder.v((short)4871, GlobalStatus.ad)) == null) {
               this.b.processException("获取上传指令数据错误!");
               return;
            }

            MainCanvas.netUtils.sendPacket(new NetPacket((short)4871, var2));
            this.b.a((String)null);
         }
      }

   }

   public final void x() {
      if (GlobalStatus.kE != null) {
         this.b.aq.j();
         this.b.aq.a("战争捷报");
         this.b.aq.a(false);
         this.b.ar.a((Image[])null, GlobalStatus.kE, (String[])null, (String[])null);
         this.b.at.b(GlobalStatus.kF[0], GlobalConfig.i, (byte)2);
         this.b.at.a((byte)1);
         this.b.au.a("确定");
         this.b.aq.a((al)this.b.ar);
         this.b.aq.a((al)this.b.at);
         this.b.aq.a((al)this.b.au);
         m_1 var10000 = this.b.aq;
         int var2 = 2 * GlobalConfig.j + 8;
         m_1 var1 = var10000;
         var10000.e = var2;
         int var3 = var1.e;
         this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
         this.a.l = 0;
         this.b.touchPageCase = this.b.k;
         this.a.j = this.a.k = 63;
      }

   }

   public final void u(int var1) {
      if (this.a.l == 0 && GlobalStatus.kE != null) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
            this.b.at.b(GlobalStatus.kF[this.b.ar.g()], GlobalConfig.i, (byte)2);
            this.b.at.a((byte)1);
         }

         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               this.a.j = this.a.k = 0;
            }
         } else {
            this.a.aA = this.b.ar.h();
            this.a.aE = this.b.ar.g();
            switch (this.a.aE) {
               case 0:
                  this.b.a((String)"请输入警告语（30个字符内）", (int)0);
                  break;
               case 1:
               case 2:
               case 3:
                  this.b((byte)this.b.ar.g(), (String)null);
               default:
                  return;
            }
         }
      }

   }

   public final void b(byte var1, String var2) {
      byte[] var3;
      if ((var3 = NetPayloadBuilder.c((short)4872, GlobalStatus.ad, var1, var2)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4872, var3));
      } else {
         this.b.processException("获取上传指令数据错误!");
      }
   }

   public final void y() {
      this.b.aq.b();
      this.b.aq.a("帮派升级");
      this.b.aq.a(false);
      this.b.at.b(GlobalStatus.mw == null ? "暂无帮派升级信息" : GlobalStatus.mw, GlobalConfig.i, (byte)0);
      this.b.aq.a((al)this.b.at);
      this.b.au.a("升级");
      this.b.aq.a((al)this.b.at);
      if (GlobalConfig.defaultHigh > 220) {
         this.b.aq.a((al)this.b.au);
      }

      this.b.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.a.l = 0;
      this.b.touchPageCase = this.b.k;
      this.a.j = this.a.k = 113;
   }

   public final void v(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
            this.a((byte)2);
            return;
         }

         if (var1 == 536870912) {
            this.a(true);
         }
      }

   }

   public final void d(Graphics var1) {
      if (this.a.l == 0 && this.b.aq != null) {
         this.b.aq.a(var1);
      }

   }
}

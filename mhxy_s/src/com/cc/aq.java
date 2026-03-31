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
      this.b.ar.a((Image[])null, t_1.Z, (String[])null, (String[])null);
      this.b.ar.a(var1);
      this.b.at.b(t_1.aa[var1], t_1.i, (byte)2);
      this.b.at.a((byte)1);
      this.b.au.a("选择");
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.a.l = 0;
      this.a.e.j = this.a.e.k;
      this.a.j = this.a.k = 41;
   }

   public final void b(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 1 || var1 == 514 || var1 == 4 || var1 == 520) {
            this.b.at.b(t_1.aa[this.b.ar.g()], t_1.i, (byte)2);
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
                  bt_1.gQ = 1;
                  this.z();
                  break;
               case 2:
                  this.a.e.a((String)"输入招募金额", (int)2);
                  break;
               case 3:
                  bt_1.gQ = 1;
                  this.A();
                  break;
               case 4:
                  this.r();
                  break;
               case 5:
                  this.a.l = 1;
                  ca_1.h = 0;
                  break;
               case 6:
                  this.a.l = 2;
                  ca_1.h = 0;
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
            if ((var2 = bz_1.a((short)4224, bt_1.ad, this.u)) == null) {
               this.a.e.b("获取上传指令数据错误!");
               return;
            }

            MainCanvas.i.a(new w((short)4224, var2));
            this.a.e.a((String)null);
         }
      }

   }

   private void z() {
      byte[] var1;
      if ((var1 = bz_1.g((short)4198, bt_1.ad, (short) bt_1.gQ)) != null) {
         MainCanvas.i.a(new w((short)4198, var1));
         this.a.e.a((String)null);
      } else {
         this.a.e.b("获取上传指令数据错误!");
      }
   }

   public final void a(long var1) {
      this.u = var1;
      this.a.o();
   }

   public final void a() {
      this.a.am = ca_1.a("将交付" + this.u + "帮派基金作为招募费用，持续一周？", t_1.i, 140, "\t");
      this.a.l = 3;
      ca_1.h = 0;
   }

   private void A() {
      byte[] var1;
      if ((var1 = bz_1.j((short)4225, bt_1.ad, (short) bt_1.gQ)) != null) {
         MainCanvas.i.a(new w((short)4225, var1));
         this.a.e.a((String)null);
      } else {
         this.a.e.b("获取上传指令数据错误!");
      }
   }

   public final void b() {
      this.b.aq.j();
      this.b.aq.a("等待响应");
      this.b.aq.a(false);
      c_1 var10000 = this.b.ar;
      String[] var10002 = bt_1.il;
      byte[] var1;
      String[] var2 = new String[(var1 = bt_1.in).length];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         var2[var3] = new String(var1[var3] + "人响应");
      }

      var10000.a((Image[])null, var10002, (String[])null, var2);
      this.b.at.b(bt_1.im == null ? null : bt_1.im[0], t_1.i, (byte)2);
      this.b.at.a((byte)1);
      this.b.au.a("响应");
      this.b.au.a(true);
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.a.l = 0;
      this.b.j = this.b.k;
      this.a.j = this.a.k = 42;
   }

   public final void c(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
            this.b.at.b(bt_1.im == null ? null : bt_1.im[this.b.ar.g()], t_1.i, (byte)2);
            this.b.at.a((byte)1);
         }

         if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
            ca_1.a(80 + t_1.f, t_1.j + 20 + this.b.ar.i() * t_1.j + t_1.g, bt_1.io[this.b.ar.g()] == 1 ? new String[]{"取消响应"} : new String[]{"响应"}, false);
            this.a.l = 1;
            return;
         }

         if (var1 == 536870912) {
            bt_1.gQ = 1;
            this.a(this.a.aE);
            return;
         }

         if (var1 == 1024) {
            if (bt_1.gQ > 1 && bt_1.gR == 1) {
               if (bt_1.gQ - 1 <= 1) {
                  bt_1.gQ = 1;
               } else {
                  --bt_1.gQ;
               }

               this.z();
               return;
            }

            if (bt_1.gQ > 1 && bt_1.gR == 0) {
               if (bt_1.gQ - 1 < 1) {
                  bt_1.gQ = 1;
               } else {
                  --bt_1.gQ;
               }

               this.z();
               return;
            }
         } else if (var1 == 2048) {
            if (bt_1.gQ <= 1 && bt_1.gR == 1) {
               ++bt_1.gQ;
               this.z();
               return;
            }

            if (bt_1.gQ > 1 && bt_1.gR == 1) {
               ++bt_1.gQ;
               this.z();
               return;
            }
         }
      } else if (this.a.l == 1) {
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
            }
         } else if (ca_1.o == 0) {
            if (bt_1.io[this.b.ar.g()] == 1) {
               byte[] var4;
               if ((var4 = bz_1.x((short)4243, bt_1.ad, bt_1.ik[this.b.ar.g()])) != null) {
                  w var5 = new w((short)4243, var4);
                  MainCanvas.i.a(var5);
               } else {
                  this.b.b("获取上传指令数据错误!");
               }

               this.b.a((String)null);
               return;
            }

            byte[] var2;
            if ((var2 = bz_1.x((short)4199, bt_1.ad, bt_1.ik[this.b.ar.g()])) != null) {
               w var3 = new w((short)4199, var2);
               MainCanvas.i.a(var3);
            } else {
               this.b.b("获取上传指令数据错误!");
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
      this.b.ar.a((Image[])null, bt_1.iq, (String[])null, (String[])null);
      this.b.at.b(bt_1.ir == null ? null : bt_1.ir[0], t_1.i, (byte)2);
      this.b.at.a((byte)1);
      this.b.au.a("申请");
      this.b.au.a(true);
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.a.l = 0;
      this.b.j = this.b.k;
      this.a.j = this.a.k = 43;
   }

   public final void d(int var1) {
      if (this.a.l == 0) {
         if (bt_1.ip != null) {
            if (this.b.aq == null) {
               return;
            }

            this.b.aq.b(var1);
            if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
               this.b.at.b(bt_1.ir == null ? null : bt_1.ir[this.b.ar.g()], t_1.i, (byte)2);
               this.b.at.a((byte)1);
            }

            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
               ca_1.a(80 + t_1.f, t_1.j + 20 + this.b.ar.i() * t_1.j + t_1.g, bt_1.is[this.b.ar.g()] == 1 ? new String[]{"取消申请"} : new String[]{"申请"}, false);
               this.a.l = 1;
            }
         }

         if (var1 == 536870912) {
            this.a(this.a.aE);
            return;
         }

         if (var1 == 1024) {
            if (bt_1.gQ > 1 && bt_1.gR == 1) {
               if (bt_1.gQ - 1 <= 1) {
                  bt_1.gQ = 1;
               } else {
                  --bt_1.gQ;
               }

               this.A();
               return;
            }

            if (bt_1.gQ > 1 && bt_1.gR == 0) {
               if (bt_1.gQ - 1 < 1) {
                  bt_1.gQ = 1;
               } else {
                  --bt_1.gQ;
               }

               this.A();
               return;
            }
         } else if (var1 == 2048) {
            if (bt_1.gQ <= 1 && bt_1.gR == 1) {
               ++bt_1.gQ;
               this.A();
               return;
            }

            if (bt_1.gQ > 1 && bt_1.gR == 1) {
               ++bt_1.gQ;
               this.A();
               return;
            }
         }
      } else if (this.a.l == 1) {
         ca_1.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
            }
         } else if (ca_1.o == 0) {
            if (bt_1.is[this.b.ar.g()] == 1) {
               String var2 = bt_1.ip[this.b.ar.g()];
               byte[] var3;
               if ((var3 = bz_1.l((short)4242, bt_1.ad, var2)) == null) {
                  this.b.b("获取上传指令数据错误!");
                  return;
               }

               MainCanvas.i.a(new w((short)4242, var3));
               this.b.a((String)null);
            } else {
               String var4 = bt_1.ip[this.b.ar.g()];
               byte[] var5;
               if ((var5 = bz_1.l((short)4226, bt_1.ad, var4)) == null) {
                  this.b.b("获取上传指令数据错误!");
                  return;
               }

               MainCanvas.i.a(new w((short)4226, var5));
               this.b.a((String)null);
            }
         }
      }

   }

   public final void d() {
      byte[] var1;
      if ((var1 = bz_1.m((short)4209, bt_1.ad)) != null) {
         MainCanvas.i.a(new w((short)4209, var1));
         this.b.a((String)null);
      } else {
         this.b.b("获取上传指令数据错误!");
      }
   }

   public final void a(boolean var1) {
      this.b.aq.j();
      this.b.aq.a("帮派管理");
      this.b.aq.a(false);
      this.b.ar.a((Image[])null, t_1.ab, (String[])null, (String[])null);
      if (var1) {
         this.b.ar.a(this.a.aA, this.a.aE);
         this.b.at.b(t_1.ac[this.a.aE], t_1.i, (byte)2);
      } else {
         this.b.at.b(t_1.ac[0], t_1.i, (byte)2);
      }

      this.b.at.a((byte)1);
      this.b.au.a("确定");
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.a.l = 0;
      this.b.j = this.b.k;
      this.a.j = this.a.k = 45;
   }

   public final void e(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
            this.b.at.b(t_1.ac[this.b.ar.g()], t_1.i, (byte)2);
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
                  bt_1.gQ = 1;
                  this.e();
                  break;
               case 2:
                  this.g();
                  break;
               case 3:
                  bt_1.gQ = 1;
                  this.j(1);
                  break;
               case 4:
                  bt_1.gQ = 1;
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
      if ((var1 = bz_1.i((short)4227, bt_1.ad, (short) bt_1.gQ)) != null) {
         MainCanvas.i.a(new w((short)4227, var1));
         this.b.a((String)null);
      } else {
         this.b.b("获取上传指令数据错误!");
      }
   }

   public final void f() {
      this.b.aq.j();
      this.b.aq.a("申请列表");
      this.b.aq.a(false);
      c_1 var10000 = this.b.ar;
      String[] var10002 = bt_1.iu;
      short[] var1 = bt_1.iv;
      String[] var2 = null;
      if (var1 != null) {
         var2 = new String[var1.length];

         for(int var3 = 0; var3 < var1.length; ++var3) {
            var2[var3] = new String(var1[var3] + "级");
         }
      }

      var10000.a((Image[])null, var10002, var2, bt_1.iw);
      this.b.au.a("确定");
      this.b.au.a(true);
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.a.l = 0;
      this.b.j = this.b.k;
      this.a.j = this.a.k = 46;
   }

   public final void f(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
            ca_1.a(80 + t_1.f, t_1.j + 20 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"详情", "接纳", "拒绝"}, false);
            this.a.l = 1;
            return;
         }

         if (var1 == 536870912) {
            this.a(true);
            return;
         }

         if (var1 == 1024) {
            if (bt_1.gQ > 1 && bt_1.gR == 1) {
               if (bt_1.gQ - 1 <= 1) {
                  bt_1.gQ = 1;
               } else {
                  --bt_1.gQ;
               }

               this.e();
               return;
            }

            if (bt_1.gQ > 1 && bt_1.gR == 0) {
               if (bt_1.gQ - 1 < 1) {
                  bt_1.gQ = 1;
               } else {
                  --bt_1.gQ;
               }

               this.e();
               return;
            }
         } else if (var1 == 2048) {
            if (bt_1.gQ <= 1 && bt_1.gR == 1) {
               ++bt_1.gQ;
               this.e();
               return;
            }

            if (bt_1.gQ > 1 && bt_1.gR == 1) {
               ++bt_1.gQ;
               this.e();
               return;
            }
         }
      } else if (this.a.l == 1) {
         ca_1.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else if (ca_1.o == 0) {
            if (bt_1.ix[this.b.ar.g()] != 1) {
               this.b.b("对方不在线");
               return;
            }

            byte[] var2;
            if ((var2 = bz_1.a((short)4110, bt_1.ad, bt_1.it[this.b.ar.g()], (byte)0)) == null) {
               this.b.b("获取上传指令数据错误!");
               return;
            }

            MainCanvas.i.a(new w((short)4110, var2));
            this.b.a((String)null);
         } else if (ca_1.o == 1) {
            byte[] var3;
            if ((var3 = bz_1.m((short)4228, bt_1.ad, bt_1.it[this.b.ar.g()])) == null) {
               this.b.b("获取上传指令数据错误!");
               return;
            }

            MainCanvas.i.a(new w((short)4228, var3));
            this.b.a((String)null);
         } else if (ca_1.o == 2) {
            byte[] var4;
            if ((var4 = bz_1.m((short)4229, bt_1.ad, bt_1.it[this.b.ar.g()])) == null) {
               this.b.b("获取上传指令数据错误!");
               return;
            }

            MainCanvas.i.a(new w((short)4229, var4));
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
         if ((var1 = bz_1.j((short)4201, bt_1.ad, this.f)) != null) {
            w var2 = new w((short)4201, var1);
            MainCanvas.i.a(var2);
         } else {
            this.b.b("获取上传指令数据错误!");
         }

         this.b.a((String)null);
      }

   }

   public final void g(int var1) {
      this.g = var1;
      byte[] var2;
      if ((var2 = bz_1.h((short)4212, bt_1.ad, (short) bt_1.gQ)) != null) {
         MainCanvas.i.a(new w((short)4212, var2));
         this.b.a((String)null);
      } else {
         this.b.b("获取上传指令数据错误!");
      }
   }

   private void B() {
      byte[] var1;
      if ((var1 = bz_1.o((short)4211, bt_1.ad)) != null) {
         MainCanvas.i.a(new w((short)4211, var1));
         this.b.a((String)null);
      } else {
         this.b.b("获取上传指令数据错误!");
      }
   }

   private void a(byte var1) {
      byte[] var2;
      if ((var2 = bz_1.k((short)4263, bt_1.ad, (byte)var1)) != null) {
         MainCanvas.i.a(new w((short)4263, var2));
         this.b.a((String)null);
      } else {
         this.b.b("获取上传指令数据错误!");
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
         this.b.ar.a((Image[])null, bt_1.iz, bt_1.iA, a(bt_1.iC, "战力"));
         this.b.ar.a(bt_1.aC == 1 ? bt_1.iE : null);
         this.b.ar.b(bt_1.aH == 1 ? bt_1.iF : null);
         this.b.ar.a(bt_1.iG);
         this.b.au.a("确定");
         this.b.au.a(true);
         this.b.aq.a((al)this.b.ar);
         this.b.aq.a((al)this.b.au);
         this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      } else if (var1 == 1) {
         this.b.as.a = 1;
         this.b.at.b(bt_1.iH, t_1.i, (byte)2);
         this.b.aq.a((al)this.b.at);
         this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      } else if (var1 == 2) {
         this.b.as.a = 2;
         String[] var4 = null;
         int[] var2 = null;
         if (bt_1.jY != null && bt_1.jY.length > 0) {
            var4 = new String[bt_1.jY.length];
            var2 = new int[bt_1.jY.length];

            for(int var3 = 0; var3 < var4.length; ++var3) {
               var4[var3] = bt_1.d(bt_1.ka[var3]);
               if (bt_1.ka[var3] == 2) {
                  var2[var3] = 12845056;
               } else if (bt_1.ka[var3] == 3) {
                  var2[var3] = 16711680;
               } else {
                  var2[var3] = 16776960;
               }
            }
         }

         this.b.ar.a((Image[])null, bt_1.jZ, (String[])null, var4);
         this.b.ar.a("搜索...");
         this.b.ar.a(var2);
         this.b.ar.a("帮派搜索", 1);
         this.b.au.a("确定");
         this.b.au.a(true);
         this.b.aq.a((al)this.b.ar);
         this.b.aq.a((al)this.b.au);
         this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
         ca_1.l = 0;
      } else if (var1 == 3) {
         this.b.as.a = 3;
         this.b.at.b(bt_1.kl, t_1.i, (byte)2);
         this.b.au.a("确定");
         this.b.au.a(true);
         this.b.aq.a((al)this.b.at);
         this.b.aq.a((al)this.b.au);
         this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      }

      this.a.l = 0;
      this.b.j = this.b.k;
      this.a.j = this.a.k = 47;
   }

   public final void i(int var1) {
      if (this.a.l == 0) {
         if (this.b.as.a == 0) {
            if (this.b.aq != null) {
               this.b.aq.b(var1);
            }

            if (bt_1.iy != null) {
               if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                  if (var1 == 1024) {
                     if (bt_1.gQ > 1 && bt_1.gR == 1) {
                        if (bt_1.gQ - 1 <= 1) {
                           bt_1.gQ = 1;
                        } else {
                           --bt_1.gQ;
                        }

                        this.g(this.g);
                     } else if (bt_1.gQ > 1 && bt_1.gR == 0) {
                        if (bt_1.gQ - 1 < 1) {
                           bt_1.gQ = 1;
                        } else {
                           --bt_1.gQ;
                        }

                        this.g(this.g);
                     }
                  } else if (var1 == 2048) {
                     if (bt_1.gQ <= 1 && bt_1.gR == 1) {
                        ++bt_1.gQ;
                        this.g(this.g);
                     } else if (bt_1.gQ > 1 && bt_1.gR == 1) {
                        ++bt_1.gQ;
                        this.g(this.g);
                     }
                  }
               } else if (bt_1.iD[this.b.ar.g()] == 1) {
                  if (!bt_1.iy[this.b.ar.g()].equals(bt_1.ad)) {
                     ca_1.a(80 + t_1.f, 2 * t_1.j + 20 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
                     this.a.l = 1;
                     this.a.aE = this.b.ar.g();
                     this.a.aA = this.b.ar.h();
                  }
               } else if (!bt_1.iy[this.b.ar.g()].equals(bt_1.ad)) {
                  ca_1.a(80 + t_1.f, 2 * t_1.j + 20 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"查看"}, false);
                  this.a.l = 1;
                  this.a.aE = this.b.ar.g();
                  this.a.aA = this.b.ar.h();
               }
            }

            if (var1 != 2 && var1 != 518) {
               if (var1 == 8 || var1 == 516) {
                  bt_1.gQ = 1;
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
                  bt_1.gQ = 1;
                  this.p = 1;
                  this.o = "";
                  this.a(this.o);
               }
            } else {
               bt_1.gQ = 1;
               this.g(this.g);
            }
         } else if (this.b.as.a == 2) {
            if (this.b.aq != null) {
               this.b.aq.b(var1);
            }

            if (var1 != 8 && var1 != 516) {
               if (var1 == 2 || var1 == 518) {
                  bt_1.gQ = 1;
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
                  if (bt_1.gQ > 1 && bt_1.gR == 1) {
                     if (bt_1.gQ - 1 <= 1) {
                        bt_1.gQ = 1;
                     } else {
                        --bt_1.gQ;
                     }

                     this.a(this.o);
                  } else if (bt_1.gQ > 1 && bt_1.gR == 0) {
                     if (bt_1.gQ - 1 < 1) {
                        bt_1.gQ = 1;
                     } else {
                        --bt_1.gQ;
                     }

                     this.a(this.o);
                  }
               } else if (var1 == 2048) {
                  if (bt_1.gQ <= 1 && bt_1.gR == 1) {
                     ++bt_1.gQ;
                     this.a(this.o);
                  } else if (bt_1.gQ > 1 && bt_1.gR == 1) {
                     ++bt_1.gQ;
                     this.a(this.o);
                  }
               }
            } else {
               this.a.aA = this.b.ar.h();
               this.a.aE = this.b.ar.g();
               if (this.b.ar.g() == this.b.ar.h()) {
                  this.b.a((String)"请输入要搜索的帮派名称", (int)0);
               } else if (bt_1.jY != null) {
                  ca_1.a(80 + t_1.f, 2 * t_1.j + 20 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"查看", "外交", "宣战"}, true);
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
                     if (bt_1.gQ > 1 && bt_1.gR == 1) {
                        if (bt_1.gQ - 1 <= 1) {
                           bt_1.gQ = 1;
                        } else {
                           --bt_1.gQ;
                        }

                        this.C();
                     } else if (bt_1.gQ > 1 && bt_1.gR == 0) {
                        if (bt_1.gQ - 1 < 1) {
                           bt_1.gQ = 1;
                        } else {
                           --bt_1.gQ;
                        }

                        this.C();
                     }
                  } else if (var1 == 2048) {
                     if (bt_1.gQ <= 1 && bt_1.gR == 1) {
                        ++bt_1.gQ;
                        this.C();
                     } else if (bt_1.gQ > 1 && bt_1.gR == 1) {
                        ++bt_1.gQ;
                        this.C();
                     }
                  }
               } else {
                  bt_1.gQ = 1;
                  this.g(this.g);
               }
            } else {
               bt_1.gQ = 1;
               this.p = 1;
               this.o = "";
               this.a(this.o);
            }
         } else if (this.b.as.a == 4) {
            if (this.b.aq != null) {
               this.b.aq.b(var1);
            }

            if (var1 == 8 || var1 == 516) {
               bt_1.gQ = 1;
               this.C();
            }
         }

         if (var1 == 536870912) {
            this.o = "";
            bt_1.gQ = 1;
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
            this.a.aQ = bt_1.iz[this.b.ar.g()];
            this.a.a((String) bt_1.iy[this.b.ar.g()], (byte)4);
            this.a.l = 0;
            this.b.b("聊天消息已发送!");
         }

         ca_1.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else {
            if (ca_1.o == 0) {
               ca_1.a(80 + t_1.f, 2 * t_1.j + 20 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"属性", "装备"}, false);
               this.a.l = 2;
               return;
            }

            if (ca_1.o == 1) {
               this.a.aS = bt_1.iy[this.b.ar.g()];
               this.a.aT = 4;
               this.b.a((String)"聊天", (int)0);
               return;
            }

            if (ca_1.o == 2) {
               if (bt_1.bs == -1) {
                  ca_1.a(80 + t_1.f, 2 * t_1.j + 20 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"自由", "跟随"}, false);
                  this.a.l = 6;
                  return;
               }

               this.a.a(bt_1.s, bt_1.iy[this.b.ar.g()]);
               return;
            }

            if (ca_1.o == 3) {
               ca_1.a(80 + t_1.f, 2 * t_1.j + 20 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"物品", "宠物"}, false);
               this.a.l = 5;
               return;
            }

            if (ca_1.o == 4) {
               this.a.a(bt_1.iy[this.b.ar.g()]);
               this.a.l = 0;
               return;
            }

            if (ca_1.o == 5) {
               this.a.b(bt_1.iy[this.b.ar.g()]);
               this.a.l = 0;
               return;
            }
         }
      } else if (this.a.l == 2) {
         ca_1.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               if (bt_1.iD[this.b.ar.g()] == 1) {
                  ca_1.a(80 + t_1.f, 2 * t_1.j + 20 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
               } else {
                  ca_1.a(80 + t_1.f, 2 * t_1.j + 20 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"查看"}, false);
               }

               this.a.l = 1;
               return;
            }
         } else if (ca_1.o == 0) {
            byte[] var6;
            if ((var6 = bz_1.a((short)4110, bt_1.ad, bt_1.iy[this.b.ar.g()], (byte)1)) == null) {
               this.b.b("获取上传指令数据错误!");
               return;
            }

            MainCanvas.i.a(new w((short)4110, var6));
            this.b.a((String)null);
         } else if (ca_1.o == 1) {
            byte[] var7;
            if ((var7 = bz_1.b((short)4111, bt_1.ad, bt_1.iy[this.b.ar.g()])) == null) {
               this.b.b("获取上传指令数据错误!");
               return;
            }

            MainCanvas.i.a(new w((short)4111, var7));
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
         this.a.a(bt_1.cJ);
         this.a.g(var1);
         if (var1 == 536870912) {
            if (this.a.m == 1) {
               this.a.T.j();
               this.a.m = 0;
               return;
            }

            if (bt_1.cJ != null) {
               bt_1.o();
            }

            ao_1.q = null;
            this.a.al = null;
            this.a.l = 2;
            MainCanvas.f.a(this.a.f, ao_1.h, ao_1.i, true, false, 1009050);
            return;
         }
      } else if (this.a.l == 5) {
         ca_1.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               ca_1.a(80 + t_1.f, 2 * t_1.j + 20 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
               ca_1.o = 3;
               this.a.l = 1;
               return;
            }
         } else {
            byte[] var8;
            if ((var8 = bz_1.b((short)4124, bt_1.ad, bt_1.iy[this.b.ar.g()], (byte)((byte)ca_1.o))) == null) {
               this.b.b("获取上传指令数据错误!");
               return;
            }

            MainCanvas.i.a(new w((short)4124, var8));
            this.b.a((String)null);
         }
      } else if (this.a.l == 6) {
         ca_1.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               ca_1.a(80 + t_1.f, 2 * t_1.j + 20 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
               ca_1.o = 2;
               this.a.l = 1;
               return;
            }
         } else {
            var1 = ca_1.o == 0 ? 1 : 0;
            if (bt_1.bs == 0) {
               this.b.b("队员不能发送组队邀请！");
            } else if (bt_1.bs == 1 && bt_1.q != null && bt_1.q.length >= 3) {
               this.b.b("队伍已满，无法邀请！");
            } else {
               byte[] var4;
               if ((var4 = bz_1.a((short)4112, bt_1.ad, bt_1.iy[this.b.ar.g()], (short)((short)var1))) == null) {
                  this.b.b("获取上传指令数据错误!");
                  return;
               }

               w var5 = new w((short)4112, var4);
               MainCanvas.i.a(var5);
               this.a.l = 0;
            }
         }
      } else if (this.a.l == 7) {
         ca_1.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else {
            this.b.aw = ca_1.o;
            if (ca_1.o == 0) {
               this.b(bt_1.jY[this.b.ar.g() - 1]);
               return;
            }

            if (ca_1.o == 1) {
               ca_1.a(80 + t_1.f, 2 * t_1.j + 20 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"中立", "敌对"}, true);
               this.a.l = 8;
               return;
            }

            if (ca_1.o == 2) {
               this.a.l = 9;
               ca_1.h = 0;
               return;
            }
         }
      } else if (this.a.l == 8) {
         ca_1.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else {
            if (ca_1.o == 0) {
               this.a((byte)1, bt_1.jY[this.b.ar.g() - 1]);
               return;
            }

            if (ca_1.o == 1) {
               this.a((byte)2, bt_1.jY[this.b.ar.g() - 1]);
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
      if ((var2 = bz_1.h((short)4240, bt_1.ad, (short) bt_1.gQ)) != null) {
         MainCanvas.i.a(new w((short)4240, var2));
      } else {
         this.b.b("获取上传指令数据错误!");
      }
   }

   public final void i() {
      this.b.aq.j();
      this.b.aq.a("成员列表");
      this.b.aq.a(false);
      this.b.ar.a((Image[])null, bt_1.iz, bt_1.iA, a(bt_1.iB, "功勋"));
      this.b.ar.a(bt_1.aC == 1 ? bt_1.iE : null);
      this.b.ar.b(bt_1.aH == 1 ? bt_1.iF : null);
      this.b.ar.a(bt_1.iG);
      this.b.au.a("任免");
      this.b.au.a(true);
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.a.l = 0;
      this.b.j = this.b.k;
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
         if (bt_1.iy != null) {
            if (this.b.aq != null) {
               this.b.aq.b(var1);
            }

            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
               ca_1.a(80 + t_1.f, t_1.j + 20 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"任免", "开除"}, false);
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
            if (bt_1.gQ > 1 && bt_1.gR == 1) {
               if (bt_1.gQ - 1 <= 1) {
                  bt_1.gQ = 1;
               } else {
                  --bt_1.gQ;
               }

               this.j(this.g);
               return;
            }

            if (bt_1.gQ > 1 && bt_1.gR == 0) {
               if (bt_1.gQ - 1 < 1) {
                  bt_1.gQ = 1;
               } else {
                  --bt_1.gQ;
               }

               this.j(this.g);
               return;
            }
         } else if (var1 == 2048) {
            if (bt_1.gQ <= 1 && bt_1.gR == 1) {
               ++bt_1.gQ;
               this.j(this.g);
               return;
            }

            if (bt_1.gQ > 1 && bt_1.gR == 1) {
               ++bt_1.gQ;
               this.j(this.g);
               return;
            }
         }
      } else if (this.a.l == 1) {
         ca_1.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else if (ca_1.o == 0) {
            byte[] var3;
            if ((var3 = bz_1.p((short)4241, bt_1.ad)) == null) {
               this.b.b("获取上传指令数据错误!");
               return;
            }

            MainCanvas.i.a(new w((short)4241, var3));
            this.b.a((String)null);
         } else if (ca_1.o == 1) {
            this.a.l = 3;
            ca_1.h = 0;
            return;
         }
      } else if (this.a.l == 2) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
            this.b.at.b(bt_1.je[this.b.ar.g()], t_1.i, (byte)2);
            this.b.at.a((byte)1);
         }

         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.i();
               return;
            }
         } else {
            String var10001 = bt_1.iy[this.v];
            byte var2 = bt_1.jc[this.b.ar.g()];
            String var4 = var10001;
            byte[] var5;
            if ((var5 = bz_1.d((short)4217, bt_1.ad, var4, (byte)var2)) == null) {
               this.b.b("获取上传指令数据错误!");
               return;
            }

            MainCanvas.i.a(new w((short)4217, var5));
            this.b.a((String)null);
         }
      } else if (this.a.l == 3) {
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
            }
         } else {
            String var6 = bt_1.iy[this.b.ar.g()];
            byte[] var7;
            if ((var7 = bz_1.k((short)4208, bt_1.ad, var6)) == null) {
               this.b.b("获取上传指令数据错误!");
               return;
            }

            MainCanvas.i.a(new w((short)4208, var7));
            this.b.a((String)null);
         }
      }

   }

   public final void j() {
      this.b.aq.j();
      this.b.aq.a("职务列表");
      this.b.aq.a(true);
      this.b.ar.a((Image[])null, bt_1.jd, (String[])null, (String[])null);
      this.b.at.b(bt_1.je[this.b.ar.g()], t_1.i, (byte)2);
      this.b.at.a((byte)1);
      this.b.au.a("确定");
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.a.l = 2;
      this.b.j = this.b.k;
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
      this.b.at.b(bt_1.jf, t_1.i, (byte)2);
      this.b.au.a("确定");
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.a.l = 0;
      this.b.j = this.b.k;
      this.a.j = this.a.k = 49;
   }

   public final void b(boolean var1) {
      this.b.aq.j();
      this.b.aq.a("宝库管理");
      this.b.aq.a(false);
      this.b.ar.a((Image[])null, t_1.ad, (String[])null, (String[])null);
      if (var1) {
         this.b.ar.a(this.a.aA, this.a.aE);
         this.b.at.b(bt_1.iI[this.a.aE], t_1.i, (byte)2);
      } else {
         this.b.at.b(bt_1.iI[0], t_1.i, (byte)2);
      }

      this.b.at.a((byte)1);
      this.b.au.a("确定");
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      ca_1.h = 0;
      ca_1.g = 0;
      this.b.a = 0;
      this.a.l = 0;
      this.b.j = this.b.k;
      this.a.j = this.a.k = 50;
   }

   public final void m(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 514 || var1 == 520 || var1 == 1 || var1 == 4) {
            this.b.at.b(bt_1.iI[this.b.ar.g()], t_1.i, (byte)2);
            this.b.at.a((byte)1);
         }

         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               bt_1.H();
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
                  this.a.a(bt_1.ap);
                  break;
               case 3:
                  this.a.o();
                  this.a.l = 5;
                  this.a.a(999999999L);
                  break;
               case 4:
                  this.a.o();
                  this.a.l = 2;
                  this.a.a(bt_1.am);
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
                  ca_1.h = 0;
                  break;
               case 10:
                  this.a.l = 7;
                  this.a.at = "您确定要消耗一定物品扩容帮派宝库吗？";
                  ca_1.h = 0;
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
                        this.b.b("超出最大值,请重新输入");
                        return;
                     }

                     byte[] var4;
                     if ((var4 = bz_1.b((short)4264, (byte)2, this.a.n(), bt_1.ad)) != null) {
                        MainCanvas.i.a(new w((short)4264, var4));
                        this.b.a((String)null);
                     } else {
                        this.b.b("获取上传指令数据错误!");
                     }

                     this.a.l = 0;
                     return;
                  }

                  this.b.b("输入有误,请重新输入");
                  return;
               }

               if (this.a.l == 6) {
                  if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                     this.a.l = 0;
                     this.a((short)4677);
                     return;
                  }

                  if (var1 == 536870912) {
                     ca_1.l = 0;
                     ca_1.h = 0;
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
                     ca_1.l = 0;
                     ca_1.h = 0;
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
               ca_1.h = 0;
               return;
            }

            if (this.a.m != 1) {
               return;
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
               if (var1 == 536870912) {
                  this.a.at = null;
                  this.a.m = 0;
                  ca_1.h = 0;
                  return;
               }

               return;
            }

            byte[] var3;
            if ((var3 = bz_1.a((short)4368, (int)this.a.ag, (byte)((byte)(this.a.l == 3 ? 1 : 2)), bt_1.ad)) != null) {
               MainCanvas.i.a(new w((short)4368, var3));
               this.b.a((String)null);
            } else {
               this.b.b("获取上传指令数据错误!");
            }

            ca_1.h = 0;
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
               this.b.b("超出最大值,请重新输入");
               return;
            }

            byte[] var2;
            if ((var2 = bz_1.b((short)4264, (byte)(this.a.l == 1 ? 1 : 3), this.a.n(), bt_1.ad)) != null) {
               MainCanvas.i.a(new w((short)4264, var2));
               this.b.a((String)null);
            } else {
               this.b.b("获取上传指令数据错误!");
            }

            this.a.l = 0;
            return;
         }

         this.b.b("输入有误,请重新输入");
         return;
      }

   }

   private void a(short var1) {
      byte[] var2;
      if ((var2 = bz_1.C(var1, bt_1.ad)) != null) {
         MainCanvas.i.a(new w(var1, var2));
         this.b.a((String)null);
      } else {
         this.b.b("获取上传指令数据错误!");
      }
   }

   private void b(byte var1) {
      byte[] var2;
      if ((var2 = bz_1.a((short)4239, var1, this.i, bt_1.ad)) != null) {
         MainCanvas.i.a(new w((short)4239, var2));
         this.b.a((String)null);
      } else {
         this.b.b("获取上传指令数据错误!");
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
      String[] var1 = t_1.b <= 176 ? new String[]{"", "", "", "", ""} : t_1.ae;
      this.b.ar.a(ao_1.b(this.w), var1, (String[])null, (String[])null);
      short var2 = MainCanvas.L.c;
      this.b.aq.f = var2;
      this.b.ar.b(false);
      this.b.au.a(new String[]{"确定", "返回"});
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.a.l = 0;
      this.b.j = this.b.k;
      this.a.j = this.a.k = 51;
   }

   public final void m() {
      byte[] var1;
      if ((var1 = bz_1.r((short)4221, bt_1.ad)) != null) {
         MainCanvas.i.a(new w((short)4221, var1));
         this.b.a((String)null);
      } else {
         this.b.b("获取上传指令数据错误!");
      }
   }

   public final void n(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (this.b.aA > 40) {
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
                     this.k[0] = (int)(this.j = this.j + 100L <= bt_1.ap ? this.j + 100L : bt_1.ap);
                     break;
                  case 1:
                     int[] var14 = this.k;
                     short var55 = this.B;
                     this.B = (short)(var55 + 1);
                     short var29;
                     if (var55 >= bt_1.jh) {
                        var29 = bt_1.jh;
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
                     if (var53 >= bt_1.jj) {
                        var28 = bt_1.jj;
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
                     if (var51 >= bt_1.jl) {
                        var27 = bt_1.jl;
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
                     if (var49 >= bt_1.jn) {
                        var26 = bt_1.jn;
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
                     this.k[0] = (int)(this.j = this.j + 100L <= bt_1.ap ? this.j + 100L : bt_1.ap);
                     break;
                  case 1:
                     int[] var5 = this.k;
                     short var39 = this.B;
                     this.B = (short)(var39 + 1);
                     short var21;
                     if (var39 >= bt_1.jh) {
                        var21 = bt_1.jh;
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
                     if (var37 >= bt_1.jj) {
                        var20 = bt_1.jj;
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
                     if (var35 >= bt_1.jl) {
                        var19 = bt_1.jl;
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
                     if (var10005 >= bt_1.jn) {
                        var10003 = bt_1.jn;
                     } else {
                        var10005 = this.E;
                        var10003 = var10005;
                        this.E = (short)(var10005 + 1);
                     }

                     var10000[4] = this.E = var10003;
               }
            }

            ++this.b.aA;
         }

         if (var1 != 1073741824 && var1 != 517) {
            if (var1 == 268435456) {
               if (this.j == 0L && this.B == 0 && this.C == 0 && this.D == 0 && this.E == 0) {
                  this.b.b("请输入贡献基金的数目！");
                  return;
               }

               byte[] var2;
               if ((var2 = bz_1.a((short)4220, bt_1.ad, this.j, this.B, this.C, this.D, this.E)) == null) {
                  this.b.b("获取上传指令数据错误!");
                  return;
               }

               MainCanvas.i.a(new w((short)4220, var2));
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
      this.i[0] = bt_1.iK[0];
      this.i[1] = bt_1.iM[0];
      this.i[2] = bt_1.iL[0];
      this.x = new int[3][4];
      this.y = new int[3][4];
      this.z = new int[3][4];
      this.b.aq.j();
      this.b.aq.a("宝库配置");
      this.b.aq.a(false);
      this.b.ar.a(ao_1.b(this.A), t_1.af, (String[])null, (String[])null);
      this.b.au.a(new String[]{"确定", "返回"});
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.a.l = 0;
      this.b.j = this.b.k;
      this.a.j = this.a.k = 114;
   }

   public final void o(int var1) {
      if (this.b.aq != null) {
         this.b.aq.b(var1);
      }

      if (this.b.aA > 40) {
         if (this.b.b != 2 && this.b.b != 518) {
            if (this.b.b == 8 || this.b.b == 516) {
               switch (this.b.ar.g()) {
                  case 0:
                     int[] var4 = this.i;
                     byte[] var12 = bt_1.iK;
                     byte var26;
                     if (bt_1.iK[0]-- <= 0) {
                        var26 = 0;
                     } else {
                        byte[] var27 = bt_1.iK;
                        byte var53 = var27[0];
                        var26 = var27[0];
                        var27[0] = (byte)(var53 - 1);
                     }

                     var4[0] = var12[0] = var26;
                     break;
                  case 1:
                     this.i[1] = bt_1.iM[0] = bt_1.iM[0] - 10000 <= 0 ? 0 : bt_1.iM[0] - 10000;
                     break;
                  case 2:
                     int[] var3 = this.i;
                     byte[] var11 = bt_1.iL;
                     byte var23;
                     if (bt_1.iL[0]-- <= 0) {
                        var23 = 0;
                     } else {
                        byte[] var24 = bt_1.iL;
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
                  byte[] var10 = bt_1.iK;
                  byte var20;
                  if (bt_1.iK[0]++ >= bt_1.iK[1]) {
                     var20 = bt_1.iK[1];
                  } else {
                     byte[] var21 = bt_1.iK;
                     byte var49 = var21[0];
                     var20 = var21[0];
                     var21[0] = (byte)(var49 + 1);
                  }

                  var2[0] = var10[0] = var20;
                  break;
               case 1:
                  this.i[1] = bt_1.iM[0] = bt_1.iM[0] + 10000 >= bt_1.iM[1] ? bt_1.iM[1] : bt_1.iM[0] + 10000;
                  break;
               case 2:
                  int[] var10000 = this.i;
                  byte[] var10002 = bt_1.iL;
                  byte var17;
                  if (bt_1.iL[0]++ >= bt_1.iL[1]) {
                     var17 = bt_1.iL[1];
                  } else {
                     byte[] var18 = bt_1.iL;
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
                     byte[] var16 = bt_1.iK;
                     byte var38;
                     if (bt_1.iK[0]-- <= 0) {
                        var38 = 0;
                     } else {
                        byte[] var39 = bt_1.iK;
                        byte var61 = var39[0];
                        var38 = var39[0];
                        var39[0] = (byte)(var61 - 1);
                     }

                     var8[0] = var16[0] = var38;
                     break;
                  case 1:
                     this.i[1] = bt_1.iM[0] = bt_1.iM[0] - 10000 <= 0 ? 0 : bt_1.iM[0] - 10000;
                     break;
                  case 2:
                     int[] var7 = this.i;
                     byte[] var15 = bt_1.iL;
                     byte var35;
                     if (bt_1.iL[0]-- <= 0) {
                        var35 = 0;
                     } else {
                        byte[] var36 = bt_1.iL;
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
                  byte[] var14 = bt_1.iK;
                  byte var32;
                  if (bt_1.iK[0]++ >= bt_1.iK[1]) {
                     var32 = bt_1.iK[1];
                  } else {
                     byte[] var33 = bt_1.iK;
                     byte var57 = var33[0];
                     var32 = var33[0];
                     var33[0] = (byte)(var57 + 1);
                  }

                  var6[0] = var14[0] = var32;
                  break;
               case 1:
                  this.i[1] = bt_1.iM[0] = bt_1.iM[0] + 10000 >= bt_1.iM[1] ? bt_1.iM[1] : bt_1.iM[0] + 10000;
                  break;
               case 2:
                  int[] var5 = this.i;
                  byte[] var13 = bt_1.iL;
                  byte var29;
                  if (bt_1.iL[0]++ >= bt_1.iL[1]) {
                     var29 = bt_1.iL[1];
                  } else {
                     byte[] var30 = bt_1.iL;
                     byte var55 = var30[0];
                     var29 = var30[0];
                     var30[0] = (byte)(var55 + 1);
                  }

                  var5[2] = var13[0] = var29;
            }
         }

         ++this.b.aA;
      }

      if (var1 != 1073741824 && var1 != 517) {
         if (var1 == 268435456) {
            if (bt_1.iK[1] == 0 && bt_1.iM[1] == 0 && bt_1.iL[1] == 0) {
               this.b.b("请输入正确的数目！");
               return;
            }

            this.b((byte)2);
            this.b.a = 0;
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
            ca_1.a(var1, var2 == 1 ? ao_1.a(this.b.l, (long)this.i[var2]) : this.i[var2] + "%", var3, var4, 122);
            var3 = 122;
            if (this.x != null && this.x.length > var2) {
               this.x[var2][0] = var3;
               this.x[var2][1] = var4;
               this.x[var2][2] = 12;
               this.x[var2][3] = t_1.j;
            }

            if (this.y != null && this.y.length > var2) {
               this.y[var2][0] = var3 + 122 - 12;
               this.y[var2][1] = var4;
               this.y[var2][2] = 12;
               this.y[var2][3] = t_1.j;
            }

            if (this.z != null) {
               this.z[var2][0] = var3 + 12;
               this.z[var2][1] = var4;
               this.z[var2][2] = 98;
               this.z[var2][3] = t_1.j;
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
      ca_1.l = 0;
      this.b.aq.b();
      this.b.aq.a("帮派宝库");
      this.b.aq.a(true);
      this.b.as.a(new String[]{"宝库一", "宝库二", "宝库三"});
      this.b.as.a((byte)1);
      this.b.aq.a(t_1.e <= 240 ? 79 : 120);
      if (this.a.j != 115 && this.a.j != 64) {
         this.a.aq = this.a.ar = 0;
      } else {
         this.a.aq = this.a.aF;
         this.a.ar = this.a.aG;
         this.b.as.a = this.a.aH;
      }

      int var1 = (this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq;
      if (bt_1.iN != null && var1 < bt_1.iN.length) {
         this.b.at.a(bt_1.ja[var1], t_1.i, (byte)1);
      } else {
         this.b.at.a("没有物品,按3、9键可以上下翻滚此属性描述框", t_1.i, (byte)1);
      }

      this.b.au.a("操作");
      this.b.au.a(true);
      this.b.at.a((byte)1);
      this.b.aq.a((al)this.b.as);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.b.j = this.b.k;
      this.a.j = this.a.k = 115;
   }

   public final void p() {
      int var1 = (this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq;
      if (bt_1.iN != null && var1 < bt_1.iN.length) {
         this.b.at.a(bt_1.ja[var1], t_1.i, (byte)1);
      } else {
         this.b.at.a("没有物品，按3、9键可以上下翻滚此属性描述框", t_1.i, (byte)1);
      }

      this.b.at.a((byte)1);
      ca_1.l = 0;
   }

   public final void p(int var1) {
      int var2 = (this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq;
      if (this.a.l == 0) {
         this.a.a(bt_1.iR);
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
         } else if (bt_1.iN != null && var2 < bt_1.iN.length) {
            String[] var10 = new String[]{"查看", "取出", "丢弃", "整理"};
            ca_1.a(this.a.au[(this.a.ar << 3) + this.a.aq][0] - 17, this.a.au[(this.a.ar << 3) + this.a.aq][1] + 17, var10, false);
            this.a.l = 1;
            return;
         }
      } else if (this.a.l == 1) {
         ca_1.b(var1);
         if (var1 != 268435456 && var1 != 517 && var1 != 1073741824) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else if (bt_1.iN != null && var2 < bt_1.iN.length && bt_1.iQ[var2] > 0) {
            switch (ca_1.o) {
               case 0:
                  if (!bt_1.a(bt_1.iP[var2])) {
                     this.b.aq.j();
                     this.b.aq.b();
                     this.b.aq.a("宝物详情");
                     if (bt_1.ja != null && var2 < bt_1.ja.length && bt_1.ja[var2] != null) {
                        this.b.at.a(bt_1.iO[var2] + "：\t" + bt_1.ja[var2], t_1.i, (byte)1);
                     }

                     this.b.aq.a((al)this.b.at);
                     this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
                     this.a.l = 2;
                  } else {
                     var1 = var2;
                     bt_1.ko = bt_1.iN[var2];
                     bt_1.kp = bt_1.iO[var2];
                     bt_1.kq = bt_1.iO[var2];
                     bt_1.ks = bt_1.iS[var2];
                     bt_1.kt = bt_1.iT[var2];
                     bt_1.ku = bt_1.iU[var2];
                     bt_1.kv = bt_1.iV[var2];
                     bt_1.kw = bt_1.iW[var2];
                     bt_1.kx = bt_1.iX[var2];
                     var2 = 0;
                     if (bt_1.jb[var2] != null) {
                        if ((var2 = (byte) bt_1.jb[var2].length) > 0) {
                           bt_1.kr = new short[var2];

                           for(byte var16 = 0; var16 < var2; ++var16) {
                              bt_1.kr[var16] = bt_1.jb[var1][var16];
                           }
                        }
                     } else {
                        bt_1.kr = null;
                     }

                     bt_1.ky = bt_1.iY[var1];
                     bt_1.kz = -1;
                     bt_1.kA = bt_1.ja[var1];
                     this.a.O.a(0, (short)this.a.k, -1);
                  }

                  this.a.aF = this.a.aq;
                  this.a.aG = this.a.ar;
                  this.a.aH = this.b.as.a;
                  break;
               case 1:
                  if (bt_1.iQ[var2] > 1) {
                     this.a.a((long) bt_1.iQ[var2]);
                     this.a.l = 3;
                  } else {
                     ca_1.h = 0;
                     String var8;
                     int var15 = ca_1.a(var8 = bt_1.iO[var2]) != -1 ? ca_1.a(var8) : 15138723;
                     this.a.at = "您确定取出" + (var15 != 15138723 ? var8.substring(3, var8.length()) : var8) + "X" + bt_1.iQ[var2] + "？";
                     this.a.l = 5;
                  }
                  break;
               case 2:
                  if (bt_1.iQ[var2] > 1) {
                     this.a.a((long) bt_1.iQ[var2]);
                     this.a.l = 6;
                  } else {
                     ca_1.h = 0;
                     String var7;
                     int var14 = ca_1.a(var7 = bt_1.iO[var2]) != -1 ? ca_1.a(var7) : 15138723;
                     this.a.at = "您确定丢弃" + (var14 != 15138723 ? var7.substring(3, var7.length()) : var7) + "X" + bt_1.iQ[var2] + "？";
                     this.a.l = 4;
                  }
                  break;
               case 3:
                  byte[] var6;
                  if ((var6 = bz_1.C((short)4366, bt_1.ad)) != null) {
                     MainCanvas.i.a(new w((short)4366, var6));
                     this.a.e.a((String)null);
                  } else {
                     this.a.e.b("获取上传指令数据错误!");
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
               if (bt_1.iQ[var2] > 1) {
                  this.c((byte)this.a.ag);
               } else {
                  this.c(bt_1.iQ[var2]);
               }

               this.a.l = 0;
               ca_1.h = 0;
               return;
            }

            if (var1 == 536870912) {
               ca_1.h = 0;
               this.a.l = 0;
               return;
            }
         } else if (this.a.l == 5) {
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
               if (bt_1.iQ[var2] > 1) {
                  this.d((byte)this.a.ag);
               } else {
                  this.d(bt_1.iQ[var2]);
               }

               ca_1.h = 0;
               this.a.l = 0;
               return;
            }

            if (var1 == 536870912) {
               ca_1.h = 0;
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
         } else if (bt_1.iN != null && var2 < bt_1.iN.length && bt_1.iQ[var2] > 0) {
            ca_1.h = 0;
            if (this.a.l == 3) {
               ca_1.h = 0;
               String var5;
               int var13 = ca_1.a(var5 = bt_1.iO[var2]) != -1 ? ca_1.a(var5) : 15138723;
               this.a.at = "您确定取出" + (var13 != 15138723 ? var5.substring(3, var5.length()) : var5) + "X" + this.a.ag + "？";
               this.a.l = 5;
               return;
            }

            ca_1.h = 0;
            String var4;
            int var3 = ca_1.a(var4 = bt_1.iO[var2]) != -1 ? ca_1.a(var4) : 15138723;
            this.a.at = "您确定丢弃" + (var3 != 15138723 ? var4.substring(3, var4.length()) : var4) + "X" + this.a.ag + "？";
            this.a.l = 4;
            return;
         }
      }

   }

   private void c(byte var1) {
      byte[] var2;
      if ((var2 = bz_1.b((short)4246, bt_1.iN[(this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq], (byte)var1, bt_1.ad)) != null) {
         MainCanvas.i.a(new w((short)4246, var2));
         this.a.e.a((String)null);
      } else {
         this.a.e.b("获取上传指令数据错误!");
      }
   }

   public final void b(Graphics var1) {
      if (this.b.aq != null) {
         int var2 = t_1.e <= 240 ? 79 : 120;
         this.b.aq.a(var1);
         ca_1.a(var1, this.b.aq.a + 5, this.b.aq.b + 29 + this.b.as.b, this.b.aq.c - 11, var2, 1);
         ca_1.a(var1);
         Graphics var3 = var1;
         aq var11 = this;
         int var4 = (this.b.aq.c - 11 - (ao_1.x.b << 3)) / 9;
         int var5 = ((t_1.e <= 240 ? 79 : 120) - 6 - (ao_1.x.b << 2)) / 5;
         int var6 = this.b.aq.a + 8 + var4;
         int var7 = this.b.aq.b + 33 + this.b.as.b + var5;

         for(int var8 = 0; var8 < 32; ++var8) {
            MainCanvas.f.a(var3, ao_1.x, (int[])null, (aj)null, 0, 0, var8 % 8 * (ao_1.x.b + var4) + var6, var8 / 8 * (ao_1.x.b + var5) + var7, 0, 0);
            var11.a.a((int)var8, var8 % 8 * (ao_1.x.b + var4) + var6, var8 / 8 * (ao_1.x.b + var5) + var7, (int) ao_1.x.b, (int) ao_1.x.c);
         }

         int var12 = 0;
         ca_1.d(var3, var6 + var11.a.aq * (ao_1.x.b + var4), var7 + var11.a.ar * (ao_1.x.b + var5), 17, 17);
         if (bt_1.iR != null) {
            for(int var9 = var11.b.as.a << 5; var9 < (bt_1.iR.length > var11.b.as.a + 1 << 5 ? var11.b.as.a + 1 << 5 : bt_1.iR.length); ++var9) {
               int var10 = var9 % 32;
               MainCanvas.f.a(var3, ao_1.b(bt_1.iR[var9]), (int[])null, (aj)null, 0, 0, var10 % 8 * (ao_1.x.b + var4) + var6 + 1, var10 / 8 * (ao_1.x.b + var5) + var7 + 1, 0, 0);
               if (bt_1.iQ[var9] > 9) {
                  MainCanvas.f.a(var3, MainCanvas.n, (int[])null, bt_1.iQ[var9] / 10, 0, 0, 10 + var10 % 8 * (ao_1.x.b + var4) + var6, var10 / 8 * (ao_1.x.b + var5) + var7 + 12, 0, 0);
                  MainCanvas.f.a(var3, MainCanvas.n, (int[])null, bt_1.iQ[var9] % 10, 0, 0, 14 + var10 % 8 * (ao_1.x.b + var4) + var6, var10 / 8 * (ao_1.x.b + var5) + var7 + 12, 0, 0);
               } else if (bt_1.iQ[var9] > 1) {
                  MainCanvas.f.a(var3, MainCanvas.n, (int[])null, bt_1.iQ[var9] % 10, 0, 0, 14 + var10 % 8 * (ao_1.x.b + var4) + var6, var10 / 8 * (ao_1.x.b + var5) + var7 + 12, 0, 0);
               }

               if (var9 == (var11.a.ar << 3) + var11.a.aq + 32 * var11.b.as.a) {
                  var12 = var9;
               }
            }

            if (var12 >= 0 && var12 < bt_1.iR.length && var12 == (var11.a.ar << 3) + var11.a.aq + 32 * var11.b.as.a) {
               ca_1.a(var3, bt_1.iO[var12] + "X" + bt_1.iQ[var12], bt_1.iZ[var12], var6 + var11.a.aq * (ao_1.x.b + var4) + ao_1.x.b / 2, var7 + var11.a.ar * (ao_1.x.b + var5) + ao_1.x.b / 2);
            } else if ((var11.b.as.a << 5) + (var11.a.ar << 3) + var11.a.aq >= bt_1.iJ) {
               ca_1.a(var3, "未开启", -1L, var6 + var11.a.aq * (ao_1.x.b + var4) + ao_1.x.b / 2, var7 + var11.a.ar * (ao_1.x.b + var5) + ao_1.x.b / 2);
            }
         }
      }

      if (this.a.l == 1) {
         ca_1.c(var1);
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
               ca_1.a(var1, this.a.at, new String[]{"确定", "取消"});
            }
         }

      }
   }

   private void d(byte var1) {
      byte[] var2;
      if ((var2 = bz_1.b((short)4245, bt_1.iN[(this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq], (byte)var1, bt_1.ad)) != null) {
         MainCanvas.i.a(new w((short)4245, var2));
         this.a.e.a((String)null);
      } else {
         this.a.e.b("获取上传指令数据错误!");
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
         ca_1.a(var1, (Image) MainCanvas.L.a, (short) MainCanvas.L.b, this.b.aq.a + 5, this.b.aq.b + this.b.aq.d - 53, this.b.aq.c - 10, MainCanvas.L.c);
         this.b.aq.a(var1);

         for(int var2 = 0; var2 < this.b.ar.f(); ++var2) {
            int var3 = this.b.ar.a() + this.b.ar.c() - MainCanvas.C.b - 130;
            int var4 = this.b.ar.b() + 4 + var2 * this.b.ar.e();
            ca_1.a(var1, var2 == 0 ? ao_1.a(this.b.l, this.j) : "" + this.k[var2], var3, var4, 124);
            var3 = 124;
            if (this.l != null && this.l.length > var2) {
               this.l[var2][0] = var3;
               this.l[var2][1] = var4;
               this.l[var2][2] = 12;
               this.l[var2][3] = t_1.j;
            }

            if (this.m != null && this.m.length > var2) {
               this.m[var2][0] = var3 + 124 - 12;
               this.m[var2][1] = var4;
               this.m[var2][2] = 12;
               this.m[var2][3] = t_1.j;
            }

            if (this.n != null && var2 == 0) {
               this.n[0] = var3 + 12;
               this.n[1] = var4;
               this.n[2] = 100;
               this.n[3] = t_1.j;
            }
         }

         long var7 = (this.j + (long)this.B * bt_1.jg + (long)this.C * bt_1.ji + (long)this.D * bt_1.jk + (long)this.E * bt_1.jm) / 300L;
         ca_1.a(var1, (String)("得到功勋：" + var7), (int)(this.b.aq.a + this.b.aq.c / 2), this.b.aq.b + this.b.aq.d - 51 + (MainCanvas.M.a.getHeight() - t_1.j) / 2, 17, 16776666, 0);
      }

   }

   public final void r() {
      byte[] var1;
      if ((var1 = bz_1.s((short)4236, bt_1.ad)) != null) {
         MainCanvas.i.a(new w((short)4236, var1));
         this.b.a((String)null);
      } else {
         this.b.b("获取上传指令数据错误!");
      }
   }

   public final void q(int var1) {
      byte[] var2;
      if ((var2 = bz_1.k((short)(var1 == 0 ? 4230 : 4232), bt_1.ad, (short) bt_1.gQ)) != null) {
         MainCanvas.i.a(new w((short)(var1 == 0 ? 4230 : 4232), var2));
         this.b.a((String)null);
      } else {
         this.b.b("获取上传指令数据错误!");
      }
   }

   public final void s() {
      this.b.aq.j();
      this.b.aq.a("区域建设");
      this.b.aq.a(true);
      this.b.as.a(new String[]{"购买", "仓库"});
      this.b.ar.a((Image[])null, bt_1.jp, (String[])null, (String[])null);
      this.b.at.b(bt_1.jq == null ? null : bt_1.jq[this.b.ar.g()], t_1.i, (byte)2);
      this.b.at.a((byte)1);
      this.b.au.a("购买");
      this.b.au.a(true);
      this.b.aq.a((al)this.b.as);
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.at);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.a.l = 0;
      this.b.j = this.b.k;
      this.a.j = this.a.k = 52;
   }

   public final void t() {
      this.b.ar.a((Image[])null, bt_1.js, (String[])null, (String[])null);
      this.b.at.b(bt_1.jt == null ? null : bt_1.jt[this.b.ar.g()], t_1.i, (byte)2);
      this.b.at.a((byte)1);
      this.b.au.a("选择");
      this.b.au.a(true);
      this.a.l = 0;
      this.b.j = this.b.k;
      this.a.j = this.a.k = 52;
   }

   public final void r(int var1) {
      if (this.a.l == 0) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 8 || var1 == 516 || var1 == 2 || var1 == 518) {
            bt_1.gQ = 1;
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
                  if (bt_1.jq == null) {
                     break label159;
                  }
               } else if (bt_1.jt == null) {
                  break label159;
               }

               this.b.at.b(this.b.as.a == 0 ? bt_1.jq[this.b.ar.g()] : bt_1.jt[this.b.ar.g()], t_1.i, (byte)2);
               this.b.at.a((byte)1);
            }
         }

         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               bt_1.I();
               bt_1.J();
               this.a.j = this.a.k = 0;
               return;
            }

            if (var1 == 1024) {
               if (bt_1.gQ > 1 && bt_1.gR == 1) {
                  if (bt_1.gQ - 1 <= 1) {
                     bt_1.gQ = 1;
                  } else {
                     --bt_1.gQ;
                  }

                  this.q(this.b.as.a);
                  return;
               }

               if (bt_1.gQ > 1 && bt_1.gR == 0) {
                  if (bt_1.gQ - 1 < 1) {
                     bt_1.gQ = 1;
                  } else {
                     --bt_1.gQ;
                  }

                  this.q(this.b.as.a);
                  return;
               }
            } else if (var1 == 2048) {
               if (bt_1.gQ <= 1 && bt_1.gR == 1) {
                  ++bt_1.gQ;
                  this.q(this.b.as.a);
                  return;
               }

               if (bt_1.gQ > 1 && bt_1.gR == 1) {
                  ++bt_1.gQ;
                  this.q(this.b.as.a);
                  return;
               }
            }
         } else {
            if (this.b.as.a == 0 && bt_1.jo != null) {
               ca_1.a(0 + t_1.f, 2 * t_1.j + 11 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"购买"}, true);
               this.a.l = 1;
               return;
            }

            if (this.b.as.a == 1 && bt_1.jr != null) {
               ca_1.a(0 + t_1.f, 2 * t_1.j + 11 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"布置", "卖出"}, true);
               this.a.l = 2;
               return;
            }
         }
      } else if (this.a.l == 1) {
         ca_1.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else {
            byte[] var2;
            if ((var2 = bz_1.l((short)4233, bt_1.ad, (byte) bt_1.jo[this.b.ar.g()])) == null) {
               this.b.b("获取上传指令数据错误!");
               return;
            }

            MainCanvas.i.a(new w((short)4233, var2));
            this.b.a((String)null);
         }
      } else if (this.a.l == 2) {
         ca_1.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
            }
         } else {
            if (ca_1.o == 0) {
               this.a.a((String) bt_1.js[this.b.ar.g()], bt_1.jr[this.b.ar.g()], (short) bt_1.ju[this.b.ar.g()], (byte)0, (byte)4);
               return;
            }

            if (ca_1.o == 1) {
               byte[] var3;
               if ((var3 = bz_1.y((short)4237, bt_1.ad, bt_1.jr[this.b.ar.g()])) == null) {
                  this.b.b("获取上传指令数据错误!");
                  return;
               }

               MainCanvas.i.a(new w((short)4237, var3));
               this.b.a((String)null);
            }
         }
      }

   }

   public final void a(String var1) {
      byte[] var2;
      if ((var2 = bz_1.d((short)4864, var1, bt_1.ad, (short) bt_1.gQ)) != null) {
         MainCanvas.i.a(new w((short)4864, var2));
         this.b.a((String)null);
      } else {
         this.b.b("获取上传指令数据错误!");
      }
   }

   public final void a(byte var1, String var2) {
      byte[] var3;
      if ((var3 = bz_1.a((short)4865, var2, (byte)var1, (String) bt_1.ad)) != null) {
         MainCanvas.i.a(new w((short)4865, var3));
         this.b.a((String)null);
      } else {
         this.b.b("获取上传指令数据错误!");
      }
   }

   public final void u() {
      this.b.aq.j();
      this.b.aq.a("帮派外交");
      this.b.aq.a(false);
      String[] var1 = null;
      int[] var2 = null;
      if (bt_1.jY != null && bt_1.jY.length > 0) {
         var1 = new String[bt_1.jY.length];
         var2 = new int[bt_1.jY.length];

         for(int var3 = 0; var3 < var1.length; ++var3) {
            var1[var3] = bt_1.d(bt_1.ka[var3]);
            if (bt_1.ka[var3] == 2) {
               var2[var3] = 12845056;
            } else if (bt_1.ka[var3] == 3) {
               var2[var3] = 16711680;
            } else {
               var2[var3] = 16776960;
            }
         }
      }

      this.b.ar.a((Image[])null, bt_1.jZ, (String[])null, var1);
      this.b.ar.a("搜索...");
      this.b.ar.a(var2);
      this.b.ar.a("帮派搜索", 1);
      this.b.au.a("确定");
      this.b.au.a(true);
      this.b.aq.a((al)this.b.ar);
      this.b.aq.a((al)this.b.au);
      this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      ca_1.l = 0;
      this.a.l = 0;
      this.b.j = this.b.k;
      this.a.j = this.a.k = 60;
   }

   private static String w(int var0) {
      if (var0 < 0) {
         return null;
      } else if (bt_1.jY != null && bt_1.jY.length != 0) {
         StringBuffer var1 = new StringBuffer();
         if (bt_1.kb != null) {
            var1.append("对方状态：" + (bt_1.kb[var0] == 0 ? "保护" : (bt_1.kb[var0] == 1 ? "和平" : "战争")));
            var1.append('\t');
         }

         if (bt_1.kc != null) {
            var1.append("对方态度：" + (bt_1.kc[var0] == 0 ? "中立" : "敌对"));
            var1.append('\t');
         }

         if (bt_1.kd != null) {
            var1.append("你的态度：" + (bt_1.kd[var0] == 0 ? "中立" : "敌对"));
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
               if (bt_1.gQ > 1 && bt_1.gR == 1) {
                  if (bt_1.gQ - 1 <= 1) {
                     bt_1.gQ = 1;
                  } else {
                     --bt_1.gQ;
                  }

                  this.a(this.o);
                  return;
               }

               if (bt_1.gQ > 1 && bt_1.gR == 0) {
                  if (bt_1.gQ - 1 < 1) {
                     bt_1.gQ = 1;
                  } else {
                     --bt_1.gQ;
                  }

                  this.a(this.o);
                  return;
               }
            } else if (var1 == 2048) {
               if (bt_1.gQ <= 1 && bt_1.gR == 1) {
                  ++bt_1.gQ;
                  this.a(this.o);
                  return;
               }

               if (bt_1.gQ > 1 && bt_1.gR == 1) {
                  ++bt_1.gQ;
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

            if (bt_1.jY != null) {
               ca_1.a(t_1.f, t_1.j + 11 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"查看", "外交", "宣战"}, true);
               this.a.l = 1;
               return;
            }
         }
      } else if (this.a.l == 1) {
         ca_1.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else {
            this.b.aw = ca_1.o;
            if (ca_1.o == 0) {
               this.b(bt_1.jY[this.b.ar.g() - 1]);
               return;
            }

            if (ca_1.o == 1) {
               ca_1.a(0, t_1.j + 11 + this.b.ar.i() * t_1.j + t_1.g, new String[]{"中立", "敌对"}, true);
               this.a.l = 2;
               return;
            }

            if (ca_1.o == 2) {
               ca_1.h = 0;
               this.a.l = 3;
               return;
            }
         }
      } else if (this.a.l == 2) {
         ca_1.b(var1);
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.a.l = 0;
               return;
            }
         } else {
            if (ca_1.o == 0) {
               this.a((byte)1, bt_1.jY[this.b.ar.g() - 1]);
               return;
            }

            if (ca_1.o == 1) {
               this.a((byte)2, bt_1.jY[this.b.ar.g() - 1]);
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
      if ((var3 = bz_1.b((short)4866, var1, var2, bt_1.ad)) != null) {
         MainCanvas.i.a(new w((short)4866, var3));
         this.b.a((String)null);
      } else {
         this.b.b("获取上传指令数据错误!");
      }
   }

   public final void v() {
      this.a.M();
      if (this.b.b != 8 && this.b.b != 516) {
         if (this.b.b != 2 && this.b.b != 518) {
            if (this.b.b != 1 && this.b.b != 514) {
               if (this.b.b == 4 || this.b.b == 520) {
                  ao_1.i = ao_1.i + 4 > this.a.f.b - t_1.c ? this.a.f.b - t_1.c : ao_1.i + 4;
               }
            } else {
               ao_1.i = ao_1.i - 4 < 0 ? 0 : ao_1.i - 4;
            }
         } else {
            ao_1.h = ao_1.h + 4 > this.a.f.a - t_1.b ? this.a.f.a - t_1.b : ao_1.h + 4;
         }
      } else {
         ao_1.h = ao_1.h - 4 < 0 ? 0 : ao_1.h - 4;
      }

      if (bt_1.bw != 2 || bt_1.kj == 0) {
         bt_1.kj = 0;
         ao_1.h = this.s;
         ao_1.i = this.t;
         this.a.l = 0;
         this.a.j = this.a.k = 0;
         this.b.b = 0;
         this.b.a = 0;
      }

   }

   private void b(String var1) {
      byte[] var2;
      if ((var2 = bz_1.o((short)4868, var1, bt_1.ad)) != null) {
         MainCanvas.i.a(new w((short)4868, var2));
      } else {
         this.b.b("获取上传指令数据错误!");
      }
   }

   private void C() {
      byte[] var1;
      if ((var1 = bz_1.l((short)4869, bt_1.ad, (short) bt_1.gQ)) != null) {
         MainCanvas.i.a(new w((short)4869, var1));
         this.b.a((String)null);
      } else {
         this.b.b("获取上传指令数据错误!");
      }
   }

   public final void w() {
      ca_1.h = 0;
      this.a.l = 0;
      this.b.j = this.b.k;
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
            if ((var2 = bz_1.v((short)4871, bt_1.ad)) == null) {
               this.b.b("获取上传指令数据错误!");
               return;
            }

            MainCanvas.i.a(new w((short)4871, var2));
            this.b.a((String)null);
         }
      }

   }

   public final void x() {
      if (bt_1.kE != null) {
         this.b.aq.j();
         this.b.aq.a("战争捷报");
         this.b.aq.a(false);
         this.b.ar.a((Image[])null, bt_1.kE, (String[])null, (String[])null);
         this.b.at.b(bt_1.kF[0], t_1.i, (byte)2);
         this.b.at.a((byte)1);
         this.b.au.a("确定");
         this.b.aq.a((al)this.b.ar);
         this.b.aq.a((al)this.b.at);
         this.b.aq.a((al)this.b.au);
         m_1 var10000 = this.b.aq;
         int var2 = 2 * t_1.j + 8;
         m_1 var1 = var10000;
         var10000.e = var2;
         int var3 = var1.e;
         this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
         this.a.l = 0;
         this.b.j = this.b.k;
         this.a.j = this.a.k = 63;
      }

   }

   public final void u(int var1) {
      if (this.a.l == 0 && bt_1.kE != null) {
         if (this.b.aq != null) {
            this.b.aq.b(var1);
         }

         if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
            this.b.at.b(bt_1.kF[this.b.ar.g()], t_1.i, (byte)2);
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
      if ((var3 = bz_1.c((short)4872, bt_1.ad, var1, var2)) != null) {
         MainCanvas.i.a(new w((short)4872, var3));
      } else {
         this.b.b("获取上传指令数据错误!");
      }
   }

   public final void y() {
      this.b.aq.b();
      this.b.aq.a("帮派升级");
      this.b.aq.a(false);
      this.b.at.b(bt_1.mw == null ? "暂无帮派升级信息" : bt_1.mw, t_1.i, (byte)0);
      this.b.aq.a((al)this.b.at);
      this.b.au.a("升级");
      this.b.aq.a((al)this.b.at);
      if (t_1.c > 220) {
         this.b.aq.a((al)this.b.au);
      }

      this.b.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.a.l = 0;
      this.b.j = this.b.k;
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

package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class cg_1 {
   private UISceneController e;
   private MainCanvas f;
   private PngUtil g;
   private Frame1 h;
   private Frame1 i;
   public static int a;
   private static String j;
   private static int k;
   private static int l;
   private static int m;
   private static int n;
   private static int o;
   private static String p;
   private static int q;
   private static int r;
   private static int s;
   private static int t;
   private static short u;
   private static short v;
   private static short w;
   private static short x;
   private static short y;
   private static short z;
   private static short A;
   private static short B;
   private static byte C;
   private static int[] D;
   private static int E;
   private static int F;
   public static int b = 0;
   public static int c = 0;
   public static boolean d = false;
   private int G;
   private an_1 H;
   private an_1 I;
   private int[][] J;
   private int K;
   private String L;
   private String M;

   public cg_1(UISceneController var1, MainCanvas var2, PngUtil var3) {
      this.e = var1;
      this.f = var2;
      this.g = var3;
   }

   public static void a(int var0) {
      a = GlobalStatus.fA[var0];
      j = GlobalStatus.fB[var0];
      l = GlobalStatus.fM[var0];
      m = GlobalStatus.fN[var0];
      n = GlobalStatus.fO[var0];
      o = GlobalStatus.fP[var0];
      u = GlobalStatus.fE[var0];
      v = GlobalStatus.fF[var0];
      w = GlobalStatus.fG[var0];
      x = GlobalStatus.fH[var0];
      k = -1;
      p = "";
      y = -1;
      q = -1;
      r = -1;
      s = -1;
      t = -1;
      E = 0;
      F = -1;
   }

   public final void a() {
      a = -1;
      j = null;
      u = -1;
      l = -1;
      m = -1;
      n = -1;
      o = -1;
      k = -1;
      p = "";
      y = -1;
      q = -1;
      r = -1;
      s = -1;
      t = -1;
      F = -1;
      E = 0;
      this.h = null;
      this.i = null;
   }

   public static void a(DataInputStream var0) throws IOException {
      if ((C = var0.readByte()) != 0) {
         if (C == 1) {
            k = GlobalStatus.fA[c];
            var0.readUTF();
            p = var0.readUTF();
            q = var0.readInt();
            r = var0.readInt();
            s = var0.readInt();
            t = var0.readInt();
            E = var0.readInt();

            for(int var4 = 0; var4 < GlobalStatus.fA.length; ++var4) {
               if (GlobalStatus.fA[var4] == k) {
                  y = GlobalStatus.fE[var4];
                  z = GlobalStatus.fF[var4];
                  A = GlobalStatus.fG[var4];
                  B = GlobalStatus.fH[var4];
               }
            }

            d = false;
         } else {
            if (C == 2) {
               F = var0.readInt();
            }

         }
      } else {
         short var1;
         D = new int[var1 = var0.readShort()];

         for(int var2 = 0; var2 < var1; ++var2) {
            D[var2] = var0.readInt();
         }

         int var3 = b;
         a = GlobalStatus.fA[var3];
         j = GlobalStatus.fB[var3];
         l = GlobalStatus.fM[var3];
         m = GlobalStatus.fN[var3];
         n = GlobalStatus.fO[var3];
         o = GlobalStatus.fP[var3];
         u = GlobalStatus.fE[var3];
         v = GlobalStatus.fF[var3];
         w = GlobalStatus.fG[var3];
         x = GlobalStatus.fH[var3];
      }
   }

   private static void c() {
      GlobalStatus.fw = null;
      if (GlobalStatus.fA != null && GlobalStatus.fA.length > 0) {
         int var0 = 0;
         if (k != -1) {
            ++var0;
         }

         GlobalStatus.fw = new int[D.length - var0];
         var0 = 0;

         for(int var1 = 0; var1 < D.length; ++var1) {
            for(int var2 = 0; var2 < GlobalStatus.fA.length; ++var2) {
               if (GlobalStatus.fA[var2] == D[var1] && GlobalStatus.fA[var2] != k) {
                  GlobalStatus.fw[var0] = var2;
                  ++var0;
               }
            }
         }

      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5) {
      if (this.J != null && this.J.length > var1) {
         this.J[var1][0] = var2;
         this.J[var1][1] = var3;
         this.J[var1][2] = 50;
         this.J[var1][3] = 50;
      }

   }

   public final int a(int var1, int var2) {
      if (this.e.sceneSubState == 1) {
         return LoadingPage.c(var1, var2);
      } else {
         int var3 = 0;
         if ((var3 = this.f.aq.b(var1, var2)) <= 0) {
            var3 = this.H.b(var1, var2);
         }

         if (var3 <= 0) {
            var3 = this.I.b(var1, var2);
         }

         if (var3 <= 0) {
            for(int var4 = 0; var4 < this.J.length; ++var4) {
               if (var1 >= this.J[var4][0] && var1 <= this.J[var4][0] + this.J[var4][2] && var2 >= this.J[var4][1] && var2 <= this.J[var4][1] + this.J[var4][3]) {
                  if (var4 == 0) {
                     this.K = 0;
                  } else {
                     this.K = 1;
                  }

                  var3 = 268435456;
               }
            }
         }

         return var3;
      }
   }

   public final void b() {
      this.K = 0;
      cg_1 var1 = this;
      if (this.J != null) {
         for(int var2 = 0; var2 < var1.J.length; ++var2) {
            if (var1.J[var2] != null) {
               var1.J[var2] = null;
            }
         }

         var1.J = null;
      }

      this.J = new int[2][4];
      this.H = new an_1();
      this.I = new an_1();
      this.L = "继承前\t" + j + "\t" + "星级: \t" + "攻击：" + l + "-" + m + "\t" + "法功：" + n + "-" + o;
      if (k != -1) {
         this.M = "继承后\t" + j + "\t" + "<0>星级: " + p + "\t" + "<2>攻击：" + q + "-" + r + "\t" + "法功：" + s + "-" + t;
      } else {
         this.M = "继承后";
      }

      this.f.aq.b();
      this.f.aq.a("星级继承");
      this.f.aq.a(true);
      this.H.a(this.L, GlobalConfig.i, (byte)2);
      this.I.a(this.M, GlobalConfig.i, (byte)2);
      if (a != -1 && u != -1) {
         UISceneController.a(u, v, w, x);
         this.h = MainCanvas.ah.a(String.valueOf(u + "_0"), v, w, x);
      } else if (this.h != null) {
         this.h.a();
         this.h = null;
      }

      if (k != -1 && y != -1) {
         UISceneController.a(y, z, A, B);
         this.i = MainCanvas.ah.a(String.valueOf(y + "_0"), z, A, B);
      } else if (this.i != null) {
         this.i.a();
         this.i = null;
      }

      if (GlobalConfig.defaultHigh > 220) {
         this.f.au.a("");
         this.f.aq.a((al)this.f.au);
      }

      this.G = (this.f.aq.d - 32 - GlobalConfig.j) / 3 - 10;
      this.f.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.H.a(this.f.aq.a + 5, this.f.aq.b + 32 + this.G, this.f.aq.c - 11, this.G + 10);
      this.I.a(this.f.aq.a + 5, this.f.aq.b + 32 + 2 * this.G + 10, this.f.aq.c - 11, this.G + 10);
      LoadingPage.l = 0;
      this.e.sceneSubState = 0;
      this.f.touchPageCase = this.f.k;
      this.e.sceneStateShadow = this.e.currentSceneModeId = 131;
   }

   public final void b(int var1) {
      if (F == 1) {
         F = 0;
         this.f.processException("宠物星级继承成功");
         var1 = 0;
         this.e.c((int)0, (int)this.e.aE, (int)this.e.aA);
         this.e.E();
         LoadingPage.o = 3;
         this.e.sceneSubState = 1;
      }

      if (this.e.sceneSubState == 0) {
         if (this.f.aq != null) {
            this.f.aq.b(var1);
            this.H.b(var1);
            this.I.b(var1);
         }

         if (a != -1 && this.h != null) {
            PngUtil.a(this.h, this.f.ak);
         }

         if (k != -1 && this.i != null) {
            PngUtil.a(this.i, this.f.ak);
         }

         if (var1 == 8 || var1 == 2) {
            this.K = this.K == 1 ? 0 : 1;
            LoadingPage.l = 0;
            return;
         }

         if (var1 != 268435456 && var1 != 1073741824) {
            if (var1 == 536870912) {
               this.e.c((int)0, (int)this.e.aE, (int)this.e.aA);
               this.e.E();
               LoadingPage.o = 3;
               this.e.sceneSubState = 1;
               return;
            }
         } else {
            if (this.K == 0) {
               if (a != -1) {
                  LoadingPage.a(GlobalConfig.defaultWidth / 2, GlobalConfig.defaultHigh / 2, new String[]{"继承", "更换"}, true);
                  this.e.sceneSubState = 1;
                  return;
               }

               this.e.j((int)0);
               return;
            }

            if (this.K == 1) {
               if (a != -1) {
                  if (k != -1) {
                     LoadingPage.a(GlobalConfig.defaultWidth / 2, GlobalConfig.defaultHigh / 2, new String[]{"更换"}, true);
                     this.e.sceneSubState = 1;
                     return;
                  }

                  c();
                  if (GlobalStatus.fw != null && GlobalStatus.fw.length > 0) {
                     d = true;
                     this.e.j((int)11);
                     return;
                  }

                  this.f.processException("您没有符合要求的副宠");
                  return;
               }

               this.f.processException("请先放入主宠");
               return;
            }
         }
      } else if (this.e.sceneSubState == 1) {
         LoadingPage.b(var1);
         if (var1 == 536870912) {
            this.e.sceneSubState = 0;
            return;
         }

         if (var1 == 268435456 || var1 == 1073741824) {
            if (this.K == 0) {
               if (LoadingPage.o == 0) {
                  if (a == -1 || k == -1) {
                     this.f.processException("请先放入副宠");
                     return;
                  }

                  byte[] var3;
                  if ((var3 = NetPayloadBuilder.b((byte)2, a, k, E)) == null) {
                     this.f.processException("获取上传指令数据错误!");
                     return;
                  }

                  NetPacket var4 = new NetPacket((short)4691, var3);
                  MainCanvas.netUtils.sendPacket(var4);
                  this.f.a((String)null);
               } else if (LoadingPage.o == 1) {
                  GlobalStatus.fw = null;
                  if (GlobalStatus.fA != null && GlobalStatus.fA.length > 0) {
                     var1 = 0;

                     for(int var2 = 0; var2 < GlobalStatus.fA.length; ++var2) {
                        if (GlobalStatus.gf[var2].equals("")) {
                           ++var1;
                        }
                     }

                     if (var1 - 1 > 0) {
                        GlobalStatus.fw = new int[var1 - 1];
                        int var7 = 0;

                        for(int var6 = 0; var6 < GlobalStatus.fA.length; ++var6) {
                           if (GlobalStatus.fA[var6] != a && GlobalStatus.gf[var6].equals("")) {
                              GlobalStatus.fw[var7] = var6;
                              ++var7;
                           }
                        }
                     }
                  }

                  if (GlobalStatus.fw != null && GlobalStatus.fw.length > 0) {
                     this.e.j((int)11);
                     return;
                  }

                  this.f.processException("您没有主宠可以选择");
                  return;
               }
            } else if (this.K == 1 && LoadingPage.o == 0) {
               c();
               if (GlobalStatus.fw == null || GlobalStatus.fw.length <= 0) {
                  this.f.processException("您没有符合要求的副宠");
                  return;
               }

               d = true;
               this.e.j((int)11);
            }
         }
      }

   }

   public final void a(Graphics var1) {
      if (this.f.aq != null) {
         this.f.aq.a(var1);
         this.H.a(var1);
         this.I.a(var1);
         LoadingPage.a(var1, this.f.aq.a + 5, this.f.aq.b + 32, this.f.aq.c - 11, this.G, 1);
      }

      LoadingPage.a(var1, this.f.aq.a + 5 + 25, this.f.aq.b + 32 + 10, 50, 50, 1);
      var1.setColor(2917024);
      var1.fillRect(this.f.aq.a + 5 + 25 + this.f.aq.c / 2, this.f.aq.b + 32 + 10, 50, 50);
      var1.setColor(9360850);
      var1.drawRect(this.f.aq.a + 5 + 25 + this.f.aq.c / 2, this.f.aq.b + 32 + 10, 49, 49);
      this.a(0, this.f.aq.a + 5 + 25, this.f.aq.b + 32 + 10, 50, 50);
      this.a(1, this.f.aq.a + 5 + 25 + this.f.aq.c / 2, this.f.aq.b + 32 + 10, 50, 50);
      LoadingPage.d(var1, this.J[this.K][0], this.J[this.K][1], 50, 50);
      if (a != -1 && this.h != null) {
         this.g.a(var1, (Frame1)this.h, (int[])null, 0, 0, this.f.aq.a + 5 + 25, this.f.aq.b + 32 + 10, 0, 0);
      }

      if (k != -1 && this.i != null) {
         this.g.a(var1, (Frame1)this.i, (int[])null, 0, 0, this.f.aq.a + 5 + 25 + this.f.aq.c / 2, this.f.aq.b + 32 + 10, 0, 0);
      } else {
         var1.setColor(16776960);
         var1.drawString("副宠", this.f.aq.a + 5 + 25 + this.f.aq.c / 2 + 25, this.f.aq.b + 32 + 10 + GlobalConfig.j / 4 + 25, 65);
      }

      if (this.e.sceneSubState == 1) {
         LoadingPage.c(var1);
      }

   }
}

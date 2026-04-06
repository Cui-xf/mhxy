package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class ch {
   private GameSceneController c;
   private MainCanvas d;
   private PngUtil e;
   private String f;
   private FWBRender g;
   private static int h;
   private static String i;
   private static short j;
   private static String k;
   private static double l;
   private static String m;
   private static int[] n;
   private static byte o;
   private static byte p;
   private static boolean[] q;
   private static String r;
   private static String s;
   private static byte t;
   private static String u;
   public int[][] a;
   public int b;
   private int v;
   private int w;
   private int x;
   private Frame0 y;
   private Frame0 z;
   private boolean A = false;

   public ch(GameSceneController var1, MainCanvas var2, PngUtil var3) {
      this.c = var1;
      this.d = var2;
      this.e = var3;
   }

   public static void a() {
      h = -1;
      j = -1;
      k = "";
      l = (double)0.0F;
      m = "";
      n = new int[3];
      q = new boolean[3];

      for(int var0 = 0; var0 < 3; ++var0) {
         n[var0] = 0;
         q[var0] = false;
      }

      p = -1;
      t = 0;
      i = "";
      s = "";
      r = "";
      GlobalStatus.N();
   }

   public final void a(DataInputStream var1) throws IOException {
      h = var1.readInt();
      j = var1.readShort();
      k = var1.readUTF();
      m = var1.readUTF();
//      l = var1.readDouble();
//      l = var1.readDouble();
      n[0] = var1.readInt();
      n[1] = var1.readInt();
      n[2] = var1.readInt();
      o = var1.readByte();
      t = var1.readByte();
      i = var1.readUTF();
      s = var1.readUTF();
      r = var1.readUTF();
      switch (o) {
         case 0:
            if (n[0] < 1) {
               q[0] = false;
               return;
            }

            q[0] = true;
            l += 0.2;
            return;
         case 1:
            if (n[1] < 1) {
               q[1] = false;
               return;
            }

            q[1] = true;
            l += (double)0.5F;
            return;
         case 2:
            if (n[2] < 1) {
               q[2] = false;
               return;
            } else {
               q[2] = true;
               ++l;
            }
         default:
      }
   }

   private void c() {
      if (this.a != null) {
         for(int var1 = 0; var1 < this.a.length; ++var1) {
            if (this.a[var1] != null) {
               this.a[var1] = null;
            }
         }

         this.a = null;
      }

   }

   private void d() {
      if (r != null && !r.equals("")) {
         this.d.textPanel.setFWBText(m + "\t" + i + "\t" + s + "\t" + r, GlobalConfig.font2, (byte)1);
      } else {
         this.d.textPanel.setFWBText((String)null, GlobalConfig.font2, (byte)1);
      }
   }

   public final void b() {
      this.f = null;
      if (k != null) {
         this.f = k;
      }

   }

   private void e() {
      this.g = null;
      if (u != null) {
         this.g = new FWBRender(u, (short) GlobalConfig.font2.stringWidth(u));
      }

   }

   public final void a(boolean var1) {
      if (var1) {
         this.b = 0;
         this.v = 0;
      }

      if (h != -1) {
         this.c.a(new short[]{j});
      }

      if (this.y == null) {
         this.y = MainCanvas.publicUI.getFrame("jianding_02");
         this.z = MainCanvas.publicUI.getFrame("jianding_01");
      }

      this.c();
      this.a = new int[7][4];
      this.d.mixedUi.clean();
      this.d.mixedUi.setTitle("装备升星");
      this.d.mixedUi.setDrawBackground(false);
      this.w = Math.max((GlobalConfig.font2_h << 1) + 25, 59);
      this.x = GlobalConfig.font2_h + 13;
      this.d.mixedUi.setR(this.w + this.x);
      this.d();
      this.b();
      this.d.mixedUi.addChild((BaseUi)this.d.textPanel);
      this.d.bottomUi.a("确定");
      if (GlobalConfig.defaultHigh > 220) {
         this.d.mixedUi.addChild((BaseUi)this.d.bottomUi);
      }

      this.d.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.d.textPanel.setTextRect(this.d.textPanel.textX, this.d.textPanel.textY, this.d.mixedUi.W / 2 - 6, this.d.textPanel.textH);
      int var1_t = 0;
      int var2 = 0;
      if (this.a != null) {
         for(int var3 = 0; var3 < this.a.length; ++var3) {
            if (var3 == 0) {
               var1_t = this.d.mixedUi.X + this.d.mixedUi.W / 4 - 8;
               var2 = this.d.mixedUi.Y + 32 + this.w - 30;
            } else if (var3 < 4) {
               var1_t = this.d.mixedUi.X + this.d.mixedUi.W / 2 + 13;
               var2 = this.d.mixedUi.Y + 32 + this.d.mixedUi.H / 4 + (var3 - 1) * 40 - 20;
            } else {
               var1_t = this.d.mixedUi.X + this.d.mixedUi.W * 3 / 4 - 18;
               var2 = this.d.mixedUi.Y + 32 + this.d.mixedUi.H / 4 + (var3 - 4) * 40 - 20;
            }

            var1_t = 17;
            var1_t = 17;
            if (this.a != null && this.a.length > var3) {
               this.a[var3][0] = var1_t;
               this.a[var3][1] = var2;
               this.a[var3][2] = 17;
               this.a[var3][3] = 17;
            }
         }
      }

      LoadingPage.l = 0;
      this.c.sceneSubState = 0;
      this.d.pageStatus = this.d.lastPageStatus;
      this.c.lastSceneModeId = this.c.currentSceneModeId = 102;
   }

   public final void a(int var1) {
      if (t == 1) {
         t = 0;
         this.d.showTips("升星成功");
      }

      if (this.c.sceneSubState == 0) {
         if (this.d.mixedUi != null) {
            this.d.mixedUi.onClick(var1);
         }

         if (var1 == 8) {
            --this.b;
            if (this.b < 0) {
               this.b = this.a.length - 4;
            }

            if (this.b == 0) {
               this.b();
            }

            LoadingPage.l = 0;
            return;
         }

         if (var1 == 2) {
            ++this.b;
            if (this.b >= this.a.length - 3) {
               this.b = 0;
               this.b();
            }

            LoadingPage.l = 0;
            return;
         }

         if (var1 != 268435456 && var1 != 1073741824) {
            if (var1 == 536870912) {
               this.c();
               this.f = null;
               this.g = null;
               if (this.c.aw) {
                  this.c.aw = false;
                  this.c.t();
                  return;
               }

               if (this.c.aJ) {
                  this.c.aJ = false;
                  this.c.c(false);
                  return;
               }

               this.c.l();
               this.c.c((int)1);
               return;
            }
         } else {
            if (this.b == 0) {
               if (h == -1) {
                  this.A = true;
                  this.c.a((byte)0, (byte[])(new byte[]{1}));
                  return;
               }

               LoadingPage.a(this.d.mixedUi.X + 24, this.d.mixedUi.Y + 49, new String[]{"升星", "查看", "取出"}, false);
               this.c.sceneSubState = 1;
               return;
            }

            if (this.b != 0) {
               var1 = this.b - 1;
               if (q[var1]) {
                  q[var1] = false;
                  l -= 0.2 + (double)var1 * 0.1 * (double)(var1 + 2);
               } else if (h == -1) {
                  this.d.showTips("请先放入装备");
               } else if (m.equals("不能升级")) {
                  this.d.showTips("该装备不能升星，请选择其它装备");
               } else {
                  if (n[var1] >= 1) {
                     for(int var2 = 0; var2 < 3; ++var2) {
                        if (var1 == var2) {
                           q[var1] = true;
                           l += 0.2 + (double)var1 * 0.1 * (double)(var1 + 2);
                        } else if (q[var2]) {
                           q[var2] = false;
                           l -= 0.2 + (double)var2 * 0.1 * (double)(var2 + 2);
                        }
                     }

                     return;
                  }

                  this.d.showTips("该材料已经消耗完，请选择其它材料");
               }
            }
         }
      } else if (this.c.sceneSubState == 1) {
         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824) {
            if (var1 == 536870912) {
               this.c.sceneSubState = 0;
            }
         } else if (LoadingPage.o == 0) {
            if (q[0]) {
               var1 = 0;
            } else if (q[1]) {
               var1 = 1;
            } else if (q[2]) {
               var1 = 2;
            } else {
               var1 = -1;
            }

            p = (byte)var1;
            if (h == -1) {
               this.d.showTips("请先放入装备");
            } else if (m.equals("不能升级")) {
               this.d.showTips("该装备不能升星，请选择其它装备");
            } else {
               Object var6 = null;
               byte[] var7;
               if ((var7 = NetPayloadBuilder.a((short)4689, h, (byte)1, p, GlobalStatus.roleId_2)) != null) {
                  NetPacket var12 = new NetPacket((short)4689, var7);
                  MainCanvas.netUtils.sendPacket(var12);
                  this.d.showPending((String)null);
               } else {
                  this.d.showTips("获取上传指令数据错误!");
               }
            }

            Object var8 = null;
            byte[] var9;
            if ((var9 = NetPayloadBuilder.a((short)4689, h, (byte)1, p, GlobalStatus.roleId_2)) == null) {
               this.d.showTips("获取上传指令数据错误!");
               return;
            }

            NetPacket var13 = new NetPacket((short)4689, var9);
            MainCanvas.netUtils.sendPacket(var13);
            this.d.showPending((String)null);
         } else {
            if (LoadingPage.o == 1) {
               if (this.c.aw && !this.A) {
                  GlobalStatus.a(this.c.av);
               } else if (this.c.aJ && !this.A) {
                  GlobalStatus.b((int) GameSceneController.l(this.c.aq));
               } else {
                  var1 = h;
                  Object var14 = null;
                  int var3 = 0;

                  bn var10000;
                  while(true) {
                     if (var3 >= GlobalStatus.bC.size()) {
                        var10000 = null;
                        break;
                     }

                     bn var15;
                     if ((var15 = (bn) GlobalStatus.bC.elementAt(var3)) != null && var15.a == var1) {
                        var10000 = var15;
                        break;
                     }

                     ++var3;
                  }

                  bn var11 = var10000;
                  if (var10000 != null) {
                     GlobalStatus.a(var11);
                  } else {
                     this.d.showTips("装备不存在");
                  }
               }

               this.c.currentSceneModeId = 102;
               this.c.O.a(0, (short)this.c.currentSceneModeId, -1);
               return;
            }

            if (LoadingPage.o == 2) {
               a();
               this.d();
               this.b();
               this.e();
               this.c.sceneSubState = 0;
               return;
            }
         }
      }

   }

   public final void a(Graphics var1) {
      if (this.d.mixedUi != null) {
         this.d.mixedUi.draw(var1);
         LoadingPage.draw(var1, this.d.mixedUi.X + 5, this.d.mixedUi.Y + 32, (this.d.mixedUi.W - 11) / 2, this.w, 1);
         LoadingPage.draw(var1, this.d.mixedUi.X + 5, this.d.mixedUi.Y + 32 + this.w + 1, (this.d.mixedUi.W - 11) / 2, this.x - 2, 1);
         LoadingPage.draw(var1, this.d.mixedUi.X + 5 + (this.d.mixedUi.W - 11) / 2, this.d.mixedUi.Y + 32, (this.d.mixedUi.W - 10) / 2, this.d.mixedUi.H - 62, 1);
      }

      if (this.a != null) {
         for(int var2 = 0; var2 < this.a.length; ++var2) {
            if (var2 == 0) {
               this.e.a(var1, GameSceneController.goods, (int[])null, (aj)null, 0, 0, this.a[var2][0], this.a[var2][1], 0, 0);
            } else if (var2 < 4) {
               this.e.a(var1, q[var2 - 1] ? this.y : this.z, (int[])null, (aj)null, 0, 0, this.a[var2][0], this.a[var2][1], 0, 0);
            } else {
               MainCanvas.icon.e(String.valueOf(1702));
               MainCanvas.pngUtil.a(var1, GameSceneController.b((short)1702), (int[])null, (aj)null, 0, 0, this.a[var2][0], this.a[var2][1], 0, 0);
               if (n[var2 - 4] > 99) {
                  MainCanvas.pngUtil.a(var1, MainCanvas.num, (int[])null, n[var2 - 4] / 100, 0, 0, this.a[var2][0] + 13 - 8, this.a[var2][1] + 11, 0, 0);
                  MainCanvas.pngUtil.a(var1, MainCanvas.num, (int[])null, n[var2 - 4] % 100 / 10, 0, 0, this.a[var2][0] + 13 - 4, this.a[var2][1] + 11, 0, 0);
                  MainCanvas.pngUtil.a(var1, MainCanvas.num, (int[])null, n[var2 - 4] % 100, 0, 0, this.a[var2][0] + 13, this.a[var2][1] + 11, 0, 0);
               }

               if (n[var2 - 4] > 9) {
                  MainCanvas.pngUtil.a(var1, MainCanvas.num, (int[])null, n[var2 - 4] / 10, 0, 0, this.a[var2][0] + 13 - 4, this.a[var2][1] + 11, 0, 0);
                  MainCanvas.pngUtil.a(var1, MainCanvas.num, (int[])null, n[var2 - 4] % 10, 0, 0, this.a[var2][0] + 13, this.a[var2][1] + 11, 0, 0);
               } else if (n[var2 - 4] >= 0) {
                  MainCanvas.pngUtil.a(var1, MainCanvas.num, (int[])null, n[var2 - 4] % 10, 0, 0, this.a[var2][0] + 13, this.a[var2][1] + 11, 0, 0);
               }
            }
         }
      }

      var1.setColor(255);
      var1.drawString("装备孔", this.a[0][0] + 8, this.a[0][1] - 2, 33);
      var1.drawString("幸运材料", this.a[4][0] + 13, this.a[4][1] - 12, 33);
      var1.drawString("+20%", this.a[4][0] + 42, this.a[4][1] + 18, 33);
      var1.drawString("+50%", this.a[5][0] + 42, this.a[5][1] + 18, 33);
      var1.drawString("+100%", this.a[6][0] + 42, this.a[6][1] + 18, 33);
      if (h != -1) {
         this.e.a(var1, GameSceneController.b(j), (int[])null, (aj)null, 0, 0, this.a[0][0], this.a[0][1], 0, 0);
      }

      LoadingPage.d(var1, this.a[this.b][0], this.a[this.b][1], 17, 17);
      if (h != -1) {
         double var4;
         if ((var4 = l + 0.001) > (double)1.0F) {
            var4 = (double)1.0F;
         }

         int var6 = (int)(var4 * (double)100.0F);
         StringBuffer var3;
         (var3 = new StringBuffer()).append("成功率：");
         var3.append(var6);
         var3.append("%");
         u = var3.toString();
         this.e();
         if (u != null) {
            this.g.a(var1, this.d.mixedUi.X + 5 + 6, this.d.mixedUi.Y + 32 + this.w + 6, 0);
         }
      }

      if (this.c.sceneSubState == 0) {
         if (this.b == 0 && (this.f != null || this.f != "")) {
            LoadingPage.b(var1, this.f, this.d.mixedUi.X + 5 + 2, this.d.mixedUi.Y + 32 + 8 + GameSceneController.goods.c, GlobalConfig.defaultHigh - 5, 1);
            return;
         }
      } else if (this.c.sceneSubState == 1) {
         LoadingPage.c(var1);
      }

   }
}

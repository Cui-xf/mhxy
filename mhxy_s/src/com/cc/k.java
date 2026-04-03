package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class k {
   private final String[] h = new String[]{"主材料", "主材料二", "辅助材料"};
   private UISceneController i;
   private MainCanvas j;
   public int a;
   public int b;
   public int c;
   private short k;
   private String l;
   public int d;
   private String m;
   private short n;
   private String o;
   public int[] e;
   private short[] p;
   private String[] q;
   public byte[] f;
   private String r;
   private String s;
   private TextRender t = null;
   private TextRender u = null;
   private String v;
   public int[][] g;
   private int w;
   private int x;

   public k(UISceneController var1, MainCanvas var2, PngUtil var3) {
      this.i = var1;
      this.j = var2;
   }

   public final void a(DataInputStream var1) throws IOException {
      boolean var2 = false;
      if (this.c > 0) {
         var2 = true;
      }

      this.c = var1.readInt();
      this.k = var1.readShort();
      this.l = var1.readUTF();
      this.d = var1.readInt();
      this.m = var1.readUTF();
      this.n = var1.readShort();
      this.o = var1.readUTF();
      byte var3;
      if ((var3 = var1.readByte()) > 0) {
         this.e = new int[var3];
         this.p = new short[var3];
         this.f = new byte[var3];
         this.q = new String[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.e[var4] = var1.readInt();
            this.p[var4] = var1.readShort();
            this.q[var4] = var1.readUTF();
            this.f[var4] = var1.readByte();
         }
      } else {
         this.e = null;
         this.p = null;
         this.f = null;
      }

      this.r = var1.readUTF();
      this.s = var1.readUTF();
      GlobalStatus.N();
      b(this.c);
      b(this.d);
      if (this.e != null && this.e.length > 0) {
         for(int var5 = 0; var5 < this.e.length; ++var5) {
            b(this.e[var5]);
         }
      }

      if (var2) {
         if (this.s != null && !this.s.equals("")) {
            this.j.at.a(this.s, GlobalConfig.i, (byte)1);
         } else {
            this.j.at.a((String)null, GlobalConfig.i, (byte)1);
         }
      }

      this.d();
      this.e();
      this.f();
   }

   private static void b(int var0) {
      if (GlobalStatus.bC != null && GlobalStatus.bC.size() > 0) {
         bn var1 = null;

         for(int var2 = 0; var2 < GlobalStatus.bC.size(); ++var2) {
            if ((var1 = (bn) GlobalStatus.bC.elementAt(var2)) != null && var1.a == var0) {
               ++var1.v;
            }
         }

      }
   }

   private void b() {
      if (this.g != null) {
         for(int var1 = 0; var1 < this.g.length; ++var1) {
            if (this.g[var1] != null) {
               this.g[var1] = null;
            }
         }

         this.g = null;
      }

   }

   private void c() {
      if (this.s != null && !this.s.equals("")) {
         this.j.at.a(this.s, GlobalConfig.i, (byte)1);
      } else {
         this.j.at.a((String)null, GlobalConfig.i, (byte)1);
      }
   }

   private String c(int var1) {
      if (this.e != null && this.e.length > 0) {
         for(int var2 = 0; var2 < this.f.length; ++var2) {
            if (this.f[var2] == var1) {
               return this.q[var2];
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private void d() {
      this.v = null;
      if (this.b == 0) {
         if (this.a == 0) {
            if (this.l != null) {
               this.v = this.l;
               return;
            }
         } else if (this.a == 1 && this.o != null) {
            this.v = this.m;
            return;
         }
      } else if (this.b == 1 && this.q != null && this.q.length > 0 && this.c(this.a) != null) {
         this.v = this.c(this.a);
      }

   }

   private void e() {
      this.t = null;
      if (this.o != null && !this.o.equals("")) {
         this.t = new TextRender("<0>银两：</0><5></5>" + this.o + (this.o.equals("0") ? "" : "万"), (short)(GlobalConfig.realWidth - 20));
      }

   }

   private void f() {
      this.u = null;
      if (this.r != null) {
         this.u = new TextRender(this.r, (short)(GlobalConfig.realWidth - 20));
      }

   }

   private int d(int var1) {
      if (this.e != null && this.e.length >= 0) {
         for(int var2 = 0; var2 < this.e.length; ++var2) {
            if (this.f[var2] == var1) {
               return this.e[var2];
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private static bn e(int var0) {
      bn var1 = null;

      for(int var2 = 0; var2 < GlobalStatus.bC.size(); ++var2) {
         if ((var1 = (bn) GlobalStatus.bC.elementAt(var2)) != null && var1.a == var0) {
            return var1;
         }
      }

      return null;
   }

   public final void a() {
      this.c = -1;
      this.k = -1;
      this.l = null;
      this.d = -1;
      this.n = -1;
      this.m = null;
      this.o = null;
      this.e = null;
      this.p = null;
      if (this.q != null) {
         for(int var1 = 0; var1 < this.q.length; ++var1) {
            this.q[var1] = null;
         }
      }

      this.q = null;
      this.f = null;
      this.r = null;
      this.s = null;
      GlobalStatus.N();
   }

   public final void a(boolean var1) {
      if (var1) {
         this.a = 0;
         this.b = 0;
      }

      if (this.c != -1) {
         this.i.a(new short[]{this.k});
      }

      if (this.d != -1) {
         this.i.a(new short[]{this.n});
      }

      if (this.p != null) {
         this.i.a(this.p);
      }

      this.b();
      this.g = new int[5][4];
      this.j.aq.b();
      this.j.aq.a("物品合成");
      this.j.aq.a(false);
      this.w = (Math.max(GlobalConfig.j, 17) << 1) + 10;
      this.x = GlobalConfig.j + 26 + 5;
      this.j.aq.a(this.w + this.x);
      this.c();
      this.j.aq.a((al)this.j.at);
      this.j.at.a((byte)1);
      this.j.au.a("确定");
      if (GlobalConfig.defaultHigh > 220) {
         this.j.aq.a((al)this.j.au);
      }

      this.j.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.d();
      this.e();
      this.f();
      LoadingPage.l = 0;
      this.i.sceneSubState = 0;
      this.j.touchPageCase = this.j.k;
      this.i.sceneStateShadow = this.i.currentSceneModeId = 118;
   }

   public final void a(int var1) {
      if (this.i.sceneSubState == 0) {
         if (this.j.aq != null) {
            this.j.aq.b(var1);
         }

         if (var1 != 4 && var1 != 1) {
            if (var1 == 2) {
               if (this.b == 0) {
                  this.a = this.a == 0 ? 1 : 0;
               } else if (this.b == 1) {
                  this.a = this.a == 2 ? 0 : this.a + 1;
               }

               LoadingPage.l = 0;
               this.d();
               this.e();
               this.f();
            } else if (var1 == 8) {
               if (this.b == 0) {
                  this.a = this.a == 0 ? 1 : 0;
               } else if (this.b == 1) {
                  this.a = this.a == 0 ? 2 : this.a - 1;
               }

               LoadingPage.l = 0;
               this.d();
               this.e();
               this.f();
            } else if (var1 == 268435456 || var1 == 1073741824) {
               if (this.b == 0) {
                  if (this.a == 0) {
                     if (this.c == -1) {
                        this.i.a((byte)0, (byte[])(new byte[]{7}));
                     } else {
                        LoadingPage.a(this.g[this.a][0] + UISceneController.x.b / 2, this.g[this.a][1] + UISceneController.x.b / 2, new String[]{"合成", "查看", "取消"}, false);
                        this.i.sceneSubState = 1;
                     }
                  } else if (this.a == 1) {
                     if (this.c == -1) {
                        this.j.processException("请先放入主材料一");
                     } else if (this.d == -1) {
                        this.i.a((byte)0, (byte[])(new byte[]{7}));
                     } else {
                        LoadingPage.a(this.g[this.a][0] + UISceneController.x.b / 2, this.g[this.a][1] + UISceneController.x.b / 2, new String[]{"取出"}, false);
                        System.out.println("GameSys.goods.width:" + UISceneController.x.b);
                        this.i.sceneSubState = 1;
                     }
                  }
               } else if (this.b == 1) {
                  if (this.d(this.a) != -1) {
                     LoadingPage.a(this.g[this.a + 2][0] + UISceneController.x.b / 2, this.g[this.a + 2][1] + UISceneController.x.b / 2, new String[]{"取出"}, false);
                     this.i.sceneSubState = 1;
                  } else if (this.c != -1 && this.d != -1) {
                     this.i.a((byte)0, (byte[])(new byte[]{8}));
                  } else {
                     this.j.processException("请先放满主材料");
                  }
               }
            }
         } else {
            this.b = this.b == 0 ? 1 : 0;
            this.a = this.b == 0 ? 1 : 0;
            LoadingPage.l = 0;
            this.d();
            this.e();
            this.f();
         }

         if (var1 == 536870912) {
            this.a();
            this.b();
            this.v = null;
            this.u = null;
            this.i.l();
            this.i.c((int)5);
         }
      } else if (this.i.sceneSubState == 1) {
         LoadingPage.b(var1);
         if (var1 != 268435456 && var1 != 1073741824) {
            if (var1 == 536870912) {
               LoadingPage.l = 0;
               this.d();
               this.e();
               this.f();
               this.i.sceneSubState = 0;
            }
         } else if (LoadingPage.o == 0) {
            if (this.b == 1) {
               byte[] var2;
               if ((var2 = NetPayloadBuilder.a((byte)5, this.c, this.d, this.e, this.f, this.d(this.a), (byte)this.a, GlobalStatus.ad)) != null) {
                  NetPacket var3 = new NetPacket((short)4266, var2);
                  MainCanvas.netUtils.sendPacket(var3);
                  this.j.a((String)null);
               } else {
                  this.j.processException("获取上传指令数据错误!");
               }
            } else {
               byte[] var4 = null;
               if (this.a == 0) {
                  var4 = NetPayloadBuilder.a((byte)0, this.c, this.d, this.e, this.f, -1, (byte)-1, GlobalStatus.ad);
               } else if (this.a == 1) {
                  var4 = NetPayloadBuilder.a((byte)3, this.c, this.d, this.e, this.f, -1, (byte)-1, GlobalStatus.ad);
               }

               if (var4 != null) {
                  NetPacket var5 = new NetPacket((short)4266, var4);
                  MainCanvas.netUtils.sendPacket(var5);
                  this.j.a((String)null);
               } else {
                  this.j.processException("获取上传指令数据错误!");
               }
            }
         } else if (LoadingPage.o == 1) {
            GlobalStatus.a(e(this.c));
            this.i.O.a(0, (short)this.i.currentSceneModeId, -1);
         } else if (LoadingPage.o == 2) {
            this.a();
            this.c();
            this.d();
            this.e();
            this.f();
            this.i.sceneSubState = 0;
         }
      }

      this.j.touchAction = 0;
   }

   public final void a(Graphics var1) {
      short var2 = UISceneController.x.b;
      if (this.j.aq != null) {
         this.j.aq.a(var1);
         LoadingPage.a(var1, this.j.aq.a + 5, this.j.aq.b + 32, this.j.aq.c - 11, this.w, 1);
         LoadingPage.a(var1, this.j.aq.a + 5, this.j.aq.b + 32 + this.w + 1, this.j.aq.c - 11, this.x - 2, 1);
      }

      int var3 = this.j.aq.a + GlobalConfig.i.stringWidth(this.h[0]) + 10;
      int var4 = this.j.aq.b + 40;
      if (this.g == null) {
         this.g = new int[5][4];
      }

      for(int var5 = 0; var5 < this.g.length; ++var5) {
         if (var5 > 1) {
            var3 = this.j.aq.a + this.j.aq.c - 3 * (var2 + 5) - 8;
         }

         int var10002 = var3 + 2 + (var5 < 2 ? (var5 == 0 ? 0 : var2 + 5) : (var5 - 2) * (var2 + 5));
         int var10003 = var4 + (var5 > 1 ? var2 : 0);
         boolean var6 = true;
         var6 = true;
         int var9 = var10003;
         int var8 = var10002;
         if (this.g != null && this.g.length > var5) {
            this.g[var5][0] = var8;
            this.g[var5][1] = var9;
            this.g[var5][2] = 17;
            this.g[var5][3] = 17;
         }

         var1.drawImage(UISceneController.x.pngImage, this.g[var5][0], this.g[var5][1], 20);
      }

      var1.setColor(255);
      var1.drawString(this.h[0], this.g[0][0] - 2, this.g[0][1] + (var2 - GlobalConfig.j) / 2, 24);
      var1.drawString(this.h[2], this.g[2][0] - 2, this.g[2][1] - var2 + (var2 - GlobalConfig.j) / 2, 20);
      Frame0 var13;
      if (this.c != -1 && (var13 = UISceneController.b(this.k)) != null) {
         var1.drawImage(var13.pngImage, this.g[0][0] + 1, this.g[0][1] + 1, 20);
      }

      if (this.d != -1 && (var13 = UISceneController.b(this.n)) != null) {
         var1.drawImage(var13.pngImage, this.g[1][0] + 1, this.g[1][1] + 1, 20);
      }

      if (this.p != null && this.p.length > 0) {
         var13 = null;

         for(int var12 = 0; var12 < this.p.length; ++var12) {
            if ((var13 = UISceneController.b(this.p[var12])) != null) {
               var1.drawImage(var13.pngImage, this.g[2 + this.f[var12]][0] + 1, this.g[2 + this.f[var12]][1] + 1, 20);
            }
         }
      }

      int var17 = this.a + (this.b << 1);
      LoadingPage.d(var1, this.g[var17][0], this.g[var17][1], 17, 17);
      if (this.t != null) {
         try {
            this.t.a(var1, this.j.aq.a + 5 + 6, this.j.aq.b + this.w + 8, 0);
         } catch (Exception var11) {
            ((Throwable)var11).printStackTrace();
         }
      }

      if (this.r != null) {
         try {
            this.u.a(var1, this.j.aq.a + 5 + 6, this.j.aq.b + 32 + this.w + 1 + 3, 0);
         } catch (Exception var10) {
            ((Throwable)var10).printStackTrace();
         }
      }

      if (this.i.sceneSubState == 0 && (this.v != null || this.v != "")) {
         if ((this.b != 0 || this.a != 1) && this.b == 1) {
            LoadingPage.b(var1, this.v, this.g[this.a + 2][0] + UISceneController.x.b / 2, this.g[this.a + 2][1] + UISceneController.x.b / 2, GlobalConfig.defaultHigh - 5, 1);
         } else {
            LoadingPage.b(var1, this.v, this.g[this.a][0] + UISceneController.x.b / 2, this.g[this.a][1] + UISceneController.x.b / 2, GlobalConfig.defaultHigh - 5, 1);
         }
      }

      if (this.i.sceneSubState == 1) {
         LoadingPage.c(var1);
      }

   }
}

package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class ch {
   private ao_1 c;
   private MainCanvas d;
   private ai_1 e;
   private String f;
   private bw_1 g;
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

   public ch(ao_1 var1, MainCanvas var2, ai_1 var3) {
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
      bt_1.N();
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
         this.d.at.a(m + "\t" + i + "\t" + s + "\t" + r, t_1.i, (byte)1);
      } else {
         this.d.at.a((String)null, t_1.i, (byte)1);
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
         this.g = new bw_1(u, (short)t_1.i.stringWidth(u));
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
      this.d.aq.b();
      this.d.aq.a("装备升星");
      this.d.aq.a(false);
      this.w = Math.max((t_1.j << 1) + 25, 59);
      this.x = t_1.j + 13;
      this.d.aq.a(this.w + this.x);
      this.d();
      this.b();
      this.d.aq.a((al)this.d.at);
      this.d.au.a("确定");
      if (t_1.c > 220) {
         this.d.aq.a((al)this.d.au);
      }

      this.d.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.d.at.a(this.d.at.b, this.d.at.c, this.d.aq.c / 2 - 6, this.d.at.e);
      int var1_t = 0;
      int var2 = 0;
      if (this.a != null) {
         for(int var3 = 0; var3 < this.a.length; ++var3) {
            if (var3 == 0) {
               var1_t = this.d.aq.a + this.d.aq.c / 4 - 8;
               var2 = this.d.aq.b + 32 + this.w - 30;
            } else if (var3 < 4) {
               var1_t = this.d.aq.a + this.d.aq.c / 2 + 13;
               var2 = this.d.aq.b + 32 + this.d.aq.d / 4 + (var3 - 1) * 40 - 20;
            } else {
               var1_t = this.d.aq.a + this.d.aq.c * 3 / 4 - 18;
               var2 = this.d.aq.b + 32 + this.d.aq.d / 4 + (var3 - 4) * 40 - 20;
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

      ca_1.l = 0;
      this.c.l = 0;
      this.d.j = this.d.k;
      this.c.j = this.c.k = 102;
   }

   public final void a(int var1) {
      if (t == 1) {
         t = 0;
         this.d.b("升星成功");
      }

      if (this.c.l == 0) {
         if (this.d.aq != null) {
            this.d.aq.b(var1);
         }

         if (var1 == 8) {
            --this.b;
            if (this.b < 0) {
               this.b = this.a.length - 4;
            }

            if (this.b == 0) {
               this.b();
            }

            ca_1.l = 0;
            return;
         }

         if (var1 == 2) {
            ++this.b;
            if (this.b >= this.a.length - 3) {
               this.b = 0;
               this.b();
            }

            ca_1.l = 0;
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

               ca_1.a(this.d.aq.a + 24, this.d.aq.b + 49, new String[]{"升星", "查看", "取出"}, false);
               this.c.l = 1;
               return;
            }

            if (this.b != 0) {
               var1 = this.b - 1;
               if (q[var1]) {
                  q[var1] = false;
                  l -= 0.2 + (double)var1 * 0.1 * (double)(var1 + 2);
               } else if (h == -1) {
                  this.d.b("请先放入装备");
               } else if (m.equals("不能升级")) {
                  this.d.b("该装备不能升星，请选择其它装备");
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

                  this.d.b("该材料已经消耗完，请选择其它材料");
               }
            }
         }
      } else if (this.c.l == 1) {
         ca_1.b(var1);
         if (var1 != 268435456 && var1 != 1073741824) {
            if (var1 == 536870912) {
               this.c.l = 0;
            }
         } else if (ca_1.o == 0) {
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
               this.d.b("请先放入装备");
            } else if (m.equals("不能升级")) {
               this.d.b("该装备不能升星，请选择其它装备");
            } else {
               Object var6 = null;
               byte[] var7;
               if ((var7 = bz_1.a((short)4689, h, (byte)1, p, bt_1.ad)) != null) {
                  w var12 = new w((short)4689, var7);
                  MainCanvas.i.a(var12);
                  this.d.a((String)null);
               } else {
                  this.d.b("获取上传指令数据错误!");
               }
            }

            Object var8 = null;
            byte[] var9;
            if ((var9 = bz_1.a((short)4689, h, (byte)1, p, bt_1.ad)) == null) {
               this.d.b("获取上传指令数据错误!");
               return;
            }

            w var13 = new w((short)4689, var9);
            MainCanvas.i.a(var13);
            this.d.a((String)null);
         } else {
            if (ca_1.o == 1) {
               if (this.c.aw && !this.A) {
                  bt_1.a(this.c.av);
               } else if (this.c.aJ && !this.A) {
                  bt_1.b((int) ao_1.l(this.c.aq));
               } else {
                  var1 = h;
                  Object var14 = null;
                  int var3 = 0;

                  bn var10000;
                  while(true) {
                     if (var3 >= bt_1.bC.size()) {
                        var10000 = null;
                        break;
                     }

                     bn var15;
                     if ((var15 = (bn) bt_1.bC.elementAt(var3)) != null && var15.a == var1) {
                        var10000 = var15;
                        break;
                     }

                     ++var3;
                  }

                  bn var11 = var10000;
                  if (var10000 != null) {
                     bt_1.a(var11);
                  } else {
                     this.d.b("装备不存在");
                  }
               }

               this.c.k = 102;
               this.c.O.a(0, (short)this.c.k, -1);
               return;
            }

            if (ca_1.o == 2) {
               a();
               this.d();
               this.b();
               this.e();
               this.c.l = 0;
               return;
            }
         }
      }

   }

   public final void a(Graphics var1) {
      if (this.d.aq != null) {
         this.d.aq.a(var1);
         ca_1.a(var1, this.d.aq.a + 5, this.d.aq.b + 32, (this.d.aq.c - 11) / 2, this.w, 1);
         ca_1.a(var1, this.d.aq.a + 5, this.d.aq.b + 32 + this.w + 1, (this.d.aq.c - 11) / 2, this.x - 2, 1);
         ca_1.a(var1, this.d.aq.a + 5 + (this.d.aq.c - 11) / 2, this.d.aq.b + 32, (this.d.aq.c - 10) / 2, this.d.aq.d - 62, 1);
      }

      if (this.a != null) {
         for(int var2 = 0; var2 < this.a.length; ++var2) {
            if (var2 == 0) {
               this.e.a(var1, ao_1.x, (int[])null, (aj)null, 0, 0, this.a[var2][0], this.a[var2][1], 0, 0);
            } else if (var2 < 4) {
               this.e.a(var1, q[var2 - 1] ? this.y : this.z, (int[])null, (aj)null, 0, 0, this.a[var2][0], this.a[var2][1], 0, 0);
            } else {
               MainCanvas.af.e(String.valueOf(1702));
               MainCanvas.f.a(var1, ao_1.b((short)1702), (int[])null, (aj)null, 0, 0, this.a[var2][0], this.a[var2][1], 0, 0);
               if (n[var2 - 4] > 99) {
                  MainCanvas.f.a(var1, MainCanvas.n, (int[])null, n[var2 - 4] / 100, 0, 0, this.a[var2][0] + 13 - 8, this.a[var2][1] + 11, 0, 0);
                  MainCanvas.f.a(var1, MainCanvas.n, (int[])null, n[var2 - 4] % 100 / 10, 0, 0, this.a[var2][0] + 13 - 4, this.a[var2][1] + 11, 0, 0);
                  MainCanvas.f.a(var1, MainCanvas.n, (int[])null, n[var2 - 4] % 100, 0, 0, this.a[var2][0] + 13, this.a[var2][1] + 11, 0, 0);
               }

               if (n[var2 - 4] > 9) {
                  MainCanvas.f.a(var1, MainCanvas.n, (int[])null, n[var2 - 4] / 10, 0, 0, this.a[var2][0] + 13 - 4, this.a[var2][1] + 11, 0, 0);
                  MainCanvas.f.a(var1, MainCanvas.n, (int[])null, n[var2 - 4] % 10, 0, 0, this.a[var2][0] + 13, this.a[var2][1] + 11, 0, 0);
               } else if (n[var2 - 4] >= 0) {
                  MainCanvas.f.a(var1, MainCanvas.n, (int[])null, n[var2 - 4] % 10, 0, 0, this.a[var2][0] + 13, this.a[var2][1] + 11, 0, 0);
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
         this.e.a(var1, ao_1.b(j), (int[])null, (aj)null, 0, 0, this.a[0][0], this.a[0][1], 0, 0);
      }

      ca_1.d(var1, this.a[this.b][0], this.a[this.b][1], 17, 17);
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
            this.g.a(var1, this.d.aq.a + 5 + 6, this.d.aq.b + 32 + this.w + 6, 0);
         }
      }

      if (this.c.l == 0) {
         if (this.b == 0 && (this.f != null || this.f != "")) {
            ca_1.b(var1, this.f, this.d.aq.a + 5 + 2, this.d.aq.b + 32 + 8 + ao_1.x.c, t_1.c - 5, 1);
            return;
         }
      } else if (this.c.l == 1) {
         ca_1.c(var1);
      }

   }
}

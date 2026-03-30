package com.cc;

import com.yinhan.kjava.main.a_MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class r {
   private final String[] h = new String[]{"装备孔", "附魔符", "幸运材料"};
   private ao_1 i;
   private a_MainCanvas j;
   public int a;
   public int b;
   public int c;
   private short k;
   private String l;
   public long d;
   private String m;
   private short n;
   private String o;
   public int[] e;
   private short[] p;
   private String[] q;
   public byte[] f;
   private String r;
   private String s;
   private bw_1 t = null;
   private String u;
   public int[][] g;
   private int v;
   private int w;
   private boolean x = false;

   public r(ao_1 var1, a_MainCanvas var2, ai_1 var3) {
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
      this.d = var1.readLong();
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
      bt_1.N();
      b(this.c);
      b((int)this.d);
      if (this.e != null && this.e.length > 0) {
         for(int var5 = 0; var5 < this.e.length; ++var5) {
            b(this.e[var5]);
         }
      }

      if (var2) {
         if (this.s != null && !this.s.equals("")) {
            this.j.at.a(this.s, t.i, (byte)1);
         } else {
            this.j.at.a((String)null, t.i, (byte)1);
         }
      }

      this.a();
      this.e();
   }

   private static void b(int var0) {
      if (bt_1.bC != null && bt_1.bC.size() > 0) {
         bn var1 = null;

         for(int var2 = 0; var2 < bt_1.bC.size(); ++var2) {
            if ((var1 = (bn) bt_1.bC.elementAt(var2)) != null && var1.a == var0) {
               ++var1.v;
            }
         }

      }
   }

   private void c() {
      if (this.g != null) {
         for(int var1 = 0; var1 < this.g.length; ++var1) {
            if (this.g[var1] != null) {
               this.g[var1] = null;
            }
         }

         this.g = null;
      }

   }

   private void d() {
      if (this.s != null && !this.s.equals("")) {
         this.j.at.a(this.s, t.i, (byte)1);
      } else {
         this.j.at.a((String)null, t.i, (byte)1);
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

   public final void a() {
      this.u = null;
      if (this.b == 0) {
         if (this.a == 0) {
            if (this.l != null) {
               this.u = this.l;
               return;
            }
         } else if (this.a == 1 && this.o != null) {
            this.u = this.m;
            return;
         }
      } else if (this.b == 1 && this.q != null && this.q.length > 0 && this.c(this.a) != null) {
         this.u = this.c(this.a);
      }

   }

   private void e() {
      this.t = null;
      StringBuffer var1 = new StringBuffer();
      if (this.r != null || this.o != null) {
         var1.append(this.o == null ? "" : this.o);
         var1.append("\t");
         var1.append(this.r == null ? "无幸运加成" : this.r);
         this.t = new bw_1(var1.toString(), (short)(t.d - 20));
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

   public final void b() {
      this.c = -1;
      this.k = -1;
      this.l = null;
      this.d = -1L;
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
      this.x = false;
      bt_1.N();
   }

   public final void a(boolean var1) {
      if (var1) {
         this.a = 0;
         this.b = 0;
      }

      if (this.c != -1) {
         this.i.a(new short[]{this.k});
      }

      if (this.d != -1L) {
         this.i.a(new short[]{this.n});
      }

      if (this.p != null) {
         this.i.a(this.p);
      }

      this.c();
      this.g = new int[5][4];
      this.j.aq.b();
      this.j.aq.a("装备附魔");
      this.j.aq.a(false);
      this.v = Math.max((t.j << 1) + 25, 59);
      this.w = t.j + 26 + 5;
      this.j.aq.a(this.v + this.w);
      this.d();
      this.j.aq.a((al)this.j.at);
      this.j.at.a((byte)1);
      this.j.au.a("确定");
      if (t.c > 220) {
         this.j.aq.a((al)this.j.au);
      }

      this.j.aq.a(t.f, t.g, t.d, t.e);
      this.a();
      this.e();
      ca.l = 0;
      this.i.l = 0;
      this.j.j = this.j.k;
      this.i.j = this.i.k = 110;
   }

   public final void a(int var1) {
      if (this.i.l == 0) {
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

               ca.l = 0;
               this.a();
               this.e();
            } else if (var1 == 8) {
               if (this.b == 0) {
                  this.a = this.a == 0 ? 1 : 0;
               } else if (this.b == 1) {
                  this.a = this.a == 0 ? 2 : this.a - 1;
               }

               ca.l = 0;
               this.a();
               this.e();
            } else if (var1 != 268435456 && var1 != 1073741824) {
               if (var1 == 536870912) {
                  this.b();
                  this.c();
                  this.u = null;
                  this.t = null;
                  if (this.i.aw) {
                     this.i.aw = false;
                     this.i.t();
                  } else if (this.i.aJ) {
                     this.i.aJ = false;
                     this.i.c(false);
                  } else {
                     this.i.l();
                     this.i.c((int)0);
                  }
               }
            } else if (this.b == 0) {
               if (this.a == 0) {
                  if (this.c == -1) {
                     this.x = true;
                     this.i.a((byte)0, (byte[])(new byte[]{0}));
                  } else {
                     ca.a(this.j.aq.a + t.k * 3 + 29, this.j.aq.b + 49, new String[]{"附魔", "查看", "取出"}, false);
                     this.i.l = 1;
                  }
               } else if (this.a == 1) {
                  if (this.c == -1) {
                     this.j.b("请先放入需要附魔的装备");
                  } else if (this.d == -1L) {
                     this.i.a((byte)0, (byte[])(new byte[]{3}));
                  } else {
                     ca.a(this.j.aq.c - 3 * ao_1.x.b - 21, this.j.aq.b + 49, new String[]{"取出"}, false);
                     this.i.l = 1;
                  }
               }
            } else if (this.b == 1) {
               if (this.d(this.a) != -1) {
                  ca.a(this.j.aq.c - 10 - ao_1.x.b - (this.a + 2 * (1 - this.a)) * (ao_1.x.b + 10) - ca.q / 2 + 9, this.j.aq.b + ao_1.x.c + 69, new String[]{"取出"}, false);
                  this.i.l = 1;
               } else if (this.c != -1 && this.d != -1L) {
                  this.i.a((byte)0, (byte[])(new byte[]{4}));
               } else {
                  this.j.b("请先放入附魔装备与附魔符");
               }
            }
         } else {
            this.b = this.b == 0 ? 1 : 0;
            this.a = this.b == 0 ? 1 : 0;
            ca.l = 0;
            this.a();
            this.e();
         }
      } else if (this.i.l == 1) {
         ca.b(var1);
         if (var1 != 268435456 && var1 != 1073741824) {
            if (var1 == 536870912) {
               ca.l = 0;
               this.a();
               this.e();
               this.i.l = 0;
            }
         } else if (ca.o == 0) {
            if (this.b == 1) {
               byte[] var4;
               if ((var4 = bz_1.a((short)4262, this.c, this.d, (byte)2, this.e, this.f, this.d(this.a), (byte)this.a, bt_1.ad)) != null) {
                  w var5 = new w((short)4262, var4);
                  a_MainCanvas.i.a(var5);
                  this.j.a((String)null);
               } else {
                  this.j.b("获取上传指令数据错误!");
               }
            } else {
               byte[] var6 = null;
               if (this.a == 0) {
                  var6 = bz_1.a((short)4262, this.c, this.d, (byte)3, this.e, this.f, -1, (byte)-1, bt_1.ad);
               } else if (this.a == 1) {
                  var6 = bz_1.a((short)4262, this.c, this.d, (byte)5, this.e, this.f, -1, (byte)-1, bt_1.ad);
               }

               if (var6 != null) {
                  w var7 = new w((short)4262, var6);
                  a_MainCanvas.i.a(var7);
                  this.j.a((String)null);
               } else {
                  this.j.b("获取上传指令数据错误!");
               }
            }
         } else if (ca.o == 1) {
            if (this.i.aw && !this.x) {
               bt_1.a(this.i.av);
            } else if (this.i.aJ && !this.x) {
               bt_1.b((int) ao_1.l(this.i.aq));
            } else {
               var1 = this.c;
               Object var2 = null;
               int var3 = 0;

               bn var10000;
               while(true) {
                  if (var3 >= bt_1.bC.size()) {
                     var10000 = null;
                     break;
                  }

                  bn var10;
                  if ((var10 = (bn) bt_1.bC.elementAt(var3)) != null && var10.a == var1) {
                     var10000 = var10;
                     break;
                  }

                  ++var3;
               }

               bn var9 = var10000;
               if (var10000 != null) {
                  bt_1.a(var9);
               } else {
                  this.j.b("装备不存在");
               }
            }

            this.i.O.a(0, (short)this.i.k, -1);
         } else if (ca.o == 2) {
            this.b();
            this.a();
            this.d();
            this.e();
            this.i.l = 0;
         }
      }

      this.j.a = 0;
   }

   public final void a(Graphics var1) {
      short var2 = ao_1.x.b;
      if (this.j.aq != null) {
         this.j.aq.a(var1);
         ca.a(var1, this.j.aq.a + 5, this.j.aq.b + 32, this.j.aq.c - 11, this.v, 1);
         ca.a(var1, this.j.aq.a + 5, this.j.aq.b + 32 + this.v + 1, this.j.aq.c - 11, this.w - 2, 1);
      }

      int var3 = this.j.aq.a + t.i.stringWidth("装备孔") + 10;
      int var4 = this.j.aq.b + 40;

      for(int var5 = 0; var5 < this.g.length; ++var5) {
         if (var5 > 0) {
            var3 = this.j.aq.a + this.j.aq.c - 3 * (var2 + 5) - 8;
         }

         int var10002 = var3 + 2 + (var5 < 2 ? 0 : (var5 - 2) * (var2 + 5));
         int var10003 = var4 + (var5 > 1 ? var2 + 8 : 0);
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

         var1.drawImage(ao_1.x.a, this.g[var5][0], this.g[var5][1], 20);
      }

      var1.setColor(255);
      var1.drawString(this.h[0], this.g[0][0] - 2, this.g[0][1] + (var2 - t.j) / 2, 24);
      var1.drawString(this.h[1], this.g[1][0] - 2, this.g[1][1] + (var2 - t.j) / 2, 24);
      var1.drawString(this.h[2], this.g[2][0] - 2, this.g[2][1] + (var2 - t.j) / 2, 24);
      bf_1 var11;
      if (this.c != -1 && (var11 = ao_1.b(this.k)) != null) {
         var1.drawImage(var11.a, this.g[0][0], this.g[0][1], 20);
      }

      if (this.d != -1L && (var11 = ao_1.b(this.n)) != null) {
         var1.drawImage(var11.a, this.g[1][0], this.g[1][1], 20);
      }

      if (this.p != null && this.p.length > 0) {
         var11 = null;

         for(int var10 = 0; var10 < this.p.length; ++var10) {
            if ((var11 = ao_1.b(this.p[var10])) != null) {
               var1.drawImage(var11.a, this.g[2 + this.f[var10]][0], this.g[2 + this.f[var10]][1], 20);
            }
         }
      }

      int var15 = this.a + (this.b << 1);
      ca.d(var1, this.g[var15][0], this.g[var15][1], 17, 17);
      if (this.r != null || this.o != null) {
         this.t.a(var1, this.j.aq.a + 5 + 6, this.j.aq.b + 32 + this.v + 1 + 3, 0);
      }

      if (this.i.l == 0) {
         if (this.u != null || this.u != "") {
            if (this.b == 0 && this.a == 1) {
               ca.b(var1, this.u, this.j.aq.c - 10 - ao_1.x.b - 2 * (ao_1.x.b + 10) - 6 - t.i.stringWidth("装备孔"), this.j.aq.b + 32 + 8 + ao_1.x.c, t.c - 5, 1);
               return;
            }

            if (this.b == 1) {
               ca.b(var1, this.u, this.j.aq.c - (ao_1.x.b + 10) * 3, this.j.aq.b + 32 + 8 + 10 + (ao_1.x.c << 1), t.c - 5, 1);
               return;
            }

            ca.b(var1, this.u, this.j.aq.a + 5 + 2, this.j.aq.b + 32 + 8 + ao_1.x.c, t.c - 5, 1);
            return;
         }
      } else if (this.i.l == 1) {
         ca.c(var1);
      }

   }
}

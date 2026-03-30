package com.cc;

import com.yinhan.kjava.main.a_MainCanvas;

import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ca_1 {
   public static int a = 16777215;
   public static int b = 0;
   private static int B = 6732228;
   public static int c = 4562087;
   private static int C = 0;
   public static int d = 0;
   public static int e = 0;
   public static int f = 0;
   public static int g = 0;
   private static int[] D = new int[4];
   private static int[][] E;
   private static int[][] F;
   private static int[][] G;
   public static int h = 0;
   private static String[] H = null;
   private static int I;
   private static int[][] J;
   public static int i = 26540;
   private static int K = 11267556;
   public static int[] j = new int[3];
   private static byte L = 0;
   public static int k = 0;
   private static int M;
   private static int N;
   private static int O;
   private static int P;
   public static int l = 0;
   private static String Q;
   private static short R;
   private static short S;
   private static int T;
   private static int U;
   private static bw_1 V;
   private static String[] W;
   private static int X = 0;
   private static int Y = 0;
   private static int Z = 0;
   private static int aa = 0;
   private static int ab = 0;
   private static String ac;
   private static String ad;
   private static bw_1 ae;
   public static int m = 1;
   public static int[] n = new int[]{16711680, 4194166, 15588145, 12066995, 12066995, 16776960, 2241484, 16777215, 15138723, 4521983, 16755438, 15095, 14221536, 31834, 13513984, 8750469, 65280, 0, 16514810, 65532, 65316, 16490750, 16197367};
   private static int[] af = new int[2];
   public static int o = 0;
   public static String[] p = new String[0];
   public static int q;
   private static int ag;
   private static int[] ah;
   private static int[][] ai = null;
   private static int[][] aj = new int[4][4];
   private static int[][] ak = new int[2][4];
   private static int[] al = new int[4];
   public static int r;
   public static int s;
   public static int t;
   public static int u;
   private static boolean am = false;
   public static int v;
   public static int w;
   public static int x;
   public static int y;
   public static int z;
   private static int[] an;
   public static int A = 0;
   private static String[] ao = new String[]{"系统菜单内可进行动态NPC和小地图等设置", "按“3”键可打开角色物品栏", "按“1”键可查看周围玩家", "按“0”键可打开宠物栏", "按“7”键可打开地图", "按“9”键可打开社交栏", "按“*”键可打开聊天栏", "按“#”键可打开任务栏"};
   private static bw_1 ap;
   private static Random aq = new Random();

   public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (t.q != 2) {
         ax.a(var0, var1, var2, var3, var4, var5, var6);
      }

   }

   public static void a(Graphics var0, String var1, int var2, int var3, int var4, int var5) {
      var0.setColor(var5);
      var0.drawString(var1, var2, var3, var4);
   }

   public static void a(az_1 var0, bw_1 var1, String[] var2, String[] var3, boolean var4) {
      C = 0;
      d = 0;
      e = 0;
      g = 0;
      f = 0;
      int var11 = 0;
      if (var2 != null) {
         var11 = var2.length;
         F = new int[var2.length][4];
      } else {
         F = null;
      }

      G = null;
      short var9 = 0;
      if (var0 != null) {
         var9 = var0.d();
      }

      if (var1 != null && var1.a() != 0) {
         int var6 = (t.c - 26 - var9 - var11 * t.j) / t.j;
         if (!var4) {
            C = var1.a() / var6 + (var1.a() % var6 != 0 ? 1 : 0);
            d = var6;
         } else {
            var6 = var1.a();
            int[] var10 = new int[2];
            if (var6 <= var6) {
               var10[0] = 1;
               var10[1] = var6;
            } else {
               var4 = 0;

               for(int var5 = var6; var5 > 0; --var5) {
                  if (var6 % var5 == 0) {
                     ++var4;
                  }
               }

               if (var4 == 2) {
                  ++var6;
               }

               for(int var13 = var6; var13 > 0; --var13) {
                  if (var6 % var13 == 0) {
                     var10[0] = var6 / var13;
                     var10[1] = var13;
                     break;
                  }
               }
            }

            C = var10[0];
            d = var10[1];
         }

         if (C > 1) {
            E = new int[2][4];
         } else {
            E = null;
         }
      }

      f = (d + var11) * t.j + 26;
   }

   public static int a(int var0, int var1) {
      if (E != null) {
         if (var0 >= E[0][0] && var0 <= E[0][0] + E[0][2] && var1 >= E[0][1] && var1 <= E[0][1] + E[0][3]) {
            return 8;
         }

         if (var0 >= E[1][0] && var0 <= E[1][0] + E[1][2] && var1 >= E[1][1] && var1 <= E[1][1] + E[1][3]) {
            return 2;
         }
      }

      if (F != null) {
         for(int var2 = 0; var2 < F.length; ++var2) {
            if (var0 >= F[var2][0] && var0 <= F[var2][0] + F[var2][2] && var1 >= F[var2][1] && var1 <= F[var2][1] + F[var2][3]) {
               g = var2;
               return 1073741824;
            }
         }
      }

      if (G != null) {
         if (G.length >= 1 && var0 >= G[0][0] && var0 <= G[0][0] + G[0][2] && var1 >= G[0][1] && var1 <= G[0][1] + G[0][3]) {
            return 268435456;
         }

         if (G.length == 2 && var0 >= G[1][0] && var0 <= G[1][0] + G[1][2] && var1 >= G[1][1] && var1 <= G[1][1] + G[1][3]) {
            return 536870912;
         }
      } else if (D != null && (var0 < D[0] || var0 > D[0] + D[2] || var1 < D[1] || var1 > D[1] + D[3])) {
         return 536870912;
      }

      return 0;
   }

   public static void a(Graphics var0, int var1, int var2, int var3, int var4, bw_1 var5, String[] var6, String[] var7) {
      a((Graphics)var0, 0, var2, var3, var4);
      a((int[])D, 0, var2, var3, var4);
      if (var5 != null) {
         var1 = e + d >= var5.a() ? var5.a() : e + d;

         for(int var10 = e; var10 < var1; ++var10) {
            var5.a(var0, 10, var2 + 12 + (var10 - e) * t.j, var10, 20);
         }

         if (a_MainCanvas.A != null) {
            if (e != 0) {
               ai.a(a_MainCanvas.A, System.currentTimeMillis());
               a_MainCanvas.f.a(var0, (bc_1) a_MainCanvas.A, (int[])null, 0, 0, 16, var2 + 5, 20, 0);
               a((int[])(E != null ? E[0] : null), 16, var2 + 5, 16, 9);
            } else {
               a((int[])(E != null ? E[0] : null), 0, 0, 0, 0);
            }
         }

         if (a_MainCanvas.B != null) {
            if (e + d < var5.a()) {
               ai.a(a_MainCanvas.B, System.currentTimeMillis());
               a_MainCanvas.f.a(var0, (bc_1) a_MainCanvas.B, (int[])null, 0, 0, var3 - 32, var2 + 5, 20, 0);
               a((int[])(E != null ? E[1] : null), var3 - 32, var2 + 5, 16, 9);
            } else {
               a((int[])(E != null ? E[1] : null), 0, 0, 0, 0);
            }
         }
      }

      if (var6 != null && F != null) {
         for(int var9 = 0; var9 < var6.length; ++var9) {
            a((int[])(F != null ? F[var9] : null), 10, var2 + var4 - 9 - (var6.length - var9) * t.j, t.i.stringWidth(var6[var9]), t.j);
            a(var0, (String)var6[var9], (int)F[var9][0], F[var9][1], 20, g == var9 ? 16711680 : 16777215, 0);
         }
      }

   }

   public static void a(Graphics var0, String var1, String[] var2) {
      if (var1 != null) {
         l = 0;
         var0.setClip(0, 0, t.b, t.c);
         if (h >= 0) {
            if (h == 0) {
               I = ((H = a(var1, t.i, t.b - 10, "\t")).length + 1) * t.j + 20;
               a(var0, t.b / 2 * 3, (t.c - I / 4) / 2, t.b / 4, I / 4);
               J = new int[var2.length][4];
            } else if (h == 1) {
               a(var0, t.b / 4, (t.c - I / 2) / 2, t.b / 2, I / 2);
            } else if (h == 2) {
               a(var0, t.b / 8, (t.c - I / 4 * 3) / 2, t.b / 4 * 3, I / 4 * 3);
            } else {
               a((Graphics)var0, 0, (t.c - I) / 2, t.b, I);
               if (H != null) {
                  if (H.length == 1) {
                     a(var0, (String)H[0], (int)((t.b - t.i.stringWidth(H[0])) / 2), (t.c - I) / 2 + 10, 20, 16777215, 0);
                  } else {
                     for(int var3 = 0; var3 < H.length; ++var3) {
                        a(var0, (String)H[var3], (int)((t.b - t.i.stringWidth(H[var3])) / 2), (t.c - I) / 2 + 10 + var3 * t.j, 20, 16777215, 0);
                     }
                  }
               }

               if (J == null) {
                  h = 0;
                  return;
               }

               if (var2.length == 2) {
                  a((String)var2[0], 0, 10, (t.c - I) / 2 + I - 9 - t.j);
                  a(var0, (String)var2[0], (int)J[0][0], J[0][1], 20, 16775357, 0);
                  a((String)var2[1], 1, t.b - 10 - t.i.stringWidth(var2[1]), (t.c - I) / 2 + I - 9 - t.j);
                  a(var0, (String)var2[1], (int)J[1][0], J[1][1], 20, 16775357, 0);
               } else {
                  a((String)var2[0], 0, (t.b - t.i.stringWidth(var2[0])) / 2, (t.c - I) / 2 + I - 9 - t.j);
                  a(var0, (String)var2[0], (int)J[0][0], J[0][0], 20, 16775357, 0);
               }
            }
         }

         ++h;
      }
   }

   private static void a(String var0, int var1, int var2, int var3) {
      if (var0 != null && J != null && J.length > var1) {
         J[var1][0] = var2;
         J[var1][1] = var3;
         J[var1][2] = t.i.stringWidth(var0);
         J[var1][3] = t.j;
      }

   }

   public static int b(int var0, int var1) {
      if (J != null) {
         if (J.length >= 1 && var0 >= J[0][0] && var0 <= J[0][0] + J[0][2] && var1 >= J[0][1] && var1 <= J[0][1] + J[0][3]) {
            return 268435456;
         }

         if (J.length == 2 && var0 >= J[1][0] && var0 <= J[1][0] + J[1][2] && var1 >= J[1][1] && var1 <= J[1][1] + J[1][3]) {
            return 536870912;
         }
      }

      return 0;
   }

   public static void a(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.setClip(0, 0, t.b, t.c);
      a(var0, 1009050, 180, var1, var2, var3, var4);
      a(var0, 2);
      var0.drawRect(var1, var2, var3 - 1, var4 - 1);
      var0.drawRect(var1 + 4, var2 + 4, var3 - 9, var4 - 9);
      a(var0, 3);
      var0.drawRect(var1 + 1, var2 + 1, var3 - 3, var4 - 3);
      var0.drawRect(var1 + 3, var2 + 3, var3 - 7, var4 - 7);
      a(var0, 4);
      var0.drawRect(var1 + 2, var2 + 2, var3 - 5, var4 - 5);
      if (a_MainCanvas.y != null) {
         var0.drawImage(a_MainCanvas.y.a, var1, var2, 20);
      }

      if (a_MainCanvas.z != null) {
         var0.drawImage(a_MainCanvas.z.a, var1, var2 + var4 - a_MainCanvas.z.c, 20);
      }

      if (a_MainCanvas.w != null) {
         var0.drawImage(a_MainCanvas.w.a, var1 + var3 - a_MainCanvas.w.b, var2, 20);
      }

      if (a_MainCanvas.x != null) {
         var0.drawImage(a_MainCanvas.x.a, var1 + var3 - a_MainCanvas.x.b, var2 + var4 - a_MainCanvas.x.c, 20);
      }

   }

   public static void a(Graphics var0, Image var1, short var2, int var3, int var4, int var5, int var6) {
      var0.setClip(var3, var4, var5, var6);
      var5 = var5 / var2 + (var5 % var2 != 0 ? 1 : 0);

      for(int var8 = 0; var8 < var5; ++var8) {
         var0.drawImage(var1, var3 + var8 * var2, var4, 20);
      }

      var0.setClip(0, 0, t.b, t.c);
   }

   public static void b(Graphics var0, int var1, int var2, int var3, int var4) {
      a(var0, 2);
      var0.fillRect(var1, var2, 5, var4 - var2);
      a(var0, 3);
      var0.fillRect(var1 + 1, var2, 3, var4 - var2);
      a(var0, 4);
      var0.drawLine(var1 + 2, var2, var3 + 2, var4 - 1);
   }

   public static void c(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.setColor(i);
      var0.fillRect(var1, var2, 3, var4 - var2);
      var0.setColor(K);
      var0.drawLine(var1 + 1, var2, var3 + 1, var4);
   }

   public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      if (var5 == 1) {
         var0.setColor(B);
         var0.fillRect(var1, var2, var3, var4);
      } else if (var5 == 2) {
         var0.setColor(c);
         var0.fillRect(var1, var2, var3, var4);
      } else if (var5 == 3) {
         var0.setColor(6793943);
         var0.fillRect(var1, var2, var3, var4);
      } else if (var5 == 4) {
         a(var0, 8634850, 210, var1, var2, var3, var4);
      }

      var0.setColor(i);
      var0.drawRect(var1, var2, var3, var4);
      var0.drawRect(var1 + 2, var2 + 2, var3 - 4, var4 - 4);
      var0.setColor(K);
      var0.drawRect(var1 + 1, var2 + 1, var3 - 2, var4 - 2);
   }

   public static void a(Graphics var0, Image var1, int var2, int var3, int var4, int var5, boolean var6) {
      var0.setColor(409969);
      var0.fillRect(var2, var3, var4, var5);
      if (var6) {
         var0.setColor(6597852);
      } else {
         var0.setColor(5018307);
      }

      var0.fillRect(var2 + 3, var3 + 3, var4 - 6, var5 - 6);
      if (var6) {
         var0.setColor(16775125);
      } else {
         var0.setColor(3775208);
      }

      var0.drawRect(var2 + 1, var3 + 1, var4 - 3, var5 - 3);
   }

   public static void a(Graphics var0) {
      var0.setColor(K);
      var0.fillRect(j[0] - 2, j[1], j[2] + 4, 2);
      var0.setColor(i);
      var0.fillRect(j[0] - 1, j[1], j[2] + 2, 3);
      var0.setColor(B);
      var0.fillRect(j[0], j[1], j[2], 3);
   }

   public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      var0.setColor(20871);
      var0.fillRect(var1 + 4, var2, 4, var3);
      var0.setColor(1152942);
      var0.fillRect(var1 + 5, var2, 2, var3);
      var0.drawImage(a_MainCanvas.C.a, var1, var2, 20);
      var0.drawImage(a_MainCanvas.D.a, var1, var2 + var3 - a_MainCanvas.D.c, 20);
      int var8 = 0;
      if (var6 == var7) {
         var4 = 0;
      }

      if (var4 > 0) {
         var8 = var2 + a_MainCanvas.C.c + (var3 - a_MainCanvas.C.c - a_MainCanvas.D.c - var4) * var5 / (var6 - var7);
      } else if (var4 <= 0) {
         var8 = var2 + a_MainCanvas.C.c;
         var4 = var3 - a_MainCanvas.C.c - a_MainCanvas.D.c;
      }

      var0.setColor(11267556);
      var0.fillRect(var1, var8, a_MainCanvas.C.b - 1, var4 - 1);
      var0.setColor(5555146);
      var0.fillRect(var1 + 2, var8 + 2, 8, var4 - 4);
      var0.setColor(1801628);
      var0.fillRect(var1 + 3, var8 + 3, 6, var4 - 6);
      var0.setColor(1464956);
      var0.fillRect(var1 + 6, var8 + 4, 2, var4 - 8);
      var0.setColor(150092);
      var0.drawRect(var1, var8, a_MainCanvas.C.b - 1, var4 - 1);
   }

   public static void b(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      var0.setColor(var1);
      var1 = Math.abs(var4);
      var4 /= var1;

      for(int var8 = 0; var8 < var1; ++var8) {
         var0.drawLine(var2 + var8 * var4, var3 - var8, var2 + var8 * var4, var3 + var8);
      }

   }

   public static String[] a(String var0, Font var1, int var2, String var3) {
      // $FF: Couldn't com.cc.be decompiled
   }

   private static String[] a(String[] var0) {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2] != null && !var0[var2].equals("")) {
            var1.addElement(var0[var2]);
         }
      }

      String[] var3 = new String[var1.size()];
      var1.copyInto(var3);
      return var3;
   }

   private static String[] a(String var0, String var1) {
      int var2 = 0;
      String[] var3 = new String[0];

      do {
         if ((var2 = var0.indexOf(var1)) < 0) {
            var3 = a(var3, var0);
            break;
         }

         var3 = a(var3, var0.substring(0, var2));
         var0 = var0.substring(var2 + var1.length());
      } while(var2 >= 0);

      return var3;
   }

   private static String b(String var0, Font var1, int var2) {
      int var3;
      return (var3 = var1.stringWidth(var0)) <= var2 ? var0 : b(var0.substring(0, var0.length() * var2 / var3), var1, var2);
   }

   private static String[] a(String[] var0, String var1) {
      if (var1 == null) {
         return var0;
      } else if (var0 == null) {
         return new String[]{var1};
      } else {
         String[] var10000 = var0;
         boolean var3 = true;
         String[] var4 = var10000;
         String[] var2 = new String[var10000.length + 1];
         System.arraycopy(var4, 0, var2, 0, var4.length);
         var2[var2.length - 1] = var1;
         return var2;
      }
   }

   public static void a(Graphics var0, int var1) {
      int[] var2 = new int[1];
      switch (var1) {
         case -1:
            var2[0] = 16777215;
            break;
         case 0:
            var2[0] = 0;
            break;
         case 1:
            var2[0] = 6014420;
            break;
         case 2:
            var2[0] = 20871;
            break;
         case 3:
            var2[0] = 1152942;
            break;
         case 4:
            var2[0] = 9820642;
            break;
         case 5:
            var2[0] = 12170677;
            break;
         case 6:
            var2[0] = 12170677;
            break;
         case 7:
            var2[0] = 12170677;
            break;
         case 8:
            var2[0] = 852044;
            break;
         case 9:
            var2[0] = 873078;
            break;
         case 10:
            var2[0] = 7479845;
            break;
         case 11:
            var2[0] = 29803;
      }

      var0.setColor(var2[0]);
   }

   public static void a(Graphics var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      var0.setColor(var6);
      var0.drawString(var1, var2 - 1, var3 - 1, var4);
      var0.drawString(var1, var2, var3 - 1, var4);
      var0.drawString(var1, var2 - 1, var3, var4);
      var0.drawString(var1, var2 + 1, var3, var4);
      var0.drawString(var1, var2, var3 + 1, var4);
      var0.drawString(var1, var2 + 1, var3 + 1, var4);
      var0.setColor(var5);
      var0.drawString(var1, var2, var3, var4);
   }

   public static void a(Graphics var0, int var1, int var2, int var3) {
      var0.setColor(i);
      var0.fillRect(var1, var2, var3 - 1, 3);
      var0.setColor(K);
      var0.drawLine(var1, var2 + 1, var1 + var3 - 1, var2 + 1);
   }

   public static void a(int var0, int var1, int var2, int var3, String var4) {
      M = var0;
      N = var1;
      O = var2;
      Q = var4 == null ? "载入中…" : var4;
      P = M + (O - t.i.stringWidth(Q)) / 2;
   }

   public static void b(Graphics var0) {
      var0.setClip(0, 0, t.b, t.c);
      a(var0, 1808583, 95, M, N - (4 + t.j), O, 8 + t.j + 18);
      var0.setColor(26540);
      var0.drawRect(M, N - (4 + t.j), O, 8 + t.j + 18);
      var0.drawRect(M + 2, N - (2 + t.j), O - 4, 8 + t.j + 14);
      var0.setColor(11267556);
      var0.drawRect(M + 1, N - (3 + t.j), O - 2, 8 + t.j + 16);
      a(var0, (String)Q, (int)P, N, 36, 16777215, 727632);
      var0.setColor(539727);
      var0.fillRect(M + 2, N, O - 4, 18);
      var0.setColor(4448748);
      var0.drawRect(M + 3, N + 1, O - 6, 15);
      var0.setColor(1265510);
      var0.fillRect(M + 4, N + 3, O - 8, 12);
      var0.setClip(M + 4, N + 3, O - 8, 12);
      int var10001 = M + 3 + l % (O + 15) - 20;
      int var3 = N + 3;
      int var2 = var10001;
      var0.setColor(4432868);
      var0.fillRect(var2 + 1, var3 + 1, 23, 10);
      var0.setColor(10738430);
      var0.fillRect(var2 + 2, var3 + 3, 21, 5);
      var0.setColor(15333119);
      var0.drawLine(var2 + 2, var3 + 5, var2 + 22, var3 + 5);
      var0.setColor(26540);
      var0.drawRect(var2, var3, 24, 11);
      var0.drawLine(var2 + 12, var3, var2 + 12, var3 + 12);
      var0.setClip(0, 0, t.b, t.c);
      l += 2;
   }

   public static String[] a(String var0, Font var1, int var2) {
      Vector var3 = new Vector();
      var0 = var0;

      String var4;
      do {
         var4 = c(var0, var1, var2);
         var3.addElement(var4);
      } while((var0 = var0.substring(var4.length())).length() != 0);

      var4 = new String[var3.size()];
      var3.copyInto(var4);
      return a((String[])var4);
   }

   private static String c(String var0, Font var1, int var2) {
      S = 0;
      R = 0;
      int var3;
      if ((var3 = var1.stringWidth(var0)) <= var2) {
         return var0;
      } else {
         String var7 = var0.substring(0, var0.length() * var2 / var3);

         for(int var5 = 0; var5 < var7.length(); ++var5) {
            char var4;
            if ((var4 = var7.charAt(var5)) == '<') {
               ++R;
            } else if (var4 == '>') {
               ++S;
            }
         }

         if (R != S) {
            T = var0.lastIndexOf(60);
            if ((U = var0.lastIndexOf(62)) - T >= 1) {
               try {
                  if (Integer.parseInt(var0.substring(T + 1, U)) <= 41) {
                     var7 = var0.substring(0, var0.lastIndexOf(60));
                  }
               } catch (Exception var6) {
               }
            } else {
               var7 = var0.substring(0, T);
            }
         }

         return c(var7, var1, var2);
      }
   }

   public static void b(Graphics var0, String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null && var5 != 0 && var1.trim().length() != 0) {
         if (l >= 15) {
            int var7 = t.d - 20;
            String[] var6 = var1;
            int var8 = 0;
            String var9 = "";

            do {
               if ((var8 = ((String)var6).indexOf(62)) < 0) {
                  var9 = var9 + var6;
                  break;
               }

               if (var8 - 2 >= 0 && ((String)var6).charAt(var8 - 2) == '<') {
                  var9 = var9 + ((String)var6).substring(0, var8 - 2);
                  var6 = ((String)var6).substring(var8 + 1);
               } else {
                  var9 = var9 + ((String)var6).substring(0, var8 + 1);
                  var6 = ((String)var6).substring(var8 + 1);
               }
            } while(var8 >= 0);

            var6 = a(var9.trim(), t.i, var7, "\t");
            var8 = 0;

            for(int var14 = 0; var14 < var6.length; ++var14) {
               var8 = Math.max(var8, t.i.stringWidth(var6[var14]) + 8);
            }

            X = Math.min(var8, var7);
            if (var5 == 1) {
               V = new bw_1(var1, (short)(X - 8));
               Y = t.j * V.a() + 8;
            } else if (var5 == 2) {
               W = a(var1.trim(), t.i, X - 8, "\t");
               Y = t.j * W.length + 8;
            }

            Z = var2 + X <= t.f + t.d ? var2 : (var2 - X >= t.f ? var2 - X : t.f + (t.d - X) / 2);
            aa = var3 + Y <= var4 ? var3 : (var3 - Y >= t.g ? var3 - Y : t.g + (t.e - Y) / 2);
            if (l == 15) {
               a(var0, 1009050, 210, Z, aa, X / 4, Y / 4);
            } else if (l == 16) {
               a(var0, 1009050, 210, Z, aa, X / 2, Y / 2);
            } else if (l == 17) {
               a(var0, 1009050, 210, Z, aa, X / 4 * 3, Y / 4 * 3);
            } else {
               a(var0, 1009050, 210, Z, aa, X, Y);
               var0.setColor(16230);
               var0.drawRect(Z, aa, X, Y);
               if (var5 == 1) {
                  V.a(var0, Z + 4, aa + 4, 20);
               } else if (var5 == 2) {
                  var0.setColor(15138723);

                  for(int var10 = 0; var10 < W.length; ++var10) {
                     if (W[var10] != null) {
                        var0.drawString(W[var10], Z + 4, aa + 4 + var10 * t.j, 0);
                     }
                  }
               }
            }
         }

         ++l;
      }
   }

   public static void a(Graphics var0, String var1, long var2, int var4, int var5) {
      a(var0, var1, var2, var4, var5, 20);
   }

   public static void a(Graphics var0, String var1, long var2, int var4, int var5, int var6) {
      if (l >= 15) {
         if (l == 15) {
            label148: {
               ad = var2 >= 0L ? "价格:" + t.a(new StringBuffer(), var2) : null;
               String var10000;
               if (var1 != null) {
                  if ((ab = a(var1) != -1 ? a(var1) : 15138723) != 15138723) {
                     if (var1.charAt(2) == '>') {
                        ac = var1.substring(3, var1.length());
                     } else {
                        ac = var1.substring(4, var1.length());
                     }
                     break label148;
                  }

                  var10000 = var1;
               } else {
                  ab = 15138723;
                  int var10001 = 15138723;
                  var10000 = "";
               }

               ac = var10000;
            }

            X = Math.max(t.i.stringWidth(ac), ad == null ? 0 : t.i.stringWidth(ad)) + 8;
            Y = t.j * (ad == null ? 1 : 2) + 8;
            Z = var4;
            aa = var5;
            if (var6 == 40) {
               if (Z - X < 0) {
                  a(var0, 1009050, 210, Z, var5 - Y / 4, X / 4, Y / 4);
               } else {
                  a(var0, 1009050, 210, Z - X / 4, var5 - Y / 4, X / 4, Y / 4);
               }
            } else if (var6 == 36) {
               if (Z + X > t.f + t.d) {
                  a(var0, 1009050, 210, Z - X / 4, var5 - Y / 4, X / 4, Y / 4);
               } else {
                  a(var0, 1009050, 210, Z, var5 - Y / 4, X / 4, Y / 4);
               }
            } else if (var6 == 24) {
               if (Z - X < 0) {
                  a(var0, 1009050, 210, Z, var5, X / 4, Y / 4);
               } else {
                  a(var0, 1009050, 210, Z - X / 4, var5, X / 4, Y / 4);
               }
            } else if (var4 + X <= t.f + t.d) {
               a(var0, 1009050, 210, Z, var5, X / 4, Y / 4);
            } else {
               a(var0, 1009050, 210, Z - X / 4, var5, X / 4, Y / 4);
            }
         } else if (l == 16) {
            if (var6 == 40) {
               if (Z - X < 0) {
                  a(var0, 1009050, 210, Z, var5 - Y / 4, X / 4, Y / 4);
               } else {
                  a(var0, 1009050, 210, Z - X / 2, var5 - Y / 2, X / 2, Y / 2);
               }
            } else if (var6 == 36) {
               if (Z + X > t.f + t.d) {
                  a(var0, 1009050, 210, Z - X / 2, var5 - Y / 2, X / 2, Y / 2);
               } else {
                  a(var0, 1009050, 210, Z, var5 - Y / 2, X / 2, Y / 2);
               }
            } else if (var6 == 24) {
               if (Z - X < 0) {
                  a(var0, 1009050, 210, Z, var5, X / 2, Y / 2);
               } else {
                  a(var0, 1009050, 210, Z - X / 2, var5, X / 2, Y / 2);
               }
            } else if (var4 + X <= t.f + t.d) {
               a(var0, 1009050, 210, Z, var5, X / 2, Y / 2);
            } else {
               a(var0, 1009050, 210, Z - X / 2, var5, X / 2, Y / 4);
            }
         } else if (l == 17) {
            if (var6 == 40) {
               if (Z - X < 0) {
                  a(var0, 1009050, 210, Z, var5 - Y / 2, X / 2, Y / 2);
               } else {
                  a(var0, 1009050, 210, Z - X / 4 * 3, var5 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
               }
            } else if (var6 == 36) {
               if (Z + X > t.f + t.d) {
                  a(var0, 1009050, 210, Z - X / 4 * 3, var5 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
               } else {
                  a(var0, 1009050, 210, Z, var5 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
               }
            } else if (var6 == 24) {
               if (Z - X < 0) {
                  a(var0, 1009050, 210, Z, var5, X / 4 * 3, Y / 4 * 3);
               } else {
                  a(var0, 1009050, 210, Z - X / 4 * 3, var5, X / 4 * 3, Y / 4 * 3);
               }
            } else if (var4 + X <= t.f + t.d) {
               a(var0, 1009050, 210, Z, var5, X / 4 * 3, Y / 4 * 3);
            } else {
               a(var0, 1009050, 210, Z - X / 4 * 3, var5, X / 4 * 3, Y / 4 * 3);
            }
         } else {
            var0.setColor(16230);
            if (var6 == 40) {
               if (Z - X < 0) {
                  a(var0, 1009050, 210, Z, var5 - Y, X, Y);
                  var0.drawRect(Z, var5 - Y, X, Y);
                  var0.setColor(ab);
                  var0.drawString(ac, Z + 4, var5 - Y + 4, 20);
                  if (ad != null) {
                     var0.drawString(ad, Z + 4, var5 - Y + 4 + t.j, 20);
                  }
               } else {
                  a(var0, 1009050, 210, Z - X, var5 - Y, X, Y);
                  var0.drawRect(Z - X, var5 - Y, X, Y);
                  var0.setColor(ab);
                  var0.drawString(ac, Z - X + 4, var5 - Y + 4, 20);
                  if (ad != null) {
                     var0.drawString(ad, Z - X + 4, var5 - Y + 4 + t.j, 20);
                  }
               }
            } else if (var6 == 36) {
               if (Z + X > t.f + t.d) {
                  a(var0, 1009050, 210, Z - X, var5 - Y, X, Y);
                  var0.drawRect(Z - X, var5 - Y, X, Y);
                  var0.setColor(ab);
                  var0.drawString(ac, Z - X + 4, var5 - Y + 4, 20);
                  if (ad != null) {
                     var0.drawString(ad, Z - X + 4, var5 - Y + 4 + t.j, 20);
                  }
               } else {
                  a(var0, 1009050, 210, Z, var5 - Y, X, Y);
                  var0.drawRect(Z, var5 - Y, X, Y);
                  var0.setColor(ab);
                  var0.drawString(ac, Z + 4, var5 - Y + 4, 20);
                  if (ad != null) {
                     var0.drawString(ad, Z + 4, var5 - Y + 4 + t.j, 20);
                  }
               }
            } else if (var6 == 24) {
               if (Z - X < 0) {
                  a(var0, 1009050, 210, Z, var5, X, Y);
                  var0.drawRect(Z, var5, X, Y);
                  var0.setColor(ab);
                  var0.drawString(ac, Z + 4, var5 + 4, 20);
                  if (ad != null) {
                     var0.drawString(ad, Z + 4, var5 + 4 + t.j, 20);
                  }
               } else {
                  a(var0, 1009050, 210, Z - X, var5, X, Y);
                  var0.drawRect(Z - X, var5, X, Y);
                  var0.setColor(ab);
                  var0.drawString(ac, Z - X + 4, var5 + 4, 20);
                  if (ad != null) {
                     var0.drawString(ad, Z - X + 4, var5 + 4 + t.j, 20);
                  }
               }
            } else {
               int var8 = Z;
               int var7 = aa;
               if (var4 + X > t.f + t.d && (var8 -= X) < 0) {
                  var8 = 0;
               }

               a(var0, 1009050, 210, var8, var7, X, Y);
               var0.drawRect(var8, var7, X, Y);
               var0.setColor(ab);
               var0.drawString(ac, var8 + 4, var7 + 4, 20);
               if (ad != null) {
                  var0.drawString(ad, var8 + 4, var7 + 4 + t.j, 20);
               }
            }
         }
      }

      ++l;
   }

   public static void a(Graphics var0, String var1, String var2, int var3, int var4, int var5) {
      if (l >= 15) {
         if (l == 15) {
            X = t.b - 30;
            if (var2.equals("")) {
               ae = null;
            } else {
               ae = new bw_1(var2, (short)(X - 8));
            }

            if (var1 != null) {
               ac = (ab = a(var1) != -1 ? a(var1) : 15138723) != 15138723 ? var1.substring(3, var1.length()) : var1;
            } else {
               ab = 15138723;
               int var10001 = 15138723;
               ac = "";
            }

            int var6 = t.i.stringWidth(ac) + 8;
            X = ae == null ? var6 : (ae.a <= 0 ? X : Math.max(var6, ae.a + 8));
            Y = t.j * (ae == null ? 1 : ae.a() + 1) + 8;
            if (var3 + X > t.b) {
               var3 = t.b - X;
            } else if (var3 < 0) {
               var3 = 0;
            }

            if (var4 + Y > t.c) {
               var4 = t.c - Y;
            } else if (var4 < 0) {
               var4 = 0;
            }

            Z = var3;
            if (var5 == 40) {
               if (Z - X < 0) {
                  if (var4 < Y) {
                     a(var0, 1009050, 210, Z, var4, X / 4, Y / 4);
                  } else {
                     a(var0, 1009050, 210, Z, var4 - Y / 4, X / 4, Y / 4);
                  }
               } else if (var4 < Y) {
                  a(var0, 1009050, 210, Z, var4, X / 4, Y / 4);
               } else {
                  a(var0, 1009050, 210, Z - X / 4, var4 - Y / 4, X / 4, Y / 4);
               }
            } else {
               label279: {
                  if (var5 == 36) {
                     if (Z + X <= t.b) {
                        if (var4 < Y) {
                           a(var0, 1009050, 210, Z, var4, X / 4, Y / 4);
                        } else {
                           a(var0, 1009050, 210, Z, var4 - Y / 4, X / 4, Y / 4);
                        }
                        break label279;
                     }

                     if (var4 >= Y) {
                        a(var0, 1009050, 210, Z - X / 4, var4 - Y / 4, X / 4, Y / 4);
                        break label279;
                     }
                  } else {
                     if (var5 == 24) {
                        if (Z - X < 0) {
                           if (var4 + Y >= t.c) {
                              a(var0, 1009050, 210, Z, var4 - Y / 4, X / 4, Y / 4);
                           } else {
                              a(var0, 1009050, 210, Z, var4, X / 4, Y / 4);
                           }
                        } else if (var4 + Y >= t.c) {
                           a(var0, 1009050, 210, Z, var4 - Y / 4, X / 4, Y / 4);
                        } else {
                           a(var0, 1009050, 210, Z - X / 4, var4, X / 4, Y / 4);
                        }
                        break label279;
                     }

                     if (var3 + X <= t.b) {
                        if (var4 + Y >= t.c) {
                           a(var0, 1009050, 210, Z - X / 4, var4 - Y / 4, X / 4, Y / 4);
                        } else {
                           a(var0, 1009050, 210, Z, var4, X / 4, Y / 4);
                        }
                        break label279;
                     }

                     if (var4 + Y >= t.c) {
                        a(var0, 1009050, 210, Z - X / 4, var4 - Y / 4, X / 4, Y / 4);
                        break label279;
                     }
                  }

                  a(var0, 1009050, 210, Z - X / 4, var4, X / 4, Y / 4);
               }
            }
         } else if (l == 16) {
            if (var5 == 40) {
               if (Z - X < 0) {
                  if (var4 < Y) {
                     a(var0, 1009050, 210, Z, var4, X / 4, Y / 4);
                  } else {
                     a(var0, 1009050, 210, Z, var4 - Y / 4, X / 4, Y / 4);
                  }
               } else if (var4 < Y) {
                  a(var0, 1009050, 210, Z, var4, X / 2, Y / 2);
               } else {
                  a(var0, 1009050, 210, Z - X / 2, var4 - Y / 2, X / 2, Y / 2);
               }
            } else if (var5 == 36) {
               if (Z + X > t.b) {
                  if (var4 < Y) {
                     a(var0, 1009050, 210, Z - X / 2, var4, X / 2, Y / 2);
                  } else {
                     a(var0, 1009050, 210, Z - X / 2, var4 - Y / 2, X / 2, Y / 2);
                  }
               } else if (var4 < Y) {
                  a(var0, 1009050, 210, Z, var4, X / 2, Y / 2);
               } else {
                  a(var0, 1009050, 210, Z, var4 - Y / 2, X / 2, Y / 2);
               }
            } else if (var5 == 24) {
               if (Z - X < 0) {
                  if (var4 + Y >= t.c) {
                     a(var0, 1009050, 210, Z, var4 - Y / 2, X / 2, Y / 2);
                  } else {
                     a(var0, 1009050, 210, Z, var4, X / 2, Y / 2);
                  }
               } else if (var4 + Y >= t.c) {
                  a(var0, 1009050, 210, Z, var4 - Y / 2, X / 2, Y / 2);
               } else {
                  a(var0, 1009050, 210, Z - X / 2, var4, X / 2, Y / 2);
               }
            } else if (var3 + X <= t.b) {
               if (var4 + Y >= t.c) {
                  a(var0, 1009050, 210, Z - X / 2, var4 - Y / 2, X / 2, Y / 2);
               } else {
                  a(var0, 1009050, 210, Z, var4, X / 2, Y / 2);
               }
            } else if (var4 + Y >= t.c) {
               a(var0, 1009050, 210, Z - X / 2, var4 - Y / 2, X / 2, Y / 4);
            } else {
               a(var0, 1009050, 210, Z - X / 2, var4, X / 2, Y / 4);
            }
         } else if (l == 17) {
            if (var5 == 40) {
               if (Z - X < 0) {
                  if (var4 < Y) {
                     a(var0, 1009050, 210, Z, var4, X / 2, Y / 2);
                  } else {
                     a(var0, 1009050, 210, Z, var4 - Y / 2, X / 2, Y / 2);
                  }
               } else if (var4 < Y) {
                  a(var0, 1009050, 210, Z, var4, X / 4 * 3, Y / 4 * 3);
               } else {
                  a(var0, 1009050, 210, Z - X / 4 * 3, var4 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
               }
            } else if (var5 == 36) {
               if (Z + X > t.b) {
                  if (var4 < Y) {
                     a(var0, 1009050, 210, Z - X / 4 * 3, var4, X / 4 * 3, Y / 4 * 3);
                  } else {
                     a(var0, 1009050, 210, Z - X / 4 * 3, var4 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
                  }
               } else if (var4 < Y) {
                  a(var0, 1009050, 210, Z, var4, X / 4 * 3, Y / 4 * 3);
               } else {
                  a(var0, 1009050, 210, Z, var4 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
               }
            } else if (var5 == 24) {
               if (Z - X < 0) {
                  if (var4 + Y >= t.c) {
                     a(var0, 1009050, 210, Z, var4 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
                  } else {
                     a(var0, 1009050, 210, Z, var4, X / 4 * 3, Y / 4 * 3);
                  }
               } else if (var4 + Y >= t.c) {
                  a(var0, 1009050, 210, Z, var4 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
               } else {
                  a(var0, 1009050, 210, Z - X / 4 * 3, var4, X / 4 * 3, Y / 4 * 3);
               }
            } else if (var3 + X <= t.b) {
               if (var4 + Y >= t.c) {
                  a(var0, 1009050, 210, Z - X / 4 * 3, var4 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
               } else {
                  a(var0, 1009050, 210, Z, var4, X / 4 * 3, Y / 4 * 3);
               }
            } else if (var4 + Y >= t.c) {
               a(var0, 1009050, 210, Z - X / 4 * 3, var4 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
            } else {
               a(var0, 1009050, 210, Z - X / 4 * 3, var4, X / 4 * 3, Y / 4 * 3);
            }
         } else {
            var0.setColor(16230);
            if (var5 == 40) {
               if (Z - X < 0) {
                  if (var4 < Y) {
                     a(var0, 1009050, 210, Z, var4, X, Y);
                     var0.drawRect(Z, var4, X, Y);
                     var0.setColor(ab);
                     var0.drawString(ac, Z + 4, var4 + 4, 20);
                     if (ae != null) {
                        ae.a(var0, Z + 4, var4 + 4 + t.j, 0);
                     }
                  } else {
                     a(var0, 1009050, 210, Z, var4 - Y, X, Y);
                     var0.drawRect(Z, var4 - Y, X, Y);
                     var0.setColor(ab);
                     var0.drawString(ac, Z + 4, var4 - Y + 4, 20);
                     if (ae != null) {
                        ae.a(var0, Z + 4, var4 - Y + 4 + t.j, 0);
                     }
                  }
               } else if (var4 < Y) {
                  a(var0, 1009050, 210, Z, var4, X, Y);
                  var0.drawRect(Z, var4, X, Y);
                  var0.setColor(ab);
                  var0.drawString(ac, Z + 4, var4 + 4, 20);
                  if (ae != null) {
                     ae.a(var0, Z + 4, var4 + 4 + t.j, 0);
                  }
               } else {
                  a(var0, 1009050, 210, Z - X, var4 - Y, X, Y);
                  var0.drawRect(Z - X, var4 - Y, X, Y);
                  var0.setColor(ab);
                  var0.drawString(ac, Z - X + 4, var4 - Y + 4, 20);
                  if (ae != null) {
                     ae.a(var0, Z - X + 4, var4 - Y + 4 + t.j, 0);
                  }
               }
            } else if (var5 == 36) {
               if (Z + X > t.b) {
                  if (var4 < Y) {
                     a(var0, 1009050, 210, Z, var4, X, Y);
                     var0.drawRect(Z, var4, X, Y);
                     var0.setColor(ab);
                     var0.drawString(ac, Z + 4, var4 + 4, 20);
                     if (ae != null) {
                        ae.a(var0, Z + 4, var4 + 4 + t.j, 0);
                     }
                  } else {
                     a(var0, 1009050, 210, Z - X, var4 - Y, X, Y);
                     var0.drawRect(Z - X, var4 - Y, X, Y);
                     var0.setColor(ab);
                     var0.drawString(ac, Z - X + 4, var4 - Y + 4, 20);
                     if (ae != null) {
                        ae.a(var0, Z - X + 4, var4 - Y + 4 + t.j, 0);
                     }
                  }
               } else if (var4 < Y) {
                  a(var0, 1009050, 210, Z, var4, X, Y);
                  var0.drawRect(Z, var4, X, Y);
                  var0.setColor(ab);
                  var0.drawString(ac, Z + 4, var4 + 4, 20);
                  if (ae != null) {
                     ae.a(var0, Z + 4, var4 + 4 + t.j, 0);
                  }
               } else {
                  a(var0, 1009050, 210, Z, var4 - Y, X, Y);
                  var0.drawRect(Z, var4 - Y, X, Y);
                  var0.setColor(ab);
                  var0.drawString(ac, Z + 4, var4 - Y + 4, 20);
                  if (ae != null) {
                     ae.a(var0, Z + 4, var4 - Y + 4 + t.j, 0);
                  }
               }
            } else if (var5 == 24) {
               if (Z - X < 0) {
                  if (var4 + Y >= t.c) {
                     a(var0, 1009050, 210, Z, var4 - Y, X, Y);
                     var0.drawRect(Z, var4 - Y, X, Y);
                     var0.setColor(ab);
                     var0.drawString(ac, Z + 4, var4 + 4 - Y, 20);
                     if (ae != null) {
                        ae.a(var0, Z + 4, var4 + 4 + t.j - Y, 0);
                     }
                  } else {
                     a(var0, 1009050, 210, Z, var4, X, Y);
                     var0.drawRect(Z, var4, X, Y);
                     var0.setColor(ab);
                     var0.drawString(ac, Z + 4, var4 + 4, 20);
                     if (ae != null) {
                        ae.a(var0, Z + 4, var4 + 4 + t.j, 0);
                     }
                  }
               } else if (var4 + Y >= t.c) {
                  a(var0, 1009050, 210, Z, var4 - Y, X, Y);
                  var0.drawRect(Z, var4 - Y, X, Y);
                  var0.setColor(ab);
                  var0.drawString(ac, Z + 4, var4 + 4 - Y, 20);
                  if (ae != null) {
                     ae.a(var0, Z + 4, var4 + 4 + t.j - Y, 0);
                  }
               } else {
                  a(var0, 1009050, 210, Z - X, var4, X, Y);
                  var0.drawRect(Z - X, var4, X, Y);
                  var0.setColor(ab);
                  var0.drawString(ac, Z - X + 4, var4 + 4, 20);
                  if (ae != null) {
                     ae.a(var0, Z - X + 4, var4 + 4 + t.j, 0);
                  }
               }
            } else if (var3 + X <= t.b) {
               if (var4 + Y >= t.c) {
                  a(var0, 1009050, 210, Z - X, var4 - Y, X, Y);
                  var0.drawRect(Z - X, var4 - Y, X, Y);
                  var0.setColor(ab);
                  var0.drawString(ac, Z + 4 - X, var4 + 4 - Y, 20);
                  if (ae != null) {
                     ae.a(var0, Z + 4 - X, var4 + 4 + t.j - Y, 0);
                  }
               } else {
                  a(var0, 1009050, 210, Z, var4, X, Y);
                  var0.drawRect(Z, var4, X, Y);
                  var0.setColor(ab);
                  var0.drawString(ac, Z + 4, var4 + 4, 20);
                  if (ae != null) {
                     ae.a(var0, Z + 4, var4 + 4 + t.j, 0);
                  }
               }
            } else if (var4 + Y >= t.c) {
               a(var0, 1009050, 210, Z - X, var4 - Y, X, Y);
               if (Z < X) {
                  Z = X;
               }

               var0.drawRect(Z - X, var4 - Y, X, Y);
               var0.setColor(ab);
               var0.drawString(ac, Z - X + 4, var4 + 4 - Y, 20);
               if (ae != null) {
                  ae.a(var0, Z - X + 4, var4 + 4 + t.j - Y, 0);
               }
            } else {
               a(var0, 1009050, 210, Z - X, var4, X, Y);
               var0.drawRect(Z - X, var4, X, Y);
               var0.setColor(ab);
               var0.drawString(ac, Z - X + 4, var4 + 4, 20);
               if (ae != null) {
                  ae.a(var0, Z - X + 4, var4 + 4 + t.j, 0);
               }
            }
         }
      }

      ++l;
   }

   public static int a(String var0) {
      if (var0 != null && !var0.trim().equals("")) {
         m = 1;
         if (var0.charAt(0) == '<') {
            if (var0.charAt(2) == '>') {
               return b(var0.substring(1, 2));
            }

            if (var0.charAt(3) == '>') {
               m = 2;
               return b(var0.substring(1, 3));
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private static int b(String var0) {
      int var1 = -1;

      try {
         var1 = Integer.parseInt(var0);
      } catch (Exception var2) {
      }

      return var1 >= 0 && var1 < n.length ? n[var1] : 15138723;
   }

   public static int a(int var0) {
      return var0 >= 0 && var0 < n.length ? n[var0] : 15138723;
   }

   public static void a(int var0, int var1, String[] var2, boolean var3) {
      if (var2 != null) {
         ah = null;
         o = 0;
         p = new String[var2.length];
         ai = new int[var2.length][4];

         for(int var4 = 0; var4 < var2.length; ++var4) {
            System.arraycopy(var2, 0, p, 0, var2.length);
         }

         q = t.i.stringWidth("菜单");

         for(int var5 = 0; var5 < p.length; ++var5) {
            q = Math.max(q, t.i.stringWidth(p[var5]));
         }

         q += 20;
         af[0] = var0;
         af[1] = var1;
         ag = p.length * (t.j + 3) + 3;
         af[1] = af[1] + ag > t.c ? t.c - ag : af[1];
         int[] var10000;
         byte var10001;
         int var10002;
         if (var3) {
            var10000 = af;
            var10001 = 0;
            var10002 = t.b / 2 - q / 2;
         } else {
            var10000 = af;
            var10001 = 0;
            var10002 = af[0] + q > t.b ? t.b - q : af[0];
         }

         var10000[var10001] = var10002;
      }
   }

   public static void b(int var0) {
      if (var0 == 1) {
         o = o <= 0 ? p.length - 1 : --o;
      } else {
         if (var0 == 4) {
            o = o >= p.length - 1 ? 0 : ++o;
         }

      }
   }

   public static void a(int[] var0) {
      ah = var0;
   }

   public static void c(Graphics var0) {
      l = 0;
      var0.setClip(0, 0, t.b, t.c);
      var0.setColor(11138815);
      var0.fillRect(af[0], af[1], q, ag);
      var0.setColor(14172);
      var0.drawRect(af[0], af[1], q - 1, ag - 1);

      for(int var1 = 0; var1 < p.length; ++var1) {
         var0.setColor(o == var1 ? 1539988 : 6082765);
         var0.fillRect(af[0] + 2, af[1] + 2 + (t.j + 3) * var1, q - 4, t.j + 2);
         var0.setColor(14172);
         var0.drawRect(af[0] + 2, af[1] + 2 + (t.j + 3) * var1, q - 5, t.j + 1);
         a(ai[var1], af[0] + 2, af[1] + 2 + (t.j + 3) * var1, q - 5, t.j + 1);
         var0.setColor(o == var1 ? 16053950 : 3756286);
         if (ah != null && var1 < ah.length && ah[var1] == 1) {
            var0.setColor(8750469);
         }

         var0.drawString(p[var1], af[0] + q / 2, af[1] + 2 + (t.j + 3) * var1, 17);
      }

      if (a_MainCanvas.S != null && a_MainCanvas.S.length == 4) {
         var0.drawImage(a_MainCanvas.S[0].a, af[0], af[1], 20);
         var0.drawImage(a_MainCanvas.S[1].a, af[0] + q - a_MainCanvas.S[1].b, af[1], 20);
         var0.drawImage(a_MainCanvas.S[2].a, af[0], af[1] + ag - a_MainCanvas.S[2].c, 20);
         var0.drawImage(a_MainCanvas.S[3].a, af[0] + q - a_MainCanvas.S[3].b, af[1] + ag - a_MainCanvas.S[3].c, 20);
      }

   }

   public static int c(int var0, int var1) {
      if (ai != null) {
         for(int var2 = 0; var2 < ai.length; ++var2) {
            if (var0 >= ai[var2][0] && var0 <= ai[var2][0] + ai[var2][2] && var1 >= ai[var2][1] && var1 <= ai[var2][1] + ai[var2][3]) {
               o = var2;
               return 1073741824;
            }
         }
      }

      return var0 >= af[0] && var0 <= af[0] + q && var1 >= af[1] && var1 <= af[1] + ag ? 0 : 536870912;
   }

   public static void a(Graphics var0, String var1, int var2, boolean var3) {
      l = 0;
      int var4 = (t.j << 1) + 35 + 24;
      int var5 = (t.b - 140) / 2;
      int var6 = (t.c - var4) / 2;
      c(var0, var5, var6, 140, var4, 0);
      c(var0, var5 + 20, var6 + 5 + t.j + 12, 100, t.j, 1);
      a((int[])al, var5 + 20, var6 + 5 + t.j + 12, 100, t.j);
      a(var0, (String)var1, (int)(var5 + 70), var6 + 5, 17, 16776666, 0);
      if (var2 > 0) {
         a(var0, "" + var2, var5 + 70, var6 + 6 + t.j + 12, 17, 16711639);
      }

      if (var3 && a_MainCanvas.X != null && a_MainCanvas.Y != null && a_MainCanvas.V != null && a_MainCanvas.W != null) {
         var0.drawImage(a_MainCanvas.V.a, var5 + (140 - a_MainCanvas.V.b) / 2, var6 + 7 + t.j, 20);
         a(aj[0], var5 + (140 - a_MainCanvas.V.b) / 2, var6 + 7 + t.j, a_MainCanvas.V.a.getWidth(), a_MainCanvas.V.a.getHeight());
         var0.drawImage(a_MainCanvas.W.a, var5 + (140 - a_MainCanvas.V.b) / 2, var6 + 5 + (t.j << 1) + 14, 20);
         a(aj[1], var5 + (140 - a_MainCanvas.V.b) / 2, var6 + 5 + (t.j << 1) + 14, a_MainCanvas.W.a.getWidth(), a_MainCanvas.W.a.getHeight());
         var0.drawImage(a_MainCanvas.X.a, var5 + 5, var6 + 5 + t.j + 12, 20);
         a(aj[2], var5 + 5, var6 + 5 + t.j + 12, a_MainCanvas.X.a.getWidth(), a_MainCanvas.X.a.getHeight());
         var0.drawImage(a_MainCanvas.Y.a, var5 + 140 - 5 - a_MainCanvas.Y.b, var6 + 5 + t.j + 12, 20);
         a(aj[3], var5 + 140 - 5 - a_MainCanvas.Y.b, var6 + 5 + t.j + 12, a_MainCanvas.Y.a.getWidth(), a_MainCanvas.Y.a.getHeight());
      }

      if (a_MainCanvas.T != null && a_MainCanvas.U != null) {
         var0.drawImage(a_MainCanvas.T.a, var5 + 5, var6 + var4 - 5 - a_MainCanvas.T.c, 20);
         a(ak[0], var5 + 5, var6 + var4 - 5 - a_MainCanvas.T.c, a_MainCanvas.T.a.getWidth(), a_MainCanvas.T.a.getHeight());
         var0.drawImage(a_MainCanvas.U.a, var5 + 140 - 5 - a_MainCanvas.U.b, var6 + var4 - 5 - a_MainCanvas.U.c, 20);
         a(ak[1], var5 + 140 - 5 - a_MainCanvas.U.b, var6 + var4 - 5 - a_MainCanvas.U.c, a_MainCanvas.U.a.getWidth(), a_MainCanvas.U.a.getHeight());
      }

   }

   public static void c(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      if (var5 == 0) {
         a(var0, 2511520, 210, var1, var2, var3, var4);
      } else if (var5 == 1) {
         var0.setColor(15990);
         var0.fillRect(var1, var2, var3, var4);
      }

      var0.setColor(14172);
      var0.drawRect(var1, var2, var3, var4);
      var0.drawRect(var1 + 2, var2 + 2, var3 - 4, var4 - 4);
      var0.setColor(11267556);
      var0.drawRect(var1 + 1, var2 + 1, var3 - 2, var4 - 2);
   }

   public static void a(Graphics var0, String var1, int var2, int var3, int var4) {
      var0.drawImage(a_MainCanvas.X.a, var2, var3 + 3, 20);
      c(var0, var2 + 12, var3, var4 - 24, t.j, 1);
      var0.drawImage(a_MainCanvas.Y.a, var2 + var4 - 9, var3 + 3, 20);
      a(var0, var1, var2 + var4 / 2, var3 + 3, 17, 16711639);
   }

   public static int d(int var0, int var1) {
      if (aj != null) {
         for(int var2 = 0; var2 < aj.length; ++var2) {
            if (var0 >= aj[var2][0] && var0 <= aj[var2][0] + aj[var2][2] && var1 >= aj[var2][1] && var1 <= aj[var2][1] + aj[var2][3]) {
               switch (var2) {
                  case 0:
                     return 1;
                  case 1:
                     return 4;
                  case 2:
                     return 8;
                  case 3:
                     return 2;
               }
            }
         }
      }

      if (ak != null) {
         if (var0 >= ak[0][0] && var0 <= ak[0][0] + ak[0][2] && var1 >= ak[0][1] && var1 <= ak[0][1] + ak[0][3]) {
            return 268435456;
         }

         if (var0 >= ak[1][0] && var0 <= ak[1][0] + ak[1][2] && var1 >= ak[1][1] && var1 <= ak[1][1] + ak[1][3]) {
            return 536870912;
         }
      }

      return 0;
   }

   public static boolean e(int var0, int var1) {
      return al != null && var0 >= al[0] && var0 <= al[0] + al[2] && var1 >= al[1] && var1 <= al[1] + al[3];
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
      w = 0;
      y = 0;
      z = 0;
      r = 4;
      s = var2;
      t = var3;
      u = var4;
      v = var0;
      x = var5;
      if (v > var5) {
         am = true;
         y = x * (var4 - 16) / var0;
      } else {
         am = false;
      }
   }

   public static void a(int var0, int var1, int var2) {
      if (var0 != 514 && var0 != 1) {
         if (var0 == 520 || var0 == 4) {
            var0 = 1;
            if (false) {
               for(w = w >= v - x ? v - x : w + 1; z < w && am; ++z) {
               }
            } else {
               if (w == v - 1) {
                  z = 0;
                  w = 0;
               } else {
                  ++w;
               }

               while(z < w && am && w - z + 1 > x) {
                  ++z;
               }
            }
         }

      } else {
         var0 = 1;
         if (false) {
            for(w = w <= 0 ? 0 : w - 1; am && z > w; --z) {
            }
         } else {
            if (w == 0) {
               z = v % x == 0 ? v - x : v - v % x;
               w = v - 1;
            } else {
               --w;
            }

            while(z > 0 && am && w - z + 1 < x) {
               --z;
            }
         }

      }
   }

   public static void d(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.setClip(0, 0, t.b, t.c);
      var0.setColor(16248869);
      var0.drawLine(var1, var2, var1 + 4, var2);
      var0.drawLine(var1, var2, var1, var2 + 4);
      var0.drawLine(var1, var2 + var4 - 4, var1, var2 + var4);
      var0.drawLine(var1, var2 + var4, var1 + 4, var2 + var4);
      var0.drawLine(var1 + var3 - 4, var2, var1 + var3, var2);
      var0.drawLine(var1 + var3, var2, var1 + var3, var2 + 4);
      var0.drawLine(var1 + var3, var2 + var4 - 4, var1 + var3, var2 + var4);
      var0.drawLine(var1 + var3 - 4, var2 + var4, var1 + var3, var2 + var4);
   }

   public static void e(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.setColor(16777215);
      var0.fillRect(var1 + 1, var2 + 1, 20, 2);
      var0.setColor(var4 == 0 ? 16711680 : '믿');
      var0.fillRect(var1 + 1, var2 + 1, var3, 2);
      var0.setColor(var4 == 0 ? 10945027 : 230064);
      var0.fillRect(var1 + 1, var2 + 2, var3, 1);
      var0.drawImage(a_MainCanvas.Z.a, var1, var2, 20);
   }

   private static void a(int[] var0, int var1, int var2, int var3, int var4) {
      if (var0 != null) {
         var0[0] = var1;
         var0[1] = var2;
         var0[2] = var3;
         var0[3] = var4;
      }

   }

   public static void a() {
      an = new int[]{(t.b - 100) / 2, (t.c / 3 << 1) + 20, 100, 3};
      A = 0;
      ap = new bw_1(ao[f(1, 100) % 7], (short)(t.b - 20));
   }

   public static void a(Graphics var0, Image var1) {
      if (an != null && var1 != null) {
         var0.setColor(0);
         var0.fillRect(0, 0, t.b, t.c);
         if (ap != null) {
            ap.a(var0, t.b / 2, 20, 17);
         }

         var0.setColor(16777215);
         var0.drawString("正在载入资源...", t.b / 2, t.c / 2, 17);
         var0.setColor(14459464);
         var0.drawString(100 * A / 100 + "%", t.b / 2, an[1] + 10, 17);
         var0.drawImage(var1, an[0] - 5, an[1] - 4, 20);
         var0.setColor(16382066);
         var0.fillRect(an[0], an[1], 100 * A / 100, 3);
         var0.setColor(14459464);
         var0.fillRect(an[0], an[1] + 1, 100 * A / 100, 2);
         A = ++A > 100 ? 100 : A;
      }
   }

   public static int f(int var0, int var1) {
      int var2;
      int var3;
      return (var3 = (var2 = var0 + aq.nextInt() % (var1 - var0)) < 0 ? -var2 : var2) == 0 ? 1 : var3;
   }

   public static void f(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.setClip(0, 0, t.b, t.c);
      a(var0, 2);
      var0.drawRect(var1 - 4, var2 - 4, var3 + 7, var4 + 7);
      var0.drawRect(var1, var2, var3 - 1, var4 - 1);
      a(var0, 3);
      var0.drawRect(var1 - 3, var2 - 3, var3 + 5, var4 + 5);
      var0.drawRect(var1 - 1, var2 - 1, var3 + 1, var4 + 1);
      a(var0, 4);
      var0.drawRect(var1 - 2, var2 - 2, var3 + 3, var4 + 3);
      if (a_MainCanvas.y != null) {
         var0.drawImage(a_MainCanvas.y.a, var1 - 4, var2 - 4, 20);
      }

      if (a_MainCanvas.z != null) {
         var0.drawImage(a_MainCanvas.z.a, var1 - 4, var2 + var4 + 4 - a_MainCanvas.z.c, 20);
      }

      if (a_MainCanvas.w != null) {
         var0.drawImage(a_MainCanvas.w.a, var1 + 4 + var3 - a_MainCanvas.w.b, var2 - 4, 20);
      }

      if (a_MainCanvas.x != null) {
         var0.drawImage(a_MainCanvas.x.a, var1 + 4 + var3 - a_MainCanvas.x.b, var2 + var4 + 4 - a_MainCanvas.x.c, 20);
      }

   }
}

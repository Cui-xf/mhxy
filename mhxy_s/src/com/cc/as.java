package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class as {
   private UISceneController b;
   public MainCanvas a;
   private static int c;
   private static short d;
   private static String e;
   private static int[] f;
   private static short[] g;
   private static String[] h;
   private static byte[] i;
   private static String j;
   private static String k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int[][] p;

   public as(UISceneController var1, MainCanvas var2, PngUtil var3) {
      this.b = var1;
      this.a = var2;
   }

   public final void a(DataInputStream var1) throws IOException {
      boolean var2 = false;
      if (c > 0) {
         var2 = true;
      }

      c = var1.readInt();
      var1.readUTF();
      d = var1.readShort();
      e = var1.readUTF();
      byte var3;
      if ((var3 = var1.readByte()) > 0) {
         f = new int[var3];
         g = new short[var3];
         i = new byte[var3];
         h = new String[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            f[var4] = var1.readInt();
            g[var4] = var1.readShort();
            h[var4] = var1.readUTF();
            i[var4] = var1.readByte();
         }
      } else {
         f = null;
         g = null;
         i = null;
      }

      j = var1.readUTF();
      k = var1.readUTF();
      GlobalStatus.N();
      b(c);
      if (f != null && f.length > 0) {
         for(int var5 = 0; var5 < f.length; ++var5) {
            b(f[var5]);
         }
      }

      if (var2) {
         this.a();
      }

      this.b();
   }

   public final void a(boolean var1) {
      if (var1) {
         this.n = 0;
         this.o = 0;
      }

      if (c != -1) {
         this.b.a(new short[]{d});
      }

      if (g != null) {
         this.b.a(g);
      }

      as var3 = this;
      if (this.p != null) {
         for(int var2 = 0; var2 < var3.p.length; ++var2) {
            if (var3.p[var2] != null) {
               var3.p[var2] = null;
            }
         }

         var3.p = null;
      }

      this.p = new int[4][4];
      this.a.aq.b();
      this.a.aq.a("装备升星");
      this.a.aq.a(false);
      this.l = Math.max((GlobalConfig.font2_h << 1) + 25, 59);
      this.m = GlobalConfig.font2_h + 13;
      this.a.aq.a(this.l + this.m);
      this.a();
      this.a.aq.a((al)this.a.at);
      this.a.au.a("确定");
      if (GlobalConfig.defaultHigh > 220) {
         this.a.aq.a((al)this.a.au);
      }

      this.a.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
      this.b();
      LoadingPage.l = 0;
      this.b.sceneSubState = 0;
      this.a.touchPageCase = this.a.k;
      this.b.sceneStateShadow = this.b.currentSceneModeId = 102;
   }

   private void a() {
      if (k != null && !k.equals("")) {
         this.a.at.a(k, GlobalConfig.font2, (byte)1);
      } else {
         this.a.at.a((String)null, GlobalConfig.font2, (byte)1);
      }
   }

   private void b() {
      if (j != null) {
         new TextRender(j, (short) GlobalConfig.font2.stringWidth(j));
      }

   }

   public final void a(int var1) {
      if (this.b.sceneSubState == 0 && this.a.aq != null) {
         this.a.aq.b(var1);
      }

      if (var1 != 514 && var1 != 520 && var1 != 1 && var1 != 4) {
         if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
               this.b.m();
            }

         } else {
            c = -1;
            d = -1;
            e = null;
            f = null;
            g = null;
            j = null;
            k = null;
            h = null;
            GlobalStatus.N();
            this.a(true);
         }
      }
   }

   public final void a(Graphics var1) {
      if (this.b.sceneSubState == 0 && this.a.aq != null) {
         this.a.aq.a(var1);
      }

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
}

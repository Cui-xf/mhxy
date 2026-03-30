package com.cc;

import com.yinhan.kjava.main.a_MainCanvas;

import javax.microedition.lcdui.Image;

public final class ag_1 {
   private static String[] p = new String[]{"联系客服", "", ""};
   public static final String[] a;
   public be_1[] b = new be_1[0];
   public ak[] c = new ak[0];
   private int q = 0;
   public String[] d = null;
   public String[] e = null;
   public String[] f = null;
   private String[] r = null;
   public Image[] g = null;
   public int[] h = null;
   public int i = -1;
   private int s = 0;
   public String[] j = null;
   public final String[] k = null;
   public final String[] l = null;
   public final Image[] m = null;
   public int[] n = null;
   public boolean o = false;

   public final String a() {
      Object var1 = null;

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         be_1 var3;
         if ((var3 = this.b[var2]).d) {
            return var3.a;
         }
      }

      return null;
   }

   public final int a(String var1) {
      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if (this.b[var2].a.equals(var1)) {
            return var2;
         }
      }

      return -1;
   }

   public static ag_1 b() {
      ag_1 var0;
      (var0 = new ag_1()).b = new be_1[0];
      return var0;
   }

   public final void c() {
      if (this.c != null && this.c.length > 0) {
         this.s = this.c.length;
         this.j = new String[this.s];
         this.n = new int[this.s];
         ak var1 = null;

         for(int var2 = 0; var2 < this.s; ++var2) {
            var1 = this.c[var2];
            this.j[var2] = var1.b;
            this.n[var2] = var1.a;
         }

      } else {
         this.i = -1;
         this.s = 0;
         this.j = null;
         this.n = null;
      }
   }

   public final void d() {
      this.o = false;
      this.q = 1 + this.b.length;
      this.d = new String[this.q];
      this.e = new String[this.q];
      this.f = new String[this.q];
      this.r = new String[this.q];
      this.g = new Image[this.q];
      this.h = new int[this.q];
      int var1 = 0;
      this.d[0] = p[0];
      this.e[0] = p[1];
      this.f[0] = p[2];
      this.r[0] = "";
      this.g[0] = a_MainCanvas.af.a("103").a;
      this.h[0] = 4915330;
      ++var1;

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         this.d[var1] = this.b[var2].b;
         this.e[var1] = "";
         this.f[var1] = this.b[var2].c;
         this.r[var1] = "";
         if (this.b[var2].d) {
            if (!this.o) {
               this.o = true;
            }

            this.g[var1] = be_1.e[0];
         } else {
            this.g[var1] = be_1.e[1];
         }

         this.h[var1] = 9118290;
         ++var1;
      }

   }

   static {
      String[] var10000 = new String[]{"查看"};
      a = new String[]{"Bug", "建议", "咨询"};
   }
}

package com.cc;

import javax.microedition.lcdui.Image;

public final class f {
   private static String[] v = new String[]{"【邮件标题】", "【发件人】"};
   public static final String[] a = new String[]{"上页", "下页", "发件", "清理", "定购"};
   public static final String[] b = new String[]{"查看", "回复", "删除", "加为好友", "加黑名单", "举报"};
   public static final String[] c;
   public int d = 0;
   public String e = "";
   public bo[] f = new bo[0];
   private int w = 0;
   public String[] g = null;
   public String[] h = null;
   public String[] i = null;
   private String[] x = null;
   public String[] j = null;
   public Image[] k = null;
   public int[] l = null;
   public String m = null;
   public String n = null;
   public String o = null;
   public String p = null;
   public String q = null;
   public String r = null;
   public String[] s = null;
   public String[] t = null;
   public boolean u = false;

   public final void a() {
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
      this.r = null;
   }

   public static f b() {
      f var0;
      (var0 = new f()).d = 0;
      var0.e = "【我的邮件】\t邮件同步中...请稍候...";
      var0.f = new bo[0];
      return var0;
   }

   public final void c() {
      this.u = false;
      this.w = 0;
      this.g = null;
      this.h = null;
      this.i = null;
      this.x = null;
      this.j = null;
      this.k = null;
      this.l = null;
      this.w = 1 + this.f.length;
      this.g = new String[this.w];
      this.h = new String[this.w];
      this.i = new String[this.w];
      this.x = new String[this.w];
      this.j = new String[this.w];
      this.k = new Image[this.w];
      this.l = new int[this.w];
      int var1 = 0;
      this.g[0] = v[0];
      this.h[0] = "";
      this.i[0] = v[1];
      this.x[0] = "";
      this.j[0] = this.e;
      this.k[0] = null;
      this.l[0] = 4915330;
      ++var1;

      for(int var2 = 0; var2 < this.f.length; ++var2) {
         this.g[var1] = this.f[var2].a();
         this.h[var1] = "";
         this.i[var1] = this.f[var2].e;
         this.x[var1] = "";
         this.j[var1] = this.f[var2].b();
         if (this.f[var2].f) {
            this.k[var1] = bo.g[1];
         } else {
            if (!this.u) {
               this.u = true;
            }

            this.k[var1] = bo.g[0];
         }

         this.l[var1] = 16777215;
         ++var1;
      }

   }

   static {
      c = new String[]{b[1], b[2], b[3], b[4], b[5]};
   }
}

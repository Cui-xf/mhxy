package com.cc;

import java.util.Enumeration;
import java.util.Vector;

public final class z_1 {
   public static boolean a(String var0) {
      return var0 == null || "".equals(var0.trim());
   }

   public static boolean b(String var0) {
      if (var0 != null) {
         var0 = var0.trim();
      }

      return var0 != null && !"".equals(var0);
   }

   public static boolean c(String var0) {
      if (b(var0)) {
         for(int var1 = 0; var1 < var0.length(); ++var1) {
            char var2;
            if (((var2 = var0.charAt(var1)) < 'a' || var2 > 'z') && (var2 < 'A' || var2 > 'Z') && (var2 < '0' || var2 > '9')) {
               return false;
            }
         }
      }

      return true;
   }

   public static boolean d(String var0) {
      boolean var1 = false;
      if (b(var0)) {
         var1 = true;

         for(int var2 = 0; var2 < var0.length(); ++var2) {
            if (!a(var0.charAt(var2))) {
               return false;
            }
         }
      }

      return var1;
   }

   public static boolean a(String var0, int var1, int var2) {
      boolean var3 = false;
      if (b(var0)) {
         var3 = var0.trim().length() >= var1 && var0.trim().length() <= var2;
      }

      return var3;
   }

   public static boolean e(String var0) {
      boolean var1 = false;
      if (var0 != null && var0.trim().length() == 11) {
         var1 = true;

         for(int var2 = 0; var2 < var0.length(); ++var2) {
            if (!a(var0.charAt(var2))) {
               return false;
            }
         }
      }

      return var1;
   }

   public static int f(String var0) {
      try {
         return var0 != null && !"".equals(var0) ? Integer.parseInt(var0) : 0;
      } catch (Exception var1) {
         return 0;
      }
   }

   public static String[] a(String var0, char var1) {
      String[] var6 = null;
      if (b(var0)) {
         char[] var7 = var0.toCharArray();
         int var2 = 0;
         Vector var3 = new Vector();

         for(int var4 = 0; var4 < var7.length; ++var4) {
            if (':' == var7[var4] && var4 == var7.length - 1 && var2 != 0) {
               var3.addElement("");
            } else if (':' == var7[var4] && var4 == var7.length - 1) {
               var3.addElement("");
               var3.addElement("");
            } else if (':' == var7[var4]) {
               var3.addElement(var0.substring(var2, var4));
               var2 = var4 + 1;
            } else if (var2 != 0 && var4 == var7.length - 1) {
               var3.addElement(var0.substring(var2, var7.length));
            } else if (var2 == 0 && var4 == var7.length - 1) {
               var3.addElement(var0);
            }
         }

         var6 = new String[var3.size()];
         int var8 = 0;

         for(Enumeration var5 = var3.elements(); var5.hasMoreElements(); ++var8) {
            var6[var8] = (String)var5.nextElement();
         }
      }

      return var6;
   }

   private static boolean a(char var0) {
      return var0 >= '0' && var0 <= '9';
   }
}

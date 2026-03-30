package com.cc;

import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class bw_1 {
   private e[] b;
   private short c;
   public short a;
   private int d = 0;

   public bw_1(String var1, short var2) {
      this.c = var2;
      this.a(var1);
   }

   public final short a() {
      return this.b != null ? (short)this.b.length : 0;
   }

   public final void a(Graphics var1, int var2, int var3, int var4) {
      if (this.b != null) {
         for(int var5 = 0; var5 < this.b.length; ++var5) {
            if (this.b[var5] != null) {
               this.d = 0;

               for(int var6 = 0; var6 < this.b[var5].a.length; ++var6) {
                  var1.setColor(this.b[var5].b[var6]);
                  var1.drawString(this.b[var5].a[var6], var2 + this.d, var3 + var5 * t.j, var4);
                  this.d += t.i.stringWidth(this.b[var5].a[var6]);
               }
            }
         }

      }
   }

   public final void a(Graphics var1, int var2, int var3) {
      if (this.b != null) {
         short var4 = 0;

         for(int var5 = 0; var5 < this.b.length; ++var5) {
            if (this.b[var5] != null) {
               this.d = 0;
               var4 = this.b[var5].a();

               for(int var6 = 0; var6 < this.b[var5].a.length; ++var6) {
                  var1.setColor(this.b[var5].b[var6]);
                  var1.drawString(this.b[var5].a[var6], var2 - var4 / 2 + this.d, var3 + var5 * t.j, 20);
                  this.d += t.i.stringWidth(this.b[var5].a[var6]);
               }
            }
         }

      }
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5) {
      this.d = 0;

      for(int var6 = 0; var6 < this.b[var4].a.length; ++var6) {
         var1.setColor(this.b[var4].b[var6]);
         var1.drawString(this.b[var4].a[var6], var2 + this.d, var3, var5);
         this.d += t.i.stringWidth(this.b[var4].a[var6]);
      }

   }

   private void a(String var1) {
      int var2 = 0;
      int var3 = 0;
      Vector var4 = new Vector();
      StringBuffer var5 = new StringBuffer();
      Object var6 = null;
      ap var7 = null;
      boolean var8 = false;

      for(int var18 = 0; var18 < var1.length(); ++var18) {
         if ((var2 = var1.charAt(var18)) == '<' && var18 + 1 < var1.length()) {
            if (var1.charAt(var18 + 1) == '/') {
               var2 = var18;
               int var20 = 0;

               for(var20 = var18 + 2; var20 < var1.length(); ++var20) {
                  if (var1.charAt(var20) == '>') {
                     try {
                        int var17 = Integer.parseInt(var1.substring(var18 + 2, var20));
                        if (var7 != null && var17 == var7.a) {
                           var7.c = (short)(a(var5) - 1);
                           new ap(this);
                           var7 = null;
                        }

                        var18 = var20;
                     } catch (Exception var10) {
                        var18 = var20;
                        var5.append(var1.substring(var2, var3 + 1));
                        var20 = 0;
                     }
                     break;
                  }

                  if (var1.charAt(var20) == '<') {
                     var3 = var20;
                     var18 = var20;
                     var5.append(var1.substring(var2, var20 - 1));
                     break;
                  }
               }

               if (var20 == var1.length()) {
                  var5.append(var1.substring(var2, var20));
               }
            } else {
               var2 = var18;
               int var9 = 0;

               for(var9 = var18 + 1; var9 < var1.length(); ++var9) {
                  if (var1.charAt(var9) == '>') {
                     try {
                        if (var7 != null) {
                           var7.c = (short)(a(var5) - 1);
                        }

                        var3 = var9;
                        int var15 = Integer.parseInt(var1.substring(var18 + 1, var9));
                        ap var16 = new ap(this, var15, a(var5));
                        if (var1.charAt(var9 + 1) == '[' && var1.charAt(var9 + 3) == ']') {
                           var18 = var9 + 3;
                        } else {
                           var18 = var9;
                        }

                        var4.addElement(var16);
                        var7 = var16;
                     } catch (Exception var11) {
                        var18 = var9;
                        var5.append(var1.substring(var2, var3 + 1));
                        var9 = 0;
                     }
                     break;
                  }

                  if (var1.charAt(var9) == '<') {
                     var3 = var9;
                     var18 = var9;
                     var5.append(var1.substring(var2, var9 - 1));
                     break;
                  }
               }

               if (var9 == var1.length()) {
                  var5.append(var1.substring(var2, var9));
               }
            }
         } else {
            var5.append(var2);
         }
      }

      if (var7 != null) {
         var7.c = (short)(a(var5) - 1);
      }

      ap[] var22 = new ap[var4.size()];
      var4.copyInto(var22);
      this.a(var5.toString(), var22);
      var4.removeAllElements();
   }

   private static short a(StringBuffer var0) {
      short var1 = 0;

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         if (var0.charAt(var2) != '\t') {
            ++var1;
         }
      }

      return var1;
   }

   private void a(String var1, ap[] var2) {
      String var6 = "\t";
      short var5 = this.c;
      Font var4 = t.i;
      String var3 = var1;
      bw_1 var10 = this;
      if (var1 == null) {
         var3 = "";
      }

      Vector var7 = new Vector();
      var3 = this.a(var3, var6);

      for(int var16 = 0; var16 < ((Object[])var3).length; ++var16) {
         String var8 = ((Object[])var3)[var16];

         while(true) {
            String var9 = var10.a(var8, var4, var5);
            var7.addElement(var9);
            if ((var8 = var8.substring(var9.length())).length() == 0) {
               break;
            }
         }
      }

      var6 = new String[var7.size()];
      var7.copyInto(var6);
      String[] var11 = a((String[])var6);
      int var13 = 0;
      this.b = new e[var11.length];
      Vector var14 = new Vector();
      Vector var15 = new Vector();
      Object var18 = null;
      Object var21 = null;

      for(int var23 = 0; var23 < var11.length; ++var23) {
         var13 = this.a(var11[var23], var13, var2, var14, var15);
         String[] var19 = new String[var14.size()];
         String[] var22 = new String[var15.size()];
         var14.copyInto(var19);
         var15.copyInto(var22);
         this.b[var23] = new e(this, var19, var22);
         short var20 = this.b[var23].a();
         if (this.a < var20) {
            this.a = var20;
         }

         var14.removeAllElements();
         var15.removeAllElements();
      }

   }

   private int a(String var1, int var2, ap[] var3, Vector var4, Vector var5) {
      int var11 = 0;
      var11 = (boolean)0;
      int var6 = -1;
      int var7 = 0;
      int var8 = 0;

      for(var8 = 0; var8 < var1.length(); ++var8) {
         int var10000 = var2 + var8;
         ap[] var9 = var3;
         var11 = var10000;
         int var10 = 0;

         while(true) {
            if (var10 >= var9.length) {
               var10000 = -1;
               break;
            }

            if (var11 >= var9[var10].b && var11 <= var9[var10].c) {
               var10000 = var9[var10].a;
               break;
            }

            ++var10;
         }

         var11 = var10000;
         if (var10000 != var6) {
            var4.addElement(var1.substring(var7, var8));
            var5.addElement(String.valueOf(var6));
            var7 = var8;
            var6 = var11;
         }
      }

      if (var8 == var1.length()) {
         var4.addElement(var1.substring(var7, var1.length()));
         var5.addElement(String.valueOf(var6));
      }

      return var2 + var1.length();
   }

   private String[] a(String var1, String var2) {
      int var3 = 0;
      String[] var4 = new String[0];

      do {
         if ((var3 = var1.indexOf(var2)) < 0) {
            var4 = this.a(var4, var1);
            break;
         }

         var4 = this.a(var4, var1.substring(0, var3));
         var1 = var1.substring(var3 + var2.length());
      } while(var3 >= 0);

      return var4;
   }

   private String[] a(String[] var1, String var2) {
      if (var2 == null) {
         return var1;
      } else if (var1 == null) {
         return new String[]{var2};
      } else {
         boolean var3 = true;
         String[] var4 = var1;
         var1 = new String[var1.length + 1];
         System.arraycopy(var4, 0, var1, 0, var4.length);
         var1[var1.length - 1] = var2;
         return var1;
      }
   }

   private String a(String var1, Font var2, int var3) {
      int var4;
      return (var4 = var2.stringWidth(var1)) <= var3 ? var1 : this.a(var1.substring(0, var1.length() * var3 / var4), var2, var3);
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
}

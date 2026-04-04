package com.cc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class bb_1 {
   public static int a = 1;
   public static int b = 1;
   public static boolean c = false;
   public static int d = -1;
   public static String[] chongZhi = new String[]{"充值时请认真填写，因输入错误而充值到他人帐户的损失将由您本人承担。", "卡面充值时，请务必确认您的充值卡面额与选择金额相同，否则会导致支付失败，同时卡内金额被【一次性扣费】。", "开通网银支付：工商银行请去柜台开通,如果工行已开通网银并且动态口令卡支付,直接在网上银行开通即可。建设银行请去柜台签约,然后用手机登录个人网银激活。招商银行手机支付功能不需要单独申请.如果您已经开通了大众版支付(卡号密码支付)功能,则可以直接使用手机支付。", "网银充值时，如有银行记录已扣款，但通行证账户未充入相应数额银元，请电话联系400-889-0009 解决。", "请不要重复提交，以防重复购买。"};
   public static String[] conggZhi = new String[]{"充值时请认真填写，因输入错误而充值到他人帐户的损失将由您本人承担。", "卡面充值时，请务必确认您的充值卡面额与选择金额相同，否则会导致支付失败，同时卡内金额被【一次性扣费】。", "开通网银支付：工商银行请去柜台开通,如果工行已开通网银并且动态口令卡支付,直接在网上银行开通即可。建设银行请去柜台签约,然后用手机登录个人网银激活。招商银行手机支付功能不需要单独申请.如果您已经开通了大众版支付(卡号密码支付)功能,则可以直接使用手机支付。", "网银充值时，如有银行记录已扣款，但通行证账户未充入相应数额的金豆，请电话联系400-889-0009 解决。", "请不要重复提交，以防重复购买。"};
   public static String g;
   public static String h;
   public static String i;
   public static String j;
   public static boolean k = true;
   public static byte l = 0;
   public static String m;
   public static String n;

   public static void a() {
      byte[] var0;
      if ((var0 = bj.a("silver_kj")) != null) {
         ByteArrayInputStream var1 = null;
         DataInputStream var2 = null;
         boolean var8 = false;

         label106: {
            try {
               var8 = true;
               var1 = new ByteArrayInputStream(var0);
               k = (var2 = new DataInputStream(var1)).readByte() == 1;
               l = var2.readByte();
               m = var2.readUTF();
               n = var2.readUTF();
               var1.close();
               var2.close();
               var8 = false;
               break label106;
            } catch (Exception var12) {
               ((Throwable)var12).printStackTrace();
               var8 = false;
            } finally {
               if (var8) {
                  try {
                     if (var1 != null) {
                        var1.close();
                     }

                     if (var2 != null) {
                        var2.close();
                     }
                  } catch (Exception var9) {
                     ((Throwable)var9).printStackTrace();
                  }

               }
            }

            try {
               if (var1 != null) {
                  var1.close();
               }

               if (var2 != null) {
                  var2.close();
               }

               return;
            } catch (Exception var10) {
               ((Throwable)var10).printStackTrace();
               return;
            }
         }

         try {
            var1.close();
            var2.close();
         } catch (Exception var11) {
            ((Throwable)var11).printStackTrace();
         }
      }
   }

   public static void b() {
      ByteArrayOutputStream var0 = null;
      DataOutputStream var1 = null;
      boolean var8 = false;

      label111: {
         try {
            var8 = true;
            var0 = new ByteArrayOutputStream();
            (var1 = new DataOutputStream(var0)).writeByte(k ? 1 : 0);
            var1.writeByte(l);
            var1.writeUTF(m);
            var1.writeUTF(k ? n : "");
            var1.flush();
            bj.a(var0.toByteArray(), "silver_kj");
            var8 = false;
            break label111;
         } catch (Exception var12) {
            ((Throwable)var12).printStackTrace();
            var8 = false;
         } finally {
            if (var8) {
               try {
                  if (var0 != null) {
                     var0.close();
                  }

                  if (var1 != null) {
                     var1.close();
                  }
               } catch (Exception var9) {
                  ((Throwable)var9).printStackTrace();
               }

            }
         }

         try {
            if (var0 != null) {
               var0.close();
            }

            if (var1 != null) {
               var1.close();
            }

            return;
         } catch (Exception var10) {
            ((Throwable)var10).printStackTrace();
            return;
         }
      }

      try {
         var0.close();
         var1.close();
      } catch (Exception var11) {
         ((Throwable)var11).printStackTrace();
      }
   }
}

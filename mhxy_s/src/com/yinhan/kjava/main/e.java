package com.yinhan.kjava.main;

import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

final class e implements Runnable {
   private String a;
   private String b;

   public e(a_MainCanvas var1, String var2, String var3) {
      this.a = var2;
      this.b = var3;
      (new Thread(this)).start();
   }

   public final void run() {
      String var10000 = this.a;
      String var1 = this.b;
      String var11 = var10000;
      if (var10000 != null && var1 != null) {
         var11 = "sms://" + var11;
         MessageConnection var2 = null;

         try {
            TextMessage var13;
            (var13 = (TextMessage)(var2 = (MessageConnection)Connector.open(var11)).newMessage("text")).setPayloadText(var1);
            var2.send(var13);
            return;
         } catch (Exception var9) {
         } finally {
            if (var2 != null) {
               try {
                  var2.close();
               } catch (Exception var8) {
               }
            }

         }

      }
   }
}

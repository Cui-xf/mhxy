package com.yinhan.kjava.main;

import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

/* loaded from: java版梦回西游3区251011.jar:com/yinhan/kjava/main/e.class */
final class e implements Runnable {
    private String a;
    private String b;

    public e(a aVar, String str, String str2) {
        this.a = str;
        this.b = str2;
        new Thread(this).start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.a;
        String str2 = this.b;
        if (str == null || str2 == null) {
            return;
        }
        MessageConnection messageConnection = null;
        try {
            MessageConnection messageConnectionOpen = Connector.open(new StringBuffer().append("sms://").append(str).toString());
            messageConnection = messageConnectionOpen;
            TextMessage textMessageNewMessage = messageConnectionOpen.newMessage("text");
            textMessageNewMessage.setPayloadText(str2);
            messageConnection.send(textMessageNewMessage);
            if (messageConnection != null) {
                try {
                    messageConnection.close();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            if (messageConnection != null) {
                try {
                    messageConnection.close();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th) {
            if (messageConnection != null) {
                try {
                    messageConnection.close();
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
    }
}

package com.yinhan.kjava.main;

import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
final class e implements Runnable {
    private String a;
    private String b;

    public e(a aVar, String str, String str2) {
        this.a = str;
        this.b = str2;
        new Thread(this).start();
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        Connection connection;
        Connection connection2;
        String str = this.a;
        String str2 = this.b;
        if (str == null || str2 == null) {
            return;
        }
        try {
            connection2 = (MessageConnection) Connector.open(new StringBuffer().append("sms://").append(str).toString());
            try {
                TextMessage textMessageNewMessage = connection2.newMessage("text");
                textMessageNewMessage.setPayloadText(str2);
                connection2.send(textMessageNewMessage);
                if (connection2 != null) {
                    try {
                        connection2.close();
                    } catch (Exception e) {
                    }
                }
            } catch (Exception e2) {
                if (connection2 != null) {
                    try {
                        connection2.close();
                    } catch (Exception e3) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                connection = connection2;
                if (connection == null) {
                    throw th;
                }
                try {
                    connection.close();
                    throw th;
                } catch (Exception e4) {
                    throw th;
                }
            }
        } catch (Exception e5) {
            connection2 = null;
        } catch (Throwable th3) {
            th = th3;
            connection = null;
        }
    }
}

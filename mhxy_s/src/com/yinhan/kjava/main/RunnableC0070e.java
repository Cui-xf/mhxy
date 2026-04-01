package com.yinhan.kjava.main;

import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

/* renamed from: com.yinhan.kjava.main.e */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
final class RunnableC0070e implements Runnable {

    /* renamed from: a */
    private String f2229a;

    /* renamed from: b */
    private String f2230b;

    public RunnableC0070e(RunnableC0066a runnableC0066a, String str, String str2) {
        this.f2229a = str;
        this.f2230b = str2;
        new Thread(this).start();
    }

     // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        Connection connection;
        Connection connection2;
        String str = this.f2229a;
        String str2 = this.f2230b;
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

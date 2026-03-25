/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.wireless.messaging.Message
 *  javax.wireless.messaging.MessageConnection
 *  javax.wireless.messaging.TextMessage
 */
package com.yinhan.kjava.main;

import com.yinhan.kjava.main.a;
import javax.microedition.io.Connector;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

final class e
implements Runnable {
    private String a;
    private String b;

    public e(a a2, String string, String string2) {
        this.a = string;
        this.b = string2;
        new Thread(this).start();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object;
        String string = ((e)object).b;
        object = ((e)object).a;
        if (object == null) return;
        if (string == null) {
            return;
        }
        object = "sms://" + (String)object;
        MessageConnection messageConnection = null;
        try {
            messageConnection = (MessageConnection)Connector.open((String)object);
            object = (TextMessage)messageConnection.newMessage("text");
            object.setPayloadText(string);
            messageConnection.send((Message)object);
            if (messageConnection == null) return;
        }
        catch (Exception exception) {
            if (messageConnection == null) return;
            try {
                messageConnection.close();
                return;
            }
            catch (Exception exception2) {
                return;
            }
        }
        catch (Throwable throwable) {
            if (messageConnection == null) throw throwable;
            try {
                messageConnection.close();
                throw throwable;
            }
            catch (Exception exception) {}
            throw throwable;
        }
        try {
            messageConnection.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}


package com.cc.teavm.net;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public abstract class JsWebSocket implements JSObject {

    @JSBody(params = "url", script = "return new WebSocket(url);")
    public static native JsWebSocket create(String url);

    @JSBody(params = "msg", script = "this.send(msg);")
    public native void send(String msg);

    @JSBody(params = {"code", "reason"}, script = "this.close(code, reason);")
    public native void close(int code, String reason);

    @JSProperty("onopen")
    public abstract void setOnOpen(EventHandler handler);

    @JSProperty("onmessage")
    public abstract void setOnMessage(MessageHandler handler);

    @JSProperty("onclose")
    public abstract void setOnClose(CloseHandler handler);

    @JSProperty("onerror")
    public abstract void setOnError(EventHandler handler);

    @JSFunctor
    public interface EventHandler extends JSObject {
        void handle(JSObject event);
    }

    @JSFunctor
    public interface MessageHandler extends JSObject {
        void handle(MessageEvent event);
    }

    @JSFunctor
    public interface CloseHandler extends JSObject {
        void handle(CloseEvent event);
    }

    public interface MessageEvent extends JSObject {
        @JSProperty
        String getData();
    }

    public interface CloseEvent extends JSObject {
        @JSProperty
        int getCode();

        @JSProperty
        String getReason();
    }
}

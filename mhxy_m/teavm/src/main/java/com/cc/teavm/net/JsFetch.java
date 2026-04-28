package com.cc.teavm.net;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;

public class JsFetch {
    @JSBody(params = {"url", "options"}, script = "return fetch(url, options);")
    public static native JsPromise<JsResponse> fetch(String url, JSObject options);

    @JSBody(params = "url", script = "return fetch(url);")
    public static native JsPromise<JsResponse> fetch(String url);

    @JSBody(params = {"method", "body", "headers"}, script =
        "var opts = {method: method};" +
        "if (body !== null) opts.body = body;" +
        "if (headers !== null) opts.headers = headers;" +
        "return opts;")
    public static native JSObject createOptions(String method, String body, JSObject headers);

    @JSBody(script = "return {};")
    public static native JSObject createObject();

    @JSBody(params = {"obj", "key", "value"}, script = "obj[key] = value;")
    public static native void setProperty(JSObject obj, String key, String value);
}

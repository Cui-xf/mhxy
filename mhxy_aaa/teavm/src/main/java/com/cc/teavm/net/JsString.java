package com.cc.teavm.net;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;

public abstract class JsString implements JSObject {
    @JSBody(params = "s", script = "return s;")
    public static native JsString of(String s);

    @JSBody(script = "return '' + this;")
    public native String value();
}

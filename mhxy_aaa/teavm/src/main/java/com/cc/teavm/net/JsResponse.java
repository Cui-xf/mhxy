package com.cc.teavm.net;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface JsResponse extends JSObject {
    @JSProperty
    int getStatus();

    @JSBody(script = "return this.text();")
    JsPromise<JsString> text();
}

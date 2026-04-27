package com.cc.teavm.net;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

public interface JsPromise<T extends JSObject> extends JSObject {
    @JSBody(params = {"onResolve", "onReject"}, script = "return this.then(onResolve, onReject);")
    JsPromise<T> then(Callback<T> onResolve, ErrorCallback onReject);

    @JSFunctor
    interface Callback<T extends JSObject> extends JSObject {
        void call(T value);
    }

    @JSFunctor
    interface ErrorCallback extends JSObject {
        void call(JSObject error);
    }
}

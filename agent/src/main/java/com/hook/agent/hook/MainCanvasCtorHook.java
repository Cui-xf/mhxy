package com.hook.agent.hook;

import com.hook.agent.util.FakeNetPacket;

/**
 * 主画布 {@code com.yinhan.kjava.main.a} 构造完成时拿到 {@code this}
 */
public class MainCanvasCtorHook extends MethodHook {

    private static final String MAIN_CANVAS_INTERNAL = "com/yinhan/kjava/main/a";

    public MainCanvasCtorHook() {
        super(MAIN_CANVAS_INTERNAL, "<init>\\(.*\\)V");
    }

    @Override
    public void onExit(String hookKey, Object receiver, Object returnVal, Throwable ex) throws Exception {
        if (ex != null || receiver == null) {
            return;
        }
        FakeNetPacket.setMainCanvasInstance(receiver);
    }
}

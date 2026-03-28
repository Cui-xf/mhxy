package com.hook.agent.hook;

public class AppendHook extends MethodHook {
    public AppendHook() {
        super("java/lang/StringBuffer", "append");
    }

    @Override
    public void onEnter(String hookKey, Object[] args) {
        String threadName = Thread.currentThread().getName();
        if (threadName.startsWith("Image Fetcher") || threadName.startsWith("main")) {
            return;
        } else {
            System.out.println("[HOOK append-" + threadName + "]" + args[0]);
        }
    }
}

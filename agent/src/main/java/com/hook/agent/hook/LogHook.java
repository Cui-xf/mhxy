package com.hook.agent.hook;

public class LogHook extends MethodHook {
    public LogHook() {
        super("t", "a\\(Ljava/lang/String;\\)");
    }

    @Override
    public void onEnter(String hookKey, Object[] args) throws Exception {
        System.out.println(String.format("[HOOK LOG] %s", args[0]));
    }
}

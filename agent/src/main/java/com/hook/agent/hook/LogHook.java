package com.hook.agent.hook;

public class LogHook extends MethodHook {
    public LogHook() {
        super("t", "a\\(Ljava/lang/String;\\)");
    }

    @Override
    public void onEnter(String hookKey, Object receiver, Object[] args) throws Exception {
        Object msg = (args != null && args.length > 1) ? args[1] : (args != null && args.length > 0 ? args[0] : null);
        System.out.println(String.format("[HOOK LOG] %s", msg));
    }
}

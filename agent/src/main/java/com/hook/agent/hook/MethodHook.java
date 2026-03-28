package com.hook.agent.hook;

import java.util.regex.Pattern;

public abstract class MethodHook {
    private String className;
    private Pattern method;

    protected MethodHook(String className, String methodRegex) {
        this.className = className;
        this.method = Pattern.compile(methodRegex, 1);
    }

    public String getClassName() {
        return className;
    }

    public Pattern getMethod() {
        return method;
    }

    public void onEnter(String hookKey, Object[] args) throws Exception {

    }

    public void onExit(String hookKey, Object returnVal, Throwable ex) throws Exception {

    }
}

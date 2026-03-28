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

    /**
     * @param receiver 实例方法 / 构造器为 {@code this}，静态方法为 {@code null}
     */
    public void onEnter(String hookKey, Object receiver, Object[] args) throws Exception {

    }

    /**
     * @param receiver 实例方法 / 构造器为 {@code this}，静态方法为 {@code null}
     */
    public void onExit(String hookKey, Object receiver, Object returnVal, Throwable ex) throws Exception {

    }
}

package com.hook.agent;

import com.hook.agent.hook.*;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HookConfig {
    private static final Map</*className*/String, List<MethodHook>> HOOK_INDEX = new ConcurrentHashMap<>();
    private static final Map</*hookKey*/String, MethodHook> METHOD_HOOK_MAP = new ConcurrentHashMap<>();
    private static final Set<Class<?>> RETRANSFORM_CLASSES_MAP = new HashSet<Class<?>>() {{
//        add(java.lang.StringBuffer.class);
    }};


    static {
        registerHook(new AppendHook());
        registerHook(new LogHook());
        registerHook(new NetReceiveHook());
        registerHook(new NetSendHook());
        registerHook(new DataInputStreamHook());
        registerHook(new MainCanvasCtorHook());
        registerHook(new HuiChengHook());
    }


    public static void registerHook(MethodHook hook) {
        HOOK_INDEX.compute(hook.getClassName(), (classname, methodHooks) -> {
            if (methodHooks == null) {
                methodHooks = new ArrayList<>();
            }
            methodHooks.add(hook);
            return methodHooks;
        });
    }


    //返回hookKey，唯一对应一个hook  java/lang/StringBuffer|append(Lw;)V
    public static String shouldHookMethod(String className, String methodName) {
        List<MethodHook> methodHooks = HOOK_INDEX.get(className);
        if (methodHooks == null || methodHooks.isEmpty()) {
            return null;
        } else {
            if (methodName == null) {
                return className;
            } else {
                MethodHook methodHook = methodHooks.stream().filter(hook -> hook.getMethod().matcher(methodName).find()).findAny().orElse(null);
                if (methodHook == null) {
                    return null;
                } else {
                    String hookKey = className + "|" + methodName;
                    METHOD_HOOK_MAP.put(hookKey, methodHook);
                    return hookKey;
                }
            }
        }
    }


    public static MethodHook getHook(String hookKey) {
        return METHOD_HOOK_MAP.get(hookKey);
    }

    //===============================
    public static boolean retransformClasses(Class<?> c) {
        return RETRANSFORM_CLASSES_MAP.contains(c);
    }
}

package com.mhxy.agent;

import net.bytebuddy.asm.Advice;

import java.lang.reflect.Method;

public class MethodInterceptor {

    @Advice.OnMethodEnter
    static void onEnter(@Advice.Origin Method method) {
        String methodName = method.toGenericString();
        if (!PackageFilter.matches(methodName)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[AGENT] ").append(methodName);
        System.out.println(sb);
    }
}

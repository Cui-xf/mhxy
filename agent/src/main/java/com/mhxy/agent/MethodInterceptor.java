package com.mhxy.agent;

import net.bytebuddy.asm.Advice;
import net.bytebuddy.implementation.bytecode.assign.Assigner;

import java.lang.reflect.Method;

public class MethodInterceptor {

    @Advice.OnMethodEnter
    static void onEnter(
            @Advice.Origin Method method,
            @Advice.AllArguments Object[] args) {
        String methodName = method.toGenericString();
        if (!PackageFilter.matches(methodName)) {
            return;
        }
        // 构造入口行：ClassName.methodName(arg0, arg1, ...)
        StringBuilder sb = new StringBuilder();
        sb.append("[AGENT]");
        sb.append(methodName).append(" > [");
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                sb.append(args[i]);
                if (i < args.length - 1) sb.append(", ");
            }
        }
        sb.append("]");
        CallStack.push(sb.toString());
    }

    @Advice.OnMethodExit(onThrowable = Throwable.class)
    static void onExit(
            @Advice.Origin Method method,
            @Advice.Return(typing = Assigner.Typing.DYNAMIC) Object returnValue,
            @Advice.Thrown Throwable thrown) {
        String methodName = method.toGenericString();
        if (!PackageFilter.matches(methodName)) {
            return;
        }
        // 构造出口行
        StringBuilder sb = new StringBuilder();
        sb.append("[AGENT]");
        if (thrown != null) {
            sb.append("<throws ").append(thrown);
        } else if (method.getReturnType() == void.class) {
            sb.append("<return void");
        } else {
            sb.append("<return ").append(returnValue);
        }
        CallStack.pop(sb.toString());
    }
}

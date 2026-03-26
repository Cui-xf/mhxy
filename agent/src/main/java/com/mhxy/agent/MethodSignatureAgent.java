package com.mhxy.agent;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;

import java.lang.instrument.Instrumentation;

import static net.bytebuddy.matcher.ElementMatchers.*;
import static net.bytebuddy.matcher.ElementMatchers.nameStartsWith;

public class MethodSignatureAgent {

    private static final String DEFAULT_CONFIG = "./agent-packages.conf";

    public static void premain(String args, Instrumentation inst) {
        install(args, inst);
    }

    public static void agentmain(String args, Instrumentation inst) {
        install(args, inst);
    }

    private static void install(String args, Instrumentation inst) {
        String configPath = (args != null && !args.trim().isEmpty()) ? args.trim() : DEFAULT_CONFIG;
        PackageFilter.load(configPath);

        new AgentBuilder.Default()
                // 启用 retransformation：对已加载的类也重新 transform
                .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
                .with(AgentBuilder.InitializationStrategy.NoOp.INSTANCE)
                .with(AgentBuilder.TypeStrategy.Default.REDEFINE)
                // 忽略 Byte Buddy 自身及 JDK 内部类，避免无限递归
                .ignore(nameStartsWith("net.bytebuddy.")
                        .or(nameStartsWith("com.mhxy.agent."))
                        .or(nameStartsWith("sun."))
                        .or(nameStartsWith("com.sun."))
                        .or(nameStartsWith("jdk."))
                        .or(nameStartsWith("java."))
                        .or(nameStartsWith("javax."))
                        .or(nameStartsWith("org.xml."))
                        .or(nameStartsWith("org.w3c.")))
                // 匹配所有其他类
                .type(ElementMatchers.any())
                .transform((builder, typeDescription, classLoader, module, domain) ->
                        builder.visit(
                                Advice.to(MethodInterceptor.class)
                                        .on(isMethod()
                                                .and(not(isAbstract()))
                                                .and(not(isNative()))
                                                .and(not(isSynthetic()))
                                                .and(not(isBridge()))
                                        )
                        )
                )
                .installOn(inst);

        System.out.println("[MethodSignatureAgent] Agent 加载成功");
    }
}

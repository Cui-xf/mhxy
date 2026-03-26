package com.mhxy.agent;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.pool.TypePool;

import java.io.File;
import java.lang.instrument.Instrumentation;
import java.net.URL;
import java.net.URLClassLoader;

import static net.bytebuddy.matcher.ElementMatchers.isAbstract;
import static net.bytebuddy.matcher.ElementMatchers.isBridge;
import static net.bytebuddy.matcher.ElementMatchers.isMethod;
import static net.bytebuddy.matcher.ElementMatchers.isNative;
import static net.bytebuddy.matcher.ElementMatchers.isSynthetic;
import static net.bytebuddy.matcher.ElementMatchers.nameStartsWith;
import static net.bytebuddy.matcher.ElementMatchers.not;

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
                .with(AgentBuilder.TypeStrategy.Default.DECORATE)
                .with(new AgentBuilder.PoolStrategy() {
                    @Override
                    public TypePool typePool(ClassFileLocator classFileLocator, ClassLoader classLoader) {
                        return typePool(classFileLocator, classLoader, null);
                    }

                    @Override
                    public TypePool typePool(ClassFileLocator classFileLocator, ClassLoader classLoader, String s) {
                        try {
                            File libDir = new File("/Users/cxf/temp/mhxy/microemulator-2.0.4/lib");
                            File[] jars = libDir.listFiles((dir, name) -> name.endsWith(".jar"));
                            URL[] urls = new URL[jars.length];
                            for (int i = 0; i < jars.length; i++) {
                                urls[i] = jars[i].toURI().toURL();
                            }
                            // 用 URLClassLoader 加载整个 lib 目录下所有 jar
                            URLClassLoader libLoader = new URLClassLoader(urls, classLoader);
                            ClassFileLocator locator = ClassFileLocator.ForClassLoader.of(libLoader);
                            return TypePool.Default.WithLazyResolution.of(locator);
                        } catch (Exception e) {
                            return TypePool.Default.WithLazyResolution.of(classFileLocator);
                        }
                    }
                })
//                .with(AgentBuilder.Listener.StreamWriting.toSystemOut())
                // 忽略 Byte Buddy 自身及 JDK 内部类，避免无限递归
                .ignore(nameStartsWith("net.bytebuddy.")
                        .or(nameStartsWith("com.mhxy.agent."))
                        .or(nameStartsWith("sun."))
                        .or(nameStartsWith("com.sun."))
                        .or(nameStartsWith("jdk."))
                        .or(nameStartsWith("java."))
//                        .or(nameStartsWith("javax."))
                        .or(nameStartsWith("org.xml."))
                        .or(nameStartsWith("org.w3c.")))
                // 匹配所有其他类
                .type((typeDescription) -> {
//                    FileUtil.write("allPackage.txt", typeDescription.getName());
//                    boolean contains = typeDescription.getName().equals("av");
//                    if (contains) {
//                        System.out.println("[AGENT] 找到目标类" + typeDescription.getName());
//                    }
                    return PackageFilter.matchesPackage(typeDescription.getName());
                })
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

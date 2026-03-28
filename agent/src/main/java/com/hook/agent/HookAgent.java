package com.hook.agent;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarFile;

public class HookAgent {

    public static void premain(String agentArgs, Instrumentation inst) throws Exception {
        System.out.println("[HookAgent] ============================");
        System.out.println("[HookAgent] Agent loaded successfully");

        appendSelfToBootstrapClassLoader(inst);

        System.out.println("[HookAgent] Registering class transformer (retransform enabled)...");
        inst.addTransformer(new HookTransformer(), true);
        System.out.println("[HookAgent] Transformer registered");

        if (inst.isRetransformClassesSupported()) {
            retransformAlreadyLoaded(inst);
        }
        System.out.println("[HookAgent] ============================");
    }

    private static void appendSelfToBootstrapClassLoader(Instrumentation inst) throws Exception {
        Path agentJar = locateAgentJar();
        inst.appendToBootstrapClassLoaderSearch(new JarFile(agentJar.toFile()));
        System.out.println("[HookAgent] Bootstrap search appended: " + agentJar);
    }

    private static Path locateAgentJar() throws URISyntaxException {
        return Paths.get(HookAgent.class.getProtectionDomain().getCodeSource().getLocation().toURI());
    }


    private static void retransformAlreadyLoaded(Instrumentation inst) throws UnmodifiableClassException {
        List<Class<?>> batch = new ArrayList<>();
        for (Class<?> c : inst.getAllLoadedClasses()) {
            if (HookConfig.retransformClasses(c) && inst.isModifiableClass(c)) {
                batch.add(c);
                break;
            }
        }
        if (batch.isEmpty()) {
            System.out.println("[HookAgent] No already-loaded classes matched rules for retransform");
            return;
        }
        try {
            inst.retransformClasses(batch.toArray(new Class<?>[0]));
            System.out.println("[HookAgent] Retransformed " + batch.size() + " already-loaded class(es)");
        } catch (Exception e) {
            System.err.println("[HookAgent] Retransform failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

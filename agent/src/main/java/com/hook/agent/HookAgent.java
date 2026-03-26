package com.hook.agent;

import java.lang.instrument.Instrumentation;

public class HookAgent {

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("[HookAgent] ============================");
        System.out.println("[HookAgent] Agent loaded successfully");

        String configPath = (agentArgs != null && !agentArgs.isEmpty())
                ? agentArgs
                : "hook-config.txt";

        HookConfig config = HookConfig.load(configPath);
        if (config.isEmpty()) {
            System.err.println("[HookAgent] WARNING: No hook rules loaded, nothing will be hooked");
        }

        System.out.println("[HookAgent] Registering class transformer...");
        inst.addTransformer(new HookTransformer(config), false);
        System.out.println("[HookAgent] Transformer registered");
        System.out.println("[HookAgent] ============================");
    }
}

package com.hook.agent;


import com.hook.agent.hook.MethodHook;

public class HookHelper {
    public static void printEnter(String hookKey, Object[] args) {
        try {
            MethodHook hook = HookConfig.getHook(hookKey);
            if (hook == null) {
                System.err.println("[HOOK ENTER] Error，hook 不存在，hookKey = " + hookKey);
            } else {
                hook.onEnter(hookKey, args);
            }
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("[HOOK ENTER] " + hookKey + " | error: " + t);
        }
    }

    public static void printExit(String hookKey, Object ret) {
        try {
            MethodHook hook = HookConfig.getHook(hookKey);
            if (hook == null) {
                System.err.println("[HOOK Exit] Error，hook 不存在，hookKey = " + hookKey);
            } else {
                hook.onExit(hookKey, ret, null);
            }
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("[HOOK Exit] " + hookKey + " | error: " + t);
        }
    }

    public static void printExitVoid(String hookKey) {
        try {
            MethodHook hook = HookConfig.getHook(hookKey);
            if (hook == null) {
                System.err.println("[HOOK Exit] Error，hook 不存在，hookKey = " + hookKey);
            } else {
                hook.onExit(hookKey, null, null);
            }
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("[HOOK Exit] " + hookKey + " | error: " + t);
        }
    }

    public static void printExitThrow(String hookKey, Throwable ex) {
        try {
            MethodHook hook = HookConfig.getHook(hookKey);
            if (hook == null) {
                System.err.println("[HOOK Exit] Error，hook 不存在，hookKey = " + hookKey);
            } else {
                hook.onExit(hookKey, null, ex);
            }
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("[HOOK Exit] " + hookKey + " | error: " + t);
        }
    }
}

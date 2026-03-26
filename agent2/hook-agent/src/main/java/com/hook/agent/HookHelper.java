package com.hook.agent;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class HookHelper {

    private static final Gson GSON = new GsonBuilder()
            .serializeNulls()
            .disableHtmlEscaping()
            .create();

    public static void printEnter(String sig, Object[] args) {
        try {
            StringBuilder sb = new StringBuilder(256);
            sb.append("[HOOK ENTER] ").append(sig);
//            sb.append(" | Thread: ").append(Thread.currentThread().getName());
            sb.append("\n  args: ");
            appendJsonArray(sb, args);
            System.out.println(sb);
        } catch (Throwable t) {
            System.out.println("[HOOK ENTER] " + sig + " | error: " + t);
        }
    }

    public static void printExit(String sig, Object ret) {
        try {
            System.out.println("[HOOK EXIT]  \n  return: " + toJson(ret));
        } catch (Throwable t) {
            System.out.println("[HOOK EXIT]  " + sig + " | error: " + t);
        }
    }

    public static void printExitVoid(String sig) {
        System.out.println("[HOOK EXIT]  \n  return: void");
    }

    public static void printExitThrow(String sig, Throwable ex) {
        try {
            System.out.println("[HOOK EXIT]  \n  threw: "
                    + "{\"type\":\"" + ex.getClass().getName()
                    + "\",\"message\":" + GSON.toJson(ex.getMessage()) + "}");
        } catch (Throwable t) {
            System.out.println("[HOOK EXIT]  " + sig + " | error: " + t);
        }
    }

    // ========== JSON 序列化 ==========

    private static void appendJsonArray(StringBuilder sb, Object[] args) {
        sb.append('[');
        for (int i = 0; i < args.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(toJson(args[i]));
        }
        sb.append(']');
    }

    private static String toJson(Object value) {
        if (value == null) return "null";
        if (value instanceof String) return GSON.toJson(value);
        if (value instanceof Number || value instanceof Boolean) return value.toString();
        if (value instanceof Character) return GSON.toJson(value.toString());

        if (value instanceof byte[]) {
            byte[] arr = (byte[]) value;
            if (arr.length > 128) return "\"<byte[" + arr.length + "]>\"";
            return GSON.toJson(value);
        }
        if (value instanceof int[]) return GSON.toJson(value);
        if (value instanceof long[]) return GSON.toJson(value);
        if (value instanceof float[]) return GSON.toJson(value);
        if (value instanceof double[]) return GSON.toJson(value);
        if (value instanceof boolean[]) return GSON.toJson(value);
        if (value instanceof short[]) return GSON.toJson(value);
        if (value instanceof char[]) return GSON.toJson(new String((char[]) value));
        if (value instanceof Object[]) {
            StringBuilder sb = new StringBuilder("[");
            Object[] arr = (Object[]) value;
            for (int i = 0; i < arr.length; i++) {
                if (i > 0) sb.append(", ");
                sb.append(toJson(arr[i]));
            }
            return sb.append("]").toString();
        }

        return "{\"@class\":\"" + value.getClass().getName()
                + "\",\"@str\":" + GSON.toJson(value.toString()) + "}";
    }
}

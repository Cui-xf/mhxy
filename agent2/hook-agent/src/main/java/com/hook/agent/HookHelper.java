package com.hook.agent;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Vector;

public class HookHelper {

    private static final int HEX_DUMP_LIMIT = 512;

    private static final Gson GSON = new GsonBuilder()
            .serializeNulls()
            .disableHtmlEscaping()
            .create();

    public static void printEnter(String sig, Object[] args) {
        try {
            if (printNetworkPacket(sig, args)) {
                return;
            }

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

    // ========== 网络数据包专用输出 ==========

    private static boolean printNetworkPacket(String sig, Object[] args) {
        if (args == null || args.length == 0 || args[0] == null) {
            return false;
        }

        if (sig.contains("defpackage.av.a(defpackage.w)") || sig.contains(" av.a(w)")) {
            printWPacket("SEND", args[0]);
            return true;
        }
        if (sig.contains("defpackage.q.a(defpackage.w)") || sig.contains(" q.a(w)")) {
            printWPacket("RECV", args[0]);
            return true;
        }
        if (sig.contains("at.a(java.util.Vector)") || sig.contains("defpackage.at.a(java.util.Vector)")) {
            printRawSendFrames(args[0]);
            return true;
        }
        return false;
    }

    private static void printWPacket(String direction, Object wObj) {
        try {
            short packetId = readPacketId(wObj);
            byte[] payload = readByteArrayField(wObj, "b");
            Vector<?> children = readVectorField(wObj, "c");

            StringBuilder sb = new StringBuilder(512);
            sb.append("[NET ").append(direction).append("] ")
                    .append("id=0x").append(toHex4(packetId))
                    .append(" (").append(packetId & 0xFFFF).append(")")
                    .append(", payloadLen=").append(payload == null ? 0 : payload.length)
                    .append(", childCount=").append(children == null ? 0 : children.size());

            if (payload != null && payload.length > 0) {
                sb.append("\n  payload(hex):\n").append(hexDump(payload, HEX_DUMP_LIMIT));
            }
            if (children != null && !children.isEmpty()) {
                sb.append("\n  children: ").append(children.size()).append(" packets");
            }
            System.out.println(sb);
        } catch (Throwable t) {
            System.out.println("[NET " + direction + "] parse error: " + t);
        }
    }

    private static void printRawSendFrames(Object arg) {
        if (!(arg instanceof Vector)) return;
        Vector<?> frames = (Vector<?>) arg;
        StringBuilder sb = new StringBuilder(512);
        sb.append("[NET SEND RAW] frameCount=").append(frames.size());
        for (int i = 0; i < frames.size(); i++) {
            Object item = frames.elementAt(i);
            if (!(item instanceof byte[])) continue;
            byte[] frame = (byte[]) item;
            sb.append("\n  frame[").append(i).append("] len=").append(frame.length);
            sb.append("\n").append(indent(hexDump(frame, HEX_DUMP_LIMIT), "    "));
        }
        System.out.println(sb);
    }

    private static short readPacketId(Object wObj) throws Exception {
        Method m = wObj.getClass().getMethod("a");
        Object ret = m.invoke(wObj);
        if (ret instanceof Number) {
            return ((Number) ret).shortValue();
        }
        return 0;
    }

    private static byte[] readByteArrayField(Object obj, String fieldName) {
        try {
            Field f = obj.getClass().getField(fieldName);
            Object value = f.get(obj);
            return (value instanceof byte[]) ? (byte[]) value : null;
        } catch (Throwable ignore) {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    private static Vector<?> readVectorField(Object obj, String fieldName) {
        try {
            Field f = obj.getClass().getField(fieldName);
            Object value = f.get(obj);
            return (value instanceof Vector) ? (Vector<?>) value : null;
        } catch (Throwable ignore) {
            return null;
        }
    }

    private static String toHex4(short value) {
        int v = value & 0xFFFF;
        String hex = Integer.toHexString(v).toUpperCase();
        while (hex.length() < 4) hex = "0" + hex;
        return hex;
    }

    private static String hexDump(byte[] data, int limit) {
        if (data == null || data.length == 0) return "<empty>";
        int n = Math.min(data.length, Math.max(1, limit));
        StringBuilder sb = new StringBuilder(n * 4);
        for (int i = 0; i < n; i += 16) {
            int rowEnd = Math.min(i + 16, n);
            appendHexOffset(sb, i);
            sb.append("  ");
            for (int j = i; j < i + 16; j++) {
                if (j < rowEnd) {
                    int b = data[j] & 0xFF;
                    if (b < 0x10) sb.append('0');
                    sb.append(Integer.toHexString(b).toUpperCase());
                } else {
                    sb.append("  ");
                }
                if (j < i + 15) sb.append(' ');
            }
            sb.append("  |");
            for (int j = i; j < rowEnd; j++) {
                int b = data[j] & 0xFF;
                sb.append((b >= 32 && b <= 126) ? (char) b : '.');
            }
            sb.append('|');
            if (rowEnd < n) sb.append('\n');
        }
        if (n < data.length) {
            sb.append("\n... truncated ").append(data.length - n).append(" bytes");
        }
        return sb.toString();
    }

    private static void appendHexOffset(StringBuilder sb, int value) {
        String hex = Integer.toHexString(value).toUpperCase();
        for (int i = hex.length(); i < 4; i++) {
            sb.append('0');
        }
        sb.append(hex);
    }

    private static String indent(String text, String prefix) {
        if (text == null || text.isEmpty()) return prefix;
        return prefix + text.replace("\n", "\n" + prefix);
    }
}

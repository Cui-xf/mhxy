package com.hook.agent;


import com.alibaba.fastjson.JSON;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Vector;

public class HookHelper {

    private static final int HEX_DUMP_LIMIT = 512;

    public static void printEnter(String sig, Object[] args) {
        try {
            doPrintEnter(sig, args);
        } catch (Throwable t) {
            System.out.println("[HOOK ENTER] " + sig + " | error: " + t);
        }
    }

    public static void printExit(String sig, Object ret) {

    }

    public static void printExitVoid(String sig) {
    }

    public static void printExitThrow(String sig, Throwable ex) {
    }

    // ========== JSON 序列化 ==========
    private static String toJson(Object value) {
        return JSON.toJSONString(value);
    }

    // ========== 网络数据包专用输出 ==========
    private static void doPrintEnter(String sig, Object[] args) throws Exception {
        if (sig.contains("av.a(w)")) {
            System.out.println("[NET] 发送:");
            printNetworkPacket(args[0]);
        } else if (sig.contains("q.a(w)")) {
            System.out.println("[NET] 接收:");
            printNetworkPacket(args[0]);
        } else if (sig.contains("t.a(java.lang.String)")) {
            System.out.println(String.format("[HOOK LOG] %s", args[0]));
        } else {
//            System.out.printf("[HOOK ENTER] %s  args: %s%n", sig, toJson(args));
        }
    }

    private static void printNetworkPacket(Object netPacket) throws Exception {
        short packetId = readPacketId(netPacket);
        byte[] payload = readByteArrayField(netPacket, "b");
//        Vector<?> children = readVectorField(netPacket, "c");
        Vector<?> children = null;

        StringBuilder sb = new StringBuilder();
        sb.append("id=0x").append(toHex4(packetId))
                .append(" (").append(packetId & 0xFFFF).append(")")
                .append(", payloadLen=").append(payload == null ? 0 : payload.length)
                .append(", childCount=").append(children == null ? 0 : children.size());

        if (payload != null && payload.length > 0) {
            sb.append("  payload(hex):\n").append(hexDump(payload, HEX_DUMP_LIMIT));
        }
        if (children != null && !children.isEmpty()) {
            sb.append("\n  children: ").append(children.size()).append(" packets");
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
}

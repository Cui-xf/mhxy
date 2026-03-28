package com.hook.agent.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 静态注入「假收包」：与真实 Socket 收包路径一致，经 {@code defpackage.av} 私有方法 {@code b(w)} 入队，
 * 再由游戏主循环 {@code av.c()} 消费并调用 {@code q.a(w)}。参见 {@code docs/网络包协议分析.md}。
 * <p>
 * {@code w} 的语义：{@code w.a()} 为业务包 ID（short），{@code w.b} 为已剥外层帧的 payload（byte[]），
 * 与 Hook 日志一致；勿在发送侧 payload 上带 {@code AE}/{@code AF}。
 * //8193 系统消息包 code-message
 * NetPacket packet = NetPacket.builder((short) 8193).writeByte(0x81).writeUTF("啦啦啦，你好吗？").build();
 * FakeNetPacket.fake(packet);
 */
public final class FakeNetPacket {

    private FakeNetPacket() {
    }

    /**
     * 由游戏侧已构造实例
     */
    public static void setMainCanvasInstance(Object ins) {
        if (ins != null) {
            MAIN_CANVAS_INS = ins;
            System.out.println("[HookAgent]注入Main Canvas");
        }
    }

    /**
     * 将一包写入收包队列。
     */
    public static void fake(NetPacket netPacket) throws Exception {
        Object packet = buildPacket(netPacket);
        doSend(packet);
    }

    private static Object buildPacket(NetPacket packet) throws Exception {
        byte[] body = packet.payload == null ? new byte[0] : packet.payload.clone();
        return getWCtor().newInstance(packet.packetType, body);
    }

    private static void doSend(Object packet) throws Exception {
        Object av = getAvIns();
        Method b = getBMethod();
        b.invoke(av, packet);
    }

    private static Object getAvIns() throws Exception {
        Object mainCanvasIns = getMainCanvasIns();
        Field i = getIField();
        return i.get(mainCanvasIns);
    }


    //mainCanvas.i av类型的实例
    private static volatile Field iField;

    private static Field getIField() throws NoSuchFieldException {
        if (iField == null) {
            Object mainCanvasIns = getMainCanvasIns();
            iField = mainCanvasIns.getClass().getField("i");
        }
        return iField;
    }


    //av.b(w)
    private static volatile Method bMethod;

    private static Method getBMethod() throws Exception {
        if (bMethod == null) {
            ClassLoader classLoader = getClassLoader();
            Class<?> avClass = Class.forName("av", true, classLoader);
            Method t = avClass.getDeclaredMethod("b", getWClass());
            t.setAccessible(true);
            bMethod = t;
        }
        return bMethod;
    }


    private static volatile Constructor<?> wCtor;

    private static Constructor<?> getWCtor() throws Exception {
        if (wCtor == null) {
            Class<?> wClass = getWClass();
            wCtor = wClass.getConstructor(short.class, byte[].class);
        }
        return wCtor;
    }


    //com.yinhan.kjava.main.a 的实例
    private static volatile Object MAIN_CANVAS_INS;

    private static Object getMainCanvasIns() {
        if (MAIN_CANVAS_INS == null) {
            throw new RuntimeException("Main Canvas 未注入");
        }
        return MAIN_CANVAS_INS;
    }


    private static volatile Class<?> wClass;

    private static Class<?> getWClass() throws Exception {
        if (wClass == null) {
            ClassLoader classLoader = getClassLoader();
            wClass = Class.forName("w", true, classLoader);
        }
        return wClass;
    }


    private static volatile ClassLoader cl;

    private static ClassLoader getClassLoader() {
        if (cl == null) {
            cl = getMainCanvasIns().getClass().getClassLoader();
        }
        return cl;
    }

}

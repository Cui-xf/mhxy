package com.hook.agent.util;

import java.lang.reflect.Method;

/**
 * 向服务器发包
 */
public final class FakeSendNetPacket {

    private FakeSendNetPacket() {
    }

    public static void send(NetPacket netPacket) throws Exception {
        Object packet = FakeReceiveNetPacket.buildPacket(netPacket);
        Object av = FakeReceiveNetPacket.getAvIns();
        Method a = getAMethod();
        a.invoke(av, packet);
    }

    //av.a(w)
    private static volatile Method aMethod;

    private static Method getAMethod() throws Exception {
        if (aMethod == null) {
            ClassLoader classLoader = FakeReceiveNetPacket.getClassLoader();
            Class<?> avClass = Class.forName("av", true, classLoader);
            Method t = avClass.getMethod("a", FakeReceiveNetPacket.getWClass());
            aMethod = t;
        }
        return aMethod;
    }
}

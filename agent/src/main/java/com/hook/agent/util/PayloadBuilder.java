package com.hook.agent.util;

import java.lang.reflect.Method;

public class PayloadBuilder {
    public static byte[] buildChuanSong(int npcId, short mapId) throws Exception {
        Class<?> payloadBuilder = getPayloadBuilder();
        Method build = payloadBuilder.getMethod("a", short.class, String.class, int.class, short.class);
        String userName = UserInfo.getuserName();
        byte[] framed = (byte[]) build.invoke(null, (short) 4142, userName, npcId, mapId);
        if (framed == null) {
            throw new RuntimeException("构造传送payload失败");
        }
        return framed;
    }

    //bz
    private static volatile Class<?> payloadBuilder;

    private static Class<?> getPayloadBuilder() throws Exception {
        if (payloadBuilder == null) {
            ClassLoader classLoader = FakeReceiveNetPacket.getClassLoader();
            Class<?> bzClass = Class.forName("bz", true, classLoader);
            payloadBuilder = bzClass;
        }
        return payloadBuilder;
    }
}

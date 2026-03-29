package com.hook.agent.util;

import java.lang.reflect.Field;

public class UserInfo {

    public static String getuserName() throws Exception {
        Class<?> userInfo = getUserInfo();
        Field adField = userInfo.getField("ad");
        return (String) adField.get(null);
    }


    //bt
    private static volatile Class<?> userInfo;

    private static Class<?> getUserInfo() throws ClassNotFoundException {
        if (userInfo == null) {
            ClassLoader classLoader = FakeReceiveNetPacket.getClassLoader();
            Class<?> btClass = Class.forName("bt", true, classLoader);
            userInfo = btClass;
        }
        return userInfo;
    }
}

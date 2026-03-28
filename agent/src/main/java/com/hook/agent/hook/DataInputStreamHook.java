package com.hook.agent.hook;

public class DataInputStreamHook extends MethodHook {
    public DataInputStreamHook() {
//        super("java/io/DataInputStream", "read.*\\(\\)");
        super("java/io/DataInputStream", "readUTF\\(\\)");
    }

    @Override
    public void onEnter(String hookKey, Object receiver, Object[] args) {

    }

    @Override
    public void onExit(String hookKey, Object receiver, Object returnVal, Throwable ex) throws Exception {
        System.out.println(hookKey + ":" + returnVal);
    }
}

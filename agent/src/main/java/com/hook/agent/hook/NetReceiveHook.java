package com.hook.agent.hook;

public class NetReceiveHook extends MethodHook {
    public NetReceiveHook() {
        super("q", "a\\(Lw;\\)V");
    }

    @Override
    public void onEnter(String hookKey, Object[] args) throws Exception {
        System.out.println("[NET] 接收:");
        NetSendHook.printNetworkPacket(args[0]);
    }
}

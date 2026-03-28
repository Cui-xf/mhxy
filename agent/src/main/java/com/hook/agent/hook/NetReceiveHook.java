package com.hook.agent.hook;

public class NetReceiveHook extends MethodHook {
    public NetReceiveHook() {
        super("q", "a\\(Lw;\\)V");
    }

    @Override
    public void onEnter(String hookKey, Object receiver, Object[] args) throws Exception {
        System.out.println("[NET] 接收:");
        Object w = (args != null && args.length > 1) ? args[1] : (args != null && args.length > 0 ? args[0] : null);
        if (w != null) {
            NetSendHook.printNetworkPacket(w);
        }
    }
}

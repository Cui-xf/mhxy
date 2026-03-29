package com.hook.agent.hook;

import com.hook.agent.util.FakeSendNetPacket;
import com.hook.agent.util.NetPacket;
import com.hook.agent.util.PayloadBuilder;


public class HuiChengHook2 extends MethodHook {
    //点击传送
    private static final short PACKET_ID = 4142;

    public HuiChengHook2() {
        super("ao", "aZ\\(\\)V");
    }

    @Override
    public void onExit(String hookKey, Object receiver, Object returnVal, Throwable ex) throws Exception {
        if (ex != null || receiver == null) {
            return;
        }

        //npcId 7801
        //78-豆仙庭 4-长寿村 14-傲来广场 20-龙宫广场
        byte[] payload = PayloadBuilder.buildChuanSong(7801, (short) 14);
        NetPacket packet = NetPacket.builder(PACKET_ID).build(payload);
        FakeSendNetPacket.send(packet);
    }
}

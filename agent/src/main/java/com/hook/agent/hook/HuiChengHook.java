package com.hook.agent.hook;

import com.hook.agent.util.FakeReceiveNetPacket;
import com.hook.agent.util.NetPacket;

import java.io.IOException;

/**
 * 真正发起回城请求的是无参 {@code ao.aZ()}（包 {@code 0x1248}），见 {@code docs/回城逻辑分析.md}。
 * 在 {@code aZ()} 正常返回后伪造收包 {@code 0x2007}（8199），按服务端常见模式先发「空间通道」过渡包，再发目标地点包。
 * <p>
 * 注意与 {@code aZ(int)}（符文等）区分，仅匹配 {@code ()V}。
 */
public class HuiChengHook extends MethodHook {
    private static final short PACKET_MAP_SUMMARY = (short) 8199;

    public HuiChengHook() {
        super("ao", "aZ\\(\\)V");
    }

    @Override
    public void onExit(String hookKey, Object receiver, Object returnVal, Throwable ex) throws Exception {
        if (ex != null) {
            return;
        }
        fakeTeleport(14, "傲来广场", 240, 304, 1, 0, 0, 0);
//        fakeTeleport(20, "龙宫广场", 336, 256, 1, 0, 0, 0);
//        fakeTeleport(15, "傲来国沙滩", 128, 32, 0, 0, 0, 0);
//        fakeTeleport(14, "傲来广场", 256, 400, 1, 0, 0, 0);
//        fakeTeleport(4, "长寿村", 160, 336, 1, 0, 0, 0);
//        fakeTeleport(3, "小木屋", 128, 288, 1, 0, 0, 0);
    }


    private static void fakeTeleport(int mapId, String mapName, int x, int y, int av, int aw, int bw, int bx) throws Exception {
        FakeReceiveNetPacket.fake(buildTransitionPacket());
        FakeReceiveNetPacket.fake(buildMapPacket(mapId, mapName, x, y, av, aw, bw, bx));
    }

    /**
     * 真实包：
     * 00 01 00 0C E7 A9 BA E9 97 B4 E9 80 9A E9 81 93 FF F6 FF F6 00 00 00 00
     */
    private static NetPacket buildTransitionPacket() throws IOException {
        return buildMapPacket(1, "空间通道", -10, -10, 0, 0, 0, 0);
    }

    private static NetPacket buildMapPacket(int mapId, String mapName, int x, int y, int av, int aw, int bw, int bx) throws IOException {
        return NetPacket.builder(PACKET_MAP_SUMMARY).writeShort(mapId).writeUTF(mapName).writeShort(x).writeShort(y).writeByte(av).writeByte(aw).writeByte(bw).writeByte(bx).build();
    }
}

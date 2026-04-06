package com.cc;

import java.util.Vector;

//public final class w {
/**
 * 网络数据包实体：持有包码(code)、原始负载(payload)，以及多包容器场景下的子包列表(child)。
 * @see NetPacketCode
 */
public final class NetPacket {
    public boolean firstPacket = false;
    private short code;
    public byte[] payload;
    public Vector child;

    /**
     * @see NetPacketCode
     */
    public NetPacket(short code) {
        this.code = code;
        this.child = new Vector();
    }

    public NetPacket(short code, byte[] payload) {
        this.code = code;
        this.payload = payload;
    }

    public final short getCode() {
        return this.code;
    }
}

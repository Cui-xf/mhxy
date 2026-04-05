package com.cc;

import java.util.Vector;

//public final class w {
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

package com.cc;

import java.util.Vector;

//public final class w {
public final class NetPacket {
    public boolean firstPacket = false;
    private short code;
    public byte[] payload;
    public Vector child;

    public NetPacket(short var1) {
        this.code = 8192;
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

package com.hook.agent.util;


import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class NetPacket {
    public boolean firstPacket;

    public short packetType;

    public byte[] payload;

    private NetPacket(short packetType, byte[] payload) {
        this.firstPacket = false;
        this.packetType = packetType;
        this.payload = payload;
    }

    public static NetPacketBuilder builder(short packetType) {
        return new NetPacketBuilder(packetType);
    }

    public static class NetPacketBuilder {
        private short packetType;
        private ByteArrayOutputStream bos;
        private DataOutputStream dos;

        private NetPacketBuilder(short packetType) {
            this.packetType = packetType;
            this.bos = new ByteArrayOutputStream();
            this.dos = new DataOutputStream(bos);
        }

        public NetPacketBuilder writeByte(int b) throws IOException {
            dos.writeByte(b);
            return this;
        }

        public NetPacketBuilder writeShort(int s) throws IOException {
            dos.writeShort(s);
            return this;
        }

        public NetPacketBuilder writeUTF(String s) throws IOException {
            dos.writeUTF(s);
            return this;
        }

        public NetPacket build() throws IOException {
            dos.flush();
            bos.flush();
            return new NetPacket(packetType, bos.toByteArray());
        }
    }

}

package com.cc;

//public abstract class cf {
public abstract class Frame {
    public byte type;
    public FrameInfo info;

    public Frame(byte type) {
        this.type = type;
    }

    public abstract void a();
}

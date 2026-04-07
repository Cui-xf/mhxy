package com.cc.resource;

import com.cc.FrameInfo;

//public abstract class cf {
public abstract class Resource {
    /**
     * // type=0 → name + "p"   (Frame0 静态图)
     * // type=2 → name + "s"   (Frame1 动画)
     * // type=3 → name + "m"   (aw 地图对象)
     */
    public byte type;
    public FrameInfo info;

    public Resource(byte type) {
        this.type = type;
    }

    public abstract void clear();
}

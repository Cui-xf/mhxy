package com.cc;

public final class MapByteData {
    //地图数据hashKey
    public int key;
    //地图二进制数据
    public byte[] mapByteArray;

    public MapByteData(int var1, byte[] var2) {
        this.key = var1;
        this.mapByteArray = var2;
    }
}

package com.cc.resource;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

//bc
//一个精灵动画，多帧×多绘制单元，自带播放状态
public final class Animation extends Resource {
    /**
     * 色相偏移（构造时传入，透传给 Sprite 的 HSL 变换；0 表示原色）
     */
    public short hsl_h;
    /**
     * 饱和度偏移（同上）
     */
    public short hsl_s;
    /**
     * 亮度偏移（同上）
     */
    public short hsl_l;

    /**
     * 帧间隔时间（毫秒），每隔此时长切换到下一帧
     */
    public short frameInterval;
    /**
     * 上次切帧的时间戳（System.currentTimeMillis()），用于驱动帧推进
     */
    public long lastTs;
    /**
     * 当前播放帧索引（0 ~ spritePieces.length-1），循环播放
     */
    public byte currentFrameIndex;

    /**
     * 每帧的显示宽度数组（spritePieces[i] 对应的包围盒宽），由 Page 绑定后计算填入
     */
    public short[] frameW;
    /**
     * 每帧的显示高度数组（同上，包围盒高）
     */
    public short[] frameH;
    /**
     * 动画帧列表：spritePieces[frameIndex][pieceIndex]，每帧由若干 SpritePiece 叠绘组成
     */
    public SpritePiece[][] spritePieces;

    /**
     * 整体包围盒左上角 x（从 rpg 数据读入）
     */
    private short x;
    /**
     * 整体包围盒左上角 y
     */
    private short y;
    /**
     * 整体包围盒宽
     */
    private short w;
    /**
     * 整体包围盒高
     */
    private short h;

    /**
     * 第 0 帧包围盒宽的一半，用于水平居中对齐
     */
    public byte c_x;
    /**
     * 第 0 帧包围盒高，用于脚底对齐计算
     */
    public byte c_y;

    public Animation(short h, short s, short l) {
        super((byte) 2);
        this.hsl_h = h;
        this.hsl_s = s;
        this.hsl_l = l;
    }

    public Animation copy() {
        Animation var1 = new Animation((short) 0, (short) 0, (short) 0);
        var1.info = super.info;
        var1.frameInterval = this.frameInterval;
        var1.lastTs = System.currentTimeMillis();
        var1.spritePieces = this.spritePieces;
        var1.frameW = this.frameW;
        var1.frameH = this.frameH;
        var1.x = this.x;
        var1.y = this.y;
        var1.w = this.w;
        var1.h = this.h;
        var1.c_x = this.c_x;
        var1.c_y = this.c_y;
        return var1;
    }

    public final Animation a(short var1, short var2, short var3) {
        Animation var6;
        (var6 = new Animation(var1, var2, var3)).info = super.info;
        var6.frameInterval = this.frameInterval;
        var6.lastTs = System.currentTimeMillis();
        var6.spritePieces = new SpritePiece[this.spritePieces.length][];

        for (int var7 = 0; var7 < this.spritePieces.length; ++var7) {
            var6.spritePieces[var7] = new SpritePiece[this.spritePieces[var7].length];

            for (int var8 = 0; var8 < this.spritePieces[var7].length; ++var8) {
                SpritePiece[] var10000 = var6.spritePieces[var7];
                SpritePiece var4 = this.spritePieces[var7][var8];
                SpritePiece var5;
                (var5 = new SpritePiece()).spriteId = var4.spriteId;
                var5.type = var4.type;
                var5.imageSliceIndex = var4.imageSliceIndex;
                var5.transformX = var4.transformX;
                var5.transformY = var4.transformY;
                var10000[var8] = var5;
            }
        }

        var6.frameW = this.frameW;
        var6.frameH = this.frameH;
        var6.x = this.x;
        var6.y = this.y;
        var6.w = this.w;
        var6.h = this.h;
        var6.c_x = this.c_x;
        var6.c_y = this.c_y;
        return var6;
    }

    public final short c() {
        return this.spritePieces != null && this.currentFrameIndex < this.spritePieces.length ? this.x : 0;
    }

    public final short d() {
        return this.spritePieces != null && this.currentFrameIndex < this.spritePieces.length ? this.y : 0;
    }

    public final short e() {
        return this.spritePieces != null && this.currentFrameIndex < this.spritePieces.length ? this.w : 0;
    }

    public final short f() {
        return this.spritePieces != null && this.currentFrameIndex < this.spritePieces.length ? this.h : 0;
    }

    public final short g() {
        return this.frameW != null ? this.frameW[this.currentFrameIndex] : 0;
    }

    public final short h() {
        return this.frameH != null ? this.frameH[this.currentFrameIndex] : 0;
    }

    public final short i() {
        return this.frameW != null ? this.frameW[0] : 0;
    }

    public final short j() {
        return this.frameH != null ? this.frameH[0] : 0;
    }

    public void build(byte[][] bytes) {
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(bytes[0]));
        try {
            //有几段动画
            byte num = dis.readByte();
            if (num > 0) {
                this.x = dis.readShort();
                this.y = dis.readShort();
                this.w = dis.readShort();
                this.h = dis.readShort();
                this.spritePieces = new SpritePiece[num][];
                for (int i = 0; i < num; ++i) {
                    //每段有几帧
                    byte frameNum = dis.readByte();
                    if (frameNum > 0) {
                        this.spritePieces[i] = new SpritePiece[frameNum];
                        for (int j = 0; j < frameNum; ++j) {
                            SpritePiece spritePiece = new SpritePiece();
                            spritePiece.build(dis, true);
                            this.spritePieces[i][j] = spritePiece;
                        }
                    }
                }
                this.frameInterval = dis.readShort();
                this.currentFrameIndex = 0;
                this.lastTs = System.currentTimeMillis();
            }
        } catch (IOException var13) {
            ((Throwable) var13).printStackTrace();
        } finally {
            try {
                dis.close();
            } catch (IOException var12) {
            }
        }
    }

    public final void clear() {
    }
}

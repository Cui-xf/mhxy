package com.cc.resource;

import com.cc.ImageSlice;
import com.cc.Sprite;

import java.io.DataInputStream;
import java.io.IOException;

//动画帧的最小绘制单元：指定图源、切片、偏移、变换
public final class SpritePiece {
    /**
     * 引用的 Sprite id（= 对应 rpg 文件名），加载时用于查找 frame
     */
    public short spriteId;
    /**
     * 运行时关联的帧对象（Sprite 或 Animation），由 Page 加载完成后回填
     */
    public Resource frame;
    /**
     * 在 Sprite.slices[] 中的切片下标，决定取图集的哪个子区域
     */
    public short imageSliceIndex;
    /**
     * 缓存的 ImageSlice，由 a() 懒加载，避免每帧重复查找
     */
    private ImageSlice imageSliceCache;

    /**
     * 引用类型：0=Sprite 静态图，2=Animation 动画(表示一个帧动画在场景中的移动)
     */
    public byte type;

    /**
     * 绘制 x 偏移（相对动画原点，像素）
     */
    public short transformX;
    /**
     * 绘制 y 偏移（相对动画原点，像素）
     */
    public short transformY;
    /**
     * 变换标志：0-7 对应 8 种翻转/旋转（同 Graphics.drawRegion 的 transform 参数）
     */
    public byte transformFlag;

    public ImageSlice getImageSlice() {
        if (this.imageSliceCache == null && this.frame != null && this.frame.type == 0) {
            this.imageSliceCache = ((Sprite) this.frame).getImageSlice(this.imageSliceIndex);
        }
        return this.imageSliceCache == null ? new ImageSlice((short) 0, (short) 0, (short) 0, (short) 0) : this.imageSliceCache;
    }

    public void build(DataInputStream var1, boolean t) throws IOException {
        this.spriteId = var1.readShort();
        this.type = var1.readByte();
        this.transformX = var1.readShort();
        this.transformY = var1.readShort();
        this.imageSliceIndex = var1.readShort();
        this.transformFlag = var1.readByte();
    }
}

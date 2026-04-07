package com.cc.resource;

//游戏场景地图：图块网格 + 碰撞图 + 固定/动画对象
public final class TileMap extends Resource {
    /**
     * 地图总宽度（像素）
     */
    public short mapW;
    /**
     * 地图总高度（像素）
     */
    public short mapH;
    /**
     * 图块宽度（像素），用于网格绘制时的 x 步长
     */
    public byte blockW;
    /**
     * 图块高度（像素），用于网格绘制时的 y 步长
     */
    public byte blockH;
    /**
     * 碰撞格宽度（像素），用于构建碰撞图的 x 步长（可与图块宽度不同）
     */
    public byte collisionW;
    /**
     * 碰撞格高度（像素），用于构建碰撞图的 y 步长
     */
    public byte collisionH;
    /**
     * 图块列数（= a / c，向上取整）
     */
    public byte column;
    /**
     * 图块行数（= b / d，向上取整）
     */
    public byte row;
    /**
     * 碰撞图：i[col][row] == 1 表示该格不可通行
     */
    public byte[][] collisionMap;
    /**
     * 地面图块网格：j[col][row]，每格一个 SpritePiece，null 表示空格
     */
    public SpritePiece[][] mapBlock;
    /**
     * 场景固定对象列表（建筑、道具等静态元素，有绝对坐标 e/f）
     */
    public SpritePiece[] fixedObj;
    /**
     * 场景动画对象列表（引用 Animation 的动态元素，有绝对坐标 e/f）
     */
    public SpritePiece[] animationObj;
    /**
     * Sprite 变色表：m[i] = [spriteId, hue, saturation, brightness]，供 Sprite 加载时做 HSL 偏移
     */
    public short[][] spriteIdHsl;
    /**
     * 预留扩展数据（目前未使用）
     */
    public int[][] extra;

    public TileMap() {
        super((byte) 3);
    }

    public short getIndexBySpriteId(int spriteId) {
        if (this.spriteIdHsl != null) {
            for (int i = 0; i < this.spriteIdHsl.length; ++i) {
                if (this.spriteIdHsl[i][0] == spriteId) {
                    return (short) i;
                }
            }
        }
        return -1;
    }

    public final void clear() {
        this.collisionMap = null;
        if (this.mapBlock != null) {
            for (int var1 = 0; var1 < this.mapBlock.length; ++var1) {
                for (int var2 = 0; var2 < this.mapBlock[var1].length; ++var2) {
                    if (this.mapBlock[var1][var2] != null) {
                        this.mapBlock[var1][var2] = null;
                    }
                }
            }

            this.mapBlock = null;
        }

        if (this.fixedObj != null) {
            for (int var3 = 0; var3 < this.fixedObj.length; ++var3) {
                if (this.fixedObj[var3] != null) {
                    this.fixedObj[var3] = null;
                }
            }

            this.fixedObj = null;
        }

        if (this.animationObj != null) {
            for (int var4 = 0; var4 < this.animationObj.length; ++var4) {
                if (this.animationObj[var4] != null) {
                    this.animationObj[var4] = null;
                }
            }

            this.animationObj = null;
        }

    }
}

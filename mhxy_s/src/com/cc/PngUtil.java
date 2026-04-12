package com.cc;

import com.cc.resource.Animation;
import com.cc.resource.SpritePiece;
import com.cc.resource.TileMap;
import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import java.io.UnsupportedEncodingException;

//public final class ai_1 {
public final class PngUtil {
    public static final String[] pngChunks = new String[]{"sBIT", "IHDR", "PLTE", "tRNS", "IDAT"};
    public static byte[] pngHeader = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
    public static byte[] pngEnd = new byte[]{0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    private int[] g = new int[2];
    private int[] h = new int[4];
    public static final byte[] skip = defaultByte();
    private static byte[] i = new byte[]{0, 5, 3, 6, 2, 7, 1, 4};
    private int j = 0;
    private int k = 0;
    private Image l = null;
    private Graphics graphics = null;
    private int n = 0;
    private int o = 0;
    private int p = -1;
    private int q = -1;
    private int r;
    private int s;
    private int t = 16;
    private int u;
    private int v;
    private int w;
    private int x;
    private Image y;
    public int e;
    public int f;
    private Graphics z;
    private bv A = null;

    private static byte[] defaultByte() {
        try {
            return "版权归苏龙德所有".getBytes("UTF-8");
        } catch (UnsupportedEncodingException var1) {
            ((Throwable) var1).printStackTrace();
            return null;
        }
    }

    public final byte a(TileMap var1, int var2, int var3) {
        if (var1 != null && var1.collisionMap != null) {
            if (var2 >= 0 && var2 <= var1.mapW && var3 >= 0 && var3 < var1.mapH) {
                var2 /= var1.collisionW;
                var3 /= var1.collisionH;
                var2 = var2 < 0 ? 0 : (var2 >= var1.collisionMap.length ? var1.collisionMap.length - 1 : var2);
                var3 = var3 < 0 ? 0 : (var3 >= var1.collisionMap[0].length ? var1.collisionMap[0].length - 1 : var3);
                return b(var2, var3) ? 0 : var1.collisionMap[var2][var3];
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    private static boolean b(int var0, int var1) {
        if (GlobalStatus.hG != -1 && GlobalStatus.hG == GlobalStatus.mapId) {
            if (GlobalStatus.hJ != null && GlobalStatus.hK != null) {
                for (short var2 = 0; var2 < GlobalStatus.hJ.length; ++var2) {
                    if (GlobalStatus.hJ[var2] == var0 && GlobalStatus.hK[var2] == var1) {
                        return true;
                    }
                }

                return false;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //动画
    public static int animate(Animation frame1, long frameStartTs) {
        if (frame1 != null && frame1.spritePieces != null) {
            byte var3 = 0;
            if (frameStartTs - frame1.lastTs - (long) frame1.frameInterval > 0L) {
                ++frame1.currentFrameIndex;
                if (frame1.currentFrameIndex >= frame1.spritePieces.length) {
                    frame1.currentFrameIndex = 0;
                    var3 = 2;
                } else {
                    var3 = 1;
                }

                frame1.lastTs = frameStartTs;
            }

            return var3;
        } else {
            return 2;
        }
    }

    public final void a(Graphics var1, SpritePiece var2, int[] var3, int var4, int var5, int var6, int var7, int var8) {
        if (var2 != null && var2.frame != null) {
            switch (var2.frame.type) {
                case 0:
                    this.draw(var1, (Sprite) var2.frame, var3, var2.getImageSlice(), var4, var5, var6, var7, 0, var2.transformFlag);
                    return;
                case 2:
                    this.roleSelectedAnimation(var1, (Animation) ((Animation) var2.frame), var3, var4, var5, var6, var7, 0, var8);
            }
        }

    }

    private void roleSelectedAnimation(Graphics graphics, SpritePiece frame, int[] clip, int x, int y, int w, int h, int var8, int var9) {
        if (frame != null && frame.frame != null) {
            switch (frame.frame.type) {
                case 0:
                    w += frame.transformX;
                    h += frame.transformY;
                    this.draw(graphics, (Sprite) frame.frame, clip, frame.getImageSlice(), x, y, w, h, 20, frame.transformFlag);
                    return;
                case 2:
                    w += frame.transformX;
                    h += frame.transformY;
                    this.roleSelectedAnimation(graphics, (Animation) ((Animation) frame.frame), clip, x, y, w, h, 20, var9);
            }
        }

    }

    public final void draw(Graphics var1, Sprite var2, int[] clip, ImageSlice imageSlice, int x, int y, int w, int h, int topCenter, int transformFlag) {
        w -= x;
        h -= y;
        if (var2 != null && var2.image != null) {
            if (clip != null && clip[2] > 0 && clip[3] > 0) {
                if (imageSlice == null) {
                    var1.setClip(clip[0] - x, clip[1] - y, clip[2], clip[3]);
                    var1.drawRegion(var2.image, 0, 0, var2.w, var2.h, i[transformFlag], w, h, topCenter);
                } else {
                    a(var2, this.h, imageSlice);
                    short var15 = (short) this.h[0];
                    short var18 = (short) this.h[1];
                    short var19 = (short) this.h[2];
                    short var20 = (short) this.h[3];
                    if (var15 >= 0 && var15 + var19 <= var2.w && var18 >= 0 && var18 + var20 <= var2.h && var15 < var2.w && var18 < var2.h && var19 > 0 && var20 > 0) {
                        var1.setClip(clip[0] - x, clip[1] - y, clip[2], clip[3]);
                        var1.drawRegion(var2.image, var15, var18, var19, var20, i[transformFlag], w, h, topCenter);
                        var1.setClip(this.p, this.q, this.r, this.s);
                    }
                }
            } else if (imageSlice == null) {
                var1.drawRegion(var2.image, 0, 0, var2.w, var2.h, i[transformFlag], w, h, topCenter);
            } else {
                a(var2, this.h, imageSlice);
                short var14 = (short) this.h[0];
                short var11 = (short) this.h[1];
                short var12 = (short) this.h[2];
                short var13 = (short) this.h[3];
                if (var14 >= 0 && var14 + var12 <= var2.w && var11 >= 0 && var11 + var13 <= var2.h && var14 < var2.w && var11 < var2.h && var12 > 0 && var13 > 0) {
                    var1.drawRegion(var2.image, var14, var11, var12, var13, i[transformFlag], w, h, topCenter);
                }
            }
        }
    }

    public final void a(Graphics var1, Sprite var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        if (var2 != null && var2.slices != null && var4 >= 0 && var4 < var2.slices.length) {
            this.draw(var1, var2, (int[]) null, var2.slices[var4], 0, 0, var7, var8, 0, var10);
        }
    }

    public void roleSelectedAnimation(Graphics graphics, Animation animation, int[] clip, int x, int y, int w, int h, int time, int ignore) {
        if (animation != null && animation.spritePieces != null && animation.currentFrameIndex < animation.spritePieces.length && animation.spritePieces[animation.currentFrameIndex] != null) {
            if (time == 3) {
                w -= animation.g() >> 1;
                h -= animation.h() >> 1;
            } else if (time == 17) {
                w -= animation.g() >> 1;
            } else if (time == 33) {
                w -= animation.g() >> 1;
                h -= animation.h();
            } else if (time == 36) {
                h -= animation.h();
            }

            for (int i2 = 0; i2 < animation.spritePieces[animation.currentFrameIndex].length; ++i2) {
                if (animation.spritePieces[animation.currentFrameIndex][i2] != null) {
                    this.roleSelectedAnimation(graphics, (SpritePiece) animation.spritePieces[animation.currentFrameIndex][i2], clip, x, y, w, h, 20, ignore);
                }
            }
        }

    }

    public final void a(Graphics var1, SpritePiece[] var2, short var3, short var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        if (var2 != null) {
            for (int var12 = 0; var12 < var2.length; ++var12) {
                this.roleSelectedAnimation(var1, (SpritePiece) var2[var12], var5, var6, var7, var8, var9, 20, var11);
            }

        }
    }

    public final void a(int var1, int var2, int var3, int var4) {
        int var5 = (var3 + this.t - 1) / this.t * this.t;
        int var6 = (var4 + this.t - 1) / this.t * this.t;
        this.n = -1;
        this.o = -1;
        if (this.l == null) {
            this.l = Image.createImage(var5 + 2 * this.t, var6 + 2 * this.t);
            this.graphics = this.l.getGraphics();
        }

        this.p = var1;
        this.q = var2;
        this.r = var3;
        this.s = var4;
        this.j = var5 + 2 * this.t;
        this.k = var6 + 2 * this.t;
    }

    private void a(TileMap var1, int var2, int var3, int var4, int var5, boolean var6) {
        this.graphics.setClip(0, 0, this.j, this.k);
        if (this.n == -1 && this.o == -1) {
            this.a(this.graphics, var1, var2 - this.t, var3 - this.t, var5, var6);
            this.n = var2;
            this.o = var3;
        } else if (this.n - var2 >= this.t) {
            this.n -= this.t;

            for (int var8 = this.j / this.t; var8 > 0; --var8) {
                this.graphics.setClip(var8 * this.t, 0, this.t, this.k);
                this.graphics.drawImage(this.l, this.t, 0, 0);
            }

            this.graphics.setClip(0, 0, this.t, this.k);
            this.a(this.graphics, var1, this.n - this.t, this.o - this.t, var5, var6);
        } else if (this.n - var2 <= -this.t) {
            this.n += this.t;
            this.graphics.setClip(0, 0, this.j - this.t, this.k);
            this.graphics.drawImage(this.l, -this.t, 0, 0);
            this.graphics.setClip(this.j - this.t, 0, this.t, this.k);
            this.a(this.graphics, var1, this.n - this.t, this.o - this.t, var5, var6);
        } else if (this.o - var3 < this.t) {
            if (this.o - var3 <= -this.t) {
                this.o += this.t;
                this.graphics.setClip(0, 0, this.j, this.k - this.t);
                this.graphics.drawImage(this.l, 0, -this.t, 0);
                this.graphics.setClip(0, this.k - this.t, this.j, this.t);
                this.a(this.graphics, var1, this.n - this.t, this.o - this.t, var5, var6);
            }

        } else {
            this.o -= this.t;

            for (int var7 = this.k / this.t; var7 > 0; --var7) {
                this.graphics.setClip(0, var7 * this.t, this.j, this.t);
                this.graphics.drawImage(this.l, 0, this.t, 0);
            }

            this.graphics.setClip(0, 0, this.j, this.t);
            this.a(this.graphics, var1, this.n - this.t, this.o - this.t, var5, var6);
        }
    }

    public final void a(Graphics var1, TileMap var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
        var1.setClip(this.p, this.q, var2.mapW < this.r ? var2.mapW : this.r, var2.mapH < this.s ? var2.mapH : this.s);
        this.a(var2, var3, var4, 0, 0, true);
        var1.setClip(this.p, this.q, var2.mapW < this.r ? var2.mapW : this.r, var2.mapH < this.s ? var2.mapH : this.s);
        var1.drawImage(this.l, this.p + (this.n - var3) - this.t, this.q + (this.o - var4) - this.t, 0);
        var1.setClip(0, 0, this.j, this.k);
    }

    public final void a(Graphics var1, TileMap var2, int var3, int var4) {
        if (GlobalConfig.defaultWidth - var2.mapW > 0) {
            var1.setClip((GlobalConfig.defaultWidth - var2.mapW) / 2, this.q, var2.mapW, var2.mapH);
        } else {
            var1.setClip(this.p, this.q, this.r, this.s);
        }

        var1.drawImage(this.l, this.p + (this.n - var3) - this.t, this.q + (this.o - var4) - this.t, 0);
        var1.setClip(0, 0, this.j, this.k);
    }

    public final void a(TileMap var1, int var2, int var3, boolean var4) {
        this.n = -1;
        this.o = -1;
        if (this.p != 0 || this.q != 0) {
            this.graphics.setColor(0);
            this.graphics.fillRect(0, 0, this.j, this.k);
        }

        this.a(var1, var2, var3, 0, 0, false);
        if (GameSceneController.A != null) {
            MainCanvas.pngUtil.graphics.drawImage(GameSceneController.A, this.j - GameSceneController.A.getWidth() >> 1, this.k - GameSceneController.A.getHeight() - 16 >> 1, 20);
        }

        LoadingPage.fillRect(this.graphics, 4017771, 159, 0, 0, this.j, this.k);
    }

    public final void a(TileMap var1, int var2, int var3, boolean var4, boolean var5, int var6) {
        this.n = -1;
        this.o = -1;
        if (this.p != 0 || this.q != 0) {
            this.graphics.setColor(0);
            this.graphics.fillRect(0, 0, this.j, this.k);
        }

        this.a(var1, var2, var3, 0, 0, var4);
        if (var5) {
            LoadingPage.fillRect(this.graphics, var6, 175, 0, 0, this.j, this.k);
        }

    }

    private void a(Graphics var1, TileMap var2, int var3, int var4, int var5, boolean var6) {
        this.u = Math.max(0, var3 / var2.blockW + var1.getClipX() / var2.blockW);
        this.v = Math.max(0, var4 / var2.blockH + var1.getClipY() / var2.blockH);
        this.w = Math.min(var2.column, this.u + var1.getClipWidth() / var2.blockW + 1);
        this.x = Math.min(var2.row, this.v + var1.getClipHeight() / var2.blockH + 1);
        if (var2.mapBlock != null) {
            for (int var7 = this.u; var7 < this.w; ++var7) {
                for (int var8 = this.v; var8 < this.x; ++var8) {
                    if (var2.mapBlock[var7][var8] != null && var7 * var2.blockW - var3 + var2.blockW - var1.getClipX() > 0 && var7 * var2.blockW - var3 - var1.getClipX() < var1.getClipWidth() && var8 * var2.blockH - var4 + var2.blockH - var1.getClipY() > 0 && var8 * var2.blockH - var4 - var1.getClipY() < var1.getClipHeight()) {
                        if (b(var7, var8) && GlobalStatus.hH != null) {
                            this.a(var1, GlobalStatus.hH, (int[]) null, GlobalStatus.hI, 0, 0, var7 * var2.blockW - var3, var8 * var2.blockH - var4, 0, var5);
                        } else {
                            this.a(var1, var2.mapBlock[var7][var8], (int[]) null, 0, 0, var7 * var2.blockW - var3, var8 * var2.blockH - var4, var5);
                        }
                    }
                }
            }
        }

        if (var2.fixedObj != null) {
            for (int var9 = 0; var9 < var2.fixedObj.length; ++var9) {
                if (var2.fixedObj[var9] != null) {
                    this.a(var2.fixedObj[var9], this.g);
                    if (var2.fixedObj[var9].transformX - var3 + this.g[0] - var1.getClipX() > 0 && var2.fixedObj[var9].transformX - var3 - var1.getClipX() < var1.getClipWidth() && var2.fixedObj[var9].transformY - var4 + this.g[1] - var1.getClipY() > 0 && var2.fixedObj[var9].transformY - var4 - var1.getClipY() < var1.getClipHeight()) {
                        this.a(var1, var2.fixedObj[var9], (int[]) null, var3, var4, var2.fixedObj[var9].transformX, var2.fixedObj[var9].transformY, var5);
                    }
                }
            }
        }

        if (var2.animationObj != null) {
            for (int var10 = 0; var10 < var2.animationObj.length; ++var10) {
                if (var2.animationObj[var10] != null && var2.animationObj[var10].frame != null && (var2.animationObj[var10].frame.type != 2 || ((Animation) var2.animationObj[var10].frame).spritePieces == null || ((Animation) var2.animationObj[var10].frame).spritePieces.length <= 1)) {
                    this.a(var2.animationObj[var10], this.g);
                    if (var2.animationObj[var10].transformX - var3 + this.g[0] - var1.getClipX() > 0 && var2.animationObj[var10].transformX - var3 - var1.getClipX() < var1.getClipWidth() && var2.animationObj[var10].transformY - var4 + this.g[1] - var1.getClipY() > 0 && var2.animationObj[var10].transformY - var4 - var1.getClipY() < var1.getClipHeight()) {
                        this.a(var1, var2.animationObj[var10], (int[]) null, var3, var4, var2.animationObj[var10].transformX, var2.animationObj[var10].transformY, var5);
                    }
                }
            }
        }

        if (GlobalStatus.npcObjects != null && var6) {
            for (int var11 = 0; var11 < GlobalStatus.npcObjects.length; ++var11) {
                if (GlobalStatus.npcObjects[var11] != null) {
                    if (GameSceneController.aW[3] == 0 && GlobalStatus.npcObjects[var11].npcName != null) {
                        var1.setFont(GlobalConfig.font2);
                        LoadingPage.drawString(var1, (String) GlobalStatus.npcObjects[var11].npcName, (int) (GlobalStatus.npcObjects[var11].c - var3), GlobalStatus.npcObjects[var11].d - (GlobalStatus.npcObjects[var11].frame1 == null ? 30 : GlobalStatus.npcObjects[var11].frame1.j()) - GlobalConfig.font2_h - var4, 17, 255, 16777215);
                    }

                    if (GlobalStatus.npcObjects[var11].frame1 != null && GlobalStatus.npcObjects[var11].frame1.spritePieces != null && GameSceneController.aW[10] == 1) {
                        this.a(var1, GlobalStatus.npcObjects[var11].frame1.spritePieces[GlobalStatus.npcObjects[var11].frame1.currentFrameIndex], GlobalStatus.npcObjects[var11].frame1.g(), GlobalStatus.npcObjects[var11].frame1.h(), (int[]) null, var3, var4, GlobalStatus.npcObjects[var11].c, GlobalStatus.npcObjects[var11].d, 20, var5);
                        var1.setFont(GlobalConfig.font2);
                    }
                }
            }
        }

    }

    public final void a(TileMap var1, int var2) {
        this.e = var1.mapW / var2;
        this.f = var1.mapH / var2;
        this.y = Image.createImage(this.e, this.f);
        this.z = this.y.getGraphics();
        this.z.setColor(8487297);
        this.z.fillRect(0, 0, this.e, this.f);
        this.z.setColor(352261);
        if (var1.collisionMap != null) {
            for (int var3 = 0; var3 < var1.collisionMap.length; ++var3) {
                for (int var4 = 0; var4 < var1.collisionMap[var3].length; ++var4) {
                    if (var1.collisionMap[var3][var4] == 1) {
                        this.z.fillRect(var3 * var1.collisionW / var2, var4 * var1.collisionH / var2, 2, 2);
                    }
                }
            }
        }

    }

    public final void a() {
        this.y = null;
        this.z = null;
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        if (this.y != null) {
            var1.drawRegion(this.y, 0, 0, this.e, this.f, 0, 2, var5, 0);
            var1.setColor(0);
            var1.drawRect(1, var5 - 1, this.e + 1, this.f + 1);
            var1.setColor(16711680);
            var1.fillRect(var2 + 2, var5 + var3, var6, var7);
        }

    }

    public final void a(SpritePiece var1, int[] var2) {
        if (var1.frame != null) {
            switch (var1.frame.type) {
                case 0:
                    Sprite var10000 = (Sprite) var1.frame;
                    int[] var10001 = this.g;
                    ImageSlice var5 = ((Sprite) var1.frame).getImageSlice(var1.imageSliceIndex);
                    int[] var4 = var10001;
                    Sprite var3 = var10000;
                    if (var10000 != null) {
                        if (var5 == null) {
                            var4[0] = var3.w;
                            var4[1] = var3.h;
                        } else {
                            var4[0] = var5.w;
                            var4[1] = var5.h;
                        }
                    }

                    int var10002 = this.g[0];
                    int var6 = this.g[1];
                    int var7 = var10002;
                    switch (var1.transformFlag) {
                        case 0:
                            var2[0] = var7;
                            var2[1] = var6;
                            return;
                        case 1:
                            var2[0] = var6;
                            var2[1] = var7;
                            return;
                        case 2:
                            var2[0] = var7;
                            var2[1] = var6;
                            return;
                        case 3:
                            var2[0] = var6;
                            var2[1] = var7;
                            return;
                        case 4:
                            var2[0] = var7;
                            var2[1] = var6;
                            return;
                        case 5:
                            var2[0] = var6;
                            var2[1] = var7;
                            return;
                        case 6:
                            var2[0] = var7;
                            var2[1] = var6;
                            return;
                        case 7:
                            var2[0] = var6;
                            var2[1] = var7;
                            return;
                        default:
                            var2[0] = var7;
                            var2[1] = var6;
                            return;
                    }
                case 2:
                    a((Animation) var1.frame, var2);
                    return;
                default:
                    var2[0] = 0;
                    var2[1] = 0;
            }
        }
    }

    private static void a(Sprite var0, int[] var1, ImageSlice var2) {
        if (var0 != null) {
            if (var2 == null) {
                var1[0] = 0;
                var1[1] = 0;
                var1[2] = var0.w;
                var1[3] = var0.h;
                return;
            }

            var1[0] = var2.x;
            var1[1] = var2.y;
            var1[2] = var2.w;
            var1[3] = var2.h;
        }

    }

    public static void a(Animation var0, int[] var1) {
        if (var0 != null) {
            var1[0] = var0.g();
            var1[1] = var0.h();
        }

    }

    public static boolean a(int[] var0, int[] var1) {
        return Math.abs(var0[0] + var0[2] / 2 - (var1[0] + var1[2] / 2)) < var0[2] / 2 + var1[2] / 2 && Math.abs(var0[1] + var0[3] / 2 - (var1[1] + var1[3] / 2)) < var0[3] / 2 + var1[3] / 2;
    }

    public final void a(int[] var1, int[] var2, int[] var3) {
        int var5;
        if ((var5 = var2[0] >= var1[0] && var2[0] + var2[2] <= var1[0] + var1[2] && var2[1] >= var1[1] && var2[1] + var2[3] <= var1[1] + var1[3] ? -1 : (var1[0] >= var2[0] && var1[0] + var1[2] <= var2[0] + var2[2] && var1[1] >= var2[1] && var1[1] + var1[3] <= var2[1] + var2[3] ? 1 : 0)) != 0) {
            if (var5 == -1) {
                var3[0] = var2[0];
                var3[1] = var2[1];
                var3[2] = var2[2];
                var3[3] = var2[3];
            } else {
                var3[0] = var1[0];
                var3[1] = var1[1];
                var3[2] = var1[2];
                var3[3] = var1[3];
            }
        } else {
            int[] var10000 = var1;
            var1 = var3;
            int[] var4 = var2;
            int[] var6 = var10000;
            if (var10000[0] <= var2[0]) {
                if (var2[0] <= var6[0] + var6[2]) {
                    int var8;
                    if (var2[0] + var2[2] <= var6[0] + var6[2]) {
                        var8 = var2[2];
                    } else {
                        var8 = var6[0] + var6[2] - var2[0];
                    }

                    if (var4[1] < var6[1] && var4[1] + var4[3] > var6[1]) {
                        int var10;
                        if (var6[1] + var6[3] <= var4[1] + var4[3]) {
                            var10 = var6[3];
                        } else {
                            var10 = var4[1] + var4[3] - var6[1];
                        }

                        var1[0] = var4[0];
                        var1[1] = var6[1];
                        var1[2] = var8;
                        var1[3] = var10;
                    }

                    if (var4[1] >= var6[1] && var4[1] <= var6[1] + var6[3]) {
                        int var11;
                        if (var4[1] + var4[3] <= var6[1] + var6[3]) {
                            var11 = var4[3];
                        } else {
                            var11 = var6[1] + var6[3] - var4[1];
                        }

                        var1[0] = var4[0];
                        var1[1] = var4[1];
                        var1[2] = var8;
                        var1[3] = var11;
                    }

                    return;
                }
            } else if (var6[0] <= var2[0] + var2[2]) {
                int var9;
                if (var6[0] + var6[2] <= var2[0] + var2[2]) {
                    var9 = var6[2];
                } else {
                    var9 = var2[0] + var2[2] - var6[0];
                }

                if (var4[1] < var6[1] && var4[1] + var4[3] > var6[1]) {
                    int var12;
                    if (var6[1] + var6[3] <= var4[1] + var4[3]) {
                        var12 = var6[3];
                    } else {
                        var12 = var4[1] + var4[3] - var6[1];
                    }

                    var1[0] = var6[0];
                    var1[1] = var6[1];
                    var1[2] = var9;
                    var1[3] = var12;
                }

                if (var4[1] >= var6[1] && var4[1] <= var6[1] + var6[3]) {
                    int var13;
                    if (var4[1] + var4[3] <= var6[1] + var6[3]) {
                        var13 = var4[3];
                    } else {
                        var13 = var6[1] + var6[3] - var4[1];
                    }

                    var1[0] = var6[0];
                    var1[1] = var4[1];
                    var1[2] = var9;
                    var1[3] = var13;
                }
            }

        }
    }

    public final boolean a(int var1, int var2) {
        if (GlobalStatus.ij != null) {
            for (int var3 = 0; var3 < GlobalStatus.ij.size(); ++var3) {
                this.A = (bv) GlobalStatus.ij.elementAt(var3);
                if (this.A.d != null && var1 >= this.A.e + this.A.d.c() && var1 <= this.A.e + this.A.d.c() + this.A.d.e() && var2 >= this.A.f + this.A.d.d() && var2 <= this.A.f + this.A.d.d() + this.A.d.f()) {
                    return true;
                }
            }
        }

        return false;
    }
}

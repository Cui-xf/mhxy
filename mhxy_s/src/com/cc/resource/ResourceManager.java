package com.cc.resource;

import com.cc.*;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public final class ResourceManager {
    private String name;
    private String path;
    private Vector frameCache = new Vector();
    private FrameInfo[] frameInfos;
    //地图资源id
    private Vector mapResSpriteIdCache = new Vector();

    public ResourceManager(String path, String name) {
        this.name = name;
        this.path = path;
        this.loadFrameInfo();
    }

    public ResourceManager(String name, byte[] frameInfo) {
        this.name = name;
        this.path = "/" + this.name + "/";
        this.loadFrameInfo(frameInfo);
    }

    private void loadFrameInfo(byte[] bytes) {
        ByteArrayInputStream var15 = new ByteArrayInputStream(bytes);
        DataInputStream var16 = new DataInputStream(var15);
        try {
            short num = var16.readShort();
            this.frameInfos = new FrameInfo[num];
            for (int i = 0; i < num; ++i) {
                this.frameInfos[i] = new FrameInfo(var16.readInt(), var16.readShort());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                var15.close();
                var16.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadFrameInfo() {
        InputStream resourceAsStream = null;
        DataInputStream dataInputStream = null;
        try {
            resourceAsStream = getClass().getResourceAsStream("/" + this.name + ".rule");
            dataInputStream = new DataInputStream(resourceAsStream);
            int size = dataInputStream.readShort();
            this.frameInfos = new FrameInfo[size];
            for (int i = 0; i < size; i++) {
                this.frameInfos[i] = new FrameInfo(dataInputStream.readInt(), dataInputStream.readShort());
            }
            resourceAsStream.close();
            dataInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("loadRule error");
        } finally {
            try {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void loadResource() {
        InputStream resourceStream = null;
        DataInputStream dataInputStream = null;
        try {
            resourceStream = this.getClass().getResourceAsStream(this.path + this.name + ".rpg");
            dataInputStream = new DataInputStream(resourceStream);
            //skip前缀
            dataInputStream.read(PngUtil.skip);
            for (int i = 0; i < this.frameInfos.length; ++i) {
                byte type = dataInputStream.readByte();
                byte num = dataInputStream.readByte();
                byte[][] data = new byte[num][];
                for (int j = 0; j < num; ++j) {
                    int size = dataInputStream.readInt();
                    data[j] = new byte[size];
                    dataInputStream.read(data[j]);
                }
                if (type == 0) {
                    Sprite sprite = buildSprite(data, (short) 0, (short) 0, (short) 0);
                    sprite.info = this.frameInfos[i];
                    this.frameCache.addElement(sprite);
                } else {
                    Animation animation = buildAnimation(data, (short) 0, (short) 0, (short) 0);
                    animation.info = this.frameInfos[i];
                    this.frameCache.addElement(animation);
                }
            }

            for (int i = 0; i < this.frameCache.size(); ++i) {
                Resource frame = (Resource) this.frameCache.elementAt(i);
                if (frame.type == 2) {
                    this.boundCal(((Animation) frame), (short) 0, (short) 0, (short) 0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("loadRpg error");
        } finally {
            try {
                if (resourceStream != null) {
                    resourceStream.close();
                }
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static Animation buildAnimation(byte[][] bytes, short h, short s, short l) {
        Animation animation = new Animation(h, s, l);
        animation.build(bytes);
        return animation;
    }

    private static Sprite buildSprite(byte[][] frameData, int h, int s, int l) {
        Sprite sprite = new Sprite(h, s, l);
        DataInputStream is1 = new DataInputStream(new ByteArrayInputStream(frameData[1]));
        DataInputStream is2 = null;
        try {
            sprite.w = (short) is1.readInt();
            sprite.h = (short) is1.readInt();
            if (frameData[0] != null && frameData[0].length > 4) {
                is2 = new DataInputStream(new ByteArrayInputStream(frameData[0], 2, frameData[0].length - 2));
                int len = is2.readByte();
                if (len == 0) {
                    sprite.slices = new ImageSlice[1];
                    sprite.slices[0] = new ImageSlice((short) 0, (short) 0, sprite.w, sprite.h);
                } else {
                    sprite.slices = new ImageSlice[len];
                    for (int i = 0; i < len; i++) {
                        sprite.slices[i] = new ImageSlice(is2.readShort(), is2.readShort(), is2.readShort(), is2.readShort());
                    }
                }
            } else {
                sprite.slices = new ImageSlice[1];
                sprite.slices[0] = new ImageSlice((short) 0, (short) 0, sprite.w, sprite.h);
            }
            sprite.createImage(frameData, true);
            return sprite;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("buildFrame0");
        } finally {
            try {
                if (is1 != null) {
                    is1.close();
                }
                if (is2 != null) {
                    is2.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    //计算动画每帧边界
    private void boundCal(Animation animation, short h, short s, short l) {
        if (animation.spritePieces != null) {
            if (animation.frameW == null || animation.frameH == null) {
                animation.frameW = new short[animation.spritePieces.length];
                animation.frameH = new short[animation.spritePieces.length];

                for (int i = 0; i < animation.spritePieces.length; ++i) {
                    if (animation.spritePieces[i] != null) {
                        for (int j = 0; j < animation.spritePieces[i].length; ++j) {
                            if (animation.spritePieces[i][j] != null && animation.spritePieces[i][j].frame == null) {
                                animation.spritePieces[i][j].frame = this.getSpriteByIdFromCache(animation.spritePieces[i][j].spriteId, h, s, l);
                            }
                        }
                        SpritePiece[] pieces = animation.spritePieces[i];
                        if (pieces != null) {
                            int x1 = 0;
                            int y1 = 0;
                            int x2 = 0;
                            int y2 = 0;
                            ImageSlice imageSlice = null;
                            SpritePiece piece = pieces[0];
                            if (piece != null && piece.frame != null) {
                                if (piece.frame.type == 0) {
                                    imageSlice = ((Sprite) piece.frame).getImageSlice(piece.imageSliceIndex);
                                }
                                x1 = piece.transformX;
                                y1 = piece.transformY;
                                x2 = piece.transformX + (imageSlice == null ? 0 : imageSlice.w);
                                y2 = piece.transformY + (imageSlice == null ? 0 : imageSlice.h);
                            }

                            for (int j = 0; j < pieces.length; ++j) {
                                SpritePiece t = pieces[j];
                                if (piece.frame != null && piece.frame.type == 0) {
                                    imageSlice = ((Sprite) t.frame).getImageSlice(t.imageSliceIndex);
                                }

                                x1 = Math.min(t.transformX, x1);
                                y1 = Math.min(y1, t.transformY);
                                x2 = Math.max(x2, t.transformX + (imageSlice == null ? 0 : imageSlice.w));
                                y2 = Math.max(y2, t.transformY + (imageSlice == null ? 0 : imageSlice.h));
                            }
                            animation.frameW[i] = (short) Math.abs(x2 - x1);
                            animation.frameH[i] = (short) Math.abs(y2 - y1);
                        }
                    }
                }

                if (animation.frameW != null) {
                    animation.c_x = (byte) (animation.frameW[0] / 2);
                    animation.c_y = (byte) animation.frameH[0];
                }
            }
        }
    }

    public Vector getFrameCache() {
        return this.frameCache;
    }

    public short getFrameSize() {
        return (short) this.frameCache.size();
    }

    public void clearAllFrame() {
        this.frameCache.removeAllElements();
    }

    public void removeFrameByKey(int key) {
        for (int i = 0; i < this.frameCache.size(); ++i) {
            Resource resource = (Resource) this.frameCache.elementAt(i);
            if (resource.info != null && resource.info.key == key) {
                this.frameCache.removeElement(resource);
                return;
            }
        }
    }

    public boolean isFrameCached(int key) {
        for (int i = 0; i < this.frameCache.size(); ++i) {
            Resource resource = (Resource) this.frameCache.elementAt(i);
            if (resource.info != null && resource.info.key == key) {
                return true;
            }
        }
        return false;
    }

    public Sprite getSpriteByNameFromCache(String name) {
        if (name != null) {
            name = wrapName(name, (byte) 0);
            int key = hashKey(name.toCharArray());
            for (int i = 0; i < this.frameCache.size(); ++i) {
                Object o = this.frameCache.elementAt(i);
                if (o instanceof Sprite) {
                    Sprite frame0 = (Sprite) o;
                    if (frame0.info != null && frame0.info.key == key) {
                        return frame0;
                    }
                }
            }
        }
        return null;
    }

    private Sprite getSpriteByIdFromCache(short id, short h, short s, short l) {
        for (int i = 0; i < this.frameCache.size(); ++i) {
            Object object = this.frameCache.elementAt(i);
            if (object instanceof Sprite) {
                Sprite sprite = (Sprite) object;
                if (sprite.info != null && sprite.info.id == id && sprite.H == h && sprite.S == s && sprite.L == l) {
                    return sprite;
                }
            }
        }
        return null;
    }

    public Animation getAnimationByNameFromCache(String name) {
        name = wrapName(name, (byte) 2);
        return this.getAnimationByKeyFromCache((int) hashKey(name.toCharArray()), (short) 0, (short) 0, (short) 0);
    }

    public Animation getAnimationByKeyFromCache(int key, short h, short s, short l) {
        Animation animation;
        for (int var6 = 0; var6 < this.frameCache.size(); ++var6) {
            if (this.frameCache.elementAt(var6) instanceof Animation && (animation = (Animation) this.frameCache.elementAt(var6)).info != null && animation.info.key == key && animation.hsl_h == h && animation.hsl_s == s && animation.hsl_l == l) {
                return animation;
            }
        }
        return null;
    }

    public Animation getAnimationByNameFromCache(String name, short h, short s, short l) {
        name = wrapName(name, (byte) 2);
        return this.getAnimationByKeyFromCache(hashKey(name.toCharArray()), h, s, l);
    }

    public Animation getAnimationByKeyFromCache(int key) {
        return this.getAnimationByKeyFromCache((int) key, (short) 0, (short) 0, (short) 0);
    }

    private Animation getAnimationByIdFromCache(short id, short h, short s, short l) {
        for (int i = 0; i < this.frameCache.size(); i++) {
            Resource resource = (Resource) this.frameCache.elementAt(i);
            if (resource.type == 2 && resource.info != null && resource.info.id == id) {
                Animation animation = (Animation) resource;
                if (animation.hsl_h == h && animation.hsl_s == s && animation.hsl_l == l) {
                    return animation;
                }
            }
        }
        return null;
    }

    private static int[] batchHashKey(Vector names, byte type) {
        int[] ids = new int[names.size()];

        for (int i = 0; i < names.size(); ++i) {
            ids[i] = buildResourceId((String) names.elementAt(i), type);
        }

        return ids;
    }

    private static int[] batchHashKey(String[] names, byte type) {
        int[] ids = new int[names.length];
        for (int i = 0; i < names.length; ++i) {
            if (names[i].equals("")) {
                ids[i] = -1;
            } else {
                ids[i] = buildResourceId((String) names[i], type);
            }
        }

        return ids;
    }

    public static int hashKey(char[] name) {
        int var1 = name.length;
        int var2 = 0;
        int var3 = 0;

        for (int var4 = 0; var4 < var1; ++var4) {
            var3 = var3 * 31 + name[var2++];
        }

        return var3;
    }

    public static int buildResourceId(String name, byte type) {
        return hashKey(wrapName(name, type).toCharArray());
    }

    public static String wrapName(String str, byte b) {
        if (b == 0) {
            str = str + "p";
        } else if (b == 2) {
            str = str + "s";
        } else if (b == 3) {
            str = str + "m";
        }
        return str;
    }


    public TileMap buildTileMap(byte[] data) {
        TileMap tileMap = loadTileMap(parseTileMapData(data));
        this.loadTileMapSpritesToCache(tileMap);
        short[] var3 = this.collectAnimationSpriteIds(tileMap);
        this.batchLoadFrame1ToCache((short[]) var3, (short[]) null, (short[]) null, (short[]) null);
        this.bindTileMapFrames(tileMap);
        return tileMap;
    }

    private static byte[][] parseTileMapData(byte[] bytes) {
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(bytes));
        byte[][] result = null;
        try {
            dis.readShort();
            dis.readByte();
            byte count = dis.readByte();
            result = new byte[count][];
            for (int i = 0; i < count; ++i) {
                int len = dis.readInt();
                result[i] = new byte[len];
                dis.read(result[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dis.close();
            } catch (IOException e) {
            }
        }
        return result;
    }

    private static TileMap loadTileMap(byte[][] data) {
        TileMap tileMap = new TileMap();
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(data[0]));

        try {
            tileMap.spriteIdHsl = new short[dis.readByte()][4];
            for (int i = 0; i < tileMap.spriteIdHsl.length; ++i) {
                tileMap.spriteIdHsl[i][0] = dis.readShort();
                tileMap.spriteIdHsl[i][1] = dis.readShort();
                tileMap.spriteIdHsl[i][2] = dis.readShort();
                tileMap.spriteIdHsl[i][3] = dis.readShort();
            }

            tileMap.mapW = dis.readShort();
            tileMap.mapH = dis.readShort();
            tileMap.blockW = dis.readByte();
            tileMap.blockH = dis.readByte();
            tileMap.collisionW = dis.readByte();
            tileMap.collisionH = dis.readByte();
            tileMap.column = (byte) (tileMap.mapW / tileMap.blockW + (tileMap.mapW % tileMap.blockW == 0 ? 0 : 1));
            tileMap.row = (byte) (tileMap.mapH / tileMap.blockH + (tileMap.mapH % tileMap.blockH == 0 ? 0 : 1));
            int collisionCols = tileMap.mapW / tileMap.collisionW + (tileMap.mapW % tileMap.collisionW == 0 ? 0 : 1);
            int collisionRows = tileMap.mapH / tileMap.collisionH + (tileMap.mapH % tileMap.collisionH == 0 ? 0 : 1);
            tileMap.collisionMap = new byte[collisionCols][collisionRows];
            short collisionCount = dis.readShort();
            short[] collisionIds = new short[collisionCount];
            for (int i = 0; i < collisionCount; ++i) {
                collisionIds[i] = dis.readShort();
                tileMap.collisionMap[collisionIds[i] % collisionCols][collisionIds[i] / collisionCols] = 1;
            }

            tileMap.mapBlock = new SpritePiece[tileMap.column][tileMap.row];
            for (int col = 0; col < tileMap.mapBlock.length; ++col) {
                for (int row = 0; row < tileMap.mapBlock[col].length; ++row) {
                    if (dis.readByte() >= 0) {
                        tileMap.mapBlock[col][row] = new SpritePiece();
                        tileMap.mapBlock[col][row].build(dis, true);
                    }
                }
            }

            short fixedObjCount;
            if ((fixedObjCount = dis.readShort()) > 0) {
                tileMap.fixedObj = new SpritePiece[fixedObjCount];
                for (int i = 0; i < fixedObjCount; ++i) {
                    tileMap.fixedObj[i] = new SpritePiece();
                    tileMap.fixedObj[i].build(dis, true);
                }
            }

            short animObjCount;
            if ((animObjCount = dis.readShort()) > 0) {
                tileMap.animationObj = new SpritePiece[animObjCount];
                for (int i = 0; i < animObjCount; ++i) {
                    tileMap.animationObj[i] = new SpritePiece();
                    tileMap.animationObj[i].build(dis, true);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return tileMap;
    }

    public TileMap loadTileMapByName(String id) {
        int resourceKey = hashKey(wrapName(id, (byte) 3).toCharArray());

        for (int i = 0; i < this.frameCache.size(); ++i) {
            Resource res = (Resource) this.frameCache.elementAt(i);
            if (res.type == 3 && res.info != null && res.info.key == resourceKey) {
                return (TileMap) res;
            }
        }

        FrameInfo frameInfo = this.getFrameInfoByKey(resourceKey);
        if (frameInfo == null) {
            return null;
        }

        DataInputStream dis = null;
        try {
            dis = this.getFrameStream(frameInfo);
            if (dis == null) {
                return null;
            }
            TileMap tileMap = loadTileMap(parseSpriteData(dis, 0));
            this.loadTileMapSpritesToCache(tileMap);
            short[] animSpriteIds = this.collectAnimationSpriteIds(tileMap);
            this.batchLoadFrame1ToCache(animSpriteIds, null, null, null);
            this.bindTileMapFrames(tileMap);
            tileMap.info = frameInfo;
            return tileMap;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                }
            }
        }
        return null;
    }

    public void loadResource(String path) {
        this.loadAnimation((String) path, (short) 0, (short) 0, (short) 0);
    }

    public void loadFrame(String[] var1) {
        int[] var2 = batchHashKey((String[]) var1, (byte) 2);
        this.doLoadFrame((int[]) var2, (short[]) null, (short[]) null, (short[]) null);
    }

    public void loadFrame(String[] var1, short[] var2, short[] var3, short[] var4) {
        int[] var5 = batchHashKey((String[]) var1, (byte) 2);
        this.doLoadFrame(var5, var2, var3, var4);
    }

    public void loadFrame(Vector var1, short[] var2, short[] var3, short[] var4) {
        int[] var5 = batchHashKey((Vector) var1, (byte) 2);
        this.doLoadFrame(var5, var2, var3, var4);
    }

    private void doLoadFrame(int[] keys, short[] var2, short[] var3, short[] var4) {
        FrameInfo var5 = null;
        short[] ids = new short[keys.length];

        for (int i = 0; i < keys.length; ++i) {
            if ((var5 = this.getFrameInfoByKey(keys[i])) != null) {
                ids[i] = var5.id;
            } else {
                ids[i] = -1;
            }
        }

        this.batchLoadFrame1ToCache(ids, var2, var3, var4);
    }

    private void batchLoadFrame1ToCache(short[] resourceShortIds, short[] variantAList, short[] variantBList, short[] variantCList) {
        boolean hasVariantParams = variantAList != null && variantBList != null && variantCList != null;
        for (int index = 0; index < resourceShortIds.length; index++) {
            short variantA = hasVariantParams ? variantAList[index] : (short) 0;
            short variantB = hasVariantParams ? variantBList[index] : (short) 0;
            short variantC = hasVariantParams ? variantCList[index] : (short) 0;
            if (resourceShortIds[index] >= 0) {
                // 通过 this.c 中已缓存的 bc 资源先做一次去重检查。
                if (getAnimationByIdFromCache(resourceShortIds[index], variantA, variantB, variantC) != null) {
                    resourceShortIds[index] = -1;
                } else {
                    //如果后面还有参数完全相同的，就跳过当前资源
                    for (int nextIndex = index + 1; nextIndex < resourceShortIds.length; nextIndex++) {
                        short nextVariantA = hasVariantParams ? variantAList[nextIndex] : (short) 0;
                        short nextVariantB = hasVariantParams ? variantBList[nextIndex] : (short) 0;
                        short nextVariantC = hasVariantParams ? variantCList[nextIndex] : (short) 0;
                        if (resourceShortIds[nextIndex] >= 0 && resourceShortIds[index] == resourceShortIds[nextIndex] && variantA == nextVariantA && variantB == nextVariantB && variantC == nextVariantC) {
                            resourceShortIds[index] = -1;
                            break;
                        }
                    }
                }
            }
        }
        for (int index2 = 0; index2 < resourceShortIds.length; index2++) {
            short resourceShortId = resourceShortIds[index2];
            short variantA2 = hasVariantParams ? variantAList[index2] : (short) 0;
            short variantB2 = hasVariantParams ? variantBList[index2] : (short) 0;
            short variantC2 = hasVariantParams ? variantCList[index2] : (short) 0;
            if (resourceShortId >= 0 || variantA2 != 0 || variantB2 != 0 || variantC2 != 0) {
                // this.c 是已加载资源缓存；命中时直接从缓存资源派生一个新实例即可。
                Animation cachedResource = getAnimationByIdFromCache(resourceShortId, variantA2, variantB2, variantC2);
                if (cachedResource == null) {
                    DataInputStream resourceStream = null;
                    try {
                        // a(resourceShortId) 会从 this.e 资源索引表中找到对应的资源项。
                        FrameInfo resourceEntry = getFrameInfoById(resourceShortId);
                        if (resourceEntry == null) {
                            continue;
                        }
                        // a(resourceEntry) 会结合 this.a / this.b 指向的资源包路径打开 .rpg 数据流。
                        resourceStream = getFrameStream(resourceEntry);
                        if (resourceStream == null) {
                            continue;
                        }
                        loadAnimationFromFile2Cache(resourceEntry, resourceStream, variantA2, variantB2, variantC2);
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } finally {
                        if (resourceStream != null) {
                            try {
                                resourceStream.close();
                            } catch (IOException closeException) {
                                closeException.printStackTrace();
                            }
                        }
                    }
                } else {
                    Animation clonedResource = cachedResource.a(variantA2, variantB2, variantC2);
                    // 新派生出的资源实例同样要回写到 this.c 缓存中。
                    this.frameCache.addElement(clonedResource);
                }
            }
        }
    }

    public void loadAnimation(String path, short var2, short var3, short var4) {
        int resourceId = buildResourceId((String) path, (byte) 2);
        int i = 0;

        Animation animation;
        while (true) {
            if (i >= this.frameCache.size()) {
                animation = null;
                break;
            }

            Resource resource = (Resource) this.frameCache.elementAt(i);
            Animation var27;
            if (resource.type == 2 && resource.info != null && resource.info.key == resourceId && (var27 = (Animation) resource).hsl_h == var2 && var27.hsl_s == var3 && var27.hsl_l == var4) {
                animation = var27;
                break;
            }

            ++i;
        }

        if (animation == null) {
            DataInputStream dis = null;
            try {
                FrameInfo frameInfo = this.getFrameInfoByKey(resourceId);
                if (frameInfo == null) {
                    return;
                }
                dis = this.getFrameStream(frameInfo);
                if (dis != null) {
                    this.loadAnimationFromFile2Cache(frameInfo, dis, var2, var3, var4);
                }
            } catch (Exception var19) {
                var19.printStackTrace();
            } finally {
                try {
                    if (dis != null) {
                        dis.close();
                    }
                } catch (IOException var18) {
                    ((Throwable) var18).printStackTrace();
                }

            }

        }
    }

    private void loadAnimationFromFile2Cache(FrameInfo frameInfo, DataInputStream dis, short h, short s, short l) throws IOException {
        Animation animation = buildAnimation(parseSpriteData((DataInputStream) dis, (int) 0), h, s, l);
        this.mapResSpriteIdCache.removeAllElements();
        short[] spriteIdArr;
        if (animation.spritePieces != null) {
            for (int i = 0; i < animation.spritePieces.length; ++i) {
                if (animation.spritePieces[i] != null) {
                    for (int j = 0; j < animation.spritePieces[i].length; ++j) {
                        if (animation.spritePieces[i][j] != null) {
                            String spriteId = String.valueOf(animation.spritePieces[i][j].spriteId);
                            if (!this.mapResSpriteIdCache.contains(spriteId)) {
                                this.mapResSpriteIdCache.addElement(spriteId);
                            }
                        }
                    }
                }
            }

            spriteIdArr = new short[this.mapResSpriteIdCache.size()];
            for (int i = 0; i < this.mapResSpriteIdCache.size(); ++i) {
                spriteIdArr[i] = Short.parseShort((String) this.mapResSpriteIdCache.elementAt(i));
            }
            this.mapResSpriteIdCache.removeAllElements();
        } else {
            spriteIdArr = null;
        }

        if (spriteIdArr != null) {
            for (int i = 0; i < spriteIdArr.length; ++i) {
                if (spriteIdArr[i] >= 0) {
                    if (this.getSpriteByIdFromCache(spriteIdArr[i], h, s, l) != null) {
                        spriteIdArr[i] = -1;
                    } else {
                        for (int j = i + 1; j < spriteIdArr.length; ++j) {
                            if (spriteIdArr[j] >= 0 && spriteIdArr[i] == spriteIdArr[j]) {
                                spriteIdArr[i] = -1;
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < spriteIdArr.length; ++i) {
                if (spriteIdArr[i] >= 0) {
                    this.loadSpriteToCache(spriteIdArr[i], h, s, l);
                }
            }
        }

        this.boundCal(animation, h, s, l);
        animation.info = frameInfo;
        this.frameCache.addElement(animation);
    }

    public void loadSpriteByName(String name) {
        int resourceKey = buildResourceId(name, (byte) 0);

        Sprite cached = null;
        for (int i = 0; i < this.frameCache.size(); ++i) {
            Resource res = (Resource) this.frameCache.elementAt(i);
            if (res.type == 0 && res.info != null && res.info.key == resourceKey) {
                Sprite sprite = (Sprite) res;
                if (sprite.H == 0 && sprite.S == 0 && sprite.L == 0) {
                    cached = sprite;
                    break;
                }
            }
        }

        if (cached == null) {
            FrameInfo frameInfo = this.getFrameInfoByKey(resourceKey);
            if (frameInfo != null) {
                DataInputStream dis = null;
                try {
                    dis = this.getFrameStream(frameInfo);
                    if (dis != null) {
                        this.loadSpriteToCache(frameInfo, dis, (short) 0, (short) 0, (short) 0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (dis != null) {
                        try {
                            dis.close();
                        } catch (IOException e) {
                        }
                    }
                }
            }
        }
    }

    /**
     * 批量预加载 Frame0（图像帧）资源。
     * 将一组资源名称（Vector）转换为资源 id，去重后逐一加载进 frames 缓存。
     *
     * @param var1 资源名称列表（每项会以 wrapName type=0 即追加"p"后取 hashKey，再查 frameInfos）
     * @param var2 变体参数A数组（可为 null，null 时统一用 0）
     * @param var3 变体参数B数组（可为 null，null 时统一用 0）
     * @param var4 变体参数C数组（可为 null，null 时统一用 0）
     */
    public void batchLoadFrame0(Vector var1, short[] var2, short[] var3, short[] var4) {
        // 把名称 Vector 按 type=0（"p"后缀）规则转成 int[] hashKey 数组
        int[] hashKeys = batchHashKey((Vector) var1, (byte) 0);

        // 将 hashKey 数组映射为 short[] resourceIds：
        // 通过 d(int) 在 frameInfos 中按 key 查找 FrameInfo，取其 id（aa.b）；找不到填 -1
        short[] resourceIds = new short[hashKeys.length];
        for (int i = 0; i < hashKeys.length; i++) {
            FrameInfo info = this.getFrameInfoByKey(hashKeys[i]);
            if (info != null) {
                resourceIds[i] = info.id;
            } else {
                resourceIds[i] = -1;
            }
        }

        // 三个变体参数数组同时非 null 才启用变体模式，否则变体值统一取 0
        boolean hasVariantParams = var2 != null && var3 != null && var4 != null;
        short variantA = 0, variantB = 0, variantC = 0;

        // 去重循环：对每个有效 resourceId，
        // 若已在 frames 缓存中存在（getFrame0FromCache 不为 null），或后续列表中有完全相同的条目，则置 -1 跳过
        for (int i = 0; i < resourceIds.length; i++) {
            variantA = hasVariantParams ? var2[i] : 0;
            variantB = hasVariantParams ? var3[i] : 0;
            variantC = hasVariantParams ? var4[i] : 0;
            if (resourceIds[i] >= 0) {
                if (this.getSpriteByIdFromCache(resourceIds[i], variantA, variantB, variantC) != null) {
                    // 缓存中已有，跳过
                    resourceIds[i] = -1;
                } else {
                    // 检查后续是否有参数完全相同的重复条目，有则当前跳过（让后面那个来加载）
                    for (int j = i + 1; j < resourceIds.length; j++) {
                        if (resourceIds[j] >= 0 && resourceIds[i] == resourceIds[j] && variantA == (hasVariantParams ? var2[j] : 0) && variantB == (hasVariantParams ? var3[j] : 0) && variantC == (hasVariantParams ? var4[j] : 0)) {
                            resourceIds[i] = -1;
                        }
                    }
                }
            }
        }

        // 加载循环：对所有未被置 -1 的条目，调用 b(short,short,short,short) 执行实际的 Frame0 加载
        for (int i = 0; i < resourceIds.length; i++) {
            if (resourceIds[i] >= 0) {
                this.loadSpriteToCache(resourceIds[i], hasVariantParams ? var2[i] : 0, hasVariantParams ? var3[i] : 0, hasVariantParams ? var4[i] : 0);
            }
        }
    }

    private void loadTileMapSpritesToCache(TileMap tileMap) {
        this.mapResSpriteIdCache.removeAllElements();

        if (tileMap.mapBlock != null) {
            for (int col = 0; col < tileMap.mapBlock.length; ++col) {
                for (int row = 0; row < tileMap.mapBlock[col].length; ++row) {
                    if (tileMap.mapBlock[col][row] != null) {
                        String id = String.valueOf(tileMap.mapBlock[col][row].spriteId);
                        if (!this.mapResSpriteIdCache.contains(id)) {
                            this.mapResSpriteIdCache.addElement(id);
                        }
                    }
                }
            }
        }

        if (tileMap.fixedObj != null) {
            for (int i = 0; i < tileMap.fixedObj.length; ++i) {
                if (tileMap.fixedObj[i] != null) {
                    String id = String.valueOf(tileMap.fixedObj[i].spriteId);
                    if (!this.mapResSpriteIdCache.contains(id)) {
                        this.mapResSpriteIdCache.addElement(id);
                    }
                }
            }
        }

        if (tileMap.animationObj != null) {
            for (int i = 0; i < tileMap.animationObj.length; ++i) {
                if (tileMap.animationObj[i] != null && tileMap.animationObj[i].type == 0) {
                    String id = String.valueOf(tileMap.animationObj[i].spriteId);
                    if (!this.mapResSpriteIdCache.contains(id)) {
                        this.mapResSpriteIdCache.addElement(id);
                    }
                }
            }
        }

        short[] spriteIds = new short[this.mapResSpriteIdCache.size()];
        for (int i = 0; i < this.mapResSpriteIdCache.size(); ++i) {
            spriteIds[i] = Short.parseShort((String) this.mapResSpriteIdCache.elementAt(i));
        }
        this.mapResSpriteIdCache.removeAllElements();

        for (int i = 0; i < spriteIds.length; ++i) {
            if (spriteIds[i] >= 0) {
                short hslIndex = tileMap.getIndexBySpriteId(spriteIds[i]);
                if (getSpriteByIdFromCache(spriteIds[i], hslIndex < 0 ? 0 : tileMap.spriteIdHsl[hslIndex][1], hslIndex < 0 ? 0 : tileMap.spriteIdHsl[hslIndex][2], hslIndex < 0 ? 0 : tileMap.spriteIdHsl[hslIndex][3]) != null) {
                    spriteIds[i] = -1;
                } else {
                    for (int j = i + 1; j < spriteIds.length; ++j) {
                        if (spriteIds[j] >= 0 && spriteIds[i] == spriteIds[j]) {
                            spriteIds[i] = -1;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < spriteIds.length; ++i) {
            if (spriteIds[i] >= 0) {
                short hslIndex = tileMap.getIndexBySpriteId(spriteIds[i]);
                if (hslIndex >= 0) {
                    this.loadSpriteToCache(spriteIds[i], tileMap.spriteIdHsl[hslIndex][1], tileMap.spriteIdHsl[hslIndex][2], tileMap.spriteIdHsl[hslIndex][3]);
                } else {
                    this.loadSpriteToCache(spriteIds[i], (short) 0, (short) 0, (short) 0);
                }
            }
        }
    }

    private void loadSpriteToCache(short id, short h, short s, short l) {
        // 通过 this.c 中的已加载缓存检查，避免同一资源被重复反序列化。
        if (getSpriteByIdFromCache(id, h, s, l) != null) {
            return;
        }
        DataInputStream resourceStream = null;
        try {
            // 从 this.e 资源索引表里按短整型资源 id 查到对应的资源项。
            FrameInfo frameInfo = getFrameInfoById(id);
            if (frameInfo == null) {
                return;
            }
            // 基于 this.a / this.b 指向的资源包与路径前缀打开对应的 .rpg 数据流。
            resourceStream = getFrameStream(frameInfo);
            if (resourceStream == null) {
                return;
            }
            // 解析资源内容，并在内部写回 this.c 缓存。
            loadSpriteToCache(frameInfo, resourceStream, h, s, l);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            if (resourceStream != null) {
                try {
                    resourceStream.close();
                } catch (IOException closeException) {
                }
            }
        }
    }

    private void loadSpriteToCache(FrameInfo frameInfo, DataInputStream inputStream, short h, short s, short l) throws IOException {
        Sprite var6;
        (var6 = buildSprite(parseSpriteData((DataInputStream) inputStream, (int) 0), h, s, l)).info = frameInfo;
        this.frameCache.addElement(var6);
    }

    private static byte[][] parseSpriteData(DataInputStream var0, int var1) throws IOException {
        var0.skipBytes(0);
        var0.readShort();
        var0.readByte();
        byte[][] var2 = new byte[var1 = var0.readByte()][];

        for (int var3 = 0; var3 < var1; ++var3) {
            int var4 = var0.readInt();
            var2[var3] = new byte[var4];
            var0.read(var2[var3]);
        }
        return var2;
    }

    private DataInputStream getFrameStream(FrameInfo frameInfo) {
        byte[] cachedBytes = null;
        if (this.name.equals(GlobalStatus.currentMapName) && GlobalStatus.kY != null) {
            for (short i = 0; i < GlobalStatus.kY.size(); ++i) {
                MapByteData entry = (MapByteData) GlobalStatus.kY.elementAt(i);
                if (entry.key == frameInfo.key) {
                    cachedBytes = entry.mapByteArray;
                    break;
                }
            }
        }

        if (cachedBytes != null) {
            return new DataInputStream(new ByteArrayInputStream(cachedBytes));
        }

        InputStream is;
        if (this.name.equals(GlobalStatus.currentMapName)) {
            is = this.getClass().getResourceAsStream(this.path + frameInfo.key + ".rpg");
            if (is != null) {
                return new DataInputStream(is);
            }
        }

        is = this.getClass().getResourceAsStream(this.path + frameInfo.id + ".rpg");
        if (is == null) {
            return null;
        }
        return new DataInputStream(is);
    }

    private FrameInfo getFrameInfoByKey(int key) {
        for (int var2 = 0; var2 < this.frameInfos.length; ++var2) {
            if (this.frameInfos[var2] != null && this.frameInfos[var2].key == key) {
                return this.frameInfos[var2];
            }
        }

        return null;
    }

    private FrameInfo getFrameInfoById(short id) {
        for (int var2 = 0; var2 < this.frameInfos.length; ++var2) {
            if (this.frameInfos[var2] != null && this.frameInfos[var2].id == id) {
                return this.frameInfos[var2];
            }
        }

        return null;
    }

    private short[] collectAnimationSpriteIds(TileMap tileMap) {
        this.mapResSpriteIdCache.removeAllElements();
        if (tileMap.animationObj != null) {
            for (int i = 0; i < tileMap.animationObj.length; ++i) {
                SpritePiece piece = tileMap.animationObj[i];
                if (piece != null && piece.type == 2) {
                    String id = String.valueOf(piece.spriteId);
                    if (!this.mapResSpriteIdCache.contains(id)) {
                        this.mapResSpriteIdCache.addElement(id);
                    }
                }
            }
        }

        short[] spriteIds = new short[this.mapResSpriteIdCache.size()];
        for (int i = 0; i < this.mapResSpriteIdCache.size(); ++i) {
            spriteIds[i] = Short.parseShort((String) this.mapResSpriteIdCache.elementAt(i));
        }
        this.mapResSpriteIdCache.removeAllElements();
        return spriteIds;
    }


    private void bindTileMapFrames(TileMap tileMap) {
        if (tileMap.mapBlock != null) {
            for (int col = 0; col < tileMap.mapBlock.length; ++col) {
                for (int row = 0; row < tileMap.mapBlock[col].length; ++row) {
                    SpritePiece piece = tileMap.mapBlock[col][row];
                    if (piece != null) {
                        short hslIndex = tileMap.getIndexBySpriteId(piece.spriteId);
                        if (hslIndex != -1) {
                            piece.frame = this.getSpriteByIdFromCache(piece.spriteId, tileMap.spriteIdHsl[hslIndex][1], tileMap.spriteIdHsl[hslIndex][2], tileMap.spriteIdHsl[hslIndex][3]);
                        } else {
                            piece.frame = this.getSpriteByIdFromCache(piece.spriteId, (short) 0, (short) 0, (short) 0);
                        }
                    }
                }
            }
        }

        if (tileMap.fixedObj != null) {
            for (int i = 0; i < tileMap.fixedObj.length; ++i) {
                SpritePiece piece = tileMap.fixedObj[i];
                if (piece != null) {
                    short hslIndex = tileMap.getIndexBySpriteId(piece.spriteId);
                    if (hslIndex != -1) {
                        piece.frame = this.getSpriteByIdFromCache(piece.spriteId, tileMap.spriteIdHsl[hslIndex][1], tileMap.spriteIdHsl[hslIndex][2], tileMap.spriteIdHsl[hslIndex][3]);
                    } else {
                        piece.frame = this.getSpriteByIdFromCache(piece.spriteId, (short) 0, (short) 0, (short) 0);
                    }
                }
            }
        }

        if (tileMap.animationObj != null) {
            for (int i = 0; i < tileMap.animationObj.length; ++i) {
                SpritePiece piece = tileMap.animationObj[i];
                if (piece == null) {
                    continue;
                }
                if (piece.type == 0) {
                    short hslIndex = tileMap.getIndexBySpriteId(piece.spriteId);
                    if (hslIndex != -1) {
                        piece.frame = this.getSpriteByIdFromCache(piece.spriteId, tileMap.spriteIdHsl[hslIndex][1], tileMap.spriteIdHsl[hslIndex][2], tileMap.spriteIdHsl[hslIndex][3]);
                    } else {
                        piece.frame = this.getSpriteByIdFromCache(piece.spriteId, (short) 0, (short) 0, (short) 0);
                    }
                } else if (piece.type == 2) {
                    short animSpriteId = piece.spriteId;
                    Animation found = null;
                    for (int j = 0; j < this.frameCache.size(); ++j) {
                        if (this.frameCache.elementAt(j) instanceof Animation) {
                            Animation anim = (Animation) this.frameCache.elementAt(j);
                            if (anim.info != null && anim.info.id == animSpriteId) {
                                found = anim;
                                break;
                            }
                        }
                    }
                    if (found == null) {
                        GlobalConfig.printStr("no resource " + animSpriteId);
                    }
                    piece.frame = found;
                }
            }
        }
    }


}

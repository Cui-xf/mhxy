package com.cc;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

//public final class bu_1 {
public final class Page {
    private String name;
    private String path;
    private Vector frameCache = new Vector();
    private Vector d = new Vector();
    private FrameInfo[] frameInfos;

    public Page(String path, String name) {
        this.name = name;
        this.path = path;
        this.loadRule();
    }

    public Page(String name, byte[] frameInfo) {
        this.name = name;
        this.path = "/" + this.name + "/";
        this.parseFrameInfo(frameInfo);
    }

    public final Vector a() {
        return this.frameCache;
    }

    public short framesNum() {
        return (short) this.frameCache.size();
    }

    public final void c() {
        this.frameCache.removeAllElements();
    }

    public final void a(int var1) {
        Object var2 = null;

        for (int var3 = 0; var3 < this.frameCache.size(); ++var3) {
            Frame var4;
            if ((var4 = (Frame) this.frameCache.elementAt(var3)).info != null && var4.info.key == var1) {
                this.frameCache.removeElement(var4);
                return;
            }
        }

    }

    public final boolean b(int var1) {
        Object var2 = null;

        for (int var3 = 0; var3 < this.frameCache.size(); ++var3) {
            Frame var4;
            if ((var4 = (Frame) this.frameCache.elementAt(var3)).info != null && var4.info.key == var1) {
                return true;
            }
        }

        return false;
    }

    public Frame0 getFrame(String name) {
        if (name != null) {
            name = wrapName(name, (byte) 0);
            int key = hashKey(name.toCharArray());
            for (int i = 0; i < this.frameCache.size(); ++i) {
                Object o = this.frameCache.elementAt(i);
                if (o instanceof Frame0) {
                    Frame0 frame0 = (Frame0) o;
                    if (frame0.info != null && frame0.info.key == key) {
                        return frame0;
                    }
                }
            }
        }
        return null;
    }

    private Frame0 getFrame0ByIdFromCache(short id, short var2, short var3, short var4) {
        Frame0 var5 = null;

        for (int var6 = 0; var6 < this.frameCache.size(); ++var6) {
            if (this.frameCache.elementAt(var6) instanceof Frame0 && (var5 = (Frame0) this.frameCache.elementAt(var6)).info != null && var5.info.id == id && var5.e == var2 && var5.f == var3 && var5.g == var4) {
                return var5;
            }
        }

        return null;
    }

    public final Frame1 getFrame1(String var1) {
        var1 = wrapName(var1, (byte) 2);
        return this.getFrame1((int) hashKey(var1.toCharArray()), (short) 0, (short) 0, (short) 0);
    }

    public final Frame1 a(String var1, short var2, short var3, short var4) {
        var1 = wrapName(var1, (byte) 2);
        return this.getFrame1(hashKey(var1.toCharArray()), var2, var3, var4);
    }

    public final Frame1 c(int var1) {
        return this.getFrame1((int) var1, (short) 0, (short) 0, (short) 0);
    }

    public Frame1 getFrame1(int var1, short var2, short var3, short var4) {
        Frame1 var5 = null;

        for (int var6 = 0; var6 < this.frameCache.size(); ++var6) {
            if (this.frameCache.elementAt(var6) instanceof Frame1 && (var5 = (Frame1) this.frameCache.elementAt(var6)).info != null && var5.info.key == var1 && var5.a == var2 && var5.b == var3 && var5.c == var4) {
                return var5;
            }
        }

        return null;
    }

    public void loadRpg() {
        InputStream resourceStream = null;
        DataInputStream dataInputStream = null;
        try {
            resourceStream = this.getClass().getResourceAsStream(this.path + this.name + ".rpg");
            dataInputStream = new DataInputStream(resourceStream);
            //skip前缀
            dataInputStream.read(PngUtil.skip);
            for (int i = 0; i < this.frameInfos.length; ++i) {
                byte type = dataInputStream.readByte();
                byte len = dataInputStream.readByte();
                byte[][] data = new byte[len][];
                for (int j = 0; j < len; ++j) {
                    int size = dataInputStream.readInt();
                    data[j] = new byte[size];
                    dataInputStream.read(data[j]);
                }

                if (type == 0) {
                    Frame0 frame0 = buildFrame0(data, (short) 0, (short) 0, (short) 0);
                    frame0.info = this.frameInfos[i];
                    this.frameCache.addElement(frame0);
                } else {
                    Frame1 frame1 = buildFrame1(data, (short) 0, (short) 0, (short) 0);
                    frame1.info = this.frameInfos[i];
                    this.frameCache.addElement(frame1);
                }
            }
            for (int i = 0; i < this.frameCache.size(); ++i) {
                Frame frame = (Frame) this.frameCache.elementAt(i);
                if (frame.type == 2) {
                    this.a(((Frame1) frame), (short) 0, (short) 0, (short) 0);
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

    public final aw a(byte[] var1) {
        aw var2 = null;
        var2 = a(b(var1));
        this.a(var2);
        short[] var3 = this.b(var2);
        this.batchLoadFrame1ToCache((short[]) var3, (short[]) null, (short[]) null, (short[]) null);
        this.c(var2);
        return var2;
    }

    public final aw c(String var1) {
        int var20 = hashKey(wrapName(var1, (byte) 3).toCharArray());
        Object var2 = null;
        int var3 = var20;
        Page var24 = this;
        Object var4 = null;
        int var5 = 0;

        aw var10000;
        while (true) {
            if (var5 >= var24.frameCache.size()) {
                var10000 = null;
                break;
            }

            Frame var28;
            if ((var28 = (Frame) var24.frameCache.elementAt(var5)).type == 3 && var28.info != null && var28.info.key == var3) {
                var10000 = (aw) var28;
                break;
            }

            ++var5;
        }

        aw var25 = var10000;
        if (var10000 != null) {
            return var25;
        } else {
            DataInputStream var27 = null;
            var4 = null;
            try {
                FrameInfo var30;
                if ((var30 = this.getFrameInfoByKey(var20)) == null) {
                    Object var23 = null;
                    return null;
                }

                if ((var27 = this.getFrameStream(var30)) == null) {
                    Object var22 = null;

                    return null;
                }

                var25 = a(readFrame1Data((DataInputStream) var27, (int) 0));
                var27.close();
                this.a(var25);
                short[] var21 = this.b(var25);
                this.batchLoadFrame1ToCache((short[]) var21, (short[]) null, (short[]) null, (short[]) null);
                this.c(var25);
                var25.info = var30;
                return var25;
            } catch (IOException var17) {
                ((Throwable) var17).printStackTrace();
            } finally {
                try {
                    if (var27 != null) {
                        var27.close();
                    }
                } catch (IOException var13) {
                }

            }
            return null;
        }
    }

    public void loadResource(String path) {
        this.loadResource((String) path, (short) 0, (short) 0, (short) 0);
    }

    public void loadFrame(String[] var1) {
        int[] var2 = batchHashKey((String[]) var1, (byte) 2);
        this.doLoadFrame((int[]) var2, (short[]) null, (short[]) null, (short[]) null);
    }

    public final void loadFrame(String[] var1, short[] var2, short[] var3, short[] var4) {
        int[] var5 = batchHashKey((String[]) var1, (byte) 2);
        this.doLoadFrame(var5, var2, var3, var4);
    }

    public final void a(Vector var1, short[] var2, short[] var3, short[] var4) {
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
                if (getFrame1FromCache(resourceShortIds[index], variantA, variantB, variantC) != null) {
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
                Frame1 cachedResource = getFrame1FromCache(resourceShortId, variantA2, variantB2, variantC2);
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
                        loadFrame1FromFile2Cache(resourceEntry, resourceStream, variantA2, variantB2, variantC2);
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
                    Frame1 clonedResource = cachedResource.a(variantA2, variantB2, variantC2);
                    // 新派生出的资源实例同样要回写到 this.c 缓存中。
                    this.frameCache.addElement(clonedResource);
                }
            }
        }
    }

    public void loadResource(String path, short var2, short var3, short var4) {
        int var21 = buildResourceId((String) path, (byte) 2);
        short var9 = var4;
        short var8 = var3;
        short var7 = var2;
        int var6 = var21;
        Page var5 = this;
        Object var10 = null;
        var10 = null;
        int var11 = 0;

        Frame1 var28;
        while (true) {
            if (var11 >= var5.frameCache.size()) {
                var28 = null;
                break;
            }

            Frame var26;
            Frame1 var27;
            if ((var26 = (Frame) var5.frameCache.elementAt(var11)).type == 2 && var26.info != null && var26.info.key == var6 && (var27 = (Frame1) var26).a == var7 && var27.b == var8 && var27.c == var9) {
                var28 = var27;
                break;
            }

            ++var11;
        }

        if (var28 == null) {
            DataInputStream var22 = null;
            Object var23 = null;

            try {
                FrameInfo var24;
                if ((var24 = this.getFrameInfoByKey(var21)) == null) {
                    return;
                }

                if ((var22 = this.getFrameStream(var24)) != null) {
                    this.loadFrame1FromFile2Cache(var24, var22, var2, var3, var4);
                    return;
                }
            } catch (Exception var19) {
                var19.printStackTrace();
                return;
            } finally {
                try {
                    if (var22 != null) {
                        var22.close();
                    }
                } catch (IOException var18) {
                    ((Throwable) var18).printStackTrace();
                }

            }

        }
    }

    private void loadFrame1FromFile2Cache(FrameInfo var1, DataInputStream var2, short var3, short var4, short var5) throws IOException {
        Frame1 var15 = buildFrame1(readFrame1Data((DataInputStream) var2, (int) 0), var3, var4, var5);
        short var10 = var5;
        short var9 = var4;
        short var8 = var3;
        Page var6 = this;
        Frame1 var11 = var15;
        Page var7 = this;
        this.d.removeAllElements();
        short[] var10000;
        if (var15 != null && var15.k != null) {
            Object var12 = null;

            for (int var13 = 0; var13 < var11.k.length; ++var13) {
                if (var11.k[var13] != null) {
                    for (int var14 = 0; var14 < var11.k[var13].length; ++var14) {
                        if (var11.k[var13][var14] != null) {
                            String var19 = String.valueOf(var11.k[var13][var14].b);
                            if (!var7.d.contains(var19)) {
                                var7.d.addElement(var19);
                            }
                        }
                    }
                }
            }

            short[] var21 = new short[var7.d.size()];

            for (int var22 = 0; var22 < var7.d.size(); ++var22) {
                var21[var22] = Short.parseShort((String) var7.d.elementAt(var22));
            }

            var7.d.removeAllElements();
            var10000 = var21;
        } else {
            var10000 = null;
        }

        short[] var16 = var10000;
        if (var10000 != null) {
            for (int var17 = 0; var17 < var16.length; ++var17) {
                if (var16[var17] >= 0) {
                    if (var6.getFrame0FromCache(var16[var17], var8, var9, var10) != null) {
                        var16[var17] = -1;
                    } else {
                        for (int var20 = var17 + 1; var20 < var16.length; ++var20) {
                            if (var16[var20] >= 0 && var16[var17] == var16[var20]) {
                                var16[var17] = -1;
                            }
                        }
                    }
                }
            }

            for (int var18 = 0; var18 < var16.length; ++var18) {
                if (var16[var18] >= 0) {
                    var6.loadFrame(var16[var18], var8, var9, var10);
                }
            }
        }

        this.a(var15, var3, var4, var5);
        var15.info = var1;
        this.frameCache.addElement(var15);
    }

    public final void e(String var1) {
        boolean var22 = false;
        boolean var23 = false;
        boolean var24 = false;
        Page var25 = this;
        int var26 = buildResourceId((String) var1, (byte) 0);
        byte var6 = 0;
        byte var5 = 0;
        byte var4 = 0;
        int var3 = var26;
        Page var2 = this;
        Object var7 = null;
        var7 = null;
        int var8 = 0;

        Frame0 var38;
        while (true) {
            if (var8 >= var2.frameCache.size()) {
                var38 = null;
                break;
            }

            Frame var31;
            Frame0 var32;
            if ((var31 = (Frame) var2.frameCache.elementAt(var8)).type == 0 && var31.info != null && var31.info.key == var3 && (var32 = (Frame0) var31).e == var4 && var32.f == var5 && var32.g == var6) {
                var38 = var32;
                break;
            }

            ++var8;
        }

        if (var38 == null) {
            var2 = null;
            FrameInfo var29;
            if ((var29 = this.getFrameInfoByKey(var26)) != null) {
                DataInputStream var27 = null;
                boolean var15 = false;

                label163:
                {
                    label162:
                    {
                        try {
                            var15 = true;
                            if ((var27 = var25.getFrameStream(var29)) != null) {
                                var25.loadFrameAndCache(var29, var27, (short) 0, (short) 0, (short) 0);
                                var15 = false;
                                break label162;
                            }

                            var15 = false;
                        } catch (Exception var20) {
                            var20.printStackTrace();
                            var15 = false;
                            break label163;
                        } finally {
                            if (var15) {
                                try {
                                    if (var27 != null) {
                                        var27.close();
                                    }
                                } catch (IOException var16) {
                                }

                            }
                        }

                        try {
                            if (var27 != null) {
                                var27.close();
                            }

                            return;
                        } catch (IOException var19) {
                            return;
                        }
                    }

                    try {
                        if (var27 != null) {
                            var27.close();
                        }

                        return;
                    } catch (IOException var18) {
                        return;
                    }
                }

                try {
                    if (var27 != null) {
                        var27.close();
                    }

                    return;
                } catch (IOException var17) {
                    return;
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
                if (this.getFrame0ByIdFromCache(resourceIds[i], variantA, variantB, variantC) != null) {
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
                this.loadFrame(resourceIds[i], hasVariantParams ? var2[i] : 0, hasVariantParams ? var3[i] : 0, hasVariantParams ? var4[i] : 0);
            }
        }
    }

    private void a(aw var1) {
        aw var3 = var1;
        Page var2 = this;
        this.d.removeAllElements();
        Object var4 = null;
        if (var1.j != null) {
            for (int var5 = 0; var5 < var3.j.length; ++var5) {
                for (int var6 = 0; var6 < var3.j[var5].length; ++var6) {
                    if (var3.j[var5][var6] != null) {
                        String var12 = String.valueOf(var3.j[var5][var6].b);
                        if (!var2.d.contains(var12)) {
                            var2.d.addElement(var12);
                        }
                    }
                }
            }
        }

        if (var3.k != null) {
            for (int var17 = 0; var17 < var3.k.length; ++var17) {
                if (var3.k[var17] != null) {
                    String var13 = String.valueOf(var3.k[var17].b);
                    if (!var2.d.contains(var13)) {
                        var2.d.addElement(var13);
                    }
                }
            }
        }

        if (var3.l != null) {
            for (int var18 = 0; var18 < var3.l.length; ++var18) {
                if (var3.l[var18] != null && var3.l[var18].c == 0) {
                    String var14 = String.valueOf(var3.l[var18].b);
                    if (!var2.d.contains(var14)) {
                        var2.d.addElement(var14);
                    }
                }
            }
        }

        short[] var19 = new short[var2.d.size()];

        for (int var20 = 0; var20 < var2.d.size(); ++var20) {
            var19[var20] = Short.parseShort((String) var2.d.elementAt(var20));
        }

        var2.d.removeAllElements();
        short[] var7 = var19;
        short var8 = 0;

        for (int var15 = 0; var15 < var7.length; ++var15) {
            if (var7[var15] >= 0) {
                var8 = var1.a(var7[var15]);
                if (this.getFrame0FromCache(var7[var15], var8 < 0 ? 0 : var1.m[var8][1], var8 < 0 ? 0 : var1.m[var8][2], var8 < 0 ? 0 : var1.m[var8][3]) != null) {
                    var7[var15] = -1;
                } else {
                    for (int var10 = var15 + 1; var10 < var7.length; ++var10) {
                        if (var7[var10] >= 0 && var7[var15] == var7[var10]) {
                            var7[var15] = -1;
                        }
                    }
                }
            }
        }

        for (int var16 = 0; var16 < var7.length; ++var16) {
            if (var7[var16] >= 0) {
                if ((var8 = var1.a(var7[var16])) >= 0) {
                    this.loadFrame(var7[var16], var1.m[var8][1], var1.m[var8][2], var1.m[var8][3]);
                } else {
                    this.loadFrame(var7[var16], (short) 0, (short) 0, (short) 0);
                }
            }
        }

    }

    private void loadFrame(short id, short variantA, short variantB, short variantC) {
        // 通过 this.c 中的已加载缓存检查，避免同一资源被重复反序列化。
        if (getFrame0FromCache(id, variantA, variantB, variantC) != null) {
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
            loadFrameAndCache(frameInfo, resourceStream, variantA, variantB, variantC);
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

    private void loadFrameAndCache(FrameInfo frameInfo, DataInputStream inputStream, short var3, short var4, short var5) throws IOException {
        Frame0 var6;
        (var6 = buildFrame0(readFrame1Data((DataInputStream) inputStream, (int) 0), var3, var4, var5)).info = frameInfo;
        this.frameCache.addElement(var6);
    }

    //private static bf a(byte[][] bArr, short s, short s2, short s3) throws Throwable {
    private static Frame0 buildFrame0(byte[][] frameData, short s, short s2, short s3) {

        Frame0 frame0 = new Frame0(s, s2, s3);
        DataInputStream is1 = new DataInputStream(new ByteArrayInputStream(frameData[1]));
        DataInputStream is2 = null;

        try {
            frame0.b = (short) is1.readInt();
            frame0.c = (short) is1.readInt();
            if (frameData[0] != null && frameData[0].length > 4) {
                is2 = new DataInputStream(new ByteArrayInputStream(frameData[0], 2, frameData[0].length - 2));
                int len = is2.readByte();
                if (len == 0) {
                    frame0.d = new aj[1];
                    frame0.d[0] = new aj((short) 0, (short) 0, frame0.b, frame0.c);
                } else {
                    frame0.d = new aj[len];
                    for (int i = 0; i < len; i++) {
                        frame0.d[i] = new aj(is2.readShort(), is2.readShort(), is2.readShort(), is2.readShort());
                    }
                }
            } else {
                frame0.d = new aj[1];
                frame0.d[0] = new aj((short) 0, (short) 0, frame0.b, frame0.c);
            }
            frame0.draw(frameData, true);
            return frame0;
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

    private static Frame1 buildFrame1(byte[][] var0, short var1, short var2, short var3) {
        Frame1 var4;
        (var4 = new Frame1(var1, var2, var3)).a(var0);
        return var4;
    }

    private static aw a(byte[][] var0) {
        Object var1;
        Object var10000 = var1 = new aw();
        byte[] var2 = var0[0];
        Object var15 = var10000;
        DataInputStream var16 = new DataInputStream(new ByteArrayInputStream(var2));

        try {
            ((aw) var15).m = new short[var16.readByte()][4];

            for (int var3 = 0; var3 < ((aw) var15).m.length; ++var3) {
                ((aw) var15).m[var3][0] = var16.readShort();
                ((aw) var15).m[var3][1] = var16.readShort();
                ((aw) var15).m[var3][2] = var16.readShort();
                ((aw) var15).m[var3][3] = var16.readShort();
            }

            ((aw) var15).a = var16.readShort();
            ((aw) var15).b = var16.readShort();
            ((aw) var15).c = var16.readByte();
            ((aw) var15).d = var16.readByte();
            ((aw) var15).e = var16.readByte();
            ((aw) var15).f = var16.readByte();
            ((aw) var15).g = (byte) (((aw) var15).a / ((aw) var15).c + (((aw) var15).a % ((aw) var15).c == 0 ? 0 : 1));
            ((aw) var15).h = (byte) (((aw) var15).b / ((aw) var15).d + (((aw) var15).b % ((aw) var15).d == 0 ? 0 : 1));
            int var17 = ((aw) var15).a / ((aw) var15).e + (((aw) var15).a % ((aw) var15).e == 0 ? 0 : 1);
            int var4 = ((aw) var15).b / ((aw) var15).f + (((aw) var15).b % ((aw) var15).f == 0 ? 0 : 1);
            ((aw) var15).i = new byte[var17][var4];
            short[] var5 = new short[var4 = var16.readShort()];

            for (int var6 = 0; var6 < var4; ++var6) {
                var5[var6] = var16.readShort();
                ((aw) var15).i[var5[var6] % var17][var5[var6] / var17] = 1;
            }

            ((aw) var15).j = new bx[((aw) var15).g][((aw) var15).h];

            for (int var22 = 0; var22 < ((aw) var15).j.length; ++var22) {
                for (int var18 = 0; var18 < ((aw) var15).j[var22].length; ++var18) {
                    if (var16.readByte() >= 0) {
                        ((aw) var15).j[var22][var18] = new bx();
                        ((aw) var15).j[var22][var18].a(var16, true);
                    }
                }
            }

            short var23;
            if ((var23 = var16.readShort()) > 0) {
                ((aw) var15).k = new bx[var23];

                for (int var19 = 0; var19 < var23; ++var19) {
                    ((aw) var15).k[var19] = new bx();
                    ((aw) var15).k[var19].a(var16, true);
                }
            }

            if ((var23 = var16.readShort()) > 0) {
                ((aw) var15).l = new bx[var23];

                for (int var20 = 0; var20 < var23; ++var20) {
                    ((aw) var15).l[var20] = new bx();
                    ((aw) var15).l[var20].a(var16, true);
                }
            }
        } catch (IOException var13) {
            ((Throwable) var13).printStackTrace();
        } finally {
            try {
                var16.close();
            } catch (IOException var12) {
                var1 = var12;
                ((Throwable) var12).printStackTrace();
            }

        }

        return (aw) var1;
    }

    private static byte[][] readFrame1Data(DataInputStream var0, int var1) throws IOException {
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

    private static byte[][] b(byte[] var0) {
        ByteArrayInputStream var16 = new ByteArrayInputStream(var0);
        DataInputStream var17 = new DataInputStream(var16);
        byte[][] var1 = null;
        boolean var10 = false;

        label94:
        {
            try {
                var10 = true;
                var17.readShort();
                var17.readByte();
                byte var2;
                var1 = new byte[var2 = var17.readByte()][];

                for (int var3 = 0; var3 < var2; ++var3) {
                    int var4 = var17.readInt();
                    var1[var3] = new byte[var4];
                    var17.read(var1[var3]);
                }

                var10 = false;
                break label94;
            } catch (IOException var14) {
                ((Throwable) var14).printStackTrace();
                var10 = false;
            } finally {
                if (var10) {
                    try {
                        var17.close();
                    } catch (IOException var11) {
                    }

                }
            }

            try {
                var17.close();
            } catch (IOException var12) {
            }

            return var1;
        }

        try {
            var17.close();
        } catch (IOException var13) {
        }

        return var1;
    }

    private DataInputStream getFrameStream(FrameInfo frameInfo) {
        byte[] var2 = null;
        if (this.name.equals(GlobalStatus.currentMapName) && GlobalStatus.kY != null) {
            g var3 = null;

            for (short var4 = 0; var4 < GlobalStatus.kY.size(); ++var4) {
                if ((var3 = (g) GlobalStatus.kY.elementAt(var4)).a == frameInfo.key) {
                    var2 = var3.b;
                    break;
                }
            }
        } else {
            this.name.equals((Object) null);
        }

        DataInputStream var6 = null;
        if (var2 != null) {
            ByteArrayInputStream var7 = new ByteArrayInputStream(var2);
            var6 = new DataInputStream(var7);
        } else {
            Object var8 = null;
            InputStream var9;
            if (this.name.equals(GlobalStatus.currentMapName) && (var9 = this.getClass().getResourceAsStream(this.path + frameInfo.key + ".rpg")) != null) {
                var6 = new DataInputStream(var9);
            }

            if (var6 == null) {
                if ((var9 = this.getClass().getResourceAsStream(this.path + frameInfo.id + ".rpg")) == null) {
                    return null;
                }

                var6 = new DataInputStream(var9);
            }
        }

        return var6;
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

    private void parseFrameInfo(byte[] bytes) {
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

    private void loadRule() {
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

    private short[] b(aw var1) {
        this.d.removeAllElements();
        Object var2 = null;
        if (var1.l != null) {
            for (int var3 = 0; var3 < var1.l.length; ++var3) {
                if (var1.l[var3] != null && var1.l[var3].c == 2) {
                    String var5 = String.valueOf(var1.l[var3].b);
                    if (!this.d.contains(var5)) {
                        this.d.addElement(var5);
                    }
                }
            }
        }

        short[] var6 = new short[this.d.size()];

        for (int var4 = 0; var4 < this.d.size(); ++var4) {
            var6[var4] = Short.parseShort((String) this.d.elementAt(var4));
        }

        this.d.removeAllElements();
        return var6;
    }

    private void a(Frame1 frame1, short var2, short var3, short var4) {
        if (frame1.k != null) {
            if (frame1.g == null || frame1.h == null) {
                frame1.g = new short[frame1.k.length];
                frame1.h = new short[frame1.k.length];
                if (frame1.k == null) {
                    return;
                }

                for (int var5 = 0; var5 < frame1.k.length; ++var5) {
                    if (frame1.k[var5] != null) {
                        for (int var6 = 0; var6 < frame1.k[var5].length; ++var6) {
                            if (frame1.k[var5][var6] != null && frame1.k[var5][var6].a == null) {
                                frame1.k[var5][var6].a = this.getFrame0ByIdFromCache(frame1.k[var5][var6].b, var2, var3, var4);
                            }
                        }

                        bx[] var7 = frame1.k[var5];
                        int var9 = 0;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        aj var13 = null;
                        var13 = null;
                        if (var7 != null) {
                            if (var7.length > 0 && var7[0].a != null) {
                                if (var7[0].a.type == 0) {
                                    var13 = ((Frame0) var7[0].a).a(var7[0].d);
                                }

                                var9 = var7[0].e;
                                var10 = var7[0].f;
                                var11 = var7[0].e + (var13 == null ? 0 : var13.c);
                                var12 = var7[0].f + (var13 == null ? 0 : var13.d);
                            }

                            Object var14 = null;

                            for (int var15 = 0; var15 < var7.length; ++var15) {
                                bx var17 = var7[var15];
                                if (var7[0].a != null && var7[0].a.type == 0) {
                                    var13 = ((Frame0) var17.a).a(var17.d);
                                }

                                var9 = Math.min(var17.e, var9);
                                var10 = Math.min(var10, var17.f);
                                var11 = Math.max(var11, var17.e + (var13 == null ? 0 : var13.c));
                                var12 = Math.max(var12, var17.f + (var13 == null ? 0 : var13.d));
                            }

                            frame1.g[var5] = (short) Math.abs(var11 - var9);
                            frame1.h[var5] = (short) Math.abs(var12 - var10);
                        }
                    }
                }

                if (frame1.g != null) {
                    frame1.i = (byte) (frame1.g[0] / 2);
                    frame1.j = (byte) frame1.h[0];
                }
            }

        }
    }

    private void c(aw var1) {
        short var2 = 0;
        if (var1.j != null) {
            for (int var3 = 0; var3 < var1.j.length; ++var3) {
                for (int var4 = 0; var4 < var1.j[var3].length; ++var4) {
                    if (var1.j[var3][var4] != null) {
                        if ((var2 = var1.a(var1.j[var3][var4].b)) != -1) {
                            var1.j[var3][var4].a = this.getFrame0ByIdFromCache(var1.j[var3][var4].b, var1.m[var2][1], var1.m[var2][2], var1.m[var2][3]);
                        } else {
                            var1.j[var3][var4].a = this.getFrame0ByIdFromCache((short) var1.j[var3][var4].b, (short) 0, (short) 0, (short) 0);
                        }
                    }
                }
            }
        }

        if (var1.k != null) {
            for (int var11 = 0; var11 < var1.k.length; ++var11) {
                if (var1.k[var11] != null) {
                    if ((var2 = var1.a(var1.k[var11].b)) != -1) {
                        var1.k[var11].a = this.getFrame0ByIdFromCache(var1.k[var11].b, var1.m[var2][1], var1.m[var2][2], var1.m[var2][3]);
                    } else {
                        var1.k[var11].a = this.getFrame0ByIdFromCache((short) var1.k[var11].b, (short) 0, (short) 0, (short) 0);
                    }
                }
            }
        }

        if (var1.l != null) {
            for (int var12 = 0; var12 < var1.l.length; ++var12) {
                if (var1.l[var12] != null) {
                    bx var10000;
                    Object var10001;
                    if (var1.l[var12].c == 0) {
                        if ((var2 = var1.a(var1.l[var12].b)) != -1) {
                            var10000 = var1.l[var12];
                            var10001 = this.getFrame0ByIdFromCache(var1.l[var12].b, var1.m[var2][1], var1.m[var2][2], var1.m[var2][3]);
                        } else {
                            var10000 = var1.l[var12];
                            var10001 = this.getFrame0ByIdFromCache((short) var1.l[var12].b, (short) 0, (short) 0, (short) 0);
                        }
                    } else {
                        if (var1.l[var12].c != 2) {
                            continue;
                        }

                        var10000 = var1.l[var12];
                        short var13 = var1.l[var12].b;
                        Page var10 = this;
                        Object var5 = null;
                        int var6 = 0;

                        while (true) {
                            if (var6 >= var10.frameCache.size()) {
                                GlobalConfig.printStr("no resource " + var13);
                                var10001 = null;
                                break;
                            }

                            Frame1 var14;
                            if (var10.frameCache.elementAt(var6) instanceof Frame1 && (var14 = (Frame1) var10.frameCache.elementAt(var6)).info != null && var14.info.id == var13) {
                                var10001 = var14;
                                break;
                            }

                            ++var6;
                        }
                    }

                    var10000.a = (Frame) var10001;
                }
            }
        }

    }

    private Frame1 getFrame1FromCache(short s, short s2, short s3, short s4) {
        for (int i = 0; i < this.frameCache.size(); i++) {
            Frame cfVar = (Frame) this.frameCache.elementAt(i);
            if (cfVar.type == 2 && cfVar.info != null && cfVar.info.id == s) {
                Frame1 bcVar = (Frame1) cfVar;
                if (bcVar.a == s2 && bcVar.b == s3 && bcVar.c == s4) {
                    return bcVar;
                }
            }
        }
        return null;
    }


    private Frame0 getFrame0FromCache(short id, short s2, short s3, short s4) {
        for (int i = 0; i < this.frameCache.size(); i++) {
            Frame cfVar = (Frame) this.frameCache.elementAt(i);
            if (cfVar.type == 0 && cfVar.info != null && cfVar.info.id == id) {
                Frame0 bfVar = (Frame0) cfVar;
                if (bfVar.e == s2 && bfVar.f == s3 && bfVar.g == s4) {
                    return bfVar;
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

}

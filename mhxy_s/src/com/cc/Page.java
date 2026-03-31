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
    private Vector frames = new Vector();
    private Vector d = new Vector();
    private FrameInfo[] e;

    public Page(String path, String name) {
        this.name = name;
        this.path = path;
        this.loadRule();
    }

    public Page(String var1, byte[] var2) {
        this.name = var1;
        this.path = "/" + this.name + "/";
        this.c(var2);
    }

    public final Vector a() {
        return this.frames;
    }

    public short framesNum() {
        return (short) this.frames.size();
    }

    public final void c() {
        this.frames.removeAllElements();
    }

    public final void a(int var1) {
        Object var2 = null;

        for (int var3 = 0; var3 < this.frames.size(); ++var3) {
            Frame var4;
            if ((var4 = (Frame) this.frames.elementAt(var3)).info != null && var4.info.key == var1) {
                this.frames.removeElement(var4);
                return;
            }
        }

    }

    public final boolean b(int var1) {
        Object var2 = null;

        for (int var3 = 0; var3 < this.frames.size(); ++var3) {
            Frame var4;
            if ((var4 = (Frame) this.frames.elementAt(var3)).info != null && var4.info.key == var1) {
                return true;
            }
        }

        return false;
    }

    public Frame0 getFrame(String name) {
        if (name != null) {
            name = wrapName(name, (byte) 0);
            int key = hashKey(name.toCharArray());
            for (int i = 0; i < this.frames.size(); ++i) {
                Object o = this.frames.elementAt(i);
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

    private Frame0 a(short var1, short var2, short var3, short var4) {
        Frame0 var5 = null;

        for (int var6 = 0; var6 < this.frames.size(); ++var6) {
            if (this.frames.elementAt(var6) instanceof Frame0 && (var5 = (Frame0) this.frames.elementAt(var6)).info != null && var5.info.b == var1 && var5.e == var2 && var5.f == var3 && var5.g == var4) {
                return var5;
            }
        }

        return null;
    }

    public final Frame1 b(String var1) {
        var1 = wrapName(var1, (byte) 2);
        return this.a((int) hashKey(var1.toCharArray()), (short) 0, (short) 0, (short) 0);
    }

    public final Frame1 a(String var1, short var2, short var3, short var4) {
        var1 = wrapName(var1, (byte) 2);
        return this.a(hashKey(var1.toCharArray()), var2, var3, var4);
    }

    public final Frame1 c(int var1) {
        return this.a((int) var1, (short) 0, (short) 0, (short) 0);
    }

    public Frame1 a(int var1, short var2, short var3, short var4) {
        Frame1 var5 = null;

        for (int var6 = 0; var6 < this.frames.size(); ++var6) {
            if (this.frames.elementAt(var6) instanceof Frame1 && (var5 = (Frame1) this.frames.elementAt(var6)).info != null && var5.info.key == var1 && var5.a == var2 && var5.b == var3 && var5.c == var4) {
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
            dataInputStream.read(ai_1.skip);
            for (int i = 0; i < this.e.length; ++i) {
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
                    frame0.info = this.e[i];
                    this.frames.addElement(frame0);
                } else {
                    Frame1 frame1 = buildFrame1(data, (short) 0, (short) 0, (short) 0);
                    frame1.info = this.e[i];
                    this.frames.addElement(frame1);
                }
            }
            for (int i = 0; i < this.frames.size(); ++i) {
                Frame frame = (Frame) this.frames.elementAt(i);
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
        this.a((short[]) var3, (short[]) null, (short[]) null, (short[]) null);
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
            if (var5 >= var24.frames.size()) {
                var10000 = null;
                break;
            }

            Frame var28;
            if ((var28 = (Frame) var24.frames.elementAt(var5)).type == 3 && var28.info != null && var28.info.key == var3) {
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
                if ((var30 = this.d(var20)) == null) {
                    Object var23 = null;
                    return null;
                }

                if ((var27 = this.a(var30)) == null) {
                    Object var22 = null;

                    return null;
                }

                var25 = a(a((DataInputStream) var27, (int) 0));
                var27.close();
                this.a(var25);
                short[] var21 = this.b(var25);
                this.a((short[]) var21, (short[]) null, (short[]) null, (short[]) null);
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

    public final void d(String var1) {
        this.b((String) var1, (short) 0, (short) 0, (short) 0);
    }

    public final void a(String[] var1) {
        int[] var2 = a((String[]) var1, (byte) 2);
        this.a((int[]) var2, (short[]) null, (short[]) null, (short[]) null);
    }

    public final void a(String[] var1, short[] var2, short[] var3, short[] var4) {
        int[] var5 = a((String[]) var1, (byte) 2);
        this.a(var5, var2, var3, var4);
    }

    public final void a(Vector var1, short[] var2, short[] var3, short[] var4) {
        int[] var5 = a((Vector) var1, (byte) 2);
        this.a(var5, var2, var3, var4);
    }

    private void a(int[] var1, short[] var2, short[] var3, short[] var4) {
        FrameInfo var5 = null;
        short[] var6 = new short[var1.length];

        for (int var7 = 0; var7 < var1.length; ++var7) {
            if ((var5 = this.d(var1[var7])) != null) {
                var6[var7] = var5.b;
            } else {
                var6[var7] = -1;
            }
        }

        this.a(var6, var2, var3, var4);
    }

    private void a(short[] var1, short[] var2, short[] var3, short[] var4) {
        throw new RuntimeException("未实现逻辑");
//        boolean var5 = true;
//        short var6 = 0;
//        short var7 = 0;
//        short var8 = 0;
//        if (var2 == null || var3 == null || var4 == null) {
//            var5 = false;
//        }
//
//        for (int var9 = 0; var9 < var1.length; ++var9) {
//            var6 = var5 ? var2[var9] : 0;
//            var7 = var5 ? var3[var9] : 0;
//            var8 = var5 ? var4[var9] : 0;
//            if (var1[var9] >= 0) {
//                if (this.c(var1[var9], var6, var7, var8) != null) {
//                    var1[var9] = -1;
//                } else {
//                    for (int var10 = var9 + 1; var10 < var1.length; ++var10) {
//                        if (var1[var10] >= 0 && var1[var9] == var1[var10] && var6 == (var5 ? var2[var10] : 0) && var7 == (var5 ? var3[var10] : 0) && var8 == (var5 ? var4[var10] : 0)) {
//                            var1[var9] = -1;
//                        }
//                    }
//                }
//            }
//        }
//
//        bc_1 var36 = null;
//
//        for (int var40 = 0; var40 < var1.length; ++var40) {
//            var6 = var5 ? var2[var40] : 0;
//            var7 = var5 ? var3[var40] : 0;
//            var8 = var5 ? var4[var40] : 0;
//            if (var1[var40] >= 0 || var6 != 0 || var7 != 0 || var8 != 0) {
//                if ((var36 = this.c(var1[var40], var6, var7, var8)) == null) {
//                    short var10001 = var1[var40];
//                    short var11 = var8;
//                    short var39 = var7;
//                    var8 = var6;
//                    var7 = var10001;
//                    bu_1 var29 = this;
//                    DataInputStream var12 = null;
//                    Object var13 = null;
//                    boolean var20 = false;
//
//                    label317:
//                    {
//                        label316:
//                        {
//                            try {
//                                var20 = true;
//                                aa var41;
//                                if ((var41 = var29.a(var7)) == null) {
//                                    var20 = false;
//                                    continue;
//                                }
//
//                                if ((var12 = var29.a(var41)) != null) {
//                                    var29.a(var41, var12, var8, var39, var11);
//                                    var20 = false;
//                                    break label316;
//                                }
//
//                                var20 = false;
//                            } catch (IOException var25) {
//                                ((Throwable) var25).printStackTrace();
//                                var20 = false;
//                                break label317;
//                            } finally {
//                                if (var20) {
//                                    try {
//                                        if (var12 != null) {
//                                            var12.close();
//                                        }
//                                    } catch (IOException var21) {
//                                        ((Throwable) var21).printStackTrace();
//                                    }
//
//                                }
//                            }
//
//                            try {
//                                if (var12 != null) {
//                                    var12.close();
//                                }
//                            } catch (IOException var24) {
//                                ((Throwable) var24).printStackTrace();
//                            }
//                            continue;
//                        }
//
//                        try {
//                            if (var12 != null) {
//                                var12.close();
//                            }
//                        } catch (IOException var23) {
//                            ((Throwable) var23).printStackTrace();
//                        }
//                        continue;
//                    }
//
//                    try {
//                        if (var12 != null) {
//                            var12.close();
//                        }
//                    } catch (IOException var22) {
//                        ((Throwable) var22).printStackTrace();
//                    }
//                } else {
//                    var36 = var36.a(var6, var7, var8);
//                    this.c.addElement(var36);
//                }
//            }
//        }

    }

    public final void b(String var1, short var2, short var3, short var4) {
        int var21 = a((String) var1, (byte) 2);
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
            if (var11 >= var5.frames.size()) {
                var28 = null;
                break;
            }

            Frame var26;
            Frame1 var27;
            if ((var26 = (Frame) var5.frames.elementAt(var11)).type == 2 && var26.info != null && var26.info.key == var6 && (var27 = (Frame1) var26).a == var7 && var27.b == var8 && var27.c == var9) {
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
                if ((var24 = this.d(var21)) == null) {
                    return;
                }

                if ((var22 = this.a(var24)) != null) {
                    this.a(var24, var22, var2, var3, var4);
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

    private void a(FrameInfo var1, DataInputStream var2, short var3, short var4, short var5) throws IOException {
        Frame1 var15 = buildFrame1(a((DataInputStream) var2, (int) 0), var3, var4, var5);
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
                    if (var6.d(var16[var17], var8, var9, var10) != null) {
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
                    var6.b(var16[var18], var8, var9, var10);
                }
            }
        }

        this.a(var15, var3, var4, var5);
        var15.info = var1;
        this.frames.addElement(var15);
    }

    public final void e(String var1) {
        boolean var22 = false;
        boolean var23 = false;
        boolean var24 = false;
        Page var25 = this;
        int var26 = a((String) var1, (byte) 0);
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
            if (var8 >= var2.frames.size()) {
                var38 = null;
                break;
            }

            Frame var31;
            Frame0 var32;
            if ((var31 = (Frame) var2.frames.elementAt(var8)).type == 0 && var31.info != null && var31.info.key == var3 && (var32 = (Frame0) var31).e == var4 && var32.f == var5 && var32.g == var6) {
                var38 = var32;
                break;
            }

            ++var8;
        }

        if (var38 == null) {
            var2 = null;
            FrameInfo var29;
            if ((var29 = this.d(var26)) != null) {
                DataInputStream var27 = null;
                boolean var15 = false;

                label163:
                {
                    label162:
                    {
                        try {
                            var15 = true;
                            if ((var27 = var25.a(var29)) != null) {
                                var25.b(var29, var27, (short) 0, (short) 0, (short) 0);
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

    public final void b(Vector var1, short[] var2, short[] var3, short[] var4) {
        throw new RuntimeException("为实现");

//        int[] var12 = a((Vector) var1, (byte) 0);
//        aa var14 = null;
//        var3 = new short[var12.length];
//
//        for (int var19 = 0; var19 < var12.length; ++var19) {
//            if ((var14 = this.d(var12[var19])) != null) {
//                var3[var19] = var14.b;
//            } else {
//                var3[var19] = -1;
//            }
//        }
//
//        Object var20 = null;
//        Object var18 = null;
//        var14 = null;
//        short[] var13 = var3;
//        boolean var5 = true;
//        short var6 = 0;
//        short var7 = 0;
//        short var8 = 0;
//        if (var14 == null || var18 == null || var20 == null) {
//            var5 = false;
//        }
//
//        for (int var9 = 0; var9 < var13.length; ++var9) {
//            var6 = var5 ? ((Object[]) var14)[var9] : 0;
//            var7 = var5 ? ((Object[]) var18)[var9] : 0;
//            var8 = var5 ? ((Object[]) var20)[var9] : 0;
//            if (var13[var9] >= 0) {
//                if (this.d(var13[var9], var6, var7, var8) != null) {
//                    var13[var9] = -1;
//                } else {
//                    for (int var10 = var9 + 1; var10 < var13.length; ++var10) {
//                        if (var13[var10] >= 0 && var13[var9] == var13[var10] && var6 == (var5 ? ((Object[]) var14)[var10] : 0) && var7 == (var5 ? ((Object[]) var18)[var10] : 0) && var8 == (var5 ? ((Object[]) var20)[var10] : 0)) {
//                            var13[var9] = -1;
//                        }
//                    }
//                }
//            }
//        }
//
//        for (int var24 = 0; var24 < var13.length; ++var24) {
//            if (var13[var24] >= 0) {
//                this.b(var13[var24], var5 ? ((Object[]) var14)[var24] : 0, var5 ? ((Object[]) var18)[var24] : 0, var5 ? ((Object[]) var20)[var24] : 0);
//            }
//        }

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
                if (this.d(var7[var15], var8 < 0 ? 0 : var1.m[var8][1], var8 < 0 ? 0 : var1.m[var8][2], var8 < 0 ? 0 : var1.m[var8][3]) != null) {
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
                    this.b(var7[var16], var1.m[var8][1], var1.m[var8][2], var1.m[var8][3]);
                } else {
                    this.b(var7[var16], (short) 0, (short) 0, (short) 0);
                }
            }
        }

    }

    private void b(short var1, short var2, short var3, short var4) {
        throw new RuntimeException("为实现");
//        if (this.d(var1, var2, var3, var4) == null) {
//            Object var5 = null;
//            DataInputStream var6 = null;
//            boolean var13 = false;
//
//            label127:
//            {
//                label126:
//                {
//                    try {
//                        var13 = true;
//                        aa var20;
//                        if ((var20 = this.a(var1)) == null) {
//                            return;
//                        }
//
//                        if ((var6 = this.a(var20)) == null) {
//                            var13 = false;
//                            break label126;
//                        }
//
//                        this.b(var20, var6, var2, var3, var4);
//                        var13 = false;
//                    } catch (IOException var18) {
//                        ((Throwable) var18).printStackTrace();
//                        var13 = false;
//                        break label127;
//                    } finally {
//                        if (var13) {
//                            try {
//                                if (var6 != null) {
//                                    var6.close();
//                                }
//                            } catch (IOException var14) {
//                            }
//
//                        }
//                    }
//
//                    try {
//                        if (var6 != null) {
//                            var6.close();
//                        }
//
//                        return;
//                    } catch (IOException var17) {
//                        return;
//                    }
//                }
//
//                try {
//                    if (var6 != null) {
//                        var6.close();
//                    }
//
//                    return;
//                } catch (IOException var16) {
//                    return;
//                }
//            }
//
//            try {
//                if (var6 != null) {
//                    var6.close();
//                }
//
//            } catch (IOException var15) {
//            }
//        }
    }

    private void b(FrameInfo var1, DataInputStream var2, short var3, short var4, short var5) throws IOException {
        Frame0 var6;
        (var6 = buildFrame0(a((DataInputStream) var2, (int) 0), var3, var4, var5)).info = var1;
        this.frames.addElement(var6);
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

    private static byte[][] a(DataInputStream var0, int var1) throws IOException {
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

    private DataInputStream a(FrameInfo var1) {
        byte[] var2 = null;
        if (this.name.equals(bt_1.kX) && bt_1.kY != null) {
            g var3 = null;

            for (short var4 = 0; var4 < bt_1.kY.size(); ++var4) {
                if ((var3 = (g) bt_1.kY.elementAt(var4)).a == var1.key) {
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
            if (this.name.equals(bt_1.kX) && (var9 = this.getClass().getResourceAsStream(this.path + var1.key + ".rpg")) != null) {
                var6 = new DataInputStream(var9);
            }

            if (var6 == null) {
                if ((var9 = this.getClass().getResourceAsStream(this.path + var1.b + ".rpg")) == null) {
                    return null;
                }

                var6 = new DataInputStream(var9);
            }
        }

        return var6;
    }

    private FrameInfo d(int var1) {
        for (int var2 = 0; var2 < this.e.length; ++var2) {
            if (this.e[var2] != null && this.e[var2].key == var1) {
                return this.e[var2];
            }
        }

        return null;
    }

    private FrameInfo a(short var1) {
        for (int var2 = 0; var2 < this.e.length; ++var2) {
            if (this.e[var2] != null && this.e[var2].b == var1) {
                return this.e[var2];
            }
        }

        return null;
    }

    private void c(byte[] var1) {
        ByteArrayInputStream var15 = new ByteArrayInputStream(var1);
        DataInputStream var16 = new DataInputStream(var15);
        boolean var9 = false;

        label78:
        {
            try {
                var9 = true;
                short var2 = var16.readShort();
                this.e = new FrameInfo[var2];

                for (int var3 = 0; var3 < var2; ++var3) {
                    this.e[var3] = new FrameInfo(var16.readInt(), var16.readShort());
                }

                var9 = false;
                break label78;
            } catch (IOException var13) {
                ((Throwable) var13).printStackTrace();
                var9 = false;
            } finally {
                if (var9) {
                    try {
                        var16.close();
                        var16.close();
                    } catch (IOException var10) {
                    }

                }
            }

            try {
                var16.close();
                var16.close();
                return;
            } catch (IOException var11) {
                return;
            }
        }

        try {
            var16.close();
            var16.close();
        } catch (IOException var12) {
        }
    }

    private void loadRule() {
        InputStream resourceAsStream = null;
        DataInputStream dataInputStream = null;
        try {
            resourceAsStream = getClass().getResourceAsStream("/" + this.name + ".rule");
            dataInputStream = new DataInputStream(resourceAsStream);
            int size = dataInputStream.readShort();
            this.e = new FrameInfo[size];
            for (int i = 0; i < size; i++) {
                this.e[i] = new FrameInfo(dataInputStream.readInt(), dataInputStream.readShort());
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
                                frame1.k[var5][var6].a = this.a(frame1.k[var5][var6].b, var2, var3, var4);
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
                            var1.j[var3][var4].a = this.a(var1.j[var3][var4].b, var1.m[var2][1], var1.m[var2][2], var1.m[var2][3]);
                        } else {
                            var1.j[var3][var4].a = this.a((short) var1.j[var3][var4].b, (short) 0, (short) 0, (short) 0);
                        }
                    }
                }
            }
        }

        if (var1.k != null) {
            for (int var11 = 0; var11 < var1.k.length; ++var11) {
                if (var1.k[var11] != null) {
                    if ((var2 = var1.a(var1.k[var11].b)) != -1) {
                        var1.k[var11].a = this.a(var1.k[var11].b, var1.m[var2][1], var1.m[var2][2], var1.m[var2][3]);
                    } else {
                        var1.k[var11].a = this.a((short) var1.k[var11].b, (short) 0, (short) 0, (short) 0);
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
                            var10001 = this.a(var1.l[var12].b, var1.m[var2][1], var1.m[var2][2], var1.m[var2][3]);
                        } else {
                            var10000 = var1.l[var12];
                            var10001 = this.a((short) var1.l[var12].b, (short) 0, (short) 0, (short) 0);
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
                            if (var6 >= var10.frames.size()) {
                                t_1.a("no resource " + var13);
                                var10001 = null;
                                break;
                            }

                            Frame1 var14;
                            if (var10.frames.elementAt(var6) instanceof Frame1 && (var14 = (Frame1) var10.frames.elementAt(var6)).info != null && var14.info.b == var13) {
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

    private Frame1 c(short s, short s2, short s3, short s4) {
        for (int i = 0; i < this.frames.size(); i++) {
            Frame cfVar = (Frame) this.frames.elementAt(i);
            if (cfVar.type == 2 && cfVar.info != null && cfVar.info.b == s) {
                Frame1 bcVar = (Frame1) cfVar;
                if (bcVar.a == s2 && bcVar.b == s3 && bcVar.c == s4) {
                    return bcVar;
                }
            }
        }
        return null;
    }


    private Frame0 d(short s, short s2, short s3, short s4) {
        for (int i = 0; i < this.frames.size(); i++) {
            Frame cfVar = (Frame) this.frames.elementAt(i);
            if (cfVar.type == 0 && cfVar.info != null && cfVar.info.b == s) {
                Frame0 bfVar = (Frame0) cfVar;
                if (bfVar.e == s2 && bfVar.f == s3 && bfVar.g == s4) {
                    return bfVar;
                }
            }
        }
        return null;
    }


    private static int[] a(Vector var0, byte var1) {
        int[] var2 = new int[var0.size()];

        for (int var3 = 0; var3 < var0.size(); ++var3) {
            var2[var3] = a((String) var0.elementAt(var3), var1);
        }

        return var2;
    }

    private static int[] a(String[] var0, byte var1) {
        int[] var3 = new int[var0.length];

        for (int var2 = 0; var2 < var0.length; ++var2) {
            if (var0[var2].equals("")) {
                var3[var2] = -1;
            } else {
                var3[var2] = a((String) var0[var2], (byte) 2);
            }
        }

        return var3;
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

    public static int a(String var0, byte var1) {
        return hashKey(wrapName(var0, var1).toCharArray());
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

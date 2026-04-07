package com.cc;

import com.cc.resource.Animation;
import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import java.util.Random;
import java.util.Vector;

//ca_1
public final class LoadingPage {
    public static int a = 16777215;
    public static int b = 0;
    private static int C = 0;
    public static int d = 0;
    public static int e = 0;
    public static int f = 0;
    public static int g = 0;
    private static int[] D = new int[4];
    private static int[][] E;
    private static int[][] F;
    private static int[][] G;
    public static int h = 0;
    private static String[] H = null;
    private static int I;
    private static int[][] J;
    public static int[] j = new int[3];
    private static byte L = 0;
    public static int k = 0;

    private static int DLZ_X;
    private static int DLZ_Y;
    private static int DLZ_W;
    private static int DLZ_H;
    public static int l = 0;
    private static String DLZ_Str;
    private static short R;
    private static short S;
    private static int T;
    private static int U;
    private static FWBRender V;
    private static String[] W;
    private static int X = 0;
    private static int Y = 0;
    private static int Z = 0;
    private static int aa = 0;
    private static int ab = 0;
    private static String ac;
    private static String ad;
    private static FWBRender ae;
    //富文本颜色模式 1-单字符颜色<int1> 2-双字符颜色<int2>
    public static int fwbColorMode = 1;
    /** 全局UI调色板：由服务器配置包8729下发覆盖，富文本/UI着色时按索引取色 */
    public static int[] colors = new int[]{16711680, 4194166, 15588145, 12066995, 12066995, 16776960, 2241484, 16777215, 15138723, 4521983, 16755438, 15095, 14221536, 31834, 13513984, 8750469, 65280, 0, 16514810, 65532, 65316, 16490750, 16197367};
    private static int[] af = new int[2];
    public static int o = 0;
    public static String[] p = new String[0];
    public static int q;
    private static int ag;
    private static int[] ah;
    private static int[][] ai = null;
    private static int[][] aj = new int[4][4];
    private static int[][] ak = new int[2][4];
    private static int[] al = new int[4];
    public static int r;
    public static int s;
    public static int t;
    public static int u;
    private static boolean am = false;
    public static int v;
    public static int w;
    public static int x;
    public static int y;
    public static int z;
    // 加载进度条位置和尺寸 [x, y, width, height]
    private static int[] progressBarXYWH;
    public static int loadProgressPercentage = 0;              // 加载进度百分比（0-100）
    private static String[] tips = new String[]{"系统菜单内可进行动态NPC和小地图等设置", "按“3”键可打开角色物品栏", "按“1”键可查看周围玩家", "按“0”键可打开宠物栏", "按“7”键可打开地图", "按“9”键可打开社交栏", "按“*”键可打开聊天栏", "按“#”键可打开任务栏"};
    // 加载画面顶部提示文字的富文本渲染组件
    private static FWBRender loadingTips;
    private static Random random = new Random();

    public static void fillRect(Graphics graphics, int color, int alpha, int x, int y, int w, int h) {
        SolidColorCache.fillRect(graphics, color, alpha, x, y, w, h);
    }

    //anchor 定位锚点（决定文字相对于 (x,y) 的摆放位置）
    public static void drawString(Graphics var0, String string, int x, int y, int anchor, int color) {
        var0.setColor(color);
        var0.drawString(string, x, y, anchor);
    }

    public static void a(NpcObject var0, FWBRender var1, String[] var2, String[] var3, boolean var4) {
        C = 0;
        d = 0;
        e = 0;
        g = 0;
        f = 0;
        int var11 = 0;
        if (var2 != null) {
            var11 = var2.length;
            F = new int[var2.length][4];
        } else {
            F = null;
        }

        G = null;
        short var9 = 0;
        if (var0 != null) {
            var9 = var0.d();
        }

        if (var1 != null && var1.getLines() != 0) {
            int var6 = (GlobalConfig.defaultHigh - 26 - var9 - var11 * GlobalConfig.font2_h) / GlobalConfig.font2_h;
            if (!var4) {
                C = var1.getLines() / var6 + (var1.getLines() % var6 != 0 ? 1 : 0);
                d = var6;
            } else {
                var6 = var1.getLines();
                int[] var10 = new int[2];
                if (var6 <= var6) {
                    var10[0] = 1;
                    var10[1] = var6;
                } else {
                    int var4_t = 0;
                    for (int var5 = var6; var5 > 0; --var5) {
                        if (var6 % var5 == 0) {
                            ++var4_t;
                        }
                    }

                    if (var4_t == 2) {
                        ++var6;
                    }

                    for (int var13 = var6; var13 > 0; --var13) {
                        if (var6 % var13 == 0) {
                            var10[0] = var6 / var13;
                            var10[1] = var13;
                            break;
                        }
                    }
                }

                C = var10[0];
                d = var10[1];
            }

            if (C > 1) {
                E = new int[2][4];
            } else {
                E = null;
            }
        }

        f = (d + var11) * GlobalConfig.font2_h + 26;
    }

    public static int a(int var0, int var1) {
        if (E != null) {
            if (var0 >= E[0][0] && var0 <= E[0][0] + E[0][2] && var1 >= E[0][1] && var1 <= E[0][1] + E[0][3]) {
                return 8;
            }

            if (var0 >= E[1][0] && var0 <= E[1][0] + E[1][2] && var1 >= E[1][1] && var1 <= E[1][1] + E[1][3]) {
                return 2;
            }
        }

        if (F != null) {
            for (int var2 = 0; var2 < F.length; ++var2) {
                if (var0 >= F[var2][0] && var0 <= F[var2][0] + F[var2][2] && var1 >= F[var2][1] && var1 <= F[var2][1] + F[var2][3]) {
                    g = var2;
                    return 1073741824;
                }
            }
        }

        if (G != null) {
            if (G.length >= 1 && var0 >= G[0][0] && var0 <= G[0][0] + G[0][2] && var1 >= G[0][1] && var1 <= G[0][1] + G[0][3]) {
                return 268435456;
            }

            if (G.length == 2 && var0 >= G[1][0] && var0 <= G[1][0] + G[1][2] && var1 >= G[1][1] && var1 <= G[1][1] + G[1][3]) {
                return 536870912;
            }
        } else if (D != null && (var0 < D[0] || var0 > D[0] + D[2] || var1 < D[1] || var1 > D[1] + D[3])) {
            return 536870912;
        }

        return 0;
    }

    public static void a(Graphics var0, int var1, int var2, int var3, int var4, FWBRender var5, String[] var6, String[] var7) {
        a((Graphics) var0, 0, var2, var3, var4);
        a((int[]) D, 0, var2, var3, var4);
        if (var5 != null) {
            var1 = e + d >= var5.getLines() ? var5.getLines() : e + d;

            for (int var10 = e; var10 < var1; ++var10) {
                var5.drawLine(var0, 10, var2 + 12 + (var10 - e) * GlobalConfig.font2_h, var10, 20);
            }

            if (MainCanvas.go_left != null) {
                if (e != 0) {
                    PngUtil.animate(MainCanvas.go_left, System.currentTimeMillis());
                    MainCanvas.pngUtil.a(var0, (Animation) MainCanvas.go_left, (int[]) null, 0, 0, 16, var2 + 5, 20, 0);
                    a((int[]) (E != null ? E[0] : null), 16, var2 + 5, 16, 9);
                } else {
                    a((int[]) (E != null ? E[0] : null), 0, 0, 0, 0);
                }
            }

            if (MainCanvas.go_right != null) {
                if (e + d < var5.getLines()) {
                    PngUtil.animate(MainCanvas.go_right, System.currentTimeMillis());
                    MainCanvas.pngUtil.a(var0, (Animation) MainCanvas.go_right, (int[]) null, 0, 0, var3 - 32, var2 + 5, 20, 0);
                    a((int[]) (E != null ? E[1] : null), var3 - 32, var2 + 5, 16, 9);
                } else {
                    a((int[]) (E != null ? E[1] : null), 0, 0, 0, 0);
                }
            }
        }

        if (var6 != null && F != null) {
            for (int var9 = 0; var9 < var6.length; ++var9) {
                a((int[]) (F != null ? F[var9] : null), 10, var2 + var4 - 9 - (var6.length - var9) * GlobalConfig.font2_h, GlobalConfig.font2.stringWidth(var6[var9]), GlobalConfig.font2_h);
                drawString(var0, (String) var6[var9], (int) F[var9][0], F[var9][1], 20, g == var9 ? 16711680 : 16777215, 0);
            }
        }

    }

    public static void drawDialog(Graphics var0, String var1, String[] var2) {
        if (var1 != null) {
            l = 0;
            var0.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
            if (h >= 0) {
                if (h == 0) {
                    I = ((H = parseText(var1, GlobalConfig.font2, GlobalConfig.defaultWidth - 10, "\t")).length + 1) * GlobalConfig.font2_h + 20;
                    a(var0, GlobalConfig.defaultWidth / 2 * 3, (GlobalConfig.defaultHigh - I / 4) / 2, GlobalConfig.defaultWidth / 4, I / 4);
                    J = new int[var2.length][4];
                } else if (h == 1) {
                    a(var0, GlobalConfig.defaultWidth / 4, (GlobalConfig.defaultHigh - I / 2) / 2, GlobalConfig.defaultWidth / 2, I / 2);
                } else if (h == 2) {
                    a(var0, GlobalConfig.defaultWidth / 8, (GlobalConfig.defaultHigh - I / 4 * 3) / 2, GlobalConfig.defaultWidth / 4 * 3, I / 4 * 3);
                } else {
                    a((Graphics) var0, 0, (GlobalConfig.defaultHigh - I) / 2, GlobalConfig.defaultWidth, I);
                    if (H != null) {
                        if (H.length == 1) {
                            drawString(var0, (String) H[0], (int) ((GlobalConfig.defaultWidth - GlobalConfig.font2.stringWidth(H[0])) / 2), (GlobalConfig.defaultHigh - I) / 2 + 10, 20, 16777215, 0);
                        } else {
                            for (int var3 = 0; var3 < H.length; ++var3) {
                                drawString(var0, (String) H[var3], (int) ((GlobalConfig.defaultWidth - GlobalConfig.font2.stringWidth(H[var3])) / 2), (GlobalConfig.defaultHigh - I) / 2 + 10 + var3 * GlobalConfig.font2_h, 20, 16777215, 0);
                            }
                        }
                    }

                    if (J == null) {
                        h = 0;
                        return;
                    }

                    if (var2.length == 2) {
                        a((String) var2[0], 0, 10, (GlobalConfig.defaultHigh - I) / 2 + I - 9 - GlobalConfig.font2_h);
                        drawString(var0, (String) var2[0], (int) J[0][0], J[0][1], 20, 16775357, 0);
                        a((String) var2[1], 1, GlobalConfig.defaultWidth - 10 - GlobalConfig.font2.stringWidth(var2[1]), (GlobalConfig.defaultHigh - I) / 2 + I - 9 - GlobalConfig.font2_h);
                        drawString(var0, (String) var2[1], (int) J[1][0], J[1][1], 20, 16775357, 0);
                    } else {
                        a((String) var2[0], 0, (GlobalConfig.defaultWidth - GlobalConfig.font2.stringWidth(var2[0])) / 2, (GlobalConfig.defaultHigh - I) / 2 + I - 9 - GlobalConfig.font2_h);
                        drawString(var0, (String) var2[0], (int) J[0][0], J[0][0], 20, 16775357, 0);
                    }
                }
            }

            ++h;
        }
    }

    private static void a(String var0, int var1, int var2, int var3) {
        if (var0 != null && J != null && J.length > var1) {
            J[var1][0] = var2;
            J[var1][1] = var3;
            J[var1][2] = GlobalConfig.font2.stringWidth(var0);
            J[var1][3] = GlobalConfig.font2_h;
        }

    }

    public static int b(int var0, int var1) {
        if (J != null) {
            if (J.length >= 1 && var0 >= J[0][0] && var0 <= J[0][0] + J[0][2] && var1 >= J[0][1] && var1 <= J[0][1] + J[0][3]) {
                return 268435456;
            }

            if (J.length == 2 && var0 >= J[1][0] && var0 <= J[1][0] + J[1][2] && var1 >= J[1][1] && var1 <= J[1][1] + J[1][3]) {
                return 536870912;
            }
        }

        return 0;
    }

    public static void a(Graphics var0, int var1, int var2, int var3, int var4) {
        var0.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
        fillRect(var0, 1009050, 180, var1, var2, var3, var4);
        setColor(var0, 2);
        var0.drawRect(var1, var2, var3 - 1, var4 - 1);
        var0.drawRect(var1 + 4, var2 + 4, var3 - 9, var4 - 9);
        setColor(var0, 3);
        var0.drawRect(var1 + 1, var2 + 1, var3 - 3, var4 - 3);
        var0.drawRect(var1 + 3, var2 + 3, var3 - 7, var4 - 7);
        setColor(var0, 4);
        var0.drawRect(var1 + 2, var2 + 2, var3 - 5, var4 - 5);
        if (MainCanvas.lu0 != null) {
            var0.drawImage(MainCanvas.lu0.image, var1, var2, 20);
        }

        if (MainCanvas.ld0 != null) {
            var0.drawImage(MainCanvas.ld0.image, var1, var2 + var4 - MainCanvas.ld0.h, 20);
        }

        if (MainCanvas.ru0 != null) {
            var0.drawImage(MainCanvas.ru0.image, var1 + var3 - MainCanvas.ru0.w, var2, 20);
        }

        if (MainCanvas.rd0 != null) {
            var0.drawImage(MainCanvas.rd0.image, var1 + var3 - MainCanvas.rd0.w, var2 + var4 - MainCanvas.rd0.h, 20);
        }

    }

    public static void a(Graphics var0, Image var1, short var2, int var3, int var4, int var5, int var6) {
        var0.setClip(var3, var4, var5, var6);
        var5 = var5 / var2 + (var5 % var2 != 0 ? 1 : 0);

        for (int var8 = 0; var8 < var5; ++var8) {
            var0.drawImage(var1, var3 + var8 * var2, var4, 20);
        }

        var0.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
    }

    public static void b(Graphics var0, int var1, int var2, int var3, int var4) {
        setColor(var0, 2);
        var0.fillRect(var1, var2, 5, var4 - var2);
        setColor(var0, 3);
        var0.fillRect(var1 + 1, var2, 3, var4 - var2);
        setColor(var0, 4);
        var0.drawLine(var1 + 2, var2, var3 + 2, var4 - 1);
    }

    public static void draw(Graphics var0, int var1, int var2, int var3, int var4) {
        var0.setColor(26540);
        var0.fillRect(var1, var2, 3, var4 - var2);
        var0.setColor(11267556);
        var0.drawLine(var1 + 1, var2, var3 + 1, var4);
    }

    public static void draw(Graphics graphics, int x, int y, int w, int h, int color) {
        if (color == 1) {
            graphics.setColor(6732228);
            graphics.fillRect(x, y, w, h);
        } else if (color == 2) {
            graphics.setColor(4562087);
            graphics.fillRect(x, y, w, h);
        } else if (color == 3) {
            graphics.setColor(6793943);
            graphics.fillRect(x, y, w, h);
        } else if (color == 4) {
            fillRect(graphics, 8634850, 210, x, y, w, h);
        }

        graphics.setColor(26540);
        graphics.drawRect(x, y, w, h);
        graphics.drawRect(x + 2, y + 2, w - 4, h - 4);
        graphics.setColor(11267556);
        graphics.drawRect(x + 1, y + 1, w - 2, h - 2);
    }

    public static void a(Graphics var0, Image var1, int var2, int var3, int var4, int var5, boolean var6) {
        var0.setColor(409969);
        var0.fillRect(var2, var3, var4, var5);
        if (var6) {
            var0.setColor(6597852);
        } else {
            var0.setColor(5018307);
        }

        var0.fillRect(var2 + 3, var3 + 3, var4 - 6, var5 - 6);
        if (var6) {
            var0.setColor(16775125);
        } else {
            var0.setColor(3775208);
        }

        var0.drawRect(var2 + 1, var3 + 1, var4 - 3, var5 - 3);
    }

    public static void draw(Graphics g) {
        g.setColor(11267556);
        g.fillRect(j[0] - 2, j[1], j[2] + 4, 2);
        g.setColor(26540);
        g.fillRect(j[0] - 1, j[1], j[2] + 2, 3);
        g.setColor(6732228);
        g.fillRect(j[0], j[1], j[2], 3);
    }

    public static void draw(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        var0.setColor(20871);
        var0.fillRect(var1 + 4, var2, 4, var3);
        var0.setColor(1152942);
        var0.fillRect(var1 + 5, var2, 2, var3);
        var0.drawImage(MainCanvas.up.image, var1, var2, 20);
        var0.drawImage(MainCanvas.down.image, var1, var2 + var3 - MainCanvas.down.h, 20);
        int var8 = 0;
        if (var6 == var7) {
            var4 = 0;
        }

        if (var4 > 0) {
            var8 = var2 + MainCanvas.up.h + (var3 - MainCanvas.up.h - MainCanvas.down.h - var4) * var5 / (var6 - var7);
        } else if (var4 <= 0) {
            var8 = var2 + MainCanvas.up.h;
            var4 = var3 - MainCanvas.up.h - MainCanvas.down.h;
        }

        var0.setColor(11267556);
        var0.fillRect(var1, var8, MainCanvas.up.w - 1, var4 - 1);
        var0.setColor(5555146);
        var0.fillRect(var1 + 2, var8 + 2, 8, var4 - 4);
        var0.setColor(1801628);
        var0.fillRect(var1 + 3, var8 + 3, 6, var4 - 6);
        var0.setColor(1464956);
        var0.fillRect(var1 + 6, var8 + 4, 2, var4 - 8);
        var0.setColor(150092);
        var0.drawRect(var1, var8, MainCanvas.up.w - 1, var4 - 1);
    }

    public static void b(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
        var0.setColor(var1);
        var1 = Math.abs(var4);
        var4 /= var1;

        for (int var8 = 0; var8 < var1; ++var8) {
            var0.drawLine(var2 + var8 * var4, var3 - var8, var2 + var8 * var4, var3 + var8);
        }

    }

    //根据宽度将文本处理成多行
    public static String[] parseText(String text, Font font, int w, String split) {
        if (text == null) {
            text = "";
        }

        Vector vector = new Vector();
        String[] strs = split(text, split);
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            do {
                String cut = cutString(str, font, w);
                vector.addElement(cut);
                str = str.substring(cut.length());
            } while (str.length() != 0);
        }

        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        return filterEmpty(strArr);
    }


    private static String[] filterEmpty(String[] var0) {
        Vector var1 = new Vector();
        for (int i = 0; i < var0.length; ++i) {
            if (var0[i] != null && var0[i].length() != 0) {
                var1.addElement(var0[i]);
            }
        }

        String[] var3 = new String[var1.size()];
        var1.copyInto(var3);
        return var3;
    }

    private static String[] split(String text, String split) {
        String[] var3 = new String[0];
        while (true) {
            int var2 = text.indexOf(split);
            if (var2 < 0) {
                var3 = arrayAppend(var3, text);
                break;
            }
            var3 = arrayAppend(var3, text.substring(0, var2));
            text = text.substring(var2 + split.length());
        }
        return var3;
    }

    //根据文本框宽度裁剪字符串
    private static String cutString(String str, Font font, int w) {
        int strW = font.stringWidth(str);
        return strW <= w ? str : cutString(str.substring(0, str.length() * w / strW), font, w);
    }

    private static String[] arrayAppend(String[] var4, String var1) {
        if (var1 == null) {
            return var4;
        } else if (var4 == null) {
            return new String[]{var1};
        } else {
            String[] var2 = new String[var4.length + 1];
            System.arraycopy(var4, 0, var2, 0, var4.length);
            var2[var2.length - 1] = var1;
            return var2;
        }
    }

    public static void setColor(Graphics var0, int color) {
        int var2 = 0;
        switch (color) {
            case -1:
                var2 = 16777215;
                break;
            case 1:
                var2 = 6014420;
                break;
            case 2:
                var2 = 20871;
                break;
            case 3:
                var2 = 1152942;
                break;
            case 4:
                var2 = 9820642;
                break;
            case 5:
            case 6:
            case 7:
                var2 = 12170677;
                break;
            case 8:
                var2 = 852044;
                break;
            case 9:
                var2 = 873078;
                break;
            case 10:
                var2 = 7479845;
                break;
            case 11:
                var2 = 29803;
        }
        var0.setColor(var2);
    }

    public static void drawString(Graphics var0, String var1, int var2, int var3, int var4, int var5, int color) {
        var0.setColor(color);
        var0.drawString(var1, var2 - 1, var3 - 1, var4);
        var0.drawString(var1, var2, var3 - 1, var4);
        var0.drawString(var1, var2 - 1, var3, var4);
        var0.drawString(var1, var2 + 1, var3, var4);
        var0.drawString(var1, var2, var3 + 1, var4);
        var0.drawString(var1, var2 + 1, var3 + 1, var4);
        var0.setColor(var5);
        var0.drawString(var1, var2, var3, var4);
    }

    public static void a(Graphics var0, int var1, int var2, int var3) {
        var0.setColor(26540);
        var0.fillRect(var1, var2, var3 - 1, 3);
        var0.setColor(11267556);
        var0.drawLine(var1, var2 + 1, var1 + var3 - 1, var2 + 1);
    }

    //展示"请求中..."
    public static void showDLZ(int x, int y, int w, int h, String tips) {
        DLZ_X = x;
        DLZ_Y = y;
        DLZ_W = w;
        DLZ_Str = tips == null ? "载入中…" : tips;
        DLZ_H = DLZ_X + (DLZ_W - GlobalConfig.font2.stringWidth(DLZ_Str)) / 2;
    }

    public static void globalLoadingMask(Graphics var0) {
        var0.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
        fillRect(var0, 1808583, 95, DLZ_X, DLZ_Y - (4 + GlobalConfig.font2_h), DLZ_W, 8 + GlobalConfig.font2_h + 18);
        var0.setColor(26540);
        var0.drawRect(DLZ_X, DLZ_Y - (4 + GlobalConfig.font2_h), DLZ_W, 8 + GlobalConfig.font2_h + 18);
        var0.drawRect(DLZ_X + 2, DLZ_Y - (2 + GlobalConfig.font2_h), DLZ_W - 4, 8 + GlobalConfig.font2_h + 14);
        var0.setColor(11267556);
        var0.drawRect(DLZ_X + 1, DLZ_Y - (3 + GlobalConfig.font2_h), DLZ_W - 2, 8 + GlobalConfig.font2_h + 16);
        drawString(var0, (String) DLZ_Str, (int) DLZ_H, DLZ_Y, 36, 16777215, 727632);
        var0.setColor(539727);
        var0.fillRect(DLZ_X + 2, DLZ_Y, DLZ_W - 4, 18);
        var0.setColor(4448748);
        var0.drawRect(DLZ_X + 3, DLZ_Y + 1, DLZ_W - 6, 15);
        var0.setColor(1265510);
        var0.fillRect(DLZ_X + 4, DLZ_Y + 3, DLZ_W - 8, 12);
        var0.setClip(DLZ_X + 4, DLZ_Y + 3, DLZ_W - 8, 12);
        int var10001 = DLZ_X + 3 + l % (DLZ_W + 15) - 20;
        int var3 = DLZ_Y + 3;
        int var2 = var10001;
        var0.setColor(4432868);
        var0.fillRect(var2 + 1, var3 + 1, 23, 10);
        var0.setColor(10738430);
        var0.fillRect(var2 + 2, var3 + 3, 21, 5);
        var0.setColor(15333119);
        var0.drawLine(var2 + 2, var3 + 5, var2 + 22, var3 + 5);
        var0.setColor(26540);
        var0.drawRect(var2, var3, 24, 11);
        var0.drawLine(var2 + 12, var3, var2 + 12, var3 + 12);
        var0.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
        l += 2;
    }


    public static String[] a(String str, Font font, int i2) {
        String strSubstring;
        Vector vector = new Vector();
        String str2 = str;
        do {
            String strC = c(str2, font, i2);
            vector.addElement(strC);
            strSubstring = str2.substring(strC.length());
            str2 = strSubstring;
        } while (strSubstring.length() != 0);
        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        return filterEmpty(strArr);
    }


    private static String c(String var0, Font var1, int var2) {
        S = 0;
        R = 0;
        int var3;
        if ((var3 = var1.stringWidth(var0)) <= var2) {
            return var0;
        } else {
            String var7 = var0.substring(0, var0.length() * var2 / var3);

            for (int var5 = 0; var5 < var7.length(); ++var5) {
                char var4;
                if ((var4 = var7.charAt(var5)) == '<') {
                    ++R;
                } else if (var4 == '>') {
                    ++S;
                }
            }

            if (R != S) {
                T = var0.lastIndexOf(60);
                if ((U = var0.lastIndexOf(62)) - T >= 1) {
                    try {
                        if (Integer.parseInt(var0.substring(T + 1, U)) <= 41) {
                            var7 = var0.substring(0, var0.lastIndexOf(60));
                        }
                    } catch (Exception var6) {
                    }
                } else {
                    var7 = var0.substring(0, T);
                }
            }

            return c(var7, var1, var2);
        }
    }

    public static void b(Graphics graphics, String str, int i2, int i3, int i4, int i5) {
        if (str == null || i5 == 0 || str.trim().length() == 0) {
            return;
        }
        if (l >= 15) {
            int i6 = GlobalConfig.realWidth - 20;
            String strSubstring = str;
            String string = "";
            while (true) {
                int iIndexOf = strSubstring.indexOf(62);
                if (iIndexOf < 0) {
                    string = new StringBuffer().append(string).append(strSubstring).toString();
                    break;
                }
                if (iIndexOf - 2 < 0 || strSubstring.charAt(iIndexOf - 2) != '<') {
                    string = new StringBuffer().append(string).append(strSubstring.substring(0, iIndexOf + 1)).toString();
                    strSubstring = strSubstring.substring(iIndexOf + 1);
                } else {
                    string = new StringBuffer().append(string).append(strSubstring.substring(0, iIndexOf - 2)).toString();
                    strSubstring = strSubstring.substring(iIndexOf + 1);
                }
                if (iIndexOf < 0) {
                    break;
                }
            }
            String[] strArrA = parseText(string.trim(), GlobalConfig.font2, i6, "\t");
            int iMax = 0;
            for (int i1 = 0; i1 < strArrA.length; i1++) {
                String str2 = strArrA[i1];
                iMax = Math.max(iMax, GlobalConfig.font2.stringWidth(str2) + 8);
            }

            X = Math.min(iMax, i6);
            if (i5 == 1) {
                V = new FWBRender(str, (short) (X - 8));
                Y = (GlobalConfig.font2_h * V.getLines()) + 8;
            } else if (i5 == 2) {
                W = parseText(str.trim(), GlobalConfig.font2, X - 8, "\t");
                Y = (GlobalConfig.font2_h * W.length) + 8;
            }
            Z = i2 + X <= GlobalConfig.gameX + GlobalConfig.realWidth ? i2 : i2 - X >= GlobalConfig.gameX ? i2 - X : GlobalConfig.gameX + ((GlobalConfig.realWidth - X) / 2);
            aa = i3 + Y <= i4 ? i3 : i3 - Y >= GlobalConfig.gameY ? i3 - Y : GlobalConfig.gameY + ((GlobalConfig.realHigh - Y) / 2);
            if (l == 15) {
                fillRect(graphics, 1009050, 210, Z, aa, X / 4, Y / 4);
            } else if (l == 16) {
                fillRect(graphics, 1009050, 210, Z, aa, X / 2, Y / 2);
            } else if (l == 17) {
                fillRect(graphics, 1009050, 210, Z, aa, (X / 4) * 3, (Y / 4) * 3);
            } else {
                fillRect(graphics, 1009050, 210, Z, aa, X, Y);
                graphics.setColor(16230);
                graphics.drawRect(Z, aa, X, Y);
                if (i5 == 1) {
                    V.a(graphics, Z + 4, aa + 4, 20);
                } else if (i5 == 2) {
                    graphics.setColor(15138723);
                    for (int i7 = 0; i7 < W.length; i7++) {
                        if (W[i7] != null) {
                            graphics.drawString(W[i7], Z + 4, aa + 4 + (i7 * GlobalConfig.font2_h), 0);
                        }
                    }
                }
            }
        }
        l++;
    }

    public static void a(Graphics var0, String var1, long var2, int var4, int var5) {
        a(var0, var1, var2, var4, var5, 20);
    }

    public static void a(Graphics var0, String var1, long var2, int var4, int var5, int var6) {
        if (l >= 15) {
            if (l == 15) {
                label148:
                {
                    ad = var2 >= 0L ? "价格:" + GlobalConfig.yinLiangFormat(new StringBuffer(), var2) : null;
                    String var10000;
                    if (var1 != null) {
                        if ((ab = parseColor(var1) != -1 ? parseColor(var1) : 15138723) != 15138723) {
                            if (var1.charAt(2) == '>') {
                                ac = var1.substring(3, var1.length());
                            } else {
                                ac = var1.substring(4, var1.length());
                            }
                            break label148;
                        }

                        var10000 = var1;
                    } else {
                        ab = 15138723;
                        int var10001 = 15138723;
                        var10000 = "";
                    }

                    ac = var10000;
                }

                X = Math.max(GlobalConfig.font2.stringWidth(ac), ad == null ? 0 : GlobalConfig.font2.stringWidth(ad)) + 8;
                Y = GlobalConfig.font2_h * (ad == null ? 1 : 2) + 8;
                Z = var4;
                aa = var5;
                if (var6 == 40) {
                    if (Z - X < 0) {
                        fillRect(var0, 1009050, 210, Z, var5 - Y / 4, X / 4, Y / 4);
                    } else {
                        fillRect(var0, 1009050, 210, Z - X / 4, var5 - Y / 4, X / 4, Y / 4);
                    }
                } else if (var6 == 36) {
                    if (Z + X > GlobalConfig.gameX + GlobalConfig.realWidth) {
                        fillRect(var0, 1009050, 210, Z - X / 4, var5 - Y / 4, X / 4, Y / 4);
                    } else {
                        fillRect(var0, 1009050, 210, Z, var5 - Y / 4, X / 4, Y / 4);
                    }
                } else if (var6 == 24) {
                    if (Z - X < 0) {
                        fillRect(var0, 1009050, 210, Z, var5, X / 4, Y / 4);
                    } else {
                        fillRect(var0, 1009050, 210, Z - X / 4, var5, X / 4, Y / 4);
                    }
                } else if (var4 + X <= GlobalConfig.gameX + GlobalConfig.realWidth) {
                    fillRect(var0, 1009050, 210, Z, var5, X / 4, Y / 4);
                } else {
                    fillRect(var0, 1009050, 210, Z - X / 4, var5, X / 4, Y / 4);
                }
            } else if (l == 16) {
                if (var6 == 40) {
                    if (Z - X < 0) {
                        fillRect(var0, 1009050, 210, Z, var5 - Y / 4, X / 4, Y / 4);
                    } else {
                        fillRect(var0, 1009050, 210, Z - X / 2, var5 - Y / 2, X / 2, Y / 2);
                    }
                } else if (var6 == 36) {
                    if (Z + X > GlobalConfig.gameX + GlobalConfig.realWidth) {
                        fillRect(var0, 1009050, 210, Z - X / 2, var5 - Y / 2, X / 2, Y / 2);
                    } else {
                        fillRect(var0, 1009050, 210, Z, var5 - Y / 2, X / 2, Y / 2);
                    }
                } else if (var6 == 24) {
                    if (Z - X < 0) {
                        fillRect(var0, 1009050, 210, Z, var5, X / 2, Y / 2);
                    } else {
                        fillRect(var0, 1009050, 210, Z - X / 2, var5, X / 2, Y / 2);
                    }
                } else if (var4 + X <= GlobalConfig.gameX + GlobalConfig.realWidth) {
                    fillRect(var0, 1009050, 210, Z, var5, X / 2, Y / 2);
                } else {
                    fillRect(var0, 1009050, 210, Z - X / 2, var5, X / 2, Y / 4);
                }
            } else if (l == 17) {
                if (var6 == 40) {
                    if (Z - X < 0) {
                        fillRect(var0, 1009050, 210, Z, var5 - Y / 2, X / 2, Y / 2);
                    } else {
                        fillRect(var0, 1009050, 210, Z - X / 4 * 3, var5 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
                    }
                } else if (var6 == 36) {
                    if (Z + X > GlobalConfig.gameX + GlobalConfig.realWidth) {
                        fillRect(var0, 1009050, 210, Z - X / 4 * 3, var5 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
                    } else {
                        fillRect(var0, 1009050, 210, Z, var5 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
                    }
                } else if (var6 == 24) {
                    if (Z - X < 0) {
                        fillRect(var0, 1009050, 210, Z, var5, X / 4 * 3, Y / 4 * 3);
                    } else {
                        fillRect(var0, 1009050, 210, Z - X / 4 * 3, var5, X / 4 * 3, Y / 4 * 3);
                    }
                } else if (var4 + X <= GlobalConfig.gameX + GlobalConfig.realWidth) {
                    fillRect(var0, 1009050, 210, Z, var5, X / 4 * 3, Y / 4 * 3);
                } else {
                    fillRect(var0, 1009050, 210, Z - X / 4 * 3, var5, X / 4 * 3, Y / 4 * 3);
                }
            } else {
                var0.setColor(16230);
                if (var6 == 40) {
                    if (Z - X < 0) {
                        fillRect(var0, 1009050, 210, Z, var5 - Y, X, Y);
                        var0.drawRect(Z, var5 - Y, X, Y);
                        var0.setColor(ab);
                        var0.drawString(ac, Z + 4, var5 - Y + 4, 20);
                        if (ad != null) {
                            var0.drawString(ad, Z + 4, var5 - Y + 4 + GlobalConfig.font2_h, 20);
                        }
                    } else {
                        fillRect(var0, 1009050, 210, Z - X, var5 - Y, X, Y);
                        var0.drawRect(Z - X, var5 - Y, X, Y);
                        var0.setColor(ab);
                        var0.drawString(ac, Z - X + 4, var5 - Y + 4, 20);
                        if (ad != null) {
                            var0.drawString(ad, Z - X + 4, var5 - Y + 4 + GlobalConfig.font2_h, 20);
                        }
                    }
                } else if (var6 == 36) {
                    if (Z + X > GlobalConfig.gameX + GlobalConfig.realWidth) {
                        fillRect(var0, 1009050, 210, Z - X, var5 - Y, X, Y);
                        var0.drawRect(Z - X, var5 - Y, X, Y);
                        var0.setColor(ab);
                        var0.drawString(ac, Z - X + 4, var5 - Y + 4, 20);
                        if (ad != null) {
                            var0.drawString(ad, Z - X + 4, var5 - Y + 4 + GlobalConfig.font2_h, 20);
                        }
                    } else {
                        fillRect(var0, 1009050, 210, Z, var5 - Y, X, Y);
                        var0.drawRect(Z, var5 - Y, X, Y);
                        var0.setColor(ab);
                        var0.drawString(ac, Z + 4, var5 - Y + 4, 20);
                        if (ad != null) {
                            var0.drawString(ad, Z + 4, var5 - Y + 4 + GlobalConfig.font2_h, 20);
                        }
                    }
                } else if (var6 == 24) {
                    if (Z - X < 0) {
                        fillRect(var0, 1009050, 210, Z, var5, X, Y);
                        var0.drawRect(Z, var5, X, Y);
                        var0.setColor(ab);
                        var0.drawString(ac, Z + 4, var5 + 4, 20);
                        if (ad != null) {
                            var0.drawString(ad, Z + 4, var5 + 4 + GlobalConfig.font2_h, 20);
                        }
                    } else {
                        fillRect(var0, 1009050, 210, Z - X, var5, X, Y);
                        var0.drawRect(Z - X, var5, X, Y);
                        var0.setColor(ab);
                        var0.drawString(ac, Z - X + 4, var5 + 4, 20);
                        if (ad != null) {
                            var0.drawString(ad, Z - X + 4, var5 + 4 + GlobalConfig.font2_h, 20);
                        }
                    }
                } else {
                    int var8 = Z;
                    int var7 = aa;
                    if (var4 + X > GlobalConfig.gameX + GlobalConfig.realWidth && (var8 -= X) < 0) {
                        var8 = 0;
                    }

                    fillRect(var0, 1009050, 210, var8, var7, X, Y);
                    var0.drawRect(var8, var7, X, Y);
                    var0.setColor(ab);
                    var0.drawString(ac, var8 + 4, var7 + 4, 20);
                    if (ad != null) {
                        var0.drawString(ad, var8 + 4, var7 + 4 + GlobalConfig.font2_h, 20);
                    }
                }
            }
        }

        ++l;
    }

    public static void a(Graphics var0, String var1, String var2, int var3, int var4, int var5) {
        if (l >= 15) {
            if (l == 15) {
                X = GlobalConfig.defaultWidth - 30;
                if (var2.equals("")) {
                    ae = null;
                } else {
                    ae = new FWBRender(var2, (short) (X - 8));
                }

                if (var1 != null) {
                    ac = (ab = parseColor(var1) != -1 ? parseColor(var1) : 15138723) != 15138723 ? var1.substring(3, var1.length()) : var1;
                } else {
                    ab = 15138723;
                    int var10001 = 15138723;
                    ac = "";
                }

                int var6 = GlobalConfig.font2.stringWidth(ac) + 8;
                X = ae == null ? var6 : (ae.a <= 0 ? X : Math.max(var6, ae.a + 8));
                Y = GlobalConfig.font2_h * (ae == null ? 1 : ae.getLines() + 1) + 8;
                if (var3 + X > GlobalConfig.defaultWidth) {
                    var3 = GlobalConfig.defaultWidth - X;
                } else if (var3 < 0) {
                    var3 = 0;
                }

                if (var4 + Y > GlobalConfig.defaultHigh) {
                    var4 = GlobalConfig.defaultHigh - Y;
                } else if (var4 < 0) {
                    var4 = 0;
                }

                Z = var3;
                if (var5 == 40) {
                    if (Z - X < 0) {
                        if (var4 < Y) {
                            fillRect(var0, 1009050, 210, Z, var4, X / 4, Y / 4);
                        } else {
                            fillRect(var0, 1009050, 210, Z, var4 - Y / 4, X / 4, Y / 4);
                        }
                    } else if (var4 < Y) {
                        fillRect(var0, 1009050, 210, Z, var4, X / 4, Y / 4);
                    } else {
                        fillRect(var0, 1009050, 210, Z - X / 4, var4 - Y / 4, X / 4, Y / 4);
                    }
                } else {
                    label279:
                    {
                        if (var5 == 36) {
                            if (Z + X <= GlobalConfig.defaultWidth) {
                                if (var4 < Y) {
                                    fillRect(var0, 1009050, 210, Z, var4, X / 4, Y / 4);
                                } else {
                                    fillRect(var0, 1009050, 210, Z, var4 - Y / 4, X / 4, Y / 4);
                                }
                                break label279;
                            }

                            if (var4 >= Y) {
                                fillRect(var0, 1009050, 210, Z - X / 4, var4 - Y / 4, X / 4, Y / 4);
                                break label279;
                            }
                        } else {
                            if (var5 == 24) {
                                if (Z - X < 0) {
                                    if (var4 + Y >= GlobalConfig.defaultHigh) {
                                        fillRect(var0, 1009050, 210, Z, var4 - Y / 4, X / 4, Y / 4);
                                    } else {
                                        fillRect(var0, 1009050, 210, Z, var4, X / 4, Y / 4);
                                    }
                                } else if (var4 + Y >= GlobalConfig.defaultHigh) {
                                    fillRect(var0, 1009050, 210, Z, var4 - Y / 4, X / 4, Y / 4);
                                } else {
                                    fillRect(var0, 1009050, 210, Z - X / 4, var4, X / 4, Y / 4);
                                }
                                break label279;
                            }

                            if (var3 + X <= GlobalConfig.defaultWidth) {
                                if (var4 + Y >= GlobalConfig.defaultHigh) {
                                    fillRect(var0, 1009050, 210, Z - X / 4, var4 - Y / 4, X / 4, Y / 4);
                                } else {
                                    fillRect(var0, 1009050, 210, Z, var4, X / 4, Y / 4);
                                }
                                break label279;
                            }

                            if (var4 + Y >= GlobalConfig.defaultHigh) {
                                fillRect(var0, 1009050, 210, Z - X / 4, var4 - Y / 4, X / 4, Y / 4);
                                break label279;
                            }
                        }

                        fillRect(var0, 1009050, 210, Z - X / 4, var4, X / 4, Y / 4);
                    }
                }
            } else if (l == 16) {
                if (var5 == 40) {
                    if (Z - X < 0) {
                        if (var4 < Y) {
                            fillRect(var0, 1009050, 210, Z, var4, X / 4, Y / 4);
                        } else {
                            fillRect(var0, 1009050, 210, Z, var4 - Y / 4, X / 4, Y / 4);
                        }
                    } else if (var4 < Y) {
                        fillRect(var0, 1009050, 210, Z, var4, X / 2, Y / 2);
                    } else {
                        fillRect(var0, 1009050, 210, Z - X / 2, var4 - Y / 2, X / 2, Y / 2);
                    }
                } else if (var5 == 36) {
                    if (Z + X > GlobalConfig.defaultWidth) {
                        if (var4 < Y) {
                            fillRect(var0, 1009050, 210, Z - X / 2, var4, X / 2, Y / 2);
                        } else {
                            fillRect(var0, 1009050, 210, Z - X / 2, var4 - Y / 2, X / 2, Y / 2);
                        }
                    } else if (var4 < Y) {
                        fillRect(var0, 1009050, 210, Z, var4, X / 2, Y / 2);
                    } else {
                        fillRect(var0, 1009050, 210, Z, var4 - Y / 2, X / 2, Y / 2);
                    }
                } else if (var5 == 24) {
                    if (Z - X < 0) {
                        if (var4 + Y >= GlobalConfig.defaultHigh) {
                            fillRect(var0, 1009050, 210, Z, var4 - Y / 2, X / 2, Y / 2);
                        } else {
                            fillRect(var0, 1009050, 210, Z, var4, X / 2, Y / 2);
                        }
                    } else if (var4 + Y >= GlobalConfig.defaultHigh) {
                        fillRect(var0, 1009050, 210, Z, var4 - Y / 2, X / 2, Y / 2);
                    } else {
                        fillRect(var0, 1009050, 210, Z - X / 2, var4, X / 2, Y / 2);
                    }
                } else if (var3 + X <= GlobalConfig.defaultWidth) {
                    if (var4 + Y >= GlobalConfig.defaultHigh) {
                        fillRect(var0, 1009050, 210, Z - X / 2, var4 - Y / 2, X / 2, Y / 2);
                    } else {
                        fillRect(var0, 1009050, 210, Z, var4, X / 2, Y / 2);
                    }
                } else if (var4 + Y >= GlobalConfig.defaultHigh) {
                    fillRect(var0, 1009050, 210, Z - X / 2, var4 - Y / 2, X / 2, Y / 4);
                } else {
                    fillRect(var0, 1009050, 210, Z - X / 2, var4, X / 2, Y / 4);
                }
            } else if (l == 17) {
                if (var5 == 40) {
                    if (Z - X < 0) {
                        if (var4 < Y) {
                            fillRect(var0, 1009050, 210, Z, var4, X / 2, Y / 2);
                        } else {
                            fillRect(var0, 1009050, 210, Z, var4 - Y / 2, X / 2, Y / 2);
                        }
                    } else if (var4 < Y) {
                        fillRect(var0, 1009050, 210, Z, var4, X / 4 * 3, Y / 4 * 3);
                    } else {
                        fillRect(var0, 1009050, 210, Z - X / 4 * 3, var4 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
                    }
                } else if (var5 == 36) {
                    if (Z + X > GlobalConfig.defaultWidth) {
                        if (var4 < Y) {
                            fillRect(var0, 1009050, 210, Z - X / 4 * 3, var4, X / 4 * 3, Y / 4 * 3);
                        } else {
                            fillRect(var0, 1009050, 210, Z - X / 4 * 3, var4 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
                        }
                    } else if (var4 < Y) {
                        fillRect(var0, 1009050, 210, Z, var4, X / 4 * 3, Y / 4 * 3);
                    } else {
                        fillRect(var0, 1009050, 210, Z, var4 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
                    }
                } else if (var5 == 24) {
                    if (Z - X < 0) {
                        if (var4 + Y >= GlobalConfig.defaultHigh) {
                            fillRect(var0, 1009050, 210, Z, var4 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
                        } else {
                            fillRect(var0, 1009050, 210, Z, var4, X / 4 * 3, Y / 4 * 3);
                        }
                    } else if (var4 + Y >= GlobalConfig.defaultHigh) {
                        fillRect(var0, 1009050, 210, Z, var4 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
                    } else {
                        fillRect(var0, 1009050, 210, Z - X / 4 * 3, var4, X / 4 * 3, Y / 4 * 3);
                    }
                } else if (var3 + X <= GlobalConfig.defaultWidth) {
                    if (var4 + Y >= GlobalConfig.defaultHigh) {
                        fillRect(var0, 1009050, 210, Z - X / 4 * 3, var4 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
                    } else {
                        fillRect(var0, 1009050, 210, Z, var4, X / 4 * 3, Y / 4 * 3);
                    }
                } else if (var4 + Y >= GlobalConfig.defaultHigh) {
                    fillRect(var0, 1009050, 210, Z - X / 4 * 3, var4 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
                } else {
                    fillRect(var0, 1009050, 210, Z - X / 4 * 3, var4, X / 4 * 3, Y / 4 * 3);
                }
            } else {
                var0.setColor(16230);
                if (var5 == 40) {
                    if (Z - X < 0) {
                        if (var4 < Y) {
                            fillRect(var0, 1009050, 210, Z, var4, X, Y);
                            var0.drawRect(Z, var4, X, Y);
                            var0.setColor(ab);
                            var0.drawString(ac, Z + 4, var4 + 4, 20);
                            if (ae != null) {
                                ae.a(var0, Z + 4, var4 + 4 + GlobalConfig.font2_h, 0);
                            }
                        } else {
                            fillRect(var0, 1009050, 210, Z, var4 - Y, X, Y);
                            var0.drawRect(Z, var4 - Y, X, Y);
                            var0.setColor(ab);
                            var0.drawString(ac, Z + 4, var4 - Y + 4, 20);
                            if (ae != null) {
                                ae.a(var0, Z + 4, var4 - Y + 4 + GlobalConfig.font2_h, 0);
                            }
                        }
                    } else if (var4 < Y) {
                        fillRect(var0, 1009050, 210, Z, var4, X, Y);
                        var0.drawRect(Z, var4, X, Y);
                        var0.setColor(ab);
                        var0.drawString(ac, Z + 4, var4 + 4, 20);
                        if (ae != null) {
                            ae.a(var0, Z + 4, var4 + 4 + GlobalConfig.font2_h, 0);
                        }
                    } else {
                        fillRect(var0, 1009050, 210, Z - X, var4 - Y, X, Y);
                        var0.drawRect(Z - X, var4 - Y, X, Y);
                        var0.setColor(ab);
                        var0.drawString(ac, Z - X + 4, var4 - Y + 4, 20);
                        if (ae != null) {
                            ae.a(var0, Z - X + 4, var4 - Y + 4 + GlobalConfig.font2_h, 0);
                        }
                    }
                } else if (var5 == 36) {
                    if (Z + X > GlobalConfig.defaultWidth) {
                        if (var4 < Y) {
                            fillRect(var0, 1009050, 210, Z, var4, X, Y);
                            var0.drawRect(Z, var4, X, Y);
                            var0.setColor(ab);
                            var0.drawString(ac, Z + 4, var4 + 4, 20);
                            if (ae != null) {
                                ae.a(var0, Z + 4, var4 + 4 + GlobalConfig.font2_h, 0);
                            }
                        } else {
                            fillRect(var0, 1009050, 210, Z - X, var4 - Y, X, Y);
                            var0.drawRect(Z - X, var4 - Y, X, Y);
                            var0.setColor(ab);
                            var0.drawString(ac, Z - X + 4, var4 - Y + 4, 20);
                            if (ae != null) {
                                ae.a(var0, Z - X + 4, var4 - Y + 4 + GlobalConfig.font2_h, 0);
                            }
                        }
                    } else if (var4 < Y) {
                        fillRect(var0, 1009050, 210, Z, var4, X, Y);
                        var0.drawRect(Z, var4, X, Y);
                        var0.setColor(ab);
                        var0.drawString(ac, Z + 4, var4 + 4, 20);
                        if (ae != null) {
                            ae.a(var0, Z + 4, var4 + 4 + GlobalConfig.font2_h, 0);
                        }
                    } else {
                        fillRect(var0, 1009050, 210, Z, var4 - Y, X, Y);
                        var0.drawRect(Z, var4 - Y, X, Y);
                        var0.setColor(ab);
                        var0.drawString(ac, Z + 4, var4 - Y + 4, 20);
                        if (ae != null) {
                            ae.a(var0, Z + 4, var4 - Y + 4 + GlobalConfig.font2_h, 0);
                        }
                    }
                } else if (var5 == 24) {
                    if (Z - X < 0) {
                        if (var4 + Y >= GlobalConfig.defaultHigh) {
                            fillRect(var0, 1009050, 210, Z, var4 - Y, X, Y);
                            var0.drawRect(Z, var4 - Y, X, Y);
                            var0.setColor(ab);
                            var0.drawString(ac, Z + 4, var4 + 4 - Y, 20);
                            if (ae != null) {
                                ae.a(var0, Z + 4, var4 + 4 + GlobalConfig.font2_h - Y, 0);
                            }
                        } else {
                            fillRect(var0, 1009050, 210, Z, var4, X, Y);
                            var0.drawRect(Z, var4, X, Y);
                            var0.setColor(ab);
                            var0.drawString(ac, Z + 4, var4 + 4, 20);
                            if (ae != null) {
                                ae.a(var0, Z + 4, var4 + 4 + GlobalConfig.font2_h, 0);
                            }
                        }
                    } else if (var4 + Y >= GlobalConfig.defaultHigh) {
                        fillRect(var0, 1009050, 210, Z, var4 - Y, X, Y);
                        var0.drawRect(Z, var4 - Y, X, Y);
                        var0.setColor(ab);
                        var0.drawString(ac, Z + 4, var4 + 4 - Y, 20);
                        if (ae != null) {
                            ae.a(var0, Z + 4, var4 + 4 + GlobalConfig.font2_h - Y, 0);
                        }
                    } else {
                        fillRect(var0, 1009050, 210, Z - X, var4, X, Y);
                        var0.drawRect(Z - X, var4, X, Y);
                        var0.setColor(ab);
                        var0.drawString(ac, Z - X + 4, var4 + 4, 20);
                        if (ae != null) {
                            ae.a(var0, Z - X + 4, var4 + 4 + GlobalConfig.font2_h, 0);
                        }
                    }
                } else if (var3 + X <= GlobalConfig.defaultWidth) {
                    if (var4 + Y >= GlobalConfig.defaultHigh) {
                        fillRect(var0, 1009050, 210, Z - X, var4 - Y, X, Y);
                        var0.drawRect(Z - X, var4 - Y, X, Y);
                        var0.setColor(ab);
                        var0.drawString(ac, Z + 4 - X, var4 + 4 - Y, 20);
                        if (ae != null) {
                            ae.a(var0, Z + 4 - X, var4 + 4 + GlobalConfig.font2_h - Y, 0);
                        }
                    } else {
                        fillRect(var0, 1009050, 210, Z, var4, X, Y);
                        var0.drawRect(Z, var4, X, Y);
                        var0.setColor(ab);
                        var0.drawString(ac, Z + 4, var4 + 4, 20);
                        if (ae != null) {
                            ae.a(var0, Z + 4, var4 + 4 + GlobalConfig.font2_h, 0);
                        }
                    }
                } else if (var4 + Y >= GlobalConfig.defaultHigh) {
                    fillRect(var0, 1009050, 210, Z - X, var4 - Y, X, Y);
                    if (Z < X) {
                        Z = X;
                    }

                    var0.drawRect(Z - X, var4 - Y, X, Y);
                    var0.setColor(ab);
                    var0.drawString(ac, Z - X + 4, var4 + 4 - Y, 20);
                    if (ae != null) {
                        ae.a(var0, Z - X + 4, var4 + 4 + GlobalConfig.font2_h - Y, 0);
                    }
                } else {
                    fillRect(var0, 1009050, 210, Z - X, var4, X, Y);
                    var0.drawRect(Z - X, var4, X, Y);
                    var0.setColor(ab);
                    var0.drawString(ac, Z - X + 4, var4 + 4, 20);
                    if (ae != null) {
                        ae.a(var0, Z - X + 4, var4 + 4 + GlobalConfig.font2_h, 0);
                    }
                }
            }
        }

        ++l;
    }

    //解析本的颜色标记
    public static int parseColor(String str) {
        if (str != null && str.trim().length() != 0) {
            fwbColorMode = 1;
            if (str.charAt(0) == '<') {
                if (str.charAt(2) == '>') {
                    return pickColor(str.substring(1, 2));
                }

                if (str.charAt(3) == '>') {
                    fwbColorMode = 2;
                    return pickColor(str.substring(1, 3));
                }
            }
        }
        return -1;
    }

    private static int pickColor(String colorString) {
        int var1 = -1;
        try {
            var1 = Integer.parseInt(colorString);
        } catch (Exception var2) {
        }
        return var1 >= 0 && var1 < colors.length ? colors[var1] : 15138723;
    }

    public static int pickColor(int color) {
        return color >= 0 && color < colors.length ? colors[color] : 15138723;
    }

    public static void a(int var0, int var1, String[] var2, boolean var3) {
        if (var2 != null) {
            ah = null;
            o = 0;
            p = new String[var2.length];
            ai = new int[var2.length][4];

            for (int var4 = 0; var4 < var2.length; ++var4) {
                System.arraycopy(var2, 0, p, 0, var2.length);
            }

            q = GlobalConfig.font2.stringWidth("菜单");

            for (int var5 = 0; var5 < p.length; ++var5) {
                q = Math.max(q, GlobalConfig.font2.stringWidth(p[var5]));
            }

            q += 20;
            af[0] = var0;
            af[1] = var1;
            ag = p.length * (GlobalConfig.font2_h + 3) + 3;
            af[1] = af[1] + ag > GlobalConfig.defaultHigh ? GlobalConfig.defaultHigh - ag : af[1];
            int[] var10000;
            byte var10001;
            int var10002;
            if (var3) {
                var10000 = af;
                var10001 = 0;
                var10002 = GlobalConfig.defaultWidth / 2 - q / 2;
            } else {
                var10000 = af;
                var10001 = 0;
                var10002 = af[0] + q > GlobalConfig.defaultWidth ? GlobalConfig.defaultWidth - q : af[0];
            }

            var10000[var10001] = var10002;
        }
    }

    public static void b(int var0) {
        if (var0 == 1) {
            o = o <= 0 ? p.length - 1 : --o;
        } else {
            if (var0 == 4) {
                o = o >= p.length - 1 ? 0 : ++o;
            }

        }
    }

    public static void a(int[] var0) {
        ah = var0;
    }

    public static void c(Graphics var0) {
        l = 0;
        var0.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
        var0.setColor(11138815);
        var0.fillRect(af[0], af[1], q, ag);
        var0.setColor(14172);
        var0.drawRect(af[0], af[1], q - 1, ag - 1);

        for (int var1 = 0; var1 < p.length; ++var1) {
            var0.setColor(o == var1 ? 1539988 : 6082765);
            var0.fillRect(af[0] + 2, af[1] + 2 + (GlobalConfig.font2_h + 3) * var1, q - 4, GlobalConfig.font2_h + 2);
            var0.setColor(14172);
            var0.drawRect(af[0] + 2, af[1] + 2 + (GlobalConfig.font2_h + 3) * var1, q - 5, GlobalConfig.font2_h + 1);
            a(ai[var1], af[0] + 2, af[1] + 2 + (GlobalConfig.font2_h + 3) * var1, q - 5, GlobalConfig.font2_h + 1);
            var0.setColor(o == var1 ? 16053950 : 3756286);
            if (ah != null && var1 < ah.length && ah[var1] == 1) {
                var0.setColor(8750469);
            }

            var0.drawString(p[var1], af[0] + q / 2, af[1] + 2 + (GlobalConfig.font2_h + 3) * var1, 17);
        }

        if (MainCanvas.submenu != null && MainCanvas.submenu.length == 4) {
            var0.drawImage(MainCanvas.submenu[0].image, af[0], af[1], 20);
            var0.drawImage(MainCanvas.submenu[1].image, af[0] + q - MainCanvas.submenu[1].w, af[1], 20);
            var0.drawImage(MainCanvas.submenu[2].image, af[0], af[1] + ag - MainCanvas.submenu[2].h, 20);
            var0.drawImage(MainCanvas.submenu[3].image, af[0] + q - MainCanvas.submenu[3].w, af[1] + ag - MainCanvas.submenu[3].h, 20);
        }

    }

    public static int c(int var0, int var1) {
        if (ai != null) {
            for (int var2 = 0; var2 < ai.length; ++var2) {
                if (var0 >= ai[var2][0] && var0 <= ai[var2][0] + ai[var2][2] && var1 >= ai[var2][1] && var1 <= ai[var2][1] + ai[var2][3]) {
                    o = var2;
                    return 1073741824;
                }
            }
        }

        return var0 >= af[0] && var0 <= af[0] + q && var1 >= af[1] && var1 <= af[1] + ag ? 0 : 536870912;
    }

    public static void a(Graphics var0, String var1, int var2, boolean var3) {
        l = 0;
        int var4 = (GlobalConfig.font2_h << 1) + 35 + 24;
        int var5 = (GlobalConfig.defaultWidth - 140) / 2;
        int var6 = (GlobalConfig.defaultHigh - var4) / 2;
        c(var0, var5, var6, 140, var4, 0);
        c(var0, var5 + 20, var6 + 5 + GlobalConfig.font2_h + 12, 100, GlobalConfig.font2_h, 1);
        a((int[]) al, var5 + 20, var6 + 5 + GlobalConfig.font2_h + 12, 100, GlobalConfig.font2_h);
        drawString(var0, (String) var1, (int) (var5 + 70), var6 + 5, 17, 16776666, 0);
        if (var2 > 0) {
            drawString(var0, "" + var2, var5 + 70, var6 + 6 + GlobalConfig.font2_h + 12, 17, 16711639);
        }

        if (var3 && MainCanvas.trigon_l != null && MainCanvas.trigon_r != null && MainCanvas.trigon_u != null && MainCanvas.trigon_d != null) {
            var0.drawImage(MainCanvas.trigon_u.image, var5 + (140 - MainCanvas.trigon_u.w) / 2, var6 + 7 + GlobalConfig.font2_h, 20);
            a(aj[0], var5 + (140 - MainCanvas.trigon_u.w) / 2, var6 + 7 + GlobalConfig.font2_h, MainCanvas.trigon_u.image.getWidth(), MainCanvas.trigon_u.image.getHeight());
            var0.drawImage(MainCanvas.trigon_d.image, var5 + (140 - MainCanvas.trigon_u.w) / 2, var6 + 5 + (GlobalConfig.font2_h << 1) + 14, 20);
            a(aj[1], var5 + (140 - MainCanvas.trigon_u.w) / 2, var6 + 5 + (GlobalConfig.font2_h << 1) + 14, MainCanvas.trigon_d.image.getWidth(), MainCanvas.trigon_d.image.getHeight());
            var0.drawImage(MainCanvas.trigon_l.image, var5 + 5, var6 + 5 + GlobalConfig.font2_h + 12, 20);
            a(aj[2], var5 + 5, var6 + 5 + GlobalConfig.font2_h + 12, MainCanvas.trigon_l.image.getWidth(), MainCanvas.trigon_l.image.getHeight());
            var0.drawImage(MainCanvas.trigon_r.image, var5 + 140 - 5 - MainCanvas.trigon_r.w, var6 + 5 + GlobalConfig.font2_h + 12, 20);
            a(aj[3], var5 + 140 - 5 - MainCanvas.trigon_r.w, var6 + 5 + GlobalConfig.font2_h + 12, MainCanvas.trigon_r.image.getWidth(), MainCanvas.trigon_r.image.getHeight());
        }

        if (MainCanvas.button_ok != null && MainCanvas.button_back != null) {
            var0.drawImage(MainCanvas.button_ok.image, var5 + 5, var6 + var4 - 5 - MainCanvas.button_ok.h, 20);
            a(ak[0], var5 + 5, var6 + var4 - 5 - MainCanvas.button_ok.h, MainCanvas.button_ok.image.getWidth(), MainCanvas.button_ok.image.getHeight());
            var0.drawImage(MainCanvas.button_back.image, var5 + 140 - 5 - MainCanvas.button_back.w, var6 + var4 - 5 - MainCanvas.button_back.h, 20);
            a(ak[1], var5 + 140 - 5 - MainCanvas.button_back.w, var6 + var4 - 5 - MainCanvas.button_back.h, MainCanvas.button_back.image.getWidth(), MainCanvas.button_back.image.getHeight());
        }

    }

    public static void c(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
        if (var5 == 0) {
            fillRect(var0, 2511520, 210, var1, var2, var3, var4);
        } else if (var5 == 1) {
            var0.setColor(15990);
            var0.fillRect(var1, var2, var3, var4);
        }

        var0.setColor(14172);
        var0.drawRect(var1, var2, var3, var4);
        var0.drawRect(var1 + 2, var2 + 2, var3 - 4, var4 - 4);
        var0.setColor(11267556);
        var0.drawRect(var1 + 1, var2 + 1, var3 - 2, var4 - 2);
    }

    public static void a(Graphics var0, String var1, int var2, int var3, int var4) {
        var0.drawImage(MainCanvas.trigon_l.image, var2, var3 + 3, 20);
        c(var0, var2 + 12, var3, var4 - 24, GlobalConfig.font2_h, 1);
        var0.drawImage(MainCanvas.trigon_r.image, var2 + var4 - 9, var3 + 3, 20);
        drawString(var0, var1, var2 + var4 / 2, var3 + 3, 17, 16711639);
    }

    public static int d(int var0, int var1) {
        if (aj != null) {
            for (int var2 = 0; var2 < aj.length; ++var2) {
                if (var0 >= aj[var2][0] && var0 <= aj[var2][0] + aj[var2][2] && var1 >= aj[var2][1] && var1 <= aj[var2][1] + aj[var2][3]) {
                    switch (var2) {
                        case 0:
                            return 1;
                        case 1:
                            return 4;
                        case 2:
                            return 8;
                        case 3:
                            return 2;
                    }
                }
            }
        }

        if (ak != null) {
            if (var0 >= ak[0][0] && var0 <= ak[0][0] + ak[0][2] && var1 >= ak[0][1] && var1 <= ak[0][1] + ak[0][3]) {
                return 268435456;
            }

            if (var0 >= ak[1][0] && var0 <= ak[1][0] + ak[1][2] && var1 >= ak[1][1] && var1 <= ak[1][1] + ak[1][3]) {
                return 536870912;
            }
        }

        return 0;
    }

    public static boolean e(int var0, int var1) {
        return al != null && var0 >= al[0] && var0 <= al[0] + al[2] && var1 >= al[1] && var1 <= al[1] + al[3];
    }

    public static void a(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
        w = 0;
        y = 0;
        z = 0;
        r = 4;
        s = var2;
        t = var3;
        u = var4;
        v = var0;
        x = var5;
        if (v > var5) {
            am = true;
            y = x * (var4 - 16) / var0;
        } else {
            am = false;
        }
    }

    public static void a(int var0, int var1, int var2) {
        if (var0 != 514 && var0 != 1) {
            if (var0 == 520 || var0 == 4) {
                var0 = 1;
                if (false) {
                    for (w = w >= v - x ? v - x : w + 1; z < w && am; ++z) {
                    }
                } else {
                    if (w == v - 1) {
                        z = 0;
                        w = 0;
                    } else {
                        ++w;
                    }

                    while (z < w && am && w - z + 1 > x) {
                        ++z;
                    }
                }
            }

        } else {
            var0 = 1;
            if (false) {
                for (w = w <= 0 ? 0 : w - 1; am && z > w; --z) {
                }
            } else {
                if (w == 0) {
                    z = v % x == 0 ? v - x : v - v % x;
                    w = v - 1;
                } else {
                    --w;
                }

                while (z > 0 && am && w - z + 1 < x) {
                    --z;
                }
            }

        }
    }

    public static void d(Graphics var0, int var1, int var2, int var3, int var4) {
        var0.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
        var0.setColor(16248869);
        var0.drawLine(var1, var2, var1 + 4, var2);
        var0.drawLine(var1, var2, var1, var2 + 4);
        var0.drawLine(var1, var2 + var4 - 4, var1, var2 + var4);
        var0.drawLine(var1, var2 + var4, var1 + 4, var2 + var4);
        var0.drawLine(var1 + var3 - 4, var2, var1 + var3, var2);
        var0.drawLine(var1 + var3, var2, var1 + var3, var2 + 4);
        var0.drawLine(var1 + var3, var2 + var4 - 4, var1 + var3, var2 + var4);
        var0.drawLine(var1 + var3 - 4, var2 + var4, var1 + var3, var2 + var4);
    }

    public static void e(Graphics var0, int var1, int var2, int var3, int var4) {
        var0.setColor(16777215);
        var0.fillRect(var1 + 1, var2 + 1, 20, 2);
        var0.setColor(var4 == 0 ? 16711680 : '믿');
        var0.fillRect(var1 + 1, var2 + 1, var3, 2);
        var0.setColor(var4 == 0 ? 10945027 : 230064);
        var0.fillRect(var1 + 1, var2 + 2, var3, 1);
        var0.drawImage(MainCanvas.rim.image, var1, var2, 20);
    }

    private static void a(int[] var0, int var1, int var2, int var3, int var4) {
        if (var0 != null) {
            var0[0] = var1;
            var0[1] = var2;
            var0[2] = var3;
            var0[3] = var4;
        }

    }

    /**
     * 初始化加载画面：设置进度条位置，重置进度，随机选择一条提示语创建富文本组件
     */
    public static void initLoadingPage() {
        progressBarXYWH = new int[]{(GlobalConfig.defaultWidth - 100) / 2, (GlobalConfig.defaultHigh / 3 << 1) + 20, 100, 3};  // 进度条 [x, y, w, h]
        loadProgressPercentage = 0;  // 进度归零
        // 从 ao 提示语数组中随机选一条，创建富文本渲染组件，最大宽度为屏幕宽-20
        loadingTips = new FWBRender(tips[randomInt(1, 100) % 7], (short) (GlobalConfig.defaultWidth - 20));
    }

    /**
     * 绘制加载画面（前台渲染线程调用）。
     * 由 MainCanvas.paint() 在 j==0 时通过 ca_1.a(var1, this.bf) 调用。
     * <p>
     * 画面内容从上到下：
     * 1. 顶部提示文字（ap 富文本组件绘制，如 "按"9"键可打开社交栏"）
     * 2. 居中 "正在载入资源..." 白色文字
     * 3. 进度条和百分比
     *
     * @param graphics  Graphics 画布
     * @param jindutiao 进度条背景图片
     */
    public static void drawLoadingPage(Graphics graphics, Image jindutiao) {
        if (progressBarXYWH != null && jindutiao != null) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);          // 黑色填充整个屏幕
            if (loadingTips != null) {
                loadingTips.a(graphics, GlobalConfig.defaultWidth / 2, 20, 17);            // 顶部居中绘制提示文字（anchor=TOP|HCENTER）
            }

            graphics.setColor(16777215);                      // 白色
            graphics.drawString("正在载入资源...", GlobalConfig.defaultWidth / 2, GlobalConfig.defaultHigh / 2, 17);  // 屏幕中央
            graphics.setColor(14459464);                      // 浅蓝色
            graphics.drawString(100 * loadProgressPercentage / 100 + "%", GlobalConfig.defaultWidth / 2, progressBarXYWH[1] + 10, 17);  // 百分比数字
            graphics.drawImage(jindutiao, progressBarXYWH[0] - 5, progressBarXYWH[1] - 4, 20);   // 进度条背景图
            graphics.setColor(16382066);                      // 进度条前景色1
            graphics.fillRect(progressBarXYWH[0], progressBarXYWH[1], 100 * loadProgressPercentage / 100, 3);
            graphics.setColor(14459464);                      // 进度条前景色2（高光层）
            graphics.fillRect(progressBarXYWH[0], progressBarXYWH[1] + 1, 100 * loadProgressPercentage / 100, 2);
            loadProgressPercentage = ++loadProgressPercentage > 100 ? 100 : loadProgressPercentage;                     // 进度递增，上限100
        }
    }

    public static int randomInt(int start, int end) {
        int var2 = start + random.nextInt() % (end - start);
        int var3 = var2 < 0 ? -var2 : var2;
        return var3 == 0 ? 1 : var3;
    }

    public static void f(Graphics var0, int var1, int var2, int var3, int var4) {
        var0.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
        setColor(var0, 2);
        var0.drawRect(var1 - 4, var2 - 4, var3 + 7, var4 + 7);
        var0.drawRect(var1, var2, var3 - 1, var4 - 1);
        setColor(var0, 3);
        var0.drawRect(var1 - 3, var2 - 3, var3 + 5, var4 + 5);
        var0.drawRect(var1 - 1, var2 - 1, var3 + 1, var4 + 1);
        setColor(var0, 4);
        var0.drawRect(var1 - 2, var2 - 2, var3 + 3, var4 + 3);
        if (MainCanvas.lu0 != null) {
            var0.drawImage(MainCanvas.lu0.image, var1 - 4, var2 - 4, 20);
        }

        if (MainCanvas.ld0 != null) {
            var0.drawImage(MainCanvas.ld0.image, var1 - 4, var2 + var4 + 4 - MainCanvas.ld0.h, 20);
        }

        if (MainCanvas.ru0 != null) {
            var0.drawImage(MainCanvas.ru0.image, var1 + 4 + var3 - MainCanvas.ru0.w, var2 - 4, 20);
        }

        if (MainCanvas.rd0 != null) {
            var0.drawImage(MainCanvas.rd0.image, var1 + 4 + var3 - MainCanvas.rd0.w, var2 + var4 + 4 - MainCanvas.rd0.h, 20);
        }

    }
}

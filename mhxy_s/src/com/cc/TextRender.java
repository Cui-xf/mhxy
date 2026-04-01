package com.cc;

import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/**
 * 富文本渲染组件 - 支持带颜色标签的文本解析与绘制。
 *
 * 用于加载页面顶部提示文字等场景，由 ca_1 在加载画面中创建并调用绘制。
 * 文本支持 <颜色值>...</颜色值> 格式的颜色标签。
 *
 * 字段说明：
 *   b (e[])  - 解析后的每行文本数据，每个 e 包含文本片段数组和对应颜色数组
 *   c (short) - 最大显示宽度（像素），用于自动换行
 *   a (short) - 所有行中最大的行宽（像素）
 *   d (int)   - 绘制时的水平偏移累加器
 */
//bw_1
public final class TextRender {
    private e[] b;       // 解析后的行数据数组，每行包含多个带颜色的文本片段
    private short c;     // 最大显示宽度（像素），超出则自动换行
    public short a;      // 所有行中最大行宽（像素）
    private int d = 0;   // 绘制时的水平偏移累加器

    /**
     * @param var1 要解析的富文本字符串，支持 <颜色值>文字</颜色值> 标签
     * @param var2 最大显示宽度（像素）
     */
    public TextRender(String var1, short var2) {
        this.c = var2;
        this.a(var1);     // 解析富文本
    }

    /** 返回总行数 */
    public final short a() {
        return this.b != null ? (short) this.b.length : 0;
    }

    /**
     * 绘制文本（左对齐模式）
     * @param var1 Graphics 画布
     * @param var2 x 坐标
     * @param var3 y 坐标
     * @param var4 anchor 锚点（如 Graphics.TOP | Graphics.HCENTER）
     */
    public final void a(Graphics var1, int var2, int var3, int var4) {
        if (this.b != null) {
            for (int var5 = 0; var5 < this.b.length; ++var5) {
                if (this.b[var5] != null) {
                    this.d = 0;

                    for (int var6 = 0; var6 < this.b[var5].a.length; ++var6) {
                        var1.setColor(this.b[var5].b[var6]);
                        var1.drawString(this.b[var5].a[var6], var2 + this.d, var3 + var5 * GlobalConfig.j, var4);
                        this.d += GlobalConfig.i.stringWidth(this.b[var5].a[var6]);
                    }
                }
            }

        }
    }

    /**
     * 绘制文本（居中模式），每行根据行宽自动水平居中
     * @param var1 Graphics 画布
     * @param var2 中心 x 坐标
     * @param var3 y 坐标
     */
    public final void a(Graphics var1, int var2, int var3) {
        if (this.b != null) {
            short var4 = 0;

            for (int var5 = 0; var5 < this.b.length; ++var5) {
                if (this.b[var5] != null) {
                    this.d = 0;
                    var4 = this.b[var5].a();   // 获取该行总像素宽度

                    for (int var6 = 0; var6 < this.b[var5].a.length; ++var6) {
                        var1.setColor(this.b[var5].b[var6]);
                        var1.drawString(this.b[var5].a[var6], var2 - var4 / 2 + this.d, var3 + var5 * GlobalConfig.j, 20);
                        this.d += GlobalConfig.i.stringWidth(this.b[var5].a[var6]);
                    }
                }
            }

        }
    }

    /**
     * 绘制指定行
     * @param var4 行索引
     * @param var5 anchor 锚点
     */
    public final void a(Graphics var1, int var2, int var3, int var4, int var5) {
        this.d = 0;

        for (int var6 = 0; var6 < this.b[var4].a.length; ++var6) {
            var1.setColor(this.b[var4].b[var6]);
            var1.drawString(this.b[var4].a[var6], var2 + this.d, var3, var5);
            this.d += GlobalConfig.i.stringWidth(this.b[var4].a[var6]);
        }

    }

    /**
     * 解析富文本字符串，提取颜色标签并构建纯文本 + 颜色标记信息。
     *
     * 支持的标签格式：<颜色值>带颜色的文字</颜色值>
     * 例如: "普通文字<16711680>红色文字</16711680>普通文字"
     *
     * 解析结果：var5 中存放去除标签后的纯文本，var4 中存放颜色区间标记(ap对象)。
     * 最终调用 a(String, ap[]) 进行换行和分段处理。
     *
     * @param var1 含颜色标签的富文本字符串
     */
    private void a(String var1) {
        int var2 = 0;                        // 当前字符（int类型，反编译产物，原始应为char）
        int var3 = 0;                        // 上一次标签结束位置的临时记录
        Vector var4 = new Vector();          // 收集所有颜色区间标记(ap对象)
        StringBuffer var5 = new StringBuffer(); // 去除标签后的纯文本
        Object var6 = null;
        ap var7 = null;                      // 当前未闭合的颜色标记
        boolean var8 = false;

        for (int var18 = 0; var18 < var1.length(); ++var18) {
            if ((var2 = var1.charAt(var18)) == '<' && var18 + 1 < var1.length()) {
                if (var1.charAt(var18 + 1) == '/') {
                    // 遇到 </颜色值> 闭合标签，结束当前颜色区间
                    var2 = var18;
                    int var20 = 0;

                    for (var20 = var18 + 2; var20 < var1.length(); ++var20) {
                        if (var1.charAt(var20) == '>') {
                            try {
                                int var17 = Integer.parseInt(var1.substring(var18 + 2, var20));
                                if (var7 != null && var17 == var7.a) {
                                    var7.c = (short) (a(var5) - 1);  // 记录颜色区间结束位置
                                    new ap(this);
                                    var7 = null;
                                }

                                var18 = var20;
                            } catch (Exception var10) {
                                var18 = var20;
                                var5.append(var1.substring(var2, var3 + 1));
                                var20 = 0;
                            }
                            break;
                        }

                        if (var1.charAt(var20) == '<') {
                            var3 = var20;
                            var18 = var20;
                            var5.append(var1.substring(var2, var20 - 1));
                            break;
                        }
                    }

                    if (var20 == var1.length()) {
                        var5.append(var1.substring(var2, var20));
                    }
                } else {
                    // 遇到 <颜色值> 开始标签，开启新的颜色区间
                    var2 = var18;
                    int var9 = 0;

                    for (var9 = var18 + 1; var9 < var1.length(); ++var9) {
                        if (var1.charAt(var9) == '>') {
                            try {
                                if (var7 != null) {
                                    var7.c = (short) (a(var5) - 1);
                                }

                                var3 = var9;
                                int var15 = Integer.parseInt(var1.substring(var18 + 1, var9)); // 解析颜色值
                                ap var16 = new ap(this, var15, a(var5));  // 创建颜色区间，记录颜色值和起始位置
                                if (var1.charAt(var9 + 1) == '[' && var1.charAt(var9 + 3) == ']') {
                                    var18 = var9 + 3;
                                } else {
                                    var18 = var9;
                                }

                                var4.addElement(var16);
                                var7 = var16;
                            } catch (Exception var11) {
                                var18 = var9;
                                var5.append(var1.substring(var2, var3 + 1));
                                var9 = 0;
                            }
                            break;
                        }

                        if (var1.charAt(var9) == '<') {
                            var3 = var9;
                            var18 = var9;
                            var5.append(var1.substring(var2, var9 - 1));
                            break;
                        }
                    }

                    if (var9 == var1.length()) {
                        var5.append(var1.substring(var2, var9));
                    }
                }
            } else {
                // 普通字符，追加到纯文本缓冲区。
                // 【BUG修复】反编译时 char 被提升为 int，导致 append(int) 输出数字而非字符，
                // 例如 '按' 输出 "25353" 而非 "按"。需强转 (char) 调用 append(char)。
                var5.append((char) var2);
            }
        }

        if (var7 != null) {
            var7.c = (short) (a(var5) - 1);  // 处理未闭合的颜色标签
        }

        ap[] var22 = new ap[var4.size()];
        var4.copyInto(var22);
        this.a(var5.toString(), var22);  // 将纯文本和颜色区间传入换行分段处理
        var4.removeAllElements();
    }

    /**
     * 计算 StringBuffer 中非 '\t' 字符的数量（即可见字符计数）。
     * '\t' 在此文本系统中作为换行标记使用。
     */
    private static short a(StringBuffer var0) {
        short var1 = 0;

        for (int var2 = 0; var2 < var0.length(); ++var2) {
            if (var0.charAt(var2) != '\t') {
                ++var1;
            }
        }

        return var1;
    }

    /**
     * 对纯文本进行自动换行和颜色分段处理。
     *
     * 1. 先按 '\t' 分割为段落
     * 2. 每段按最大宽度(this.c)进行自动换行，拆成多行
     * 3. 每行再根据颜色区间(apVarArr)拆分为多个带颜色的文本片段
     * 4. 最终填充到 this.b (e[]) 中，供绘制方法使用
     *
     * @param str      去除标签后的纯文本（'\t' 分隔段落）
     * @param apVarArr 颜色区间数组，每个 ap 记录颜色值和字符范围
     */
    private void a(String str, ap[] apVarArr) {
        String strSubstring;
        Font font = GlobalConfig.i;
        int i = this.c;           // 最大显示宽度
        String str2 = str;
        if (str2 == null) {
            str2 = "";
        }
        Vector vector = new Vector();
        String[] a1 = a(str2, "\t");       // 按 '\t' 分割段落
        for (int i1 = 0; i1 < a1.length; i1++) {
            String str3 = a1[i1];
            do {
                String strA = a(str3, font, i);   // 按宽度截断，得到一行能容纳的文本
                vector.addElement(strA);
                strSubstring = str3.substring(strA.length());  // 剩余文本
                str3 = strSubstring;
            } while (strSubstring.length() != 0);
        }

        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        String[] strArrA = a(strArr);       // 过滤掉空行
        int iA = 0;                         // 全局字符偏移，用于匹配颜色区间
        this.b = new e[strArrA.length];
        Vector vector2 = new Vector();      // 当前行的文本片段列表
        Vector vector3 = new Vector();      // 当前行的颜色值列表
        for (int i2 = 0; i2 < strArrA.length; i2++) {
            // 根据颜色区间将该行文本拆分为多个带颜色的片段
            iA = a(strArrA[i2], iA, apVarArr, vector2, vector3);
            String[] strArr2 = new String[vector2.size()];
            String[] strArr3 = new String[vector3.size()];
            vector2.copyInto(strArr2);
            vector3.copyInto(strArr3);
            this.b[i2] = new e(this, strArr2, strArr3);  // 构建行数据
            short sA = this.b[i2].a();       // 该行像素宽度
            if (this.a < sA) {
                this.a = sA;                 // 更新最大行宽
            }
            vector2.removeAllElements();
            vector3.removeAllElements();
        }
    }


    /**
     * 根据颜色区间将一行文本拆分为多个带颜色的片段。
     *
     * 遍历行中每个字符，查找其是否落在某个颜色区间内。当颜色发生切换时，
     * 将之前同色的文本作为一个片段存入 vector（文本）和 vector2（颜色值）。
     *
     * @param str      当前行的文本
     * @param i        该行第一个字符在全局纯文本中的偏移
     * @param apVarArr 颜色区间数组
     * @param vector   输出：文本片段列表
     * @param vector2  输出：对应颜色值列表（字符串形式，-1 表示默认颜色）
     * @return 下一行起始的全局字符偏移
     */
    private int a(String str, int i, ap[] apVarArr, Vector vector, Vector vector2) {
        int i2;                    // 当前字符匹配到的颜色值
        int i3 = -1;              // 上一个字符的颜色值，-1 表示默认色
        int i4 = 0;               // 当前片段的起始字符索引
        int i5 = 0;
        while (i5 < str.length()) {
            int i6 = i + i5;      // 全局字符偏移
            int i7 = 0;
            // 查找当前字符所在的颜色区间
            while (true) {
                if (i7 >= apVarArr.length) {
                    i2 = -1;      // 不在任何颜色区间内，使用默认颜色
                    break;
                }
                if (i6 >= apVarArr[i7].b && i6 <= apVarArr[i7].c) {
                    i2 = apVarArr[i7].a;   // 匹配到颜色区间，取其颜色值
                    break;
                }
                i7++;
            }
            int i8 = i2;
            if (i2 != i3) {
                // 颜色发生切换，将之前的同色文本保存为一个片段
                vector.addElement(str.substring(i4, i5));
                vector2.addElement(String.valueOf(i3));
                i4 = i5;
                i3 = i8;
            }
            i5++;
        }
        if (i5 == str.length()) {
            // 最后一段
            vector.addElement(str.substring(i4, str.length()));
            vector2.addElement(String.valueOf(i3));
        }
        return i + str.length();
    }


    /**
     * 按分隔符拆分字符串，类似 String.split()
     * @param var1 原始字符串
     * @param var2 分隔符
     * @return 拆分后的字符串数组
     */
    private String[] a(String var1, String var2) {
        int var3 = 0;
        String[] var4 = new String[0];

        do {
            if ((var3 = var1.indexOf(var2)) < 0) {
                var4 = this.a(var4, var1);
                break;
            }

            var4 = this.a(var4, var1.substring(0, var3));
            var1 = var1.substring(var3 + var2.length());
        } while (var3 >= 0);

        return var4;
    }

    /** 向字符串数组末尾追加一个元素（数组扩容） */
    private String[] a(String[] var1, String var2) {
        if (var2 == null) {
            return var1;
        } else if (var1 == null) {
            return new String[]{var2};
        } else {
            boolean var3 = true;
            String[] var4 = var1;
            var1 = new String[var1.length + 1];
            System.arraycopy(var4, 0, var1, 0, var4.length);
            var1[var1.length - 1] = var2;
            return var1;
        }
    }

    /**
     * 按像素宽度截断文本，返回在指定宽度内能容纳的最长子串。
     * 递归方式按比例估算截断位置。
     */
    private String a(String var1, Font var2, int var3) {
        int var4;
        return (var4 = var2.stringWidth(var1)) <= var3 ? var1 : this.a(var1.substring(0, var1.length() * var3 / var4), var2, var3);
    }

    /** 过滤掉数组中的 null 和空字符串 */
    private static String[] a(String[] var0) {
        Vector var1 = new Vector();

        for (int var2 = 0; var2 < var0.length; ++var2) {
            if (var0[var2] != null && !var0[var2].equals("")) {
                var1.addElement(var0[var2]);
            }
        }

        String[] var3 = new String[var1.size()];
        var1.copyInto(var3);
        return var3;
    }
}

package com.cc;

//一行文本数据
final class LinePianDuan {
    public String[] text;
    public int[] color;

    public LinePianDuan(String[] text, String[] colorStr) {
        this.text = text;
        this.color = new int[colorStr.length];

        for (int i = 0; i < colorStr.length; ++i) {
            this.color[i] = LoadingPage.pickColor(Integer.parseInt(colorStr[i]));
        }

    }

    //获取行宽度
    public short getLineW() {
        if (this.text != null && this.text.length > 0) {
            short totalW = 0;
            for (int i = 0; i < this.text.length; ++i) {
                totalW = (short) (totalW + GlobalConfig.font2.stringWidth(this.text[i]));
            }
            return totalW;
        } else {
            return 0;
        }
    }
}

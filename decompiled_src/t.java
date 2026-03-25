/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Font;
import javax.microedition.midlet.MIDlet;

public final class t {
    public static byte a = 1;
    public static short b = (short)240;
    public static short c = (short)320;
    public static short d = (short)240;
    public static short e = (short)320;
    public static short f;
    public static short g;
    public static Font h;
    public static Font i;
    public static int j;
    public static int k;
    public static byte l;
    public static byte m;
    public static boolean n;
    public static boolean o;
    private static boolean ai;
    public static boolean p;
    public static byte q;
    public static byte r;
    public static byte s;
    public static String t;
    public static int u;
    public static String v;
    public static boolean w;
    public static boolean x;
    public static boolean y;
    public static boolean z;
    public static boolean A;
    public static boolean B;
    public static boolean C;
    public static boolean D;
    public static final String[] E;
    public static String F;
    public static final String[] G;
    public static final String[] H;
    public static final String[] I;
    public static final String[] J;
    public static final String[] K;
    public static final String[] L;
    public static final String[] M;
    public static final String[][] N;
    public static final String[] O;
    public static final String[] P;
    public static short[][] Q;
    public static short[][] R;
    public static final short[][] S;
    public static final short[][] T;
    public static final short[] U;
    public static char[] V;
    public static char[] W;
    public static char[] X;
    public static final String[] Y;
    public static String[] Z;
    public static String[] aa;
    public static String[] ab;
    public static String[] ac;
    public static final String[] ad;
    public static String[] ae;
    public static String[] af;
    public static StringBuffer ag;
    public static final String[] ah;

    public static void a(MIDlet mIDlet) {
        try {
            v = "";
            if (a == 1) {
                String string;
                v = mIDlet.getAppProperty("PopularizeChannel");
                if (v != null) {
                    if (v.equals("mhxy002")) {
                        x = true;
                    } else if (v.equals("mhxy003") || v.equals("mhxy081") || v.equals("mhxy084")) {
                        A = true;
                    } else if (v.equals("mhxy011")) {
                        y = true;
                    } else if (v.equals("mhxy060")) {
                        z = true;
                    } else if (v.equals("mhxy319")) {
                        B = true;
                    } else if (v.equals("mhxy340") || v.equals("mhxy531")) {
                        D = true;
                    } else if (v.equals("mhxy504")) {
                        C = true;
                    }
                }
                p = (string = mIDlet.getAppProperty("hasRideRes").trim()).equals("true");
            } else if (a == 0) {
                v = r == 1 ? "mhxy_common" : (r == 17 ? "mhxy_v3" : "mhxy_tx");
                byte by2 = Byte.parseByte(mIDlet.getAppProperty("LargeClient").trim());
                p = by2 == 1;
            }
            F = mIDlet.getAppProperty("Model");
            if (F == null) {
                F = "";
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static int a(int n2, String string) {
        int n3 = i.stringWidth(string);
        n2 = n2 > n3 ? (n2 - n3) / 2 : 0;
        return n2;
    }

    public static int a(int n2) {
        n2 = n2 > j ? (n2 - j) / 2 : 0;
        return n2;
    }

    public static String a(int n2, byte by2, byte by3, int n3, boolean bl2) {
        if (m == 2) {
            n3 = 0;
        }
        ag.delete(0, ag.length());
        ag.append(V[n2]).append(W[by2]).append(n3).append(X[3]).append("");
        return ag.toString();
    }

    public static void a(String string) {
    }

    public static void a(StringBuffer stringBuffer) {
        stringBuffer.delete(0, stringBuffer.length());
    }

    public static short a(byte by2, byte by3) {
        String string = "" + V[by2] + W[by3];
        int n2 = Integer.parseInt(string);
        return (short)n2;
    }

    public static String a(StringBuffer stringBuffer, long l2) {
        long[] lArray = new long[3];
        long[] lArray2 = lArray;
        lArray[0] = l2 / 100000000L;
        lArray2[1] = (l2 - lArray2[0] * 100000000L) / 10000L;
        lArray2[2] = l2 - lArray2[0] * 100000000L - lArray2[1] * 10000L;
        stringBuffer.delete(0, stringBuffer.length());
        if (lArray2[0] == 0L && lArray2[1] == 0L && lArray2[2] == 0L) {
            stringBuffer.append("0\u4e24");
        } else {
            if (lArray2[0] != 0L) {
                stringBuffer.append(lArray2[0]);
                stringBuffer.append("\u4ebf");
            }
            if (lArray2[1] != 0L) {
                stringBuffer.append(lArray2[1]);
                stringBuffer.append("\u4e07");
            }
            if (lArray2[2] != 0L) {
                stringBuffer.append(lArray2[2]);
            }
            stringBuffer.append("\u4e24");
        }
        return stringBuffer.toString();
    }

    static {
        Font.getFont((int)0, (int)2, (int)16);
        h = Font.getFont((int)0, (int)2, (int)0);
        i = Font.getFont((int)64, (int)0, (int)8);
        j = i.getHeight();
        k = i.stringWidth("\u5bbd");
        l = (byte)2;
        m = (byte)2;
        n = false;
        o = true;
        ai = false;
        p = true;
        q = 1;
        r = 1;
        s = (byte)44;
        t = "v1.4.4";
        u = 4;
        v = "";
        w = false;
        x = false;
        y = false;
        z = false;
        A = false;
        B = false;
        C = false;
        D = false;
        E = new String[]{"\u4e16\u754c\u9891\u9053", "\u533a\u57df\u9891\u9053", "\u961f\u4f0d\u9891\u9053", "\u5e2e\u6d3e\u9891\u9053"};
        F = "";
        int[] nArray = new int[]{158, 222};
        G = new String[]{"\u5c06\u519b\u5e9c", "\u65b9\u5bf8\u5c71", "\u9f99\u5bab"};
        H = new String[]{"\u5c06\u519b\u5e9c\u504f\u91cd\u7269\u7406,\u63a8\u8350\u7269\u653b\u914d\u70b9", "\u65b9\u5bf8\u5c71\u4e13\u4fee\u6cd5\u672f,\u63a8\u8350\u6cd5\u653b\u914d\u70b9", "\u9f99\u5bab\u5584\u72b6\u6001\u52a0\u5f3a,\u63a8\u8350\u751f\u547d\u914d\u70b9"};
        String[] stringArray = new String[]{"\u751f\u547d", "\u5185\u529b", "\u653b\u51fb", "\u6cd5\u653b", "\u9632\u5fa1", "\u51b0\u6297", "\u706b\u6297", "\u96f7\u6297", "\u901f\u5ea6"};
        I = new String[]{"\u4e70\u4e1c\u897f", "\u5356\u4e1c\u897f", "\u6218\u6597", "\u4f20\u9001", "\u7269\u54c1\u4ed3\u5e93", "\u94f6\u4e24\u4ed3\u5e93", "\u5ba0\u7269\u4ed3\u5e93", "\u62cd\u5356\u7269\u54c1", "\u62cd\u5356\u5ba0\u7269", "\u62cd\u5356\u573a", "\u62cd\u5356\u8be6\u60c5", "\u6280\u80fd\u5b66\u4e60", "\u4efb\u52a1", "\u51fa\u552e\u5ba0\u7269", "\u4e70\u5165\u5ba0\u7269", "\u5151\u6362", "\u6bcf\u65e5\u4efb\u52a1", "\u89d2\u8272\u6d17\u70b9", "\u5ba0\u7269\u6d17\u70b9", "\u4f4f\u5b85", "\u623f\u5c4b\u7ba1\u7406", "\u9000\u51fa\u4f4f\u5b85", "\u5bb6\u5177\u7ba1\u7406", "\u9000\u51fa\u623f\u5c4b", "\u5e2e\u4f1a\u5efa\u7acb", "\u8bbe\u65bd\u4e70\u5356", "\u5e2e\u6d3e\u516c\u544a", "\u5e2e\u6d3e\u7ba1\u7406", "\u5b9d\u5e93\u7ba1\u7406", "\u5916\u4ea4", "\u6253\u5b54", "\u5f00\u5b54", "\u63d0\u5347\u519b\u529b", "\u6218\u4e89\u6377\u62a5", "\u6c42\u7231\u5ba3\u8a00", "\u7533\u8bf7\u7ed3\u5a5a", "\u7533\u8bf7\u79bb\u5a5a", "\u65b0\u4eba\u62dc\u5802", "\u56de\u7b54\u95ee\u9898", "\u953b\u9020", "\u62a2\u7b54\u95ee\u9898", "\u533a\u57df\u6389\u5b9d(\u67e5\u770b)", "\u98ce\u4e91\u699c(\u67e5\u770b)", "\u9886\u53d6\u5956\u54c1", "\u88c5\u5907\u5347\u661f", "\u6536\u56de", "\u88c5\u5907\u6d17\u70bc", "\u88c5\u5907\u9644\u9b54", "\u653b\u57ce\u7ade\u6807", "\u62bd\u5956"};
        String[] stringArray2 = new String[]{"\u6536\u56de", "\u8fdb\u5165", "\u67e5\u770b", "\u5347\u7ea7", "\u6389\u843d", "Buff", "\u5151\u6362"};
        J = new String[]{"\u672a\u63a5\u53d7", "\u672a\u5b8c\u6210", "\u5b8c\u6210"};
        K = new String[]{"\u7269\u7406", "\u51b0", "\u706b", "\u96f7"};
        L = new String[]{"\u7269\u54c1\u884c\u56ca", "\u5582\u517b\u5ba0\u7269", "\u5b58\u5165\u4ed3\u5e93", "\u5ba0\u7269\u5b66\u4e60", "\u7269\u54c1\u4ea4\u6613", "\u7269\u54c1\u62cd\u5356", "\u6218\u6597\u4f7f\u7528", "\u88c5\u5907\u7269\u54c1", "\u91d1\u8c46\u62cd\u5356\u7269\u54c1", "\u88c5\u5907\u5ba0\u7269\u7269\u54c1", "\u88c5\u5907\u6253\u5b54", "\u5b9d\u77f3\u9576\u5d4c", "\u5582\u517b\u5929\u4f7f", "\u589e\u52a0\u597d\u611f\u5ea6", "\u5ba0\u7269\u6280\u80fd\u6269\u5bb9", "", "\u88c5\u5907\u6d17\u70bc", "\u88c5\u5907\u9644\u9b54", "\u6350\u732e\u5b9d\u7269", "\u7269\u54c1\u5408\u6210", "\u7269\u54c1\u9009\u62e9", "\u7269\u54c1\u9009\u62e9", "\u7269\u54c1\u9009\u62e9"};
        M = new String[]{"\u5934 \u76d4", "\u62a4\u8eab\u7b26", "\u8863 \u670d", "\u6b66 \u5668", "\u978b \u5b50", "\u6212 \u6307", "\u5a5a \u9970", "\u6cd5 \u5b9d", "\u6ca1\u6709\u88c5\u5907", "\u6ca1\u6709\u88c5\u5907"};
        String[] stringArray3 = new String[]{"\u4eba\u7269", "\u4efb\u52a1", "\u9053\u5177", "\u4ea4\u6d41", "\u4f4f\u5b85", "\u5e2e\u6d3e", "\u8bbe\u7f6e", "\u9000\u51fa"};
        N = new String[][]{{"jm", "jf"}, {"fm", "ff"}, {"lm", "lf"}};
        int[] nArray2 = new int[]{3123503, 14799407, 12916232, 0x545151};
        O = new String[]{"LIGHT", "FIRE", "COLD", "NONE"};
        P = new String[]{"WEAPON", "HEAD", "BOSOM", "FOOT", "DECORATION", "BOOK", "STUFF", "CHARGE"};
        Q = null;
        R = null;
        S = new short[][]{{92, 188}, {121, 166}, {150, 144}, {63, 166}, {92, 144}, {121, 122}};
        T = new short[][]{{53, 115}, {82, 93}, {111, 71}, {24, 93}, {53, 71}, {82, 49}};
        short[] sArray = new short[]{-1, 291, 292, 293, 294, 295, 296};
        U = new short[]{-1, 191, 192, 193, 194, 195, 196};
        short[] sArray2 = new short[]{6, 5, 14, 15, 17, 18, 19};
        short[] sArray3 = new short[]{8, 9, 12, 13};
        short[] sArray4 = new short[]{0, 1, 2, 4, 7, 20, 21, 22, 23, 24, 35};
        short[] sArray5 = new short[]{10, 11, 16, 28, 29, 25, 26, 27};
        short[] sArray6 = new short[]{30, 31, 32, 33, 34, 36, 37};
        short[] sArray7 = new short[]{44, 45, 46, 47};
        short[] sArray8 = new short[]{48, 49};
        V = new char[]{'1', '2', '3'};
        W = new char[]{'0', '1'};
        X = new char[]{'0', '0', '1', '1', '4'};
        Y = new String[]{"\u5f02\u5e38\u79bb\u7ebf", "\u6218\u6597\u3001\u4ea4\u6613\u72b6\u6001\u4e0d\u80fd\u8fdb\u884c\u5176\u4ed6\u64cd\u4f5c", "\u975e\u6cd5\u64cd\u4f5c", "\u60a8\u6ca1\u6709\u64cd\u4f5c\u6743\u9650", "\u64cd\u4f5c\u6210\u529f", "\u64cd\u4f5c\u5931\u8d25"};
        Z = new String[]{"\u5efa\u7acb\u5e2e\u6d3e", "\u54cd\u5e94\u5efa\u5e2e", "\u53d1\u5e03\u62db\u52df", "\u7533\u8bf7\u5165\u5e2e", "\u8fdb\u5165\u5e2e\u6d3e", "\u9000\u51fa\u5e2e\u6d3e", "\u89e3\u6563\u5e2e\u6d3e"};
        aa = new String[]{"\u5efa\u5e2e\u6761\u4ef6\uff1a\t\u7533\u8bf7\u4eba40\u7ea7\u4ee5\u4e0a\uff0c\u672a\u52a0\u5165\u5e2e\u6d3e\uff0c\u9700\u5148\u7f34\u7eb32\u5343\u4e07\u7533\u8bf7\u8d39\uff0c\u7533\u8bf7\u540e48\u5c0f\u65f6\u5185\u5fc5\u987b\u670925\u4e2a40\u7ea7\u4ee5\u4e0a\u7684\u73a9\u5bb6\u54cd\u5e94\u624d\u7b97\u5efa\u7acb\u6210\u529f\uff0c\u5426\u5219\u5931\u8d25\u5e76\u6ca1\u653610%\u7533\u8bf7\u8d39\u3002", "\u6253\u5f00\u5f85\u6210\u7acb\u5e2e\u6d3e\u7684\u5217\u8868\uff0c\u54cd\u5e94\u4f60\u60f3\u652f\u6301\u6210\u7acb\u7684\u5e2e\u6d3e\u3002", "\u8981\u58ee\u5927\u5e2e\u6d3e\uff0c\u5c31\u8981\u62db\u52df\u66f4\u591a\u7684\u4eba\u624d\uff0c\u53d1\u5e03\u62db\u52df\u7684\u91d1\u989d\u8d8a\u9ad8\u8d8a\u9760\u524d\u663e\u793a\uff08\u53ea\u6709\u5e2e\u6d3e\u5b98\u5458\u6709\u6743\u53d1\u5e03\u62db\u52df\uff09\u3002", "\u6253\u5f00\u5e2e\u6d3e\u62db\u52df\u5217\u8868\uff0c\u9009\u62e9\u4f60\u60f3\u52a0\u5165\u7684\u5e2e\u6d3e\u3002", "\u8fdb\u5165\u5e2e\u6d3e/\u56fd\u5bb6\u9886\u5730\uff0c\u4e5f\u53ef\u4ee5\u4ece\u4e3b\u83dc\u5355\u8fdb\u5165\u3002", "\u9000\u51fa\u5e2e\u6d3e\uff0c\u91cd\u65b0\u53d8\u6210\u65e0\u6d3e\u4eba\u58eb\u3002", "\u89e3\u6563\u81ea\u5df1\u521b\u5efa\u7684\u5e2e\u6d3e\uff08\u53ea\u80fd\u5e2e\u4e3b\u6709\u6743\u89e3\u6563\uff09\u3002"};
        ab = new String[]{"\u66f4\u6539\u5b97\u65e8", "\u63a5\u53d7\u7533\u8bf7", "\u9080\u8bf7\u52a0\u5165", "\u4efb\u514d\u5f00\u9664", "\u67e5\u770b\u5e2e\u6d3e", "\u5e2e\u6d3e\u5347\u7ea7"};
        ac = new String[]{"\u5e2e\u4e3b\u66f4\u6539\u5e2e\u6d3e\u7684\u5b97\u65e8\u3002", "\u63a5\u53d7\u7533\u8bf7\u52a0\u5165\u672c\u5e2e\u6d3e\u7684\u73a9\u5bb6", "\u9080\u8bf7\u6307\u5b9a\u73a9\u5bb6\u52a0\u5165\u672c\u5e2e\u3002", "\u804c\u52a1\u4efb\u514d\uff0c\u5f00\u9664\u6210\u5458\u3002", "\u67e5\u770b\u5e2e\u4f1a\u7684\u57fa\u672c\u4fe1\u606f\u3002", "\u5e2e\u6d3e\u5347\u7ea7"};
        String[] stringArray4 = new String[]{"\u67e5\u770b\u516c\u544a", "\u6539\u5199\u516c\u544a"};
        String[] stringArray5 = new String[]{"\u67e5\u770b\u5e2e\u6d3e\u7684\u516c\u544a", "\u6539\u5199\u5e2e\u6d3e\u7684\u516c\u544a"};
        ad = new String[]{"\u67e5\u770b\u5b9d\u5e93", "\u6350\u732e\u7269\u54c1", "\u6350\u732e\u94f6\u4e24", "\u53d6\u51fa\u94f6\u4e24", "\u6350\u732e\u7ecf\u9a8c", "\u8d21\u732e\u7269\u8d44", "\u53d1\u5e03\u4efb\u52a1\uff08\u8d44\u6e90\uff09", "\u53d1\u5e03\u4efb\u52a1\uff08\u91d1\u8c46\uff09", "\u5b9d\u5e93\u914d\u7f6e", "\u63d0\u5347\u4eba\u6c14", "\u5b9d\u5e93\u6269\u5bb9"};
        ae = new String[]{"\u94f6\u4e24", "\u91d1\u952d", "\u94f6\u952d", "\u94dc\u952d", "\u94c1\u952d"};
        af = new String[]{"\u7269\u54c1\u6389\u7387", "\u94f6\u4e24\u5956\u52b1", "\u7ecf\u9a8c\u52a0\u6210"};
        ag = new StringBuffer();
        (new short[1])[0] = 0;
        short[] sArray9 = new short[]{0, 1, 2, 4, 7, 35, 6, 5, 14, 15, 17, 18, 19, 44, 8, 9, 12, 13, 30, 31, 36, 32, 33, 34, 37, 3, 10, 11, 16, 28};
        short[] sArray10 = new short[]{29, 45, 47, 46, 25, 26, 27, 48, 50, 49, 51, 53, 52, 20, 21, 22, 23, 24, 54, 55, 56, 57, 63, 61, 62, 59, 60, 58, 70, 71};
        short[] sArray11 = new short[]{72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 68, 69};
        new StringBuffer();
        ah = new String[]{"\u5c06\u4ee5\u77ed\u4fe1\u65b9\u5f0f\u4e3a\u60a8\u5f00\u901a\u8d85Q\u670d\u52a1", "\u975e\u4e2d\u56fd\u79fb\u52a8\u7528\u6237\u8bf7\u767b\u5f55\u8d85Q\u5b98\u7f51\uff08sqq.3g.qq.com\uff09\u5f00\u901a"};
    }
}


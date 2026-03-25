/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class bb {
    public static int a = 1;
    public static int b = 1;
    public static boolean c = false;
    public static int d = -1;
    public static String[] e = new String[]{"\u5145\u503c\u65f6\u8bf7\u8ba4\u771f\u586b\u5199\uff0c\u56e0\u8f93\u5165\u9519\u8bef\u800c\u5145\u503c\u5230\u4ed6\u4eba\u5e10\u6237\u7684\u635f\u5931\u5c06\u7531\u60a8\u672c\u4eba\u627f\u62c5\u3002", "\u5361\u9762\u5145\u503c\u65f6\uff0c\u8bf7\u52a1\u5fc5\u786e\u8ba4\u60a8\u7684\u5145\u503c\u5361\u9762\u989d\u4e0e\u9009\u62e9\u91d1\u989d\u76f8\u540c\uff0c\u5426\u5219\u4f1a\u5bfc\u81f4\u652f\u4ed8\u5931\u8d25\uff0c\u540c\u65f6\u5361\u5185\u91d1\u989d\u88ab\u3010\u4e00\u6b21\u6027\u6263\u8d39\u3011\u3002", "\u5f00\u901a\u7f51\u94f6\u652f\u4ed8\uff1a\u5de5\u5546\u94f6\u884c\u8bf7\u53bb\u67dc\u53f0\u5f00\u901a,\u5982\u679c\u5de5\u884c\u5df2\u5f00\u901a\u7f51\u94f6\u5e76\u4e14\u52a8\u6001\u53e3\u4ee4\u5361\u652f\u4ed8,\u76f4\u63a5\u5728\u7f51\u4e0a\u94f6\u884c\u5f00\u901a\u5373\u53ef\u3002\u5efa\u8bbe\u94f6\u884c\u8bf7\u53bb\u67dc\u53f0\u7b7e\u7ea6,\u7136\u540e\u7528\u624b\u673a\u767b\u5f55\u4e2a\u4eba\u7f51\u94f6\u6fc0\u6d3b\u3002\u62db\u5546\u94f6\u884c\u624b\u673a\u652f\u4ed8\u529f\u80fd\u4e0d\u9700\u8981\u5355\u72ec\u7533\u8bf7.\u5982\u679c\u60a8\u5df2\u7ecf\u5f00\u901a\u4e86\u5927\u4f17\u7248\u652f\u4ed8(\u5361\u53f7\u5bc6\u7801\u652f\u4ed8)\u529f\u80fd,\u5219\u53ef\u4ee5\u76f4\u63a5\u4f7f\u7528\u624b\u673a\u652f\u4ed8\u3002", "\u7f51\u94f6\u5145\u503c\u65f6\uff0c\u5982\u6709\u94f6\u884c\u8bb0\u5f55\u5df2\u6263\u6b3e\uff0c\u4f46\u901a\u884c\u8bc1\u8d26\u6237\u672a\u5145\u5165\u76f8\u5e94\u6570\u989d\u94f6\u5143\uff0c\u8bf7\u7535\u8bdd\u8054\u7cfb400-889-0009 \u89e3\u51b3\u3002", "\u8bf7\u4e0d\u8981\u91cd\u590d\u63d0\u4ea4\uff0c\u4ee5\u9632\u91cd\u590d\u8d2d\u4e70\u3002"};
    public static String[] f = new String[]{"\u5145\u503c\u65f6\u8bf7\u8ba4\u771f\u586b\u5199\uff0c\u56e0\u8f93\u5165\u9519\u8bef\u800c\u5145\u503c\u5230\u4ed6\u4eba\u5e10\u6237\u7684\u635f\u5931\u5c06\u7531\u60a8\u672c\u4eba\u627f\u62c5\u3002", "\u5361\u9762\u5145\u503c\u65f6\uff0c\u8bf7\u52a1\u5fc5\u786e\u8ba4\u60a8\u7684\u5145\u503c\u5361\u9762\u989d\u4e0e\u9009\u62e9\u91d1\u989d\u76f8\u540c\uff0c\u5426\u5219\u4f1a\u5bfc\u81f4\u652f\u4ed8\u5931\u8d25\uff0c\u540c\u65f6\u5361\u5185\u91d1\u989d\u88ab\u3010\u4e00\u6b21\u6027\u6263\u8d39\u3011\u3002", "\u5f00\u901a\u7f51\u94f6\u652f\u4ed8\uff1a\u5de5\u5546\u94f6\u884c\u8bf7\u53bb\u67dc\u53f0\u5f00\u901a,\u5982\u679c\u5de5\u884c\u5df2\u5f00\u901a\u7f51\u94f6\u5e76\u4e14\u52a8\u6001\u53e3\u4ee4\u5361\u652f\u4ed8,\u76f4\u63a5\u5728\u7f51\u4e0a\u94f6\u884c\u5f00\u901a\u5373\u53ef\u3002\u5efa\u8bbe\u94f6\u884c\u8bf7\u53bb\u67dc\u53f0\u7b7e\u7ea6,\u7136\u540e\u7528\u624b\u673a\u767b\u5f55\u4e2a\u4eba\u7f51\u94f6\u6fc0\u6d3b\u3002\u62db\u5546\u94f6\u884c\u624b\u673a\u652f\u4ed8\u529f\u80fd\u4e0d\u9700\u8981\u5355\u72ec\u7533\u8bf7.\u5982\u679c\u60a8\u5df2\u7ecf\u5f00\u901a\u4e86\u5927\u4f17\u7248\u652f\u4ed8(\u5361\u53f7\u5bc6\u7801\u652f\u4ed8)\u529f\u80fd,\u5219\u53ef\u4ee5\u76f4\u63a5\u4f7f\u7528\u624b\u673a\u652f\u4ed8\u3002", "\u7f51\u94f6\u5145\u503c\u65f6\uff0c\u5982\u6709\u94f6\u884c\u8bb0\u5f55\u5df2\u6263\u6b3e\uff0c\u4f46\u901a\u884c\u8bc1\u8d26\u6237\u672a\u5145\u5165\u76f8\u5e94\u6570\u989d\u7684\u91d1\u8c46\uff0c\u8bf7\u7535\u8bdd\u8054\u7cfb400-889-0009 \u89e3\u51b3\u3002", "\u8bf7\u4e0d\u8981\u91cd\u590d\u63d0\u4ea4\uff0c\u4ee5\u9632\u91cd\u590d\u8d2d\u4e70\u3002"};
    public static String g;
    public static String h;
    public static String i;
    public static String j;
    public static boolean k;
    public static byte l;
    public static String m;
    public static String n;

    /*
     * Loose catch block
     */
    public static void a() {
        Object object = bj.a("silver_kj");
        if (object == null) {
            return;
        }
        Object object2 = null;
        FilterInputStream filterInputStream = null;
        object2 = new ByteArrayInputStream((byte[])object);
        filterInputStream = new DataInputStream((InputStream)object2);
        k = ((DataInputStream)filterInputStream).readByte() == 1;
        l = ((DataInputStream)filterInputStream).readByte();
        m = ((DataInputStream)filterInputStream).readUTF();
        n = ((DataInputStream)filterInputStream).readUTF();
        ((ByteArrayInputStream)object2).close();
        filterInputStream.close();
        try {
            ((ByteArrayInputStream)object2).close();
            filterInputStream.close();
            return;
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            return;
        }
        catch (Exception exception) {
            try {
                object = exception;
                exception.printStackTrace();
            }
            catch (Throwable throwable) {
                try {
                    if (object2 != null) {
                        ((ByteArrayInputStream)object2).close();
                    }
                    if (filterInputStream != null) {
                        filterInputStream.close();
                    }
                }
                catch (Exception exception2) {
                    object2 = exception2;
                    exception2.printStackTrace();
                }
                throw throwable;
            }
            try {
                if (object2 != null) {
                    ((ByteArrayInputStream)object2).close();
                }
                if (filterInputStream != null) {
                    filterInputStream.close();
                }
                return;
            }
            catch (Exception exception3) {
                object = exception3;
                exception3.printStackTrace();
                return;
            }
        }
    }

    /*
     * Loose catch block
     */
    public static void b() {
        Object object = null;
        FilterOutputStream filterOutputStream = null;
        object = new ByteArrayOutputStream();
        filterOutputStream = new DataOutputStream((OutputStream)object);
        ((DataOutputStream)filterOutputStream).writeByte(k ? 1 : 0);
        ((DataOutputStream)filterOutputStream).writeByte(l);
        ((DataOutputStream)filterOutputStream).writeUTF(m);
        ((DataOutputStream)filterOutputStream).writeUTF(k ? n : "");
        ((DataOutputStream)filterOutputStream).flush();
        Object object2 = ((ByteArrayOutputStream)object).toByteArray();
        bj.a(object2, "silver_kj");
        try {
            ((ByteArrayOutputStream)object).close();
            filterOutputStream.close();
            return;
        }
        catch (Exception exception) {
            object2 = exception;
            exception.printStackTrace();
            return;
        }
        catch (Exception exception) {
            Exception exception2;
            try {
                exception2 = exception;
                exception.printStackTrace();
            }
            catch (Throwable throwable) {
                try {
                    if (object != null) {
                        ((ByteArrayOutputStream)object).close();
                    }
                    if (filterOutputStream != null) {
                        filterOutputStream.close();
                    }
                }
                catch (Exception exception3) {
                    object = exception3;
                    exception3.printStackTrace();
                }
                throw throwable;
            }
            try {
                if (object != null) {
                    ((ByteArrayOutputStream)object).close();
                }
                if (filterOutputStream != null) {
                    filterOutputStream.close();
                }
                return;
            }
            catch (Exception exception4) {
                exception2 = exception4;
                exception4.printStackTrace();
                return;
            }
        }
    }

    static {
        k = true;
        l = 0;
    }
}


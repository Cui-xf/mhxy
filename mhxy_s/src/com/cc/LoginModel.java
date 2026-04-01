package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.ImageItem;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;

//public final class bg implements CommandListener {
public final class LoginModel implements CommandListener {
    private byte a = -1;
    private byte b = 0;
    private static String c = "通行证:";
    private static String d = "密    码:";
    private static String e = "验证码:";
    private static String[] f = new String[]{"用户名", "手机号", "ID"};
    private static String[] g = new String[]{"保存密码"};
    private h h;
    private static String[] i = new String[]{"错误", "警告", "温馨提示", "错误", "温馨提示"};
    private Form j = null;
    private StringItem k;
    private Form l = null;
    private ChoiceGroup m;
    private TextField zhanghaoTF = null;
    private TextField pwdTF = null;
    private ChoiceGroup p;
    private Form q = null;
    private TextField r = null;
    private ImageItem s = null;
    private Form t = null;
    private TextField u = null;
    private Command v = null;
    private StringItem w = null;
    private Form x = null;
    private TextField y = null;
    private TextField z = null;
    private TextField A = null;
    private TextField B = null;
    private Form C = null;
    private TextField D = null;
    private TextField E = null;
    private TextField F = null;
    private Form G;
    private Form H = null;
    private TextField I = null;
    private TextField J = null;
    private Command K = null;
    private Command L = null;
    private byte M;
    private Form N = null;
    private Command O = null;
    private Command P = null;
    private Form Q;
    private ChoiceGroup R;
    private TextField S;
    private TextField T;
    private ChoiceGroup U;
    private TextField V;
    private static final String[] W = new String[]{"神州行"};
    private static final String[] X = new String[]{"30", "50", "100"};
    private Form Y;
    private ChoiceGroup Z;
    private TextField aa;
    private TextField ab;
    private static String ac = "通行证用户名输入错误，请重新输入!";
    private static String ad = "通行证请输入11位手机号码，请重新输入!";
    private static String ae = "通行证ID号输入长度错误，请重新输入";
    private static String af = "密码错误，请重新输入";

    public LoginModel(h var1) {
        this.h = var1;
        this.b = this.a = -1;
    }

    public final void a() {
        if (this.a != 2) {
            this.b = this.a;
        }

        this.a = 1;
        this.h.b();
    }

    private void a(String var1, byte var2) {
        if (var2 == 3) {
            Command var4 = new Command("退出", 7, 0);
            this.a(var1, var2, var4, (Command[]) null);
        } else if (var2 == 4) {
            this.a(var1, var2, (Command) null, (Command[]) null);
        } else {
            Command var3 = new Command("返回", 2, 0);
            this.a(var1, var2, var3, (Command[]) null);
        }
    }

    private void a(String var1, byte var2, Command var3, Command[] var4) {
        if (this.j != null) {
            this.c();
        }

        this.j = new Form(i[var2]);
        this.k = new StringItem((String) null, var1);
        this.j.append(this.k);
        if (var3 != null) {
            this.j.addCommand(var3);
        }

        this.j.setCommandListener(this);
        this.h.a().setCurrent(this.j);
        if (this.a != 2) {
            this.b = this.a;
        }

        this.a = 2;
    }

    private void c() {
        this.j = null;
        this.k = null;
    }

    public final void a(Display var1, String var2, String var3, int var4) {
        if (this.l != null) {
            this.b();
        }

        this.l = new Form("登录一哥哥通行证");
        this.m = new ChoiceGroup("方式:", 4, f, (Image[]) null);
        this.m.setSelectedIndex(MainCanvas.ao, true);
        this.l.append(this.m);
        this.zhanghaoTF = new TextField(c, var2, 12, 0);
        if (var4 == 0) {
            this.pwdTF = new TextField(d, MainCanvas.ap ? var3 : null, 12, 0);
        } else if (var4 == 3) {
            this.pwdTF = new TextField(d, var3, 12, 0);
        } else {
            this.pwdTF = new TextField(d, var3, 12, 0);
        }

        this.l.append(this.zhanghaoTF);
        this.l.append(this.pwdTF);
        this.p = new ChoiceGroup((String) null, 2, g, (Image[]) null);
        this.p.setSelectedFlags(new boolean[]{MainCanvas.ap});
        this.l.append(this.p);
        Command var6 = new Command("提交", 4, 0);
        Command var7 = new Command("返回", 2, 1);
        this.l.addCommand(var6);
        this.l.addCommand(var7);
        this.l.setCommandListener(this);
        if (bb_1.k) {
            this.p.setSelectedIndex(0, true);
        }

        if (this.l != null) {
            var1.setCurrent(this.l);
        }

        if (this.a != 2) {
            this.b = this.a;
        }

        this.a = 3;
    }

    public final void b() {
        this.p = null;
        this.m = null;
        this.l = null;
        this.zhanghaoTF = null;
        this.pwdTF = null;
    }

    private void d(Display var1) {
        this.q = new Form("登陆验证码");
        StringItem var3 = new StringItem((String) null, "为了您的账号安全，请输入下面的验证码：");
        this.q.append(var3);
        this.r = new TextField("", "", 4, 2);
        this.s = new ImageItem("", (Image) null, 1, "");
        this.q.append(this.r);
        this.q.append(this.s);
        Command var6 = new Command("返回", 7, 0);
        Command var4 = new Command("提交", 4, 1);
        Command var5 = new Command("刷新", 4, 1);
        this.q.addCommand(var6);
        this.q.addCommand(var4);
        this.q.addCommand(var5);
        this.q.setCommandListener(this);
        if (this.q != null) {
            var1.setCurrent(this.q);
        }

        if (this.a != 2) {
            this.b = this.a;
        }

        this.a = 12;
    }

    public final void a(Display var1, String var2, String var3) {
        if (this.t != null) {
            this.t.deleteAll();
        }

        this.u = null;
        this.v = null;
        this.w = null;
        this.t = null;
        if (var2 != null) {
            this.w = new StringItem(var2, var3);
        }

        this.t = new Form("一哥哥通行证密码");
        this.u = new TextField("通行证密码", (String) null, 12, 0);
        this.v = new Command("提交", 2, 1);
        this.t.addCommand(this.v);
        this.t.append(this.u);
        if (var2 != null) {
            this.t.append(this.w);
        }

        this.t.setCommandListener(this);
        var1.setCurrent(this.t);
        this.a = 13;
    }

    public final void a(Display var1, boolean var2) {
        bb_1.c = var2;
        if (this.x != null) {
            this.d();
        }

        this.x = new Form(var2 ? "请修改您的帐号信息" : "注册一哥哥通行证");
        this.y = new TextField("用  户  名:", "", 12, 0);
        this.z = new TextField("密        码:", "", 12, 65536);
        this.A = new TextField("确认密码:", "", 12, 65536);
        this.B = new TextField("验  证  码:", "", 4, 2);
        this.x.append(this.y);
        this.x.append(this.z);
        this.x.append(this.A);
        StringItem var3 = new StringItem((String) null, "注意：用户名仅允许4-10位的数字和字母；密码仅允许6-12位的数字和字母。");
        this.x.append(var3);
        Command var6 = new Command("返回", 2, 1);
        Command var4 = new Command("提交", 4, 0);
        Command var5 = new Command("返回游戏", 4, 1);
        this.x.addCommand(var4);
        if (bb_1.c) {
            this.x.addCommand(var5);
        } else {
            this.x.addCommand(var6);
        }

        this.x.setCommandListener(this);
        if (this.x != null) {
            var1.setCurrent(this.x);
        }

        if (this.a != 2) {
            this.b = this.a;
        }

        this.a = 4;
    }

    private void d() {
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
    }

    public final void a(Display var1) {
        this.C = new Form("修改密码");
        this.D = new TextField("账号:", "", 12, 0);
        this.E = new TextField("原密码:", "", 12, 0);
        this.F = new TextField("新密码:", "", 12, 0);
        this.C.append(this.D);
        this.C.append(this.E);
        this.C.append(this.F);
        StringItem var3 = new StringItem((String) null, "注意：密码仅允许6-12位的数字和字母。");
        this.C.append(var3);
        Command var5 = new Command("返回", 2, 1);
        Command var4 = new Command("确定", 4, 0);
        this.C.addCommand(var5);
        this.C.addCommand(var4);
        this.C.setCommandListener(this);
        if (this.C != null) {
            var1.setCurrent(this.C);
        }

        if (this.a != 2) {
            this.b = this.a;
        }

        this.a = 15;
    }

    private void a(Display var1, String var2, String[] var3, String[] var4) {
        this.e();
        String[] var5 = var4;
        Object var11 = null;
        LoginModel var8 = this;
        this.G = new Form(var2);
        StringItem[] var6 = new StringItem[var4.length];

        for (byte var7 = 0; var7 < var6.length; ++var7) {
            if (var11 == null) {
                var6[var7] = new StringItem((String) null, var5[var7]);
            } else {
                var6[var7] = new StringItem((String) ((Object[]) var11)[var7], var5[var7]);
            }

            var8.G.append(var6[var7]);
        }

        Command var14 = new Command("返回", 2, 1);
        var8.G.addCommand(var14);
        if (var2.equals("一哥哥通行证帮助") && !bb_1.c) {
            Command var10 = new Command("登录", 4, 1);
            Command var12 = new Command("注册", 4, 1);
            Command var13 = new Command("退出", 7, 1);
            var8.G.addCommand(var10);
            var8.G.addCommand(var12);
            var8.G.addCommand(var13);
        }

        var8.G.setCommandListener(var8);
        if (this.G != null) {
            var1.setCurrent(this.G);
        }

        if (this.a != 2) {
            this.b = this.a;
        }

        this.a = 5;
    }

    private void e() {
        if (this.G != null) {
            this.G.deleteAll();
        }

        this.G = null;
    }

    public final void a(Display var1, int var2) {
        if (var2 > 200) {
            this.a((String) "一次最大为200", (byte) 2);
        } else {
            if (this.H != null) {
                this.f();
            }

            if (this.H == null) {
                this.H = new Form("");
                this.I = new TextField("银元购买金豆数量(1-100):", String.valueOf(var2), 3, 2);
                this.J = new TextField("通行证支付密码(若无请输入登录密码):", "", 12, 65536);
                this.H.append(this.I);
                this.H.append(this.J);
                this.L = new Command("返回游戏", 7, 0);
                this.K = new Command("提交", 4, 0);
                Command var3 = new Command("余额查询", 4, 0);
                this.H.addCommand(this.L);
                this.H.addCommand(this.K);
                this.H.addCommand(var3);
                this.H.setCommandListener(this);
            }

            var1.setCurrent(this.H);
        }

        if (this.a != 2) {
            this.b = this.a;
        }

        this.a = 7;
    }

    private void f() {
        this.H = null;
        this.I = null;
        this.J = null;
    }

    private void g() {
        this.N = null;
        this.P = null;
        this.O = null;
    }

    private void e(Display var1) {
        this.h();
        this.Q = new Form("充值中心");
        this.Q.append("1元=1银元");
        this.R = new ChoiceGroup("充值卡:", 4, W, (Image[]) null);
        this.Q.append(this.R);
        this.S = new TextField("充值卡序号:", "", 32, 2);
        this.T = new TextField("充值卡密码:", "", 32, 2);
        this.U = new ChoiceGroup("充值卡面值:", 4, X, (Image[]) null);
        this.U.setSelectedIndex(1, true);
        this.V = new TextField(e, "", 4, 2);
        this.Q.append(this.S);
        this.Q.append(this.T);
        this.Q.append(this.U);
        Command var3 = new Command("返回游戏", 7, 0);
        Command var4 = new Command("提交", 4, 1);
        Command var5 = new Command("余额查询", 4, 1);
        Command var6 = new Command("充值帮助", 4, 1);
        this.Q.addCommand(var3);
        this.Q.addCommand(var4);
        this.Q.addCommand(var5);
        this.Q.addCommand(var6);
        this.Q.setCommandListener(this);
        if (this.Q != null) {
            var1.setCurrent(this.Q);
        }

        if (this.a != 2) {
            this.b = this.a;
        }

        this.a = 6;
    }

    private void h() {
        this.Q = null;
        this.R = null;
        this.S = this.T;
        this.U = null;
        this.V = null;
    }

    public final void b(Display var1) {
        this.i();
        this.Q = new Form("充值中心");
        this.Q.append("1元=1金豆");
        this.R = new ChoiceGroup("充值卡:", 4, W, (Image[]) null);
        this.Q.append(this.R);
        this.S = new TextField("充值卡序号:", "", 32, 2);
        this.T = new TextField("充值卡密码:", "", 32, 2);
        this.U = new ChoiceGroup("充值卡面值:", 4, X, (Image[]) null);
        this.U.setSelectedIndex(1, true);
        this.V = new TextField(e, "", 4, 2);
        this.Q.append(this.S);
        this.Q.append(this.T);
        this.Q.append(this.U);
        Command var3 = new Command("返回游戏", 7, 0);
        Command var4 = new Command("提交", 4, 1);
        Command var5 = new Command("充值帮助", 4, 1);
        this.Q.addCommand(var3);
        this.Q.addCommand(var4);
        this.Q.addCommand(var5);
        this.Q.setCommandListener(this);
        if (this.Q != null) {
            var1.setCurrent(this.Q);
        }

        if (this.a != 2) {
            this.b = this.a;
        }

        this.a = 10;
    }

    private void i() {
        this.Q = null;
        this.R = null;
        this.S = this.T;
        this.U = null;
        this.V = null;
    }

    public final void c(Display var1) {
        this.h();
        this.Y = new Form("余额查询");
        this.Z = new ChoiceGroup("方式:", 4, f, (Image[]) null);
        this.Y.append(this.Z);
        this.aa = new TextField("通行证:", "", 32, 0);
        this.ab = new TextField("密  码:", "", 32, 65536);
        new TextField(e, "", 4, 2);
        this.Y.append(this.aa);
        this.Y.append(this.ab);
        Command var3 = new Command("返回游戏", 7, 0);
        Command var4 = new Command("提交", 4, 1);
        Command var5 = new Command("充值", 4, 1);
        this.Y.addCommand(var3);
        this.Y.addCommand(var4);
        this.Y.addCommand(var5);
        this.Y.setCommandListener(this);
        if (this.Y != null) {
            var1.setCurrent(this.Y);
        }

        if (this.a != 2) {
            this.b = this.a;
        }

        this.a = 9;
    }

    private void j() {
        this.Y = null;
        this.Z = null;
        this.aa = this.ab = null;
    }

    public final void commandAction(Command var1, Displayable var2) {
        String var13;
        if ((var13 = var1.getLabel()) != null) {
            switch (this.a) {
                case 2:
                    if (var13.equals("退出")) {
                        this.h.c();
                        return;
                    }

                    if (var13.equals("返回") && this.b == 12) {
                        this.a(this.h.a(), bb_1.m, bb_1.n, 0);
                        return;
                    }

                    if (var13.equals("返回") && this.b == 13) {
                        this.a(this.h.a(), "游客注册 第2步: ", "创建一哥哥通行证密码");
                        return;
                    }

                    if (var13.equals("返回游戏")) {
                        this.h.b();
                        return;
                    }

                    switch (this.b) {
                        case 1:
                            this.c();
                            this.a();
                            return;
                        case 2:
                        case 5:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        default:
                            if (var13.equals("返回")) {
                                if (this.b == 3) {
                                    this.a(this.h.a(), bb_1.m, bb_1.n, 0);
                                    return;
                                } else {
                                    if (this.b == 11) {
                                        return;
                                    }

                                    if (this.b == 4) {
                                        this.a(this.h.a(), bb_1.c);
                                        return;
                                    } else {
                                        if (this.b == 6) {
                                            this.e(this.h.a());
                                        } else {
                                            if (this.b != 10) {
                                                return;
                                            }

                                            this.b(this.h.a());
                                        }

                                        return;
                                    }
                                }
                            } else {
                                if (var13.equals("登录")) {
                                    this.a(this.h.a(), bb_1.m, bb_1.n, 0);
                                } else {
                                    if (!var13.equals("注册")) {
                                        if (!var13.equals("短信注册") && var13.equals("退出")) {
                                            this.h.c();
                                        }

                                        return;
                                    }

                                    this.a(this.h.a(), bb_1.c);
                                }

                                return;
                            }
                        case 3:
                            this.c();
                            if (this.b == -1) {
                                this.h.c();
                            } else {
                                this.a(this.h.a(), bb_1.m, bb_1.n, 0);
                            }

                            return;
                        case 4:
                            this.c();
                            if (var13.equals("登录")) {
                                this.a(this.h.a(), bb_1.m, bb_1.n, 2);
                            } else {
                                this.a(this.h.a(), bb_1.c);
                            }

                            return;
                        case 6:
                        case 10:
                            return;
                        case 7:
                            this.c();
                            if (var13.equals("返回游戏")) {
                                this.a();
                            } else {
                                this.a((Display) this.h.a(), (int) 1);
                            }

                            return;
                        case 8:
                            this.c();
                            if (this.M != 7) {
                                return;
                            }

                            if (var13.equals("返回")) {
                                this.a((Display) this.h.a(), (int) 1);
                            } else {
                                this.a();
                            }

                            return;
                        case 9:
                            this.c();
                            this.c(this.h.a());
                            return;
                        case 15:
                            this.c();
                            this.a(this.h.a());
                            return;
                    }
                case 3:
                    String var33 = this.zhanghaoTF.getString();
                    String var43 = this.pwdTF.getString();
                    byte var50 = a(this.m);
                    if (var13.equals("提交")) {
                        if (var50 == 0) {
                            if (var33.equals("") || var33.length() < 4) {
                                this.a((String) "通行证用户名输入错误，请重新输入", (byte) 2);
                                return;
                            }
                        } else if (var50 == 1) {
                            if (var33.equals("") || var33.length() < 11) {
                                this.a((String) "通行证请输入11位手机号码，请重新输入", (byte) 2);
                                return;
                            }
                        } else if (var50 == 2 && (var33.equals("") || var33.length() < 4)) {
                            this.a((String) "通行证ID号输入长度错误，请重新输入", (byte) 2);
                            return;
                        }

                        if (!var43.equals("") && var43.length() >= 6) {
                            this.doLogin();
                            return;
                        }

                        this.a((String) "密码错误，请重新输入", (byte) 2);
                        return;
                    }

                    if (var13.equals("返回")) {
                        this.b();
                        this.a();
                        return;
                    }
                    break;
                case 4:
                    String var31 = this.y.getString();
                    String var41 = this.z.getString();
                    String var48 = this.A.getString();
                    if (var13.equals("提交")) {
                        if (var31.equals("") || var31.length() < 4) {
                            this.a((String) "请输入4-10位的数字、字母或数字与字母组合的用户名", (byte) 2);
                            return;
                        }

                        if (var41.equals("") || var41.length() < 6) {
                            this.a((String) "请输入6-12位的数字、字母组合密码，以确保账号安全", (byte) 2);
                            return;
                        }

                        if (!var41.equals(var48)) {
                            this.a((String) "您两次输入的密码不一致，请重新输入", (byte) 2);
                            return;
                        }

                        LoginModel var22 = this;
                        var31 = this.y.getString();
                        var41 = this.z.getString();
                        var48 = this.A.getString();
                        this.B.getString();
                        if (z_1.a(var31)) {
                            this.a((String) "用户名不能为空！", (byte) 0);
                        } else if (!z_1.a(var31, 4, 10)) {
                            this.a((String) "用户名只允许4～10位字母和数字！", (byte) 0);
                        } else if (!bj.c(var31)) {
                            this.a((String) "用户名只允许字母和数字！", (byte) 0);
                        } else if (z_1.a(var41)) {
                            this.a((String) "密码不能为空", (byte) 2);
                        } else if (!z_1.c(var41)) {
                            this.a((String) "密码不是数字和字母的组合", (byte) 2);
                        } else if (!z_1.a(var41, 6, 12)) {
                            this.a((String) "密码为6-12 的数字和字母的组合形式", (byte) 2);
                        } else if (!bj.c(var41)) {
                            this.a((String) "密码只允许字母和数字！", (byte) 0);
                        } else {
                            if (z_1.b(var41) && z_1.b(var48) && var41.trim().equals(var48.trim())) {
                                StringBuffer var12;
                                (var12 = new StringBuffer()).append(var31);
                                var12.append(':');
                                var12.append(var41);
                                MainCanvas.am = var31;
                                bb_1.m = var31;
                                MainCanvas.an = var41;
                                bb_1.n = var41;
                                MainCanvas.ao = 0;
                                bb_1.l = 0;
                                MainCanvas.ap = true;
                                bb_1.k = true;
                                NetPacket var57;
                                if ((var57 = NetPayloadBuilder.login((byte) 1, (byte) 2, var12.toString())) != null) {
                                    var22.h.a(var57);
                                    var22.h.a.start();
                                    var22.h.a.mainCanvas.a("请求中...");
                                }

                                var12.delete(0, var12.capacity());
                                return;
                            }

                            this.a((String) "两次输入密码不一致！", (byte) 2);
                        }
                    } else {
                        if (var13.equals("返回游戏")) {
                            this.d();
                            this.a();
                            return;
                        }

                        if (var13.equals("返回")) {
                            this.d();
                            this.h.a.mainCanvas.c();
                            this.a();
                            return;
                        }
                    }
                    break;
                case 5:
                    this.e();
                    if (var13.equals("返回")) {
                        if (this.b == 3) {
                            this.a(this.h.a(), bb_1.j, bb_1.i, 0);
                            return;
                        }

                        if (this.b != 11) {
                            if (this.b == 4) {
                                this.a(this.h.a(), bb_1.c);
                                return;
                            }

                            if (this.b == 6) {
                                this.e(this.h.a());
                                return;
                            }

                            if (this.b == 10) {
                                this.b(this.h.a());
                                return;
                            }
                        }
                    } else {
                        if (var13.equals("登录")) {
                            this.a(this.h.a(), bb_1.j, bb_1.i, 0);
                            return;
                        }

                        if (var13.equals("注册")) {
                            this.a(this.h.a(), bb_1.c);
                            return;
                        }

                        if (!var13.equals("短信注册") && var13.equals("退出")) {
                            this.h.c();
                            return;
                        }
                    }
                    break;
                case 6:
                    if (var13.equals("提交")) {
                        LoginModel var21 = this;
                        byte var30;
                        if ((var30 = (byte) (this.R.getSelectedIndex() + 1)) == 2) {
                            var30 = 3;
                        }

                        String var40 = this.S.getString();
                        String var47 = this.T.getString();
                        int var54 = Integer.parseInt(X[this.U.getSelectedIndex()].trim());
                        if (z_1.a(var40)) {
                            this.a((String) "您没有输入卡号，请返回重新输入", (byte) 2);
                        } else if (!bj.b(var40)) {
                            this.a((String) "充值卡序号有误！", (byte) 2);
                        } else if (z_1.a(var47)) {
                            this.a((String) "您没有输入充值卡密码，请返回重新输入", (byte) 2);
                        } else {
                            if (bj.b(var47)) {
                                StringBuffer var11;
                                (var11 = new StringBuffer()).append(bb_1.g);
                                var11.append(':');
                                var11.append(bb_1.h);
                                var11.append(':');
                                var11.append(var30);
                                var11.append(':');
                                var11.append(var40);
                                var11.append(':');
                                var11.append(var47);
                                var11.append(':');
                                var11.append(var54);
                                NetPacket var56;
                                if ((var56 = NetPayloadBuilder.login((byte) 2, (byte) 5, var11.toString())) != null) {
                                    MainCanvas.i.sendPacket(var56);
                                    var21.h.a.start();
                                    var21.h.a.mainCanvas.a("请求中...");
                                }

                                var11.delete(0, var11.capacity());
                                return;
                            }

                            this.a((String) "充值卡密码有误！", (byte) 2);
                        }
                    } else {
                        if (var13.equals("余额查询")) {
                            this.h();
                            this.c(this.h.a());
                            return;
                        }

                        if (var13.equals("充值帮助")) {
                            this.f();
                            this.a(this.h.a(), "充值帮助", (String[]) null, bb_1.e);
                            return;
                        }

                        if (var13.equals("返回游戏")) {
                            this.h();
                            this.a();
                            return;
                        }
                    }
                    break;
                case 7:
                    if (!var13.equals("提交")) {
                        if (var13.equals("余额查询")) {
                            this.f();
                            this.c(this.h.a());
                            return;
                        }

                        this.f();
                        this.a();
                        return;
                    }

                    boolean var28;
                    if (!(var28 = z_1.d(var13 = this.I.getString()))) {
                        this.f();
                        this.a((String) "金额输入错误！", (byte) 0);
                        return;
                    }

                    int var38 = z_1.f(var13);
                    if (var28 && var38 <= 0 || var38 > 100) {
                        this.a((String) "购买数量必须在1~100之间！", (byte) 0);
                        return;
                    }

                    Display var10001 = this.h.a();
                    String var39 = "确认支付？";
                    Display var29 = var10001;
                    if (this.N != null) {
                        this.g();
                    }

                    if (this.N == null) {
                        this.N = new Form("");
                        this.N.append(new StringItem("", var39));
                        this.O = new Command("提交", 4, 0);
                        this.P = new Command("返回", 2, 0);
                        this.N.addCommand(this.O);
                        this.N.addCommand(this.P);
                        this.N.setCommandListener(this);
                    }

                    var29.setCurrent(this.N);
                    this.M = this.a;
                    this.a = 8;
                    break;
                case 8:
                    if (this.M == 7) {
                        if (!var13.equals("提交")) {
                            this.f();
                            this.g();
                            this.a((Display) this.h.a(), (int) 1);
                            return;
                        }

                        var13 = this.I.getString();
                        String var37 = this.J.getString();
                        if (z_1.a(var13)) {
                            this.a((String) "购买数量不能为空", (byte) 0);
                        } else if (!bj.b(var13)) {
                            this.a((String) "购买数量必须为数字", (byte) 0);
                        } else if (z_1.f(var13) > 0 && z_1.f(var13) <= 100) {
                            StringBuffer var46;
                            (var46 = new StringBuffer()).append(bb_1.g);
                            var46.append(':');
                            var46.append(bb_1.h);
                            var46.append(':');
                            var46.append(var13);
                            var46.append(':');
                            var46.append(var37);
                            NetPacket var53;
                            if ((var53 = NetPayloadBuilder.login((byte) 2, (byte) 6, var46.toString())) != null) {
                                MainCanvas.i.sendPacket(var53);
                                this.h.a.start();
                                this.h.a.mainCanvas.a("请求中...");
                            }

                            var46.delete(0, var46.capacity());
                        } else {
                            this.a((String) "购买数量必须在1~100之间！", (byte) 0);
                        }

                        this.g();
                        this.f();
                        return;
                    }
                    break;
                case 9:
                    if (var13.equals("提交")) {
                        LoginModel var18 = this;
                        byte var26 = 0;
                        if (this.Z.getSelectedIndex() == 0) {
                            var26 = 1;
                        } else if (this.Z.getSelectedIndex() == 1) {
                            var26 = 2;
                        } else {
                            var26 = 3;
                        }

                        String var36 = this.aa.getString();
                        String var45 = this.ab.getString();
                        if (z_1.a(var36)) {
                            this.a((String) "帐号不能为空！", (byte) 2);
                        } else if (var26 == 1 && !z_1.c(var36)) {
                            this.a((String) "用户名只能为数字和字母的组合形式", (byte) 2);
                        } else if (var26 == 1 && !z_1.a(var36, 4, 10)) {
                            this.a((String) "用户名为4-10 的数字和字母的组合", (byte) 2);
                        } else if (var26 == 2 && !z_1.e(var36)) {
                            this.a((String) "手机号不合符规范，应为11位数字", (byte) 2);
                        } else if (var26 == 3 && !z_1.d(var36)) {
                            this.a((String) "ID 应为数字", (byte) 2);
                        } else if (z_1.a(var45)) {
                            this.a((String) "密码不能为空", (byte) 2);
                        } else if (!z_1.c(var45)) {
                            this.a((String) "密码只能为数字和字母的组合", (byte) 0);
                        } else {
                            if (z_1.a(var45, 6, 12)) {
                                StringBuffer var52;
                                (var52 = new StringBuffer()).append(bb_1.g);
                                var52.append(':');
                                var52.append(bb_1.h);
                                var52.append(':');
                                var52.append(var26);
                                var52.append(':');
                                var52.append(var36);
                                var52.append(':');
                                var52.append(var45);
                                NetPacket var10;
                                if ((var10 = NetPayloadBuilder.login((byte) 2, (byte) 7, var52.toString())) != null) {
                                    MainCanvas.i.sendPacket(var10);
                                    var18.h.a.start();
                                    var18.h.a.mainCanvas.a("请求中...");
                                }

                                var52.delete(0, var52.capacity());
                                return;
                            }

                            this.a((String) "密码须为6～12位的字母和数字", (byte) 0);
                        }
                    } else {
                        if (var13.equals("充值")) {
                            this.j();
                            this.e(this.h.a());
                            return;
                        }

                        if (var13.equals("返回游戏")) {
                            this.j();
                            this.a();
                            return;
                        }
                    }
                    break;
                case 10:
                    if (var13.equals("提交")) {
                        LoginModel var17 = this;
                        byte var25;
                        if ((var25 = (byte) (this.R.getSelectedIndex() + 1)) == 2) {
                            var25 = 3;
                        }

                        String var35 = this.S.getString();
                        String var44 = this.T.getString();
                        int var51 = z_1.f(X[this.U.getSelectedIndex()].trim());
                        this.V.getString();
                        if (z_1.a(var35)) {
                            this.a((String) "您没有输入卡号，请返回重新输入", (byte) 2);
                        } else if (!bj.b(var35)) {
                            this.a((String) "充值卡序号有误！", (byte) 2);
                        } else if (z_1.a(var44)) {
                            this.a((String) "您没有输入充值卡密码，请返回重新输入", (byte) 2);
                        } else {
                            if (bj.b(var44)) {
                                StringBuffer var55;
                                (var55 = new StringBuffer()).append(bb_1.g);
                                var55.append(':');
                                var55.append(bb_1.h);
                                var55.append(':');
                                var55.append(var25);
                                var55.append(':');
                                var55.append(var35);
                                var55.append(':');
                                var55.append(var44);
                                var55.append(':');
                                var55.append(var51);
                                Object var8 = null;
                                NetPacket var9;
                                if (GlobalConfig.x) {
                                    var9 = NetPayloadBuilder.login((byte) 3, (byte) 8, var55.toString());
                                } else {
                                    var9 = NetPayloadBuilder.login((byte) 2, (byte) 8, var55.toString());
                                }

                                if (var9 != null) {
                                    MainCanvas.i.sendPacket(var9);
                                    var17.h.a.start();
                                    var17.h.a.mainCanvas.a("请求中...");
                                }

                                var55.delete(0, var55.capacity());
                                return;
                            }

                            this.a((String) "充值卡密码有误！", (byte) 2);
                        }
                    } else {
                        if (var13.equals("充值帮助")) {
                            this.f();
                            this.a(this.h.a(), "充值帮助", (String[]) null, bb_1.f);
                            return;
                        }

                        if (var13.equals("返回游戏")) {
                            this.i();
                            this.a();
                            return;
                        }
                    }
                    break;
                case 11:
                    return;
                case 12:
                    if (var13.equals("返回")) {
                        this.b();
                        this.a(this.h.a(), bb_1.m, bb_1.n, 0);
                        return;
                    }

                    if (var13.equals("提交")) {
                        this.doLogin();
                        return;
                    }

                    if (var13.equals("刷新")) {
                        this.q = null;
                        this.r = null;
                        this.s = null;
                        this.d(this.h.a());
                        return;
                    }
                    break;
                case 13:
                    if (var13.equals("提交")) {
                        h var16;
                        if ((var16 = this.h).a.mainCanvas.touchPageCase == 1) {
                            var16.a.mainCanvas.touchPageCase = var16.a.mainCanvas.k;
                        }

                        return;
                    }
                    break;
                case 14:
                default:
                    if (var13.equals("返回")) {
                        if (this.b == 3) {
                            this.a(this.h.a(), bb_1.m, bb_1.n, 0);
                            return;
                        }

                        if (this.b == 12) {
                            this.d(this.h.a());
                            return;
                        }

                        if (this.b != 11) {
                            if (this.b == 4) {
                                this.a(this.h.a(), bb_1.c);
                                return;
                            }

                            if (this.b == 6) {
                                this.e(this.h.a());
                                return;
                            }

                            if (this.b == 10) {
                                this.b(this.h.a());
                                return;
                            }
                        }
                    } else {
                        if (var13.equals("登录")) {
                            this.a(this.h.a(), bb_1.m, bb_1.n, 0);
                            return;
                        }

                        if (var13.equals("注册")) {
                            this.a(this.h.a(), bb_1.c);
                            return;
                        }

                        if (!var13.equals("短信注册") && var13.equals("退出")) {
                            this.h.c();
                        }
                    }
                    break;
                case 15:
                    if (var13.equals("确定")) {
                        var13 = this.D.getString();
                        String var23 = this.E.getString();
                        String var3 = this.F.getString();
                        String var4 = var3;
                        var3 = var23;
                        var23 = var13;
                        LoginModel var15 = this;
                        if (z_1.a(var3)) {
                            this.a((String) "旧密码不能为空", (byte) 0);
                        } else if (z_1.a(var4)) {
                            this.a((String) "新密码不能为空", (byte) 0);
                        } else if (!z_1.c(var4)) {
                            this.a((String) "新密码须为数字和字母的组合", (byte) 0);
                        } else if (!z_1.a(var4, 6, 12)) {
                            this.a((String) "新密码须为6-12的数字和字母的组合形式", (byte) 0);
                        } else {
                            if (bj.c(var4)) {
                                int var5 = bb_1.l == 2 ? 3 : (bb_1.l == 1 ? 2 : (bb_1.l == 0 ? 1 : 0));
                                StringBuffer var7;
                                (var7 = new StringBuffer()).append(var5);
                                var7.append(':');
                                var7.append(var23);
                                var7.append(':');
                                var7.append(var3);
                                var7.append(':');
                                var7.append(var4);
                                NetPacket var6;
                                if ((var6 = NetPayloadBuilder.login((byte) 1, (byte) 4, var7.toString())) != null) {
                                    var15.h.a(var6);
                                    var15.h.a.start();
                                    var15.h.a.mainCanvas.a("请求中...");
                                }

                                var7.delete(0, var7.capacity());
                                return;
                            }

                            this.a((String) "新密码只允许字母和数字", (byte) 0);
                        }
                    } else if (var13.equals("返回")) {
                        this.C = null;
                        this.E = null;
                        this.F = null;
                        this.D = null;
                        this.a();
                        return;
                    }
            }

        }
    }

    private void doLogin() {
        String zhanghao = this.zhanghaoTF.getString();
        String pwd = this.pwdTF.getString();
        byte var3 = a(this.m);
        if (z_1.a(zhanghao)) {
            bb_1.m = zhanghao;
            this.a((String) ac, (byte) 0);
        } else if (a(this.m) == 0 && !z_1.a(zhanghao, 4, 12)) {
            bb_1.m = zhanghao;
            this.a((String) ac, (byte) 0);
        } else if (a(this.m) == 1 && !z_1.e(zhanghao.trim())) {
            bb_1.m = zhanghao;
            this.a((String) ad, (byte) 0);
        } else if (a(this.m) != 2 || z_1.d(zhanghao.trim()) && z_1.a(zhanghao, 4, 12)) {
            if (z_1.a(pwd)) {
                bb_1.m = zhanghao;
                this.a((String) af, (byte) 0);
            } else {
                if (a(this.m) == 2 || a(this.m) == 1 || a(this.m) == 0) {
                    bb_1.n = pwd;
                    int type;
                    bb_1.l = (byte) (type = a(this.m) == 2 ? 3 : (a(this.m) == 1 ? 2 : (a(this.m) == 0 ? 1 : 0)));
                    StringBuffer zhanghaoPwd = new StringBuffer();
                    zhanghaoPwd.append(type);
                    zhanghaoPwd.append(':');
                    zhanghaoPwd.append(zhanghao);
                    zhanghaoPwd.append(':');
                    zhanghaoPwd.append(pwd);
                    NetPacket var6 = NetPayloadBuilder.login((byte) 1, (byte) 1, zhanghaoPwd.toString());
                    if (var6 != null) {
                        MainCanvas.am = zhanghao;
                        bb_1.m = zhanghao;
                        MainCanvas.an = pwd;
                        bb_1.n = pwd;
                        MainCanvas.ao = var3;
                        bb_1.l = var3;
                        bb_1.k = MainCanvas.ap = this.p.isSelected(0);
                        bb_1.b();
                        this.h.a(var6);
                        this.h.a.start();
                        this.h.a.mainCanvas.a("请求中...");
                    }

                    zhanghaoPwd.delete(0, zhanghaoPwd.capacity());
                }

            }
        } else {
            bb_1.m = zhanghao;
            this.a((String) ae, (byte) 0);
        }
    }

    private static byte a(ChoiceGroup var0) {
        return var0 == null ? 0 : (byte) var0.getSelectedIndex();
    }
}

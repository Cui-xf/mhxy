package defpackage;

import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.ImageItem;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;

/* loaded from: java版梦回西游3区251011.jar:bg.class */
public final class bg implements CommandListener {
    private byte a;
    private byte b;
    private h h;
    private StringItem k;
    private ChoiceGroup m;
    private ChoiceGroup p;
    private Form G;
    private byte M;
    private Form Q;
    private ChoiceGroup R;
    private TextField S;
    private TextField T;
    private ChoiceGroup U;
    private TextField V;
    private Form Y;
    private ChoiceGroup Z;
    private TextField aa;
    private TextField ab;
    private static String c = "通行证:";
    private static String d = "密    码:";
    private static String e = "验证码:";
    private static String[] f = {"用户名", "手机号", "ID"};
    private static String[] g = {"保存密码"};
    private static String[] i = {"错误", "警告", "温馨提示", "错误", "温馨提示"};
    private static final String[] W = {"神州行"};
    private static final String[] X = {"30", "50", "100"};
    private static String ac = "通行证用户名输入错误，请重新输入!";
    private static String ad = "通行证请输入11位手机号码，请重新输入!";
    private static String ae = "通行证ID号输入长度错误，请重新输入";
    private static String af = "密码错误，请重新输入";
    private Form j = null;
    private Form l = null;
    private TextField n = null;
    private TextField o = null;
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
    private Form H = null;
    private TextField I = null;
    private TextField J = null;
    private Command K = null;
    private Command L = null;
    private Form N = null;
    private Command O = null;
    private Command P = null;

    public bg(h hVar) {
        this.a = (byte) -1;
        this.b = (byte) 0;
        this.h = hVar;
        this.a = (byte) -1;
        this.b = (byte) -1;
    }

    public final void a() {
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte) 1;
        this.h.b();
    }

    private void a(String str, byte b) {
        if (b == 3) {
            a(str, b, new Command("退出", 7, 0), (Command[]) null);
        } else if (b == 4) {
            a(str, b, (Command) null, (Command[]) null);
        } else {
            a(str, b, new Command("返回", 2, 0), (Command[]) null);
        }
    }

    private void a(String str, byte b, Command command, Command[] commandArr) {
        if (this.j != null) {
            c();
        }
        this.j = new Form(i[b]);
        this.k = new StringItem((String) null, str);
        this.j.append(this.k);
        if (command != null) {
            this.j.addCommand(command);
        }
        this.j.setCommandListener(this);
        this.h.a().setCurrent(this.j);
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte) 2;
    }

    private void c() {
        this.j = null;
        this.k = null;
    }

    public final void a(Display display, String str, String str2, int i2) {
        if (this.l != null) {
            b();
        }
        this.l = new Form("登录一哥哥通行证");
        this.m = new ChoiceGroup("方式:", 4, f, (Image[]) null);
        this.m.setSelectedIndex(a.ao, true);
        this.l.append(this.m);
        this.n = new TextField(c, str, 12, 0);
        if (i2 == 0) {
            this.o = new TextField(d, a.ap ? str2 : null, 12, 0);
        } else if (i2 == 3) {
            this.o = new TextField(d, str2, 12, 0);
        } else {
            this.o = new TextField(d, str2, 12, 0);
        }
        this.l.append(this.n);
        this.l.append(this.o);
        this.p = new ChoiceGroup((String) null, 2, g, (Image[]) null);
        this.p.setSelectedFlags(new boolean[]{a.ap});
        this.l.append(this.p);
        Command command = new Command("提交", 4, 0);
        Command command2 = new Command("返回", 2, 1);
        this.l.addCommand(command);
        this.l.addCommand(command2);
        this.l.setCommandListener(this);
        if (bb.k) {
            this.p.setSelectedIndex(0, true);
        }
        if (this.l != null) {
            display.setCurrent(this.l);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte) 3;
    }

    public final void b() {
        this.p = null;
        this.m = null;
        this.l = null;
        this.n = null;
        this.o = null;
    }

    private void d(Display display) {
        this.q = new Form("登陆验证码");
        this.q.append(new StringItem((String) null, "为了您的账号安全，请输入下面的验证码："));
        this.r = new TextField("", "", 4, 2);
        this.s = new ImageItem("", (Image) null, 1, "");
        this.q.append(this.r);
        this.q.append(this.s);
        Command command = new Command("返回", 7, 0);
        Command command2 = new Command("提交", 4, 1);
        Command command3 = new Command("刷新", 4, 1);
        this.q.addCommand(command);
        this.q.addCommand(command2);
        this.q.addCommand(command3);
        this.q.setCommandListener(this);
        if (this.q != null) {
            display.setCurrent(this.q);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte) 12;
    }

    public final void a(Display display, String str, String str2) {
        if (this.t != null) {
            this.t.deleteAll();
        }
        this.u = null;
        this.v = null;
        this.w = null;
        this.t = null;
        if (str != null) {
            this.w = new StringItem(str, str2);
        }
        this.t = new Form("一哥哥通行证密码");
        this.u = new TextField("通行证密码", (String) null, 12, 0);
        this.v = new Command("提交", 2, 1);
        this.t.addCommand(this.v);
        this.t.append(this.u);
        if (str != null) {
            this.t.append(this.w);
        }
        this.t.setCommandListener(this);
        display.setCurrent(this.t);
        this.a = (byte) 13;
    }

    public final void a(Display display, boolean z) {
        bb.c = z;
        if (this.x != null) {
            d();
        }
        this.x = new Form(z ? "请修改您的帐号信息" : "注册一哥哥通行证");
        this.y = new TextField("用  户  名:", "", 12, 0);
        this.z = new TextField("密        码:", "", 12, 65536);
        this.A = new TextField("确认密码:", "", 12, 65536);
        this.B = new TextField("验  证  码:", "", 4, 2);
        this.x.append(this.y);
        this.x.append(this.z);
        this.x.append(this.A);
        this.x.append(new StringItem((String) null, "注意：用户名仅允许4-10位的数字和字母；密码仅允许6-12位的数字和字母。"));
        Command command = new Command("返回", 2, 1);
        Command command2 = new Command("提交", 4, 0);
        Command command3 = new Command("返回游戏", 4, 1);
        this.x.addCommand(command2);
        if (bb.c) {
            this.x.addCommand(command3);
        } else {
            this.x.addCommand(command);
        }
        this.x.setCommandListener(this);
        if (this.x != null) {
            display.setCurrent(this.x);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte) 4;
    }

    private void d() {
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
    }

    public final void a(Display display) {
        this.C = new Form("修改密码");
        this.D = new TextField("账号:", "", 12, 0);
        this.E = new TextField("原密码:", "", 12, 0);
        this.F = new TextField("新密码:", "", 12, 0);
        this.C.append(this.D);
        this.C.append(this.E);
        this.C.append(this.F);
        this.C.append(new StringItem((String) null, "注意：密码仅允许6-12位的数字和字母。"));
        Command command = new Command("返回", 2, 1);
        Command command2 = new Command("确定", 4, 0);
        this.C.addCommand(command);
        this.C.addCommand(command2);
        this.C.setCommandListener(this);
        if (this.C != null) {
            display.setCurrent(this.C);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte) 15;
    }

    private void a(Display display, String str, String[] strArr, String[] strArr2) {
        e();
        String[] strArr3 = null;
        this.G = new Form(str);
        Item[] itemArr = new StringItem[strArr2.length];
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= itemArr.length) {
                break;
            }
            if (0 == 0) {
                itemArr[b2] = new StringItem((String) null, strArr2[b2]);
            } else {
                itemArr[b2] = new StringItem(strArr3[b2], strArr2[b2]);
            }
            this.G.append(itemArr[b2]);
            b = (byte) (b2 + 1);
        }
        this.G.addCommand(new Command("返回", 2, 1));
        if (str.equals("一哥哥通行证帮助") && !bb.c) {
            Command command = new Command("登录", 4, 1);
            Command command2 = new Command("注册", 4, 1);
            Command command3 = new Command("退出", 7, 1);
            this.G.addCommand(command);
            this.G.addCommand(command2);
            this.G.addCommand(command3);
        }
        this.G.setCommandListener(this);
        if (this.G != null) {
            display.setCurrent(this.G);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte) 5;
    }

    private void e() {
        if (this.G != null) {
            this.G.deleteAll();
        }
        this.G = null;
    }

    public final void a(Display display, int i2) {
        if (i2 > 200) {
            a("一次最大为200", (byte) 2);
        } else {
            if (this.H != null) {
                f();
            }
            if (this.H == null) {
                this.H = new Form("");
                this.I = new TextField("银元购买金豆数量(1-100):", String.valueOf(i2), 3, 2);
                this.J = new TextField("通行证支付密码(若无请输入登录密码):", "", 12, 65536);
                this.H.append(this.I);
                this.H.append(this.J);
                this.L = new Command("返回游戏", 7, 0);
                this.K = new Command("提交", 4, 0);
                Command command = new Command("余额查询", 4, 0);
                this.H.addCommand(this.L);
                this.H.addCommand(this.K);
                this.H.addCommand(command);
                this.H.setCommandListener(this);
            }
            display.setCurrent(this.H);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte) 7;
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

    private void e(Display display) {
        h();
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
        Command command = new Command("返回游戏", 7, 0);
        Command command2 = new Command("提交", 4, 1);
        Command command3 = new Command("余额查询", 4, 1);
        Command command4 = new Command("充值帮助", 4, 1);
        this.Q.addCommand(command);
        this.Q.addCommand(command2);
        this.Q.addCommand(command3);
        this.Q.addCommand(command4);
        this.Q.setCommandListener(this);
        if (this.Q != null) {
            display.setCurrent(this.Q);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte) 6;
    }

    private void h() {
        this.Q = null;
        this.R = null;
        this.S = this.T;
        this.U = null;
        this.V = null;
    }

    public final void b(Display display) {
        i();
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
        Command command = new Command("返回游戏", 7, 0);
        Command command2 = new Command("提交", 4, 1);
        Command command3 = new Command("充值帮助", 4, 1);
        this.Q.addCommand(command);
        this.Q.addCommand(command2);
        this.Q.addCommand(command3);
        this.Q.setCommandListener(this);
        if (this.Q != null) {
            display.setCurrent(this.Q);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte) 10;
    }

    private void i() {
        this.Q = null;
        this.R = null;
        this.S = this.T;
        this.U = null;
        this.V = null;
    }

    public final void c(Display display) {
        h();
        this.Y = new Form("余额查询");
        this.Z = new ChoiceGroup("方式:", 4, f, (Image[]) null);
        this.Y.append(this.Z);
        this.aa = new TextField("通行证:", "", 32, 0);
        this.ab = new TextField("密  码:", "", 32, 65536);
        new TextField(e, "", 4, 2);
        this.Y.append(this.aa);
        this.Y.append(this.ab);
        Command command = new Command("返回游戏", 7, 0);
        Command command2 = new Command("提交", 4, 1);
        Command command3 = new Command("充值", 4, 1);
        this.Y.addCommand(command);
        this.Y.addCommand(command2);
        this.Y.addCommand(command3);
        this.Y.setCommandListener(this);
        if (this.Y != null) {
            display.setCurrent(this.Y);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte) 9;
    }

    private void j() {
        this.Y = null;
        this.Z = null;
        this.ab = null;
        this.aa = null;
    }

    public final void commandAction(Command command, Displayable displayable) throws NumberFormatException {
        String label = command.getLabel();
        if (label == null) {
        }
        switch (this.a) {
            case 2:
                if (!label.equals("退出")) {
                    if (!label.equals("返回") || this.b != 12) {
                        if (!label.equals("返回") || this.b != 13) {
                            if (!label.equals("返回游戏")) {
                                switch (this.b) {
                                    case 1:
                                        c();
                                        a();
                                        break;
                                    case 2:
                                    case 5:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    default:
                                        if (!label.equals("返回")) {
                                            if (!label.equals("登录")) {
                                                if (!label.equals("注册")) {
                                                    if (!label.equals("短信注册") && label.equals("退出")) {
                                                        this.h.c();
                                                        break;
                                                    }
                                                } else {
                                                    a(this.h.a(), bb.c);
                                                    break;
                                                }
                                            } else {
                                                a(this.h.a(), bb.m, bb.n, 0);
                                                break;
                                            }
                                        } else if (this.b != 3) {
                                            if (this.b != 11) {
                                                if (this.b != 4) {
                                                    if (this.b != 6) {
                                                        if (this.b == 10) {
                                                            b(this.h.a());
                                                            break;
                                                        }
                                                    } else {
                                                        e(this.h.a());
                                                        break;
                                                    }
                                                } else {
                                                    a(this.h.a(), bb.c);
                                                    break;
                                                }
                                            }
                                        } else {
                                            a(this.h.a(), bb.m, bb.n, 0);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        c();
                                        if (this.b != -1) {
                                            a(this.h.a(), bb.m, bb.n, 0);
                                            break;
                                        } else {
                                            this.h.c();
                                            break;
                                        }
                                    case 4:
                                        c();
                                        if (!label.equals("登录")) {
                                            a(this.h.a(), bb.c);
                                            break;
                                        } else {
                                            a(this.h.a(), bb.m, bb.n, 2);
                                            break;
                                        }
                                    case 6:
                                    case 10:
                                        break;
                                    case 7:
                                        c();
                                        if (!label.equals("返回游戏")) {
                                            a(this.h.a(), 1);
                                            break;
                                        } else {
                                            a();
                                            break;
                                        }
                                    case 8:
                                        c();
                                        if (this.M == 7) {
                                            if (!label.equals("返回")) {
                                                a();
                                                break;
                                            } else {
                                                a(this.h.a(), 1);
                                                break;
                                            }
                                        }
                                        break;
                                    case 9:
                                        c();
                                        c(this.h.a());
                                        break;
                                    case 15:
                                        c();
                                        a(this.h.a());
                                        break;
                                }
                            } else {
                                this.h.b();
                                break;
                            }
                        } else {
                            a(this.h.a(), "游客注册 第2步: ", "创建一哥哥通行证密码");
                            break;
                        }
                    } else {
                        a(this.h.a(), bb.m, bb.n, 0);
                        break;
                    }
                } else {
                    this.h.c();
                    break;
                }
                break;
            case 3:
                String string = this.n.getString();
                String string2 = this.o.getString();
                byte bA = a(this.m);
                if (!label.equals("提交")) {
                    if (label.equals("返回")) {
                        b();
                        a();
                        break;
                    }
                } else {
                    if (bA != 0) {
                        if (bA != 1) {
                            if (bA == 2 && (string.equals("") || string.length() < 4)) {
                                a("通行证ID号输入长度错误，请重新输入", (byte) 2);
                                break;
                            }
                        } else if (string.equals("") || string.length() < 11) {
                            a("通行证请输入11位手机号码，请重新输入", (byte) 2);
                            break;
                        }
                    } else if (string.equals("") || string.length() < 4) {
                        a("通行证用户名输入错误，请重新输入", (byte) 2);
                        break;
                    }
                    if (!string2.equals("") && string2.length() >= 6) {
                        k();
                        break;
                    } else {
                        a("密码错误，请重新输入", (byte) 2);
                        break;
                    }
                }
                break;
            case 4:
                String string3 = this.y.getString();
                String string4 = this.z.getString();
                String string5 = this.A.getString();
                if (!label.equals("提交")) {
                    if (!label.equals("返回游戏")) {
                        if (label.equals("返回")) {
                            d();
                            this.h.a.a.c();
                            a();
                            break;
                        }
                    } else {
                        d();
                        a();
                        break;
                    }
                } else if (!string3.equals("") && string3.length() >= 4) {
                    if (!string4.equals("") && string4.length() >= 6) {
                        if (!string4.equals(string5)) {
                            a("您两次输入的密码不一致，请重新输入", (byte) 2);
                            break;
                        } else {
                            String string6 = this.y.getString();
                            String string7 = this.z.getString();
                            String string8 = this.A.getString();
                            this.B.getString();
                            if (!z.a(string6)) {
                                if (!z.a(string6, 4, 10)) {
                                    a("用户名只允许4～10位字母和数字！", (byte) 0);
                                    break;
                                } else if (!bj.c(string6)) {
                                    a("用户名只允许字母和数字！", (byte) 0);
                                    break;
                                } else if (!z.a(string7)) {
                                    if (!z.c(string7)) {
                                        a("密码不是数字和字母的组合", (byte) 2);
                                        break;
                                    } else if (!z.a(string7, 6, 12)) {
                                        a("密码为6-12 的数字和字母的组合形式", (byte) 2);
                                        break;
                                    } else if (!bj.c(string7)) {
                                        a("密码只允许字母和数字！", (byte) 0);
                                        break;
                                    } else {
                                        if (!(z.b(string7) && z.b(string8) && string7.trim().equals(string8.trim()))) {
                                            a("两次输入密码不一致！", (byte) 2);
                                            break;
                                        } else {
                                            StringBuffer stringBuffer = new StringBuffer();
                                            stringBuffer.append(string6);
                                            stringBuffer.append(':');
                                            stringBuffer.append(string7);
                                            a.am = string6;
                                            bb.m = string6;
                                            a.an = string7;
                                            bb.n = string7;
                                            a.ao = (byte) 0;
                                            bb.l = (byte) 0;
                                            a.ap = true;
                                            bb.k = true;
                                            w wVarA = bz.a((byte) 1, (byte) 2, stringBuffer.toString());
                                            if (wVarA != null) {
                                                this.h.a(wVarA);
                                                this.h.a.a();
                                                this.h.a.a.a("请求中...");
                                            }
                                            stringBuffer.delete(0, stringBuffer.capacity());
                                            break;
                                        }
                                    }
                                } else {
                                    a("密码不能为空", (byte) 2);
                                    break;
                                }
                            } else {
                                a("用户名不能为空！", (byte) 0);
                                break;
                            }
                        }
                    } else {
                        a("请输入6-12位的数字、字母组合密码，以确保账号安全", (byte) 2);
                        break;
                    }
                } else {
                    a("请输入4-10位的数字、字母或数字与字母组合的用户名", (byte) 2);
                    break;
                }
                break;
            case 5:
                e();
                if (!label.equals("返回")) {
                    if (!label.equals("登录")) {
                        if (!label.equals("注册")) {
                            if (!label.equals("短信注册") && label.equals("退出")) {
                                this.h.c();
                                break;
                            }
                        } else {
                            a(this.h.a(), bb.c);
                            break;
                        }
                    } else {
                        a(this.h.a(), bb.j, bb.i, 0);
                        break;
                    }
                } else if (this.b != 3) {
                    if (this.b != 11) {
                        if (this.b != 4) {
                            if (this.b != 6) {
                                if (this.b == 10) {
                                    b(this.h.a());
                                    break;
                                }
                            } else {
                                e(this.h.a());
                                break;
                            }
                        } else {
                            a(this.h.a(), bb.c);
                            break;
                        }
                    }
                } else {
                    a(this.h.a(), bb.j, bb.i, 0);
                    break;
                }
                break;
            case 6:
                if (!label.equals("提交")) {
                    if (!label.equals("余额查询")) {
                        if (!label.equals("充值帮助")) {
                            if (label.equals("返回游戏")) {
                                h();
                                a();
                                break;
                            }
                        } else {
                            f();
                            a(this.h.a(), "充值帮助", (String[]) null, bb.e);
                            break;
                        }
                    } else {
                        h();
                        c(this.h.a());
                        break;
                    }
                } else {
                    byte selectedIndex = (byte) (this.R.getSelectedIndex() + 1);
                    byte b = selectedIndex;
                    if (selectedIndex == 2) {
                        b = 3;
                    }
                    String string9 = this.S.getString();
                    String string10 = this.T.getString();
                    int i2 = Integer.parseInt(X[this.U.getSelectedIndex()].trim());
                    if (!z.a(string9)) {
                        if (!bj.b(string9)) {
                            a("充值卡序号有误！", (byte) 2);
                            break;
                        } else if (!z.a(string10)) {
                            if (!bj.b(string10)) {
                                a("充值卡密码有误！", (byte) 2);
                                break;
                            } else {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append(bb.g);
                                stringBuffer2.append(':');
                                stringBuffer2.append(bb.h);
                                stringBuffer2.append(':');
                                stringBuffer2.append((int) b);
                                stringBuffer2.append(':');
                                stringBuffer2.append(string9);
                                stringBuffer2.append(':');
                                stringBuffer2.append(string10);
                                stringBuffer2.append(':');
                                stringBuffer2.append(i2);
                                w wVarA2 = bz.a((byte) 2, (byte) 5, stringBuffer2.toString());
                                if (wVarA2 != null) {
                                    a.i.a(wVarA2);
                                    this.h.a.a();
                                    this.h.a.a.a("请求中...");
                                }
                                stringBuffer2.delete(0, stringBuffer2.capacity());
                                break;
                            }
                        } else {
                            a("您没有输入充值卡密码，请返回重新输入", (byte) 2);
                            break;
                        }
                    } else {
                        a("您没有输入卡号，请返回重新输入", (byte) 2);
                        break;
                    }
                }
                break;
            case 7:
                if (!label.equals("提交")) {
                    if (!label.equals("余额查询")) {
                        f();
                        a();
                        break;
                    } else {
                        f();
                        c(this.h.a());
                        break;
                    }
                } else {
                    String string11 = this.I.getString();
                    boolean zD = z.d(string11);
                    if (!zD) {
                        f();
                        a("金额输入错误！", (byte) 0);
                        break;
                    } else {
                        int iF = z.f(string11);
                        if ((zD && iF <= 0) || iF > 100) {
                            a("购买数量必须在1~100之间！", (byte) 0);
                            break;
                        } else {
                            Display displayA = this.h.a();
                            if (this.N != null) {
                                g();
                            }
                            if (this.N == null) {
                                this.N = new Form("");
                                this.N.append(new StringItem("", "确认支付？"));
                                this.O = new Command("提交", 4, 0);
                                this.P = new Command("返回", 2, 0);
                                this.N.addCommand(this.O);
                                this.N.addCommand(this.P);
                                this.N.setCommandListener(this);
                            }
                            displayA.setCurrent(this.N);
                            this.M = this.a;
                            this.a = (byte) 8;
                            break;
                        }
                    }
                }
                break;
            case 8:
                if (this.M == 7) {
                    if (!label.equals("提交")) {
                        f();
                        g();
                        a(this.h.a(), 1);
                        break;
                    } else {
                        String string12 = this.I.getString();
                        String string13 = this.J.getString();
                        if (z.a(string12)) {
                            a("购买数量不能为空", (byte) 0);
                        } else if (!bj.b(string12)) {
                            a("购买数量必须为数字", (byte) 0);
                        } else if (z.f(string12) <= 0 || z.f(string12) > 100) {
                            a("购买数量必须在1~100之间！", (byte) 0);
                        } else {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append(bb.g);
                            stringBuffer3.append(':');
                            stringBuffer3.append(bb.h);
                            stringBuffer3.append(':');
                            stringBuffer3.append(string12);
                            stringBuffer3.append(':');
                            stringBuffer3.append(string13);
                            w wVarA3 = bz.a((byte) 2, (byte) 6, stringBuffer3.toString());
                            if (wVarA3 != null) {
                                a.i.a(wVarA3);
                                this.h.a.a();
                                this.h.a.a.a("请求中...");
                            }
                            stringBuffer3.delete(0, stringBuffer3.capacity());
                        }
                        g();
                        f();
                        break;
                    }
                }
                break;
            case 9:
                if (!label.equals("提交")) {
                    if (!label.equals("充值")) {
                        if (label.equals("返回游戏")) {
                            j();
                            a();
                            break;
                        }
                    } else {
                        j();
                        e(this.h.a());
                        break;
                    }
                } else {
                    int i3 = this.Z.getSelectedIndex() == 0 ? 1 : this.Z.getSelectedIndex() == 1 ? 2 : 3;
                    String string14 = this.aa.getString();
                    String string15 = this.ab.getString();
                    if (!z.a(string14)) {
                        if (i3 == 1 && !z.c(string14)) {
                            a("用户名只能为数字和字母的组合形式", (byte) 2);
                            break;
                        } else if (i3 == 1 && !z.a(string14, 4, 10)) {
                            a("用户名为4-10 的数字和字母的组合", (byte) 2);
                            break;
                        } else if (i3 == 2 && !z.e(string14)) {
                            a("手机号不合符规范，应为11位数字", (byte) 2);
                            break;
                        } else if (i3 == 3 && !z.d(string14)) {
                            a("ID 应为数字", (byte) 2);
                            break;
                        } else if (!z.a(string15)) {
                            if (!z.c(string15)) {
                                a("密码只能为数字和字母的组合", (byte) 0);
                                break;
                            } else if (!z.a(string15, 6, 12)) {
                                a("密码须为6～12位的字母和数字", (byte) 0);
                                break;
                            } else {
                                StringBuffer stringBuffer4 = new StringBuffer();
                                stringBuffer4.append(bb.g);
                                stringBuffer4.append(':');
                                stringBuffer4.append(bb.h);
                                stringBuffer4.append(':');
                                stringBuffer4.append(i3);
                                stringBuffer4.append(':');
                                stringBuffer4.append(string14);
                                stringBuffer4.append(':');
                                stringBuffer4.append(string15);
                                w wVarA4 = bz.a((byte) 2, (byte) 7, stringBuffer4.toString());
                                if (wVarA4 != null) {
                                    a.i.a(wVarA4);
                                    this.h.a.a();
                                    this.h.a.a.a("请求中...");
                                }
                                stringBuffer4.delete(0, stringBuffer4.capacity());
                                break;
                            }
                        } else {
                            a("密码不能为空", (byte) 2);
                            break;
                        }
                    } else {
                        a("帐号不能为空！", (byte) 2);
                        break;
                    }
                }
                break;
            case 10:
                if (!label.equals("提交")) {
                    if (!label.equals("充值帮助")) {
                        if (label.equals("返回游戏")) {
                            i();
                            a();
                            break;
                        }
                    } else {
                        f();
                        a(this.h.a(), "充值帮助", (String[]) null, bb.f);
                        break;
                    }
                } else {
                    byte selectedIndex2 = (byte) (this.R.getSelectedIndex() + 1);
                    byte b2 = selectedIndex2;
                    if (selectedIndex2 == 2) {
                        b2 = 3;
                    }
                    String string16 = this.S.getString();
                    String string17 = this.T.getString();
                    int iF2 = z.f(X[this.U.getSelectedIndex()].trim());
                    this.V.getString();
                    if (!z.a(string16)) {
                        if (!bj.b(string16)) {
                            a("充值卡序号有误！", (byte) 2);
                            break;
                        } else if (!z.a(string17)) {
                            if (!bj.b(string17)) {
                                a("充值卡密码有误！", (byte) 2);
                                break;
                            } else {
                                StringBuffer stringBuffer5 = new StringBuffer();
                                stringBuffer5.append(bb.g);
                                stringBuffer5.append(':');
                                stringBuffer5.append(bb.h);
                                stringBuffer5.append(':');
                                stringBuffer5.append((int) b2);
                                stringBuffer5.append(':');
                                stringBuffer5.append(string16);
                                stringBuffer5.append(':');
                                stringBuffer5.append(string17);
                                stringBuffer5.append(':');
                                stringBuffer5.append(iF2);
                                w wVarA5 = t.x ? bz.a((byte) 3, (byte) 8, stringBuffer5.toString()) : bz.a((byte) 2, (byte) 8, stringBuffer5.toString());
                                if (wVarA5 != null) {
                                    a.i.a(wVarA5);
                                    this.h.a.a();
                                    this.h.a.a.a("请求中...");
                                }
                                stringBuffer5.delete(0, stringBuffer5.capacity());
                                break;
                            }
                        } else {
                            a("您没有输入充值卡密码，请返回重新输入", (byte) 2);
                            break;
                        }
                    } else {
                        a("您没有输入卡号，请返回重新输入", (byte) 2);
                        break;
                    }
                }
                break;
            case 11:
                break;
            case 12:
                if (!label.equals("返回")) {
                    if (!label.equals("提交")) {
                        if (label.equals("刷新")) {
                            this.q = null;
                            this.r = null;
                            this.s = null;
                            d(this.h.a());
                            break;
                        }
                    } else {
                        k();
                        break;
                    }
                } else {
                    b();
                    a(this.h.a(), bb.m, bb.n, 0);
                    break;
                }
                break;
            case 13:
                if (label.equals("提交")) {
                    h hVar = this.h;
                    if (hVar.a.a.j == 1) {
                        hVar.a.a.j = hVar.a.a.k;
                        break;
                    }
                }
                break;
            case 14:
            default:
                if (!label.equals("返回")) {
                    if (!label.equals("登录")) {
                        if (!label.equals("注册")) {
                            if (!label.equals("短信注册") && label.equals("退出")) {
                                this.h.c();
                                break;
                            }
                        } else {
                            a(this.h.a(), bb.c);
                            break;
                        }
                    } else {
                        a(this.h.a(), bb.m, bb.n, 0);
                        break;
                    }
                } else if (this.b != 3) {
                    if (this.b != 12) {
                        if (this.b != 11) {
                            if (this.b != 4) {
                                if (this.b != 6) {
                                    if (this.b == 10) {
                                        b(this.h.a());
                                        break;
                                    }
                                } else {
                                    e(this.h.a());
                                    break;
                                }
                            } else {
                                a(this.h.a(), bb.c);
                                break;
                            }
                        }
                    } else {
                        d(this.h.a());
                        break;
                    }
                } else {
                    a(this.h.a(), bb.m, bb.n, 0);
                    break;
                }
                break;
            case 15:
                if (!label.equals("确定")) {
                    if (label.equals("返回")) {
                        this.C = null;
                        this.E = null;
                        this.F = null;
                        this.D = null;
                        a();
                        break;
                    }
                } else {
                    String string18 = this.D.getString();
                    String string19 = this.E.getString();
                    String string20 = this.F.getString();
                    if (!z.a(string19)) {
                        if (!z.a(string20)) {
                            if (!z.c(string20)) {
                                a("新密码须为数字和字母的组合", (byte) 0);
                                break;
                            } else if (!z.a(string20, 6, 12)) {
                                a("新密码须为6-12的数字和字母的组合形式", (byte) 0);
                                break;
                            } else if (!bj.c(string20)) {
                                a("新密码只允许字母和数字", (byte) 0);
                                break;
                            } else {
                                int i4 = bb.l == 2 ? 3 : bb.l == 1 ? 2 : bb.l == 0 ? 1 : 0;
                                StringBuffer stringBuffer6 = new StringBuffer();
                                stringBuffer6.append(i4);
                                stringBuffer6.append(':');
                                stringBuffer6.append(string18);
                                stringBuffer6.append(':');
                                stringBuffer6.append(string19);
                                stringBuffer6.append(':');
                                stringBuffer6.append(string20);
                                w wVarA6 = bz.a((byte) 1, (byte) 4, stringBuffer6.toString());
                                if (wVarA6 != null) {
                                    this.h.a(wVarA6);
                                    this.h.a.a();
                                    this.h.a.a.a("请求中...");
                                }
                                stringBuffer6.delete(0, stringBuffer6.capacity());
                                break;
                            }
                        } else {
                            a("新密码不能为空", (byte) 0);
                            break;
                        }
                    } else {
                        a("旧密码不能为空", (byte) 0);
                        break;
                    }
                }
                break;
        }
    }

    private void k() {
        String string = this.n.getString();
        String string2 = this.o.getString();
        byte bA = a(this.m);
        if (z.a(string)) {
            bb.m = string;
            a(ac, (byte) 0);
            return;
        }
        if (a(this.m) == 0 && !z.a(string, 4, 12)) {
            bb.m = string;
            a(ac, (byte) 0);
            return;
        }
        if (a(this.m) == 1 && !z.e(string.trim())) {
            bb.m = string;
            a(ad, (byte) 0);
            return;
        }
        if (a(this.m) == 2 && (!z.d(string.trim()) || !z.a(string, 4, 12))) {
            bb.m = string;
            a(ae, (byte) 0);
            return;
        }
        if (z.a(string2)) {
            bb.m = string;
            a(af, (byte) 0);
            return;
        }
        if (a(this.m) == 2 || a(this.m) == 1 || a(this.m) == 0) {
            bb.n = string2;
            byte b = a(this.m) == 2 ? (byte) 3 : a(this.m) == 1 ? (byte) 2 : a(this.m) == 0 ? (byte) 1 : (byte) 0;
            byte b2 = b;
            bb.l = b;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append((int) b2);
            stringBuffer.append(':');
            stringBuffer.append(string);
            stringBuffer.append(':');
            stringBuffer.append(string2);
            w wVarA = bz.a((byte) 1, (byte) 1, stringBuffer.toString());
            if (wVarA != null) {
                a.am = string;
                bb.m = string;
                a.an = string2;
                bb.n = string2;
                a.ao = bA;
                bb.l = bA;
                boolean zIsSelected = this.p.isSelected(0);
                a.ap = zIsSelected;
                bb.k = zIsSelected;
                bb.b();
                this.h.a(wVarA);
                this.h.a.a();
                this.h.a.a.a("请求中...");
            }
            stringBuffer.delete(0, stringBuffer.capacity());
        }
    }

    private static byte a(ChoiceGroup choiceGroup) {
        if (choiceGroup == null) {
            return (byte) 0;
        }
        return (byte) choiceGroup.getSelectedIndex();
    }
}

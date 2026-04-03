package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.IOException;
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

/* renamed from: bg */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0034bg implements CommandListener {

    /* renamed from: G */
    private Form f624G;

    /* renamed from: M */
    private byte f630M;

    /* renamed from: Q */
    private Form f634Q;

    /* renamed from: R */
    private ChoiceGroup f635R;

    /* renamed from: S */
    private TextField f636S;

    /* renamed from: T */
    private TextField f637T;

    /* renamed from: U */
    private ChoiceGroup f638U;

    /* renamed from: V */
    private TextField f639V;

    /* renamed from: Y */
    private Form f640Y;

    /* renamed from: Z */
    private ChoiceGroup f641Z;

    /* renamed from: a */
    private byte f642a;

    /* renamed from: aa */
    private TextField f643aa;

    /* renamed from: ab */
    private TextField f644ab;

    /* renamed from: b */
    private byte f645b;

    /* renamed from: h */
    private C0076h f646h;

    /* renamed from: k */
    private StringItem f648k;

    /* renamed from: m */
    private ChoiceGroup f650m;

    /* renamed from: p */
    private ChoiceGroup f653p;

    /* renamed from: c */
    private static String f612c = "通行证:";

    /* renamed from: d */
    private static String f613d = "密    码:";

    /* renamed from: e */
    private static String f614e = "验证码:";

    /* renamed from: f */
    private static String[] f615f = {"用户名", "手机号", "ID"};

    /* renamed from: g */
    private static String[] f616g = {"保存密码"};

    /* renamed from: i */
    private static String[] f617i = {"错误", "警告", "温馨提示", "错误", "温馨提示"};

    /* renamed from: W */
    private static final String[] f606W = {"神州行"};

    /* renamed from: X */
    private static final String[] f607X = {"30", "50", "100"};

    /* renamed from: ac */
    private static String f608ac = "通行证用户名输入错误，请重新输入!";

    /* renamed from: ad */
    private static String f609ad = "通行证请输入11位手机号码，请重新输入!";

    /* renamed from: ae */
    private static String f610ae = "通行证ID号输入长度错误，请重新输入";

    /* renamed from: af */
    private static String f611af = "密码错误，请重新输入";

    /* renamed from: j */
    private Form f647j = null;

    /* renamed from: l */
    private Form f649l = null;

    /* renamed from: n */
    private TextField f651n = null;

    /* renamed from: o */
    private TextField f652o = null;

    /* renamed from: q */
    private Form f654q = null;

    /* renamed from: r */
    private TextField f655r = null;

    /* renamed from: s */
    private ImageItem f656s = null;

    /* renamed from: t */
    private Form f657t = null;

    /* renamed from: u */
    private TextField f658u = null;

    /* renamed from: v */
    private Command f659v = null;

    /* renamed from: w */
    private StringItem f660w = null;

    /* renamed from: x */
    private Form f661x = null;

    /* renamed from: y */
    private TextField f662y = null;

    /* renamed from: z */
    private TextField f663z = null;

    /* renamed from: A */
    private TextField f618A = null;

    /* renamed from: B */
    private TextField f619B = null;

    /* renamed from: C */
    private Form f620C = null;

    /* renamed from: D */
    private TextField f621D = null;

    /* renamed from: E */
    private TextField f622E = null;

    /* renamed from: F */
    private TextField f623F = null;

    /* renamed from: H */
    private Form f625H = null;

    /* renamed from: I */
    private TextField f626I = null;

    /* renamed from: J */
    private TextField f627J = null;

    /* renamed from: K */
    private Command f628K = null;

    /* renamed from: L */
    private Command f629L = null;

    /* renamed from: N */
    private Form f631N = null;

    /* renamed from: O */
    private Command f632O = null;

    /* renamed from: P */
    private Command f633P = null;

    public C0034bg(C0076h c0076h) {
        this.f642a = (byte) -1;
        this.f645b = (byte) 0;
        this.f646h = c0076h;
        this.f642a = (byte) -1;
        this.f645b = (byte) -1;
    }

    /* renamed from: a */
    private static byte m652a(ChoiceGroup choiceGroup) {
        if (choiceGroup == null) {
            return (byte) 0;
        }
        return (byte) choiceGroup.getSelectedIndex();
    }

    /* renamed from: a */
    private void m653a(String str, byte b) {
        if (b == 3) {
            m654a(str, b, new Command("退出", 7, 0), (Command[]) null);
        } else if (b == 4) {
            m654a(str, b, (Command) null, (Command[]) null);
        } else {
            m654a(str, b, new Command("返回", 2, 0), (Command[]) null);
        }
    }

    /* renamed from: a */
    private void m654a(String str, byte b, Command command, Command[] commandArr) {
        if (this.f647j != null) {
            m656c();
        }
        this.f647j = new Form(f617i[b]);
        this.f648k = new StringItem((String) null, str);
        this.f647j.append(this.f648k);
        if (command != null) {
            this.f647j.addCommand(command);
        }
        this.f647j.setCommandListener(this);
        this.f646h.m1558a().setCurrent(this.f647j);
        if (this.f642a != 2) {
            this.f645b = this.f642a;
        }
        this.f642a = (byte) 2;
    }

    /* renamed from: a */
    private void m655a(Display display, String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = null;
        m659e();
        this.f624G = new Form(str);
        Item[] itemArr = new StringItem[strArr2.length];
        for (byte b = 0; b < itemArr.length; b = (byte) (b + 1)) {
            if (0 == 0) {
                itemArr[b] = new StringItem((String) null, strArr2[b]);
            } else {
                itemArr[b] = new StringItem(strArr3[b], strArr2[b]);
            }
            this.f624G.append(itemArr[b]);
        }
        this.f624G.addCommand(new Command("返回", 2, 1));
        if (str.equals("一哥哥通行证帮助") && !C0029bb.f549c) {
            Command command = new Command("登录", 4, 1);
            Command command2 = new Command("注册", 4, 1);
            Command command3 = new Command("退出", 7, 1);
            this.f624G.addCommand(command);
            this.f624G.addCommand(command2);
            this.f624G.addCommand(command3);
        }
        this.f624G.setCommandListener(this);
        if (this.f624G != null) {
            display.setCurrent(this.f624G);
        }
        if (this.f642a != 2) {
            this.f645b = this.f642a;
        }
        this.f642a = (byte) 5;
    }

    /* renamed from: c */
    private void m656c() {
        this.f647j = null;
        this.f648k = null;
    }

    /* renamed from: d */
    private void m657d() {
        this.f661x = null;
        this.f662y = null;
        this.f663z = null;
        this.f618A = null;
        this.f619B = null;
    }

    /* renamed from: d */
    private void m658d(Display display) {
        this.f654q = new Form("登陆验证码");
        this.f654q.append(new StringItem((String) null, "为了您的账号安全，请输入下面的验证码："));
        this.f655r = new TextField("", "", 4, 2);
        this.f656s = new ImageItem("", (Image) null, 1, "");
        this.f654q.append(this.f655r);
        this.f654q.append(this.f656s);
        Command command = new Command("返回", 7, 0);
        Command command2 = new Command("提交", 4, 1);
        Command command3 = new Command("刷新", 4, 1);
        this.f654q.addCommand(command);
        this.f654q.addCommand(command2);
        this.f654q.addCommand(command3);
        this.f654q.setCommandListener(this);
        if (this.f654q != null) {
            display.setCurrent(this.f654q);
        }
        if (this.f642a != 2) {
            this.f645b = this.f642a;
        }
        this.f642a = (byte) 12;
    }

    /* renamed from: e */
    private void m659e() {
        if (this.f624G != null) {
            this.f624G.deleteAll();
        }
        this.f624G = null;
    }

    /* renamed from: e */
    private void m660e(Display display) {
        m663h();
        this.f634Q = new Form("充值中心");
        this.f634Q.append("1元=1银元");
        this.f635R = new ChoiceGroup("充值卡:", 4, f606W, (Image[]) null);
        this.f634Q.append(this.f635R);
        this.f636S = new TextField("充值卡序号:", "", 32, 2);
        this.f637T = new TextField("充值卡密码:", "", 32, 2);
        this.f638U = new ChoiceGroup("充值卡面值:", 4, f607X, (Image[]) null);
        this.f638U.setSelectedIndex(1, true);
        this.f639V = new TextField(f614e, "", 4, 2);
        this.f634Q.append(this.f636S);
        this.f634Q.append(this.f637T);
        this.f634Q.append(this.f638U);
        Command command = new Command("返回游戏", 7, 0);
        Command command2 = new Command("提交", 4, 1);
        Command command3 = new Command("余额查询", 4, 1);
        Command command4 = new Command("充值帮助", 4, 1);
        this.f634Q.addCommand(command);
        this.f634Q.addCommand(command2);
        this.f634Q.addCommand(command3);
        this.f634Q.addCommand(command4);
        this.f634Q.setCommandListener(this);
        if (this.f634Q != null) {
            display.setCurrent(this.f634Q);
        }
        if (this.f642a != 2) {
            this.f645b = this.f642a;
        }
        this.f642a = (byte) 6;
    }

    /* renamed from: f */
    private void m661f() {
        this.f625H = null;
        this.f626I = null;
        this.f627J = null;
    }

    /* renamed from: g */
    private void m662g() {
        this.f631N = null;
        this.f633P = null;
        this.f632O = null;
    }

    /* renamed from: h */
    private void m663h() {
        this.f634Q = null;
        this.f635R = null;
        this.f636S = this.f637T;
        this.f638U = null;
        this.f639V = null;
    }

    /* renamed from: i */
    private void m664i() {
        this.f634Q = null;
        this.f635R = null;
        this.f636S = this.f637T;
        this.f638U = null;
        this.f639V = null;
    }

    /* renamed from: j */
    private void m665j() {
        this.f640Y = null;
        this.f641Z = null;
        this.f644ab = null;
        this.f643aa = null;
    }

    /* renamed from: k */
    private void m666k(){
        byte b = 2;
        String string = this.f651n.getString();
        String string2 = this.f652o.getString();
        byte bM652a = m652a(this.f650m);
        if (C0094z.m1716a(string)) {
            C0029bb.f559m = string;
            m653a(f608ac, (byte) 0);
            return;
        }
        if (m652a(this.f650m) == 0 && !C0094z.m1717a(string, 4, 12)) {
            C0029bb.f559m = string;
            m653a(f608ac, (byte) 0);
            return;
        }
        if (m652a(this.f650m) == 1 && !C0094z.m1722e(string.trim())) {
            C0029bb.f559m = string;
            m653a(f609ad, (byte) 0);
            return;
        }
        if (m652a(this.f650m) == 2 && (!C0094z.m1721d(string.trim()) || !C0094z.m1717a(string, 4, 12))) {
            C0029bb.f559m = string;
            m653a(f610ae, (byte) 0);
            return;
        }
        if (C0094z.m1716a(string2)) {
            C0029bb.f559m = string;
            m653a(f611af, (byte) 0);
            return;
        }
        if (m652a(this.f650m) == 2 || m652a(this.f650m) == 1 || m652a(this.f650m) == 0) {
            C0029bb.f560n = string2;
            if (m652a(this.f650m) == 2) {
                b = 3;
            } else if (m652a(this.f650m) != 1) {
                b = m652a(this.f650m) == 0 ? (byte) 1 : (byte) 0;
            }
            C0029bb.f558l = b;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append((int) b);
            stringBuffer.append(':');
            stringBuffer.append(string);
            stringBuffer.append(':');
            stringBuffer.append(string2);
            C0091w c0091wM1027a = C0053bz.m1027a((byte) 1, (byte) 1, stringBuffer.toString());
            if (c0091wM1027a != null) {
                RunnableC0066a.f2104am = string;
                C0029bb.f559m = string;
                RunnableC0066a.f2105an = string2;
                C0029bb.f560n = string2;
                RunnableC0066a.f2106ao = bM652a;
                C0029bb.f558l = bM652a;
                boolean zIsSelected = this.f653p.isSelected(0);
                RunnableC0066a.f2107ap = zIsSelected;
                C0029bb.f557k = zIsSelected;
                C0029bb.m625b();
                this.f646h.m1561a(c0091wM1027a);
                this.f646h.f2272a.m1377a();
                this.f646h.f2272a.f2060a.m1434a("请求中...");
            }
            stringBuffer.delete(0, stringBuffer.capacity());
        }
    }

    /* renamed from: a */
    public final void m667a() {
        if (this.f642a != 2) {
            this.f645b = this.f642a;
        }
        this.f642a = (byte) 1;
        this.f646h.m1563b();
    }

    /* renamed from: a */
    public final void m668a(Display display) {
        this.f620C = new Form("修改密码");
        this.f621D = new TextField("账号:", "", 12, 0);
        this.f622E = new TextField("原密码:", "", 12, 0);
        this.f623F = new TextField("新密码:", "", 12, 0);
        this.f620C.append(this.f621D);
        this.f620C.append(this.f622E);
        this.f620C.append(this.f623F);
        this.f620C.append(new StringItem((String) null, "注意：密码仅允许6-12位的数字和字母。"));
        Command command = new Command("返回", 2, 1);
        Command command2 = new Command("确定", 4, 0);
        this.f620C.addCommand(command);
        this.f620C.addCommand(command2);
        this.f620C.setCommandListener(this);
        if (this.f620C != null) {
            display.setCurrent(this.f620C);
        }
        if (this.f642a != 2) {
            this.f645b = this.f642a;
        }
        this.f642a = (byte) 15;
    }

    /* renamed from: a */
    public final void m669a(Display display, int i) {
        if (i > 200) {
            m653a("一次最大为200", (byte) 2);
        } else {
            if (this.f625H != null) {
                m661f();
            }
            if (this.f625H == null) {
                this.f625H = new Form("");
                this.f626I = new TextField("银元购买金豆数量(1-100):", String.valueOf(i), 3, 2);
                this.f627J = new TextField("通行证支付密码(若无请输入登录密码):", "", 12, 65536);
                this.f625H.append(this.f626I);
                this.f625H.append(this.f627J);
                this.f629L = new Command("返回游戏", 7, 0);
                this.f628K = new Command("提交", 4, 0);
                Command command = new Command("余额查询", 4, 0);
                this.f625H.addCommand(this.f629L);
                this.f625H.addCommand(this.f628K);
                this.f625H.addCommand(command);
                this.f625H.setCommandListener(this);
            }
            display.setCurrent(this.f625H);
        }
        if (this.f642a != 2) {
            this.f645b = this.f642a;
        }
        this.f642a = (byte) 7;
    }

    /* renamed from: a */
    public final void m670a(Display display, String str, String str2) {
        if (this.f657t != null) {
            this.f657t.deleteAll();
        }
        this.f658u = null;
        this.f659v = null;
        this.f660w = null;
        this.f657t = null;
        if (str != null) {
            this.f660w = new StringItem(str, str2);
        }
        this.f657t = new Form("一哥哥通行证密码");
        this.f658u = new TextField("通行证密码", (String) null, 12, 0);
        this.f659v = new Command("提交", 2, 1);
        this.f657t.addCommand(this.f659v);
        this.f657t.append(this.f658u);
        if (str != null) {
            this.f657t.append(this.f660w);
        }
        this.f657t.setCommandListener(this);
        display.setCurrent(this.f657t);
        this.f642a = (byte) 13;
    }

    /* renamed from: a */
    public final void m671a(Display display, String str, String str2, int i) {
        if (this.f649l != null) {
            m673b();
        }
        this.f649l = new Form("登录一哥哥通行证");
        this.f650m = new ChoiceGroup("方式:", 4, f615f, (Image[]) null);
        this.f650m.setSelectedIndex(RunnableC0066a.f2106ao, true);
        this.f649l.append(this.f650m);
        this.f651n = new TextField(f612c, str, 12, 0);
        if (i == 0) {
            String str3 = f613d;
            if (!RunnableC0066a.f2107ap) {
                str2 = null;
            }
            this.f652o = new TextField(str3, str2, 12, 0);
        } else if (i == 3) {
            this.f652o = new TextField(f613d, str2, 12, 0);
        } else {
            this.f652o = new TextField(f613d, str2, 12, 0);
        }
        this.f649l.append(this.f651n);
        this.f649l.append(this.f652o);
        this.f653p = new ChoiceGroup((String) null, 2, f616g, (Image[]) null);
        this.f653p.setSelectedFlags(new boolean[]{RunnableC0066a.f2107ap});
        this.f649l.append(this.f653p);
        Command command = new Command("提交", 4, 0);
        Command command2 = new Command("返回", 2, 1);
        this.f649l.addCommand(command);
        this.f649l.addCommand(command2);
        this.f649l.setCommandListener(this);
        if (C0029bb.f557k) {
            this.f653p.setSelectedIndex(0, true);
        }
        if (this.f649l != null) {
            display.setCurrent(this.f649l);
        }
        if (this.f642a != 2) {
            this.f645b = this.f642a;
        }
        this.f642a = (byte) 3;
    }

    /* renamed from: a */
    public final void m672a(Display display, boolean z) {
        C0029bb.f549c = z;
        if (this.f661x != null) {
            m657d();
        }
        this.f661x = new Form(z ? "请修改您的帐号信息" : "注册一哥哥通行证");
        this.f662y = new TextField("用  户  名:", "", 12, 0);
        this.f663z = new TextField("密        码:", "", 12, 65536);
        this.f618A = new TextField("确认密码:", "", 12, 65536);
        this.f619B = new TextField("验  证  码:", "", 4, 2);
        this.f661x.append(this.f662y);
        this.f661x.append(this.f663z);
        this.f661x.append(this.f618A);
        this.f661x.append(new StringItem((String) null, "注意：用户名仅允许4-10位的数字和字母；密码仅允许6-12位的数字和字母。"));
        Command command = new Command("返回", 2, 1);
        Command command2 = new Command("提交", 4, 0);
        Command command3 = new Command("返回游戏", 4, 1);
        this.f661x.addCommand(command2);
        if (C0029bb.f549c) {
            this.f661x.addCommand(command3);
        } else {
            this.f661x.addCommand(command);
        }
        this.f661x.setCommandListener(this);
        if (this.f661x != null) {
            display.setCurrent(this.f661x);
        }
        if (this.f642a != 2) {
            this.f645b = this.f642a;
        }
        this.f642a = (byte) 4;
    }

    /* renamed from: b */
    public final void m673b() {
        this.f653p = null;
        this.f650m = null;
        this.f649l = null;
        this.f651n = null;
        this.f652o = null;
    }

    /* renamed from: b */
    public final void m674b(Display display) {
        m664i();
        this.f634Q = new Form("充值中心");
        this.f634Q.append("1元=1金豆");
        this.f635R = new ChoiceGroup("充值卡:", 4, f606W, (Image[]) null);
        this.f634Q.append(this.f635R);
        this.f636S = new TextField("充值卡序号:", "", 32, 2);
        this.f637T = new TextField("充值卡密码:", "", 32, 2);
        this.f638U = new ChoiceGroup("充值卡面值:", 4, f607X, (Image[]) null);
        this.f638U.setSelectedIndex(1, true);
        this.f639V = new TextField(f614e, "", 4, 2);
        this.f634Q.append(this.f636S);
        this.f634Q.append(this.f637T);
        this.f634Q.append(this.f638U);
        Command command = new Command("返回游戏", 7, 0);
        Command command2 = new Command("提交", 4, 1);
        Command command3 = new Command("充值帮助", 4, 1);
        this.f634Q.addCommand(command);
        this.f634Q.addCommand(command2);
        this.f634Q.addCommand(command3);
        this.f634Q.setCommandListener(this);
        if (this.f634Q != null) {
            display.setCurrent(this.f634Q);
        }
        if (this.f642a != 2) {
            this.f645b = this.f642a;
        }
        this.f642a = (byte) 10;
    }

    /* renamed from: c */
    public final void m675c(Display display) {
        m663h();
        this.f640Y = new Form("余额查询");
        this.f641Z = new ChoiceGroup("方式:", 4, f615f, (Image[]) null);
        this.f640Y.append(this.f641Z);
        this.f643aa = new TextField("通行证:", "", 32, 0);
        this.f644ab = new TextField("密  码:", "", 32, 65536);
        new TextField(f614e, "", 4, 2);
        this.f640Y.append(this.f643aa);
        this.f640Y.append(this.f644ab);
        Command command = new Command("返回游戏", 7, 0);
        Command command2 = new Command("提交", 4, 1);
        Command command3 = new Command("充值", 4, 1);
        this.f640Y.addCommand(command);
        this.f640Y.addCommand(command2);
        this.f640Y.addCommand(command3);
        this.f640Y.setCommandListener(this);
        if (this.f640Y != null) {
            display.setCurrent(this.f640Y);
        }
        if (this.f642a != 2) {
            this.f645b = this.f642a;
        }
        this.f642a = (byte) 9;
    }

    public final void commandAction(Command command, Displayable displayable) {
        int i = 2;
        String label = command.getLabel();
        if (label == null) {
        }
        switch (this.f642a) {
            case 2:
                if (!label.equals("退出")) {
                    if (!label.equals("返回") || this.f645b != 12) {
                        if (!label.equals("返回") || this.f645b != 13) {
                            if (!label.equals("返回游戏")) {
                                switch (this.f645b) {
                                    case 1:
                                        m656c();
                                        m667a();
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
                                                        this.f646h.m1564c();
                                                        break;
                                                    }
                                                } else {
                                                    m672a(this.f646h.m1558a(), C0029bb.f549c);
                                                    break;
                                                }
                                            } else {
                                                m671a(this.f646h.m1558a(), C0029bb.f559m, C0029bb.f560n, 0);
                                                break;
                                            }
                                        } else if (this.f645b != 3) {
                                            if (this.f645b != 11) {
                                                if (this.f645b != 4) {
                                                    if (this.f645b != 6) {
                                                        if (this.f645b == 10) {
                                                            m674b(this.f646h.m1558a());
                                                            break;
                                                        }
                                                    } else {
                                                        m660e(this.f646h.m1558a());
                                                        break;
                                                    }
                                                } else {
                                                    m672a(this.f646h.m1558a(), C0029bb.f549c);
                                                    break;
                                                }
                                            }
                                        } else {
                                            m671a(this.f646h.m1558a(), C0029bb.f559m, C0029bb.f560n, 0);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        m656c();
                                        if (this.f645b != -1) {
                                            m671a(this.f646h.m1558a(), C0029bb.f559m, C0029bb.f560n, 0);
                                            break;
                                        } else {
                                            this.f646h.m1564c();
                                            break;
                                        }
                                    case 4:
                                        m656c();
                                        if (!label.equals("登录")) {
                                            m672a(this.f646h.m1558a(), C0029bb.f549c);
                                            break;
                                        } else {
                                            m671a(this.f646h.m1558a(), C0029bb.f559m, C0029bb.f560n, 2);
                                            break;
                                        }
                                    case 6:
                                    case 10:
                                        break;
                                    case 7:
                                        m656c();
                                        if (!label.equals("返回游戏")) {
                                            m669a(this.f646h.m1558a(), 1);
                                            break;
                                        } else {
                                            m667a();
                                            break;
                                        }
                                    case 8:
                                        m656c();
                                        if (this.f630M == 7) {
                                            if (!label.equals("返回")) {
                                                m667a();
                                                break;
                                            } else {
                                                m669a(this.f646h.m1558a(), 1);
                                                break;
                                            }
                                        }
                                        break;
                                    case 9:
                                        m656c();
                                        m675c(this.f646h.m1558a());
                                        break;
                                    case 15:
                                        m656c();
                                        m668a(this.f646h.m1558a());
                                        break;
                                }
                            } else {
                                this.f646h.m1563b();
                                break;
                            }
                        } else {
                            m670a(this.f646h.m1558a(), "游客注册 第2步: ", "创建一哥哥通行证密码");
                            break;
                        }
                    } else {
                        m671a(this.f646h.m1558a(), C0029bb.f559m, C0029bb.f560n, 0);
                        break;
                    }
                } else {
                    this.f646h.m1564c();
                    break;
                }
                break;
            case 3:
                String string = this.f651n.getString();
                String string2 = this.f652o.getString();
                byte bM652a = m652a(this.f650m);
                if (!label.equals("提交")) {
                    if (label.equals("返回")) {
                        m673b();
                        m667a();
                        break;
                    }
                } else {
                    if (bM652a != 0) {
                        if (bM652a != 1) {
                            if (bM652a == 2 && (string.equals("") || string.length() < 4)) {
                                m653a("通行证ID号输入长度错误，请重新输入", (byte) 2);
                                break;
                            }
                        } else if (string.equals("") || string.length() < 11) {
                            m653a("通行证请输入11位手机号码，请重新输入", (byte) 2);
                            break;
                        }
                    } else if (string.equals("") || string.length() < 4) {
                        m653a("通行证用户名输入错误，请重新输入", (byte) 2);
                        break;
                    }
                    if (!string2.equals("") && string2.length() >= 6) {
                        m666k();
                        break;
                    } else {
                        m653a("密码错误，请重新输入", (byte) 2);
                        break;
                    }
                }
                break;
            case 4:
                String string3 = this.f662y.getString();
                String string4 = this.f663z.getString();
                String string5 = this.f618A.getString();
                if (!label.equals("提交")) {
                    if (!label.equals("返回游戏")) {
                        if (label.equals("返回")) {
                            m657d();
                            this.f646h.f2272a.f2060a.m1444c();
                            m667a();
                            break;
                        }
                    } else {
                        m657d();
                        m667a();
                        break;
                    }
                } else if (!string3.equals("") && string3.length() >= 4) {
                    if (!string4.equals("") && string4.length() >= 6) {
                        if (!string4.equals(string5)) {
                            m653a("您两次输入的密码不一致，请重新输入", (byte) 2);
                            break;
                        } else {
                            String string6 = this.f662y.getString();
                            String string7 = this.f663z.getString();
                            String string8 = this.f618A.getString();
                            this.f619B.getString();
                            if (!C0094z.m1716a(string6)) {
                                if (!C0094z.m1717a(string6, 4, 10)) {
                                    m653a("用户名只允许4～10位字母和数字！", (byte) 0);
                                    break;
                                } else if (!C0037bj.m686c(string6)) {
                                    m653a("用户名只允许字母和数字！", (byte) 0);
                                    break;
                                } else if (!C0094z.m1716a(string7)) {
                                    if (!C0094z.m1720c(string7)) {
                                        m653a("密码不是数字和字母的组合", (byte) 2);
                                        break;
                                    } else if (!C0094z.m1717a(string7, 6, 12)) {
                                        m653a("密码为6-12 的数字和字母的组合形式", (byte) 2);
                                        break;
                                    } else if (!C0037bj.m686c(string7)) {
                                        m653a("密码只允许字母和数字！", (byte) 0);
                                        break;
                                    } else {
                                        if (!(C0094z.m1719b(string7) && C0094z.m1719b(string8) && string7.trim().equals(string8.trim()))) {
                                            m653a("两次输入密码不一致！", (byte) 2);
                                            break;
                                        } else {
                                            StringBuffer stringBuffer = new StringBuffer();
                                            stringBuffer.append(string6);
                                            stringBuffer.append(':');
                                            stringBuffer.append(string7);
                                            RunnableC0066a.f2104am = string6;
                                            C0029bb.f559m = string6;
                                            RunnableC0066a.f2105an = string7;
                                            C0029bb.f560n = string7;
                                            RunnableC0066a.f2106ao = (byte) 0;
                                            C0029bb.f558l = (byte) 0;
                                            RunnableC0066a.f2107ap = true;
                                            C0029bb.f557k = true;
                                            C0091w c0091wM1027a = C0053bz.m1027a((byte) 1, (byte) 2, stringBuffer.toString());
                                            if (c0091wM1027a != null) {
                                                this.f646h.m1561a(c0091wM1027a);
                                                this.f646h.f2272a.m1377a();
                                                this.f646h.f2272a.f2060a.m1434a("请求中...");
                                            }
                                            stringBuffer.delete(0, stringBuffer.capacity());
                                            break;
                                        }
                                    }
                                } else {
                                    m653a("密码不能为空", (byte) 2);
                                    break;
                                }
                            } else {
                                m653a("用户名不能为空！", (byte) 0);
                                break;
                            }
                        }
                    } else {
                        m653a("请输入6-12位的数字、字母组合密码，以确保账号安全", (byte) 2);
                        break;
                    }
                } else {
                    m653a("请输入4-10位的数字、字母或数字与字母组合的用户名", (byte) 2);
                    break;
                }
                break;
            case 5:
                m659e();
                if (!label.equals("返回")) {
                    if (!label.equals("登录")) {
                        if (!label.equals("注册")) {
                            if (!label.equals("短信注册") && label.equals("退出")) {
                                this.f646h.m1564c();
                                break;
                            }
                        } else {
                            m672a(this.f646h.m1558a(), C0029bb.f549c);
                            break;
                        }
                    } else {
                        m671a(this.f646h.m1558a(), C0029bb.f556j, C0029bb.f555i, 0);
                        break;
                    }
                } else if (this.f645b != 3) {
                    if (this.f645b != 11) {
                        if (this.f645b != 4) {
                            if (this.f645b != 6) {
                                if (this.f645b == 10) {
                                    m674b(this.f646h.m1558a());
                                    break;
                                }
                            } else {
                                m660e(this.f646h.m1558a());
                                break;
                            }
                        } else {
                            m672a(this.f646h.m1558a(), C0029bb.f549c);
                            break;
                        }
                    }
                } else {
                    m671a(this.f646h.m1558a(), C0029bb.f556j, C0029bb.f555i, 0);
                    break;
                }
                break;
            case 6:
                if (!label.equals("提交")) {
                    if (!label.equals("余额查询")) {
                        if (!label.equals("充值帮助")) {
                            if (label.equals("返回游戏")) {
                                m663h();
                                m667a();
                                break;
                            }
                        } else {
                            m661f();
                            m655a(this.f646h.m1558a(), "充值帮助", (String[]) null, C0029bb.f551e);
                            break;
                        }
                    } else {
                        m663h();
                        m675c(this.f646h.m1558a());
                        break;
                    }
                } else {
                    byte selectedIndex = (byte) (this.f635R.getSelectedIndex() + 1);
                    if (selectedIndex == 2) {
                        selectedIndex = 3;
                    }
                    String string9 = this.f636S.getString();
                    String string10 = this.f637T.getString();
                    int i2 = Integer.parseInt(f607X[this.f638U.getSelectedIndex()].trim());
                    if (!C0094z.m1716a(string9)) {
                        if (!C0037bj.m685b(string9)) {
                            m653a("充值卡序号有误！", (byte) 2);
                            break;
                        } else if (!C0094z.m1716a(string10)) {
                            if (!C0037bj.m685b(string10)) {
                                m653a("充值卡密码有误！", (byte) 2);
                                break;
                            } else {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append(C0029bb.f553g);
                                stringBuffer2.append(':');
                                stringBuffer2.append(C0029bb.f554h);
                                stringBuffer2.append(':');
                                stringBuffer2.append((int) selectedIndex);
                                stringBuffer2.append(':');
                                stringBuffer2.append(string9);
                                stringBuffer2.append(':');
                                stringBuffer2.append(string10);
                                stringBuffer2.append(':');
                                stringBuffer2.append(i2);
                                C0091w c0091wM1027a2 = C0053bz.m1027a((byte) 2, (byte) 5, stringBuffer2.toString());
                                if (c0091wM1027a2 != null) {
                                    RunnableC0066a.f2115i.m600a(c0091wM1027a2);
                                    this.f646h.f2272a.m1377a();
                                    this.f646h.f2272a.f2060a.m1434a("请求中...");
                                }
                                stringBuffer2.delete(0, stringBuffer2.capacity());
                                break;
                            }
                        } else {
                            m653a("您没有输入充值卡密码，请返回重新输入", (byte) 2);
                            break;
                        }
                    } else {
                        m653a("您没有输入卡号，请返回重新输入", (byte) 2);
                        break;
                    }
                }
                break;
            case 7:
                if (!label.equals("提交")) {
                    if (!label.equals("余额查询")) {
                        m661f();
                        m667a();
                        break;
                    } else {
                        m661f();
                        m675c(this.f646h.m1558a());
                        break;
                    }
                } else {
                    String string11 = this.f626I.getString();
                    boolean zM1721d = C0094z.m1721d(string11);
                    if (!zM1721d) {
                        m661f();
                        m653a("金额输入错误！", (byte) 0);
                        break;
                    } else {
                        int iM1723f = C0094z.m1723f(string11);
                        if ((zM1721d && iM1723f <= 0) || iM1723f > 100) {
                            m653a("购买数量必须在1~100之间！", (byte) 0);
                            break;
                        } else {
                            Display displayM1558a = this.f646h.m1558a();
                            if (this.f631N != null) {
                                m662g();
                            }
                            if (this.f631N == null) {
                                this.f631N = new Form("");
                                this.f631N.append(new StringItem("", "确认支付？"));
                                this.f632O = new Command("提交", 4, 0);
                                this.f633P = new Command("返回", 2, 0);
                                this.f631N.addCommand(this.f632O);
                                this.f631N.addCommand(this.f633P);
                                this.f631N.setCommandListener(this);
                            }
                            displayM1558a.setCurrent(this.f631N);
                            this.f630M = this.f642a;
                            this.f642a = (byte) 8;
                            break;
                        }
                    }
                }
            case 8:
                if (this.f630M == 7) {
                    if (!label.equals("提交")) {
                        m661f();
                        m662g();
                        m669a(this.f646h.m1558a(), 1);
                        break;
                    } else {
                        String string12 = this.f626I.getString();
                        String string13 = this.f627J.getString();
                        if (C0094z.m1716a(string12)) {
                            m653a("购买数量不能为空", (byte) 0);
                        } else if (!C0037bj.m685b(string12)) {
                            m653a("购买数量必须为数字", (byte) 0);
                        } else if (C0094z.m1723f(string12) <= 0 || C0094z.m1723f(string12) > 100) {
                            m653a("购买数量必须在1~100之间！", (byte) 0);
                        } else {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append(C0029bb.f553g);
                            stringBuffer3.append(':');
                            stringBuffer3.append(C0029bb.f554h);
                            stringBuffer3.append(':');
                            stringBuffer3.append(string12);
                            stringBuffer3.append(':');
                            stringBuffer3.append(string13);
                            C0091w c0091wM1027a3 = C0053bz.m1027a((byte) 2, (byte) 6, stringBuffer3.toString());
                            if (c0091wM1027a3 != null) {
                                RunnableC0066a.f2115i.m600a(c0091wM1027a3);
                                this.f646h.f2272a.m1377a();
                                this.f646h.f2272a.f2060a.m1434a("请求中...");
                            }
                            stringBuffer3.delete(0, stringBuffer3.capacity());
                        }
                        m662g();
                        m661f();
                        break;
                    }
                }
                break;
            case 9:
                if (!label.equals("提交")) {
                    if (!label.equals("充值")) {
                        if (label.equals("返回游戏")) {
                            m665j();
                            m667a();
                            break;
                        }
                    } else {
                        m665j();
                        m660e(this.f646h.m1558a());
                        break;
                    }
                } else {
                    int i3 = this.f641Z.getSelectedIndex() == 0 ? 1 : this.f641Z.getSelectedIndex() == 1 ? 2 : 3;
                    String string14 = this.f643aa.getString();
                    String string15 = this.f644ab.getString();
                    if (!C0094z.m1716a(string14)) {
                        if (i3 == 1 && !C0094z.m1720c(string14)) {
                            m653a("用户名只能为数字和字母的组合形式", (byte) 2);
                            break;
                        } else if (i3 == 1 && !C0094z.m1717a(string14, 4, 10)) {
                            m653a("用户名为4-10 的数字和字母的组合", (byte) 2);
                            break;
                        } else if (i3 == 2 && !C0094z.m1722e(string14)) {
                            m653a("手机号不合符规范，应为11位数字", (byte) 2);
                            break;
                        } else if (i3 == 3 && !C0094z.m1721d(string14)) {
                            m653a("ID 应为数字", (byte) 2);
                            break;
                        } else if (!C0094z.m1716a(string15)) {
                            if (!C0094z.m1720c(string15)) {
                                m653a("密码只能为数字和字母的组合", (byte) 0);
                                break;
                            } else if (!C0094z.m1717a(string15, 6, 12)) {
                                m653a("密码须为6～12位的字母和数字", (byte) 0);
                                break;
                            } else {
                                StringBuffer stringBuffer4 = new StringBuffer();
                                stringBuffer4.append(C0029bb.f553g);
                                stringBuffer4.append(':');
                                stringBuffer4.append(C0029bb.f554h);
                                stringBuffer4.append(':');
                                stringBuffer4.append(i3);
                                stringBuffer4.append(':');
                                stringBuffer4.append(string14);
                                stringBuffer4.append(':');
                                stringBuffer4.append(string15);
                                C0091w c0091wM1027a4 = C0053bz.m1027a((byte) 2, (byte) 7, stringBuffer4.toString());
                                if (c0091wM1027a4 != null) {
                                    RunnableC0066a.f2115i.m600a(c0091wM1027a4);
                                    this.f646h.f2272a.m1377a();
                                    this.f646h.f2272a.f2060a.m1434a("请求中...");
                                }
                                stringBuffer4.delete(0, stringBuffer4.capacity());
                                break;
                            }
                        } else {
                            m653a("密码不能为空", (byte) 2);
                            break;
                        }
                    } else {
                        m653a("帐号不能为空！", (byte) 2);
                        break;
                    }
                }
                break;
            case 10:
                if (!label.equals("提交")) {
                    if (!label.equals("充值帮助")) {
                        if (label.equals("返回游戏")) {
                            m664i();
                            m667a();
                            break;
                        }
                    } else {
                        m661f();
                        m655a(this.f646h.m1558a(), "充值帮助", (String[]) null, C0029bb.f552f);
                        break;
                    }
                } else {
                    byte selectedIndex2 = (byte) (this.f635R.getSelectedIndex() + 1);
                    if (selectedIndex2 == 2) {
                        selectedIndex2 = 3;
                    }
                    String string16 = this.f636S.getString();
                    String string17 = this.f637T.getString();
                    int iM1723f2 = C0094z.m1723f(f607X[this.f638U.getSelectedIndex()].trim());
                    this.f639V.getString();
                    if (!C0094z.m1716a(string16)) {
                        if (!C0037bj.m685b(string16)) {
                            m653a("充值卡序号有误！", (byte) 2);
                            break;
                        } else if (!C0094z.m1716a(string17)) {
                            if (!C0037bj.m685b(string17)) {
                                m653a("充值卡密码有误！", (byte) 2);
                                break;
                            } else {
                                StringBuffer stringBuffer5 = new StringBuffer();
                                stringBuffer5.append(C0029bb.f553g);
                                stringBuffer5.append(':');
                                stringBuffer5.append(C0029bb.f554h);
                                stringBuffer5.append(':');
                                stringBuffer5.append((int) selectedIndex2);
                                stringBuffer5.append(':');
                                stringBuffer5.append(string16);
                                stringBuffer5.append(':');
                                stringBuffer5.append(string17);
                                stringBuffer5.append(':');
                                stringBuffer5.append(iM1723f2);
                                C0091w c0091wM1027a5 = C0088t.f2538x ? C0053bz.m1027a((byte) 3, (byte) 8, stringBuffer5.toString()) : C0053bz.m1027a((byte) 2, (byte) 8, stringBuffer5.toString());
                                if (c0091wM1027a5 != null) {
                                    RunnableC0066a.f2115i.m600a(c0091wM1027a5);
                                    this.f646h.f2272a.m1377a();
                                    this.f646h.f2272a.f2060a.m1434a("请求中...");
                                }
                                stringBuffer5.delete(0, stringBuffer5.capacity());
                                break;
                            }
                        } else {
                            m653a("您没有输入充值卡密码，请返回重新输入", (byte) 2);
                            break;
                        }
                    } else {
                        m653a("您没有输入卡号，请返回重新输入", (byte) 2);
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
                            this.f654q = null;
                            this.f655r = null;
                            this.f656s = null;
                            m658d(this.f646h.m1558a());
                            break;
                        }
                    } else {
                        m666k();
                        break;
                    }
                } else {
                    m673b();
                    m671a(this.f646h.m1558a(), C0029bb.f559m, C0029bb.f560n, 0);
                    break;
                }
                break;
            case 13:
                if (label.equals("提交")) {
                    C0076h c0076h = this.f646h;
                    if (c0076h.f2272a.f2060a.f2216j == 1) {
                        c0076h.f2272a.f2060a.f2216j = c0076h.f2272a.f2060a.f2217k;
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
                                this.f646h.m1564c();
                                break;
                            }
                        } else {
                            m672a(this.f646h.m1558a(), C0029bb.f549c);
                            break;
                        }
                    } else {
                        m671a(this.f646h.m1558a(), C0029bb.f559m, C0029bb.f560n, 0);
                        break;
                    }
                } else if (this.f645b != 3) {
                    if (this.f645b != 12) {
                        if (this.f645b != 11) {
                            if (this.f645b != 4) {
                                if (this.f645b != 6) {
                                    if (this.f645b == 10) {
                                        m674b(this.f646h.m1558a());
                                        break;
                                    }
                                } else {
                                    m660e(this.f646h.m1558a());
                                    break;
                                }
                            } else {
                                m672a(this.f646h.m1558a(), C0029bb.f549c);
                                break;
                            }
                        }
                    } else {
                        m658d(this.f646h.m1558a());
                        break;
                    }
                } else {
                    m671a(this.f646h.m1558a(), C0029bb.f559m, C0029bb.f560n, 0);
                    break;
                }
                break;
            case 15:
                if (!label.equals("确定")) {
                    if (label.equals("返回")) {
                        this.f620C = null;
                        this.f622E = null;
                        this.f623F = null;
                        this.f621D = null;
                        m667a();
                        break;
                    }
                } else {
                    String string18 = this.f621D.getString();
                    String string19 = this.f622E.getString();
                    String string20 = this.f623F.getString();
                    if (!C0094z.m1716a(string19)) {
                        if (!C0094z.m1716a(string20)) {
                            if (!C0094z.m1720c(string20)) {
                                m653a("新密码须为数字和字母的组合", (byte) 0);
                                break;
                            } else if (!C0094z.m1717a(string20, 6, 12)) {
                                m653a("新密码须为6-12的数字和字母的组合形式", (byte) 0);
                                break;
                            } else if (!C0037bj.m686c(string20)) {
                                m653a("新密码只允许字母和数字", (byte) 0);
                                break;
                            } else {
                                if (C0029bb.f558l == 2) {
                                    i = 3;
                                } else if (C0029bb.f558l != 1) {
                                    i = C0029bb.f558l == 0 ? 1 : 0;
                                }
                                StringBuffer stringBuffer6 = new StringBuffer();
                                stringBuffer6.append(i);
                                stringBuffer6.append(':');
                                stringBuffer6.append(string18);
                                stringBuffer6.append(':');
                                stringBuffer6.append(string19);
                                stringBuffer6.append(':');
                                stringBuffer6.append(string20);
                                C0091w c0091wM1027a6 = C0053bz.m1027a((byte) 1, (byte) 4, stringBuffer6.toString());
                                if (c0091wM1027a6 != null) {
                                    this.f646h.m1561a(c0091wM1027a6);
                                    this.f646h.f2272a.m1377a();
                                    this.f646h.f2272a.f2060a.m1434a("请求中...");
                                }
                                stringBuffer6.delete(0, stringBuffer6.capacity());
                                break;
                            }
                        } else {
                            m653a("新密码不能为空", (byte) 0);
                            break;
                        }
                    } else {
                        m653a("旧密码不能为空", (byte) 0);
                        break;
                    }
                }
                break;
        }
    }
}

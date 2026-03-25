/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.ChoiceGroup
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.ImageItem
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.StringItem
 *  javax.microedition.lcdui.TextField
 */
import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.ImageItem;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;

public final class bg
implements CommandListener {
    private byte a = (byte)-1;
    private byte b = 0;
    private static String c = "\u901a\u884c\u8bc1:";
    private static String d = "\u5bc6    \u7801:";
    private static String e = "\u9a8c\u8bc1\u7801:";
    private static String[] f = new String[]{"\u7528\u6237\u540d", "\u624b\u673a\u53f7", "ID"};
    private static String[] g = new String[]{"\u4fdd\u5b58\u5bc6\u7801"};
    private h h;
    private static String[] i = new String[]{"\u9519\u8bef", "\u8b66\u544a", "\u6e29\u99a8\u63d0\u793a", "\u9519\u8bef", "\u6e29\u99a8\u63d0\u793a"};
    private Form j = null;
    private StringItem k;
    private Form l = null;
    private ChoiceGroup m;
    private TextField n = null;
    private TextField o = null;
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
    private static final String[] W = new String[]{"\u795e\u5dde\u884c"};
    private static final String[] X = new String[]{"30", "50", "100"};
    private Form Y;
    private ChoiceGroup Z;
    private TextField aa;
    private TextField ab;
    private static String ac = "\u901a\u884c\u8bc1\u7528\u6237\u540d\u8f93\u5165\u9519\u8bef\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165!";
    private static String ad = "\u901a\u884c\u8bc1\u8bf7\u8f93\u516511\u4f4d\u624b\u673a\u53f7\u7801\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165!";
    private static String ae = "\u901a\u884c\u8bc1ID\u53f7\u8f93\u5165\u957f\u5ea6\u9519\u8bef\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165";
    private static String af = "\u5bc6\u7801\u9519\u8bef\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165";

    public bg(h h2) {
        this.h = h2;
        this.a = (byte)-1;
        this.b = (byte)-1;
    }

    public final void a() {
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = 1;
        this.h.b();
    }

    private void a(String string, byte by2) {
        if (by2 == 3) {
            Command command = new Command("\u9000\u51fa", 7, 0);
            this.a(string, by2, command, null);
            return;
        }
        if (by2 == 4) {
            this.a(string, by2, null, null);
            return;
        }
        Command command = new Command("\u8fd4\u56de", 2, 0);
        this.a(string, by2, command, null);
    }

    private void a(String string, byte by2, Command command, Command[] commandArray) {
        if (this.j != null) {
            this.c();
        }
        this.j = new Form(i[by2]);
        this.k = new StringItem(null, string);
        this.j.append((Item)this.k);
        if (command != null) {
            this.j.addCommand(command);
        }
        this.j.setCommandListener((CommandListener)this);
        this.h.a().setCurrent((Displayable)this.j);
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte)2;
    }

    private void c() {
        this.j = null;
        this.k = null;
    }

    public final void a(Display display, String object, String string, int n2) {
        int n3 = n2;
        String string2 = string;
        string = object;
        object = this;
        if (((bg)object).l != null) {
            ((bg)object).b();
        }
        ((bg)object).l = new Form("\u767b\u5f55\u4e00\u54e5\u54e5\u901a\u884c\u8bc1");
        ((bg)object).m = new ChoiceGroup("\u65b9\u5f0f:", 4, f, null);
        ((bg)object).m.setSelectedIndex((int)com.yinhan.kjava.main.a.ao, true);
        ((bg)object).l.append((Item)((bg)object).m);
        ((bg)object).n = new TextField(c, string, 12, 0);
        ((bg)object).o = n3 == 0 ? new TextField(d, com.yinhan.kjava.main.a.ap ? string2 : null, 12, 0) : (n3 == 3 ? new TextField(d, string2, 12, 0) : new TextField(d, string2, 12, 0));
        ((bg)object).l.append((Item)((bg)object).n);
        ((bg)object).l.append((Item)((bg)object).o);
        ((bg)object).p = new ChoiceGroup(null, 2, g, null);
        ((bg)object).p.setSelectedFlags(new boolean[]{com.yinhan.kjava.main.a.ap});
        ((bg)object).l.append((Item)((bg)object).p);
        string = new Command("\u63d0\u4ea4", 4, 0);
        string2 = new Command("\u8fd4\u56de", 2, 1);
        ((bg)object).l.addCommand((Command)string);
        ((bg)object).l.addCommand((Command)string2);
        ((bg)object).l.setCommandListener((CommandListener)object);
        if (bb.k) {
            ((bg)object).p.setSelectedIndex(0, true);
        }
        if (this.l != null) {
            display.setCurrent((Displayable)this.l);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte)3;
    }

    public final void b() {
        this.p = null;
        this.m = null;
        this.l = null;
        this.n = null;
        this.o = null;
    }

    private void d(Display display) {
        bg bg2 = this;
        this.q = new Form("\u767b\u9646\u9a8c\u8bc1\u7801");
        StringItem stringItem = new StringItem(null, "\u4e3a\u4e86\u60a8\u7684\u8d26\u53f7\u5b89\u5168\uff0c\u8bf7\u8f93\u5165\u4e0b\u9762\u7684\u9a8c\u8bc1\u7801\uff1a");
        bg2.q.append((Item)stringItem);
        bg2.r = new TextField("", "", 4, 2);
        bg2.s = new ImageItem("", null, 1, "");
        bg2.q.append((Item)bg2.r);
        bg2.q.append((Item)bg2.s);
        stringItem = new Command("\u8fd4\u56de", 7, 0);
        Command command = new Command("\u63d0\u4ea4", 4, 1);
        Command command2 = new Command("\u5237\u65b0", 4, 1);
        bg2.q.addCommand((Command)stringItem);
        bg2.q.addCommand(command);
        bg2.q.addCommand(command2);
        bg2.q.setCommandListener((CommandListener)bg2);
        if (this.q != null) {
            display.setCurrent((Displayable)this.q);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte)12;
    }

    public final void a(Display display, String string, String string2) {
        bg bg2 = this;
        if (bg2.t != null) {
            bg2.t.deleteAll();
        }
        bg2.u = null;
        bg2.v = null;
        bg2.w = null;
        bg2.t = null;
        if (string != null) {
            this.w = new StringItem(string, string2);
        }
        this.t = new Form("\u4e00\u54e5\u54e5\u901a\u884c\u8bc1\u5bc6\u7801");
        this.u = new TextField("\u901a\u884c\u8bc1\u5bc6\u7801", null, 12, 0);
        this.v = new Command("\u63d0\u4ea4", 2, 1);
        this.t.addCommand(this.v);
        this.t.append((Item)this.u);
        if (string != null) {
            this.t.append((Item)this.w);
        }
        this.t.setCommandListener((CommandListener)this);
        display.setCurrent((Displayable)this.t);
        this.a = (byte)13;
    }

    public final void a(Display display, boolean bl2) {
        bb.c = bl2;
        if (this.x != null) {
            this.d();
        }
        boolean bl3 = bl2;
        bg bg2 = this;
        this.x = new Form(bl3 ? "\u8bf7\u4fee\u6539\u60a8\u7684\u5e10\u53f7\u4fe1\u606f" : "\u6ce8\u518c\u4e00\u54e5\u54e5\u901a\u884c\u8bc1");
        bg2.y = new TextField("\u7528  \u6237  \u540d:", "", 12, 0);
        bg2.z = new TextField("\u5bc6        \u7801:", "", 12, 65536);
        bg2.A = new TextField("\u786e\u8ba4\u5bc6\u7801:", "", 12, 65536);
        bg2.B = new TextField("\u9a8c  \u8bc1  \u7801:", "", 4, 2);
        bg2.x.append((Item)bg2.y);
        bg2.x.append((Item)bg2.z);
        bg2.x.append((Item)bg2.A);
        StringItem stringItem = new StringItem(null, "\u6ce8\u610f\uff1a\u7528\u6237\u540d\u4ec5\u5141\u8bb84-10\u4f4d\u7684\u6570\u5b57\u548c\u5b57\u6bcd\uff1b\u5bc6\u7801\u4ec5\u5141\u8bb86-12\u4f4d\u7684\u6570\u5b57\u548c\u5b57\u6bcd\u3002");
        bg2.x.append((Item)stringItem);
        stringItem = new Command("\u8fd4\u56de", 2, 1);
        Command command = new Command("\u63d0\u4ea4", 4, 0);
        Command command2 = new Command("\u8fd4\u56de\u6e38\u620f", 4, 1);
        bg2.x.addCommand(command);
        if (bb.c) {
            bg2.x.addCommand(command2);
        } else {
            bg2.x.addCommand((Command)stringItem);
        }
        bg2.x.setCommandListener((CommandListener)bg2);
        if (this.x != null) {
            display.setCurrent((Displayable)this.x);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte)4;
    }

    private void d() {
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
    }

    public final void a(Display display) {
        bg bg2 = this;
        this.C = new Form("\u4fee\u6539\u5bc6\u7801");
        bg2.D = new TextField("\u8d26\u53f7:", "", 12, 0);
        bg2.E = new TextField("\u539f\u5bc6\u7801:", "", 12, 0);
        bg2.F = new TextField("\u65b0\u5bc6\u7801:", "", 12, 0);
        bg2.C.append((Item)bg2.D);
        bg2.C.append((Item)bg2.E);
        bg2.C.append((Item)bg2.F);
        StringItem stringItem = new StringItem(null, "\u6ce8\u610f\uff1a\u5bc6\u7801\u4ec5\u5141\u8bb86-12\u4f4d\u7684\u6570\u5b57\u548c\u5b57\u6bcd\u3002");
        bg2.C.append((Item)stringItem);
        stringItem = new Command("\u8fd4\u56de", 2, 1);
        Command command = new Command("\u786e\u5b9a", 4, 0);
        bg2.C.addCommand((Command)stringItem);
        bg2.C.addCommand(command);
        bg2.C.setCommandListener((CommandListener)bg2);
        if (this.C != null) {
            display.setCurrent((Displayable)this.C);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte)15;
    }

    private void a(Display display, String object, String[] object2, String[] command) {
        this.e();
        Command command2 = command;
        command = null;
        object2 = object;
        object = this;
        this.G = new Form((String)object2);
        StringItem[] stringItemArray = new StringItem[((String[])command2).length];
        for (int n2 = 0; n2 < stringItemArray.length; n2 = (int)((byte)(n2 + 1))) {
            stringItemArray[n2] = command == null ? new StringItem(null, command2[n2]) : new StringItem(command[n2], command2[n2]);
            ((bg)object).G.append((Item)stringItemArray[n2]);
        }
        Command command3 = new Command("\u8fd4\u56de", 2, 1);
        ((bg)object).G.addCommand(command3);
        if (((String)object2).equals("\u4e00\u54e5\u54e5\u901a\u884c\u8bc1\u5e2e\u52a9") && !bb.c) {
            object2 = new Command("\u767b\u5f55", 4, 1);
            command = new Command("\u6ce8\u518c", 4, 1);
            command2 = new Command("\u9000\u51fa", 7, 1);
            ((bg)object).G.addCommand((Command)object2);
            ((bg)object).G.addCommand(command);
            ((bg)object).G.addCommand(command2);
        }
        ((bg)object).G.setCommandListener((CommandListener)object);
        if (this.G != null) {
            display.setCurrent((Displayable)this.G);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte)5;
    }

    private void e() {
        if (this.G != null) {
            this.G.deleteAll();
        }
        this.G = null;
    }

    public final void a(Display display, int n2) {
        if (n2 > 200) {
            this.a("\u4e00\u6b21\u6700\u5927\u4e3a200", (byte)2);
        } else {
            if (this.H != null) {
                this.f();
            }
            int n3 = n2;
            bg bg2 = this;
            if (bg2.H == null) {
                bg2.H = new Form("");
                bg2.I = new TextField("\u94f6\u5143\u8d2d\u4e70\u91d1\u8c46\u6570\u91cf(1-100):", String.valueOf(n3), 3, 2);
                bg2.J = new TextField("\u901a\u884c\u8bc1\u652f\u4ed8\u5bc6\u7801(\u82e5\u65e0\u8bf7\u8f93\u5165\u767b\u5f55\u5bc6\u7801):", "", 12, 65536);
                bg2.H.append((Item)bg2.I);
                bg2.H.append((Item)bg2.J);
                bg2.L = new Command("\u8fd4\u56de\u6e38\u620f", 7, 0);
                bg2.K = new Command("\u63d0\u4ea4", 4, 0);
                Command command = new Command("\u4f59\u989d\u67e5\u8be2", 4, 0);
                bg2.H.addCommand(bg2.L);
                bg2.H.addCommand(bg2.K);
                bg2.H.addCommand(command);
                bg2.H.setCommandListener((CommandListener)bg2);
            }
            display.setCurrent((Displayable)this.H);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte)7;
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
        this.h();
        bg bg2 = this;
        this.Q = new Form("\u5145\u503c\u4e2d\u5fc3");
        bg2.Q.append("1\u5143=1\u94f6\u5143");
        bg2.R = new ChoiceGroup("\u5145\u503c\u5361:", 4, W, null);
        bg2.Q.append((Item)bg2.R);
        bg2.S = new TextField("\u5145\u503c\u5361\u5e8f\u53f7:", "", 32, 2);
        bg2.T = new TextField("\u5145\u503c\u5361\u5bc6\u7801:", "", 32, 2);
        bg2.U = new ChoiceGroup("\u5145\u503c\u5361\u9762\u503c:", 4, X, null);
        bg2.U.setSelectedIndex(1, true);
        bg2.V = new TextField(e, "", 4, 2);
        bg2.Q.append((Item)bg2.S);
        bg2.Q.append((Item)bg2.T);
        bg2.Q.append((Item)bg2.U);
        Command command = new Command("\u8fd4\u56de\u6e38\u620f", 7, 0);
        Command command2 = new Command("\u63d0\u4ea4", 4, 1);
        Command command3 = new Command("\u4f59\u989d\u67e5\u8be2", 4, 1);
        Command command4 = new Command("\u5145\u503c\u5e2e\u52a9", 4, 1);
        bg2.Q.addCommand(command);
        bg2.Q.addCommand(command2);
        bg2.Q.addCommand(command3);
        bg2.Q.addCommand(command4);
        bg2.Q.setCommandListener((CommandListener)bg2);
        if (this.Q != null) {
            display.setCurrent((Displayable)this.Q);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte)6;
    }

    private void h() {
        this.Q = null;
        this.R = null;
        this.S = this.T;
        this.U = null;
        this.V = null;
    }

    public final void b(Display display) {
        this.i();
        bg bg2 = this;
        this.Q = new Form("\u5145\u503c\u4e2d\u5fc3");
        bg2.Q.append("1\u5143=1\u91d1\u8c46");
        bg2.R = new ChoiceGroup("\u5145\u503c\u5361:", 4, W, null);
        bg2.Q.append((Item)bg2.R);
        bg2.S = new TextField("\u5145\u503c\u5361\u5e8f\u53f7:", "", 32, 2);
        bg2.T = new TextField("\u5145\u503c\u5361\u5bc6\u7801:", "", 32, 2);
        bg2.U = new ChoiceGroup("\u5145\u503c\u5361\u9762\u503c:", 4, X, null);
        bg2.U.setSelectedIndex(1, true);
        bg2.V = new TextField(e, "", 4, 2);
        bg2.Q.append((Item)bg2.S);
        bg2.Q.append((Item)bg2.T);
        bg2.Q.append((Item)bg2.U);
        Command command = new Command("\u8fd4\u56de\u6e38\u620f", 7, 0);
        Command command2 = new Command("\u63d0\u4ea4", 4, 1);
        Command command3 = new Command("\u5145\u503c\u5e2e\u52a9", 4, 1);
        bg2.Q.addCommand(command);
        bg2.Q.addCommand(command2);
        bg2.Q.addCommand(command3);
        bg2.Q.setCommandListener((CommandListener)bg2);
        if (this.Q != null) {
            display.setCurrent((Displayable)this.Q);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte)10;
    }

    private void i() {
        this.Q = null;
        this.R = null;
        this.S = this.T;
        this.U = null;
        this.V = null;
    }

    public final void c(Display display) {
        this.h();
        bg bg2 = this;
        this.Y = new Form("\u4f59\u989d\u67e5\u8be2");
        bg2.Z = new ChoiceGroup("\u65b9\u5f0f:", 4, f, null);
        bg2.Y.append((Item)bg2.Z);
        bg2.aa = new TextField("\u901a\u884c\u8bc1:", "", 32, 0);
        bg2.ab = new TextField("\u5bc6  \u7801:", "", 32, 65536);
        new TextField(e, "", 4, 2);
        bg2.Y.append((Item)bg2.aa);
        bg2.Y.append((Item)bg2.ab);
        Command command = new Command("\u8fd4\u56de\u6e38\u620f", 7, 0);
        Command command2 = new Command("\u63d0\u4ea4", 4, 1);
        Command command3 = new Command("\u5145\u503c", 4, 1);
        bg2.Y.addCommand(command);
        bg2.Y.addCommand(command2);
        bg2.Y.addCommand(command3);
        bg2.Y.setCommandListener((CommandListener)bg2);
        if (this.Y != null) {
            display.setCurrent((Displayable)this.Y);
        }
        if (this.a != 2) {
            this.b = this.a;
        }
        this.a = (byte)9;
    }

    private void j() {
        this.Y = null;
        this.Z = null;
        this.ab = null;
        this.aa = null;
    }

    public final void commandAction(Command object, Displayable object2) {
        if ((object = object.getLabel()) == null) {
            return;
        }
        block0 : switch (((bg)object3).a) {
            case 13: {
                if (!((String)object).equals("\u63d0\u4ea4")) break;
                object = ((bg)object3).h;
                if (((h)object).a.a.j == 1) {
                    ((h)object).a.a.j = ((h)object).a.a.k;
                }
                return;
            }
            case 2: {
                if (((String)object).equals("\u9000\u51fa")) {
                    ((bg)object3).h.c();
                    return;
                }
                if (((String)object).equals("\u8fd4\u56de") && ((bg)object3).b == 12) {
                    ((bg)object3).a(((bg)object3).h.a(), bb.m, bb.n, 0);
                    return;
                }
                if (((String)object).equals("\u8fd4\u56de") && ((bg)object3).b == 13) {
                    ((bg)object3).a(((bg)object3).h.a(), "\u6e38\u5ba2\u6ce8\u518c \u7b2c2\u6b65: ", "\u521b\u5efa\u4e00\u54e5\u54e5\u901a\u884c\u8bc1\u5bc6\u7801");
                    return;
                }
                if (((String)object).equals("\u8fd4\u56de\u6e38\u620f")) {
                    ((bg)object3).h.b();
                    return;
                }
                object2 = object;
                object = object3;
                switch (((bg)object).b) {
                    case 1: {
                        super.c();
                        ((bg)object).a();
                        break block0;
                    }
                    case 3: {
                        super.c();
                        if (((bg)object).b == -1) {
                            ((bg)object).h.c();
                            break block0;
                        }
                        ((bg)object).a(((bg)object).h.a(), bb.m, bb.n, 0);
                        break block0;
                    }
                    case 4: {
                        super.c();
                        if (((String)object2).equals("\u767b\u5f55")) {
                            ((bg)object).a(((bg)object).h.a(), bb.m, bb.n, 2);
                            break block0;
                        }
                        ((bg)object).a(((bg)object).h.a(), bb.c);
                        break block0;
                    }
                    case 7: {
                        super.c();
                        if (((String)object2).equals("\u8fd4\u56de\u6e38\u620f")) {
                            ((bg)object).a();
                            break block0;
                        }
                        ((bg)object).a(((bg)object).h.a(), 1);
                        break block0;
                    }
                    case 6: {
                        break block0;
                    }
                    case 8: {
                        super.c();
                        if (((bg)object).M != 7) break;
                        if (((String)object2).equals("\u8fd4\u56de")) {
                            ((bg)object).a(((bg)object).h.a(), 1);
                            break block0;
                        }
                        ((bg)object).a();
                        break block0;
                    }
                    case 9: {
                        super.c();
                        ((bg)object).c(((bg)object).h.a());
                        break block0;
                    }
                    case 10: {
                        break block0;
                    }
                    case 15: {
                        super.c();
                        ((bg)object).a(((bg)object).h.a());
                        break block0;
                    }
                    default: {
                        if (((String)object2).equals("\u8fd4\u56de")) {
                            if (((bg)object).b == 3) {
                                ((bg)object).a(((bg)object).h.a(), bb.m, bb.n, 0);
                                break block0;
                            }
                            if (((bg)object).b == 11) break;
                            if (((bg)object).b == 4) {
                                ((bg)object).a(((bg)object).h.a(), bb.c);
                                break block0;
                            }
                            if (((bg)object).b == 6) {
                                super.e(((bg)object).h.a());
                                break block0;
                            }
                            if (((bg)object).b != 10) break;
                            ((bg)object).b(((bg)object).h.a());
                            break block0;
                        }
                        if (((String)object2).equals("\u767b\u5f55")) {
                            ((bg)object).a(((bg)object).h.a(), bb.m, bb.n, 0);
                            break block0;
                        }
                        if (((String)object2).equals("\u6ce8\u518c")) {
                            ((bg)object).a(((bg)object).h.a(), bb.c);
                            break block0;
                        }
                        if (((String)object2).equals("\u77ed\u4fe1\u6ce8\u518c") || !((String)object2).equals("\u9000\u51fa")) break;
                        ((bg)object).h.c();
                    }
                }
                return;
            }
            case 11: {
                return;
            }
            case 3: {
                object2 = ((bg)object3).n.getString();
                String string = ((bg)object3).o.getString();
                byte by2 = bg.a(((bg)object3).m);
                if (((String)object).equals("\u63d0\u4ea4")) {
                    if (by2 == 0) {
                        if (((String)object2).equals("") || ((String)object2).length() < 4) {
                            ((bg)object3).a("\u901a\u884c\u8bc1\u7528\u6237\u540d\u8f93\u5165\u9519\u8bef\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165", (byte)2);
                            return;
                        }
                    } else if (by2 == 1) {
                        if (((String)object2).equals("") || ((String)object2).length() < 11) {
                            ((bg)object3).a("\u901a\u884c\u8bc1\u8bf7\u8f93\u516511\u4f4d\u624b\u673a\u53f7\u7801\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165", (byte)2);
                            return;
                        }
                    } else if (by2 == 2 && (((String)object2).equals("") || ((String)object2).length() < 4)) {
                        ((bg)object3).a("\u901a\u884c\u8bc1ID\u53f7\u8f93\u5165\u957f\u5ea6\u9519\u8bef\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165", (byte)2);
                        return;
                    }
                    if (string.equals("") || string.length() < 6) {
                        ((bg)object3).a("\u5bc6\u7801\u9519\u8bef\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165", (byte)2);
                        return;
                    }
                    ((bg)object3).k();
                    return;
                }
                if (!((String)object).equals("\u8fd4\u56de")) break;
                ((bg)object3).b();
                ((bg)object3).a();
                return;
            }
            case 12: {
                if (((String)object).equals("\u8fd4\u56de")) {
                    ((bg)object3).b();
                    ((bg)object3).a(((bg)object3).h.a(), bb.m, bb.n, 0);
                    return;
                }
                if (((String)object).equals("\u63d0\u4ea4")) {
                    ((bg)object3).k();
                    return;
                }
                if (!((String)object).equals("\u5237\u65b0")) break;
                object = object3;
                ((bg)object3).q = null;
                ((bg)object).r = null;
                ((bg)object).s = null;
                ((bg)object3).d(((bg)object3).h.a());
                return;
            }
            case 4: {
                Object object3;
                object2 = ((bg)object3).y.getString();
                String string = ((bg)object3).z.getString();
                String string2 = ((bg)object3).A.getString();
                if (((String)object).equals("\u63d0\u4ea4")) {
                    if (((String)object2).equals("") || ((String)object2).length() < 4) {
                        ((bg)object3).a("\u8bf7\u8f93\u51654-10\u4f4d\u7684\u6570\u5b57\u3001\u5b57\u6bcd\u6216\u6570\u5b57\u4e0e\u5b57\u6bcd\u7ec4\u5408\u7684\u7528\u6237\u540d", (byte)2);
                        return;
                    }
                    if (string.equals("") || string.length() < 6) {
                        ((bg)object3).a("\u8bf7\u8f93\u51656-12\u4f4d\u7684\u6570\u5b57\u3001\u5b57\u6bcd\u7ec4\u5408\u5bc6\u7801\uff0c\u4ee5\u786e\u4fdd\u8d26\u53f7\u5b89\u5168", (byte)2);
                        return;
                    }
                    if (!string.equals(string2)) {
                        ((bg)object3).a("\u60a8\u4e24\u6b21\u8f93\u5165\u7684\u5bc6\u7801\u4e0d\u4e00\u81f4\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165", (byte)2);
                        return;
                    }
                    object = object3;
                    object2 = ((bg)object).y.getString();
                    string = ((bg)object).z.getString();
                    string2 = ((bg)object).A.getString();
                    ((bg)object).B.getString();
                    if (z.a((String)object2)) {
                        super.a("\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a\uff01", (byte)0);
                        break;
                    }
                    if (!z.a((String)object2, 4, 10)) {
                        super.a("\u7528\u6237\u540d\u53ea\u5141\u8bb84\uff5e10\u4f4d\u5b57\u6bcd\u548c\u6570\u5b57\uff01", (byte)0);
                        break;
                    }
                    if (!bj.c((String)object2)) {
                        super.a("\u7528\u6237\u540d\u53ea\u5141\u8bb8\u5b57\u6bcd\u548c\u6570\u5b57\uff01", (byte)0);
                        break;
                    }
                    if (z.a(string)) {
                        super.a("\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a", (byte)2);
                        break;
                    }
                    if (!z.c(string)) {
                        super.a("\u5bc6\u7801\u4e0d\u662f\u6570\u5b57\u548c\u5b57\u6bcd\u7684\u7ec4\u5408", (byte)2);
                        break;
                    }
                    if (!z.a(string, 6, 12)) {
                        super.a("\u5bc6\u7801\u4e3a6-12 \u7684\u6570\u5b57\u548c\u5b57\u6bcd\u7684\u7ec4\u5408\u5f62\u5f0f", (byte)2);
                        break;
                    }
                    if (!bj.c(string)) {
                        super.a("\u5bc6\u7801\u53ea\u5141\u8bb8\u5b57\u6bcd\u548c\u6570\u5b57\uff01", (byte)0);
                        break;
                    }
                    object3 = string;
                    if (!(z.b((String)object3) && z.b(string2) && ((String)object3).trim().equals(string2.trim()))) {
                        super.a("\u4e24\u6b21\u8f93\u5165\u5bc6\u7801\u4e0d\u4e00\u81f4\uff01", (byte)2);
                        break;
                    }
                    object3 = new StringBuffer();
                    ((StringBuffer)object3).append((String)object2);
                    ((StringBuffer)object3).append(':');
                    ((StringBuffer)object3).append(string);
                    bb.m = com.yinhan.kjava.main.a.am = object2;
                    bb.n = com.yinhan.kjava.main.a.an = string;
                    com.yinhan.kjava.main.a.ao = 0;
                    bb.l = 0;
                    com.yinhan.kjava.main.a.ap = true;
                    bb.k = true;
                    w w2 = bz.a((byte)1, (byte)2, ((StringBuffer)object3).toString());
                    if (w2 != null) {
                        ((bg)object).h.a(w2);
                        ((bg)object).h.a.a();
                        ((bg)object).h.a.a.a("\u8bf7\u6c42\u4e2d...");
                    }
                    ((StringBuffer)object3).delete(0, ((StringBuffer)object3).capacity());
                    return;
                }
                if (((String)object).equals("\u8fd4\u56de\u6e38\u620f")) {
                    ((bg)object3).d();
                    ((bg)object3).a();
                    return;
                }
                if (!((String)object).equals("\u8fd4\u56de")) break;
                ((bg)object3).d();
                ((bg)object3).h.a.a.c();
                ((bg)object3).a();
                return;
            }
            case 7: {
                if (((String)object).equals("\u63d0\u4ea4")) {
                    object = ((bg)object3).I.getString();
                    boolean bl2 = z.d((String)object);
                    if (bl2) {
                        int n2 = z.f((String)object);
                        if (bl2 && n2 <= 0 || n2 > 100) {
                            ((bg)object3).a("\u8d2d\u4e70\u6570\u91cf\u5fc5\u987b\u57281~100\u4e4b\u95f4\uff01", (byte)0);
                            return;
                        }
                        String string = "\u786e\u8ba4\u652f\u4ed8\uff1f";
                        Display display = ((bg)object3).h.a();
                        object = object3;
                        if (((bg)object).N != null) {
                            super.g();
                        }
                        String string3 = string;
                        Object object4 = object;
                        if (((bg)object4).N == null) {
                            ((bg)object4).N = new Form("");
                            ((bg)object4).N.append((Item)new StringItem("", string3));
                            ((bg)object4).O = new Command("\u63d0\u4ea4", 4, 0);
                            ((bg)object4).P = new Command("\u8fd4\u56de", 2, 0);
                            ((bg)object4).N.addCommand(((bg)object4).O);
                            ((bg)object4).N.addCommand(((bg)object4).P);
                            ((bg)object4).N.setCommandListener((CommandListener)object4);
                        }
                        display.setCurrent((Displayable)((bg)object).N);
                        ((bg)object).M = ((bg)object).a;
                        ((bg)object).a = (byte)8;
                        break;
                    }
                    ((bg)object3).f();
                    ((bg)object3).a("\u91d1\u989d\u8f93\u5165\u9519\u8bef\uff01", (byte)0);
                    return;
                }
                if (((String)object).equals("\u4f59\u989d\u67e5\u8be2")) {
                    ((bg)object3).f();
                    ((bg)object3).c(((bg)object3).h.a());
                    return;
                }
                ((bg)object3).f();
                ((bg)object3).a();
                return;
            }
            case 8: {
                if (((bg)object3).M != 7) break;
                if (((String)object).equals("\u63d0\u4ea4")) {
                    object = ((bg)object3).I.getString();
                    String string = ((bg)object3).J.getString();
                    object2 = object;
                    object = object3;
                    if (z.a((String)object2)) {
                        super.a("\u8d2d\u4e70\u6570\u91cf\u4e0d\u80fd\u4e3a\u7a7a", (byte)0);
                    } else if (!bj.b((String)object2)) {
                        super.a("\u8d2d\u4e70\u6570\u91cf\u5fc5\u987b\u4e3a\u6570\u5b57", (byte)0);
                    } else if (z.f((String)object2) <= 0 || z.f((String)object2) > 100) {
                        super.a("\u8d2d\u4e70\u6570\u91cf\u5fc5\u987b\u57281~100\u4e4b\u95f4\uff01", (byte)0);
                    } else {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append(bb.g);
                        stringBuffer.append(':');
                        stringBuffer.append(bb.h);
                        stringBuffer.append(':');
                        stringBuffer.append((String)object2);
                        stringBuffer.append(':');
                        stringBuffer.append(string);
                        w w3 = bz.a((byte)2, (byte)6, stringBuffer.toString());
                        if (w3 != null) {
                            com.yinhan.kjava.main.a.i.a(w3);
                            ((bg)object).h.a.a();
                            ((bg)object).h.a.a.a("\u8bf7\u6c42\u4e2d...");
                        }
                        stringBuffer.delete(0, stringBuffer.capacity());
                    }
                    ((bg)object3).g();
                    ((bg)object3).f();
                    return;
                }
                ((bg)object3).f();
                ((bg)object3).g();
                ((bg)object3).a(((bg)object3).h.a(), 1);
                return;
            }
            case 5: {
                ((bg)object3).e();
                if (((String)object).equals("\u8fd4\u56de")) {
                    if (((bg)object3).b == 3) {
                        ((bg)object3).a(((bg)object3).h.a(), bb.j, bb.i, 0);
                        return;
                    }
                    if (((bg)object3).b == 11) break;
                    if (((bg)object3).b == 4) {
                        ((bg)object3).a(((bg)object3).h.a(), bb.c);
                        return;
                    }
                    if (((bg)object3).b == 6) {
                        ((bg)object3).e(((bg)object3).h.a());
                        return;
                    }
                    if (((bg)object3).b != 10) break;
                    ((bg)object3).b(((bg)object3).h.a());
                    return;
                }
                if (((String)object).equals("\u767b\u5f55")) {
                    ((bg)object3).a(((bg)object3).h.a(), bb.j, bb.i, 0);
                    return;
                }
                if (((String)object).equals("\u6ce8\u518c")) {
                    ((bg)object3).a(((bg)object3).h.a(), bb.c);
                    return;
                }
                if (((String)object).equals("\u77ed\u4fe1\u6ce8\u518c") || !((String)object).equals("\u9000\u51fa")) break;
                ((bg)object3).h.c();
                return;
            }
            case 6: {
                Object object3;
                if (((String)object).equals("\u63d0\u4ea4")) {
                    object = object3;
                    int n3 = ((bg)object).R.getSelectedIndex() + 1;
                    if (n3 == 2) {
                        n3 = 3;
                    }
                    String string = ((bg)object).S.getString();
                    String string4 = ((bg)object).T.getString();
                    int n4 = Integer.parseInt(X[((bg)object).U.getSelectedIndex()].trim());
                    if (z.a(string)) {
                        super.a("\u60a8\u6ca1\u6709\u8f93\u5165\u5361\u53f7\uff0c\u8bf7\u8fd4\u56de\u91cd\u65b0\u8f93\u5165", (byte)2);
                        break;
                    }
                    if (!bj.b(string)) {
                        super.a("\u5145\u503c\u5361\u5e8f\u53f7\u6709\u8bef\uff01", (byte)2);
                        break;
                    }
                    if (z.a(string4)) {
                        super.a("\u60a8\u6ca1\u6709\u8f93\u5165\u5145\u503c\u5361\u5bc6\u7801\uff0c\u8bf7\u8fd4\u56de\u91cd\u65b0\u8f93\u5165", (byte)2);
                        break;
                    }
                    if (!bj.b(string4)) {
                        super.a("\u5145\u503c\u5361\u5bc6\u7801\u6709\u8bef\uff01", (byte)2);
                        break;
                    }
                    object3 = new StringBuffer();
                    ((StringBuffer)object3).append(bb.g);
                    ((StringBuffer)object3).append(':');
                    ((StringBuffer)object3).append(bb.h);
                    ((StringBuffer)object3).append(':');
                    ((StringBuffer)object3).append(n3);
                    ((StringBuffer)object3).append(':');
                    ((StringBuffer)object3).append(string);
                    ((StringBuffer)object3).append(':');
                    ((StringBuffer)object3).append(string4);
                    ((StringBuffer)object3).append(':');
                    ((StringBuffer)object3).append(n4);
                    w w4 = bz.a((byte)2, (byte)5, ((StringBuffer)object3).toString());
                    if (w4 != null) {
                        com.yinhan.kjava.main.a.i.a(w4);
                        ((bg)object).h.a.a();
                        ((bg)object).h.a.a.a("\u8bf7\u6c42\u4e2d...");
                    }
                    ((StringBuffer)object3).delete(0, ((StringBuffer)object3).capacity());
                    return;
                }
                if (((String)object).equals("\u4f59\u989d\u67e5\u8be2")) {
                    ((bg)object3).h();
                    ((bg)object3).c(((bg)object3).h.a());
                    return;
                }
                if (((String)object).equals("\u5145\u503c\u5e2e\u52a9")) {
                    ((bg)object3).f();
                    ((bg)object3).a(((bg)object3).h.a(), "\u5145\u503c\u5e2e\u52a9", null, bb.e);
                    return;
                }
                if (!((String)object).equals("\u8fd4\u56de\u6e38\u620f")) break;
                ((bg)object3).h();
                ((bg)object3).a();
                return;
            }
            case 9: {
                Object object3;
                if (((String)object).equals("\u63d0\u4ea4")) {
                    object = object3;
                    int n5 = 0;
                    n5 = ((bg)object).Z.getSelectedIndex() == 0 ? 1 : (((bg)object).Z.getSelectedIndex() == 1 ? 2 : 3);
                    String string = ((bg)object).aa.getString();
                    String string5 = ((bg)object).ab.getString();
                    if (z.a(string)) {
                        super.a("\u5e10\u53f7\u4e0d\u80fd\u4e3a\u7a7a\uff01", (byte)2);
                        break;
                    }
                    if (n5 == 1 && !z.c(string)) {
                        super.a("\u7528\u6237\u540d\u53ea\u80fd\u4e3a\u6570\u5b57\u548c\u5b57\u6bcd\u7684\u7ec4\u5408\u5f62\u5f0f", (byte)2);
                        break;
                    }
                    if (n5 == 1 && !z.a(string, 4, 10)) {
                        super.a("\u7528\u6237\u540d\u4e3a4-10 \u7684\u6570\u5b57\u548c\u5b57\u6bcd\u7684\u7ec4\u5408", (byte)2);
                        break;
                    }
                    if (n5 == 2 && !z.e(string)) {
                        super.a("\u624b\u673a\u53f7\u4e0d\u5408\u7b26\u89c4\u8303\uff0c\u5e94\u4e3a11\u4f4d\u6570\u5b57", (byte)2);
                        break;
                    }
                    if (n5 == 3 && !z.d(string)) {
                        super.a("ID \u5e94\u4e3a\u6570\u5b57", (byte)2);
                        break;
                    }
                    if (z.a(string5)) {
                        super.a("\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a", (byte)2);
                        break;
                    }
                    if (!z.c(string5)) {
                        super.a("\u5bc6\u7801\u53ea\u80fd\u4e3a\u6570\u5b57\u548c\u5b57\u6bcd\u7684\u7ec4\u5408", (byte)0);
                        break;
                    }
                    if (!z.a(string5, 6, 12)) {
                        super.a("\u5bc6\u7801\u987b\u4e3a6\uff5e12\u4f4d\u7684\u5b57\u6bcd\u548c\u6570\u5b57", (byte)0);
                        break;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(bb.g);
                    stringBuffer.append(':');
                    stringBuffer.append(bb.h);
                    stringBuffer.append(':');
                    stringBuffer.append(n5);
                    stringBuffer.append(':');
                    stringBuffer.append(string);
                    stringBuffer.append(':');
                    stringBuffer.append(string5);
                    object3 = bz.a((byte)2, (byte)7, stringBuffer.toString());
                    if (object3 != null) {
                        com.yinhan.kjava.main.a.i.a((w)object3);
                        ((bg)object).h.a.a();
                        ((bg)object).h.a.a.a("\u8bf7\u6c42\u4e2d...");
                    }
                    stringBuffer.delete(0, stringBuffer.capacity());
                    return;
                }
                if (((String)object).equals("\u5145\u503c")) {
                    ((bg)object3).j();
                    ((bg)object3).e(((bg)object3).h.a());
                    return;
                }
                if (!((String)object).equals("\u8fd4\u56de\u6e38\u620f")) break;
                ((bg)object3).j();
                ((bg)object3).a();
                return;
            }
            case 10: {
                Object object3;
                if (((String)object).equals("\u63d0\u4ea4")) {
                    object = object3;
                    int n6 = ((bg)object).R.getSelectedIndex() + 1;
                    if (n6 == 2) {
                        n6 = 3;
                    }
                    String string = ((bg)object).S.getString();
                    String string6 = ((bg)object).T.getString();
                    int n7 = z.f(X[((bg)object).U.getSelectedIndex()].trim());
                    ((bg)object).V.getString();
                    if (z.a(string)) {
                        super.a("\u60a8\u6ca1\u6709\u8f93\u5165\u5361\u53f7\uff0c\u8bf7\u8fd4\u56de\u91cd\u65b0\u8f93\u5165", (byte)2);
                        break;
                    }
                    if (!bj.b(string)) {
                        super.a("\u5145\u503c\u5361\u5e8f\u53f7\u6709\u8bef\uff01", (byte)2);
                        break;
                    }
                    if (z.a(string6)) {
                        super.a("\u60a8\u6ca1\u6709\u8f93\u5165\u5145\u503c\u5361\u5bc6\u7801\uff0c\u8bf7\u8fd4\u56de\u91cd\u65b0\u8f93\u5165", (byte)2);
                        break;
                    }
                    if (!bj.b(string6)) {
                        super.a("\u5145\u503c\u5361\u5bc6\u7801\u6709\u8bef\uff01", (byte)2);
                        break;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(bb.g);
                    stringBuffer.append(':');
                    stringBuffer.append(bb.h);
                    stringBuffer.append(':');
                    stringBuffer.append(n6);
                    stringBuffer.append(':');
                    stringBuffer.append(string);
                    stringBuffer.append(':');
                    stringBuffer.append(string6);
                    stringBuffer.append(':');
                    stringBuffer.append(n7);
                    object3 = null;
                    object3 = t.x ? bz.a((byte)3, (byte)8, stringBuffer.toString()) : bz.a((byte)2, (byte)8, stringBuffer.toString());
                    if (object3 != null) {
                        com.yinhan.kjava.main.a.i.a((w)object3);
                        ((bg)object).h.a.a();
                        ((bg)object).h.a.a.a("\u8bf7\u6c42\u4e2d...");
                    }
                    stringBuffer.delete(0, stringBuffer.capacity());
                    return;
                }
                if (((String)object).equals("\u5145\u503c\u5e2e\u52a9")) {
                    ((bg)object3).f();
                    ((bg)object3).a(((bg)object3).h.a(), "\u5145\u503c\u5e2e\u52a9", null, bb.f);
                    return;
                }
                if (!((String)object).equals("\u8fd4\u56de\u6e38\u620f")) break;
                ((bg)object3).i();
                ((bg)object3).a();
                return;
            }
            case 15: {
                Object object3;
                if (((String)object).equals("\u786e\u5b9a")) {
                    object = ((bg)object3).D.getString();
                    object2 = ((bg)object3).E.getString();
                    Object object5 = ((bg)object3).F.getString();
                    String string = object5;
                    object5 = object2;
                    object2 = object;
                    object = object3;
                    if (z.a((String)object5)) {
                        super.a("\u65e7\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a", (byte)0);
                        break;
                    }
                    if (z.a(string)) {
                        super.a("\u65b0\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a", (byte)0);
                        break;
                    }
                    if (!z.c(string)) {
                        super.a("\u65b0\u5bc6\u7801\u987b\u4e3a\u6570\u5b57\u548c\u5b57\u6bcd\u7684\u7ec4\u5408", (byte)0);
                        break;
                    }
                    if (!z.a(string, 6, 12)) {
                        super.a("\u65b0\u5bc6\u7801\u987b\u4e3a6-12\u7684\u6570\u5b57\u548c\u5b57\u6bcd\u7684\u7ec4\u5408\u5f62\u5f0f", (byte)0);
                        break;
                    }
                    if (!bj.c(string)) {
                        super.a("\u65b0\u5bc6\u7801\u53ea\u5141\u8bb8\u5b57\u6bcd\u548c\u6570\u5b57", (byte)0);
                        break;
                    }
                    int n8 = bb.l == 2 ? 3 : (bb.l == 1 ? 2 : (bb.l == 0 ? 1 : 0));
                    object3 = new StringBuffer();
                    ((StringBuffer)object3).append(n8);
                    ((StringBuffer)object3).append(':');
                    ((StringBuffer)object3).append((String)object2);
                    ((StringBuffer)object3).append(':');
                    ((StringBuffer)object3).append((String)object5);
                    ((StringBuffer)object3).append(':');
                    ((StringBuffer)object3).append(string);
                    w w5 = bz.a((byte)1, (byte)4, ((StringBuffer)object3).toString());
                    if (w5 != null) {
                        ((bg)object).h.a(w5);
                        ((bg)object).h.a.a();
                        ((bg)object).h.a.a.a("\u8bf7\u6c42\u4e2d...");
                    }
                    ((StringBuffer)object3).delete(0, ((StringBuffer)object3).capacity());
                    return;
                }
                if (!((String)object).equals("\u8fd4\u56de")) break;
                object = object3;
                ((bg)object3).C = null;
                ((bg)object).E = null;
                ((bg)object).F = null;
                ((bg)object).D = null;
                ((bg)object3).a();
                return;
            }
            default: {
                if (((String)object).equals("\u8fd4\u56de")) {
                    if (((bg)object3).b == 3) {
                        ((bg)object3).a(((bg)object3).h.a(), bb.m, bb.n, 0);
                        return;
                    }
                    if (((bg)object3).b == 12) {
                        ((bg)object3).d(((bg)object3).h.a());
                        return;
                    }
                    if (((bg)object3).b == 11) break;
                    if (((bg)object3).b == 4) {
                        ((bg)object3).a(((bg)object3).h.a(), bb.c);
                        return;
                    }
                    if (((bg)object3).b == 6) {
                        ((bg)object3).e(((bg)object3).h.a());
                        return;
                    }
                    if (((bg)object3).b != 10) break;
                    ((bg)object3).b(((bg)object3).h.a());
                    return;
                }
                if (((String)object).equals("\u767b\u5f55")) {
                    ((bg)object3).a(((bg)object3).h.a(), bb.m, bb.n, 0);
                    return;
                }
                if (((String)object).equals("\u6ce8\u518c")) {
                    ((bg)object3).a(((bg)object3).h.a(), bb.c);
                    return;
                }
                if (((String)object).equals("\u77ed\u4fe1\u6ce8\u518c") || !((String)object).equals("\u9000\u51fa")) break;
                ((bg)object3).h.c();
            }
        }
    }

    private void k() {
        String string = this.n.getString();
        String string2 = this.o.getString();
        byte by2 = bg.a(this.m);
        if (z.a(string)) {
            bb.m = string;
            this.a(ac, (byte)0);
            return;
        }
        if (bg.a(this.m) == 0 && !z.a(string, 4, 12)) {
            bb.m = string;
            this.a(ac, (byte)0);
            return;
        }
        if (bg.a(this.m) == 1 && !z.e(string.trim())) {
            bb.m = string;
            this.a(ad, (byte)0);
            return;
        }
        if (!(bg.a(this.m) != 2 || z.d(string.trim()) && z.a(string, 4, 12))) {
            bb.m = string;
            this.a(ae, (byte)0);
            return;
        }
        if (z.a(string2)) {
            bb.m = string;
            this.a(af, (byte)0);
            return;
        }
        if (bg.a(this.m) == 2 || bg.a(this.m) == 1 || bg.a(this.m) == 0) {
            bb.n = string2;
            int n2 = bg.a(this.m) == 2 ? 3 : (bg.a(this.m) == 1 ? 2 : (bg.a(this.m) == 0 ? 1 : 0));
            bb.l = (byte)n2;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(n2);
            stringBuffer.append(':');
            stringBuffer.append(string);
            stringBuffer.append(':');
            stringBuffer.append(string2);
            w w2 = bz.a((byte)1, (byte)1, stringBuffer.toString());
            if (w2 != null) {
                bb.m = com.yinhan.kjava.main.a.am = string;
                bb.n = com.yinhan.kjava.main.a.an = string2;
                bb.l = com.yinhan.kjava.main.a.ao = by2;
                bb.k = com.yinhan.kjava.main.a.ap = this.p.isSelected(0);
                bb.b();
                this.h.a(w2);
                this.h.a.a();
                this.h.a.a.a("\u8bf7\u6c42\u4e2d...");
            }
            stringBuffer.delete(0, stringBuffer.capacity());
        }
    }

    private static byte a(ChoiceGroup choiceGroup) {
        if (choiceGroup == null) {
            return 0;
        }
        return (byte)choiceGroup.getSelectedIndex();
    }
}


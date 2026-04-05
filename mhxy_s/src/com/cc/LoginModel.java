package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.*;

//public final class bg implements CommandListener {
public final class LoginModel implements CommandListener {
    private byte currentFormId = -1;
    private byte lastFormId = -1;

    private final LoginUiController loginUiController;

    private static String[] tipsTitle = new String[]{"错误", "警告", "温馨提示", "错误", "温馨提示"};
    //提示表单
    private Form tipsForm = null;
    private StringItem tipsDesc;

    //登录
    private Form loginForm = null;
    private ChoiceGroup loginTypechoiceGroup;
    private TextField zhanghaoTF = null;
    private TextField pwdTF = null;
    private ChoiceGroup rememberPwdChoiceGroup;

    private Form changePwdForm = null;
    private TextField changePwdZH = null;
    private TextField changePwdOld = null;
    private TextField changePwdNew = null;


    public LoginModel(LoginUiController var1) {
        this.loginUiController = var1;
    }

    public void startGame() {
        if (this.currentFormId != 2) {
            this.lastFormId = this.currentFormId;
        }

        this.currentFormId = 1;
        this.loginUiController.startGame();
    }

    private void showTips(String tips, byte type) {
        if (type == 3) {
            this.showTipsForm(tips, type, new Command("退出", 7, 0), null);
        } else if (type == 4) {
            this.showTipsForm(tips, type, (Command) null, null);
        } else {
            this.showTipsForm(tips, type, new Command("返回", 2, 0), null);
        }
    }

    private void showTipsForm(String desc, byte title, Command action, Command[] var4) {
        if (this.tipsForm != null) {
            this.clearTipsForm();
        }

        this.tipsForm = new Form(tipsTitle[title]);
        this.tipsDesc = new StringItem(null, desc);
        this.tipsForm.append(this.tipsDesc);
        if (action != null) {
            this.tipsForm.addCommand(action);
        }

        this.tipsForm.setCommandListener(this);
        this.loginUiController.getDisplay().setCurrent(this.tipsForm);
        if (this.currentFormId != 2) {
            this.lastFormId = this.currentFormId;
        }

        this.currentFormId = 2;
    }

    private void clearTipsForm() {
        this.tipsForm = null;
        this.tipsDesc = null;
    }

    public void showLoginForm(Display display, String zhanghao, String pwd, int pwdType) {
        if (this.loginForm != null) {
            this.clearLoginForm();
        }

        this.loginForm = new Form("登录一哥哥通行证");
        //choiceType 决定是单选、多选、下拉
        this.loginTypechoiceGroup = new ChoiceGroup("方式:", 4, new String[]{"用户名", "手机号", "ID"}, null);
        this.loginTypechoiceGroup.setSelectedIndex(MainCanvas.loginType, true);
        this.loginForm.append(this.loginTypechoiceGroup);

        this.zhanghaoTF = new TextField("通行证:", zhanghao, 12, 0);
        if (pwdType == 0) {
            this.pwdTF = new TextField("密    码:", MainCanvas.rememberPwd ? pwd : null, 12, 0);
        } else if (pwdType == 3) {
            this.pwdTF = new TextField("密    码:", pwd, 12, 0);
        } else {
            this.pwdTF = new TextField("密    码:", pwd, 12, 0);
        }
        this.loginForm.append(this.zhanghaoTF);
        this.loginForm.append(this.pwdTF);

        this.rememberPwdChoiceGroup = new ChoiceGroup(null, 2, new String[]{"保存密码"}, (Image[]) null);
        this.rememberPwdChoiceGroup.setSelectedFlags(new boolean[]{MainCanvas.rememberPwd});
        this.loginForm.append(this.rememberPwdChoiceGroup);

        this.loginForm.addCommand(new Command("提交", 4, 0));
        this.loginForm.addCommand(new Command("返回", 2, 1));
        this.loginForm.setCommandListener(this);

        if (ChongZhiModel.rememberPwd) {
            this.rememberPwdChoiceGroup.setSelectedIndex(0, true);
        }

        if (this.loginForm != null) {
            display.setCurrent(this.loginForm);
        }

        if (this.currentFormId != 2) {
            this.lastFormId = this.currentFormId;
        }

        this.currentFormId = 3;
    }

    public void clearLoginForm() {
        this.rememberPwdChoiceGroup = null;
        this.loginTypechoiceGroup = null;
        this.loginForm = null;
        this.zhanghaoTF = null;
        this.pwdTF = null;
    }

    //展示注册
//    public void showZhuCe(Display var1, String var2, String var3) {
//        this.currentFormId = 13;
//    }

    //"请修改您的帐号信息" : "注册一哥哥通行证"
//    public void a(Display var1, boolean var2) {
//        this.currentFormId = 4;
//    }


    public void showChangePwd(Display var1) {
        this.changePwdForm = new Form("修改密码");
        this.changePwdZH = new TextField("账号:", "", 12, 0);
        this.changePwdOld = new TextField("原密码:", "", 12, 0);
        this.changePwdNew = new TextField("新密码:", "", 12, 0);
        this.changePwdForm.append(this.changePwdZH);
        this.changePwdForm.append(this.changePwdOld);
        this.changePwdForm.append(this.changePwdNew);
        this.changePwdForm.append(new StringItem(null, "注意：密码仅允许6-12位的数字和字母。"));
        this.changePwdForm.addCommand(new Command("返回", 2, 1));
        this.changePwdForm.addCommand(new Command("确定", 4, 0));
        this.changePwdForm.setCommandListener(this);
        if (this.changePwdForm != null) {
            var1.setCurrent(this.changePwdForm);
        }

        if (this.currentFormId != 2) {
            this.lastFormId = this.currentFormId;
        }

        this.currentFormId = 15;
    }

    private void clearChangePwd() {
        this.changePwdForm = null;
        this.changePwdOld = null;
        this.changePwdNew = null;
        this.changePwdZH = null;
    }

    //展示充值帮助表单
//    private void showChongzhi(Display var1, String title, String[] var3, String[] var4) {
//        this.currentFormId = 5;
//    }


//    public final void 银元购买金豆数量(Display var1, int var2) {
//        this.currentFormId = 7;
//    }

    // 充值中心 1元=1银元
//    private void e(Display var1) {
//        this.currentFormId = 6;
//    }


    //充值中心 金豆
//    public final void b(Display var1) {
//        this.currentFormId = 10;
//    }

    //余额查询
//    public final void showYuEChaXun(Display var1) {
//        this.currentFormId = 9;
//    }


    public void commandAction(Command cmd, Displayable displayable) {
        String label = cmd.getLabel();
        if (label != null) {
            switch (this.currentFormId) {
                case 2: //tips 表单
                    if (label.equals("退出")) {
                        this.loginUiController.destroy();
                        return;
                    }

                    if (label.equals("返回游戏")) {
                        this.loginUiController.startGame();
                        return;
                    }

                    switch (this.lastFormId) {
                        case 1:
                            this.clearTipsForm();
                            this.startGame();
                            return;
                        case 3: //登录页
                            this.clearTipsForm();
                            if (this.lastFormId == -1) {
                                this.loginUiController.destroy();
                            } else {
                                this.showLoginForm(this.loginUiController.getDisplay(), ChongZhiModel.zhanghao, ChongZhiModel.pwd, 0);
                            }

                            return;
                        case 15: //showChangePwd
                            this.clearTipsForm();
                            this.showChangePwd(this.loginUiController.getDisplay());
                            return;
                        default:
                            return;
                    }

                case 3: //登录表单
                    String var33 = this.zhanghaoTF.getString();
                    String var43 = this.pwdTF.getString();
                    byte var50 = getChoiceGroupSelected(this.loginTypechoiceGroup);
                    if (label.equals("提交")) {
                        if (var50 == 0) {
                            if (var33.equals("") || var33.length() < 4) {
                                this.showTips((String) "通行证用户名输入错误，请重新输入", (byte) 2);
                                return;
                            }
                        } else if (var50 == 1) {
                            if (var33.equals("") || var33.length() < 11) {
                                this.showTips((String) "通行证请输入11位手机号码，请重新输入", (byte) 2);
                                return;
                            }
                        } else if (var50 == 2 && (var33.equals("") || var33.length() < 4)) {
                            this.showTips((String) "通行证ID号输入长度错误，请重新输入", (byte) 2);
                            return;
                        }

                        if (!var43.equals("") && var43.length() >= 6) {
                            this.doLogin();
                            return;
                        }

                        this.showTips((String) "密码错误，请重新输入", (byte) 2);
                        return;
                    }

                    if (label.equals("返回")) {
                        this.clearLoginForm();
                        this.startGame();
                        return;
                    }
                    break;
                case 15: //showChangePwd
                    if (label.equals("确定")) {
                        label = this.changePwdZH.getString();
                        String var23 = this.changePwdOld.getString();
                        String var3 = this.changePwdNew.getString();
                        String var4 = var3;
                        var3 = var23;
                        var23 = label;
                        LoginModel var15 = this;
                        if (ZhangHaoUtils.empty(var3)) {
                            this.showTips((String) "旧密码不能为空", (byte) 0);
                        } else if (ZhangHaoUtils.empty(var4)) {
                            this.showTips((String) "新密码不能为空", (byte) 0);
                        } else if (!ZhangHaoUtils.c(var4)) {
                            this.showTips((String) "新密码须为数字和字母的组合", (byte) 0);
                        } else if (!ZhangHaoUtils.lengthCheck(var4, 6, 12)) {
                            this.showTips((String) "新密码须为6-12的数字和字母的组合形式", (byte) 0);
                        } else {
                            if (RecordStoreUtil.c(var4)) {
                                int var5 = ChongZhiModel.loginType == 2 ? 3 : (ChongZhiModel.loginType == 1 ? 2 : (ChongZhiModel.loginType == 0 ? 1 : 0));
                                StringBuffer var7;
                                (var7 = new StringBuffer()).append(var5);
                                var7.append(':');
                                var7.append(var23);
                                var7.append(':');
                                var7.append(var3);
                                var7.append(':');
                                var7.append(var4);
                                NetPacket var6;
                                if ((var6 = NetPayloadBuilder.buildLogin((byte) 1, (byte) 4, var7.toString())) != null) {
                                    var15.loginUiController.sendFirstPacket(var6);
                                    var15.loginUiController.mainMidlet.start();
                                    var15.loginUiController.mainMidlet.mainCanvas.showPending("请求中...");
                                }

                                var7.delete(0, var7.capacity());
                                return;
                            }

                            this.showTips((String) "新密码只允许字母和数字", (byte) 0);
                        }
                    } else if (label.equals("返回")) {
                        clearChangePwd();
                        this.startGame();
                        return;
                    }
                default:
                    if (label.equals("返回")) {
                        if (this.lastFormId == 3) {
                            this.showLoginForm(this.loginUiController.getDisplay(), ChongZhiModel.zhanghao, ChongZhiModel.pwd, 0);
                            return;
                        }
                    } else {
                        if (label.equals("登录")) {
                            this.showLoginForm(this.loginUiController.getDisplay(), ChongZhiModel.zhanghao, ChongZhiModel.pwd, 0);
                            return;
                        }
                        if (label.equals("退出")) {
                            this.loginUiController.destroy();
                        }
                    }
                    break;
            }

        }
    }

    private void doLogin() {
        String zhanghao = this.zhanghaoTF.getString();
        String pwd = this.pwdTF.getString();
        byte loginType = getChoiceGroupSelected(this.loginTypechoiceGroup);
        if (ZhangHaoUtils.empty(zhanghao)) {
            ChongZhiModel.zhanghao = zhanghao;
            this.showTips((String) "通行证用户名输入错误，请重新输入!", (byte) 0);
        } else if (getChoiceGroupSelected(this.loginTypechoiceGroup) == 0 && !ZhangHaoUtils.lengthCheck(zhanghao, 4, 12)) {
            ChongZhiModel.zhanghao = zhanghao;
            this.showTips((String) "通行证用户名输入错误，请重新输入!", (byte) 0);
        } else if (getChoiceGroupSelected(this.loginTypechoiceGroup) == 1 && !ZhangHaoUtils.e(zhanghao.trim())) {
            ChongZhiModel.zhanghao = zhanghao;
            this.showTips((String) "通行证请输入11位手机号码，请重新输入!", (byte) 0);
        } else if (getChoiceGroupSelected(this.loginTypechoiceGroup) == 2 && (!ZhangHaoUtils.checkNumber(zhanghao.trim()) || !ZhangHaoUtils.lengthCheck(zhanghao, 4, 12))) {
            ChongZhiModel.zhanghao = zhanghao;
            this.showTips((String) "通行证ID号输入长度错误，请重新输入", (byte) 0);
        } else if (ZhangHaoUtils.empty(pwd)) {
            ChongZhiModel.zhanghao = zhanghao;
            this.showTips((String) "密码错误，请重新输入", (byte) 0);
        } else if (getChoiceGroupSelected(this.loginTypechoiceGroup) == 2 || getChoiceGroupSelected(this.loginTypechoiceGroup) == 1 || getChoiceGroupSelected(this.loginTypechoiceGroup) == 0) {
            ChongZhiModel.pwd = pwd;
            int type;
            ChongZhiModel.loginType = (byte) (type = getChoiceGroupSelected(this.loginTypechoiceGroup) == 2 ? 3 : (getChoiceGroupSelected(this.loginTypechoiceGroup) == 1 ? 2 : (getChoiceGroupSelected(this.loginTypechoiceGroup) == 0 ? 1 : 0)));
            StringBuffer zhanghaoPwd = new StringBuffer();
            zhanghaoPwd.append(type);
            zhanghaoPwd.append(':');
            zhanghaoPwd.append(zhanghao);
            zhanghaoPwd.append(':');
            zhanghaoPwd.append(pwd);
            NetPacket netPacket = NetPayloadBuilder.buildLogin((byte) 1, (byte) 1, zhanghaoPwd.toString());
            if (netPacket != null) {
                MainCanvas.zhanghao = zhanghao;
                ChongZhiModel.zhanghao = zhanghao;
                MainCanvas.pwd = pwd;
                ChongZhiModel.pwd = pwd;
                MainCanvas.loginType = loginType;
                ChongZhiModel.loginType = loginType;
                ChongZhiModel.rememberPwd = MainCanvas.rememberPwd = this.rememberPwdChoiceGroup.isSelected(0);
                ChongZhiModel.saveZhangHaoPwd();
                this.loginUiController.sendFirstPacket(netPacket);
                this.loginUiController.mainMidlet.start();
                this.loginUiController.mainMidlet.mainCanvas.showPending("请求中...");
            }

            zhanghaoPwd.delete(0, zhanghaoPwd.capacity());
        }
    }

    private static byte getChoiceGroupSelected(ChoiceGroup var0) {
        return var0 == null ? 0 : (byte) var0.getSelectedIndex();
    }
}

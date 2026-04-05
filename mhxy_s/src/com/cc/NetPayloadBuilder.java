package com.cc;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * 网络请求包构建工厂类（原名混淆）
 * <p>
 * 职责：将游戏各类操作序列化为二进制网络数据包（byte[] 或 NetPacket），
 * 通过 DataOutputStream 按固定协议格式写入后发往游戏服务器。
 * <p>
 * 协议包格式（通用）：
 * [0xAE(-82)] [opcode: short] [业务参数...] [账号: bt_1.b] [密码/token: bt_1.d] [角色名] [0xAF(-81)]
 * <p>
 * 说明：
 * - 账号/密码随每个包携带，服务端对每个请求独立鉴权（无状态设计）
 * - 握手包（opcode=6400）例外，携带渠道号、内存大小、设备型号等建连信息
 * - 全部方法均为 public static，无需实例化
 * - 大量同名重载方法（a/b/c...）通过参数签名区分不同协议，是混淆后的典型特征
 * <p>
 * 覆盖模块：登录/心跳、角色移动、战斗、物品/仓库、装备（打孔/升星/洗炼/附魔）、
 * 拍卖、宠物、聊天/好友、帮派全系统、婚姻、住宅、角色/宠物洗点等
 */
//public final class bz_1 {
public final class NetPayloadBuilder {
    /**
     * 协议相关常量（可能为超时/重试参数）
     */
    public static byte hands1 = 90;
    /**
     * 协议相关常量
     */
    public static byte hands2 = 72;
    /**
     * 协议相关常量 正式包-49 测试包-162
     */
    public static int channelFlag = 162;

    /**
     * [opcode=6400] 握手/登录包（返回 NetPacket）
     * 携带渠道号、设备ID(bb_1.a/b)、内存大小、版本号、渠道子类型、服务器编号等建连信息。
     * 与其他方法不同，此包不含账号/角色信息，用于建立初始连接。
     */
    public static NetPacket buildLogin(byte var0, byte var1, String zhanghaoPwd) {
        try {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var3)).writeByte(-82);
            var4.writeShort(NetPacketCode.Login);
            var4.writeByte(var0);
            var4.writeInt(ChongZhiModel.CpId);
            var4.writeInt(ChongZhiModel.GameId);
            var4.writeUTF(GlobalConfig.PopularizeChannel);
            var4.writeUTF(GlobalConfig.model);
            var4.writeInt(-1);
            var4.writeByte(1);
            var4.writeByte(1);
            var4.writeByte(GlobalConfig.shuZiBiaoShi);
            var4.writeInt((int) Runtime.getRuntime().totalMemory());
            var4.writeByte(var1);
            var4.writeUTF(zhanghaoPwd);
            var4.writeByte(-81);
            return new NetPacket(NetPacketCode.Login, var3.toByteArray());
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    /**
     * 构建代理服务器包头（包类型=1），格式：[1][var1: int][0][0]
     * 用于通过代理服务器转发时的包头封装。
     */
    public static byte[] buildProxy(byte var0, int var1, int var2, int var3) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var6;
            (var6 = new DataOutputStream(var5)).writeByte(1);
            GlobalConfig.printStr("代理服务器包头: " + 1 + "|" + var1 + "|" + 0 + "|" + 0);
            var6.writeInt(var1);
            var6.writeInt(0);
            var6.writeInt(0);
            return var5.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=4098] 账号登录请求，携带渠道子类型(r)、服务器编号(s)、账号、密码。
     * var1=账号, var2=密码, var3=角色名（此处var2/var3均为账号密码相关字符串）
     */
    public static byte[] buildLogin(short var0, String var1, String var2, String var3) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var4)).writeByte(-82);
            var5.writeShort(var0);
            var5.writeByte(1);
            var5.writeByte(1);
            var5.writeUTF(var1);
            var5.writeUTF(var2);
            var5.writeUTF(var3);
            var5.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=4195] 战斗操作请求，携带操作类型(var2)、坐标x(var3)、坐标y(var4)、账号、密码、角色名。
     */
    public static byte[] a(short var0, String var1, byte var2, short var3, short var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4195);
            var5.writeByte(var2);
            var5.writeShort(var3);
            var5.writeShort(var4);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=4098] 账号登录请求（双字符串变体），写入顺序：var2（密码）、var1（账号）。
     */
    public static byte[] a(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4098);
            var3.writeUTF(var2);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=var0] 携带两个 byte 参数的通用请求，格式：[opcode][var1: UTF][var2: byte][var3: byte][账号][密码][角色名]
     */
    public static byte[] a(short var0, String var1, byte var2, byte var3) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var4)).writeByte(-82);
            var5.writeShort(var0);
            var5.writeUTF(var1);
            var5.writeByte(var2);
            var5.writeByte(var3);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=4100] 进入游戏/选择角色请求。
     */
    public static byte[] a(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4100);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=4103] 登录请求（附带屏幕分辨率：defaultWidth/defaultHigh）。
     */
    public static byte[] b(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4103);
            var2.writeShort(GlobalConfig.defaultWidth);
            var2.writeShort(GlobalConfig.defaultHigh);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] buildSelectRolePacket(short var0, String roleId) {
        try {
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var2)).writeByte(-82);
            var3.writeShort(var0);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(roleId);
            var3.writeByte(-81);
            return var2.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=4641] 切换服务器/重连请求。
     */
    public static byte[] d(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4641);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=4194] 物品使用请求，var2==1 时写入 0，否则写入 1（取反逻辑）。
     */
    public static byte[] a(short var0, String var1, byte var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4194);
            var3.writeByte(var2 == 1 ? 0 : 1);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=4608] 物品操作变体，var2==1 时写入 0，否则写入 1（取反逻辑）。
     */
    public static byte[] b(short var0, String var1, byte var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4608);
            var3.writeByte(var2 == 1 ? 0 : 1);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=var0] 物品操作变体（opcode 动态传入），var2==1 时写入 0，否则写入 1（取反逻辑）。
     */
    public static byte[] c(short var0, String var1, byte var2) {
        try {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var3)).writeByte(-82);
            var4.writeShort(var0);
            var4.writeByte(var2 == 1 ? 0 : 1);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var3.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=4610] 战斗操作变体，携带操作类型(var2)，var3==0 时写入 1，否则写入 0（取反逻辑）。
     */
    public static byte[] b(short var0, String var1, byte var2, byte var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4610);
            var4.writeByte(var2);
            var4.writeByte(var3 == 0 ? 1 : 0);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=5120] 物品操作变体，var2==1 时写入 0，否则写入 1（取反逻辑）。
     */
    public static byte[] d(short var0, String var1, byte var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(5120);
            var3.writeByte(var2 == 1 ? 0 : 1);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=5123] 物品/技能操作，固定写入 byte(1)。
     */
    public static byte[] e(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(5123);
            var2.writeByte(1);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=var0] 携带单个 int 参数的通用请求。
     */
    public static byte[] a(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var3)).writeByte(-82);
            var4.writeShort(var0);
            var4.writeInt(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var3.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=4352] 装备附魔请求，携带附魔类型(var2)。
     */
    public static byte[] e(short var0, String var1, byte var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4352);
            var3.writeByte(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    /**
     * [opcode=4101] 角色移动请求，携带坐标 x(var2)、y(var3)、方向(var4)。
     */
    public static byte[] a(short var0, String var1, int var2, int var3, short var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4101);
            var5.writeShort(var2);
            var5.writeShort(var3);
            var5.writeShort(var4);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, int var2, int var3, short var4, long var5) {
        try {
            ByteArrayOutputStream var9 = new ByteArrayOutputStream();
            DataOutputStream var7;
            (var7 = new DataOutputStream(var9)).writeByte(-82);
            var7.writeShort(4144);
            var7.writeShort(var2);
            var7.writeShort(var3);
            var7.writeShort(var4);
            var7.writeLong(var5);
            var7.writeUTF(GlobalStatus.zhangHao);
            var7.writeUTF(GlobalStatus.token);
            var7.writeUTF(var1);
            var7.writeByte(-81);
            return var9.toByteArray();
        } catch (IOException var8) {
            ((Throwable) var8).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0) {
        try {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var1;
            (var1 = new DataOutputStream(var3)).writeByte(-82);
            var1.writeShort(4630);
            var1.writeByte(-81);
            return var3.toByteArray();
        } catch (IOException var2) {
            ((Throwable) var2).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4105);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, int var2, byte var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4104);
            var4.writeInt(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] c(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4106);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, int var2, int var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4107);
            var4.writeInt(var2);
            var4.writeInt(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, short var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4140);
            var3.writeShort(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] d(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4132);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, String var1, int var2, int var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4108);
            var4.writeInt(var2);
            var4.writeInt(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] c(short var0, String var1, int var2, int var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4109);
            var4.writeInt(var2);
            var4.writeInt(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] e(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4133);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, int var2, int var3, byte var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4138);
            var5.writeInt(var2);
            var5.writeInt(var3);
            var5.writeByte(var4);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] d(short var0, String var1, int var2, int var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4139);
            var4.writeInt(var2);
            var4.writeShort(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, int var2, short var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4142);
            var4.writeInt(var2);
            var4.writeShort(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] e(short var0, String var1, int var2, int var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4157);
            var4.writeInt(var2);
            var4.writeByte((byte) var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] f(short var0, String var1, int var2, int var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4158);
            var4.writeInt(var2);
            var4.writeByte((byte) var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, long var2, byte var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4159);
            var5.writeLong(var2);
            var5.writeByte(var4);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, String var1, int var2, byte var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4135);
            var4.writeInt(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] f(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4136);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, String var2, byte var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4110);
            var4.writeUTF(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4111);
            var3.writeUTF(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] g(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4165);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] h(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4163);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] i(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4164);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] g(short var0, String var1, int var2, int var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4173);
            var4.writeInt(var2);
            var4.writeInt(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] h(short var0, String var1, int var2, int var3) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var4)).writeByte(-82);
            var5.writeShort(var0);
            var5.writeInt(var2);
            var5.writeInt(var3);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, byte var2, String var3, String var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4184);
            var5.writeByte(var2);
            var5.writeUTF(var3);
            var5.writeUTF(var4);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, String var2, short var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4112);
            var4.writeUTF(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, String var1, String var2, byte var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4124);
            var4.writeUTF(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] f(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4168);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] g(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4169);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, String var1, String var2, short var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4122);
            var4.writeUTF(var2);
            var4.writeShort(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] c(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4170);
            var3.writeUTF(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] c(short var0, String var1, String var2, short var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4123);
            var4.writeUTF(var2);
            var4.writeShort(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] d(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4171);
            var3.writeUTF(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, String var2, long var3) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4185);
            var5.writeUTF(var2);
            var5.writeLong(var3);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] c(short var0, String var1, String var2, byte var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4113);
            var4.writeUTF(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, String var1, short var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4115);
            var3.writeByte(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] e(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4114);
            var3.writeUTF(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] f(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4119);
            var3.writeUTF(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] h(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4120);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] i(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4121);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] j(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4177);
            var3.writeByte((byte) var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] k(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4161);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] f(short var0, String var1, byte var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4125);
            var3.writeByte(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, int var2, int var3, int var4) {
        if (var1 != null && !var1.equals("") && var2 >= 0 && var3 >= 0 && var3 <= 9 && var4 >= 0) {
            try {
                ByteArrayOutputStream var7 = new ByteArrayOutputStream();
                DataOutputStream var5;
                (var5 = new DataOutputStream(var7)).writeByte(-82);
                var5.writeShort(4126);
                var5.writeInt(var2);
                var5.writeByte((byte) var3);
                var5.writeByte((byte) var4);
                var5.writeUTF(GlobalStatus.zhangHao);
                var5.writeUTF(GlobalStatus.token);
                var5.writeUTF(var1);
                var5.writeByte(-81);
                return var7.toByteArray();
            } catch (IOException var6) {
                ((Throwable) var6).printStackTrace();
                return null;
            }
        } else {
            return null;
        }
    }

    public static byte[] c(short var0, String var1, byte var2, byte var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4134);
            var4.writeByte(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] i(short var0, String var1, int var2, int var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4172);
            var4.writeInt(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, long var2, int var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4127);
            var5.writeLong(var2);
            var5.writeByte(var4);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] g(short var0, String var1, byte var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4128);
            var3.writeByte(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] h(short var0, String var1, byte var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4129);
            var3.writeByte(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, int var2, int var3, long var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var8;
            (var8 = new DataOutputStream(var7)).writeByte(-82);
            var8.writeShort(4148);
            var8.writeInt(var2);
            var8.writeByte(1);
            var8.writeLong(var4);
            var8.writeUTF(GlobalStatus.zhangHao);
            var8.writeUTF(GlobalStatus.token);
            var8.writeUTF(var1);
            var8.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, String var1, int var2, int var3, long var4) {
        try {
            ByteArrayOutputStream var8 = new ByteArrayOutputStream();
            DataOutputStream var6;
            (var6 = new DataOutputStream(var8)).writeByte(-82);
            var6.writeShort(4152);
            var6.writeInt(var2);
            var6.writeByte((byte) var3);
            var6.writeLong(var4);
            var6.writeUTF(GlobalStatus.zhangHao);
            var6.writeUTF(GlobalStatus.token);
            var6.writeUTF(var1);
            var6.writeByte(-81);
            return var8.toByteArray();
        } catch (IOException var7) {
            ((Throwable) var7).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, String var2, String var3, int var4, int var5) {
        try {
            ByteArrayOutputStream var8 = new ByteArrayOutputStream();
            DataOutputStream var6;
            (var6 = new DataOutputStream(var8)).writeByte(-82);
            var6.writeShort(4147);
            var6.writeUTF(var2);
            var6.writeUTF(var3);
            var6.writeShort((short) var4);
            var6.writeByte((byte) var5);
            var6.writeUTF(GlobalStatus.zhangHao);
            var6.writeUTF(GlobalStatus.token);
            var6.writeUTF(var1);
            var6.writeByte(-81);
            return var8.toByteArray();
        } catch (IOException var7) {
            ((Throwable) var7).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, String var1, String var2, String var3, int var4, int var5) {
        try {
            ByteArrayOutputStream var8 = new ByteArrayOutputStream();
            DataOutputStream var6;
            (var6 = new DataOutputStream(var8)).writeByte(-82);
            var6.writeShort(4153);
            var6.writeUTF(var2);
            var6.writeUTF(var3);
            var6.writeShort((short) var4);
            var6.writeByte((byte) var5);
            var6.writeUTF(GlobalStatus.zhangHao);
            var6.writeUTF(GlobalStatus.token);
            var6.writeUTF(var1);
            var6.writeByte(-81);
            return var8.toByteArray();
        } catch (IOException var7) {
            ((Throwable) var7).printStackTrace();
            return null;
        }
    }

    public static byte[] l(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4154);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] m(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4149);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] n(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4151);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] o(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4162);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] p(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4155);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] q(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4167);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] j(short var0, String var1, int var2, int var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4166);
            var4.writeInt(var2);
            var4.writeInt(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] c(short var0, String var1, short var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4118);
            var3.writeShort(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, long var2, int var4, short var5, byte var6, int var7, byte var8, byte var9, short var10, int var11, byte var12, byte var13) {
        try {
            ByteArrayOutputStream var16 = new ByteArrayOutputStream();
            DataOutputStream var14;
            (var14 = new DataOutputStream(var16)).writeByte(-82);
            var14.writeShort(4180);
            var14.writeLong(var2);
            var14.writeInt(var4);
            var14.writeByte(var5);
            var14.writeByte(var6);
            var14.writeInt(var7);
            var14.writeByte(var8);
            var14.writeByte(var9);
            var14.writeByte(var10);
            var14.writeInt(var11);
            var14.writeByte(var12);
            var14.writeByte(var13);
            var14.writeUTF(GlobalStatus.zhangHao);
            var14.writeUTF(GlobalStatus.token);
            var14.writeUTF(var1);
            var14.writeByte(-81);
            return var16.toByteArray();
        } catch (IOException var15) {
            ((Throwable) var15).printStackTrace();
            return null;
        }
    }

    public static byte[] r(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4146);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] j(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4143);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, byte var2, byte var3, int var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4117);
            var5.writeByte(var2);
            var5.writeByte(var3);
            var5.writeInt(var4);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, int var2, byte var3, byte var4, int var5) {
        try {
            ByteArrayOutputStream var8 = new ByteArrayOutputStream();
            DataOutputStream var6;
            (var6 = new DataOutputStream(var8)).writeByte(-82);
            var6.writeShort(4193);
            var6.writeInt(var2);
            var6.writeByte(var3);
            var6.writeByte(var4);
            var6.writeInt(var5);
            var6.writeUTF(GlobalStatus.zhangHao);
            var6.writeUTF(GlobalStatus.token);
            var6.writeUTF(var1);
            var6.writeByte(-81);
            return var8.toByteArray();
        } catch (IOException var7) {
            ((Throwable) var7).printStackTrace();
            return null;
        }
    }

    public static byte[] s(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4145);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] k(short var0, String var1, int var2, int var3) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var4)).writeByte(-82);
            var5.writeShort(var0);
            var5.writeInt(var2);
            var5.writeShort(var3);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, short[] var2) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var6)).writeByte(-82);
            var3.writeShort(4186);

            for (byte var4 = 0; var4 < var2.length; ++var4) {
                var3.writeShort(var2[var4]);
            }

            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, int var2, short[] var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4187);
            var4.writeInt(var2);

            for (byte var7 = 0; var7 < var3.length; ++var7) {
                var4.writeShort(var3[var7]);
            }

            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, short[] var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4255);
            var3.writeShort(var1[0]);
            var3.writeShort(var1[1]);
            var3.writeShort(var1[2]);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var2);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, byte var2, int var3, short var4, short var5, String var6) {
        try {
            ByteArrayOutputStream var9 = new ByteArrayOutputStream();
            DataOutputStream var7;
            (var7 = new DataOutputStream(var9)).writeByte(-82);
            var7.writeShort(4253);
            var7.writeByte(var2);
            var7.writeShort(var4);
            var7.writeInt(var3);
            var7.writeShort(var5);
            var7.writeUTF(var6);
            var7.writeUTF(GlobalStatus.zhangHao);
            var7.writeUTF(GlobalStatus.token);
            var7.writeUTF(var1);
            var7.writeByte(-81);
            return var9.toByteArray();
        } catch (IOException var8) {
            ((Throwable) var8).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, int var2, String var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4188);
            var4.writeInt(var2);
            var4.writeUTF(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] t(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4192);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] u(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4189);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] k(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4190);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] v(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4191);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] g(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4196);
            var3.writeByte(1);
            var3.writeByte(1);
            var3.writeUTF(var1);
            var3.writeUTF(var2);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, String var2, String var3, boolean var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4096);
            var5.writeByte(1);
            var5.writeByte(1);
            var5.writeUTF(var1);
            var5.writeUTF(var2);
            var5.writeByte(var4 ? 1 : 0);
            var5.writeUTF(var3);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] d(short var0, String var1, short var2) {
        ByteArrayOutputStream var3 = new ByteArrayOutputStream();
        DataOutputStream var4 = new DataOutputStream(var3);

        try {
            var4.writeByte(-82);
            var4.writeShort(var0);
            var4.writeShort(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            byte[] var9 = var3.toByteArray();
            return var9;
        } catch (IOException var7) {
            ((Throwable) var7).printStackTrace();
        } finally {
            a(var3, var4);
        }

        return null;
    }

    public static byte[] a(short var0, String var1, short var2, byte var3) {
        ByteArrayOutputStream var4 = new ByteArrayOutputStream();
        DataOutputStream var5 = new DataOutputStream(var4);

        try {
            var5.writeByte(-82);
            var5.writeShort(var0);
            var5.writeShort(var2);
            var5.writeByte(var3);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            byte[] var10 = var4.toByteArray();
            return var10;
        } catch (IOException var8) {
            ((Throwable) var8).printStackTrace();
        } finally {
            a(var4, var5);
        }

        return null;
    }

    public static byte[] e(short var0, String var1, short var2) {
        ByteArrayOutputStream var3 = new ByteArrayOutputStream();
        DataOutputStream var4 = new DataOutputStream(var3);

        try {
            var4.writeByte(-82);
            var4.writeShort(var0);
            var4.writeShort(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            byte[] var9 = var3.toByteArray();
            return var9;
        } catch (IOException var7) {
            ((Throwable) var7).printStackTrace();
        } finally {
            a(var3, var4);
        }

        return null;
    }

    public static byte[] f(short var0, String var1, short var2) {
        ByteArrayOutputStream var3 = new ByteArrayOutputStream();
        DataOutputStream var4 = new DataOutputStream(var3);

        try {
            var4.writeByte(-82);
            var4.writeShort(var0);
            var4.writeShort(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            byte[] var9 = var3.toByteArray();
            return var9;
        } catch (IOException var7) {
            ((Throwable) var7).printStackTrace();
        } finally {
            a(var3, var4);
        }

        return null;
    }

    public static byte[] a(short var0, String var1, String var2, byte var3, String var4, int var5) {
        ByteArrayOutputStream var6 = new ByteArrayOutputStream();
        DataOutputStream var7 = new DataOutputStream(var6);

        try {
            var7.writeByte(-82);
            var7.writeShort(var0);
            var7.writeUTF(var2);
            var7.writeByte(var3);
            var7.writeUTF(var4);
            var7.writeInt(var5);
            var7.writeUTF(GlobalStatus.zhangHao);
            var7.writeUTF(GlobalStatus.token);
            var7.writeUTF(var1);
            var7.writeByte(-81);
            byte[] var12 = var6.toByteArray();
            return var12;
        } catch (IOException var10) {
            ((Throwable) var10).printStackTrace();
        } finally {
            a(var6, var7);
        }

        return null;
    }

    public static byte[] a(short var0, String var1, short var2, int var3) {
        ByteArrayOutputStream var4 = new ByteArrayOutputStream();
        DataOutputStream var5 = new DataOutputStream(var4);

        try {
            var5.writeByte(-82);
            var5.writeShort(var0);
            var5.writeInt(var3);
            var5.writeShort(var2);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            byte[] var10 = var4.toByteArray();
            return var10;
        } catch (IOException var8) {
            ((Throwable) var8).printStackTrace();
        } finally {
            a(var4, var5);
        }

        return null;
    }

    public static byte[] i(short var0, String var1, byte var2) {
        ByteArrayOutputStream var8 = new ByteArrayOutputStream();
        DataOutputStream var3 = new DataOutputStream(var8);

        try {
            var3.writeByte(-82);
            var3.writeShort(4355);
            var3.writeByte(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            byte[] var9 = var8.toByteArray();
            return var9;
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
        } finally {
            a(var8, var3);
        }

        return null;
    }

    public static byte[] a(short var0, String var1, short var2, int var3, String var4, String var5) {
        ByteArrayOutputStream var11 = new ByteArrayOutputStream();
        DataOutputStream var6 = new DataOutputStream(var11);

        try {
            var6.writeByte(-82);
            var6.writeShort(4256);
            var6.writeShort(var2);
            var6.writeInt(var3);
            var6.writeUTF(var4);
            var6.writeUTF(var5 == null ? "" : var5);
            var6.writeUTF(GlobalStatus.zhangHao);
            var6.writeUTF(GlobalStatus.token);
            var6.writeUTF(var1);
            var6.writeByte(-81);
            byte[] var12 = var11.toByteArray();
            return var12;
        } catch (IOException var9) {
            ((Throwable) var9).printStackTrace();
        } finally {
            a(var11, var6);
        }

        return null;
    }

    public static byte[] a(short var0, String var1, byte var2, int var3, String var4, short var5, short var6) {
        ByteArrayOutputStream var12 = new ByteArrayOutputStream();
        DataOutputStream var7 = new DataOutputStream(var12);

        try {
            var7.writeByte(-82);
            var7.writeShort(4356);
            var7.writeUTF(var4);
            var7.writeByte(var2);
            var7.writeInt(var3);
            var7.writeShort(var5);
            var7.writeShort(var6);
            var7.writeUTF(GlobalStatus.zhangHao);
            var7.writeUTF(GlobalStatus.token);
            var7.writeUTF(var1);
            var7.writeByte(-81);
            byte[] var13 = var12.toByteArray();
            return var13;
        } catch (IOException var10) {
            ((Throwable) var10).printStackTrace();
        } finally {
            a(var12, var7);
        }

        return null;
    }

    public static byte[] j(short var0, String var1, byte var2) {
        ByteArrayOutputStream var8 = new ByteArrayOutputStream();
        DataOutputStream var3 = new DataOutputStream(var8);

        try {
            var3.writeByte(-82);
            var3.writeShort(4357);
            var3.writeByte(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            byte[] var9 = var8.toByteArray();
            return var9;
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
        } finally {
            a(var8, var3);
        }

        return null;
    }

    public static byte[] a(short var0, String var1, byte var2, bv var3) {
        ByteArrayOutputStream var9 = new ByteArrayOutputStream();
        DataOutputStream var4 = new DataOutputStream(var9);

        try {
            var4.writeByte(-82);
            var4.writeShort(4360);
            var4.writeByte(var2);
            var4.writeInt(var3.c);
            var4.writeShort(var3.e);
            var4.writeShort(var3.f);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            byte[] var10 = var9.toByteArray();
            return var10;
        } catch (IOException var7) {
            ((Throwable) var7).printStackTrace();
        } finally {
            a(var9, var4);
        }

        return null;
    }

    public static byte[] h(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4673);
            var3.writeUTF(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] l(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4672);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, String var2, int var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4671);
            var4.writeUTF(var2);
            var4.writeInt(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] w(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4668);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, String var2, String var3, int var4) {
        ByteArrayOutputStream var10 = new ByteArrayOutputStream();
        DataOutputStream var5 = new DataOutputStream(var10);

        try {
            var5.writeByte(-82);
            var5.writeShort(4670);
            var5.writeUTF(var2);
            var5.writeUTF(var3);
            var5.writeInt(var4);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            byte[] var11 = var10.toByteArray();
            return var11;
        } catch (IOException var8) {
            ((Throwable) var8).printStackTrace();
        } finally {
            a(var10, var5);
        }

        return null;
    }

    public static byte[] a(short var0, String var1, String var2, String var3, int var4, String var5) {
        ByteArrayOutputStream var11 = new ByteArrayOutputStream();
        DataOutputStream var6 = new DataOutputStream(var11);

        try {
            var6.writeByte(-82);
            var6.writeShort(4669);
            var6.writeUTF(var2);
            var6.writeUTF(var3);
            var6.writeUTF(var5);
            var6.writeInt(var4);
            var6.writeUTF(GlobalStatus.zhangHao);
            var6.writeUTF(GlobalStatus.token);
            var6.writeUTF(var1);
            var6.writeByte(-81);
            byte[] var12 = var11.toByteArray();
            return var12;
        } catch (IOException var9) {
            ((Throwable) var9).printStackTrace();
        } finally {
            a(var11, var6);
        }

        return null;
    }

    public static byte[] b(short var0, String var1, int var2, int var3, int var4) {
        ByteArrayOutputStream var10 = new ByteArrayOutputStream();
        DataOutputStream var5 = new DataOutputStream(var10);

        try {
            var5.writeByte(-82);
            var5.writeShort(4667);
            var5.writeInt(var2);
            var5.writeShort(var3);
            var5.writeShort(var4);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            byte[] var11 = var10.toByteArray();
            return var11;
        } catch (IOException var8) {
            ((Throwable) var8).printStackTrace();
        } finally {
            a(var10, var5);
        }

        return null;
    }

    public static byte[] a(short var0, String var1, byte var2, int var3, byte var4) {
        ByteArrayOutputStream var10 = new ByteArrayOutputStream();
        DataOutputStream var5 = new DataOutputStream(var10);

        try {
            var5.writeByte(-82);
            var5.writeShort(4363);
            var5.writeByte(var4);
            var5.writeByte(var2);
            var5.writeInt(var3);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            byte[] var11 = var10.toByteArray();
            return var11;
        } catch (IOException var8) {
            ((Throwable) var8).printStackTrace();
        } finally {
            a(var10, var5);
        }

        return null;
    }

    public static byte[] a(short var0, String var1, byte var2, int var3, int var4) {
        ByteArrayOutputStream var10 = new ByteArrayOutputStream();
        DataOutputStream var5 = new DataOutputStream(var10);

        try {
            var5.writeByte(-82);
            var5.writeShort(4364);
            var5.writeInt(var4);
            var5.writeByte(var2);
            var5.writeInt(var3);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            byte[] var11 = var10.toByteArray();
            return var11;
        } catch (IOException var8) {
            ((Throwable) var8).printStackTrace();
        } finally {
            a(var10, var5);
        }

        return null;
    }

    private static void a(ByteArrayOutputStream var0, DataOutputStream var1) {
        try {
            if (var0 != null) {
                var0.close();
            }

            if (var1 != null) {
                var1.close();
            }

        } catch (IOException var2) {
        }
    }

    public static byte[] b(short var0, String var1, String var2, String var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4197);
            var4.writeUTF(var2);
            var4.writeUTF(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] i(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4216);
            var3.writeUTF(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] g(short var0, String var1, short var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4198);
            var3.writeShort(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] x(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var3)).writeByte(-82);
            var4.writeShort(var0);
            var4.writeInt(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var3.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] m(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4209);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] n(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4214);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] j(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4201);
            var3.writeUTF(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] h(short var0, String var1, short var2) {
        try {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var3)).writeByte(-82);
            var4.writeShort(var0);
            var4.writeShort(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var3.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] o(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4211);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] k(short var0, String var1, byte var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4263);
            var3.writeByte(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] p(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4241);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] d(short var0, String var1, String var2, byte var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4217);
            var4.writeUTF(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] i(short var0, String var1, short var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4227);
            var3.writeShort(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] k(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4208);
            var3.writeUTF(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, long var2) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4224);
            var4.writeLong(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] j(short var0, String var1, short var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4225);
            var3.writeShort(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] l(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var3)).writeByte(-82);
            var4.writeShort(var0);
            var4.writeUTF(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var3.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] m(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var3)).writeByte(-82);
            var4.writeShort(var0);
            var4.writeUTF(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var3.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] q(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4219);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] n(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4218);
            var3.writeUTF(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] r(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4221);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, long var2, short var4, short var5, short var6, short var7) {
        try {
            ByteArrayOutputStream var10 = new ByteArrayOutputStream();
            DataOutputStream var8;
            (var8 = new DataOutputStream(var10)).writeByte(-82);
            var8.writeShort(4220);
            var8.writeLong(var2);
            var8.writeShort(var4);
            var8.writeShort(var5);
            var8.writeShort(var6);
            var8.writeShort(var7);
            var8.writeUTF(GlobalStatus.zhangHao);
            var8.writeUTF(GlobalStatus.token);
            var8.writeUTF(var1);
            var8.writeByte(-81);
            return var10.toByteArray();
        } catch (IOException var9) {
            ((Throwable) var9).printStackTrace();
            return null;
        }
    }

    public static byte[] k(short var0, String var1, short var2) {
        try {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var3)).writeByte(-82);
            var4.writeShort(var0);
            var4.writeShort(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var3.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] l(short var0, String var1, byte var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4233);
            var3.writeByte(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] y(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4237);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] s(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4236);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, int var2, short var3, short var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4234);
            var5.writeInt(var2);
            var5.writeShort(var3);
            var5.writeShort(var4);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] l(short var0, String var1, int var2, int var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4238);
            var4.writeInt(var2);
            var4.writeInt(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] t(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4248);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] c(short var0, String var1, int var2, byte var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4249);
            var4.writeInt(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] u(short var0, String var1) {
        ByteArrayOutputStream var7 = null;
        DataOutputStream var2 = null;

        try {
            var7 = new ByteArrayOutputStream();
            (var2 = new DataOutputStream(var7)).writeByte(-82);
            var2.writeShort(4612);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            byte[] var8 = var7.toByteArray();
            return var8;
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
        } finally {
            a(var7, var2);
        }

        return null;
    }

    public static byte[] a(short var0, String var1, String var2, boolean var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4628);
            var4.writeUTF(var2);
            var4.writeByte(var3 ? 1 : 0);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] m(short var0, String var1, int var2, int var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4629);
            var4.writeInt(var2);
            var4.writeInt(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] z(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4613);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, String var1, int var2, int var3, byte var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4614);
            var5.writeInt(var2);
            var5.writeInt(var3);
            var5.writeByte(var4);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] d(short var0, String var1, int var2, byte var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4615);
            var4.writeInt(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, byte var2, short var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4631);
            var4.writeByte(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, String var1, byte var2, short var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4632);
            var4.writeByte(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] c(short var0, String var1, byte var2, short var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4150);
            var4.writeByte(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] e(short var0, String var1, int var2, byte var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4633);
            var4.writeByte(var3);
            var4.writeInt(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, int var2, byte var3, long var4) {
        try {
            ByteArrayOutputStream var8 = new ByteArrayOutputStream();
            DataOutputStream var6;
            (var6 = new DataOutputStream(var8)).writeByte(-82);
            var6.writeShort(4640);
            var6.writeByte(var3);
            var6.writeInt(var2);
            var6.writeLong(var4);
            var6.writeUTF(GlobalStatus.zhangHao);
            var6.writeUTF(GlobalStatus.token);
            var6.writeUTF(var1);
            var6.writeByte(-81);
            return var8.toByteArray();
        } catch (IOException var7) {
            ((Throwable) var7).printStackTrace();
            return null;
        }
    }

    public static byte[] d(short var0, String var1, String var2, short var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4864);
            var4.writeUTF(var1);
            var4.writeShort(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var2);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, byte var2, String var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4865);
            var4.writeUTF(var1);
            var4.writeByte(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var3);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, String var1, byte var2, String var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4866);
            var4.writeUTF(var1);
            var4.writeByte(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var3);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] o(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4868);
            var3.writeUTF(var1);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var2);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] l(short var0, String var1, short var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4869);
            var3.writeShort(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, String var1, int var2, int var3, short var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4642);
            var5.writeShort(var2);
            var5.writeInt(var3);
            var5.writeShort(var4);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] c(short var0, String var1, int var2, int var3, byte var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4645);
            var5.writeInt(var2);
            var5.writeInt(var3);
            var5.writeByte(var4);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] f(short var0, String var1, int var2, byte var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4646);
            var4.writeInt(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] g(short var0, String var1, int var2, byte var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4647);
            var4.writeInt(var2);
            var4.writeByte(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] v(short var0, String var1) {
        try {
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var2)).writeByte(-82);
            var3.writeShort(var0);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var2.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] c(short var0, String var1, byte var2, String var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4872);
            var4.writeByte(var2);
            if (var3 != null && var2 == 0) {
                var4.writeUTF(var3);
            }

            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, byte var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4648);
            var3.writeByte(var1);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var2);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, byte var1, short var2, String var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4649);
            var4.writeByte(var1);
            var4.writeShort(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var3);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, int var1, int var2, String var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4650);
            var4.writeInt(var1);
            var4.writeInt(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var3);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, String var2, String var3, long var4) {
        try {
            ByteArrayOutputStream var8 = new ByteArrayOutputStream();
            DataOutputStream var6;
            (var6 = new DataOutputStream(var8)).writeByte(-82);
            var6.writeShort(4857);
            var6.writeUTF(var2);
            var6.writeUTF(var3);
            var6.writeLong(var4);
            var6.writeUTF(GlobalStatus.zhangHao);
            var6.writeUTF(GlobalStatus.token);
            var6.writeUTF(var1);
            var6.writeByte(-81);
            return var8.toByteArray();
        } catch (IOException var7) {
            ((Throwable) var7).printStackTrace();
            return null;
        }
    }

    public static byte[] m(short var0, String var1, short var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4858);
            var3.writeShort(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] A(short var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4859);
            var3.writeInt(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] m(short var0, String var1, byte var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4860);
            var3.writeByte(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] n(short var0, String var1, byte var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4861);
            var3.writeByte(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] n(short var0, String var1, short var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4862);
            var3.writeShort(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, int var2, int var3, short var4, short var5) {
        try {
            ByteArrayOutputStream var8 = new ByteArrayOutputStream();
            DataOutputStream var6;
            (var6 = new DataOutputStream(var8)).writeByte(-82);
            var6.writeShort(4863);
            var6.writeInt(var2);
            var6.writeInt(var3);
            var6.writeShort(var4);
            var6.writeShort(var5);
            var6.writeUTF(GlobalStatus.zhangHao);
            var6.writeUTF(GlobalStatus.token);
            var6.writeUTF(var1);
            var6.writeByte(-81);
            return var8.toByteArray();
        } catch (IOException var7) {
            ((Throwable) var7).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, String var1, String var2, int var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4856);
            var4.writeUTF(var2);
            var4.writeInt(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] p(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4651);
            var3.writeUTF(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, int var2, byte var3, byte var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4652);
            var5.writeInt(var2);
            var5.writeByte(var4);
            var5.writeByte(var3);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var1);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] w(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4653);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] x(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4658);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] y(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4659);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, byte var1, byte var2, byte var3, byte var4, String var5) {
        try {
            ByteArrayOutputStream var8 = new ByteArrayOutputStream();
            DataOutputStream var6;
            (var6 = new DataOutputStream(var8)).writeByte(-82);
            var6.writeShort(4259);
            var6.writeByte(var1);
            var6.writeByte(var2);
            var6.writeByte(var3);
            var6.writeByte(var4);
            var6.writeUTF(GlobalStatus.zhangHao);
            var6.writeUTF(GlobalStatus.token);
            var6.writeUTF(var5);
            var6.writeByte(-81);
            return var8.toByteArray();
        } catch (IOException var7) {
            ((Throwable) var7).printStackTrace();
            return null;
        }
    }

    public static byte[] z(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4223);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, short var1, String var2) {
        try {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var3)).writeByte(-82);
            var4.writeShort(var0);
            var4.writeShort(var1);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var2);
            var4.writeByte(-81);
            return var3.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] q(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4880);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeUTF(var2);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, int var1, int var2, byte var3, String var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4663);
            var5.writeInt(var1);
            var5.writeInt(var2);
            var5.writeByte(var3);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var4);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, int var1, byte var2, byte var3, String var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4689);
            var5.writeByte(var2);
            var5.writeInt(var1);
            var5.writeByte(var3);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var4);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, int var1, long var2, byte var4, byte var5, int var6, byte[] var7, String var8) {
        try {
            ByteArrayOutputStream var11 = new ByteArrayOutputStream();
            DataOutputStream var9;
            (var9 = new DataOutputStream(var11)).writeByte(-82);
            var9.writeShort(4688);
            var9.writeInt(var1);
            var9.writeLong(var2);
            var9.writeByte(var4);
            var9.writeByte(var5);
            var9.writeInt(var6);
            if (var4 == 3) {
                if (var7 != null && var7.length > 0) {
                    var9.writeByte(var7.length);

                    for (int var12 = 0; var12 < var7.length; ++var12) {
                        var9.writeByte(var7[var12]);
                    }
                } else {
                    var9.writeByte(0);
                }
            }

            var9.writeUTF(GlobalStatus.zhangHao);
            var9.writeUTF(GlobalStatus.token);
            var9.writeUTF(var8);
            var9.writeByte(-81);
            return var11.toByteArray();
        } catch (IOException var10) {
            ((Throwable) var10).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, int var1, long var2, byte var4, int[] var5, byte[] var6, int var7, byte var8, String var9) {
        try {
            ByteArrayOutputStream var12 = new ByteArrayOutputStream();
            DataOutputStream var10;
            (var10 = new DataOutputStream(var12)).writeByte(-82);
            var10.writeShort(4262);
            var10.writeInt(var1);
            var10.writeLong(var2);
            var10.writeByte(var4);
            if (var4 == 1 || var4 == 2 || var4 == 3) {
                if (var5 != null && var5.length > 0) {
                    var10.writeByte(var5.length);

                    for (int var13 = 0; var13 < var5.length; ++var13) {
                        var10.writeInt(var5[var13]);
                        var10.writeByte(var6[var13]);
                    }
                } else {
                    var10.writeByte(0);
                }

                if (var4 == 1 || var4 == 2) {
                    var10.writeInt(var7);
                    var10.writeByte(var8);
                }
            }

            var10.writeUTF(GlobalStatus.zhangHao);
            var10.writeUTF(GlobalStatus.token);
            var10.writeUTF(var9);
            var10.writeByte(-81);
            return var12.toByteArray();
        } catch (IOException var11) {
            ((Throwable) var11).printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte var0, int var1, int var2, int[] var3, byte[] var4, int var5, byte var6, String var7) {
        try {
            ByteArrayOutputStream var8 = new ByteArrayOutputStream();
            DataOutputStream var9;
            (var9 = new DataOutputStream(var8)).writeByte(-82);
            var9.writeShort(4266);
            var9.writeInt(var1);
            var9.writeInt(var2);
            var9.writeByte(var0);
            if (var0 == 4 || var0 == 5 || var0 == 0) {
                if (var3 != null && var3.length > 0) {
                    var9.writeByte(var3.length);

                    for (int var11 = 0; var11 < var3.length; ++var11) {
                        var9.writeInt(var3[var11]);
                        var9.writeByte(var4[var11]);
                    }
                } else {
                    var9.writeByte(0);
                }

                if (var0 == 4 || var0 == 5) {
                    var9.writeInt(var5);
                    var9.writeByte(var6);
                }
            }

            var9.writeUTF(GlobalStatus.zhangHao);
            var9.writeUTF(GlobalStatus.token);
            var9.writeUTF(var7);
            var9.writeByte(-81);
            return var8.toByteArray();
        } catch (IOException var10) {
            ((Throwable) var10).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, String var2, byte var3, short var4, short var5) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var8;
            (var8 = new DataOutputStream(var7)).writeByte(-82);
            var8.writeShort(5121);
            var8.writeUTF(var1);
            var8.writeUTF(var2);
            var8.writeByte(1);
            var8.writeShort(var4);
            var8.writeShort(var5);
            var8.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] A(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4254);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, String var1, String var2, short var3, short var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(5122);
            var5.writeUTF(var1);
            var5.writeUTF(var2);
            var5.writeShort(var3);
            var5.writeShort(var4);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, byte var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4881);
            var3.writeByte(var1);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var2);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, byte var1, String var2, byte var3, String var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4882);
            var5.writeByte(var1);
            var5.writeUTF(var2);
            var5.writeByte(var3);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var4);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, byte var1, int var2, int var3, String var4, String var5, String var6, String var7, String var8, int var9, int var10) {
        try {
            ByteArrayOutputStream var13 = new ByteArrayOutputStream();
            DataOutputStream var11;
            (var11 = new DataOutputStream(var13)).writeByte(-82);
            var11.writeShort(5392);
            var11.writeByte(var1);
            var11.writeInt(var2);
            var11.writeInt(var3);
            var11.writeUTF(var4);
            var11.writeUTF(var5);
            var11.writeUTF(var6);
            var11.writeUTF(var7);
            var11.writeUTF(var8);
            var11.writeInt(var9);
            var11.writeInt(var10);
            var11.writeByte(-81);
            return var13.toByteArray();
        } catch (IOException var12) {
            ((Throwable) var12).printStackTrace();
            return null;
        }
    }

    public static byte[] c(short var0, String var1, String var2, String var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4674);
            var4.writeUTF(var2);
            var4.writeUTF(var3);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var1);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] r(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4678);
            var3.writeUTF(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] s(short var0, String var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4675);
            var3.writeUTF(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, byte var1, long var2, String var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4676);
            var5.writeByte(var1);
            var5.writeLong(var2);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var4);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] B(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4222);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, byte var1, int[] var2, String var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4239);
            var4.writeByte(var1);
            if (var1 == 2) {
                var4.writeByte(var2[0]);
                var4.writeByte(var2[2]);
                var4.writeInt(var2[1]);
            }

            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var3);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, int var1, int var2, String var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4244);
            var4.writeInt(var1);
            var4.writeByte((byte) var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var3);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, byte var1, long var2, String var4) {
        try {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var7)).writeByte(-82);
            var5.writeShort(4264);
            var5.writeByte(var1);
            var5.writeLong(var2);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var4);
            var5.writeByte(-81);
            return var7.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] C(short var0, String var1) {
        try {
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var2)).writeByte(-82);
            var3.writeShort(var0);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var1);
            var3.writeByte(-81);
            return var2.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, int var1, byte var2, String var3) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var6)).writeByte(-82);
            var4.writeShort(4368);
            var4.writeInt(var1);
            var4.writeByte(var2);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(var3);
            var4.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0, int var1, byte var2, String var3) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var4)).writeByte(-82);
            var5.writeShort(var0);
            var5.writeInt(var1);
            var5.writeByte(var2);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(var3);
            var5.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] D(short var0, String var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4369);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(var1);
            var2.writeShort(GlobalStatus.eE[0]);
            var2.writeShort(GlobalStatus.eE[1]);
            var2.writeShort(GlobalStatus.eE[2]);
            var2.writeShort(GlobalStatus.eF);
            if (GlobalStatus.eG != null && GlobalStatus.eG.length > 0 && GlobalStatus.eG.length < 10) {
                for (int var5 = 0; var5 < GlobalStatus.eG.length; ++var5) {
                    var2.writeByte(GlobalStatus.eG[var5]);
                }
            }

            if (GlobalStatus.eH != null && GlobalStatus.eH.length > 0 && GlobalStatus.eH.length < 10) {
                for (int var6 = 0; var6 < GlobalStatus.eH.length; ++var6) {
                    var2.writeShort(GlobalStatus.eH[var6]);
                }
            }

            if (GlobalStatus.eI != null && GlobalStatus.eI.length > 0 && GlobalStatus.eI.length < 10) {
                for (int var7 = 0; var7 < GlobalStatus.eI.length; ++var7) {
                    var2.writeInt(GlobalStatus.eI[var7]);
                }
            }

            if (GlobalStatus.eJ != null && GlobalStatus.eJ.length > 0 && GlobalStatus.eJ.length < 10) {
                for (int var8 = 0; var8 < GlobalStatus.eJ.length; ++var8) {
                    var2.writeUTF(GlobalStatus.eJ[var8]);
                }
            }

            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] c(short var0, byte var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4370);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(var2);
            var3.writeByte(var1);
            var3.writeShort(GlobalStatus.eM[0]);
            var3.writeShort(GlobalStatus.eM[1]);
            var3.writeShort(GlobalStatus.eM[2]);
            var3.writeShort(GlobalStatus.eN);
            if (GlobalStatus.eO != null && GlobalStatus.eO.length > 0 && GlobalStatus.eO.length < 10) {
                for (int var6 = 0; var6 < GlobalStatus.eO.length; ++var6) {
                    var3.writeByte(GlobalStatus.eO[var6]);
                }
            }

            if (GlobalStatus.eP != null && GlobalStatus.eP.length > 0 && GlobalStatus.eP.length < 10) {
                for (int var7 = 0; var7 < GlobalStatus.eP.length; ++var7) {
                    var3.writeShort(GlobalStatus.eP[var7]);
                }
            }

            if (GlobalStatus.eQ != null && GlobalStatus.eQ.length > 0 && GlobalStatus.eQ.length < 10) {
                for (int var8 = 0; var8 < GlobalStatus.eQ.length; ++var8) {
                    var3.writeInt(GlobalStatus.eQ[var8]);
                }
            }

            if (GlobalStatus.eR != null && GlobalStatus.eR.length > 0 && GlobalStatus.eR.length < 10) {
                for (int var9 = 0; var9 < GlobalStatus.eR.length; ++var9) {
                    var3.writeUTF(GlobalStatus.eR[var9]);
                }
            }

            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, byte var1) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var4)).writeByte(-82);
            var2.writeShort(4372);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeByte(var1);
            var2.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte var0, int var1, int var2, int[] var3, int var4, byte var5) {
        try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var7;
            (var7 = new DataOutputStream(var6)).writeByte(-82);
            var7.writeShort(4681);
            var7.writeByte(var0);
            var7.writeInt(var1);
            if (var0 != 0 && var0 != 3) {
                var7.writeInt(var2);
                var7.writeInt(var3[0]);
                var7.writeInt(var3[1]);
                var7.writeInt(var3[2]);
                if (var0 == 2) {
                    var7.writeInt(var4);
                    var7.writeByte(var5);
                } else if (var0 == 5) {
                    var7.writeByte(var5);
                }
            }

            var7.writeUTF(GlobalStatus.zhangHao);
            var7.writeUTF(GlobalStatus.token);
            var7.writeUTF(GlobalStatus.ad);
            var7.writeByte(-81);
            return var6.toByteArray();
        } catch (IOException var8) {
            ((Throwable) var8).printStackTrace();
            return null;
        }
    }

    public static byte[] a(int var0) {
        try {
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var1)).writeByte(-82);
            var2.writeShort(4682);
            var2.writeInt(var0);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(GlobalStatus.ad);
            var2.writeByte(-81);
            return var1.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte var0, int var1, int var2, byte var3, byte var4) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var6;
            (var6 = new DataOutputStream(var5)).writeByte(-82);
            var6.writeShort(4684);
            var6.writeInt(var1);
            var6.writeInt(var2);
            var6.writeByte(var3);
            var6.writeByte(var0);
            var6.writeByte(var4);
            var6.writeUTF(GlobalStatus.zhangHao);
            var6.writeUTF(GlobalStatus.token);
            var6.writeUTF(GlobalStatus.ad);
            var6.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var7) {
            ((Throwable) var7).printStackTrace();
            return null;
        }
    }

    public static byte[] b(short var0) {
        try {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var1;
            (var1 = new DataOutputStream(var3)).writeByte(-82);
            var1.writeShort(4267);
            var1.writeUTF(GlobalStatus.zhangHao);
            var1.writeUTF(GlobalStatus.token);
            var1.writeUTF(GlobalStatus.ad);
            var1.writeByte(-81);
            return var3.toByteArray();
        } catch (IOException var2) {
            ((Throwable) var2).printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte var0, String var1, int var2) {
        try {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var3)).writeByte(-82);
            var4.writeShort(4374);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(GlobalStatus.ad);
            var4.writeByte(var0);
            if (var0 > 0 && var0 != 5) {
                var4.writeUTF(var1);
            }

            if (var0 == 2 || var0 == 4 || var0 == 5 || var0 == 6) {
                var4.writeInt(var2);
            }

            var4.writeByte(-81);
            return var3.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte var0, byte var1, short var2) {
        try {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4;
            (var4 = new DataOutputStream(var3)).writeByte(-82);
            var4.writeShort(4685);
            var4.writeUTF(GlobalStatus.zhangHao);
            var4.writeUTF(GlobalStatus.token);
            var4.writeUTF(GlobalStatus.ad);
            var4.writeByte(var0);
            if (var0 != 2 && var0 != 5) {
                if (var0 == 3) {
                    var4.writeShort(var2);
                }
            } else {
                var4.writeByte(var1);
            }

            var4.writeByte(-81);
            return var3.toByteArray();
        } catch (IOException var5) {
            ((Throwable) var5).printStackTrace();
            return null;
        }
    }

    public static byte[] b(byte var0, int var1, int var2, int var3) {
        try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var5;
            (var5 = new DataOutputStream(var4)).writeByte(-82);
            var5.writeShort(4691);
            var5.writeByte(var0);
            var5.writeInt(var1);
            var5.writeInt(var2);
            var5.writeInt(var3);
            var5.writeUTF(GlobalStatus.zhangHao);
            var5.writeUTF(GlobalStatus.token);
            var5.writeUTF(GlobalStatus.ad);
            var5.writeByte(-81);
            return var4.toByteArray();
        } catch (IOException var6) {
            ((Throwable) var6).printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte var0) {
        try {
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var1)).writeByte(-82);
            var2.writeShort(4683);
            var2.writeByte(var0);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(GlobalStatus.ad);
            var2.writeByte(-81);
            return var1.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] b(int var0) {
        try {
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var1)).writeByte(-82);
            var2.writeShort(4686);
            var2.writeInt(var0);
            var2.writeUTF(GlobalStatus.zhangHao);
            var2.writeUTF(GlobalStatus.token);
            var2.writeUTF(GlobalStatus.ad);
            var2.writeByte(-81);
            return var1.toByteArray();
        } catch (IOException var3) {
            ((Throwable) var3).printStackTrace();
            return null;
        }
    }

    public static byte[] a(short var0, int var1, byte var2, int var3, int var4, byte var5, String var6, String var7) {
        try {
            ByteArrayOutputStream var10 = new ByteArrayOutputStream();
            DataOutputStream var8;
            (var8 = new DataOutputStream(var10)).writeByte(-82);
            var8.writeShort(4687);
            var8.writeInt(var1);
            var8.writeByte(var2);
            var8.writeInt(var3);
            var8.writeInt(var4);
            var8.writeByte(var5);
            var8.writeUTF(var6);
            var8.writeUTF(GlobalStatus.zhangHao);
            var8.writeUTF(GlobalStatus.token);
            var8.writeUTF(var7);
            var8.writeByte(-81);
            return var10.toByteArray();
        } catch (IOException var9) {
            ((Throwable) var9).printStackTrace();
            return null;
        }
    }

    public static byte[] d(short var0, byte var1, String var2) {
        try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            DataOutputStream var3;
            (var3 = new DataOutputStream(var5)).writeByte(-82);
            var3.writeShort(4690);
            var3.writeByte(var1);
            var3.writeUTF(var2);
            var3.writeUTF(GlobalStatus.zhangHao);
            var3.writeUTF(GlobalStatus.token);
            var3.writeUTF(GlobalStatus.ad);
            var3.writeByte(-81);
            return var5.toByteArray();
        } catch (IOException var4) {
            ((Throwable) var4).printStackTrace();
            return null;
        }
    }
}

# bz_1 类分析文档

## 概述

`bz_1` 是《梦幻西游》手游客户端的**网络请求包构建工厂类**，专门负责将游戏各类操作序列化为二进制网络数据包（`byte[]` 或 `NetPacket`），通过 `DataOutputStream` 写入固定协议格式后发往游戏服务器。

---

## 基本信息

| 项目 | 内容 |
|------|------|
| 包名 | `com.cc` |
| 类名 | `bz_1` |
| 修饰符 | `public final`（不可继承） |
| 依赖 | `bt_1`（账号/会话信息）、`bb_1`（设备ID）、`GlobalConfig`（全局配置）、`NetPacket`（包装类） |

---

## 字段说明

| 字段 | 类型 | 值 | 说明 |
|------|------|----|------|
| `a` | `byte` | 90 | 协议相关常量（可能为超时/重试参数） |
| `b` | `byte` | 72 | 协议相关常量 |
| `c` | `int` | 162 | 协议相关常量 |

---

## 协议格式

每个数据包遵循统一结构：

```
[0xAE] [opcode: short] [业务参数...] [bt_1.b: UTF账号] [bt_1.d: UTF密码/token] [角色名: UTF] [0xAF]
```

| 字段 | 说明 |
|------|------|
| `0xAE`（-82） | 包起始标记 |
| `opcode` | 协议号（short），标识请求类型 |
| 业务参数 | 各方法特有的数据字段 |
| `bt_1.b` | 账号（每包都携带，用于服务端鉴权） |
| `bt_1.d` | 密码或会话 token |
| 角色名 | 当前操作角色名（`var1`） |
| `0xAF`（-81） | 包结束标记 |

> 例外：握手包（opcode=6400）和代理包头不携带账号/角色信息，而是携带渠道号、内存、版本等设备参数。

---

## 方法分类与协议号对照表

### 1. 连接与登录

| 方法签名 | opcode | 功能 |
|---|---|---|
| `a(byte, byte, String)` → `NetPacket` | 6400 | 握手/登录包，携带渠道号、设备ID、内存大小、版本号等信息 |
| `a(byte, int, int, int)` → `byte[]` | 代理包头(1) | 构建代理服务器包头 |
| `a(short, String, String, String)` | 4098 | 账号登录（账号+密码） |
| `a(short, String)` | 4100 | 进入游戏/选择角色 |
| `b(short, String)` | 4103 | 登录（附带屏幕分辨率） |
| `c(short, String)` | 动态 var0 | 通用登录变体 |
| `d(short, String)` | 4641 | 切换服务器/重连 |
| `a(short)` | 4630 | 心跳包（Ping），无业务参数 |

### 2. 角色移动与战斗

| 方法签名 | opcode | 功能 |
|---|---|---|
| `a(short, String, int, int, short)` | 4101 | 角色移动（坐标x, y, 方向） |
| `a(short, String, int, int, short, long)` | 4144 | 角色移动（带时间戳） |
| `a(short, String, byte, byte)` | 4195 | 战斗操作（含目标坐标） |
| `b(short, String, byte, byte)` | 4610 | 战斗操作变体 |
| `c(short, String, byte)` | 动态 var0 | 战斗操作变体 |
| `a(short,String,long,int,short,byte,int,byte,byte,short,int,byte,byte)` | 4180 | 完整战斗状态包（含血量、坐标、技能等全量数据） |
| `a(short, short[], String)` | 4255 | 三坐标定位请求 |

### 3. 物品与背包

| 方法签名 | opcode | 功能 |
|---|---|---|
| `a(short, String, byte)` | 4194 | 物品使用（var2==1时取反） |
| `b(short, String, byte)` | 4608 | 物品操作变体 |
| `d(short, String, byte)` | 5120 | 物品操作变体 |
| `e(short, String)` | 5123 | 物品/技能操作 |
| `a(short, String, int)` | 动态 var0 | 通用 int 参数物品请求 |
| `a(short, String, int, byte)` | 4104 | 物品存入仓库 |
| `b(short, String, int)` | 4105 | 仓库取出物品 |
| `c(short, String, int)` | 4106 | 银两存入仓库 |
| `a(short, String, int, int)` | 4107 | 物品购买/交易 |
| `a(short, String, int, int, int)` | 4126 | 物品合成（含参数范围校验：var3 需 0~9） |
| `a(short, String, short[])` | 4186 | 批量短整型数组请求（装备洗炼/附魔） |
| `a(short, String, int, short[])` | 4187 | 带物品 ID 的批量数组请求 |

### 4. 装备系统

| 方法签名 | opcode | 功能 |
|---|---|---|
| `a(short, String, short)` | 4140 | 技能学习/装备操作 |
| `h(short, String, int)` | 4163 | 装备打孔 |
| `i(short, String, int)` | 4164 | 查看打孔信息 |
| `g(short, String, int)` | 4165 | 宝石镶嵌 |
| `k(short, String, int)` | 4161 | 装备升星 |
| `e(short, String, byte)` | 4352 | 装备附魔 |
| `e(short, String, int, int)` | 4157 | 装备洗炼操作 |
| `f(short, String, int, int)` | 4158 | 装备洗炼操作变体 |
| `a(short, String, long, byte)` | 4159 | 装备洗炼（带长整型参数） |

### 5. 拍卖系统

| 方法签名 | opcode | 功能 |
|---|---|---|
| `b(short, String, int, int)` | 4108 | 拍卖出价 |
| `c(short, String, int, int)` | 4109 | 拍卖相关操作 |
| `a(short, String, int, int, long)` | 4148 | 物品上架拍卖（含银两价格） |
| `b(short, String, int, int, long)` | 4152 | 宠物上架拍卖 |
| `a(short, String, String, long)` | 4185 | 拍卖出价（带长整型价格） |
| `r(short, String, int)` | 4146 | 拍卖收回 |

### 6. 宠物系统

| 方法签名 | opcode | 功能 |
|---|---|---|
| `d(short, String, int)` | 4132 | 宠物操作 |
| `e(short, String, int)` | 4133 | 宠物操作变体 |
| `j(short, String, int)` | 4177 | 宠物技能操作 |
| `f(short, String, byte)` | 4125 | 宠物操作（字节参数） |
| `b(short, String, int, byte)` | 4135 | 宠物学习技能 |
| `f(short, String, int)` | 4136 | 宠物技能操作变体 |

### 7. 聊天与社交

| 方法签名 | opcode | 功能 |
|---|---|---|
| `a(short, String, String, byte)` | 4110 | 聊天发言（含频道类型） |
| `b(short, String, String)` | 4111 | 私聊消息 |
| `e(short, String, String)` | 4114 | 好友操作（添加/删除） |
| `f(short, String, String)` | 4119 | 好友操作变体 |
| `h(short, String)` | 4120 | 好友列表查询 |
| `i(short, String)` | 4121 | 好友操作 |

### 8. 帮派系统

| 方法签名 | opcode | 功能 |
|---|---|---|
| `a(short, String, String, short)` | 4112 | 帮派申请/邀请 |
| `b(short, String, String, short)` | 4122 | 帮派操作变体 |
| `c(short, String, String, short)` | 4123 | 帮派操作变体 |
| `b(short, String, String, byte)` | 4124 | 帮派管理（任免/开除） |
| `c(short, String, String, byte)` | 4113 | 帮派操作变体 |
| `a(short, String, byte, String, String)` | 4184 | 帮派公告操作 |
| `c(short, String, String)` | 4170 | 帮派宗旨更改 |
| `d(short, String, String)` | 4171 | 帮派相关操作 |
| `b(short, String, short)` | 4115 | 帮派捐献（银两） |
| `f(short, String)` | 4168 | 查看帮派公告 |
| `g(short, String)` | 4169 | 帮派操作 |
| `g(short, String, int, int)` | 4173 | 帮派外交操作 |
| `s(short, String, int)` | 4145 | 帮派建立/申请 |
| `j(short, String)` | 4143 | 帮派查看 |

### 9. 帮派宝库与资源

| 方法签名 | opcode | 功能 |
|---|---|---|
| `l(short, String, int)` | 4154 | 宝库捐献物品 |
| `m(short, String, int)` | 4149 | 宝库捐献银两 |
| `n(short, String, int)` | 4151 | 宝库取出银两 |
| `o(short, String, int)` | 4162 | 宝库配置 |
| `p(short, String, int)` | 4155 | 宝库扩容 |
| `q(short, String, int)` | 4167 | 提升人气 |
| `j(short, String, int, int)` | 4166 | 发布任务 |

### 10. 婚姻系统

| 方法签名 | opcode | 功能 |
|---|---|---|
| `a(short,String,String,String,int,int)` | 4147 | 求爱/申请结婚 |
| `b(short,String,String,String,int,int)` | 4153 | 婚礼操作变体 |

### 11. 住宅系统

| 方法签名 | opcode | 功能 |
|---|---|---|
| `g(short, String, byte)` | 4128 | 住宅操作 |
| `h(short, String, byte)` | 4129 | 住宅操作变体 |
| `d(short, String, int, int)` | 4139 | 住宅家具管理 |
| `a(short, String, int, short)` | 4142 | 住宅设施操作 |
| `i(short, String, int, int)` | 4172 | 住宅相关操作 |

### 12. 其他操作

| 方法签名 | opcode | 功能 |
|---|---|---|
| `a(short, String, byte, byte, int)` | 4117 | 角色洗点（属性重置） |
| `a(short, String, int, byte, byte, int)` | 4193 | 宠物洗点 |
| `c(short, String, short)` | 4118 | 任务操作 |
| `a(short, String, long, int)` | 4127 | 拍卖/竞标（带银两价格） |
| `a(short, String, int, int, byte)` | 4138 | 锻造/强化装备 |
| `k(short, String, int, int)` | 动态 var0 | 通用双 int 带 short 请求 |
| `h(short, String, int, int)` | 动态 var0 | 通用双 int 请求 |

---

## 设计特点

1. **全静态工厂方法**：所有方法均为 `public static`，无需实例化，与 J2ME 内存管理策略一致。

2. **重载区分业务**：大量同名方法（`a`/`b`/`c`...）通过参数类型/数量区分不同协议，是混淆后的典型特征。原始代码应有明确的业务方法名。

3. **鉴权信息随包携带**：每个包尾都附有 `bt_1.b`（账号）和 `bt_1.d`（密码/token），服务端对每个请求独立验证，无状态设计。

4. **特殊校验**：部分方法含业务合法性前置校验（如 `a(short,String,int,int,int)` 要求 `var3` 在 0~9 范围内），非法参数直接返回 `null` 而不发包。

5. **握手包特殊性**：opcode=6400 的方法返回 `NetPacket` 而非 `byte[]`，且携带完整设备信息（渠道号、内存大小、屏幕尺寸、渠道子类型、服务器编号、版本号等），用于建立初始连接。

---

## 总结

`bz_1` 是客户端与服务器通信的**协议序列化层**，覆盖了游戏几乎所有功能模块的上行（客户端→服务器）数据包构建：登录鉴权、角色移动、战斗、物品、装备、拍卖、宠物、帮派、社交、住宅、婚姻等。配合负责下行（服务器→客户端）解析的类，构成完整的游戏通信协议栈。

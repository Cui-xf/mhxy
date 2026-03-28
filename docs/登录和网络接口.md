# 梦回西游3区 Java版 逆向分析文档

> 目标文件：`java版梦回西游3区251011.jar`
> 反编译工具：jadx
> 分析日期：2026-03-26

---

## 一、项目结构

```
jadx/sources/
├── com/yinhan/kjava/main/
│   ├── MainMidlet.java   入口 MIDlet
│   ├── a.java            主游戏类（全局状态）
│   ├── b/c/d/e/f.java    辅助类
└── defpackage/           混淆后的所有业务类
    ├── av.java           网络管理器（核心）
    ├── at.java           Socket 收发线程
    ├── bz.java           数据包构造工具
    ├── bb.java           账号信息存储/序列化
    ├── bg.java           登录/注册 UI（CommandListener）
    ├── q.java            收包业务分发器
    ├── w.java            数据包对象
    ├── h.java            登录模块入口
    ├── t.java            工具类（日志函数为空实现）
    └── ci.java           压缩/解压（收包用）
```

---

## 二、服务器地址

| 用途 | 地址 |
|------|------|
| Socket 游戏服务器 | `socket://120.78.151.213:20008` |
| HTTP 备用服务器 | `http://117.135.138.130:7099` |

定义位置：`av.java:19-20`

---

## 三、登录逻辑分析

### 3.1 流程

```
用户在 bg.java UI 输入账号/密码
        ↓
bg.k()  客户端格式校验
        ↓
拼装字符串: "登录类型:账号:密码"  (明文)
        ↓
bz.a(byte, byte, String)  构造 w 数据包对象
        ↓
h.a(w)  触发连接并入发送队列
        ↓
at.a(Vector)  写入 Socket
        ↓
发往 socket://120.78.151.213:20008
```

### 3.2 登录类型编码

| 值 | 含义 |
|----|------|
| 1 | 用户名登录 |
| 2 | 手机号登录 |
| 3 | ID 登录 |

### 3.3 关键代码位置

**`bg.java:1183` — `k()` 方法（登录提交）**

```java
// 账号: this.n.getString()
// 密码: this.o.getString()
// 登录类型: a(this.m) → 0=用户名, 1=手机, 2=ID → 发包时转为 1/2/3

StringBuffer sb = new StringBuffer();
sb.append((int) b2);    // 登录类型
sb.append(':');
sb.append(string);      // 账号 (明文)
sb.append(':');
sb.append(string2);     // 密码 (明文)
w wVarA = bz.a((byte) 1, (byte) 1, sb.toString());
```

**`bz.java:14` — `a(byte b2, byte b3, String str)` 方法（构造登录包）**

```java
dataOutputStream.writeByte(-82);          // 包头标识 0xAE
dataOutputStream.writeShort(6400);        // 包类型 ID = 0x1900
dataOutputStream.writeByte(b2);           // 模块类型 = 1
dataOutputStream.writeInt(bb.a);          // CpId
dataOutputStream.writeInt(bb.b);          // GameId
dataOutputStream.writeUTF(t.v);           // 设备信息
dataOutputStream.writeUTF(t.F);           // 设备信息2
dataOutputStream.writeInt(-1);
dataOutputStream.writeByte(t.r);
dataOutputStream.writeByte(t.s);
dataOutputStream.writeByte(t.u);
dataOutputStream.writeInt(...);           // 内存信息
dataOutputStream.writeByte(b3);           // 操作码: 1=登录, 2=注册
dataOutputStream.writeUTF(str);           // "类型:账号:密码" 明文
dataOutputStream.writeByte(-81);          // 包尾标识 0xAF
```

**`bb.java:113` — `b()` 方法（本地持久化账号密码）**

保存到 RMS key: `"silver_kj"`

```java
dataOutputStream.writeByte(k ? 1 : 0);   // 是否记住密码
dataOutputStream.writeByte(l);            // 登录类型
dataOutputStream.writeUTF(m);            // 账号
dataOutputStream.writeUTF(k ? n : "");  // 密码（仅勾选"记住密码"时保存）
```

### 3.4 重要结论

**账号和密码在整个登录流程中全程明文，无任何加密。**

---

## 四、网络数据包格式

### 4.1 数据包对象 `w` (`w.java`)

```java
public final class w {
    public boolean a;    // 是否为连接建立后第一包标志
    private short d;     // 包类型 ID
    public byte[] b;     // 数据内容 (payload)
    public Vector c;     // 子包列表（批量包时使用）

    public short a() { return this.d; }  // 获取包类型ID
}
```

### 4.2 已知包类型 ID

| 十进制 | 十六进制 | 含义 |
|--------|---------|------|
| 6400 | `0x1900` | 登录/认证 |
| 8192 | `0x2000` | 批量子包容器 |
| 8193 | `0x2001` | 系统消息/服务器通知 |
| 4101 | `0x1005` | 心跳包 |
| 4352 | `0x1100` | 断线/重连标志 |
| 4630 | `0x1216` | 特殊处理包 |

### 4.3 发包帧格式（Socket 层）

```
[帧头 1字节: 0xAE] [包长度 2字节: big-endian] [payload N字节] [帧尾 1字节: 0xAF]
```

连接握手头（首包前附加）：
- `bz.a` = 90 (0x5A)
- `bz.b` = 72 (0x48)

### 4.4 收包帧格式

**普通包（首字节 == 2）：**
```
[0x02] [包ID: short 2字节] [数据长度: int 4字节] [数据: N字节]
```

**压缩包（首字节 != 2）：**
```
[压缩数据长度: 2字节 big-endian] [压缩数据: N字节]
→ 解压(ci.a()) → [包ID: short] [数据长度: int] [数据: N字节]
```

**批量子包（包ID == 8192）：**
```
[子包数量: 1字节] × N个子包:
    [子包ID: short] [子包长度: int] [子包数据: N字节]
```

---

## 五、网络层架构

```
av (网络管理器)
 ├── at (Socket收发线程, Runnable)
 │    ├── b()       建立连接 + 发送队列中的包
 │    ├── a(Vector) 真正写 Socket (DataOutputStream.write)
 │    └── run()     循环读 Socket → 调用 av.a(InputStream)
 ├── q  (收包业务分发器)
 │    └── a(w)      按包ID分发到业务处理逻辑
 └── Vector m       收包队列
     Vector a/b     发包队列 (a=普通, b=心跳)
```

---

## 六、日志情况

**游戏运行时完全静默，所有日志均已剥离。**

| 位置 | 代码 | 实际效果 |
|------|------|---------|
| `av.java:134` | `t.a("sendPacket:...")` | 无输出，`t.a(String)` 是空方法 |
| `at.java:107` | `new StringBuffer().append("开始数据包发送|"...)` | 无输出，只构造对象未调用任何输出函数 |
| `av.java:153` | `new StringBuffer().append("接收数据包|"...)` | 同上，无输出 |
| `av.java:168/174/192` | 接收压缩包/子包日志 | 同上，无输出 |

`t.java:140`:
```java
public static void a(String str) {
    // 空方法，发行版已移除所有日志
}
```

---

## 七、Hook 点汇总

### 7.1 登录账号密码

| 优先级 | 类 | 方法 | 说明 |
|--------|-----|------|------|
| ★★★ | `defpackage.bz` | `a(byte, byte, String)` | 第3参数即 `"类型:账号:密码"` 明文字符串，一个点同时获取两者 |
| ★★★ | `defpackage.bg` | `k()` | 方法入口，局部变量 `string`/`string2` 分别是账号/密码 |
| ★★ | `defpackage.bb` 静态字段 | `bb.m` / `bb.n` | 分别存账号和密码，在 `k()` 中被赋值 |

**示例（Hook bz.a）：**
```java
// 方法签名: bz.a(byte, byte, String) → w
// b3==1 时为登录操作，b3==2 时为注册操作
onEntry("defpackage.bz", "a", "(BBLjava/lang/String;)Ldefpackage/w;", (thiz, args) -> {
    byte b3 = (byte) args[1];
    String payload = (String) args[2];       // "1:账号:密码"
    if (b3 == 1) {
        String[] parts = payload.split(":");
        // parts[0]=类型, parts[1]=账号, parts[2]=密码
        System.out.println("[LOGIN] 账号=" + parts[1] + " 密码=" + parts[2]);
    }
});
```

### 7.2 所有网络数据包（推荐）

| 方向 | 类 | 方法 | 签名 | 说明 |
|------|-----|------|------|------|
| 发包 | `defpackage.av` | `a(w)` | `(Ldefpackage/w;)V` | 包已组装，含类型ID和完整payload，进入发送队列前 |
| 收包 | `defpackage.q` | `a(w)` | `(Ldefpackage/w;)V` | 收到完整包开始业务处理，数据已解压缩 |

**示例（发包+收包）：**
```java
// 发包
onEntry("defpackage.av", "a", "(Ldefpackage/w;)V", (thiz, args) -> {
    Object wObj = args[0];
    short id = (short) invoke(wObj, "a");
    byte[] data = (byte[]) getField(wObj, "b");
    System.out.println("[SEND] ID=0x" + Integer.toHexString(id & 0xFFFF)
        + " len=" + (data != null ? data.length : 0)
        + "\n       " + bytesToHex(data));
});

// 收包
onEntry("defpackage.q", "a", "(Ldefpackage/w;)V", (thiz, args) -> {
    Object wObj = args[0];
    short id = (short) invoke(wObj, "a");
    byte[] data = (byte[]) getField(wObj, "b");
    System.out.println("[RECV] ID=0x" + Integer.toHexString(id & 0xFFFF)
        + " len=" + (data != null ? data.length : 0)
        + "\n       " + bytesToHex(data));
});
```

### 7.3 底层 Socket 原始字节

| 方向 | 类 | 方法 | 说明 |
|------|-----|------|------|
| 发包原始字节 | `defpackage.at` | `a(Vector)` `at.java:105` | `dataOutputStream.write(bArr)` 前，`bArr` 含帧头+长度+payload |
| 收包原始字节 | `defpackage.av` | `a(InputStream)` `av.java:149` | 最原始 Socket 读入入口，含压缩包 |

---

## 八、账号信息全局字段

| 类 | 字段 | 含义 |
|----|------|------|
| `defpackage.bb` | `bb.m` | 账号（静态） |
| `defpackage.bb` | `bb.n` | 密码（静态） |
| `defpackage.bb` | `bb.l` | 登录类型（静态） |
| `defpackage.bb` | `bb.k` | 是否记住密码（静态） |
| `com.yinhan.kjava.main.a` | `a.am` | 账号（与 bb.m 同步赋值） |
| `com.yinhan.kjava.main.a` | `a.an` | 密码（与 bb.n 同步赋值） |
| `com.yinhan.kjava.main.a` | `a.ao` | 登录类型（与 bb.l 同步赋值） |
| `com.yinhan.kjava.main.a` | `a.ap` | 是否记住密码（与 bb.k 同步赋值） |

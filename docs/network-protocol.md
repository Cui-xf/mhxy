# 梦幻西游网络数据包格式文档

## 概述

客户端与服务端之间使用自定义二进制协议通信，分为**传输层帧**和**应用层 Payload** 两层结构。

---

## 1. 传输层帧格式

### 1.1 首包（firstHands=true 或 firstPacket=true）

```
[hands1: 0x5A(90)] [hands2: 0x48(72)] [0xAE] [len_hi] [len_lo] [payload...]
```

### 1.2 后续包

```
[0xAE] [len_hi] [len_lo] [payload...]
```

| 字段 | 大小 | 说明 |
|------|------|------|
| `hands1` | 1 字节 | 握手魔数 `0x5A`(90)，仅首包前置 |
| `hands2` | 1 字节 | 握手魔数 `0x48`(72)，仅首包前置 |
| `0xAE` | 1 字节 | 帧头标记（`-82`），每帧必须有 |
| `len` | 2 字节 | 大端序，等于 `payload.length`，含 `0xAE` 和末尾 `0xAF` 在内的完整长度 |
| `payload` | len 字节 | 业务数据，即 `[0xAE][opcode...][0xAF]` |

**来源：** `SocketReadLooper.java:doWrite()` — `buffer[0]=payload[0]=0xAE`，`buffer[1..2]=payload.length`（大端序），`buffer[3..]=payload[1..]`；首包前额外写入 `hands1/hands2`。

---

## 2. 应用层 Payload 格式

```
[0xAE(-82)] [opcode: short(2B, 大端序)] [业务字段...] [0xAF(-81)]
```

| 字段 | 大小 | 说明 |
|------|------|------|
| `0xAE` | 1 字节 | payload 起始标记（`-82`） |
| `opcode` | 2 字节 | 大端序命令码，标识请求类型 |
| 业务字段 | 可变 | 根据 opcode 不同而变化，详见第 3 节 |
| `0xAF` | 1 字节 | payload 结束标记（`-81`） |

**注意：** 大多数包（握手包除外）在业务字段末尾携带账号、密码/token、角色名，服务端对每个请求独立鉴权（无状态设计）。

---

## 3. 字符串编码

所有字符串均采用 Java `DataOutputStream.writeUTF` 标准格式：

```
[len_hi] [len_lo] [utf8_bytes...]
```

| 字段 | 大小 | 说明 |
|------|------|------|
| `len` | 2 字节 | 大端序，表示后续 UTF-8 编码的字节长度 |
| 内容 | len 字节 | UTF-8 编码字节 |

---

## 4. 已知 Opcode 列表

| opcode（十进制） | 十六进制 | 说明 | Payload 格式 |
|-----------------|----------|------|--------------|
| 6400 | `0x1900` | 握手/建连包 | `[0xAE][6400][var0:byte][deviceId_a:int][deviceId_b:int][channel:UTF][version:UTF][0xFFFFFFFF:int][r:byte][s:byte][u:byte][memory:int][var1:byte][zhanghaoPwd:UTF][0xAF]` |
| 4098 | `0x1002` | 账号登录包 | `[0xAE][4098][password:UTF][account:UTF][0xAF]` |
| 4100 | `0x1004` | 进入游戏/选角包 | `[0xAE][4100][account:UTF][password:UTF][roleName:UTF][0xAF]` |
| 4103 | `0x1007` | 登录包（附屏幕分辨率） | `[0xAE][4103][width:short][height:short][account:UTF][password:UTF][roleName:UTF][0xAF]` |
| 4195 | `0x1063` | 战斗操作包 | `[0xAE][4195][actionType:byte][x:short][y:short][account:UTF][password:UTF][roleName:UTF][0xAF]` |
| 4352 | `0x1100` | 重置队列包 | 发送后清空所有 packetQueue 和 heartbeatQueue |
| 4630 | `0x1216` | 同步包（心跳） | 发送后更新 `GlobalStatus.lastSyncTime` |

### 握手包（opcode=6400）详细字段说明

| 字段 | 类型 | 说明 |
|------|------|------|
| `var0` | byte | 服务器区号相关参数 |
| `bb_1.a` / `bb_1.b` | int | 设备唯一标识（两部分） |
| `PopularizeChannel` | UTF | 推广渠道号 |
| `F` | UTF | 版本号或设备型号 |
| `0xFFFFFFFF` | int | 固定值 `-1` |
| `r` | byte | 渠道子类型（`channelFlag`：正式包=`-49`，测试包=`162`） |
| `s` | byte | 服务器编号 |
| `u` | byte | 其他配置参数 |
| `memory` | int | `Runtime.totalMemory()` 返回值 |
| `var1` | byte | 其他建连参数 |
| `zhanghaoPwd` | UTF | 账号密码组合字符串 |

---

## 5. 服务端响应包格式

服务端响应与客户端请求格式完全不同，来源：`NetUtils.java:readSocket()`。

### 5.1 非压缩包（首字节 = `0x02`）

```
[0x02] [opcode: short(2B)] [body_len: int(4B)] [body: body_len字节]
```

| 字段 | 大小 | 说明 |
|------|------|------|
| `0x02` | 1 字节 | 非压缩包标记 |
| `opcode` | 2 字节 | 大端序命令码 |
| `body_len` | 4 字节 | 大端序，后续 body 字节数 |
| `body` | body_len 字节 | 业务数据，由各 opcode 处理器自行解析 |

### 5.2 压缩包（首字节 ≠ `0x02`）

```
[压缩标记: byte] [compressed_len: 2字节大端序] [压缩数据...]
```

解压后格式与非压缩包 body 相同：
```
[opcode: short(2B)] [body_len: int(4B)] [body: body_len字节]
```

压缩算法：`ci_1.a(byte[])` （来源：`NetUtils.java:readSocket()`）。

### 5.3 批量子包（opcode = 8192）

opcode=8192 时 body 为批量子包结构，非压缩和压缩路径均支持：

```
[count: byte] ( [sub_opcode: short] [sub_len: int] [sub_body: sub_len字节] ) × count
```

### 5.4 已知服务端响应 opcode

| opcode | 十六进制 | 说明 | body 格式 |
|--------|----------|------|-----------|
| 8192 | `0x2000` | 批量子包容器 | 见 5.3 |
| 8193 | `0x2001` | Toast 消息 | `[-10: byte][msg: UTF]` |
| 8194 | `0x2002` | 账号/密码下发（鉴权成功） | `[account: UTF][password/token: UTF]` |
| 8195 | `0x2003` | 角色列表 | `GlobalStatus.a(dis)` 解析 |
| 8197 | `0x2005` | 进入游戏（角色数据） | `GlobalStatus.d(dis)` 解析 |
| 8198 | `0x2006` | 装备/道具列表 | `[count: byte][...]` |
| 8199 | `0x2007` | 未知 | — |
| 8200 | `0x2008` | 未知 | `GlobalStatus.b(dis)` |
| 8201 | `0x2009` | 未知 | `[type: byte][...]` |
| 8202 | `0x200A` | 未知 | `GlobalStatus.l(dis)` |
| 8203 | `0x200B` | 未知 | `[byte][GlobalStatus.n(dis)]` |

**握手响应（客户端发 opcode=6400 后）：** 服务端依次下发 8194（账号token）、8195（角色列表），无独立的 6400 响应包。

---

## 7. 传输常量

| 常量 | 值 | 说明 |
|------|----|------|
| `hands1` | `90` (`0x5A`) | 首包握手魔数1（来源：`NetPayloadBuilder.hands1`） |
| `hands2` | `72` (`0x48`) | 首包握手魔数2（来源：`NetPayloadBuilder.hands2`） |
| payload 起始 | `-82` (`0xAE`) | 每帧 payload 的第一个字节 |
| payload 结束 | `-81` (`0xAF`) | 每帧 payload 的最后一个字节 |
| `channelFlag` 正式 | `-49` | `GlobalConfig.r`，正式服渠道标识 |
| `channelFlag` 测试 | `162` | `GlobalConfig.r`，测试服渠道标识 |

---

## 8. 关键源文件

| 文件 | 职责 |
|------|------|
| `mhxy_s/src/com/cc/NetPayloadBuilder.java` | 客户端 payload 构建工厂，所有 opcode 序列化逻辑 |
| `mhxy_s/src/com/cc/SocketReadLooper.java` | 客户端发送逻辑（`doWrite`），帧头封装、握手前置、队列管理 |
| `mhxy_server/src/main/kotlin/com/cc/handler/TCPFrameDecoder.kt` | 服务端 Netty 帧解码器（`ByteToMessageDecoder`） |
| `mhxy_server/src/main/kotlin/com/cc/handler/GameProtocolHandler.kt` | 服务端 payload 解析，分发至 `CmdRegistry` |

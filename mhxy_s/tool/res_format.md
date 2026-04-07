# res 资源文件格式说明

> 基于源码逆向分析（Page.java / Frame0.java / Frame1.java / PngUtil.java）

---

## 文件类型总览

```
res/
├── *.rule            索引文件，配合同名 *.rpg 包使用（无 map.rule）
├── *.rpg             包 rpg（多帧打包）：ui / publicUI / skill / cartoon
├── role/N.rpg        单帧 rpg，N = 帧 id（short，0~248）
├── petfight/N.rpg    单帧 rpg，N = 帧 id
├── map/N.rpg         单帧 rpg，N = 帧 key（signed int，可为负数）
├── images/*.png      普通 PNG，直接使用
├── icon.png          普通 PNG
└── logo.png          普通 PNG
```

**两类 rpg 文件的根本区别：**

| 特征 | 包 rpg | 单帧 rpg |
|------|--------|---------|
| 文件示例 | `ui.rpg` `publicUI.rpg` `skill.rpg` `cartoon.rpg` | `role/8.rpg` `map/-1017668915.rpg` |
| 开头标志 | `"版权归苏龙德所有"` 的 UTF-8 编码（24 字节） | `short id`（2字节数字） |
| 帧数量 | 不含帧数，由配套 `.rule` 文件决定 | 固定 1 帧 |
| 文件名含义 | 资源集合名称 | role/petfight：帧 id；map：帧 key（int） |
| 用途 | UI 图集、技能图标等批量资源 | 角色、宠物、地图图块等单张图 |

**区分方法（代码 `getFrameStream`）：**
直接判断文件前 24 字节是否等于 `"版权归苏龙德所有".getBytes("UTF-8")`。

---

## 一、.rule 文件

**对应方法：** `Page.loadRule()`

`.rule` 文件存储该资源集合的帧索引表，有两种使用场景：

**场景 A：配合包 rpg（`ui.rule` + `ui.rpg` 等）**
- 决定包 rpg 中的帧总数（包 rpg 本身不含帧数字段）
- 帧在包 rpg 中按顺序排列，第 i 帧对应 `rule[i]`

**场景 B：配合目录型单帧 rpg（`role.rule` + `role/*.rpg` 等）**
- 提供名称→id 的映射，使游戏可以按逻辑名称（如 `"hero_walk"`）查找资源
- 单帧 rpg 按文件名（= id）存储，rule 提供 key→id 的索引
- `map/` 目录没有对应的 `.rule`，文件名直接就是 key（int），由服务端下发地图数据时动态构建索引

### 格式

```
short   count          帧总数（大端序，下同）
重复 count 次:
  int     key          帧的哈希 key（用于按名称查找，signed int）
  short   id           帧的数字 id（= 对应单帧 rpg 的文件名）
```

### key 的计算方式

来自 `Page.hashKey()` + `Page.wrapName()`：

```java
// type=0 → name + "p"   (Frame0 静态图)
// type=2 → name + "s"   (Frame1 动画)
// type=3 → name + "m"   (aw 地图对象)
int hashKey(char[] name) {
    int h = 0;
    for (char c : name) h = h * 31 + c;
    return h;
}
```

例：`"close"` → `"closep"` → hashKey → key 值。

### 现有 .rule 文件

| 文件 | 对应资源 | count |
|------|----------|-------|
| `role.rule` | `role/*.rpg`（单帧） | 249 |
| `petfight.rule` | `petfight/*.rpg`（单帧） | 351 |
| `icon.rule` | `icon/*.rpg`（单帧） | - |
| `ui.rule` | `ui.rpg`（包） | 46 |
| `publicUI.rule` | `publicUI.rpg`（包） | 83 |
| `skill.rule` | `skill.rpg`（包） | 51 |
| `cartoon.rule` | `cartoon.rpg`（包） | 6 |

`map/` 目录**没有** `.rule` 文件，文件名直接是帧 key（signed int），由服务端网络包下发地图资源列表时在内存中构建索引。

---

## 二、包 rpg 文件（ui.rpg / publicUI.rpg / skill.rpg / cartoon.rpg）

**对应方法：** `Page.loadRpg()`

### 格式

```
bytes[24]  skip = "版权归苏龙德所有".getBytes("UTF-8")
                  ← 仅起版权标记作用，跳过不读

然后按 .rule 中的 count 循环读取每帧：
  byte    type        帧类型（0=Frame0 静态图，2=Frame1 动画）
  byte    nchunks     数据块数量
  重复 nchunks 次:
    int     size      本块字节数
    byte[size] data   本块数据
```

**帧数量不在文件中存储**，由调用方从对应 `.rule` 文件读取 `frameInfos.length` 决定。

### 每帧的数据块结构

Frame0 和 Frame1 的 chunks 布局不同：

#### Frame0（type=0）的 chunks

```
chunks[0]  aj 子区域描述（子图坐标表）
chunks[1]  IHDR 原始数据（含 CRC，共 17 字节）
chunks[2]  PLTE 原始数据（含 CRC）
chunks[3]  tRNS 原始数据（含 CRC，透明通道）
chunks[4+] IDAT 原始数据（含 CRC，像素数据）
```

#### Frame1（type=2）的 chunks

```
chunks[0]  bx[][] 动画帧描述（见下文 Frame1 格式）
```

通常 `nchunks=1`，不含任何 PNG 数据。Frame1 本身不是图像，只是引用若干 Frame0 的组合动画描述。

---

## 三、单帧 rpg 文件（role/N.rpg、petfight/N.rpg、map/N.rpg）

**对应方法：** `Page.readFrame1Data()` / `Page.b(byte[])`

每个文件只包含 1 帧，文件名的含义因目录不同而不同：

| 目录 | 文件名含义 | 查找方式（`getFrameStream`） |
|------|-----------|---------------------------|
| `role/` `petfight/` `icon/` | 帧 **id**（short，与 `.rule` 中 id 字段一致） | `path + frameInfo.id + ".rpg"` |
| `map/` | 帧 **key**（signed int，与 hashKey 结果一致） | `path + frameInfo.key + ".rpg"` |

内容前2字节始终是帧 **id**（short），与文件名的关系：
- `role/8.rpg`：文件名=8（id），内容前2字节=8（id）— 一致
- `map/-1017668915.rpg`：文件名=-1017668915（key），内容前2字节=351（id）— **不同**

### 格式

```
short   id         帧 id（short，不一定等于文件名）
byte    reserved   固定为 0x00
byte    nchunks    数据块数量
重复 nchunks 次:
  int     size
  byte[size] data
```

### nchunks 决定帧类型

- `nchunks >= 2`：**Frame0 静态图**，chunks 布局与包 rpg 中 Frame0 完全相同
- `nchunks == 1`：**Frame1 动画**，chunk[0] 是 bx[][] 描述

---

## 四、数据块详解

### chunks[0]：aj 子区域描述（Frame0 专用）

**对应：** `Page.buildFrame0()` 中对 `frameData[0]` 的解析

```
byte[2]  magic/tag     跳过（固定为 0x73 0x42 等，仅标记用）
byte     count         子区域数量
如果 count == 0：使用默认区域 (0, 0, width, height)
如果 count > 0，重复 count 次：
  short  x             区域左上角 x
  short  y             区域左上角 y
  short  w             区域宽度
  short  h             区域高度
```

子区域（aj 对象）用于将一张 PNG 图集按坐标切割成多个子图，游戏中按 `frame0.d[index]` 索引使用。

### chunks[1]：IHDR 数据（Frame0 专用）

标准 PNG IHDR chunk 内容，但**去掉了 4 字节长度前缀**，直接存储：

```
int     width          图像宽度（4字节）
int     height         图像高度（4字节）
byte    bitDepth       位深（1/4/8）
byte    colorType      颜色类型（0=灰度, 2=RGB, 3=索引色, 4=灰度+Alpha, 6=RGBA）
byte    compression    压缩方式（固定 0）
byte    filter         过滤方式（固定 0）
byte    interlace      交错方式（固定 0）
byte[4] crc            CRC32 校验值
```

共 17 字节。`buildFrame0` 从这里读出 width/height 存入 `frame0.b` / `frame0.c`。

### chunks[2]：PLTE 数据（索引色图像）

```
RGB[n]  palette       调色板，每色 3 字节（R/G/B），n = (size-4)/3
byte[4] crc
```

### chunks[3]：tRNS 数据（透明通道）

```
byte[n] alpha         每个调色板颜色对应的 alpha 值
byte[4] crc
```

### chunks[4+]：IDAT 数据（像素数据）

```
byte[]  idat_payload  zlib 或 deflate 压缩的像素数据
byte[4] crc
```

部分文件以 `0x78 0xDA` 开头（zlib），部分以 `0x08 0x99` 开头（deflate，无 zlib 头）。

### chunks[0]：bx[][] 动画帧描述（Frame1 专用）

**对应：** `Frame1.a(byte[][])` 解析 `var1[0]`

```
byte    frameCount      动画帧数（=F，若为 0 则此 Frame1 为空）
如果 frameCount > 0:
  short  l              包围盒 x 偏移
  short  m              包围盒 y 偏移
  short  n              包围盒宽
  short  q              包围盒高
  重复 frameCount 次（每一帧）:
    byte   bxCount       本帧包含的 bx 数量
    重复 bxCount 次（每个 bx sprite）:
      short  b           引用的 Frame0 id（在同目录下按 id 找到对应 rpg 文件）
      byte   c           引用类型（0=Frame0 静态图，2=Frame1 动画）
      short  e           绘制 x 偏移
      short  f           绘制 y 偏移
      short  d           Frame0 的 aj 子区域下标
      byte   g           变换标志（0-7 对应 8 种翻转/旋转）
  short  duration        每帧停留时间（毫秒）
```

Frame1 通过 bx 中的 `b`（Frame0 id）引用具体图像，自身不含任何像素数据。

---

## 五、PNG 重建方法

**对应：** `Frame0.draw()` + `Frame0.buildPngData()`

chunks[1..n] 的 data 字段结构为 `[chunk内容][CRC 4字节]`，重建 PNG 时：

```
output = PNG_HEADER (8字节: 89 50 4E 47 0D 0A 1A 0A)
for i in 1..nchunks:
    name = ["IHDR","PLTE","tRNS","IDAT"][i-1]   // i>=5 时固定用 "IDAT"
    content_len = len(chunks[i]) - 4
    output += big_endian_uint32(content_len)
    output += name.encode("ascii")               // 4字节
    output += chunks[i]                          // 含尾部 CRC
output += PNG_END (12字节: 00 00 00 00 49 45 4E 44 AE 42 60 82)
```

---

## 六、使用关系总结

```
Page("role", "/role/")
  │
  ├── loadRule() 读取 role.rule
  │     └── frameInfos[249]
  │           ├── [i].key   ──→ 按逻辑名称查找（hashKey("name"+"p"/"s")）
  │           └── [i].id    ──→ 定位单帧 rpg（文件名 = id）
  │
  └── 按需加载 role/N.rpg（N = frameInfo.id）
        ├── nchunks>=2 → Frame0（静态图，可重建 PNG）
        └── nchunks==1 → Frame1（动画，引用 Frame0）

Page("ui", "/")  [包 rpg 模式]
  │
  ├── loadRule() 读取 ui.rule → frameInfos[46]，决定帧总数
  │
  └── loadRpg() 读取 ui.rpg
        └── 按 frameInfos 顺序，第 i 帧对应 frameInfos[i]
              ├── type=0 → Frame0（含 PNG chunks）
              └── type=2 → Frame1（仅含 bx 描述）

Page(mapName, byte[])  [地图模式，无 .rule 文件]
  │
  ├── parseFrameInfo(serverBytes) 由服务端网络包构建 frameInfos
  │
  └── getFrameStream(frameInfo)
        ├── 优先：内存缓存（服务端随地图包下发的帧数据）
        ├── 其次：map/frameInfo.key + ".rpg"（文件名 = key）
        └── 兜底：map/frameInfo.id  + ".rpg"（文件名 = id）

Frame1
  └── bx[frame][sprite].b = Frame0 id
        └── 在同一 Page 中按 id 从缓存取 Frame0 图像
```

---

## 七、res 目录各子目录用途

| 目录/文件 | 类型 | 内容 |
|-----------|------|------|
| `role/*.rpg` | 单帧 rpg | 角色精灵（Frame0=身体部位图集，Frame1=行走/攻击动画） |
| `petfight/*.rpg` | 单帧 rpg | 宠物战斗精灵 |
| `map/*.rpg` | 单帧 rpg | 地图图块（文件名为 key 的有符号十进制，含负数；无 .rule，服务端动态下发索引） |
| `ui.rpg` + `ui.rule` | 包 rpg | 游戏内 UI 图标（背包、按钮等） |
| `publicUI.rpg` + `publicUI.rule` | 包 rpg | 公共 UI 元素（边框、弹窗、滚动箭头等） |
| `skill.rpg` + `skill.rule` | 包 rpg | 技能图标 |
| `cartoon.rpg` + `cartoon.rule` | 包 rpg | 剧情动画帧 |
| `images/*.png` | 普通 PNG | 登录界面背景、loading 图等 |
| `icon.png` / `logo.png` | 普通 PNG | 应用图标、Logo |

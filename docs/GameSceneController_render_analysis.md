# GameSceneController#render 渲染函数深度分析

## 1. 概述

### 调用入口

`render` 方法是游戏主场景（Game Scene）的渲染总入口，由 `MainCanvas#paint(Graphics)` 在 `pageStatus == 7`（即 `GAME_SCENE` 状态）时调用。

调用路径：

```
MainCanvas#paint(Graphics)           // MainCanvas.java:L1133
  └── [pageStatus == 7]
        └── gameSceneController.render(Graphics)   // GameSceneController.java:L2272
```

### 架构位置

```
┌─────────────────────────────────────────┐
│             MainCanvas (主画布)           │
│  paint() → [pageStatus=7] → render()    │
├─────────────────────────────────────────┤
│          GameSceneController             │
│  render()  ← 主场景渲染总入口             │
│    ├── 世界层（地图 + 实体）               │
│    ├── HUD 层（状态栏 + 地图名）           │
│    └── UI 层（子场景界面）                 │
└─────────────────────────────────────────┘
```

---

## 2. 渲染分层结构

`render` 方法按照从底到顶的顺序依次绘制，共分为十三个逻辑层。

---

### 第一层：黑色背景清屏

**文件位置：** `GameSceneController.java:2273-2280`

- 条件：首次渲染（`touchEnable == false`）或地图尺寸小于屏幕时
- 使用黑色矩形 `fillRect` 填满整个屏幕
- 作用：防止地图较小时屏幕边缘出现残影

---

### 第二层：地图渲染（TileMap）

**文件位置：** `GameSceneController.java:2282-2288`

- 调用 `MainCanvas.pngUtil.a(var1, this.currentMap, h, i_1, ...)` 绘制地图图块
- `this.currentMap` 为 `TileMap` 对象，包含：
  - `mapBlock`：地面图块网格（地形瓦片）
  - `fixedObj`：固定对象（树木、建筑等静态装饰）
  - 动画对象（水面、火焰等循环动画图块）
- `h` / `i_1`：当前视口偏移（摄像机坐标）
- 非战斗/特殊场景（`sceneModeId != 1/5/7/18/25/130`）时附带边界裁剪参数

---

### 第三层：场景实体渲染（`y` 方法）

**文件位置：** `GameSceneController.java:15581-15699`

遍历 `bl` 列表（按深度/Y坐标排序的场景实体 `by` 对象），按 `by.b` 类型分类绘制：

| `by.b` 值 | 实体类型 | 绘制内容 |
|-----------|---------|---------|
| `1` | 主角色 | 调用 `sceneRefreshCoordinator.a()`，含移动插值动画 |
| `2` | 其他玩家 | 绘制角色帧 + 玩家名字 + 称号图标（`y`/`z` 方法） |
| `3` | 宠物/坐骑 | 绘制宠物帧 + 宠物名字（`bp_1` 对象） |
| `4` | 跟随对象 | 调用 `au.a()`（`au` 对象） |
| `5` | NPC | 绘制 NPC 动画帧 + NPC 名字，近距离时高亮显示 |
| `6` | 地图装饰 SpritePiece | 静态图片对象（贴图精灵） |
| `7` | 场景特效 | `s` 特效对象渲染 |
| `8` | 特殊实体 | `bv` 对象渲染 |

---

### 第四层：地板装备高亮

**文件位置：** `GameSceneController.java:2299-2303`

- 条件：有地板装备（`GlobalStatus.equipmentId != null`）且地图碰撞图存在
- 调用 `pngUtil.roleSelectedAnimation()` 绘制装备落地高亮动画（`bn` 动画）
- 作用：在玩家脚下标示出可拾取的掉落装备位置

---

### 第五层：小地图 / 坐标调试信息

**文件位置：** `GameSceneController.java:2308-2344`

- 条件：`aW[6] == 0 && !GlobalStatus.G()`（非 GM 模式）且 `currentSceneModeId == 0`（大地图模式）
- 绘制内容：
  - 小地图缩略图（`pngUtil.a()`，按 `fenBianLv` 比例缩放）
  - 当前格坐标文字（红色字体，格式 `x/16, y/16`）
  - 地板装备位置：用 2×2 红点标出（`frameStartTs % 8 == 0` 闪烁）
  - NPC 位置：用浅紫色小点标出（移动中的 NPC 以 `frameStartTs % 5 == 0` 闪烁）
- GM 模式（`GlobalStatus.G() == true`）时在右上角单独显示角色 id / ic 调试信息（两个独立分支，不与小地图共存）

---

### 第六层：HUD 状态栏（`A` 方法）

**文件位置：** `GameSceneController.java:15716-15783`

绘制右上角角色状态面板：

| 元素 | 说明 |
|------|------|
| `bq` 背景图 + `v` 图标 | 头像/状态底板 |
| 血量进度条 | 红色 3 行渐变线段，宽度 = `GlobalStatus.currentHealth * 30 / GlobalStatus.totalHealth` |
| 法力进度条 | 蓝色 3 行渐变线段，宽度 = `GlobalStatus.totalMana * 30 / GlobalStatus.currentMana` |
| 经验进度条 | 棕色 3 行渐变线段，宽度由 `GlobalStatus.h` 三档决定：`0→30px / 1→20px / 2→10px` |
| 背包格数字 | `B` 数字精灵 + `GlobalStatus.backpackCapacityLimit`，支持 1~3 位数显示 |
| 队伍成员名字 | 遍历 `GlobalStatus.teamBonus`（`bp_1[]`），过滤自身后右上角绿色文字列表 |
| 战斗生命恢复图标 | `GlobalStatus.bf != 0` 时显示，背景颜色以 `frameCounter % 8 / 4` 交替闪烁（`br` 图标） |

---

### 第七层：地图名称

**文件位置：** `GameSceneController.java:2350`

- 调用 `LoadingPage.drawString()` 在屏幕左上角坐标 `(20, 2)` 绘制地图名
- 普通区域显示白色，PK 区域显示红色

---

### 第八层：快捷聊天栏（`x` 方法）

**文件位置：** `GameSceneController.java:15505-15526`

- 条件：`currentSceneModeId == 0` 或 `25`，且对应 `aW[5] == 0` 或 `aW[11] == 0`
- 显示最多 3 条最近聊天记录（来自 `cD` 列表）
- 位置：屏幕底部
- 样式：半透明黑色背景，聊天文字叠加

---

### 第九层：阵营分数显示

**文件位置：** `GameSceneController.java:2362-2377`

- 条件：`currentSceneModeId == 0` 且 `GlobalStatus.bw == 2`
- 在屏幕顶部中央显示双方阵营积分
- 或显示阵营比 + 个人当前积分

---

### 第十层：复活倒计时浮字

**文件位置：** `GameSceneController.java:2379-2381`

- 条件：`GlobalStatus.bu == true`
- 在屏幕中上方绘制复活倒计时秒数
- 样式：红色底色 + 白色文字

---

### 第十一层：聊天提示图标

**文件位置：** `GameSceneController.java:2383-2399`

- 条件：`currentSceneModeId != 25`
- 无邮件/密语时：`this.n == true` 才绘制 `talk_01` 普通聊天图标（右侧 x=defaultWidth-10, y=40）
- 有邮件或密语时优先显示对应图标：
  - `GlobalStatus.P.o == true`（密语）→ 显示 `be_1.e[0]` 密语图标
  - `GlobalStatus.O.u == true`（邮件）→ 显示 `bo_1.g[0]` 邮件图标

---

### 第十二层：战斗标题对话框（`currentSceneModeId == 0`）

**文件位置：** `GameSceneController.java:2401-2436`

- `this.J != null` 时绘制确认/取消对话框
- 系统公告跑马灯：`GlobalStatus.k` 字符串，从右向左滚动
- 技能/属性信息滚动文字：`GlobalStatus.E == 1` 时显示

---

### 第十三层：子场景 UI（`switch(currentSceneModeId)`）

按当前场景模式（`currentSceneModeId`）分发到具体子界面绘制方法，详见第 4 节。

---

## 3. 关键子方法说明

| 方法 | 位置 | 职责 |
|------|------|------|
| `render(Graphics)` | L2272 | 渲染总入口，协调所有分层绘制 |
| `y(Graphics)` | L15581 | 场景实体渲染，按深度遍历 `bl` 列表 |
| `A(Graphics)` | L15716 | HUD 状态栏绘制（血/蓝/经验/背包） |
| `x(Graphics)` | L15505 | 快捷聊天栏绘制 |
| `b(Graphics)` | — | 战斗场景（`sceneModeId == 1`）子界面 |
| `e(Graphics)` | — | 角色信息页（`sceneModeId == 5`）子界面 |
| `f(Graphics)` | — | 战斗子状态界面（`sceneModeId == 7`） |
| `o(Graphics)` | — | 坐骑/宠物界面（`sceneModeId == 13`） |
| `t(Graphics)` | — | 装备操作 / 战场全屏界面 |
| `u(Graphics)` | — | 战斗地图场景（`sceneModeId == 18`） |
| `v(Graphics)` | — | 合成/强化界面（`sceneModeId == 22`） |
| `z(Graphics)` | — | 宝箱/特殊交互（`sceneModeId == 39`） |

---

## 4. `currentSceneModeId` 对应界面说明

### 核心场景模式

| 场景码 | 说明 | 绘制入口 |
|--------|------|---------|
| `0` | **大地图（主游戏界面）** | 直接在 `render` 内处理（公告、对话框） |
| `1` | **战斗场景** | `this.b(var1)` |
| `2` | **NPC 对话 / 银行操作** | `LoadingPage.a()` |
| `4` | **装备操作界面** | `this.t(var1)` + `this.c(var1, ...)` |
| `5` | **角色信息页** | `this.e(var1)` |
| `7` | **战斗子状态（技能/装备选择）** | `this.f(var1)` |
| `9` | **出售界面** | `this.c(var1, "卖东西")` |
| `12` | **装备/技能查看** | `this.t(var1)` + `this.k(var1)` |
| `13` | **坐骑/宠物界面** | `this.o(var1)` |
| `18` | **战斗地图场景** | `this.u(var1)` |
| `22` | **合成/强化** | `this.v(var1)` |
| `25` | **战斗状态（战场全屏）** | `this.t(var1)` |
| `39` | **宝箱/特殊交互** | `this.z(var1)` + 角色动画 |
| `61` | **等待复活** | 显示"离复活还有 N 秒" |
| `62` | **确认对话框** | `LoadingPage.drawDialog()` |

### 通用 MixedUi 面板（共用组件）

以下场景码均使用 `this.mainCanvasRef.mixedUi.draw(var1)` 渲染：

`3` / `6` / `10` / `14` / `15` / `19` / `21` / `23` / `28~31` / `38` / `40~50` / `52` / `53` / `57~60`

涵盖：背包、技能、装备、帮派、好友、市场等各类系统界面。

### 战斗相关子系统

| 场景码 | 绘制入口 |
|--------|---------|
| `64` | `this.O.a(var1)` |
| `65` | `this.O.b(var1)` |
| `66` | `this.O.c(var1)` |
| `67` / `106` | `this.O.d(var1)` |

### 其他子系统

| 场景码 | 绘制入口 |
|--------|---------|
| `8` | `this.q(var1)` |
| `11` | `this.r(var1)` |
| `24` | `this.s(var1)` |
| `30` | `this.n(var1)` |
| `32` | `this.w(var1)` |
| `34` | `this.l(var1)` |
| `35` | `this.m(var1)` |
| `36` | `this.g(var1)` |
| `37` | `this.a(var1, 0)` |
| `70` | `this.B(var1)` |
| `71` | `this.E(var1)` |
| `72` | `this.F(var1)` |
| `76` | `this.D(var1)` |
| `77` | `this.C(var1)` |
| `90~93` | `this.S.a/b/c/d(var1)` |
| `94` | `this.c(var1)` |
| `95` | `this.p(var1)` |
| `98` | `this.K(var1)` |
| `100` | `this.G(var1)` |
| `101` | `this.U.a(var1)` |
| `102` | `this.V.a(var1)` |
| `103~105` | `this.J/H/I(var1)` |
| `107~111` | `this.L/M/O/N(var1)` |
| `113~120` | `this.M.a/b/c/d(var1)` 等（帮派系统） |
| `121~123` | `this.i/j/h(var1)` |
| `125~128` | `this.U/d/V/W(var1)` |
| `130` | `this.N.a(var1)` |
| `131` | `this.W.a(var1)` |

---

## 5. 关键辅助类速查表

| 类名 | 所在文件 | 职责 |
|------|---------|------|
| `PngUtil` | `mhxy_s/src/com/cc/PngUtil.java` | 核心精灵渲染工具，提供图块/动画/角色帧绘制 |
| `TileMap` | `mhxy_s/src/com/cc/resource/TileMap.java` | 地图数据（图块网格、碰撞图、固定/动画对象） |
| `LoadingPage` | `mhxy_s/src/com/cc/LoadingPage.java` | 通用 UI 绘制工具（字符串、矩形、对话框、进度条等） |
| `MixedUi` | `mhxy_s/src/com/cc/MixedUi.java` | 通用面板容器，管理子组件（TopUi/BottomUi/GunDongListUi） |
| `TopUi` | — | 顶部标签栏组件 |
| `BottomUi` | — | 底部按钮栏组件 |
| `GunDongListUi` | — | 滚动列表 UI 组件 |
| `GlobalStatus` | `mhxy_s/src/com/cc/GlobalStatus.java` | 全局状态（血量、法力、地图名、背包、装备等数据） |
| `GlobalConfig` | — | 全局配置（屏幕宽高、字体等常量） |
| `FWBRender` | — | 多行文本换行渲染器 |
| `Animation` | — | 精灵动画帧序列管理 |
| `ac`（`SceneRefreshCoordinator`） | — | 主角位置/移动/帧更新协调器，字段名 `sceneRefreshCoordinator`，实际类名 `ac` |
| `MainCanvas` | `mhxy_s/src/com/yinhan/kjava/main/MainCanvas.java` | 主画布，持有所有 Controller 引用，调用 `render` |

---

## 6. 渲染层级总览图

```
render(Graphics)
│
├── [Layer 1]  黑色背景清屏（首次渲染/小地图场景）
│
├── [Layer 2]  TileMap 地图图块渲染（currentMap）
│               └── PngUtil.a() → mapBlock + fixedObj + 动画对象
│
├── [Layer 3]  场景实体渲染 y()
│               ├── b=1  主角色（ac / sceneRefreshCoordinator）
│               ├── b=2  其他玩家（角色帧 + 名字 + 称号）
│               ├── b=3  宠物/坐骑（bp_1）
│               ├── b=4  跟随对象（au）
│               ├── b=5  NPC（动画帧 + 名字 + 高亮）
│               ├── b=6  SpritePiece 地图装饰
│               ├── b=7  场景特效（s）
│               └── b=8  特殊实体（bv）
│
├── [Layer 4]  地板装备高亮（bn 动画）
│
├── [Layer 5]  小地图 + 坐标调试信息（大地图模式）
│
├── [Layer 6]  HUD 状态栏 A()
│               ├── 角色头像/状态底板
│               ├── 血量/法力/经验进度条
│               ├── 背包格数
│               └── 队伍成员名字
│
├── [Layer 7]  地图名称（左上角）
│
├── [Layer 8]  快捷聊天栏 x()（底部聊天记录）
│
├── [Layer 9]  阵营分数（顶部中央）
│
├── [Layer 10] 复活倒计时浮字
│
├── [Layer 11] 聊天/邮件/密语提示图标（右侧）
│
├── [Layer 12] 战斗标题对话框 + 系统公告跑马灯
│
└── [Layer 13] 子场景 UI switch(currentSceneModeId)
                ├── 0   → 大地图（主游戏界面）
                ├── 1   → b() 战斗场景
                ├── 2   → LoadingPage.a() NPC 对话
                ├── 3+  → mixedUi.draw() 各系统面板
                └── ... → 其他子方法
```

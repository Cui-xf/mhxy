# 项目架构文档

本文档描述项目的整体运行框架和核心机制，供开发者快速理解项目而无需逐文件阅读源码。
以下描述为kotlin项目的整体框架，kotlin版项目目录：mhxy_m
java版项目是原始游戏反编译得到的，java版项目目录：mhxy_s

## 1. 技术栈

- **语言**: Kotlin
- **图形框架**: libGDX (Desktop/Lwjgl3)
- **虚拟分辨率**: 240x320，通过 `FitViewport` 自适应窗口大小
- **帧率**: 60 FPS

## 2. 应用启动流程

```
main() [DesktopLauncher.kt]
  └─ Lwjgl3Application(MhxyGame, config)
       └─ MhxyGame.create()  →  setScreen(LogoScreen())
```

`MhxyGame` 是全局单例 (`object`)，继承 libGDX 的 `Game`。它通过 `pendingScreen` 延迟切屏：`setScreen()` 仅记录待切换 Screen，在下一帧 `render()` 开始时才真正执行切换并 dispose 旧 Screen，避免在渲染中途切屏导致问题。

## 3. Screen 生命周期

所有 Screen 继承 `AbstractScreen`（继承 libGDX 的 `ScreenAdapter`）。

### 3.1 渲染主循环

```
AbstractScreen.render(delta)
  ├─ glClear 清屏
  ├─ 若资源未加载完毕 → assetLoader.update() → return（跳过本帧）
  ├─ fillInput()  →  更新 TouchContext 全局触摸坐标
  ├─ viewport.apply() + 设置投影矩阵
  └─ update(delta)  →  子类实现的业务逻辑
```

**关键点**:
- 资源加载是异步的，`render()` 每帧调用 `assetLoader.update()` 推进加载，直到 `isFinished()` 返回 true 后才开始执行 `update()`
- `fillInput()` 在每帧渲染前将物理触摸坐标通过 viewport 反投影到虚拟坐标系，写入全局 `TouchContext`

### 3.2 AbstractScreen 提供的基础设施

| 成员 | 说明 |
|---|---|
| `batch: SpriteBatch` | 精灵绘制批处理器 |
| `sr: ShapeRenderer` | 形状渲染器（已自动同步 camera 矩阵） |
| `assetLoader: AssetLoader` | 资源加载器 |
| `autoDispose { ... }` | 将创建的 Disposable 对象注册为自动释放，Screen.dispose() 时统一释放 |
| `resource(assetManager, name, type)` | 注册并延迟加载资源，返回 `Lazy<T>` |

## 4. 坐标系

项目使用 **左上角为原点、Y 轴向下** 的坐标系（与 J2ME 原版一致），但 libGDX 原生是左下角原点、Y 轴向上。所有渲染扩展函数（`SpriteRender.kt`）内部做了转换：

```
libGDX_Y = VIRTUAL_H - 项目Y - 图片高度
```

`TouchContext` 也在 `fillInput()` 中做了 Y 轴翻转：
```kotlin
TouchContext.touchY = VIRTUAL_H - _touchVec.y
```

所以业务代码始终使用 **左上角原点** 坐标。

## 5. UI 组件体系

### 5.1 类继承

```
UIComponent (抽象基类)
  └─ UIContainer (容器基类，可包含子组件)
       ├─ WindowPanel  (带标题栏和边框的窗口)
       ├─ TabGroup     (标签页切换)
       └─ ScrollPanel  (滚动面板)
```

### 5.2 UIComponent 核心接口

```kotlin
abstract class UIComponent(assetLoader: AssetLoader) : Disposable {
    // 渲染：cx,cy 为左上角坐标，cw,ch 为可用宽高
    abstract fun render(batch, sr, cx, cy, cw, ch, delta)

    // 事件监听：注册对特定类型事件的处理函数
    fun <T> onEvent(handler: (T) -> Unit)

    // 事件发射：向上冒泡，直到被某个 listener 处理
    fun emit(data: Any)

    // 资源加载
    fun <T> resource(assetManager, name, type): Lazy<T>
}
```

### 5.3 渲染流程

UIComponent 的 `render()` 接收父容器分配的矩形区域 `(cx, cy, cw, ch)`，在此区域内绘制自身内容。

UIContainer 的渲染分两步：
1. `renderSelf()` — 绘制容器自身（边框、背景等）
2. `renderChildren()` — 遍历子组件，根据 `border()` 计算内边距后传递给子组件

### 5.4 事件冒泡机制

```
UIComponent.emit(data)
  ├─ 遍历自身 listeners，找到类型匹配的 handler 并调用
  │   └─ 若匹配到 → handled = true
  └─ 若未被处理 → parent?.emit(data)  向父容器冒泡
```

**Screen 级别的事件收集**: Screen 中所有顶层组件通过 `onEvent<Action>(handler)` 注册监听。组件 `emit(Action)` 后，事件冒泡到顶层组件的 listeners，被 Screen 的 handler 统一处理。

示例（FightScreen2）:
```
ActionButton.emit(SkillButton)
  → component.listeners[Action] 匹配
    → handleAction(SkillButton)
      → fightModel.state = fightModel.state.on(SkillButton, fightModel)
```

## 6. 触摸/点击处理

### 6.1 TouchContext

`TouchContext` 是全局单例，保存当前帧的触摸状态：

```kotlin
object TouchContext {
    var touchX: Float     // 虚拟坐标系下的触摸 X
    var touchY: Float     // 虚拟坐标系下的触摸 Y
    var justTouched: Boolean  // 本帧是否刚按下（单次点击检测）
}
```

每帧由 `AbstractScreen.fillInput()` 更新。

### 6.2 点击检测

组件在 `render()` 中主动调用 `TouchContext.inTouch(x, y, w, h)` 判断点击：

```kotlin
fun inTouch(rect: Rectangle, clear: Boolean = false): Boolean {
    val hit = justTouched && rect.contains(touchX, touchY)
    if (hit && clear) justTouched = false  // 消费事件，防止穿透
    return hit
}
```

**注意**: 这是轮询式的点击检测（在 render 中检查），不是回调式。`clear = true` 可消费点击事件防止多个组件响应同一次点击。

## 7. 资源加载体系

**注意！！！**: kotlin项目的资源是从java项目迁移过来的，有些资源在kotlin项目找不到，说明只是还还没有迁移过来，这时候需要提示用户迁移这部分资源，然后再继续，而不是随意用一个现有资源代替

### 7.1 架构

```
AssetManagerFactory (全局单例，创建和管理 AssetManager)
  └─ PUBLIC_ASSET: AssetManager (注册了自定义 Loader)
       ├─ RpgAnimationLoader  →  加载 .anim 文件 → RpgAnimation
       ├─ RpgPicLoader        →  加载 .pic 文件 → TextureRegion
       └─ RpgTailMapLoader    →  加载地图 → TileMap
```

### 7.2 使用方式

在 UIComponent 或 AbstractScreen 中声明资源：

```kotlin
// 声明即注册加载，返回 Lazy<T>，首次 .value 时取值
private val icon by resource(PUBLIC_ASSET, "rpg/icon/1000.pic", TextureRegion::class)
private val anim by resource(PUBLIC_ASSET, "rpg/role/f30011.anim", RpgAnimation::class)
```

`resource()` 内部调用 `AssetLoader.resource()`:
1. 调用 `assetManager.load(name, type)` 注册异步加载任务
2. 返回 `lazy { assetManager.get(name, type) }` — 首次访问时获取已加载的资源

`AbstractScreen.render()` 会在每帧调用 `assetLoader.update()` 推进加载，所有资源加载完毕后才调用 `update()`，所以在 `render/update` 中访问 `by resource` 声明的资源时，资源一定已经加载完成。

### 7.3 RpgAnimation

`RpgAnimation` 继承 libGDX `Animation<List<Frame>>`，每一帧是一个 `List<Frame>`（支持一帧多图层）：

```kotlin
data class Frame(
    val transX: Int, val transY: Int,      // 相对锚点的偏移
    val flipX: Boolean, val flipY: Boolean, // 翻转
    val rotation: Float,                    // 旋转角度
    val textureRegion: TextureRegion        // 图像切片
)
```

播放动画:
```kotlin
val frames: List<Frame> = anim.getKeyFrame(timer, looping = true)
batch.drawAnimation(frames, originX, originY)
```

## 8. 渲染工具函数

`com.cc.render` 包提供了一组扩展函数，统一处理坐标系转换：

| 函数 | 说明 |
|---|---|
| `SpriteBatch.drawString()` | 绘制文字，支持 LEFT/CENTER/RIGHT 对齐 |
| `SpriteBatch.wordArtString()` | 带描边的艺术字（多次偏移绘制） |
| `SpriteBatch.drawImage()` | 绘制 Texture/TextureRegion |
| `SpriteBatch.drawAnimation()` | 绘制帧动画（多图层） |
| `SpriteBatch.drawFrame()` | 绘制单个 Frame |
| `ShapeRenderer.drawRect()` | 绘制填充矩形 |
| `ShapeRenderer.drawLine()` | 绘制线段 |
| `ShapeRenderer.drawRectBorder()` | 绘制多层边框（在 SurroundRender.kt） |
| `Int.toColor()` | 整数颜色值转 libGDX Color（带缓存） |

对齐枚举：`enum class Align { LEFT_TOP, CENTER_TOP, RIGHT_TOP }`

## 9. 状态机 (FightState)

### 9.1 结构

```kotlin
sealed class FightState(register: FightState.() -> Unit) {
    internal val handlers = mutableMapOf<KClass<*>, (Action, FightModel) -> FightState>()
    init { register() }  // 构造时执行注册 block

    // 注册 handler 的重载
    fun <T: Action> r(handler: (T, FightModel) -> FightState)  // 需要 Action + Model
    fun <T: Action> r(handler: (T) -> FightState)              // 只需要 Action

    // 状态转移
    fun on(action: Action, fightModel: FightModel): FightState
}
```

### 9.2 工作方式

每个状态是 `FightState` 的子类（object 或 data class），在构造时通过 `register` block 注册自己能响应的 Action：

```kotlin
object WaitSelectSkill : FightState({
    r<Back> { WaitAction }                           // Back → 回到等待行动
    r<SelectSkill> { WaitSelectTarget(it.skill) }    // 选技能 → 进入选目标
})
```

状态推进: `fightModel.state = fightModel.state.on(action, fightModel)`

### 9.3 注意事项

- **data class 状态**: 可携带数据（如 `WaitSelectTarget(skill)`），每次创建新实例，适合需要携带上下文的状态；也可以包含 `var` 字段存储临时 UI 状态（如当前选中的目标）

## 10. Screen 组装模式

以 `FightScreen2` 为典型示例：

```kotlin
class FightScreen2(...) : AbstractScreen() {
    private val fightModel = FightModel()             // 共享数据模型

    private val component = listOf(
        autoDispose { BackGround(assetLoader, backGround) },
        autoDispose { FightRole(assetLoader, fightModel) },
        autoDispose { ActionButton(assetLoader, fightModel) },
        // ... 更多组件
    )

    init {
        component.forEach { it.onEvent<Action>(::handleAction) }  // 统一注册事件监听
    }

    override fun update(delta: Float) {
        for (c in component) {
            c.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)  // 顺序渲染
        }
    }

    private fun handleAction(action: Action) {
        fightModel.state = fightModel.state.on(action, fightModel)    // 推进状态机
    }
}
```

**模式总结**:
1. Screen 创建共享的数据模型（`FightModel`）
2. 所有组件通过构造参数接收同一个 model 实例
3. 组件在 `render()` 中读取 model 决定渲染内容，在 `render()` 中检测点击并 `emit(Action)`
4. Screen 通过 `onEvent<Action>` 统一接收所有组件的 Action，推进状态机
5. 状态机更新 model.state，下一帧各组件根据新状态渲染不同内容

## 11. 关键目录结构

```
mhxy_m/src/main/kotlin/com/cc/
├── MhxyGame.kt              # 全局 Game 单例
├── DesktopLauncher.kt       # Desktop 启动入口
├── FontManager.kt           # 字体管理
├── Util.kt                  # 工具函数
├── asset/                   # 资源加载体系
│   ├── AssetLoader.kt           # 资源加载器（注册+延迟取值）
│   ├── AssetManagerFactory.kt   # AssetManager 工厂（注册自定义 Loader）
│   ├── RpgAnimationLoader.kt   # .anim 加载器 → RpgAnimation
│   ├── RpgPicLoader.kt         # .pic 加载器 → TextureRegion
│   └── RpgTailMapLoader.kt     # 地图加载器 → TileMap
├── event/
│   └── TouchContext.kt          # 全局触摸状态
├── render/                  # 渲染扩展函数
│   ├── SpriteRender.kt         # drawImage, drawAnimation, drawFrame
│   ├── TextRender.kt           # drawString, wordArtString, Align
│   └── SurroundRender.kt       # drawRectBorder
├── ui/component/            # UI 组件框架
│   ├── UIComponent.kt          # 组件基类（render, emit, onEvent）
│   ├── UIContainer.kt          # 容器基类（children, border）
│   ├── WindowPanel.kt          # 窗口面板
│   ├── TabGroup.kt             # 标签页
│   └── ScrollPanel.kt          # 滚动面板
└── screens/                 # 各个 Screen
    ├── AbstractScreen.kt        # Screen 基类（渲染循环、输入、资源）
    ├── LogoScreen.kt
    ├── TitleScreen.kt
    ├── LoadingScreen.kt
    ├── RoleSelectScreen.kt
    ├── SceneLoadingScreen.kt
    ├── game/                    # 主城场景
    │   ├── GameScreen.kt
    │   ├── Player.kt, Npc.kt, Monster.kt
    │   ├── ScreenMap.kt, MiniMap.kt
    │   └── HudUI.kt
    └── fight2/                  # 战斗场景
        ├── FightScreen2.kt         # 战斗 Screen（组装组件 + 状态机驱动）
        ├── FightRole.kt            # 角色渲染（动画、血条、选择目标）
        ├── ActionButton.kt         # 行动按钮
        ├── SkillList.kt            # 技能列表
        ├── QuickBar.kt, Tips.kt, BackGround.kt, ReturnButton.kt
        └── model/                   # 战斗数据模型
            ├── FightModel.kt           # 战斗模型（角色列表、状态机）
            ├── FightState.kt           # 状态机（FightState + Action）
            ├── Role.kt                 # 角色数据
            └── Skill.kt               # 技能数据
```

package render

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Rectangle
import com.cc.asset.AssetLoader
import com.cc.event.TouchContext
import com.cc.render.Align
import com.cc.render.drawRect
import com.cc.screens.AbstractScreen
import com.cc.ui.component.ScrollPanel
import com.cc.ui.component.UIComponent

data class ClickEvent(val x: Float, val y: Float, val index: Int)

object ScrollPanelTest : AbstractScreen() {
    private val panel = ScrollPanel(this.assetLoader, contentHeight = 180f) {
        add(Content(assetLoader))
    }.onEvent<ClickEvent> { e ->
        println("clicked at: (${e.x}, ${e.y}) index: ${e.index}")
    }

    override fun update(delta: Float) {
        panel.render(batch, sr, 20f, 20f, 100f, 120f, delta)
    }
}

class Content(assetLoader: AssetLoader) : UIComponent(assetLoader) {
    private val colors = listOf(
        Color.RED, Color.GREEN,
        Color.BLUE, Color.YELLOW,
        Color.CYAN, Color.MAGENTA, Color.ORANGE, Color.PURPLE,
    )

    private val blockH = 50f

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float,
    ) {
        val rects = colors.mapIndexed { i, _ ->
            Rectangle(cx, cy + i * blockH, cw, blockH)
        }

        sr.begin(ShapeRenderer.ShapeType.Filled)
        for ((i, color) in colors.withIndex()) {
            sr.drawRect(color, rects[i].x, rects[i].y, rects[i].width, rects[i].height, Align.LEFT_TOP)
        }
        sr.end()

        for ((i, rect) in rects.withIndex()) {
            if (TouchContext.inTouch(rect)) {
                emit(ClickEvent(TouchContext.touchX, TouchContext.touchY, i))
            }
        }
    }
}

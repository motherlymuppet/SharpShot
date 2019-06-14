package com.durhack.sharpshot.registry.entries

import com.durhack.sharpshot.core.nodes.math.MultNode
import com.durhack.sharpshot.core.state.Direction
import com.durhack.sharpshot.gui.shapes.Draw
import com.durhack.sharpshot.registry.RegistryEntry
import javafx.scene.canvas.GraphicsContext
import javafx.scene.paint.Color

class MultNodeEntry() : RegistryEntry<MultNode>(
        MultNode(Direction.UP),
        "Multiply",
        "Multiplies two bullets"
                                               ) {

    override fun draw(node: MultNode,
                      gc: GraphicsContext,
                      x: Double,
                      y: Double,
                      scale: Int) {
        Draw.triangle(gc, node.direction, x, y, scale, Color.ORANGE)
        Draw.text(gc, "×", x, y, scale)
    }
}
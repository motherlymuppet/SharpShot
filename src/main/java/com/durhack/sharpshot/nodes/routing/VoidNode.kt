package com.durhack.sharpshot.nodes.routing

import com.durhack.sharpshot.Bullet
import com.durhack.sharpshot.Direction
import com.durhack.sharpshot.nodes.INode
import javafx.scene.paint.Color
import javafx.scene.shape.Circle
import java.math.BigInteger

class VoidNode : INode() {
    override fun run(bullet: Bullet): Map<Direction, BigInteger> = mapOf()
    override fun graphic() = Circle(16.0, Color.BLACK)
    override fun reset() {}
    override val type = "void"
    override val tooltip = "Consumes all incoming bullets"
}

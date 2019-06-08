package com.durhack.sharpshot.gui

import com.durhack.sharpshot.core.nodes.routing.BranchNode
import com.durhack.sharpshot.core.state.Bullet
import com.durhack.sharpshot.core.state.Coordinate
import com.durhack.sharpshot.core.state.Direction
import com.durhack.sharpshot.gui.container.CenteredScrollPane
import com.durhack.sharpshot.gui.container.ContainerController
import com.durhack.sharpshot.util.container
import tornadofx.*
import java.math.BigInteger

class MainView(): View(){
    private val containerController: ContainerController by inject()

    override val root = borderpane {
        center{
            val containerView = containerController.view
            val containerScrollPane = CenteredScrollPane(containerView)
            add(containerScrollPane)

            //TODO remove
            container.nodes[Coordinate(1, 1)] = BranchNode(Direction.UP)
            container.nodes[Coordinate(2, 1)] = BranchNode(Direction.RIGHT)
            container.nodes[Coordinate(3, 1)] = BranchNode(Direction.DOWN)
            container.nodes[Coordinate(4, 1)] = BranchNode(Direction.LEFT)
            container.nodes[Coordinate(10, 5)] = BranchNode(Direction.UP)
            val bullet = Bullet(Coordinate(2,2), Direction.DOWN, BigInteger.TEN)
            container.bullets.add(bullet)
            containerView.render()
        }
    }
}
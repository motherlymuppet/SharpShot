package com.durhack.sharpshot.nodes;

import com.durhack.sharpshot.Bullet;
import com.durhack.sharpshot.Direction;
import com.durhack.sharpshot.INode;
import com.durhack.sharpshot.gui.Triangle;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class NodeIn implements INode {
    private Direction dir = Direction.UP;
    private final int index;

    public NodeIn(int index) {
        this.index = index;
    }

    @Override
    public @NotNull Direction getRotation() {
        return dir;
    }

    @Override
    public void rotateClockwise() {
        dir = Direction.clockwiseOf(dir);
    }

    //@Override
    public @NotNull Map<Direction, BigInteger> into(@NotNull BigInteger val) {
        HashMap<Direction, BigInteger> map = new HashMap<>();
        map.put(dir,val);
        return map;
    }

    @Override
    public String toString() {
        return "In";
    }

    @Override
    public @NotNull Map<Direction, BigInteger> run(@NotNull Bullet bullet) {
        return new HashMap<>();
    }

    @Override
    public @NotNull Node toGraphic() {
        return new Triangle(getRotation(), Color.web("#FFFF00"), "IN" + index);
    }

    public void reset() {   }

    public int getIndex() {
        return index;
    }
}

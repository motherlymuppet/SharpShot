package com.durhack.sharpshot.nodes;

public class NodeIfPositive extends NodeIfCondition {
    @Override
    public boolean branchingCondition(int signum) {
        return (signum == 1);
    }
}

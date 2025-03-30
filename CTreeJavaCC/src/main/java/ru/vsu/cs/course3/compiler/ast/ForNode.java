package ru.vsu.cs.course3.compiler.ast;

import java.util.*;

public class ForNode implements ExprNode, StmtNode {
    private StmtNode init = null;
    private ExprNode cond = null;
    private StmtNode step = null;
    private StmtNode body = null;

    public ForNode(StmtNode init, ExprNode cond, StmtNode step, StmtNode body) {
        this.init = init;
        this.cond = cond;
        this.step = step;
        this.body = body;
    }

    @Override
    public Collection<? extends AstNode> childs() {
        List<AstNode> children = new ArrayList<>();
        if (init != null) children.add(init);
        if (cond != null) children.add(cond);
        if (step != null) children.add(step);
        if (body != null) children.add(body);
        return children;
    }

    @Override
    public String toString() {
        return "ForNode";
    }

    public StmtNode getInit() {
        return init;
    }

    public ExprNode getCond() {
        return cond;
    }

    public StmtNode getStep() {
        return step;
    }

    public StmtNode getBody() {
        return body;
    }
}

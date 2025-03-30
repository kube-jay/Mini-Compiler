package ru.vsu.cs.course3.compiler.ast;

import java.util.*;

public class StmtListNode implements StmtNode {
    private List<StmtNode> stmts = new ArrayList<>();

    public StmtListNode(Collection<StmtNode> stmts) {
        if (stmts != null) {
            this.stmts.addAll(stmts);
        }
    }

    public StmtListNode(StmtNode... stmts) {
        this(Arrays.asList(stmts));
    }

    @Override
    public Collection<? extends AstNode> childs() {
        return stmts;
    }

    @Override
    public String toString() {
        return "StmtListNode (" + stmts.size() + " statements)";
    }

    public List<StmtNode> getStmts() {
        return Collections.unmodifiableList(stmts);
    }
}

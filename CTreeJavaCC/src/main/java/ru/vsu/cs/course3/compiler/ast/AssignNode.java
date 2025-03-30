package ru.vsu.cs.course3.compiler.ast;

import java.util.*;

public class AssignNode implements StmtNode {
    private IdentNode ident = null;
    private ExprNode expr = null;
    private TypeNode type = null;

    public AssignNode(TypeNode type, IdentNode ident, ExprNode expr) {
        this.type = type;
        this.ident = ident;
        this.expr = expr;
    }

    public AssignNode(TypeNode type, IdentNode ident) {
        this.type = type;
        this.ident = ident;
    }

    public AssignNode(IdentNode ident, ExprNode expr) {
        this.ident = ident;
        this.expr = expr;
    }

    public AssignNode(IdentNode ident) {
        this.ident = ident;
    }

    @Override
    public Collection<AstNode> childs() {
        List<AstNode> children = new ArrayList<>();
        if (type != null) {
            children.add(type);
        }
        children.add(ident);
        if (expr != null) {
            children.add(expr);
        }
        return children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AssignNode: ");
        if (type != null) {
            sb.append(type).append(" ");
        }
        sb.append(ident);
        if (expr != null) {
            sb.append(" = ").append(expr);
        }
        return sb.toString();
    }

    public IdentNode getIdent() {
        return ident;
    }

    public ExprNode getExpr() {
        return expr;
    }
}

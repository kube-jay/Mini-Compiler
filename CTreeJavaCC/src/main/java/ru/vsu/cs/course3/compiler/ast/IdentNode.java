package ru.vsu.cs.course3.compiler.ast;

import java.util.Collection;
import java.util.Collections;

public class IdentNode implements ExprNode {
    private String name;

    public IdentNode(String name) {
        this.name = name;
    }

    @Override
    public Collection<? extends AstNode> childs() {
        return Collections.emptyList(); // no children
    }

    @Override
    public String toString() {
        return "Identifier: " + name;
    }

    public String getName() {
        return name;
    }
}

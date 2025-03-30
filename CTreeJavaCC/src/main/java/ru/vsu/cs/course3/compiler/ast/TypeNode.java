package ru.vsu.cs.course3.compiler.ast;

import java.util.Collection;
import java.util.Collections;

public class TypeNode implements AstNode {
    private String name;

    public TypeNode(String name) {
        this.name = name;
    }

    @Override
    public Collection<? extends AstNode> childs() {
        return Collections.emptyList(); // no children
    }

    @Override
    public String toString() {
        return "Type: " + name;
    }

    public String getName() {
        return name;
    }
}

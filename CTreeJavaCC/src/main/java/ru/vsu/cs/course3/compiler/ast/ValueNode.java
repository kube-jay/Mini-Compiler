package ru.vsu.cs.course3.compiler.ast;

import java.util.Collection;
import java.util.Collections;

public class ValueNode implements ExprNode {
    private String str;
    private Object value;

    public ValueNode(String str) {
        this.str = str;
        if (str.equals("true") || str.equals("false")) {
            this.value = Boolean.valueOf(str);
        } else if (str.startsWith("\"") || str.startsWith("'")) {
            this.value = str.substring(1, str.length() - 1);
        } else if (str.contains(".")) {
            this.value = Double.valueOf(str);
        } else {
            this.value = Integer.valueOf(str);
        }
    }

    @Override
    public Collection<? extends AstNode> childs() {
        return Collections.emptyList(); // it's a leaf node
    }

    @Override
    public String toString() {
        return "Value: " + value + " (" + value.getClass().getSimpleName() + ")";
    }

    public Object getValue() {
        return value;
    }
}

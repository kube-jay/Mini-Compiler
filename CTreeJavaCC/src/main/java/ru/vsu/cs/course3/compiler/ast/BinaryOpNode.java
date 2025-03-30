package ru.vsu.cs.course3.compiler.ast;

import java.util.Arrays;
import java.util.Collection;

public class BinaryOpNode implements ExprNode {

    public static enum BinOp {
        ADD("+"),
        SUB("-"),
        MUL("*"),
        DIV("/"),
        LESS("<"),
        EQUAL_OR_MORE(">="),
        EQUAL_OR_LESS("<="),
        NOTEQUAL("!="),
        EQUAL("=="),
        AND("&&"),
        OR("||"),
        MORE(">");

        public final String op;

        BinOp(String op) {
            this.op = op;
        }

        @Override
        public String toString() {
            return op;
        }
    }

    private BinOp op;
    private AstNode arg1;
    private AstNode arg2;

    public BinaryOpNode(String op, ExprNode arg1, ExprNode arg2) {
        this.op = Arrays.stream(BinOp.values()).filter(x -> x.op.equals(op)).findFirst().get();
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Override
    public Collection<AstNode> childs() {
        return Arrays.asList(arg1, arg2);
    }

    @Override
    public String toString() {
        return "BinaryOpNode: " + op;
    }

    public BinOp getOp() {
        return op;
    }

    public AstNode getArg1() {
        return arg1;
    }

    public AstNode getArg2() {
        return arg2;
    }
}

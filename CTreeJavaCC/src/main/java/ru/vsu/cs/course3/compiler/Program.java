package ru.vsu.cs.course3.compiler;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.PrintStream;
import java.io.FileOutputStream;

import ru.vsu.cs.course3.compiler.Parser;
import ru.vsu.cs.course3.compiler.ast.AstNode;

public class Program {
    public static void main(String[] args) throws Exception {
        Reader input = args.length > 0 ? new FileReader(args[0]) : new InputStreamReader(System.in);

        Parser parser = new Parser(input);
        AstNode result = parser.start();

        // Print to console
        System.out.println("=== Abstract Syntax Tree ===\n");
        result.printTree(System.out);

        // Also print to a log file
        PrintStream logFile = new PrintStream(new FileOutputStream("ast-log.txt"));
        result.printTree(logFile);
        logFile.close();

        System.out.println("\nAST was also saved to: ast-log.txt");
    }
}

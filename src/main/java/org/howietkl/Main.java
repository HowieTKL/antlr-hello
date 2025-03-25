package org.howietkl;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.howietkl.parser.HelloLexer;
import org.howietkl.parser.HelloParser;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    CharStream codePointCharStream = args.length != 0
        ? CharStreams.fromFileName(args[0])
        : CharStreams.fromString("Hello world");
    HelloLexer lexer = new HelloLexer(codePointCharStream);
    HelloParser parser = new HelloParser(new CommonTokenStream(lexer));
    ParseTree tree = parser.msg();
    MyVisitor visitor = new MyVisitor();
    visitor.visit(tree);
  }

}

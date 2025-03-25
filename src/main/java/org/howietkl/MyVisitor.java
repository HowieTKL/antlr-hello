package org.howietkl;

import org.howietkl.parser.HelloBaseVisitor;
import org.howietkl.parser.HelloParser;

public class MyVisitor extends HelloBaseVisitor<String> {

  @Override
  public String visitMsg(HelloParser.MsgContext ctx) {
    System.out.printf("%s says hello", ctx.ID().getText());
    return super.visitMsg(ctx);
  }

}

package Statements;

import org.antlr.runtime.tree.CommonTree;

import Expressions.Expression;

public class PrintLn extends Print implements Statement {
	public PrintLn(CommonTree errtree, Expression expr) {
		super(errtree, expr);
	}
	
	public void execute() {
		super.execute();
		System.out.print("\n");
	}
}

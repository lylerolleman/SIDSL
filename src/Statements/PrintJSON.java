package Statements;

import org.antlr.runtime.tree.CommonTree;

import Expressions.Expression;
import Global.Expr_Return;
import Global.GlobalMethods;

public class PrintJSON implements Statement {
	Expression expr;
	CommonTree errtree;
	
	public PrintJSON(CommonTree errtree, Expression expr) {
		this.expr = expr;
		this.errtree = errtree;
	}
	
	public void execute() {
		Expr_Return ret = expr.execute();
		GlobalMethods.printJSON(errtree, ret.value);
		System.out.println();
	}
}

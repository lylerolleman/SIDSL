package Statements;

import Expressions.Expression;
import Global.Expr_Return;
import Global.PersistentData;
import PIExceptions.ReturnException;
import SymbolTable.Scope;

public class Return implements Statement {
	Expression expr;
	
	public Return(Expression expr) {
		this.expr = expr;
	}
	
	public void execute() {
		if (expr != null) {
			Expr_Return ret = expr.execute();
			PersistentData.scopestack.pop();
			throw new ReturnException("return", ret);
		} else {
			Expr_Return ret = new Expr_Return(PersistentData.symtab.resolveType("void"), null);
			throw new ReturnException("return", ret);
		}
	}
}

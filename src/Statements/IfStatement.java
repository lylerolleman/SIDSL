package Statements;

import org.antlr.runtime.tree.CommonTree;

import Expressions.Expression;
import Global.Expr_Return;
import PIExceptions.LogicalTypeMismatchException;
import PIExceptions.TypeMismatchException;
import SymbolTable.VarValue;

public class IfStatement implements Statement {
	Expression cond;
	Block then;
	Block els;
	CommonTree errtree;
	
	public IfStatement(CommonTree errtree, Expression cond, Block then, Block els) {
		this.cond = cond;
		this.then = then;
		this.els = els;
		this.errtree = errtree;
	}
	
	public void execute() {
		Expr_Return condret = cond.execute();
		
		if (!condret.type.getName().equals("var") && !condret.type.getName().equals("key"))
			throw new LogicalTypeMismatchException(errtree, "Cannot perform this operation on an " + condret.type.getName());
		
		try {
			VarValue vv = (VarValue) condret.value.getValue();
			Boolean bcond = vv.getBool();
			if (bcond) 
				then.execute();
			else if (els != null)
				els.execute();
		} catch (ClassCastException cce) {
			throw new TypeMismatchException(errtree, "condition field must be a boolean value");
		} catch (NullPointerException npe) {
			throw new TypeMismatchException(errtree, "condition field must be a boolean value");
		}
	}
}

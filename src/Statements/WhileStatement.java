package Statements;

import org.antlr.runtime.tree.CommonTree;

import Expressions.Expression;
import Global.Expr_Return;
import PIExceptions.BreakException;
import PIExceptions.ContinueException;
import PIExceptions.LogicalTypeMismatchException;
import PIExceptions.TypeMismatchException;
import SymbolTable.VarValue;

public class WhileStatement implements Statement {
	Expression cond;
	Block block;
	CommonTree errtree;
	
	public WhileStatement(CommonTree errtree, Expression cond, Block block) {
		this.cond = cond;
		this.block = block;
		this.errtree = errtree;
	}
	
	public void execute() {
		Expr_Return condret = cond.execute();
		
		if (!condret.type.getName().equals("var") && !condret.type.getName().equals("key"))
			throw new LogicalTypeMismatchException(errtree, "Cannot perform this operation on an " + condret.type.getName());
		
		try {
			VarValue vv = (VarValue) condret.value.getValue();
			Boolean bcond = vv.getBool();
			while (bcond) {
				try {
					block.execute();
				} catch (BreakException be) {
					break;
				} catch (ContinueException ce) {
					continue;
				}
				condret = cond.execute();
				if (!condret.type.getName().equals("var") && !condret.type.getName().equals("key"))
					throw new LogicalTypeMismatchException(errtree, "Cannot perform this operation on an " + condret.type.getName());
				vv = (VarValue) condret.value.getValue();
				bcond = vv.getBool();
			}
		} catch (ClassCastException cce) {
			throw new TypeMismatchException(errtree, "condition field must be a boolean value");
		} catch (NullPointerException npe) {
			throw new TypeMismatchException(errtree, "condition field must be a boolean value");
		}
	}
}

package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.TypeSystem;
import PIExceptions.IllegalIndexException;
import SymbolTable.ArrayValue;
import SymbolTable.VarValue;

public class Index implements Expression {
	Identifier id;
	Expression expr;
	CommonTree errtree;
	
	public Index(CommonTree errtree, Identifier id, Expression expr) {
		this.id = id;
		this.expr = expr;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		Expr_Return idret = id.execute();
		Expr_Return indexret = expr.execute();
		VarValue vv = TypeSystem.getAsVar(indexret.value);
		Integer index = vv.getInteger();
		if (index == null)
			throw new IllegalIndexException(errtree, "An index must be an integer");
		ArrayValue av = TypeSystem.getAsArray(idret.value);
		
		return new Expr_Return(av.get(index).getType(), av.get(index));
	}
}

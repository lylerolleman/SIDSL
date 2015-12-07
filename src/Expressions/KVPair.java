package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import PIExceptions.TypeMismatchException;
import SymbolTable.KeyValue;
import SymbolTable.TypeSymbol;
import SymbolTable.VarValue;

public class KVPair implements Expression {
	Expression e1;
	Expression e2;
	CommonTree errtree;
	
	public KVPair(CommonTree errtree, Expression e1, Expression e2) {
		this.e1 = e1;
		this.e2 = e2;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		Expr_Return ret1 = e1.execute();
		Expr_Return ret2 = e2.execute();
		
		try {
			VarValue vv = (VarValue) ret1.value.getValue();
			return new Expr_Return(new TypeSymbol("key"), new KeyValue(vv.getString(), ret2.type, ret2.value));
		} catch (ClassCastException cce) {
			throw new TypeMismatchException(errtree, "key names must be a var");
		}
	}
}

package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.ErrorHandlers;
import Global.Expr_Return;
import Global.TypeSystem;
import PIExceptions.ArithmeticTypeMismatchException;
import PIExceptions.PIException;
import PIExceptions.TypeCastException;
import SymbolTable.ArrayValue;
import SymbolTable.TypeSymbol;
import SymbolTable.Value;
import SymbolTable.VarValue;

public class Concat implements Expression {
	Expression e1;
	Expression e2;
	CommonTree errtree;
	
	public Concat(CommonTree errtree, Expression e1, Expression e2) {
		this.e1 = e1;
		this.e2 = e2;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		Expr_Return ret1 = e1.execute();
		Expr_Return ret2 = e2.execute();
		
		try {
			return concat(TypeSystem.getAsVar(ret1.value), TypeSystem.getAsVar(ret2.value));
		} catch (TypeCastException cce) {
			try {
				return concat(TypeSystem.getAsArray(ret1.value), TypeSystem.getAsArray(ret2.value));
			} catch (TypeCastException cce2) {
				ErrorHandlers.reportArrayTypeError(errtree, ret1, ret2);
			}
		}
		
		//should never execute
		throw new PIException();
	}
	
	private Expr_Return concat(VarValue vv1, VarValue vv2) {
		return new Expr_Return(vv1.getType(), 
			new VarValue(vv1.getString() + vv2.getString()));	
	}
	private Expr_Return concat(ArrayValue av1, ArrayValue av2) {
		av1.getValue().addAll(av2.getValue());
		
		return new Expr_Return(av1.getType(), av1);
	}
}

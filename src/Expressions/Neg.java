package Expressions;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.PersistentData;
import Global.TypeSystem;
import PIExceptions.PIException;
import PIExceptions.NotANumberException;
import PIExceptions.TypeCastException;
import SymbolTable.KeyValue;
import SymbolTable.Value;
import SymbolTable.VarValue;
import SymbolTable.VectorValue;

public class Neg implements Expression {
	Expression expr;
	CommonTree errtree;
	
	public Neg(CommonTree errtree, Expression e) {
		this.expr = e;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		Expr_Return ex = expr.execute();
		return execute(ex.value);
	}
	
	private Expr_Return execute(Value v) {
		try {
			return execute(TypeSystem.getAsVar(v));
		} catch (TypeCastException tce) {
			try {
				return execute(TypeSystem.getAsVector(v));
			} catch (PIException ie) {
				throw tce;
			}
			
		}
	}
	
	private Expr_Return execute(VectorValue vv) {
		ArrayList<Value> result = new ArrayList<Value>();
		for (int i=0; i<vv.getSize(); i++) {
			result.add(execute(vv.get(i)).value);
		}
		return new Expr_Return(PersistentData.symtab.resolveType("vector"), new VectorValue(result));
	}
	
	private Expr_Return execute(VarValue v) {
		Integer i = v.getInteger();
		if (i == null) {
			
			Double d = v.getFloatingPoint();
			if (d == null)
				throw new NotANumberException(errtree);
			d = -d;
			v = new VarValue(d);
		} else {
			i = -i;
			v = new VarValue(i);
		}
		
		return new Expr_Return(v.getType(), v);
	}
}

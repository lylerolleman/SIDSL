package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.ErrorHandlers;
import Global.Expr_Return;
import Global.PersistentData;
import Global.Stats;
import Global.TypeSystem;
import PIExceptions.PIException;
import PIExceptions.LogicalTypeMismatchException;
import PIExceptions.TypeCastException;
import PIExceptions.TypeMismatchException;
import SymbolTable.KeyValue;
import SymbolTable.Value;
import SymbolTable.VarValue;
import SymbolTable.VectorValue;

public class NotEqual implements Expression {
	Expression e1;
	Expression e2;
	CommonTree errtree;
	
	public NotEqual(CommonTree errtree, Expression e1, Expression e2) {
		this.e1 = e1;
		this.e2 = e2;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		Expr_Return ret1 = e1.execute();
		Expr_Return ret2 = e2.execute();
		
		return execute(ret1.value, ret2.value);
	}
	
	private Expr_Return execute(Value val1, Value val2) {
		long starttime = 0;
		if (PersistentData.collect_stats)
			starttime = System.nanoTime();
		try {
			Expr_Return ret = execute(TypeSystem.getAsVar(val1), TypeSystem.getAsVar(val2));
			if (PersistentData.collect_stats)
				Stats.arithmetic_time += System.nanoTime() - starttime;
			return ret;
		} catch (TypeCastException cce) {
			try {
				VectorValue vv1 = TypeSystem.getAsVector(val1);
				VectorValue vv2 = TypeSystem.getAsVector(val2);
				Expr_Return ret;
				if (vv1.getSize() != vv2.getSize())
					ret = new Expr_Return(PersistentData.symtab.resolveType("var"), new VarValue(false));
				else {
					ret = execute(vv1, vv2);
				}
				if (PersistentData.collect_stats)
					Stats.arithmetic_time += System.nanoTime() - starttime;
				return ret;
			} catch (PIException ie) {
				ErrorHandlers.reportArithmeticTypeError(errtree,
						new Expr_Return(val1.getType(), val2), new Expr_Return(val2.getType(), val2));
			}
		}
		
		//should never execute
		throw new PIException();
	}
	
	private Expr_Return execute(VectorValue vv1, VectorValue vv2) {
		for (int i=0; i<vv1.getSize(); i++) {
			VarValue v = TypeSystem.getAsVar(execute(vv1.get(i), vv2.get(i)).value);
			if (!v.getBool())
				return new Expr_Return(PersistentData.symtab.resolveType("var"), new VarValue(false));
		}
		return new Expr_Return(PersistentData.symtab.resolveType("var"), new VarValue(true));
	}
	
	private Expr_Return execute(VarValue vv1, VarValue vv2) {
		Boolean res = null;
		try {
			res = !vv1.getFloatingPoint().equals(vv2.getFloatingPoint());
		} catch (NullPointerException npe) {
			res = !vv1.getString().equals(vv2.getString());
		}
		
		return new Expr_Return(PersistentData.symtab.resolveType("var"), new VarValue(res));
	}
}

package Expressions;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

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

public class Not implements Expression{
	Expression expr;
	CommonTree errtree;
	
	public Not(CommonTree errtree, Expression expr) {
		this.expr = expr;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		Expr_Return ret = expr.execute();
		
		return execute(ret.value);
	}
	
	public Expr_Return execute(Value v) {
		long starttime = 0;
		if (PersistentData.collect_stats)
			starttime = System.nanoTime();
		try {
			Expr_Return ret1 = execute(TypeSystem.getAsVar(v));
			if (PersistentData.collect_stats)
				Stats.logic_time += System.nanoTime() - starttime;
			return ret1;
		} catch (NullPointerException npe) {
			throw new TypeMismatchException(errtree, "This operation requires the operand to be boolean");
		} catch (TypeCastException tce) {
			try {
				Expr_Return ret1 = execute(TypeSystem.getAsVector(v));
				if (PersistentData.collect_stats)
					Stats.logic_time += System.nanoTime() - starttime;
				return ret1;
			} catch (PIException ie) {
				throw new TypeMismatchException(errtree, "This operation requires the operand to be boolean");
			}
		}
	}
	
	private Expr_Return execute(VectorValue vv) {
		ArrayList<Value> result = new ArrayList<Value>();
		for (int i=0; i<vv.getSize(); i++) 
			result.add(execute(vv.get(i)).value);
		return new Expr_Return(vv.getType(), new VectorValue(result));
	}
	
	private Expr_Return execute(VarValue vv) {
		Boolean res = !vv.getBool();
		
		return new Expr_Return(PersistentData.symtab.resolveType("var"), new VarValue(res.toString()));
	}
}

package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.PersistentData;
import Global.TypeSystem;
import PIExceptions.IllegalKeyReferanceException;
import SymbolTable.KeyValue;
import SymbolTable.VarValue;

public class Get implements Expression {
	Expression e;
	CommonTree errtree;
	
	public Get(CommonTree errtree, Expression e) {
		this.e = e;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		Expr_Return ret = e.execute();
		
		KeyValue kv = TypeSystem.getAsKey(ret.value);
		if (kv.getKey() == null)
			throw new IllegalKeyReferanceException(errtree);
		return new Expr_Return(PersistentData.symtab.resolveType("var"), new VarValue(kv.getKey()));
	}
}

package Statements;

import org.antlr.runtime.tree.CommonTree;

import Expressions.Expression;
import Global.Expr_Return;
import Global.PersistentData;
import Global.TypeSystem;
import PIExceptions.UndefinedIdentifierException;
import SymbolTable.KeyValue;
import SymbolTable.VariableSymbol;

public class Set implements Statement {
	Expression e;
	String id;
	CommonTree errtree;
	
	public Set(CommonTree errtree, String id, Expression e) {
		this.id = id;
		this.e = e;
		this.errtree = errtree;
	}
	
	public void execute() {
		Expr_Return ret = e.execute();
		
		VariableSymbol vs = (VariableSymbol) PersistentData.scopestack.peek().resolve(id);
		if (vs == null) 
			throw new UndefinedIdentifierException(errtree, "The identifier " + id + " is undefined");
		
		KeyValue kv = TypeSystem.getAsKey(vs.getValue());
		kv.setKey(TypeSystem.getAsVar(ret.value).getString());
		vs.setValue(kv);
	}
}

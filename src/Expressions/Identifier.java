package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.PersistentData;
import PIExceptions.NullIdentifierException;
import SymbolTable.Scope;
import SymbolTable.VariableSymbol;

public class Identifier implements Expression{
	String id;
	CommonTree errtree;
	
	public Identifier(CommonTree errtree, String id) {
		this.id = id;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		VariableSymbol vs = (VariableSymbol) PersistentData.scopestack.peek().resolve(id);
					
		try {
			return new Expr_Return(vs.getType(), vs.getValue());
		} catch (NullPointerException npe) {		
			throw new NullIdentifierException(errtree);
		}
	}
}

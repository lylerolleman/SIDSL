package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.PersistentData;
import Global.TypeSystem;
import PIExceptions.TypeCastException;
import SymbolTable.TypeSymbol;

public class Cast implements Expression {
	TypeSymbol type;
	Expression expr;
	CommonTree errtree;
	
	public Cast(CommonTree errtree, TypeSymbol type, Expression expr) {
		this.errtree = errtree;
		this.type = type;
		this.expr = expr;
	}
	
	public Expr_Return execute() {
		Expr_Return ret = expr.execute();
		switch (type.getName()) {
		case "var":
			return new Expr_Return(PersistentData.symtab.resolveType("var"), TypeSystem.getAsVar(ret.value));
		case "key":
			return new Expr_Return(PersistentData.symtab.resolveType("key"), TypeSystem.getAsKey(ret.value));
		case "array":
			return new Expr_Return(PersistentData.symtab.resolveType("array"), TypeSystem.getAsArray(ret.value));
		case "vector":
			return new Expr_Return(PersistentData.symtab.resolveType("vector"), TypeSystem.getAsVector(ret.value));
		case "object":
			return new Expr_Return(PersistentData.symtab.resolveType("object"), TypeSystem.getAsObject(ret.value));
		default:
			throw new TypeCastException(errtree, "This type cannot be cast");
		}
	}
}

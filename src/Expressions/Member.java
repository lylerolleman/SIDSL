package Expressions;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.PersistentData;
import Global.TypeSystem;
import PIExceptions.PIException;
import SymbolTable.ArrayValue;
import SymbolTable.VarValue;
import SymbolTable.VariableSymbol;

public class Member implements Expression {
	Expression expr;
	String member;
	CommonTree errtree;
	ArrayList<VariableSymbol> params;
	
	public Member(CommonTree errtree, String member, Expression expr, ArrayList<VariableSymbol> params) {
		this.errtree = errtree;
		this.expr = expr;
		this.member = member;
		this.params = params;
	}

	@Override
	public Expr_Return execute() throws PIException {
		Expr_Return ret = expr.execute();
		switch (ret.type.getName()) {
		case "array":
		case "vector":
			switch (member) {
			case "length":
				ArrayValue av = TypeSystem.getAsArray(ret.value);
				return new Expr_Return(PersistentData.symtab.resolveType("var"), new VarValue(av.getSize()));
			}
			break;
		case "object":
			break;
		default:
			throw new PIException();
		}
		return null;
	}
}

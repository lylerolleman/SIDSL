package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import SymbolTable.Value;

public class Atom implements Expression {
	Value value;
	//literal value
	public Atom(Value value) {
		this.value = value;
	}
	
	public Expr_Return execute() {
		return new Expr_Return(value.getType(), value);
	}
}

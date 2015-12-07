package Statements;
import Expressions.*;
import Global.GlobalMethods;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import PIExceptions.PrintException;
import SymbolTable.KeyValue;
import SymbolTable.Value;
import SymbolTable.VarValue;

public class Print implements Statement {
	Expression expr;
	CommonTree errtree;
	
	public Print(CommonTree errtree, Expression expr) {
		this.expr = expr;
		this.errtree = errtree;
	}
	
	public void execute() {
		GlobalMethods.print(errtree, expr.execute().value);
	}
}

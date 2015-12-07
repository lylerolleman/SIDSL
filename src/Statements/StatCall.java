package Statements;

import java.util.ArrayList;










import org.antlr.runtime.tree.CommonTree;

import PIExceptions.MismatchedArgumentsException;
import PIExceptions.ReturnException;
import PIExceptions.ReturnTypeMismatchException;
import PIExceptions.TypeMismatchException;
import SymbolTable.Scope;
import SymbolTable.VariableSymbol;
import Expressions.Expression;
import Global.Expr_Return;
import Global.PersistentData;
import Global.TypeSystem;

public class StatCall implements Statement {
	String id;
	ArrayList<Expression> args;
	CommonTree errtree;
	
	public StatCall(CommonTree errtree, String id) {
		this(errtree, id, null);
	}
	public StatCall(CommonTree errtree, String id, ArrayList<Expression> args) {
		this.id = id;
		this.errtree = errtree;
		if (args != null)
			this.args = args;
		else
			this.args = new ArrayList<Expression>();
	}
	
	public void execute() {
		ArrayList<Expr_Return> argres = execute(args);
		Function function = PersistentData.scopestack.peek().resolveFunction(id, argres);
		ArrayList<VariableSymbol> params = function.getParams();
		
		Scope es = PersistentData.symtab.getGlobalScope();
		Scope ns = new Scope(es);
		
		if (args.size() != params.size())
			throw new MismatchedArgumentsException(errtree);
		for (int i=0; i<args.size(); i++) {
			VariableSymbol vs = params.get(i);			
			
			vs.setValue(TypeSystem.promote(argres.get(i).value, vs.getType()));
			
			ns.define(vs);
		}
		PersistentData.scopestack.push(ns);
		try {
			function.getBlock().execute();
		} catch (ReturnException re) {
			if (!re.getValue().type.equals(function.getType()))
				throw new ReturnTypeMismatchException(errtree, "Function type and return type must match");
		}
		
		PersistentData.scopestack.pop();
	}
	
	private ArrayList<Expr_Return> execute(ArrayList<Expression> args) {
		ArrayList<Expr_Return> res = new ArrayList<Expr_Return>();
		for (Expression arg : args) 
			res.add(arg.execute());
		return res;
	}
}

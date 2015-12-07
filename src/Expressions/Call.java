package Expressions;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.GlobalMethods;
import Global.PersistentData;
import Global.TypeSystem;
import PIExceptions.PIException;
import PIExceptions.MismatchedArgumentsException;
import PIExceptions.ReturnException;
import PIExceptions.ReturnTypeMismatchException;
import PIExceptions.TypeMismatchException;
import Statements.Function;
import Statements.Statement;
import SymbolTable.Scope;
import SymbolTable.VariableSymbol;

public class Call implements Expression {
	String id;
	ArrayList<Expression> args;
	CommonTree errtree;
	
	public Call(CommonTree errtree, String id) {
		this(errtree, id, null);
	}
	public Call(CommonTree errtree, String id, ArrayList<Expression> args) {
		this.id = id;
		if (args != null)
			this.args = args;
		else
			this.args = new ArrayList<Expression>();
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
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
			PersistentData.scopestack.pop();
			
			if (!re.getValue().type.equals(function.getType()))
				throw new ReturnTypeMismatchException(errtree, "Function type and return type must match");
			return re.getValue();
		}
		//PersistentData.scopestack.pop();
		throw new PIException();
	}
	
	private ArrayList<Expr_Return> execute(ArrayList<Expression> args) {
		ArrayList<Expr_Return> res = new ArrayList<Expr_Return>();
		for (Expression arg : args) 
			res.add(arg.execute());
		return res;
	}
}

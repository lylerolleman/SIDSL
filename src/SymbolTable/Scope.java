package SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Global.Expr_Return;
import Statements.Function;


public class Scope {
	Map<String, VariableSymbol> vars;
	//Map<String, Function> functions;
	Map<String, FunctionGroup> functions;
	Scope enclosingscope;
	
	public Scope(Scope enclosingscope) {
		this.enclosingscope = enclosingscope;
		vars = new HashMap<String, VariableSymbol>();
		//functions = new HashMap<String, Function>();
		functions = new HashMap<String, FunctionGroup>();
	}
	
	public Scope getEnclosingScope() {return enclosingscope;}
	public void define(VariableSymbol var) {
		vars.put(var.getName(), var);
	}
	public void define(Function func) {
		//functions.put(func.getID(), func);
		FunctionGroup fg = functions.get(func.getID());
		
		if (fg == null) {
			fg = new FunctionGroup(func.getID());
			fg.addFunction(func);
			functions.put(func.getID(), fg);
		} else {
			fg.addFunction(func);
		}
	}
	public Symbol resolve(String name) {
		Symbol s = vars.get(name);
	    Scope currscope = this;
	    while (s == null && currscope.getEnclosingScope() != null) {
	            currscope = currscope.getEnclosingScope();
	            s = currscope.resolve(name);
	    }
	    return s; 
	}
	public Symbol resolveLocal(String name) {
		return vars.get(name);
	}
	public Function resolveFunction(String id, ArrayList<Expr_Return> args) {
		//Function f = functions.get(id);
		FunctionGroup fg = null;
		Scope currscope = this;
		Function f = null;
		
		while (f == null && currscope != null) {
			fg = currscope.resolveFunctionGroup(id, args, currscope);
			
			currscope = currscope.getEnclosingScope();
			if (fg == null)
				continue;
			f = fg.resolve(args);
		}
		return f;
	}
	private FunctionGroup resolveFunctionGroup(String id, ArrayList<Expr_Return> args, Scope currscope) {
		if (currscope == null)
			return null;
		FunctionGroup fg = functions.get(id);
		if (fg != null)
			return fg;
		fg = currscope.resolveFunctionGroup(id, args, currscope.getEnclosingScope());
		
		return fg;
		//return functions.get(id);
	}
	
	public void printVars() {
		
		for (String key : vars.keySet()) {
			System.out.print(vars.get(key).getName());
		}
		System.out.println();
	}
}

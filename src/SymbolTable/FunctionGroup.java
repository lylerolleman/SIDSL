package SymbolTable;

import java.util.ArrayList;

import Global.Expr_Return;
import Global.TypeSystem;
import PIExceptions.PIException;
import Statements.Function;

public class FunctionGroup {
	String id;
	ArrayList<Function> functions;
	protected FunctionGroup(String id) {
		this.id = id;
		this.functions = new ArrayList<Function>();
	}
	protected String getID() {return id;}
	protected void addFunction(Function func) {
		if (!func.getID().equals(id))
			throw new PIException();
		functions.add(func);
	}
	protected Function resolve(ArrayList<Expr_Return> args) {
		Function ret = null;
		for (Function func : functions) {
			if (func.numParams() != args.size())
				continue;
			ArrayList<VariableSymbol> params = func.getParams();
			int i;
			for (i=0; i<args.size(); i++) {
				if (!args.get(i).type.equals(params.get(i).getType()))
					break;
			}
			if (i == args.size()) {
				ret = func;
				break;
			}
		}
		
		if (ret != null)
			return ret;
		
		for (Function func : functions) {
			if (func.numParams() != args.size())
				continue;
			ArrayList<VariableSymbol> params = func.getParams();
			int i;
			for (i=0; i<args.size(); i++) {
				if (TypeSystem.exprLookup(args.get(i).type, params.get(i).getType()) == null)
					break;
			}
			if (i == args.size()) {
				ret = func;
				break;
			}
		}
		
		return ret;
	}
}

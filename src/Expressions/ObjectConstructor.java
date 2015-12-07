package Expressions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Global.Expr_Return;
import Global.PersistentData;
import SymbolTable.ObjectValue;
import SymbolTable.Value;
import SymbolTable.VariableSymbol;

public class ObjectConstructor implements Expression {
	ArrayList<VariableSymbol> params;
	
	public ObjectConstructor(ArrayList<VariableSymbol> params) {
		this.params = params;
	}

	public Expr_Return execute() {
		HashMap<String, VariableSymbol> members = new HashMap<String, VariableSymbol>();
		for (VariableSymbol param : params)
			members.put(param.getName(), param);
		return new Expr_Return(PersistentData.symtab.resolveType("object"), new ObjectValue(members));
	}
}

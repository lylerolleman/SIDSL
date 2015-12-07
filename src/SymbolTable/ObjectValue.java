package SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Global.PersistentData;

public class ObjectValue implements Value {
	Map<String, VariableSymbol> members;
	
	public ObjectValue(HashMap<String, VariableSymbol> members) {
		this.members = members;
	}
	
	public Map<String, VariableSymbol> getValue() {return members;}
	public TypeSymbol getType() {return PersistentData.symtab.resolveType("object");}
	public ObjectValue getIdentity() {
		return new ObjectValue(new HashMap<String, VariableSymbol>());
	}
	public VariableSymbol get(String key) {return members.get(key);}
}

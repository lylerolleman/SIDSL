package SymbolTable;

import java.util.HashMap;
import java.util.Map;

import Global.TypeSystem;

public class SymbolTable {
	Scope globalscope;
	Map<String, TypeSymbol> types;
	Map<String, Symbol> reservednames;
	
	public SymbolTable() {
		this.globalscope = new Scope(null);
		this.types = new HashMap<String, TypeSymbol>();
		this.reservednames = new HashMap<String, Symbol>();
		
		for (String type : TypeSystem.types)
			addType(new TypeSymbol(type));
		
		reserve("true");
		reserve("false");
		reserve("and");
		reserve("or");
		reserve("xor");
		reserve("print");
		reserve("println");
		reserve("function");
		reserve("null");
	}
	
	public Scope getGlobalScope() {return globalscope;}
	public TypeSymbol resolveType(String type) {return types.get(type);}
	public void addType(TypeSymbol type) {
		types.put(type.getName(), type);
		reserve(type.getName());
	}
	public Boolean isReserved(String name) {return types.get(name) == null;}
	private void reserve(String name) {reservednames.put(name, new Symbol(name));}
}

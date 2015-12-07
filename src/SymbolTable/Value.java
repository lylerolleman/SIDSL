package SymbolTable;

public interface Value {
	public Object getValue();
	public Value getIdentity();
	public TypeSymbol getType();
}

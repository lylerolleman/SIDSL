package SymbolTable;

public class VariableSymbol extends Symbol {
	Value value;
	TypeSymbol type;
	public VariableSymbol(String name, TypeSymbol type) {
		this(name, type, null);
	}
	public VariableSymbol(String name, TypeSymbol type, Value value) {
		super(name);
		this.type = type;
		this.value = value;
	}
	
	public TypeSymbol getType() {return type;}
	public void setValue(Value value) {this.value = value;}
	public Value getValue() {return value;}
}

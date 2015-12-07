package SymbolTable;

import java.util.ArrayList;

import Global.PersistentData;

public class ArrayValue implements Value {
	ArrayList<Value> array;
	
	public ArrayValue(ArrayList<Value> array) {
		this.array = array;
	}
	public ArrayValue() {
		this(new ArrayList<Value>());
	}
	
	public ArrayList<Value> getValue() {return array;}
	public TypeSymbol getType() {return PersistentData.symtab.resolveType("array");}
	public ArrayValue getIdentity() {return new ArrayValue(new ArrayList<Value>());}
	public Value get(Integer index) {return array.get(index);}
	public void set(Integer index, Value val) {array.set(index, val);}
	public void add(Value value) {
		array.add(value);
	}
	public Integer getSize() {return array.size();}
}

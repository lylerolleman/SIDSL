package SymbolTable;

import Global.TypeSystem;

public class TypeSymbol extends Symbol {
	int typenum;
	public TypeSymbol(String name) {
		super(name);
		
		try {
			for (int i=0; i<=TypeSystem.types.length; i++) {
				if (name.equals(TypeSystem.types[i])) {
					typenum = i;
					break;
				}
			}
		} catch (ArrayIndexOutOfBoundsException ae) {
			typenum = -1;
		}
	}
	public int getTypeNum() {return typenum;}
	public Boolean equals(TypeSymbol type) {
		return type.getName().equals(super.getName());
	}
}

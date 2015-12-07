package SymbolTable;

import java.util.ArrayList;

import Global.PersistentData;
import PIExceptions.VectorIntegrityException;

public class VectorValue extends ArrayValue {
	TypeSymbol vectortype;
	public VectorValue(ArrayList<Value> array) {
		super(array);
		checkIntegrity();
	}
	
	public void checkIntegrity() {
		try {
			vectortype = super.array.get(0).getType();
		} catch (ArrayIndexOutOfBoundsException abe) {
			vectortype = PersistentData.symtab.resolveType("void");
		}
		for (Value val : super.array) {
			if (!val.getType().equals(vectortype))
				throw new VectorIntegrityException("Vector has element that doesn't match base type");
		}
	}
	public TypeSymbol getType() {return PersistentData.symtab.resolveType("vector");}
	public TypeSymbol getVectorType() {return vectortype;}
	public VectorValue getIdentity() {
		ArrayList<Value> ident = new ArrayList<Value>();
		ident.add(array.get(0).getIdentity());
		return new VectorValue(ident);
	}
	public void set(Integer index, Value val) {
		super.set(index, val);
		checkIntegrity();
	}
}

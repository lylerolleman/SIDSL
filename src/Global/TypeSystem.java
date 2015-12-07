package Global;

import java.util.ArrayList;

import PIExceptions.PIException;
import PIExceptions.TypeCastException;
import SymbolTable.ArrayValue;
import SymbolTable.KeyValue;
import SymbolTable.ObjectValue;
import SymbolTable.TypeSymbol;
import SymbolTable.Value;
import SymbolTable.VarValue;
import SymbolTable.VectorValue;

public class TypeSystem {
	public static String[] types = {"var", "key", "array", "object", "vector", "void"};
	
	static Boolean[][] promotelookup = {
			    /*var*/  /*key*/ /*array*/ /*object*/ /*vector*/ /*void*/
	/*var*/		{false,   true,   null,     null,     true,      null},
	/*key*/		{true,    false,  true,     true,     true,      null},
	/*array*/   {null,    null,   false,    null,     true,      null},
	/*object*/  {null,    null,   null,     false,    true,      null},
	/*vector*/  {null,    true,   true,     null,     false,     null},
	/*void*/    {null,    null,   null,     null,     null,      false}
	};
	
	static Boolean[][] exprlookup = {
	    		/*var*/  /*key*/ /*array*/ /*object*/ /*vector*/ /*void*/
	/*var*/		{false,   true,   null,     null,     true,      null},
	/*key*/		{true,    false,  true,     true,     true,      null},
	/*array*/   {null,    true,   false,    null,     true,      null},
	/*object*/  {null,    true,   null,     false,    true,      null},
	/*vector*/  {null,    true,   null,     null,     false,     null},
	/*void*/    {null,    null,   null,     null,     null,      false}
};
	
	public static Boolean promoteLookup(TypeSymbol t1, TypeSymbol t2) {
		try {
			return promotelookup[t1.getTypeNum()][t2.getTypeNum()];
		} catch (ArrayIndexOutOfBoundsException ae) {
			return null;
		}
	}
	
	public static Boolean exprLookup(TypeSymbol t1, TypeSymbol t2) {
		try {
			return exprlookup[t1.getTypeNum()][t2.getTypeNum()];
		} catch (ArrayIndexOutOfBoundsException ae) {
			return null;
		}
	}
	
	public static VarValue getAsVar(Value val) {
		Boolean res = exprLookup(val.getType(), PersistentData.symtab.resolveType("var"));
		
		if (res == null)
			throw new TypeCastException("failed promotion lookup");
		
		try {
			return (VarValue) val.getValue();
		} catch (ClassCastException cce) {
			throw new TypeCastException("illegal cast");
		}
	}
	
	public static KeyValue getAsKey(Value val) {
		try {
			return (KeyValue) val;
		} catch (ClassCastException cce) {
			return new KeyValue(null, val.getType(), val);
		}
	}
	
	public static ArrayValue getAsArray(Value val) {
		try {
			return (ArrayValue) val;
		} catch (ClassCastException cce) {
			if (val instanceof KeyValue) {
				KeyValue kv = (KeyValue) val;
				return getAsArray(kv.getValue());
			}
			throw new TypeCastException("illegal cast to array");
		}
	}
	
	public static ObjectValue getAsObject(Value val) {
		try {
			return (ObjectValue) val;
		} catch (ClassCastException cce) {
			if (val instanceof KeyValue) {
				KeyValue kv = (KeyValue) val;
				return getAsObject(kv.getValue());
			}
			throw new TypeCastException("illegal cast to object");
		}
	}
	
	public static VectorValue getAsVector(Value val) {
		try {
			return (VectorValue) val;
		} catch (ClassCastException cce) {
			if (val instanceof ArrayValue) {
				ArrayValue av = getAsArray(val);
				return new VectorValue(av.getValue());
			}
			ArrayList<Value> array = new ArrayList<Value>();
			array.add(val);
			return new VectorValue(array);
		}
	}
	
	public static Value promote(Value val, TypeSymbol type) {
		switch (type.getName()) {
		case "var":
			return getAsVar(val);
		case "key":
			return getAsKey(val);
		case "array":
			return getAsArray(val);
		case "object":
			return getAsObject(val);
		case "vector":
			return getAsVector(val);
		default:
			throw new PIException();
		}
	}
}

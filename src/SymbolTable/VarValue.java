package SymbolTable;

import Global.PersistentData;

public class VarValue implements Value {
	final int STRING = 0;
	final int INTEGER = 1;
	final int FP = 2;
	final int BOOL = 3;
	
	String value; 
	Integer ivalue;
	Double dvalue;
	Boolean bvalue;
	TypeSymbol type;
	int internaltype;
	
	public VarValue(String value) {
		if (value.startsWith("\"") && value.endsWith("\""))
			this.value = value.substring(1, value.length()-1);
		else
			this.value = value;
		type = PersistentData.symtab.resolveType("var");
		ivalue = null;
		dvalue = null;
		bvalue = null;
		internaltype = STRING;
	}
	public VarValue(String value, boolean maintainquotes) {
		this(value);
		if (maintainquotes)
			this.value = "\"" + this.value + "\"";
	}
	public VarValue(Integer ivalue) {
		this.value = ivalue.toString();
		this.ivalue = ivalue;
		this.dvalue = null;
		type = PersistentData.symtab.resolveType("var");
		bvalue = null;
		internaltype = INTEGER;
	}
	public VarValue(Double dvalue) {
		this.value = dvalue.toString();
		this.ivalue = null;
		this.dvalue = dvalue;
		type = PersistentData.symtab.resolveType("var");
		bvalue = null;
		internaltype = FP;
	}
	public VarValue(Boolean bvalue) {
		this.value = bvalue.toString();
		this.bvalue = bvalue;
		this.ivalue = null;
		this.dvalue = null;
		type = PersistentData.symtab.resolveType("var");
		internaltype = BOOL;
	}
	
	public Value getValue() {return this;}
	public TypeSymbol getType() {return type;}
	public VarValue getIdentity() {
		switch (internaltype) {
		case INTEGER:
			return new VarValue(0);
		case FP:
			return new VarValue(0.0);
		case BOOL:
			return new VarValue(false);
		default:
			return new VarValue("");
		}
	}
	public String getString() {return value;}
	public Integer getInteger() {
		if (internaltype == FP)
			return null;
		if (ivalue != null)
			return ivalue;
		Integer ret;
		try {
			ret = Integer.parseInt(value);
		} catch (NumberFormatException nfe) {
			ret = null;
		}
		ivalue = ret;
		return ret;
	}
	public Double getFloatingPoint() throws NumberFormatException {
		if (dvalue != null)
			return dvalue;
		Double ret;
		try {
			ret = Double.parseDouble(value);
		} catch (NumberFormatException nfe) {
			ret = null;
		}
		dvalue = ret;
		return ret;
	}
	public Boolean getBool() {
		if (bvalue != null)
			return bvalue;
		if (value.equals("true"))
			return true;
		if (value.equals("false"))
			return false;
		
		return null;
	}
}

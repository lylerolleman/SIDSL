package Statements;

import java.util.ArrayList;

import SymbolTable.TypeSymbol;
import SymbolTable.VariableSymbol;

public class Function {
	String id;
	TypeSymbol type;
	Block block;
	ArrayList<VariableSymbol> params;
	
	public Function(String id, TypeSymbol type, ArrayList<VariableSymbol> params, Block block) {
		this.id = id;
		this.type = type;
		if (params != null)
			this.params = params;
		else
			this.params = new ArrayList<VariableSymbol>();
		this.block = block;
	}
	
	public String getID() {return id;}
	public TypeSymbol getType() {return type;}
	public ArrayList<VariableSymbol> getParams() {return params;}
	public Block getBlock() {return block;}
	public ArrayList<Statement> getStatements() {return block.getStatements();}
	public Integer numParams() {return params.size();}
}

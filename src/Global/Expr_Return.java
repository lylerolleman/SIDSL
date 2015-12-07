package Global;

import SymbolTable.TypeSymbol;
import SymbolTable.Value;

public class Expr_Return {
	public TypeSymbol type;
	public Value value;
	
	public Expr_Return(TypeSymbol type, Value value) {
		this.type = type;
		this.value = value;
	}
}

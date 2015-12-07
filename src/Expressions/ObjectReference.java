package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.TypeSystem;
import PIExceptions.TypeMismatchException;
import SymbolTable.ObjectValue;
import SymbolTable.VariableSymbol;

public class ObjectReference implements Expression {
	Identifier id;
	String ref;
	CommonTree errtree;
	
	public ObjectReference(CommonTree errtree, Identifier id, String ref) {
		this.errtree = errtree;
		this.id = id;
		this.ref = ref;
	}
	
	public Expr_Return execute() {
		Expr_Return idret = id.execute();
		if (!idret.type.getName().equals("object"))
			throw new TypeMismatchException(errtree, "Cannot reference something that is not an object");
		ObjectValue ov = TypeSystem.getAsObject(idret.value);
		VariableSymbol vs = ov.get(ref);
		return new Expr_Return(vs.getType(), vs.getValue());
	}
}

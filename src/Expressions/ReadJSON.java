package Expressions;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.PersistentData;
import Global.TypeSystem;
import JSONHandler.JSONParseRig;
import PIExceptions.PIException;
import PIExceptions.TypeMismatchException;
import Statements.Statement;
import SymbolTable.ArrayValue;
import SymbolTable.VarValue;

public class ReadJSON implements Expression {
	Expression expr;
	CommonTree errtree;
	
	public ReadJSON(CommonTree errtree, Expression expr) {
		this.expr = expr;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() throws PIException {
		Expr_Return ret = expr.execute();
		if (!ret.type.equals(PersistentData.symtab.resolveType("var")))
			throw new TypeMismatchException(errtree, "requires a var variable as parameter");
		VarValue vv = TypeSystem.getAsVar(ret.value);
		
		try {
			JSONParseRig pr = new JSONParseRig(vv.getString());
			//System.out.println(pr.getDOTGraph());
			ArrayValue av = pr.PIImport();
			
			return new Expr_Return(av.getType(), av);
		} catch (RecognitionException e) {
			throw new PIException();
		}
			
		
	}

}

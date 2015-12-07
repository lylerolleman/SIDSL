package Statements;

import org.antlr.runtime.tree.CommonTree;

import Expressions.*;
import Global.Expr_Return;
import Global.PersistentData;
import Global.TypeSystem;
import PIExceptions.IllegalIndexException;
import PIExceptions.PIException;
import PIExceptions.TypeCastException;
import PIExceptions.TypeMismatchException;
import PIExceptions.UndefinedIdentifierException;
import SymbolTable.ArrayValue;
import SymbolTable.KeyValue;
import SymbolTable.ObjectValue;
import SymbolTable.TypeSymbol;
import SymbolTable.Value;
import SymbolTable.VarValue;
import SymbolTable.VariableSymbol;
import SymbolTable.VectorValue;

public class Assignment implements Statement {
	//TypeSymbol type;
	String id;
	String ref;
	Expression expr;
	Expression index;
	CommonTree errtree;
	
	public Assignment(CommonTree errtree, String id, Expression expr) throws UndefinedIdentifierException {
		this(errtree, id, null, expr, null);
	}
	
	public Assignment (CommonTree errtree, String id, String ref, Expression expr, Expression index) {
		this.id = id;
		this.ref = ref;
		this.expr = expr;
		this.index = index;
		this.errtree = errtree;
	}
	
	public void execute() throws PIException {
		Expr_Return ret = expr.execute();
		
		VariableSymbol vs = (VariableSymbol) PersistentData.scopestack.peek().resolve(id);
		if (vs == null) 
			throw new UndefinedIdentifierException(errtree, "The identifier " + id + " is undefined");
		
		switch (vs.getType().getName()) {
		case "var":
			assigVar(ret, vs);
			break;
		case "key":
			assigKey(ret, vs);
			break;
		case "array":
			assigArray(ret, vs);
			break;
		case "object":
			assigObject(ret, vs);
			break;
		case "vector":
			assigVector(ret, vs);
			break;
		default:
			throw new PIException();
		}
	}
	
	private void assigVar(Expr_Return ret, VariableSymbol vs) {
		if (TypeSystem.promoteLookup(ret.type, vs.getType()) == null)
			throw new TypeMismatchException(errtree, "The variable " + vs.getName() + " cannot be assigned type " + ret.type.getName());
		
		try {
			vs.setValue(TypeSystem.getAsVar(ret.value));
		} catch (TypeCastException tce) {
			//TO-DO add stuff to error
			throw tce;
		}
	}
	private void assigKey(Expr_Return ret, VariableSymbol vs) {
		if (TypeSystem.promoteLookup(ret.type, vs.getType()) == null)
			throw new TypeMismatchException(errtree, "The variable " + vs.getName() + " cannot be assigned type " + ret.type.getName());
		
		try {
			KeyValue kv = TypeSystem.getAsKey(ret.value);
			KeyValue vsk = TypeSystem.getAsKey(vs.getValue());
			if (kv.getKey() == null)
				kv.setKey(vsk.getKey());
			vs.setValue(kv);
		} catch (TypeCastException tce) {
			//TO-DO add stuff to error
			throw tce;
		}
	}
	private void assigArray(Expr_Return ret, VariableSymbol vs) {
		if (index == null) {
			if (TypeSystem.promoteLookup(ret.type, vs.getType()) == null)
				throw new TypeMismatchException(errtree, "The variable " + vs.getName() + " cannot be assigned type " + ret.type.getName());
			try {
				vs.setValue(TypeSystem.getAsArray(ret.value));
			} catch (TypeCastException tce) {
				//TO-DO add stuff to error
				throw tce;
			}
		} else {
			try {
				ArrayValue av = TypeSystem.getAsArray(vs.getValue());
				VarValue vindex = TypeSystem.getAsVar(index.execute().value);
				Integer i = vindex.getInteger();
				if (i == null)
					throw new IllegalIndexException(errtree, "Index must be an integer");
				av.set(i, ret.value);
			} catch (TypeCastException tce) {
				throw tce;
			}
		}
	}
	private void assigObject(Expr_Return ret, VariableSymbol vs) {
		if (ref != null) {
			ObjectValue ov = TypeSystem.getAsObject(vs.getValue());
			vs = ov.get(ref);
		}
		if (TypeSystem.promoteLookup(ret.type, vs.getType()) == null)
			throw new TypeMismatchException(errtree, "The variable " + vs.getName() + " cannot be assigned type " + ret.type.getName());
		try {
			if (ref == null) {
				vs.setValue(TypeSystem.getAsObject(ret.value));
			} else {
				switch (vs.getType().getName()) {
				case "var":
					assigVar(ret, vs);
					break;
				case "key":
					assigKey(ret, vs);
					break;
				case "array":
					assigArray(ret, vs);
					break;
				case "object":
					assigObject(ret, vs);
					break;
				default:
					throw new PIException();
				}
			}
		} catch (TypeCastException tce) {
			//TO-DO add stuff to error
			throw tce;
		}
	}
	
	private void assigVector(Expr_Return ret, VariableSymbol vs) {
		if (index == null) {
			if (TypeSystem.promoteLookup(ret.type, vs.getType()) == null)
				throw new TypeMismatchException(errtree, "The variable " + vs.getName() + " cannot be assigned type " + ret.type.getName());
			try {
				vs.setValue(TypeSystem.getAsVector(ret.value));
			} catch (TypeCastException tce) {
				//TO-DO add stuff to error
				throw tce;
			}
		} else {
			try {
				VectorValue av = TypeSystem.getAsVector(vs.getValue());
				VarValue vindex = TypeSystem.getAsVar(index.execute().value);
				Integer i = vindex.getInteger();
				if (i == null)
					throw new IllegalIndexException(errtree, "Index must be an integer");
				av.set(i, ret.value);
			} catch (TypeCastException tce) {
				throw tce;
			}
		}
	}
}

package Global;

import org.antlr.runtime.tree.CommonTree;

import PIExceptions.ArithmeticTypeMismatchException;
import PIExceptions.PIException;
import PIExceptions.LogicalTypeMismatchException;
import PIExceptions.NotANumberException;
import PIExceptions.TypeMismatchException;

public class ErrorHandlers {
	public static void reportArithmeticTypeError(CommonTree tree, Expr_Return ret1, Expr_Return ret2) {
		if (!ret1.type.getName().equals("var") && !ret1.type.getName().equals("key")) {
			throw new ArithmeticTypeMismatchException(tree, "Cannot perform this operation on an " + ret1.type.getName());
		} 
		
		if (!ret2.type.getName().equals("var") && !ret2.type.getName().equals("key")) {
			throw new ArithmeticTypeMismatchException(tree, "Cannot perform this operation on an " + ret2.type.getName());
		} 
		
		throw new NotANumberException(tree);
	}
	
	public static void reportArrayTypeError(CommonTree tree, Expr_Return ret1, Expr_Return ret2) {
		if (ret1.type.getName().equals("object") || ret2.type.getName().equals("object"))
			throw new TypeMismatchException(tree, "Cannot concat objects");
		else {
			throw new PIException();
		}
	}
	
	public static void reportLogicalTypeError(CommonTree tree, Expr_Return ret1, Expr_Return ret2) {
		if (!ret1.type.getName().equals("var") && !ret1.type.getName().equals("key")) {
			throw new LogicalTypeMismatchException(tree, "Cannot perform this operation on an " + ret1.type.getName());
		} 
		
		if (!ret2.type.getName().equals("var") && !ret2.type.getName().equals("key")) {
			throw new LogicalTypeMismatchException(tree, "Cannot perform this operation on an " + ret2.type.getName());
		} 
		
		throw new TypeMismatchException(tree, "This operation requires both operands to be boolean");
	}
}

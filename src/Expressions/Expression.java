package Expressions;

import Global.Expr_Return;
import PIExceptions.PIException;

public interface Expression {
	public Expr_Return execute() throws PIException ;
}

package PIExceptions;

import Global.Expr_Return;

public class ReturnException extends PIException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8267058728775371797L;
	Expr_Return value;
	
	public ReturnException(String message, Expr_Return value) {
		super(message);
		this.value = value;
	}
	
	public Expr_Return getValue() {return value;}
}

package PIExceptions;

import org.antlr.runtime.tree.CommonTree;

public class ReturnTypeMismatchException extends PIException {
	
	public ReturnTypeMismatchException(CommonTree errtree, String message) {
		super(errtree, message);
	}
}

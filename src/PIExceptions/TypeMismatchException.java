package PIExceptions;

import org.antlr.runtime.tree.CommonTree;

public class TypeMismatchException extends PIException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1248752126420692810L;

	public TypeMismatchException(CommonTree tree) {
		this(tree, "Type Mismatch Error");
	}
	public TypeMismatchException(CommonTree tree, String message) {
		super(tree, message);
	}

}

package PIExceptions;

import org.antlr.runtime.tree.CommonTree;

public class NotANumberException extends PIException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6960854948043924408L;

	public NotANumberException(CommonTree tree) {
		this(tree, "This operation must be performed on numbers");
	}
	public NotANumberException(CommonTree tree, String message) {
		super(tree, message);
	}
}

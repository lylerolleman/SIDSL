package PIExceptions;

import org.antlr.runtime.tree.CommonTree;

public class UndefinedIdentifierException extends PIException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8325996518056280393L;

	public UndefinedIdentifierException(CommonTree tree, String message) {
		super(tree, message);
	}
}

package PIExceptions;

import org.antlr.runtime.tree.CommonTree;

public class LogicalTypeMismatchException extends PIException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1640789390563090071L;

	public LogicalTypeMismatchException(CommonTree tree, String message) {
		super(tree, message);
	}
}

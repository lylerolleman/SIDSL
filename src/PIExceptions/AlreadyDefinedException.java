package PIExceptions;

import org.antlr.runtime.tree.CommonTree;

public class AlreadyDefinedException extends PIException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -704188436829873612L;

	public AlreadyDefinedException(CommonTree tree, String message) {
		super(tree, message);
	}
}

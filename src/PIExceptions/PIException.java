package PIExceptions;

import org.antlr.runtime.tree.CommonTree;

public class PIException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7856805538921632534L;

	public PIException() {
		this("Base Exception thrown, something fishy is going on");
	}
	protected PIException(String message) {
		super(message);
	}
	protected PIException(CommonTree tree, String message) {
		super(tree.getLine() + ": " + message);
	}
}

package PIExceptions;

import org.antlr.runtime.tree.CommonTree;

public class IllegalKeyReferanceException extends PIException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7831278244098153273L;
	public IllegalKeyReferanceException(CommonTree tree) {
		this(tree, "cannot referance null key");
	}
	public IllegalKeyReferanceException(CommonTree tree, String message) {
		super(tree, message);
	}
}

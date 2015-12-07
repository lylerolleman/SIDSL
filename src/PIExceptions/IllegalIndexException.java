package PIExceptions;

import org.antlr.runtime.tree.CommonTree;

public class IllegalIndexException extends PIException {

	public IllegalIndexException(CommonTree tree, String message) {
		super(tree, message);
	}

}

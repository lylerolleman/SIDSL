package PIExceptions;

import org.antlr.runtime.tree.CommonTree;

public class MismatchedArgumentsException extends PIException {
	public MismatchedArgumentsException(CommonTree tree) {
		this(tree, "Arguments do not match function");
	}
	public MismatchedArgumentsException(CommonTree tree, String message) {
		super(tree, message);
	}
}

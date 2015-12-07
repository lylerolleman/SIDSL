package PIExceptions;

import org.antlr.runtime.tree.CommonTree;

public class NullIdentifierException extends PIException {
	public NullIdentifierException(CommonTree tree) {
		this(tree, "Identifier has no value");
	}
	public NullIdentifierException(CommonTree tree, String message) {
		super(tree, message);
	}
}

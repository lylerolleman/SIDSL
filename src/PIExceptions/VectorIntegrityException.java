package PIExceptions;

import org.antlr.runtime.tree.CommonTree;

public class VectorIntegrityException extends PIException {

	public VectorIntegrityException() {
		// TODO Auto-generated constructor stub
	}

	public VectorIntegrityException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public VectorIntegrityException(CommonTree tree, String message) {
		super(tree, message);
		// TODO Auto-generated constructor stub
	}

}

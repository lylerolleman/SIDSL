package PIExceptions;

import org.antlr.runtime.tree.CommonTree;

public class TypeCastException extends PIException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2691852305823930704L;
	public TypeCastException(CommonTree tree) {
		this(tree, "Illegal type cast");
	}
	public TypeCastException(CommonTree tree, String message) {
		super(tree, message);
	}
	public TypeCastException(String message) {
		super(message);
	}
}

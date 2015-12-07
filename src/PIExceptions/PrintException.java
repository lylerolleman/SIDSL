package PIExceptions;

import org.antlr.runtime.tree.CommonTree;

public class PrintException extends PIException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7754807369853058782L;

	public PrintException(CommonTree tree, String message) {
		super(tree, message);
	}
}

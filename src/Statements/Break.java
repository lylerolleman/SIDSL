package Statements;

import PIExceptions.BreakException;

public class Break implements Statement {

	public Break() {}
	
	public void execute() {
		throw new BreakException();
	}
}

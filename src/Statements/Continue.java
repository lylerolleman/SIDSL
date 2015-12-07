package Statements;

import PIExceptions.ContinueException;

public class Continue implements Statement {

	public Continue() {}
	public void execute() {
		throw new ContinueException();
	}
}

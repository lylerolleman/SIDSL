package Statements;

import java.util.ArrayList;

import Global.PersistentData;
import SymbolTable.Scope;

public class Block implements Statement {
	ArrayList<Statement> statements;
	
	public Block(ArrayList<Statement> statements) {
		this.statements = statements;
	}
	
	public void execute() {
		
		PersistentData.scopestack.push(new Scope(PersistentData.scopestack.peek()));
		for (Statement stat : statements)
			stat.execute();
		PersistentData.scopestack.pop();
	}
	
	public ArrayList<Statement> getStatements() {
		return statements;
	}
	
	public void addVoidReturn() {
		statements.add(new Return(null));
	}
	
	public Boolean endsWithReturn() {
		return statements.get(statements.size()-1) instanceof Return;
	}
}

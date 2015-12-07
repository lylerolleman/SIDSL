package Global;

import java.util.ArrayList;

import Expressions.ArrayConstructor;
import Expressions.Call;
import Expressions.Expression;
import Statements.Function;
import Statements.Statement;
import SymbolTable.ArrayValue;
import SymbolTable.Scope;
import SymbolTable.Value;

public class Root {
	ArrayList<Statement> globalstatements;
	ArrayValue mainargs;
	
	public Root(ArrayList<Statement> gstats, ArrayValue av) {
		this.globalstatements = gstats;
		this.mainargs = av;
	}
	
	public Value execute() {
		for (Statement stat : globalstatements) {
			stat.execute();
		}
		
		try {
			ArrayList<Expression> args = new ArrayList<Expression>();
			args.add(new ArrayConstructor(mainargs));
			return new Call(null, "main", args).execute().value;
		} catch (NullPointerException npe) {
			return new Call(null, "main").execute().value;
		}
	}
}

package PISDLParser;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import Global.*;
import SymbolTable.SymbolTable;
import SymbolTable.Value;
import SymbolTable.VarValue;



public class PIRig {
	PILexer lexer;
	PIParser parser;
	PIParser.program_return entry;
	TokenStream tokenStream;
	
	public PIRig(String src) {
		ANTLRFileStream input = null;
		try {
			input = new ANTLRFileStream(src);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		lexer = new PILexer(input);
		tokenStream = new CommonTokenStream(lexer);
		parser = new PIParser(tokenStream);
	}

	public CommonTree getAST() throws RecognitionException {
		entry = parser.program();
		return (CommonTree) entry.getTree();
	}
	public StringTemplate getDOTGraph() throws RecognitionException {
		DOTTreeGenerator gen = new DOTTreeGenerator();
		StringTemplate st = gen.toDOT(getAST());
		return st;
	}
	
	public Root getPITree(ArrayList<String> mainargs) throws RecognitionException {
		ArrayList<Value> args = new ArrayList<Value>();
		for (String arg : mainargs) 
			args.add(new VarValue(arg));
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(getAST());
		nodes.setTokenStream(tokenStream);
		SymbolTable symtab = PersistentData.symtab;
		return new BuildITree(nodes, symtab, args).program();
	}
}

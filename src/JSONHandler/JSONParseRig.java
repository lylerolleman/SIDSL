package JSONHandler;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import JSONTree.JSONTree;
import SymbolTable.ArrayValue;


public class JSONParseRig {
	JSONParserLexer lexer;
	JSONParserParser parser;
	JSONParserParser.jsonfile_return entry;
	TokenStream tokenStream;
	
	public JSONParseRig(String filename) throws RecognitionException {
		ANTLRFileStream input = null;
		try {
			input = new ANTLRFileStream(filename);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		lexer = new JSONParserLexer(input);
		tokenStream = new CommonTokenStream(lexer);
		parser = new JSONParserParser(tokenStream);
		
	}
	
	public CommonTree getAST() throws RecognitionException {
		entry = parser.jsonfile();
		return (CommonTree) entry.getTree();
	}
	public StringTemplate getDOTGraph() throws RecognitionException {
		DOTTreeGenerator gen = new DOTTreeGenerator();
		StringTemplate st = gen.toDOT(getAST());
		return st;
	}
	public JSONTree getJSONTree() throws RecognitionException {
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(getAST());
		nodes.setTokenStream(tokenStream);
		JSONTree tree = new JSONTree("new tree");
		JSONTreeConstruct walker = new JSONTreeConstruct(nodes, tree);
		walker.jsonfile();
		return tree;
	}
	public ArrayValue PIImport() throws RecognitionException {
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(getAST());
		nodes.setTokenStream(tokenStream);
		return new PIImporter(nodes).jsonfile();
	}
}

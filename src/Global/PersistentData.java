package Global;

import java.util.LinkedList;

import SymbolTable.*;

public class PersistentData {
	public static SymbolTable symtab;
	public static LinkedList<Scope> scopestack;
	public static Boolean verbose;
	public static Boolean collect_stats;
	
	public static void initPersistentData() {
		symtab = new SymbolTable();
		scopestack = new LinkedList<Scope>();
	}
	
	public static void initFlags() {
		verbose = false;
		collect_stats = false;
	}
}

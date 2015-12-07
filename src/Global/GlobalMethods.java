package Global;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.antlr.runtime.tree.CommonTree;

import PIExceptions.PrintException;
import SymbolTable.KeyValue;
import SymbolTable.ObjectValue;
import SymbolTable.Value;
import SymbolTable.VarValue;
import SymbolTable.VariableSymbol;
import SymbolTable.VectorValue;

public class GlobalMethods {
	@SuppressWarnings("unchecked")
	public static void print(CommonTree tree, Value val) {
		print(tree, val, "");
	}
	public static void printJSON(CommonTree tree, Value val) {
		printJSON(tree, val, "");
	}
	
	private static void printJSON(CommonTree tree, Value val, String delim) {
		switch (val.getType().getName()) {
		case "var":
			VarValue vv1 = (VarValue) val;
			String st = (String) vv1.getString();
			System.out.print(st + delim);
			break;
		case "array":
			ArrayList<Value> arr = (ArrayList<Value>) val.getValue();
			for (int i=0; i<arr.size(); i++) {
				if (i == 0) 
					System.out.print("[");
				if (i == arr.size()-1)
					printJSON(tree, arr.get(i), "]" + delim);
				else 
					printJSON(tree, arr.get(i), ", ");
			}
			break;
		case "vector":
			ArrayList<Value> vec = (ArrayList<Value>) val.getValue();
			for (int i=0; i<vec.size(); i++) {
				if (i == 0) 
					System.out.print("[");
				if (i == vec.size()-1)
					printJSON(tree, vec.get(i), "]" + delim);
				else 
					printJSON(tree, vec.get(i), ", ");
			}
			break;
		case "key":
			KeyValue key = (KeyValue) val;
			System.out.print("\"" + key.getKey() + "\"" + ":");
			printJSON(tree, key.getValue(), delim);
			break;
		case "object":
			ObjectValue ov = TypeSystem.getAsObject(val);
			HashMap<String, VariableSymbol> obj = (HashMap<String, VariableSymbol>) ov.getValue();
			Set<String> keyset = obj.keySet();
			int i = 0;
			for (String okey : keyset) {
				if (i == 0)
					System.out.print("{");
				if (i == keyset.size()-1)
					printJSON(tree, obj.get(okey).getValue(), "}" + delim);
				else
					printJSON(tree, obj.get(okey).getValue(), ",");
				i++;
			}
			break;
		default:
			throw new PrintException(tree, "This value is not printable");
		}
	}
	
	private static void print(CommonTree tree, Value val, String delim) {
		switch (val.getType().getName()) {
		case "var":
			VarValue vv1 = (VarValue) val;
			String st = (String) vv1.getString();
			System.out.print(st + delim);
			break;
		case "array":
			ArrayList<Value> arr = (ArrayList<Value>) val.getValue();
			for (int i=0; i<arr.size(); i++) {
				if (i == 0) 
					System.out.print("[");
				if (i == arr.size()-1)
					print(tree, arr.get(i), "]" + delim);
				else 
					print(tree, arr.get(i), ", ");
			}
			break;
		case "vector":
			ArrayList<Value> vec = (ArrayList<Value>) val.getValue();
			for (int i=0; i<vec.size(); i++) {
				if (i == 0) 
					System.out.print("vec[");
				if (i == vec.size()-1)
					print(tree, vec.get(i), "]" + delim);
				else 
					print(tree, vec.get(i), ", ");
			}
			break;
		case "key":
			KeyValue key = (KeyValue) val;
			System.out.print(key.getKey() + ":");
			print(tree, key.getValue(), delim);
			break;
		case "object":
			ObjectValue ov = TypeSystem.getAsObject(val);
			HashMap<String, VariableSymbol> obj = (HashMap<String, VariableSymbol>) ov.getValue();
			Set<String> keyset = obj.keySet();
			int i = 0;
			for (String okey : keyset) {
				if (i == 0)
					System.out.print("<");
				if (i == keyset.size()-1)
					print(tree, obj.get(okey).getValue(), ">" + delim);
				else
					print(tree, obj.get(okey).getValue(), ", ");
				i++;
			}
			break;
		default:
			throw new PrintException(tree, "This value is not printable");
		}
	}
	
	public static VectorValue extend(Value val, Integer size) {
		VectorValue vv = TypeSystem.getAsVector(val);
		if (val.getType().getName().equals("vector")) {
			VectorValue padding = vv.getIdentity();
			for (int i=vv.getSize(); i<size; i++) 
				vv.getValue().add(padding.get(0));
		} else {
			for (int i=1; i<size; i++) 
				vv.getValue().add(vv.get(0));
		}
		return vv;
	}
}

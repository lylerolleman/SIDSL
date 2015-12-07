package JSONTree;

import java.util.ArrayList;

public class ArrayNode extends JSONNode{
	public ArrayNode(String name, ArrayList<JSONNode> values) {
		super(name, values);
		for (JSONNode value : values) {
			if ((value instanceof KeyNode) || (value instanceof ArrayNode)) {
				System.err.println("Arrays cannot contain lone key/value pairs or nested arrays");
				System.exit(1);
			}
		}
	}
	
	public ArrayList<JSONNode> getArray() {return super.getChildren();}
}

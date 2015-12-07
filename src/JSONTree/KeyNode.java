package JSONTree;

import java.util.ArrayList;

public class KeyNode extends JSONNode {
	public KeyNode(String name, JSONNode child) {
		super(name, new ArrayList<JSONNode>());
		if (child instanceof KeyNode) {
			System.err.println("Keys cannot have keys as children, use an object");
			System.exit(1);
		}
		super.addChild(child);
	}
}

package JSONTree;

import java.util.ArrayList;

public class ObjectNode extends JSONNode {
	public ObjectNode(String name) {
		this(name, new ArrayList<JSONNode>());
	}
	public ObjectNode(String name, ArrayList<JSONNode> children) {
		super(name, children);
		for (JSONNode child : children) {
			if (!(child instanceof KeyNode)) {
				System.err.println("Objects cannot have non key children");
				System.exit(1);
			}
		}
	}
}

package JSONTree;

public class JSONTree {
	String name;
	JSONNode root;
	public JSONTree(String name) {
		this(name, null);
	}
	public JSONTree(String name, JSONNode root) {
		this.name = name;
		this.root = root;
	}
	public JSONNode getRoot() {return root;}
	public String getName() {return name;}
	public void setRoot(JSONNode root) {this.root = root;}
	public void setName(String name) {this.name = name;}
	public String getDOTGraph() {return root.getDOTGraph();}
}

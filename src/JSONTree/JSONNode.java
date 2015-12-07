package JSONTree;

import java.util.ArrayList;

public class JSONNode {
	String name;
	ArrayList<JSONNode> children;
	Integer nodenum = null;
	public JSONNode(String name) {
		this(name, new ArrayList<JSONNode>());
	}
	public JSONNode(String name, ArrayList<JSONNode> children) {
		if (name.startsWith("\"") && name.endsWith("\"")) {
			name = name.substring(1, name.length()-1);
		}
		this.name = name;
		this.children = children;
	}
	
	protected Integer getNodeNumber() {return this.nodenum;}
	protected void setNodeNumber(Integer nodenum) {this.nodenum = nodenum;}
	public String getName() {return name;}
	protected void setName(String name) {this.name = name;}
	public void addChild(JSONNode child) {children.add(child);}
	public Integer getChildCount() {return children.size();}
	public ArrayList<JSONNode> getChildren() {return children;}
	public String getDOTGraph() {
		String digraph = "digraph {\n\n" +
			"\tordering=out;\n" +
			"\tranksep=.4;\n" +
			"\tbgcolor=\"lightgrey\"; node [shape=box, fixedsize=false, fontsize=12," +
			" fontname=\"Helvetica-bold\", fontcolor=\"blue\"\n" +
			"\twidth=.25, height=.25, color=\"black\", fillcolor=\"white\", style=\"filled, solid, bold\"];\n" +
			"\tedge [arrowsize=.5, color=\"black\", style=\"bold\"]\n\n";
		ArrayList<String> nodes = new ArrayList<String>();
		ArrayList<String> edges = new ArrayList<String>();
		getDOTGraph(new NodeCount(0), nodes, edges);
		for (String node : nodes)
			digraph = digraph + "\t" + node + "\n";
		for (String edge : edges) 
			digraph = digraph + "\t" + edge + "\n";
		return digraph + "}";
	}
	private void getDOTGraph(NodeCount nc, ArrayList<String> nodes, ArrayList<String> edges) {
		if (this.nodenum == null) {
			nodes.add("n" + nc.nodenum + " [label=\"" + name + "\"];");
			this.nodenum = nc.nodenum;
			nc.nodenum++;
		}
		for (JSONNode child : children) {
			if (child.getNodeNumber() == null) {
				nodes.add("n" + nc.nodenum + " [label=\"" + child.getName() + "\"];");
				child.setNodeNumber(nc.nodenum);
				nc.nodenum++;
			}
			edges.add("n" + this.nodenum + " -> n" + child.getNodeNumber());
			child.getDOTGraph(nc, nodes, edges);
		}
	}
}

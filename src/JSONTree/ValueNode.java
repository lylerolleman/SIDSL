package JSONTree;

public class ValueNode extends JSONNode {
	String type;
	public ValueNode(String value, String type) {
		super(value);
		this.type = type;
		
	}
	public String getString() {return super.getName();}
	public Integer getInt() {
		try {
			return Integer.parseInt(getString());
		} catch (NumberFormatException nfe) {
			System.err.println("parse error: " + getString() + " not an integer");
			nfe.printStackTrace();
			System.exit(1);
		}
		return null;
	}
	public Double getDouble() {
		try {
			return Double.parseDouble(getString());
		} catch (NumberFormatException nfe) {
			System.err.println("parse error: " + getString() + " not a valid floating point number");
			nfe.printStackTrace();
			System.exit(1);
		}
		return null;
	}
	public Boolean getBool() {
		switch (getString()) {
		case "true":
		case "t":
		case "T":
		case "1":
			return true;
		case "false":
		case "f":
		case "F":
		case "0":
			return false;
		default:
			System.err.println("not a valid boolean");
			System.exit(1);
		}
		return null;
	}
}

tree grammar JSONTreeConstruct;

options {
  language = Java;
  tokenVocab = JSONParser;
  ASTLabelType = CommonTree;
}

@header {
package JSONHandler;
import JSONTree.*;
}

@members {
JSONTree tree;
public JSONTreeConstruct(TreeNodeStream input, JSONTree tree) {
  this(input);
  this.tree = tree;
}
}

jsonfile
@init {ArrayList<JSONNode> children = new ArrayList<JSONNode>();}
@after {tree.setRoot(new JSONNode("root", children));}
  : ^(JSONFILE (kvpair {children.add($kvpair.key);})+)
  | ^(JSONFILE (object {children.add($object.obj);})+)
  ;
kvpair returns [KeyNode key]
  : ^(COLON STRING value) {$key = new KeyNode($STRING.text, $value.node);}
  ;
value returns [JSONNode node]
  : literal {$node = $literal.value;}
  | array {$node = $array.array;}
  | object {$node = $object.obj;}
  ;
object returns [ObjectNode obj]
@init {ArrayList<JSONNode> pairs = new ArrayList<JSONNode>();}
  : ^(OBJECT (kvpair {pairs.add($kvpair.key);})*) {$obj = new ObjectNode("OBJECT", pairs);}
  ;
array returns [ArrayNode array]
@init {ArrayList<JSONNode> elements = new ArrayList<JSONNode>();}
@after {$array = new ArrayNode("ARRAY", elements);}
  : ^(ARRAY (literal {elements.add($literal.value);})+)
  | ^(ARRAY (object {elements.add($object.obj);})+)
  ;
literal returns [ValueNode value]
  : NUMBER {$value = new ValueNode($NUMBER.text, "int");}
  | FPNUMBER {$value = new ValueNode($FPNUMBER.text, "double");}
  | STRING {$value = new ValueNode($STRING.text, "string");}
  | TRUE {$value = new ValueNode("true", "boolean");}
  | FALSE {$value = new ValueNode("false", "boolean");}
  | NULL {$value = new ValueNode("null", "null");}
  ;
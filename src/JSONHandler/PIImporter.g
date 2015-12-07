tree grammar PIImporter;

options {
  language = Java;
  tokenVocab = JSONParser;
  ASTLabelType = CommonTree;
}

@header {
  package JSONHandler;
  import SymbolTable.*;
  import Global.*;
  import java.util.HashMap;
}

jsonfile returns [ArrayValue jsonarray]
@init {ArrayValue av = new ArrayValue();}
@after {$jsonarray = av;}
  : ^(JSONFILE (kvpair {av.add($kvpair.value);})+)
  | ^(JSONFILE (object {av.add($object.value);})+)
  ;
kvpair returns [KeyValue value]
  : ^(COLON STRING v=value {$value = new KeyValue($STRING.text, $v.value.getType(), $v.value);})
  ;
value returns [Value value]
  : literal {$value = $literal.value;}
  | array {$value = $array.value;}
  | object {$value = $object.value;}
  ;
object returns [ObjectValue value]
@init {HashMap obj = new HashMap<String, VariableSymbol>();}
@after {$value = new ObjectValue(obj);}
  : ^(OBJECT (kvpair {obj.put($kvpair.value.getKey(), new VariableSymbol($kvpair.value.getKey(),
                      $kvpair.value.getType(), $kvpair.value));})*)
  ;
array returns [ArrayValue value]
@init {ArrayValue av = new ArrayValue();}
@after {$value = av;}
  : ^(ARRAY (l=literal {av.add($l.value);})+)
  | ^(ARRAY (object {av.add($object.value);})+)
  ;
literal returns [VarValue value]
  : NUMBER {$value = new VarValue($NUMBER.text);}
  | FPNUMBER {$value = new VarValue($FPNUMBER.text);}
  | STRING {$value = new VarValue($STRING.text, true);}
  | TRUE {$value = new VarValue($TRUE.text);}
  | FALSE {$value = new VarValue($FALSE.text);}
  | NULL {$value = new VarValue("null");}
  ;
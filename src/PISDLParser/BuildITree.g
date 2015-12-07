tree grammar BuildITree;

options {
  language = Java;
  tokenVocab = PI;
  ASTLabelType = CommonTree;
  backtrack = false;
  memoize = false;
}

@header {
package PISDLParser;

import Global.*;
import Expressions.*;
import Statements.*;
import SymbolTable.*;
import PIExceptions.*;
}

@members {
  SymbolTable symtab;
  ArrayList<Value> mainargs;
  public BuildITree(TreeNodeStream input, SymbolTable symtab, ArrayList<Value> mainargs) {
    this(input);
    this.symtab = symtab;
    this.mainargs = mainargs;
    PersistentData.scopestack.push(symtab.getGlobalScope());
  }
  private CommonTree getErrorHeader() {
    return (CommonTree) input.LT(1);
  }
}

program returns [Root root]
@after {
  $root = new Root($g.gdecl, new ArrayValue(mainargs));
}
  : ^(PROGRAM g=globals)
  ;
  
globals returns [ArrayList<Statement> gdecl]
@init {
  ArrayList<Statement> decl = new ArrayList<Statement>();
}
@after {
  $gdecl = decl;
}
  : (d=declaration {decl.add($d.decl);})* (f=function {PersistentData.scopestack.peek().define($f.function);})*
  ;
  
declaration returns [Statement decl] 
@init {
  CommonTree errtree = getErrorHeader();
}
  : ^(DECL type ID (EQUAL expr)?) {$decl = new Declaration(errtree, $type.type, $ID.text, $expr.expression);}
  ;
  
statement returns [Statement stat]
  : assignment {$stat = $assignment.assig;}
  | declaration {$stat = $declaration.decl;}
  | printstatement {$stat = $printstatement.pstat;}
  | returnstatement {$stat = $returnstatement.stat;}
  | statcall {$stat = $statcall.stat;}
  | ifstatement {$stat = $ifstatement.stat;}
  | whilestatement {$stat = $whilestatement.stat;}
  | BREAK {$stat = new Break();}
  | CONTINUE {$stat = new Continue();}
  ;
  
readfunction returns [Expression expr]
@init {
  CommonTree errtree = getErrorHeader();
}
  : ^(READ_JSON expr) {$expr = new ReadJSON(errtree, $expr.expression);}
  ;
  
whilestatement returns [Statement stat]
@init {
  CommonTree errtree = getErrorHeader();
}
  : ^(WHILE expr block) {$stat = new WhileStatement(errtree, $expr.expression, $block.block);}
  ;
  
ifstatement returns [Statement stat]
@init {
  CommonTree errtree = getErrorHeader();
}
  : ^(IF expr b1=block (ELSE b2=block)?) {$stat = new IfStatement(errtree, $expr.expression, $b1.block, $b2.block);}
  ;
  
returnstatement returns [Statement stat]
  : ^(RETURN expr?) {$stat = new Return($expr.expression);}
  ;
  
printstatement returns [Statement pstat]
@init {
  CommonTree errtree = getErrorHeader();
}
  : ^(PRINT expr) {$pstat = new Print(errtree, $expr.expression);}
  | ^(PRINTLN expr) {$pstat = new PrintLn(errtree, $expr.expression);}
  | ^(PRINTJSON expr) {$pstat = new PrintJSON(errtree, $expr.expression);}
  ;
  
block returns [Block block]
@init {
  ArrayList<Statement> stats = new ArrayList<Statement>();
}
@after {
  $block = new Block(stats);
}
  : ^(BLOCK (s=statement {stats.add($s.stat);})*)
  ;
  
assignment returns [Statement assig]
@init {
  CommonTree errtree = getErrorHeader();
}
  : ^(EQUAL ID expr) {$assig = new Assignment(errtree, $ID.text, $expr.expression);}
  | ^(OBJ_ASSIG obj=ID ref=ID expr) {$assig = new Assignment(errtree, $obj.text, $ref.text, $expr.expression, null);}
  | ^(ARRAY_ASSIG ID index=expr e=expr) {$assig = new Assignment(errtree, $ID.text, null, $e.expression, $index.expression);}
  | ^(SET ID expr) {$assig = new Set(errtree, $ID.text, $expr.expression);}
  ;
  
function returns [Function function]
@init {
  CommonTree errtree = getErrorHeader();
}
  : ^(FUNCTION ^(ID type) params? block) {
    if (!$block.block.endsWithReturn())
      $block.block.addVoidReturn();
    $function = new Function($ID.text, $type.type, $params.params, $block.block);
  }
  ;
params returns [ArrayList<VariableSymbol> params]
@init {ArrayList<VariableSymbol> paramlist = new ArrayList<VariableSymbol>();}
@after {$params = paramlist;}
  : ^(PARAMS (p=parameter {paramlist.add($p.vs);})*)
  ;
parameter returns [VariableSymbol vs]
  : ^(ID type) {$vs = new VariableSymbol($ID.text, $type.type);}
  ;
  
statcall returns [Statement stat]
@init {
  CommonTree errtree = getErrorHeader();
}
  : ^(CALL ID a=args?) {$stat = new StatCall(errtree, $ID.text, $a.args);}
  ;
 
exprcall returns [Expression expr]
@init {
  CommonTree errtree = getErrorHeader();
}
  : ^(CALL ID a=args?) {$expr = new Call(errtree, $ID.text, $a.args);}
  ;
args returns [ArrayList<Expression> args]
@init {ArrayList<Expression> arguments = new ArrayList<Expression>();}
@after {$args = arguments;}
  : ^(ARGS (e=expr {arguments.add($e.expression);})*)
  ;
expr returns [Expression expression] 
@init {
  CommonTree errtree = getErrorHeader();
}
  : ^(PLUS e1=expr e2=expr) {$expression = new Add(errtree, $e1.expression, $e2.expression);}
  | ^(MINUS e1=expr e2=expr) {$expression = new Subtract(errtree, $e1.expression, $e2.expression);}
  | ^(CONCAT e1=expr e2=expr) {$expression = new Concat(errtree, $e1.expression, $e2.expression);}
  | ^(MULT e1=expr e2=expr) {$expression = new Multiply(errtree, $e1.expression, $e2.expression);}
  | ^(DIV e1=expr e2=expr) {$expression = new Divide(errtree, $e1.expression, $e2.expression);}
  | ^(POW e1=expr e2=expr) {$expression = new Power(errtree, $e1.expression, $e2.expression);}
  | ^(AND e1=expr e2=expr) {$expression = new And(errtree, $e1.expression, $e2.expression);}
  | ^(OR e1=expr e2=expr) {$expression = new Or(errtree, $e1.expression, $e2.expression);}
  | ^(XOR e1=expr e2=expr) {$expression = new Xor(errtree, $e1.expression, $e2.expression);}
  | ^(EQUIV e1=expr e2=expr) {$expression = new Equal(errtree, $e1.expression, $e2.expression);}
  | ^(NOTEQ e1=expr e2=expr) {$expression = new NotEqual(errtree, $e1.expression, $e2.expression);}
  | ^(GTHAN e1=expr e2=expr) {$expression = new Gthan(errtree, $e1.expression, $e2.expression);}
  | ^(LTHAN e1=expr e2=expr) {$expression = new Lthan(errtree, $e1.expression, $e2.expression);}
  | ^(GTHANE e1=expr e2=expr) {$expression = new GthanE(errtree, $e1.expression, $e2.expression);}
  | ^(LTHANE e1=expr e2=expr) {$expression = new LthanE(errtree, $e1.expression, $e2.expression);}
  | ^(POS e=expr) {$expression = new Pos(errtree, $e.expression);}
  | ^(NEG e=expr) {$expression = new Neg(errtree, $e.expression);}
  | ^(NOT e=expr) {$expression = new Not(errtree, $e.expression);}
  | ^(KVPAIR e1=expr e2=expr) {$expression = new KVPair(errtree, $e1.expression, $e2.expression);}
  | ^(GET e=expr) {$expression = new Get(errtree, $e.expression);}
  | ^(CAST type e=expr) {$expression = new Cast(errtree, $type.type, $e.expression);}
  | exprcall {$expression = $exprcall.expr;}
  | readfunction {$expression = $readfunction.expr;}
  | ^(OBJECT_CONSTRUCTOR params) {$expression = new ObjectConstructor($params.params);}
  | ^(OBJ_REF obj=ID ref=ID) {$expression = new ObjectReference(errtree, new Identifier(errtree, $obj.text), $ref.text);}
  | NUMBER {$expression = new Atom(new VarValue(Integer.parseInt($NUMBER.text)));}
  | FPNUMBER {$expression = new Atom(new VarValue(Double.parseDouble($FPNUMBER.text)));}
  | TRUE {$expression = new Atom(new VarValue(true));}
  | FALSE {$expression = new Atom(new VarValue(false));}
  | STRING {$expression = new Atom(new VarValue($STRING.text));}
  | ^(ARRAY {ArrayList<Expression> exprs = new ArrayList<Expression>();}
    (e=expr {exprs.add($e.expression);})*) {$expression = new ArrayConstructor(exprs);}
  | ^(INDEX ID e=expr) {$expression = new Index(errtree, new Identifier(errtree, $ID.text), $e.expression);}
  | ^(MEMBER e=expr ID params?) {$expression = new Member(errtree, $ID.text, $e.expression, $params.params);}
  | ID {$expression = new Identifier(errtree, $ID.text);}
  ;

type returns [TypeSymbol type]
  : VAR {$type = symtab.resolveType("var");}
  | KEY {$type = symtab.resolveType("key");}
  | OBJECT {$type = symtab.resolveType("object");}
  | ARRAY {$type = symtab.resolveType("array");}
  | VECTOR {$type = symtab.resolveType("vector");}
  | VOID {$type = symtab.resolveType("void");}
  ;
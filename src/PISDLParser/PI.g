grammar PI;

options {
  language = Java;
  output = AST;
  backtrack = true;
  memoize = true;
}

tokens {
  PROGRAM;
  DECL;
  BLOCK;
  FUNCTION;
  PARAMS;
  POS;
  NEG;
  CALL;
  ARGS;
  CAST;
  ARRAY;
  INDEX;
  OBJECT_CONSTRUCTOR;
  OBJ_REF;
  OBJ_ASSIG;
  ARRAY_ASSIG;
}

@header {
package PISDLParser;

import Global.Root;
}

@lexer::header {
package PISDLParser;

import Global.Root;
}

program
  : imports* globals -> ^(PROGRAM globals)
  ;
  
imports
  : INCLUDE STRING {
    
    String filename = $STRING.text;
    PIRig imp = new PIRig(filename.substring(1, filename.length()-1));
    //System.out.println(imp.getDOTGraph());
    Root program = imp.getPITree(new ArrayList<String>());
    try {
      program.execute();
    } catch (NullPointerException npe) {}
  }
  ;
  
globals
  : declaration* function*
  //: (declaration|function)*
  ;
  
declaration
  : type ID (EQUAL expr)? SC -> ^(DECL type ID (EQUAL expr)?)
  ;
  
statement
  : assignment
  | declaration
  | printstatement
  | returnstatement
  | statcall
  | ifstatement
  | whilestatement
  | BREAK SC!
  | CONTINUE SC!
  ;
  
readfunction
  : READ_JSON LP expr RP -> ^(READ_JSON expr)
  ;
  
whilestatement
  : WHILE LP expr RP block -> ^(WHILE expr block)
  ;
  
ifstatement
  : IF LP expr RP block (ELSE block)? -> ^(IF expr block (ELSE block)?)
  ;
 
returnstatement
  : RETURN expr? SC -> ^(RETURN expr?)
  ;
  
printstatement
  : PRINT LP expr RP SC -> ^(PRINT expr)
  | PRINTLN LP expr RP SC -> ^(PRINTLN expr)
  | PRINTJSON LP expr RP SC -> ^(PRINTJSON expr)
  ;
  
block
  : LBRACE statement* RBRACE -> ^(BLOCK statement*)
  ;
  
assignment
  : obj=ID DOT ref=ID EQUAL expr SC -> ^(OBJ_ASSIG $obj $ref expr)
  | ID LB index=expr RB EQUAL value=expr SC -> ^(ARRAY_ASSIG ID $index $value)
  | ID EQUAL expr SC -> ^(EQUAL ID expr)
  | ID SET expr SC -> ^(SET ID expr)
  ;
  
function
  : type ID LP params? RP block -> ^(FUNCTION ^(ID type) params? block)
  ;
params
  : parameter (COMMA parameter)* -> ^(PARAMS parameter*)
  ;
parameter
  : type ID -> ^(ID type)
  ;
  
statcall
  : ID LP args? RP SC -> ^(CALL ID args?)
  ;
exprcall
  : readfunction
  | ID LP args? RP -> ^(CALL ID args?)
  ;
args
  : expr (COMMA expr)* -> ^(ARGS expr*)
  ;
  
expr
  : orexpr
  ;
orexpr
  : andexpr ((XOR|OR)^ andexpr)*
  ;
andexpr
  : eqexpr (AND^ eqexpr)*
  ;
eqexpr
  : relexpr ((EQUIV|NOTEQ)^ relexpr)*
  ;
relexpr
  : plusexpr ((LTHAN|GTHAN|LTHANE|GTHANE)^ plusexpr)*
  ;
plusexpr
  : multexpr ((PLUS|MINUS|CONCAT)^ multexpr)*
  ;
multexpr
  : powexpr ((MULT|DIV)^ powexpr)*
  ;
powexpr
  : unaryexpr (POW^ unaryexpr)*
  ;

unaryexpr
  : PLUS unaryexpr -> ^(POS unaryexpr)
  | MINUS unaryexpr -> ^(NEG unaryexpr)
  | NOT^ unaryexpr
  | GET^ catom
  | catom
  ;
  
catom
  : memberexpr (KVPAIR^ memberexpr)?
  ;
memberexpr
  : atom (MEMBER^ ID (LP! params RP!)?)?
  ;

atom
  : LP! expr RP!
  | LP type RP e=expr -> ^(CAST type $e)
  | LB expr (COMMA expr)* RB -> ^(ARRAY expr*)
  | ID LB expr RB -> ^(INDEX ID expr)
  | obj=ID DOT ref=ID -> ^(OBJ_REF $obj $ref)
  | LTHAN params GTHAN -> ^(OBJECT_CONSTRUCTOR params)
  | exprcall
  | NUMBER
  | FPNUMBER
  | TRUE
  | FALSE
  | STRING
  | ID
  ;
string
  : QUOTE! .* QUOTE!
  ;

type
  : VAR
  | KEY
  | OBJECT
  | ARRAY
  | VECTOR
  | VOID
  ;

MULTILINE_COMMENT : '/*' .* '*/' {$channel = HIDDEN;} ;
COMMENT : '//' .* ('\n'|'\r') {$channel = HIDDEN;};
LBRACE: '{';
RBRACE: '}';
LP: '(';
RP: ')';
LB: '[';
RB: ']';
DOT: '.';
COMMA: ',';
QUOTE: '"';
SC: ';';
TRUE: 'true';
FALSE: 'false';
NULL: 'null';
US: '_';
BSLASH: '\\';
PRINTJSON: 'printjson';
PRINTLN: 'println';
PRINT: 'print';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
BREAK: 'break';
CONTINUE: 'continue';
AS: 'as';
INCLUDE: 'include';
READ_JSON: 'read_json';

VAR: 'var';
KEY: 'key';
OBJECT: 'object';
ARRAY: 'array';
VECTOR: 'vector';
VOID: 'void';

SET: ':=';
GET: '%';
CONCAT: '<-';
MEMBER: '->';
EQUIV: '==';
EQUAL: '=';
LTHAN: '<';
GTHAN: '>';
LTHANE: '<=';
GTHANE: '>=';
NOT: '!';
NOTEQ: '!=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
PRED: '|';
OR: 'or';
XOR: 'xor';
AND: 'and';
POW: '^';
KVPAIR: ':';

WS
  : (' ' 
  | '\t' 
  | '\n'
  | '\r') {$channel = HIDDEN;}
  ;

fragment DIGIT: '0'..'9';
ID
  : ('A'..'Z' | 'a'..'z' | '_') ('A'..'Z'| 'a'..'z'| '_' | DIGIT)*
  ;
NUMBER: DIGIT+;
FPNUMBER: DIGIT+ DOT DIGIT+;
STRING: QUOTE .* QUOTE;
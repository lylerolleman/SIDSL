grammar JSONParser;

options {
  language = Java;
  output = AST;
}
tokens {
  JSONFILE;
  OBJECT;
  ARRAY;
}
@header {
package JSONHandler;
}

@lexer::header {
package JSONHandler;
}

 

jsonfile
  : kvpair+ -> ^(JSONFILE kvpair+)
  | object+ -> ^(JSONFILE object+)
  ;
kvpair
  : STRING COLON value -> ^(COLON STRING value)
  ;
value
  : literal 
  | array 
  | object 
  ;
object
  : LBRACE (kvpair COMMA?)* RBRACE -> ^(OBJECT kvpair*)
  ;
array
  : LB literal (COMMA literal)* RB -> ^(ARRAY literal (literal)*)
  | LB object (COMMA object)* RB -> ^(ARRAY object (object)*)
  ;
literal
  : NUMBER 
  | FPNUMBER 
  | STRING 
  | TRUE
  | FALSE
  | NULL
  ;

LBRACE: '{';
RBRACE: '}';
LP: '(';
RP: ')';
LB: '[';
RB: ']';
DOT: '.';
COMMA: ',';
QUOTE: '"';
COLON: ':';
TRUE: 'true';
FALSE: 'false';
NULL: 'null';
US: '_';
BSLASH: '\\';
SLASH: '/';
WS
  : (' ' 
  | '\t' 
  | '\n'
  | '\r') {$channel = HIDDEN;}
  ;

LETTER: 'a'..'z'|'A'..'Z';
fragment DIGIT: '0'..'9';
NUMBER: ('-'|'+')? DIGIT+;
FPNUMBER: ('-'|'+')? DIGIT+ DOT DIGIT+;
STRING: QUOTE .* QUOTE;
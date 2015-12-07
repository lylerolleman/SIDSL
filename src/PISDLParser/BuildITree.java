// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g 2015-12-07 10:33:57

package PISDLParser;

import Global.*;
import Expressions.*;
import Statements.*;
import SymbolTable.*;
import PIExceptions.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BuildITree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "DECL", "BLOCK", "FUNCTION", "PARAMS", "POS", "NEG", "CALL", "ARGS", "CAST", "ARRAY", "INDEX", "OBJECT_CONSTRUCTOR", "OBJ_REF", "OBJ_ASSIG", "ARRAY_ASSIG", "INCLUDE", "STRING", "ID", "EQUAL", "SC", "BREAK", "CONTINUE", "READ_JSON", "LP", "RP", "WHILE", "IF", "ELSE", "RETURN", "PRINT", "PRINTLN", "PRINTJSON", "LBRACE", "RBRACE", "DOT", "LB", "RB", "SET", "COMMA", "XOR", "OR", "AND", "EQUIV", "NOTEQ", "LTHAN", "GTHAN", "LTHANE", "GTHANE", "PLUS", "MINUS", "CONCAT", "MULT", "DIV", "POW", "NOT", "GET", "KVPAIR", "MEMBER", "NUMBER", "FPNUMBER", "TRUE", "FALSE", "QUOTE", "VAR", "KEY", "OBJECT", "VECTOR", "VOID", "MULTILINE_COMMENT", "COMMENT", "NULL", "US", "BSLASH", "AS", "PRED", "WS", "DIGIT"
    };
    public static final int EOF=-1;
    public static final int PROGRAM=4;
    public static final int DECL=5;
    public static final int BLOCK=6;
    public static final int FUNCTION=7;
    public static final int PARAMS=8;
    public static final int POS=9;
    public static final int NEG=10;
    public static final int CALL=11;
    public static final int ARGS=12;
    public static final int CAST=13;
    public static final int ARRAY=14;
    public static final int INDEX=15;
    public static final int OBJECT_CONSTRUCTOR=16;
    public static final int OBJ_REF=17;
    public static final int OBJ_ASSIG=18;
    public static final int ARRAY_ASSIG=19;
    public static final int INCLUDE=20;
    public static final int STRING=21;
    public static final int ID=22;
    public static final int EQUAL=23;
    public static final int SC=24;
    public static final int BREAK=25;
    public static final int CONTINUE=26;
    public static final int READ_JSON=27;
    public static final int LP=28;
    public static final int RP=29;
    public static final int WHILE=30;
    public static final int IF=31;
    public static final int ELSE=32;
    public static final int RETURN=33;
    public static final int PRINT=34;
    public static final int PRINTLN=35;
    public static final int PRINTJSON=36;
    public static final int LBRACE=37;
    public static final int RBRACE=38;
    public static final int DOT=39;
    public static final int LB=40;
    public static final int RB=41;
    public static final int SET=42;
    public static final int COMMA=43;
    public static final int XOR=44;
    public static final int OR=45;
    public static final int AND=46;
    public static final int EQUIV=47;
    public static final int NOTEQ=48;
    public static final int LTHAN=49;
    public static final int GTHAN=50;
    public static final int LTHANE=51;
    public static final int GTHANE=52;
    public static final int PLUS=53;
    public static final int MINUS=54;
    public static final int CONCAT=55;
    public static final int MULT=56;
    public static final int DIV=57;
    public static final int POW=58;
    public static final int NOT=59;
    public static final int GET=60;
    public static final int KVPAIR=61;
    public static final int MEMBER=62;
    public static final int NUMBER=63;
    public static final int FPNUMBER=64;
    public static final int TRUE=65;
    public static final int FALSE=66;
    public static final int QUOTE=67;
    public static final int VAR=68;
    public static final int KEY=69;
    public static final int OBJECT=70;
    public static final int VECTOR=71;
    public static final int VOID=72;
    public static final int MULTILINE_COMMENT=73;
    public static final int COMMENT=74;
    public static final int NULL=75;
    public static final int US=76;
    public static final int BSLASH=77;
    public static final int AS=78;
    public static final int PRED=79;
    public static final int WS=80;
    public static final int DIGIT=81;

    // delegates
    // delegators


        public BuildITree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public BuildITree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return BuildITree.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g"; }


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



    // $ANTLR start "program"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:35:1: program returns [Root root] : ^( PROGRAM g= globals ) ;
    public final Root program() throws RecognitionException {
        Root root = null;

        ArrayList<Statement> g = null;


        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:39:3: ( ^( PROGRAM g= globals ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:39:5: ^( PROGRAM g= globals )
            {
            match(input,PROGRAM,FOLLOW_PROGRAM_in_program86); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_globals_in_program90);
                g=globals();

                state._fsp--;


                match(input, Token.UP, null); 
            }

            }


              root = new Root(g, new ArrayValue(mainargs));

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return root;
    }
    // $ANTLR end "program"


    // $ANTLR start "globals"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:42:1: globals returns [ArrayList<Statement> gdecl] : (d= declaration )* (f= function )* ;
    public final ArrayList<Statement> globals() throws RecognitionException {
        ArrayList<Statement> gdecl = null;

        Statement d = null;

        Function f = null;



          ArrayList<Statement> decl = new ArrayList<Statement>();

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:49:3: ( (d= declaration )* (f= function )* )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:49:5: (d= declaration )* (f= function )*
            {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:49:5: (d= declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DECL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:49:6: d= declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_globals123);
            	    d=declaration();

            	    state._fsp--;

            	    decl.add(d);

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:49:43: (f= function )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FUNCTION) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:49:44: f= function
            	    {
            	    pushFollow(FOLLOW_function_in_globals132);
            	    f=function();

            	    state._fsp--;

            	    PersistentData.scopestack.peek().define(f);

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


              gdecl = decl;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return gdecl;
    }
    // $ANTLR end "globals"


    // $ANTLR start "declaration"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:52:1: declaration returns [Statement decl] : ^( DECL type ID ( EQUAL expr )? ) ;
    public final Statement declaration() throws RecognitionException {
        Statement decl = null;

        CommonTree ID2=null;
        TypeSymbol type1 = null;

        Expression expr3 = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:56:3: ( ^( DECL type ID ( EQUAL expr )? ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:56:5: ^( DECL type ID ( EQUAL expr )? )
            {
            match(input,DECL,FOLLOW_DECL_in_declaration162); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_declaration164);
            type1=type();

            state._fsp--;

            ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_declaration166); 
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:56:20: ( EQUAL expr )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EQUAL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:56:21: EQUAL expr
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_declaration169); 
                    pushFollow(FOLLOW_expr_in_declaration171);
                    expr3=expr();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            decl = new Declaration(errtree, type1, (ID2!=null?ID2.getText():null), expr3);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return decl;
    }
    // $ANTLR end "declaration"


    // $ANTLR start "statement"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:59:1: statement returns [Statement stat] : ( assignment | declaration | printstatement | returnstatement | statcall | ifstatement | whilestatement | BREAK | CONTINUE );
    public final Statement statement() throws RecognitionException {
        Statement stat = null;

        Statement assignment4 = null;

        Statement declaration5 = null;

        Statement printstatement6 = null;

        Statement returnstatement7 = null;

        Statement statcall8 = null;

        Statement ifstatement9 = null;

        Statement whilestatement10 = null;


        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:60:3: ( assignment | declaration | printstatement | returnstatement | statcall | ifstatement | whilestatement | BREAK | CONTINUE )
            int alt4=9;
            switch ( input.LA(1) ) {
            case OBJ_ASSIG:
            case ARRAY_ASSIG:
            case EQUAL:
            case SET:
                {
                alt4=1;
                }
                break;
            case DECL:
                {
                alt4=2;
                }
                break;
            case PRINT:
            case PRINTLN:
            case PRINTJSON:
                {
                alt4=3;
                }
                break;
            case RETURN:
                {
                alt4=4;
                }
                break;
            case CALL:
                {
                alt4=5;
                }
                break;
            case IF:
                {
                alt4=6;
                }
                break;
            case WHILE:
                {
                alt4=7;
                }
                break;
            case BREAK:
                {
                alt4=8;
                }
                break;
            case CONTINUE:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:60:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement195);
                    assignment4=assignment();

                    state._fsp--;

                    stat = assignment4;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:61:5: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_statement203);
                    declaration5=declaration();

                    state._fsp--;

                    stat = declaration5;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:62:5: printstatement
                    {
                    pushFollow(FOLLOW_printstatement_in_statement211);
                    printstatement6=printstatement();

                    state._fsp--;

                    stat = printstatement6;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:63:5: returnstatement
                    {
                    pushFollow(FOLLOW_returnstatement_in_statement219);
                    returnstatement7=returnstatement();

                    state._fsp--;

                    stat = returnstatement7;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:64:5: statcall
                    {
                    pushFollow(FOLLOW_statcall_in_statement227);
                    statcall8=statcall();

                    state._fsp--;

                    stat = statcall8;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:65:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement235);
                    ifstatement9=ifstatement();

                    state._fsp--;

                    stat = ifstatement9;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:66:5: whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement243);
                    whilestatement10=whilestatement();

                    state._fsp--;

                    stat = whilestatement10;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:67:5: BREAK
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement251); 
                    stat = new Break();

                    }
                    break;
                case 9 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:68:5: CONTINUE
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement259); 
                    stat = new Continue();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stat;
    }
    // $ANTLR end "statement"


    // $ANTLR start "readfunction"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:71:1: readfunction returns [Expression expr] : ^( READ_JSON expr ) ;
    public final Expression readfunction() throws RecognitionException {
        Expression expr = null;

        Expression expr11 = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:75:3: ( ^( READ_JSON expr ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:75:5: ^( READ_JSON expr )
            {
            match(input,READ_JSON,FOLLOW_READ_JSON_in_readfunction286); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_readfunction288);
            expr11=expr();

            state._fsp--;


            match(input, Token.UP, null); 
            expr = new ReadJSON(errtree, expr11);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "readfunction"


    // $ANTLR start "whilestatement"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:78:1: whilestatement returns [Statement stat] : ^( WHILE expr block ) ;
    public final Statement whilestatement() throws RecognitionException {
        Statement stat = null;

        Expression expr12 = null;

        Block block13 = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:82:3: ( ^( WHILE expr block ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:82:5: ^( WHILE expr block )
            {
            match(input,WHILE,FOLLOW_WHILE_in_whilestatement316); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_whilestatement318);
            expr12=expr();

            state._fsp--;

            pushFollow(FOLLOW_block_in_whilestatement320);
            block13=block();

            state._fsp--;


            match(input, Token.UP, null); 
            stat = new WhileStatement(errtree, expr12, block13);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stat;
    }
    // $ANTLR end "whilestatement"


    // $ANTLR start "ifstatement"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:85:1: ifstatement returns [Statement stat] : ^( IF expr b1= block ( ELSE b2= block )? ) ;
    public final Statement ifstatement() throws RecognitionException {
        Statement stat = null;

        Block b1 = null;

        Block b2 = null;

        Expression expr14 = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:89:3: ( ^( IF expr b1= block ( ELSE b2= block )? ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:89:5: ^( IF expr b1= block ( ELSE b2= block )? )
            {
            match(input,IF,FOLLOW_IF_in_ifstatement348); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_ifstatement350);
            expr14=expr();

            state._fsp--;

            pushFollow(FOLLOW_block_in_ifstatement354);
            b1=block();

            state._fsp--;

            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:89:24: ( ELSE b2= block )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ELSE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:89:25: ELSE b2= block
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_ifstatement357); 
                    pushFollow(FOLLOW_block_in_ifstatement361);
                    b2=block();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            stat = new IfStatement(errtree, expr14, b1, b2);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stat;
    }
    // $ANTLR end "ifstatement"


    // $ANTLR start "returnstatement"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:92:1: returnstatement returns [Statement stat] : ^( RETURN ( expr )? ) ;
    public final Statement returnstatement() throws RecognitionException {
        Statement stat = null;

        Expression expr15 = null;


        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:93:3: ( ^( RETURN ( expr )? ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:93:5: ^( RETURN ( expr )? )
            {
            match(input,RETURN,FOLLOW_RETURN_in_returnstatement386); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:93:14: ( expr )?
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=POS && LA6_0<=CALL)||(LA6_0>=CAST && LA6_0<=OBJ_REF)||(LA6_0>=STRING && LA6_0<=ID)||LA6_0==READ_JSON||(LA6_0>=XOR && LA6_0<=FALSE)) ) {
                    alt6=1;
                }
                switch (alt6) {
                    case 1 :
                        // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:93:14: expr
                        {
                        pushFollow(FOLLOW_expr_in_returnstatement388);
                        expr15=expr();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            stat = new Return(expr15);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stat;
    }
    // $ANTLR end "returnstatement"


    // $ANTLR start "printstatement"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:96:1: printstatement returns [Statement pstat] : ( ^( PRINT expr ) | ^( PRINTLN expr ) | ^( PRINTJSON expr ) );
    public final Statement printstatement() throws RecognitionException {
        Statement pstat = null;

        Expression expr16 = null;

        Expression expr17 = null;

        Expression expr18 = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:100:3: ( ^( PRINT expr ) | ^( PRINTLN expr ) | ^( PRINTJSON expr ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt7=1;
                }
                break;
            case PRINTLN:
                {
                alt7=2;
                }
                break;
            case PRINTJSON:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:100:5: ^( PRINT expr )
                    {
                    match(input,PRINT,FOLLOW_PRINT_in_printstatement417); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_printstatement419);
                    expr16=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pstat = new Print(errtree, expr16);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:101:5: ^( PRINTLN expr )
                    {
                    match(input,PRINTLN,FOLLOW_PRINTLN_in_printstatement429); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_printstatement431);
                    expr17=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pstat = new PrintLn(errtree, expr17);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:102:5: ^( PRINTJSON expr )
                    {
                    match(input,PRINTJSON,FOLLOW_PRINTJSON_in_printstatement441); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_printstatement443);
                    expr18=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pstat = new PrintJSON(errtree, expr18);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pstat;
    }
    // $ANTLR end "printstatement"


    // $ANTLR start "block"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:105:1: block returns [Block block] : ^( BLOCK (s= statement )* ) ;
    public final Block block() throws RecognitionException {
        Block block = null;

        Statement s = null;



          ArrayList<Statement> stats = new ArrayList<Statement>();

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:112:3: ( ^( BLOCK (s= statement )* ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:112:5: ^( BLOCK (s= statement )* )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_block476); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:112:13: (s= statement )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==DECL||LA8_0==CALL||(LA8_0>=OBJ_ASSIG && LA8_0<=ARRAY_ASSIG)||LA8_0==EQUAL||(LA8_0>=BREAK && LA8_0<=CONTINUE)||(LA8_0>=WHILE && LA8_0<=IF)||(LA8_0>=RETURN && LA8_0<=PRINTJSON)||LA8_0==SET) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:112:14: s= statement
                	    {
                	    pushFollow(FOLLOW_statement_in_block481);
                	    s=statement();

                	    state._fsp--;

                	    stats.add(s);

                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }


              block = new Block(stats);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return block;
    }
    // $ANTLR end "block"


    // $ANTLR start "assignment"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:115:1: assignment returns [Statement assig] : ( ^( EQUAL ID expr ) | ^( OBJ_ASSIG obj= ID ref= ID expr ) | ^( ARRAY_ASSIG ID index= expr e= expr ) | ^( SET ID expr ) );
    public final Statement assignment() throws RecognitionException {
        Statement assig = null;

        CommonTree obj=null;
        CommonTree ref=null;
        CommonTree ID19=null;
        CommonTree ID22=null;
        CommonTree ID23=null;
        Expression index = null;

        Expression e = null;

        Expression expr20 = null;

        Expression expr21 = null;

        Expression expr24 = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:119:3: ( ^( EQUAL ID expr ) | ^( OBJ_ASSIG obj= ID ref= ID expr ) | ^( ARRAY_ASSIG ID index= expr e= expr ) | ^( SET ID expr ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case EQUAL:
                {
                alt9=1;
                }
                break;
            case OBJ_ASSIG:
                {
                alt9=2;
                }
                break;
            case ARRAY_ASSIG:
                {
                alt9=3;
                }
                break;
            case SET:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:119:5: ^( EQUAL ID expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_assignment511); 

                    match(input, Token.DOWN, null); 
                    ID19=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment513); 
                    pushFollow(FOLLOW_expr_in_assignment515);
                    expr20=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    assig = new Assignment(errtree, (ID19!=null?ID19.getText():null), expr20);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:120:5: ^( OBJ_ASSIG obj= ID ref= ID expr )
                    {
                    match(input,OBJ_ASSIG,FOLLOW_OBJ_ASSIG_in_assignment525); 

                    match(input, Token.DOWN, null); 
                    obj=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment529); 
                    ref=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment533); 
                    pushFollow(FOLLOW_expr_in_assignment535);
                    expr21=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    assig = new Assignment(errtree, (obj!=null?obj.getText():null), (ref!=null?ref.getText():null), expr21, null);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:121:5: ^( ARRAY_ASSIG ID index= expr e= expr )
                    {
                    match(input,ARRAY_ASSIG,FOLLOW_ARRAY_ASSIG_in_assignment545); 

                    match(input, Token.DOWN, null); 
                    ID22=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment547); 
                    pushFollow(FOLLOW_expr_in_assignment551);
                    index=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_assignment555);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    assig = new Assignment(errtree, (ID22!=null?ID22.getText():null), null, e, index);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:122:5: ^( SET ID expr )
                    {
                    match(input,SET,FOLLOW_SET_in_assignment565); 

                    match(input, Token.DOWN, null); 
                    ID23=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment567); 
                    pushFollow(FOLLOW_expr_in_assignment569);
                    expr24=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    assig = new Set(errtree, (ID23!=null?ID23.getText():null), expr24);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return assig;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "function"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:125:1: function returns [Function function] : ^( FUNCTION ^( ID type ) ( params )? block ) ;
    public final Function function() throws RecognitionException {
        Function function = null;

        CommonTree ID26=null;
        Block block25 = null;

        TypeSymbol type27 = null;

        ArrayList<VariableSymbol> params28 = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:129:3: ( ^( FUNCTION ^( ID type ) ( params )? block ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:129:5: ^( FUNCTION ^( ID type ) ( params )? block )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_function597); 

            match(input, Token.DOWN, null); 
            ID26=(CommonTree)match(input,ID,FOLLOW_ID_in_function600); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_function602);
            type27=type();

            state._fsp--;


            match(input, Token.UP, null); 
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:129:27: ( params )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==PARAMS) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:129:27: params
                    {
                    pushFollow(FOLLOW_params_in_function605);
                    params28=params();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_function608);
            block25=block();

            state._fsp--;


            match(input, Token.UP, null); 

                if (!block25.endsWithReturn())
                  block25.addVoidReturn();
                function = new Function((ID26!=null?ID26.getText():null), type27, params28, block25);
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return function;
    }
    // $ANTLR end "function"


    // $ANTLR start "params"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:135:1: params returns [ArrayList<VariableSymbol> params] : ^( PARAMS (p= parameter )* ) ;
    public final ArrayList<VariableSymbol> params() throws RecognitionException {
        ArrayList<VariableSymbol> params = null;

        VariableSymbol p = null;


        ArrayList<VariableSymbol> paramlist = new ArrayList<VariableSymbol>();
        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:138:3: ( ^( PARAMS (p= parameter )* ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:138:5: ^( PARAMS (p= parameter )* )
            {
            match(input,PARAMS,FOLLOW_PARAMS_in_params638); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:138:14: (p= parameter )*
                loop11:
                do {
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ID) ) {
                        alt11=1;
                    }


                    switch (alt11) {
                	case 1 :
                	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:138:15: p= parameter
                	    {
                	    pushFollow(FOLLOW_parameter_in_params643);
                	    p=parameter();

                	    state._fsp--;

                	    paramlist.add(p);

                	    }
                	    break;

                	default :
                	    break loop11;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

            params = paramlist;
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return params;
    }
    // $ANTLR end "params"


    // $ANTLR start "parameter"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:140:1: parameter returns [VariableSymbol vs] : ^( ID type ) ;
    public final VariableSymbol parameter() throws RecognitionException {
        VariableSymbol vs = null;

        CommonTree ID29=null;
        TypeSymbol type30 = null;


        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:141:3: ( ^( ID type ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:141:5: ^( ID type )
            {
            ID29=(CommonTree)match(input,ID,FOLLOW_ID_in_parameter665); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_parameter667);
            type30=type();

            state._fsp--;


            match(input, Token.UP, null); 
            vs = new VariableSymbol((ID29!=null?ID29.getText():null), type30);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return vs;
    }
    // $ANTLR end "parameter"


    // $ANTLR start "statcall"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:144:1: statcall returns [Statement stat] : ^( CALL ID (a= args )? ) ;
    public final Statement statcall() throws RecognitionException {
        Statement stat = null;

        CommonTree ID31=null;
        ArrayList<Expression> a = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:148:3: ( ^( CALL ID (a= args )? ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:148:5: ^( CALL ID (a= args )? )
            {
            match(input,CALL,FOLLOW_CALL_in_statcall695); 

            match(input, Token.DOWN, null); 
            ID31=(CommonTree)match(input,ID,FOLLOW_ID_in_statcall697); 
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:148:16: (a= args )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ARGS) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:148:16: a= args
                    {
                    pushFollow(FOLLOW_args_in_statcall701);
                    a=args();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            stat = new StatCall(errtree, (ID31!=null?ID31.getText():null), a);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stat;
    }
    // $ANTLR end "statcall"


    // $ANTLR start "exprcall"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:151:1: exprcall returns [Expression expr] : ^( CALL ID (a= args )? ) ;
    public final Expression exprcall() throws RecognitionException {
        Expression expr = null;

        CommonTree ID32=null;
        ArrayList<Expression> a = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:155:3: ( ^( CALL ID (a= args )? ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:155:5: ^( CALL ID (a= args )? )
            {
            match(input,CALL,FOLLOW_CALL_in_exprcall729); 

            match(input, Token.DOWN, null); 
            ID32=(CommonTree)match(input,ID,FOLLOW_ID_in_exprcall731); 
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:155:16: (a= args )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ARGS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:155:16: a= args
                    {
                    pushFollow(FOLLOW_args_in_exprcall735);
                    a=args();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            expr = new Call(errtree, (ID32!=null?ID32.getText():null), a);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "exprcall"


    // $ANTLR start "args"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:157:1: args returns [ArrayList<Expression> args] : ^( ARGS (e= expr )* ) ;
    public final ArrayList<Expression> args() throws RecognitionException {
        ArrayList<Expression> args = null;

        Expression e = null;


        ArrayList<Expression> arguments = new ArrayList<Expression>();
        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:160:3: ( ^( ARGS (e= expr )* ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:160:5: ^( ARGS (e= expr )* )
            {
            match(input,ARGS,FOLLOW_ARGS_in_args766); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:160:12: (e= expr )*
                loop14:
                do {
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=POS && LA14_0<=CALL)||(LA14_0>=CAST && LA14_0<=OBJ_REF)||(LA14_0>=STRING && LA14_0<=ID)||LA14_0==READ_JSON||(LA14_0>=XOR && LA14_0<=FALSE)) ) {
                        alt14=1;
                    }


                    switch (alt14) {
                	case 1 :
                	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:160:13: e= expr
                	    {
                	    pushFollow(FOLLOW_expr_in_args771);
                	    e=expr();

                	    state._fsp--;

                	    arguments.add(e);

                	    }
                	    break;

                	default :
                	    break loop14;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

            args = arguments;
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return args;
    }
    // $ANTLR end "args"


    // $ANTLR start "expr"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:162:1: expr returns [Expression expression] : ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( CONCAT e1= expr e2= expr ) | ^( MULT e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( POW e1= expr e2= expr ) | ^( AND e1= expr e2= expr ) | ^( OR e1= expr e2= expr ) | ^( XOR e1= expr e2= expr ) | ^( EQUIV e1= expr e2= expr ) | ^( NOTEQ e1= expr e2= expr ) | ^( GTHAN e1= expr e2= expr ) | ^( LTHAN e1= expr e2= expr ) | ^( GTHANE e1= expr e2= expr ) | ^( LTHANE e1= expr e2= expr ) | ^( POS e= expr ) | ^( NEG e= expr ) | ^( NOT e= expr ) | ^( KVPAIR e1= expr e2= expr ) | ^( GET e= expr ) | ^( CAST type e= expr ) | exprcall | readfunction | ^( OBJECT_CONSTRUCTOR params ) | ^( OBJ_REF obj= ID ref= ID ) | NUMBER | FPNUMBER | TRUE | FALSE | STRING | ^( ARRAY (e= expr )* ) | ^( INDEX ID e= expr ) | ^( MEMBER e= expr ID ( params )? ) | ID );
    public final Expression expr() throws RecognitionException {
        Expression expression = null;

        CommonTree obj=null;
        CommonTree ref=null;
        CommonTree NUMBER37=null;
        CommonTree FPNUMBER38=null;
        CommonTree STRING39=null;
        CommonTree ID40=null;
        CommonTree ID41=null;
        CommonTree ID43=null;
        Expression e1 = null;

        Expression e2 = null;

        Expression e = null;

        TypeSymbol type33 = null;

        Expression exprcall34 = null;

        Expression readfunction35 = null;

        ArrayList<VariableSymbol> params36 = null;

        ArrayList<VariableSymbol> params42 = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:166:3: ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( CONCAT e1= expr e2= expr ) | ^( MULT e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( POW e1= expr e2= expr ) | ^( AND e1= expr e2= expr ) | ^( OR e1= expr e2= expr ) | ^( XOR e1= expr e2= expr ) | ^( EQUIV e1= expr e2= expr ) | ^( NOTEQ e1= expr e2= expr ) | ^( GTHAN e1= expr e2= expr ) | ^( LTHAN e1= expr e2= expr ) | ^( GTHANE e1= expr e2= expr ) | ^( LTHANE e1= expr e2= expr ) | ^( POS e= expr ) | ^( NEG e= expr ) | ^( NOT e= expr ) | ^( KVPAIR e1= expr e2= expr ) | ^( GET e= expr ) | ^( CAST type e= expr ) | exprcall | readfunction | ^( OBJECT_CONSTRUCTOR params ) | ^( OBJ_REF obj= ID ref= ID ) | NUMBER | FPNUMBER | TRUE | FALSE | STRING | ^( ARRAY (e= expr )* ) | ^( INDEX ID e= expr ) | ^( MEMBER e= expr ID ( params )? ) | ID )
            int alt17=34;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt17=1;
                }
                break;
            case MINUS:
                {
                alt17=2;
                }
                break;
            case CONCAT:
                {
                alt17=3;
                }
                break;
            case MULT:
                {
                alt17=4;
                }
                break;
            case DIV:
                {
                alt17=5;
                }
                break;
            case POW:
                {
                alt17=6;
                }
                break;
            case AND:
                {
                alt17=7;
                }
                break;
            case OR:
                {
                alt17=8;
                }
                break;
            case XOR:
                {
                alt17=9;
                }
                break;
            case EQUIV:
                {
                alt17=10;
                }
                break;
            case NOTEQ:
                {
                alt17=11;
                }
                break;
            case GTHAN:
                {
                alt17=12;
                }
                break;
            case LTHAN:
                {
                alt17=13;
                }
                break;
            case GTHANE:
                {
                alt17=14;
                }
                break;
            case LTHANE:
                {
                alt17=15;
                }
                break;
            case POS:
                {
                alt17=16;
                }
                break;
            case NEG:
                {
                alt17=17;
                }
                break;
            case NOT:
                {
                alt17=18;
                }
                break;
            case KVPAIR:
                {
                alt17=19;
                }
                break;
            case GET:
                {
                alt17=20;
                }
                break;
            case CAST:
                {
                alt17=21;
                }
                break;
            case CALL:
                {
                alt17=22;
                }
                break;
            case READ_JSON:
                {
                alt17=23;
                }
                break;
            case OBJECT_CONSTRUCTOR:
                {
                alt17=24;
                }
                break;
            case OBJ_REF:
                {
                alt17=25;
                }
                break;
            case NUMBER:
                {
                alt17=26;
                }
                break;
            case FPNUMBER:
                {
                alt17=27;
                }
                break;
            case TRUE:
                {
                alt17=28;
                }
                break;
            case FALSE:
                {
                alt17=29;
                }
                break;
            case STRING:
                {
                alt17=30;
                }
                break;
            case ARRAY:
                {
                alt17=31;
                }
                break;
            case INDEX:
                {
                alt17=32;
                }
                break;
            case MEMBER:
                {
                alt17=33;
                }
                break;
            case ID:
                {
                alt17=34;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:166:5: ^( PLUS e1= expr e2= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr799); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr803);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr807);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Add(errtree, e1, e2);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:167:5: ^( MINUS e1= expr e2= expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr817); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr821);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr825);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Subtract(errtree, e1, e2);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:168:5: ^( CONCAT e1= expr e2= expr )
                    {
                    match(input,CONCAT,FOLLOW_CONCAT_in_expr835); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr839);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr843);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Concat(errtree, e1, e2);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:169:5: ^( MULT e1= expr e2= expr )
                    {
                    match(input,MULT,FOLLOW_MULT_in_expr853); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr857);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr861);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Multiply(errtree, e1, e2);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:170:5: ^( DIV e1= expr e2= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr871); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr875);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr879);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Divide(errtree, e1, e2);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:171:5: ^( POW e1= expr e2= expr )
                    {
                    match(input,POW,FOLLOW_POW_in_expr889); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr893);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr897);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Power(errtree, e1, e2);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:172:5: ^( AND e1= expr e2= expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr907); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr911);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr915);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new And(errtree, e1, e2);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:173:5: ^( OR e1= expr e2= expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr925); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr929);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr933);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Or(errtree, e1, e2);

                    }
                    break;
                case 9 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:174:5: ^( XOR e1= expr e2= expr )
                    {
                    match(input,XOR,FOLLOW_XOR_in_expr943); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr947);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr951);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Xor(errtree, e1, e2);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:175:5: ^( EQUIV e1= expr e2= expr )
                    {
                    match(input,EQUIV,FOLLOW_EQUIV_in_expr961); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr965);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr969);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Equal(errtree, e1, e2);

                    }
                    break;
                case 11 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:176:5: ^( NOTEQ e1= expr e2= expr )
                    {
                    match(input,NOTEQ,FOLLOW_NOTEQ_in_expr979); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr983);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr987);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new NotEqual(errtree, e1, e2);

                    }
                    break;
                case 12 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:177:5: ^( GTHAN e1= expr e2= expr )
                    {
                    match(input,GTHAN,FOLLOW_GTHAN_in_expr997); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr1001);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr1005);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Gthan(errtree, e1, e2);

                    }
                    break;
                case 13 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:178:5: ^( LTHAN e1= expr e2= expr )
                    {
                    match(input,LTHAN,FOLLOW_LTHAN_in_expr1015); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr1019);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr1023);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Lthan(errtree, e1, e2);

                    }
                    break;
                case 14 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:179:5: ^( GTHANE e1= expr e2= expr )
                    {
                    match(input,GTHANE,FOLLOW_GTHANE_in_expr1033); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr1037);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr1041);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new GthanE(errtree, e1, e2);

                    }
                    break;
                case 15 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:180:5: ^( LTHANE e1= expr e2= expr )
                    {
                    match(input,LTHANE,FOLLOW_LTHANE_in_expr1051); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr1055);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr1059);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new LthanE(errtree, e1, e2);

                    }
                    break;
                case 16 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:181:5: ^( POS e= expr )
                    {
                    match(input,POS,FOLLOW_POS_in_expr1069); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr1073);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Pos(errtree, e);

                    }
                    break;
                case 17 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:182:5: ^( NEG e= expr )
                    {
                    match(input,NEG,FOLLOW_NEG_in_expr1083); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr1087);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Neg(errtree, e);

                    }
                    break;
                case 18 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:183:5: ^( NOT e= expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr1097); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr1101);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Not(errtree, e);

                    }
                    break;
                case 19 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:184:5: ^( KVPAIR e1= expr e2= expr )
                    {
                    match(input,KVPAIR,FOLLOW_KVPAIR_in_expr1111); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr1115);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr1119);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new KVPair(errtree, e1, e2);

                    }
                    break;
                case 20 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:185:5: ^( GET e= expr )
                    {
                    match(input,GET,FOLLOW_GET_in_expr1129); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr1133);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Get(errtree, e);

                    }
                    break;
                case 21 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:186:5: ^( CAST type e= expr )
                    {
                    match(input,CAST,FOLLOW_CAST_in_expr1143); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_expr1145);
                    type33=type();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr1149);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Cast(errtree, type33, e);

                    }
                    break;
                case 22 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:187:5: exprcall
                    {
                    pushFollow(FOLLOW_exprcall_in_expr1158);
                    exprcall34=exprcall();

                    state._fsp--;

                    expression = exprcall34;

                    }
                    break;
                case 23 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:188:5: readfunction
                    {
                    pushFollow(FOLLOW_readfunction_in_expr1166);
                    readfunction35=readfunction();

                    state._fsp--;

                    expression = readfunction35;

                    }
                    break;
                case 24 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:189:5: ^( OBJECT_CONSTRUCTOR params )
                    {
                    match(input,OBJECT_CONSTRUCTOR,FOLLOW_OBJECT_CONSTRUCTOR_in_expr1175); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_params_in_expr1177);
                    params36=params();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new ObjectConstructor(params36);

                    }
                    break;
                case 25 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:190:5: ^( OBJ_REF obj= ID ref= ID )
                    {
                    match(input,OBJ_REF,FOLLOW_OBJ_REF_in_expr1187); 

                    match(input, Token.DOWN, null); 
                    obj=(CommonTree)match(input,ID,FOLLOW_ID_in_expr1191); 
                    ref=(CommonTree)match(input,ID,FOLLOW_ID_in_expr1195); 

                    match(input, Token.UP, null); 
                    expression = new ObjectReference(errtree, new Identifier(errtree, (obj!=null?obj.getText():null)), (ref!=null?ref.getText():null));

                    }
                    break;
                case 26 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:191:5: NUMBER
                    {
                    NUMBER37=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_expr1204); 
                    expression = new Atom(new VarValue(Integer.parseInt((NUMBER37!=null?NUMBER37.getText():null))));

                    }
                    break;
                case 27 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:192:5: FPNUMBER
                    {
                    FPNUMBER38=(CommonTree)match(input,FPNUMBER,FOLLOW_FPNUMBER_in_expr1212); 
                    expression = new Atom(new VarValue(Double.parseDouble((FPNUMBER38!=null?FPNUMBER38.getText():null))));

                    }
                    break;
                case 28 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:193:5: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_expr1220); 
                    expression = new Atom(new VarValue(true));

                    }
                    break;
                case 29 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:194:5: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_expr1228); 
                    expression = new Atom(new VarValue(false));

                    }
                    break;
                case 30 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:195:5: STRING
                    {
                    STRING39=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expr1236); 
                    expression = new Atom(new VarValue((STRING39!=null?STRING39.getText():null)));

                    }
                    break;
                case 31 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:196:5: ^( ARRAY (e= expr )* )
                    {
                    match(input,ARRAY,FOLLOW_ARRAY_in_expr1245); 

                    ArrayList<Expression> exprs = new ArrayList<Expression>();

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:197:5: (e= expr )*
                        loop15:
                        do {
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( ((LA15_0>=POS && LA15_0<=CALL)||(LA15_0>=CAST && LA15_0<=OBJ_REF)||(LA15_0>=STRING && LA15_0<=ID)||LA15_0==READ_JSON||(LA15_0>=XOR && LA15_0<=FALSE)) ) {
                                alt15=1;
                            }


                            switch (alt15) {
                        	case 1 :
                        	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:197:6: e= expr
                        	    {
                        	    pushFollow(FOLLOW_expr_in_expr1256);
                        	    e=expr();

                        	    state._fsp--;

                        	    exprs.add(e);

                        	    }
                        	    break;

                        	default :
                        	    break loop15;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }
                    expression = new ArrayConstructor(exprs);

                    }
                    break;
                case 32 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:198:5: ^( INDEX ID e= expr )
                    {
                    match(input,INDEX,FOLLOW_INDEX_in_expr1270); 

                    match(input, Token.DOWN, null); 
                    ID40=(CommonTree)match(input,ID,FOLLOW_ID_in_expr1272); 
                    pushFollow(FOLLOW_expr_in_expr1276);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Index(errtree, new Identifier(errtree, (ID40!=null?ID40.getText():null)), e);

                    }
                    break;
                case 33 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:199:5: ^( MEMBER e= expr ID ( params )? )
                    {
                    match(input,MEMBER,FOLLOW_MEMBER_in_expr1286); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr1290);
                    e=expr();

                    state._fsp--;

                    ID41=(CommonTree)match(input,ID,FOLLOW_ID_in_expr1292); 
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:199:24: ( params )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==PARAMS) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:199:24: params
                            {
                            pushFollow(FOLLOW_params_in_expr1294);
                            params42=params();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    expression = new Member(errtree, (ID41!=null?ID41.getText():null), e, params42);

                    }
                    break;
                case 34 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:200:5: ID
                    {
                    ID43=(CommonTree)match(input,ID,FOLLOW_ID_in_expr1304); 
                    expression = new Identifier(errtree, (ID43!=null?ID43.getText():null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expression;
    }
    // $ANTLR end "expr"


    // $ANTLR start "type"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:203:1: type returns [TypeSymbol type] : ( VAR | KEY | OBJECT | ARRAY | VECTOR | VOID );
    public final TypeSymbol type() throws RecognitionException {
        TypeSymbol type = null;

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:204:3: ( VAR | KEY | OBJECT | ARRAY | VECTOR | VOID )
            int alt18=6;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt18=1;
                }
                break;
            case KEY:
                {
                alt18=2;
                }
                break;
            case OBJECT:
                {
                alt18=3;
                }
                break;
            case ARRAY:
                {
                alt18=4;
                }
                break;
            case VECTOR:
                {
                alt18=5;
                }
                break;
            case VOID:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:204:5: VAR
                    {
                    match(input,VAR,FOLLOW_VAR_in_type1323); 
                    type = symtab.resolveType("var");

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:205:5: KEY
                    {
                    match(input,KEY,FOLLOW_KEY_in_type1331); 
                    type = symtab.resolveType("key");

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:206:5: OBJECT
                    {
                    match(input,OBJECT,FOLLOW_OBJECT_in_type1339); 
                    type = symtab.resolveType("object");

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:207:5: ARRAY
                    {
                    match(input,ARRAY,FOLLOW_ARRAY_in_type1347); 
                    type = symtab.resolveType("array");

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:208:5: VECTOR
                    {
                    match(input,VECTOR,FOLLOW_VECTOR_in_type1355); 
                    type = symtab.resolveType("vector");

                    }
                    break;
                case 6 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\BuildITree.g:209:5: VOID
                    {
                    match(input,VOID,FOLLOW_VOID_in_type1363); 
                    type = symtab.resolveType("void");

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "type"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAM_in_program86 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_globals_in_program90 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_declaration_in_globals123 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_function_in_globals132 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DECL_in_declaration162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_declaration164 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_declaration166 = new BitSet(new long[]{0x0000000000800008L});
    public static final BitSet FOLLOW_EQUAL_in_declaration169 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_declaration171 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_in_statement195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_statement203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printstatement_in_statement211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnstatement_in_statement219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statcall_in_statement227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_JSON_in_readfunction286 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_readfunction288 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_whilestatement316 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_whilestatement318 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_whilestatement320 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_ifstatement348 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_ifstatement350 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_ifstatement354 = new BitSet(new long[]{0x0000000100000008L});
    public static final BitSet FOLLOW_ELSE_in_ifstatement357 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_ifstatement361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_returnstatement386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_returnstatement388 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_in_printstatement417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_printstatement419 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINTLN_in_printstatement429 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_printstatement431 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINTJSON_in_printstatement441 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_printstatement443 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_block476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_block481 = new BitSet(new long[]{0x0000041EC68C08A8L});
    public static final BitSet FOLLOW_EQUAL_in_assignment511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment513 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_assignment515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OBJ_ASSIG_in_assignment525 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment529 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_assignment533 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_assignment535 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_ASSIG_in_assignment545 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment547 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_assignment551 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_assignment555 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_assignment565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment567 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_assignment569 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_function597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_function600 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_function602 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_params_in_function605 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_function608 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMS_in_params638 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_params643 = new BitSet(new long[]{0x0000000000400008L});
    public static final BitSet FOLLOW_ID_in_parameter665 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_parameter667 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_statcall695 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_statcall697 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_args_in_statcall701 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_exprcall729 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_exprcall731 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_args_in_exprcall735 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGS_in_args766 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_args771 = new BitSet(new long[]{0xFFFFF0000863EE08L,0x0000000000000007L});
    public static final BitSet FOLLOW_PLUS_in_expr799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr803 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr807 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr817 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr821 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr825 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCAT_in_expr835 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr839 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr843 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULT_in_expr853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr857 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr861 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr871 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr875 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr879 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POW_in_expr889 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr893 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr907 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr911 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr915 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr925 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr929 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr933 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expr943 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr947 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr951 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIV_in_expr961 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr965 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr969 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOTEQ_in_expr979 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr983 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr987 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTHAN_in_expr997 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1001 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr1005 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTHAN_in_expr1015 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1019 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr1023 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTHANE_in_expr1033 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1037 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr1041 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTHANE_in_expr1051 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1055 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr1059 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POS_in_expr1069 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1073 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEG_in_expr1083 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1087 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr1097 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1101 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KVPAIR_in_expr1111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1115 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr1119 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GET_in_expr1129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expr1143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_expr1145 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr1149 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_exprcall_in_expr1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_readfunction_in_expr1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_CONSTRUCTOR_in_expr1175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_params_in_expr1177 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OBJ_REF_in_expr1187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr1191 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_expr1195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_in_expr1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPNUMBER_in_expr1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expr1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_expr1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_expr1245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1256 = new BitSet(new long[]{0xFFFFF0000863EE08L,0x0000000000000007L});
    public static final BitSet FOLLOW_INDEX_in_expr1270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr1272 = new BitSet(new long[]{0xFFFFF0000863EE00L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr1276 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEMBER_in_expr1286 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1290 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_expr1292 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_params_in_expr1294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_expr1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_type1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_type1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_in_type1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_type1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VECTOR_in_type1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type1363 = new BitSet(new long[]{0x0000000000000002L});

}
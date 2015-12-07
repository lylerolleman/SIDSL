// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g 2015-12-07 10:33:56

package PISDLParser;

import Global.Root;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PILexer extends Lexer {
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

    public PILexer() {;} 
    public PILexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PILexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g"; }

    // $ANTLR start "MULTILINE_COMMENT"
    public final void mMULTILINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTILINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:201:19: ( '/*' ( . )* '*/' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:201:21: '/*' ( . )* '*/'
            {
            match("/*"); 

            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:201:26: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:201:26: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTILINE_COMMENT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:202:9: ( '//' ( . )* ( '\\n' | '\\r' ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:202:11: '//' ( . )* ( '\\n' | '\\r' )
            {
            match("//"); 

            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:202:16: ( . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\n'||LA2_0=='\r') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:202:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:203:7: ( '{' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:203:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:204:7: ( '}' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:204:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "LP"
    public final void mLP() throws RecognitionException {
        try {
            int _type = LP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:205:3: ( '(' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:205:5: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LP"

    // $ANTLR start "RP"
    public final void mRP() throws RecognitionException {
        try {
            int _type = RP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:206:3: ( ')' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:206:5: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RP"

    // $ANTLR start "LB"
    public final void mLB() throws RecognitionException {
        try {
            int _type = LB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:207:3: ( '[' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:207:5: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LB"

    // $ANTLR start "RB"
    public final void mRB() throws RecognitionException {
        try {
            int _type = RB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:208:3: ( ']' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:208:5: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RB"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:209:4: ( '.' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:209:6: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:210:6: ( ',' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:210:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:211:6: ( '\"' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:211:8: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "SC"
    public final void mSC() throws RecognitionException {
        try {
            int _type = SC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:212:3: ( ';' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:212:5: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SC"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:213:5: ( 'true' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:213:7: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:214:6: ( 'false' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:214:8: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:215:5: ( 'null' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:215:7: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "US"
    public final void mUS() throws RecognitionException {
        try {
            int _type = US;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:216:3: ( '_' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:216:5: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "US"

    // $ANTLR start "BSLASH"
    public final void mBSLASH() throws RecognitionException {
        try {
            int _type = BSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:217:7: ( '\\\\' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:217:9: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BSLASH"

    // $ANTLR start "PRINTJSON"
    public final void mPRINTJSON() throws RecognitionException {
        try {
            int _type = PRINTJSON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:218:10: ( 'printjson' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:218:12: 'printjson'
            {
            match("printjson"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINTJSON"

    // $ANTLR start "PRINTLN"
    public final void mPRINTLN() throws RecognitionException {
        try {
            int _type = PRINTLN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:219:8: ( 'println' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:219:10: 'println'
            {
            match("println"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINTLN"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:220:6: ( 'print' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:220:8: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:221:7: ( 'return' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:221:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:222:3: ( 'if' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:222:5: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:223:5: ( 'else' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:223:7: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:224:6: ( 'while' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:224:8: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:225:6: ( 'break' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:225:8: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:226:9: ( 'continue' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:226:11: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:227:3: ( 'as' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:227:5: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:228:8: ( 'include' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:228:10: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "READ_JSON"
    public final void mREAD_JSON() throws RecognitionException {
        try {
            int _type = READ_JSON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:229:10: ( 'read_json' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:229:12: 'read_json'
            {
            match("read_json"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "READ_JSON"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:231:4: ( 'var' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:231:6: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "KEY"
    public final void mKEY() throws RecognitionException {
        try {
            int _type = KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:232:4: ( 'key' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:232:6: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY"

    // $ANTLR start "OBJECT"
    public final void mOBJECT() throws RecognitionException {
        try {
            int _type = OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:233:7: ( 'object' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:233:9: 'object'
            {
            match("object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBJECT"

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:234:6: ( 'array' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:234:8: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAY"

    // $ANTLR start "VECTOR"
    public final void mVECTOR() throws RecognitionException {
        try {
            int _type = VECTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:235:7: ( 'vector' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:235:9: 'vector'
            {
            match("vector"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VECTOR"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:236:5: ( 'void' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:236:7: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:238:4: ( ':=' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:238:6: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "GET"
    public final void mGET() throws RecognitionException {
        try {
            int _type = GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:239:4: ( '%' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:239:6: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GET"

    // $ANTLR start "CONCAT"
    public final void mCONCAT() throws RecognitionException {
        try {
            int _type = CONCAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:240:7: ( '<-' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:240:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONCAT"

    // $ANTLR start "MEMBER"
    public final void mMEMBER() throws RecognitionException {
        try {
            int _type = MEMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:241:7: ( '->' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:241:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MEMBER"

    // $ANTLR start "EQUIV"
    public final void mEQUIV() throws RecognitionException {
        try {
            int _type = EQUIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:242:6: ( '==' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:242:8: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUIV"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:243:6: ( '=' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:243:8: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "LTHAN"
    public final void mLTHAN() throws RecognitionException {
        try {
            int _type = LTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:244:6: ( '<' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:244:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTHAN"

    // $ANTLR start "GTHAN"
    public final void mGTHAN() throws RecognitionException {
        try {
            int _type = GTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:245:6: ( '>' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:245:8: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTHAN"

    // $ANTLR start "LTHANE"
    public final void mLTHANE() throws RecognitionException {
        try {
            int _type = LTHANE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:246:7: ( '<=' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:246:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTHANE"

    // $ANTLR start "GTHANE"
    public final void mGTHANE() throws RecognitionException {
        try {
            int _type = GTHANE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:247:7: ( '>=' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:247:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTHANE"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:248:4: ( '!' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:248:6: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NOTEQ"
    public final void mNOTEQ() throws RecognitionException {
        try {
            int _type = NOTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:249:6: ( '!=' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:249:8: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQ"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:250:5: ( '+' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:250:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:251:6: ( '-' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:251:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:252:5: ( '*' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:252:7: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:253:4: ( '/' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:253:6: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "PRED"
    public final void mPRED() throws RecognitionException {
        try {
            int _type = PRED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:254:5: ( '|' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:254:7: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRED"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:255:3: ( 'or' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:255:5: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:256:4: ( 'xor' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:256:6: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:257:4: ( 'and' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:257:6: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "POW"
    public final void mPOW() throws RecognitionException {
        try {
            int _type = POW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:258:4: ( '^' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:258:6: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POW"

    // $ANTLR start "KVPAIR"
    public final void mKVPAIR() throws RecognitionException {
        try {
            int _type = KVPAIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:259:7: ( ':' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:259:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KVPAIR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:262:3: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:262:5: ( ' ' | '\\t' | '\\n' | '\\r' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:268:15: ( '0' .. '9' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:268:17: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:270:3: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | DIGIT )* )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:270:5: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:270:33: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | DIGIT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:272:7: ( ( DIGIT )+ )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:272:9: ( DIGIT )+
            {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:272:9: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:272:9: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "FPNUMBER"
    public final void mFPNUMBER() throws RecognitionException {
        try {
            int _type = FPNUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:273:9: ( ( DIGIT )+ DOT ( DIGIT )+ )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:273:11: ( DIGIT )+ DOT ( DIGIT )+
            {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:273:11: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:273:11: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            mDOT(); 
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:273:22: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:273:22: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FPNUMBER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:274:7: ( QUOTE ( . )* QUOTE )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:274:9: QUOTE ( . )* QUOTE
            {
            mQUOTE(); 
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:274:15: ( . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\"') ) {
                    alt7=2;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:274:15: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            mQUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:8: ( MULTILINE_COMMENT | COMMENT | LBRACE | RBRACE | LP | RP | LB | RB | DOT | COMMA | QUOTE | SC | TRUE | FALSE | NULL | US | BSLASH | PRINTJSON | PRINTLN | PRINT | RETURN | IF | ELSE | WHILE | BREAK | CONTINUE | AS | INCLUDE | READ_JSON | VAR | KEY | OBJECT | ARRAY | VECTOR | VOID | SET | GET | CONCAT | MEMBER | EQUIV | EQUAL | LTHAN | GTHAN | LTHANE | GTHANE | NOT | NOTEQ | PLUS | MINUS | MULT | DIV | PRED | OR | XOR | AND | POW | KVPAIR | WS | ID | NUMBER | FPNUMBER | STRING )
        int alt8=62;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:10: MULTILINE_COMMENT
                {
                mMULTILINE_COMMENT(); 

                }
                break;
            case 2 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:28: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 3 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:36: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 4 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:43: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 5 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:50: LP
                {
                mLP(); 

                }
                break;
            case 6 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:53: RP
                {
                mRP(); 

                }
                break;
            case 7 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:56: LB
                {
                mLB(); 

                }
                break;
            case 8 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:59: RB
                {
                mRB(); 

                }
                break;
            case 9 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:62: DOT
                {
                mDOT(); 

                }
                break;
            case 10 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:66: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 11 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:72: QUOTE
                {
                mQUOTE(); 

                }
                break;
            case 12 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:78: SC
                {
                mSC(); 

                }
                break;
            case 13 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:81: TRUE
                {
                mTRUE(); 

                }
                break;
            case 14 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:86: FALSE
                {
                mFALSE(); 

                }
                break;
            case 15 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:92: NULL
                {
                mNULL(); 

                }
                break;
            case 16 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:97: US
                {
                mUS(); 

                }
                break;
            case 17 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:100: BSLASH
                {
                mBSLASH(); 

                }
                break;
            case 18 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:107: PRINTJSON
                {
                mPRINTJSON(); 

                }
                break;
            case 19 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:117: PRINTLN
                {
                mPRINTLN(); 

                }
                break;
            case 20 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:125: PRINT
                {
                mPRINT(); 

                }
                break;
            case 21 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:131: RETURN
                {
                mRETURN(); 

                }
                break;
            case 22 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:138: IF
                {
                mIF(); 

                }
                break;
            case 23 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:141: ELSE
                {
                mELSE(); 

                }
                break;
            case 24 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:146: WHILE
                {
                mWHILE(); 

                }
                break;
            case 25 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:152: BREAK
                {
                mBREAK(); 

                }
                break;
            case 26 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:158: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 27 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:167: AS
                {
                mAS(); 

                }
                break;
            case 28 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:170: INCLUDE
                {
                mINCLUDE(); 

                }
                break;
            case 29 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:178: READ_JSON
                {
                mREAD_JSON(); 

                }
                break;
            case 30 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:188: VAR
                {
                mVAR(); 

                }
                break;
            case 31 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:192: KEY
                {
                mKEY(); 

                }
                break;
            case 32 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:196: OBJECT
                {
                mOBJECT(); 

                }
                break;
            case 33 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:203: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 34 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:209: VECTOR
                {
                mVECTOR(); 

                }
                break;
            case 35 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:216: VOID
                {
                mVOID(); 

                }
                break;
            case 36 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:221: SET
                {
                mSET(); 

                }
                break;
            case 37 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:225: GET
                {
                mGET(); 

                }
                break;
            case 38 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:229: CONCAT
                {
                mCONCAT(); 

                }
                break;
            case 39 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:236: MEMBER
                {
                mMEMBER(); 

                }
                break;
            case 40 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:243: EQUIV
                {
                mEQUIV(); 

                }
                break;
            case 41 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:249: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 42 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:255: LTHAN
                {
                mLTHAN(); 

                }
                break;
            case 43 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:261: GTHAN
                {
                mGTHAN(); 

                }
                break;
            case 44 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:267: LTHANE
                {
                mLTHANE(); 

                }
                break;
            case 45 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:274: GTHANE
                {
                mGTHANE(); 

                }
                break;
            case 46 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:281: NOT
                {
                mNOT(); 

                }
                break;
            case 47 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:285: NOTEQ
                {
                mNOTEQ(); 

                }
                break;
            case 48 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:291: PLUS
                {
                mPLUS(); 

                }
                break;
            case 49 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:296: MINUS
                {
                mMINUS(); 

                }
                break;
            case 50 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:302: MULT
                {
                mMULT(); 

                }
                break;
            case 51 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:307: DIV
                {
                mDIV(); 

                }
                break;
            case 52 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:311: PRED
                {
                mPRED(); 

                }
                break;
            case 53 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:316: OR
                {
                mOR(); 

                }
                break;
            case 54 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:319: XOR
                {
                mXOR(); 

                }
                break;
            case 55 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:323: AND
                {
                mAND(); 

                }
                break;
            case 56 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:327: POW
                {
                mPOW(); 

                }
                break;
            case 57 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:331: KVPAIR
                {
                mKVPAIR(); 

                }
                break;
            case 58 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:338: WS
                {
                mWS(); 

                }
                break;
            case 59 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:341: ID
                {
                mID(); 

                }
                break;
            case 60 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:344: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 61 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:351: FPNUMBER
                {
                mFPNUMBER(); 

                }
                break;
            case 62 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\PISDLParser\\PI.g:1:360: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\1\55\10\uffff\1\56\1\uffff\3\51\1\63\1\uffff\13\51\1\106"+
        "\1\uffff\1\111\1\113\1\115\1\117\1\121\3\uffff\1\51\3\uffff\1\123"+
        "\5\uffff\3\51\1\uffff\2\51\1\133\5\51\1\141\7\51\1\151\15\uffff"+
        "\1\51\2\uffff\6\51\1\uffff\5\51\1\uffff\1\51\1\167\1\170\2\51\1"+
        "\173\1\51\1\uffff\1\175\1\176\1\51\1\u0080\4\51\1\u0085\4\51\2\uffff"+
        "\1\51\1\u008b\1\uffff\1\51\2\uffff\1\u008d\1\uffff\1\u0090\3\51"+
        "\1\uffff\1\u0094\1\u0095\1\51\1\u0097\1\51\1\uffff\1\51\1\uffff"+
        "\2\51\1\uffff\1\u009c\2\51\2\uffff\1\51\1\uffff\1\u00a0\1\u00a1"+
        "\1\51\1\u00a3\1\uffff\1\51\1\u00a5\1\51\2\uffff\1\51\1\uffff\1\51"+
        "\1\uffff\1\u00a9\1\u00aa\1\u00ab\3\uffff";
    static final String DFA8_eofS =
        "\u00ac\uffff";
    static final String DFA8_minS =
        "\1\11\1\52\10\uffff\1\0\1\uffff\1\162\1\141\1\165\1\60\1\uffff"+
        "\1\162\1\145\1\146\1\154\1\150\1\162\1\157\1\156\1\141\1\145\1\142"+
        "\1\75\1\uffff\1\55\1\76\3\75\3\uffff\1\157\3\uffff\1\56\5\uffff"+
        "\1\165\2\154\1\uffff\1\151\1\141\1\60\1\143\1\163\1\151\1\145\1"+
        "\156\1\60\1\162\1\144\1\162\1\143\1\151\1\171\1\152\1\60\15\uffff"+
        "\1\162\2\uffff\1\145\1\163\1\154\1\156\1\165\1\144\1\uffff\1\154"+
        "\1\145\1\154\1\141\1\164\1\uffff\1\141\2\60\1\164\1\144\1\60\1\145"+
        "\1\uffff\2\60\1\145\1\60\1\164\1\162\1\137\1\165\1\60\1\145\1\153"+
        "\1\151\1\171\2\uffff\1\157\1\60\1\uffff\1\143\2\uffff\1\60\1\uffff"+
        "\1\60\1\156\1\152\1\144\1\uffff\2\60\1\156\1\60\1\162\1\uffff\1"+
        "\164\1\uffff\1\163\1\156\1\uffff\1\60\1\163\1\145\2\uffff\1\165"+
        "\1\uffff\2\60\1\157\1\60\1\uffff\1\157\1\60\1\145\2\uffff\1\156"+
        "\1\uffff\1\156\1\uffff\3\60\3\uffff";
    static final String DFA8_maxS =
        "\1\175\1\57\10\uffff\1\uffff\1\uffff\1\162\1\141\1\165\1\172\1"+
        "\uffff\1\162\1\145\1\156\1\154\1\150\1\162\1\157\1\163\1\157\1\145"+
        "\1\162\1\75\1\uffff\1\75\1\76\3\75\3\uffff\1\157\3\uffff\1\71\5"+
        "\uffff\1\165\2\154\1\uffff\1\151\1\164\1\172\1\143\1\163\1\151\1"+
        "\145\1\156\1\172\1\162\1\144\1\162\1\143\1\151\1\171\1\152\1\172"+
        "\15\uffff\1\162\2\uffff\1\145\1\163\1\154\1\156\1\165\1\144\1\uffff"+
        "\1\154\1\145\1\154\1\141\1\164\1\uffff\1\141\2\172\1\164\1\144\1"+
        "\172\1\145\1\uffff\2\172\1\145\1\172\1\164\1\162\1\137\1\165\1\172"+
        "\1\145\1\153\1\151\1\171\2\uffff\1\157\1\172\1\uffff\1\143\2\uffff"+
        "\1\172\1\uffff\1\172\1\156\1\152\1\144\1\uffff\2\172\1\156\1\172"+
        "\1\162\1\uffff\1\164\1\uffff\1\163\1\156\1\uffff\1\172\1\163\1\145"+
        "\2\uffff\1\165\1\uffff\2\172\1\157\1\172\1\uffff\1\157\1\172\1\145"+
        "\2\uffff\1\156\1\uffff\1\156\1\uffff\3\172\3\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\14\4\uffff"+
        "\1\21\14\uffff\1\45\5\uffff\1\60\1\62\1\64\1\uffff\1\70\1\72\1\73"+
        "\1\uffff\1\1\1\2\1\63\1\13\1\76\3\uffff\1\20\21\uffff\1\44\1\71"+
        "\1\46\1\54\1\52\1\47\1\61\1\50\1\51\1\55\1\53\1\57\1\56\1\uffff"+
        "\1\74\1\75\6\uffff\1\26\5\uffff\1\33\7\uffff\1\65\15\uffff\1\67"+
        "\1\36\2\uffff\1\37\1\uffff\1\66\1\15\1\uffff\1\17\4\uffff\1\27\5"+
        "\uffff\1\43\1\uffff\1\16\2\uffff\1\24\3\uffff\1\30\1\31\1\uffff"+
        "\1\41\4\uffff\1\25\3\uffff\1\42\1\40\1\uffff\1\23\1\uffff\1\34\3"+
        "\uffff\1\32\1\22\1\35";
    static final String DFA8_specialS =
        "\12\uffff\1\0\u00a1\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\50\2\uffff\1\50\22\uffff\1\50\1\42\1\12\2\uffff\1\35\2\uffff"+
            "\1\4\1\5\1\44\1\43\1\11\1\37\1\10\1\1\12\52\1\34\1\13\1\36\1"+
            "\40\1\41\2\uffff\32\51\1\6\1\20\1\7\1\47\1\17\1\uffff\1\30\1"+
            "\26\1\27\1\51\1\24\1\15\2\51\1\23\1\51\1\32\2\51\1\16\1\33\1"+
            "\21\1\51\1\22\1\51\1\14\1\51\1\31\1\25\1\46\2\51\1\2\1\45\1"+
            "\3",
            "\1\53\4\uffff\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\57",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\64",
            "\1\65",
            "\1\66\7\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\76\3\uffff\1\75\1\74",
            "\1\77\3\uffff\1\100\11\uffff\1\101",
            "\1\102",
            "\1\103\17\uffff\1\104",
            "\1\105",
            "",
            "\1\107\17\uffff\1\110",
            "\1\112",
            "\1\114",
            "\1\116",
            "\1\120",
            "",
            "",
            "",
            "\1\122",
            "",
            "",
            "",
            "\1\124\1\uffff\12\52",
            "",
            "",
            "",
            "",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\1\130",
            "\1\132\22\uffff\1\131",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\152",
            "",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "\1\166",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\171",
            "\1\172",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\174",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\177",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "",
            "\1\u008a",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u008c",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\11\51\1\u008e\1"+
            "\51\1\u008f\16\51",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0096",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0098",
            "",
            "\1\u0099",
            "",
            "\1\u009a",
            "\1\u009b",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u009d",
            "\1\u009e",
            "",
            "",
            "\1\u009f",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a2",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00a4",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a6",
            "",
            "",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( MULTILINE_COMMENT | COMMENT | LBRACE | RBRACE | LP | RP | LB | RB | DOT | COMMA | QUOTE | SC | TRUE | FALSE | NULL | US | BSLASH | PRINTJSON | PRINTLN | PRINT | RETURN | IF | ELSE | WHILE | BREAK | CONTINUE | AS | INCLUDE | READ_JSON | VAR | KEY | OBJECT | ARRAY | VECTOR | VOID | SET | GET | CONCAT | MEMBER | EQUIV | EQUAL | LTHAN | GTHAN | LTHANE | GTHANE | NOT | NOTEQ | PLUS | MINUS | MULT | DIV | PRED | OR | XOR | AND | POW | KVPAIR | WS | ID | NUMBER | FPNUMBER | STRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_10 = input.LA(1);

                        s = -1;
                        if ( ((LA8_10>='\u0000' && LA8_10<='\uFFFF')) ) {s = 47;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
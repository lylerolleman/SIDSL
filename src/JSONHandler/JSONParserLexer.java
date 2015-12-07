// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g 2015-12-07 10:34:04

package JSONHandler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSONParserLexer extends Lexer {
    public static final int EOF=-1;
    public static final int JSONFILE=4;
    public static final int OBJECT=5;
    public static final int ARRAY=6;
    public static final int STRING=7;
    public static final int COLON=8;
    public static final int LBRACE=9;
    public static final int COMMA=10;
    public static final int RBRACE=11;
    public static final int LB=12;
    public static final int RB=13;
    public static final int NUMBER=14;
    public static final int FPNUMBER=15;
    public static final int TRUE=16;
    public static final int FALSE=17;
    public static final int NULL=18;
    public static final int LP=19;
    public static final int RP=20;
    public static final int DOT=21;
    public static final int QUOTE=22;
    public static final int US=23;
    public static final int BSLASH=24;
    public static final int SLASH=25;
    public static final int WS=26;
    public static final int LETTER=27;
    public static final int DIGIT=28;

    // delegates
    // delegators

    public JSONParserLexer() {;} 
    public JSONParserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JSONParserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g"; }

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:50:7: ( '{' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:50:9: '{'
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
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:51:7: ( '}' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:51:9: '}'
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
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:52:3: ( '(' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:52:5: '('
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
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:53:3: ( ')' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:53:5: ')'
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
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:54:3: ( '[' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:54:5: '['
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
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:55:3: ( ']' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:55:5: ']'
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
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:56:4: ( '.' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:56:6: '.'
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
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:57:6: ( ',' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:57:8: ','
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
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:58:6: ( '\"' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:58:8: '\"'
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

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:59:6: ( ':' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:59:8: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:60:5: ( 'true' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:60:7: 'true'
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
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:61:6: ( 'false' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:61:8: 'false'
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
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:62:5: ( 'null' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:62:7: 'null'
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
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:63:3: ( '_' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:63:5: '_'
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
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:64:7: ( '\\\\' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:64:9: '\\\\'
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

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:65:6: ( '/' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:65:8: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:67:3: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:67:5: ( ' ' | '\\t' | '\\n' | '\\r' )
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

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:73:7: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:74:15: ( '0' .. '9' )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:74:17: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:75:7: ( ( '-' | '+' )? ( DIGIT )+ )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:75:9: ( '-' | '+' )? ( DIGIT )+
            {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:75:9: ( '-' | '+' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:75:20: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:75:20: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:76:9: ( ( '-' | '+' )? ( DIGIT )+ DOT ( DIGIT )+ )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:76:11: ( '-' | '+' )? ( DIGIT )+ DOT ( DIGIT )+
            {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:76:11: ( '-' | '+' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:76:22: ( DIGIT )+
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
            	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:76:22: DIGIT
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

            mDOT(); 
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:76:33: ( DIGIT )+
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
            	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:76:33: DIGIT
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
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:77:7: ( QUOTE ( . )* QUOTE )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:77:9: QUOTE ( . )* QUOTE
            {
            mQUOTE(); 
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:77:15: ( . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\"') ) {
                    alt6=2;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:77:15: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
        // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:8: ( LBRACE | RBRACE | LP | RP | LB | RB | DOT | COMMA | QUOTE | COLON | TRUE | FALSE | NULL | US | BSLASH | SLASH | WS | LETTER | NUMBER | FPNUMBER | STRING )
        int alt7=21;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:10: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 2 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:17: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 3 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:24: LP
                {
                mLP(); 

                }
                break;
            case 4 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:27: RP
                {
                mRP(); 

                }
                break;
            case 5 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:30: LB
                {
                mLB(); 

                }
                break;
            case 6 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:33: RB
                {
                mRB(); 

                }
                break;
            case 7 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:36: DOT
                {
                mDOT(); 

                }
                break;
            case 8 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:40: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 9 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:46: QUOTE
                {
                mQUOTE(); 

                }
                break;
            case 10 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:52: COLON
                {
                mCOLON(); 

                }
                break;
            case 11 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:58: TRUE
                {
                mTRUE(); 

                }
                break;
            case 12 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:63: FALSE
                {
                mFALSE(); 

                }
                break;
            case 13 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:69: NULL
                {
                mNULL(); 

                }
                break;
            case 14 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:74: US
                {
                mUS(); 

                }
                break;
            case 15 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:77: BSLASH
                {
                mBSLASH(); 

                }
                break;
            case 16 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:84: SLASH
                {
                mSLASH(); 

                }
                break;
            case 17 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:90: WS
                {
                mWS(); 

                }
                break;
            case 18 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:93: LETTER
                {
                mLETTER(); 

                }
                break;
            case 19 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:100: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 20 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:107: FPNUMBER
                {
                mFPNUMBER(); 

                }
                break;
            case 21 :
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:1:116: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\11\uffff\1\25\1\uffff\3\22\6\uffff\1\32\7\uffff";
    static final String DFA7_eofS =
        "\34\uffff";
    static final String DFA7_minS =
        "\1\11\10\uffff\1\0\1\uffff\1\162\1\141\1\165\5\uffff\1\60\1\56"+
        "\7\uffff";
    static final String DFA7_maxS =
        "\1\175\10\uffff\1\uffff\1\uffff\1\162\1\141\1\165\5\uffff\2\71"+
        "\7\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\3\uffff"+
        "\1\16\1\17\1\20\1\21\1\22\2\uffff\1\11\1\25\1\13\1\14\1\15\1\23"+
        "\1\24";
    static final String DFA7_specialS =
        "\11\uffff\1\0\22\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\21\2\uffff\1\21\22\uffff\1\21\1\uffff\1\11\5\uffff\1\3\1"+
            "\4\1\uffff\1\23\1\10\1\23\1\7\1\20\12\24\1\12\6\uffff\32\22"+
            "\1\5\1\17\1\6\1\uffff\1\16\1\uffff\5\22\1\14\7\22\1\15\5\22"+
            "\1\13\6\22\1\1\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\26",
            "",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "",
            "",
            "",
            "",
            "\12\24",
            "\1\33\1\uffff\12\24",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( LBRACE | RBRACE | LP | RP | LB | RB | DOT | COMMA | QUOTE | COLON | TRUE | FALSE | NULL | US | BSLASH | SLASH | WS | LETTER | NUMBER | FPNUMBER | STRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_9 = input.LA(1);

                        s = -1;
                        if ( ((LA7_9>='\u0000' && LA7_9<='\uFFFF')) ) {s = 22;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
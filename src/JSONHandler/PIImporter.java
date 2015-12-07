// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g 2015-12-07 10:34:00

  package JSONHandler;
  import SymbolTable.*;
  import Global.*;
  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PIImporter extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "JSONFILE", "OBJECT", "ARRAY", "STRING", "COLON", "LBRACE", "COMMA", "RBRACE", "LB", "RB", "NUMBER", "FPNUMBER", "TRUE", "FALSE", "NULL", "LP", "RP", "DOT", "QUOTE", "US", "BSLASH", "SLASH", "WS", "LETTER", "DIGIT"
    };
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


        public PIImporter(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public PIImporter(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PIImporter.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g"; }



    // $ANTLR start "jsonfile"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:16:1: jsonfile returns [ArrayValue jsonarray] : ( ^( JSONFILE ( kvpair )+ ) | ^( JSONFILE ( object )+ ) );
    public final ArrayValue jsonfile() throws RecognitionException {
        ArrayValue jsonarray = null;

        KeyValue kvpair1 = null;

        ObjectValue object2 = null;


        ArrayValue av = new ArrayValue();
        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:19:3: ( ^( JSONFILE ( kvpair )+ ) | ^( JSONFILE ( object )+ ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==JSONFILE) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==COLON) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==OBJECT) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:19:5: ^( JSONFILE ( kvpair )+ )
                    {
                    match(input,JSONFILE,FOLLOW_JSONFILE_in_jsonfile67); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:19:16: ( kvpair )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==COLON) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:19:17: kvpair
                    	    {
                    	    pushFollow(FOLLOW_kvpair_in_jsonfile70);
                    	    kvpair1=kvpair();

                    	    state._fsp--;

                    	    av.add(kvpair1);

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:20:5: ^( JSONFILE ( object )+ )
                    {
                    match(input,JSONFILE,FOLLOW_JSONFILE_in_jsonfile82); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:20:16: ( object )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==OBJECT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:20:17: object
                    	    {
                    	    pushFollow(FOLLOW_object_in_jsonfile85);
                    	    object2=object();

                    	    state._fsp--;

                    	    av.add(object2);

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


                    match(input, Token.UP, null); 

                    }
                    break;

            }
            jsonarray = av;
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return jsonarray;
    }
    // $ANTLR end "jsonfile"


    // $ANTLR start "kvpair"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:22:1: kvpair returns [KeyValue value] : ^( COLON STRING v= value ) ;
    public final KeyValue kvpair() throws RecognitionException {
        KeyValue value = null;

        CommonTree STRING3=null;
        Value v = null;


        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:23:3: ( ^( COLON STRING v= value ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:23:5: ^( COLON STRING v= value )
            {
            match(input,COLON,FOLLOW_COLON_in_kvpair107); 

            match(input, Token.DOWN, null); 
            STRING3=(CommonTree)match(input,STRING,FOLLOW_STRING_in_kvpair109); 
            pushFollow(FOLLOW_value_in_kvpair113);
            v=value();

            state._fsp--;

            value = new KeyValue((STRING3!=null?STRING3.getText():null), v.getType(), v);

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "kvpair"


    // $ANTLR start "value"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:25:1: value returns [Value value] : ( literal | array | object );
    public final Value value() throws RecognitionException {
        Value value = null;

        VarValue literal4 = null;

        ArrayValue array5 = null;

        ObjectValue object6 = null;


        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:26:3: ( literal | array | object )
            int alt4=3;
            switch ( input.LA(1) ) {
            case STRING:
            case NUMBER:
            case FPNUMBER:
            case TRUE:
            case FALSE:
            case NULL:
                {
                alt4=1;
                }
                break;
            case ARRAY:
                {
                alt4=2;
                }
                break;
            case OBJECT:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:26:5: literal
                    {
                    pushFollow(FOLLOW_literal_in_value132);
                    literal4=literal();

                    state._fsp--;

                    value = literal4;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:27:5: array
                    {
                    pushFollow(FOLLOW_array_in_value140);
                    array5=array();

                    state._fsp--;

                    value = array5;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:28:5: object
                    {
                    pushFollow(FOLLOW_object_in_value148);
                    object6=object();

                    state._fsp--;

                    value = object6;

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
        return value;
    }
    // $ANTLR end "value"


    // $ANTLR start "object"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:30:1: object returns [ObjectValue value] : ^( OBJECT ( kvpair )* ) ;
    public final ObjectValue object() throws RecognitionException {
        ObjectValue value = null;

        KeyValue kvpair7 = null;


        HashMap obj = new HashMap<String, VariableSymbol>();
        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:33:3: ( ^( OBJECT ( kvpair )* ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:33:5: ^( OBJECT ( kvpair )* )
            {
            match(input,OBJECT,FOLLOW_OBJECT_in_object177); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:33:14: ( kvpair )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==COLON) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:33:15: kvpair
                	    {
                	    pushFollow(FOLLOW_kvpair_in_object180);
                	    kvpair7=kvpair();

                	    state._fsp--;

                	    obj.put(kvpair7.getKey(), new VariableSymbol(kvpair7.getKey(),
                	                          kvpair7.getType(), kvpair7));

                	    }
                	    break;

                	default :
                	    break loop5;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

            value = new ObjectValue(obj);
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "object"


    // $ANTLR start "array"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:36:1: array returns [ArrayValue value] : ( ^( ARRAY (l= literal )+ ) | ^( ARRAY ( object )+ ) );
    public final ArrayValue array() throws RecognitionException {
        ArrayValue value = null;

        VarValue l = null;

        ObjectValue object8 = null;


        ArrayValue av = new ArrayValue();
        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:39:3: ( ^( ARRAY (l= literal )+ ) | ^( ARRAY ( object )+ ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ARRAY) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==DOWN) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==STRING||(LA8_2>=NUMBER && LA8_2<=NULL)) ) {
                        alt8=1;
                    }
                    else if ( (LA8_2==OBJECT) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:39:5: ^( ARRAY (l= literal )+ )
                    {
                    match(input,ARRAY,FOLLOW_ARRAY_in_array212); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:39:13: (l= literal )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==STRING||(LA6_0>=NUMBER && LA6_0<=NULL)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:39:14: l= literal
                    	    {
                    	    pushFollow(FOLLOW_literal_in_array217);
                    	    l=literal();

                    	    state._fsp--;

                    	    av.add(l);

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


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:40:5: ^( ARRAY ( object )+ )
                    {
                    match(input,ARRAY,FOLLOW_ARRAY_in_array229); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:40:13: ( object )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==OBJECT) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:40:14: object
                    	    {
                    	    pushFollow(FOLLOW_object_in_array232);
                    	    object8=object();

                    	    state._fsp--;

                    	    av.add(object8);

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;

            }
            value = av;
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "array"


    // $ANTLR start "literal"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:42:1: literal returns [VarValue value] : ( NUMBER | FPNUMBER | STRING | TRUE | FALSE | NULL );
    public final VarValue literal() throws RecognitionException {
        VarValue value = null;

        CommonTree NUMBER9=null;
        CommonTree FPNUMBER10=null;
        CommonTree STRING11=null;
        CommonTree TRUE12=null;
        CommonTree FALSE13=null;

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:43:3: ( NUMBER | FPNUMBER | STRING | TRUE | FALSE | NULL )
            int alt9=6;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt9=1;
                }
                break;
            case FPNUMBER:
                {
                alt9=2;
                }
                break;
            case STRING:
                {
                alt9=3;
                }
                break;
            case TRUE:
                {
                alt9=4;
                }
                break;
            case FALSE:
                {
                alt9=5;
                }
                break;
            case NULL:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:43:5: NUMBER
                    {
                    NUMBER9=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_literal253); 
                    value = new VarValue((NUMBER9!=null?NUMBER9.getText():null));

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:44:5: FPNUMBER
                    {
                    FPNUMBER10=(CommonTree)match(input,FPNUMBER,FOLLOW_FPNUMBER_in_literal261); 
                    value = new VarValue((FPNUMBER10!=null?FPNUMBER10.getText():null));

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:45:5: STRING
                    {
                    STRING11=(CommonTree)match(input,STRING,FOLLOW_STRING_in_literal269); 
                    value = new VarValue((STRING11!=null?STRING11.getText():null), true);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:46:5: TRUE
                    {
                    TRUE12=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_literal277); 
                    value = new VarValue((TRUE12!=null?TRUE12.getText():null));

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:47:5: FALSE
                    {
                    FALSE13=(CommonTree)match(input,FALSE,FOLLOW_FALSE_in_literal285); 
                    value = new VarValue((FALSE13!=null?FALSE13.getText():null));

                    }
                    break;
                case 6 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\PIImporter.g:48:5: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_literal293); 
                    value = new VarValue("null");

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
        return value;
    }
    // $ANTLR end "literal"

    // Delegated rules


 

    public static final BitSet FOLLOW_JSONFILE_in_jsonfile67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_kvpair_in_jsonfile70 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_JSONFILE_in_jsonfile82 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_in_jsonfile85 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_COLON_in_kvpair107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_kvpair109 = new BitSet(new long[]{0x000000000007C0E8L});
    public static final BitSet FOLLOW_value_in_kvpair113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_literal_in_value132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_value140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_value148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_in_object177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_kvpair_in_object180 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_ARRAY_in_array212 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literal_in_array217 = new BitSet(new long[]{0x000000000007C088L});
    public static final BitSet FOLLOW_ARRAY_in_array229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_in_array232 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_NUMBER_in_literal253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPNUMBER_in_literal261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_literal277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_literal285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal293 = new BitSet(new long[]{0x0000000000000002L});

}
// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g 2015-12-07 10:34:03

package JSONHandler;
import JSONTree.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSONTreeConstruct extends TreeParser {
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


        public JSONTreeConstruct(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public JSONTreeConstruct(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return JSONTreeConstruct.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g"; }


    JSONTree tree;
    public JSONTreeConstruct(TreeNodeStream input, JSONTree tree) {
      this(input);
      this.tree = tree;
    }



    // $ANTLR start "jsonfile"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:22:1: jsonfile : ( ^( JSONFILE ( kvpair )+ ) | ^( JSONFILE ( object )+ ) );
    public final void jsonfile() throws RecognitionException {
        KeyNode kvpair1 = null;

        ObjectNode object2 = null;


        ArrayList<JSONNode> children = new ArrayList<JSONNode>();
        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:25:3: ( ^( JSONFILE ( kvpair )+ ) | ^( JSONFILE ( object )+ ) )
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
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:25:5: ^( JSONFILE ( kvpair )+ )
                    {
                    match(input,JSONFILE,FOLLOW_JSONFILE_in_jsonfile69); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:25:16: ( kvpair )+
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
                    	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:25:17: kvpair
                    	    {
                    	    pushFollow(FOLLOW_kvpair_in_jsonfile72);
                    	    kvpair1=kvpair();

                    	    state._fsp--;

                    	    children.add(kvpair1);

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
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:26:5: ^( JSONFILE ( object )+ )
                    {
                    match(input,JSONFILE,FOLLOW_JSONFILE_in_jsonfile84); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:26:16: ( object )+
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
                    	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:26:17: object
                    	    {
                    	    pushFollow(FOLLOW_object_in_jsonfile87);
                    	    object2=object();

                    	    state._fsp--;

                    	    children.add(object2);

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
            tree.setRoot(new JSONNode("root", children));
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "jsonfile"


    // $ANTLR start "kvpair"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:28:1: kvpair returns [KeyNode key] : ^( COLON STRING value ) ;
    public final KeyNode kvpair() throws RecognitionException {
        KeyNode key = null;

        CommonTree STRING3=null;
        JSONNode value4 = null;


        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:29:3: ( ^( COLON STRING value ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:29:5: ^( COLON STRING value )
            {
            match(input,COLON,FOLLOW_COLON_in_kvpair109); 

            match(input, Token.DOWN, null); 
            STRING3=(CommonTree)match(input,STRING,FOLLOW_STRING_in_kvpair111); 
            pushFollow(FOLLOW_value_in_kvpair113);
            value4=value();

            state._fsp--;


            match(input, Token.UP, null); 
            key = new KeyNode((STRING3!=null?STRING3.getText():null), value4);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return key;
    }
    // $ANTLR end "kvpair"


    // $ANTLR start "value"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:31:1: value returns [JSONNode node] : ( literal | array | object );
    public final JSONNode value() throws RecognitionException {
        JSONNode node = null;

        ValueNode literal5 = null;

        ArrayNode array6 = null;

        ObjectNode object7 = null;


        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:32:3: ( literal | array | object )
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
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:32:5: literal
                    {
                    pushFollow(FOLLOW_literal_in_value132);
                    literal5=literal();

                    state._fsp--;

                    node = literal5;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:33:5: array
                    {
                    pushFollow(FOLLOW_array_in_value140);
                    array6=array();

                    state._fsp--;

                    node = array6;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:34:5: object
                    {
                    pushFollow(FOLLOW_object_in_value148);
                    object7=object();

                    state._fsp--;

                    node = object7;

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
        return node;
    }
    // $ANTLR end "value"


    // $ANTLR start "object"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:36:1: object returns [ObjectNode obj] : ^( OBJECT ( kvpair )* ) ;
    public final ObjectNode object() throws RecognitionException {
        ObjectNode obj = null;

        KeyNode kvpair8 = null;


        ArrayList<JSONNode> pairs = new ArrayList<JSONNode>();
        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:38:3: ( ^( OBJECT ( kvpair )* ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:38:5: ^( OBJECT ( kvpair )* )
            {
            match(input,OBJECT,FOLLOW_OBJECT_in_object172); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:38:14: ( kvpair )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==COLON) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:38:15: kvpair
                	    {
                	    pushFollow(FOLLOW_kvpair_in_object175);
                	    kvpair8=kvpair();

                	    state._fsp--;

                	    pairs.add(kvpair8);

                	    }
                	    break;

                	default :
                	    break loop5;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            obj = new ObjectNode("OBJECT", pairs);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return obj;
    }
    // $ANTLR end "object"


    // $ANTLR start "array"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:40:1: array returns [ArrayNode array] : ( ^( ARRAY ( literal )+ ) | ^( ARRAY ( object )+ ) );
    public final ArrayNode array() throws RecognitionException {
        ArrayNode array = null;

        ValueNode literal9 = null;

        ObjectNode object10 = null;


        ArrayList<JSONNode> elements = new ArrayList<JSONNode>();
        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:43:3: ( ^( ARRAY ( literal )+ ) | ^( ARRAY ( object )+ ) )
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
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:43:5: ^( ARRAY ( literal )+ )
                    {
                    match(input,ARRAY,FOLLOW_ARRAY_in_array209); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:43:13: ( literal )+
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
                    	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:43:14: literal
                    	    {
                    	    pushFollow(FOLLOW_literal_in_array212);
                    	    literal9=literal();

                    	    state._fsp--;

                    	    elements.add(literal9);

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
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:44:5: ^( ARRAY ( object )+ )
                    {
                    match(input,ARRAY,FOLLOW_ARRAY_in_array224); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:44:13: ( object )+
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
                    	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:44:14: object
                    	    {
                    	    pushFollow(FOLLOW_object_in_array227);
                    	    object10=object();

                    	    state._fsp--;

                    	    elements.add(object10);

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
            array = new ArrayNode("ARRAY", elements);
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return array;
    }
    // $ANTLR end "array"


    // $ANTLR start "literal"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:46:1: literal returns [ValueNode value] : ( NUMBER | FPNUMBER | STRING | TRUE | FALSE | NULL );
    public final ValueNode literal() throws RecognitionException {
        ValueNode value = null;

        CommonTree NUMBER11=null;
        CommonTree FPNUMBER12=null;
        CommonTree STRING13=null;

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:47:3: ( NUMBER | FPNUMBER | STRING | TRUE | FALSE | NULL )
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
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:47:5: NUMBER
                    {
                    NUMBER11=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_literal248); 
                    value = new ValueNode((NUMBER11!=null?NUMBER11.getText():null), "int");

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:48:5: FPNUMBER
                    {
                    FPNUMBER12=(CommonTree)match(input,FPNUMBER,FOLLOW_FPNUMBER_in_literal256); 
                    value = new ValueNode((FPNUMBER12!=null?FPNUMBER12.getText():null), "double");

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:49:5: STRING
                    {
                    STRING13=(CommonTree)match(input,STRING,FOLLOW_STRING_in_literal264); 
                    value = new ValueNode((STRING13!=null?STRING13.getText():null), "string");

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:50:5: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_literal272); 
                    value = new ValueNode("true", "boolean");

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:51:5: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_literal280); 
                    value = new ValueNode("false", "boolean");

                    }
                    break;
                case 6 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONTreeConstruct.g:52:5: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_literal288); 
                    value = new ValueNode("null", "null");

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


 

    public static final BitSet FOLLOW_JSONFILE_in_jsonfile69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_kvpair_in_jsonfile72 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_JSONFILE_in_jsonfile84 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_in_jsonfile87 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_COLON_in_kvpair109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_kvpair111 = new BitSet(new long[]{0x000000000007C0E8L});
    public static final BitSet FOLLOW_value_in_kvpair113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_literal_in_value132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_value140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_value148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_in_object172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_kvpair_in_object175 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_ARRAY_in_array209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literal_in_array212 = new BitSet(new long[]{0x000000000007C088L});
    public static final BitSet FOLLOW_ARRAY_in_array224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_in_array227 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_NUMBER_in_literal248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPNUMBER_in_literal256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_literal272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_literal280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal288 = new BitSet(new long[]{0x0000000000000002L});

}
// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g 2015-12-07 10:34:04

package JSONHandler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class JSONParserParser extends Parser {
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


        public JSONParserParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public JSONParserParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return JSONParserParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g"; }


    public static class jsonfile_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jsonfile"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:22:1: jsonfile : ( ( kvpair )+ -> ^( JSONFILE ( kvpair )+ ) | ( object )+ -> ^( JSONFILE ( object )+ ) );
    public final JSONParserParser.jsonfile_return jsonfile() throws RecognitionException {
        JSONParserParser.jsonfile_return retval = new JSONParserParser.jsonfile_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JSONParserParser.kvpair_return kvpair1 = null;

        JSONParserParser.object_return object2 = null;


        RewriteRuleSubtreeStream stream_object=new RewriteRuleSubtreeStream(adaptor,"rule object");
        RewriteRuleSubtreeStream stream_kvpair=new RewriteRuleSubtreeStream(adaptor,"rule kvpair");
        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:23:3: ( ( kvpair )+ -> ^( JSONFILE ( kvpair )+ ) | ( object )+ -> ^( JSONFILE ( object )+ ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==LBRACE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:23:5: ( kvpair )+
                    {
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:23:5: ( kvpair )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==STRING) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:23:5: kvpair
                    	    {
                    	    pushFollow(FOLLOW_kvpair_in_jsonfile71);
                    	    kvpair1=kvpair();

                    	    state._fsp--;

                    	    stream_kvpair.add(kvpair1.getTree());

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



                    // AST REWRITE
                    // elements: kvpair
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 23:13: -> ^( JSONFILE ( kvpair )+ )
                    {
                        // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:23:16: ^( JSONFILE ( kvpair )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(JSONFILE, "JSONFILE"), root_1);

                        if ( !(stream_kvpair.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_kvpair.hasNext() ) {
                            adaptor.addChild(root_1, stream_kvpair.nextTree());

                        }
                        stream_kvpair.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:24:5: ( object )+
                    {
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:24:5: ( object )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==LBRACE) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:24:5: object
                    	    {
                    	    pushFollow(FOLLOW_object_in_jsonfile87);
                    	    object2=object();

                    	    state._fsp--;

                    	    stream_object.add(object2.getTree());

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



                    // AST REWRITE
                    // elements: object
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 24:13: -> ^( JSONFILE ( object )+ )
                    {
                        // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:24:16: ^( JSONFILE ( object )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(JSONFILE, "JSONFILE"), root_1);

                        if ( !(stream_object.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_object.hasNext() ) {
                            adaptor.addChild(root_1, stream_object.nextTree());

                        }
                        stream_object.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "jsonfile"

    public static class kvpair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "kvpair"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:26:1: kvpair : STRING COLON value -> ^( COLON STRING value ) ;
    public final JSONParserParser.kvpair_return kvpair() throws RecognitionException {
        JSONParserParser.kvpair_return retval = new JSONParserParser.kvpair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING3=null;
        Token COLON4=null;
        JSONParserParser.value_return value5 = null;


        Object STRING3_tree=null;
        Object COLON4_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:27:3: ( STRING COLON value -> ^( COLON STRING value ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:27:5: STRING COLON value
            {
            STRING3=(Token)match(input,STRING,FOLLOW_STRING_in_kvpair109);  
            stream_STRING.add(STRING3);

            COLON4=(Token)match(input,COLON,FOLLOW_COLON_in_kvpair111);  
            stream_COLON.add(COLON4);

            pushFollow(FOLLOW_value_in_kvpair113);
            value5=value();

            state._fsp--;

            stream_value.add(value5.getTree());


            // AST REWRITE
            // elements: value, COLON, STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 27:24: -> ^( COLON STRING value )
            {
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:27:27: ^( COLON STRING value )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_COLON.nextNode(), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());
                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "kvpair"

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:29:1: value : ( literal | array | object );
    public final JSONParserParser.value_return value() throws RecognitionException {
        JSONParserParser.value_return retval = new JSONParserParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JSONParserParser.literal_return literal6 = null;

        JSONParserParser.array_return array7 = null;

        JSONParserParser.object_return object8 = null;



        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:30:3: ( literal | array | object )
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
            case LB:
                {
                alt4=2;
                }
                break;
            case LBRACE:
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
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:30:5: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_value135);
                    literal6=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal6.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:31:5: array
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_array_in_value142);
                    array7=array();

                    state._fsp--;

                    adaptor.addChild(root_0, array7.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:32:5: object
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_in_value149);
                    object8=object();

                    state._fsp--;

                    adaptor.addChild(root_0, object8.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "object"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:34:1: object : LBRACE ( kvpair ( COMMA )? )* RBRACE -> ^( OBJECT ( kvpair )* ) ;
    public final JSONParserParser.object_return object() throws RecognitionException {
        JSONParserParser.object_return retval = new JSONParserParser.object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACE9=null;
        Token COMMA11=null;
        Token RBRACE12=null;
        JSONParserParser.kvpair_return kvpair10 = null;


        Object LBRACE9_tree=null;
        Object COMMA11_tree=null;
        Object RBRACE12_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_kvpair=new RewriteRuleSubtreeStream(adaptor,"rule kvpair");
        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:35:3: ( LBRACE ( kvpair ( COMMA )? )* RBRACE -> ^( OBJECT ( kvpair )* ) )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:35:5: LBRACE ( kvpair ( COMMA )? )* RBRACE
            {
            LBRACE9=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_object162);  
            stream_LBRACE.add(LBRACE9);

            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:35:12: ( kvpair ( COMMA )? )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:35:13: kvpair ( COMMA )?
            	    {
            	    pushFollow(FOLLOW_kvpair_in_object165);
            	    kvpair10=kvpair();

            	    state._fsp--;

            	    stream_kvpair.add(kvpair10.getTree());
            	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:35:20: ( COMMA )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==COMMA) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:35:20: COMMA
            	            {
            	            COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_object167);  
            	            stream_COMMA.add(COMMA11);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            RBRACE12=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_object172);  
            stream_RBRACE.add(RBRACE12);



            // AST REWRITE
            // elements: kvpair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 35:36: -> ^( OBJECT ( kvpair )* )
            {
                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:35:39: ^( OBJECT ( kvpair )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJECT, "OBJECT"), root_1);

                // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:35:48: ( kvpair )*
                while ( stream_kvpair.hasNext() ) {
                    adaptor.addChild(root_1, stream_kvpair.nextTree());

                }
                stream_kvpair.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "object"

    public static class array_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:37:1: array : ( LB literal ( COMMA literal )* RB -> ^( ARRAY literal ( literal )* ) | LB object ( COMMA object )* RB -> ^( ARRAY object ( object )* ) );
    public final JSONParserParser.array_return array() throws RecognitionException {
        JSONParserParser.array_return retval = new JSONParserParser.array_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LB13=null;
        Token COMMA15=null;
        Token RB17=null;
        Token LB18=null;
        Token COMMA20=null;
        Token RB22=null;
        JSONParserParser.literal_return literal14 = null;

        JSONParserParser.literal_return literal16 = null;

        JSONParserParser.object_return object19 = null;

        JSONParserParser.object_return object21 = null;


        Object LB13_tree=null;
        Object COMMA15_tree=null;
        Object RB17_tree=null;
        Object LB18_tree=null;
        Object COMMA20_tree=null;
        Object RB22_tree=null;
        RewriteRuleTokenStream stream_LB=new RewriteRuleTokenStream(adaptor,"token LB");
        RewriteRuleTokenStream stream_RB=new RewriteRuleTokenStream(adaptor,"token RB");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_object=new RewriteRuleSubtreeStream(adaptor,"rule object");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:38:3: ( LB literal ( COMMA literal )* RB -> ^( ARRAY literal ( literal )* ) | LB object ( COMMA object )* RB -> ^( ARRAY object ( object )* ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LB) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==STRING||(LA9_1>=NUMBER && LA9_1<=NULL)) ) {
                    alt9=1;
                }
                else if ( (LA9_1==LBRACE) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:38:5: LB literal ( COMMA literal )* RB
                    {
                    LB13=(Token)match(input,LB,FOLLOW_LB_in_array193);  
                    stream_LB.add(LB13);

                    pushFollow(FOLLOW_literal_in_array195);
                    literal14=literal();

                    state._fsp--;

                    stream_literal.add(literal14.getTree());
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:38:16: ( COMMA literal )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:38:17: COMMA literal
                    	    {
                    	    COMMA15=(Token)match(input,COMMA,FOLLOW_COMMA_in_array198);  
                    	    stream_COMMA.add(COMMA15);

                    	    pushFollow(FOLLOW_literal_in_array200);
                    	    literal16=literal();

                    	    state._fsp--;

                    	    stream_literal.add(literal16.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    RB17=(Token)match(input,RB,FOLLOW_RB_in_array204);  
                    stream_RB.add(RB17);



                    // AST REWRITE
                    // elements: literal, literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 38:36: -> ^( ARRAY literal ( literal )* )
                    {
                        // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:38:39: ^( ARRAY literal ( literal )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);

                        adaptor.addChild(root_1, stream_literal.nextTree());
                        // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:38:55: ( literal )*
                        while ( stream_literal.hasNext() ) {
                            adaptor.addChild(root_1, stream_literal.nextTree());

                        }
                        stream_literal.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:39:5: LB object ( COMMA object )* RB
                    {
                    LB18=(Token)match(input,LB,FOLLOW_LB_in_array223);  
                    stream_LB.add(LB18);

                    pushFollow(FOLLOW_object_in_array225);
                    object19=object();

                    state._fsp--;

                    stream_object.add(object19.getTree());
                    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:39:15: ( COMMA object )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:39:16: COMMA object
                    	    {
                    	    COMMA20=(Token)match(input,COMMA,FOLLOW_COMMA_in_array228);  
                    	    stream_COMMA.add(COMMA20);

                    	    pushFollow(FOLLOW_object_in_array230);
                    	    object21=object();

                    	    state._fsp--;

                    	    stream_object.add(object21.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    RB22=(Token)match(input,RB,FOLLOW_RB_in_array234);  
                    stream_RB.add(RB22);



                    // AST REWRITE
                    // elements: object, object
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 39:34: -> ^( ARRAY object ( object )* )
                    {
                        // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:39:37: ^( ARRAY object ( object )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);

                        adaptor.addChild(root_1, stream_object.nextTree());
                        // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:39:52: ( object )*
                        while ( stream_object.hasNext() ) {
                            adaptor.addChild(root_1, stream_object.nextTree());

                        }
                        stream_object.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "array"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:41:1: literal : ( NUMBER | FPNUMBER | STRING | TRUE | FALSE | NULL );
    public final JSONParserParser.literal_return literal() throws RecognitionException {
        JSONParserParser.literal_return retval = new JSONParserParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set23=null;

        Object set23_tree=null;

        try {
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:42:3: ( NUMBER | FPNUMBER | STRING | TRUE | FALSE | NULL )
            // C:\\Users\\Lyle\\BitTorrent Sync\\workspace\\SIDSL\\src\\JSONHandler\\JSONParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set23=(Token)input.LT(1);
            if ( input.LA(1)==STRING||(input.LA(1)>=NUMBER && input.LA(1)<=NULL) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set23));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    // Delegated rules


 

    public static final BitSet FOLLOW_kvpair_in_jsonfile71 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_object_in_jsonfile87 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_STRING_in_kvpair109 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_kvpair111 = new BitSet(new long[]{0x000000000007D280L});
    public static final BitSet FOLLOW_value_in_kvpair113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_value135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_value142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_value149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_object162 = new BitSet(new long[]{0x0000000000000C80L});
    public static final BitSet FOLLOW_kvpair_in_object165 = new BitSet(new long[]{0x0000000000000C80L});
    public static final BitSet FOLLOW_COMMA_in_object167 = new BitSet(new long[]{0x0000000000000C80L});
    public static final BitSet FOLLOW_RBRACE_in_object172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LB_in_array193 = new BitSet(new long[]{0x000000000007C080L});
    public static final BitSet FOLLOW_literal_in_array195 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_COMMA_in_array198 = new BitSet(new long[]{0x000000000007C080L});
    public static final BitSet FOLLOW_literal_in_array200 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_RB_in_array204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LB_in_array223 = new BitSet(new long[]{0x0000000000002600L});
    public static final BitSet FOLLOW_object_in_array225 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_COMMA_in_array228 = new BitSet(new long[]{0x0000000000002600L});
    public static final BitSet FOLLOW_object_in_array230 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_RB_in_array234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});

}
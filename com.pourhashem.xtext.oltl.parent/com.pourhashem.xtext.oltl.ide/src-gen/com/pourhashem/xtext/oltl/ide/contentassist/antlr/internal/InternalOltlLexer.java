package com.pourhashem.xtext.oltl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOltlLexer extends Lexer {
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_OP2=5;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int RULE_OPF=6;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalOltlLexer() {;} 
    public InternalOltlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOltlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalOltl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:11:7: ( 'P' )
            // InternalOltl.g:11:9: 'P'
            {
            match('P'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:12:7: ( 'p' )
            // InternalOltl.g:12:9: 'p'
            {
            match('p'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:13:7: ( '.' )
            // InternalOltl.g:13:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:14:7: ( '(' )
            // InternalOltl.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:15:7: ( '&&' )
            // InternalOltl.g:15:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:16:7: ( ')' )
            // InternalOltl.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:17:7: ( '||' )
            // InternalOltl.g:17:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:18:7: ( '!!' )
            // InternalOltl.g:18:9: '!!'
            {
            match("!!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:19:7: ( 'w' )
            // InternalOltl.g:19:9: 'w'
            {
            match('w'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:20:7: ( 'next' )
            // InternalOltl.g:20:9: 'next'
            {
            match("next"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:21:7: ( '-' )
            // InternalOltl.g:21:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "RULE_OP2"
    public final void mRULE_OP2() throws RecognitionException {
        try {
            int _type = RULE_OP2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:1810:10: ( ( '->' | '<->' | 'until' | 'since' | 'release' | 'trigger' ) )
            // InternalOltl.g:1810:12: ( '->' | '<->' | 'until' | 'since' | 'release' | 'trigger' )
            {
            // InternalOltl.g:1810:12: ( '->' | '<->' | 'until' | 'since' | 'release' | 'trigger' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case '-':
                {
                alt1=1;
                }
                break;
            case '<':
                {
                alt1=2;
                }
                break;
            case 'u':
                {
                alt1=3;
                }
                break;
            case 's':
                {
                alt1=4;
                }
                break;
            case 'r':
                {
                alt1=5;
                }
                break;
            case 't':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalOltl.g:1810:13: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 2 :
                    // InternalOltl.g:1810:18: '<->'
                    {
                    match("<->"); 


                    }
                    break;
                case 3 :
                    // InternalOltl.g:1810:24: 'until'
                    {
                    match("until"); 


                    }
                    break;
                case 4 :
                    // InternalOltl.g:1810:32: 'since'
                    {
                    match("since"); 


                    }
                    break;
                case 5 :
                    // InternalOltl.g:1810:40: 'release'
                    {
                    match("release"); 


                    }
                    break;
                case 6 :
                    // InternalOltl.g:1810:50: 'trigger'
                    {
                    match("trigger"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP2"

    // $ANTLR start "RULE_OPF"
    public final void mRULE_OPF() throws RecognitionException {
        try {
            int _type = RULE_OPF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:1812:10: ( ( 'next' | 'yesterday' | 'alw' | 'som' | 'alwf' | 'somf' | 'alwp' | 'somp' ) )
            // InternalOltl.g:1812:12: ( 'next' | 'yesterday' | 'alw' | 'som' | 'alwf' | 'somf' | 'alwp' | 'somp' )
            {
            // InternalOltl.g:1812:12: ( 'next' | 'yesterday' | 'alw' | 'som' | 'alwf' | 'somf' | 'alwp' | 'somp' )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalOltl.g:1812:13: 'next'
                    {
                    match("next"); 


                    }
                    break;
                case 2 :
                    // InternalOltl.g:1812:20: 'yesterday'
                    {
                    match("yesterday"); 


                    }
                    break;
                case 3 :
                    // InternalOltl.g:1812:32: 'alw'
                    {
                    match("alw"); 


                    }
                    break;
                case 4 :
                    // InternalOltl.g:1812:38: 'som'
                    {
                    match("som"); 


                    }
                    break;
                case 5 :
                    // InternalOltl.g:1812:44: 'alwf'
                    {
                    match("alwf"); 


                    }
                    break;
                case 6 :
                    // InternalOltl.g:1812:51: 'somf'
                    {
                    match("somf"); 


                    }
                    break;
                case 7 :
                    // InternalOltl.g:1812:58: 'alwp'
                    {
                    match("alwp"); 


                    }
                    break;
                case 8 :
                    // InternalOltl.g:1812:65: 'somp'
                    {
                    match("somp"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPF"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:1814:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalOltl.g:1814:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalOltl.g:1814:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOltl.g:1814:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalOltl.g:1814:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOltl.g:
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
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:1816:10: ( ( '0' .. '9' )+ )
            // InternalOltl.g:1816:12: ( '0' .. '9' )+
            {
            // InternalOltl.g:1816:12: ( '0' .. '9' )+
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
            	    // InternalOltl.g:1816:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:1818:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalOltl.g:1818:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalOltl.g:1818:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOltl.g:1818:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalOltl.g:1818:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalOltl.g:1818:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOltl.g:1818:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalOltl.g:1818:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalOltl.g:1818:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalOltl.g:1818:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOltl.g:1818:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:1820:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOltl.g:1820:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOltl.g:1820:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOltl.g:1820:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:1822:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOltl.g:1822:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOltl.g:1822:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOltl.g:1822:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalOltl.g:1822:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOltl.g:1822:41: ( '\\r' )? '\\n'
                    {
                    // InternalOltl.g:1822:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalOltl.g:1822:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:1824:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOltl.g:1824:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOltl.g:1824:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOltl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOltl.g:1826:16: ( . )
            // InternalOltl.g:1826:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalOltl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_OP2 | RULE_OPF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=20;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalOltl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalOltl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalOltl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalOltl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalOltl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalOltl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalOltl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalOltl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalOltl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalOltl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalOltl.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalOltl.g:1:76: RULE_OP2
                {
                mRULE_OP2(); 

                }
                break;
            case 13 :
                // InternalOltl.g:1:85: RULE_OPF
                {
                mRULE_OPF(); 

                }
                break;
            case 14 :
                // InternalOltl.g:1:94: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // InternalOltl.g:1:102: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // InternalOltl.g:1:111: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // InternalOltl.g:1:123: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // InternalOltl.g:1:139: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // InternalOltl.g:1:155: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 20 :
                // InternalOltl.g:1:163: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA2_eotS =
        "\7\uffff\1\13\1\16\6\uffff";
    static final String DFA2_eofS =
        "\17\uffff";
    static final String DFA2_minS =
        "\1\141\2\uffff\1\154\1\157\1\167\1\155\2\146\6\uffff";
    static final String DFA2_maxS =
        "\1\171\2\uffff\1\154\1\157\1\167\1\155\2\160\6\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\6\uffff\1\5\1\7\1\3\1\6\1\10\1\4";
    static final String DFA2_specialS =
        "\17\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\14\uffff\1\1\4\uffff\1\4\5\uffff\1\2",
            "",
            "",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11\11\uffff\1\12",
            "\1\14\11\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "1812:12: ( 'next' | 'yesterday' | 'alw' | 'som' | 'alwf' | 'somf' | 'alwp' | 'somp' )";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\1\33\1\35\2\uffff\1\32\1\uffff\2\32\1\44\1\34\1\47\1\32\6\34\1\32\2\uffff\3\32\14\uffff\1\34\2\uffff\7\34\5\uffff\3\34\1\101\3\34\1\101\1\107\2\34\2\101\1\uffff\3\34\2\101\1\uffff\2\46\6\34\2\46\2\34\1\101";
    static final String DFA14_eofS =
        "\125\uffff";
    static final String DFA14_minS =
        "\1\0\2\60\2\uffff\1\46\1\uffff\1\174\1\41\1\60\1\145\1\76\1\55\1\156\1\151\1\145\1\162\1\145\1\154\1\101\2\uffff\2\0\1\52\14\uffff\1\170\2\uffff\1\164\1\156\1\155\1\154\1\151\1\163\1\167\5\uffff\1\164\1\151\1\143\1\60\1\145\1\147\1\164\2\60\1\154\1\145\2\60\1\uffff\1\141\1\147\1\145\2\60\1\uffff\2\60\1\163\1\145\1\162\1\145\1\162\1\144\2\60\1\141\1\171\1\60";
    static final String DFA14_maxS =
        "\1\uffff\2\172\2\uffff\1\46\1\uffff\1\174\1\41\1\172\1\145\1\76\1\55\1\156\1\157\1\145\1\162\1\145\1\154\1\172\2\uffff\2\uffff\1\57\14\uffff\1\170\2\uffff\1\164\1\156\1\155\1\154\1\151\1\163\1\167\5\uffff\1\164\1\151\1\143\1\172\1\145\1\147\1\164\2\172\1\154\1\145\2\172\1\uffff\1\141\1\147\1\145\2\172\1\uffff\2\172\1\163\1\145\1\162\1\145\1\162\1\144\2\172\1\141\1\171\1\172";
    static final String DFA14_acceptS =
        "\3\uffff\1\3\1\4\1\uffff\1\6\15\uffff\1\16\1\17\3\uffff\1\23\1\24\1\1\1\16\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\14\1\13\7\uffff\1\17\1\20\1\21\1\22\1\23\15\uffff\1\15\5\uffff\1\12\15\uffff";
    static final String DFA14_specialS =
        "\1\0\25\uffff\1\1\1\2\75\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\10\1\26\3\32\1\5\1\27\1\4\1\6\3\32\1\13\1\3\1\30\12\25\2\32\1\14\4\32\17\24\1\1\12\24\3\32\1\23\1\24\1\32\1\22\14\24\1\12\1\24\1\2\1\24\1\17\1\16\1\20\1\15\1\24\1\11\1\24\1\21\1\24\1\32\1\7\uff83\32",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\1\40",
            "",
            "\1\42",
            "\1\43",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\45",
            "\1\46",
            "\1\46",
            "\1\50",
            "\1\51\5\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\0\60",
            "\0\60",
            "\1\61\4\uffff\1\62",
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
            "\1\64",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\5\34\1\77\11\34\1\100\12\34",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\5\34\1\105\11\34\1\106\12\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\110",
            "\1\111",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\123",
            "\1\124",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_OP2 | RULE_OPF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='P') ) {s = 1;}

                        else if ( (LA14_0=='p') ) {s = 2;}

                        else if ( (LA14_0=='.') ) {s = 3;}

                        else if ( (LA14_0=='(') ) {s = 4;}

                        else if ( (LA14_0=='&') ) {s = 5;}

                        else if ( (LA14_0==')') ) {s = 6;}

                        else if ( (LA14_0=='|') ) {s = 7;}

                        else if ( (LA14_0=='!') ) {s = 8;}

                        else if ( (LA14_0=='w') ) {s = 9;}

                        else if ( (LA14_0=='n') ) {s = 10;}

                        else if ( (LA14_0=='-') ) {s = 11;}

                        else if ( (LA14_0=='<') ) {s = 12;}

                        else if ( (LA14_0=='u') ) {s = 13;}

                        else if ( (LA14_0=='s') ) {s = 14;}

                        else if ( (LA14_0=='r') ) {s = 15;}

                        else if ( (LA14_0=='t') ) {s = 16;}

                        else if ( (LA14_0=='y') ) {s = 17;}

                        else if ( (LA14_0=='a') ) {s = 18;}

                        else if ( (LA14_0=='^') ) {s = 19;}

                        else if ( ((LA14_0>='A' && LA14_0<='O')||(LA14_0>='Q' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='b' && LA14_0<='m')||LA14_0=='o'||LA14_0=='q'||LA14_0=='v'||LA14_0=='x'||LA14_0=='z') ) {s = 20;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 21;}

                        else if ( (LA14_0=='\"') ) {s = 22;}

                        else if ( (LA14_0=='\'') ) {s = 23;}

                        else if ( (LA14_0=='/') ) {s = 24;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 25;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='%')||(LA14_0>='*' && LA14_0<=',')||(LA14_0>=':' && LA14_0<=';')||(LA14_0>='=' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='{'||(LA14_0>='}' && LA14_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_22 = input.LA(1);

                        s = -1;
                        if ( ((LA14_22>='\u0000' && LA14_22<='\uFFFF')) ) {s = 48;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_23 = input.LA(1);

                        s = -1;
                        if ( ((LA14_23>='\u0000' && LA14_23<='\uFFFF')) ) {s = 48;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
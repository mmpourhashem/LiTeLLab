package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLiTeLLabLexer extends Lexer {
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_COMP=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_OP2=5;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=8;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_OPF=6;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalLiTeLLabLexer() {;} 
    public InternalLiTeLLabLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLiTeLLabLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalLiTeLLab.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLiTeLLab.g:11:7: ( 'P' )
            // InternalLiTeLLab.g:11:9: 'P'
            {
            match('P'); 

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
            // InternalLiTeLLab.g:12:7: ( 'p' )
            // InternalLiTeLLab.g:12:9: 'p'
            {
            match('p'); 

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
            // InternalLiTeLLab.g:13:7: ( 'V' )
            // InternalLiTeLLab.g:13:9: 'V'
            {
            match('V'); 

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
            // InternalLiTeLLab.g:14:7: ( 'v' )
            // InternalLiTeLLab.g:14:9: 'v'
            {
            match('v'); 

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
            // InternalLiTeLLab.g:15:7: ( '.' )
            // InternalLiTeLLab.g:15:9: '.'
            {
            match('.'); 

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
            // InternalLiTeLLab.g:16:7: ( '(' )
            // InternalLiTeLLab.g:16:9: '('
            {
            match('('); 

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
            // InternalLiTeLLab.g:17:7: ( '&&' )
            // InternalLiTeLLab.g:17:9: '&&'
            {
            match("&&"); 


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
            // InternalLiTeLLab.g:18:7: ( ')' )
            // InternalLiTeLLab.g:18:9: ')'
            {
            match(')'); 

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
            // InternalLiTeLLab.g:19:7: ( '||' )
            // InternalLiTeLLab.g:19:9: '||'
            {
            match("||"); 


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
            // InternalLiTeLLab.g:20:7: ( '!!' )
            // InternalLiTeLLab.g:20:9: '!!'
            {
            match("!!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLiTeLLab.g:21:7: ( 'w' )
            // InternalLiTeLLab.g:21:9: 'w'
            {
            match('w'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLiTeLLab.g:22:7: ( 'iw' )
            // InternalLiTeLLab.g:22:9: 'iw'
            {
            match("iw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLiTeLLab.g:23:7: ( 'next' )
            // InternalLiTeLLab.g:23:9: 'next'
            {
            match("next"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLiTeLLab.g:24:7: ( '([' )
            // InternalLiTeLLab.g:24:9: '(['
            {
            match("(["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLiTeLLab.g:25:7: ( ']' )
            // InternalLiTeLLab.g:25:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLiTeLLab.g:26:7: ( '-' )
            // InternalLiTeLLab.g:26:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLiTeLLab.g:27:7: ( 'old' )
            // InternalLiTeLLab.g:27:9: 'old'
            {
            match("old"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_OP2"
    public final void mRULE_OP2() throws RecognitionException {
        try {
            int _type = RULE_OP2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLiTeLLab.g:2662:10: ( ( '->' | '<->' | 'until' | 'since' | 'release' | 'trigger' ) )
            // InternalLiTeLLab.g:2662:12: ( '->' | '<->' | 'until' | 'since' | 'release' | 'trigger' )
            {
            // InternalLiTeLLab.g:2662:12: ( '->' | '<->' | 'until' | 'since' | 'release' | 'trigger' )
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
                    // InternalLiTeLLab.g:2662:13: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 2 :
                    // InternalLiTeLLab.g:2662:18: '<->'
                    {
                    match("<->"); 


                    }
                    break;
                case 3 :
                    // InternalLiTeLLab.g:2662:24: 'until'
                    {
                    match("until"); 


                    }
                    break;
                case 4 :
                    // InternalLiTeLLab.g:2662:32: 'since'
                    {
                    match("since"); 


                    }
                    break;
                case 5 :
                    // InternalLiTeLLab.g:2662:40: 'release'
                    {
                    match("release"); 


                    }
                    break;
                case 6 :
                    // InternalLiTeLLab.g:2662:50: 'trigger'
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
            // InternalLiTeLLab.g:2664:10: ( ( 'next' | 'yesterday' | 'alw' | 'som' | 'alwf' | 'somf' | 'alwp' | 'somp' ) )
            // InternalLiTeLLab.g:2664:12: ( 'next' | 'yesterday' | 'alw' | 'som' | 'alwf' | 'somf' | 'alwp' | 'somp' )
            {
            // InternalLiTeLLab.g:2664:12: ( 'next' | 'yesterday' | 'alw' | 'som' | 'alwf' | 'somf' | 'alwp' | 'somp' )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalLiTeLLab.g:2664:13: 'next'
                    {
                    match("next"); 


                    }
                    break;
                case 2 :
                    // InternalLiTeLLab.g:2664:20: 'yesterday'
                    {
                    match("yesterday"); 


                    }
                    break;
                case 3 :
                    // InternalLiTeLLab.g:2664:32: 'alw'
                    {
                    match("alw"); 


                    }
                    break;
                case 4 :
                    // InternalLiTeLLab.g:2664:38: 'som'
                    {
                    match("som"); 


                    }
                    break;
                case 5 :
                    // InternalLiTeLLab.g:2664:44: 'alwf'
                    {
                    match("alwf"); 


                    }
                    break;
                case 6 :
                    // InternalLiTeLLab.g:2664:51: 'somf'
                    {
                    match("somf"); 


                    }
                    break;
                case 7 :
                    // InternalLiTeLLab.g:2664:58: 'alwp'
                    {
                    match("alwp"); 


                    }
                    break;
                case 8 :
                    // InternalLiTeLLab.g:2664:65: 'somp'
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

    // $ANTLR start "RULE_COMP"
    public final void mRULE_COMP() throws RecognitionException {
        try {
            int _type = RULE_COMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLiTeLLab.g:2666:11: ( ( '=' | '>' | '>=' | '<' | '<=' ) )
            // InternalLiTeLLab.g:2666:13: ( '=' | '>' | '>=' | '<' | '<=' )
            {
            // InternalLiTeLLab.g:2666:13: ( '=' | '>' | '>=' | '<' | '<=' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt3=1;
                }
                break;
            case '>':
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='=') ) {
                    alt3=3;
                }
                else {
                    alt3=2;}
                }
                break;
            case '<':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='=') ) {
                    alt3=5;
                }
                else {
                    alt3=4;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLiTeLLab.g:2666:14: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // InternalLiTeLLab.g:2666:18: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // InternalLiTeLLab.g:2666:22: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // InternalLiTeLLab.g:2666:27: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 5 :
                    // InternalLiTeLLab.g:2666:31: '<='
                    {
                    match("<="); 


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
    // $ANTLR end "RULE_COMP"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLiTeLLab.g:2668:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLiTeLLab.g:2668:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalLiTeLLab.g:2668:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalLiTeLLab.g:2668:11: '^'
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

            // InternalLiTeLLab.g:2668:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLiTeLLab.g:
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
            	    break loop5;
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
            // InternalLiTeLLab.g:2670:10: ( ( '0' .. '9' )+ )
            // InternalLiTeLLab.g:2670:12: ( '0' .. '9' )+
            {
            // InternalLiTeLLab.g:2670:12: ( '0' .. '9' )+
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
            	    // InternalLiTeLLab.g:2670:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLiTeLLab.g:2672:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLiTeLLab.g:2672:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLiTeLLab.g:2672:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLiTeLLab.g:2672:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLiTeLLab.g:2672:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalLiTeLLab.g:2672:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLiTeLLab.g:2672:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalLiTeLLab.g:2672:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLiTeLLab.g:2672:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalLiTeLLab.g:2672:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLiTeLLab.g:2672:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // InternalLiTeLLab.g:2674:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalLiTeLLab.g:2674:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalLiTeLLab.g:2674:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLiTeLLab.g:2674:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // InternalLiTeLLab.g:2676:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLiTeLLab.g:2676:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalLiTeLLab.g:2676:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLiTeLLab.g:2676:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalLiTeLLab.g:2676:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLiTeLLab.g:2676:41: ( '\\r' )? '\\n'
                    {
                    // InternalLiTeLLab.g:2676:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalLiTeLLab.g:2676:41: '\\r'
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
            // InternalLiTeLLab.g:2678:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLiTeLLab.g:2678:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLiTeLLab.g:2678:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLiTeLLab.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalLiTeLLab.g:2680:16: ( . )
            // InternalLiTeLLab.g:2680:18: .
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
        // InternalLiTeLLab.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_OP2 | RULE_OPF | RULE_COMP | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=27;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalLiTeLLab.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalLiTeLLab.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalLiTeLLab.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalLiTeLLab.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalLiTeLLab.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalLiTeLLab.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalLiTeLLab.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalLiTeLLab.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalLiTeLLab.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalLiTeLLab.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalLiTeLLab.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalLiTeLLab.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalLiTeLLab.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalLiTeLLab.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalLiTeLLab.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalLiTeLLab.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalLiTeLLab.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalLiTeLLab.g:1:112: RULE_OP2
                {
                mRULE_OP2(); 

                }
                break;
            case 19 :
                // InternalLiTeLLab.g:1:121: RULE_OPF
                {
                mRULE_OPF(); 

                }
                break;
            case 20 :
                // InternalLiTeLLab.g:1:130: RULE_COMP
                {
                mRULE_COMP(); 

                }
                break;
            case 21 :
                // InternalLiTeLLab.g:1:140: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // InternalLiTeLLab.g:1:148: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // InternalLiTeLLab.g:1:157: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // InternalLiTeLLab.g:1:169: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // InternalLiTeLLab.g:1:185: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // InternalLiTeLLab.g:1:201: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 27 :
                // InternalLiTeLLab.g:1:209: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA15 dfa15 = new DFA15(this);
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
            return "2664:12: ( 'next' | 'yesterday' | 'alw' | 'som' | 'alwf' | 'somf' | 'alwp' | 'somp' )";
        }
    }
    static final String DFA15_eotS =
        "\1\uffff\1\42\1\44\1\45\1\46\1\uffff\1\51\1\41\1\uffff\2\41\1\56\2\43\1\uffff\1\63\1\43\1\65\6\43\2\uffff\1\41\2\uffff\3\41\17\uffff\1\102\1\43\3\uffff\1\43\1\uffff\7\43\6\uffff\1\43\1\115\2\43\1\122\3\43\1\122\1\130\1\uffff\2\43\2\122\1\uffff\3\43\2\122\1\uffff\2\62\6\43\2\62\2\43\1\122";
    static final String DFA15_eofS =
        "\146\uffff";
    static final String DFA15_minS =
        "\1\0\4\60\1\uffff\1\133\1\46\1\uffff\1\174\1\41\1\60\1\167\1\145\1\uffff\1\76\1\154\1\55\1\156\1\151\1\145\1\162\1\145\1\154\2\uffff\1\101\2\uffff\2\0\1\52\17\uffff\1\60\1\170\3\uffff\1\144\1\uffff\1\164\1\156\1\155\1\154\1\151\1\163\1\167\6\uffff\1\164\1\60\1\151\1\143\1\60\1\145\1\147\1\164\2\60\1\uffff\1\154\1\145\2\60\1\uffff\1\141\1\147\1\145\2\60\1\uffff\2\60\1\163\1\145\1\162\1\145\1\162\1\144\2\60\1\141\1\171\1\60";
    static final String DFA15_maxS =
        "\1\uffff\4\172\1\uffff\1\133\1\46\1\uffff\1\174\1\41\1\172\1\167\1\145\1\uffff\1\76\1\154\1\55\1\156\1\157\1\145\1\162\1\145\1\154\2\uffff\1\172\2\uffff\2\uffff\1\57\17\uffff\1\172\1\170\3\uffff\1\144\1\uffff\1\164\1\156\1\155\1\154\1\151\1\163\1\167\6\uffff\1\164\1\172\1\151\1\143\1\172\1\145\1\147\1\164\2\172\1\uffff\1\154\1\145\2\172\1\uffff\1\141\1\147\1\145\2\172\1\uffff\2\172\1\163\1\145\1\162\1\145\1\162\1\144\2\172\1\141\1\171\1\172";
    static final String DFA15_acceptS =
        "\5\uffff\1\5\2\uffff\1\10\5\uffff\1\17\11\uffff\2\24\1\uffff\1\25\1\26\3\uffff\1\32\1\33\1\1\1\25\1\2\1\3\1\4\1\5\1\16\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff\1\17\1\22\1\20\1\uffff\1\24\7\uffff\1\26\1\27\1\30\1\31\1\32\1\14\12\uffff\1\21\4\uffff\1\23\5\uffff\1\15\15\uffff";
    static final String DFA15_specialS =
        "\1\1\34\uffff\1\0\1\2\107\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\12\1\35\3\41\1\7\1\36\1\6\1\10\3\41\1\17\1\5\1\37\12\34\2\41\1\21\1\30\1\31\2\41\17\33\1\1\5\33\1\3\4\33\2\41\1\16\1\32\1\33\1\41\1\27\7\33\1\14\4\33\1\15\1\20\1\2\1\33\1\24\1\23\1\25\1\22\1\4\1\13\1\33\1\26\1\33\1\41\1\11\uff83\41",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\50",
            "\1\52",
            "",
            "\1\54",
            "\1\55",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\57",
            "\1\60",
            "",
            "\1\62",
            "\1\64",
            "\1\62",
            "\1\66",
            "\1\67\5\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\0\76",
            "\0\76",
            "\1\77\4\uffff\1\100",
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
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\103",
            "",
            "",
            "",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\114",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\116",
            "\1\117",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\5\43\1\120\11\43\1\121\12\43",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\5\43\1\126\11\43\1\127\12\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\131",
            "\1\132",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\144",
            "\1\145",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_OP2 | RULE_OPF | RULE_COMP | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_29 = input.LA(1);

                        s = -1;
                        if ( ((LA15_29>='\u0000' && LA15_29<='\uFFFF')) ) {s = 62;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='P') ) {s = 1;}

                        else if ( (LA15_0=='p') ) {s = 2;}

                        else if ( (LA15_0=='V') ) {s = 3;}

                        else if ( (LA15_0=='v') ) {s = 4;}

                        else if ( (LA15_0=='.') ) {s = 5;}

                        else if ( (LA15_0=='(') ) {s = 6;}

                        else if ( (LA15_0=='&') ) {s = 7;}

                        else if ( (LA15_0==')') ) {s = 8;}

                        else if ( (LA15_0=='|') ) {s = 9;}

                        else if ( (LA15_0=='!') ) {s = 10;}

                        else if ( (LA15_0=='w') ) {s = 11;}

                        else if ( (LA15_0=='i') ) {s = 12;}

                        else if ( (LA15_0=='n') ) {s = 13;}

                        else if ( (LA15_0==']') ) {s = 14;}

                        else if ( (LA15_0=='-') ) {s = 15;}

                        else if ( (LA15_0=='o') ) {s = 16;}

                        else if ( (LA15_0=='<') ) {s = 17;}

                        else if ( (LA15_0=='u') ) {s = 18;}

                        else if ( (LA15_0=='s') ) {s = 19;}

                        else if ( (LA15_0=='r') ) {s = 20;}

                        else if ( (LA15_0=='t') ) {s = 21;}

                        else if ( (LA15_0=='y') ) {s = 22;}

                        else if ( (LA15_0=='a') ) {s = 23;}

                        else if ( (LA15_0=='=') ) {s = 24;}

                        else if ( (LA15_0=='>') ) {s = 25;}

                        else if ( (LA15_0=='^') ) {s = 26;}

                        else if ( ((LA15_0>='A' && LA15_0<='O')||(LA15_0>='Q' && LA15_0<='U')||(LA15_0>='W' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='b' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='m')||LA15_0=='q'||LA15_0=='x'||LA15_0=='z') ) {s = 27;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 28;}

                        else if ( (LA15_0=='\"') ) {s = 29;}

                        else if ( (LA15_0=='\'') ) {s = 30;}

                        else if ( (LA15_0=='/') ) {s = 31;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 32;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='%')||(LA15_0>='*' && LA15_0<=',')||(LA15_0>=':' && LA15_0<=';')||(LA15_0>='?' && LA15_0<='@')||(LA15_0>='[' && LA15_0<='\\')||LA15_0=='`'||LA15_0=='{'||(LA15_0>='}' && LA15_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_30 = input.LA(1);

                        s = -1;
                        if ( ((LA15_30>='\u0000' && LA15_30<='\uFFFF')) ) {s = 62;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
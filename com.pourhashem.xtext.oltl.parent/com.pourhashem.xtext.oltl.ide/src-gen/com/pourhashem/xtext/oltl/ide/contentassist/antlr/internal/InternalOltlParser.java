package com.pourhashem.xtext.oltl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.pourhashem.xtext.oltl.services.OltlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOltlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_OP2", "RULE_OPF", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'P'", "'p'", "'.'", "'('", "'&&'", "')'", "'||'", "'!!'", "'w'", "'next'", "'-'"
    };
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


        public InternalOltlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOltlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOltlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOltl.g"; }


    	private OltlGrammarAccess grammarAccess;

    	public void setGrammarAccess(OltlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalOltl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalOltl.g:54:1: ( ruleModel EOF )
            // InternalOltl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOltl.g:62:1: ruleModel : ( ( rule__Model__TempFormulaAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:66:2: ( ( ( rule__Model__TempFormulaAssignment ) ) )
            // InternalOltl.g:67:2: ( ( rule__Model__TempFormulaAssignment ) )
            {
            // InternalOltl.g:67:2: ( ( rule__Model__TempFormulaAssignment ) )
            // InternalOltl.g:68:3: ( rule__Model__TempFormulaAssignment )
            {
             before(grammarAccess.getModelAccess().getTempFormulaAssignment()); 
            // InternalOltl.g:69:3: ( rule__Model__TempFormulaAssignment )
            // InternalOltl.g:69:4: rule__Model__TempFormulaAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__TempFormulaAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTempFormulaAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleWeight"
    // InternalOltl.g:78:1: entryRuleWeight : ruleWeight EOF ;
    public final void entryRuleWeight() throws RecognitionException {
        try {
            // InternalOltl.g:79:1: ( ruleWeight EOF )
            // InternalOltl.g:80:1: ruleWeight EOF
            {
             before(grammarAccess.getWeightRule()); 
            pushFollow(FOLLOW_1);
            ruleWeight();

            state._fsp--;

             after(grammarAccess.getWeightRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWeight"


    // $ANTLR start "ruleWeight"
    // InternalOltl.g:87:1: ruleWeight : ( ( rule__Weight__Group__0 ) ) ;
    public final void ruleWeight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:91:2: ( ( ( rule__Weight__Group__0 ) ) )
            // InternalOltl.g:92:2: ( ( rule__Weight__Group__0 ) )
            {
            // InternalOltl.g:92:2: ( ( rule__Weight__Group__0 ) )
            // InternalOltl.g:93:3: ( rule__Weight__Group__0 )
            {
             before(grammarAccess.getWeightAccess().getGroup()); 
            // InternalOltl.g:94:3: ( rule__Weight__Group__0 )
            // InternalOltl.g:94:4: rule__Weight__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Weight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWeightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWeight"


    // $ANTLR start "entryRuleWInt"
    // InternalOltl.g:103:1: entryRuleWInt : ruleWInt EOF ;
    public final void entryRuleWInt() throws RecognitionException {
        try {
            // InternalOltl.g:104:1: ( ruleWInt EOF )
            // InternalOltl.g:105:1: ruleWInt EOF
            {
             before(grammarAccess.getWIntRule()); 
            pushFollow(FOLLOW_1);
            ruleWInt();

            state._fsp--;

             after(grammarAccess.getWIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWInt"


    // $ANTLR start "ruleWInt"
    // InternalOltl.g:112:1: ruleWInt : ( ( rule__WInt__IntAssignment ) ) ;
    public final void ruleWInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:116:2: ( ( ( rule__WInt__IntAssignment ) ) )
            // InternalOltl.g:117:2: ( ( rule__WInt__IntAssignment ) )
            {
            // InternalOltl.g:117:2: ( ( rule__WInt__IntAssignment ) )
            // InternalOltl.g:118:3: ( rule__WInt__IntAssignment )
            {
             before(grammarAccess.getWIntAccess().getIntAssignment()); 
            // InternalOltl.g:119:3: ( rule__WInt__IntAssignment )
            // InternalOltl.g:119:4: rule__WInt__IntAssignment
            {
            pushFollow(FOLLOW_2);
            rule__WInt__IntAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWIntAccess().getIntAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWInt"


    // $ANTLR start "entryRuleWFloat"
    // InternalOltl.g:128:1: entryRuleWFloat : ruleWFloat EOF ;
    public final void entryRuleWFloat() throws RecognitionException {
        try {
            // InternalOltl.g:129:1: ( ruleWFloat EOF )
            // InternalOltl.g:130:1: ruleWFloat EOF
            {
             before(grammarAccess.getWFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleWFloat();

            state._fsp--;

             after(grammarAccess.getWFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWFloat"


    // $ANTLR start "ruleWFloat"
    // InternalOltl.g:137:1: ruleWFloat : ( ( rule__WFloat__Group__0 ) ) ;
    public final void ruleWFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:141:2: ( ( ( rule__WFloat__Group__0 ) ) )
            // InternalOltl.g:142:2: ( ( rule__WFloat__Group__0 ) )
            {
            // InternalOltl.g:142:2: ( ( rule__WFloat__Group__0 ) )
            // InternalOltl.g:143:3: ( rule__WFloat__Group__0 )
            {
             before(grammarAccess.getWFloatAccess().getGroup()); 
            // InternalOltl.g:144:3: ( rule__WFloat__Group__0 )
            // InternalOltl.g:144:4: rule__WFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWFloat"


    // $ANTLR start "entryRuleTempFormula"
    // InternalOltl.g:153:1: entryRuleTempFormula : ruleTempFormula EOF ;
    public final void entryRuleTempFormula() throws RecognitionException {
        try {
            // InternalOltl.g:154:1: ( ruleTempFormula EOF )
            // InternalOltl.g:155:1: ruleTempFormula EOF
            {
             before(grammarAccess.getTempFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleTempFormula();

            state._fsp--;

             after(grammarAccess.getTempFormulaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTempFormula"


    // $ANTLR start "ruleTempFormula"
    // InternalOltl.g:162:1: ruleTempFormula : ( ( rule__TempFormula__Alternatives ) ) ;
    public final void ruleTempFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:166:2: ( ( ( rule__TempFormula__Alternatives ) ) )
            // InternalOltl.g:167:2: ( ( rule__TempFormula__Alternatives ) )
            {
            // InternalOltl.g:167:2: ( ( rule__TempFormula__Alternatives ) )
            // InternalOltl.g:168:3: ( rule__TempFormula__Alternatives )
            {
             before(grammarAccess.getTempFormulaAccess().getAlternatives()); 
            // InternalOltl.g:169:3: ( rule__TempFormula__Alternatives )
            // InternalOltl.g:169:4: rule__TempFormula__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTempFormula"


    // $ANTLR start "entryRuleAP"
    // InternalOltl.g:178:1: entryRuleAP : ruleAP EOF ;
    public final void entryRuleAP() throws RecognitionException {
        try {
            // InternalOltl.g:179:1: ( ruleAP EOF )
            // InternalOltl.g:180:1: ruleAP EOF
            {
             before(grammarAccess.getAPRule()); 
            pushFollow(FOLLOW_1);
            ruleAP();

            state._fsp--;

             after(grammarAccess.getAPRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAP"


    // $ANTLR start "ruleAP"
    // InternalOltl.g:187:1: ruleAP : ( ( rule__AP__Group__0 ) ) ;
    public final void ruleAP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:191:2: ( ( ( rule__AP__Group__0 ) ) )
            // InternalOltl.g:192:2: ( ( rule__AP__Group__0 ) )
            {
            // InternalOltl.g:192:2: ( ( rule__AP__Group__0 ) )
            // InternalOltl.g:193:3: ( rule__AP__Group__0 )
            {
             before(grammarAccess.getAPAccess().getGroup()); 
            // InternalOltl.g:194:3: ( rule__AP__Group__0 )
            // InternalOltl.g:194:4: rule__AP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAP"


    // $ANTLR start "rule__Weight__Alternatives_1"
    // InternalOltl.g:202:1: rule__Weight__Alternatives_1 : ( ( ( rule__Weight__WIntAssignment_1_0 ) ) | ( ( rule__Weight__WFloatAssignment_1_1 ) ) );
    public final void rule__Weight__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:206:1: ( ( ( rule__Weight__WIntAssignment_1_0 ) ) | ( ( rule__Weight__WFloatAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||LA1_1==18) ) {
                    alt1=1;
                }
                else if ( (LA1_1==15) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOltl.g:207:2: ( ( rule__Weight__WIntAssignment_1_0 ) )
                    {
                    // InternalOltl.g:207:2: ( ( rule__Weight__WIntAssignment_1_0 ) )
                    // InternalOltl.g:208:3: ( rule__Weight__WIntAssignment_1_0 )
                    {
                     before(grammarAccess.getWeightAccess().getWIntAssignment_1_0()); 
                    // InternalOltl.g:209:3: ( rule__Weight__WIntAssignment_1_0 )
                    // InternalOltl.g:209:4: rule__Weight__WIntAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Weight__WIntAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWeightAccess().getWIntAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOltl.g:213:2: ( ( rule__Weight__WFloatAssignment_1_1 ) )
                    {
                    // InternalOltl.g:213:2: ( ( rule__Weight__WFloatAssignment_1_1 ) )
                    // InternalOltl.g:214:3: ( rule__Weight__WFloatAssignment_1_1 )
                    {
                     before(grammarAccess.getWeightAccess().getWFloatAssignment_1_1()); 
                    // InternalOltl.g:215:3: ( rule__Weight__WFloatAssignment_1_1 )
                    // InternalOltl.g:215:4: rule__Weight__WFloatAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Weight__WFloatAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWeightAccess().getWFloatAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weight__Alternatives_1"


    // $ANTLR start "rule__TempFormula__Alternatives"
    // InternalOltl.g:223:1: rule__TempFormula__Alternatives : ( ( ( rule__TempFormula__ApAssignment_0 ) ) | ( ( rule__TempFormula__Group_1__0 ) ) | ( ( rule__TempFormula__Group_2__0 ) ) | ( ( rule__TempFormula__Group_3__0 ) ) | ( ( rule__TempFormula__Group_4__0 ) ) | ( ( rule__TempFormula__Group_5__0 ) ) | ( ( rule__TempFormula__Group_6__0 ) ) | ( ( rule__TempFormula__Group_7__0 ) ) );
    public final void rule__TempFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:227:1: ( ( ( rule__TempFormula__ApAssignment_0 ) ) | ( ( rule__TempFormula__Group_1__0 ) ) | ( ( rule__TempFormula__Group_2__0 ) ) | ( ( rule__TempFormula__Group_3__0 ) ) | ( ( rule__TempFormula__Group_4__0 ) ) | ( ( rule__TempFormula__Group_5__0 ) ) | ( ( rule__TempFormula__Group_6__0 ) ) | ( ( rule__TempFormula__Group_7__0 ) ) )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalOltl.g:228:2: ( ( rule__TempFormula__ApAssignment_0 ) )
                    {
                    // InternalOltl.g:228:2: ( ( rule__TempFormula__ApAssignment_0 ) )
                    // InternalOltl.g:229:3: ( rule__TempFormula__ApAssignment_0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getApAssignment_0()); 
                    // InternalOltl.g:230:3: ( rule__TempFormula__ApAssignment_0 )
                    // InternalOltl.g:230:4: rule__TempFormula__ApAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempFormula__ApAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempFormulaAccess().getApAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOltl.g:234:2: ( ( rule__TempFormula__Group_1__0 ) )
                    {
                    // InternalOltl.g:234:2: ( ( rule__TempFormula__Group_1__0 ) )
                    // InternalOltl.g:235:3: ( rule__TempFormula__Group_1__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_1()); 
                    // InternalOltl.g:236:3: ( rule__TempFormula__Group_1__0 )
                    // InternalOltl.g:236:4: rule__TempFormula__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempFormula__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempFormulaAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOltl.g:240:2: ( ( rule__TempFormula__Group_2__0 ) )
                    {
                    // InternalOltl.g:240:2: ( ( rule__TempFormula__Group_2__0 ) )
                    // InternalOltl.g:241:3: ( rule__TempFormula__Group_2__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_2()); 
                    // InternalOltl.g:242:3: ( rule__TempFormula__Group_2__0 )
                    // InternalOltl.g:242:4: rule__TempFormula__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempFormula__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempFormulaAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOltl.g:246:2: ( ( rule__TempFormula__Group_3__0 ) )
                    {
                    // InternalOltl.g:246:2: ( ( rule__TempFormula__Group_3__0 ) )
                    // InternalOltl.g:247:3: ( rule__TempFormula__Group_3__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_3()); 
                    // InternalOltl.g:248:3: ( rule__TempFormula__Group_3__0 )
                    // InternalOltl.g:248:4: rule__TempFormula__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempFormula__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempFormulaAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOltl.g:252:2: ( ( rule__TempFormula__Group_4__0 ) )
                    {
                    // InternalOltl.g:252:2: ( ( rule__TempFormula__Group_4__0 ) )
                    // InternalOltl.g:253:3: ( rule__TempFormula__Group_4__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_4()); 
                    // InternalOltl.g:254:3: ( rule__TempFormula__Group_4__0 )
                    // InternalOltl.g:254:4: rule__TempFormula__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempFormula__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempFormulaAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOltl.g:258:2: ( ( rule__TempFormula__Group_5__0 ) )
                    {
                    // InternalOltl.g:258:2: ( ( rule__TempFormula__Group_5__0 ) )
                    // InternalOltl.g:259:3: ( rule__TempFormula__Group_5__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_5()); 
                    // InternalOltl.g:260:3: ( rule__TempFormula__Group_5__0 )
                    // InternalOltl.g:260:4: rule__TempFormula__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempFormula__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempFormulaAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOltl.g:264:2: ( ( rule__TempFormula__Group_6__0 ) )
                    {
                    // InternalOltl.g:264:2: ( ( rule__TempFormula__Group_6__0 ) )
                    // InternalOltl.g:265:3: ( rule__TempFormula__Group_6__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_6()); 
                    // InternalOltl.g:266:3: ( rule__TempFormula__Group_6__0 )
                    // InternalOltl.g:266:4: rule__TempFormula__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempFormula__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempFormulaAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalOltl.g:270:2: ( ( rule__TempFormula__Group_7__0 ) )
                    {
                    // InternalOltl.g:270:2: ( ( rule__TempFormula__Group_7__0 ) )
                    // InternalOltl.g:271:3: ( rule__TempFormula__Group_7__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_7()); 
                    // InternalOltl.g:272:3: ( rule__TempFormula__Group_7__0 )
                    // InternalOltl.g:272:4: rule__TempFormula__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempFormula__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempFormulaAccess().getGroup_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Alternatives"


    // $ANTLR start "rule__AP__Alternatives_2"
    // InternalOltl.g:280:1: rule__AP__Alternatives_2 : ( ( 'P' ) | ( 'p' ) );
    public final void rule__AP__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:284:1: ( ( 'P' ) | ( 'p' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalOltl.g:285:2: ( 'P' )
                    {
                    // InternalOltl.g:285:2: ( 'P' )
                    // InternalOltl.g:286:3: 'P'
                    {
                     before(grammarAccess.getAPAccess().getPKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAPAccess().getPKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOltl.g:291:2: ( 'p' )
                    {
                    // InternalOltl.g:291:2: ( 'p' )
                    // InternalOltl.g:292:3: 'p'
                    {
                     before(grammarAccess.getAPAccess().getPKeyword_2_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAPAccess().getPKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AP__Alternatives_2"


    // $ANTLR start "rule__Weight__Group__0"
    // InternalOltl.g:301:1: rule__Weight__Group__0 : rule__Weight__Group__0__Impl rule__Weight__Group__1 ;
    public final void rule__Weight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:305:1: ( rule__Weight__Group__0__Impl rule__Weight__Group__1 )
            // InternalOltl.g:306:2: rule__Weight__Group__0__Impl rule__Weight__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Weight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Weight__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weight__Group__0"


    // $ANTLR start "rule__Weight__Group__0__Impl"
    // InternalOltl.g:313:1: rule__Weight__Group__0__Impl : ( ( rule__Weight__NegAssignment_0 )? ) ;
    public final void rule__Weight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:317:1: ( ( ( rule__Weight__NegAssignment_0 )? ) )
            // InternalOltl.g:318:1: ( ( rule__Weight__NegAssignment_0 )? )
            {
            // InternalOltl.g:318:1: ( ( rule__Weight__NegAssignment_0 )? )
            // InternalOltl.g:319:2: ( rule__Weight__NegAssignment_0 )?
            {
             before(grammarAccess.getWeightAccess().getNegAssignment_0()); 
            // InternalOltl.g:320:2: ( rule__Weight__NegAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOltl.g:320:3: rule__Weight__NegAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Weight__NegAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWeightAccess().getNegAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weight__Group__0__Impl"


    // $ANTLR start "rule__Weight__Group__1"
    // InternalOltl.g:328:1: rule__Weight__Group__1 : rule__Weight__Group__1__Impl ;
    public final void rule__Weight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:332:1: ( rule__Weight__Group__1__Impl )
            // InternalOltl.g:333:2: rule__Weight__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Weight__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weight__Group__1"


    // $ANTLR start "rule__Weight__Group__1__Impl"
    // InternalOltl.g:339:1: rule__Weight__Group__1__Impl : ( ( rule__Weight__Alternatives_1 ) ) ;
    public final void rule__Weight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:343:1: ( ( ( rule__Weight__Alternatives_1 ) ) )
            // InternalOltl.g:344:1: ( ( rule__Weight__Alternatives_1 ) )
            {
            // InternalOltl.g:344:1: ( ( rule__Weight__Alternatives_1 ) )
            // InternalOltl.g:345:2: ( rule__Weight__Alternatives_1 )
            {
             before(grammarAccess.getWeightAccess().getAlternatives_1()); 
            // InternalOltl.g:346:2: ( rule__Weight__Alternatives_1 )
            // InternalOltl.g:346:3: rule__Weight__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Weight__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getWeightAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weight__Group__1__Impl"


    // $ANTLR start "rule__WFloat__Group__0"
    // InternalOltl.g:355:1: rule__WFloat__Group__0 : rule__WFloat__Group__0__Impl rule__WFloat__Group__1 ;
    public final void rule__WFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:359:1: ( rule__WFloat__Group__0__Impl rule__WFloat__Group__1 )
            // InternalOltl.g:360:2: rule__WFloat__Group__0__Impl rule__WFloat__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__WFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WFloat__Group__0"


    // $ANTLR start "rule__WFloat__Group__0__Impl"
    // InternalOltl.g:367:1: rule__WFloat__Group__0__Impl : ( ( rule__WFloat__Int1Assignment_0 ) ) ;
    public final void rule__WFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:371:1: ( ( ( rule__WFloat__Int1Assignment_0 ) ) )
            // InternalOltl.g:372:1: ( ( rule__WFloat__Int1Assignment_0 ) )
            {
            // InternalOltl.g:372:1: ( ( rule__WFloat__Int1Assignment_0 ) )
            // InternalOltl.g:373:2: ( rule__WFloat__Int1Assignment_0 )
            {
             before(grammarAccess.getWFloatAccess().getInt1Assignment_0()); 
            // InternalOltl.g:374:2: ( rule__WFloat__Int1Assignment_0 )
            // InternalOltl.g:374:3: rule__WFloat__Int1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WFloat__Int1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWFloatAccess().getInt1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WFloat__Group__0__Impl"


    // $ANTLR start "rule__WFloat__Group__1"
    // InternalOltl.g:382:1: rule__WFloat__Group__1 : rule__WFloat__Group__1__Impl rule__WFloat__Group__2 ;
    public final void rule__WFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:386:1: ( rule__WFloat__Group__1__Impl rule__WFloat__Group__2 )
            // InternalOltl.g:387:2: rule__WFloat__Group__1__Impl rule__WFloat__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__WFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WFloat__Group__1"


    // $ANTLR start "rule__WFloat__Group__1__Impl"
    // InternalOltl.g:394:1: rule__WFloat__Group__1__Impl : ( '.' ) ;
    public final void rule__WFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:398:1: ( ( '.' ) )
            // InternalOltl.g:399:1: ( '.' )
            {
            // InternalOltl.g:399:1: ( '.' )
            // InternalOltl.g:400:2: '.'
            {
             before(grammarAccess.getWFloatAccess().getFullStopKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWFloatAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WFloat__Group__1__Impl"


    // $ANTLR start "rule__WFloat__Group__2"
    // InternalOltl.g:409:1: rule__WFloat__Group__2 : rule__WFloat__Group__2__Impl ;
    public final void rule__WFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:413:1: ( rule__WFloat__Group__2__Impl )
            // InternalOltl.g:414:2: rule__WFloat__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WFloat__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WFloat__Group__2"


    // $ANTLR start "rule__WFloat__Group__2__Impl"
    // InternalOltl.g:420:1: rule__WFloat__Group__2__Impl : ( ( rule__WFloat__Int2Assignment_2 ) ) ;
    public final void rule__WFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:424:1: ( ( ( rule__WFloat__Int2Assignment_2 ) ) )
            // InternalOltl.g:425:1: ( ( rule__WFloat__Int2Assignment_2 ) )
            {
            // InternalOltl.g:425:1: ( ( rule__WFloat__Int2Assignment_2 ) )
            // InternalOltl.g:426:2: ( rule__WFloat__Int2Assignment_2 )
            {
             before(grammarAccess.getWFloatAccess().getInt2Assignment_2()); 
            // InternalOltl.g:427:2: ( rule__WFloat__Int2Assignment_2 )
            // InternalOltl.g:427:3: rule__WFloat__Int2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WFloat__Int2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWFloatAccess().getInt2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WFloat__Group__2__Impl"


    // $ANTLR start "rule__TempFormula__Group_1__0"
    // InternalOltl.g:436:1: rule__TempFormula__Group_1__0 : rule__TempFormula__Group_1__0__Impl rule__TempFormula__Group_1__1 ;
    public final void rule__TempFormula__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:440:1: ( rule__TempFormula__Group_1__0__Impl rule__TempFormula__Group_1__1 )
            // InternalOltl.g:441:2: rule__TempFormula__Group_1__0__Impl rule__TempFormula__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__TempFormula__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_1__0"


    // $ANTLR start "rule__TempFormula__Group_1__0__Impl"
    // InternalOltl.g:448:1: rule__TempFormula__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:452:1: ( ( '(' ) )
            // InternalOltl.g:453:1: ( '(' )
            {
            // InternalOltl.g:453:1: ( '(' )
            // InternalOltl.g:454:2: '('
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_1__0__Impl"


    // $ANTLR start "rule__TempFormula__Group_1__1"
    // InternalOltl.g:463:1: rule__TempFormula__Group_1__1 : rule__TempFormula__Group_1__1__Impl rule__TempFormula__Group_1__2 ;
    public final void rule__TempFormula__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:467:1: ( rule__TempFormula__Group_1__1__Impl rule__TempFormula__Group_1__2 )
            // InternalOltl.g:468:2: rule__TempFormula__Group_1__1__Impl rule__TempFormula__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__TempFormula__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_1__1"


    // $ANTLR start "rule__TempFormula__Group_1__1__Impl"
    // InternalOltl.g:475:1: rule__TempFormula__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__TempFormula__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:479:1: ( ( '&&' ) )
            // InternalOltl.g:480:1: ( '&&' )
            {
            // InternalOltl.g:480:1: ( '&&' )
            // InternalOltl.g:481:2: '&&'
            {
             before(grammarAccess.getTempFormulaAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getAmpersandAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_1__1__Impl"


    // $ANTLR start "rule__TempFormula__Group_1__2"
    // InternalOltl.g:490:1: rule__TempFormula__Group_1__2 : rule__TempFormula__Group_1__2__Impl rule__TempFormula__Group_1__3 ;
    public final void rule__TempFormula__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:494:1: ( rule__TempFormula__Group_1__2__Impl rule__TempFormula__Group_1__3 )
            // InternalOltl.g:495:2: rule__TempFormula__Group_1__2__Impl rule__TempFormula__Group_1__3
            {
            pushFollow(FOLLOW_7);
            rule__TempFormula__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_1__2"


    // $ANTLR start "rule__TempFormula__Group_1__2__Impl"
    // InternalOltl.g:502:1: rule__TempFormula__Group_1__2__Impl : ( ( ( rule__TempFormula__FaAssignment_1_2 ) ) ( ( rule__TempFormula__FaAssignment_1_2 )* ) ) ;
    public final void rule__TempFormula__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:506:1: ( ( ( ( rule__TempFormula__FaAssignment_1_2 ) ) ( ( rule__TempFormula__FaAssignment_1_2 )* ) ) )
            // InternalOltl.g:507:1: ( ( ( rule__TempFormula__FaAssignment_1_2 ) ) ( ( rule__TempFormula__FaAssignment_1_2 )* ) )
            {
            // InternalOltl.g:507:1: ( ( ( rule__TempFormula__FaAssignment_1_2 ) ) ( ( rule__TempFormula__FaAssignment_1_2 )* ) )
            // InternalOltl.g:508:2: ( ( rule__TempFormula__FaAssignment_1_2 ) ) ( ( rule__TempFormula__FaAssignment_1_2 )* )
            {
            // InternalOltl.g:508:2: ( ( rule__TempFormula__FaAssignment_1_2 ) )
            // InternalOltl.g:509:3: ( rule__TempFormula__FaAssignment_1_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getFaAssignment_1_2()); 
            // InternalOltl.g:510:3: ( rule__TempFormula__FaAssignment_1_2 )
            // InternalOltl.g:510:4: rule__TempFormula__FaAssignment_1_2
            {
            pushFollow(FOLLOW_8);
            rule__TempFormula__FaAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getFaAssignment_1_2()); 

            }

            // InternalOltl.g:513:2: ( ( rule__TempFormula__FaAssignment_1_2 )* )
            // InternalOltl.g:514:3: ( rule__TempFormula__FaAssignment_1_2 )*
            {
             before(grammarAccess.getTempFormulaAccess().getFaAssignment_1_2()); 
            // InternalOltl.g:515:3: ( rule__TempFormula__FaAssignment_1_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOltl.g:515:4: rule__TempFormula__FaAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TempFormula__FaAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTempFormulaAccess().getFaAssignment_1_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_1__2__Impl"


    // $ANTLR start "rule__TempFormula__Group_1__3"
    // InternalOltl.g:524:1: rule__TempFormula__Group_1__3 : rule__TempFormula__Group_1__3__Impl ;
    public final void rule__TempFormula__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:528:1: ( rule__TempFormula__Group_1__3__Impl )
            // InternalOltl.g:529:2: rule__TempFormula__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_1__3"


    // $ANTLR start "rule__TempFormula__Group_1__3__Impl"
    // InternalOltl.g:535:1: rule__TempFormula__Group_1__3__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:539:1: ( ( ')' ) )
            // InternalOltl.g:540:1: ( ')' )
            {
            // InternalOltl.g:540:1: ( ')' )
            // InternalOltl.g:541:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_1_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_1__3__Impl"


    // $ANTLR start "rule__TempFormula__Group_2__0"
    // InternalOltl.g:551:1: rule__TempFormula__Group_2__0 : rule__TempFormula__Group_2__0__Impl rule__TempFormula__Group_2__1 ;
    public final void rule__TempFormula__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:555:1: ( rule__TempFormula__Group_2__0__Impl rule__TempFormula__Group_2__1 )
            // InternalOltl.g:556:2: rule__TempFormula__Group_2__0__Impl rule__TempFormula__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__TempFormula__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_2__0"


    // $ANTLR start "rule__TempFormula__Group_2__0__Impl"
    // InternalOltl.g:563:1: rule__TempFormula__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:567:1: ( ( '(' ) )
            // InternalOltl.g:568:1: ( '(' )
            {
            // InternalOltl.g:568:1: ( '(' )
            // InternalOltl.g:569:2: '('
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_2__0__Impl"


    // $ANTLR start "rule__TempFormula__Group_2__1"
    // InternalOltl.g:578:1: rule__TempFormula__Group_2__1 : rule__TempFormula__Group_2__1__Impl rule__TempFormula__Group_2__2 ;
    public final void rule__TempFormula__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:582:1: ( rule__TempFormula__Group_2__1__Impl rule__TempFormula__Group_2__2 )
            // InternalOltl.g:583:2: rule__TempFormula__Group_2__1__Impl rule__TempFormula__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__TempFormula__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_2__1"


    // $ANTLR start "rule__TempFormula__Group_2__1__Impl"
    // InternalOltl.g:590:1: rule__TempFormula__Group_2__1__Impl : ( '||' ) ;
    public final void rule__TempFormula__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:594:1: ( ( '||' ) )
            // InternalOltl.g:595:1: ( '||' )
            {
            // InternalOltl.g:595:1: ( '||' )
            // InternalOltl.g:596:2: '||'
            {
             before(grammarAccess.getTempFormulaAccess().getVerticalLineVerticalLineKeyword_2_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getVerticalLineVerticalLineKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_2__1__Impl"


    // $ANTLR start "rule__TempFormula__Group_2__2"
    // InternalOltl.g:605:1: rule__TempFormula__Group_2__2 : rule__TempFormula__Group_2__2__Impl rule__TempFormula__Group_2__3 ;
    public final void rule__TempFormula__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:609:1: ( rule__TempFormula__Group_2__2__Impl rule__TempFormula__Group_2__3 )
            // InternalOltl.g:610:2: rule__TempFormula__Group_2__2__Impl rule__TempFormula__Group_2__3
            {
            pushFollow(FOLLOW_7);
            rule__TempFormula__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_2__2"


    // $ANTLR start "rule__TempFormula__Group_2__2__Impl"
    // InternalOltl.g:617:1: rule__TempFormula__Group_2__2__Impl : ( ( ( rule__TempFormula__FoAssignment_2_2 ) ) ( ( rule__TempFormula__FoAssignment_2_2 )* ) ) ;
    public final void rule__TempFormula__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:621:1: ( ( ( ( rule__TempFormula__FoAssignment_2_2 ) ) ( ( rule__TempFormula__FoAssignment_2_2 )* ) ) )
            // InternalOltl.g:622:1: ( ( ( rule__TempFormula__FoAssignment_2_2 ) ) ( ( rule__TempFormula__FoAssignment_2_2 )* ) )
            {
            // InternalOltl.g:622:1: ( ( ( rule__TempFormula__FoAssignment_2_2 ) ) ( ( rule__TempFormula__FoAssignment_2_2 )* ) )
            // InternalOltl.g:623:2: ( ( rule__TempFormula__FoAssignment_2_2 ) ) ( ( rule__TempFormula__FoAssignment_2_2 )* )
            {
            // InternalOltl.g:623:2: ( ( rule__TempFormula__FoAssignment_2_2 ) )
            // InternalOltl.g:624:3: ( rule__TempFormula__FoAssignment_2_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getFoAssignment_2_2()); 
            // InternalOltl.g:625:3: ( rule__TempFormula__FoAssignment_2_2 )
            // InternalOltl.g:625:4: rule__TempFormula__FoAssignment_2_2
            {
            pushFollow(FOLLOW_8);
            rule__TempFormula__FoAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getFoAssignment_2_2()); 

            }

            // InternalOltl.g:628:2: ( ( rule__TempFormula__FoAssignment_2_2 )* )
            // InternalOltl.g:629:3: ( rule__TempFormula__FoAssignment_2_2 )*
            {
             before(grammarAccess.getTempFormulaAccess().getFoAssignment_2_2()); 
            // InternalOltl.g:630:3: ( rule__TempFormula__FoAssignment_2_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOltl.g:630:4: rule__TempFormula__FoAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TempFormula__FoAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTempFormulaAccess().getFoAssignment_2_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_2__2__Impl"


    // $ANTLR start "rule__TempFormula__Group_2__3"
    // InternalOltl.g:639:1: rule__TempFormula__Group_2__3 : rule__TempFormula__Group_2__3__Impl ;
    public final void rule__TempFormula__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:643:1: ( rule__TempFormula__Group_2__3__Impl )
            // InternalOltl.g:644:2: rule__TempFormula__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_2__3"


    // $ANTLR start "rule__TempFormula__Group_2__3__Impl"
    // InternalOltl.g:650:1: rule__TempFormula__Group_2__3__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:654:1: ( ( ')' ) )
            // InternalOltl.g:655:1: ( ')' )
            {
            // InternalOltl.g:655:1: ( ')' )
            // InternalOltl.g:656:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_2_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_2__3__Impl"


    // $ANTLR start "rule__TempFormula__Group_3__0"
    // InternalOltl.g:666:1: rule__TempFormula__Group_3__0 : rule__TempFormula__Group_3__0__Impl rule__TempFormula__Group_3__1 ;
    public final void rule__TempFormula__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:670:1: ( rule__TempFormula__Group_3__0__Impl rule__TempFormula__Group_3__1 )
            // InternalOltl.g:671:2: rule__TempFormula__Group_3__0__Impl rule__TempFormula__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__TempFormula__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_3__0"


    // $ANTLR start "rule__TempFormula__Group_3__0__Impl"
    // InternalOltl.g:678:1: rule__TempFormula__Group_3__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:682:1: ( ( '(' ) )
            // InternalOltl.g:683:1: ( '(' )
            {
            // InternalOltl.g:683:1: ( '(' )
            // InternalOltl.g:684:2: '('
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_3__0__Impl"


    // $ANTLR start "rule__TempFormula__Group_3__1"
    // InternalOltl.g:693:1: rule__TempFormula__Group_3__1 : rule__TempFormula__Group_3__1__Impl rule__TempFormula__Group_3__2 ;
    public final void rule__TempFormula__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:697:1: ( rule__TempFormula__Group_3__1__Impl rule__TempFormula__Group_3__2 )
            // InternalOltl.g:698:2: rule__TempFormula__Group_3__1__Impl rule__TempFormula__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__TempFormula__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_3__1"


    // $ANTLR start "rule__TempFormula__Group_3__1__Impl"
    // InternalOltl.g:705:1: rule__TempFormula__Group_3__1__Impl : ( '!!' ) ;
    public final void rule__TempFormula__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:709:1: ( ( '!!' ) )
            // InternalOltl.g:710:1: ( '!!' )
            {
            // InternalOltl.g:710:1: ( '!!' )
            // InternalOltl.g:711:2: '!!'
            {
             before(grammarAccess.getTempFormulaAccess().getExclamationMarkExclamationMarkKeyword_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getExclamationMarkExclamationMarkKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_3__1__Impl"


    // $ANTLR start "rule__TempFormula__Group_3__2"
    // InternalOltl.g:720:1: rule__TempFormula__Group_3__2 : rule__TempFormula__Group_3__2__Impl rule__TempFormula__Group_3__3 ;
    public final void rule__TempFormula__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:724:1: ( rule__TempFormula__Group_3__2__Impl rule__TempFormula__Group_3__3 )
            // InternalOltl.g:725:2: rule__TempFormula__Group_3__2__Impl rule__TempFormula__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__TempFormula__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_3__2"


    // $ANTLR start "rule__TempFormula__Group_3__2__Impl"
    // InternalOltl.g:732:1: rule__TempFormula__Group_3__2__Impl : ( ( rule__TempFormula__FnotAssignment_3_2 ) ) ;
    public final void rule__TempFormula__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:736:1: ( ( ( rule__TempFormula__FnotAssignment_3_2 ) ) )
            // InternalOltl.g:737:1: ( ( rule__TempFormula__FnotAssignment_3_2 ) )
            {
            // InternalOltl.g:737:1: ( ( rule__TempFormula__FnotAssignment_3_2 ) )
            // InternalOltl.g:738:2: ( rule__TempFormula__FnotAssignment_3_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getFnotAssignment_3_2()); 
            // InternalOltl.g:739:2: ( rule__TempFormula__FnotAssignment_3_2 )
            // InternalOltl.g:739:3: rule__TempFormula__FnotAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__FnotAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getFnotAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_3__2__Impl"


    // $ANTLR start "rule__TempFormula__Group_3__3"
    // InternalOltl.g:747:1: rule__TempFormula__Group_3__3 : rule__TempFormula__Group_3__3__Impl ;
    public final void rule__TempFormula__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:751:1: ( rule__TempFormula__Group_3__3__Impl )
            // InternalOltl.g:752:2: rule__TempFormula__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_3__3"


    // $ANTLR start "rule__TempFormula__Group_3__3__Impl"
    // InternalOltl.g:758:1: rule__TempFormula__Group_3__3__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:762:1: ( ( ')' ) )
            // InternalOltl.g:763:1: ( ')' )
            {
            // InternalOltl.g:763:1: ( ')' )
            // InternalOltl.g:764:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_3_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_3__3__Impl"


    // $ANTLR start "rule__TempFormula__Group_4__0"
    // InternalOltl.g:774:1: rule__TempFormula__Group_4__0 : rule__TempFormula__Group_4__0__Impl rule__TempFormula__Group_4__1 ;
    public final void rule__TempFormula__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:778:1: ( rule__TempFormula__Group_4__0__Impl rule__TempFormula__Group_4__1 )
            // InternalOltl.g:779:2: rule__TempFormula__Group_4__0__Impl rule__TempFormula__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__TempFormula__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_4__0"


    // $ANTLR start "rule__TempFormula__Group_4__0__Impl"
    // InternalOltl.g:786:1: rule__TempFormula__Group_4__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:790:1: ( ( '(' ) )
            // InternalOltl.g:791:1: ( '(' )
            {
            // InternalOltl.g:791:1: ( '(' )
            // InternalOltl.g:792:2: '('
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_4__0__Impl"


    // $ANTLR start "rule__TempFormula__Group_4__1"
    // InternalOltl.g:801:1: rule__TempFormula__Group_4__1 : rule__TempFormula__Group_4__1__Impl rule__TempFormula__Group_4__2 ;
    public final void rule__TempFormula__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:805:1: ( rule__TempFormula__Group_4__1__Impl rule__TempFormula__Group_4__2 )
            // InternalOltl.g:806:2: rule__TempFormula__Group_4__1__Impl rule__TempFormula__Group_4__2
            {
            pushFollow(FOLLOW_6);
            rule__TempFormula__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_4__1"


    // $ANTLR start "rule__TempFormula__Group_4__1__Impl"
    // InternalOltl.g:813:1: rule__TempFormula__Group_4__1__Impl : ( ( rule__TempFormula__Op2Assignment_4_1 ) ) ;
    public final void rule__TempFormula__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:817:1: ( ( ( rule__TempFormula__Op2Assignment_4_1 ) ) )
            // InternalOltl.g:818:1: ( ( rule__TempFormula__Op2Assignment_4_1 ) )
            {
            // InternalOltl.g:818:1: ( ( rule__TempFormula__Op2Assignment_4_1 ) )
            // InternalOltl.g:819:2: ( rule__TempFormula__Op2Assignment_4_1 )
            {
             before(grammarAccess.getTempFormulaAccess().getOp2Assignment_4_1()); 
            // InternalOltl.g:820:2: ( rule__TempFormula__Op2Assignment_4_1 )
            // InternalOltl.g:820:3: rule__TempFormula__Op2Assignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__Op2Assignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getOp2Assignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_4__1__Impl"


    // $ANTLR start "rule__TempFormula__Group_4__2"
    // InternalOltl.g:828:1: rule__TempFormula__Group_4__2 : rule__TempFormula__Group_4__2__Impl rule__TempFormula__Group_4__3 ;
    public final void rule__TempFormula__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:832:1: ( rule__TempFormula__Group_4__2__Impl rule__TempFormula__Group_4__3 )
            // InternalOltl.g:833:2: rule__TempFormula__Group_4__2__Impl rule__TempFormula__Group_4__3
            {
            pushFollow(FOLLOW_6);
            rule__TempFormula__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_4__2"


    // $ANTLR start "rule__TempFormula__Group_4__2__Impl"
    // InternalOltl.g:840:1: rule__TempFormula__Group_4__2__Impl : ( ( rule__TempFormula__F1Assignment_4_2 ) ) ;
    public final void rule__TempFormula__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:844:1: ( ( ( rule__TempFormula__F1Assignment_4_2 ) ) )
            // InternalOltl.g:845:1: ( ( rule__TempFormula__F1Assignment_4_2 ) )
            {
            // InternalOltl.g:845:1: ( ( rule__TempFormula__F1Assignment_4_2 ) )
            // InternalOltl.g:846:2: ( rule__TempFormula__F1Assignment_4_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getF1Assignment_4_2()); 
            // InternalOltl.g:847:2: ( rule__TempFormula__F1Assignment_4_2 )
            // InternalOltl.g:847:3: rule__TempFormula__F1Assignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__F1Assignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getF1Assignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_4__2__Impl"


    // $ANTLR start "rule__TempFormula__Group_4__3"
    // InternalOltl.g:855:1: rule__TempFormula__Group_4__3 : rule__TempFormula__Group_4__3__Impl rule__TempFormula__Group_4__4 ;
    public final void rule__TempFormula__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:859:1: ( rule__TempFormula__Group_4__3__Impl rule__TempFormula__Group_4__4 )
            // InternalOltl.g:860:2: rule__TempFormula__Group_4__3__Impl rule__TempFormula__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__TempFormula__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_4__3"


    // $ANTLR start "rule__TempFormula__Group_4__3__Impl"
    // InternalOltl.g:867:1: rule__TempFormula__Group_4__3__Impl : ( ( rule__TempFormula__F2Assignment_4_3 ) ) ;
    public final void rule__TempFormula__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:871:1: ( ( ( rule__TempFormula__F2Assignment_4_3 ) ) )
            // InternalOltl.g:872:1: ( ( rule__TempFormula__F2Assignment_4_3 ) )
            {
            // InternalOltl.g:872:1: ( ( rule__TempFormula__F2Assignment_4_3 ) )
            // InternalOltl.g:873:2: ( rule__TempFormula__F2Assignment_4_3 )
            {
             before(grammarAccess.getTempFormulaAccess().getF2Assignment_4_3()); 
            // InternalOltl.g:874:2: ( rule__TempFormula__F2Assignment_4_3 )
            // InternalOltl.g:874:3: rule__TempFormula__F2Assignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__F2Assignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getF2Assignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_4__3__Impl"


    // $ANTLR start "rule__TempFormula__Group_4__4"
    // InternalOltl.g:882:1: rule__TempFormula__Group_4__4 : rule__TempFormula__Group_4__4__Impl ;
    public final void rule__TempFormula__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:886:1: ( rule__TempFormula__Group_4__4__Impl )
            // InternalOltl.g:887:2: rule__TempFormula__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_4__4"


    // $ANTLR start "rule__TempFormula__Group_4__4__Impl"
    // InternalOltl.g:893:1: rule__TempFormula__Group_4__4__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:897:1: ( ( ')' ) )
            // InternalOltl.g:898:1: ( ')' )
            {
            // InternalOltl.g:898:1: ( ')' )
            // InternalOltl.g:899:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_4_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_4__4__Impl"


    // $ANTLR start "rule__TempFormula__Group_5__0"
    // InternalOltl.g:909:1: rule__TempFormula__Group_5__0 : rule__TempFormula__Group_5__0__Impl rule__TempFormula__Group_5__1 ;
    public final void rule__TempFormula__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:913:1: ( rule__TempFormula__Group_5__0__Impl rule__TempFormula__Group_5__1 )
            // InternalOltl.g:914:2: rule__TempFormula__Group_5__0__Impl rule__TempFormula__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__TempFormula__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_5__0"


    // $ANTLR start "rule__TempFormula__Group_5__0__Impl"
    // InternalOltl.g:921:1: rule__TempFormula__Group_5__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:925:1: ( ( '(' ) )
            // InternalOltl.g:926:1: ( '(' )
            {
            // InternalOltl.g:926:1: ( '(' )
            // InternalOltl.g:927:2: '('
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_5__0__Impl"


    // $ANTLR start "rule__TempFormula__Group_5__1"
    // InternalOltl.g:936:1: rule__TempFormula__Group_5__1 : rule__TempFormula__Group_5__1__Impl rule__TempFormula__Group_5__2 ;
    public final void rule__TempFormula__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:940:1: ( rule__TempFormula__Group_5__1__Impl rule__TempFormula__Group_5__2 )
            // InternalOltl.g:941:2: rule__TempFormula__Group_5__1__Impl rule__TempFormula__Group_5__2
            {
            pushFollow(FOLLOW_6);
            rule__TempFormula__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_5__1"


    // $ANTLR start "rule__TempFormula__Group_5__1__Impl"
    // InternalOltl.g:948:1: rule__TempFormula__Group_5__1__Impl : ( ( rule__TempFormula__OpfAssignment_5_1 ) ) ;
    public final void rule__TempFormula__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:952:1: ( ( ( rule__TempFormula__OpfAssignment_5_1 ) ) )
            // InternalOltl.g:953:1: ( ( rule__TempFormula__OpfAssignment_5_1 ) )
            {
            // InternalOltl.g:953:1: ( ( rule__TempFormula__OpfAssignment_5_1 ) )
            // InternalOltl.g:954:2: ( rule__TempFormula__OpfAssignment_5_1 )
            {
             before(grammarAccess.getTempFormulaAccess().getOpfAssignment_5_1()); 
            // InternalOltl.g:955:2: ( rule__TempFormula__OpfAssignment_5_1 )
            // InternalOltl.g:955:3: rule__TempFormula__OpfAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__OpfAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getOpfAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_5__1__Impl"


    // $ANTLR start "rule__TempFormula__Group_5__2"
    // InternalOltl.g:963:1: rule__TempFormula__Group_5__2 : rule__TempFormula__Group_5__2__Impl rule__TempFormula__Group_5__3 ;
    public final void rule__TempFormula__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:967:1: ( rule__TempFormula__Group_5__2__Impl rule__TempFormula__Group_5__3 )
            // InternalOltl.g:968:2: rule__TempFormula__Group_5__2__Impl rule__TempFormula__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__TempFormula__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_5__2"


    // $ANTLR start "rule__TempFormula__Group_5__2__Impl"
    // InternalOltl.g:975:1: rule__TempFormula__Group_5__2__Impl : ( ( rule__TempFormula__FAssignment_5_2 ) ) ;
    public final void rule__TempFormula__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:979:1: ( ( ( rule__TempFormula__FAssignment_5_2 ) ) )
            // InternalOltl.g:980:1: ( ( rule__TempFormula__FAssignment_5_2 ) )
            {
            // InternalOltl.g:980:1: ( ( rule__TempFormula__FAssignment_5_2 ) )
            // InternalOltl.g:981:2: ( rule__TempFormula__FAssignment_5_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getFAssignment_5_2()); 
            // InternalOltl.g:982:2: ( rule__TempFormula__FAssignment_5_2 )
            // InternalOltl.g:982:3: rule__TempFormula__FAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__FAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getFAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_5__2__Impl"


    // $ANTLR start "rule__TempFormula__Group_5__3"
    // InternalOltl.g:990:1: rule__TempFormula__Group_5__3 : rule__TempFormula__Group_5__3__Impl ;
    public final void rule__TempFormula__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:994:1: ( rule__TempFormula__Group_5__3__Impl )
            // InternalOltl.g:995:2: rule__TempFormula__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_5__3"


    // $ANTLR start "rule__TempFormula__Group_5__3__Impl"
    // InternalOltl.g:1001:1: rule__TempFormula__Group_5__3__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1005:1: ( ( ')' ) )
            // InternalOltl.g:1006:1: ( ')' )
            {
            // InternalOltl.g:1006:1: ( ')' )
            // InternalOltl.g:1007:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_5_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_5__3__Impl"


    // $ANTLR start "rule__TempFormula__Group_6__0"
    // InternalOltl.g:1017:1: rule__TempFormula__Group_6__0 : rule__TempFormula__Group_6__0__Impl rule__TempFormula__Group_6__1 ;
    public final void rule__TempFormula__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1021:1: ( rule__TempFormula__Group_6__0__Impl rule__TempFormula__Group_6__1 )
            // InternalOltl.g:1022:2: rule__TempFormula__Group_6__0__Impl rule__TempFormula__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__TempFormula__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_6__0"


    // $ANTLR start "rule__TempFormula__Group_6__0__Impl"
    // InternalOltl.g:1029:1: rule__TempFormula__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1033:1: ( ( '(' ) )
            // InternalOltl.g:1034:1: ( '(' )
            {
            // InternalOltl.g:1034:1: ( '(' )
            // InternalOltl.g:1035:2: '('
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_6__0__Impl"


    // $ANTLR start "rule__TempFormula__Group_6__1"
    // InternalOltl.g:1044:1: rule__TempFormula__Group_6__1 : rule__TempFormula__Group_6__1__Impl rule__TempFormula__Group_6__2 ;
    public final void rule__TempFormula__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1048:1: ( rule__TempFormula__Group_6__1__Impl rule__TempFormula__Group_6__2 )
            // InternalOltl.g:1049:2: rule__TempFormula__Group_6__1__Impl rule__TempFormula__Group_6__2
            {
            pushFollow(FOLLOW_6);
            rule__TempFormula__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_6__1"


    // $ANTLR start "rule__TempFormula__Group_6__1__Impl"
    // InternalOltl.g:1056:1: rule__TempFormula__Group_6__1__Impl : ( 'w' ) ;
    public final void rule__TempFormula__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1060:1: ( ( 'w' ) )
            // InternalOltl.g:1061:1: ( 'w' )
            {
            // InternalOltl.g:1061:1: ( 'w' )
            // InternalOltl.g:1062:2: 'w'
            {
             before(grammarAccess.getTempFormulaAccess().getWKeyword_6_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getWKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_6__1__Impl"


    // $ANTLR start "rule__TempFormula__Group_6__2"
    // InternalOltl.g:1071:1: rule__TempFormula__Group_6__2 : rule__TempFormula__Group_6__2__Impl rule__TempFormula__Group_6__3 ;
    public final void rule__TempFormula__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1075:1: ( rule__TempFormula__Group_6__2__Impl rule__TempFormula__Group_6__3 )
            // InternalOltl.g:1076:2: rule__TempFormula__Group_6__2__Impl rule__TempFormula__Group_6__3
            {
            pushFollow(FOLLOW_14);
            rule__TempFormula__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_6__2"


    // $ANTLR start "rule__TempFormula__Group_6__2__Impl"
    // InternalOltl.g:1083:1: rule__TempFormula__Group_6__2__Impl : ( ( rule__TempFormula__ApAssignment_6_2 ) ) ;
    public final void rule__TempFormula__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1087:1: ( ( ( rule__TempFormula__ApAssignment_6_2 ) ) )
            // InternalOltl.g:1088:1: ( ( rule__TempFormula__ApAssignment_6_2 ) )
            {
            // InternalOltl.g:1088:1: ( ( rule__TempFormula__ApAssignment_6_2 ) )
            // InternalOltl.g:1089:2: ( rule__TempFormula__ApAssignment_6_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getApAssignment_6_2()); 
            // InternalOltl.g:1090:2: ( rule__TempFormula__ApAssignment_6_2 )
            // InternalOltl.g:1090:3: rule__TempFormula__ApAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__ApAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getApAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_6__2__Impl"


    // $ANTLR start "rule__TempFormula__Group_6__3"
    // InternalOltl.g:1098:1: rule__TempFormula__Group_6__3 : rule__TempFormula__Group_6__3__Impl rule__TempFormula__Group_6__4 ;
    public final void rule__TempFormula__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1102:1: ( rule__TempFormula__Group_6__3__Impl rule__TempFormula__Group_6__4 )
            // InternalOltl.g:1103:2: rule__TempFormula__Group_6__3__Impl rule__TempFormula__Group_6__4
            {
            pushFollow(FOLLOW_7);
            rule__TempFormula__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_6__3"


    // $ANTLR start "rule__TempFormula__Group_6__3__Impl"
    // InternalOltl.g:1110:1: rule__TempFormula__Group_6__3__Impl : ( ( rule__TempFormula__WeightAssignment_6_3 ) ) ;
    public final void rule__TempFormula__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1114:1: ( ( ( rule__TempFormula__WeightAssignment_6_3 ) ) )
            // InternalOltl.g:1115:1: ( ( rule__TempFormula__WeightAssignment_6_3 ) )
            {
            // InternalOltl.g:1115:1: ( ( rule__TempFormula__WeightAssignment_6_3 ) )
            // InternalOltl.g:1116:2: ( rule__TempFormula__WeightAssignment_6_3 )
            {
             before(grammarAccess.getTempFormulaAccess().getWeightAssignment_6_3()); 
            // InternalOltl.g:1117:2: ( rule__TempFormula__WeightAssignment_6_3 )
            // InternalOltl.g:1117:3: rule__TempFormula__WeightAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__WeightAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getWeightAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_6__3__Impl"


    // $ANTLR start "rule__TempFormula__Group_6__4"
    // InternalOltl.g:1125:1: rule__TempFormula__Group_6__4 : rule__TempFormula__Group_6__4__Impl ;
    public final void rule__TempFormula__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1129:1: ( rule__TempFormula__Group_6__4__Impl )
            // InternalOltl.g:1130:2: rule__TempFormula__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_6__4"


    // $ANTLR start "rule__TempFormula__Group_6__4__Impl"
    // InternalOltl.g:1136:1: rule__TempFormula__Group_6__4__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1140:1: ( ( ')' ) )
            // InternalOltl.g:1141:1: ( ')' )
            {
            // InternalOltl.g:1141:1: ( ')' )
            // InternalOltl.g:1142:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_6_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_6__4__Impl"


    // $ANTLR start "rule__TempFormula__Group_7__0"
    // InternalOltl.g:1152:1: rule__TempFormula__Group_7__0 : rule__TempFormula__Group_7__0__Impl rule__TempFormula__Group_7__1 ;
    public final void rule__TempFormula__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1156:1: ( rule__TempFormula__Group_7__0__Impl rule__TempFormula__Group_7__1 )
            // InternalOltl.g:1157:2: rule__TempFormula__Group_7__0__Impl rule__TempFormula__Group_7__1
            {
            pushFollow(FOLLOW_15);
            rule__TempFormula__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_7__0"


    // $ANTLR start "rule__TempFormula__Group_7__0__Impl"
    // InternalOltl.g:1164:1: rule__TempFormula__Group_7__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1168:1: ( ( '(' ) )
            // InternalOltl.g:1169:1: ( '(' )
            {
            // InternalOltl.g:1169:1: ( '(' )
            // InternalOltl.g:1170:2: '('
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_7__0__Impl"


    // $ANTLR start "rule__TempFormula__Group_7__1"
    // InternalOltl.g:1179:1: rule__TempFormula__Group_7__1 : rule__TempFormula__Group_7__1__Impl rule__TempFormula__Group_7__2 ;
    public final void rule__TempFormula__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1183:1: ( rule__TempFormula__Group_7__1__Impl rule__TempFormula__Group_7__2 )
            // InternalOltl.g:1184:2: rule__TempFormula__Group_7__1__Impl rule__TempFormula__Group_7__2
            {
            pushFollow(FOLLOW_6);
            rule__TempFormula__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_7__1"


    // $ANTLR start "rule__TempFormula__Group_7__1__Impl"
    // InternalOltl.g:1191:1: rule__TempFormula__Group_7__1__Impl : ( 'next' ) ;
    public final void rule__TempFormula__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1195:1: ( ( 'next' ) )
            // InternalOltl.g:1196:1: ( 'next' )
            {
            // InternalOltl.g:1196:1: ( 'next' )
            // InternalOltl.g:1197:2: 'next'
            {
             before(grammarAccess.getTempFormulaAccess().getNextKeyword_7_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getNextKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_7__1__Impl"


    // $ANTLR start "rule__TempFormula__Group_7__2"
    // InternalOltl.g:1206:1: rule__TempFormula__Group_7__2 : rule__TempFormula__Group_7__2__Impl rule__TempFormula__Group_7__3 ;
    public final void rule__TempFormula__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1210:1: ( rule__TempFormula__Group_7__2__Impl rule__TempFormula__Group_7__3 )
            // InternalOltl.g:1211:2: rule__TempFormula__Group_7__2__Impl rule__TempFormula__Group_7__3
            {
            pushFollow(FOLLOW_3);
            rule__TempFormula__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_7__2"


    // $ANTLR start "rule__TempFormula__Group_7__2__Impl"
    // InternalOltl.g:1218:1: rule__TempFormula__Group_7__2__Impl : ( ( rule__TempFormula__FNextAssignment_7_2 ) ) ;
    public final void rule__TempFormula__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1222:1: ( ( ( rule__TempFormula__FNextAssignment_7_2 ) ) )
            // InternalOltl.g:1223:1: ( ( rule__TempFormula__FNextAssignment_7_2 ) )
            {
            // InternalOltl.g:1223:1: ( ( rule__TempFormula__FNextAssignment_7_2 ) )
            // InternalOltl.g:1224:2: ( rule__TempFormula__FNextAssignment_7_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getFNextAssignment_7_2()); 
            // InternalOltl.g:1225:2: ( rule__TempFormula__FNextAssignment_7_2 )
            // InternalOltl.g:1225:3: rule__TempFormula__FNextAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__FNextAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getFNextAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_7__2__Impl"


    // $ANTLR start "rule__TempFormula__Group_7__3"
    // InternalOltl.g:1233:1: rule__TempFormula__Group_7__3 : rule__TempFormula__Group_7__3__Impl rule__TempFormula__Group_7__4 ;
    public final void rule__TempFormula__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1237:1: ( rule__TempFormula__Group_7__3__Impl rule__TempFormula__Group_7__4 )
            // InternalOltl.g:1238:2: rule__TempFormula__Group_7__3__Impl rule__TempFormula__Group_7__4
            {
            pushFollow(FOLLOW_16);
            rule__TempFormula__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_7__3"


    // $ANTLR start "rule__TempFormula__Group_7__3__Impl"
    // InternalOltl.g:1245:1: rule__TempFormula__Group_7__3__Impl : ( ( rule__TempFormula__X1Assignment_7_3 ) ) ;
    public final void rule__TempFormula__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1249:1: ( ( ( rule__TempFormula__X1Assignment_7_3 ) ) )
            // InternalOltl.g:1250:1: ( ( rule__TempFormula__X1Assignment_7_3 ) )
            {
            // InternalOltl.g:1250:1: ( ( rule__TempFormula__X1Assignment_7_3 ) )
            // InternalOltl.g:1251:2: ( rule__TempFormula__X1Assignment_7_3 )
            {
             before(grammarAccess.getTempFormulaAccess().getX1Assignment_7_3()); 
            // InternalOltl.g:1252:2: ( rule__TempFormula__X1Assignment_7_3 )
            // InternalOltl.g:1252:3: rule__TempFormula__X1Assignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__X1Assignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getX1Assignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_7__3__Impl"


    // $ANTLR start "rule__TempFormula__Group_7__4"
    // InternalOltl.g:1260:1: rule__TempFormula__Group_7__4 : rule__TempFormula__Group_7__4__Impl rule__TempFormula__Group_7__5 ;
    public final void rule__TempFormula__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1264:1: ( rule__TempFormula__Group_7__4__Impl rule__TempFormula__Group_7__5 )
            // InternalOltl.g:1265:2: rule__TempFormula__Group_7__4__Impl rule__TempFormula__Group_7__5
            {
            pushFollow(FOLLOW_16);
            rule__TempFormula__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_7__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_7__4"


    // $ANTLR start "rule__TempFormula__Group_7__4__Impl"
    // InternalOltl.g:1272:1: rule__TempFormula__Group_7__4__Impl : ( ( rule__TempFormula__X2Assignment_7_4 )? ) ;
    public final void rule__TempFormula__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1276:1: ( ( ( rule__TempFormula__X2Assignment_7_4 )? ) )
            // InternalOltl.g:1277:1: ( ( rule__TempFormula__X2Assignment_7_4 )? )
            {
            // InternalOltl.g:1277:1: ( ( rule__TempFormula__X2Assignment_7_4 )? )
            // InternalOltl.g:1278:2: ( rule__TempFormula__X2Assignment_7_4 )?
            {
             before(grammarAccess.getTempFormulaAccess().getX2Assignment_7_4()); 
            // InternalOltl.g:1279:2: ( rule__TempFormula__X2Assignment_7_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOltl.g:1279:3: rule__TempFormula__X2Assignment_7_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempFormula__X2Assignment_7_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTempFormulaAccess().getX2Assignment_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_7__4__Impl"


    // $ANTLR start "rule__TempFormula__Group_7__5"
    // InternalOltl.g:1287:1: rule__TempFormula__Group_7__5 : rule__TempFormula__Group_7__5__Impl ;
    public final void rule__TempFormula__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1291:1: ( rule__TempFormula__Group_7__5__Impl )
            // InternalOltl.g:1292:2: rule__TempFormula__Group_7__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_7__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_7__5"


    // $ANTLR start "rule__TempFormula__Group_7__5__Impl"
    // InternalOltl.g:1298:1: rule__TempFormula__Group_7__5__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1302:1: ( ( ')' ) )
            // InternalOltl.g:1303:1: ( ')' )
            {
            // InternalOltl.g:1303:1: ( ')' )
            // InternalOltl.g:1304:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_7_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_7_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Group_7__5__Impl"


    // $ANTLR start "rule__AP__Group__0"
    // InternalOltl.g:1314:1: rule__AP__Group__0 : rule__AP__Group__0__Impl rule__AP__Group__1 ;
    public final void rule__AP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1318:1: ( rule__AP__Group__0__Impl rule__AP__Group__1 )
            // InternalOltl.g:1319:2: rule__AP__Group__0__Impl rule__AP__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__AP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AP__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AP__Group__0"


    // $ANTLR start "rule__AP__Group__0__Impl"
    // InternalOltl.g:1326:1: rule__AP__Group__0__Impl : ( '(' ) ;
    public final void rule__AP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1330:1: ( ( '(' ) )
            // InternalOltl.g:1331:1: ( '(' )
            {
            // InternalOltl.g:1331:1: ( '(' )
            // InternalOltl.g:1332:2: '('
            {
             before(grammarAccess.getAPAccess().getLeftParenthesisKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAPAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AP__Group__0__Impl"


    // $ANTLR start "rule__AP__Group__1"
    // InternalOltl.g:1341:1: rule__AP__Group__1 : rule__AP__Group__1__Impl rule__AP__Group__2 ;
    public final void rule__AP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1345:1: ( rule__AP__Group__1__Impl rule__AP__Group__2 )
            // InternalOltl.g:1346:2: rule__AP__Group__1__Impl rule__AP__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__AP__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AP__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AP__Group__1"


    // $ANTLR start "rule__AP__Group__1__Impl"
    // InternalOltl.g:1353:1: rule__AP__Group__1__Impl : ( '-' ) ;
    public final void rule__AP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1357:1: ( ( '-' ) )
            // InternalOltl.g:1358:1: ( '-' )
            {
            // InternalOltl.g:1358:1: ( '-' )
            // InternalOltl.g:1359:2: '-'
            {
             before(grammarAccess.getAPAccess().getHyphenMinusKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAPAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AP__Group__1__Impl"


    // $ANTLR start "rule__AP__Group__2"
    // InternalOltl.g:1368:1: rule__AP__Group__2 : rule__AP__Group__2__Impl rule__AP__Group__3 ;
    public final void rule__AP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1372:1: ( rule__AP__Group__2__Impl rule__AP__Group__3 )
            // InternalOltl.g:1373:2: rule__AP__Group__2__Impl rule__AP__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__AP__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AP__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AP__Group__2"


    // $ANTLR start "rule__AP__Group__2__Impl"
    // InternalOltl.g:1380:1: rule__AP__Group__2__Impl : ( ( rule__AP__Alternatives_2 ) ) ;
    public final void rule__AP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1384:1: ( ( ( rule__AP__Alternatives_2 ) ) )
            // InternalOltl.g:1385:1: ( ( rule__AP__Alternatives_2 ) )
            {
            // InternalOltl.g:1385:1: ( ( rule__AP__Alternatives_2 ) )
            // InternalOltl.g:1386:2: ( rule__AP__Alternatives_2 )
            {
             before(grammarAccess.getAPAccess().getAlternatives_2()); 
            // InternalOltl.g:1387:2: ( rule__AP__Alternatives_2 )
            // InternalOltl.g:1387:3: rule__AP__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__AP__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getAPAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AP__Group__2__Impl"


    // $ANTLR start "rule__AP__Group__3"
    // InternalOltl.g:1395:1: rule__AP__Group__3 : rule__AP__Group__3__Impl rule__AP__Group__4 ;
    public final void rule__AP__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1399:1: ( rule__AP__Group__3__Impl rule__AP__Group__4 )
            // InternalOltl.g:1400:2: rule__AP__Group__3__Impl rule__AP__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__AP__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AP__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AP__Group__3"


    // $ANTLR start "rule__AP__Group__3__Impl"
    // InternalOltl.g:1407:1: rule__AP__Group__3__Impl : ( '-' ) ;
    public final void rule__AP__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1411:1: ( ( '-' ) )
            // InternalOltl.g:1412:1: ( '-' )
            {
            // InternalOltl.g:1412:1: ( '-' )
            // InternalOltl.g:1413:2: '-'
            {
             before(grammarAccess.getAPAccess().getHyphenMinusKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAPAccess().getHyphenMinusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AP__Group__3__Impl"


    // $ANTLR start "rule__AP__Group__4"
    // InternalOltl.g:1422:1: rule__AP__Group__4 : rule__AP__Group__4__Impl rule__AP__Group__5 ;
    public final void rule__AP__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1426:1: ( rule__AP__Group__4__Impl rule__AP__Group__5 )
            // InternalOltl.g:1427:2: rule__AP__Group__4__Impl rule__AP__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__AP__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AP__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AP__Group__4"


    // $ANTLR start "rule__AP__Group__4__Impl"
    // InternalOltl.g:1434:1: rule__AP__Group__4__Impl : ( ( rule__AP__PNameAssignment_4 ) ) ;
    public final void rule__AP__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1438:1: ( ( ( rule__AP__PNameAssignment_4 ) ) )
            // InternalOltl.g:1439:1: ( ( rule__AP__PNameAssignment_4 ) )
            {
            // InternalOltl.g:1439:1: ( ( rule__AP__PNameAssignment_4 ) )
            // InternalOltl.g:1440:2: ( rule__AP__PNameAssignment_4 )
            {
             before(grammarAccess.getAPAccess().getPNameAssignment_4()); 
            // InternalOltl.g:1441:2: ( rule__AP__PNameAssignment_4 )
            // InternalOltl.g:1441:3: rule__AP__PNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AP__PNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAPAccess().getPNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AP__Group__4__Impl"


    // $ANTLR start "rule__AP__Group__5"
    // InternalOltl.g:1449:1: rule__AP__Group__5 : rule__AP__Group__5__Impl ;
    public final void rule__AP__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1453:1: ( rule__AP__Group__5__Impl )
            // InternalOltl.g:1454:2: rule__AP__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AP__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AP__Group__5"


    // $ANTLR start "rule__AP__Group__5__Impl"
    // InternalOltl.g:1460:1: rule__AP__Group__5__Impl : ( ')' ) ;
    public final void rule__AP__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1464:1: ( ( ')' ) )
            // InternalOltl.g:1465:1: ( ')' )
            {
            // InternalOltl.g:1465:1: ( ')' )
            // InternalOltl.g:1466:2: ')'
            {
             before(grammarAccess.getAPAccess().getRightParenthesisKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAPAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AP__Group__5__Impl"


    // $ANTLR start "rule__Model__TempFormulaAssignment"
    // InternalOltl.g:1476:1: rule__Model__TempFormulaAssignment : ( ruleTempFormula ) ;
    public final void rule__Model__TempFormulaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1480:1: ( ( ruleTempFormula ) )
            // InternalOltl.g:1481:2: ( ruleTempFormula )
            {
            // InternalOltl.g:1481:2: ( ruleTempFormula )
            // InternalOltl.g:1482:3: ruleTempFormula
            {
             before(grammarAccess.getModelAccess().getTempFormulaTempFormulaParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTempFormula();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTempFormulaTempFormulaParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TempFormulaAssignment"


    // $ANTLR start "rule__Weight__NegAssignment_0"
    // InternalOltl.g:1491:1: rule__Weight__NegAssignment_0 : ( ( '-' ) ) ;
    public final void rule__Weight__NegAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1495:1: ( ( ( '-' ) ) )
            // InternalOltl.g:1496:2: ( ( '-' ) )
            {
            // InternalOltl.g:1496:2: ( ( '-' ) )
            // InternalOltl.g:1497:3: ( '-' )
            {
             before(grammarAccess.getWeightAccess().getNegHyphenMinusKeyword_0_0()); 
            // InternalOltl.g:1498:3: ( '-' )
            // InternalOltl.g:1499:4: '-'
            {
             before(grammarAccess.getWeightAccess().getNegHyphenMinusKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWeightAccess().getNegHyphenMinusKeyword_0_0()); 

            }

             after(grammarAccess.getWeightAccess().getNegHyphenMinusKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weight__NegAssignment_0"


    // $ANTLR start "rule__Weight__WIntAssignment_1_0"
    // InternalOltl.g:1510:1: rule__Weight__WIntAssignment_1_0 : ( ruleWInt ) ;
    public final void rule__Weight__WIntAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1514:1: ( ( ruleWInt ) )
            // InternalOltl.g:1515:2: ( ruleWInt )
            {
            // InternalOltl.g:1515:2: ( ruleWInt )
            // InternalOltl.g:1516:3: ruleWInt
            {
             before(grammarAccess.getWeightAccess().getWIntWIntParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWInt();

            state._fsp--;

             after(grammarAccess.getWeightAccess().getWIntWIntParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weight__WIntAssignment_1_0"


    // $ANTLR start "rule__Weight__WFloatAssignment_1_1"
    // InternalOltl.g:1525:1: rule__Weight__WFloatAssignment_1_1 : ( ruleWFloat ) ;
    public final void rule__Weight__WFloatAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1529:1: ( ( ruleWFloat ) )
            // InternalOltl.g:1530:2: ( ruleWFloat )
            {
            // InternalOltl.g:1530:2: ( ruleWFloat )
            // InternalOltl.g:1531:3: ruleWFloat
            {
             before(grammarAccess.getWeightAccess().getWFloatWFloatParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWFloat();

            state._fsp--;

             after(grammarAccess.getWeightAccess().getWFloatWFloatParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weight__WFloatAssignment_1_1"


    // $ANTLR start "rule__WInt__IntAssignment"
    // InternalOltl.g:1540:1: rule__WInt__IntAssignment : ( RULE_INT ) ;
    public final void rule__WInt__IntAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1544:1: ( ( RULE_INT ) )
            // InternalOltl.g:1545:2: ( RULE_INT )
            {
            // InternalOltl.g:1545:2: ( RULE_INT )
            // InternalOltl.g:1546:3: RULE_INT
            {
             before(grammarAccess.getWIntAccess().getIntINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWIntAccess().getIntINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WInt__IntAssignment"


    // $ANTLR start "rule__WFloat__Int1Assignment_0"
    // InternalOltl.g:1555:1: rule__WFloat__Int1Assignment_0 : ( RULE_INT ) ;
    public final void rule__WFloat__Int1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1559:1: ( ( RULE_INT ) )
            // InternalOltl.g:1560:2: ( RULE_INT )
            {
            // InternalOltl.g:1560:2: ( RULE_INT )
            // InternalOltl.g:1561:3: RULE_INT
            {
             before(grammarAccess.getWFloatAccess().getInt1INTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWFloatAccess().getInt1INTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WFloat__Int1Assignment_0"


    // $ANTLR start "rule__WFloat__Int2Assignment_2"
    // InternalOltl.g:1570:1: rule__WFloat__Int2Assignment_2 : ( RULE_INT ) ;
    public final void rule__WFloat__Int2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1574:1: ( ( RULE_INT ) )
            // InternalOltl.g:1575:2: ( RULE_INT )
            {
            // InternalOltl.g:1575:2: ( RULE_INT )
            // InternalOltl.g:1576:3: RULE_INT
            {
             before(grammarAccess.getWFloatAccess().getInt2INTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWFloatAccess().getInt2INTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WFloat__Int2Assignment_2"


    // $ANTLR start "rule__TempFormula__ApAssignment_0"
    // InternalOltl.g:1585:1: rule__TempFormula__ApAssignment_0 : ( ruleAP ) ;
    public final void rule__TempFormula__ApAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1589:1: ( ( ruleAP ) )
            // InternalOltl.g:1590:2: ( ruleAP )
            {
            // InternalOltl.g:1590:2: ( ruleAP )
            // InternalOltl.g:1591:3: ruleAP
            {
             before(grammarAccess.getTempFormulaAccess().getApAPParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAP();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getApAPParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__ApAssignment_0"


    // $ANTLR start "rule__TempFormula__FaAssignment_1_2"
    // InternalOltl.g:1600:1: rule__TempFormula__FaAssignment_1_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__FaAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1604:1: ( ( ruleTempFormula ) )
            // InternalOltl.g:1605:2: ( ruleTempFormula )
            {
            // InternalOltl.g:1605:2: ( ruleTempFormula )
            // InternalOltl.g:1606:3: ruleTempFormula
            {
             before(grammarAccess.getTempFormulaAccess().getFaTempFormulaParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTempFormula();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getFaTempFormulaParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__FaAssignment_1_2"


    // $ANTLR start "rule__TempFormula__FoAssignment_2_2"
    // InternalOltl.g:1615:1: rule__TempFormula__FoAssignment_2_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__FoAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1619:1: ( ( ruleTempFormula ) )
            // InternalOltl.g:1620:2: ( ruleTempFormula )
            {
            // InternalOltl.g:1620:2: ( ruleTempFormula )
            // InternalOltl.g:1621:3: ruleTempFormula
            {
             before(grammarAccess.getTempFormulaAccess().getFoTempFormulaParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTempFormula();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getFoTempFormulaParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__FoAssignment_2_2"


    // $ANTLR start "rule__TempFormula__FnotAssignment_3_2"
    // InternalOltl.g:1630:1: rule__TempFormula__FnotAssignment_3_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__FnotAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1634:1: ( ( ruleTempFormula ) )
            // InternalOltl.g:1635:2: ( ruleTempFormula )
            {
            // InternalOltl.g:1635:2: ( ruleTempFormula )
            // InternalOltl.g:1636:3: ruleTempFormula
            {
             before(grammarAccess.getTempFormulaAccess().getFnotTempFormulaParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTempFormula();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getFnotTempFormulaParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__FnotAssignment_3_2"


    // $ANTLR start "rule__TempFormula__Op2Assignment_4_1"
    // InternalOltl.g:1645:1: rule__TempFormula__Op2Assignment_4_1 : ( RULE_OP2 ) ;
    public final void rule__TempFormula__Op2Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1649:1: ( ( RULE_OP2 ) )
            // InternalOltl.g:1650:2: ( RULE_OP2 )
            {
            // InternalOltl.g:1650:2: ( RULE_OP2 )
            // InternalOltl.g:1651:3: RULE_OP2
            {
             before(grammarAccess.getTempFormulaAccess().getOp2OP2TerminalRuleCall_4_1_0()); 
            match(input,RULE_OP2,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getOp2OP2TerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__Op2Assignment_4_1"


    // $ANTLR start "rule__TempFormula__F1Assignment_4_2"
    // InternalOltl.g:1660:1: rule__TempFormula__F1Assignment_4_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__F1Assignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1664:1: ( ( ruleTempFormula ) )
            // InternalOltl.g:1665:2: ( ruleTempFormula )
            {
            // InternalOltl.g:1665:2: ( ruleTempFormula )
            // InternalOltl.g:1666:3: ruleTempFormula
            {
             before(grammarAccess.getTempFormulaAccess().getF1TempFormulaParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTempFormula();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getF1TempFormulaParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__F1Assignment_4_2"


    // $ANTLR start "rule__TempFormula__F2Assignment_4_3"
    // InternalOltl.g:1675:1: rule__TempFormula__F2Assignment_4_3 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__F2Assignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1679:1: ( ( ruleTempFormula ) )
            // InternalOltl.g:1680:2: ( ruleTempFormula )
            {
            // InternalOltl.g:1680:2: ( ruleTempFormula )
            // InternalOltl.g:1681:3: ruleTempFormula
            {
             before(grammarAccess.getTempFormulaAccess().getF2TempFormulaParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTempFormula();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getF2TempFormulaParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__F2Assignment_4_3"


    // $ANTLR start "rule__TempFormula__OpfAssignment_5_1"
    // InternalOltl.g:1690:1: rule__TempFormula__OpfAssignment_5_1 : ( RULE_OPF ) ;
    public final void rule__TempFormula__OpfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1694:1: ( ( RULE_OPF ) )
            // InternalOltl.g:1695:2: ( RULE_OPF )
            {
            // InternalOltl.g:1695:2: ( RULE_OPF )
            // InternalOltl.g:1696:3: RULE_OPF
            {
             before(grammarAccess.getTempFormulaAccess().getOpfOPFTerminalRuleCall_5_1_0()); 
            match(input,RULE_OPF,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getOpfOPFTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__OpfAssignment_5_1"


    // $ANTLR start "rule__TempFormula__FAssignment_5_2"
    // InternalOltl.g:1705:1: rule__TempFormula__FAssignment_5_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__FAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1709:1: ( ( ruleTempFormula ) )
            // InternalOltl.g:1710:2: ( ruleTempFormula )
            {
            // InternalOltl.g:1710:2: ( ruleTempFormula )
            // InternalOltl.g:1711:3: ruleTempFormula
            {
             before(grammarAccess.getTempFormulaAccess().getFTempFormulaParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTempFormula();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getFTempFormulaParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__FAssignment_5_2"


    // $ANTLR start "rule__TempFormula__ApAssignment_6_2"
    // InternalOltl.g:1720:1: rule__TempFormula__ApAssignment_6_2 : ( ruleAP ) ;
    public final void rule__TempFormula__ApAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1724:1: ( ( ruleAP ) )
            // InternalOltl.g:1725:2: ( ruleAP )
            {
            // InternalOltl.g:1725:2: ( ruleAP )
            // InternalOltl.g:1726:3: ruleAP
            {
             before(grammarAccess.getTempFormulaAccess().getApAPParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAP();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getApAPParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__ApAssignment_6_2"


    // $ANTLR start "rule__TempFormula__WeightAssignment_6_3"
    // InternalOltl.g:1735:1: rule__TempFormula__WeightAssignment_6_3 : ( ruleWeight ) ;
    public final void rule__TempFormula__WeightAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1739:1: ( ( ruleWeight ) )
            // InternalOltl.g:1740:2: ( ruleWeight )
            {
            // InternalOltl.g:1740:2: ( ruleWeight )
            // InternalOltl.g:1741:3: ruleWeight
            {
             before(grammarAccess.getTempFormulaAccess().getWeightWeightParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWeight();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getWeightWeightParserRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__WeightAssignment_6_3"


    // $ANTLR start "rule__TempFormula__FNextAssignment_7_2"
    // InternalOltl.g:1750:1: rule__TempFormula__FNextAssignment_7_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__FNextAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1754:1: ( ( ruleTempFormula ) )
            // InternalOltl.g:1755:2: ( ruleTempFormula )
            {
            // InternalOltl.g:1755:2: ( ruleTempFormula )
            // InternalOltl.g:1756:3: ruleTempFormula
            {
             before(grammarAccess.getTempFormulaAccess().getFNextTempFormulaParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTempFormula();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getFNextTempFormulaParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__FNextAssignment_7_2"


    // $ANTLR start "rule__TempFormula__X1Assignment_7_3"
    // InternalOltl.g:1765:1: rule__TempFormula__X1Assignment_7_3 : ( ruleWInt ) ;
    public final void rule__TempFormula__X1Assignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1769:1: ( ( ruleWInt ) )
            // InternalOltl.g:1770:2: ( ruleWInt )
            {
            // InternalOltl.g:1770:2: ( ruleWInt )
            // InternalOltl.g:1771:3: ruleWInt
            {
             before(grammarAccess.getTempFormulaAccess().getX1WIntParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWInt();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getX1WIntParserRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__X1Assignment_7_3"


    // $ANTLR start "rule__TempFormula__X2Assignment_7_4"
    // InternalOltl.g:1780:1: rule__TempFormula__X2Assignment_7_4 : ( ruleWInt ) ;
    public final void rule__TempFormula__X2Assignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1784:1: ( ( ruleWInt ) )
            // InternalOltl.g:1785:2: ( ruleWInt )
            {
            // InternalOltl.g:1785:2: ( ruleWInt )
            // InternalOltl.g:1786:3: ruleWInt
            {
             before(grammarAccess.getTempFormulaAccess().getX2WIntParserRuleCall_7_4_0()); 
            pushFollow(FOLLOW_2);
            ruleWInt();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getX2WIntParserRuleCall_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempFormula__X2Assignment_7_4"


    // $ANTLR start "rule__AP__PNameAssignment_4"
    // InternalOltl.g:1795:1: rule__AP__PNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__AP__PNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1799:1: ( ( RULE_ID ) )
            // InternalOltl.g:1800:2: ( RULE_ID )
            {
            // InternalOltl.g:1800:2: ( RULE_ID )
            // InternalOltl.g:1801:3: RULE_ID
            {
             before(grammarAccess.getAPAccess().getPNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAPAccess().getPNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AP__PNameAssignment_4"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\20\1\5\10\uffff";
    static final String dfa_3s = "\1\20\1\27\10\uffff";
    static final String dfa_4s = "\2\uffff\1\3\1\10\1\6\1\7\1\2\1\5\1\4\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\7\1\4\12\uffff\1\6\1\uffff\1\2\1\10\1\5\1\3\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "223:1: rule__TempFormula__Alternatives : ( ( ( rule__TempFormula__ApAssignment_0 ) ) | ( ( rule__TempFormula__Group_1__0 ) ) | ( ( rule__TempFormula__Group_2__0 ) ) | ( ( rule__TempFormula__Group_3__0 ) ) | ( ( rule__TempFormula__Group_4__0 ) ) | ( ( rule__TempFormula__Group_5__0 ) ) | ( ( rule__TempFormula__Group_6__0 ) ) | ( ( rule__TempFormula__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});

}
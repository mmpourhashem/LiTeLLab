package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.LiTeLLabGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLiTeLLabParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_OP2", "RULE_OPF", "RULE_COMP", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'P'", "'p'", "'V'", "'v'", "'.'", "'('", "'&&'", "')'", "'||'", "'!!'", "'w'", "'iw'", "'next'", "'(['", "']'", "'-'", "'old'"
    };
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


        public InternalLiTeLLabParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLiTeLLabParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLiTeLLabParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLiTeLLab.g"; }


    	private LiTeLLabGrammarAccess grammarAccess;

    	public void setGrammarAccess(LiTeLLabGrammarAccess grammarAccess) {
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
    // InternalLiTeLLab.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalLiTeLLab.g:54:1: ( ruleModel EOF )
            // InternalLiTeLLab.g:55:1: ruleModel EOF
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
    // InternalLiTeLLab.g:62:1: ruleModel : ( ( rule__Model__TempFormulaAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:66:2: ( ( ( rule__Model__TempFormulaAssignment ) ) )
            // InternalLiTeLLab.g:67:2: ( ( rule__Model__TempFormulaAssignment ) )
            {
            // InternalLiTeLLab.g:67:2: ( ( rule__Model__TempFormulaAssignment ) )
            // InternalLiTeLLab.g:68:3: ( rule__Model__TempFormulaAssignment )
            {
             before(grammarAccess.getModelAccess().getTempFormulaAssignment()); 
            // InternalLiTeLLab.g:69:3: ( rule__Model__TempFormulaAssignment )
            // InternalLiTeLLab.g:69:4: rule__Model__TempFormulaAssignment
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
    // InternalLiTeLLab.g:78:1: entryRuleWeight : ruleWeight EOF ;
    public final void entryRuleWeight() throws RecognitionException {
        try {
            // InternalLiTeLLab.g:79:1: ( ruleWeight EOF )
            // InternalLiTeLLab.g:80:1: ruleWeight EOF
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
    // InternalLiTeLLab.g:87:1: ruleWeight : ( ( rule__Weight__Group__0 ) ) ;
    public final void ruleWeight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:91:2: ( ( ( rule__Weight__Group__0 ) ) )
            // InternalLiTeLLab.g:92:2: ( ( rule__Weight__Group__0 ) )
            {
            // InternalLiTeLLab.g:92:2: ( ( rule__Weight__Group__0 ) )
            // InternalLiTeLLab.g:93:3: ( rule__Weight__Group__0 )
            {
             before(grammarAccess.getWeightAccess().getGroup()); 
            // InternalLiTeLLab.g:94:3: ( rule__Weight__Group__0 )
            // InternalLiTeLLab.g:94:4: rule__Weight__Group__0
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
    // InternalLiTeLLab.g:103:1: entryRuleWInt : ruleWInt EOF ;
    public final void entryRuleWInt() throws RecognitionException {
        try {
            // InternalLiTeLLab.g:104:1: ( ruleWInt EOF )
            // InternalLiTeLLab.g:105:1: ruleWInt EOF
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
    // InternalLiTeLLab.g:112:1: ruleWInt : ( ( rule__WInt__IntAssignment ) ) ;
    public final void ruleWInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:116:2: ( ( ( rule__WInt__IntAssignment ) ) )
            // InternalLiTeLLab.g:117:2: ( ( rule__WInt__IntAssignment ) )
            {
            // InternalLiTeLLab.g:117:2: ( ( rule__WInt__IntAssignment ) )
            // InternalLiTeLLab.g:118:3: ( rule__WInt__IntAssignment )
            {
             before(grammarAccess.getWIntAccess().getIntAssignment()); 
            // InternalLiTeLLab.g:119:3: ( rule__WInt__IntAssignment )
            // InternalLiTeLLab.g:119:4: rule__WInt__IntAssignment
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
    // InternalLiTeLLab.g:128:1: entryRuleWFloat : ruleWFloat EOF ;
    public final void entryRuleWFloat() throws RecognitionException {
        try {
            // InternalLiTeLLab.g:129:1: ( ruleWFloat EOF )
            // InternalLiTeLLab.g:130:1: ruleWFloat EOF
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
    // InternalLiTeLLab.g:137:1: ruleWFloat : ( ( rule__WFloat__Group__0 ) ) ;
    public final void ruleWFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:141:2: ( ( ( rule__WFloat__Group__0 ) ) )
            // InternalLiTeLLab.g:142:2: ( ( rule__WFloat__Group__0 ) )
            {
            // InternalLiTeLLab.g:142:2: ( ( rule__WFloat__Group__0 ) )
            // InternalLiTeLLab.g:143:3: ( rule__WFloat__Group__0 )
            {
             before(grammarAccess.getWFloatAccess().getGroup()); 
            // InternalLiTeLLab.g:144:3: ( rule__WFloat__Group__0 )
            // InternalLiTeLLab.g:144:4: rule__WFloat__Group__0
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
    // InternalLiTeLLab.g:153:1: entryRuleTempFormula : ruleTempFormula EOF ;
    public final void entryRuleTempFormula() throws RecognitionException {
        try {
            // InternalLiTeLLab.g:154:1: ( ruleTempFormula EOF )
            // InternalLiTeLLab.g:155:1: ruleTempFormula EOF
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
    // InternalLiTeLLab.g:162:1: ruleTempFormula : ( ( rule__TempFormula__Alternatives ) ) ;
    public final void ruleTempFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:166:2: ( ( ( rule__TempFormula__Alternatives ) ) )
            // InternalLiTeLLab.g:167:2: ( ( rule__TempFormula__Alternatives ) )
            {
            // InternalLiTeLLab.g:167:2: ( ( rule__TempFormula__Alternatives ) )
            // InternalLiTeLLab.g:168:3: ( rule__TempFormula__Alternatives )
            {
             before(grammarAccess.getTempFormulaAccess().getAlternatives()); 
            // InternalLiTeLLab.g:169:3: ( rule__TempFormula__Alternatives )
            // InternalLiTeLLab.g:169:4: rule__TempFormula__Alternatives
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


    // $ANTLR start "entryRuleTempTerm"
    // InternalLiTeLLab.g:178:1: entryRuleTempTerm : ruleTempTerm EOF ;
    public final void entryRuleTempTerm() throws RecognitionException {
        try {
            // InternalLiTeLLab.g:179:1: ( ruleTempTerm EOF )
            // InternalLiTeLLab.g:180:1: ruleTempTerm EOF
            {
             before(grammarAccess.getTempTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTempTerm();

            state._fsp--;

             after(grammarAccess.getTempTermRule()); 
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
    // $ANTLR end "entryRuleTempTerm"


    // $ANTLR start "ruleTempTerm"
    // InternalLiTeLLab.g:187:1: ruleTempTerm : ( ( rule__TempTerm__Alternatives ) ) ;
    public final void ruleTempTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:191:2: ( ( ( rule__TempTerm__Alternatives ) ) )
            // InternalLiTeLLab.g:192:2: ( ( rule__TempTerm__Alternatives ) )
            {
            // InternalLiTeLLab.g:192:2: ( ( rule__TempTerm__Alternatives ) )
            // InternalLiTeLLab.g:193:3: ( rule__TempTerm__Alternatives )
            {
             before(grammarAccess.getTempTermAccess().getAlternatives()); 
            // InternalLiTeLLab.g:194:3: ( rule__TempTerm__Alternatives )
            // InternalLiTeLLab.g:194:4: rule__TempTerm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TempTerm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTempTermAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTempTerm"


    // $ANTLR start "entryRuleAP"
    // InternalLiTeLLab.g:203:1: entryRuleAP : ruleAP EOF ;
    public final void entryRuleAP() throws RecognitionException {
        try {
            // InternalLiTeLLab.g:204:1: ( ruleAP EOF )
            // InternalLiTeLLab.g:205:1: ruleAP EOF
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
    // InternalLiTeLLab.g:212:1: ruleAP : ( ( rule__AP__Group__0 ) ) ;
    public final void ruleAP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:216:2: ( ( ( rule__AP__Group__0 ) ) )
            // InternalLiTeLLab.g:217:2: ( ( rule__AP__Group__0 ) )
            {
            // InternalLiTeLLab.g:217:2: ( ( rule__AP__Group__0 ) )
            // InternalLiTeLLab.g:218:3: ( rule__AP__Group__0 )
            {
             before(grammarAccess.getAPAccess().getGroup()); 
            // InternalLiTeLLab.g:219:3: ( rule__AP__Group__0 )
            // InternalLiTeLLab.g:219:4: rule__AP__Group__0
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


    // $ANTLR start "entryRuleVAR"
    // InternalLiTeLLab.g:228:1: entryRuleVAR : ruleVAR EOF ;
    public final void entryRuleVAR() throws RecognitionException {
        try {
            // InternalLiTeLLab.g:229:1: ( ruleVAR EOF )
            // InternalLiTeLLab.g:230:1: ruleVAR EOF
            {
             before(grammarAccess.getVARRule()); 
            pushFollow(FOLLOW_1);
            ruleVAR();

            state._fsp--;

             after(grammarAccess.getVARRule()); 
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
    // $ANTLR end "entryRuleVAR"


    // $ANTLR start "ruleVAR"
    // InternalLiTeLLab.g:237:1: ruleVAR : ( ( rule__VAR__Group__0 ) ) ;
    public final void ruleVAR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:241:2: ( ( ( rule__VAR__Group__0 ) ) )
            // InternalLiTeLLab.g:242:2: ( ( rule__VAR__Group__0 ) )
            {
            // InternalLiTeLLab.g:242:2: ( ( rule__VAR__Group__0 ) )
            // InternalLiTeLLab.g:243:3: ( rule__VAR__Group__0 )
            {
             before(grammarAccess.getVARAccess().getGroup()); 
            // InternalLiTeLLab.g:244:3: ( rule__VAR__Group__0 )
            // InternalLiTeLLab.g:244:4: rule__VAR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VAR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVARAccess().getGroup()); 

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
    // $ANTLR end "ruleVAR"


    // $ANTLR start "entryRuleoldVAR"
    // InternalLiTeLLab.g:253:1: entryRuleoldVAR : ruleoldVAR EOF ;
    public final void entryRuleoldVAR() throws RecognitionException {
        try {
            // InternalLiTeLLab.g:254:1: ( ruleoldVAR EOF )
            // InternalLiTeLLab.g:255:1: ruleoldVAR EOF
            {
             before(grammarAccess.getOldVARRule()); 
            pushFollow(FOLLOW_1);
            ruleoldVAR();

            state._fsp--;

             after(grammarAccess.getOldVARRule()); 
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
    // $ANTLR end "entryRuleoldVAR"


    // $ANTLR start "ruleoldVAR"
    // InternalLiTeLLab.g:262:1: ruleoldVAR : ( ( rule__OldVAR__Group__0 ) ) ;
    public final void ruleoldVAR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:266:2: ( ( ( rule__OldVAR__Group__0 ) ) )
            // InternalLiTeLLab.g:267:2: ( ( rule__OldVAR__Group__0 ) )
            {
            // InternalLiTeLLab.g:267:2: ( ( rule__OldVAR__Group__0 ) )
            // InternalLiTeLLab.g:268:3: ( rule__OldVAR__Group__0 )
            {
             before(grammarAccess.getOldVARAccess().getGroup()); 
            // InternalLiTeLLab.g:269:3: ( rule__OldVAR__Group__0 )
            // InternalLiTeLLab.g:269:4: rule__OldVAR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OldVAR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOldVARAccess().getGroup()); 

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
    // $ANTLR end "ruleoldVAR"


    // $ANTLR start "rule__Weight__Alternatives_1"
    // InternalLiTeLLab.g:277:1: rule__Weight__Alternatives_1 : ( ( ( rule__Weight__WIntAssignment_1_0 ) ) | ( ( rule__Weight__WFloatAssignment_1_1 ) ) );
    public final void rule__Weight__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:281:1: ( ( ( rule__Weight__WIntAssignment_1_0 ) ) | ( ( rule__Weight__WFloatAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||LA1_1==21) ) {
                    alt1=1;
                }
                else if ( (LA1_1==18) ) {
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
                    // InternalLiTeLLab.g:282:2: ( ( rule__Weight__WIntAssignment_1_0 ) )
                    {
                    // InternalLiTeLLab.g:282:2: ( ( rule__Weight__WIntAssignment_1_0 ) )
                    // InternalLiTeLLab.g:283:3: ( rule__Weight__WIntAssignment_1_0 )
                    {
                     before(grammarAccess.getWeightAccess().getWIntAssignment_1_0()); 
                    // InternalLiTeLLab.g:284:3: ( rule__Weight__WIntAssignment_1_0 )
                    // InternalLiTeLLab.g:284:4: rule__Weight__WIntAssignment_1_0
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
                    // InternalLiTeLLab.g:288:2: ( ( rule__Weight__WFloatAssignment_1_1 ) )
                    {
                    // InternalLiTeLLab.g:288:2: ( ( rule__Weight__WFloatAssignment_1_1 ) )
                    // InternalLiTeLLab.g:289:3: ( rule__Weight__WFloatAssignment_1_1 )
                    {
                     before(grammarAccess.getWeightAccess().getWFloatAssignment_1_1()); 
                    // InternalLiTeLLab.g:290:3: ( rule__Weight__WFloatAssignment_1_1 )
                    // InternalLiTeLLab.g:290:4: rule__Weight__WFloatAssignment_1_1
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
    // InternalLiTeLLab.g:298:1: rule__TempFormula__Alternatives : ( ( ( rule__TempFormula__ApAssignment_0 ) ) | ( ( rule__TempFormula__Group_1__0 ) ) | ( ( rule__TempFormula__Group_2__0 ) ) | ( ( rule__TempFormula__Group_3__0 ) ) | ( ( rule__TempFormula__Group_4__0 ) ) | ( ( rule__TempFormula__Group_5__0 ) ) | ( ( rule__TempFormula__Group_6__0 ) ) | ( ( rule__TempFormula__Group_7__0 ) ) | ( ( rule__TempFormula__Group_8__0 ) ) | ( ( rule__TempFormula__Group_9__0 ) ) );
    public final void rule__TempFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:302:1: ( ( ( rule__TempFormula__ApAssignment_0 ) ) | ( ( rule__TempFormula__Group_1__0 ) ) | ( ( rule__TempFormula__Group_2__0 ) ) | ( ( rule__TempFormula__Group_3__0 ) ) | ( ( rule__TempFormula__Group_4__0 ) ) | ( ( rule__TempFormula__Group_5__0 ) ) | ( ( rule__TempFormula__Group_6__0 ) ) | ( ( rule__TempFormula__Group_7__0 ) ) | ( ( rule__TempFormula__Group_8__0 ) ) | ( ( rule__TempFormula__Group_9__0 ) ) )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalLiTeLLab.g:303:2: ( ( rule__TempFormula__ApAssignment_0 ) )
                    {
                    // InternalLiTeLLab.g:303:2: ( ( rule__TempFormula__ApAssignment_0 ) )
                    // InternalLiTeLLab.g:304:3: ( rule__TempFormula__ApAssignment_0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getApAssignment_0()); 
                    // InternalLiTeLLab.g:305:3: ( rule__TempFormula__ApAssignment_0 )
                    // InternalLiTeLLab.g:305:4: rule__TempFormula__ApAssignment_0
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
                    // InternalLiTeLLab.g:309:2: ( ( rule__TempFormula__Group_1__0 ) )
                    {
                    // InternalLiTeLLab.g:309:2: ( ( rule__TempFormula__Group_1__0 ) )
                    // InternalLiTeLLab.g:310:3: ( rule__TempFormula__Group_1__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_1()); 
                    // InternalLiTeLLab.g:311:3: ( rule__TempFormula__Group_1__0 )
                    // InternalLiTeLLab.g:311:4: rule__TempFormula__Group_1__0
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
                    // InternalLiTeLLab.g:315:2: ( ( rule__TempFormula__Group_2__0 ) )
                    {
                    // InternalLiTeLLab.g:315:2: ( ( rule__TempFormula__Group_2__0 ) )
                    // InternalLiTeLLab.g:316:3: ( rule__TempFormula__Group_2__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_2()); 
                    // InternalLiTeLLab.g:317:3: ( rule__TempFormula__Group_2__0 )
                    // InternalLiTeLLab.g:317:4: rule__TempFormula__Group_2__0
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
                    // InternalLiTeLLab.g:321:2: ( ( rule__TempFormula__Group_3__0 ) )
                    {
                    // InternalLiTeLLab.g:321:2: ( ( rule__TempFormula__Group_3__0 ) )
                    // InternalLiTeLLab.g:322:3: ( rule__TempFormula__Group_3__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_3()); 
                    // InternalLiTeLLab.g:323:3: ( rule__TempFormula__Group_3__0 )
                    // InternalLiTeLLab.g:323:4: rule__TempFormula__Group_3__0
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
                    // InternalLiTeLLab.g:327:2: ( ( rule__TempFormula__Group_4__0 ) )
                    {
                    // InternalLiTeLLab.g:327:2: ( ( rule__TempFormula__Group_4__0 ) )
                    // InternalLiTeLLab.g:328:3: ( rule__TempFormula__Group_4__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_4()); 
                    // InternalLiTeLLab.g:329:3: ( rule__TempFormula__Group_4__0 )
                    // InternalLiTeLLab.g:329:4: rule__TempFormula__Group_4__0
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
                    // InternalLiTeLLab.g:333:2: ( ( rule__TempFormula__Group_5__0 ) )
                    {
                    // InternalLiTeLLab.g:333:2: ( ( rule__TempFormula__Group_5__0 ) )
                    // InternalLiTeLLab.g:334:3: ( rule__TempFormula__Group_5__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_5()); 
                    // InternalLiTeLLab.g:335:3: ( rule__TempFormula__Group_5__0 )
                    // InternalLiTeLLab.g:335:4: rule__TempFormula__Group_5__0
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
                    // InternalLiTeLLab.g:339:2: ( ( rule__TempFormula__Group_6__0 ) )
                    {
                    // InternalLiTeLLab.g:339:2: ( ( rule__TempFormula__Group_6__0 ) )
                    // InternalLiTeLLab.g:340:3: ( rule__TempFormula__Group_6__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_6()); 
                    // InternalLiTeLLab.g:341:3: ( rule__TempFormula__Group_6__0 )
                    // InternalLiTeLLab.g:341:4: rule__TempFormula__Group_6__0
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
                    // InternalLiTeLLab.g:345:2: ( ( rule__TempFormula__Group_7__0 ) )
                    {
                    // InternalLiTeLLab.g:345:2: ( ( rule__TempFormula__Group_7__0 ) )
                    // InternalLiTeLLab.g:346:3: ( rule__TempFormula__Group_7__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_7()); 
                    // InternalLiTeLLab.g:347:3: ( rule__TempFormula__Group_7__0 )
                    // InternalLiTeLLab.g:347:4: rule__TempFormula__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempFormula__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempFormulaAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalLiTeLLab.g:351:2: ( ( rule__TempFormula__Group_8__0 ) )
                    {
                    // InternalLiTeLLab.g:351:2: ( ( rule__TempFormula__Group_8__0 ) )
                    // InternalLiTeLLab.g:352:3: ( rule__TempFormula__Group_8__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_8()); 
                    // InternalLiTeLLab.g:353:3: ( rule__TempFormula__Group_8__0 )
                    // InternalLiTeLLab.g:353:4: rule__TempFormula__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempFormula__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempFormulaAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalLiTeLLab.g:357:2: ( ( rule__TempFormula__Group_9__0 ) )
                    {
                    // InternalLiTeLLab.g:357:2: ( ( rule__TempFormula__Group_9__0 ) )
                    // InternalLiTeLLab.g:358:3: ( rule__TempFormula__Group_9__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_9()); 
                    // InternalLiTeLLab.g:359:3: ( rule__TempFormula__Group_9__0 )
                    // InternalLiTeLLab.g:359:4: rule__TempFormula__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempFormula__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempFormulaAccess().getGroup_9()); 

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


    // $ANTLR start "rule__TempTerm__Alternatives"
    // InternalLiTeLLab.g:367:1: rule__TempTerm__Alternatives : ( ( ( rule__TempTerm__Int1Assignment_0 ) ) | ( ( rule__TempTerm__VarAssignment_1 ) ) | ( ( rule__TempTerm__OldVarAssignment_2 ) ) );
    public final void rule__TempTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:371:1: ( ( ( rule__TempTerm__Int1Assignment_0 ) ) | ( ( rule__TempTerm__VarAssignment_1 ) ) | ( ( rule__TempTerm__OldVarAssignment_2 ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==29) ) {
                    alt3=2;
                }
                else if ( (LA3_2==30) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

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
                    // InternalLiTeLLab.g:372:2: ( ( rule__TempTerm__Int1Assignment_0 ) )
                    {
                    // InternalLiTeLLab.g:372:2: ( ( rule__TempTerm__Int1Assignment_0 ) )
                    // InternalLiTeLLab.g:373:3: ( rule__TempTerm__Int1Assignment_0 )
                    {
                     before(grammarAccess.getTempTermAccess().getInt1Assignment_0()); 
                    // InternalLiTeLLab.g:374:3: ( rule__TempTerm__Int1Assignment_0 )
                    // InternalLiTeLLab.g:374:4: rule__TempTerm__Int1Assignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempTerm__Int1Assignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempTermAccess().getInt1Assignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLiTeLLab.g:378:2: ( ( rule__TempTerm__VarAssignment_1 ) )
                    {
                    // InternalLiTeLLab.g:378:2: ( ( rule__TempTerm__VarAssignment_1 ) )
                    // InternalLiTeLLab.g:379:3: ( rule__TempTerm__VarAssignment_1 )
                    {
                     before(grammarAccess.getTempTermAccess().getVarAssignment_1()); 
                    // InternalLiTeLLab.g:380:3: ( rule__TempTerm__VarAssignment_1 )
                    // InternalLiTeLLab.g:380:4: rule__TempTerm__VarAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempTerm__VarAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempTermAccess().getVarAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLiTeLLab.g:384:2: ( ( rule__TempTerm__OldVarAssignment_2 ) )
                    {
                    // InternalLiTeLLab.g:384:2: ( ( rule__TempTerm__OldVarAssignment_2 ) )
                    // InternalLiTeLLab.g:385:3: ( rule__TempTerm__OldVarAssignment_2 )
                    {
                     before(grammarAccess.getTempTermAccess().getOldVarAssignment_2()); 
                    // InternalLiTeLLab.g:386:3: ( rule__TempTerm__OldVarAssignment_2 )
                    // InternalLiTeLLab.g:386:4: rule__TempTerm__OldVarAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempTerm__OldVarAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempTermAccess().getOldVarAssignment_2()); 

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
    // $ANTLR end "rule__TempTerm__Alternatives"


    // $ANTLR start "rule__AP__Alternatives_2"
    // InternalLiTeLLab.g:394:1: rule__AP__Alternatives_2 : ( ( 'P' ) | ( 'p' ) );
    public final void rule__AP__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:398:1: ( ( 'P' ) | ( 'p' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLiTeLLab.g:399:2: ( 'P' )
                    {
                    // InternalLiTeLLab.g:399:2: ( 'P' )
                    // InternalLiTeLLab.g:400:3: 'P'
                    {
                     before(grammarAccess.getAPAccess().getPKeyword_2_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAPAccess().getPKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLiTeLLab.g:405:2: ( 'p' )
                    {
                    // InternalLiTeLLab.g:405:2: ( 'p' )
                    // InternalLiTeLLab.g:406:3: 'p'
                    {
                     before(grammarAccess.getAPAccess().getPKeyword_2_1()); 
                    match(input,15,FOLLOW_2); 
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


    // $ANTLR start "rule__VAR__Alternatives_2"
    // InternalLiTeLLab.g:415:1: rule__VAR__Alternatives_2 : ( ( 'V' ) | ( 'v' ) );
    public final void rule__VAR__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:419:1: ( ( 'V' ) | ( 'v' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLiTeLLab.g:420:2: ( 'V' )
                    {
                    // InternalLiTeLLab.g:420:2: ( 'V' )
                    // InternalLiTeLLab.g:421:3: 'V'
                    {
                     before(grammarAccess.getVARAccess().getVKeyword_2_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getVARAccess().getVKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLiTeLLab.g:426:2: ( 'v' )
                    {
                    // InternalLiTeLLab.g:426:2: ( 'v' )
                    // InternalLiTeLLab.g:427:3: 'v'
                    {
                     before(grammarAccess.getVARAccess().getVKeyword_2_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVARAccess().getVKeyword_2_1()); 

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
    // $ANTLR end "rule__VAR__Alternatives_2"


    // $ANTLR start "rule__Weight__Group__0"
    // InternalLiTeLLab.g:436:1: rule__Weight__Group__0 : rule__Weight__Group__0__Impl rule__Weight__Group__1 ;
    public final void rule__Weight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:440:1: ( rule__Weight__Group__0__Impl rule__Weight__Group__1 )
            // InternalLiTeLLab.g:441:2: rule__Weight__Group__0__Impl rule__Weight__Group__1
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
    // InternalLiTeLLab.g:448:1: rule__Weight__Group__0__Impl : ( ( rule__Weight__NegAssignment_0 )? ) ;
    public final void rule__Weight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:452:1: ( ( ( rule__Weight__NegAssignment_0 )? ) )
            // InternalLiTeLLab.g:453:1: ( ( rule__Weight__NegAssignment_0 )? )
            {
            // InternalLiTeLLab.g:453:1: ( ( rule__Weight__NegAssignment_0 )? )
            // InternalLiTeLLab.g:454:2: ( rule__Weight__NegAssignment_0 )?
            {
             before(grammarAccess.getWeightAccess().getNegAssignment_0()); 
            // InternalLiTeLLab.g:455:2: ( rule__Weight__NegAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLiTeLLab.g:455:3: rule__Weight__NegAssignment_0
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
    // InternalLiTeLLab.g:463:1: rule__Weight__Group__1 : rule__Weight__Group__1__Impl ;
    public final void rule__Weight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:467:1: ( rule__Weight__Group__1__Impl )
            // InternalLiTeLLab.g:468:2: rule__Weight__Group__1__Impl
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
    // InternalLiTeLLab.g:474:1: rule__Weight__Group__1__Impl : ( ( rule__Weight__Alternatives_1 ) ) ;
    public final void rule__Weight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:478:1: ( ( ( rule__Weight__Alternatives_1 ) ) )
            // InternalLiTeLLab.g:479:1: ( ( rule__Weight__Alternatives_1 ) )
            {
            // InternalLiTeLLab.g:479:1: ( ( rule__Weight__Alternatives_1 ) )
            // InternalLiTeLLab.g:480:2: ( rule__Weight__Alternatives_1 )
            {
             before(grammarAccess.getWeightAccess().getAlternatives_1()); 
            // InternalLiTeLLab.g:481:2: ( rule__Weight__Alternatives_1 )
            // InternalLiTeLLab.g:481:3: rule__Weight__Alternatives_1
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
    // InternalLiTeLLab.g:490:1: rule__WFloat__Group__0 : rule__WFloat__Group__0__Impl rule__WFloat__Group__1 ;
    public final void rule__WFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:494:1: ( rule__WFloat__Group__0__Impl rule__WFloat__Group__1 )
            // InternalLiTeLLab.g:495:2: rule__WFloat__Group__0__Impl rule__WFloat__Group__1
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
    // InternalLiTeLLab.g:502:1: rule__WFloat__Group__0__Impl : ( ( rule__WFloat__Int1Assignment_0 ) ) ;
    public final void rule__WFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:506:1: ( ( ( rule__WFloat__Int1Assignment_0 ) ) )
            // InternalLiTeLLab.g:507:1: ( ( rule__WFloat__Int1Assignment_0 ) )
            {
            // InternalLiTeLLab.g:507:1: ( ( rule__WFloat__Int1Assignment_0 ) )
            // InternalLiTeLLab.g:508:2: ( rule__WFloat__Int1Assignment_0 )
            {
             before(grammarAccess.getWFloatAccess().getInt1Assignment_0()); 
            // InternalLiTeLLab.g:509:2: ( rule__WFloat__Int1Assignment_0 )
            // InternalLiTeLLab.g:509:3: rule__WFloat__Int1Assignment_0
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
    // InternalLiTeLLab.g:517:1: rule__WFloat__Group__1 : rule__WFloat__Group__1__Impl rule__WFloat__Group__2 ;
    public final void rule__WFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:521:1: ( rule__WFloat__Group__1__Impl rule__WFloat__Group__2 )
            // InternalLiTeLLab.g:522:2: rule__WFloat__Group__1__Impl rule__WFloat__Group__2
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
    // InternalLiTeLLab.g:529:1: rule__WFloat__Group__1__Impl : ( '.' ) ;
    public final void rule__WFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:533:1: ( ( '.' ) )
            // InternalLiTeLLab.g:534:1: ( '.' )
            {
            // InternalLiTeLLab.g:534:1: ( '.' )
            // InternalLiTeLLab.g:535:2: '.'
            {
             before(grammarAccess.getWFloatAccess().getFullStopKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalLiTeLLab.g:544:1: rule__WFloat__Group__2 : rule__WFloat__Group__2__Impl ;
    public final void rule__WFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:548:1: ( rule__WFloat__Group__2__Impl )
            // InternalLiTeLLab.g:549:2: rule__WFloat__Group__2__Impl
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
    // InternalLiTeLLab.g:555:1: rule__WFloat__Group__2__Impl : ( ( rule__WFloat__Int2Assignment_2 ) ) ;
    public final void rule__WFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:559:1: ( ( ( rule__WFloat__Int2Assignment_2 ) ) )
            // InternalLiTeLLab.g:560:1: ( ( rule__WFloat__Int2Assignment_2 ) )
            {
            // InternalLiTeLLab.g:560:1: ( ( rule__WFloat__Int2Assignment_2 ) )
            // InternalLiTeLLab.g:561:2: ( rule__WFloat__Int2Assignment_2 )
            {
             before(grammarAccess.getWFloatAccess().getInt2Assignment_2()); 
            // InternalLiTeLLab.g:562:2: ( rule__WFloat__Int2Assignment_2 )
            // InternalLiTeLLab.g:562:3: rule__WFloat__Int2Assignment_2
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
    // InternalLiTeLLab.g:571:1: rule__TempFormula__Group_1__0 : rule__TempFormula__Group_1__0__Impl rule__TempFormula__Group_1__1 ;
    public final void rule__TempFormula__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:575:1: ( rule__TempFormula__Group_1__0__Impl rule__TempFormula__Group_1__1 )
            // InternalLiTeLLab.g:576:2: rule__TempFormula__Group_1__0__Impl rule__TempFormula__Group_1__1
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
    // InternalLiTeLLab.g:583:1: rule__TempFormula__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:587:1: ( ( '(' ) )
            // InternalLiTeLLab.g:588:1: ( '(' )
            {
            // InternalLiTeLLab.g:588:1: ( '(' )
            // InternalLiTeLLab.g:589:2: '('
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalLiTeLLab.g:598:1: rule__TempFormula__Group_1__1 : rule__TempFormula__Group_1__1__Impl rule__TempFormula__Group_1__2 ;
    public final void rule__TempFormula__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:602:1: ( rule__TempFormula__Group_1__1__Impl rule__TempFormula__Group_1__2 )
            // InternalLiTeLLab.g:603:2: rule__TempFormula__Group_1__1__Impl rule__TempFormula__Group_1__2
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
    // InternalLiTeLLab.g:610:1: rule__TempFormula__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__TempFormula__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:614:1: ( ( '&&' ) )
            // InternalLiTeLLab.g:615:1: ( '&&' )
            {
            // InternalLiTeLLab.g:615:1: ( '&&' )
            // InternalLiTeLLab.g:616:2: '&&'
            {
             before(grammarAccess.getTempFormulaAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalLiTeLLab.g:625:1: rule__TempFormula__Group_1__2 : rule__TempFormula__Group_1__2__Impl rule__TempFormula__Group_1__3 ;
    public final void rule__TempFormula__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:629:1: ( rule__TempFormula__Group_1__2__Impl rule__TempFormula__Group_1__3 )
            // InternalLiTeLLab.g:630:2: rule__TempFormula__Group_1__2__Impl rule__TempFormula__Group_1__3
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
    // InternalLiTeLLab.g:637:1: rule__TempFormula__Group_1__2__Impl : ( ( ( rule__TempFormula__FaAssignment_1_2 ) ) ( ( rule__TempFormula__FaAssignment_1_2 )* ) ) ;
    public final void rule__TempFormula__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:641:1: ( ( ( ( rule__TempFormula__FaAssignment_1_2 ) ) ( ( rule__TempFormula__FaAssignment_1_2 )* ) ) )
            // InternalLiTeLLab.g:642:1: ( ( ( rule__TempFormula__FaAssignment_1_2 ) ) ( ( rule__TempFormula__FaAssignment_1_2 )* ) )
            {
            // InternalLiTeLLab.g:642:1: ( ( ( rule__TempFormula__FaAssignment_1_2 ) ) ( ( rule__TempFormula__FaAssignment_1_2 )* ) )
            // InternalLiTeLLab.g:643:2: ( ( rule__TempFormula__FaAssignment_1_2 ) ) ( ( rule__TempFormula__FaAssignment_1_2 )* )
            {
            // InternalLiTeLLab.g:643:2: ( ( rule__TempFormula__FaAssignment_1_2 ) )
            // InternalLiTeLLab.g:644:3: ( rule__TempFormula__FaAssignment_1_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getFaAssignment_1_2()); 
            // InternalLiTeLLab.g:645:3: ( rule__TempFormula__FaAssignment_1_2 )
            // InternalLiTeLLab.g:645:4: rule__TempFormula__FaAssignment_1_2
            {
            pushFollow(FOLLOW_8);
            rule__TempFormula__FaAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getFaAssignment_1_2()); 

            }

            // InternalLiTeLLab.g:648:2: ( ( rule__TempFormula__FaAssignment_1_2 )* )
            // InternalLiTeLLab.g:649:3: ( rule__TempFormula__FaAssignment_1_2 )*
            {
             before(grammarAccess.getTempFormulaAccess().getFaAssignment_1_2()); 
            // InternalLiTeLLab.g:650:3: ( rule__TempFormula__FaAssignment_1_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19||LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLiTeLLab.g:650:4: rule__TempFormula__FaAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TempFormula__FaAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalLiTeLLab.g:659:1: rule__TempFormula__Group_1__3 : rule__TempFormula__Group_1__3__Impl ;
    public final void rule__TempFormula__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:663:1: ( rule__TempFormula__Group_1__3__Impl )
            // InternalLiTeLLab.g:664:2: rule__TempFormula__Group_1__3__Impl
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
    // InternalLiTeLLab.g:670:1: rule__TempFormula__Group_1__3__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:674:1: ( ( ')' ) )
            // InternalLiTeLLab.g:675:1: ( ')' )
            {
            // InternalLiTeLLab.g:675:1: ( ')' )
            // InternalLiTeLLab.g:676:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_1_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLiTeLLab.g:686:1: rule__TempFormula__Group_2__0 : rule__TempFormula__Group_2__0__Impl rule__TempFormula__Group_2__1 ;
    public final void rule__TempFormula__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:690:1: ( rule__TempFormula__Group_2__0__Impl rule__TempFormula__Group_2__1 )
            // InternalLiTeLLab.g:691:2: rule__TempFormula__Group_2__0__Impl rule__TempFormula__Group_2__1
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
    // InternalLiTeLLab.g:698:1: rule__TempFormula__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:702:1: ( ( '(' ) )
            // InternalLiTeLLab.g:703:1: ( '(' )
            {
            // InternalLiTeLLab.g:703:1: ( '(' )
            // InternalLiTeLLab.g:704:2: '('
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalLiTeLLab.g:713:1: rule__TempFormula__Group_2__1 : rule__TempFormula__Group_2__1__Impl rule__TempFormula__Group_2__2 ;
    public final void rule__TempFormula__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:717:1: ( rule__TempFormula__Group_2__1__Impl rule__TempFormula__Group_2__2 )
            // InternalLiTeLLab.g:718:2: rule__TempFormula__Group_2__1__Impl rule__TempFormula__Group_2__2
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
    // InternalLiTeLLab.g:725:1: rule__TempFormula__Group_2__1__Impl : ( '||' ) ;
    public final void rule__TempFormula__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:729:1: ( ( '||' ) )
            // InternalLiTeLLab.g:730:1: ( '||' )
            {
            // InternalLiTeLLab.g:730:1: ( '||' )
            // InternalLiTeLLab.g:731:2: '||'
            {
             before(grammarAccess.getTempFormulaAccess().getVerticalLineVerticalLineKeyword_2_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalLiTeLLab.g:740:1: rule__TempFormula__Group_2__2 : rule__TempFormula__Group_2__2__Impl rule__TempFormula__Group_2__3 ;
    public final void rule__TempFormula__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:744:1: ( rule__TempFormula__Group_2__2__Impl rule__TempFormula__Group_2__3 )
            // InternalLiTeLLab.g:745:2: rule__TempFormula__Group_2__2__Impl rule__TempFormula__Group_2__3
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
    // InternalLiTeLLab.g:752:1: rule__TempFormula__Group_2__2__Impl : ( ( ( rule__TempFormula__FoAssignment_2_2 ) ) ( ( rule__TempFormula__FoAssignment_2_2 )* ) ) ;
    public final void rule__TempFormula__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:756:1: ( ( ( ( rule__TempFormula__FoAssignment_2_2 ) ) ( ( rule__TempFormula__FoAssignment_2_2 )* ) ) )
            // InternalLiTeLLab.g:757:1: ( ( ( rule__TempFormula__FoAssignment_2_2 ) ) ( ( rule__TempFormula__FoAssignment_2_2 )* ) )
            {
            // InternalLiTeLLab.g:757:1: ( ( ( rule__TempFormula__FoAssignment_2_2 ) ) ( ( rule__TempFormula__FoAssignment_2_2 )* ) )
            // InternalLiTeLLab.g:758:2: ( ( rule__TempFormula__FoAssignment_2_2 ) ) ( ( rule__TempFormula__FoAssignment_2_2 )* )
            {
            // InternalLiTeLLab.g:758:2: ( ( rule__TempFormula__FoAssignment_2_2 ) )
            // InternalLiTeLLab.g:759:3: ( rule__TempFormula__FoAssignment_2_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getFoAssignment_2_2()); 
            // InternalLiTeLLab.g:760:3: ( rule__TempFormula__FoAssignment_2_2 )
            // InternalLiTeLLab.g:760:4: rule__TempFormula__FoAssignment_2_2
            {
            pushFollow(FOLLOW_8);
            rule__TempFormula__FoAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getFoAssignment_2_2()); 

            }

            // InternalLiTeLLab.g:763:2: ( ( rule__TempFormula__FoAssignment_2_2 )* )
            // InternalLiTeLLab.g:764:3: ( rule__TempFormula__FoAssignment_2_2 )*
            {
             before(grammarAccess.getTempFormulaAccess().getFoAssignment_2_2()); 
            // InternalLiTeLLab.g:765:3: ( rule__TempFormula__FoAssignment_2_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19||LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLiTeLLab.g:765:4: rule__TempFormula__FoAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TempFormula__FoAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalLiTeLLab.g:774:1: rule__TempFormula__Group_2__3 : rule__TempFormula__Group_2__3__Impl ;
    public final void rule__TempFormula__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:778:1: ( rule__TempFormula__Group_2__3__Impl )
            // InternalLiTeLLab.g:779:2: rule__TempFormula__Group_2__3__Impl
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
    // InternalLiTeLLab.g:785:1: rule__TempFormula__Group_2__3__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:789:1: ( ( ')' ) )
            // InternalLiTeLLab.g:790:1: ( ')' )
            {
            // InternalLiTeLLab.g:790:1: ( ')' )
            // InternalLiTeLLab.g:791:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_2_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLiTeLLab.g:801:1: rule__TempFormula__Group_3__0 : rule__TempFormula__Group_3__0__Impl rule__TempFormula__Group_3__1 ;
    public final void rule__TempFormula__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:805:1: ( rule__TempFormula__Group_3__0__Impl rule__TempFormula__Group_3__1 )
            // InternalLiTeLLab.g:806:2: rule__TempFormula__Group_3__0__Impl rule__TempFormula__Group_3__1
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
    // InternalLiTeLLab.g:813:1: rule__TempFormula__Group_3__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:817:1: ( ( '(' ) )
            // InternalLiTeLLab.g:818:1: ( '(' )
            {
            // InternalLiTeLLab.g:818:1: ( '(' )
            // InternalLiTeLLab.g:819:2: '('
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalLiTeLLab.g:828:1: rule__TempFormula__Group_3__1 : rule__TempFormula__Group_3__1__Impl rule__TempFormula__Group_3__2 ;
    public final void rule__TempFormula__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:832:1: ( rule__TempFormula__Group_3__1__Impl rule__TempFormula__Group_3__2 )
            // InternalLiTeLLab.g:833:2: rule__TempFormula__Group_3__1__Impl rule__TempFormula__Group_3__2
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
    // InternalLiTeLLab.g:840:1: rule__TempFormula__Group_3__1__Impl : ( '!!' ) ;
    public final void rule__TempFormula__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:844:1: ( ( '!!' ) )
            // InternalLiTeLLab.g:845:1: ( '!!' )
            {
            // InternalLiTeLLab.g:845:1: ( '!!' )
            // InternalLiTeLLab.g:846:2: '!!'
            {
             before(grammarAccess.getTempFormulaAccess().getExclamationMarkExclamationMarkKeyword_3_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalLiTeLLab.g:855:1: rule__TempFormula__Group_3__2 : rule__TempFormula__Group_3__2__Impl rule__TempFormula__Group_3__3 ;
    public final void rule__TempFormula__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:859:1: ( rule__TempFormula__Group_3__2__Impl rule__TempFormula__Group_3__3 )
            // InternalLiTeLLab.g:860:2: rule__TempFormula__Group_3__2__Impl rule__TempFormula__Group_3__3
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
    // InternalLiTeLLab.g:867:1: rule__TempFormula__Group_3__2__Impl : ( ( rule__TempFormula__FnotAssignment_3_2 ) ) ;
    public final void rule__TempFormula__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:871:1: ( ( ( rule__TempFormula__FnotAssignment_3_2 ) ) )
            // InternalLiTeLLab.g:872:1: ( ( rule__TempFormula__FnotAssignment_3_2 ) )
            {
            // InternalLiTeLLab.g:872:1: ( ( rule__TempFormula__FnotAssignment_3_2 ) )
            // InternalLiTeLLab.g:873:2: ( rule__TempFormula__FnotAssignment_3_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getFnotAssignment_3_2()); 
            // InternalLiTeLLab.g:874:2: ( rule__TempFormula__FnotAssignment_3_2 )
            // InternalLiTeLLab.g:874:3: rule__TempFormula__FnotAssignment_3_2
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
    // InternalLiTeLLab.g:882:1: rule__TempFormula__Group_3__3 : rule__TempFormula__Group_3__3__Impl ;
    public final void rule__TempFormula__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:886:1: ( rule__TempFormula__Group_3__3__Impl )
            // InternalLiTeLLab.g:887:2: rule__TempFormula__Group_3__3__Impl
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
    // InternalLiTeLLab.g:893:1: rule__TempFormula__Group_3__3__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:897:1: ( ( ')' ) )
            // InternalLiTeLLab.g:898:1: ( ')' )
            {
            // InternalLiTeLLab.g:898:1: ( ')' )
            // InternalLiTeLLab.g:899:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_3_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLiTeLLab.g:909:1: rule__TempFormula__Group_4__0 : rule__TempFormula__Group_4__0__Impl rule__TempFormula__Group_4__1 ;
    public final void rule__TempFormula__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:913:1: ( rule__TempFormula__Group_4__0__Impl rule__TempFormula__Group_4__1 )
            // InternalLiTeLLab.g:914:2: rule__TempFormula__Group_4__0__Impl rule__TempFormula__Group_4__1
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
    // InternalLiTeLLab.g:921:1: rule__TempFormula__Group_4__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:925:1: ( ( '(' ) )
            // InternalLiTeLLab.g:926:1: ( '(' )
            {
            // InternalLiTeLLab.g:926:1: ( '(' )
            // InternalLiTeLLab.g:927:2: '('
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalLiTeLLab.g:936:1: rule__TempFormula__Group_4__1 : rule__TempFormula__Group_4__1__Impl rule__TempFormula__Group_4__2 ;
    public final void rule__TempFormula__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:940:1: ( rule__TempFormula__Group_4__1__Impl rule__TempFormula__Group_4__2 )
            // InternalLiTeLLab.g:941:2: rule__TempFormula__Group_4__1__Impl rule__TempFormula__Group_4__2
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
    // InternalLiTeLLab.g:948:1: rule__TempFormula__Group_4__1__Impl : ( ( rule__TempFormula__Op2Assignment_4_1 ) ) ;
    public final void rule__TempFormula__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:952:1: ( ( ( rule__TempFormula__Op2Assignment_4_1 ) ) )
            // InternalLiTeLLab.g:953:1: ( ( rule__TempFormula__Op2Assignment_4_1 ) )
            {
            // InternalLiTeLLab.g:953:1: ( ( rule__TempFormula__Op2Assignment_4_1 ) )
            // InternalLiTeLLab.g:954:2: ( rule__TempFormula__Op2Assignment_4_1 )
            {
             before(grammarAccess.getTempFormulaAccess().getOp2Assignment_4_1()); 
            // InternalLiTeLLab.g:955:2: ( rule__TempFormula__Op2Assignment_4_1 )
            // InternalLiTeLLab.g:955:3: rule__TempFormula__Op2Assignment_4_1
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
    // InternalLiTeLLab.g:963:1: rule__TempFormula__Group_4__2 : rule__TempFormula__Group_4__2__Impl rule__TempFormula__Group_4__3 ;
    public final void rule__TempFormula__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:967:1: ( rule__TempFormula__Group_4__2__Impl rule__TempFormula__Group_4__3 )
            // InternalLiTeLLab.g:968:2: rule__TempFormula__Group_4__2__Impl rule__TempFormula__Group_4__3
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
    // InternalLiTeLLab.g:975:1: rule__TempFormula__Group_4__2__Impl : ( ( rule__TempFormula__F1Assignment_4_2 ) ) ;
    public final void rule__TempFormula__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:979:1: ( ( ( rule__TempFormula__F1Assignment_4_2 ) ) )
            // InternalLiTeLLab.g:980:1: ( ( rule__TempFormula__F1Assignment_4_2 ) )
            {
            // InternalLiTeLLab.g:980:1: ( ( rule__TempFormula__F1Assignment_4_2 ) )
            // InternalLiTeLLab.g:981:2: ( rule__TempFormula__F1Assignment_4_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getF1Assignment_4_2()); 
            // InternalLiTeLLab.g:982:2: ( rule__TempFormula__F1Assignment_4_2 )
            // InternalLiTeLLab.g:982:3: rule__TempFormula__F1Assignment_4_2
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
    // InternalLiTeLLab.g:990:1: rule__TempFormula__Group_4__3 : rule__TempFormula__Group_4__3__Impl rule__TempFormula__Group_4__4 ;
    public final void rule__TempFormula__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:994:1: ( rule__TempFormula__Group_4__3__Impl rule__TempFormula__Group_4__4 )
            // InternalLiTeLLab.g:995:2: rule__TempFormula__Group_4__3__Impl rule__TempFormula__Group_4__4
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
    // InternalLiTeLLab.g:1002:1: rule__TempFormula__Group_4__3__Impl : ( ( rule__TempFormula__F2Assignment_4_3 ) ) ;
    public final void rule__TempFormula__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1006:1: ( ( ( rule__TempFormula__F2Assignment_4_3 ) ) )
            // InternalLiTeLLab.g:1007:1: ( ( rule__TempFormula__F2Assignment_4_3 ) )
            {
            // InternalLiTeLLab.g:1007:1: ( ( rule__TempFormula__F2Assignment_4_3 ) )
            // InternalLiTeLLab.g:1008:2: ( rule__TempFormula__F2Assignment_4_3 )
            {
             before(grammarAccess.getTempFormulaAccess().getF2Assignment_4_3()); 
            // InternalLiTeLLab.g:1009:2: ( rule__TempFormula__F2Assignment_4_3 )
            // InternalLiTeLLab.g:1009:3: rule__TempFormula__F2Assignment_4_3
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
    // InternalLiTeLLab.g:1017:1: rule__TempFormula__Group_4__4 : rule__TempFormula__Group_4__4__Impl ;
    public final void rule__TempFormula__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1021:1: ( rule__TempFormula__Group_4__4__Impl )
            // InternalLiTeLLab.g:1022:2: rule__TempFormula__Group_4__4__Impl
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
    // InternalLiTeLLab.g:1028:1: rule__TempFormula__Group_4__4__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1032:1: ( ( ')' ) )
            // InternalLiTeLLab.g:1033:1: ( ')' )
            {
            // InternalLiTeLLab.g:1033:1: ( ')' )
            // InternalLiTeLLab.g:1034:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_4_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLiTeLLab.g:1044:1: rule__TempFormula__Group_5__0 : rule__TempFormula__Group_5__0__Impl rule__TempFormula__Group_5__1 ;
    public final void rule__TempFormula__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1048:1: ( rule__TempFormula__Group_5__0__Impl rule__TempFormula__Group_5__1 )
            // InternalLiTeLLab.g:1049:2: rule__TempFormula__Group_5__0__Impl rule__TempFormula__Group_5__1
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
    // InternalLiTeLLab.g:1056:1: rule__TempFormula__Group_5__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1060:1: ( ( '(' ) )
            // InternalLiTeLLab.g:1061:1: ( '(' )
            {
            // InternalLiTeLLab.g:1061:1: ( '(' )
            // InternalLiTeLLab.g:1062:2: '('
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalLiTeLLab.g:1071:1: rule__TempFormula__Group_5__1 : rule__TempFormula__Group_5__1__Impl rule__TempFormula__Group_5__2 ;
    public final void rule__TempFormula__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1075:1: ( rule__TempFormula__Group_5__1__Impl rule__TempFormula__Group_5__2 )
            // InternalLiTeLLab.g:1076:2: rule__TempFormula__Group_5__1__Impl rule__TempFormula__Group_5__2
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
    // InternalLiTeLLab.g:1083:1: rule__TempFormula__Group_5__1__Impl : ( ( rule__TempFormula__OpfAssignment_5_1 ) ) ;
    public final void rule__TempFormula__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1087:1: ( ( ( rule__TempFormula__OpfAssignment_5_1 ) ) )
            // InternalLiTeLLab.g:1088:1: ( ( rule__TempFormula__OpfAssignment_5_1 ) )
            {
            // InternalLiTeLLab.g:1088:1: ( ( rule__TempFormula__OpfAssignment_5_1 ) )
            // InternalLiTeLLab.g:1089:2: ( rule__TempFormula__OpfAssignment_5_1 )
            {
             before(grammarAccess.getTempFormulaAccess().getOpfAssignment_5_1()); 
            // InternalLiTeLLab.g:1090:2: ( rule__TempFormula__OpfAssignment_5_1 )
            // InternalLiTeLLab.g:1090:3: rule__TempFormula__OpfAssignment_5_1
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
    // InternalLiTeLLab.g:1098:1: rule__TempFormula__Group_5__2 : rule__TempFormula__Group_5__2__Impl rule__TempFormula__Group_5__3 ;
    public final void rule__TempFormula__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1102:1: ( rule__TempFormula__Group_5__2__Impl rule__TempFormula__Group_5__3 )
            // InternalLiTeLLab.g:1103:2: rule__TempFormula__Group_5__2__Impl rule__TempFormula__Group_5__3
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
    // InternalLiTeLLab.g:1110:1: rule__TempFormula__Group_5__2__Impl : ( ( rule__TempFormula__FAssignment_5_2 ) ) ;
    public final void rule__TempFormula__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1114:1: ( ( ( rule__TempFormula__FAssignment_5_2 ) ) )
            // InternalLiTeLLab.g:1115:1: ( ( rule__TempFormula__FAssignment_5_2 ) )
            {
            // InternalLiTeLLab.g:1115:1: ( ( rule__TempFormula__FAssignment_5_2 ) )
            // InternalLiTeLLab.g:1116:2: ( rule__TempFormula__FAssignment_5_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getFAssignment_5_2()); 
            // InternalLiTeLLab.g:1117:2: ( rule__TempFormula__FAssignment_5_2 )
            // InternalLiTeLLab.g:1117:3: rule__TempFormula__FAssignment_5_2
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
    // InternalLiTeLLab.g:1125:1: rule__TempFormula__Group_5__3 : rule__TempFormula__Group_5__3__Impl ;
    public final void rule__TempFormula__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1129:1: ( rule__TempFormula__Group_5__3__Impl )
            // InternalLiTeLLab.g:1130:2: rule__TempFormula__Group_5__3__Impl
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
    // InternalLiTeLLab.g:1136:1: rule__TempFormula__Group_5__3__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1140:1: ( ( ')' ) )
            // InternalLiTeLLab.g:1141:1: ( ')' )
            {
            // InternalLiTeLLab.g:1141:1: ( ')' )
            // InternalLiTeLLab.g:1142:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_5_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLiTeLLab.g:1152:1: rule__TempFormula__Group_6__0 : rule__TempFormula__Group_6__0__Impl rule__TempFormula__Group_6__1 ;
    public final void rule__TempFormula__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1156:1: ( rule__TempFormula__Group_6__0__Impl rule__TempFormula__Group_6__1 )
            // InternalLiTeLLab.g:1157:2: rule__TempFormula__Group_6__0__Impl rule__TempFormula__Group_6__1
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
    // InternalLiTeLLab.g:1164:1: rule__TempFormula__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1168:1: ( ( '(' ) )
            // InternalLiTeLLab.g:1169:1: ( '(' )
            {
            // InternalLiTeLLab.g:1169:1: ( '(' )
            // InternalLiTeLLab.g:1170:2: '('
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalLiTeLLab.g:1179:1: rule__TempFormula__Group_6__1 : rule__TempFormula__Group_6__1__Impl rule__TempFormula__Group_6__2 ;
    public final void rule__TempFormula__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1183:1: ( rule__TempFormula__Group_6__1__Impl rule__TempFormula__Group_6__2 )
            // InternalLiTeLLab.g:1184:2: rule__TempFormula__Group_6__1__Impl rule__TempFormula__Group_6__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalLiTeLLab.g:1191:1: rule__TempFormula__Group_6__1__Impl : ( 'w' ) ;
    public final void rule__TempFormula__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1195:1: ( ( 'w' ) )
            // InternalLiTeLLab.g:1196:1: ( 'w' )
            {
            // InternalLiTeLLab.g:1196:1: ( 'w' )
            // InternalLiTeLLab.g:1197:2: 'w'
            {
             before(grammarAccess.getTempFormulaAccess().getWKeyword_6_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalLiTeLLab.g:1206:1: rule__TempFormula__Group_6__2 : rule__TempFormula__Group_6__2__Impl rule__TempFormula__Group_6__3 ;
    public final void rule__TempFormula__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1210:1: ( rule__TempFormula__Group_6__2__Impl rule__TempFormula__Group_6__3 )
            // InternalLiTeLLab.g:1211:2: rule__TempFormula__Group_6__2__Impl rule__TempFormula__Group_6__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalLiTeLLab.g:1218:1: rule__TempFormula__Group_6__2__Impl : ( ( rule__TempFormula__ApAssignment_6_2 ) ) ;
    public final void rule__TempFormula__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1222:1: ( ( ( rule__TempFormula__ApAssignment_6_2 ) ) )
            // InternalLiTeLLab.g:1223:1: ( ( rule__TempFormula__ApAssignment_6_2 ) )
            {
            // InternalLiTeLLab.g:1223:1: ( ( rule__TempFormula__ApAssignment_6_2 ) )
            // InternalLiTeLLab.g:1224:2: ( rule__TempFormula__ApAssignment_6_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getApAssignment_6_2()); 
            // InternalLiTeLLab.g:1225:2: ( rule__TempFormula__ApAssignment_6_2 )
            // InternalLiTeLLab.g:1225:3: rule__TempFormula__ApAssignment_6_2
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
    // InternalLiTeLLab.g:1233:1: rule__TempFormula__Group_6__3 : rule__TempFormula__Group_6__3__Impl rule__TempFormula__Group_6__4 ;
    public final void rule__TempFormula__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1237:1: ( rule__TempFormula__Group_6__3__Impl rule__TempFormula__Group_6__4 )
            // InternalLiTeLLab.g:1238:2: rule__TempFormula__Group_6__3__Impl rule__TempFormula__Group_6__4
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
    // InternalLiTeLLab.g:1245:1: rule__TempFormula__Group_6__3__Impl : ( ( rule__TempFormula__WeightAssignment_6_3 ) ) ;
    public final void rule__TempFormula__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1249:1: ( ( ( rule__TempFormula__WeightAssignment_6_3 ) ) )
            // InternalLiTeLLab.g:1250:1: ( ( rule__TempFormula__WeightAssignment_6_3 ) )
            {
            // InternalLiTeLLab.g:1250:1: ( ( rule__TempFormula__WeightAssignment_6_3 ) )
            // InternalLiTeLLab.g:1251:2: ( rule__TempFormula__WeightAssignment_6_3 )
            {
             before(grammarAccess.getTempFormulaAccess().getWeightAssignment_6_3()); 
            // InternalLiTeLLab.g:1252:2: ( rule__TempFormula__WeightAssignment_6_3 )
            // InternalLiTeLLab.g:1252:3: rule__TempFormula__WeightAssignment_6_3
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
    // InternalLiTeLLab.g:1260:1: rule__TempFormula__Group_6__4 : rule__TempFormula__Group_6__4__Impl ;
    public final void rule__TempFormula__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1264:1: ( rule__TempFormula__Group_6__4__Impl )
            // InternalLiTeLLab.g:1265:2: rule__TempFormula__Group_6__4__Impl
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
    // InternalLiTeLLab.g:1271:1: rule__TempFormula__Group_6__4__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1275:1: ( ( ')' ) )
            // InternalLiTeLLab.g:1276:1: ( ')' )
            {
            // InternalLiTeLLab.g:1276:1: ( ')' )
            // InternalLiTeLLab.g:1277:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_6_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLiTeLLab.g:1287:1: rule__TempFormula__Group_7__0 : rule__TempFormula__Group_7__0__Impl rule__TempFormula__Group_7__1 ;
    public final void rule__TempFormula__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1291:1: ( rule__TempFormula__Group_7__0__Impl rule__TempFormula__Group_7__1 )
            // InternalLiTeLLab.g:1292:2: rule__TempFormula__Group_7__0__Impl rule__TempFormula__Group_7__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalLiTeLLab.g:1299:1: rule__TempFormula__Group_7__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1303:1: ( ( '(' ) )
            // InternalLiTeLLab.g:1304:1: ( '(' )
            {
            // InternalLiTeLLab.g:1304:1: ( '(' )
            // InternalLiTeLLab.g:1305:2: '('
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalLiTeLLab.g:1314:1: rule__TempFormula__Group_7__1 : rule__TempFormula__Group_7__1__Impl rule__TempFormula__Group_7__2 ;
    public final void rule__TempFormula__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1318:1: ( rule__TempFormula__Group_7__1__Impl rule__TempFormula__Group_7__2 )
            // InternalLiTeLLab.g:1319:2: rule__TempFormula__Group_7__1__Impl rule__TempFormula__Group_7__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalLiTeLLab.g:1326:1: rule__TempFormula__Group_7__1__Impl : ( 'iw' ) ;
    public final void rule__TempFormula__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1330:1: ( ( 'iw' ) )
            // InternalLiTeLLab.g:1331:1: ( 'iw' )
            {
            // InternalLiTeLLab.g:1331:1: ( 'iw' )
            // InternalLiTeLLab.g:1332:2: 'iw'
            {
             before(grammarAccess.getTempFormulaAccess().getIwKeyword_7_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getIwKeyword_7_1()); 

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
    // InternalLiTeLLab.g:1341:1: rule__TempFormula__Group_7__2 : rule__TempFormula__Group_7__2__Impl rule__TempFormula__Group_7__3 ;
    public final void rule__TempFormula__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1345:1: ( rule__TempFormula__Group_7__2__Impl rule__TempFormula__Group_7__3 )
            // InternalLiTeLLab.g:1346:2: rule__TempFormula__Group_7__2__Impl rule__TempFormula__Group_7__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalLiTeLLab.g:1353:1: rule__TempFormula__Group_7__2__Impl : ( ( rule__TempFormula__IapAssignment_7_2 ) ) ;
    public final void rule__TempFormula__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1357:1: ( ( ( rule__TempFormula__IapAssignment_7_2 ) ) )
            // InternalLiTeLLab.g:1358:1: ( ( rule__TempFormula__IapAssignment_7_2 ) )
            {
            // InternalLiTeLLab.g:1358:1: ( ( rule__TempFormula__IapAssignment_7_2 ) )
            // InternalLiTeLLab.g:1359:2: ( rule__TempFormula__IapAssignment_7_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getIapAssignment_7_2()); 
            // InternalLiTeLLab.g:1360:2: ( rule__TempFormula__IapAssignment_7_2 )
            // InternalLiTeLLab.g:1360:3: rule__TempFormula__IapAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__IapAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getIapAssignment_7_2()); 

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
    // InternalLiTeLLab.g:1368:1: rule__TempFormula__Group_7__3 : rule__TempFormula__Group_7__3__Impl rule__TempFormula__Group_7__4 ;
    public final void rule__TempFormula__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1372:1: ( rule__TempFormula__Group_7__3__Impl rule__TempFormula__Group_7__4 )
            // InternalLiTeLLab.g:1373:2: rule__TempFormula__Group_7__3__Impl rule__TempFormula__Group_7__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalLiTeLLab.g:1380:1: rule__TempFormula__Group_7__3__Impl : ( ( rule__TempFormula__WeightAssignment_7_3 ) ) ;
    public final void rule__TempFormula__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1384:1: ( ( ( rule__TempFormula__WeightAssignment_7_3 ) ) )
            // InternalLiTeLLab.g:1385:1: ( ( rule__TempFormula__WeightAssignment_7_3 ) )
            {
            // InternalLiTeLLab.g:1385:1: ( ( rule__TempFormula__WeightAssignment_7_3 ) )
            // InternalLiTeLLab.g:1386:2: ( rule__TempFormula__WeightAssignment_7_3 )
            {
             before(grammarAccess.getTempFormulaAccess().getWeightAssignment_7_3()); 
            // InternalLiTeLLab.g:1387:2: ( rule__TempFormula__WeightAssignment_7_3 )
            // InternalLiTeLLab.g:1387:3: rule__TempFormula__WeightAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__WeightAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getWeightAssignment_7_3()); 

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
    // InternalLiTeLLab.g:1395:1: rule__TempFormula__Group_7__4 : rule__TempFormula__Group_7__4__Impl ;
    public final void rule__TempFormula__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1399:1: ( rule__TempFormula__Group_7__4__Impl )
            // InternalLiTeLLab.g:1400:2: rule__TempFormula__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_7__4__Impl();

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
    // InternalLiTeLLab.g:1406:1: rule__TempFormula__Group_7__4__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1410:1: ( ( ')' ) )
            // InternalLiTeLLab.g:1411:1: ( ')' )
            {
            // InternalLiTeLLab.g:1411:1: ( ')' )
            // InternalLiTeLLab.g:1412:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_7_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_7_4()); 

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


    // $ANTLR start "rule__TempFormula__Group_8__0"
    // InternalLiTeLLab.g:1422:1: rule__TempFormula__Group_8__0 : rule__TempFormula__Group_8__0__Impl rule__TempFormula__Group_8__1 ;
    public final void rule__TempFormula__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1426:1: ( rule__TempFormula__Group_8__0__Impl rule__TempFormula__Group_8__1 )
            // InternalLiTeLLab.g:1427:2: rule__TempFormula__Group_8__0__Impl rule__TempFormula__Group_8__1
            {
            pushFollow(FOLLOW_17);
            rule__TempFormula__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_8__1();

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
    // $ANTLR end "rule__TempFormula__Group_8__0"


    // $ANTLR start "rule__TempFormula__Group_8__0__Impl"
    // InternalLiTeLLab.g:1434:1: rule__TempFormula__Group_8__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1438:1: ( ( '(' ) )
            // InternalLiTeLLab.g:1439:1: ( '(' )
            {
            // InternalLiTeLLab.g:1439:1: ( '(' )
            // InternalLiTeLLab.g:1440:2: '('
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_8_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getLeftParenthesisKeyword_8_0()); 

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
    // $ANTLR end "rule__TempFormula__Group_8__0__Impl"


    // $ANTLR start "rule__TempFormula__Group_8__1"
    // InternalLiTeLLab.g:1449:1: rule__TempFormula__Group_8__1 : rule__TempFormula__Group_8__1__Impl rule__TempFormula__Group_8__2 ;
    public final void rule__TempFormula__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1453:1: ( rule__TempFormula__Group_8__1__Impl rule__TempFormula__Group_8__2 )
            // InternalLiTeLLab.g:1454:2: rule__TempFormula__Group_8__1__Impl rule__TempFormula__Group_8__2
            {
            pushFollow(FOLLOW_6);
            rule__TempFormula__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_8__2();

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
    // $ANTLR end "rule__TempFormula__Group_8__1"


    // $ANTLR start "rule__TempFormula__Group_8__1__Impl"
    // InternalLiTeLLab.g:1461:1: rule__TempFormula__Group_8__1__Impl : ( 'next' ) ;
    public final void rule__TempFormula__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1465:1: ( ( 'next' ) )
            // InternalLiTeLLab.g:1466:1: ( 'next' )
            {
            // InternalLiTeLLab.g:1466:1: ( 'next' )
            // InternalLiTeLLab.g:1467:2: 'next'
            {
             before(grammarAccess.getTempFormulaAccess().getNextKeyword_8_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getNextKeyword_8_1()); 

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
    // $ANTLR end "rule__TempFormula__Group_8__1__Impl"


    // $ANTLR start "rule__TempFormula__Group_8__2"
    // InternalLiTeLLab.g:1476:1: rule__TempFormula__Group_8__2 : rule__TempFormula__Group_8__2__Impl rule__TempFormula__Group_8__3 ;
    public final void rule__TempFormula__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1480:1: ( rule__TempFormula__Group_8__2__Impl rule__TempFormula__Group_8__3 )
            // InternalLiTeLLab.g:1481:2: rule__TempFormula__Group_8__2__Impl rule__TempFormula__Group_8__3
            {
            pushFollow(FOLLOW_3);
            rule__TempFormula__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_8__3();

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
    // $ANTLR end "rule__TempFormula__Group_8__2"


    // $ANTLR start "rule__TempFormula__Group_8__2__Impl"
    // InternalLiTeLLab.g:1488:1: rule__TempFormula__Group_8__2__Impl : ( ( rule__TempFormula__FNextAssignment_8_2 ) ) ;
    public final void rule__TempFormula__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1492:1: ( ( ( rule__TempFormula__FNextAssignment_8_2 ) ) )
            // InternalLiTeLLab.g:1493:1: ( ( rule__TempFormula__FNextAssignment_8_2 ) )
            {
            // InternalLiTeLLab.g:1493:1: ( ( rule__TempFormula__FNextAssignment_8_2 ) )
            // InternalLiTeLLab.g:1494:2: ( rule__TempFormula__FNextAssignment_8_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getFNextAssignment_8_2()); 
            // InternalLiTeLLab.g:1495:2: ( rule__TempFormula__FNextAssignment_8_2 )
            // InternalLiTeLLab.g:1495:3: rule__TempFormula__FNextAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__FNextAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getFNextAssignment_8_2()); 

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
    // $ANTLR end "rule__TempFormula__Group_8__2__Impl"


    // $ANTLR start "rule__TempFormula__Group_8__3"
    // InternalLiTeLLab.g:1503:1: rule__TempFormula__Group_8__3 : rule__TempFormula__Group_8__3__Impl rule__TempFormula__Group_8__4 ;
    public final void rule__TempFormula__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1507:1: ( rule__TempFormula__Group_8__3__Impl rule__TempFormula__Group_8__4 )
            // InternalLiTeLLab.g:1508:2: rule__TempFormula__Group_8__3__Impl rule__TempFormula__Group_8__4
            {
            pushFollow(FOLLOW_18);
            rule__TempFormula__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_8__4();

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
    // $ANTLR end "rule__TempFormula__Group_8__3"


    // $ANTLR start "rule__TempFormula__Group_8__3__Impl"
    // InternalLiTeLLab.g:1515:1: rule__TempFormula__Group_8__3__Impl : ( ( rule__TempFormula__X1Assignment_8_3 ) ) ;
    public final void rule__TempFormula__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1519:1: ( ( ( rule__TempFormula__X1Assignment_8_3 ) ) )
            // InternalLiTeLLab.g:1520:1: ( ( rule__TempFormula__X1Assignment_8_3 ) )
            {
            // InternalLiTeLLab.g:1520:1: ( ( rule__TempFormula__X1Assignment_8_3 ) )
            // InternalLiTeLLab.g:1521:2: ( rule__TempFormula__X1Assignment_8_3 )
            {
             before(grammarAccess.getTempFormulaAccess().getX1Assignment_8_3()); 
            // InternalLiTeLLab.g:1522:2: ( rule__TempFormula__X1Assignment_8_3 )
            // InternalLiTeLLab.g:1522:3: rule__TempFormula__X1Assignment_8_3
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__X1Assignment_8_3();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getX1Assignment_8_3()); 

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
    // $ANTLR end "rule__TempFormula__Group_8__3__Impl"


    // $ANTLR start "rule__TempFormula__Group_8__4"
    // InternalLiTeLLab.g:1530:1: rule__TempFormula__Group_8__4 : rule__TempFormula__Group_8__4__Impl rule__TempFormula__Group_8__5 ;
    public final void rule__TempFormula__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1534:1: ( rule__TempFormula__Group_8__4__Impl rule__TempFormula__Group_8__5 )
            // InternalLiTeLLab.g:1535:2: rule__TempFormula__Group_8__4__Impl rule__TempFormula__Group_8__5
            {
            pushFollow(FOLLOW_18);
            rule__TempFormula__Group_8__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_8__5();

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
    // $ANTLR end "rule__TempFormula__Group_8__4"


    // $ANTLR start "rule__TempFormula__Group_8__4__Impl"
    // InternalLiTeLLab.g:1542:1: rule__TempFormula__Group_8__4__Impl : ( ( rule__TempFormula__X2Assignment_8_4 )? ) ;
    public final void rule__TempFormula__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1546:1: ( ( ( rule__TempFormula__X2Assignment_8_4 )? ) )
            // InternalLiTeLLab.g:1547:1: ( ( rule__TempFormula__X2Assignment_8_4 )? )
            {
            // InternalLiTeLLab.g:1547:1: ( ( rule__TempFormula__X2Assignment_8_4 )? )
            // InternalLiTeLLab.g:1548:2: ( rule__TempFormula__X2Assignment_8_4 )?
            {
             before(grammarAccess.getTempFormulaAccess().getX2Assignment_8_4()); 
            // InternalLiTeLLab.g:1549:2: ( rule__TempFormula__X2Assignment_8_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLiTeLLab.g:1549:3: rule__TempFormula__X2Assignment_8_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempFormula__X2Assignment_8_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTempFormulaAccess().getX2Assignment_8_4()); 

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
    // $ANTLR end "rule__TempFormula__Group_8__4__Impl"


    // $ANTLR start "rule__TempFormula__Group_8__5"
    // InternalLiTeLLab.g:1557:1: rule__TempFormula__Group_8__5 : rule__TempFormula__Group_8__5__Impl ;
    public final void rule__TempFormula__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1561:1: ( rule__TempFormula__Group_8__5__Impl )
            // InternalLiTeLLab.g:1562:2: rule__TempFormula__Group_8__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_8__5__Impl();

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
    // $ANTLR end "rule__TempFormula__Group_8__5"


    // $ANTLR start "rule__TempFormula__Group_8__5__Impl"
    // InternalLiTeLLab.g:1568:1: rule__TempFormula__Group_8__5__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1572:1: ( ( ')' ) )
            // InternalLiTeLLab.g:1573:1: ( ')' )
            {
            // InternalLiTeLLab.g:1573:1: ( ')' )
            // InternalLiTeLLab.g:1574:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_8_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_8_5()); 

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
    // $ANTLR end "rule__TempFormula__Group_8__5__Impl"


    // $ANTLR start "rule__TempFormula__Group_9__0"
    // InternalLiTeLLab.g:1584:1: rule__TempFormula__Group_9__0 : rule__TempFormula__Group_9__0__Impl rule__TempFormula__Group_9__1 ;
    public final void rule__TempFormula__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1588:1: ( rule__TempFormula__Group_9__0__Impl rule__TempFormula__Group_9__1 )
            // InternalLiTeLLab.g:1589:2: rule__TempFormula__Group_9__0__Impl rule__TempFormula__Group_9__1
            {
            pushFollow(FOLLOW_19);
            rule__TempFormula__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_9__1();

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
    // $ANTLR end "rule__TempFormula__Group_9__0"


    // $ANTLR start "rule__TempFormula__Group_9__0__Impl"
    // InternalLiTeLLab.g:1596:1: rule__TempFormula__Group_9__0__Impl : ( '([' ) ;
    public final void rule__TempFormula__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1600:1: ( ( '([' ) )
            // InternalLiTeLLab.g:1601:1: ( '([' )
            {
            // InternalLiTeLLab.g:1601:1: ( '([' )
            // InternalLiTeLLab.g:1602:2: '(['
            {
             before(grammarAccess.getTempFormulaAccess().getLeftParenthesisLeftSquareBracketKeyword_9_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getLeftParenthesisLeftSquareBracketKeyword_9_0()); 

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
    // $ANTLR end "rule__TempFormula__Group_9__0__Impl"


    // $ANTLR start "rule__TempFormula__Group_9__1"
    // InternalLiTeLLab.g:1611:1: rule__TempFormula__Group_9__1 : rule__TempFormula__Group_9__1__Impl rule__TempFormula__Group_9__2 ;
    public final void rule__TempFormula__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1615:1: ( rule__TempFormula__Group_9__1__Impl rule__TempFormula__Group_9__2 )
            // InternalLiTeLLab.g:1616:2: rule__TempFormula__Group_9__1__Impl rule__TempFormula__Group_9__2
            {
            pushFollow(FOLLOW_20);
            rule__TempFormula__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_9__2();

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
    // $ANTLR end "rule__TempFormula__Group_9__1"


    // $ANTLR start "rule__TempFormula__Group_9__1__Impl"
    // InternalLiTeLLab.g:1623:1: rule__TempFormula__Group_9__1__Impl : ( ( rule__TempFormula__CompAssignment_9_1 ) ) ;
    public final void rule__TempFormula__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1627:1: ( ( ( rule__TempFormula__CompAssignment_9_1 ) ) )
            // InternalLiTeLLab.g:1628:1: ( ( rule__TempFormula__CompAssignment_9_1 ) )
            {
            // InternalLiTeLLab.g:1628:1: ( ( rule__TempFormula__CompAssignment_9_1 ) )
            // InternalLiTeLLab.g:1629:2: ( rule__TempFormula__CompAssignment_9_1 )
            {
             before(grammarAccess.getTempFormulaAccess().getCompAssignment_9_1()); 
            // InternalLiTeLLab.g:1630:2: ( rule__TempFormula__CompAssignment_9_1 )
            // InternalLiTeLLab.g:1630:3: rule__TempFormula__CompAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__CompAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getCompAssignment_9_1()); 

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
    // $ANTLR end "rule__TempFormula__Group_9__1__Impl"


    // $ANTLR start "rule__TempFormula__Group_9__2"
    // InternalLiTeLLab.g:1638:1: rule__TempFormula__Group_9__2 : rule__TempFormula__Group_9__2__Impl rule__TempFormula__Group_9__3 ;
    public final void rule__TempFormula__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1642:1: ( rule__TempFormula__Group_9__2__Impl rule__TempFormula__Group_9__3 )
            // InternalLiTeLLab.g:1643:2: rule__TempFormula__Group_9__2__Impl rule__TempFormula__Group_9__3
            {
            pushFollow(FOLLOW_21);
            rule__TempFormula__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_9__3();

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
    // $ANTLR end "rule__TempFormula__Group_9__2"


    // $ANTLR start "rule__TempFormula__Group_9__2__Impl"
    // InternalLiTeLLab.g:1650:1: rule__TempFormula__Group_9__2__Impl : ( ']' ) ;
    public final void rule__TempFormula__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1654:1: ( ( ']' ) )
            // InternalLiTeLLab.g:1655:1: ( ']' )
            {
            // InternalLiTeLLab.g:1655:1: ( ']' )
            // InternalLiTeLLab.g:1656:2: ']'
            {
             before(grammarAccess.getTempFormulaAccess().getRightSquareBracketKeyword_9_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getRightSquareBracketKeyword_9_2()); 

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
    // $ANTLR end "rule__TempFormula__Group_9__2__Impl"


    // $ANTLR start "rule__TempFormula__Group_9__3"
    // InternalLiTeLLab.g:1665:1: rule__TempFormula__Group_9__3 : rule__TempFormula__Group_9__3__Impl rule__TempFormula__Group_9__4 ;
    public final void rule__TempFormula__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1669:1: ( rule__TempFormula__Group_9__3__Impl rule__TempFormula__Group_9__4 )
            // InternalLiTeLLab.g:1670:2: rule__TempFormula__Group_9__3__Impl rule__TempFormula__Group_9__4
            {
            pushFollow(FOLLOW_21);
            rule__TempFormula__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_9__4();

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
    // $ANTLR end "rule__TempFormula__Group_9__3"


    // $ANTLR start "rule__TempFormula__Group_9__3__Impl"
    // InternalLiTeLLab.g:1677:1: rule__TempFormula__Group_9__3__Impl : ( ( rule__TempFormula__Tt1Assignment_9_3 ) ) ;
    public final void rule__TempFormula__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1681:1: ( ( ( rule__TempFormula__Tt1Assignment_9_3 ) ) )
            // InternalLiTeLLab.g:1682:1: ( ( rule__TempFormula__Tt1Assignment_9_3 ) )
            {
            // InternalLiTeLLab.g:1682:1: ( ( rule__TempFormula__Tt1Assignment_9_3 ) )
            // InternalLiTeLLab.g:1683:2: ( rule__TempFormula__Tt1Assignment_9_3 )
            {
             before(grammarAccess.getTempFormulaAccess().getTt1Assignment_9_3()); 
            // InternalLiTeLLab.g:1684:2: ( rule__TempFormula__Tt1Assignment_9_3 )
            // InternalLiTeLLab.g:1684:3: rule__TempFormula__Tt1Assignment_9_3
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__Tt1Assignment_9_3();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getTt1Assignment_9_3()); 

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
    // $ANTLR end "rule__TempFormula__Group_9__3__Impl"


    // $ANTLR start "rule__TempFormula__Group_9__4"
    // InternalLiTeLLab.g:1692:1: rule__TempFormula__Group_9__4 : rule__TempFormula__Group_9__4__Impl rule__TempFormula__Group_9__5 ;
    public final void rule__TempFormula__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1696:1: ( rule__TempFormula__Group_9__4__Impl rule__TempFormula__Group_9__5 )
            // InternalLiTeLLab.g:1697:2: rule__TempFormula__Group_9__4__Impl rule__TempFormula__Group_9__5
            {
            pushFollow(FOLLOW_7);
            rule__TempFormula__Group_9__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_9__5();

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
    // $ANTLR end "rule__TempFormula__Group_9__4"


    // $ANTLR start "rule__TempFormula__Group_9__4__Impl"
    // InternalLiTeLLab.g:1704:1: rule__TempFormula__Group_9__4__Impl : ( ( rule__TempFormula__Tt2Assignment_9_4 ) ) ;
    public final void rule__TempFormula__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1708:1: ( ( ( rule__TempFormula__Tt2Assignment_9_4 ) ) )
            // InternalLiTeLLab.g:1709:1: ( ( rule__TempFormula__Tt2Assignment_9_4 ) )
            {
            // InternalLiTeLLab.g:1709:1: ( ( rule__TempFormula__Tt2Assignment_9_4 ) )
            // InternalLiTeLLab.g:1710:2: ( rule__TempFormula__Tt2Assignment_9_4 )
            {
             before(grammarAccess.getTempFormulaAccess().getTt2Assignment_9_4()); 
            // InternalLiTeLLab.g:1711:2: ( rule__TempFormula__Tt2Assignment_9_4 )
            // InternalLiTeLLab.g:1711:3: rule__TempFormula__Tt2Assignment_9_4
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__Tt2Assignment_9_4();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getTt2Assignment_9_4()); 

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
    // $ANTLR end "rule__TempFormula__Group_9__4__Impl"


    // $ANTLR start "rule__TempFormula__Group_9__5"
    // InternalLiTeLLab.g:1719:1: rule__TempFormula__Group_9__5 : rule__TempFormula__Group_9__5__Impl ;
    public final void rule__TempFormula__Group_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1723:1: ( rule__TempFormula__Group_9__5__Impl )
            // InternalLiTeLLab.g:1724:2: rule__TempFormula__Group_9__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TempFormula__Group_9__5__Impl();

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
    // $ANTLR end "rule__TempFormula__Group_9__5"


    // $ANTLR start "rule__TempFormula__Group_9__5__Impl"
    // InternalLiTeLLab.g:1730:1: rule__TempFormula__Group_9__5__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1734:1: ( ( ')' ) )
            // InternalLiTeLLab.g:1735:1: ( ')' )
            {
            // InternalLiTeLLab.g:1735:1: ( ')' )
            // InternalLiTeLLab.g:1736:2: ')'
            {
             before(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_9_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getRightParenthesisKeyword_9_5()); 

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
    // $ANTLR end "rule__TempFormula__Group_9__5__Impl"


    // $ANTLR start "rule__AP__Group__0"
    // InternalLiTeLLab.g:1746:1: rule__AP__Group__0 : rule__AP__Group__0__Impl rule__AP__Group__1 ;
    public final void rule__AP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1750:1: ( rule__AP__Group__0__Impl rule__AP__Group__1 )
            // InternalLiTeLLab.g:1751:2: rule__AP__Group__0__Impl rule__AP__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalLiTeLLab.g:1758:1: rule__AP__Group__0__Impl : ( '(' ) ;
    public final void rule__AP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1762:1: ( ( '(' ) )
            // InternalLiTeLLab.g:1763:1: ( '(' )
            {
            // InternalLiTeLLab.g:1763:1: ( '(' )
            // InternalLiTeLLab.g:1764:2: '('
            {
             before(grammarAccess.getAPAccess().getLeftParenthesisKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalLiTeLLab.g:1773:1: rule__AP__Group__1 : rule__AP__Group__1__Impl rule__AP__Group__2 ;
    public final void rule__AP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1777:1: ( rule__AP__Group__1__Impl rule__AP__Group__2 )
            // InternalLiTeLLab.g:1778:2: rule__AP__Group__1__Impl rule__AP__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalLiTeLLab.g:1785:1: rule__AP__Group__1__Impl : ( '-' ) ;
    public final void rule__AP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1789:1: ( ( '-' ) )
            // InternalLiTeLLab.g:1790:1: ( '-' )
            {
            // InternalLiTeLLab.g:1790:1: ( '-' )
            // InternalLiTeLLab.g:1791:2: '-'
            {
             before(grammarAccess.getAPAccess().getHyphenMinusKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalLiTeLLab.g:1800:1: rule__AP__Group__2 : rule__AP__Group__2__Impl rule__AP__Group__3 ;
    public final void rule__AP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1804:1: ( rule__AP__Group__2__Impl rule__AP__Group__3 )
            // InternalLiTeLLab.g:1805:2: rule__AP__Group__2__Impl rule__AP__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalLiTeLLab.g:1812:1: rule__AP__Group__2__Impl : ( ( rule__AP__Alternatives_2 ) ) ;
    public final void rule__AP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1816:1: ( ( ( rule__AP__Alternatives_2 ) ) )
            // InternalLiTeLLab.g:1817:1: ( ( rule__AP__Alternatives_2 ) )
            {
            // InternalLiTeLLab.g:1817:1: ( ( rule__AP__Alternatives_2 ) )
            // InternalLiTeLLab.g:1818:2: ( rule__AP__Alternatives_2 )
            {
             before(grammarAccess.getAPAccess().getAlternatives_2()); 
            // InternalLiTeLLab.g:1819:2: ( rule__AP__Alternatives_2 )
            // InternalLiTeLLab.g:1819:3: rule__AP__Alternatives_2
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
    // InternalLiTeLLab.g:1827:1: rule__AP__Group__3 : rule__AP__Group__3__Impl rule__AP__Group__4 ;
    public final void rule__AP__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1831:1: ( rule__AP__Group__3__Impl rule__AP__Group__4 )
            // InternalLiTeLLab.g:1832:2: rule__AP__Group__3__Impl rule__AP__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalLiTeLLab.g:1839:1: rule__AP__Group__3__Impl : ( '-' ) ;
    public final void rule__AP__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1843:1: ( ( '-' ) )
            // InternalLiTeLLab.g:1844:1: ( '-' )
            {
            // InternalLiTeLLab.g:1844:1: ( '-' )
            // InternalLiTeLLab.g:1845:2: '-'
            {
             before(grammarAccess.getAPAccess().getHyphenMinusKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalLiTeLLab.g:1854:1: rule__AP__Group__4 : rule__AP__Group__4__Impl rule__AP__Group__5 ;
    public final void rule__AP__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1858:1: ( rule__AP__Group__4__Impl rule__AP__Group__5 )
            // InternalLiTeLLab.g:1859:2: rule__AP__Group__4__Impl rule__AP__Group__5
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
    // InternalLiTeLLab.g:1866:1: rule__AP__Group__4__Impl : ( ( rule__AP__PNameAssignment_4 ) ) ;
    public final void rule__AP__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1870:1: ( ( ( rule__AP__PNameAssignment_4 ) ) )
            // InternalLiTeLLab.g:1871:1: ( ( rule__AP__PNameAssignment_4 ) )
            {
            // InternalLiTeLLab.g:1871:1: ( ( rule__AP__PNameAssignment_4 ) )
            // InternalLiTeLLab.g:1872:2: ( rule__AP__PNameAssignment_4 )
            {
             before(grammarAccess.getAPAccess().getPNameAssignment_4()); 
            // InternalLiTeLLab.g:1873:2: ( rule__AP__PNameAssignment_4 )
            // InternalLiTeLLab.g:1873:3: rule__AP__PNameAssignment_4
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
    // InternalLiTeLLab.g:1881:1: rule__AP__Group__5 : rule__AP__Group__5__Impl ;
    public final void rule__AP__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1885:1: ( rule__AP__Group__5__Impl )
            // InternalLiTeLLab.g:1886:2: rule__AP__Group__5__Impl
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
    // InternalLiTeLLab.g:1892:1: rule__AP__Group__5__Impl : ( ')' ) ;
    public final void rule__AP__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1896:1: ( ( ')' ) )
            // InternalLiTeLLab.g:1897:1: ( ')' )
            {
            // InternalLiTeLLab.g:1897:1: ( ')' )
            // InternalLiTeLLab.g:1898:2: ')'
            {
             before(grammarAccess.getAPAccess().getRightParenthesisKeyword_5()); 
            match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__VAR__Group__0"
    // InternalLiTeLLab.g:1908:1: rule__VAR__Group__0 : rule__VAR__Group__0__Impl rule__VAR__Group__1 ;
    public final void rule__VAR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1912:1: ( rule__VAR__Group__0__Impl rule__VAR__Group__1 )
            // InternalLiTeLLab.g:1913:2: rule__VAR__Group__0__Impl rule__VAR__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__VAR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAR__Group__1();

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
    // $ANTLR end "rule__VAR__Group__0"


    // $ANTLR start "rule__VAR__Group__0__Impl"
    // InternalLiTeLLab.g:1920:1: rule__VAR__Group__0__Impl : ( '(' ) ;
    public final void rule__VAR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1924:1: ( ( '(' ) )
            // InternalLiTeLLab.g:1925:1: ( '(' )
            {
            // InternalLiTeLLab.g:1925:1: ( '(' )
            // InternalLiTeLLab.g:1926:2: '('
            {
             before(grammarAccess.getVARAccess().getLeftParenthesisKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVARAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__VAR__Group__0__Impl"


    // $ANTLR start "rule__VAR__Group__1"
    // InternalLiTeLLab.g:1935:1: rule__VAR__Group__1 : rule__VAR__Group__1__Impl rule__VAR__Group__2 ;
    public final void rule__VAR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1939:1: ( rule__VAR__Group__1__Impl rule__VAR__Group__2 )
            // InternalLiTeLLab.g:1940:2: rule__VAR__Group__1__Impl rule__VAR__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__VAR__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAR__Group__2();

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
    // $ANTLR end "rule__VAR__Group__1"


    // $ANTLR start "rule__VAR__Group__1__Impl"
    // InternalLiTeLLab.g:1947:1: rule__VAR__Group__1__Impl : ( '-' ) ;
    public final void rule__VAR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1951:1: ( ( '-' ) )
            // InternalLiTeLLab.g:1952:1: ( '-' )
            {
            // InternalLiTeLLab.g:1952:1: ( '-' )
            // InternalLiTeLLab.g:1953:2: '-'
            {
             before(grammarAccess.getVARAccess().getHyphenMinusKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVARAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__VAR__Group__1__Impl"


    // $ANTLR start "rule__VAR__Group__2"
    // InternalLiTeLLab.g:1962:1: rule__VAR__Group__2 : rule__VAR__Group__2__Impl rule__VAR__Group__3 ;
    public final void rule__VAR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1966:1: ( rule__VAR__Group__2__Impl rule__VAR__Group__3 )
            // InternalLiTeLLab.g:1967:2: rule__VAR__Group__2__Impl rule__VAR__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__VAR__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAR__Group__3();

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
    // $ANTLR end "rule__VAR__Group__2"


    // $ANTLR start "rule__VAR__Group__2__Impl"
    // InternalLiTeLLab.g:1974:1: rule__VAR__Group__2__Impl : ( ( rule__VAR__Alternatives_2 ) ) ;
    public final void rule__VAR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1978:1: ( ( ( rule__VAR__Alternatives_2 ) ) )
            // InternalLiTeLLab.g:1979:1: ( ( rule__VAR__Alternatives_2 ) )
            {
            // InternalLiTeLLab.g:1979:1: ( ( rule__VAR__Alternatives_2 ) )
            // InternalLiTeLLab.g:1980:2: ( rule__VAR__Alternatives_2 )
            {
             before(grammarAccess.getVARAccess().getAlternatives_2()); 
            // InternalLiTeLLab.g:1981:2: ( rule__VAR__Alternatives_2 )
            // InternalLiTeLLab.g:1981:3: rule__VAR__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__VAR__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getVARAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__VAR__Group__2__Impl"


    // $ANTLR start "rule__VAR__Group__3"
    // InternalLiTeLLab.g:1989:1: rule__VAR__Group__3 : rule__VAR__Group__3__Impl rule__VAR__Group__4 ;
    public final void rule__VAR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:1993:1: ( rule__VAR__Group__3__Impl rule__VAR__Group__4 )
            // InternalLiTeLLab.g:1994:2: rule__VAR__Group__3__Impl rule__VAR__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__VAR__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAR__Group__4();

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
    // $ANTLR end "rule__VAR__Group__3"


    // $ANTLR start "rule__VAR__Group__3__Impl"
    // InternalLiTeLLab.g:2001:1: rule__VAR__Group__3__Impl : ( '-' ) ;
    public final void rule__VAR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2005:1: ( ( '-' ) )
            // InternalLiTeLLab.g:2006:1: ( '-' )
            {
            // InternalLiTeLLab.g:2006:1: ( '-' )
            // InternalLiTeLLab.g:2007:2: '-'
            {
             before(grammarAccess.getVARAccess().getHyphenMinusKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVARAccess().getHyphenMinusKeyword_3()); 

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
    // $ANTLR end "rule__VAR__Group__3__Impl"


    // $ANTLR start "rule__VAR__Group__4"
    // InternalLiTeLLab.g:2016:1: rule__VAR__Group__4 : rule__VAR__Group__4__Impl rule__VAR__Group__5 ;
    public final void rule__VAR__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2020:1: ( rule__VAR__Group__4__Impl rule__VAR__Group__5 )
            // InternalLiTeLLab.g:2021:2: rule__VAR__Group__4__Impl rule__VAR__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__VAR__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VAR__Group__5();

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
    // $ANTLR end "rule__VAR__Group__4"


    // $ANTLR start "rule__VAR__Group__4__Impl"
    // InternalLiTeLLab.g:2028:1: rule__VAR__Group__4__Impl : ( ( rule__VAR__VNameAssignment_4 ) ) ;
    public final void rule__VAR__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2032:1: ( ( ( rule__VAR__VNameAssignment_4 ) ) )
            // InternalLiTeLLab.g:2033:1: ( ( rule__VAR__VNameAssignment_4 ) )
            {
            // InternalLiTeLLab.g:2033:1: ( ( rule__VAR__VNameAssignment_4 ) )
            // InternalLiTeLLab.g:2034:2: ( rule__VAR__VNameAssignment_4 )
            {
             before(grammarAccess.getVARAccess().getVNameAssignment_4()); 
            // InternalLiTeLLab.g:2035:2: ( rule__VAR__VNameAssignment_4 )
            // InternalLiTeLLab.g:2035:3: rule__VAR__VNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VAR__VNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVARAccess().getVNameAssignment_4()); 

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
    // $ANTLR end "rule__VAR__Group__4__Impl"


    // $ANTLR start "rule__VAR__Group__5"
    // InternalLiTeLLab.g:2043:1: rule__VAR__Group__5 : rule__VAR__Group__5__Impl ;
    public final void rule__VAR__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2047:1: ( rule__VAR__Group__5__Impl )
            // InternalLiTeLLab.g:2048:2: rule__VAR__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VAR__Group__5__Impl();

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
    // $ANTLR end "rule__VAR__Group__5"


    // $ANTLR start "rule__VAR__Group__5__Impl"
    // InternalLiTeLLab.g:2054:1: rule__VAR__Group__5__Impl : ( ')' ) ;
    public final void rule__VAR__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2058:1: ( ( ')' ) )
            // InternalLiTeLLab.g:2059:1: ( ')' )
            {
            // InternalLiTeLLab.g:2059:1: ( ')' )
            // InternalLiTeLLab.g:2060:2: ')'
            {
             before(grammarAccess.getVARAccess().getRightParenthesisKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVARAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__VAR__Group__5__Impl"


    // $ANTLR start "rule__OldVAR__Group__0"
    // InternalLiTeLLab.g:2070:1: rule__OldVAR__Group__0 : rule__OldVAR__Group__0__Impl rule__OldVAR__Group__1 ;
    public final void rule__OldVAR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2074:1: ( rule__OldVAR__Group__0__Impl rule__OldVAR__Group__1 )
            // InternalLiTeLLab.g:2075:2: rule__OldVAR__Group__0__Impl rule__OldVAR__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__OldVAR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OldVAR__Group__1();

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
    // $ANTLR end "rule__OldVAR__Group__0"


    // $ANTLR start "rule__OldVAR__Group__0__Impl"
    // InternalLiTeLLab.g:2082:1: rule__OldVAR__Group__0__Impl : ( '(' ) ;
    public final void rule__OldVAR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2086:1: ( ( '(' ) )
            // InternalLiTeLLab.g:2087:1: ( '(' )
            {
            // InternalLiTeLLab.g:2087:1: ( '(' )
            // InternalLiTeLLab.g:2088:2: '('
            {
             before(grammarAccess.getOldVARAccess().getLeftParenthesisKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOldVARAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__OldVAR__Group__0__Impl"


    // $ANTLR start "rule__OldVAR__Group__1"
    // InternalLiTeLLab.g:2097:1: rule__OldVAR__Group__1 : rule__OldVAR__Group__1__Impl rule__OldVAR__Group__2 ;
    public final void rule__OldVAR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2101:1: ( rule__OldVAR__Group__1__Impl rule__OldVAR__Group__2 )
            // InternalLiTeLLab.g:2102:2: rule__OldVAR__Group__1__Impl rule__OldVAR__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__OldVAR__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OldVAR__Group__2();

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
    // $ANTLR end "rule__OldVAR__Group__1"


    // $ANTLR start "rule__OldVAR__Group__1__Impl"
    // InternalLiTeLLab.g:2109:1: rule__OldVAR__Group__1__Impl : ( 'old' ) ;
    public final void rule__OldVAR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2113:1: ( ( 'old' ) )
            // InternalLiTeLLab.g:2114:1: ( 'old' )
            {
            // InternalLiTeLLab.g:2114:1: ( 'old' )
            // InternalLiTeLLab.g:2115:2: 'old'
            {
             before(grammarAccess.getOldVARAccess().getOldKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getOldVARAccess().getOldKeyword_1()); 

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
    // $ANTLR end "rule__OldVAR__Group__1__Impl"


    // $ANTLR start "rule__OldVAR__Group__2"
    // InternalLiTeLLab.g:2124:1: rule__OldVAR__Group__2 : rule__OldVAR__Group__2__Impl rule__OldVAR__Group__3 ;
    public final void rule__OldVAR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2128:1: ( rule__OldVAR__Group__2__Impl rule__OldVAR__Group__3 )
            // InternalLiTeLLab.g:2129:2: rule__OldVAR__Group__2__Impl rule__OldVAR__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__OldVAR__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OldVAR__Group__3();

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
    // $ANTLR end "rule__OldVAR__Group__2"


    // $ANTLR start "rule__OldVAR__Group__2__Impl"
    // InternalLiTeLLab.g:2136:1: rule__OldVAR__Group__2__Impl : ( ( rule__OldVAR__VarAssignment_2 ) ) ;
    public final void rule__OldVAR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2140:1: ( ( ( rule__OldVAR__VarAssignment_2 ) ) )
            // InternalLiTeLLab.g:2141:1: ( ( rule__OldVAR__VarAssignment_2 ) )
            {
            // InternalLiTeLLab.g:2141:1: ( ( rule__OldVAR__VarAssignment_2 ) )
            // InternalLiTeLLab.g:2142:2: ( rule__OldVAR__VarAssignment_2 )
            {
             before(grammarAccess.getOldVARAccess().getVarAssignment_2()); 
            // InternalLiTeLLab.g:2143:2: ( rule__OldVAR__VarAssignment_2 )
            // InternalLiTeLLab.g:2143:3: rule__OldVAR__VarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OldVAR__VarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOldVARAccess().getVarAssignment_2()); 

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
    // $ANTLR end "rule__OldVAR__Group__2__Impl"


    // $ANTLR start "rule__OldVAR__Group__3"
    // InternalLiTeLLab.g:2151:1: rule__OldVAR__Group__3 : rule__OldVAR__Group__3__Impl ;
    public final void rule__OldVAR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2155:1: ( rule__OldVAR__Group__3__Impl )
            // InternalLiTeLLab.g:2156:2: rule__OldVAR__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OldVAR__Group__3__Impl();

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
    // $ANTLR end "rule__OldVAR__Group__3"


    // $ANTLR start "rule__OldVAR__Group__3__Impl"
    // InternalLiTeLLab.g:2162:1: rule__OldVAR__Group__3__Impl : ( ')' ) ;
    public final void rule__OldVAR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2166:1: ( ( ')' ) )
            // InternalLiTeLLab.g:2167:1: ( ')' )
            {
            // InternalLiTeLLab.g:2167:1: ( ')' )
            // InternalLiTeLLab.g:2168:2: ')'
            {
             before(grammarAccess.getOldVARAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOldVARAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__OldVAR__Group__3__Impl"


    // $ANTLR start "rule__Model__TempFormulaAssignment"
    // InternalLiTeLLab.g:2178:1: rule__Model__TempFormulaAssignment : ( ruleTempFormula ) ;
    public final void rule__Model__TempFormulaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2182:1: ( ( ruleTempFormula ) )
            // InternalLiTeLLab.g:2183:2: ( ruleTempFormula )
            {
            // InternalLiTeLLab.g:2183:2: ( ruleTempFormula )
            // InternalLiTeLLab.g:2184:3: ruleTempFormula
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
    // InternalLiTeLLab.g:2193:1: rule__Weight__NegAssignment_0 : ( ( '-' ) ) ;
    public final void rule__Weight__NegAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2197:1: ( ( ( '-' ) ) )
            // InternalLiTeLLab.g:2198:2: ( ( '-' ) )
            {
            // InternalLiTeLLab.g:2198:2: ( ( '-' ) )
            // InternalLiTeLLab.g:2199:3: ( '-' )
            {
             before(grammarAccess.getWeightAccess().getNegHyphenMinusKeyword_0_0()); 
            // InternalLiTeLLab.g:2200:3: ( '-' )
            // InternalLiTeLLab.g:2201:4: '-'
            {
             before(grammarAccess.getWeightAccess().getNegHyphenMinusKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalLiTeLLab.g:2212:1: rule__Weight__WIntAssignment_1_0 : ( ruleWInt ) ;
    public final void rule__Weight__WIntAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2216:1: ( ( ruleWInt ) )
            // InternalLiTeLLab.g:2217:2: ( ruleWInt )
            {
            // InternalLiTeLLab.g:2217:2: ( ruleWInt )
            // InternalLiTeLLab.g:2218:3: ruleWInt
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
    // InternalLiTeLLab.g:2227:1: rule__Weight__WFloatAssignment_1_1 : ( ruleWFloat ) ;
    public final void rule__Weight__WFloatAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2231:1: ( ( ruleWFloat ) )
            // InternalLiTeLLab.g:2232:2: ( ruleWFloat )
            {
            // InternalLiTeLLab.g:2232:2: ( ruleWFloat )
            // InternalLiTeLLab.g:2233:3: ruleWFloat
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
    // InternalLiTeLLab.g:2242:1: rule__WInt__IntAssignment : ( RULE_INT ) ;
    public final void rule__WInt__IntAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2246:1: ( ( RULE_INT ) )
            // InternalLiTeLLab.g:2247:2: ( RULE_INT )
            {
            // InternalLiTeLLab.g:2247:2: ( RULE_INT )
            // InternalLiTeLLab.g:2248:3: RULE_INT
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
    // InternalLiTeLLab.g:2257:1: rule__WFloat__Int1Assignment_0 : ( RULE_INT ) ;
    public final void rule__WFloat__Int1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2261:1: ( ( RULE_INT ) )
            // InternalLiTeLLab.g:2262:2: ( RULE_INT )
            {
            // InternalLiTeLLab.g:2262:2: ( RULE_INT )
            // InternalLiTeLLab.g:2263:3: RULE_INT
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
    // InternalLiTeLLab.g:2272:1: rule__WFloat__Int2Assignment_2 : ( RULE_INT ) ;
    public final void rule__WFloat__Int2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2276:1: ( ( RULE_INT ) )
            // InternalLiTeLLab.g:2277:2: ( RULE_INT )
            {
            // InternalLiTeLLab.g:2277:2: ( RULE_INT )
            // InternalLiTeLLab.g:2278:3: RULE_INT
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
    // InternalLiTeLLab.g:2287:1: rule__TempFormula__ApAssignment_0 : ( ruleAP ) ;
    public final void rule__TempFormula__ApAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2291:1: ( ( ruleAP ) )
            // InternalLiTeLLab.g:2292:2: ( ruleAP )
            {
            // InternalLiTeLLab.g:2292:2: ( ruleAP )
            // InternalLiTeLLab.g:2293:3: ruleAP
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
    // InternalLiTeLLab.g:2302:1: rule__TempFormula__FaAssignment_1_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__FaAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2306:1: ( ( ruleTempFormula ) )
            // InternalLiTeLLab.g:2307:2: ( ruleTempFormula )
            {
            // InternalLiTeLLab.g:2307:2: ( ruleTempFormula )
            // InternalLiTeLLab.g:2308:3: ruleTempFormula
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
    // InternalLiTeLLab.g:2317:1: rule__TempFormula__FoAssignment_2_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__FoAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2321:1: ( ( ruleTempFormula ) )
            // InternalLiTeLLab.g:2322:2: ( ruleTempFormula )
            {
            // InternalLiTeLLab.g:2322:2: ( ruleTempFormula )
            // InternalLiTeLLab.g:2323:3: ruleTempFormula
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
    // InternalLiTeLLab.g:2332:1: rule__TempFormula__FnotAssignment_3_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__FnotAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2336:1: ( ( ruleTempFormula ) )
            // InternalLiTeLLab.g:2337:2: ( ruleTempFormula )
            {
            // InternalLiTeLLab.g:2337:2: ( ruleTempFormula )
            // InternalLiTeLLab.g:2338:3: ruleTempFormula
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
    // InternalLiTeLLab.g:2347:1: rule__TempFormula__Op2Assignment_4_1 : ( RULE_OP2 ) ;
    public final void rule__TempFormula__Op2Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2351:1: ( ( RULE_OP2 ) )
            // InternalLiTeLLab.g:2352:2: ( RULE_OP2 )
            {
            // InternalLiTeLLab.g:2352:2: ( RULE_OP2 )
            // InternalLiTeLLab.g:2353:3: RULE_OP2
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
    // InternalLiTeLLab.g:2362:1: rule__TempFormula__F1Assignment_4_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__F1Assignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2366:1: ( ( ruleTempFormula ) )
            // InternalLiTeLLab.g:2367:2: ( ruleTempFormula )
            {
            // InternalLiTeLLab.g:2367:2: ( ruleTempFormula )
            // InternalLiTeLLab.g:2368:3: ruleTempFormula
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
    // InternalLiTeLLab.g:2377:1: rule__TempFormula__F2Assignment_4_3 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__F2Assignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2381:1: ( ( ruleTempFormula ) )
            // InternalLiTeLLab.g:2382:2: ( ruleTempFormula )
            {
            // InternalLiTeLLab.g:2382:2: ( ruleTempFormula )
            // InternalLiTeLLab.g:2383:3: ruleTempFormula
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
    // InternalLiTeLLab.g:2392:1: rule__TempFormula__OpfAssignment_5_1 : ( RULE_OPF ) ;
    public final void rule__TempFormula__OpfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2396:1: ( ( RULE_OPF ) )
            // InternalLiTeLLab.g:2397:2: ( RULE_OPF )
            {
            // InternalLiTeLLab.g:2397:2: ( RULE_OPF )
            // InternalLiTeLLab.g:2398:3: RULE_OPF
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
    // InternalLiTeLLab.g:2407:1: rule__TempFormula__FAssignment_5_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__FAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2411:1: ( ( ruleTempFormula ) )
            // InternalLiTeLLab.g:2412:2: ( ruleTempFormula )
            {
            // InternalLiTeLLab.g:2412:2: ( ruleTempFormula )
            // InternalLiTeLLab.g:2413:3: ruleTempFormula
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
    // InternalLiTeLLab.g:2422:1: rule__TempFormula__ApAssignment_6_2 : ( ruleAP ) ;
    public final void rule__TempFormula__ApAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2426:1: ( ( ruleAP ) )
            // InternalLiTeLLab.g:2427:2: ( ruleAP )
            {
            // InternalLiTeLLab.g:2427:2: ( ruleAP )
            // InternalLiTeLLab.g:2428:3: ruleAP
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
    // InternalLiTeLLab.g:2437:1: rule__TempFormula__WeightAssignment_6_3 : ( ruleWeight ) ;
    public final void rule__TempFormula__WeightAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2441:1: ( ( ruleWeight ) )
            // InternalLiTeLLab.g:2442:2: ( ruleWeight )
            {
            // InternalLiTeLLab.g:2442:2: ( ruleWeight )
            // InternalLiTeLLab.g:2443:3: ruleWeight
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


    // $ANTLR start "rule__TempFormula__IapAssignment_7_2"
    // InternalLiTeLLab.g:2452:1: rule__TempFormula__IapAssignment_7_2 : ( ruleAP ) ;
    public final void rule__TempFormula__IapAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2456:1: ( ( ruleAP ) )
            // InternalLiTeLLab.g:2457:2: ( ruleAP )
            {
            // InternalLiTeLLab.g:2457:2: ( ruleAP )
            // InternalLiTeLLab.g:2458:3: ruleAP
            {
             before(grammarAccess.getTempFormulaAccess().getIapAPParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAP();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getIapAPParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__TempFormula__IapAssignment_7_2"


    // $ANTLR start "rule__TempFormula__WeightAssignment_7_3"
    // InternalLiTeLLab.g:2467:1: rule__TempFormula__WeightAssignment_7_3 : ( ruleWeight ) ;
    public final void rule__TempFormula__WeightAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2471:1: ( ( ruleWeight ) )
            // InternalLiTeLLab.g:2472:2: ( ruleWeight )
            {
            // InternalLiTeLLab.g:2472:2: ( ruleWeight )
            // InternalLiTeLLab.g:2473:3: ruleWeight
            {
             before(grammarAccess.getTempFormulaAccess().getWeightWeightParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWeight();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getWeightWeightParserRuleCall_7_3_0()); 

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
    // $ANTLR end "rule__TempFormula__WeightAssignment_7_3"


    // $ANTLR start "rule__TempFormula__FNextAssignment_8_2"
    // InternalLiTeLLab.g:2482:1: rule__TempFormula__FNextAssignment_8_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__FNextAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2486:1: ( ( ruleTempFormula ) )
            // InternalLiTeLLab.g:2487:2: ( ruleTempFormula )
            {
            // InternalLiTeLLab.g:2487:2: ( ruleTempFormula )
            // InternalLiTeLLab.g:2488:3: ruleTempFormula
            {
             before(grammarAccess.getTempFormulaAccess().getFNextTempFormulaParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTempFormula();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getFNextTempFormulaParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__TempFormula__FNextAssignment_8_2"


    // $ANTLR start "rule__TempFormula__X1Assignment_8_3"
    // InternalLiTeLLab.g:2497:1: rule__TempFormula__X1Assignment_8_3 : ( ruleWInt ) ;
    public final void rule__TempFormula__X1Assignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2501:1: ( ( ruleWInt ) )
            // InternalLiTeLLab.g:2502:2: ( ruleWInt )
            {
            // InternalLiTeLLab.g:2502:2: ( ruleWInt )
            // InternalLiTeLLab.g:2503:3: ruleWInt
            {
             before(grammarAccess.getTempFormulaAccess().getX1WIntParserRuleCall_8_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWInt();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getX1WIntParserRuleCall_8_3_0()); 

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
    // $ANTLR end "rule__TempFormula__X1Assignment_8_3"


    // $ANTLR start "rule__TempFormula__X2Assignment_8_4"
    // InternalLiTeLLab.g:2512:1: rule__TempFormula__X2Assignment_8_4 : ( ruleWInt ) ;
    public final void rule__TempFormula__X2Assignment_8_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2516:1: ( ( ruleWInt ) )
            // InternalLiTeLLab.g:2517:2: ( ruleWInt )
            {
            // InternalLiTeLLab.g:2517:2: ( ruleWInt )
            // InternalLiTeLLab.g:2518:3: ruleWInt
            {
             before(grammarAccess.getTempFormulaAccess().getX2WIntParserRuleCall_8_4_0()); 
            pushFollow(FOLLOW_2);
            ruleWInt();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getX2WIntParserRuleCall_8_4_0()); 

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
    // $ANTLR end "rule__TempFormula__X2Assignment_8_4"


    // $ANTLR start "rule__TempFormula__CompAssignment_9_1"
    // InternalLiTeLLab.g:2527:1: rule__TempFormula__CompAssignment_9_1 : ( RULE_COMP ) ;
    public final void rule__TempFormula__CompAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2531:1: ( ( RULE_COMP ) )
            // InternalLiTeLLab.g:2532:2: ( RULE_COMP )
            {
            // InternalLiTeLLab.g:2532:2: ( RULE_COMP )
            // InternalLiTeLLab.g:2533:3: RULE_COMP
            {
             before(grammarAccess.getTempFormulaAccess().getCompCOMPTerminalRuleCall_9_1_0()); 
            match(input,RULE_COMP,FOLLOW_2); 
             after(grammarAccess.getTempFormulaAccess().getCompCOMPTerminalRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__TempFormula__CompAssignment_9_1"


    // $ANTLR start "rule__TempFormula__Tt1Assignment_9_3"
    // InternalLiTeLLab.g:2542:1: rule__TempFormula__Tt1Assignment_9_3 : ( ruleTempTerm ) ;
    public final void rule__TempFormula__Tt1Assignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2546:1: ( ( ruleTempTerm ) )
            // InternalLiTeLLab.g:2547:2: ( ruleTempTerm )
            {
            // InternalLiTeLLab.g:2547:2: ( ruleTempTerm )
            // InternalLiTeLLab.g:2548:3: ruleTempTerm
            {
             before(grammarAccess.getTempFormulaAccess().getTt1TempTermParserRuleCall_9_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTempTerm();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getTt1TempTermParserRuleCall_9_3_0()); 

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
    // $ANTLR end "rule__TempFormula__Tt1Assignment_9_3"


    // $ANTLR start "rule__TempFormula__Tt2Assignment_9_4"
    // InternalLiTeLLab.g:2557:1: rule__TempFormula__Tt2Assignment_9_4 : ( ruleTempTerm ) ;
    public final void rule__TempFormula__Tt2Assignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2561:1: ( ( ruleTempTerm ) )
            // InternalLiTeLLab.g:2562:2: ( ruleTempTerm )
            {
            // InternalLiTeLLab.g:2562:2: ( ruleTempTerm )
            // InternalLiTeLLab.g:2563:3: ruleTempTerm
            {
             before(grammarAccess.getTempFormulaAccess().getTt2TempTermParserRuleCall_9_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTempTerm();

            state._fsp--;

             after(grammarAccess.getTempFormulaAccess().getTt2TempTermParserRuleCall_9_4_0()); 

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
    // $ANTLR end "rule__TempFormula__Tt2Assignment_9_4"


    // $ANTLR start "rule__TempTerm__Int1Assignment_0"
    // InternalLiTeLLab.g:2572:1: rule__TempTerm__Int1Assignment_0 : ( RULE_INT ) ;
    public final void rule__TempTerm__Int1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2576:1: ( ( RULE_INT ) )
            // InternalLiTeLLab.g:2577:2: ( RULE_INT )
            {
            // InternalLiTeLLab.g:2577:2: ( RULE_INT )
            // InternalLiTeLLab.g:2578:3: RULE_INT
            {
             before(grammarAccess.getTempTermAccess().getInt1INTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTempTermAccess().getInt1INTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__TempTerm__Int1Assignment_0"


    // $ANTLR start "rule__TempTerm__VarAssignment_1"
    // InternalLiTeLLab.g:2587:1: rule__TempTerm__VarAssignment_1 : ( ruleVAR ) ;
    public final void rule__TempTerm__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2591:1: ( ( ruleVAR ) )
            // InternalLiTeLLab.g:2592:2: ( ruleVAR )
            {
            // InternalLiTeLLab.g:2592:2: ( ruleVAR )
            // InternalLiTeLLab.g:2593:3: ruleVAR
            {
             before(grammarAccess.getTempTermAccess().getVarVARParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVAR();

            state._fsp--;

             after(grammarAccess.getTempTermAccess().getVarVARParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TempTerm__VarAssignment_1"


    // $ANTLR start "rule__TempTerm__OldVarAssignment_2"
    // InternalLiTeLLab.g:2602:1: rule__TempTerm__OldVarAssignment_2 : ( ruleoldVAR ) ;
    public final void rule__TempTerm__OldVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2606:1: ( ( ruleoldVAR ) )
            // InternalLiTeLLab.g:2607:2: ( ruleoldVAR )
            {
            // InternalLiTeLLab.g:2607:2: ( ruleoldVAR )
            // InternalLiTeLLab.g:2608:3: ruleoldVAR
            {
             before(grammarAccess.getTempTermAccess().getOldVarOldVARParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleoldVAR();

            state._fsp--;

             after(grammarAccess.getTempTermAccess().getOldVarOldVARParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TempTerm__OldVarAssignment_2"


    // $ANTLR start "rule__AP__PNameAssignment_4"
    // InternalLiTeLLab.g:2617:1: rule__AP__PNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__AP__PNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2621:1: ( ( RULE_ID ) )
            // InternalLiTeLLab.g:2622:2: ( RULE_ID )
            {
            // InternalLiTeLLab.g:2622:2: ( RULE_ID )
            // InternalLiTeLLab.g:2623:3: RULE_ID
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


    // $ANTLR start "rule__VAR__VNameAssignment_4"
    // InternalLiTeLLab.g:2632:1: rule__VAR__VNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__VAR__VNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2636:1: ( ( RULE_ID ) )
            // InternalLiTeLLab.g:2637:2: ( RULE_ID )
            {
            // InternalLiTeLLab.g:2637:2: ( RULE_ID )
            // InternalLiTeLLab.g:2638:3: RULE_ID
            {
             before(grammarAccess.getVARAccess().getVNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVARAccess().getVNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__VAR__VNameAssignment_4"


    // $ANTLR start "rule__OldVAR__VarAssignment_2"
    // InternalLiTeLLab.g:2647:1: rule__OldVAR__VarAssignment_2 : ( ruleVAR ) ;
    public final void rule__OldVAR__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLiTeLLab.g:2651:1: ( ( ruleVAR ) )
            // InternalLiTeLLab.g:2652:2: ( ruleVAR )
            {
            // InternalLiTeLLab.g:2652:2: ( ruleVAR )
            // InternalLiTeLLab.g:2653:3: ruleVAR
            {
             before(grammarAccess.getOldVARAccess().getVarVARParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVAR();

            state._fsp--;

             after(grammarAccess.getOldVARAccess().getVarVARParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__OldVAR__VarAssignment_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\23\1\5\12\uffff";
    static final String dfa_3s = "\1\33\1\35\12\uffff";
    static final String dfa_4s = "\2\uffff\1\12\1\6\1\7\1\2\1\5\1\4\1\11\1\3\1\10\1\1";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\7\uffff\1\2",
            "\1\6\1\3\15\uffff\1\5\1\uffff\1\11\1\7\1\4\1\12\1\10\2\uffff\1\13",
            "",
            "",
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
            return "298:1: rule__TempFormula__Alternatives : ( ( ( rule__TempFormula__ApAssignment_0 ) ) | ( ( rule__TempFormula__Group_1__0 ) ) | ( ( rule__TempFormula__Group_2__0 ) ) | ( ( rule__TempFormula__Group_3__0 ) ) | ( ( rule__TempFormula__Group_4__0 ) ) | ( ( rule__TempFormula__Group_5__0 ) ) | ( ( rule__TempFormula__Group_6__0 ) ) | ( ( rule__TempFormula__Group_7__0 ) ) | ( ( rule__TempFormula__Group_8__0 ) ) | ( ( rule__TempFormula__Group_9__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});

}
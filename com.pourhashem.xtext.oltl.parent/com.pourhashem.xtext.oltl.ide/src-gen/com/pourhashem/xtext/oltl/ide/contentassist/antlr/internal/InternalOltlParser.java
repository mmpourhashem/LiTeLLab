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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_OP2", "RULE_OPF", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'P'", "'p'", "'Bound:'", "'Formula:'", "'SoftBound:'", "'SoftFormulae:'", "'('", "'soft'", "')'", "'@'", "'.'", "'&&'", "'||'", "'!!'", "'-'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_OP2=6;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int RULE_OPF=7;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalOltl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalOltl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalOltl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalOltl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalOltl.g:69:3: ( rule__Model__Group__0 )
            // InternalOltl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleSoftFormula"
    // InternalOltl.g:78:1: entryRuleSoftFormula : ruleSoftFormula EOF ;
    public final void entryRuleSoftFormula() throws RecognitionException {
        try {
            // InternalOltl.g:79:1: ( ruleSoftFormula EOF )
            // InternalOltl.g:80:1: ruleSoftFormula EOF
            {
             before(grammarAccess.getSoftFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleSoftFormula();

            state._fsp--;

             after(grammarAccess.getSoftFormulaRule()); 
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
    // $ANTLR end "entryRuleSoftFormula"


    // $ANTLR start "ruleSoftFormula"
    // InternalOltl.g:87:1: ruleSoftFormula : ( ( rule__SoftFormula__Alternatives ) ) ;
    public final void ruleSoftFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:91:2: ( ( ( rule__SoftFormula__Alternatives ) ) )
            // InternalOltl.g:92:2: ( ( rule__SoftFormula__Alternatives ) )
            {
            // InternalOltl.g:92:2: ( ( rule__SoftFormula__Alternatives ) )
            // InternalOltl.g:93:3: ( rule__SoftFormula__Alternatives )
            {
             before(grammarAccess.getSoftFormulaAccess().getAlternatives()); 
            // InternalOltl.g:94:3: ( rule__SoftFormula__Alternatives )
            // InternalOltl.g:94:4: rule__SoftFormula__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SoftFormula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSoftFormulaAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSoftFormula"


    // $ANTLR start "entryRuleSoftAllTI"
    // InternalOltl.g:103:1: entryRuleSoftAllTI : ruleSoftAllTI EOF ;
    public final void entryRuleSoftAllTI() throws RecognitionException {
        try {
            // InternalOltl.g:104:1: ( ruleSoftAllTI EOF )
            // InternalOltl.g:105:1: ruleSoftAllTI EOF
            {
             before(grammarAccess.getSoftAllTIRule()); 
            pushFollow(FOLLOW_1);
            ruleSoftAllTI();

            state._fsp--;

             after(grammarAccess.getSoftAllTIRule()); 
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
    // $ANTLR end "entryRuleSoftAllTI"


    // $ANTLR start "ruleSoftAllTI"
    // InternalOltl.g:112:1: ruleSoftAllTI : ( ( rule__SoftAllTI__Group__0 ) ) ;
    public final void ruleSoftAllTI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:116:2: ( ( ( rule__SoftAllTI__Group__0 ) ) )
            // InternalOltl.g:117:2: ( ( rule__SoftAllTI__Group__0 ) )
            {
            // InternalOltl.g:117:2: ( ( rule__SoftAllTI__Group__0 ) )
            // InternalOltl.g:118:3: ( rule__SoftAllTI__Group__0 )
            {
             before(grammarAccess.getSoftAllTIAccess().getGroup()); 
            // InternalOltl.g:119:3: ( rule__SoftAllTI__Group__0 )
            // InternalOltl.g:119:4: rule__SoftAllTI__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SoftAllTI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSoftAllTIAccess().getGroup()); 

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
    // $ANTLR end "ruleSoftAllTI"


    // $ANTLR start "entryRuleSoftTI"
    // InternalOltl.g:128:1: entryRuleSoftTI : ruleSoftTI EOF ;
    public final void entryRuleSoftTI() throws RecognitionException {
        try {
            // InternalOltl.g:129:1: ( ruleSoftTI EOF )
            // InternalOltl.g:130:1: ruleSoftTI EOF
            {
             before(grammarAccess.getSoftTIRule()); 
            pushFollow(FOLLOW_1);
            ruleSoftTI();

            state._fsp--;

             after(grammarAccess.getSoftTIRule()); 
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
    // $ANTLR end "entryRuleSoftTI"


    // $ANTLR start "ruleSoftTI"
    // InternalOltl.g:137:1: ruleSoftTI : ( ( rule__SoftTI__Group__0 ) ) ;
    public final void ruleSoftTI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:141:2: ( ( ( rule__SoftTI__Group__0 ) ) )
            // InternalOltl.g:142:2: ( ( rule__SoftTI__Group__0 ) )
            {
            // InternalOltl.g:142:2: ( ( rule__SoftTI__Group__0 ) )
            // InternalOltl.g:143:3: ( rule__SoftTI__Group__0 )
            {
             before(grammarAccess.getSoftTIAccess().getGroup()); 
            // InternalOltl.g:144:3: ( rule__SoftTI__Group__0 )
            // InternalOltl.g:144:4: rule__SoftTI__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SoftTI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSoftTIAccess().getGroup()); 

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
    // $ANTLR end "ruleSoftTI"


    // $ANTLR start "entryRuleWeight"
    // InternalOltl.g:153:1: entryRuleWeight : ruleWeight EOF ;
    public final void entryRuleWeight() throws RecognitionException {
        try {
            // InternalOltl.g:154:1: ( ruleWeight EOF )
            // InternalOltl.g:155:1: ruleWeight EOF
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
    // InternalOltl.g:162:1: ruleWeight : ( ( rule__Weight__Alternatives ) ) ;
    public final void ruleWeight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:166:2: ( ( ( rule__Weight__Alternatives ) ) )
            // InternalOltl.g:167:2: ( ( rule__Weight__Alternatives ) )
            {
            // InternalOltl.g:167:2: ( ( rule__Weight__Alternatives ) )
            // InternalOltl.g:168:3: ( rule__Weight__Alternatives )
            {
             before(grammarAccess.getWeightAccess().getAlternatives()); 
            // InternalOltl.g:169:3: ( rule__Weight__Alternatives )
            // InternalOltl.g:169:4: rule__Weight__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Weight__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWeightAccess().getAlternatives()); 

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
    // InternalOltl.g:178:1: entryRuleWInt : ruleWInt EOF ;
    public final void entryRuleWInt() throws RecognitionException {
        try {
            // InternalOltl.g:179:1: ( ruleWInt EOF )
            // InternalOltl.g:180:1: ruleWInt EOF
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
    // InternalOltl.g:187:1: ruleWInt : ( ( rule__WInt__IntAssignment ) ) ;
    public final void ruleWInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:191:2: ( ( ( rule__WInt__IntAssignment ) ) )
            // InternalOltl.g:192:2: ( ( rule__WInt__IntAssignment ) )
            {
            // InternalOltl.g:192:2: ( ( rule__WInt__IntAssignment ) )
            // InternalOltl.g:193:3: ( rule__WInt__IntAssignment )
            {
             before(grammarAccess.getWIntAccess().getIntAssignment()); 
            // InternalOltl.g:194:3: ( rule__WInt__IntAssignment )
            // InternalOltl.g:194:4: rule__WInt__IntAssignment
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
    // InternalOltl.g:203:1: entryRuleWFloat : ruleWFloat EOF ;
    public final void entryRuleWFloat() throws RecognitionException {
        try {
            // InternalOltl.g:204:1: ( ruleWFloat EOF )
            // InternalOltl.g:205:1: ruleWFloat EOF
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
    // InternalOltl.g:212:1: ruleWFloat : ( ( rule__WFloat__Group__0 ) ) ;
    public final void ruleWFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:216:2: ( ( ( rule__WFloat__Group__0 ) ) )
            // InternalOltl.g:217:2: ( ( rule__WFloat__Group__0 ) )
            {
            // InternalOltl.g:217:2: ( ( rule__WFloat__Group__0 ) )
            // InternalOltl.g:218:3: ( rule__WFloat__Group__0 )
            {
             before(grammarAccess.getWFloatAccess().getGroup()); 
            // InternalOltl.g:219:3: ( rule__WFloat__Group__0 )
            // InternalOltl.g:219:4: rule__WFloat__Group__0
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
    // InternalOltl.g:228:1: entryRuleTempFormula : ruleTempFormula EOF ;
    public final void entryRuleTempFormula() throws RecognitionException {
        try {
            // InternalOltl.g:229:1: ( ruleTempFormula EOF )
            // InternalOltl.g:230:1: ruleTempFormula EOF
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
    // InternalOltl.g:237:1: ruleTempFormula : ( ( rule__TempFormula__Alternatives ) ) ;
    public final void ruleTempFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:241:2: ( ( ( rule__TempFormula__Alternatives ) ) )
            // InternalOltl.g:242:2: ( ( rule__TempFormula__Alternatives ) )
            {
            // InternalOltl.g:242:2: ( ( rule__TempFormula__Alternatives ) )
            // InternalOltl.g:243:3: ( rule__TempFormula__Alternatives )
            {
             before(grammarAccess.getTempFormulaAccess().getAlternatives()); 
            // InternalOltl.g:244:3: ( rule__TempFormula__Alternatives )
            // InternalOltl.g:244:4: rule__TempFormula__Alternatives
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
    // InternalOltl.g:253:1: entryRuleAP : ruleAP EOF ;
    public final void entryRuleAP() throws RecognitionException {
        try {
            // InternalOltl.g:254:1: ( ruleAP EOF )
            // InternalOltl.g:255:1: ruleAP EOF
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
    // InternalOltl.g:262:1: ruleAP : ( ( rule__AP__Group__0 ) ) ;
    public final void ruleAP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:266:2: ( ( ( rule__AP__Group__0 ) ) )
            // InternalOltl.g:267:2: ( ( rule__AP__Group__0 ) )
            {
            // InternalOltl.g:267:2: ( ( rule__AP__Group__0 ) )
            // InternalOltl.g:268:3: ( rule__AP__Group__0 )
            {
             before(grammarAccess.getAPAccess().getGroup()); 
            // InternalOltl.g:269:3: ( rule__AP__Group__0 )
            // InternalOltl.g:269:4: rule__AP__Group__0
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


    // $ANTLR start "rule__SoftFormula__Alternatives"
    // InternalOltl.g:277:1: rule__SoftFormula__Alternatives : ( ( ( rule__SoftFormula__SoftAllAssignment_0 ) ) | ( ( rule__SoftFormula__SoftAtAssignment_1 ) ) );
    public final void rule__SoftFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:281:1: ( ( ( rule__SoftFormula__SoftAllAssignment_0 ) ) | ( ( rule__SoftFormula__SoftAtAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==20) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==19) ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3==27) ) {
                            alt1=1;
                        }
                        else if ( (LA1_3==22) ) {
                            alt1=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
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
                    // InternalOltl.g:282:2: ( ( rule__SoftFormula__SoftAllAssignment_0 ) )
                    {
                    // InternalOltl.g:282:2: ( ( rule__SoftFormula__SoftAllAssignment_0 ) )
                    // InternalOltl.g:283:3: ( rule__SoftFormula__SoftAllAssignment_0 )
                    {
                     before(grammarAccess.getSoftFormulaAccess().getSoftAllAssignment_0()); 
                    // InternalOltl.g:284:3: ( rule__SoftFormula__SoftAllAssignment_0 )
                    // InternalOltl.g:284:4: rule__SoftFormula__SoftAllAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SoftFormula__SoftAllAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSoftFormulaAccess().getSoftAllAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOltl.g:288:2: ( ( rule__SoftFormula__SoftAtAssignment_1 ) )
                    {
                    // InternalOltl.g:288:2: ( ( rule__SoftFormula__SoftAtAssignment_1 ) )
                    // InternalOltl.g:289:3: ( rule__SoftFormula__SoftAtAssignment_1 )
                    {
                     before(grammarAccess.getSoftFormulaAccess().getSoftAtAssignment_1()); 
                    // InternalOltl.g:290:3: ( rule__SoftFormula__SoftAtAssignment_1 )
                    // InternalOltl.g:290:4: rule__SoftFormula__SoftAtAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SoftFormula__SoftAtAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSoftFormulaAccess().getSoftAtAssignment_1()); 

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
    // $ANTLR end "rule__SoftFormula__Alternatives"


    // $ANTLR start "rule__Weight__Alternatives"
    // InternalOltl.g:298:1: rule__Weight__Alternatives : ( ( ( rule__Weight__WIntAssignment_0 ) ) | ( ( rule__Weight__WFloatAssignment_1 ) ) );
    public final void rule__Weight__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:302:1: ( ( ( rule__Weight__WIntAssignment_0 ) ) | ( ( rule__Weight__WFloatAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==23) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==21) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalOltl.g:303:2: ( ( rule__Weight__WIntAssignment_0 ) )
                    {
                    // InternalOltl.g:303:2: ( ( rule__Weight__WIntAssignment_0 ) )
                    // InternalOltl.g:304:3: ( rule__Weight__WIntAssignment_0 )
                    {
                     before(grammarAccess.getWeightAccess().getWIntAssignment_0()); 
                    // InternalOltl.g:305:3: ( rule__Weight__WIntAssignment_0 )
                    // InternalOltl.g:305:4: rule__Weight__WIntAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Weight__WIntAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWeightAccess().getWIntAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOltl.g:309:2: ( ( rule__Weight__WFloatAssignment_1 ) )
                    {
                    // InternalOltl.g:309:2: ( ( rule__Weight__WFloatAssignment_1 ) )
                    // InternalOltl.g:310:3: ( rule__Weight__WFloatAssignment_1 )
                    {
                     before(grammarAccess.getWeightAccess().getWFloatAssignment_1()); 
                    // InternalOltl.g:311:3: ( rule__Weight__WFloatAssignment_1 )
                    // InternalOltl.g:311:4: rule__Weight__WFloatAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Weight__WFloatAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWeightAccess().getWFloatAssignment_1()); 

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
    // $ANTLR end "rule__Weight__Alternatives"


    // $ANTLR start "rule__TempFormula__Alternatives"
    // InternalOltl.g:319:1: rule__TempFormula__Alternatives : ( ( ( rule__TempFormula__ApAssignment_0 ) ) | ( ( rule__TempFormula__Group_1__0 ) ) | ( ( rule__TempFormula__Group_2__0 ) ) | ( ( rule__TempFormula__Group_3__0 ) ) | ( ( rule__TempFormula__Group_4__0 ) ) | ( ( rule__TempFormula__Group_5__0 ) ) );
    public final void rule__TempFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:323:1: ( ( ( rule__TempFormula__ApAssignment_0 ) ) | ( ( rule__TempFormula__Group_1__0 ) ) | ( ( rule__TempFormula__Group_2__0 ) ) | ( ( rule__TempFormula__Group_3__0 ) ) | ( ( rule__TempFormula__Group_4__0 ) ) | ( ( rule__TempFormula__Group_5__0 ) ) )
            int alt3=6;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                switch ( input.LA(2) ) {
                case RULE_OPF:
                    {
                    alt3=6;
                    }
                    break;
                case 24:
                    {
                    alt3=2;
                    }
                    break;
                case RULE_OP2:
                    {
                    alt3=5;
                    }
                    break;
                case 26:
                    {
                    alt3=4;
                    }
                    break;
                case 27:
                    {
                    alt3=1;
                    }
                    break;
                case 25:
                    {
                    alt3=3;
                    }
                    break;
                default:
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
                    // InternalOltl.g:324:2: ( ( rule__TempFormula__ApAssignment_0 ) )
                    {
                    // InternalOltl.g:324:2: ( ( rule__TempFormula__ApAssignment_0 ) )
                    // InternalOltl.g:325:3: ( rule__TempFormula__ApAssignment_0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getApAssignment_0()); 
                    // InternalOltl.g:326:3: ( rule__TempFormula__ApAssignment_0 )
                    // InternalOltl.g:326:4: rule__TempFormula__ApAssignment_0
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
                    // InternalOltl.g:330:2: ( ( rule__TempFormula__Group_1__0 ) )
                    {
                    // InternalOltl.g:330:2: ( ( rule__TempFormula__Group_1__0 ) )
                    // InternalOltl.g:331:3: ( rule__TempFormula__Group_1__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_1()); 
                    // InternalOltl.g:332:3: ( rule__TempFormula__Group_1__0 )
                    // InternalOltl.g:332:4: rule__TempFormula__Group_1__0
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
                    // InternalOltl.g:336:2: ( ( rule__TempFormula__Group_2__0 ) )
                    {
                    // InternalOltl.g:336:2: ( ( rule__TempFormula__Group_2__0 ) )
                    // InternalOltl.g:337:3: ( rule__TempFormula__Group_2__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_2()); 
                    // InternalOltl.g:338:3: ( rule__TempFormula__Group_2__0 )
                    // InternalOltl.g:338:4: rule__TempFormula__Group_2__0
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
                    // InternalOltl.g:342:2: ( ( rule__TempFormula__Group_3__0 ) )
                    {
                    // InternalOltl.g:342:2: ( ( rule__TempFormula__Group_3__0 ) )
                    // InternalOltl.g:343:3: ( rule__TempFormula__Group_3__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_3()); 
                    // InternalOltl.g:344:3: ( rule__TempFormula__Group_3__0 )
                    // InternalOltl.g:344:4: rule__TempFormula__Group_3__0
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
                    // InternalOltl.g:348:2: ( ( rule__TempFormula__Group_4__0 ) )
                    {
                    // InternalOltl.g:348:2: ( ( rule__TempFormula__Group_4__0 ) )
                    // InternalOltl.g:349:3: ( rule__TempFormula__Group_4__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_4()); 
                    // InternalOltl.g:350:3: ( rule__TempFormula__Group_4__0 )
                    // InternalOltl.g:350:4: rule__TempFormula__Group_4__0
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
                    // InternalOltl.g:354:2: ( ( rule__TempFormula__Group_5__0 ) )
                    {
                    // InternalOltl.g:354:2: ( ( rule__TempFormula__Group_5__0 ) )
                    // InternalOltl.g:355:3: ( rule__TempFormula__Group_5__0 )
                    {
                     before(grammarAccess.getTempFormulaAccess().getGroup_5()); 
                    // InternalOltl.g:356:3: ( rule__TempFormula__Group_5__0 )
                    // InternalOltl.g:356:4: rule__TempFormula__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TempFormula__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTempFormulaAccess().getGroup_5()); 

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
    // InternalOltl.g:364:1: rule__AP__Alternatives_2 : ( ( 'P' ) | ( 'p' ) );
    public final void rule__AP__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:368:1: ( ( 'P' ) | ( 'p' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOltl.g:369:2: ( 'P' )
                    {
                    // InternalOltl.g:369:2: ( 'P' )
                    // InternalOltl.g:370:3: 'P'
                    {
                     before(grammarAccess.getAPAccess().getPKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAPAccess().getPKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOltl.g:375:2: ( 'p' )
                    {
                    // InternalOltl.g:375:2: ( 'p' )
                    // InternalOltl.g:376:3: 'p'
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalOltl.g:385:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:389:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOltl.g:390:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalOltl.g:397:1: rule__Model__Group__0__Impl : ( 'Bound:' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:401:1: ( ( 'Bound:' ) )
            // InternalOltl.g:402:1: ( 'Bound:' )
            {
            // InternalOltl.g:402:1: ( 'Bound:' )
            // InternalOltl.g:403:2: 'Bound:'
            {
             before(grammarAccess.getModelAccess().getBoundKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getBoundKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalOltl.g:412:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:416:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOltl.g:417:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalOltl.g:424:1: rule__Model__Group__1__Impl : ( ( rule__Model__BoundAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:428:1: ( ( ( rule__Model__BoundAssignment_1 ) ) )
            // InternalOltl.g:429:1: ( ( rule__Model__BoundAssignment_1 ) )
            {
            // InternalOltl.g:429:1: ( ( rule__Model__BoundAssignment_1 ) )
            // InternalOltl.g:430:2: ( rule__Model__BoundAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getBoundAssignment_1()); 
            // InternalOltl.g:431:2: ( rule__Model__BoundAssignment_1 )
            // InternalOltl.g:431:3: rule__Model__BoundAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__BoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBoundAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalOltl.g:439:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:443:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalOltl.g:444:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalOltl.g:451:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:455:1: ( ( ( rule__Model__Group_2__0 )? ) )
            // InternalOltl.g:456:1: ( ( rule__Model__Group_2__0 )? )
            {
            // InternalOltl.g:456:1: ( ( rule__Model__Group_2__0 )? )
            // InternalOltl.g:457:2: ( rule__Model__Group_2__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalOltl.g:458:2: ( rule__Model__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOltl.g:458:3: rule__Model__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalOltl.g:466:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:470:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalOltl.g:471:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalOltl.g:478:1: rule__Model__Group__3__Impl : ( 'Formula:' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:482:1: ( ( 'Formula:' ) )
            // InternalOltl.g:483:1: ( 'Formula:' )
            {
            // InternalOltl.g:483:1: ( 'Formula:' )
            // InternalOltl.g:484:2: 'Formula:'
            {
             before(grammarAccess.getModelAccess().getFormulaKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFormulaKeyword_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalOltl.g:493:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:497:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalOltl.g:498:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalOltl.g:505:1: rule__Model__Group__4__Impl : ( ( rule__Model__TempFormulaAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:509:1: ( ( ( rule__Model__TempFormulaAssignment_4 ) ) )
            // InternalOltl.g:510:1: ( ( rule__Model__TempFormulaAssignment_4 ) )
            {
            // InternalOltl.g:510:1: ( ( rule__Model__TempFormulaAssignment_4 ) )
            // InternalOltl.g:511:2: ( rule__Model__TempFormulaAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getTempFormulaAssignment_4()); 
            // InternalOltl.g:512:2: ( rule__Model__TempFormulaAssignment_4 )
            // InternalOltl.g:512:3: rule__Model__TempFormulaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Model__TempFormulaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTempFormulaAssignment_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalOltl.g:520:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:524:1: ( rule__Model__Group__5__Impl )
            // InternalOltl.g:525:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalOltl.g:531:1: rule__Model__Group__5__Impl : ( ( rule__Model__Group_5__0 )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:535:1: ( ( ( rule__Model__Group_5__0 )? ) )
            // InternalOltl.g:536:1: ( ( rule__Model__Group_5__0 )? )
            {
            // InternalOltl.g:536:1: ( ( rule__Model__Group_5__0 )? )
            // InternalOltl.g:537:2: ( rule__Model__Group_5__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_5()); 
            // InternalOltl.g:538:2: ( rule__Model__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOltl.g:538:3: rule__Model__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group_2__0"
    // InternalOltl.g:547:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:551:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalOltl.g:552:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1();

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
    // $ANTLR end "rule__Model__Group_2__0"


    // $ANTLR start "rule__Model__Group_2__0__Impl"
    // InternalOltl.g:559:1: rule__Model__Group_2__0__Impl : ( 'SoftBound:' ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:563:1: ( ( 'SoftBound:' ) )
            // InternalOltl.g:564:1: ( 'SoftBound:' )
            {
            // InternalOltl.g:564:1: ( 'SoftBound:' )
            // InternalOltl.g:565:2: 'SoftBound:'
            {
             before(grammarAccess.getModelAccess().getSoftBoundKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSoftBoundKeyword_2_0()); 

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
    // $ANTLR end "rule__Model__Group_2__0__Impl"


    // $ANTLR start "rule__Model__Group_2__1"
    // InternalOltl.g:574:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:578:1: ( rule__Model__Group_2__1__Impl )
            // InternalOltl.g:579:2: rule__Model__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1__Impl();

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
    // $ANTLR end "rule__Model__Group_2__1"


    // $ANTLR start "rule__Model__Group_2__1__Impl"
    // InternalOltl.g:585:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__SoftBoundAssignment_2_1 ) ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:589:1: ( ( ( rule__Model__SoftBoundAssignment_2_1 ) ) )
            // InternalOltl.g:590:1: ( ( rule__Model__SoftBoundAssignment_2_1 ) )
            {
            // InternalOltl.g:590:1: ( ( rule__Model__SoftBoundAssignment_2_1 ) )
            // InternalOltl.g:591:2: ( rule__Model__SoftBoundAssignment_2_1 )
            {
             before(grammarAccess.getModelAccess().getSoftBoundAssignment_2_1()); 
            // InternalOltl.g:592:2: ( rule__Model__SoftBoundAssignment_2_1 )
            // InternalOltl.g:592:3: rule__Model__SoftBoundAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__SoftBoundAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSoftBoundAssignment_2_1()); 

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
    // $ANTLR end "rule__Model__Group_2__1__Impl"


    // $ANTLR start "rule__Model__Group_5__0"
    // InternalOltl.g:601:1: rule__Model__Group_5__0 : rule__Model__Group_5__0__Impl rule__Model__Group_5__1 ;
    public final void rule__Model__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:605:1: ( rule__Model__Group_5__0__Impl rule__Model__Group_5__1 )
            // InternalOltl.g:606:2: rule__Model__Group_5__0__Impl rule__Model__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_5__1();

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
    // $ANTLR end "rule__Model__Group_5__0"


    // $ANTLR start "rule__Model__Group_5__0__Impl"
    // InternalOltl.g:613:1: rule__Model__Group_5__0__Impl : ( 'SoftFormulae:' ) ;
    public final void rule__Model__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:617:1: ( ( 'SoftFormulae:' ) )
            // InternalOltl.g:618:1: ( 'SoftFormulae:' )
            {
            // InternalOltl.g:618:1: ( 'SoftFormulae:' )
            // InternalOltl.g:619:2: 'SoftFormulae:'
            {
             before(grammarAccess.getModelAccess().getSoftFormulaeKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSoftFormulaeKeyword_5_0()); 

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
    // $ANTLR end "rule__Model__Group_5__0__Impl"


    // $ANTLR start "rule__Model__Group_5__1"
    // InternalOltl.g:628:1: rule__Model__Group_5__1 : rule__Model__Group_5__1__Impl ;
    public final void rule__Model__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:632:1: ( rule__Model__Group_5__1__Impl )
            // InternalOltl.g:633:2: rule__Model__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_5__1__Impl();

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
    // $ANTLR end "rule__Model__Group_5__1"


    // $ANTLR start "rule__Model__Group_5__1__Impl"
    // InternalOltl.g:639:1: rule__Model__Group_5__1__Impl : ( ( rule__Model__SoftFormulaeAssignment_5_1 )* ) ;
    public final void rule__Model__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:643:1: ( ( ( rule__Model__SoftFormulaeAssignment_5_1 )* ) )
            // InternalOltl.g:644:1: ( ( rule__Model__SoftFormulaeAssignment_5_1 )* )
            {
            // InternalOltl.g:644:1: ( ( rule__Model__SoftFormulaeAssignment_5_1 )* )
            // InternalOltl.g:645:2: ( rule__Model__SoftFormulaeAssignment_5_1 )*
            {
             before(grammarAccess.getModelAccess().getSoftFormulaeAssignment_5_1()); 
            // InternalOltl.g:646:2: ( rule__Model__SoftFormulaeAssignment_5_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalOltl.g:646:3: rule__Model__SoftFormulaeAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__SoftFormulaeAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSoftFormulaeAssignment_5_1()); 

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
    // $ANTLR end "rule__Model__Group_5__1__Impl"


    // $ANTLR start "rule__SoftAllTI__Group__0"
    // InternalOltl.g:655:1: rule__SoftAllTI__Group__0 : rule__SoftAllTI__Group__0__Impl rule__SoftAllTI__Group__1 ;
    public final void rule__SoftAllTI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:659:1: ( rule__SoftAllTI__Group__0__Impl rule__SoftAllTI__Group__1 )
            // InternalOltl.g:660:2: rule__SoftAllTI__Group__0__Impl rule__SoftAllTI__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SoftAllTI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoftAllTI__Group__1();

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
    // $ANTLR end "rule__SoftAllTI__Group__0"


    // $ANTLR start "rule__SoftAllTI__Group__0__Impl"
    // InternalOltl.g:667:1: rule__SoftAllTI__Group__0__Impl : ( '(' ) ;
    public final void rule__SoftAllTI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:671:1: ( ( '(' ) )
            // InternalOltl.g:672:1: ( '(' )
            {
            // InternalOltl.g:672:1: ( '(' )
            // InternalOltl.g:673:2: '('
            {
             before(grammarAccess.getSoftAllTIAccess().getLeftParenthesisKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSoftAllTIAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__SoftAllTI__Group__0__Impl"


    // $ANTLR start "rule__SoftAllTI__Group__1"
    // InternalOltl.g:682:1: rule__SoftAllTI__Group__1 : rule__SoftAllTI__Group__1__Impl rule__SoftAllTI__Group__2 ;
    public final void rule__SoftAllTI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:686:1: ( rule__SoftAllTI__Group__1__Impl rule__SoftAllTI__Group__2 )
            // InternalOltl.g:687:2: rule__SoftAllTI__Group__1__Impl rule__SoftAllTI__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SoftAllTI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoftAllTI__Group__2();

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
    // $ANTLR end "rule__SoftAllTI__Group__1"


    // $ANTLR start "rule__SoftAllTI__Group__1__Impl"
    // InternalOltl.g:694:1: rule__SoftAllTI__Group__1__Impl : ( 'soft' ) ;
    public final void rule__SoftAllTI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:698:1: ( ( 'soft' ) )
            // InternalOltl.g:699:1: ( 'soft' )
            {
            // InternalOltl.g:699:1: ( 'soft' )
            // InternalOltl.g:700:2: 'soft'
            {
             before(grammarAccess.getSoftAllTIAccess().getSoftKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSoftAllTIAccess().getSoftKeyword_1()); 

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
    // $ANTLR end "rule__SoftAllTI__Group__1__Impl"


    // $ANTLR start "rule__SoftAllTI__Group__2"
    // InternalOltl.g:709:1: rule__SoftAllTI__Group__2 : rule__SoftAllTI__Group__2__Impl rule__SoftAllTI__Group__3 ;
    public final void rule__SoftAllTI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:713:1: ( rule__SoftAllTI__Group__2__Impl rule__SoftAllTI__Group__3 )
            // InternalOltl.g:714:2: rule__SoftAllTI__Group__2__Impl rule__SoftAllTI__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__SoftAllTI__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoftAllTI__Group__3();

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
    // $ANTLR end "rule__SoftAllTI__Group__2"


    // $ANTLR start "rule__SoftAllTI__Group__2__Impl"
    // InternalOltl.g:721:1: rule__SoftAllTI__Group__2__Impl : ( ( rule__SoftAllTI__ApAssignment_2 ) ) ;
    public final void rule__SoftAllTI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:725:1: ( ( ( rule__SoftAllTI__ApAssignment_2 ) ) )
            // InternalOltl.g:726:1: ( ( rule__SoftAllTI__ApAssignment_2 ) )
            {
            // InternalOltl.g:726:1: ( ( rule__SoftAllTI__ApAssignment_2 ) )
            // InternalOltl.g:727:2: ( rule__SoftAllTI__ApAssignment_2 )
            {
             before(grammarAccess.getSoftAllTIAccess().getApAssignment_2()); 
            // InternalOltl.g:728:2: ( rule__SoftAllTI__ApAssignment_2 )
            // InternalOltl.g:728:3: rule__SoftAllTI__ApAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SoftAllTI__ApAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSoftAllTIAccess().getApAssignment_2()); 

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
    // $ANTLR end "rule__SoftAllTI__Group__2__Impl"


    // $ANTLR start "rule__SoftAllTI__Group__3"
    // InternalOltl.g:736:1: rule__SoftAllTI__Group__3 : rule__SoftAllTI__Group__3__Impl rule__SoftAllTI__Group__4 ;
    public final void rule__SoftAllTI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:740:1: ( rule__SoftAllTI__Group__3__Impl rule__SoftAllTI__Group__4 )
            // InternalOltl.g:741:2: rule__SoftAllTI__Group__3__Impl rule__SoftAllTI__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__SoftAllTI__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoftAllTI__Group__4();

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
    // $ANTLR end "rule__SoftAllTI__Group__3"


    // $ANTLR start "rule__SoftAllTI__Group__3__Impl"
    // InternalOltl.g:748:1: rule__SoftAllTI__Group__3__Impl : ( ( rule__SoftAllTI__IdAssignment_3 )? ) ;
    public final void rule__SoftAllTI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:752:1: ( ( ( rule__SoftAllTI__IdAssignment_3 )? ) )
            // InternalOltl.g:753:1: ( ( rule__SoftAllTI__IdAssignment_3 )? )
            {
            // InternalOltl.g:753:1: ( ( rule__SoftAllTI__IdAssignment_3 )? )
            // InternalOltl.g:754:2: ( rule__SoftAllTI__IdAssignment_3 )?
            {
             before(grammarAccess.getSoftAllTIAccess().getIdAssignment_3()); 
            // InternalOltl.g:755:2: ( rule__SoftAllTI__IdAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOltl.g:755:3: rule__SoftAllTI__IdAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SoftAllTI__IdAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSoftAllTIAccess().getIdAssignment_3()); 

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
    // $ANTLR end "rule__SoftAllTI__Group__3__Impl"


    // $ANTLR start "rule__SoftAllTI__Group__4"
    // InternalOltl.g:763:1: rule__SoftAllTI__Group__4 : rule__SoftAllTI__Group__4__Impl rule__SoftAllTI__Group__5 ;
    public final void rule__SoftAllTI__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:767:1: ( rule__SoftAllTI__Group__4__Impl rule__SoftAllTI__Group__5 )
            // InternalOltl.g:768:2: rule__SoftAllTI__Group__4__Impl rule__SoftAllTI__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__SoftAllTI__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoftAllTI__Group__5();

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
    // $ANTLR end "rule__SoftAllTI__Group__4"


    // $ANTLR start "rule__SoftAllTI__Group__4__Impl"
    // InternalOltl.g:775:1: rule__SoftAllTI__Group__4__Impl : ( ( rule__SoftAllTI__WeightAssignment_4 ) ) ;
    public final void rule__SoftAllTI__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:779:1: ( ( ( rule__SoftAllTI__WeightAssignment_4 ) ) )
            // InternalOltl.g:780:1: ( ( rule__SoftAllTI__WeightAssignment_4 ) )
            {
            // InternalOltl.g:780:1: ( ( rule__SoftAllTI__WeightAssignment_4 ) )
            // InternalOltl.g:781:2: ( rule__SoftAllTI__WeightAssignment_4 )
            {
             before(grammarAccess.getSoftAllTIAccess().getWeightAssignment_4()); 
            // InternalOltl.g:782:2: ( rule__SoftAllTI__WeightAssignment_4 )
            // InternalOltl.g:782:3: rule__SoftAllTI__WeightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SoftAllTI__WeightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSoftAllTIAccess().getWeightAssignment_4()); 

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
    // $ANTLR end "rule__SoftAllTI__Group__4__Impl"


    // $ANTLR start "rule__SoftAllTI__Group__5"
    // InternalOltl.g:790:1: rule__SoftAllTI__Group__5 : rule__SoftAllTI__Group__5__Impl ;
    public final void rule__SoftAllTI__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:794:1: ( rule__SoftAllTI__Group__5__Impl )
            // InternalOltl.g:795:2: rule__SoftAllTI__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SoftAllTI__Group__5__Impl();

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
    // $ANTLR end "rule__SoftAllTI__Group__5"


    // $ANTLR start "rule__SoftAllTI__Group__5__Impl"
    // InternalOltl.g:801:1: rule__SoftAllTI__Group__5__Impl : ( ')' ) ;
    public final void rule__SoftAllTI__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:805:1: ( ( ')' ) )
            // InternalOltl.g:806:1: ( ')' )
            {
            // InternalOltl.g:806:1: ( ')' )
            // InternalOltl.g:807:2: ')'
            {
             before(grammarAccess.getSoftAllTIAccess().getRightParenthesisKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSoftAllTIAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__SoftAllTI__Group__5__Impl"


    // $ANTLR start "rule__SoftTI__Group__0"
    // InternalOltl.g:817:1: rule__SoftTI__Group__0 : rule__SoftTI__Group__0__Impl rule__SoftTI__Group__1 ;
    public final void rule__SoftTI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:821:1: ( rule__SoftTI__Group__0__Impl rule__SoftTI__Group__1 )
            // InternalOltl.g:822:2: rule__SoftTI__Group__0__Impl rule__SoftTI__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SoftTI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoftTI__Group__1();

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
    // $ANTLR end "rule__SoftTI__Group__0"


    // $ANTLR start "rule__SoftTI__Group__0__Impl"
    // InternalOltl.g:829:1: rule__SoftTI__Group__0__Impl : ( '(' ) ;
    public final void rule__SoftTI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:833:1: ( ( '(' ) )
            // InternalOltl.g:834:1: ( '(' )
            {
            // InternalOltl.g:834:1: ( '(' )
            // InternalOltl.g:835:2: '('
            {
             before(grammarAccess.getSoftTIAccess().getLeftParenthesisKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSoftTIAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__SoftTI__Group__0__Impl"


    // $ANTLR start "rule__SoftTI__Group__1"
    // InternalOltl.g:844:1: rule__SoftTI__Group__1 : rule__SoftTI__Group__1__Impl rule__SoftTI__Group__2 ;
    public final void rule__SoftTI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:848:1: ( rule__SoftTI__Group__1__Impl rule__SoftTI__Group__2 )
            // InternalOltl.g:849:2: rule__SoftTI__Group__1__Impl rule__SoftTI__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SoftTI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoftTI__Group__2();

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
    // $ANTLR end "rule__SoftTI__Group__1"


    // $ANTLR start "rule__SoftTI__Group__1__Impl"
    // InternalOltl.g:856:1: rule__SoftTI__Group__1__Impl : ( 'soft' ) ;
    public final void rule__SoftTI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:860:1: ( ( 'soft' ) )
            // InternalOltl.g:861:1: ( 'soft' )
            {
            // InternalOltl.g:861:1: ( 'soft' )
            // InternalOltl.g:862:2: 'soft'
            {
             before(grammarAccess.getSoftTIAccess().getSoftKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSoftTIAccess().getSoftKeyword_1()); 

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
    // $ANTLR end "rule__SoftTI__Group__1__Impl"


    // $ANTLR start "rule__SoftTI__Group__2"
    // InternalOltl.g:871:1: rule__SoftTI__Group__2 : rule__SoftTI__Group__2__Impl rule__SoftTI__Group__3 ;
    public final void rule__SoftTI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:875:1: ( rule__SoftTI__Group__2__Impl rule__SoftTI__Group__3 )
            // InternalOltl.g:876:2: rule__SoftTI__Group__2__Impl rule__SoftTI__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__SoftTI__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoftTI__Group__3();

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
    // $ANTLR end "rule__SoftTI__Group__2"


    // $ANTLR start "rule__SoftTI__Group__2__Impl"
    // InternalOltl.g:883:1: rule__SoftTI__Group__2__Impl : ( '(' ) ;
    public final void rule__SoftTI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:887:1: ( ( '(' ) )
            // InternalOltl.g:888:1: ( '(' )
            {
            // InternalOltl.g:888:1: ( '(' )
            // InternalOltl.g:889:2: '('
            {
             before(grammarAccess.getSoftTIAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSoftTIAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__SoftTI__Group__2__Impl"


    // $ANTLR start "rule__SoftTI__Group__3"
    // InternalOltl.g:898:1: rule__SoftTI__Group__3 : rule__SoftTI__Group__3__Impl rule__SoftTI__Group__4 ;
    public final void rule__SoftTI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:902:1: ( rule__SoftTI__Group__3__Impl rule__SoftTI__Group__4 )
            // InternalOltl.g:903:2: rule__SoftTI__Group__3__Impl rule__SoftTI__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SoftTI__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoftTI__Group__4();

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
    // $ANTLR end "rule__SoftTI__Group__3"


    // $ANTLR start "rule__SoftTI__Group__3__Impl"
    // InternalOltl.g:910:1: rule__SoftTI__Group__3__Impl : ( '@' ) ;
    public final void rule__SoftTI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:914:1: ( ( '@' ) )
            // InternalOltl.g:915:1: ( '@' )
            {
            // InternalOltl.g:915:1: ( '@' )
            // InternalOltl.g:916:2: '@'
            {
             before(grammarAccess.getSoftTIAccess().getCommercialAtKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSoftTIAccess().getCommercialAtKeyword_3()); 

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
    // $ANTLR end "rule__SoftTI__Group__3__Impl"


    // $ANTLR start "rule__SoftTI__Group__4"
    // InternalOltl.g:925:1: rule__SoftTI__Group__4 : rule__SoftTI__Group__4__Impl rule__SoftTI__Group__5 ;
    public final void rule__SoftTI__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:929:1: ( rule__SoftTI__Group__4__Impl rule__SoftTI__Group__5 )
            // InternalOltl.g:930:2: rule__SoftTI__Group__4__Impl rule__SoftTI__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__SoftTI__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoftTI__Group__5();

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
    // $ANTLR end "rule__SoftTI__Group__4"


    // $ANTLR start "rule__SoftTI__Group__4__Impl"
    // InternalOltl.g:937:1: rule__SoftTI__Group__4__Impl : ( ( rule__SoftTI__ApAssignment_4 ) ) ;
    public final void rule__SoftTI__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:941:1: ( ( ( rule__SoftTI__ApAssignment_4 ) ) )
            // InternalOltl.g:942:1: ( ( rule__SoftTI__ApAssignment_4 ) )
            {
            // InternalOltl.g:942:1: ( ( rule__SoftTI__ApAssignment_4 ) )
            // InternalOltl.g:943:2: ( rule__SoftTI__ApAssignment_4 )
            {
             before(grammarAccess.getSoftTIAccess().getApAssignment_4()); 
            // InternalOltl.g:944:2: ( rule__SoftTI__ApAssignment_4 )
            // InternalOltl.g:944:3: rule__SoftTI__ApAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SoftTI__ApAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSoftTIAccess().getApAssignment_4()); 

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
    // $ANTLR end "rule__SoftTI__Group__4__Impl"


    // $ANTLR start "rule__SoftTI__Group__5"
    // InternalOltl.g:952:1: rule__SoftTI__Group__5 : rule__SoftTI__Group__5__Impl rule__SoftTI__Group__6 ;
    public final void rule__SoftTI__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:956:1: ( rule__SoftTI__Group__5__Impl rule__SoftTI__Group__6 )
            // InternalOltl.g:957:2: rule__SoftTI__Group__5__Impl rule__SoftTI__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__SoftTI__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoftTI__Group__6();

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
    // $ANTLR end "rule__SoftTI__Group__5"


    // $ANTLR start "rule__SoftTI__Group__5__Impl"
    // InternalOltl.g:964:1: rule__SoftTI__Group__5__Impl : ( ( rule__SoftTI__TiAssignment_5 ) ) ;
    public final void rule__SoftTI__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:968:1: ( ( ( rule__SoftTI__TiAssignment_5 ) ) )
            // InternalOltl.g:969:1: ( ( rule__SoftTI__TiAssignment_5 ) )
            {
            // InternalOltl.g:969:1: ( ( rule__SoftTI__TiAssignment_5 ) )
            // InternalOltl.g:970:2: ( rule__SoftTI__TiAssignment_5 )
            {
             before(grammarAccess.getSoftTIAccess().getTiAssignment_5()); 
            // InternalOltl.g:971:2: ( rule__SoftTI__TiAssignment_5 )
            // InternalOltl.g:971:3: rule__SoftTI__TiAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SoftTI__TiAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSoftTIAccess().getTiAssignment_5()); 

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
    // $ANTLR end "rule__SoftTI__Group__5__Impl"


    // $ANTLR start "rule__SoftTI__Group__6"
    // InternalOltl.g:979:1: rule__SoftTI__Group__6 : rule__SoftTI__Group__6__Impl rule__SoftTI__Group__7 ;
    public final void rule__SoftTI__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:983:1: ( rule__SoftTI__Group__6__Impl rule__SoftTI__Group__7 )
            // InternalOltl.g:984:2: rule__SoftTI__Group__6__Impl rule__SoftTI__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__SoftTI__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoftTI__Group__7();

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
    // $ANTLR end "rule__SoftTI__Group__6"


    // $ANTLR start "rule__SoftTI__Group__6__Impl"
    // InternalOltl.g:991:1: rule__SoftTI__Group__6__Impl : ( ')' ) ;
    public final void rule__SoftTI__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:995:1: ( ( ')' ) )
            // InternalOltl.g:996:1: ( ')' )
            {
            // InternalOltl.g:996:1: ( ')' )
            // InternalOltl.g:997:2: ')'
            {
             before(grammarAccess.getSoftTIAccess().getRightParenthesisKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSoftTIAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__SoftTI__Group__6__Impl"


    // $ANTLR start "rule__SoftTI__Group__7"
    // InternalOltl.g:1006:1: rule__SoftTI__Group__7 : rule__SoftTI__Group__7__Impl rule__SoftTI__Group__8 ;
    public final void rule__SoftTI__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1010:1: ( rule__SoftTI__Group__7__Impl rule__SoftTI__Group__8 )
            // InternalOltl.g:1011:2: rule__SoftTI__Group__7__Impl rule__SoftTI__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__SoftTI__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoftTI__Group__8();

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
    // $ANTLR end "rule__SoftTI__Group__7"


    // $ANTLR start "rule__SoftTI__Group__7__Impl"
    // InternalOltl.g:1018:1: rule__SoftTI__Group__7__Impl : ( ( rule__SoftTI__IdAssignment_7 )? ) ;
    public final void rule__SoftTI__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1022:1: ( ( ( rule__SoftTI__IdAssignment_7 )? ) )
            // InternalOltl.g:1023:1: ( ( rule__SoftTI__IdAssignment_7 )? )
            {
            // InternalOltl.g:1023:1: ( ( rule__SoftTI__IdAssignment_7 )? )
            // InternalOltl.g:1024:2: ( rule__SoftTI__IdAssignment_7 )?
            {
             before(grammarAccess.getSoftTIAccess().getIdAssignment_7()); 
            // InternalOltl.g:1025:2: ( rule__SoftTI__IdAssignment_7 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOltl.g:1025:3: rule__SoftTI__IdAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__SoftTI__IdAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSoftTIAccess().getIdAssignment_7()); 

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
    // $ANTLR end "rule__SoftTI__Group__7__Impl"


    // $ANTLR start "rule__SoftTI__Group__8"
    // InternalOltl.g:1033:1: rule__SoftTI__Group__8 : rule__SoftTI__Group__8__Impl rule__SoftTI__Group__9 ;
    public final void rule__SoftTI__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1037:1: ( rule__SoftTI__Group__8__Impl rule__SoftTI__Group__9 )
            // InternalOltl.g:1038:2: rule__SoftTI__Group__8__Impl rule__SoftTI__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__SoftTI__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoftTI__Group__9();

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
    // $ANTLR end "rule__SoftTI__Group__8"


    // $ANTLR start "rule__SoftTI__Group__8__Impl"
    // InternalOltl.g:1045:1: rule__SoftTI__Group__8__Impl : ( ( rule__SoftTI__WeightAssignment_8 ) ) ;
    public final void rule__SoftTI__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1049:1: ( ( ( rule__SoftTI__WeightAssignment_8 ) ) )
            // InternalOltl.g:1050:1: ( ( rule__SoftTI__WeightAssignment_8 ) )
            {
            // InternalOltl.g:1050:1: ( ( rule__SoftTI__WeightAssignment_8 ) )
            // InternalOltl.g:1051:2: ( rule__SoftTI__WeightAssignment_8 )
            {
             before(grammarAccess.getSoftTIAccess().getWeightAssignment_8()); 
            // InternalOltl.g:1052:2: ( rule__SoftTI__WeightAssignment_8 )
            // InternalOltl.g:1052:3: rule__SoftTI__WeightAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__SoftTI__WeightAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSoftTIAccess().getWeightAssignment_8()); 

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
    // $ANTLR end "rule__SoftTI__Group__8__Impl"


    // $ANTLR start "rule__SoftTI__Group__9"
    // InternalOltl.g:1060:1: rule__SoftTI__Group__9 : rule__SoftTI__Group__9__Impl ;
    public final void rule__SoftTI__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1064:1: ( rule__SoftTI__Group__9__Impl )
            // InternalOltl.g:1065:2: rule__SoftTI__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SoftTI__Group__9__Impl();

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
    // $ANTLR end "rule__SoftTI__Group__9"


    // $ANTLR start "rule__SoftTI__Group__9__Impl"
    // InternalOltl.g:1071:1: rule__SoftTI__Group__9__Impl : ( ')' ) ;
    public final void rule__SoftTI__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1075:1: ( ( ')' ) )
            // InternalOltl.g:1076:1: ( ')' )
            {
            // InternalOltl.g:1076:1: ( ')' )
            // InternalOltl.g:1077:2: ')'
            {
             before(grammarAccess.getSoftTIAccess().getRightParenthesisKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSoftTIAccess().getRightParenthesisKeyword_9()); 

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
    // $ANTLR end "rule__SoftTI__Group__9__Impl"


    // $ANTLR start "rule__WFloat__Group__0"
    // InternalOltl.g:1087:1: rule__WFloat__Group__0 : rule__WFloat__Group__0__Impl rule__WFloat__Group__1 ;
    public final void rule__WFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1091:1: ( rule__WFloat__Group__0__Impl rule__WFloat__Group__1 )
            // InternalOltl.g:1092:2: rule__WFloat__Group__0__Impl rule__WFloat__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalOltl.g:1099:1: rule__WFloat__Group__0__Impl : ( ( rule__WFloat__Int1Assignment_0 ) ) ;
    public final void rule__WFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1103:1: ( ( ( rule__WFloat__Int1Assignment_0 ) ) )
            // InternalOltl.g:1104:1: ( ( rule__WFloat__Int1Assignment_0 ) )
            {
            // InternalOltl.g:1104:1: ( ( rule__WFloat__Int1Assignment_0 ) )
            // InternalOltl.g:1105:2: ( rule__WFloat__Int1Assignment_0 )
            {
             before(grammarAccess.getWFloatAccess().getInt1Assignment_0()); 
            // InternalOltl.g:1106:2: ( rule__WFloat__Int1Assignment_0 )
            // InternalOltl.g:1106:3: rule__WFloat__Int1Assignment_0
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
    // InternalOltl.g:1114:1: rule__WFloat__Group__1 : rule__WFloat__Group__1__Impl rule__WFloat__Group__2 ;
    public final void rule__WFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1118:1: ( rule__WFloat__Group__1__Impl rule__WFloat__Group__2 )
            // InternalOltl.g:1119:2: rule__WFloat__Group__1__Impl rule__WFloat__Group__2
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
    // InternalOltl.g:1126:1: rule__WFloat__Group__1__Impl : ( '.' ) ;
    public final void rule__WFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1130:1: ( ( '.' ) )
            // InternalOltl.g:1131:1: ( '.' )
            {
            // InternalOltl.g:1131:1: ( '.' )
            // InternalOltl.g:1132:2: '.'
            {
             before(grammarAccess.getWFloatAccess().getFullStopKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalOltl.g:1141:1: rule__WFloat__Group__2 : rule__WFloat__Group__2__Impl ;
    public final void rule__WFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1145:1: ( rule__WFloat__Group__2__Impl )
            // InternalOltl.g:1146:2: rule__WFloat__Group__2__Impl
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
    // InternalOltl.g:1152:1: rule__WFloat__Group__2__Impl : ( ( rule__WFloat__Int2Assignment_2 ) ) ;
    public final void rule__WFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1156:1: ( ( ( rule__WFloat__Int2Assignment_2 ) ) )
            // InternalOltl.g:1157:1: ( ( rule__WFloat__Int2Assignment_2 ) )
            {
            // InternalOltl.g:1157:1: ( ( rule__WFloat__Int2Assignment_2 ) )
            // InternalOltl.g:1158:2: ( rule__WFloat__Int2Assignment_2 )
            {
             before(grammarAccess.getWFloatAccess().getInt2Assignment_2()); 
            // InternalOltl.g:1159:2: ( rule__WFloat__Int2Assignment_2 )
            // InternalOltl.g:1159:3: rule__WFloat__Int2Assignment_2
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
    // InternalOltl.g:1168:1: rule__TempFormula__Group_1__0 : rule__TempFormula__Group_1__0__Impl rule__TempFormula__Group_1__1 ;
    public final void rule__TempFormula__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1172:1: ( rule__TempFormula__Group_1__0__Impl rule__TempFormula__Group_1__1 )
            // InternalOltl.g:1173:2: rule__TempFormula__Group_1__0__Impl rule__TempFormula__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalOltl.g:1180:1: rule__TempFormula__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1184:1: ( ( '(' ) )
            // InternalOltl.g:1185:1: ( '(' )
            {
            // InternalOltl.g:1185:1: ( '(' )
            // InternalOltl.g:1186:2: '('
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
    // InternalOltl.g:1195:1: rule__TempFormula__Group_1__1 : rule__TempFormula__Group_1__1__Impl rule__TempFormula__Group_1__2 ;
    public final void rule__TempFormula__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1199:1: ( rule__TempFormula__Group_1__1__Impl rule__TempFormula__Group_1__2 )
            // InternalOltl.g:1200:2: rule__TempFormula__Group_1__1__Impl rule__TempFormula__Group_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalOltl.g:1207:1: rule__TempFormula__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__TempFormula__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1211:1: ( ( '&&' ) )
            // InternalOltl.g:1212:1: ( '&&' )
            {
            // InternalOltl.g:1212:1: ( '&&' )
            // InternalOltl.g:1213:2: '&&'
            {
             before(grammarAccess.getTempFormulaAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalOltl.g:1222:1: rule__TempFormula__Group_1__2 : rule__TempFormula__Group_1__2__Impl rule__TempFormula__Group_1__3 ;
    public final void rule__TempFormula__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1226:1: ( rule__TempFormula__Group_1__2__Impl rule__TempFormula__Group_1__3 )
            // InternalOltl.g:1227:2: rule__TempFormula__Group_1__2__Impl rule__TempFormula__Group_1__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalOltl.g:1234:1: rule__TempFormula__Group_1__2__Impl : ( ( ( rule__TempFormula__FaAssignment_1_2 ) ) ( ( rule__TempFormula__FaAssignment_1_2 )* ) ) ;
    public final void rule__TempFormula__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1238:1: ( ( ( ( rule__TempFormula__FaAssignment_1_2 ) ) ( ( rule__TempFormula__FaAssignment_1_2 )* ) ) )
            // InternalOltl.g:1239:1: ( ( ( rule__TempFormula__FaAssignment_1_2 ) ) ( ( rule__TempFormula__FaAssignment_1_2 )* ) )
            {
            // InternalOltl.g:1239:1: ( ( ( rule__TempFormula__FaAssignment_1_2 ) ) ( ( rule__TempFormula__FaAssignment_1_2 )* ) )
            // InternalOltl.g:1240:2: ( ( rule__TempFormula__FaAssignment_1_2 ) ) ( ( rule__TempFormula__FaAssignment_1_2 )* )
            {
            // InternalOltl.g:1240:2: ( ( rule__TempFormula__FaAssignment_1_2 ) )
            // InternalOltl.g:1241:3: ( rule__TempFormula__FaAssignment_1_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getFaAssignment_1_2()); 
            // InternalOltl.g:1242:3: ( rule__TempFormula__FaAssignment_1_2 )
            // InternalOltl.g:1242:4: rule__TempFormula__FaAssignment_1_2
            {
            pushFollow(FOLLOW_7);
            rule__TempFormula__FaAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getFaAssignment_1_2()); 

            }

            // InternalOltl.g:1245:2: ( ( rule__TempFormula__FaAssignment_1_2 )* )
            // InternalOltl.g:1246:3: ( rule__TempFormula__FaAssignment_1_2 )*
            {
             before(grammarAccess.getTempFormulaAccess().getFaAssignment_1_2()); 
            // InternalOltl.g:1247:3: ( rule__TempFormula__FaAssignment_1_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOltl.g:1247:4: rule__TempFormula__FaAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TempFormula__FaAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalOltl.g:1256:1: rule__TempFormula__Group_1__3 : rule__TempFormula__Group_1__3__Impl ;
    public final void rule__TempFormula__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1260:1: ( rule__TempFormula__Group_1__3__Impl )
            // InternalOltl.g:1261:2: rule__TempFormula__Group_1__3__Impl
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
    // InternalOltl.g:1267:1: rule__TempFormula__Group_1__3__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1271:1: ( ( ')' ) )
            // InternalOltl.g:1272:1: ( ')' )
            {
            // InternalOltl.g:1272:1: ( ')' )
            // InternalOltl.g:1273:2: ')'
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
    // InternalOltl.g:1283:1: rule__TempFormula__Group_2__0 : rule__TempFormula__Group_2__0__Impl rule__TempFormula__Group_2__1 ;
    public final void rule__TempFormula__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1287:1: ( rule__TempFormula__Group_2__0__Impl rule__TempFormula__Group_2__1 )
            // InternalOltl.g:1288:2: rule__TempFormula__Group_2__0__Impl rule__TempFormula__Group_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalOltl.g:1295:1: rule__TempFormula__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1299:1: ( ( '(' ) )
            // InternalOltl.g:1300:1: ( '(' )
            {
            // InternalOltl.g:1300:1: ( '(' )
            // InternalOltl.g:1301:2: '('
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
    // InternalOltl.g:1310:1: rule__TempFormula__Group_2__1 : rule__TempFormula__Group_2__1__Impl rule__TempFormula__Group_2__2 ;
    public final void rule__TempFormula__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1314:1: ( rule__TempFormula__Group_2__1__Impl rule__TempFormula__Group_2__2 )
            // InternalOltl.g:1315:2: rule__TempFormula__Group_2__1__Impl rule__TempFormula__Group_2__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalOltl.g:1322:1: rule__TempFormula__Group_2__1__Impl : ( '||' ) ;
    public final void rule__TempFormula__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1326:1: ( ( '||' ) )
            // InternalOltl.g:1327:1: ( '||' )
            {
            // InternalOltl.g:1327:1: ( '||' )
            // InternalOltl.g:1328:2: '||'
            {
             before(grammarAccess.getTempFormulaAccess().getVerticalLineVerticalLineKeyword_2_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalOltl.g:1337:1: rule__TempFormula__Group_2__2 : rule__TempFormula__Group_2__2__Impl rule__TempFormula__Group_2__3 ;
    public final void rule__TempFormula__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1341:1: ( rule__TempFormula__Group_2__2__Impl rule__TempFormula__Group_2__3 )
            // InternalOltl.g:1342:2: rule__TempFormula__Group_2__2__Impl rule__TempFormula__Group_2__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalOltl.g:1349:1: rule__TempFormula__Group_2__2__Impl : ( ( ( rule__TempFormula__FoAssignment_2_2 ) ) ( ( rule__TempFormula__FoAssignment_2_2 )* ) ) ;
    public final void rule__TempFormula__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1353:1: ( ( ( ( rule__TempFormula__FoAssignment_2_2 ) ) ( ( rule__TempFormula__FoAssignment_2_2 )* ) ) )
            // InternalOltl.g:1354:1: ( ( ( rule__TempFormula__FoAssignment_2_2 ) ) ( ( rule__TempFormula__FoAssignment_2_2 )* ) )
            {
            // InternalOltl.g:1354:1: ( ( ( rule__TempFormula__FoAssignment_2_2 ) ) ( ( rule__TempFormula__FoAssignment_2_2 )* ) )
            // InternalOltl.g:1355:2: ( ( rule__TempFormula__FoAssignment_2_2 ) ) ( ( rule__TempFormula__FoAssignment_2_2 )* )
            {
            // InternalOltl.g:1355:2: ( ( rule__TempFormula__FoAssignment_2_2 ) )
            // InternalOltl.g:1356:3: ( rule__TempFormula__FoAssignment_2_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getFoAssignment_2_2()); 
            // InternalOltl.g:1357:3: ( rule__TempFormula__FoAssignment_2_2 )
            // InternalOltl.g:1357:4: rule__TempFormula__FoAssignment_2_2
            {
            pushFollow(FOLLOW_7);
            rule__TempFormula__FoAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getTempFormulaAccess().getFoAssignment_2_2()); 

            }

            // InternalOltl.g:1360:2: ( ( rule__TempFormula__FoAssignment_2_2 )* )
            // InternalOltl.g:1361:3: ( rule__TempFormula__FoAssignment_2_2 )*
            {
             before(grammarAccess.getTempFormulaAccess().getFoAssignment_2_2()); 
            // InternalOltl.g:1362:3: ( rule__TempFormula__FoAssignment_2_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOltl.g:1362:4: rule__TempFormula__FoAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TempFormula__FoAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalOltl.g:1371:1: rule__TempFormula__Group_2__3 : rule__TempFormula__Group_2__3__Impl ;
    public final void rule__TempFormula__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1375:1: ( rule__TempFormula__Group_2__3__Impl )
            // InternalOltl.g:1376:2: rule__TempFormula__Group_2__3__Impl
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
    // InternalOltl.g:1382:1: rule__TempFormula__Group_2__3__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1386:1: ( ( ')' ) )
            // InternalOltl.g:1387:1: ( ')' )
            {
            // InternalOltl.g:1387:1: ( ')' )
            // InternalOltl.g:1388:2: ')'
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
    // InternalOltl.g:1398:1: rule__TempFormula__Group_3__0 : rule__TempFormula__Group_3__0__Impl rule__TempFormula__Group_3__1 ;
    public final void rule__TempFormula__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1402:1: ( rule__TempFormula__Group_3__0__Impl rule__TempFormula__Group_3__1 )
            // InternalOltl.g:1403:2: rule__TempFormula__Group_3__0__Impl rule__TempFormula__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOltl.g:1410:1: rule__TempFormula__Group_3__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1414:1: ( ( '(' ) )
            // InternalOltl.g:1415:1: ( '(' )
            {
            // InternalOltl.g:1415:1: ( '(' )
            // InternalOltl.g:1416:2: '('
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
    // InternalOltl.g:1425:1: rule__TempFormula__Group_3__1 : rule__TempFormula__Group_3__1__Impl rule__TempFormula__Group_3__2 ;
    public final void rule__TempFormula__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1429:1: ( rule__TempFormula__Group_3__1__Impl rule__TempFormula__Group_3__2 )
            // InternalOltl.g:1430:2: rule__TempFormula__Group_3__1__Impl rule__TempFormula__Group_3__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalOltl.g:1437:1: rule__TempFormula__Group_3__1__Impl : ( '!!' ) ;
    public final void rule__TempFormula__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1441:1: ( ( '!!' ) )
            // InternalOltl.g:1442:1: ( '!!' )
            {
            // InternalOltl.g:1442:1: ( '!!' )
            // InternalOltl.g:1443:2: '!!'
            {
             before(grammarAccess.getTempFormulaAccess().getExclamationMarkExclamationMarkKeyword_3_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalOltl.g:1452:1: rule__TempFormula__Group_3__2 : rule__TempFormula__Group_3__2__Impl rule__TempFormula__Group_3__3 ;
    public final void rule__TempFormula__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1456:1: ( rule__TempFormula__Group_3__2__Impl rule__TempFormula__Group_3__3 )
            // InternalOltl.g:1457:2: rule__TempFormula__Group_3__2__Impl rule__TempFormula__Group_3__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalOltl.g:1464:1: rule__TempFormula__Group_3__2__Impl : ( ( rule__TempFormula__FnotAssignment_3_2 ) ) ;
    public final void rule__TempFormula__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1468:1: ( ( ( rule__TempFormula__FnotAssignment_3_2 ) ) )
            // InternalOltl.g:1469:1: ( ( rule__TempFormula__FnotAssignment_3_2 ) )
            {
            // InternalOltl.g:1469:1: ( ( rule__TempFormula__FnotAssignment_3_2 ) )
            // InternalOltl.g:1470:2: ( rule__TempFormula__FnotAssignment_3_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getFnotAssignment_3_2()); 
            // InternalOltl.g:1471:2: ( rule__TempFormula__FnotAssignment_3_2 )
            // InternalOltl.g:1471:3: rule__TempFormula__FnotAssignment_3_2
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
    // InternalOltl.g:1479:1: rule__TempFormula__Group_3__3 : rule__TempFormula__Group_3__3__Impl ;
    public final void rule__TempFormula__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1483:1: ( rule__TempFormula__Group_3__3__Impl )
            // InternalOltl.g:1484:2: rule__TempFormula__Group_3__3__Impl
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
    // InternalOltl.g:1490:1: rule__TempFormula__Group_3__3__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1494:1: ( ( ')' ) )
            // InternalOltl.g:1495:1: ( ')' )
            {
            // InternalOltl.g:1495:1: ( ')' )
            // InternalOltl.g:1496:2: ')'
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
    // InternalOltl.g:1506:1: rule__TempFormula__Group_4__0 : rule__TempFormula__Group_4__0__Impl rule__TempFormula__Group_4__1 ;
    public final void rule__TempFormula__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1510:1: ( rule__TempFormula__Group_4__0__Impl rule__TempFormula__Group_4__1 )
            // InternalOltl.g:1511:2: rule__TempFormula__Group_4__0__Impl rule__TempFormula__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalOltl.g:1518:1: rule__TempFormula__Group_4__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1522:1: ( ( '(' ) )
            // InternalOltl.g:1523:1: ( '(' )
            {
            // InternalOltl.g:1523:1: ( '(' )
            // InternalOltl.g:1524:2: '('
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
    // InternalOltl.g:1533:1: rule__TempFormula__Group_4__1 : rule__TempFormula__Group_4__1__Impl rule__TempFormula__Group_4__2 ;
    public final void rule__TempFormula__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1537:1: ( rule__TempFormula__Group_4__1__Impl rule__TempFormula__Group_4__2 )
            // InternalOltl.g:1538:2: rule__TempFormula__Group_4__1__Impl rule__TempFormula__Group_4__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalOltl.g:1545:1: rule__TempFormula__Group_4__1__Impl : ( ( rule__TempFormula__Op2Assignment_4_1 ) ) ;
    public final void rule__TempFormula__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1549:1: ( ( ( rule__TempFormula__Op2Assignment_4_1 ) ) )
            // InternalOltl.g:1550:1: ( ( rule__TempFormula__Op2Assignment_4_1 ) )
            {
            // InternalOltl.g:1550:1: ( ( rule__TempFormula__Op2Assignment_4_1 ) )
            // InternalOltl.g:1551:2: ( rule__TempFormula__Op2Assignment_4_1 )
            {
             before(grammarAccess.getTempFormulaAccess().getOp2Assignment_4_1()); 
            // InternalOltl.g:1552:2: ( rule__TempFormula__Op2Assignment_4_1 )
            // InternalOltl.g:1552:3: rule__TempFormula__Op2Assignment_4_1
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
    // InternalOltl.g:1560:1: rule__TempFormula__Group_4__2 : rule__TempFormula__Group_4__2__Impl rule__TempFormula__Group_4__3 ;
    public final void rule__TempFormula__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1564:1: ( rule__TempFormula__Group_4__2__Impl rule__TempFormula__Group_4__3 )
            // InternalOltl.g:1565:2: rule__TempFormula__Group_4__2__Impl rule__TempFormula__Group_4__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalOltl.g:1572:1: rule__TempFormula__Group_4__2__Impl : ( ( rule__TempFormula__F1Assignment_4_2 ) ) ;
    public final void rule__TempFormula__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1576:1: ( ( ( rule__TempFormula__F1Assignment_4_2 ) ) )
            // InternalOltl.g:1577:1: ( ( rule__TempFormula__F1Assignment_4_2 ) )
            {
            // InternalOltl.g:1577:1: ( ( rule__TempFormula__F1Assignment_4_2 ) )
            // InternalOltl.g:1578:2: ( rule__TempFormula__F1Assignment_4_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getF1Assignment_4_2()); 
            // InternalOltl.g:1579:2: ( rule__TempFormula__F1Assignment_4_2 )
            // InternalOltl.g:1579:3: rule__TempFormula__F1Assignment_4_2
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
    // InternalOltl.g:1587:1: rule__TempFormula__Group_4__3 : rule__TempFormula__Group_4__3__Impl rule__TempFormula__Group_4__4 ;
    public final void rule__TempFormula__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1591:1: ( rule__TempFormula__Group_4__3__Impl rule__TempFormula__Group_4__4 )
            // InternalOltl.g:1592:2: rule__TempFormula__Group_4__3__Impl rule__TempFormula__Group_4__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalOltl.g:1599:1: rule__TempFormula__Group_4__3__Impl : ( ( rule__TempFormula__F2Assignment_4_3 ) ) ;
    public final void rule__TempFormula__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1603:1: ( ( ( rule__TempFormula__F2Assignment_4_3 ) ) )
            // InternalOltl.g:1604:1: ( ( rule__TempFormula__F2Assignment_4_3 ) )
            {
            // InternalOltl.g:1604:1: ( ( rule__TempFormula__F2Assignment_4_3 ) )
            // InternalOltl.g:1605:2: ( rule__TempFormula__F2Assignment_4_3 )
            {
             before(grammarAccess.getTempFormulaAccess().getF2Assignment_4_3()); 
            // InternalOltl.g:1606:2: ( rule__TempFormula__F2Assignment_4_3 )
            // InternalOltl.g:1606:3: rule__TempFormula__F2Assignment_4_3
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
    // InternalOltl.g:1614:1: rule__TempFormula__Group_4__4 : rule__TempFormula__Group_4__4__Impl ;
    public final void rule__TempFormula__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1618:1: ( rule__TempFormula__Group_4__4__Impl )
            // InternalOltl.g:1619:2: rule__TempFormula__Group_4__4__Impl
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
    // InternalOltl.g:1625:1: rule__TempFormula__Group_4__4__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1629:1: ( ( ')' ) )
            // InternalOltl.g:1630:1: ( ')' )
            {
            // InternalOltl.g:1630:1: ( ')' )
            // InternalOltl.g:1631:2: ')'
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
    // InternalOltl.g:1641:1: rule__TempFormula__Group_5__0 : rule__TempFormula__Group_5__0__Impl rule__TempFormula__Group_5__1 ;
    public final void rule__TempFormula__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1645:1: ( rule__TempFormula__Group_5__0__Impl rule__TempFormula__Group_5__1 )
            // InternalOltl.g:1646:2: rule__TempFormula__Group_5__0__Impl rule__TempFormula__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalOltl.g:1653:1: rule__TempFormula__Group_5__0__Impl : ( '(' ) ;
    public final void rule__TempFormula__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1657:1: ( ( '(' ) )
            // InternalOltl.g:1658:1: ( '(' )
            {
            // InternalOltl.g:1658:1: ( '(' )
            // InternalOltl.g:1659:2: '('
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
    // InternalOltl.g:1668:1: rule__TempFormula__Group_5__1 : rule__TempFormula__Group_5__1__Impl rule__TempFormula__Group_5__2 ;
    public final void rule__TempFormula__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1672:1: ( rule__TempFormula__Group_5__1__Impl rule__TempFormula__Group_5__2 )
            // InternalOltl.g:1673:2: rule__TempFormula__Group_5__1__Impl rule__TempFormula__Group_5__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalOltl.g:1680:1: rule__TempFormula__Group_5__1__Impl : ( ( rule__TempFormula__OpfAssignment_5_1 ) ) ;
    public final void rule__TempFormula__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1684:1: ( ( ( rule__TempFormula__OpfAssignment_5_1 ) ) )
            // InternalOltl.g:1685:1: ( ( rule__TempFormula__OpfAssignment_5_1 ) )
            {
            // InternalOltl.g:1685:1: ( ( rule__TempFormula__OpfAssignment_5_1 ) )
            // InternalOltl.g:1686:2: ( rule__TempFormula__OpfAssignment_5_1 )
            {
             before(grammarAccess.getTempFormulaAccess().getOpfAssignment_5_1()); 
            // InternalOltl.g:1687:2: ( rule__TempFormula__OpfAssignment_5_1 )
            // InternalOltl.g:1687:3: rule__TempFormula__OpfAssignment_5_1
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
    // InternalOltl.g:1695:1: rule__TempFormula__Group_5__2 : rule__TempFormula__Group_5__2__Impl rule__TempFormula__Group_5__3 ;
    public final void rule__TempFormula__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1699:1: ( rule__TempFormula__Group_5__2__Impl rule__TempFormula__Group_5__3 )
            // InternalOltl.g:1700:2: rule__TempFormula__Group_5__2__Impl rule__TempFormula__Group_5__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalOltl.g:1707:1: rule__TempFormula__Group_5__2__Impl : ( ( rule__TempFormula__FAssignment_5_2 ) ) ;
    public final void rule__TempFormula__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1711:1: ( ( ( rule__TempFormula__FAssignment_5_2 ) ) )
            // InternalOltl.g:1712:1: ( ( rule__TempFormula__FAssignment_5_2 ) )
            {
            // InternalOltl.g:1712:1: ( ( rule__TempFormula__FAssignment_5_2 ) )
            // InternalOltl.g:1713:2: ( rule__TempFormula__FAssignment_5_2 )
            {
             before(grammarAccess.getTempFormulaAccess().getFAssignment_5_2()); 
            // InternalOltl.g:1714:2: ( rule__TempFormula__FAssignment_5_2 )
            // InternalOltl.g:1714:3: rule__TempFormula__FAssignment_5_2
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
    // InternalOltl.g:1722:1: rule__TempFormula__Group_5__3 : rule__TempFormula__Group_5__3__Impl ;
    public final void rule__TempFormula__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1726:1: ( rule__TempFormula__Group_5__3__Impl )
            // InternalOltl.g:1727:2: rule__TempFormula__Group_5__3__Impl
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
    // InternalOltl.g:1733:1: rule__TempFormula__Group_5__3__Impl : ( ')' ) ;
    public final void rule__TempFormula__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1737:1: ( ( ')' ) )
            // InternalOltl.g:1738:1: ( ')' )
            {
            // InternalOltl.g:1738:1: ( ')' )
            // InternalOltl.g:1739:2: ')'
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


    // $ANTLR start "rule__AP__Group__0"
    // InternalOltl.g:1749:1: rule__AP__Group__0 : rule__AP__Group__0__Impl rule__AP__Group__1 ;
    public final void rule__AP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1753:1: ( rule__AP__Group__0__Impl rule__AP__Group__1 )
            // InternalOltl.g:1754:2: rule__AP__Group__0__Impl rule__AP__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalOltl.g:1761:1: rule__AP__Group__0__Impl : ( '(' ) ;
    public final void rule__AP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1765:1: ( ( '(' ) )
            // InternalOltl.g:1766:1: ( '(' )
            {
            // InternalOltl.g:1766:1: ( '(' )
            // InternalOltl.g:1767:2: '('
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
    // InternalOltl.g:1776:1: rule__AP__Group__1 : rule__AP__Group__1__Impl rule__AP__Group__2 ;
    public final void rule__AP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1780:1: ( rule__AP__Group__1__Impl rule__AP__Group__2 )
            // InternalOltl.g:1781:2: rule__AP__Group__1__Impl rule__AP__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalOltl.g:1788:1: rule__AP__Group__1__Impl : ( '-' ) ;
    public final void rule__AP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1792:1: ( ( '-' ) )
            // InternalOltl.g:1793:1: ( '-' )
            {
            // InternalOltl.g:1793:1: ( '-' )
            // InternalOltl.g:1794:2: '-'
            {
             before(grammarAccess.getAPAccess().getHyphenMinusKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOltl.g:1803:1: rule__AP__Group__2 : rule__AP__Group__2__Impl rule__AP__Group__3 ;
    public final void rule__AP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1807:1: ( rule__AP__Group__2__Impl rule__AP__Group__3 )
            // InternalOltl.g:1808:2: rule__AP__Group__2__Impl rule__AP__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalOltl.g:1815:1: rule__AP__Group__2__Impl : ( ( rule__AP__Alternatives_2 ) ) ;
    public final void rule__AP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1819:1: ( ( ( rule__AP__Alternatives_2 ) ) )
            // InternalOltl.g:1820:1: ( ( rule__AP__Alternatives_2 ) )
            {
            // InternalOltl.g:1820:1: ( ( rule__AP__Alternatives_2 ) )
            // InternalOltl.g:1821:2: ( rule__AP__Alternatives_2 )
            {
             before(grammarAccess.getAPAccess().getAlternatives_2()); 
            // InternalOltl.g:1822:2: ( rule__AP__Alternatives_2 )
            // InternalOltl.g:1822:3: rule__AP__Alternatives_2
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
    // InternalOltl.g:1830:1: rule__AP__Group__3 : rule__AP__Group__3__Impl rule__AP__Group__4 ;
    public final void rule__AP__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1834:1: ( rule__AP__Group__3__Impl rule__AP__Group__4 )
            // InternalOltl.g:1835:2: rule__AP__Group__3__Impl rule__AP__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalOltl.g:1842:1: rule__AP__Group__3__Impl : ( '-' ) ;
    public final void rule__AP__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1846:1: ( ( '-' ) )
            // InternalOltl.g:1847:1: ( '-' )
            {
            // InternalOltl.g:1847:1: ( '-' )
            // InternalOltl.g:1848:2: '-'
            {
             before(grammarAccess.getAPAccess().getHyphenMinusKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOltl.g:1857:1: rule__AP__Group__4 : rule__AP__Group__4__Impl rule__AP__Group__5 ;
    public final void rule__AP__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1861:1: ( rule__AP__Group__4__Impl rule__AP__Group__5 )
            // InternalOltl.g:1862:2: rule__AP__Group__4__Impl rule__AP__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalOltl.g:1869:1: rule__AP__Group__4__Impl : ( ( rule__AP__NameAssignment_4 ) ) ;
    public final void rule__AP__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1873:1: ( ( ( rule__AP__NameAssignment_4 ) ) )
            // InternalOltl.g:1874:1: ( ( rule__AP__NameAssignment_4 ) )
            {
            // InternalOltl.g:1874:1: ( ( rule__AP__NameAssignment_4 ) )
            // InternalOltl.g:1875:2: ( rule__AP__NameAssignment_4 )
            {
             before(grammarAccess.getAPAccess().getNameAssignment_4()); 
            // InternalOltl.g:1876:2: ( rule__AP__NameAssignment_4 )
            // InternalOltl.g:1876:3: rule__AP__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AP__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAPAccess().getNameAssignment_4()); 

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
    // InternalOltl.g:1884:1: rule__AP__Group__5 : rule__AP__Group__5__Impl ;
    public final void rule__AP__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1888:1: ( rule__AP__Group__5__Impl )
            // InternalOltl.g:1889:2: rule__AP__Group__5__Impl
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
    // InternalOltl.g:1895:1: rule__AP__Group__5__Impl : ( ')' ) ;
    public final void rule__AP__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1899:1: ( ( ')' ) )
            // InternalOltl.g:1900:1: ( ')' )
            {
            // InternalOltl.g:1900:1: ( ')' )
            // InternalOltl.g:1901:2: ')'
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


    // $ANTLR start "rule__Model__BoundAssignment_1"
    // InternalOltl.g:1911:1: rule__Model__BoundAssignment_1 : ( RULE_INT ) ;
    public final void rule__Model__BoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1915:1: ( ( RULE_INT ) )
            // InternalOltl.g:1916:2: ( RULE_INT )
            {
            // InternalOltl.g:1916:2: ( RULE_INT )
            // InternalOltl.g:1917:3: RULE_INT
            {
             before(grammarAccess.getModelAccess().getBoundINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getBoundINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__BoundAssignment_1"


    // $ANTLR start "rule__Model__SoftBoundAssignment_2_1"
    // InternalOltl.g:1926:1: rule__Model__SoftBoundAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Model__SoftBoundAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1930:1: ( ( RULE_INT ) )
            // InternalOltl.g:1931:2: ( RULE_INT )
            {
            // InternalOltl.g:1931:2: ( RULE_INT )
            // InternalOltl.g:1932:3: RULE_INT
            {
             before(grammarAccess.getModelAccess().getSoftBoundINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSoftBoundINTTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Model__SoftBoundAssignment_2_1"


    // $ANTLR start "rule__Model__TempFormulaAssignment_4"
    // InternalOltl.g:1941:1: rule__Model__TempFormulaAssignment_4 : ( ruleTempFormula ) ;
    public final void rule__Model__TempFormulaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1945:1: ( ( ruleTempFormula ) )
            // InternalOltl.g:1946:2: ( ruleTempFormula )
            {
            // InternalOltl.g:1946:2: ( ruleTempFormula )
            // InternalOltl.g:1947:3: ruleTempFormula
            {
             before(grammarAccess.getModelAccess().getTempFormulaTempFormulaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTempFormula();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTempFormulaTempFormulaParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Model__TempFormulaAssignment_4"


    // $ANTLR start "rule__Model__SoftFormulaeAssignment_5_1"
    // InternalOltl.g:1956:1: rule__Model__SoftFormulaeAssignment_5_1 : ( ruleSoftFormula ) ;
    public final void rule__Model__SoftFormulaeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1960:1: ( ( ruleSoftFormula ) )
            // InternalOltl.g:1961:2: ( ruleSoftFormula )
            {
            // InternalOltl.g:1961:2: ( ruleSoftFormula )
            // InternalOltl.g:1962:3: ruleSoftFormula
            {
             before(grammarAccess.getModelAccess().getSoftFormulaeSoftFormulaParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSoftFormula();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSoftFormulaeSoftFormulaParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Model__SoftFormulaeAssignment_5_1"


    // $ANTLR start "rule__SoftFormula__SoftAllAssignment_0"
    // InternalOltl.g:1971:1: rule__SoftFormula__SoftAllAssignment_0 : ( ruleSoftAllTI ) ;
    public final void rule__SoftFormula__SoftAllAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1975:1: ( ( ruleSoftAllTI ) )
            // InternalOltl.g:1976:2: ( ruleSoftAllTI )
            {
            // InternalOltl.g:1976:2: ( ruleSoftAllTI )
            // InternalOltl.g:1977:3: ruleSoftAllTI
            {
             before(grammarAccess.getSoftFormulaAccess().getSoftAllSoftAllTIParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSoftAllTI();

            state._fsp--;

             after(grammarAccess.getSoftFormulaAccess().getSoftAllSoftAllTIParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SoftFormula__SoftAllAssignment_0"


    // $ANTLR start "rule__SoftFormula__SoftAtAssignment_1"
    // InternalOltl.g:1986:1: rule__SoftFormula__SoftAtAssignment_1 : ( ruleSoftTI ) ;
    public final void rule__SoftFormula__SoftAtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:1990:1: ( ( ruleSoftTI ) )
            // InternalOltl.g:1991:2: ( ruleSoftTI )
            {
            // InternalOltl.g:1991:2: ( ruleSoftTI )
            // InternalOltl.g:1992:3: ruleSoftTI
            {
             before(grammarAccess.getSoftFormulaAccess().getSoftAtSoftTIParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSoftTI();

            state._fsp--;

             after(grammarAccess.getSoftFormulaAccess().getSoftAtSoftTIParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SoftFormula__SoftAtAssignment_1"


    // $ANTLR start "rule__SoftAllTI__ApAssignment_2"
    // InternalOltl.g:2001:1: rule__SoftAllTI__ApAssignment_2 : ( ruleAP ) ;
    public final void rule__SoftAllTI__ApAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2005:1: ( ( ruleAP ) )
            // InternalOltl.g:2006:2: ( ruleAP )
            {
            // InternalOltl.g:2006:2: ( ruleAP )
            // InternalOltl.g:2007:3: ruleAP
            {
             before(grammarAccess.getSoftAllTIAccess().getApAPParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAP();

            state._fsp--;

             after(grammarAccess.getSoftAllTIAccess().getApAPParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SoftAllTI__ApAssignment_2"


    // $ANTLR start "rule__SoftAllTI__IdAssignment_3"
    // InternalOltl.g:2016:1: rule__SoftAllTI__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__SoftAllTI__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2020:1: ( ( RULE_ID ) )
            // InternalOltl.g:2021:2: ( RULE_ID )
            {
            // InternalOltl.g:2021:2: ( RULE_ID )
            // InternalOltl.g:2022:3: RULE_ID
            {
             before(grammarAccess.getSoftAllTIAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSoftAllTIAccess().getIdIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__SoftAllTI__IdAssignment_3"


    // $ANTLR start "rule__SoftAllTI__WeightAssignment_4"
    // InternalOltl.g:2031:1: rule__SoftAllTI__WeightAssignment_4 : ( ruleWeight ) ;
    public final void rule__SoftAllTI__WeightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2035:1: ( ( ruleWeight ) )
            // InternalOltl.g:2036:2: ( ruleWeight )
            {
            // InternalOltl.g:2036:2: ( ruleWeight )
            // InternalOltl.g:2037:3: ruleWeight
            {
             before(grammarAccess.getSoftAllTIAccess().getWeightWeightParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleWeight();

            state._fsp--;

             after(grammarAccess.getSoftAllTIAccess().getWeightWeightParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SoftAllTI__WeightAssignment_4"


    // $ANTLR start "rule__SoftTI__ApAssignment_4"
    // InternalOltl.g:2046:1: rule__SoftTI__ApAssignment_4 : ( ruleAP ) ;
    public final void rule__SoftTI__ApAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2050:1: ( ( ruleAP ) )
            // InternalOltl.g:2051:2: ( ruleAP )
            {
            // InternalOltl.g:2051:2: ( ruleAP )
            // InternalOltl.g:2052:3: ruleAP
            {
             before(grammarAccess.getSoftTIAccess().getApAPParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAP();

            state._fsp--;

             after(grammarAccess.getSoftTIAccess().getApAPParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SoftTI__ApAssignment_4"


    // $ANTLR start "rule__SoftTI__TiAssignment_5"
    // InternalOltl.g:2061:1: rule__SoftTI__TiAssignment_5 : ( RULE_INT ) ;
    public final void rule__SoftTI__TiAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2065:1: ( ( RULE_INT ) )
            // InternalOltl.g:2066:2: ( RULE_INT )
            {
            // InternalOltl.g:2066:2: ( RULE_INT )
            // InternalOltl.g:2067:3: RULE_INT
            {
             before(grammarAccess.getSoftTIAccess().getTiINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSoftTIAccess().getTiINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__SoftTI__TiAssignment_5"


    // $ANTLR start "rule__SoftTI__IdAssignment_7"
    // InternalOltl.g:2076:1: rule__SoftTI__IdAssignment_7 : ( RULE_ID ) ;
    public final void rule__SoftTI__IdAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2080:1: ( ( RULE_ID ) )
            // InternalOltl.g:2081:2: ( RULE_ID )
            {
            // InternalOltl.g:2081:2: ( RULE_ID )
            // InternalOltl.g:2082:3: RULE_ID
            {
             before(grammarAccess.getSoftTIAccess().getIdIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSoftTIAccess().getIdIDTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__SoftTI__IdAssignment_7"


    // $ANTLR start "rule__SoftTI__WeightAssignment_8"
    // InternalOltl.g:2091:1: rule__SoftTI__WeightAssignment_8 : ( ruleWeight ) ;
    public final void rule__SoftTI__WeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2095:1: ( ( ruleWeight ) )
            // InternalOltl.g:2096:2: ( ruleWeight )
            {
            // InternalOltl.g:2096:2: ( ruleWeight )
            // InternalOltl.g:2097:3: ruleWeight
            {
             before(grammarAccess.getSoftTIAccess().getWeightWeightParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleWeight();

            state._fsp--;

             after(grammarAccess.getSoftTIAccess().getWeightWeightParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__SoftTI__WeightAssignment_8"


    // $ANTLR start "rule__Weight__WIntAssignment_0"
    // InternalOltl.g:2106:1: rule__Weight__WIntAssignment_0 : ( ruleWInt ) ;
    public final void rule__Weight__WIntAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2110:1: ( ( ruleWInt ) )
            // InternalOltl.g:2111:2: ( ruleWInt )
            {
            // InternalOltl.g:2111:2: ( ruleWInt )
            // InternalOltl.g:2112:3: ruleWInt
            {
             before(grammarAccess.getWeightAccess().getWIntWIntParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWInt();

            state._fsp--;

             after(grammarAccess.getWeightAccess().getWIntWIntParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Weight__WIntAssignment_0"


    // $ANTLR start "rule__Weight__WFloatAssignment_1"
    // InternalOltl.g:2121:1: rule__Weight__WFloatAssignment_1 : ( ruleWFloat ) ;
    public final void rule__Weight__WFloatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2125:1: ( ( ruleWFloat ) )
            // InternalOltl.g:2126:2: ( ruleWFloat )
            {
            // InternalOltl.g:2126:2: ( ruleWFloat )
            // InternalOltl.g:2127:3: ruleWFloat
            {
             before(grammarAccess.getWeightAccess().getWFloatWFloatParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWFloat();

            state._fsp--;

             after(grammarAccess.getWeightAccess().getWFloatWFloatParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Weight__WFloatAssignment_1"


    // $ANTLR start "rule__WInt__IntAssignment"
    // InternalOltl.g:2136:1: rule__WInt__IntAssignment : ( RULE_INT ) ;
    public final void rule__WInt__IntAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2140:1: ( ( RULE_INT ) )
            // InternalOltl.g:2141:2: ( RULE_INT )
            {
            // InternalOltl.g:2141:2: ( RULE_INT )
            // InternalOltl.g:2142:3: RULE_INT
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
    // InternalOltl.g:2151:1: rule__WFloat__Int1Assignment_0 : ( RULE_INT ) ;
    public final void rule__WFloat__Int1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2155:1: ( ( RULE_INT ) )
            // InternalOltl.g:2156:2: ( RULE_INT )
            {
            // InternalOltl.g:2156:2: ( RULE_INT )
            // InternalOltl.g:2157:3: RULE_INT
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
    // InternalOltl.g:2166:1: rule__WFloat__Int2Assignment_2 : ( RULE_INT ) ;
    public final void rule__WFloat__Int2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2170:1: ( ( RULE_INT ) )
            // InternalOltl.g:2171:2: ( RULE_INT )
            {
            // InternalOltl.g:2171:2: ( RULE_INT )
            // InternalOltl.g:2172:3: RULE_INT
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
    // InternalOltl.g:2181:1: rule__TempFormula__ApAssignment_0 : ( ruleAP ) ;
    public final void rule__TempFormula__ApAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2185:1: ( ( ruleAP ) )
            // InternalOltl.g:2186:2: ( ruleAP )
            {
            // InternalOltl.g:2186:2: ( ruleAP )
            // InternalOltl.g:2187:3: ruleAP
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
    // InternalOltl.g:2196:1: rule__TempFormula__FaAssignment_1_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__FaAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2200:1: ( ( ruleTempFormula ) )
            // InternalOltl.g:2201:2: ( ruleTempFormula )
            {
            // InternalOltl.g:2201:2: ( ruleTempFormula )
            // InternalOltl.g:2202:3: ruleTempFormula
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
    // InternalOltl.g:2211:1: rule__TempFormula__FoAssignment_2_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__FoAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2215:1: ( ( ruleTempFormula ) )
            // InternalOltl.g:2216:2: ( ruleTempFormula )
            {
            // InternalOltl.g:2216:2: ( ruleTempFormula )
            // InternalOltl.g:2217:3: ruleTempFormula
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
    // InternalOltl.g:2226:1: rule__TempFormula__FnotAssignment_3_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__FnotAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2230:1: ( ( ruleTempFormula ) )
            // InternalOltl.g:2231:2: ( ruleTempFormula )
            {
            // InternalOltl.g:2231:2: ( ruleTempFormula )
            // InternalOltl.g:2232:3: ruleTempFormula
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
    // InternalOltl.g:2241:1: rule__TempFormula__Op2Assignment_4_1 : ( RULE_OP2 ) ;
    public final void rule__TempFormula__Op2Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2245:1: ( ( RULE_OP2 ) )
            // InternalOltl.g:2246:2: ( RULE_OP2 )
            {
            // InternalOltl.g:2246:2: ( RULE_OP2 )
            // InternalOltl.g:2247:3: RULE_OP2
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
    // InternalOltl.g:2256:1: rule__TempFormula__F1Assignment_4_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__F1Assignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2260:1: ( ( ruleTempFormula ) )
            // InternalOltl.g:2261:2: ( ruleTempFormula )
            {
            // InternalOltl.g:2261:2: ( ruleTempFormula )
            // InternalOltl.g:2262:3: ruleTempFormula
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
    // InternalOltl.g:2271:1: rule__TempFormula__F2Assignment_4_3 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__F2Assignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2275:1: ( ( ruleTempFormula ) )
            // InternalOltl.g:2276:2: ( ruleTempFormula )
            {
            // InternalOltl.g:2276:2: ( ruleTempFormula )
            // InternalOltl.g:2277:3: ruleTempFormula
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
    // InternalOltl.g:2286:1: rule__TempFormula__OpfAssignment_5_1 : ( RULE_OPF ) ;
    public final void rule__TempFormula__OpfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2290:1: ( ( RULE_OPF ) )
            // InternalOltl.g:2291:2: ( RULE_OPF )
            {
            // InternalOltl.g:2291:2: ( RULE_OPF )
            // InternalOltl.g:2292:3: RULE_OPF
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
    // InternalOltl.g:2301:1: rule__TempFormula__FAssignment_5_2 : ( ruleTempFormula ) ;
    public final void rule__TempFormula__FAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2305:1: ( ( ruleTempFormula ) )
            // InternalOltl.g:2306:2: ( ruleTempFormula )
            {
            // InternalOltl.g:2306:2: ( ruleTempFormula )
            // InternalOltl.g:2307:3: ruleTempFormula
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


    // $ANTLR start "rule__AP__NameAssignment_4"
    // InternalOltl.g:2316:1: rule__AP__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__AP__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOltl.g:2320:1: ( ( RULE_ID ) )
            // InternalOltl.g:2321:2: ( RULE_ID )
            {
            // InternalOltl.g:2321:2: ( RULE_ID )
            // InternalOltl.g:2322:3: RULE_ID
            {
             before(grammarAccess.getAPAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAPAccess().getNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__AP__NameAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});

}